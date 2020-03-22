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

class ChannelDomains
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'channelDomains',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\ChannelDomain',
                ),
        ),
        2 => array(
            'var' => 'revision',
            'isRequired' => false,
            'type' => TType::I64,
        ),
    );

    /**
     * @var \ChannelDomain[]
     */
    public $channelDomains = null;
    /**
     * @var int
     */
    public $revision = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['channelDomains'])) {
                $this->channelDomains = $vals['channelDomains'];
            }
            if (isset($vals['revision'])) {
                $this->revision = $vals['revision'];
            }
        }
    }

    public function getName()
    {
        return 'ChannelDomains';
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
                    if ($ftype == TType::LST) {
                        $this->channelDomains = array();
                        $_size142 = 0;
                        $_etype145 = 0;
                        $xfer += $input->readListBegin($_etype145, $_size142);
                        for ($_i146 = 0; $_i146 < $_size142; ++$_i146) {
                            $elem147 = null;
                            $elem147 = new \ChannelDomain();
                            $xfer += $elem147->read($input);
                            $this->channelDomains []= $elem147;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->revision);
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
        $xfer += $output->writeStructBegin('ChannelDomains');
        if ($this->channelDomains !== null) {
            if (!is_array($this->channelDomains)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('channelDomains', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->channelDomains));
            foreach ($this->channelDomains as $iter148) {
                $xfer += $iter148->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->revision !== null) {
            $xfer += $output->writeFieldBegin('revision', TType::I64, 2);
            $xfer += $output->writeI64($this->revision);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}