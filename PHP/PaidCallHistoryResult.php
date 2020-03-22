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

class PaidCallHistoryResult
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'historys',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\PaidCallHistory',
                ),
        ),
        2 => array(
            'var' => 'hasNext',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
    );

    /**
     * @var \PaidCallHistory[]
     */
    public $historys = null;
    /**
     * @var bool
     */
    public $hasNext = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['historys'])) {
                $this->historys = $vals['historys'];
            }
            if (isset($vals['hasNext'])) {
                $this->hasNext = $vals['hasNext'];
            }
        }
    }

    public function getName()
    {
        return 'PaidCallHistoryResult';
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
                    if ($ftype == TType::LST) {
                        $this->historys = array();
                        $_size29 = 0;
                        $_etype32 = 0;
                        $xfer += $input->readListBegin($_etype32, $_size29);
                        for ($_i33 = 0; $_i33 < $_size29; ++$_i33) {
                            $elem34 = null;
                            $elem34 = new \PaidCallHistory();
                            $xfer += $elem34->read($input);
                            $this->historys []= $elem34;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->hasNext);
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
        $xfer += $output->writeStructBegin('PaidCallHistoryResult');
        if ($this->historys !== null) {
            if (!is_array($this->historys)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('historys', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->historys));
            foreach ($this->historys as $iter35) {
                $xfer += $iter35->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->hasNext !== null) {
            $xfer += $output->writeFieldBegin('hasNext', TType::BOOL, 2);
            $xfer += $output->writeBool($this->hasNext);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
