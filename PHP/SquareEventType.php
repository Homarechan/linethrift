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

final class SquareEventType
{
    const RECEIVE_MESSAGE = 0;

    const SEND_MESSAGE = 1;

    const NOTIFIED_JOIN_SQUARE_CHAT = 2;

    const NOTIFIED_INVITE_INTO_SQUARE_CHAT = 3;

    const NOTIFIED_LEAVE_SQUARE_CHAT = 4;

    const NOTIFIED_DESTROY_MESSAGE = 5;

    const NOTIFIED_MARK_AS_READ = 6;

    const NOTIFIED_UPDATE_SQUARE_MEMBER_PROFILE = 7;

    const NOTIFIED_KICKOUT_FROM_SQUARE = 19;

    const NOTIFIED_SHUTDOWN_SQUARE = 18;

    const NOTIFIED_DELETE_SQUARE_CHAT = 20;

    const NOTIFIED_UPDATE_SQUARE_CHAT_PROFILE_NAME = 30;

    const NOTIFIED_UPDATE_SQUARE_CHAT_PROFILE_IMAGE = 31;

    const NOTIFIED_UPDATE_SQUARE_CHAT_ANNOUNCEMENT = 37;

    const NOTIFIED_ADD_BOT = 33;

    const NOTIFIED_REMOVE_BOT = 34;

    const NOTIFIED_UPDATE_SQUARE = 8;

    const NOTIFIED_UPDATE_SQUARE_STATUS = 9;

    const NOTIFIED_UPDATE_SQUARE_AUTHORITY = 10;

    const NOTIFIED_UPDATE_SQUARE_MEMBER = 11;

    const NOTIFIED_UPDATE_SQUARE_CHAT = 12;

    const NOTIFIED_UPDATE_SQUARE_CHAT_STATUS = 13;

    const NOTIFIED_UPDATE_SQUARE_CHAT_MEMBER = 14;

    const NOTIFIED_CREATE_SQUARE_MEMBER = 15;

    const NOTIFIED_CREATE_SQUARE_CHAT_MEMBER = 16;

    const NOTIFIED_UPDATE_SQUARE_MEMBER_RELATION = 17;

    const NOTIFIED_UPDATE_SQUARE_FEATURE_SET = 32;

    const NOTIFIED_UPDATE_SQUARE_NOTE_STATUS = 36;

    const NOTIFICATION_JOIN_REQUEST = 21;

    const NOTIFICATION_JOINED = 22;

    const NOTIFICATION_PROMOTED_COADMIN = 23;

    const NOTIFICATION_PROMOTED_ADMIN = 24;

    const NOTIFICATION_DEMOTED_MEMBER = 25;

    const NOTIFICATION_KICKED_OUT = 26;

    const NOTIFICATION_SQUARE_DELETE = 27;

    const NOTIFICATION_SQUARE_CHAT_DELETE = 28;

    const NOTIFICATION_MESSAGE = 29;

    static public $__names = array(
        0 => 'RECEIVE_MESSAGE',
        1 => 'SEND_MESSAGE',
        2 => 'NOTIFIED_JOIN_SQUARE_CHAT',
        3 => 'NOTIFIED_INVITE_INTO_SQUARE_CHAT',
        4 => 'NOTIFIED_LEAVE_SQUARE_CHAT',
        5 => 'NOTIFIED_DESTROY_MESSAGE',
        6 => 'NOTIFIED_MARK_AS_READ',
        7 => 'NOTIFIED_UPDATE_SQUARE_MEMBER_PROFILE',
        19 => 'NOTIFIED_KICKOUT_FROM_SQUARE',
        18 => 'NOTIFIED_SHUTDOWN_SQUARE',
        20 => 'NOTIFIED_DELETE_SQUARE_CHAT',
        30 => 'NOTIFIED_UPDATE_SQUARE_CHAT_PROFILE_NAME',
        31 => 'NOTIFIED_UPDATE_SQUARE_CHAT_PROFILE_IMAGE',
        37 => 'NOTIFIED_UPDATE_SQUARE_CHAT_ANNOUNCEMENT',
        33 => 'NOTIFIED_ADD_BOT',
        34 => 'NOTIFIED_REMOVE_BOT',
        8 => 'NOTIFIED_UPDATE_SQUARE',
        9 => 'NOTIFIED_UPDATE_SQUARE_STATUS',
        10 => 'NOTIFIED_UPDATE_SQUARE_AUTHORITY',
        11 => 'NOTIFIED_UPDATE_SQUARE_MEMBER',
        12 => 'NOTIFIED_UPDATE_SQUARE_CHAT',
        13 => 'NOTIFIED_UPDATE_SQUARE_CHAT_STATUS',
        14 => 'NOTIFIED_UPDATE_SQUARE_CHAT_MEMBER',
        15 => 'NOTIFIED_CREATE_SQUARE_MEMBER',
        16 => 'NOTIFIED_CREATE_SQUARE_CHAT_MEMBER',
        17 => 'NOTIFIED_UPDATE_SQUARE_MEMBER_RELATION',
        32 => 'NOTIFIED_UPDATE_SQUARE_FEATURE_SET',
        36 => 'NOTIFIED_UPDATE_SQUARE_NOTE_STATUS',
        21 => 'NOTIFICATION_JOIN_REQUEST',
        22 => 'NOTIFICATION_JOINED',
        23 => 'NOTIFICATION_PROMOTED_COADMIN',
        24 => 'NOTIFICATION_PROMOTED_ADMIN',
        25 => 'NOTIFICATION_DEMOTED_MEMBER',
        26 => 'NOTIFICATION_KICKED_OUT',
        27 => 'NOTIFICATION_SQUARE_DELETE',
        28 => 'NOTIFICATION_SQUARE_CHAT_DELETE',
        29 => 'NOTIFICATION_MESSAGE',
    );
}

