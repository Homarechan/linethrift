/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class SquareMemberRelationState {
  public static inline var NONE : Int = 1;
  public static inline var BLOCKED : Int = 2;

  public static var VALID_VALUES = { new IntSet( [NONE, BLOCKED]); };
  public static var VALUES_TO_NAMES = { [
    NONE => "NONE",
    BLOCKED => "BLOCKED"
  ]; };
}
