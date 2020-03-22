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

class BuddyDetail
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'mid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'memberCount',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        3 => array(
            'var' => 'onAir',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        4 => array(
            'var' => 'businessAccount',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        5 => array(
            'var' => 'addable',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        6 => array(
            'var' => 'acceptableContentTypes',
            'isRequired' => false,
            'type' => TType::SET,
            'etype' => TType::I32,
            'elem' => array(
                'type' => TType::I32,
                ),
        ),
        7 => array(
            'var' => 'capableMyhome',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
    );

    /**
     * @var string
     */
    public $mid = null;
    /**
     * @var int
     */
    public $memberCount = null;
    /**
     * @var bool
     */
    public $onAir = null;
    /**
     * @var bool
     */
    public $businessAccount = null;
    /**
     * @var bool
     */
    public $addable = null;
    /**
     * @var int[]
     */
    public $acceptableContentTypes = null;
    /**
     * @var bool
     */
    public $capableMyhome = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['mid'])) {
                $this->mid = $vals['mid'];
            }
            if (isset($vals['memberCount'])) {
                $this->memberCount = $vals['memberCount'];
            }
            if (isset($vals['onAir'])) {
                $this->onAir = $vals['onAir'];
            }
            if (isset($vals['businessAccount'])) {
                $this->businessAccount = $vals['businessAccount'];
            }
            if (isset($vals['addable'])) {
                $this->addable = $vals['addable'];
            }
            if (isset($vals['acceptableContentTypes'])) {
                $this->acceptableContentTypes = $vals['acceptableContentTypes'];
            }
            if (isset($vals['capableMyhome'])) {
                $this->capableMyhome = $vals['capableMyhome'];
            }
        }
    }

    public function getName()
    {
        return 'BuddyDetail';
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
                        $xfer += $input->readString($this->mid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->memberCount);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->onAir);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->businessAccount);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->addable);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::SET) {
                        $this->acceptableContentTypes = array();
                        $_size100 = 0;
                        $_etype103 = 0;
                        $xfer += $input->readSetBegin($_etype103, $_size100);
                        for ($_i104 = 0; $_i104 < $_size100; ++$_i104) {
                            $elem105 = null;
                            $xfer += $input->readI32($elem105);
                            $this->acceptableContentTypes[$elem105] = true;
                        }
                        $xfer += $input->readSetEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->capableMyhome);
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
        $xfer += $output->writeStructBegin('BuddyDetail');
        if ($this->mid !== null) {
            $xfer += $output->writeFieldBegin('mid', TType::STRING, 1);
            $xfer += $output->writeString($this->mid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->memberCount !== null) {
            $xfer += $output->writeFieldBegin('memberCount', TType::I64, 2);
            $xfer += $output->writeI64($this->memberCount);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->onAir !== null) {
            $xfer += $output->writeFieldBegin('onAir', TType::BOOL, 3);
            $xfer += $output->writeBool($this->onAir);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->businessAccount !== null) {
            $xfer += $output->writeFieldBegin('businessAccount', TType::BOOL, 4);
            $xfer += $output->writeBool($this->businessAccount);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->addable !== null) {
            $xfer += $output->writeFieldBegin('addable', TType::BOOL, 5);
            $xfer += $output->writeBool($this->addable);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->acceptableContentTypes !== null) {
            if (!is_array($this->acceptableContentTypes)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('acceptableContentTypes', TType::SET, 6);
            $output->writeSetBegin(TType::I32, count($this->acceptableContentTypes));
            foreach ($this->acceptableContentTypes as $iter106 => $iter107) {
                $xfer += $output->writeI32($iter106);
            }
            $output->writeSetEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->capableMyhome !== null) {
            $xfer += $output->writeFieldBegin('capableMyhome', TType::BOOL, 7);
            $xfer += $output->writeBool($this->capableMyhome);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
