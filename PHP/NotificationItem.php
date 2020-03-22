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

class NotificationItem
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'id',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => '_from',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'to',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'fromChannel',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        5 => array(
            'var' => 'toChannel',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        7 => array(
            'var' => 'revision',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        8 => array(
            'var' => 'createdTime',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        9 => array(
            'var' => 'content',
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
     * @var string
     */
    public $id = null;
    /**
     * @var string
     */
    public $_from = null;
    /**
     * @var string
     */
    public $to = null;
    /**
     * @var string
     */
    public $fromChannel = null;
    /**
     * @var string
     */
    public $toChannel = null;
    /**
     * @var int
     */
    public $revision = null;
    /**
     * @var int
     */
    public $createdTime = null;
    /**
     * @var array
     */
    public $content = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['id'])) {
                $this->id = $vals['id'];
            }
            if (isset($vals['_from'])) {
                $this->_from = $vals['_from'];
            }
            if (isset($vals['to'])) {
                $this->to = $vals['to'];
            }
            if (isset($vals['fromChannel'])) {
                $this->fromChannel = $vals['fromChannel'];
            }
            if (isset($vals['toChannel'])) {
                $this->toChannel = $vals['toChannel'];
            }
            if (isset($vals['revision'])) {
                $this->revision = $vals['revision'];
            }
            if (isset($vals['createdTime'])) {
                $this->createdTime = $vals['createdTime'];
            }
            if (isset($vals['content'])) {
                $this->content = $vals['content'];
            }
        }
    }

    public function getName()
    {
        return 'NotificationItem';
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
                        $xfer += $input->readString($this->id);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->_from);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->to);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->fromChannel);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->toChannel);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->revision);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 8:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->createdTime);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 9:
                    if ($ftype == TType::MAP) {
                        $this->content = array();
                        $_size318 = 0;
                        $_ktype319 = 0;
                        $_vtype320 = 0;
                        $xfer += $input->readMapBegin($_ktype319, $_vtype320, $_size318);
                        for ($_i322 = 0; $_i322 < $_size318; ++$_i322) {
                            $key323 = '';
                            $val324 = '';
                            $xfer += $input->readString($key323);
                            $xfer += $input->readString($val324);
                            $this->content[$key323] = $val324;
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
        $xfer += $output->writeStructBegin('NotificationItem');
        if ($this->id !== null) {
            $xfer += $output->writeFieldBegin('id', TType::STRING, 1);
            $xfer += $output->writeString($this->id);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->_from !== null) {
            $xfer += $output->writeFieldBegin('_from', TType::STRING, 2);
            $xfer += $output->writeString($this->_from);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->to !== null) {
            $xfer += $output->writeFieldBegin('to', TType::STRING, 3);
            $xfer += $output->writeString($this->to);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->fromChannel !== null) {
            $xfer += $output->writeFieldBegin('fromChannel', TType::STRING, 4);
            $xfer += $output->writeString($this->fromChannel);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->toChannel !== null) {
            $xfer += $output->writeFieldBegin('toChannel', TType::STRING, 5);
            $xfer += $output->writeString($this->toChannel);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->revision !== null) {
            $xfer += $output->writeFieldBegin('revision', TType::I64, 7);
            $xfer += $output->writeI64($this->revision);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->createdTime !== null) {
            $xfer += $output->writeFieldBegin('createdTime', TType::I64, 8);
            $xfer += $output->writeI64($this->createdTime);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->content !== null) {
            if (!is_array($this->content)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('content', TType::MAP, 9);
            $output->writeMapBegin(TType::STRING, TType::STRING, count($this->content));
            foreach ($this->content as $kiter325 => $viter326) {
                $xfer += $output->writeString($kiter325);
                $xfer += $output->writeString($viter326);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
