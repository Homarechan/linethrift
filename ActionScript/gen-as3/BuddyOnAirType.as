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
  public class BuddyOnAirType   {
    public static const NORMAL:int = 0;
    public static const LIVE:int = 1;
    public static const VOIP:int = 2;

    public static const VALID_VALUES:Set = new Set(NORMAL, LIVE, VOIP);
    public static const VALUES_TO_NAMES:Dictionary = new Dictionary();
    {
      VALUES_TO_NAMES[NORMAL] = "NORMAL";
      VALUES_TO_NAMES[LIVE] = "LIVE";
      VALUES_TO_NAMES[VOIP] = "VOIP";

    }
  }
}
