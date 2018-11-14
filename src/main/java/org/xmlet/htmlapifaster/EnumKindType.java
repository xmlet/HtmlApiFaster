package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumKindType implements EnumInterface<String> {
   SUBTITLES(String.valueOf("subtitles")),
   CAPTIONS(String.valueOf("captions")),
   DESCRIPTIONS(String.valueOf("descriptions")),
   CHAPTERS(String.valueOf("chapters")),
   METADATA(String.valueOf("metadata"));

   private final String value;

   private EnumKindType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
