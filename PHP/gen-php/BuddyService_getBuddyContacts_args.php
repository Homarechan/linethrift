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

class BuddyService_getBuddyContacts_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'language',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'country',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'classification',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        5 => array(
            'var' => 'fromIndex',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        6 => array(
            'var' => 'count',
            'isRequired' => false,
            'type' => TType::I32,
        ),
    );

    /**
     * @var string
     */
    public $language = null;
    /**
     * @var string
     */
    public $country = null;
    /**
     * @var string
     */
    public $classification = null;
    /**
     * @var int
     */
    public $fromIndex = null;
    /**
     * @var int
     */
    public $count = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['language'])) {
                $this->language = $vals['language'];
            }
            if (isset($vals['country'])) {
                $this->country = $vals['country'];
            }
            if (isset($vals['classification'])) {
                $this->classification = $vals['classification'];
            }
            if (isset($vals['fromIndex'])) {
                $this->fromIndex = $vals['fromIndex'];
            }
            if (isset($vals['count'])) {
                $this->count = $vals['count'];
            }
        }
    }

    public function getName()
    {
        return 'BuddyService_getBuddyContacts_args';
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
                        $xfer += $input->readString($this->language);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->country);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->classification);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->fromIndex);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->count);
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
        $xfer += $output->writeStructBegin('BuddyService_getBuddyContacts_args');
        if ($this->language !== null) {
            $xfer += $output->writeFieldBegin('language', TType::STRING, 2);
            $xfer += $output->writeString($this->language);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->country !== null) {
            $xfer += $output->writeFieldBegin('country', TType::STRING, 3);
            $xfer += $output->writeString($this->country);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->classification !== null) {
            $xfer += $output->writeFieldBegin('classification', TType::STRING, 4);
            $xfer += $output->writeString($this->classification);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->fromIndex !== null) {
            $xfer += $output->writeFieldBegin('fromIndex', TType::I32, 5);
            $xfer += $output->writeI32($this->fromIndex);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->count !== null) {
            $xfer += $output->writeFieldBegin('count', TType::I32, 6);
            $xfer += $output->writeI32($this->count);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
