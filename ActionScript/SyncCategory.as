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
  public class SyncCategory   {
    public static const PROFILE:int = 0;
    public static const SETTINGS:int = 1;
    public static const OPS:int = 2;
    public static const CONTACT:int = 3;
    public static const RECOMMEND:int = 4;
    public static const BLOCK:int = 5;
    public static const GROUP:int = 6;
    public static const ROOM:int = 7;
    public static const NOTIFICATION:int = 8;
    public static const ADDRESS_BOOK:int = 9;

    public static const VALID_VALUES:Set = new Set(PROFILE, SETTINGS, OPS, CONTACT, RECOMMEND, BLOCK, GROUP, ROOM, NOTIFICATION, ADDRESS_BOOK);
    public static const VALUES_TO_NAMES:Dictionary = new Dictionary();
    {
      VALUES_TO_NAMES[PROFILE] = "PROFILE";
      VALUES_TO_NAMES[SETTINGS] = "SETTINGS";
      VALUES_TO_NAMES[OPS] = "OPS";
      VALUES_TO_NAMES[CONTACT] = "CONTACT";
      VALUES_TO_NAMES[RECOMMEND] = "RECOMMEND";
      VALUES_TO_NAMES[BLOCK] = "BLOCK";
      VALUES_TO_NAMES[GROUP] = "GROUP";
      VALUES_TO_NAMES[ROOM] = "ROOM";
      VALUES_TO_NAMES[NOTIFICATION] = "NOTIFICATION";
      VALUES_TO_NAMES[ADDRESS_BOOK] = "ADDRESS_BOOK";

    }
  }
}
