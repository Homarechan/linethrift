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

class TalkService_registerWithExistingSnsIdAndIdentityCredential_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'identityCredential',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\IdentityCredential',
        ),
        3 => array(
            'var' => 'region',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'udidHash',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        5 => array(
            'var' => 'deviceInfo',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\DeviceInfo',
        ),
    );

    /**
     * @var \IdentityCredential
     */
    public $identityCredential = null;
    /**
     * @var string
     */
    public $region = null;
    /**
     * @var string
     */
    public $udidHash = null;
    /**
     * @var \DeviceInfo
     */
    public $deviceInfo = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['identityCredential'])) {
                $this->identityCredential = $vals['identityCredential'];
            }
            if (isset($vals['region'])) {
                $this->region = $vals['region'];
            }
            if (isset($vals['udidHash'])) {
                $this->udidHash = $vals['udidHash'];
            }
            if (isset($vals['deviceInfo'])) {
                $this->deviceInfo = $vals['deviceInfo'];
            }
        }
    }

    public function getName()
    {
        return 'TalkService_registerWithExistingSnsIdAndIdentityCredential_args';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 2:
                    if ($ftype == TType::STRUCT) {
                        $this->identityCredential = new \IdentityCredential();
                        $xfer += $this->identityCredential->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->region);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->udidHash);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::STRUCT) {
                        $this->deviceInfo = new \DeviceInfo();
                        $xfer += $this->deviceInfo->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('TalkService_registerWithExistingSnsIdAndIdentityCredential_args');
        if ($this->identityCredential !== null) {
            if (!is_object($this->identityCredential)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('identityCredential', TType::STRUCT, 2);
            $xfer += $this->identityCredential->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->region !== null) {
            $xfer += $output->writeFieldBegin('region', TType::STRING, 3);
            $xfer += $output->writeString($this->region);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->udidHash !== null) {
            $xfer += $output->writeFieldBegin('udidHash', TType::STRING, 4);
            $xfer += $output->writeString($this->udidHash);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->deviceInfo !== null) {
            if (!is_object($this->deviceInfo)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('deviceInfo', TType::STRUCT, 5);
            $xfer += $this->deviceInfo->write($output);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}