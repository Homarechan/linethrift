/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class ContactCategory {
  public static inline var NORMAL : Int = 0;
  public static inline var RECOMMEND : Int = 1;

  public static var VALID_VALUES = { new IntSet( [NORMAL, RECOMMEND]); };
  public static var VALUES_TO_NAMES = { [
    NORMAL => "NORMAL",
    RECOMMEND => "RECOMMEND"
  ]; };
}
