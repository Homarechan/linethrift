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
  public class NotificationQueueType   {
    public static const GLOBAL:int = 1;
    public static const MESSAGE:int = 2;
    public static const PRIMARY:int = 3;

    public static const VALID_VALUES:Set = new Set(GLOBAL, MESSAGE, PRIMARY);
    public static const VALUES_TO_NAMES:Dictionary = new Dictionary();
    {
      VALUES_TO_NAMES[GLOBAL] = "GLOBAL";
      VALUES_TO_NAMES[MESSAGE] = "MESSAGE";
      VALUES_TO_NAMES[PRIMARY] = "PRIMARY";

    }
  }
}
