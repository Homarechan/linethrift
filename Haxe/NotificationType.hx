/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class NotificationType {
  public static inline var APPLE_APNS : Int = 1;
  public static inline var GOOGLE_C2DM : Int = 2;
  public static inline var NHN_NNI : Int = 3;
  public static inline var SKT_AOM : Int = 4;
  public static inline var MS_MPNS : Int = 5;
  public static inline var RIM_BIS : Int = 6;
  public static inline var GOOGLE_GCM : Int = 7;
  public static inline var NOKIA_NNAPI : Int = 8;
  public static inline var TIZEN : Int = 9;
  public static inline var LINE_BOT : Int = 17;
  public static inline var LINE_WAP : Int = 18;
  public static inline var APPLE_APNS_VOIP : Int = 19;
  public static inline var MS_WNS : Int = 20;
  public static inline var GOOGLE_FCM : Int = 21;

  public static var VALID_VALUES = { new IntSet( [APPLE_APNS, GOOGLE_C2DM, NHN_NNI, SKT_AOM, MS_MPNS, RIM_BIS, GOOGLE_GCM, NOKIA_NNAPI, TIZEN, LINE_BOT, LINE_WAP, APPLE_APNS_VOIP, MS_WNS, GOOGLE_FCM]); };
  public static var VALUES_TO_NAMES = { [
    APPLE_APNS => "APPLE_APNS",
    GOOGLE_C2DM => "GOOGLE_C2DM",
    NHN_NNI => "NHN_NNI",
    SKT_AOM => "SKT_AOM",
    MS_MPNS => "MS_MPNS",
    RIM_BIS => "RIM_BIS",
    GOOGLE_GCM => "GOOGLE_GCM",
    NOKIA_NNAPI => "NOKIA_NNAPI",
    TIZEN => "TIZEN",
    LINE_BOT => "LINE_BOT",
    LINE_WAP => "LINE_WAP",
    APPLE_APNS_VOIP => "APPLE_APNS_VOIP",
    MS_WNS => "MS_WNS",
    GOOGLE_FCM => "GOOGLE_FCM"
  ]; };
}
