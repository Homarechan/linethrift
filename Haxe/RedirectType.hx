/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class RedirectType {
  public static inline var NONE : Int = 0;
  public static inline var EXPIRE_SECOND : Int = 1;

  public static var VALID_VALUES = { new IntSet( [NONE, EXPIRE_SECOND]); };
  public static var VALUES_TO_NAMES = { [
    NONE => "NONE",
    EXPIRE_SECOND => "EXPIRE_SECOND"
  ]; };
}
