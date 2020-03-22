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

class ChannelInfos
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'channelInfos',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\ChannelInfo',
                ),
        ),
        2 => array(
            'var' => 'revision',
            'isRequired' => false,
            'type' => TType::I64,
        ),
    );

    /**
     * @var \ChannelInfo[]
     */
    public $channelInfos = null;
    /**
     * @var int
     */
    public $revision = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['channelInfos'])) {
                $this->channelInfos = $vals['channelInfos'];
            }
            if (isset($vals['revision'])) {
                $this->revision = $vals['revision'];
            }
        }
    }

    public function getName()
    {
        return 'ChannelInfos';
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
                        $this->channelInfos = array();
                        $_size149 = 0;
                        $_etype152 = 0;
                        $xfer += $input->readListBegin($_etype152, $_size149);
                        for ($_i153 = 0; $_i153 < $_size149; ++$_i153) {
                            $elem154 = null;
                            $elem154 = new \ChannelInfo();
                            $xfer += $elem154->read($input);
                            $this->channelInfos []= $elem154;
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
        $xfer += $output->writeStructBegin('ChannelInfos');
        if ($this->channelInfos !== null) {
            if (!is_array($this->channelInfos)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('channelInfos', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->channelInfos));
            foreach ($this->channelInfos as $iter155) {
                $xfer += $iter155->write($output);
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
