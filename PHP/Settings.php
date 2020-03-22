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

class Settings
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        10 => array(
            'var' => 'notificationEnable',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        11 => array(
            'var' => 'notificationMuteExpiration',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        12 => array(
            'var' => 'notificationNewMessage',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        13 => array(
            'var' => 'notificationGroupInvitation',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        14 => array(
            'var' => 'notificationShowMessage',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        15 => array(
            'var' => 'notificationIncomingCall',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        16 => array(
            'var' => 'notificationSoundMessage',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        17 => array(
            'var' => 'notificationSoundGroup',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        18 => array(
            'var' => 'notificationDisabledWithSub',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        20 => array(
            'var' => 'privacySyncContacts',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        21 => array(
            'var' => 'privacySearchByPhoneNumber',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        22 => array(
            'var' => 'privacySearchByUserid',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        23 => array(
            'var' => 'privacySearchByEmail',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        24 => array(
            'var' => 'privacyAllowSecondaryDeviceLogin',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        25 => array(
            'var' => 'privacyProfileImagePostToMyhome',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        26 => array(
            'var' => 'privacyReceiveMessagesFromNotFriend',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        30 => array(
            'var' => 'contactMyTicket',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        40 => array(
            'var' => 'identityProvider',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        41 => array(
            'var' => 'identityIdentifier',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        42 => array(
            'var' => 'snsAccounts',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::I32,
            'vtype' => TType::STRING,
            'key' => array(
                'type' => TType::I32,
            ),
            'val' => array(
                'type' => TType::STRING,
                ),
        ),
        43 => array(
            'var' => 'phoneRegistration',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        44 => array(
            'var' => 'emailConfirmationStatus',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        50 => array(
            'var' => 'preferenceLocale',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        60 => array(
            'var' => 'customModes',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::I32,
            'vtype' => TType::STRING,
            'key' => array(
                'type' => TType::I32,
            ),
            'val' => array(
                'type' => TType::STRING,
                ),
        ),
        61 => array(
            'var' => 'e2eeEnable',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        62 => array(
            'var' => 'hitokotoBackupRequested',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        63 => array(
            'var' => 'privacyProfileMusicPostToMyhome',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        65 => array(
            'var' => 'privacyAllowNearby',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        66 => array(
            'var' => 'agreementNearbyTime',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        67 => array(
            'var' => 'agreementSquareTime',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        68 => array(
            'var' => 'notificationMention',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        69 => array(
            'var' => 'botUseAgreementAcceptedAt',
            'isRequired' => false,
            'type' => TType::I64,
        ),
    );

    /**
     * @var bool
     */
    public $notificationEnable = null;
    /**
     * @var int
     */
    public $notificationMuteExpiration = null;
    /**
     * @var bool
     */
    public $notificationNewMessage = null;
    /**
     * @var bool
     */
    public $notificationGroupInvitation = null;
    /**
     * @var bool
     */
    public $notificationShowMessage = null;
    /**
     * @var bool
     */
    public $notificationIncomingCall = null;
    /**
     * @var string
     */
    public $notificationSoundMessage = null;
    /**
     * @var string
     */
    public $notificationSoundGroup = null;
    /**
     * @var bool
     */
    public $notificationDisabledWithSub = null;
    /**
     * @var bool
     */
    public $privacySyncContacts = null;
    /**
     * @var bool
     */
    public $privacySearchByPhoneNumber = null;
    /**
     * @var bool
     */
    public $privacySearchByUserid = null;
    /**
     * @var bool
     */
    public $privacySearchByEmail = null;
    /**
     * @var bool
     */
    public $privacyAllowSecondaryDeviceLogin = null;
    /**
     * @var bool
     */
    public $privacyProfileImagePostToMyhome = null;
    /**
     * @var bool
     */
    public $privacyReceiveMessagesFromNotFriend = null;
    /**
     * @var string
     */
    public $contactMyTicket = null;
    /**
     * @var int
     */
    public $identityProvider = null;
    /**
     * @var string
     */
    public $identityIdentifier = null;
    /**
     * @var array
     */
    public $snsAccounts = null;
    /**
     * @var bool
     */
    public $phoneRegistration = null;
    /**
     * @var int
     */
    public $emailConfirmationStatus = null;
    /**
     * @var string
     */
    public $preferenceLocale = null;
    /**
     * @var array
     */
    public $customModes = null;
    /**
     * @var bool
     */
    public $e2eeEnable = null;
    /**
     * @var bool
     */
    public $hitokotoBackupRequested = null;
    /**
     * @var bool
     */
    public $privacyProfileMusicPostToMyhome = null;
    /**
     * @var bool
     */
    public $privacyAllowNearby = null;
    /**
     * @var int
     */
    public $agreementNearbyTime = null;
    /**
     * @var int
     */
    public $agreementSquareTime = null;
    /**
     * @var bool
     */
    public $notificationMention = null;
    /**
     * @var int
     */
    public $botUseAgreementAcceptedAt = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['notificationEnable'])) {
                $this->notificationEnable = $vals['notificationEnable'];
            }
            if (isset($vals['notificationMuteExpiration'])) {
                $this->notificationMuteExpiration = $vals['notificationMuteExpiration'];
            }
            if (isset($vals['notificationNewMessage'])) {
                $this->notificationNewMessage = $vals['notificationNewMessage'];
            }
            if (isset($vals['notificationGroupInvitation'])) {
                $this->notificationGroupInvitation = $vals['notificationGroupInvitation'];
            }
            if (isset($vals['notificationShowMessage'])) {
                $this->notificationShowMessage = $vals['notificationShowMessage'];
            }
            if (isset($vals['notificationIncomingCall'])) {
                $this->notificationIncomingCall = $vals['notificationIncomingCall'];
            }
            if (isset($vals['notificationSoundMessage'])) {
                $this->notificationSoundMessage = $vals['notificationSoundMessage'];
            }
            if (isset($vals['notificationSoundGroup'])) {
                $this->notificationSoundGroup = $vals['notificationSoundGroup'];
            }
            if (isset($vals['notificationDisabledWithSub'])) {
                $this->notificationDisabledWithSub = $vals['notificationDisabledWithSub'];
            }
            if (isset($vals['privacySyncContacts'])) {
                $this->privacySyncContacts = $vals['privacySyncContacts'];
            }
            if (isset($vals['privacySearchByPhoneNumber'])) {
                $this->privacySearchByPhoneNumber = $vals['privacySearchByPhoneNumber'];
            }
            if (isset($vals['privacySearchByUserid'])) {
                $this->privacySearchByUserid = $vals['privacySearchByUserid'];
            }
            if (isset($vals['privacySearchByEmail'])) {
                $this->privacySearchByEmail = $vals['privacySearchByEmail'];
            }
            if (isset($vals['privacyAllowSecondaryDeviceLogin'])) {
                $this->privacyAllowSecondaryDeviceLogin = $vals['privacyAllowSecondaryDeviceLogin'];
            }
            if (isset($vals['privacyProfileImagePostToMyhome'])) {
                $this->privacyProfileImagePostToMyhome = $vals['privacyProfileImagePostToMyhome'];
            }
            if (isset($vals['privacyReceiveMessagesFromNotFriend'])) {
                $this->privacyReceiveMessagesFromNotFriend = $vals['privacyReceiveMessagesFromNotFriend'];
            }
            if (isset($vals['contactMyTicket'])) {
                $this->contactMyTicket = $vals['contactMyTicket'];
            }
            if (isset($vals['identityProvider'])) {
                $this->identityProvider = $vals['identityProvider'];
            }
            if (isset($vals['identityIdentifier'])) {
                $this->identityIdentifier = $vals['identityIdentifier'];
            }
            if (isset($vals['snsAccounts'])) {
                $this->snsAccounts = $vals['snsAccounts'];
            }
            if (isset($vals['phoneRegistration'])) {
                $this->phoneRegistration = $vals['phoneRegistration'];
            }
            if (isset($vals['emailConfirmationStatus'])) {
                $this->emailConfirmationStatus = $vals['emailConfirmationStatus'];
            }
            if (isset($vals['preferenceLocale'])) {
                $this->preferenceLocale = $vals['preferenceLocale'];
            }
            if (isset($vals['customModes'])) {
                $this->customModes = $vals['customModes'];
            }
            if (isset($vals['e2eeEnable'])) {
                $this->e2eeEnable = $vals['e2eeEnable'];
            }
            if (isset($vals['hitokotoBackupRequested'])) {
                $this->hitokotoBackupRequested = $vals['hitokotoBackupRequested'];
            }
            if (isset($vals['privacyProfileMusicPostToMyhome'])) {
                $this->privacyProfileMusicPostToMyhome = $vals['privacyProfileMusicPostToMyhome'];
            }
            if (isset($vals['privacyAllowNearby'])) {
                $this->privacyAllowNearby = $vals['privacyAllowNearby'];
            }
            if (isset($vals['agreementNearbyTime'])) {
                $this->agreementNearbyTime = $vals['agreementNearbyTime'];
            }
            if (isset($vals['agreementSquareTime'])) {
                $this->agreementSquareTime = $vals['agreementSquareTime'];
            }
            if (isset($vals['notificationMention'])) {
                $this->notificationMention = $vals['notificationMention'];
            }
            if (isset($vals['botUseAgreementAcceptedAt'])) {
                $this->botUseAgreementAcceptedAt = $vals['botUseAgreementAcceptedAt'];
            }
        }
    }

    public function getName()
    {
        return 'Settings';
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
                case 10:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->notificationEnable);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 11:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->notificationMuteExpiration);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 12:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->notificationNewMessage);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 13:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->notificationGroupInvitation);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 14:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->notificationShowMessage);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 15:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->notificationIncomingCall);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 16:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->notificationSoundMessage);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 17:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->notificationSoundGroup);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 18:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->notificationDisabledWithSub);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 20:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->privacySyncContacts);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 21:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->privacySearchByPhoneNumber);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 22:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->privacySearchByUserid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 23:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->privacySearchByEmail);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 24:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->privacyAllowSecondaryDeviceLogin);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 25:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->privacyProfileImagePostToMyhome);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 26:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->privacyReceiveMessagesFromNotFriend);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 30:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->contactMyTicket);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 40:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->identityProvider);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 41:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->identityIdentifier);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 42:
                    if ($ftype == TType::MAP) {
                        $this->snsAccounts = array();
                        $_size427 = 0;
                        $_ktype428 = 0;
                        $_vtype429 = 0;
                        $xfer += $input->readMapBegin($_ktype428, $_vtype429, $_size427);
                        for ($_i431 = 0; $_i431 < $_size427; ++$_i431) {
                            $key432 = 0;
                            $val433 = '';
                            $xfer += $input->readI32($key432);
                            $xfer += $input->readString($val433);
                            $this->snsAccounts[$key432] = $val433;
                        }
                        $xfer += $input->readMapEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 43:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->phoneRegistration);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 44:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->emailConfirmationStatus);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 50:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->preferenceLocale);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 60:
                    if ($ftype == TType::MAP) {
                        $this->customModes = array();
                        $_size434 = 0;
                        $_ktype435 = 0;
                        $_vtype436 = 0;
                        $xfer += $input->readMapBegin($_ktype435, $_vtype436, $_size434);
                        for ($_i438 = 0; $_i438 < $_size434; ++$_i438) {
                            $key439 = 0;
                            $val440 = '';
                            $xfer += $input->readI32($key439);
                            $xfer += $input->readString($val440);
                            $this->customModes[$key439] = $val440;
                        }
                        $xfer += $input->readMapEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 61:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->e2eeEnable);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 62:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->hitokotoBackupRequested);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 63:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->privacyProfileMusicPostToMyhome);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 65:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->privacyAllowNearby);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 66:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->agreementNearbyTime);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 67:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->agreementSquareTime);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 68:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->notificationMention);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 69:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->botUseAgreementAcceptedAt);
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
        $xfer += $output->writeStructBegin('Settings');
        if ($this->notificationEnable !== null) {
            $xfer += $output->writeFieldBegin('notificationEnable', TType::BOOL, 10);
            $xfer += $output->writeBool($this->notificationEnable);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->notificationMuteExpiration !== null) {
            $xfer += $output->writeFieldBegin('notificationMuteExpiration', TType::I64, 11);
            $xfer += $output->writeI64($this->notificationMuteExpiration);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->notificationNewMessage !== null) {
            $xfer += $output->writeFieldBegin('notificationNewMessage', TType::BOOL, 12);
            $xfer += $output->writeBool($this->notificationNewMessage);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->notificationGroupInvitation !== null) {
            $xfer += $output->writeFieldBegin('notificationGroupInvitation', TType::BOOL, 13);
            $xfer += $output->writeBool($this->notificationGroupInvitation);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->notificationShowMessage !== null) {
            $xfer += $output->writeFieldBegin('notificationShowMessage', TType::BOOL, 14);
            $xfer += $output->writeBool($this->notificationShowMessage);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->notificationIncomingCall !== null) {
            $xfer += $output->writeFieldBegin('notificationIncomingCall', TType::BOOL, 15);
            $xfer += $output->writeBool($this->notificationIncomingCall);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->notificationSoundMessage !== null) {
            $xfer += $output->writeFieldBegin('notificationSoundMessage', TType::STRING, 16);
            $xfer += $output->writeString($this->notificationSoundMessage);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->notificationSoundGroup !== null) {
            $xfer += $output->writeFieldBegin('notificationSoundGroup', TType::STRING, 17);
            $xfer += $output->writeString($this->notificationSoundGroup);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->notificationDisabledWithSub !== null) {
            $xfer += $output->writeFieldBegin('notificationDisabledWithSub', TType::BOOL, 18);
            $xfer += $output->writeBool($this->notificationDisabledWithSub);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->privacySyncContacts !== null) {
            $xfer += $output->writeFieldBegin('privacySyncContacts', TType::BOOL, 20);
            $xfer += $output->writeBool($this->privacySyncContacts);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->privacySearchByPhoneNumber !== null) {
            $xfer += $output->writeFieldBegin('privacySearchByPhoneNumber', TType::BOOL, 21);
            $xfer += $output->writeBool($this->privacySearchByPhoneNumber);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->privacySearchByUserid !== null) {
            $xfer += $output->writeFieldBegin('privacySearchByUserid', TType::BOOL, 22);
            $xfer += $output->writeBool($this->privacySearchByUserid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->privacySearchByEmail !== null) {
            $xfer += $output->writeFieldBegin('privacySearchByEmail', TType::BOOL, 23);
            $xfer += $output->writeBool($this->privacySearchByEmail);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->privacyAllowSecondaryDeviceLogin !== null) {
            $xfer += $output->writeFieldBegin('privacyAllowSecondaryDeviceLogin', TType::BOOL, 24);
            $xfer += $output->writeBool($this->privacyAllowSecondaryDeviceLogin);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->privacyProfileImagePostToMyhome !== null) {
            $xfer += $output->writeFieldBegin('privacyProfileImagePostToMyhome', TType::BOOL, 25);
            $xfer += $output->writeBool($this->privacyProfileImagePostToMyhome);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->privacyReceiveMessagesFromNotFriend !== null) {
            $xfer += $output->writeFieldBegin('privacyReceiveMessagesFromNotFriend', TType::BOOL, 26);
            $xfer += $output->writeBool($this->privacyReceiveMessagesFromNotFriend);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->contactMyTicket !== null) {
            $xfer += $output->writeFieldBegin('contactMyTicket', TType::STRING, 30);
            $xfer += $output->writeString($this->contactMyTicket);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->identityProvider !== null) {
            $xfer += $output->writeFieldBegin('identityProvider', TType::I32, 40);
            $xfer += $output->writeI32($this->identityProvider);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->identityIdentifier !== null) {
            $xfer += $output->writeFieldBegin('identityIdentifier', TType::STRING, 41);
            $xfer += $output->writeString($this->identityIdentifier);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->snsAccounts !== null) {
            if (!is_array($this->snsAccounts)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('snsAccounts', TType::MAP, 42);
            $output->writeMapBegin(TType::I32, TType::STRING, count($this->snsAccounts));
            foreach ($this->snsAccounts as $kiter441 => $viter442) {
                $xfer += $output->writeI32($kiter441);
                $xfer += $output->writeString($viter442);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->phoneRegistration !== null) {
            $xfer += $output->writeFieldBegin('phoneRegistration', TType::BOOL, 43);
            $xfer += $output->writeBool($this->phoneRegistration);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->emailConfirmationStatus !== null) {
            $xfer += $output->writeFieldBegin('emailConfirmationStatus', TType::I32, 44);
            $xfer += $output->writeI32($this->emailConfirmationStatus);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->preferenceLocale !== null) {
            $xfer += $output->writeFieldBegin('preferenceLocale', TType::STRING, 50);
            $xfer += $output->writeString($this->preferenceLocale);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->customModes !== null) {
            if (!is_array($this->customModes)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('customModes', TType::MAP, 60);
            $output->writeMapBegin(TType::I32, TType::STRING, count($this->customModes));
            foreach ($this->customModes as $kiter443 => $viter444) {
                $xfer += $output->writeI32($kiter443);
                $xfer += $output->writeString($viter444);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->e2eeEnable !== null) {
            $xfer += $output->writeFieldBegin('e2eeEnable', TType::BOOL, 61);
            $xfer += $output->writeBool($this->e2eeEnable);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->hitokotoBackupRequested !== null) {
            $xfer += $output->writeFieldBegin('hitokotoBackupRequested', TType::BOOL, 62);
            $xfer += $output->writeBool($this->hitokotoBackupRequested);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->privacyProfileMusicPostToMyhome !== null) {
            $xfer += $output->writeFieldBegin('privacyProfileMusicPostToMyhome', TType::BOOL, 63);
            $xfer += $output->writeBool($this->privacyProfileMusicPostToMyhome);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->privacyAllowNearby !== null) {
            $xfer += $output->writeFieldBegin('privacyAllowNearby', TType::BOOL, 65);
            $xfer += $output->writeBool($this->privacyAllowNearby);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->agreementNearbyTime !== null) {
            $xfer += $output->writeFieldBegin('agreementNearbyTime', TType::I64, 66);
            $xfer += $output->writeI64($this->agreementNearbyTime);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->agreementSquareTime !== null) {
            $xfer += $output->writeFieldBegin('agreementSquareTime', TType::I64, 67);
            $xfer += $output->writeI64($this->agreementSquareTime);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->notificationMention !== null) {
            $xfer += $output->writeFieldBegin('notificationMention', TType::BOOL, 68);
            $xfer += $output->writeBool($this->notificationMention);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->botUseAgreementAcceptedAt !== null) {
            $xfer += $output->writeFieldBegin('botUseAgreementAcceptedAt', TType::I64, 69);
            $xfer += $output->writeI64($this->botUseAgreementAcceptedAt);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
