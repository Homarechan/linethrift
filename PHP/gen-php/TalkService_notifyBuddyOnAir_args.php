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

class TalkService_notifyBuddyOnAir_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'seq',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        2 => array(
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
     * @var string[]
     */
    public $receiverMids = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['seq'])) {
                $this->seq = $vals['seq'];
            }
            if (isset($vals['receiverMids'])) {
                $this->receiverMids = $vals['receiverMids'];
            }
        }
    }

    public function getName()
    {
        return 'TalkService_notifyBuddyOnAir_args';
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
                        $this->receiverMids = array();
                        $_size1861 = 0;
                        $_etype1864 = 0;
                        $xfer += $input->readListBegin($_etype1864, $_size1861);
                        for ($_i1865 = 0; $_i1865 < $_size1861; ++$_i1865) {
                            $elem1866 = null;
                            $xfer += $input->readString($elem1866);
                            $this->receiverMids []= $elem1866;
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
        $xfer += $output->writeStructBegin('TalkService_notifyBuddyOnAir_args');
        if ($this->seq !== null) {
            $xfer += $output->writeFieldBegin('seq', TType::I32, 1);
            $xfer += $output->writeI32($this->seq);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->receiverMids !== null) {
            if (!is_array($this->receiverMids)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('receiverMids', TType::LST, 2);
            $output->writeListBegin(TType::STRING, count($this->receiverMids));
            foreach ($this->receiverMids as $iter1867) {
                $xfer += $output->writeString($iter1867);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
