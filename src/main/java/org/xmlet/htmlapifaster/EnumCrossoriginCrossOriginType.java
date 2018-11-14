package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumCrossoriginCrossOriginType implements EnumInterface<String> {
   ANONYMOUS(String.valueOf("anonymous")),
   USE_CREDENTIALS(String.valueOf("use-credentials"));

   private final String value;

   private EnumCrossoriginCrossOriginType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
