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

class PaidCallAdCountry
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'countryCode',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'rateDivision',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $countryCode = null;
    /**
     * @var string
     */
    public $rateDivision = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['countryCode'])) {
                $this->countryCode = $vals['countryCode'];
            }
            if (isset($vals['rateDivision'])) {
                $this->rateDivision = $vals['rateDivision'];
            }
        }
    }

    public function getName()
    {
        return 'PaidCallAdCountry';
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
                case 1:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->countryCode);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->rateDivision);
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
        $xfer += $output->writeStructBegin('PaidCallAdCountry');
        if ($this->countryCode !== null) {
            $xfer += $output->writeFieldBegin('countryCode', TType::STRING, 1);
            $xfer += $output->writeString($this->countryCode);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->rateDivision !== null) {
            $xfer += $output->writeFieldBegin('rateDivision', TType::STRING, 2);
            $xfer += $output->writeString($this->rateDivision);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
