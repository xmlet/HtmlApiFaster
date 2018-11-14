package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumScopeType implements EnumInterface<String> {
   COL(String.valueOf("col")),
   COLGROUP(String.valueOf("colgroup")),
   ROW(String.valueOf("row")),
   ROWGROUP(String.valueOf("rowgroup"));

   private final String value;

   private EnumScopeType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
