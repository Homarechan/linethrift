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

class SpotService_lookupByPhoneNumber_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'countryAreaCode',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'phoneNumber',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $countryAreaCode = null;
    /**
     * @var string
     */
    public $phoneNumber = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['countryAreaCode'])) {
                $this->countryAreaCode = $vals['countryAreaCode'];
            }
            if (isset($vals['phoneNumber'])) {
                $this->phoneNumber = $vals['phoneNumber'];
            }
        }
    }

    public function getName()
    {
        return 'SpotService_lookupByPhoneNumber_args';
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
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->countryAreaCode);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->phoneNumber);
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
        $xfer += $output->writeStructBegin('SpotService_lookupByPhoneNumber_args');
        if ($this->countryAreaCode !== null) {
            $xfer += $output->writeFieldBegin('countryAreaCode', TType::STRING, 2);
            $xfer += $output->writeString($this->countryAreaCode);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->phoneNumber !== null) {
            $xfer += $output->writeFieldBegin('phoneNumber', TType::STRING, 3);
            $xfer += $output->writeString($this->phoneNumber);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
