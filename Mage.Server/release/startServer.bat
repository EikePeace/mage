@ECHO OFF
IF NOT EXIST "C:\Program Files\Java\jre7\bin\" GOTO NOJAVADIR
set JAVA_HOME="C:\Program Files\Java\jre7\"
set CLASSPATH=%JAVA_HOME%/bin;%CLASSPATH%
set PATH=%JAVA_HOME%/bin;%PATH%
:NOJAVADIR
java -Xms256m -Xmx512m -Dfile.encoding=UTF-8 -Djava.security.policy=./config/security.policy -Dlog4j.configuration=file:./config/log4j.properties -jar ./lib/mage-server-${project.version}.jar
pause
