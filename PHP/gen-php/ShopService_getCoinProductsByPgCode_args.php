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

class ShopService_getCoinProductsByPgCode_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'appStoreCode',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        3 => array(
            'var' => 'pgCode',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        4 => array(
            'var' => 'country',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        5 => array(
            'var' => 'language',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var int
     */
    public $appStoreCode = null;
    /**
     * @var int
     */
    public $pgCode = null;
    /**
     * @var string
     */
    public $country = null;
    /**
     * @var string
     */
    public $language = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['appStoreCode'])) {
                $this->appStoreCode = $vals['appStoreCode'];
            }
            if (isset($vals['pgCode'])) {
                $this->pgCode = $vals['pgCode'];
            }
            if (isset($vals['country'])) {
                $this->country = $vals['country'];
            }
            if (isset($vals['language'])) {
                $this->language = $vals['language'];
            }
        }
    }

    public function getName()
    {
        return 'ShopService_getCoinProductsByPgCode_args';
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
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->appStoreCode);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->pgCode);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->country);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->language);
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
        $xfer += $output->writeStructBegin('ShopService_getCoinProductsByPgCode_args');
        if ($this->appStoreCode !== null) {
            $xfer += $output->writeFieldBegin('appStoreCode', TType::I32, 2);
            $xfer += $output->writeI32($this->appStoreCode);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->pgCode !== null) {
            $xfer += $output->writeFieldBegin('pgCode', TType::I32, 3);
            $xfer += $output->writeI32($this->pgCode);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->country !== null) {
            $xfer += $output->writeFieldBegin('country', TType::STRING, 4);
            $xfer += $output->writeString($this->country);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->language !== null) {
            $xfer += $output->writeFieldBegin('language', TType::STRING, 5);
            $xfer += $output->writeString($this->language);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
