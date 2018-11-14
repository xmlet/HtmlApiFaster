package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumOverflowType implements EnumInterface<String> {
   LINEBREAK(String.valueOf("linebreak")),
   SCROLL(String.valueOf("scroll")),
   ELIDE(String.valueOf("elide")),
   TRUNCATE(String.valueOf("truncate")),
   SCALE(String.valueOf("scale"));

   private final String value;

   private EnumOverflowType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
