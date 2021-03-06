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

final class PointErrorCode
{
    const REQUEST_DUPLICATION = 3001;

    const INVALID_PARAMETER = 3002;

    const NOT_ENOUGH_BALANCE = 3003;

    const AUTHENTICATION_FAIL = 3004;

    const API_ACCESS_FORBIDDEN = 3005;

    const MEMBER_ACCOUNT_NOT_FOUND = 3006;

    const SERVICE_ACCOUNT_NOT_FOUND = 3007;

    const TRANSACTION_NOT_FOUND = 3008;

    const ALREADY_REVERSED_TRANSACTION = 3009;

    const MESSAGE_NOT_READABLE = 3010;

    const HTTP_REQUEST_METHOD_NOT_SUPPORTED = 3011;

    const HTTP_MEDIA_TYPE_NOT_SUPPORTED = 3012;

    const NOT_ALLOWED_TO_DEPOSIT = 3013;

    const NOT_ALLOWED_TO_PAY = 3014;

    const TRANSACTION_ACCESS_FORBIDDEN = 3015;

    const INVALID_SERVICE_CONFIGURATION = 4001;

    const DCS_COMMUNICATION_FAIL = 5004;

    const UPDATE_BALANCE_FAIL = 5007;

    const SYSTEM_ERROR = 5999;

    const SYSTEM_MAINTENANCE = 5888;

    static public $__names = array(
        3001 => 'REQUEST_DUPLICATION',
        3002 => 'INVALID_PARAMETER',
        3003 => 'NOT_ENOUGH_BALANCE',
        3004 => 'AUTHENTICATION_FAIL',
        3005 => 'API_ACCESS_FORBIDDEN',
        3006 => 'MEMBER_ACCOUNT_NOT_FOUND',
        3007 => 'SERVICE_ACCOUNT_NOT_FOUND',
        3008 => 'TRANSACTION_NOT_FOUND',
        3009 => 'ALREADY_REVERSED_TRANSACTION',
        3010 => 'MESSAGE_NOT_READABLE',
        3011 => 'HTTP_REQUEST_METHOD_NOT_SUPPORTED',
        3012 => 'HTTP_MEDIA_TYPE_NOT_SUPPORTED',
        3013 => 'NOT_ALLOWED_TO_DEPOSIT',
        3014 => 'NOT_ALLOWED_TO_PAY',
        3015 => 'TRANSACTION_ACCESS_FORBIDDEN',
        4001 => 'INVALID_SERVICE_CONFIGURATION',
        5004 => 'DCS_COMMUNICATION_FAIL',
        5007 => 'UPDATE_BALANCE_FAIL',
        5999 => 'SYSTEM_ERROR',
        5888 => 'SYSTEM_MAINTENANCE',
    );
}

