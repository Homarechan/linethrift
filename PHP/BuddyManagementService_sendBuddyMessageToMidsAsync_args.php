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

class BuddyManagementService_sendBuddyMessageToMidsAsync_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'requestId',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'msg',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\Message',
        ),
        3 => array(
            'var' => 'mids',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
    );

    /**
     * @var string
     */
    public $requestId = null;
    /**
     * @var \Message
     */
    public $msg = null;
    /**
     * @var string[]
     */
    public $mids = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['requestId'])) {
                $this->requestId = $vals['requestId'];
            }
            if (isset($vals['msg'])) {
                $this->msg = $vals['msg'];
            }
            if (isset($vals['mids'])) {
                $this->mids = $vals['mids'];
            }
        }
    }

    public function getName()
    {
        return 'BuddyManagementService_sendBuddyMessageToMidsAsync_args';
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
                    if ($ftype == TType::STRUCT) {
                        $this->msg = new \Message();
                        $xfer += $this->msg->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::LST) {
                        $this->mids = array();
                        $_size1099 = 0;
                        $_etype1102 = 0;
                        $xfer += $input->readListBegin($_etype1102, $_size1099);
                        for ($_i1103 = 0; $_i1103 < $_size1099; ++$_i1103) {
                            $elem1104 = null;
                            $xfer += $input->readString($elem1104);
                            $this->mids []= $elem1104;
                        }
                        $xfer += $input->readListEnd();
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
        $xfer += $output->writeStructBegin('BuddyManagementService_sendBuddyMessageToMidsAsync_args');
        if ($this->requestId !== null) {
            $xfer += $output->writeFieldBegin('requestId', TType::STRING, 1);
            $xfer += $output->writeString($this->requestId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->msg !== null) {
            if (!is_object($this->msg)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('msg', TType::STRUCT, 2);
            $xfer += $this->msg->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->mids !== null) {
            if (!is_array($this->mids)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('mids', TType::LST, 3);
            $output->writeListBegin(TType::STRING, count($this->mids));
            foreach ($this->mids as $iter1105) {
                $xfer += $output->writeString($iter1105);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
