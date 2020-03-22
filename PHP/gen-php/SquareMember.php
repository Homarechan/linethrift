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

class SquareMember
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'squareMemberMid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'squareMid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'displayName',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'profileImageObsHash',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        5 => array(
            'var' => 'ableToReceiveMessage',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        7 => array(
            'var' => 'membershipState',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        8 => array(
            'var' => 'role',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        9 => array(
            'var' => 'revision',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        10 => array(
            'var' => 'preference',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\SquarePreference',
        ),
        11 => array(
            'var' => 'joinMessage',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $squareMemberMid = null;
    /**
     * @var string
     */
    public $squareMid = null;
    /**
     * @var string
     */
    public $displayName = null;
    /**
     * @var string
     */
    public $profileImageObsHash = null;
    /**
     * @var bool
     */
    public $ableToReceiveMessage = null;
    /**
     * @var int
     */
    public $membershipState = null;
    /**
     * @var int
     */
    public $role = null;
    /**
     * @var int
     */
    public $revision = null;
    /**
     * @var \SquarePreference
     */
    public $preference = null;
    /**
     * @var string
     */
    public $joinMessage = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['squareMemberMid'])) {
                $this->squareMemberMid = $vals['squareMemberMid'];
            }
            if (isset($vals['squareMid'])) {
                $this->squareMid = $vals['squareMid'];
            }
            if (isset($vals['displayName'])) {
                $this->displayName = $vals['displayName'];
            }
            if (isset($vals['profileImageObsHash'])) {
                $this->profileImageObsHash = $vals['profileImageObsHash'];
            }
            if (isset($vals['ableToReceiveMessage'])) {
                $this->ableToReceiveMessage = $vals['ableToReceiveMessage'];
            }
            if (isset($vals['membershipState'])) {
                $this->membershipState = $vals['membershipState'];
            }
            if (isset($vals['role'])) {
                $this->role = $vals['role'];
            }
            if (isset($vals['revision'])) {
                $this->revision = $vals['revision'];
            }
            if (isset($vals['preference'])) {
                $this->preference = $vals['preference'];
            }
            if (isset($vals['joinMessage'])) {
                $this->joinMessage = $vals['joinMessage'];
            }
        }
    }

    public function getName()
    {
        return 'SquareMember';
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
                        $xfer += $input->readString($this->squareMemberMid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->squareMid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->displayName);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->profileImageObsHash);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->ableToReceiveMessage);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->membershipState);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 8:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->role);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 9:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->revision);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 10:
                    if ($ftype == TType::STRUCT) {
                        $this->preference = new \SquarePreference();
                        $xfer += $this->preference->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 11:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->joinMessage);
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
        $xfer += $output->writeStructBegin('SquareMember');
        if ($this->squareMemberMid !== null) {
            $xfer += $output->writeFieldBegin('squareMemberMid', TType::STRING, 1);
            $xfer += $output->writeString($this->squareMemberMid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->squareMid !== null) {
            $xfer += $output->writeFieldBegin('squareMid', TType::STRING, 2);
            $xfer += $output->writeString($this->squareMid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->displayName !== null) {
            $xfer += $output->writeFieldBegin('displayName', TType::STRING, 3);
            $xfer += $output->writeString($this->displayName);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->profileImageObsHash !== null) {
            $xfer += $output->writeFieldBegin('profileImageObsHash', TType::STRING, 4);
            $xfer += $output->writeString($this->profileImageObsHash);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->ableToReceiveMessage !== null) {
            $xfer += $output->writeFieldBegin('ableToReceiveMessage', TType::BOOL, 5);
            $xfer += $output->writeBool($this->ableToReceiveMessage);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->membershipState !== null) {
            $xfer += $output->writeFieldBegin('membershipState', TType::I32, 7);
            $xfer += $output->writeI32($this->membershipState);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->role !== null) {
            $xfer += $output->writeFieldBegin('role', TType::I32, 8);
            $xfer += $output->writeI32($this->role);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->revision !== null) {
            $xfer += $output->writeFieldBegin('revision', TType::I64, 9);
            $xfer += $output->writeI64($this->revision);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->preference !== null) {
            if (!is_object($this->preference)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('preference', TType::STRUCT, 10);
            $xfer += $this->preference->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->joinMessage !== null) {
            $xfer += $output->writeFieldBegin('joinMessage', TType::STRING, 11);
            $xfer += $output->writeString($this->joinMessage);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}