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

final class EmailConfirmationStatus
{
    const NOT_SPECIFIED = 0;

    const NOT_YET = 1;

    const DONE = 3;

    const NEED_ENFORCED_INPUT = 4;

    static public $__names = array(
        0 => 'NOT_SPECIFIED',
        1 => 'NOT_YET',
        3 => 'DONE',
        4 => 'NEED_ENFORCED_INPUT',
    );
}

