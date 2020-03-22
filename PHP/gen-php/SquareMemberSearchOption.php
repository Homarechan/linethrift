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

class SquareMemberSearchOption
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'membershipState',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        2 => array(
            'var' => 'memberRoles',
            'isRequired' => false,
            'type' => TType::SET,
            'etype' => TType::I32,
            'elem' => array(
                'type' => TType::I32,
                ),
        ),
        3 => array(
            'var' => 'displayName',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'ableToReceiveMessage',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        5 => array(
            'var' => 'ableToReceiveFriendRequest',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        6 => array(
            'var' => 'chatMidToExcludeMembers',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        7 => array(
            'var' => 'includingMe',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
    );

    /**
     * @var int
     */
    public $membershipState = null;
    /**
     * @var int[]
     */
    public $memberRoles = null;
    /**
     * @var string
     */
    public $displayName = null;
    /**
     * @var int
     */
    public $ableToReceiveMessage = null;
    /**
     * @var int
     */
    public $ableToReceiveFriendRequest = null;
    /**
     * @var string
     */
    public $chatMidToExcludeMembers = null;
    /**
     * @var bool
     */
    public $includingMe = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['membershipState'])) {
                $this->membershipState = $vals['membershipState'];
            }
            if (isset($vals['memberRoles'])) {
                $this->memberRoles = $vals['memberRoles'];
            }
            if (isset($vals['displayName'])) {
                $this->displayName = $vals['displayName'];
            }
            if (isset($vals['ableToReceiveMessage'])) {
                $this->ableToReceiveMessage = $vals['ableToReceiveMessage'];
            }
            if (isset($vals['ableToReceiveFriendRequest'])) {
                $this->ableToReceiveFriendRequest = $vals['ableToReceiveFriendRequest'];
            }
            if (isset($vals['chatMidToExcludeMembers'])) {
                $this->chatMidToExcludeMembers = $vals['chatMidToExcludeMembers'];
            }
            if (isset($vals['includingMe'])) {
                $this->includingMe = $vals['includingMe'];
            }
        }
    }

    public function getName()
    {
        return 'SquareMemberSearchOption';
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
                        $xfer += $input->readI32($this->membershipState);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::SET) {
                        $this->memberRoles = array();
                        $_size583 = 0;
                        $_etype586 = 0;
                        $xfer += $input->readSetBegin($_etype586, $_size583);
                        for ($_i587 = 0; $_i587 < $_size583; ++$_i587) {
                            $elem588 = null;
                            $xfer += $input->readI32($elem588);
                            $this->memberRoles[$elem588] = true;
                        }
                        $xfer += $input->readSetEnd();
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
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->ableToReceiveMessage);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->ableToReceiveFriendRequest);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->chatMidToExcludeMembers);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->includingMe);
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
        $xfer += $output->writeStructBegin('SquareMemberSearchOption');
        if ($this->membershipState !== null) {
            $xfer += $output->writeFieldBegin('membershipState', TType::I32, 1);
            $xfer += $output->writeI32($this->membershipState);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->memberRoles !== null) {
            if (!is_array($this->memberRoles)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('memberRoles', TType::SET, 2);
            $output->writeSetBegin(TType::I32, count($this->memberRoles));
            foreach ($this->memberRoles as $iter589 => $iter590) {
                $xfer += $output->writeI32($iter589);
            }
            $output->writeSetEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->displayName !== null) {
            $xfer += $output->writeFieldBegin('displayName', TType::STRING, 3);
            $xfer += $output->writeString($this->displayName);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->ableToReceiveMessage !== null) {
            $xfer += $output->writeFieldBegin('ableToReceiveMessage', TType::I32, 4);
            $xfer += $output->writeI32($this->ableToReceiveMessage);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->ableToReceiveFriendRequest !== null) {
            $xfer += $output->writeFieldBegin('ableToReceiveFriendRequest', TType::I32, 5);
            $xfer += $output->writeI32($this->ableToReceiveFriendRequest);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->chatMidToExcludeMembers !== null) {
            $xfer += $output->writeFieldBegin('chatMidToExcludeMembers', TType::STRING, 6);
            $xfer += $output->writeString($this->chatMidToExcludeMembers);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->includingMe !== null) {
            $xfer += $output->writeFieldBegin('includingMe', TType::BOOL, 7);
            $xfer += $output->writeBool($this->includingMe);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
