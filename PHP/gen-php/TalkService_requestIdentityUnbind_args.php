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

class TalkService_requestIdentityUnbind_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        4 => array(
            'var' => 'provider',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        2 => array(
            'var' => 'identifier',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var int
     */
    public $provider = null;
    /**
     * @var string
     */
    public $identifier = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['provider'])) {
                $this->provider = $vals['provider'];
            }
            if (isset($vals['identifier'])) {
                $this->identifier = $vals['identifier'];
            }
        }
    }

    public function getName()
    {
        return 'TalkService_requestIdentityUnbind_args';
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
                case 4:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->provider);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->identifier);
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
        $xfer += $output->writeStructBegin('TalkService_requestIdentityUnbind_args');
        if ($this->identifier !== null) {
            $xfer += $output->writeFieldBegin('identifier', TType::STRING, 2);
            $xfer += $output->writeString($this->identifier);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->provider !== null) {
            $xfer += $output->writeFieldBegin('provider', TType::I32, 4);
            $xfer += $output->writeI32($this->provider);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
