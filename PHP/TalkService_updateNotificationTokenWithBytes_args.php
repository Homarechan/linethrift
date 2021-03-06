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

class TalkService_updateNotificationTokenWithBytes_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        3 => array(
            'var' => 'type',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        2 => array(
            'var' => 'token',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var int
     */
    public $type = null;
    /**
     * @var string
     */
    public $token = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['type'])) {
                $this->type = $vals['type'];
            }
            if (isset($vals['token'])) {
                $this->token = $vals['token'];
            }
        }
    }

    public function getName()
    {
        return 'TalkService_updateNotificationTokenWithBytes_args';
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
                case 3:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->type);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->token);
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
        $xfer += $output->writeStructBegin('TalkService_updateNotificationTokenWithBytes_args');
        if ($this->token !== null) {
            $xfer += $output->writeFieldBegin('token', TType::STRING, 2);
            $xfer += $output->writeString($this->token);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->type !== null) {
            $xfer += $output->writeFieldBegin('type', TType::I32, 3);
            $xfer += $output->writeI32($this->type);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
