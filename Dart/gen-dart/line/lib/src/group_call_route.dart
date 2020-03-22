/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.group_call_route;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class GroupCallRoute implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("GroupCallRoute");
  static final TField _TOKEN_FIELD_DESC = new TField("token", TType.STRING, 1);
  static final TField _CSCF_FIELD_DESC = new TField("cscf", TType.STRUCT, 2);
  static final TField _MIX_FIELD_DESC = new TField("mix", TType.STRUCT, 3);

  String _token;
  static const int TOKEN = 1;
  CallHost _cscf;
  static const int CSCF = 2;
  CallHost _mix;
  static const int MIX = 3;


  GroupCallRoute() {
  }

  // token
  String get token => this._token;

  set token(String token) {
    this._token = token;
  }

  bool isSetToken() => this.token != null;

  unsetToken() {
    this.token = null;
  }

  // cscf
  CallHost get cscf => this._cscf;

  set cscf(CallHost cscf) {
    this._cscf = cscf;
  }

  bool isSetCscf() => this.cscf != null;

  unsetCscf() {
    this.cscf = null;
  }

  // mix
  CallHost get mix => this._mix;

  set mix(CallHost mix) {
    this._mix = mix;
  }

  bool isSetMix() => this.mix != null;

  unsetMix() {
    this.mix = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case TOKEN:
        return this.token;
      case CSCF:
        return this.cscf;
      case MIX:
        return this.mix;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case TOKEN:
        if (value == null) {
          unsetToken();
        } else {
          this.token = value;
        }
        break;

      case CSCF:
        if (value == null) {
          unsetCscf();
        } else {
          this.cscf = value;
        }
        break;

      case MIX:
        if (value == null) {
          unsetMix();
        } else {
          this.mix = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case TOKEN:
        return isSetToken();
      case CSCF:
        return isSetCscf();
      case MIX:
        return isSetMix();
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
        case TOKEN:
          if (field.type == TType.STRING) {
            this.token = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CSCF:
          if (field.type == TType.STRUCT) {
            this.cscf = new CallHost();
            this.cscf.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case MIX:
          if (field.type == TType.STRUCT) {
            this.mix = new CallHost();
            this.mix.read(iprot);
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
    if (this.token != null) {
      oprot.writeFieldBegin(_TOKEN_FIELD_DESC);
      oprot.writeString(this.token);
      oprot.writeFieldEnd();
    }
    if (this.cscf != null) {
      oprot.writeFieldBegin(_CSCF_FIELD_DESC);
      this.cscf.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.mix != null) {
      oprot.writeFieldBegin(_MIX_FIELD_DESC);
      this.mix.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("GroupCallRoute(");

    ret.write("token:");
    if (this.token == null) {
      ret.write("null");
    } else {
      ret.write(this.token);
    }

    ret.write(", ");
    ret.write("cscf:");
    if (this.cscf == null) {
      ret.write("null");
    } else {
      ret.write(this.cscf);
    }

    ret.write(", ");
    ret.write("mix:");
    if (this.mix == null) {
      ret.write("null");
    } else {
      ret.write(this.mix);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

