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

class SuggestTagDictionaryRevision
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'language',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'revision',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        3 => array(
            'var' => 'scheme',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $language = null;
    /**
     * @var int
     */
    public $revision = null;
    /**
     * @var string
     */
    public $scheme = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['language'])) {
                $this->language = $vals['language'];
            }
            if (isset($vals['revision'])) {
                $this->revision = $vals['revision'];
            }
            if (isset($vals['scheme'])) {
                $this->scheme = $vals['scheme'];
            }
        }
    }

    public function getName()
    {
        return 'SuggestTagDictionaryRevision';
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
                        $xfer += $input->readString($this->language);
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
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->scheme);
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
        $xfer += $output->writeStructBegin('SuggestTagDictionaryRevision');
        if ($this->language !== null) {
            $xfer += $output->writeFieldBegin('language', TType::STRING, 1);
            $xfer += $output->writeString($this->language);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->revision !== null) {
            $xfer += $output->writeFieldBegin('revision', TType::I64, 2);
            $xfer += $output->writeI64($this->revision);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->scheme !== null) {
            $xfer += $output->writeFieldBegin('scheme', TType::STRING, 3);
            $xfer += $output->writeString($this->scheme);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
