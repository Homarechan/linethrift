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

final class ContactSetting
{
    const CONTACT_SETTING_NOTIFICATION_DISABLE = 1;

    const CONTACT_SETTING_DISPLAY_NAME_OVERRIDE = 2;

    const CONTACT_SETTING_CONTACT_HIDE = 4;

    const CONTACT_SETTING_FAVORITE = 8;

    const CONTACT_SETTING_DELETE = 16;

    static public $__names = array(
        1 => 'CONTACT_SETTING_NOTIFICATION_DISABLE',
        2 => 'CONTACT_SETTING_DISPLAY_NAME_OVERRIDE',
        4 => 'CONTACT_SETTING_CONTACT_HIDE',
        8 => 'CONTACT_SETTING_FAVORITE',
        16 => 'CONTACT_SETTING_DELETE',
    );
}

