/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class ErrorCode {
  public static inline var ILLEGAL_ARGUMENT : Int = 0;
  public static inline var AUTHENTICATION_FAILED : Int = 1;
  public static inline var DB_FAILED : Int = 2;
  public static inline var INVALID_STATE : Int = 3;
  public static inline var EXCESSIVE_ACCESS : Int = 4;
  public static inline var NOT_FOUND : Int = 5;
  public static inline var INVALID_MID : Int = 9;
  public static inline var NOT_A_MEMBER : Int = 10;
  public static inline var INVALID_LENGTH : Int = 6;
  public static inline var NOT_AVAILABLE_USER : Int = 7;
  public static inline var NOT_AUTHORIZED_DEVICE : Int = 8;
  public static inline var NOT_AUTHORIZED_SESSION : Int = 14;
  public static inline var INCOMPATIBLE_APP_VERSION : Int = 11;
  public static inline var NOT_READY : Int = 12;
  public static inline var NOT_AVAILABLE_SESSION : Int = 13;
  public static inline var SYSTEM_ERROR : Int = 15;
  public static inline var NO_AVAILABLE_VERIFICATION_METHOD : Int = 16;
  public static inline var NOT_AUTHENTICATED : Int = 17;
  public static inline var INVALID_IDENTITY_CREDENTIAL : Int = 18;
  public static inline var NOT_AVAILABLE_IDENTITY_IDENTIFIER : Int = 19;
  public static inline var INTERNAL_ERROR : Int = 20;
  public static inline var NO_SUCH_IDENTITY_IDENFIER : Int = 21;
  public static inline var DEACTIVATED_ACCOUNT_BOUND_TO_THIS_IDENTITY : Int = 22;
  public static inline var ILLEGAL_IDENTITY_CREDENTIAL : Int = 23;
  public static inline var UNKNOWN_CHANNEL : Int = 24;
  public static inline var NO_SUCH_MESSAGE_BOX : Int = 25;
  public static inline var NOT_AVAILABLE_MESSAGE_BOX : Int = 26;
  public static inline var CHANNEL_DOES_NOT_MATCH : Int = 27;
  public static inline var NOT_YOUR_MESSAGE : Int = 28;
  public static inline var MESSAGE_DEFINED_ERROR : Int = 29;
  public static inline var USER_CANNOT_ACCEPT_PRESENTS : Int = 30;
  public static inline var USER_NOT_STICKER_OWNER : Int = 32;
  public static inline var MAINTENANCE_ERROR : Int = 33;
  public static inline var ACCOUNT_NOT_MATCHED : Int = 34;
  public static inline var ABUSE_BLOCK : Int = 35;
  public static inline var NOT_FRIEND : Int = 36;
  public static inline var NOT_ALLOWED_CALL : Int = 37;
  public static inline var BLOCK_FRIEND : Int = 38;
  public static inline var INCOMPATIBLE_VOIP_VERSION : Int = 39;
  public static inline var INVALID_SNS_ACCESS_TOKEN : Int = 40;
  public static inline var EXTERNAL_SERVICE_NOT_AVAILABLE : Int = 41;
  public static inline var NOT_ALLOWED_ADD_CONTACT : Int = 42;
  public static inline var NOT_CERTIFICATED : Int = 43;
  public static inline var NOT_ALLOWED_SECONDARY_DEVICE : Int = 44;
  public static inline var INVALID_PIN_CODE : Int = 45;
  public static inline var NOT_FOUND_IDENTITY_CREDENTIAL : Int = 46;
  public static inline var EXCEED_FILE_MAX_SIZE : Int = 47;
  public static inline var EXCEED_DAILY_QUOTA : Int = 48;
  public static inline var NOT_SUPPORT_SEND_FILE : Int = 49;
  public static inline var MUST_UPGRADE : Int = 50;
  public static inline var NOT_AVAILABLE_PIN_CODE_SESSION : Int = 51;
  public static inline var EXPIRED_REVISION : Int = 52;
  public static inline var NOT_YET_PHONE_NUMBER : Int = 54;
  public static inline var BAD_CALL_NUMBER : Int = 55;
  public static inline var UNAVAILABLE_CALL_NUMBER : Int = 56;
  public static inline var NOT_SUPPORT_CALL_SERVICE : Int = 57;
  public static inline var CONGESTION_CONTROL : Int = 58;
  public static inline var NO_BALANCE : Int = 59;
  public static inline var NOT_PERMITTED_CALLER_ID : Int = 60;
  public static inline var NO_CALLER_ID_LIMIT_EXCEEDED : Int = 61;
  public static inline var CALLER_ID_VERIFICATION_REQUIRED : Int = 62;
  public static inline var NO_CALLER_ID_LIMIT_EXCEEDED_AND_VERIFICATION_REQUIRED : Int = 63;
  public static inline var MESSAGE_NOT_FOUND : Int = 64;
  public static inline var INVALID_ACCOUNT_MIGRATION_PINCODE_FORMAT : Int = 65;
  public static inline var ACCOUNT_MIGRATION_PINCODE_NOT_MATCHED : Int = 66;
  public static inline var ACCOUNT_MIGRATION_PINCODE_BLOCKED : Int = 67;
  public static inline var INVALID_PASSWORD_FORMAT : Int = 69;
  public static inline var FEATURE_RESTRICTED : Int = 70;
  public static inline var MESSAGE_NOT_DESTRUCTIBLE : Int = 71;
  public static inline var PAID_CALL_REDEEM_FAILED : Int = 72;
  public static inline var PREVENTED_JOIN_BY_TICKET : Int = 73;
  public static inline var SEND_MESSAGE_NOT_PERMITTED_FROM_LINE_AT : Int = 75;
  public static inline var SEND_MESSAGE_NOT_PERMITTED_WHILE_AUTO_REPLY : Int = 76;
  public static inline var SECURITY_CENTER_NOT_VERIFIED : Int = 77;
  public static inline var SECURITY_CENTER_BLOCKED_BY_SETTING : Int = 78;
  public static inline var SECURITY_CENTER_BLOCKED : Int = 79;
  public static inline var TALK_PROXY_EXCEPTION : Int = 80;
  public static inline var E2EE_INVALID_PROTOCOL : Int = 81;
  public static inline var E2EE_RETRY_ENCRYPT : Int = 82;
  public static inline var E2EE_UPDATE_SENDER_KEY : Int = 83;
  public static inline var E2EE_UPDATE_RECEIVER_KEY : Int = 84;
  public static inline var E2EE_INVALID_ARGUMENT : Int = 85;
  public static inline var E2EE_INVALID_VERSION : Int = 86;
  public static inline var E2EE_SENDER_DISABLED : Int = 87;
  public static inline var E2EE_RECEIVER_DISABLED : Int = 88;
  public static inline var E2EE_SENDER_NOT_ALLOWED : Int = 89;
  public static inline var E2EE_RECEIVER_NOT_ALLOWED : Int = 90;
  public static inline var E2EE_RESEND_FAIL : Int = 91;
  public static inline var E2EE_RESEND_OK : Int = 92;
  public static inline var HITOKOTO_BACKUP_NO_AVAILABLE_DATA : Int = 93;
  public static inline var E2EE_UPDATE_PRIMARY_DEVICE : Int = 94;
  public static inline var SUCCESS : Int = 95;
  public static inline var CANCEL : Int = 96;
  public static inline var E2EE_PRIMARY_NOT_SUPPORT : Int = 97;
  public static inline var E2EE_RETRY_PLAIN : Int = 98;
  public static inline var E2EE_RECREATE_GROUP_KEY : Int = 99;
  public static inline var E2EE_GROUP_TOO_MANY_MEMBERS : Int = 100;
  public static inline var SERVER_BUSY : Int = 101;
  public static inline var NOT_ALLOWED_ADD_FOLLOW : Int = 102;
  public static inline var INCOMING_FRIEND_REQUEST_LIMIT : Int = 103;
  public static inline var OUTGOING_FRIEND_REQUEST_LIMIT : Int = 104;
  public static inline var OUTGOING_FRIEND_REQUEST_QUOTA : Int = 105;
  public static inline var DUPLICATED : Int = 106;
  public static inline var BANNED : Int = 107;

  public static var VALID_VALUES = { new IntSet( [ILLEGAL_ARGUMENT, AUTHENTICATION_FAILED, DB_FAILED, INVALID_STATE, EXCESSIVE_ACCESS, NOT_FOUND, INVALID_MID, NOT_A_MEMBER, INVALID_LENGTH, NOT_AVAILABLE_USER, NOT_AUTHORIZED_DEVICE, NOT_AUTHORIZED_SESSION, INCOMPATIBLE_APP_VERSION, NOT_READY, NOT_AVAILABLE_SESSION, SYSTEM_ERROR, NO_AVAILABLE_VERIFICATION_METHOD, NOT_AUTHENTICATED, INVALID_IDENTITY_CREDENTIAL, NOT_AVAILABLE_IDENTITY_IDENTIFIER, INTERNAL_ERROR, NO_SUCH_IDENTITY_IDENFIER, DEACTIVATED_ACCOUNT_BOUND_TO_THIS_IDENTITY, ILLEGAL_IDENTITY_CREDENTIAL, UNKNOWN_CHANNEL, NO_SUCH_MESSAGE_BOX, NOT_AVAILABLE_MESSAGE_BOX, CHANNEL_DOES_NOT_MATCH, NOT_YOUR_MESSAGE, MESSAGE_DEFINED_ERROR, USER_CANNOT_ACCEPT_PRESENTS, USER_NOT_STICKER_OWNER, MAINTENANCE_ERROR, ACCOUNT_NOT_MATCHED, ABUSE_BLOCK, NOT_FRIEND, NOT_ALLOWED_CALL, BLOCK_FRIEND, INCOMPATIBLE_VOIP_VERSION, INVALID_SNS_ACCESS_TOKEN, EXTERNAL_SERVICE_NOT_AVAILABLE, NOT_ALLOWED_ADD_CONTACT, NOT_CERTIFICATED, NOT_ALLOWED_SECONDARY_DEVICE, INVALID_PIN_CODE, NOT_FOUND_IDENTITY_CREDENTIAL, EXCEED_FILE_MAX_SIZE, EXCEED_DAILY_QUOTA, NOT_SUPPORT_SEND_FILE, MUST_UPGRADE, NOT_AVAILABLE_PIN_CODE_SESSION, EXPIRED_REVISION, NOT_YET_PHONE_NUMBER, BAD_CALL_NUMBER, UNAVAILABLE_CALL_NUMBER, NOT_SUPPORT_CALL_SERVICE, CONGESTION_CONTROL, NO_BALANCE, NOT_PERMITTED_CALLER_ID, NO_CALLER_ID_LIMIT_EXCEEDED, CALLER_ID_VERIFICATION_REQUIRED, NO_CALLER_ID_LIMIT_EXCEEDED_AND_VERIFICATION_REQUIRED, MESSAGE_NOT_FOUND, INVALID_ACCOUNT_MIGRATION_PINCODE_FORMAT, ACCOUNT_MIGRATION_PINCODE_NOT_MATCHED, ACCOUNT_MIGRATION_PINCODE_BLOCKED, INVALID_PASSWORD_FORMAT, FEATURE_RESTRICTED, MESSAGE_NOT_DESTRUCTIBLE, PAID_CALL_REDEEM_FAILED, PREVENTED_JOIN_BY_TICKET, SEND_MESSAGE_NOT_PERMITTED_FROM_LINE_AT, SEND_MESSAGE_NOT_PERMITTED_WHILE_AUTO_REPLY, SECURITY_CENTER_NOT_VERIFIED, SECURITY_CENTER_BLOCKED_BY_SETTING, SECURITY_CENTER_BLOCKED, TALK_PROXY_EXCEPTION, E2EE_INVALID_PROTOCOL, E2EE_RETRY_ENCRYPT, E2EE_UPDATE_SENDER_KEY, E2EE_UPDATE_RECEIVER_KEY, E2EE_INVALID_ARGUMENT, E2EE_INVALID_VERSION, E2EE_SENDER_DISABLED, E2EE_RECEIVER_DISABLED, E2EE_SENDER_NOT_ALLOWED, E2EE_RECEIVER_NOT_ALLOWED, E2EE_RESEND_FAIL, E2EE_RESEND_OK, HITOKOTO_BACKUP_NO_AVAILABLE_DATA, E2EE_UPDATE_PRIMARY_DEVICE, SUCCESS, CANCEL, E2EE_PRIMARY_NOT_SUPPORT, E2EE_RETRY_PLAIN, E2EE_RECREATE_GROUP_KEY, E2EE_GROUP_TOO_MANY_MEMBERS, SERVER_BUSY, NOT_ALLOWED_ADD_FOLLOW, INCOMING_FRIEND_REQUEST_LIMIT, OUTGOING_FRIEND_REQUEST_LIMIT, OUTGOING_FRIEND_REQUEST_QUOTA, DUPLICATED, BANNED]); };
  public static var VALUES_TO_NAMES = { [
    ILLEGAL_ARGUMENT => "ILLEGAL_ARGUMENT",
    AUTHENTICATION_FAILED => "AUTHENTICATION_FAILED",
    DB_FAILED => "DB_FAILED",
    INVALID_STATE => "INVALID_STATE",
    EXCESSIVE_ACCESS => "EXCESSIVE_ACCESS",
    NOT_FOUND => "NOT_FOUND",
    INVALID_MID => "INVALID_MID",
    NOT_A_MEMBER => "NOT_A_MEMBER",
    INVALID_LENGTH => "INVALID_LENGTH",
    NOT_AVAILABLE_USER => "NOT_AVAILABLE_USER",
    NOT_AUTHORIZED_DEVICE => "NOT_AUTHORIZED_DEVICE",
    NOT_AUTHORIZED_SESSION => "NOT_AUTHORIZED_SESSION",
    INCOMPATIBLE_APP_VERSION => "INCOMPATIBLE_APP_VERSION",
    NOT_READY => "NOT_READY",
    NOT_AVAILABLE_SESSION => "NOT_AVAILABLE_SESSION",
    SYSTEM_ERROR => "SYSTEM_ERROR",
    NO_AVAILABLE_VERIFICATION_METHOD => "NO_AVAILABLE_VERIFICATION_METHOD",
    NOT_AUTHENTICATED => "NOT_AUTHENTICATED",
    INVALID_IDENTITY_CREDENTIAL => "INVALID_IDENTITY_CREDENTIAL",
    NOT_AVAILABLE_IDENTITY_IDENTIFIER => "NOT_AVAILABLE_IDENTITY_IDENTIFIER",
    INTERNAL_ERROR => "INTERNAL_ERROR",
    NO_SUCH_IDENTITY_IDENFIER => "NO_SUCH_IDENTITY_IDENFIER",
    DEACTIVATED_ACCOUNT_BOUND_TO_THIS_IDENTITY => "DEACTIVATED_ACCOUNT_BOUND_TO_THIS_IDENTITY",
    ILLEGAL_IDENTITY_CREDENTIAL => "ILLEGAL_IDENTITY_CREDENTIAL",
    UNKNOWN_CHANNEL => "UNKNOWN_CHANNEL",
    NO_SUCH_MESSAGE_BOX => "NO_SUCH_MESSAGE_BOX",
    NOT_AVAILABLE_MESSAGE_BOX => "NOT_AVAILABLE_MESSAGE_BOX",
    CHANNEL_DOES_NOT_MATCH => "CHANNEL_DOES_NOT_MATCH",
    NOT_YOUR_MESSAGE => "NOT_YOUR_MESSAGE",
    MESSAGE_DEFINED_ERROR => "MESSAGE_DEFINED_ERROR",
    USER_CANNOT_ACCEPT_PRESENTS => "USER_CANNOT_ACCEPT_PRESENTS",
    USER_NOT_STICKER_OWNER => "USER_NOT_STICKER_OWNER",
    MAINTENANCE_ERROR => "MAINTENANCE_ERROR",
    ACCOUNT_NOT_MATCHED => "ACCOUNT_NOT_MATCHED",
    ABUSE_BLOCK => "ABUSE_BLOCK",
    NOT_FRIEND => "NOT_FRIEND",
    NOT_ALLOWED_CALL => "NOT_ALLOWED_CALL",
    BLOCK_FRIEND => "BLOCK_FRIEND",
    INCOMPATIBLE_VOIP_VERSION => "INCOMPATIBLE_VOIP_VERSION",
    INVALID_SNS_ACCESS_TOKEN => "INVALID_SNS_ACCESS_TOKEN",
    EXTERNAL_SERVICE_NOT_AVAILABLE => "EXTERNAL_SERVICE_NOT_AVAILABLE",
    NOT_ALLOWED_ADD_CONTACT => "NOT_ALLOWED_ADD_CONTACT",
    NOT_CERTIFICATED => "NOT_CERTIFICATED",
    NOT_ALLOWED_SECONDARY_DEVICE => "NOT_ALLOWED_SECONDARY_DEVICE",
    INVALID_PIN_CODE => "INVALID_PIN_CODE",
    NOT_FOUND_IDENTITY_CREDENTIAL => "NOT_FOUND_IDENTITY_CREDENTIAL",
    EXCEED_FILE_MAX_SIZE => "EXCEED_FILE_MAX_SIZE",
    EXCEED_DAILY_QUOTA => "EXCEED_DAILY_QUOTA",
    NOT_SUPPORT_SEND_FILE => "NOT_SUPPORT_SEND_FILE",
    MUST_UPGRADE => "MUST_UPGRADE",
    NOT_AVAILABLE_PIN_CODE_SESSION => "NOT_AVAILABLE_PIN_CODE_SESSION",
    EXPIRED_REVISION => "EXPIRED_REVISION",
    NOT_YET_PHONE_NUMBER => "NOT_YET_PHONE_NUMBER",
    BAD_CALL_NUMBER => "BAD_CALL_NUMBER",
    UNAVAILABLE_CALL_NUMBER => "UNAVAILABLE_CALL_NUMBER",
    NOT_SUPPORT_CALL_SERVICE => "NOT_SUPPORT_CALL_SERVICE",
    CONGESTION_CONTROL => "CONGESTION_CONTROL",
    NO_BALANCE => "NO_BALANCE",
    NOT_PERMITTED_CALLER_ID => "NOT_PERMITTED_CALLER_ID",
    NO_CALLER_ID_LIMIT_EXCEEDED => "NO_CALLER_ID_LIMIT_EXCEEDED",
    CALLER_ID_VERIFICATION_REQUIRED => "CALLER_ID_VERIFICATION_REQUIRED",
    NO_CALLER_ID_LIMIT_EXCEEDED_AND_VERIFICATION_REQUIRED => "NO_CALLER_ID_LIMIT_EXCEEDED_AND_VERIFICATION_REQUIRED",
    MESSAGE_NOT_FOUND => "MESSAGE_NOT_FOUND",
    INVALID_ACCOUNT_MIGRATION_PINCODE_FORMAT => "INVALID_ACCOUNT_MIGRATION_PINCODE_FORMAT",
    ACCOUNT_MIGRATION_PINCODE_NOT_MATCHED => "ACCOUNT_MIGRATION_PINCODE_NOT_MATCHED",
    ACCOUNT_MIGRATION_PINCODE_BLOCKED => "ACCOUNT_MIGRATION_PINCODE_BLOCKED",
    INVALID_PASSWORD_FORMAT => "INVALID_PASSWORD_FORMAT",
    FEATURE_RESTRICTED => "FEATURE_RESTRICTED",
    MESSAGE_NOT_DESTRUCTIBLE => "MESSAGE_NOT_DESTRUCTIBLE",
    PAID_CALL_REDEEM_FAILED => "PAID_CALL_REDEEM_FAILED",
    PREVENTED_JOIN_BY_TICKET => "PREVENTED_JOIN_BY_TICKET",
    SEND_MESSAGE_NOT_PERMITTED_FROM_LINE_AT => "SEND_MESSAGE_NOT_PERMITTED_FROM_LINE_AT",
    SEND_MESSAGE_NOT_PERMITTED_WHILE_AUTO_REPLY => "SEND_MESSAGE_NOT_PERMITTED_WHILE_AUTO_REPLY",
    SECURITY_CENTER_NOT_VERIFIED => "SECURITY_CENTER_NOT_VERIFIED",
    SECURITY_CENTER_BLOCKED_BY_SETTING => "SECURITY_CENTER_BLOCKED_BY_SETTING",
    SECURITY_CENTER_BLOCKED => "SECURITY_CENTER_BLOCKED",
    TALK_PROXY_EXCEPTION => "TALK_PROXY_EXCEPTION",
    E2EE_INVALID_PROTOCOL => "E2EE_INVALID_PROTOCOL",
    E2EE_RETRY_ENCRYPT => "E2EE_RETRY_ENCRYPT",
    E2EE_UPDATE_SENDER_KEY => "E2EE_UPDATE_SENDER_KEY",
    E2EE_UPDATE_RECEIVER_KEY => "E2EE_UPDATE_RECEIVER_KEY",
    E2EE_INVALID_ARGUMENT => "E2EE_INVALID_ARGUMENT",
    E2EE_INVALID_VERSION => "E2EE_INVALID_VERSION",
    E2EE_SENDER_DISABLED => "E2EE_SENDER_DISABLED",
    E2EE_RECEIVER_DISABLED => "E2EE_RECEIVER_DISABLED",
    E2EE_SENDER_NOT_ALLOWED => "E2EE_SENDER_NOT_ALLOWED",
    E2EE_RECEIVER_NOT_ALLOWED => "E2EE_RECEIVER_NOT_ALLOWED",
    E2EE_RESEND_FAIL => "E2EE_RESEND_FAIL",
    E2EE_RESEND_OK => "E2EE_RESEND_OK",
    HITOKOTO_BACKUP_NO_AVAILABLE_DATA => "HITOKOTO_BACKUP_NO_AVAILABLE_DATA",
    E2EE_UPDATE_PRIMARY_DEVICE => "E2EE_UPDATE_PRIMARY_DEVICE",
    SUCCESS => "SUCCESS",
    CANCEL => "CANCEL",
    E2EE_PRIMARY_NOT_SUPPORT => "E2EE_PRIMARY_NOT_SUPPORT",
    E2EE_RETRY_PLAIN => "E2EE_RETRY_PLAIN",
    E2EE_RECREATE_GROUP_KEY => "E2EE_RECREATE_GROUP_KEY",
    E2EE_GROUP_TOO_MANY_MEMBERS => "E2EE_GROUP_TOO_MANY_MEMBERS",
    SERVER_BUSY => "SERVER_BUSY",
    NOT_ALLOWED_ADD_FOLLOW => "NOT_ALLOWED_ADD_FOLLOW",
    INCOMING_FRIEND_REQUEST_LIMIT => "INCOMING_FRIEND_REQUEST_LIMIT",
    OUTGOING_FRIEND_REQUEST_LIMIT => "OUTGOING_FRIEND_REQUEST_LIMIT",
    OUTGOING_FRIEND_REQUEST_QUOTA => "OUTGOING_FRIEND_REQUEST_QUOTA",
    DUPLICATED => "DUPLICATED",
    BANNED => "BANNED"
  ]; };
}