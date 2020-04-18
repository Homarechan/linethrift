/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class ContentType {
  public static inline var NONE : Int = 0;
  public static inline var IMAGE : Int = 1;
  public static inline var VIDEO : Int = 2;
  public static inline var AUDIO : Int = 3;
  public static inline var HTML : Int = 4;
  public static inline var PDF : Int = 5;
  public static inline var CALL : Int = 6;
  public static inline var STICKER : Int = 7;
  public static inline var PRESENCE : Int = 8;
  public static inline var GIFT : Int = 9;
  public static inline var GROUPBOARD : Int = 10;
  public static inline var APPLINK : Int = 11;
  public static inline var LINK : Int = 12;
  public static inline var CONTACT : Int = 13;
  public static inline var FILE : Int = 14;
  public static inline var LOCATION : Int = 15;
  public static inline var POSTNOTIFICATION : Int = 16;
  public static inline var RICH : Int = 17;
  public static inline var CHATEVENT : Int = 18;
  public static inline var MUSIC : Int = 19;
  public static inline var PAYMENT : Int = 20;
  public static inline var EXTIMAGE : Int = 21;

  public static var VALID_VALUES = { new IntSet( [NONE, IMAGE, VIDEO, AUDIO, HTML, PDF, CALL, STICKER, PRESENCE, GIFT, GROUPBOARD, APPLINK, LINK, CONTACT, FILE, LOCATION, POSTNOTIFICATION, RICH, CHATEVENT, MUSIC, PAYMENT, EXTIMAGE]); };
  public static var VALUES_TO_NAMES = { [
    NONE => "NONE",
    IMAGE => "IMAGE",
    VIDEO => "VIDEO",
    AUDIO => "AUDIO",
    HTML => "HTML",
    PDF => "PDF",
    CALL => "CALL",
    STICKER => "STICKER",
    PRESENCE => "PRESENCE",
    GIFT => "GIFT",
    GROUPBOARD => "GROUPBOARD",
    APPLINK => "APPLINK",
    LINK => "LINK",
    CONTACT => "CONTACT",
    FILE => "FILE",
    LOCATION => "LOCATION",
    POSTNOTIFICATION => "POSTNOTIFICATION",
    RICH => "RICH",
    CHATEVENT => "CHATEVENT",
    MUSIC => "MUSIC",
    PAYMENT => "PAYMENT",
    EXTIMAGE => "EXTIMAGE"
  ]; };
}
