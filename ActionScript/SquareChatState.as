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
  public class SquareChatState   {
    public static const ALIVE:int = 0;
    public static const DELETED:int = 1;
    public static const SUSPENDED:int = 2;

    public static const VALID_VALUES:Set = new Set(ALIVE, DELETED, SUSPENDED);
    public static const VALUES_TO_NAMES:Dictionary = new Dictionary();
    {
      VALUES_TO_NAMES[ALIVE] = "ALIVE";
      VALUES_TO_NAMES[DELETED] = "DELETED";
      VALUES_TO_NAMES[SUSPENDED] = "SUSPENDED";

    }
  }
}
