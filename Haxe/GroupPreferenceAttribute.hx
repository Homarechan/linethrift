/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class GroupPreferenceAttribute {
  public static inline var INVITATION_TICKET : Int = 1;
  public static inline var FAVORITE_TIMESTAMP : Int = 2;

  public static var VALID_VALUES = { new IntSet( [INVITATION_TICKET, FAVORITE_TIMESTAMP]); };
  public static var VALUES_TO_NAMES = { [
    INVITATION_TICKET => "INVITATION_TICKET",
    FAVORITE_TIMESTAMP => "FAVORITE_TIMESTAMP"
  ]; };
}
