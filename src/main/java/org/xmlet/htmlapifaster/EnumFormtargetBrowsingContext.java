package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumFormtargetBrowsingContext implements EnumInterface<String> {
   _BLANK(String.valueOf("_blank")),
   _PARENT(String.valueOf("_parent")),
   _SELF(String.valueOf("_self")),
   _TOP(String.valueOf("_top"));

   private final String value;

   private EnumFormtargetBrowsingContext(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
