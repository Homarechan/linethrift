/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class PrivacyLevelType {
  public static inline var PUBLIC : Int = 0;
  public static inline var PRIVATE : Int = 1;

  public static var VALID_VALUES = { new IntSet( [PUBLIC, PRIVATE]); };
  public static var VALUES_TO_NAMES = { [
    PUBLIC => "PUBLIC",
    PRIVATE => "PRIVATE"
  ]; };
}
