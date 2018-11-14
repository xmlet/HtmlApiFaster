package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.RestrictionValidator;

public final class AttrSizesString {
   public static void validateRestrictions(String var0) {
      RestrictionValidator.validatePattern("\\d*x\\d*", var0);
   }
}
