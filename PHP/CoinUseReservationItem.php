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

class CoinUseReservationItem
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'itemId',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'itemName',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'amount',
            'isRequired' => false,
            'type' => TType::I32,
        ),
    );

    /**
     * @var string
     */
    public $itemId = null;
    /**
     * @var string
     */
    public $itemName = null;
    /**
     * @var int
     */
    public $amount = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['itemId'])) {
                $this->itemId = $vals['itemId'];
            }
            if (isset($vals['itemName'])) {
                $this->itemName = $vals['itemName'];
            }
            if (isset($vals['amount'])) {
                $this->amount = $vals['amount'];
            }
        }
    }

    public function getName()
    {
        return 'CoinUseReservationItem';
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
                        $xfer += $input->readString($this->itemId);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->itemName);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->amount);
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
        $xfer += $output->writeStructBegin('CoinUseReservationItem');
        if ($this->itemId !== null) {
            $xfer += $output->writeFieldBegin('itemId', TType::STRING, 1);
            $xfer += $output->writeString($this->itemId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->itemName !== null) {
            $xfer += $output->writeFieldBegin('itemName', TType::STRING, 2);
            $xfer += $output->writeString($this->itemName);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->amount !== null) {
            $xfer += $output->writeFieldBegin('amount', TType::I32, 3);
            $xfer += $output->writeI32($this->amount);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
