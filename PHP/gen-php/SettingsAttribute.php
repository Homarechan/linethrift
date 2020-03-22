<?php
/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

final class SettingsAttribute
{
    const ALL = 2147483647;

    const NOTIFICATION_ENABLE = 1;

    const NOTIFICATION_MUTE_EXPIRATION = 2;

    const NOTIFICATION_NEW_MESSAGE = 4;

    const NOTIFICATION_GROUP_INVITATION = 8;

    const NOTIFICATION_SHOW_MESSAGE = 16;

    const NOTIFICATION_INCOMING_CALL = 32;

    const NOTIFICATION_SOUND_MESSAGE = 256;

    const NOTIFICATION_SOUND_GROUP = 512;

    const NOTIFICATION_DISABLED_WITH_SUB = 65536;

    const NOTIFICATION_PAYMENT = 131072;

    const PRIVACY_SYNC_CONTACTS = 64;

    const PRIVACY_SEARCH_BY_PHONE_NUMBER = 128;

    const PRIVACY_SEARCH_BY_USERID = 8192;

    const PRIVACY_SEARCH_BY_EMAIL = 16384;

    const PRIVACY_ALLOW_SECONDARY_DEVICE_LOGIN = 2097152;

    const PRIVACY_PROFILE_IMAGE_POST_TO_MYHOME = 8388608;

    const PRIVACY_ALLOW_FRIEND_REQUEST = 1073741824;

    const PRIVACY_RECV_MESSAGES_FROM_NOT_FRIEND = 33554432;

    const PRIVACY_AGREE_USE_LINECOIN_TO_PAIDCALL = 67108864;

    const PRIVACY_AGREE_USE_PAIDCALL = 134217728;

    const CONTACT_MY_TICKET = 1024;

    const IDENTITY_PROVIDER = 2048;

    const IDENTITY_IDENTIFIER = 4096;

    const SNS_ACCOUNT = 524288;

    const PHONE_REGISTRATION = 1048576;

    const PREFERENCE_LOCALE = 32768;

    const CUSTOM_MODE = 4194304;

    const EMAIL_CONFIRMATION_STATUS = 16777216;

    const ACCOUNT_MIGRATION_PINCODE = 268435456;

    const ENFORCED_INPUT_ACCOUNT_MIGRATION_PINCODE = 536870912;

    const SECURITY_CENTER_SETTINGS = 262144;

    static public $__names = array(
        2147483647 => 'ALL',
        1 => 'NOTIFICATION_ENABLE',
        2 => 'NOTIFICATION_MUTE_EXPIRATION',
        4 => 'NOTIFICATION_NEW_MESSAGE',
        8 => 'NOTIFICATION_GROUP_INVITATION',
        16 => 'NOTIFICATION_SHOW_MESSAGE',
        32 => 'NOTIFICATION_INCOMING_CALL',
        256 => 'NOTIFICATION_SOUND_MESSAGE',
        512 => 'NOTIFICATION_SOUND_GROUP',
        65536 => 'NOTIFICATION_DISABLED_WITH_SUB',
        131072 => 'NOTIFICATION_PAYMENT',
        64 => 'PRIVACY_SYNC_CONTACTS',
        128 => 'PRIVACY_SEARCH_BY_PHONE_NUMBER',
        8192 => 'PRIVACY_SEARCH_BY_USERID',
        16384 => 'PRIVACY_SEARCH_BY_EMAIL',
        2097152 => 'PRIVACY_ALLOW_SECONDARY_DEVICE_LOGIN',
        8388608 => 'PRIVACY_PROFILE_IMAGE_POST_TO_MYHOME',
        1073741824 => 'PRIVACY_ALLOW_FRIEND_REQUEST',
        33554432 => 'PRIVACY_RECV_MESSAGES_FROM_NOT_FRIEND',
        67108864 => 'PRIVACY_AGREE_USE_LINECOIN_TO_PAIDCALL',
        134217728 => 'PRIVACY_AGREE_USE_PAIDCALL',
        1024 => 'CONTACT_MY_TICKET',
        2048 => 'IDENTITY_PROVIDER',
        4096 => 'IDENTITY_IDENTIFIER',
        524288 => 'SNS_ACCOUNT',
        1048576 => 'PHONE_REGISTRATION',
        32768 => 'PREFERENCE_LOCALE',
        4194304 => 'CUSTOM_MODE',
        16777216 => 'EMAIL_CONFIRMATION_STATUS',
        268435456 => 'ACCOUNT_MIGRATION_PINCODE',
        536870912 => 'ENFORCED_INPUT_ACCOUNT_MIGRATION_PINCODE',
        262144 => 'SECURITY_CENTER_SETTINGS',
    );
}
