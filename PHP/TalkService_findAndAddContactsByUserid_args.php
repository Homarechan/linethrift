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

class TalkService_findAndAddContactsByUserid_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'reqSeq',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        2 => array(
            'var' => 'userid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var int
     */
    public $reqSeq = null;
    /**
     * @var string
     */
    public $userid = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['reqSeq'])) {
                $this->reqSeq = $vals['reqSeq'];
            }
            if (isset($vals['userid'])) {
                $this->userid = $vals['userid'];
            }
        }
    }

    public function getName()
    {
        return 'TalkService_findAndAddContactsByUserid_args';
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
                        $xfer += $input->readI32($this->reqSeq);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->userid);
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
        $xfer += $output->writeStructBegin('TalkService_findAndAddContactsByUserid_args');
        if ($this->reqSeq !== null) {
            $xfer += $output->writeFieldBegin('reqSeq', TType::I32, 1);
            $xfer += $output->writeI32($this->reqSeq);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->userid !== null) {
            $xfer += $output->writeFieldBegin('userid', TType::STRING, 2);
            $xfer += $output->writeString($this->userid);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
