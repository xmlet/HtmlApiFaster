package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumSandboxType implements EnumInterface<String> {
   ALLOW_FORMS(String.valueOf("allow-forms")),
   ALLOW_POINTER_LOCK(String.valueOf("allow-pointer-lock")),
   ALLOW_POPUPS(String.valueOf("allow-popups")),
   ALLOW_PRESENTATION(String.valueOf("allow-presentation")),
   ALLOW_SAME_ORIGIN(String.valueOf("allow-same-origin")),
   ALLOW_SCRIPTS(String.valueOf("allow-scripts")),
   ALLOW_TOP_NAVIGATION(String.valueOf("allow-top-navigation"));

   private final String value;

   private EnumSandboxType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
