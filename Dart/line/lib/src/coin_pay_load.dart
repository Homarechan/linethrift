/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.coin_pay_load;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class CoinPayLoad implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("CoinPayLoad");
  static final TField _PAY_COIN_FIELD_DESC = new TField("payCoin", TType.I32, 1);
  static final TField _FREE_COIN_FIELD_DESC = new TField("freeCoin", TType.I32, 2);
  static final TField _TYPE_FIELD_DESC = new TField("type", TType.I32, 3);
  static final TField _REWARD_COIN_FIELD_DESC = new TField("rewardCoin", TType.I32, 4);

  int _payCoin = 0;
  static const int PAYCOIN = 1;
  int _freeCoin = 0;
  static const int FREECOIN = 2;
  int _type;
  static const int TYPE = 3;
  int _rewardCoin = 0;
  static const int REWARDCOIN = 4;

  bool __isset_payCoin = false;
  bool __isset_freeCoin = false;
  bool __isset_type = false;
  bool __isset_rewardCoin = false;

  CoinPayLoad() {
  }

  // payCoin
  int get payCoin => this._payCoin;

  set payCoin(int payCoin) {
    this._payCoin = payCoin;
    this.__isset_payCoin = true;
  }

  bool isSetPayCoin() => this.__isset_payCoin;

  unsetPayCoin() {
    this.__isset_payCoin = false;
  }

  // freeCoin
  int get freeCoin => this._freeCoin;

  set freeCoin(int freeCoin) {
    this._freeCoin = freeCoin;
    this.__isset_freeCoin = true;
  }

  bool isSetFreeCoin() => this.__isset_freeCoin;

  unsetFreeCoin() {
    this.__isset_freeCoin = false;
  }

  // type
  int get type => this._type;

  set type(int type) {
    this._type = type;
    this.__isset_type = true;
  }

  bool isSetType() => this.__isset_type;

  unsetType() {
    this.__isset_type = false;
  }

  // rewardCoin
  int get rewardCoin => this._rewardCoin;

  set rewardCoin(int rewardCoin) {
    this._rewardCoin = rewardCoin;
    this.__isset_rewardCoin = true;
  }

  bool isSetRewardCoin() => this.__isset_rewardCoin;

  unsetRewardCoin() {
    this.__isset_rewardCoin = false;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case PAYCOIN:
        return this.payCoin;
      case FREECOIN:
        return this.freeCoin;
      case TYPE:
        return this.type;
      case REWARDCOIN:
        return this.rewardCoin;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case PAYCOIN:
        if (value == null) {
          unsetPayCoin();
        } else {
          this.payCoin = value;
        }
        break;

      case FREECOIN:
        if (value == null) {
          unsetFreeCoin();
        } else {
          this.freeCoin = value;
        }
        break;

      case TYPE:
        if (value == null) {
          unsetType();
        } else {
          this.type = value;
        }
        break;

      case REWARDCOIN:
        if (value == null) {
          unsetRewardCoin();
        } else {
          this.rewardCoin = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case PAYCOIN:
        return isSetPayCoin();
      case FREECOIN:
        return isSetFreeCoin();
      case TYPE:
        return isSetType();
      case REWARDCOIN:
        return isSetRewardCoin();
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  read(TProtocol iprot) {
    TField field;
    iprot.readStructBegin();
    while (true) {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case PAYCOIN:
          if (field.type == TType.I32) {
            this.payCoin = iprot.readI32();
            this.__isset_payCoin = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case FREECOIN:
          if (field.type == TType.I32) {
            this.freeCoin = iprot.readI32();
            this.__isset_freeCoin = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TYPE:
          if (field.type == TType.I32) {
            this.type = iprot.readI32();
            this.__isset_type = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case REWARDCOIN:
          if (field.type == TType.I32) {
            this.rewardCoin = iprot.readI32();
            this.__isset_rewardCoin = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  write(TProtocol oprot) {
    validate();

    oprot.writeStructBegin(_STRUCT_DESC);
    oprot.writeFieldBegin(_PAY_COIN_FIELD_DESC);
    oprot.writeI32(this.payCoin);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_FREE_COIN_FIELD_DESC);
    oprot.writeI32(this.freeCoin);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_TYPE_FIELD_DESC);
    oprot.writeI32(this.type);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_REWARD_COIN_FIELD_DESC);
    oprot.writeI32(this.rewardCoin);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("CoinPayLoad(");

    ret.write("payCoin:");
    ret.write(this.payCoin);

    ret.write(", ");
    ret.write("freeCoin:");
    ret.write(this.freeCoin);

    ret.write(", ");
    ret.write("type:");
    String type_name = PayloadType.VALUES_TO_NAMES[this.type];
    if (type_name != null) {
      ret.write(type_name);
      ret.write(" (");
    }
    ret.write(this.type);
    if (type_name != null) {
      ret.write(")");
    }

    ret.write(", ");
    ret.write("rewardCoin:");
    ret.write(this.rewardCoin);

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetType() && !PayloadType.VALID_VALUES.contains(type)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'type' has been assigned the invalid value $type");
    }
  }

}

