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

class TalkService_sendChatChecked_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'seq',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        2 => array(
            'var' => 'consumer',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'lastMessageId',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var int
     */
    public $seq = null;
    /**
     * @var string
     */
    public $consumer = null;
    /**
     * @var string
     */
    public $lastMessageId = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['seq'])) {
                $this->seq = $vals['seq'];
            }
            if (isset($vals['consumer'])) {
                $this->consumer = $vals['consumer'];
            }
            if (isset($vals['lastMessageId'])) {
                $this->lastMessageId = $vals['lastMessageId'];
            }
        }
    }

    public function getName()
    {
        return 'TalkService_sendChatChecked_args';
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
                        $xfer += $input->readString($this->consumer);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->lastMessageId);
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
        $xfer += $output->writeStructBegin('TalkService_sendChatChecked_args');
        if ($this->seq !== null) {
            $xfer += $output->writeFieldBegin('seq', TType::I32, 1);
            $xfer += $output->writeI32($this->seq);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->consumer !== null) {
            $xfer += $output->writeFieldBegin('consumer', TType::STRING, 2);
            $xfer += $output->writeString($this->consumer);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->lastMessageId !== null) {
            $xfer += $output->writeFieldBegin('lastMessageId', TType::STRING, 3);
            $xfer += $output->writeString($this->lastMessageId);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
