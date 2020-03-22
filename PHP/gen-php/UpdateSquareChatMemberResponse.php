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

class UpdateSquareChatMemberResponse
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'updatedChatMember',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\SquareChatMember',
        ),
    );

    /**
     * @var \SquareChatMember
     */
    public $updatedChatMember = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['updatedChatMember'])) {
                $this->updatedChatMember = $vals['updatedChatMember'];
            }
        }
    }

    public function getName()
    {
        return 'UpdateSquareChatMemberResponse';
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
                    if ($ftype == TType::STRUCT) {
                        $this->updatedChatMember = new \SquareChatMember();
                        $xfer += $this->updatedChatMember->read($input);
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
        $xfer += $output->writeStructBegin('UpdateSquareChatMemberResponse');
        if ($this->updatedChatMember !== null) {
            if (!is_object($this->updatedChatMember)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('updatedChatMember', TType::STRUCT, 1);
            $xfer += $this->updatedChatMember->write($output);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}