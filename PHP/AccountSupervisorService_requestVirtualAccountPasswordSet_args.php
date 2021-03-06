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

class AccountSupervisorService_requestVirtualAccountPasswordSet_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'virtualMid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'encryptedVirtualUserId',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'encryptedNewPassword',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $virtualMid = null;
    /**
     * @var string
     */
    public $encryptedVirtualUserId = null;
    /**
     * @var string
     */
    public $encryptedNewPassword = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['virtualMid'])) {
                $this->virtualMid = $vals['virtualMid'];
            }
            if (isset($vals['encryptedVirtualUserId'])) {
                $this->encryptedVirtualUserId = $vals['encryptedVirtualUserId'];
            }
            if (isset($vals['encryptedNewPassword'])) {
                $this->encryptedNewPassword = $vals['encryptedNewPassword'];
            }
        }
    }

    public function getName()
    {
        return 'AccountSupervisorService_requestVirtualAccountPasswordSet_args';
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
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->encryptedVirtualUserId);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->encryptedNewPassword);
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
        $xfer += $output->writeStructBegin('AccountSupervisorService_requestVirtualAccountPasswordSet_args');
        if ($this->virtualMid !== null) {
            $xfer += $output->writeFieldBegin('virtualMid', TType::STRING, 2);
            $xfer += $output->writeString($this->virtualMid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->encryptedVirtualUserId !== null) {
            $xfer += $output->writeFieldBegin('encryptedVirtualUserId', TType::STRING, 3);
            $xfer += $output->writeString($this->encryptedVirtualUserId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->encryptedNewPassword !== null) {
            $xfer += $output->writeFieldBegin('encryptedNewPassword', TType::STRING, 4);
            $xfer += $output->writeString($this->encryptedNewPassword);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
