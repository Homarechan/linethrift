/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package 
{
import org.apache.thrift.Set;
import flash.utils.Dictionary;
  public class UniversalNotificationServiceErrorCode   {
    public static const INTERNAL_ERROR:int = 0;
    public static const INVALID_KEY:int = 1;
    public static const ILLEGAL_ARGUMENT:int = 2;
    public static const TOO_MANY_REQUEST:int = 3;
    public static const AUTHENTICATION_FAILED:int = 4;
    public static const NO_WRITE_PERMISSION:int = 5;

    public static const VALID_VALUES:Set = new Set(INTERNAL_ERROR, INVALID_KEY, ILLEGAL_ARGUMENT, TOO_MANY_REQUEST, AUTHENTICATION_FAILED, NO_WRITE_PERMISSION);
    public static const VALUES_TO_NAMES:Dictionary = new Dictionary();
    {
      VALUES_TO_NAMES[INTERNAL_ERROR] = "INTERNAL_ERROR";
      VALUES_TO_NAMES[INVALID_KEY] = "INVALID_KEY";
      VALUES_TO_NAMES[ILLEGAL_ARGUMENT] = "ILLEGAL_ARGUMENT";
      VALUES_TO_NAMES[TOO_MANY_REQUEST] = "TOO_MANY_REQUEST";
      VALUES_TO_NAMES[AUTHENTICATION_FAILED] = "AUTHENTICATION_FAILED";
      VALUES_TO_NAMES[NO_WRITE_PERMISSION] = "NO_WRITE_PERMISSION";

    }
  }
}
