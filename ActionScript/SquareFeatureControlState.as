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
  public class SquareFeatureControlState   {
    public static const DISABLED:int = 1;
    public static const ENABLED:int = 2;

    public static const VALID_VALUES:Set = new Set(DISABLED, ENABLED);
    public static const VALUES_TO_NAMES:Dictionary = new Dictionary();
    {
      VALUES_TO_NAMES[DISABLED] = "DISABLED";
      VALUES_TO_NAMES[ENABLED] = "ENABLED";

    }
  }
}
