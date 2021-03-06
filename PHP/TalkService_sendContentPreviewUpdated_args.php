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

class TalkService_sendContentPreviewUpdated_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'esq',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        2 => array(
            'var' => 'messageId',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'receiverMids',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
    );

    /**
     * @var int
     */
    public $esq = null;
    /**
     * @var string
     */
    public $messageId = null;
    /**
     * @var string[]
     */
    public $receiverMids = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['esq'])) {
                $this->esq = $vals['esq'];
            }
            if (isset($vals['messageId'])) {
                $this->messageId = $vals['messageId'];
            }
            if (isset($vals['receiverMids'])) {
                $this->receiverMids = $vals['receiverMids'];
            }
        }
    }

    public function getName()
    {
        return 'TalkService_sendContentPreviewUpdated_args';
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
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->esq);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->messageId);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::LST) {
                        $this->receiverMids = array();
                        $_size1975 = 0;
                        $_etype1978 = 0;
                        $xfer += $input->readListBegin($_etype1978, $_size1975);
                        for ($_i1979 = 0; $_i1979 < $_size1975; ++$_i1979) {
                            $elem1980 = null;
                            $xfer += $input->readString($elem1980);
                            $this->receiverMids []= $elem1980;
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
        $xfer += $output->writeStructBegin('TalkService_sendContentPreviewUpdated_args');
        if ($this->esq !== null) {
            $xfer += $output->writeFieldBegin('esq', TType::I32, 1);
            $xfer += $output->writeI32($this->esq);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->messageId !== null) {
            $xfer += $output->writeFieldBegin('messageId', TType::STRING, 2);
            $xfer += $output->writeString($this->messageId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->receiverMids !== null) {
            if (!is_array($this->receiverMids)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('receiverMids', TType::LST, 3);
            $output->writeListBegin(TType::STRING, count($this->receiverMids));
            foreach ($this->receiverMids as $iter1981) {
                $xfer += $output->writeString($iter1981);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
