/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class UnregistrationReason {
  public static inline var UNREGISTRATION_REASON_UNREGISTER_USER : Int = 1;
  public static inline var UNREGISTRATION_REASON_UNBIND_DEVICE : Int = 2;

  public static var VALID_VALUES = { new IntSet( [UNREGISTRATION_REASON_UNREGISTER_USER, UNREGISTRATION_REASON_UNBIND_DEVICE]); };
  public static var VALUES_TO_NAMES = { [
    UNREGISTRATION_REASON_UNREGISTER_USER => "UNREGISTRATION_REASON_UNREGISTER_USER",
    UNREGISTRATION_REASON_UNBIND_DEVICE => "UNREGISTRATION_REASON_UNBIND_DEVICE"
  ]; };
}
