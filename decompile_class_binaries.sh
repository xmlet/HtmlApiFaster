DIR_SRC=./src/main/java/org/xmlet/htmlapifaster
DIR_TARGET=./target/classes/org

if [ ! -e $DIR_SRC ]; then
  mkdir -p $DIR_SRC
fi

mvn exec:java -D"exec.mainClass"="org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler" -D"exec.args"="-dgs=true -log=WARN ./target/classes/org/xmlet/htmlapifaster ./src/main/java/org/xmlet/htmlapifaster"

if [ -e $DIR_TARGET ]; then
  rm -r $DIR_TARGET
fi

