/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class PaymentType {
  public static inline var PAYMENT_APPLE : Int = 1;
  public static inline var PAYMENT_GOOGLE : Int = 2;

  public static var VALID_VALUES = { new IntSet( [PAYMENT_APPLE, PAYMENT_GOOGLE]); };
  public static var VALUES_TO_NAMES = { [
    PAYMENT_APPLE => "PAYMENT_APPLE",
    PAYMENT_GOOGLE => "PAYMENT_GOOGLE"
  ]; };
}