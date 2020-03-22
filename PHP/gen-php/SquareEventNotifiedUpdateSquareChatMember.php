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

class SquareEventNotifiedUpdateSquareChatMember
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'squareChatMid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'squareMemberMid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'squareChatMember',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\SquareChatMember',
        ),
    );

    /**
     * @var string
     */
    public $squareChatMid = null;
    /**
     * @var string
     */
    public $squareMemberMid = null;
    /**
     * @var \SquareChatMember
     */
    public $squareChatMember = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['squareChatMid'])) {
                $this->squareChatMid = $vals['squareChatMid'];
            }
            if (isset($vals['squareMemberMid'])) {
                $this->squareMemberMid = $vals['squareMemberMid'];
            }
            if (isset($vals['squareChatMember'])) {
                $this->squareChatMember = $vals['squareChatMember'];
            }
        }
    }

    public function getName()
    {
        return 'SquareEventNotifiedUpdateSquareChatMember';
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
                        $xfer += $input->readString($this->squareChatMid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->squareMemberMid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRUCT) {
                        $this->squareChatMember = new \SquareChatMember();
                        $xfer += $this->squareChatMember->read($input);
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
        $xfer += $output->writeStructBegin('SquareEventNotifiedUpdateSquareChatMember');
        if ($this->squareChatMid !== null) {
            $xfer += $output->writeFieldBegin('squareChatMid', TType::STRING, 1);
            $xfer += $output->writeString($this->squareChatMid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->squareMemberMid !== null) {
            $xfer += $output->writeFieldBegin('squareMemberMid', TType::STRING, 2);
            $xfer += $output->writeString($this->squareMemberMid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->squareChatMember !== null) {
            if (!is_object($this->squareChatMember)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('squareChatMember', TType::STRUCT, 3);
            $xfer += $this->squareChatMember->write($output);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
