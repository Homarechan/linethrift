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

class TalkService_reportSpam_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'chatMid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'memberMids',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
        4 => array(
            'var' => 'spammerReasons',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::I32,
            'elem' => array(
                'type' => TType::I32,
                ),
        ),
        5 => array(
            'var' => 'senderMids',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
        6 => array(
            'var' => 'spamMessageIds',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
        7 => array(
            'var' => 'spamMessages',
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
    public $chatMid = null;
    /**
     * @var string[]
     */
    public $memberMids = null;
    /**
     * @var int[]
     */
    public $spammerReasons = null;
    /**
     * @var string[]
     */
    public $senderMids = null;
    /**
     * @var string[]
     */
    public $spamMessageIds = null;
    /**
     * @var string[]
     */
    public $spamMessages = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['chatMid'])) {
                $this->chatMid = $vals['chatMid'];
            }
            if (isset($vals['memberMids'])) {
                $this->memberMids = $vals['memberMids'];
            }
            if (isset($vals['spammerReasons'])) {
                $this->spammerReasons = $vals['spammerReasons'];
            }
            if (isset($vals['senderMids'])) {
                $this->senderMids = $vals['senderMids'];
            }
            if (isset($vals['spamMessageIds'])) {
                $this->spamMessageIds = $vals['spamMessageIds'];
            }
            if (isset($vals['spamMessages'])) {
                $this->spamMessages = $vals['spamMessages'];
            }
        }
    }

    public function getName()
    {
        return 'TalkService_reportSpam_args';
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
                        $xfer += $input->readString($this->chatMid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::LST) {
                        $this->memberMids = array();
                        $_size1926 = 0;
                        $_etype1929 = 0;
                        $xfer += $input->readListBegin($_etype1929, $_size1926);
                        for ($_i1930 = 0; $_i1930 < $_size1926; ++$_i1930) {
                            $elem1931 = null;
                            $xfer += $input->readString($elem1931);
                            $this->memberMids []= $elem1931;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::LST) {
                        $this->spammerReasons = array();
                        $_size1932 = 0;
                        $_etype1935 = 0;
                        $xfer += $input->readListBegin($_etype1935, $_size1932);
                        for ($_i1936 = 0; $_i1936 < $_size1932; ++$_i1936) {
                            $elem1937 = null;
                            $xfer += $input->readI32($elem1937);
                            $this->spammerReasons []= $elem1937;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::LST) {
                        $this->senderMids = array();
                        $_size1938 = 0;
                        $_etype1941 = 0;
                        $xfer += $input->readListBegin($_etype1941, $_size1938);
                        for ($_i1942 = 0; $_i1942 < $_size1938; ++$_i1942) {
                            $elem1943 = null;
                            $xfer += $input->readString($elem1943);
                            $this->senderMids []= $elem1943;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::LST) {
                        $this->spamMessageIds = array();
                        $_size1944 = 0;
                        $_etype1947 = 0;
                        $xfer += $input->readListBegin($_etype1947, $_size1944);
                        for ($_i1948 = 0; $_i1948 < $_size1944; ++$_i1948) {
                            $elem1949 = null;
                            $xfer += $input->readString($elem1949);
                            $this->spamMessageIds []= $elem1949;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::LST) {
                        $this->spamMessages = array();
                        $_size1950 = 0;
                        $_etype1953 = 0;
                        $xfer += $input->readListBegin($_etype1953, $_size1950);
                        for ($_i1954 = 0; $_i1954 < $_size1950; ++$_i1954) {
                            $elem1955 = null;
                            $xfer += $input->readString($elem1955);
                            $this->spamMessages []= $elem1955;
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
        $xfer += $output->writeStructBegin('TalkService_reportSpam_args');
        if ($this->chatMid !== null) {
            $xfer += $output->writeFieldBegin('chatMid', TType::STRING, 2);
            $xfer += $output->writeString($this->chatMid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->memberMids !== null) {
            if (!is_array($this->memberMids)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('memberMids', TType::LST, 3);
            $output->writeListBegin(TType::STRING, count($this->memberMids));
            foreach ($this->memberMids as $iter1956) {
                $xfer += $output->writeString($iter1956);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->spammerReasons !== null) {
            if (!is_array($this->spammerReasons)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('spammerReasons', TType::LST, 4);
            $output->writeListBegin(TType::I32, count($this->spammerReasons));
            foreach ($this->spammerReasons as $iter1957) {
                $xfer += $output->writeI32($iter1957);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->senderMids !== null) {
            if (!is_array($this->senderMids)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('senderMids', TType::LST, 5);
            $output->writeListBegin(TType::STRING, count($this->senderMids));
            foreach ($this->senderMids as $iter1958) {
                $xfer += $output->writeString($iter1958);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->spamMessageIds !== null) {
            if (!is_array($this->spamMessageIds)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('spamMessageIds', TType::LST, 6);
            $output->writeListBegin(TType::STRING, count($this->spamMessageIds));
            foreach ($this->spamMessageIds as $iter1959) {
                $xfer += $output->writeString($iter1959);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->spamMessages !== null) {
            if (!is_array($this->spamMessages)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('spamMessages', TType::LST, 7);
            $output->writeListBegin(TType::STRING, count($this->spamMessages));
            foreach ($this->spamMessages as $iter1960) {
                $xfer += $output->writeString($iter1960);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
