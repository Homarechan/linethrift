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

class GetJoinedSquareChatsResponse
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'chats',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\SquareChat',
                ),
        ),
        2 => array(
            'var' => 'chatMembers',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::STRING,
            'vtype' => TType::STRUCT,
            'key' => array(
                'type' => TType::STRING,
            ),
            'val' => array(
                'type' => TType::STRUCT,
                'class' => '\SquareChatMember',
                ),
        ),
        3 => array(
            'var' => 'statuses',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::STRING,
            'vtype' => TType::STRUCT,
            'key' => array(
                'type' => TType::STRING,
            ),
            'val' => array(
                'type' => TType::STRUCT,
                'class' => '\SquareChatStatus',
                ),
        ),
        4 => array(
            'var' => 'continuationToken',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var \SquareChat[]
     */
    public $chats = null;
    /**
     * @var array
     */
    public $chatMembers = null;
    /**
     * @var array
     */
    public $statuses = null;
    /**
     * @var string
     */
    public $continuationToken = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['chats'])) {
                $this->chats = $vals['chats'];
            }
            if (isset($vals['chatMembers'])) {
                $this->chatMembers = $vals['chatMembers'];
            }
            if (isset($vals['statuses'])) {
                $this->statuses = $vals['statuses'];
            }
            if (isset($vals['continuationToken'])) {
                $this->continuationToken = $vals['continuationToken'];
            }
        }
    }

    public function getName()
    {
        return 'GetJoinedSquareChatsResponse';
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
                        $this->chats = array();
                        $_size908 = 0;
                        $_etype911 = 0;
                        $xfer += $input->readListBegin($_etype911, $_size908);
                        for ($_i912 = 0; $_i912 < $_size908; ++$_i912) {
                            $elem913 = null;
                            $elem913 = new \SquareChat();
                            $xfer += $elem913->read($input);
                            $this->chats []= $elem913;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::MAP) {
                        $this->chatMembers = array();
                        $_size914 = 0;
                        $_ktype915 = 0;
                        $_vtype916 = 0;
                        $xfer += $input->readMapBegin($_ktype915, $_vtype916, $_size914);
                        for ($_i918 = 0; $_i918 < $_size914; ++$_i918) {
                            $key919 = '';
                            $val920 = new \SquareChatMember();
                            $xfer += $input->readString($key919);
                            $val920 = new \SquareChatMember();
                            $xfer += $val920->read($input);
                            $this->chatMembers[$key919] = $val920;
                        }
                        $xfer += $input->readMapEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::MAP) {
                        $this->statuses = array();
                        $_size921 = 0;
                        $_ktype922 = 0;
                        $_vtype923 = 0;
                        $xfer += $input->readMapBegin($_ktype922, $_vtype923, $_size921);
                        for ($_i925 = 0; $_i925 < $_size921; ++$_i925) {
                            $key926 = '';
                            $val927 = new \SquareChatStatus();
                            $xfer += $input->readString($key926);
                            $val927 = new \SquareChatStatus();
                            $xfer += $val927->read($input);
                            $this->statuses[$key926] = $val927;
                        }
                        $xfer += $input->readMapEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->continuationToken);
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
        $xfer += $output->writeStructBegin('GetJoinedSquareChatsResponse');
        if ($this->chats !== null) {
            if (!is_array($this->chats)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('chats', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->chats));
            foreach ($this->chats as $iter928) {
                $xfer += $iter928->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->chatMembers !== null) {
            if (!is_array($this->chatMembers)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('chatMembers', TType::MAP, 2);
            $output->writeMapBegin(TType::STRING, TType::STRUCT, count($this->chatMembers));
            foreach ($this->chatMembers as $kiter929 => $viter930) {
                $xfer += $output->writeString($kiter929);
                $xfer += $viter930->write($output);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->statuses !== null) {
            if (!is_array($this->statuses)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('statuses', TType::MAP, 3);
            $output->writeMapBegin(TType::STRING, TType::STRUCT, count($this->statuses));
            foreach ($this->statuses as $kiter931 => $viter932) {
                $xfer += $output->writeString($kiter931);
                $xfer += $viter932->write($output);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->continuationToken !== null) {
            $xfer += $output->writeFieldBegin('continuationToken', TType::STRING, 4);
            $xfer += $output->writeString($this->continuationToken);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
