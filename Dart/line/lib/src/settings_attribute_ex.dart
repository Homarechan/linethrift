/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.settings_attribute_ex;

class SettingsAttributeEx {
  static const int NOTIFICATION_ENABLE = 0;
  static const int NOTIFICATION_MUTE_EXPIRATION = 1;
  static const int NOTIFICATION_NEW_MESSAGE = 2;
  static const int NOTIFICATION_GROUP_INVITATION = 3;
  static const int NOTIFICATION_SHOW_MESSAGE = 4;
  static const int NOTIFICATION_INCOMING_CALL = 5;
  static const int NOTIFICATION_SOUND_MESSAGE = 8;
  static const int NOTIFICATION_SOUND_GROUP = 9;
  static const int NOTIFICATION_DISABLED_WITH_SUB = 16;
  static const int NOTIFICATION_PAYMENT = 17;
  static const int NOTIFICATION_MENTION = 40;
  static const int NOTIFICATION_THUMBNAIL = 45;
  static const int PRIVACY_SYNC_CONTACTS = 6;
  static const int PRIVACY_SEARCH_BY_PHONE_NUMBER = 7;
  static const int PRIVACY_SEARCH_BY_USERID = 13;
  static const int PRIVACY_SEARCH_BY_EMAIL = 14;
  static const int PRIVACY_ALLOW_SECONDARY_DEVICE_LOGIN = 21;
  static const int PRIVACY_PROFILE_IMAGE_POST_TO_MYHOME = 23;
  static const int PRIVACY_PROFILE_MUSIC_POST_TO_MYHOME = 35;
  static const int PRIVACY_ALLOW_FRIEND_REQUEST = 30;
  static const int PRIVACY_RECV_MESSAGES_FROM_NOT_FRIEND = 25;
  static const int PRIVACY_AGREE_USE_LINECOIN_TO_PAIDCALL = 26;
  static const int PRIVACY_AGREE_USE_PAIDCALL = 27;
  static const int CONTACT_MY_TICKET = 10;
  static const int IDENTITY_PROVIDER = 11;
  static const int IDENTITY_IDENTIFIER = 12;
  static const int SNS_ACCOUNT = 19;
  static const int PHONE_REGISTRATION = 20;
  static const int PREFERENCE_LOCALE = 15;
  static const int CUSTOM_MODE = 22;
  static const int EMAIL_CONFIRMATION_STATUS = 24;
  static const int ACCOUNT_MIGRATION_PINCODE = 28;
  static const int ENFORCED_INPUT_ACCOUNT_MIGRATION_PINCODE = 29;
  static const int SECURITY_CENTER_SETTINGS = 18;
  static const int E2EE_ENABLE = 33;
  static const int ENABLE_SOUND_TO_TEXT = 47;
  static const int HITOKOTO_BACKUP_REQUESTED = 34;
  static const int CONTACT_ALLOW_FOLLOWING = 36;
  static const int PRIVACY_ALLOW_NEARBY = 37;
  static const int AGREEMENT_NEARBY = 38;
  static const int AGREEMENT_SQUARE = 39;
  static const int ALLOW_UNREGISTRATION_SECONDARY_DEVICE = 41;
  static const int AGREEMENT_BOT_USE = 42;
  static const int AGREEMENT_SHAKE_FUNCTION = 43;
  static const int AGREEMENT_MOBILE_CONTACT_NAME = 44;
  static const int AGREEMENT_SOUND_TO_TEXT = 46;

