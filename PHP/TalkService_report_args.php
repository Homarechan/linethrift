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

class TalkService_report_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'syncOpRevision',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        3 => array(
            'var' => 'category',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        4 => array(
            'var' => 'report',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var int
     */
    public $syncOpRevision = null;
    /**
     * @var int
     */
    public $category = null;
    /**
     * @var string
     */
    public $report = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['syncOpRevision'])) {
                $this->syncOpRevision = $vals['syncOpRevision'];
            }
            if (isset($vals['category'])) {
                $this->category = $vals['category'];
            }
            if (isset($vals['report'])) {
                $this->report = $vals['report'];
            }
        }
    }

    public function getName()
    {
        return 'TalkService_report_args';
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
                        $xfer += $input->readI64($this->syncOpRevision);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->category);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->report);
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
        $xfer += $output->writeStructBegin('TalkService_report_args');
        if ($this->syncOpRevision !== null) {
            $xfer += $output->writeFieldBegin('syncOpRevision', TType::I64, 2);
            $xfer += $output->writeI64($this->syncOpRevision);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->category !== null) {
            $xfer += $output->writeFieldBegin('category', TType::I32, 3);
            $xfer += $output->writeI32($this->category);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->report !== null) {
            $xfer += $output->writeFieldBegin('report', TType::STRING, 4);
            $xfer += $output->writeString($this->report);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
