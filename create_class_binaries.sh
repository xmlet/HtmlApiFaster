#!/bin/bash

DIR_SRC=./src/main/java
DIR_TARGET=./target/classes/org/xmlet/htmlapifaster

if [ -e $DIR_SRC ]; then
  rm -r $DIR_SRC
fi

if [ ! -e $DIR_TARGET ]; then
  mkdir -p $DIR_TARGET
fi

mvn exec:java -D"exec.mainClass"="org.xmlet.xsdasmfaster.main.XsdAsmMain" -D"exec.args"="./src/main/resources/html_5_2.xsd htmlapifaster"