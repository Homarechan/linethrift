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

class TalkService_findAndAddContactsByEmail_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'reqSeq',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        2 => array(
            'var' => 'emails',
            'isRequired' => false,
            'type' => TType::SET,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
    );

    /**
     * @var int
     */
    public $reqSeq = null;
    /**
     * @var string[]
     */
    public $emails = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['reqSeq'])) {
                $this->reqSeq = $vals['reqSeq'];
            }
            if (isset($vals['emails'])) {
                $this->emails = $vals['emails'];
            }
        }
    }

    public function getName()
    {
        return 'TalkService_findAndAddContactsByEmail_args';
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
                    if ($ftype == TType::SET) {
                        $this->emails = array();
                        $_size1526 = 0;
                        $_etype1529 = 0;
                        $xfer += $input->readSetBegin($_etype1529, $_size1526);
                        for ($_i1530 = 0; $_i1530 < $_size1526; ++$_i1530) {
                            $elem1531 = null;
                            $xfer += $input->readString($elem1531);
                            $this->emails[$elem1531] = true;
                        }
                        $xfer += $input->readSetEnd();
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
        $xfer += $output->writeStructBegin('TalkService_findAndAddContactsByEmail_args');
        if ($this->reqSeq !== null) {
            $xfer += $output->writeFieldBegin('reqSeq', TType::I32, 1);
            $xfer += $output->writeI32($this->reqSeq);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->emails !== null) {
            if (!is_array($this->emails)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('emails', TType::SET, 2);
            $output->writeSetBegin(TType::STRING, count($this->emails));
            foreach ($this->emails as $iter1532 => $iter1533) {
                $xfer += $output->writeString($iter1532);
            }
            $output->writeSetEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
