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

class AccountSupervisorService_unregisterVirtualAccount_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'virtualMid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $virtualMid = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['virtualMid'])) {
                $this->virtualMid = $vals['virtualMid'];
            }
        }
    }

    public function getName()
    {
        return 'AccountSupervisorService_unregisterVirtualAccount_args';
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
                        $xfer += $input->readString($this->virtualMid);
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
        $xfer += $output->writeStructBegin('AccountSupervisorService_unregisterVirtualAccount_args');
        if ($this->virtualMid !== null) {
            $xfer += $output->writeFieldBegin('virtualMid', TType::STRING, 2);
            $xfer += $output->writeString($this->virtualMid);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
