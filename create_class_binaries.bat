if exist "./src/main/java" rmdir "./src/main/java" /s /q
if not exist "./target/classes/org/xmlet/htmlapifaster" mkdir "./target/classes/org/xmlet/htmlapifaster"
call mvn exec:java -D"exec.mainClass"="org.xmlet.xsdasmfaster.main.XsdAsmMain" -D"exec.args"="./src/main/resources/html_5_2.xsd htmlapifaster"