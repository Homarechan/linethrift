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

class BuddyManagementService_unblockBuddyMember_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'requestId',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'mid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $requestId = null;
    /**
     * @var string
     */
    public $mid = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['requestId'])) {
                $this->requestId = $vals['requestId'];
            }
            if (isset($vals['mid'])) {
                $this->mid = $vals['mid'];
            }
        }
    }

    public function getName()
    {
        return 'BuddyManagementService_unblockBuddyMember_args';
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
                        $xfer += $input->readString($this->requestId);
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
        $xfer += $output->writeStructBegin('BuddyManagementService_unblockBuddyMember_args');
        if ($this->requestId !== null) {
            $xfer += $output->writeFieldBegin('requestId', TType::STRING, 1);
            $xfer += $output->writeString($this->requestId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->mid !== null) {
            $xfer += $output->writeFieldBegin('mid', TType::STRING, 2);
            $xfer += $output->writeString($this->mid);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
