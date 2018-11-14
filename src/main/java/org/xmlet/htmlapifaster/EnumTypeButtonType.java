package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumTypeButtonType implements EnumInterface<String> {
   BUTTON(String.valueOf("button")),
   RESET(String.valueOf("reset")),
   SUBMIT(String.valueOf("submit"));

   private final String value;

   private EnumTypeButtonType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
