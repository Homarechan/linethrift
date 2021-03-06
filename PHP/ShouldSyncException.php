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

class ShouldSyncException extends TException
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'syncOpRevision',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        2 => array(
            'var' => 'syncScope',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\SyncScope',
        ),
        3 => array(
            'var' => 'syncReason',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        4 => array(
            'var' => 'message',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var int
     */
    public $syncOpRevision = null;
    /**
     * @var \SyncScope
     */
    public $syncScope = null;
    /**
     * @var int
     */
    public $syncReason = null;
    /**
     * @var string
     */
    public $message = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['syncOpRevision'])) {
                $this->syncOpRevision = $vals['syncOpRevision'];
            }
            if (isset($vals['syncScope'])) {
                $this->syncScope = $vals['syncScope'];
            }
            if (isset($vals['syncReason'])) {
                $this->syncReason = $vals['syncReason'];
            }
            if (isset($vals['message'])) {
                $this->message = $vals['message'];
            }
        }
    }

    public function getName()
    {
        return 'ShouldSyncException';
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
                        $xfer += $input->readI64($this->syncOpRevision);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRUCT) {
                        $this->syncScope = new \SyncScope();
                        $xfer += $this->syncScope->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->syncReason);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
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
        $xfer += $output->writeStructBegin('ShouldSyncException');
        if ($this->syncOpRevision !== null) {
            $xfer += $output->writeFieldBegin('syncOpRevision', TType::I64, 1);
            $xfer += $output->writeI64($this->syncOpRevision);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->syncScope !== null) {
            if (!is_object($this->syncScope)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('syncScope', TType::STRUCT, 2);
            $xfer += $this->syncScope->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->syncReason !== null) {
            $xfer += $output->writeFieldBegin('syncReason', TType::I32, 3);
            $xfer += $output->writeI32($this->syncReason);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->message !== null) {
            $xfer += $output->writeFieldBegin('message', TType::STRING, 4);
            $xfer += $output->writeString($this->message);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
