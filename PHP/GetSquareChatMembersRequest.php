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

class GetSquareChatMembersRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'squareChatMid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'continuationToken',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'limit',
            'isRequired' => false,
            'type' => TType::I32,
        ),
    );

    /**
     * @var string
     */
    public $squareChatMid = null;
    /**
     * @var string
     */
    public $continuationToken = null;
    /**
     * @var int
     */
    public $limit = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['squareChatMid'])) {
                $this->squareChatMid = $vals['squareChatMid'];
            }
            if (isset($vals['continuationToken'])) {
                $this->continuationToken = $vals['continuationToken'];
            }
            if (isset($vals['limit'])) {
                $this->limit = $vals['limit'];
            }
        }
    }

    public function getName()
    {
        return 'GetSquareChatMembersRequest';
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
                        $xfer += $input->readString($this->continuationToken);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->limit);
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
        $xfer += $output->writeStructBegin('GetSquareChatMembersRequest');
        if ($this->squareChatMid !== null) {
            $xfer += $output->writeFieldBegin('squareChatMid', TType::STRING, 1);
            $xfer += $output->writeString($this->squareChatMid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->continuationToken !== null) {
            $xfer += $output->writeFieldBegin('continuationToken', TType::STRING, 2);
            $xfer += $output->writeString($this->continuationToken);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->limit !== null) {
            $xfer += $output->writeFieldBegin('limit', TType::I32, 3);
            $xfer += $output->writeI32($this->limit);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
