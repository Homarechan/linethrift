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

class TalkService_reportSpammer_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'spammerMid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'spammerReasons',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::I32,
            'elem' => array(
                'type' => TType::I32,
                ),
        ),
        4 => array(
            'var' => 'spamMessageIds',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
    );

    /**
     * @var string
     */
    public $spammerMid = null;
    /**
     * @var int[]
     */
    public $spammerReasons = null;
    /**
     * @var string[]
     */
    public $spamMessageIds = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['spammerMid'])) {
                $this->spammerMid = $vals['spammerMid'];
            }
            if (isset($vals['spammerReasons'])) {
                $this->spammerReasons = $vals['spammerReasons'];
            }
            if (isset($vals['spamMessageIds'])) {
                $this->spamMessageIds = $vals['spamMessageIds'];
            }
        }
    }

    public function getName()
    {
        return 'TalkService_reportSpammer_args';
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
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->spammerMid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::LST) {
                        $this->spammerReasons = array();
                        $_size1961 = 0;
                        $_etype1964 = 0;
                        $xfer += $input->readListBegin($_etype1964, $_size1961);
                        for ($_i1965 = 0; $_i1965 < $_size1961; ++$_i1965) {
                            $elem1966 = null;
                            $xfer += $input->readI32($elem1966);
                            $this->spammerReasons []= $elem1966;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::LST) {
                        $this->spamMessageIds = array();
                        $_size1967 = 0;
                        $_etype1970 = 0;
                        $xfer += $input->readListBegin($_etype1970, $_size1967);
                        for ($_i1971 = 0; $_i1971 < $_size1967; ++$_i1971) {
                            $elem1972 = null;
                            $xfer += $input->readString($elem1972);
                            $this->spamMessageIds []= $elem1972;
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
        $xfer += $output->writeStructBegin('TalkService_reportSpammer_args');
        if ($this->spammerMid !== null) {
            $xfer += $output->writeFieldBegin('spammerMid', TType::STRING, 2);
            $xfer += $output->writeString($this->spammerMid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->spammerReasons !== null) {
            if (!is_array($this->spammerReasons)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('spammerReasons', TType::LST, 3);
            $output->writeListBegin(TType::I32, count($this->spammerReasons));
            foreach ($this->spammerReasons as $iter1973) {
                $xfer += $output->writeI32($iter1973);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->spamMessageIds !== null) {
            if (!is_array($this->spamMessageIds)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('spamMessageIds', TType::LST, 4);
            $output->writeListBegin(TType::STRING, count($this->spamMessageIds));
            foreach ($this->spamMessageIds as $iter1974) {
                $xfer += $output->writeString($iter1974);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
