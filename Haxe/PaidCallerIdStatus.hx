/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class PaidCallerIdStatus {
  public static inline var NOT_SPECIFIED : Int = 0;
  public static inline var VALID : Int = 1;
  public static inline var VERIFICATION_REQUIRED : Int = 2;
  public static inline var NOT_PERMITTED : Int = 3;
  public static inline var LIMIT_EXCEEDED : Int = 4;
  public static inline var LIMIT_EXCEEDED_AND_VERIFICATION_REQUIRED : Int = 5;

  public static var VALID_VALUES = { new IntSet( [NOT_SPECIFIED, VALID, VERIFICATION_REQUIRED, NOT_PERMITTED, LIMIT_EXCEEDED, LIMIT_EXCEEDED_AND_VERIFICATION_REQUIRED]); };
  public static var VALUES_TO_NAMES = { [
    NOT_SPECIFIED => "NOT_SPECIFIED",
    VALID => "VALID",
    VERIFICATION_REQUIRED => "VERIFICATION_REQUIRED",
    NOT_PERMITTED => "NOT_PERMITTED",
    LIMIT_EXCEEDED => "LIMIT_EXCEEDED",
    LIMIT_EXCEEDED_AND_VERIFICATION_REQUIRED => "LIMIT_EXCEEDED_AND_VERIFICATION_REQUIRED"
  ]; };
}
