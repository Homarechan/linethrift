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

class Announcement
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'index',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        10 => array(
            'var' => 'forceUpdate',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        11 => array(
            'var' => 'title',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        12 => array(
            'var' => 'text',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        13 => array(
            'var' => 'createdTime',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        14 => array(
            'var' => 'pictureUrl',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        15 => array(
            'var' => 'thumbnailUrl',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var int
     */
    public $index = null;
    /**
     * @var bool
     */
    public $forceUpdate = null;
    /**
     * @var string
     */
    public $title = null;
    /**
     * @var string
     */
    public $text = null;
    /**
     * @var int
     */
    public $createdTime = null;
    /**
     * @var string
     */
    public $pictureUrl = null;
    /**
     * @var string
     */
    public $thumbnailUrl = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['index'])) {
                $this->index = $vals['index'];
            }
            if (isset($vals['forceUpdate'])) {
                $this->forceUpdate = $vals['forceUpdate'];
            }
            if (isset($vals['title'])) {
                $this->title = $vals['title'];
            }
            if (isset($vals['text'])) {
                $this->text = $vals['text'];
            }
            if (isset($vals['createdTime'])) {
                $this->createdTime = $vals['createdTime'];
            }
            if (isset($vals['pictureUrl'])) {
                $this->pictureUrl = $vals['pictureUrl'];
            }
            if (isset($vals['thumbnailUrl'])) {
                $this->thumbnailUrl = $vals['thumbnailUrl'];
            }
        }
    }

    public function getName()
    {
        return 'Announcement';
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
                        $xfer += $input->readI32($this->index);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 10:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->forceUpdate);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 11:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->title);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 12:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->text);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 13:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->createdTime);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 14:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->pictureUrl);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 15:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->thumbnailUrl);
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
        $xfer += $output->writeStructBegin('Announcement');
        if ($this->index !== null) {
            $xfer += $output->writeFieldBegin('index', TType::I32, 1);
            $xfer += $output->writeI32($this->index);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->forceUpdate !== null) {
            $xfer += $output->writeFieldBegin('forceUpdate', TType::BOOL, 10);
            $xfer += $output->writeBool($this->forceUpdate);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->title !== null) {
            $xfer += $output->writeFieldBegin('title', TType::STRING, 11);
            $xfer += $output->writeString($this->title);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->text !== null) {
            $xfer += $output->writeFieldBegin('text', TType::STRING, 12);
            $xfer += $output->writeString($this->text);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->createdTime !== null) {
            $xfer += $output->writeFieldBegin('createdTime', TType::I64, 13);
            $xfer += $output->writeI64($this->createdTime);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->pictureUrl !== null) {
            $xfer += $output->writeFieldBegin('pictureUrl', TType::STRING, 14);
            $xfer += $output->writeString($this->pictureUrl);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->thumbnailUrl !== null) {
            $xfer += $output->writeFieldBegin('thumbnailUrl', TType::STRING, 15);
            $xfer += $output->writeString($this->thumbnailUrl);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
