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

class TalkService_removeE2EEPublicKey_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'publicKey',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\E2EEPublicKey',
        ),
    );

    /**
     * @var \E2EEPublicKey
     */
    public $publicKey = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['publicKey'])) {
                $this->publicKey = $vals['publicKey'];
            }
        }
    }

    public function getName()
    {
        return 'TalkService_removeE2EEPublicKey_args';
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
                    if ($ftype == TType::STRUCT) {
                        $this->publicKey = new \E2EEPublicKey();
                        $xfer += $this->publicKey->read($input);
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
        $xfer += $output->writeStructBegin('TalkService_removeE2EEPublicKey_args');
        if ($this->publicKey !== null) {
            if (!is_object($this->publicKey)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('publicKey', TType::STRUCT, 2);
            $xfer += $this->publicKey->write($output);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
