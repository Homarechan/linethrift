/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class ModificationType {
  public static inline var ADD : Int = 0;
  public static inline var REMOVE : Int = 1;
  public static inline var MODIFY : Int = 2;

  public static var VALID_VALUES = { new IntSet( [ADD, REMOVE, MODIFY]); };
  public static var VALUES_TO_NAMES = { [
    ADD => "ADD",
    REMOVE => "REMOVE",
    MODIFY => "MODIFY"
  ]; };
}
