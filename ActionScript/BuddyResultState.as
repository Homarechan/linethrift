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
  public class BuddyResultState   {
    public static const ACCEPTED:int = 1;
    public static const SUCCEEDED:int = 2;
    public static const FAILED:int = 3;
    public static const CANCELLED:int = 4;
    public static const NOTIFY_FAILED:int = 5;
    public static const STORING:int = 11;
    public static const UPLOADING:int = 21;
    public static const NOTIFYING:int = 31;
    public static const REMOVING_SUBSCRIPTION:int = 41;
    public static const UNREGISTERING_ACCOUNT:int = 42;
    public static const NOTIFYING_LEAVE_CHAT:int = 43;

    public static const VALID_VALUES:Set = new Set(ACCEPTED, SUCCEEDED, FAILED, CANCELLED, NOTIFY_FAILED, STORING, UPLOADING, NOTIFYING, REMOVING_SUBSCRIPTION, UNREGISTERING_ACCOUNT, NOTIFYING_LEAVE_CHAT);
    public static const VALUES_TO_NAMES:Dictionary = new Dictionary();
    {
      VALUES_TO_NAMES[ACCEPTED] = "ACCEPTED";
      VALUES_TO_NAMES[SUCCEEDED] = "SUCCEEDED";
      VALUES_TO_NAMES[FAILED] = "FAILED";
      VALUES_TO_NAMES[CANCELLED] = "CANCELLED";
      VALUES_TO_NAMES[NOTIFY_FAILED] = "NOTIFY_FAILED";
      VALUES_TO_NAMES[STORING] = "STORING";
      VALUES_TO_NAMES[UPLOADING] = "UPLOADING";
      VALUES_TO_NAMES[NOTIFYING] = "NOTIFYING";
      VALUES_TO_NAMES[REMOVING_SUBSCRIPTION] = "REMOVING_SUBSCRIPTION";
      VALUES_TO_NAMES[UNREGISTERING_ACCOUNT] = "UNREGISTERING_ACCOUNT";
      VALUES_TO_NAMES[NOTIFYING_LEAVE_CHAT] = "NOTIFYING_LEAVE_CHAT";

    }
  }
}
