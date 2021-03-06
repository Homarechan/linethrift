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

class ApproveSquareMembersRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'squareMid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'requestedMemberMids',
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
    public $squareMid = null;
    /**
     * @var string[]
     */
    public $requestedMemberMids = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['squareMid'])) {
                $this->squareMid = $vals['squareMid'];
            }
            if (isset($vals['requestedMemberMids'])) {
                $this->requestedMemberMids = $vals['requestedMemberMids'];
            }
        }
    }

    public function getName()
    {
        return 'ApproveSquareMembersRequest';
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
                        $xfer += $input->readString($this->squareMid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::LST) {
                        $this->requestedMemberMids = array();
                        $_size510 = 0;
                        $_etype513 = 0;
                        $xfer += $input->readListBegin($_etype513, $_size510);
                        for ($_i514 = 0; $_i514 < $_size510; ++$_i514) {
                            $elem515 = null;
                            $xfer += $input->readString($elem515);
                            $this->requestedMemberMids []= $elem515;
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
        $xfer += $output->writeStructBegin('ApproveSquareMembersRequest');
        if ($this->squareMid !== null) {
            $xfer += $output->writeFieldBegin('squareMid', TType::STRING, 2);
            $xfer += $output->writeString($this->squareMid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->requestedMemberMids !== null) {
            if (!is_array($this->requestedMemberMids)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('requestedMemberMids', TType::LST, 3);
            $output->writeListBegin(TType::STRING, count($this->requestedMemberMids));
            foreach ($this->requestedMemberMids as $iter516) {
                $xfer += $output->writeString($iter516);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
