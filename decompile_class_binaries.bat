if not exist "./src/main/java/org/xmlet/htmlapifaster" mkdir "./src/main/java/org/xmlet/htmlapifaster"
call mvn exec:java -D"exec.mainClass"="org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler" -D"exec.args"="-dgs=true -log=WARN ./target/classes/org/xmlet/htmlapifaster ./src/main/java/org/xmlet/htmlapifaster"
if exist "./target/classes/org" rmdir "./target/classes/org" /s /q