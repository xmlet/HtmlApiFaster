package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumMediaType implements EnumInterface<String> {
   ALL(String.valueOf("all")),
   PRINT(String.valueOf("print")),
   SCREEN(String.valueOf("screen")),
   SPEECH(String.valueOf("speech"));

   private final String value;

   private EnumMediaType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