  static final Set<int> VALID_VALUES = new Set.from([
    NOTIFICATION_ENABLE
    , NOTIFICATION_MUTE_EXPIRATION
    , NOTIFICATION_NEW_MESSAGE
    , NOTIFICATION_GROUP_INVITATION
    , NOTIFICATION_SHOW_MESSAGE
    , NOTIFICATION_INCOMING_CALL
    , NOTIFICATION_SOUND_MESSAGE
    , NOTIFICATION_SOUND_GROUP
    , NOTIFICATION_DISABLED_WITH_SUB
    , NOTIFICATION_PAYMENT
    , NOTIFICATION_MENTION
    , NOTIFICATION_THUMBNAIL
    , PRIVACY_SYNC_CONTACTS
    , PRIVACY_SEARCH_BY_PHONE_NUMBER
    , PRIVACY_SEARCH_BY_USERID
    , PRIVACY_SEARCH_BY_EMAIL
    , PRIVACY_ALLOW_SECONDARY_DEVICE_LOGIN
    , PRIVACY_PROFILE_IMAGE_POST_TO_MYHOME
    , PRIVACY_PROFILE_MUSIC_POST_TO_MYHOME
    , PRIVACY_ALLOW_FRIEND_REQUEST
    , PRIVACY_RECV_MESSAGES_FROM_NOT_FRIEND
    , PRIVACY_AGREE_USE_LINECOIN_TO_PAIDCALL
    , PRIVACY_AGREE_USE_PAIDCALL
    , CONTACT_MY_TICKET
    , IDENTITY_PROVIDER
    , IDENTITY_IDENTIFIER
    , SNS_ACCOUNT
    , PHONE_REGISTRATION
    , PREFERENCE_LOCALE
    , CUSTOM_MODE
    , EMAIL_CONFIRMATION_STATUS
    , ACCOUNT_MIGRATION_PINCODE
    , ENFORCED_INPUT_ACCOUNT_MIGRATION_PINCODE
    , SECURITY_CENTER_SETTINGS
    , E2EE_ENABLE
    , ENABLE_SOUND_TO_TEXT
    , HITOKOTO_BACKUP_REQUESTED
    , CONTACT_ALLOW_FOLLOWING
    , PRIVACY_ALLOW_NEARBY
    , AGREEMENT_NEARBY
    , AGREEMENT_SQUARE
    , ALLOW_UNREGISTRATION_SECONDARY_DEVICE
    , AGREEMENT_BOT_USE
    , AGREEMENT_SHAKE_FUNCTION
    , AGREEMENT_MOBILE_CONTACT_NAME
    , AGREEMENT_SOUND_TO_TEXT
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    NOTIFICATION_ENABLE: 'NOTIFICATION_ENABLE'
    , NOTIFICATION_MUTE_EXPIRATION: 'NOTIFICATION_MUTE_EXPIRATION'
    , NOTIFICATION_NEW_MESSAGE: 'NOTIFICATION_NEW_MESSAGE'
    , NOTIFICATION_GROUP_INVITATION: 'NOTIFICATION_GROUP_INVITATION'
    , NOTIFICATION_SHOW_MESSAGE: 'NOTIFICATION_SHOW_MESSAGE'
    , NOTIFICATION_INCOMING_CALL: 'NOTIFICATION_INCOMING_CALL'
    , NOTIFICATION_SOUND_MESSAGE: 'NOTIFICATION_SOUND_MESSAGE'
    , NOTIFICATION_SOUND_GROUP: 'NOTIFICATION_SOUND_GROUP'
    , NOTIFICATION_DISABLED_WITH_SUB: 'NOTIFICATION_DISABLED_WITH_SUB'
    , NOTIFICATION_PAYMENT: 'NOTIFICATION_PAYMENT'
    , NOTIFICATION_MENTION: 'NOTIFICATION_MENTION'
    , NOTIFICATION_THUMBNAIL: 'NOTIFICATION_THUMBNAIL'
    , PRIVACY_SYNC_CONTACTS: 'PRIVACY_SYNC_CONTACTS'
    , PRIVACY_SEARCH_BY_PHONE_NUMBER: 'PRIVACY_SEARCH_BY_PHONE_NUMBER'
    , PRIVACY_SEARCH_BY_USERID: 'PRIVACY_SEARCH_BY_USERID'
    , PRIVACY_SEARCH_BY_EMAIL: 'PRIVACY_SEARCH_BY_EMAIL'
    , PRIVACY_ALLOW_SECONDARY_DEVICE_LOGIN: 'PRIVACY_ALLOW_SECONDARY_DEVICE_LOGIN'
    , PRIVACY_PROFILE_IMAGE_POST_TO_MYHOME: 'PRIVACY_PROFILE_IMAGE_POST_TO_MYHOME'
    , PRIVACY_PROFILE_MUSIC_POST_TO_MYHOME: 'PRIVACY_PROFILE_MUSIC_POST_TO_MYHOME'
    , PRIVACY_ALLOW_FRIEND_REQUEST: 'PRIVACY_ALLOW_FRIEND_REQUEST'
    , PRIVACY_RECV_MESSAGES_FROM_NOT_FRIEND: 'PRIVACY_RECV_MESSAGES_FROM_NOT_FRIEND'
    , PRIVACY_AGREE_USE_LINECOIN_TO_PAIDCALL: 'PRIVACY_AGREE_USE_LINECOIN_TO_PAIDCALL'
    , PRIVACY_AGREE_USE_PAIDCALL: 'PRIVACY_AGREE_USE_PAIDCALL'
    , CONTACT_MY_TICKET: 'CONTACT_MY_TICKET'
    , IDENTITY_PROVIDER: 'IDENTITY_PROVIDER'
    , IDENTITY_IDENTIFIER: 'IDENTITY_IDENTIFIER'
    , SNS_ACCOUNT: 'SNS_ACCOUNT'
    , PHONE_REGISTRATION: 'PHONE_REGISTRATION'
    , PREFERENCE_LOCALE: 'PREFERENCE_LOCALE'
    , CUSTOM_MODE: 'CUSTOM_MODE'
    , EMAIL_CONFIRMATION_STATUS: 'EMAIL_CONFIRMATION_STATUS'
    , ACCOUNT_MIGRATION_PINCODE: 'ACCOUNT_MIGRATION_PINCODE'
    , ENFORCED_INPUT_ACCOUNT_MIGRATION_PINCODE: 'ENFORCED_INPUT_ACCOUNT_MIGRATION_PINCODE'
    , SECURITY_CENTER_SETTINGS: 'SECURITY_CENTER_SETTINGS'
    , E2EE_ENABLE: 'E2EE_ENABLE'
    , ENABLE_SOUND_TO_TEXT: 'ENABLE_SOUND_TO_TEXT'
    , HITOKOTO_BACKUP_REQUESTED: 'HITOKOTO_BACKUP_REQUESTED'
    , CONTACT_ALLOW_FOLLOWING: 'CONTACT_ALLOW_FOLLOWING'
    , PRIVACY_ALLOW_NEARBY: 'PRIVACY_ALLOW_NEARBY'
    , AGREEMENT_NEARBY: 'AGREEMENT_NEARBY'
    , AGREEMENT_SQUARE: 'AGREEMENT_SQUARE'
    , ALLOW_UNREGISTRATION_SECONDARY_DEVICE: 'ALLOW_UNREGISTRATION_SECONDARY_DEVICE'
    , AGREEMENT_BOT_USE: 'AGREEMENT_BOT_USE'
    , AGREEMENT_SHAKE_FUNCTION: 'AGREEMENT_SHAKE_FUNCTION'
    , AGREEMENT_MOBILE_CONTACT_NAME: 'AGREEMENT_MOBILE_CONTACT_NAME'
    , AGREEMENT_SOUND_TO_TEXT: 'AGREEMENT_SOUND_TO_TEXT'
  };
}
