/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class ContactSetting {
  public static inline var CONTACT_SETTING_NOTIFICATION_DISABLE : Int = 1;
  public static inline var CONTACT_SETTING_DISPLAY_NAME_OVERRIDE : Int = 2;
  public static inline var CONTACT_SETTING_CONTACT_HIDE : Int = 4;
  public static inline var CONTACT_SETTING_FAVORITE : Int = 8;
  public static inline var CONTACT_SETTING_DELETE : Int = 16;

  public static var VALID_VALUES = { new IntSet( [CONTACT_SETTING_NOTIFICATION_DISABLE, CONTACT_SETTING_DISPLAY_NAME_OVERRIDE, CONTACT_SETTING_CONTACT_HIDE, CONTACT_SETTING_FAVORITE, CONTACT_SETTING_DELETE]); };
  public static var VALUES_TO_NAMES = { [
    CONTACT_SETTING_NOTIFICATION_DISABLE => "CONTACT_SETTING_NOTIFICATION_DISABLE",
    CONTACT_SETTING_DISPLAY_NAME_OVERRIDE => "CONTACT_SETTING_DISPLAY_NAME_OVERRIDE",
    CONTACT_SETTING_CONTACT_HIDE => "CONTACT_SETTING_CONTACT_HIDE",
    CONTACT_SETTING_FAVORITE => "CONTACT_SETTING_FAVORITE",
    CONTACT_SETTING_DELETE => "CONTACT_SETTING_DELETE"
  ]; };
}
