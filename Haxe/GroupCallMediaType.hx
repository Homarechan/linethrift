/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class GroupCallMediaType {
  public static inline var AUDIO : Int = 1;
  public static inline var VIDEO : Int = 2;

  public static var VALID_VALUES = { new IntSet( [AUDIO, VIDEO]); };
  public static var VALUES_TO_NAMES = { [
    AUDIO => "AUDIO",
    VIDEO => "VIDEO"
  ]; };
}
