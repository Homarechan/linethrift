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

final class UnregistrationReason
{
    const UNREGISTRATION_REASON_UNREGISTER_USER = 1;

    const UNREGISTRATION_REASON_UNBIND_DEVICE = 2;

    static public $__names = array(
        1 => 'UNREGISTRATION_REASON_UNREGISTER_USER',
        2 => 'UNREGISTRATION_REASON_UNBIND_DEVICE',
    );
}

