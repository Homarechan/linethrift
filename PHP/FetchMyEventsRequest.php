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

class FetchMyEventsRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'subscriptionId',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        2 => array(
            'var' => 'syncToken',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'limit',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        4 => array(
            'var' => 'continuationToken',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var int
     */
    public $subscriptionId = null;
    /**
     * @var string
     */
    public $syncToken = null;
    /**
     * @var int
     */
    public $limit = null;
    /**
     * @var string
     */
    public $continuationToken = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['subscriptionId'])) {
                $this->subscriptionId = $vals['subscriptionId'];
            }
            if (isset($vals['syncToken'])) {
                $this->syncToken = $vals['syncToken'];
            }
            if (isset($vals['limit'])) {
                $this->limit = $vals['limit'];
            }
            if (isset($vals['continuationToken'])) {
                $this->continuationToken = $vals['continuationToken'];
            }
        }
    }

    public function getName()
    {
        return 'FetchMyEventsRequest';
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
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->subscriptionId);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->syncToken);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->limit);
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
        $xfer += $output->writeStructBegin('FetchMyEventsRequest');
        if ($this->subscriptionId !== null) {
            $xfer += $output->writeFieldBegin('subscriptionId', TType::I64, 1);
            $xfer += $output->writeI64($this->subscriptionId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->syncToken !== null) {
            $xfer += $output->writeFieldBegin('syncToken', TType::STRING, 2);
            $xfer += $output->writeString($this->syncToken);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->limit !== null) {
            $xfer += $output->writeFieldBegin('limit', TType::I32, 3);
            $xfer += $output->writeI32($this->limit);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->continuationToken !== null) {
            $xfer += $output->writeFieldBegin('continuationToken', TType::STRING, 4);
            $xfer += $output->writeString($this->continuationToken);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
