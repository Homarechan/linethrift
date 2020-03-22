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

class BuddyManagementService_registerBuddy_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'buddyId',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'searchId',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'displayName',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        5 => array(
            'var' => 'statusMeessage',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        6 => array(
            'var' => 'picture',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        7 => array(
            'var' => 'settings',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::STRING,
            'vtype' => TType::STRING,
            'key' => array(
                'type' => TType::STRING,
            ),
            'val' => array(
                'type' => TType::STRING,
                ),
        ),
    );

    /**
     * @var string
     */
    public $buddyId = null;
    /**
     * @var string
     */
    public $searchId = null;
    /**
     * @var string
     */
    public $displayName = null;
    /**
     * @var string
     */
    public $statusMeessage = null;
    /**
     * @var string
     */
    public $picture = null;
    /**
     * @var array
     */
    public $settings = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['buddyId'])) {
                $this->buddyId = $vals['buddyId'];
            }
            if (isset($vals['searchId'])) {
                $this->searchId = $vals['searchId'];
            }
            if (isset($vals['displayName'])) {
                $this->displayName = $vals['displayName'];
            }
            if (isset($vals['statusMeessage'])) {
                $this->statusMeessage = $vals['statusMeessage'];
            }
            if (isset($vals['picture'])) {
                $this->picture = $vals['picture'];
            }
            if (isset($vals['settings'])) {
                $this->settings = $vals['settings'];
            }
        }
    }

    public function getName()
    {
        return 'BuddyManagementService_registerBuddy_args';
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
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->buddyId);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->searchId);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->displayName);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->statusMeessage);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->picture);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::MAP) {
                        $this->settings = array();
                        $_size1062 = 0;
                        $_ktype1063 = 0;
                        $_vtype1064 = 0;
                        $xfer += $input->readMapBegin($_ktype1063, $_vtype1064, $_size1062);
                        for ($_i1066 = 0; $_i1066 < $_size1062; ++$_i1066) {
                            $key1067 = '';
                            $val1068 = '';
                            $xfer += $input->readString($key1067);
                            $xfer += $input->readString($val1068);
                            $this->settings[$key1067] = $val1068;
                        }
                        $xfer += $input->readMapEnd();
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
        $xfer += $output->writeStructBegin('BuddyManagementService_registerBuddy_args');
        if ($this->buddyId !== null) {
            $xfer += $output->writeFieldBegin('buddyId', TType::STRING, 2);
            $xfer += $output->writeString($this->buddyId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->searchId !== null) {
            $xfer += $output->writeFieldBegin('searchId', TType::STRING, 3);
            $xfer += $output->writeString($this->searchId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->displayName !== null) {
            $xfer += $output->writeFieldBegin('displayName', TType::STRING, 4);
            $xfer += $output->writeString($this->displayName);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->statusMeessage !== null) {
            $xfer += $output->writeFieldBegin('statusMeessage', TType::STRING, 5);
            $xfer += $output->writeString($this->statusMeessage);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->picture !== null) {
            $xfer += $output->writeFieldBegin('picture', TType::STRING, 6);
            $xfer += $output->writeString($this->picture);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->settings !== null) {
            if (!is_array($this->settings)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('settings', TType::MAP, 7);
            $output->writeMapBegin(TType::STRING, TType::STRING, count($this->settings));
            foreach ($this->settings as $kiter1069 => $viter1070) {
                $xfer += $output->writeString($kiter1069);
                $xfer += $output->writeString($viter1070);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
