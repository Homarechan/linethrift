/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class ApplicationType implements org.apache.thrift.TEnum {

  public static final ApplicationType IOS = new ApplicationType(16);
  public static final ApplicationType IOS_RC = new ApplicationType(17);
  public static final ApplicationType IOS_BETA = new ApplicationType(18);
  public static final ApplicationType IOS_ALPHA = new ApplicationType(19);
  public static final ApplicationType ANDROID = new ApplicationType(32);
  public static final ApplicationType ANDROID_RC = new ApplicationType(33);
  public static final ApplicationType ANDROID_BETA = new ApplicationType(34);
  public static final ApplicationType ANDROID_ALPHA = new ApplicationType(35);
  public static final ApplicationType WAP = new ApplicationType(48);
  public static final ApplicationType WAP_RC = new ApplicationType(49);
  public static final ApplicationType WAP_BETA = new ApplicationType(50);
  public static final ApplicationType WAP_ALPHA = new ApplicationType(51);
  public static final ApplicationType BOT = new ApplicationType(64);
  public static final ApplicationType BOT_RC = new ApplicationType(65);
  public static final ApplicationType BOT_BETA = new ApplicationType(66);
  public static final ApplicationType BOT_ALPHA = new ApplicationType(67);
  public static final ApplicationType WEB = new ApplicationType(80);
  public static final ApplicationType WEB_RC = new ApplicationType(81);
  public static final ApplicationType WEB_BETA = new ApplicationType(82);
  public static final ApplicationType WEB_ALPHA = new ApplicationType(83);
  public static final ApplicationType DESKTOPWIN = new ApplicationType(96);
  public static final ApplicationType DESKTOPWIN_RC = new ApplicationType(97);
  public static final ApplicationType DESKTOPWIN_BETA = new ApplicationType(98);
  public static final ApplicationType DESKTOPWIN_ALPHA = new ApplicationType(99);
  public static final ApplicationType DESKTOPMAC = new ApplicationType(112);
  public static final ApplicationType DESKTOPMAC_RC = new ApplicationType(113);
  public static final ApplicationType DESKTOPMAC_BETA = new ApplicationType(114);
  public static final ApplicationType DESKTOPMAC_ALPHA = new ApplicationType(115);
  public static final ApplicationType CHANNELGW = new ApplicationType(128);
  public static final ApplicationType CHANNELGW_RC = new ApplicationType(129);
  public static final ApplicationType CHANNELGW_BETA = new ApplicationType(130);
  public static final ApplicationType CHANNELGW_ALPHA = new ApplicationType(131);
  public static final ApplicationType CHANNELCP = new ApplicationType(144);
  public static final ApplicationType CHANNELCP_RC = new ApplicationType(145);
  public static final ApplicationType CHANNELCP_BETA = new ApplicationType(146);
  public static final ApplicationType CHANNELCP_ALPHA = new ApplicationType(147);
  public static final ApplicationType WINPHONE = new ApplicationType(160);
  public static final ApplicationType WINPHONE_RC = new ApplicationType(161);
  public static final ApplicationType WINPHONE_BETA = new ApplicationType(162);
  public static final ApplicationType WINPHONE_ALPHA = new ApplicationType(163);
  public static final ApplicationType BLACKBERRY = new ApplicationType(176);
  public static final ApplicationType BLACKBERRY_RC = new ApplicationType(177);
  public static final ApplicationType BLACKBERRY_BETA = new ApplicationType(178);
  public static final ApplicationType BLACKBERRY_ALPHA = new ApplicationType(179);
  public static final ApplicationType WINMETRO = new ApplicationType(192);
  public static final ApplicationType WINMETRO_RC = new ApplicationType(193);
  public static final ApplicationType WINMETRO_BETA = new ApplicationType(194);
  public static final ApplicationType WINMETRO_ALPHA = new ApplicationType(195);
  public static final ApplicationType S40 = new ApplicationType(208);
  public static final ApplicationType S40_RC = new ApplicationType(209);
  public static final ApplicationType S40_BETA = new ApplicationType(210);
  public static final ApplicationType S40_ALPHA = new ApplicationType(211);
  public static final ApplicationType CHRONO = new ApplicationType(224);
  public static final ApplicationType CHRONO_RC = new ApplicationType(225);
  public static final ApplicationType CHRONO_BETA = new ApplicationType(226);
  public static final ApplicationType CHRONO_ALPHA = new ApplicationType(227);
  public static final ApplicationType TIZEN = new ApplicationType(256);
  public static final ApplicationType TIZEN_RC = new ApplicationType(257);
  public static final ApplicationType TIZEN_BETA = new ApplicationType(258);
  public static final ApplicationType TIZEN_ALPHA = new ApplicationType(259);
  public static final ApplicationType VIRTUAL = new ApplicationType(272);
  public static final ApplicationType FIREFOXOS = new ApplicationType(288);
  public static final ApplicationType FIREFOXOS_RC = new ApplicationType(289);
  public static final ApplicationType FIREFOXOS_BETA = new ApplicationType(290);
  public static final ApplicationType FIREFOXOS_ALPHA = new ApplicationType(291);
  public static final ApplicationType IOSIPAD = new ApplicationType(304);
  public static final ApplicationType IOSIPAD_RC = new ApplicationType(305);
  public static final ApplicationType IOSIPAD_BETA = new ApplicationType(306);
  public static final ApplicationType IOSIPAD_ALPHA = new ApplicationType(307);
  public static final ApplicationType BIZIOS = new ApplicationType(320);
  public static final ApplicationType BIZIOS_RC = new ApplicationType(321);
  public static final ApplicationType BIZIOS_BETA = new ApplicationType(322);
  public static final ApplicationType BIZIOS_ALPHA = new ApplicationType(323);
  public static final ApplicationType BIZANDROID = new ApplicationType(336);
  public static final ApplicationType BIZANDROID_RC = new ApplicationType(337);
  public static final ApplicationType BIZANDROID_BETA = new ApplicationType(338);
  public static final ApplicationType BIZANDROID_ALPHA = new ApplicationType(339);
  public static final ApplicationType BIZBOT = new ApplicationType(352);
  public static final ApplicationType BIZBOT_RC = new ApplicationType(353);
  public static final ApplicationType BIZBOT_BETA = new ApplicationType(354);
  public static final ApplicationType BIZBOT_ALPHA = new ApplicationType(355);
  public static final ApplicationType CHROMEOS = new ApplicationType(368);
  public static final ApplicationType CHROMEOS_RC = new ApplicationType(369);
  public static final ApplicationType CHROMEOS_BETA = new ApplicationType(370);
  public static final ApplicationType CHROMEOS_ALPHA = new ApplicationType(371);
  public static final ApplicationType ANDROIDLITE = new ApplicationType(384);
  public static final ApplicationType ANDROIDLITE_RC = new ApplicationType(385);
  public static final ApplicationType ANDROIDLITE_BETA = new ApplicationType(386);
  public static final ApplicationType ANDROIDLITE_ALPHA = new ApplicationType(387);
  public static final ApplicationType WIN10 = new ApplicationType(400);
  public static final ApplicationType WIN10_RC = new ApplicationType(401);
  public static final ApplicationType WIN10_BETA = new ApplicationType(402);
  public static final ApplicationType WIN10_ALPHA = new ApplicationType(403);
  public static final ApplicationType BIZWEB = new ApplicationType(416);
  public static final ApplicationType BIZWEB_RC = new ApplicationType(417);
  public static final ApplicationType BIZWEB_BETA = new ApplicationType(418);
  public static final ApplicationType BIZWEB_ALPHA = new ApplicationType(419);
  public static final ApplicationType DUMMYPRIMARY = new ApplicationType(432);
  public static final ApplicationType DUMMYPRIMARY_RC = new ApplicationType(433);
  public static final ApplicationType DUMMYPRIMARY_BETA = new ApplicationType(434);
  public static final ApplicationType DUMMYPRIMARY_ALPHA = new ApplicationType(435);
  public static final ApplicationType SQUARE = new ApplicationType(448);
  public static final ApplicationType SQUARE_RC = new ApplicationType(449);
  public static final ApplicationType SQUARE_BETA = new ApplicationType(450);
  public static final ApplicationType SQUARE_ALPHA = new ApplicationType(451);
  public static final ApplicationType INTERNAL = new ApplicationType(464);
  public static final ApplicationType INTERNAL_RC = new ApplicationType(465);
  public static final ApplicationType INTERNAL_BETA = new ApplicationType(466);
  public static final ApplicationType INTERNAL_ALPHA = new ApplicationType(467);
  public static final ApplicationType CLOVAFRIENDS = new ApplicationType(480);
  public static final ApplicationType CLOVAFRIENDS_RC = new ApplicationType(481);
  public static final ApplicationType CLOVAFRIENDS_BETA = new ApplicationType(482);
  public static final ApplicationType CLOVAFRIENDS_ALPHA = new ApplicationType(483);

  private final int value;

  private ApplicationType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ApplicationType findByValue(int value) { 
    switch (value) {
      case 16:
        return IOS;
      case 17:
        return IOS_RC;
      case 18:
        return IOS_BETA;
      case 19:
        return IOS_ALPHA;
      case 32:
        return ANDROID;
      case 33:
        return ANDROID_RC;
      case 34:
        return ANDROID_BETA;
      case 35:
        return ANDROID_ALPHA;
      case 48:
        return WAP;
      case 49:
        return WAP_RC;
      case 50:
        return WAP_BETA;
      case 51:
        return WAP_ALPHA;
      case 64:
        return BOT;
      case 65:
        return BOT_RC;
      case 66:
        return BOT_BETA;
      case 67:
        return BOT_ALPHA;
      case 80:
        return WEB;
      case 81:
        return WEB_RC;
      case 82:
        return WEB_BETA;
      case 83:
        return WEB_ALPHA;
      case 96:
        return DESKTOPWIN;
      case 97:
        return DESKTOPWIN_RC;
      case 98:
        return DESKTOPWIN_BETA;
      case 99:
        return DESKTOPWIN_ALPHA;
      case 112:
        return DESKTOPMAC;
      case 113:
        return DESKTOPMAC_RC;
      case 114:
        return DESKTOPMAC_BETA;
      case 115:
        return DESKTOPMAC_ALPHA;
      case 128:
        return CHANNELGW;
      case 129:
        return CHANNELGW_RC;
      case 130:
        return CHANNELGW_BETA;
      case 131:
        return CHANNELGW_ALPHA;
      case 144:
        return CHANNELCP;
      case 145:
        return CHANNELCP_RC;
      case 146:
        return CHANNELCP_BETA;
      case 147:
        return CHANNELCP_ALPHA;
      case 160:
        return WINPHONE;
      case 161:
        return WINPHONE_RC;
      case 162:
        return WINPHONE_BETA;
      case 163:
        return WINPHONE_ALPHA;
      case 176:
        return BLACKBERRY;
      case 177:
        return BLACKBERRY_RC;
      case 178:
        return BLACKBERRY_BETA;
      case 179:
        return BLACKBERRY_ALPHA;
      case 192:
        return WINMETRO;
      case 193:
        return WINMETRO_RC;
      case 194:
        return WINMETRO_BETA;
      case 195:
        return WINMETRO_ALPHA;
      case 208:
        return S40;
      case 209:
        return S40_RC;
      case 210:
        return S40_BETA;
      case 211:
        return S40_ALPHA;
      case 224:
        return CHRONO;
      case 225:
        return CHRONO_RC;
      case 226:
        return CHRONO_BETA;
      case 227:
        return CHRONO_ALPHA;
      case 256:
        return TIZEN;
      case 257:
        return TIZEN_RC;
      case 258:
        return TIZEN_BETA;
      case 259:
        return TIZEN_ALPHA;
      case 272:
        return VIRTUAL;
      case 288:
        return FIREFOXOS;
      case 289:
        return FIREFOXOS_RC;
      case 290:
        return FIREFOXOS_BETA;
      case 291:
        return FIREFOXOS_ALPHA;
      case 304:
        return IOSIPAD;
      case 305:
        return IOSIPAD_RC;
      case 306:
        return IOSIPAD_BETA;
      case 307:
        return IOSIPAD_ALPHA;
      case 320:
        return BIZIOS;
      case 321:
        return BIZIOS_RC;
      case 322:
        return BIZIOS_BETA;
      case 323:
        return BIZIOS_ALPHA;
      case 336:
        return BIZANDROID;
      case 337:
        return BIZANDROID_RC;
      case 338:
        return BIZANDROID_BETA;
      case 339:
        return BIZANDROID_ALPHA;
      case 352:
        return BIZBOT;
      case 353:
        return BIZBOT_RC;
      case 354:
        return BIZBOT_BETA;
      case 355:
        return BIZBOT_ALPHA;
      case 368:
        return CHROMEOS;
      case 369:
        return CHROMEOS_RC;
      case 370:
        return CHROMEOS_BETA;
      case 371:
        return CHROMEOS_ALPHA;
      case 384:
        return ANDROIDLITE;
      case 385:
        return ANDROIDLITE_RC;
      case 386:
        return ANDROIDLITE_BETA;
      case 387:
        return ANDROIDLITE_ALPHA;
      case 400:
        return WIN10;
      case 401:
        return WIN10_RC;
      case 402:
        return WIN10_BETA;
      case 403:
        return WIN10_ALPHA;
      case 416:
        return BIZWEB;
      case 417:
        return BIZWEB_RC;
      case 418:
        return BIZWEB_BETA;
      case 419:
        return BIZWEB_ALPHA;
      case 432:
        return DUMMYPRIMARY;
      case 433:
        return DUMMYPRIMARY_RC;
      case 434:
        return DUMMYPRIMARY_BETA;
      case 435:
        return DUMMYPRIMARY_ALPHA;
      case 448:
        return SQUARE;
      case 449:
        return SQUARE_RC;
      case 450:
        return SQUARE_BETA;
      case 451:
        return SQUARE_ALPHA;
      case 464:
        return INTERNAL;
      case 465:
        return INTERNAL_RC;
      case 466:
        return INTERNAL_BETA;
      case 467:
        return INTERNAL_ALPHA;
      case 480:
        return CLOVAFRIENDS;
      case 481:
        return CLOVAFRIENDS_RC;
      case 482:
        return CLOVAFRIENDS_BETA;
      case 483:
        return CLOVAFRIENDS_ALPHA;
      default:
        return null;
    }
  }
}
