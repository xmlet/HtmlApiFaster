package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumHttpEquivType implements EnumInterface<String> {
   CONTENT_LANGUAGE(String.valueOf("content-language")),
   CONTENT_TYPE(String.valueOf("content-type")),
   DEFAULT_STYLE(String.valueOf("default-style")),
   REFRESH(String.valueOf("refresh"));

   private final String value;

   private EnumHttpEquivType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
