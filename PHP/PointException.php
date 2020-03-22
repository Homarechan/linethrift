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

class PointException extends TException
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'code',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        2 => array(
            'var' => 'reason',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'extra',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::STRING,
            'vtype' => TType::STRING,
            'key' => array(
                'type' => TType::STRING,
            ),
            'val' => array(
                'type' => TType::STRING,
                ),
        ),
    );

    /**
     * @var int
     */
    public $code = null;
    /**
     * @var string
     */
    public $reason = null;
    /**
     * @var array
     */
    public $extra = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['code'])) {
                $this->code = $vals['code'];
            }
            if (isset($vals['reason'])) {
                $this->reason = $vals['reason'];
            }
            if (isset($vals['extra'])) {
                $this->extra = $vals['extra'];
            }
        }
    }

    public function getName()
    {
        return 'PointException';
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
                        $xfer += $input->readI32($this->code);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->reason);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::MAP) {
                        $this->extra = array();
                        $_size942 = 0;
                        $_ktype943 = 0;
                        $_vtype944 = 0;
                        $xfer += $input->readMapBegin($_ktype943, $_vtype944, $_size942);
                        for ($_i946 = 0; $_i946 < $_size942; ++$_i946) {
                            $key947 = '';
                            $val948 = '';
                            $xfer += $input->readString($key947);
                            $xfer += $input->readString($val948);
                            $this->extra[$key947] = $val948;
                        }
                        $xfer += $input->readMapEnd();
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
        $xfer += $output->writeStructBegin('PointException');
        if ($this->code !== null) {
            $xfer += $output->writeFieldBegin('code', TType::I32, 1);
            $xfer += $output->writeI32($this->code);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->reason !== null) {
            $xfer += $output->writeFieldBegin('reason', TType::STRING, 2);
            $xfer += $output->writeString($this->reason);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->extra !== null) {
            if (!is_array($this->extra)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('extra', TType::MAP, 3);
            $output->writeMapBegin(TType::STRING, TType::STRING, count($this->extra));
            foreach ($this->extra as $kiter949 => $viter950) {
                $xfer += $output->writeString($kiter949);
                $xfer += $output->writeString($viter950);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
