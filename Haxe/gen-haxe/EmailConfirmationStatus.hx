/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class EmailConfirmationStatus {
  public static inline var NOT_SPECIFIED : Int = 0;
  public static inline var NOT_YET : Int = 1;
  public static inline var DONE : Int = 3;
  public static inline var NEED_ENFORCED_INPUT : Int = 4;

  public static var VALID_VALUES = { new IntSet( [NOT_SPECIFIED, NOT_YET, DONE, NEED_ENFORCED_INPUT]); };
  public static var VALUES_TO_NAMES = { [
    NOT_SPECIFIED => "NOT_SPECIFIED",
    NOT_YET => "NOT_YET",
    DONE => "DONE",
    NEED_ENFORCED_INPUT => "NEED_ENFORCED_INPUT"
  ]; };
}
