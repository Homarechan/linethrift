/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class SpammerReason {
  public static inline var OTHER : Int = 0;
  public static inline var ADVERTISING : Int = 1;
  public static inline var GENDER_HARASSMENT : Int = 2;
  public static inline var HARASSMENT : Int = 3;

  public static var VALID_VALUES = { new IntSet( [OTHER, ADVERTISING, GENDER_HARASSMENT, HARASSMENT]); };
  public static var VALUES_TO_NAMES = { [
    OTHER => "OTHER",
    ADVERTISING => "ADVERTISING",
    GENDER_HARASSMENT => "GENDER_HARASSMENT",
    HARASSMENT => "HARASSMENT"
  ]; };
}
