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

class TalkService_getWapInvitation_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'invitationHash',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $invitationHash = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['invitationHash'])) {
                $this->invitationHash = $vals['invitationHash'];
            }
        }
    }

    public function getName()
    {
        return 'TalkService_getWapInvitation_args';
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
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->invitationHash);
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
        $xfer += $output->writeStructBegin('TalkService_getWapInvitation_args');
        if ($this->invitationHash !== null) {
            $xfer += $output->writeFieldBegin('invitationHash', TType::STRING, 2);
            $xfer += $output->writeString($this->invitationHash);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
