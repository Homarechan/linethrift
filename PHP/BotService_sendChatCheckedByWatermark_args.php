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

class BotService_sendChatCheckedByWatermark_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'seq',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        2 => array(
            'var' => 'mid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'watermark',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        4 => array(
            'var' => 'sessionId',
            'isRequired' => false,
            'type' => TType::BYTE,
        ),
    );

    /**
     * @var int
     */
    public $seq = null;
    /**
     * @var string
     */
    public $mid = null;
    /**
     * @var int
     */
    public $watermark = null;
    /**
     * @var int
     */
    public $sessionId = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['seq'])) {
                $this->seq = $vals['seq'];
            }
            if (isset($vals['mid'])) {
                $this->mid = $vals['mid'];
            }
            if (isset($vals['watermark'])) {
                $this->watermark = $vals['watermark'];
            }
            if (isset($vals['sessionId'])) {
                $this->sessionId = $vals['sessionId'];
            }
        }
    }

    public function getName()
    {
        return 'BotService_sendChatCheckedByWatermark_args';
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
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->seq);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->mid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->watermark);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::BYTE) {
                        $xfer += $input->readByte($this->sessionId);
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
        $xfer += $output->writeStructBegin('BotService_sendChatCheckedByWatermark_args');
        if ($this->seq !== null) {
            $xfer += $output->writeFieldBegin('seq', TType::I32, 1);
            $xfer += $output->writeI32($this->seq);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->mid !== null) {
            $xfer += $output->writeFieldBegin('mid', TType::STRING, 2);
            $xfer += $output->writeString($this->mid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->watermark !== null) {
            $xfer += $output->writeFieldBegin('watermark', TType::I64, 3);
            $xfer += $output->writeI64($this->watermark);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->sessionId !== null) {
            $xfer += $output->writeFieldBegin('sessionId', TType::BYTE, 4);
            $xfer += $output->writeByte($this->sessionId);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
