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

class GetSquareChatMembersResponse
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'squareChatMembers',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\SquareMember',
        ),
        2 => array(
            'var' => 'continuationToken',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var \SquareMember
     */
    public $squareChatMembers = null;
    /**
     * @var string
     */
    public $continuationToken = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['squareChatMembers'])) {
                $this->squareChatMembers = $vals['squareChatMembers'];
            }
            if (isset($vals['continuationToken'])) {
                $this->continuationToken = $vals['continuationToken'];
            }
        }
    }

    public function getName()
    {
        return 'GetSquareChatMembersResponse';
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
                        $this->squareChatMembers = new \SquareMember();
                        $xfer += $this->squareChatMembers->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->continuationToken);
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
        $xfer += $output->writeStructBegin('GetSquareChatMembersResponse');
        if ($this->squareChatMembers !== null) {
            if (!is_object($this->squareChatMembers)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('squareChatMembers', TType::STRUCT, 1);
            $xfer += $this->squareChatMembers->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->continuationToken !== null) {
            $xfer += $output->writeFieldBegin('continuationToken', TType::STRING, 2);
            $xfer += $output->writeString($this->continuationToken);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
