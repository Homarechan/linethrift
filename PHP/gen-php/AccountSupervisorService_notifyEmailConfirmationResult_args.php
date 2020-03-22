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

class AccountSupervisorService_notifyEmailConfirmationResult_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        2 => array(
            'var' => 'parameterMap',
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
     * @var array
     */
    public $parameterMap = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['parameterMap'])) {
                $this->parameterMap = $vals['parameterMap'];
            }
        }
    }

    public function getName()
    {
        return 'AccountSupervisorService_notifyEmailConfirmationResult_args';
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
                    if ($ftype == TType::MAP) {
                        $this->parameterMap = array();
                        $_size983 = 0;
                        $_ktype984 = 0;
                        $_vtype985 = 0;
                        $xfer += $input->readMapBegin($_ktype984, $_vtype985, $_size983);
                        for ($_i987 = 0; $_i987 < $_size983; ++$_i987) {
                            $key988 = '';
                            $val989 = '';
                            $xfer += $input->readString($key988);
                            $xfer += $input->readString($val989);
                            $this->parameterMap[$key988] = $val989;
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
        $xfer += $output->writeStructBegin('AccountSupervisorService_notifyEmailConfirmationResult_args');
        if ($this->parameterMap !== null) {
            if (!is_array($this->parameterMap)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('parameterMap', TType::MAP, 2);
            $output->writeMapBegin(TType::STRING, TType::STRING, count($this->parameterMap));
            foreach ($this->parameterMap as $kiter990 => $viter991) {
                $xfer += $output->writeString($kiter990);
                $xfer += $output->writeString($viter991);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
