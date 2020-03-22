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

class TalkService_getMessagesBySequenceNumber_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'channelId',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'messageBoxId',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'startSeq',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        5 => array(
            'var' => 'endSeq',
            'isRequired' => false,
            'type' => TType::I64,
        ),
    );

    /**
     * @var string
     */
    public $channelId = null;
    /**
     * @var string
     */
    public $messageBoxId = null;
    /**
     * @var int
     */
    public $startSeq = null;
    /**
     * @var int
     */
    public $endSeq = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['channelId'])) {
                $this->channelId = $vals['channelId'];
            }
            if (isset($vals['messageBoxId'])) {
                $this->messageBoxId = $vals['messageBoxId'];
            }
            if (isset($vals['startSeq'])) {
                $this->startSeq = $vals['startSeq'];
            }
            if (isset($vals['endSeq'])) {
                $this->endSeq = $vals['endSeq'];
            }
        }
    }

    public function getName()
    {
        return 'TalkService_getMessagesBySequenceNumber_args';
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
                        $xfer += $input->readString($this->channelId);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->messageBoxId);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->startSeq);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->endSeq);
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
        $xfer += $output->writeStructBegin('TalkService_getMessagesBySequenceNumber_args');
        if ($this->channelId !== null) {
            $xfer += $output->writeFieldBegin('channelId', TType::STRING, 2);
            $xfer += $output->writeString($this->channelId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->messageBoxId !== null) {
            $xfer += $output->writeFieldBegin('messageBoxId', TType::STRING, 3);
            $xfer += $output->writeString($this->messageBoxId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->startSeq !== null) {
            $xfer += $output->writeFieldBegin('startSeq', TType::I64, 4);
            $xfer += $output->writeI64($this->startSeq);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->endSeq !== null) {
            $xfer += $output->writeFieldBegin('endSeq', TType::I64, 5);
            $xfer += $output->writeI64($this->endSeq);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
