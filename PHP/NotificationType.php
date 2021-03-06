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

final class NotificationType
{
    const APPLE_APNS = 1;

    const GOOGLE_C2DM = 2;

    const NHN_NNI = 3;

    const SKT_AOM = 4;

    const MS_MPNS = 5;

    const RIM_BIS = 6;

    const GOOGLE_GCM = 7;

    const NOKIA_NNAPI = 8;

    const TIZEN = 9;

    const LINE_BOT = 17;

    const LINE_WAP = 18;

    const APPLE_APNS_VOIP = 19;

    const MS_WNS = 20;

    const GOOGLE_FCM = 21;

    static public $__names = array(
        1 => 'APPLE_APNS',
        2 => 'GOOGLE_C2DM',
        3 => 'NHN_NNI',
        4 => 'SKT_AOM',
        5 => 'MS_MPNS',
        6 => 'RIM_BIS',
        7 => 'GOOGLE_GCM',
        8 => 'NOKIA_NNAPI',
        9 => 'TIZEN',
        17 => 'LINE_BOT',
        18 => 'LINE_WAP',
        19 => 'APPLE_APNS_VOIP',
        20 => 'MS_WNS',
        21 => 'GOOGLE_FCM',
    );
}

