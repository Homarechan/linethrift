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

class SearchSquaresResponse
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'squares',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\Square',
                ),
        ),
        2 => array(
            'var' => 'squareStatuses',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::STRING,
            'vtype' => TType::STRUCT,
            'key' => array(
                'type' => TType::STRING,
            ),
            'val' => array(
                'type' => TType::STRUCT,
                'class' => '\SquareStatus',
                ),
        ),
        3 => array(
            'var' => 'myMemberships',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::STRING,
            'vtype' => TType::STRUCT,
            'key' => array(
                'type' => TType::STRING,
            ),
            'val' => array(
                'type' => TType::STRUCT,
                'class' => '\SquareMember',
                ),
        ),
        4 => array(
            'var' => 'continuationToken',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        5 => array(
            'var' => 'noteStatuses',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::STRING,
            'vtype' => TType::STRUCT,
            'key' => array(
                'type' => TType::STRING,
            ),
            'val' => array(
                'type' => TType::STRUCT,
                'class' => '\NoteStatus',
                ),
        ),
    );

    /**
     * @var \Square[]
     */
    public $squares = null;
    /**
     * @var array
     */
    public $squareStatuses = null;
    /**
     * @var array
     */
    public $myMemberships = null;
    /**
     * @var string
     */
    public $continuationToken = null;
    /**
     * @var array
     */
    public $noteStatuses = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['squares'])) {
                $this->squares = $vals['squares'];
            }
            if (isset($vals['squareStatuses'])) {
                $this->squareStatuses = $vals['squareStatuses'];
            }
            if (isset($vals['myMemberships'])) {
                $this->myMemberships = $vals['myMemberships'];
            }
            if (isset($vals['continuationToken'])) {
                $this->continuationToken = $vals['continuationToken'];
            }
            if (isset($vals['noteStatuses'])) {
                $this->noteStatuses = $vals['noteStatuses'];
            }
        }
    }

    public function getName()
    {
        return 'SearchSquaresResponse';
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
                        $this->squares = array();
                        $_size694 = 0;
                        $_etype697 = 0;
                        $xfer += $input->readListBegin($_etype697, $_size694);
                        for ($_i698 = 0; $_i698 < $_size694; ++$_i698) {
                            $elem699 = null;
                            $elem699 = new \Square();
                            $xfer += $elem699->read($input);
                            $this->squares []= $elem699;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::MAP) {
                        $this->squareStatuses = array();
                        $_size700 = 0;
                        $_ktype701 = 0;
                        $_vtype702 = 0;
                        $xfer += $input->readMapBegin($_ktype701, $_vtype702, $_size700);
                        for ($_i704 = 0; $_i704 < $_size700; ++$_i704) {
                            $key705 = '';
                            $val706 = new \SquareStatus();
                            $xfer += $input->readString($key705);
                            $val706 = new \SquareStatus();
                            $xfer += $val706->read($input);
                            $this->squareStatuses[$key705] = $val706;
                        }
                        $xfer += $input->readMapEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::MAP) {
                        $this->myMemberships = array();
                        $_size707 = 0;
                        $_ktype708 = 0;
                        $_vtype709 = 0;
                        $xfer += $input->readMapBegin($_ktype708, $_vtype709, $_size707);
                        for ($_i711 = 0; $_i711 < $_size707; ++$_i711) {
                            $key712 = '';
                            $val713 = new \SquareMember();
                            $xfer += $input->readString($key712);
                            $val713 = new \SquareMember();
                            $xfer += $val713->read($input);
                            $this->myMemberships[$key712] = $val713;
                        }
                        $xfer += $input->readMapEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->continuationToken);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::MAP) {
                        $this->noteStatuses = array();
                        $_size714 = 0;
                        $_ktype715 = 0;
                        $_vtype716 = 0;
                        $xfer += $input->readMapBegin($_ktype715, $_vtype716, $_size714);
                        for ($_i718 = 0; $_i718 < $_size714; ++$_i718) {
                            $key719 = '';
                            $val720 = new \NoteStatus();
                            $xfer += $input->readString($key719);
                            $val720 = new \NoteStatus();
                            $xfer += $val720->read($input);
                            $this->noteStatuses[$key719] = $val720;
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
        $xfer += $output->writeStructBegin('SearchSquaresResponse');
        if ($this->squares !== null) {
            if (!is_array($this->squares)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('squares', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->squares));
            foreach ($this->squares as $iter721) {
                $xfer += $iter721->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->squareStatuses !== null) {
            if (!is_array($this->squareStatuses)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('squareStatuses', TType::MAP, 2);
            $output->writeMapBegin(TType::STRING, TType::STRUCT, count($this->squareStatuses));
            foreach ($this->squareStatuses as $kiter722 => $viter723) {
                $xfer += $output->writeString($kiter722);
                $xfer += $viter723->write($output);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->myMemberships !== null) {
            if (!is_array($this->myMemberships)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('myMemberships', TType::MAP, 3);
            $output->writeMapBegin(TType::STRING, TType::STRUCT, count($this->myMemberships));
            foreach ($this->myMemberships as $kiter724 => $viter725) {
                $xfer += $output->writeString($kiter724);
                $xfer += $viter725->write($output);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->continuationToken !== null) {
            $xfer += $output->writeFieldBegin('continuationToken', TType::STRING, 4);
            $xfer += $output->writeString($this->continuationToken);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->noteStatuses !== null) {
            if (!is_array($this->noteStatuses)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('noteStatuses', TType::MAP, 5);
            $output->writeMapBegin(TType::STRING, TType::STRUCT, count($this->noteStatuses));
            foreach ($this->noteStatuses as $kiter726 => $viter727) {
                $xfer += $output->writeString($kiter726);
                $xfer += $viter727->write($output);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}