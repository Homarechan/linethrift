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

class Contact
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'mid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'createdTime',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        10 => array(
            'var' => 'type',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        11 => array(
            'var' => 'status',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        21 => array(
            'var' => 'relation',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        22 => array(
            'var' => 'displayName',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        23 => array(
            'var' => 'phoneticName',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        24 => array(
            'var' => 'pictureStatus',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        25 => array(
            'var' => 'thumbnailUrl',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        26 => array(
            'var' => 'statusMessage',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        27 => array(
            'var' => 'displayNameOverridden',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        28 => array(
            'var' => 'favoriteTime',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        31 => array(
            'var' => 'capableVoiceCall',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        32 => array(
            'var' => 'capableVideoCall',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        33 => array(
            'var' => 'capableMyhome',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        34 => array(
            'var' => 'capableBuddy',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        35 => array(
            'var' => 'attributes',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        36 => array(
            'var' => 'settings',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        37 => array(
            'var' => 'picturePath',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        38 => array(
            'var' => 'recommendParams',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        39 => array(
            'var' => 'friendRequestStatus',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        40 => array(
            'var' => 'musicProfile',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        42 => array(
            'var' => 'videoProfile',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $mid = null;
    /**
     * @var int
     */
    public $createdTime = null;
    /**
     * @var int
     */
    public $type = null;
    /**
     * @var int
     */
    public $status = null;
    /**
     * @var int
     */
    public $relation = null;
    /**
     * @var string
     */
    public $displayName = null;
    /**
     * @var string
     */
    public $phoneticName = null;
    /**
     * @var string
     */
    public $pictureStatus = null;
    /**
     * @var string
     */
    public $thumbnailUrl = null;
    /**
     * @var string
     */
    public $statusMessage = null;
    /**
     * @var string
     */
    public $displayNameOverridden = null;
    /**
     * @var int
     */
    public $favoriteTime = null;
    /**
     * @var bool
     */
    public $capableVoiceCall = null;
    /**
     * @var bool
     */
    public $capableVideoCall = null;
    /**
     * @var bool
     */
    public $capableMyhome = null;
    /**
     * @var bool
     */
    public $capableBuddy = null;
    /**
     * @var int
     */
    public $attributes = null;
    /**
     * @var int
     */
    public $settings = null;
    /**
     * @var string
     */
    public $picturePath = null;
    /**
     * @var string
     */
    public $recommendParams = null;
    /**
     * @var int
     */
    public $friendRequestStatus = null;
    /**
     * @var string
     */
    public $musicProfile = null;
    /**
     * @var string
     */
    public $videoProfile = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['mid'])) {
                $this->mid = $vals['mid'];
            }
            if (isset($vals['createdTime'])) {
                $this->createdTime = $vals['createdTime'];
            }
            if (isset($vals['type'])) {
                $this->type = $vals['type'];
            }
            if (isset($vals['status'])) {
                $this->status = $vals['status'];
            }
            if (isset($vals['relation'])) {
                $this->relation = $vals['relation'];
            }
            if (isset($vals['displayName'])) {
                $this->displayName = $vals['displayName'];
            }
            if (isset($vals['phoneticName'])) {
                $this->phoneticName = $vals['phoneticName'];
            }
            if (isset($vals['pictureStatus'])) {
                $this->pictureStatus = $vals['pictureStatus'];
            }
            if (isset($vals['thumbnailUrl'])) {
                $this->thumbnailUrl = $vals['thumbnailUrl'];
            }
            if (isset($vals['statusMessage'])) {
                $this->statusMessage = $vals['statusMessage'];
            }
            if (isset($vals['displayNameOverridden'])) {
                $this->displayNameOverridden = $vals['displayNameOverridden'];
            }
            if (isset($vals['favoriteTime'])) {
                $this->favoriteTime = $vals['favoriteTime'];
            }
            if (isset($vals['capableVoiceCall'])) {
                $this->capableVoiceCall = $vals['capableVoiceCall'];
            }
            if (isset($vals['capableVideoCall'])) {
                $this->capableVideoCall = $vals['capableVideoCall'];
            }
            if (isset($vals['capableMyhome'])) {
                $this->capableMyhome = $vals['capableMyhome'];
            }
            if (isset($vals['capableBuddy'])) {
                $this->capableBuddy = $vals['capableBuddy'];
            }
            if (isset($vals['attributes'])) {
                $this->attributes = $vals['attributes'];
            }
            if (isset($vals['settings'])) {
                $this->settings = $vals['settings'];
            }
            if (isset($vals['picturePath'])) {
                $this->picturePath = $vals['picturePath'];
            }
            if (isset($vals['recommendParams'])) {
                $this->recommendParams = $vals['recommendParams'];
            }
            if (isset($vals['friendRequestStatus'])) {
                $this->friendRequestStatus = $vals['friendRequestStatus'];
            }
            if (isset($vals['musicProfile'])) {
                $this->musicProfile = $vals['musicProfile'];
            }
            if (isset($vals['videoProfile'])) {
                $this->videoProfile = $vals['videoProfile'];
            }
        }
    }

    public function getName()
    {
        return 'Contact';
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
                        $xfer += $input->readI64($this->createdTime);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 10:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->type);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 11:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->status);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 21:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->relation);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 22:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->displayName);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 23:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->phoneticName);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 24:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->pictureStatus);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 25:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->thumbnailUrl);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 26:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->statusMessage);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 27:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->displayNameOverridden);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 28:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->favoriteTime);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 31:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->capableVoiceCall);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 32:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->capableVideoCall);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 33:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->capableMyhome);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 34:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->capableBuddy);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 35:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->attributes);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 36:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->settings);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 37:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->picturePath);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 38:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->recommendParams);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 39:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->friendRequestStatus);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 40:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->musicProfile);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 42:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->videoProfile);
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
        $xfer += $output->writeStructBegin('Contact');
        if ($this->mid !== null) {
            $xfer += $output->writeFieldBegin('mid', TType::STRING, 1);
            $xfer += $output->writeString($this->mid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->createdTime !== null) {
            $xfer += $output->writeFieldBegin('createdTime', TType::I64, 2);
            $xfer += $output->writeI64($this->createdTime);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->type !== null) {
            $xfer += $output->writeFieldBegin('type', TType::I32, 10);
            $xfer += $output->writeI32($this->type);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->status !== null) {
            $xfer += $output->writeFieldBegin('status', TType::I32, 11);
            $xfer += $output->writeI32($this->status);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->relation !== null) {
            $xfer += $output->writeFieldBegin('relation', TType::I32, 21);
            $xfer += $output->writeI32($this->relation);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->displayName !== null) {
            $xfer += $output->writeFieldBegin('displayName', TType::STRING, 22);
            $xfer += $output->writeString($this->displayName);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->phoneticName !== null) {
            $xfer += $output->writeFieldBegin('phoneticName', TType::STRING, 23);
            $xfer += $output->writeString($this->phoneticName);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->pictureStatus !== null) {
            $xfer += $output->writeFieldBegin('pictureStatus', TType::STRING, 24);
            $xfer += $output->writeString($this->pictureStatus);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->thumbnailUrl !== null) {
            $xfer += $output->writeFieldBegin('thumbnailUrl', TType::STRING, 25);
            $xfer += $output->writeString($this->thumbnailUrl);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->statusMessage !== null) {
            $xfer += $output->writeFieldBegin('statusMessage', TType::STRING, 26);
            $xfer += $output->writeString($this->statusMessage);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->displayNameOverridden !== null) {
            $xfer += $output->writeFieldBegin('displayNameOverridden', TType::STRING, 27);
            $xfer += $output->writeString($this->displayNameOverridden);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->favoriteTime !== null) {
            $xfer += $output->writeFieldBegin('favoriteTime', TType::I64, 28);
            $xfer += $output->writeI64($this->favoriteTime);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->capableVoiceCall !== null) {
            $xfer += $output->writeFieldBegin('capableVoiceCall', TType::BOOL, 31);
            $xfer += $output->writeBool($this->capableVoiceCall);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->capableVideoCall !== null) {
            $xfer += $output->writeFieldBegin('capableVideoCall', TType::BOOL, 32);
            $xfer += $output->writeBool($this->capableVideoCall);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->capableMyhome !== null) {
            $xfer += $output->writeFieldBegin('capableMyhome', TType::BOOL, 33);
            $xfer += $output->writeBool($this->capableMyhome);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->capableBuddy !== null) {
            $xfer += $output->writeFieldBegin('capableBuddy', TType::BOOL, 34);
            $xfer += $output->writeBool($this->capableBuddy);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->attributes !== null) {
            $xfer += $output->writeFieldBegin('attributes', TType::I32, 35);
            $xfer += $output->writeI32($this->attributes);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->settings !== null) {
            $xfer += $output->writeFieldBegin('settings', TType::I64, 36);
            $xfer += $output->writeI64($this->settings);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->picturePath !== null) {
            $xfer += $output->writeFieldBegin('picturePath', TType::STRING, 37);
            $xfer += $output->writeString($this->picturePath);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->recommendParams !== null) {
            $xfer += $output->writeFieldBegin('recommendParams', TType::STRING, 38);
            $xfer += $output->writeString($this->recommendParams);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->friendRequestStatus !== null) {
            $xfer += $output->writeFieldBegin('friendRequestStatus', TType::I32, 39);
            $xfer += $output->writeI32($this->friendRequestStatus);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->musicProfile !== null) {
            $xfer += $output->writeFieldBegin('musicProfile', TType::STRING, 40);
            $xfer += $output->writeString($this->musicProfile);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->videoProfile !== null) {
            $xfer += $output->writeFieldBegin('videoProfile', TType::STRING, 42);
            $xfer += $output->writeString($this->videoProfile);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
