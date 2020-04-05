package mage.abilities.common;

import mage.abilities.Ability;
import mage.abilities.TriggeredAbility;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.condition.common.SourceHasCounterCondition;
import mage.abilities.decorator.ConditionalContinuousEffect;
import mage.abilities.effects.Effect;
import mage.abilities.effects.Effects;
import mage.abilities.effects.common.continuous.GainAbilitySourceEffect;
import mage.abilities.effects.common.counter.AddCountersSourceEffect;
import mage.cards.Card;
import mage.constants.SagaChapter;
import mage.constants.Zone;
import mage.counters.CounterType;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.GameEvent.EventType;
import mage.game.permanent.Permanent;
import mage.game.stack.StackAbility;
import mage.game.stack.StackObject;
import mage.target.Target;
import mage.target.Targets;

/**
 *
 * @author Fenhl
 */
public class DiscoveryAbility extends SimpleStaticAbility {

    private SagaChapter maxChapter;

    public DiscoveryAbility(Card card, SagaChapter maxChapter) {
        super(Zone.ALL, new AddCountersSourceEffect(CounterType.PROGRESS.createInstance()));
        this.maxChapter = maxChapter;
        this.setRuleVisible(false);
        Ability ability = new EntersBattlefieldAbility(new AddCountersSourceEffect(CounterType.PROGRESS.createInstance()));
        ability.setRuleVisible(false);
        card.addAbility(ability);
    }

    public DiscoveryAbility(final DiscoveryAbility ability) {
        super(ability);
        this.maxChapter = ability.maxChapter;
    }

    public void addChapterEffect(Card card, SagaChapter chapter, Effect effect) {
        addChapterEffect(card, chapter, chapter, effect);
    }

    public void addChapterEffect(Card card, SagaChapter fromChapter, SagaChapter toChapter, Effect effect) {
        addChapterEffect(card, fromChapter, toChapter, new Effects(effect), (Target) null);
    }

    public void addChapterEffect(Card card, SagaChapter fromChapter, SagaChapter toChapter, Effects effects) {
        addChapterEffect(card, fromChapter, toChapter, effects, (Target) null);
    }

    public void addChapterEffect(Card card, SagaChapter fromChapter, SagaChapter toChapter, Effect effect, Target target) {
        addChapterEffect(card, fromChapter, toChapter, new Effects(effect), new Targets(target));
    }

    public void addChapterEffect(Card card, SagaChapter fromChapter, SagaChapter toChapter, Effects effects, Target target) {
        addChapterEffect(card, fromChapter, toChapter, effects, new Targets(target));
    }

    public void addChapterEffect(Card card, SagaChapter fromChapter, SagaChapter toChapter, Effects effects, Targets targets) {
        DiscoveryChapterTriggeredAbility ability;
        for (int i = fromChapter.getNumber(); i <= toChapter.getNumber(); i++) {
            ability = new DiscoveryChapterTriggeredAbility(null, SagaChapter.getChapter(i), toChapter);
            for (Effect effect : effects) {
                if (effect != null) {
                    ability.addEffect(effect.copy());
                }
            }
            for (Target target : targets) {
                if (target != null) {
                    ability.addTarget(target.copy());
                }
            }
            if (i > fromChapter.getNumber()) {
                ability.setRuleVisible(false);
            }
            card.addAbility(ability);
        }
        if (maxChapter == null || toChapter.getNumber() > maxChapter.getNumber()) {
            maxChapter = toChapter;
        }
    }

    public void addDiscoverAbility(Card card, Ability ability) {
        card.addAbility(new SimpleStaticAbility(new ConditionalContinuousEffect(
                new GainAbilitySourceEffect(ability),
                new SourceHasCounterCondition(CounterType.PROGRESS, maxChapter.getNumber() + 1, Integer.MAX_VALUE),
                "{DISCOVER}—" + ability.getRule()
        )));
    }

    public SagaChapter getMaxChapter() {
        return maxChapter;
    }

    @Override
    public String getRule() {
        return "<i>(As this Discovery enters and after your draw step, add a progress counter. Stop after you've discovered.)</i> ";
    }

    @Override
    public DiscoveryAbility copy() {
        return new DiscoveryAbility(this);
    }

    public static boolean isChapterAbility(StackObject stackObject) {
        if (stackObject instanceof StackAbility) {
            return stackObject.getStackAbility() instanceof ChapterTriggeredAbility;
        }
        return false;
    }

    public static boolean isChapterAbility(TriggeredAbility ability) {
        return ability instanceof ChapterTriggeredAbility;
    }
}

class DiscoveryChapterTriggeredAbility extends TriggeredAbilityImpl {

    private SagaChapter chapterFrom, chapterTo;

    public DiscoveryChapterTriggeredAbility(Effect effect, SagaChapter chapterFrom, SagaChapter chapterTo) {
        super(Zone.ALL, effect, false);
        this.chapterFrom = chapterFrom;
        this.chapterTo = chapterTo;
    }

    public DiscoveryChapterTriggeredAbility(final DiscoveryChapterTriggeredAbility ability) {
        super(ability);
        this.chapterFrom = ability.chapterFrom;
        this.chapterTo = ability.chapterTo;
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == EventType.COUNTER_ADDED;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        if (event.getTargetId().equals(getSourceId()) && event.getData().equals(CounterType.PROGRESS.getName())) {
            int amountAdded = event.getAmount();
            int loreCounters = amountAdded;
            //Permanent sourceSaga = game.getPermanentOrLKIBattlefield(getSourceId());  BUG #5393
            Permanent sourceSaga = game.getPermanent(getSourceId());
            if (sourceSaga == null) {
                sourceSaga = game.getPermanentEntering(getSourceId());
            }
            if (sourceSaga != null) {
                loreCounters = sourceSaga.getCounters(game).getCount(CounterType.PROGRESS);
            }
            return loreCounters - amountAdded < chapterFrom.getNumber()
                    && chapterFrom.getNumber() <= loreCounters;
        }
        return false;
    }

    @Override
    public DiscoveryChapterTriggeredAbility copy() {
        return new DiscoveryChapterTriggeredAbility(this);
    }

    public String getChapterRule() {
        String rule = super.getRule();
        return Character.toUpperCase(rule.charAt(0)) + rule.substring(1);
    }

    public SagaChapter getChapterFrom() {
        return chapterFrom;
    }

    public SagaChapter getChapterTo() {
        return chapterTo;
    }

    @Override
    public String getRule() {
        StringBuilder sb = new StringBuilder();
        for (SagaChapter chapter : SagaChapter.values()) {
            if (chapter.getNumber() >= getChapterFrom().getNumber()
                    && chapter.getNumber() < getChapterTo().getNumber()) {
                sb.append(chapter.toString()).append(", ");
            } else if (chapter.equals(getChapterTo())) {
                sb.append(chapter.toString());
            }
        }
        String text = super.getRule();
        sb.append(" - ").append(Character.toUpperCase(text.charAt(0))).append(text.substring(1));
        return sb.toString();
    }
}
