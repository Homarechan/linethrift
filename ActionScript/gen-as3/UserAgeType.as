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
  public class UserAgeType   {
    public static const OVER:int = 1;
    public static const UNDER:int = 2;
    public static const UNDEFINED:int = 3;

    public static const VALID_VALUES:Set = new Set(OVER, UNDER, UNDEFINED);
    public static const VALUES_TO_NAMES:Dictionary = new Dictionary();
    {
      VALUES_TO_NAMES[OVER] = "OVER";
      VALUES_TO_NAMES[UNDER] = "UNDER";
      VALUES_TO_NAMES[UNDEFINED] = "UNDEFINED";

    }
  }
}
