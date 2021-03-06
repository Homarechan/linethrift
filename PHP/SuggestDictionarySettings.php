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

class SuggestDictionarySettings
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'revision',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        2 => array(
            'var' => 'newRevision',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        3 => array(
            'var' => 'dictionaries',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\SuggestDictionary',
                ),
        ),
        4 => array(
            'var' => 'preloadedDictionaries',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
    );

    /**
     * @var int
     */
    public $revision = null;
    /**
     * @var int
     */
    public $newRevision = null;
    /**
     * @var \SuggestDictionary[]
     */
    public $dictionaries = null;
    /**
     * @var string[]
     */
    public $preloadedDictionaries = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['revision'])) {
                $this->revision = $vals['revision'];
            }
            if (isset($vals['newRevision'])) {
                $this->newRevision = $vals['newRevision'];
            }
            if (isset($vals['dictionaries'])) {
                $this->dictionaries = $vals['dictionaries'];
            }
            if (isset($vals['preloadedDictionaries'])) {
                $this->preloadedDictionaries = $vals['preloadedDictionaries'];
            }
        }
    }

    public function getName()
    {
        return 'SuggestDictionarySettings';
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
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->revision);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->newRevision);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::LST) {
                        $this->dictionaries = array();
                        $_size413 = 0;
                        $_etype416 = 0;
                        $xfer += $input->readListBegin($_etype416, $_size413);
                        for ($_i417 = 0; $_i417 < $_size413; ++$_i417) {
                            $elem418 = null;
                            $elem418 = new \SuggestDictionary();
                            $xfer += $elem418->read($input);
                            $this->dictionaries []= $elem418;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::LST) {
                        $this->preloadedDictionaries = array();
                        $_size419 = 0;
                        $_etype422 = 0;
                        $xfer += $input->readListBegin($_etype422, $_size419);
                        for ($_i423 = 0; $_i423 < $_size419; ++$_i423) {
                            $elem424 = null;
                            $xfer += $input->readString($elem424);
                            $this->preloadedDictionaries []= $elem424;
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
        $xfer += $output->writeStructBegin('SuggestDictionarySettings');
        if ($this->revision !== null) {
            $xfer += $output->writeFieldBegin('revision', TType::I64, 1);
            $xfer += $output->writeI64($this->revision);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->newRevision !== null) {
            $xfer += $output->writeFieldBegin('newRevision', TType::I64, 2);
            $xfer += $output->writeI64($this->newRevision);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->dictionaries !== null) {
            if (!is_array($this->dictionaries)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('dictionaries', TType::LST, 3);
            $output->writeListBegin(TType::STRUCT, count($this->dictionaries));
            foreach ($this->dictionaries as $iter425) {
                $xfer += $iter425->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->preloadedDictionaries !== null) {
            if (!is_array($this->preloadedDictionaries)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('preloadedDictionaries', TType::LST, 4);
            $output->writeListBegin(TType::STRING, count($this->preloadedDictionaries));
            foreach ($this->preloadedDictionaries as $iter426) {
                $xfer += $output->writeString($iter426);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
