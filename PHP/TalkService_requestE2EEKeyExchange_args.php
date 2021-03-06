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

class TalkService_requestE2EEKeyExchange_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'reqSeq',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        2 => array(
            'var' => 'temporalPublicKey',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'publicKey',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\E2EEPublicKey',
        ),
        4 => array(
            'var' => 'verifier',
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
    public $temporalPublicKey = null;
    /**
     * @var \E2EEPublicKey
     */
    public $publicKey = null;
    /**
     * @var string
     */
    public $verifier = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['reqSeq'])) {
                $this->reqSeq = $vals['reqSeq'];
            }
            if (isset($vals['temporalPublicKey'])) {
                $this->temporalPublicKey = $vals['temporalPublicKey'];
            }
            if (isset($vals['publicKey'])) {
                $this->publicKey = $vals['publicKey'];
            }
            if (isset($vals['verifier'])) {
                $this->verifier = $vals['verifier'];
            }
        }
    }

    public function getName()
    {
        return 'TalkService_requestE2EEKeyExchange_args';
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
                        $xfer += $input->readString($this->temporalPublicKey);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRUCT) {
                        $this->publicKey = new \E2EEPublicKey();
                        $xfer += $this->publicKey->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->verifier);
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
        $xfer += $output->writeStructBegin('TalkService_requestE2EEKeyExchange_args');
        if ($this->reqSeq !== null) {
            $xfer += $output->writeFieldBegin('reqSeq', TType::I32, 1);
            $xfer += $output->writeI32($this->reqSeq);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->temporalPublicKey !== null) {
            $xfer += $output->writeFieldBegin('temporalPublicKey', TType::STRING, 2);
            $xfer += $output->writeString($this->temporalPublicKey);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->publicKey !== null) {
            if (!is_object($this->publicKey)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('publicKey', TType::STRUCT, 3);
            $xfer += $this->publicKey->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->verifier !== null) {
            $xfer += $output->writeFieldBegin('verifier', TType::STRING, 4);
            $xfer += $output->writeString($this->verifier);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
