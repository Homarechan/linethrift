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
  public class SquareFeatureSetAttribute   {
    public static const CREATING_SECRET_SQUARE_CHAT:int = 1;
    public static const INVITING_INTO_OPEN_SQUARE_CHAT:int = 2;

    public static const VALID_VALUES:Set = new Set(CREATING_SECRET_SQUARE_CHAT, INVITING_INTO_OPEN_SQUARE_CHAT);
    public static const VALUES_TO_NAMES:Dictionary = new Dictionary();
    {
      VALUES_TO_NAMES[CREATING_SECRET_SQUARE_CHAT] = "CREATING_SECRET_SQUARE_CHAT";
      VALUES_TO_NAMES[INVITING_INTO_OPEN_SQUARE_CHAT] = "INVITING_INTO_OPEN_SQUARE_CHAT";

    }
  }
}
