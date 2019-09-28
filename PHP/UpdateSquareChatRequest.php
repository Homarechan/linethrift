<?php
/**
 * Autogenerated by Thrift Compiler (0.13.0)
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

class UpdateSquareChatRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'updatedAttrs',
            'isRequired' => false,
            'type' => TType::SET,
            'etype' => TType::I32,
            'elem' => array(
                'type' => TType::I32,
                ),
        ),
        3 => array(
            'var' => 'squareChat',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\SquareChat',
        ),
    );

    /**
     * @var int[]
     */
    public $updatedAttrs = null;
    /**
     * @var \SquareChat
     */
    public $squareChat = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['updatedAttrs'])) {
                $this->updatedAttrs = $vals['updatedAttrs'];
            }
            if (isset($vals['squareChat'])) {
                $this->squareChat = $vals['squareChat'];
            }
        }
    }

    public function getName()
    {
        return 'UpdateSquareChatRequest';
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
                    if ($ftype == TType::SET) {
                        $this->updatedAttrs = array();
                        $_size845 = 0;
                        $_etype848 = 0;
                        $xfer += $input->readSetBegin($_etype848, $_size845);
                        for ($_i849 = 0; $_i849 < $_size845; ++$_i849) {
                            $elem850 = null;
                            $xfer += $input->readI32($elem850);
                            $this->updatedAttrs[$elem850] = true;
                        }
                        $xfer += $input->readSetEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRUCT) {
                        $this->squareChat = new \SquareChat();
                        $xfer += $this->squareChat->read($input);
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
        $xfer += $output->writeStructBegin('UpdateSquareChatRequest');
        if ($this->updatedAttrs !== null) {
            if (!is_array($this->updatedAttrs)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('updatedAttrs', TType::SET, 2);
            $output->writeSetBegin(TType::I32, count($this->updatedAttrs));
            foreach ($this->updatedAttrs as $iter851 => $iter852) {
                $xfer += $output->writeI32($iter851);
            }
            $output->writeSetEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->squareChat !== null) {
            if (!is_object($this->squareChat)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('squareChat', TType::STRUCT, 3);
            $xfer += $this->squareChat->write($output);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}