/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class UniversalNotificationServiceErrorCode {
  public static inline var INTERNAL_ERROR : Int = 0;
  public static inline var INVALID_KEY : Int = 1;
  public static inline var ILLEGAL_ARGUMENT : Int = 2;
  public static inline var TOO_MANY_REQUEST : Int = 3;
  public static inline var AUTHENTICATION_FAILED : Int = 4;
  public static inline var NO_WRITE_PERMISSION : Int = 5;

  public static var VALID_VALUES = { new IntSet( [INTERNAL_ERROR, INVALID_KEY, ILLEGAL_ARGUMENT, TOO_MANY_REQUEST, AUTHENTICATION_FAILED, NO_WRITE_PERMISSION]); };
  public static var VALUES_TO_NAMES = { [
    INTERNAL_ERROR => "INTERNAL_ERROR",
    INVALID_KEY => "INVALID_KEY",
    ILLEGAL_ARGUMENT => "ILLEGAL_ARGUMENT",
    TOO_MANY_REQUEST => "TOO_MANY_REQUEST",
    AUTHENTICATION_FAILED => "AUTHENTICATION_FAILED",
    NO_WRITE_PERMISSION => "NO_WRITE_PERMISSION"
  ]; };
}
