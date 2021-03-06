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

class SquareAuthority
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'squareMid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'updateSquareProfile',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        3 => array(
            'var' => 'inviteNewMember',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        4 => array(
            'var' => 'approveJoinRequest',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        5 => array(
            'var' => 'createPost',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        6 => array(
            'var' => 'createOpenSquareChat',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        7 => array(
            'var' => 'deleteSquareChatOrPost',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        8 => array(
            'var' => 'removeSquareMember',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        9 => array(
            'var' => 'grantRole',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        10 => array(
            'var' => 'enableInvitationTicket',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        11 => array(
            'var' => 'revision',
            'isRequired' => false,
            'type' => TType::I64,
        ),
    );

    /**
     * @var string
     */
    public $squareMid = null;
    /**
     * @var int
     */
    public $updateSquareProfile = null;
    /**
     * @var int
     */
    public $inviteNewMember = null;
    /**
     * @var int
     */
    public $approveJoinRequest = null;
    /**
     * @var int
     */
    public $createPost = null;
    /**
     * @var int
     */
    public $createOpenSquareChat = null;
    /**
     * @var int
     */
    public $deleteSquareChatOrPost = null;
    /**
     * @var int
     */
    public $removeSquareMember = null;
    /**
     * @var int
     */
    public $grantRole = null;
    /**
     * @var int
     */
    public $enableInvitationTicket = null;
    /**
     * @var int
     */
    public $revision = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['squareMid'])) {
                $this->squareMid = $vals['squareMid'];
            }
            if (isset($vals['updateSquareProfile'])) {
                $this->updateSquareProfile = $vals['updateSquareProfile'];
            }
            if (isset($vals['inviteNewMember'])) {
                $this->inviteNewMember = $vals['inviteNewMember'];
            }
            if (isset($vals['approveJoinRequest'])) {
                $this->approveJoinRequest = $vals['approveJoinRequest'];
            }
            if (isset($vals['createPost'])) {
                $this->createPost = $vals['createPost'];
            }
            if (isset($vals['createOpenSquareChat'])) {
                $this->createOpenSquareChat = $vals['createOpenSquareChat'];
            }
            if (isset($vals['deleteSquareChatOrPost'])) {
                $this->deleteSquareChatOrPost = $vals['deleteSquareChatOrPost'];
            }
            if (isset($vals['removeSquareMember'])) {
                $this->removeSquareMember = $vals['removeSquareMember'];
            }
            if (isset($vals['grantRole'])) {
                $this->grantRole = $vals['grantRole'];
            }
            if (isset($vals['enableInvitationTicket'])) {
                $this->enableInvitationTicket = $vals['enableInvitationTicket'];
            }
            if (isset($vals['revision'])) {
                $this->revision = $vals['revision'];
            }
        }
    }

    public function getName()
    {
        return 'SquareAuthority';
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
                        $xfer += $input->readString($this->squareMid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->updateSquareProfile);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->inviteNewMember);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->approveJoinRequest);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->createPost);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->createOpenSquareChat);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->deleteSquareChatOrPost);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 8:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->removeSquareMember);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 9:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->grantRole);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 10:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->enableInvitationTicket);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 11:
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
        $xfer += $output->writeStructBegin('SquareAuthority');
        if ($this->squareMid !== null) {
            $xfer += $output->writeFieldBegin('squareMid', TType::STRING, 1);
            $xfer += $output->writeString($this->squareMid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->updateSquareProfile !== null) {
            $xfer += $output->writeFieldBegin('updateSquareProfile', TType::I32, 2);
            $xfer += $output->writeI32($this->updateSquareProfile);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->inviteNewMember !== null) {
            $xfer += $output->writeFieldBegin('inviteNewMember', TType::I32, 3);
            $xfer += $output->writeI32($this->inviteNewMember);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->approveJoinRequest !== null) {
            $xfer += $output->writeFieldBegin('approveJoinRequest', TType::I32, 4);
            $xfer += $output->writeI32($this->approveJoinRequest);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->createPost !== null) {
            $xfer += $output->writeFieldBegin('createPost', TType::I32, 5);
            $xfer += $output->writeI32($this->createPost);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->createOpenSquareChat !== null) {
            $xfer += $output->writeFieldBegin('createOpenSquareChat', TType::I32, 6);
            $xfer += $output->writeI32($this->createOpenSquareChat);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->deleteSquareChatOrPost !== null) {
            $xfer += $output->writeFieldBegin('deleteSquareChatOrPost', TType::I32, 7);
            $xfer += $output->writeI32($this->deleteSquareChatOrPost);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->removeSquareMember !== null) {
            $xfer += $output->writeFieldBegin('removeSquareMember', TType::I32, 8);
            $xfer += $output->writeI32($this->removeSquareMember);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->grantRole !== null) {
            $xfer += $output->writeFieldBegin('grantRole', TType::I32, 9);
            $xfer += $output->writeI32($this->grantRole);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->enableInvitationTicket !== null) {
            $xfer += $output->writeFieldBegin('enableInvitationTicket', TType::I32, 10);
            $xfer += $output->writeI32($this->enableInvitationTicket);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->revision !== null) {
            $xfer += $output->writeFieldBegin('revision', TType::I64, 11);
            $xfer += $output->writeI64($this->revision);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
