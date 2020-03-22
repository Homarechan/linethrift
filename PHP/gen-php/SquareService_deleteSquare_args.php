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

class SquareService_deleteSquare_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'request',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\DeleteSquareRequest',
        ),
    );

    /**
     * @var \DeleteSquareRequest
     */
    public $request = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['request'])) {
                $this->request = $vals['request'];
            }
        }
    }

    public function getName()
    {
        return 'SquareService_deleteSquare_args';
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
                    if ($ftype == TType::STRUCT) {
                        $this->request = new \DeleteSquareRequest();
                        $xfer += $this->request->read($input);
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
        $xfer += $output->writeStructBegin('SquareService_deleteSquare_args');
        if ($this->request !== null) {
            if (!is_object($this->request)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('request', TType::STRUCT, 1);
            $xfer += $this->request->write($output);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
