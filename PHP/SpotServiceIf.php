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

interface SpotServiceIf
{
    /**
     * @param string $countryAreaCode
     * @param string $phoneNumber
     * @return \SpotPhoneNumberResponse
     * @throws \TalkException
     */
    public function lookupByPhoneNumber($countryAreaCode, $phoneNumber);
    /**
     * @param \Location $location
     * @param int $category
     * @param string $query
     * @param string $countryAreaCode
     * @return \SpotNearbyResponse
     * @throws \TalkException
     */
    public function lookupNearby(\Location $location, $category, $query, $countryAreaCode);
}
