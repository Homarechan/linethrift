/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class Diff {
  public static inline var ADDED : Int = 0;
  public static inline var UPDATED : Int = 1;
  public static inline var REMOVED : Int = 2;

  public static var VALID_VALUES = { new IntSet( [ADDED, UPDATED, REMOVED]); };
  public static var VALUES_TO_NAMES = { [
    ADDED => "ADDED",
    UPDATED => "UPDATED",
    REMOVED => "REMOVED"
  ]; };
}
