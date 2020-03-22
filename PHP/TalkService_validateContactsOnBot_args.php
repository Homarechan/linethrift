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

class TalkService_validateContactsOnBot_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'contacts',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
    );

    /**
     * @var string[]
     */
    public $contacts = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['contacts'])) {
                $this->contacts = $vals['contacts'];
            }
        }
    }

    public function getName()
    {
        return 'TalkService_validateContactsOnBot_args';
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
                    if ($ftype == TType::LST) {
                        $this->contacts = array();
                        $_size2102 = 0;
                        $_etype2105 = 0;
                        $xfer += $input->readListBegin($_etype2105, $_size2102);
                        for ($_i2106 = 0; $_i2106 < $_size2102; ++$_i2106) {
                            $elem2107 = null;
                            $xfer += $input->readString($elem2107);
                            $this->contacts []= $elem2107;
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
        $xfer += $output->writeStructBegin('TalkService_validateContactsOnBot_args');
        if ($this->contacts !== null) {
            if (!is_array($this->contacts)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('contacts', TType::LST, 2);
            $output->writeListBegin(TType::STRING, count($this->contacts));
            foreach ($this->contacts as $iter2108) {
                $xfer += $output->writeString($iter2108);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
