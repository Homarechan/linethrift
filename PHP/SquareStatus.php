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

class SquareStatus
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'memberCount',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        2 => array(
            'var' => 'joinRequestCount',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        3 => array(
            'var' => 'lastJoinRequestAt',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        4 => array(
            'var' => 'openChatCount',
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
    public $joinRequestCount = null;
    /**
     * @var int
     */
    public $lastJoinRequestAt = null;
    /**
     * @var int
     */
    public $openChatCount = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['memberCount'])) {
                $this->memberCount = $vals['memberCount'];
            }
            if (isset($vals['joinRequestCount'])) {
                $this->joinRequestCount = $vals['joinRequestCount'];
            }
            if (isset($vals['lastJoinRequestAt'])) {
                $this->lastJoinRequestAt = $vals['lastJoinRequestAt'];
            }
            if (isset($vals['openChatCount'])) {
                $this->openChatCount = $vals['openChatCount'];
            }
        }
    }

    public function getName()
    {
        return 'SquareStatus';
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
                        $xfer += $input->readI32($this->joinRequestCount);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->lastJoinRequestAt);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->openChatCount);
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
        $xfer += $output->writeStructBegin('SquareStatus');
        if ($this->memberCount !== null) {
            $xfer += $output->writeFieldBegin('memberCount', TType::I32, 1);
            $xfer += $output->writeI32($this->memberCount);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->joinRequestCount !== null) {
            $xfer += $output->writeFieldBegin('joinRequestCount', TType::I32, 2);
            $xfer += $output->writeI32($this->joinRequestCount);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->lastJoinRequestAt !== null) {
            $xfer += $output->writeFieldBegin('lastJoinRequestAt', TType::I64, 3);
            $xfer += $output->writeI64($this->lastJoinRequestAt);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->openChatCount !== null) {
            $xfer += $output->writeFieldBegin('openChatCount', TType::I32, 4);
            $xfer += $output->writeI32($this->openChatCount);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
