/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class CommitMessageResultCode {
  public static inline var DELIVERED : Int = 0;
  public static inline var DELIVERY_SKIPPED : Int = 1;
  public static inline var DELIVERY_RESTRICTED : Int = 2;

  public static var VALID_VALUES = { new IntSet( [DELIVERED, DELIVERY_SKIPPED, DELIVERY_RESTRICTED]); };
  public static var VALUES_TO_NAMES = { [
    DELIVERED => "DELIVERED",
    DELIVERY_SKIPPED => "DELIVERY_SKIPPED",
    DELIVERY_RESTRICTED => "DELIVERY_RESTRICTED"
  ]; };
}
