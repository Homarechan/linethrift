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

class RequestTokenResponse
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'requestToken',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'returnUrl',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $requestToken = null;
    /**
     * @var string
     */
    public $returnUrl = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['requestToken'])) {
                $this->requestToken = $vals['requestToken'];
            }
            if (isset($vals['returnUrl'])) {
                $this->returnUrl = $vals['returnUrl'];
            }
        }
    }

    public function getName()
    {
        return 'RequestTokenResponse';
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
                        $xfer += $input->readString($this->requestToken);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->returnUrl);
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
        $xfer += $output->writeStructBegin('RequestTokenResponse');
        if ($this->requestToken !== null) {
            $xfer += $output->writeFieldBegin('requestToken', TType::STRING, 1);
            $xfer += $output->writeString($this->requestToken);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->returnUrl !== null) {
            $xfer += $output->writeFieldBegin('returnUrl', TType::STRING, 2);
            $xfer += $output->writeString($this->returnUrl);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
