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

final class SquareChatState
{
    const ALIVE = 0;

    const DELETED = 1;

    const SUSPENDED = 2;

    static public $__names = array(
        0 => 'ALIVE',
        1 => 'DELETED',
        2 => 'SUSPENDED',
    );
}

