/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class BuddyOnAirLabel {
  public static inline var ON_AIR : Int = 0;
  public static inline var LIVE : Int = 1;

  public static var VALID_VALUES = { new IntSet( [ON_AIR, LIVE]); };
  public static var VALUES_TO_NAMES = { [
    ON_AIR => "ON_AIR",
    LIVE => "LIVE"
  ]; };
}
