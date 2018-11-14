package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumRevType implements EnumInterface<String> {
   ALTERNATE(String.valueOf("alternate")),
   APPENDIX(String.valueOf("appendix")),
   BOOKMARK(String.valueOf("bookmark")),
   CHAPTER(String.valueOf("chapter")),
   CONTENTS(String.valueOf("contents")),
   COPYRIGHT(String.valueOf("copyright")),
   GLOSSARY(String.valueOf("glossary")),
   HELP(String.valueOf("help")),
   INDEX(String.valueOf("index")),
   NEXT(String.valueOf("next")),
   PREV(String.valueOf("prev")),
   SECTION(String.valueOf("section")),
   START(String.valueOf("start")),
   STYLESHEET(String.valueOf("stylesheet")),
   SUBSECTION(String.valueOf("subsection"));

   private final String value;

   private EnumRevType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
