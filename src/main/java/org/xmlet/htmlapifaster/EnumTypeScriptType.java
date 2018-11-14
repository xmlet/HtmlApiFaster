package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumTypeScriptType implements EnumInterface<String> {
   APPLICATION_ECMASCRIPT(String.valueOf("application/ecmascript")),
   APPLICATION_JAVASCRIPT(String.valueOf("application/javascript")),
   APPLICATION_X_JAVASCRIPT(String.valueOf("application/x-javascript")),
   APPLICATION_X_ECMASCRIPT(String.valueOf("application/x-ecmascript")),
   TEXT_ECMASCRIPT(String.valueOf("text/ecmascript")),
   TEXT_JAVASCRIPT(String.valueOf("text/javascript")),
   TEXT_JAVASCRIPT1_0(String.valueOf("text/javascript1.0")),
   TEXT_JAVASCRIPT1_1(String.valueOf("text/javascript1.1")),
   TEXT_JAVASCRIPT1_2(String.valueOf("text/javascript1.2")),
   TEXT_JAVASCRIPT1_3(String.valueOf("text/javascript1.3")),
   TEXT_JAVASCRIPT1_4(String.valueOf("text/javascript1.4")),
   TEXT_JAVASCRIPT1_5(String.valueOf("text/javascript1.5")),
   TEXT_JSCRIPT(String.valueOf("text/jscript")),
   TEXT_LIVESCRIPT(String.valueOf("text/livescript")),
   TEXT_X_JAVASCRIPT(String.valueOf("text/x-javascript")),
   TEXT_X_ECMASCRIPT(String.valueOf("text/x-ecmascript"));

   private final String value;

   private EnumTypeScriptType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
