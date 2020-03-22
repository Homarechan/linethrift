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

class TextMessageAnnouncementContents
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'messageId',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'text',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'senderSquareMemberMid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'createdAt',
            'isRequired' => false,
            'type' => TType::I64,
        ),
    );

    /**
     * @var string
     */
    public $messageId = null;
    /**
     * @var string
     */
    public $text = null;
    /**
     * @var string
     */
    public $senderSquareMemberMid = null;
    /**
     * @var int
     */
    public $createdAt = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['messageId'])) {
                $this->messageId = $vals['messageId'];
            }
            if (isset($vals['text'])) {
                $this->text = $vals['text'];
            }
            if (isset($vals['senderSquareMemberMid'])) {
                $this->senderSquareMemberMid = $vals['senderSquareMemberMid'];
            }
            if (isset($vals['createdAt'])) {
                $this->createdAt = $vals['createdAt'];
            }
        }
    }

    public function getName()
    {
        return 'TextMessageAnnouncementContents';
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
                        $xfer += $input->readString($this->messageId);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->text);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->senderSquareMemberMid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->createdAt);
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
        $xfer += $output->writeStructBegin('TextMessageAnnouncementContents');
        if ($this->messageId !== null) {
            $xfer += $output->writeFieldBegin('messageId', TType::STRING, 1);
            $xfer += $output->writeString($this->messageId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->text !== null) {
            $xfer += $output->writeFieldBegin('text', TType::STRING, 2);
            $xfer += $output->writeString($this->text);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->senderSquareMemberMid !== null) {
            $xfer += $output->writeFieldBegin('senderSquareMemberMid', TType::STRING, 3);
            $xfer += $output->writeString($this->senderSquareMemberMid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->createdAt !== null) {
            $xfer += $output->writeFieldBegin('createdAt', TType::I64, 4);
            $xfer += $output->writeI64($this->createdAt);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
