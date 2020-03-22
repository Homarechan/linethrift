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

class TalkService_commitUpdateProfile_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'seq',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        2 => array(
            'var' => 'attrs',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::I32,
            'elem' => array(
                'type' => TType::I32,
                ),
        ),
        3 => array(
            'var' => 'receiverMids',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
    );

    /**
     * @var int
     */
    public $seq = null;
    /**
     * @var int[]
     */
    public $attrs = null;
    /**
     * @var string[]
     */
    public $receiverMids = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['seq'])) {
                $this->seq = $vals['seq'];
            }
            if (isset($vals['attrs'])) {
                $this->attrs = $vals['attrs'];
            }
            if (isset($vals['receiverMids'])) {
                $this->receiverMids = $vals['receiverMids'];
            }
        }
    }

    public function getName()
    {
        return 'TalkService_commitUpdateProfile_args';
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
                        $xfer += $input->readI32($this->seq);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::LST) {
                        $this->attrs = array();
                        $_size1461 = 0;
                        $_etype1464 = 0;
                        $xfer += $input->readListBegin($_etype1464, $_size1461);
                        for ($_i1465 = 0; $_i1465 < $_size1461; ++$_i1465) {
                            $elem1466 = null;
                            $xfer += $input->readI32($elem1466);
                            $this->attrs []= $elem1466;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::LST) {
                        $this->receiverMids = array();
                        $_size1467 = 0;
                        $_etype1470 = 0;
                        $xfer += $input->readListBegin($_etype1470, $_size1467);
                        for ($_i1471 = 0; $_i1471 < $_size1467; ++$_i1471) {
                            $elem1472 = null;
                            $xfer += $input->readString($elem1472);
                            $this->receiverMids []= $elem1472;
                        }
                        $xfer += $input->readListEnd();
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
        $xfer += $output->writeStructBegin('TalkService_commitUpdateProfile_args');
        if ($this->seq !== null) {
            $xfer += $output->writeFieldBegin('seq', TType::I32, 1);
            $xfer += $output->writeI32($this->seq);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->attrs !== null) {
            if (!is_array($this->attrs)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('attrs', TType::LST, 2);
            $output->writeListBegin(TType::I32, count($this->attrs));
            foreach ($this->attrs as $iter1473) {
                $xfer += $output->writeI32($iter1473);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->receiverMids !== null) {
            if (!is_array($this->receiverMids)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('receiverMids', TType::LST, 3);
            $output->writeListBegin(TType::STRING, count($this->receiverMids));
            foreach ($this->receiverMids as $iter1474) {
                $xfer += $output->writeString($iter1474);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
