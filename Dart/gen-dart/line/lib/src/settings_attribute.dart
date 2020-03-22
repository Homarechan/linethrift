/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.settings_attribute;

class SettingsAttribute {
  static const int ALL = 2147483647;
  static const int NOTIFICATION_ENABLE = 1;
  static const int NOTIFICATION_MUTE_EXPIRATION = 2;
  static const int NOTIFICATION_NEW_MESSAGE = 4;
  static const int NOTIFICATION_GROUP_INVITATION = 8;
  static const int NOTIFICATION_SHOW_MESSAGE = 16;
  static const int NOTIFICATION_INCOMING_CALL = 32;
  static const int NOTIFICATION_SOUND_MESSAGE = 256;
  static const int NOTIFICATION_SOUND_GROUP = 512;
  static const int NOTIFICATION_DISABLED_WITH_SUB = 65536;
  static const int NOTIFICATION_PAYMENT = 131072;
  static const int PRIVACY_SYNC_CONTACTS = 64;
  static const int PRIVACY_SEARCH_BY_PHONE_NUMBER = 128;
  static const int PRIVACY_SEARCH_BY_USERID = 8192;
  static const int PRIVACY_SEARCH_BY_EMAIL = 16384;
  static const int PRIVACY_ALLOW_SECONDARY_DEVICE_LOGIN = 2097152;
  static const int PRIVACY_PROFILE_IMAGE_POST_TO_MYHOME = 8388608;
  static const int PRIVACY_ALLOW_FRIEND_REQUEST = 1073741824;
  static const int PRIVACY_RECV_MESSAGES_FROM_NOT_FRIEND = 33554432;
  static const int PRIVACY_AGREE_USE_LINECOIN_TO_PAIDCALL = 67108864;
  static const int PRIVACY_AGREE_USE_PAIDCALL = 134217728;
  static const int CONTACT_MY_TICKET = 1024;
  static const int IDENTITY_PROVIDER = 2048;
  static const int IDENTITY_IDENTIFIER = 4096;
  static const int SNS_ACCOUNT = 524288;
  static const int PHONE_REGISTRATION = 1048576;
  static const int PREFERENCE_LOCALE = 32768;
  static const int CUSTOM_MODE = 4194304;
  static const int EMAIL_CONFIRMATION_STATUS = 16777216;
  static const int ACCOUNT_MIGRATION_PINCODE = 268435456;
  static const int ENFORCED_INPUT_ACCOUNT_MIGRATION_PINCODE = 536870912;
  static const int SECURITY_CENTER_SETTINGS = 262144;

  static final Set<int> VALID_VALUES = new Set.from([
    ALL
    , NOTIFICATION_ENABLE
    , NOTIFICATION_MUTE_EXPIRATION
    , NOTIFICATION_NEW_MESSAGE
    , NOTIFICATION_GROUP_INVITATION
    , NOTIFICATION_SHOW_MESSAGE
    , NOTIFICATION_INCOMING_CALL
    , NOTIFICATION_SOUND_MESSAGE
    , NOTIFICATION_SOUND_GROUP
    , NOTIFICATION_DISABLED_WITH_SUB
    , NOTIFICATION_PAYMENT
    , PRIVACY_SYNC_CONTACTS
    , PRIVACY_SEARCH_BY_PHONE_NUMBER
    , PRIVACY_SEARCH_BY_USERID
    , PRIVACY_SEARCH_BY_EMAIL
    , PRIVACY_ALLOW_SECONDARY_DEVICE_LOGIN
    , PRIVACY_PROFILE_IMAGE_POST_TO_MYHOME
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
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    ALL: 'ALL'
    , NOTIFICATION_ENABLE: 'NOTIFICATION_ENABLE'
    , NOTIFICATION_MUTE_EXPIRATION: 'NOTIFICATION_MUTE_EXPIRATION'
    , NOTIFICATION_NEW_MESSAGE: 'NOTIFICATION_NEW_MESSAGE'
    , NOTIFICATION_GROUP_INVITATION: 'NOTIFICATION_GROUP_INVITATION'
    , NOTIFICATION_SHOW_MESSAGE: 'NOTIFICATION_SHOW_MESSAGE'
    , NOTIFICATION_INCOMING_CALL: 'NOTIFICATION_INCOMING_CALL'
    , NOTIFICATION_SOUND_MESSAGE: 'NOTIFICATION_SOUND_MESSAGE'
    , NOTIFICATION_SOUND_GROUP: 'NOTIFICATION_SOUND_GROUP'
    , NOTIFICATION_DISABLED_WITH_SUB: 'NOTIFICATION_DISABLED_WITH_SUB'
    , NOTIFICATION_PAYMENT: 'NOTIFICATION_PAYMENT'
    , PRIVACY_SYNC_CONTACTS: 'PRIVACY_SYNC_CONTACTS'
    , PRIVACY_SEARCH_BY_PHONE_NUMBER: 'PRIVACY_SEARCH_BY_PHONE_NUMBER'
    , PRIVACY_SEARCH_BY_USERID: 'PRIVACY_SEARCH_BY_USERID'
    , PRIVACY_SEARCH_BY_EMAIL: 'PRIVACY_SEARCH_BY_EMAIL'
    , PRIVACY_ALLOW_SECONDARY_DEVICE_LOGIN: 'PRIVACY_ALLOW_SECONDARY_DEVICE_LOGIN'
    , PRIVACY_PROFILE_IMAGE_POST_TO_MYHOME: 'PRIVACY_PROFILE_IMAGE_POST_TO_MYHOME'
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
  };
}