/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class SyncActionType {
  public static inline var SYNC : Int = 0;
  public static inline var REPORT : Int = 1;

  public static var VALID_VALUES = { new IntSet( [SYNC, REPORT]); };
  public static var VALUES_TO_NAMES = { [
    SYNC => "SYNC",
    REPORT => "REPORT"
  ]; };
}
