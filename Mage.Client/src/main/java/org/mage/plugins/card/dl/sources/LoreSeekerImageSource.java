package org.mage.plugins.card.dl.sources;

import org.mage.plugins.card.dl.DownloadServiceInfo;
import org.mage.plugins.card.images.CardDownloadData;

import java.util.*;

/**
 * @author Fenhl
 */
public enum LoreSeekerImageSource implements CardImageSource {
    instance;

    private static final Set<String> supportedSets = new LinkedHashSet<String>() {
        {
            add("DMS");
            add("ANK");
            add("AYR");
            add("LDO");
            add("TSL");
            add("VLN");
            add("JAN");
            add("NET");
            add("CC18");
            add("HLW");
            add("VST");
            add("DHM");
            add("RAK");
            add("EAU");
            add("SOU");
            add("SRC");
        }
    };

    @Override
    public CardImageUrls generateCardUrl(CardDownloadData card) throws Exception {
        return new CardImageUrls("https://lore-seeker.cards/cards/" + card.getSet().toLowerCase(Locale.ENGLISH) + "/" + card.getCollectorId() + ".png");
    }

    @Override
    public CardImageUrls generateTokenUrl(CardDownloadData card) throws Exception { return null; }

    @Override
    public boolean prepareDownloadList(DownloadServiceInfo downloadServiceInfo, List<CardDownloadData> downloadList) { return true; }

    @Override
    public String getNextHttpImageUrl() { return null; }

    @Override
    public String getFileForHttpImage(String httpImageUrl) { return null; }

    @Override
    public String getSourceName() { return "Lore Seeker"; }

    @Override
    public float getAverageSize() { return 267.34f; }

    @Override
    public int getTotalImages() { return -1; }

    @Override
    public void doPause(String httpImageUrl) {}

    @Override
    public ArrayList<String> getSupportedSets() {
        ArrayList<String> supportedSetsCopy = new ArrayList<>();
        supportedSetsCopy.addAll(supportedSets);
        return supportedSetsCopy;
    }
}
