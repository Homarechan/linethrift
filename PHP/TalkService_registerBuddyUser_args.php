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

class TalkService_registerBuddyUser_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'buddyId',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'registrarPassword',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $buddyId = null;
    /**
     * @var string
     */
    public $registrarPassword = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['buddyId'])) {
                $this->buddyId = $vals['buddyId'];
            }
            if (isset($vals['registrarPassword'])) {
                $this->registrarPassword = $vals['registrarPassword'];
            }
        }
    }

    public function getName()
    {
        return 'TalkService_registerBuddyUser_args';
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
                        $xfer += $input->readString($this->buddyId);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->registrarPassword);
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
        $xfer += $output->writeStructBegin('TalkService_registerBuddyUser_args');
        if ($this->buddyId !== null) {
            $xfer += $output->writeFieldBegin('buddyId', TType::STRING, 2);
            $xfer += $output->writeString($this->buddyId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->registrarPassword !== null) {
            $xfer += $output->writeFieldBegin('registrarPassword', TType::STRING, 3);
            $xfer += $output->writeString($this->registrarPassword);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
