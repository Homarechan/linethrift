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
  public class PrivacyLevelType   {
    public static const PUBLIC:int = 0;
    public static const PRIVATE:int = 1;

    public static const VALID_VALUES:Set = new Set(PUBLIC, PRIVATE);
    public static const VALUES_TO_NAMES:Dictionary = new Dictionary();
    {
      VALUES_TO_NAMES[PUBLIC] = "PUBLIC";
      VALUES_TO_NAMES[PRIVATE] = "PRIVATE";

    }
  }
}
