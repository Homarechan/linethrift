/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class SettingsAttributeEx implements org.apache.thrift.TEnum {

  public static final SettingsAttributeEx NOTIFICATION_ENABLE = new SettingsAttributeEx(0);
  public static final SettingsAttributeEx NOTIFICATION_MUTE_EXPIRATION = new SettingsAttributeEx(1);
  public static final SettingsAttributeEx NOTIFICATION_NEW_MESSAGE = new SettingsAttributeEx(2);
  public static final SettingsAttributeEx NOTIFICATION_GROUP_INVITATION = new SettingsAttributeEx(3);
  public static final SettingsAttributeEx NOTIFICATION_SHOW_MESSAGE = new SettingsAttributeEx(4);
  public static final SettingsAttributeEx NOTIFICATION_INCOMING_CALL = new SettingsAttributeEx(5);
  public static final SettingsAttributeEx NOTIFICATION_SOUND_MESSAGE = new SettingsAttributeEx(8);
  public static final SettingsAttributeEx NOTIFICATION_SOUND_GROUP = new SettingsAttributeEx(9);
  public static final SettingsAttributeEx NOTIFICATION_DISABLED_WITH_SUB = new SettingsAttributeEx(16);
  public static final SettingsAttributeEx NOTIFICATION_PAYMENT = new SettingsAttributeEx(17);
  public static final SettingsAttributeEx NOTIFICATION_MENTION = new SettingsAttributeEx(40);
  public static final SettingsAttributeEx NOTIFICATION_THUMBNAIL = new SettingsAttributeEx(45);
  public static final SettingsAttributeEx PRIVACY_SYNC_CONTACTS = new SettingsAttributeEx(6);
  public static final SettingsAttributeEx PRIVACY_SEARCH_BY_PHONE_NUMBER = new SettingsAttributeEx(7);
  public static final SettingsAttributeEx PRIVACY_SEARCH_BY_USERID = new SettingsAttributeEx(13);
  public static final SettingsAttributeEx PRIVACY_SEARCH_BY_EMAIL = new SettingsAttributeEx(14);
  public static final SettingsAttributeEx PRIVACY_ALLOW_SECONDARY_DEVICE_LOGIN = new SettingsAttributeEx(21);
  public static final SettingsAttributeEx PRIVACY_PROFILE_IMAGE_POST_TO_MYHOME = new SettingsAttributeEx(23);
  public static final SettingsAttributeEx PRIVACY_PROFILE_MUSIC_POST_TO_MYHOME = new SettingsAttributeEx(35);
  public static final SettingsAttributeEx PRIVACY_ALLOW_FRIEND_REQUEST = new SettingsAttributeEx(30);
  public static final SettingsAttributeEx PRIVACY_RECV_MESSAGES_FROM_NOT_FRIEND = new SettingsAttributeEx(25);
  public static final SettingsAttributeEx PRIVACY_AGREE_USE_LINECOIN_TO_PAIDCALL = new SettingsAttributeEx(26);
  public static final SettingsAttributeEx PRIVACY_AGREE_USE_PAIDCALL = new SettingsAttributeEx(27);
  public static final SettingsAttributeEx CONTACT_MY_TICKET = new SettingsAttributeEx(10);
  public static final SettingsAttributeEx IDENTITY_PROVIDER = new SettingsAttributeEx(11);
  public static final SettingsAttributeEx IDENTITY_IDENTIFIER = new SettingsAttributeEx(12);
  public static final SettingsAttributeEx SNS_ACCOUNT = new SettingsAttributeEx(19);
  public static final SettingsAttributeEx PHONE_REGISTRATION = new SettingsAttributeEx(20);
  public static final SettingsAttributeEx PREFERENCE_LOCALE = new SettingsAttributeEx(15);
  public static final SettingsAttributeEx CUSTOM_MODE = new SettingsAttributeEx(22);
  public static final SettingsAttributeEx EMAIL_CONFIRMATION_STATUS = new SettingsAttributeEx(24);
  public static final SettingsAttributeEx ACCOUNT_MIGRATION_PINCODE = new SettingsAttributeEx(28);
  public static final SettingsAttributeEx ENFORCED_INPUT_ACCOUNT_MIGRATION_PINCODE = new SettingsAttributeEx(29);
  public static final SettingsAttributeEx SECURITY_CENTER_SETTINGS = new SettingsAttributeEx(18);
  public static final SettingsAttributeEx E2EE_ENABLE = new SettingsAttributeEx(33);
  public static final SettingsAttributeEx ENABLE_SOUND_TO_TEXT = new SettingsAttributeEx(47);
  public static final SettingsAttributeEx HITOKOTO_BACKUP_REQUESTED = new SettingsAttributeEx(34);
  public static final SettingsAttributeEx CONTACT_ALLOW_FOLLOWING = new SettingsAttributeEx(36);
  public static final SettingsAttributeEx PRIVACY_ALLOW_NEARBY = new SettingsAttributeEx(37);
  public static final SettingsAttributeEx AGREEMENT_NEARBY = new SettingsAttributeEx(38);
  public static final SettingsAttributeEx AGREEMENT_SQUARE = new SettingsAttributeEx(39);
  public static final SettingsAttributeEx ALLOW_UNREGISTRATION_SECONDARY_DEVICE = new SettingsAttributeEx(41);
  public static final SettingsAttributeEx AGREEMENT_BOT_USE = new SettingsAttributeEx(42);
  public static final SettingsAttributeEx AGREEMENT_SHAKE_FUNCTION = new SettingsAttributeEx(43);
  public static final SettingsAttributeEx AGREEMENT_MOBILE_CONTACT_NAME = new SettingsAttributeEx(44);
  public static final SettingsAttributeEx AGREEMENT_SOUND_TO_TEXT = new SettingsAttributeEx(46);

  private final int value;

  private SettingsAttributeEx(int value) {
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
  public static SettingsAttributeEx findByValue(int value) { 
    switch (value) {
      case 0:
        return NOTIFICATION_ENABLE;
      case 1:
        return NOTIFICATION_MUTE_EXPIRATION;
      case 2:
        return NOTIFICATION_NEW_MESSAGE;
      case 3:
        return NOTIFICATION_GROUP_INVITATION;
      case 4:
        return NOTIFICATION_SHOW_MESSAGE;
      case 5:
        return NOTIFICATION_INCOMING_CALL;
      case 8:
        return NOTIFICATION_SOUND_MESSAGE;
      case 9:
        return NOTIFICATION_SOUND_GROUP;
      case 16:
        return NOTIFICATION_DISABLED_WITH_SUB;
      case 17:
        return NOTIFICATION_PAYMENT;
      case 40:
        return NOTIFICATION_MENTION;
      case 45:
        return NOTIFICATION_THUMBNAIL;
      case 6:
        return PRIVACY_SYNC_CONTACTS;
      case 7:
        return PRIVACY_SEARCH_BY_PHONE_NUMBER;
      case 13:
        return PRIVACY_SEARCH_BY_USERID;
      case 14:
        return PRIVACY_SEARCH_BY_EMAIL;
      case 21:
        return PRIVACY_ALLOW_SECONDARY_DEVICE_LOGIN;
      case 23:
        return PRIVACY_PROFILE_IMAGE_POST_TO_MYHOME;
      case 35:
        return PRIVACY_PROFILE_MUSIC_POST_TO_MYHOME;
      case 30:
        return PRIVACY_ALLOW_FRIEND_REQUEST;
      case 25:
        return PRIVACY_RECV_MESSAGES_FROM_NOT_FRIEND;
      case 26:
        return PRIVACY_AGREE_USE_LINECOIN_TO_PAIDCALL;
      case 27:
        return PRIVACY_AGREE_USE_PAIDCALL;
      case 10:
        return CONTACT_MY_TICKET;
      case 11:
        return IDENTITY_PROVIDER;
      case 12:
        return IDENTITY_IDENTIFIER;
      case 19:
        return SNS_ACCOUNT;
      case 20:
        return PHONE_REGISTRATION;
      case 15:
        return PREFERENCE_LOCALE;
      case 22:
        return CUSTOM_MODE;
      case 24:
        return EMAIL_CONFIRMATION_STATUS;
      case 28:
        return ACCOUNT_MIGRATION_PINCODE;
      case 29:
        return ENFORCED_INPUT_ACCOUNT_MIGRATION_PINCODE;
      case 18:
        return SECURITY_CENTER_SETTINGS;
      case 33:
        return E2EE_ENABLE;
      case 47:
        return ENABLE_SOUND_TO_TEXT;
      case 34:
        return HITOKOTO_BACKUP_REQUESTED;
      case 36:
        return CONTACT_ALLOW_FOLLOWING;
      case 37:
        return PRIVACY_ALLOW_NEARBY;
      case 38:
        return AGREEMENT_NEARBY;
      case 39:
        return AGREEMENT_SQUARE;
      case 41:
        return ALLOW_UNREGISTRATION_SECONDARY_DEVICE;
      case 42:
        return AGREEMENT_BOT_USE;
      case 43:
        return AGREEMENT_SHAKE_FUNCTION;
      case 44:
        return AGREEMENT_MOBILE_CONTACT_NAME;
      case 46:
        return AGREEMENT_SOUND_TO_TEXT;
      default:
        return null;
    }
  }
}
