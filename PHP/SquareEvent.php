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

class SquareEvent
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'createdTime',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        3 => array(
            'var' => 'type',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        4 => array(
            'var' => 'payload',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\SquareEventPayload',
        ),
        5 => array(
            'var' => 'syncToken',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        6 => array(
            'var' => 'eventStatus',
            'isRequired' => false,
            'type' => TType::I32,
        ),
    );

    /**
     * @var int
     */
    public $createdTime = null;
    /**
     * @var int
     */
    public $type = null;
    /**
     * @var \SquareEventPayload
     */
    public $payload = null;
    /**
     * @var string
     */
    public $syncToken = null;
    /**
     * @var int
     */
    public $eventStatus = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['createdTime'])) {
                $this->createdTime = $vals['createdTime'];
            }
            if (isset($vals['type'])) {
                $this->type = $vals['type'];
            }
            if (isset($vals['payload'])) {
                $this->payload = $vals['payload'];
            }
            if (isset($vals['syncToken'])) {
                $this->syncToken = $vals['syncToken'];
            }
            if (isset($vals['eventStatus'])) {
                $this->eventStatus = $vals['eventStatus'];
            }
        }
    }

    public function getName()
    {
        return 'SquareEvent';
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
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->createdTime);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->type);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRUCT) {
                        $this->payload = new \SquareEventPayload();
                        $xfer += $this->payload->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->syncToken);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->eventStatus);
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
        $xfer += $output->writeStructBegin('SquareEvent');
        if ($this->createdTime !== null) {
            $xfer += $output->writeFieldBegin('createdTime', TType::I64, 2);
            $xfer += $output->writeI64($this->createdTime);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->type !== null) {
            $xfer += $output->writeFieldBegin('type', TType::I32, 3);
            $xfer += $output->writeI32($this->type);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->payload !== null) {
            if (!is_object($this->payload)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('payload', TType::STRUCT, 4);
            $xfer += $this->payload->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->syncToken !== null) {
            $xfer += $output->writeFieldBegin('syncToken', TType::STRING, 5);
            $xfer += $output->writeString($this->syncToken);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->eventStatus !== null) {
            $xfer += $output->writeFieldBegin('eventStatus', TType::I32, 6);
            $xfer += $output->writeI32($this->eventStatus);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
