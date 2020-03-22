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

class SquareChatStatusWithoutMessage
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'memberCount',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        2 => array(
            'var' => 'unreadMessageCount',
            'isRequired' => false,
            'type' => TType::I32,
        ),
    );

    /**
     * @var int
     */
    public $memberCount = null;
    /**
     * @var int
     */
    public $unreadMessageCount = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['memberCount'])) {
                $this->memberCount = $vals['memberCount'];
            }
            if (isset($vals['unreadMessageCount'])) {
                $this->unreadMessageCount = $vals['unreadMessageCount'];
            }
        }
    }

    public function getName()
    {
        return 'SquareChatStatusWithoutMessage';
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
                        $xfer += $input->readI32($this->memberCount);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->unreadMessageCount);
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
        $xfer += $output->writeStructBegin('SquareChatStatusWithoutMessage');
        if ($this->memberCount !== null) {
            $xfer += $output->writeFieldBegin('memberCount', TType::I32, 1);
            $xfer += $output->writeI32($this->memberCount);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->unreadMessageCount !== null) {
            $xfer += $output->writeFieldBegin('unreadMessageCount', TType::I32, 2);
            $xfer += $output->writeI32($this->unreadMessageCount);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
