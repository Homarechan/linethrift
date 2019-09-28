<?php
/**
 * Autogenerated by Thrift Compiler (0.13.0)
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

class SpotItem
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'phone',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'category',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        5 => array(
            'var' => 'mid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        6 => array(
            'var' => 'countryAreaCode',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        10 => array(
            'var' => 'freePhoneCallable',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
    );

    /**
     * @var string
     */
    public $name = null;
    /**
     * @var string
     */
    public $phone = null;
    /**
     * @var int
     */
    public $category = null;
    /**
     * @var string
     */
    public $mid = null;
    /**
     * @var string
     */
    public $countryAreaCode = null;
    /**
     * @var bool
     */
    public $freePhoneCallable = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['name'])) {
                $this->name = $vals['name'];
            }
            if (isset($vals['phone'])) {
                $this->phone = $vals['phone'];
            }
            if (isset($vals['category'])) {
                $this->category = $vals['category'];
            }
            if (isset($vals['mid'])) {
                $this->mid = $vals['mid'];
            }
            if (isset($vals['countryAreaCode'])) {
                $this->countryAreaCode = $vals['countryAreaCode'];
            }
            if (isset($vals['freePhoneCallable'])) {
                $this->freePhoneCallable = $vals['freePhoneCallable'];
            }
        }
    }

    public function getName()
    {
        return 'SpotItem';
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
                        $xfer += $input->readString($this->name);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->phone);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->category);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->mid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->countryAreaCode);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 10:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->freePhoneCallable);
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
        $xfer += $output->writeStructBegin('SpotItem');
        if ($this->name !== null) {
            $xfer += $output->writeFieldBegin('name', TType::STRING, 2);
            $xfer += $output->writeString($this->name);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->phone !== null) {
            $xfer += $output->writeFieldBegin('phone', TType::STRING, 3);
            $xfer += $output->writeString($this->phone);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->category !== null) {
            $xfer += $output->writeFieldBegin('category', TType::I32, 4);
            $xfer += $output->writeI32($this->category);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->mid !== null) {
            $xfer += $output->writeFieldBegin('mid', TType::STRING, 5);
            $xfer += $output->writeString($this->mid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->countryAreaCode !== null) {
            $xfer += $output->writeFieldBegin('countryAreaCode', TType::STRING, 6);
            $xfer += $output->writeString($this->countryAreaCode);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->freePhoneCallable !== null) {
            $xfer += $output->writeFieldBegin('freePhoneCallable', TType::BOOL, 10);
            $xfer += $output->writeBool($this->freePhoneCallable);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}