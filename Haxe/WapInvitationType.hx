/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class WapInvitationType {
  public static inline var REGISTRATION : Int = 1;
  public static inline var CHAT : Int = 2;

  public static var VALID_VALUES = { new IntSet( [REGISTRATION, CHAT]); };
  public static var VALUES_TO_NAMES = { [
    REGISTRATION => "REGISTRATION",
    CHAT => "CHAT"
  ]; };
}
