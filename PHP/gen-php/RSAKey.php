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

class RSAKey
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'keynm',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'nvalue',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'evalue',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'sessionKey',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $keynm = null;
    /**
     * @var string
     */
    public $nvalue = null;
    /**
     * @var string
     */
    public $evalue = null;
    /**
     * @var string
     */
    public $sessionKey = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['keynm'])) {
                $this->keynm = $vals['keynm'];
            }
            if (isset($vals['nvalue'])) {
                $this->nvalue = $vals['nvalue'];
            }
            if (isset($vals['evalue'])) {
                $this->evalue = $vals['evalue'];
            }
            if (isset($vals['sessionKey'])) {
                $this->sessionKey = $vals['sessionKey'];
            }
        }
    }

    public function getName()
    {
        return 'RSAKey';
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
                        $xfer += $input->readString($this->keynm);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->nvalue);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->evalue);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->sessionKey);
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
        $xfer += $output->writeStructBegin('RSAKey');
        if ($this->keynm !== null) {
            $xfer += $output->writeFieldBegin('keynm', TType::STRING, 1);
            $xfer += $output->writeString($this->keynm);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->nvalue !== null) {
            $xfer += $output->writeFieldBegin('nvalue', TType::STRING, 2);
            $xfer += $output->writeString($this->nvalue);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->evalue !== null) {
            $xfer += $output->writeFieldBegin('evalue', TType::STRING, 3);
            $xfer += $output->writeString($this->evalue);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->sessionKey !== null) {
            $xfer += $output->writeFieldBegin('sessionKey', TType::STRING, 4);
            $xfer += $output->writeString($this->sessionKey);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
