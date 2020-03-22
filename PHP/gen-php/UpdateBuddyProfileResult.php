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

class UpdateBuddyProfileResult
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'requestId',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'state',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        3 => array(
            'var' => 'eventNo',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        11 => array(
            'var' => 'receiverCount',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        12 => array(
            'var' => 'successCount',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        13 => array(
            'var' => 'failCount',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        14 => array(
            'var' => 'cancelCount',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        15 => array(
            'var' => 'unregisterCount',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        21 => array(
            'var' => 'timestamp',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        22 => array(
            'var' => 'message',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $requestId = null;
    /**
     * @var int
     */
    public $state = null;
    /**
     * @var int
     */
    public $eventNo = null;
    /**
     * @var int
     */
    public $receiverCount = null;
    /**
     * @var int
     */
    public $successCount = null;
    /**
     * @var int
     */
    public $failCount = null;
    /**
     * @var int
     */
    public $cancelCount = null;
    /**
     * @var int
     */
    public $unregisterCount = null;
    /**
     * @var int
     */
    public $timestamp = null;
    /**
     * @var string
     */
    public $message = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['requestId'])) {
                $this->requestId = $vals['requestId'];
            }
            if (isset($vals['state'])) {
                $this->state = $vals['state'];
            }
            if (isset($vals['eventNo'])) {
                $this->eventNo = $vals['eventNo'];
            }
            if (isset($vals['receiverCount'])) {
                $this->receiverCount = $vals['receiverCount'];
            }
            if (isset($vals['successCount'])) {
                $this->successCount = $vals['successCount'];
            }
            if (isset($vals['failCount'])) {
                $this->failCount = $vals['failCount'];
            }
            if (isset($vals['cancelCount'])) {
                $this->cancelCount = $vals['cancelCount'];
            }
            if (isset($vals['unregisterCount'])) {
                $this->unregisterCount = $vals['unregisterCount'];
            }
            if (isset($vals['timestamp'])) {
                $this->timestamp = $vals['timestamp'];
            }
            if (isset($vals['message'])) {
                $this->message = $vals['message'];
            }
        }
    }

    public function getName()
    {
        return 'UpdateBuddyProfileResult';
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
                        $xfer += $input->readString($this->requestId);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->state);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->eventNo);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 11:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->receiverCount);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 12:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->successCount);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 13:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->failCount);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 14:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->cancelCount);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 15:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->unregisterCount);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 21:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->timestamp);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 22:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->message);
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
        $xfer += $output->writeStructBegin('UpdateBuddyProfileResult');
        if ($this->requestId !== null) {
            $xfer += $output->writeFieldBegin('requestId', TType::STRING, 1);
            $xfer += $output->writeString($this->requestId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->state !== null) {
            $xfer += $output->writeFieldBegin('state', TType::I32, 2);
            $xfer += $output->writeI32($this->state);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->eventNo !== null) {
            $xfer += $output->writeFieldBegin('eventNo', TType::I32, 3);
            $xfer += $output->writeI32($this->eventNo);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->receiverCount !== null) {
            $xfer += $output->writeFieldBegin('receiverCount', TType::I64, 11);
            $xfer += $output->writeI64($this->receiverCount);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->successCount !== null) {
            $xfer += $output->writeFieldBegin('successCount', TType::I64, 12);
            $xfer += $output->writeI64($this->successCount);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->failCount !== null) {
            $xfer += $output->writeFieldBegin('failCount', TType::I64, 13);
            $xfer += $output->writeI64($this->failCount);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->cancelCount !== null) {
            $xfer += $output->writeFieldBegin('cancelCount', TType::I64, 14);
            $xfer += $output->writeI64($this->cancelCount);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->unregisterCount !== null) {
            $xfer += $output->writeFieldBegin('unregisterCount', TType::I64, 15);
            $xfer += $output->writeI64($this->unregisterCount);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->timestamp !== null) {
            $xfer += $output->writeFieldBegin('timestamp', TType::I64, 21);
            $xfer += $output->writeI64($this->timestamp);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->message !== null) {
            $xfer += $output->writeFieldBegin('message', TType::STRING, 22);
            $xfer += $output->writeString($this->message);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
