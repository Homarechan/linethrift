/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.friend_channel_matrices_response;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class FriendChannelMatricesResponse implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("FriendChannelMatricesResponse");
  static final TField _EXPIRES_FIELD_DESC = new TField("expires", TType.I64, 1);
  static final TField _MATRICES_FIELD_DESC = new TField("matrices", TType.LIST, 2);

  int _expires = 0;
  static const int EXPIRES = 1;
  List<FriendChannelMatrix> _matrices;
  static const int MATRICES = 2;

  bool __isset_expires = false;

  FriendChannelMatricesResponse() {
  }

  // expires
  int get expires => this._expires;

  set expires(int expires) {
    this._expires = expires;
    this.__isset_expires = true;
  }

  bool isSetExpires() => this.__isset_expires;

  unsetExpires() {
    this.__isset_expires = false;
  }

  // matrices
  List<FriendChannelMatrix> get matrices => this._matrices;

  set matrices(List<FriendChannelMatrix> matrices) {
    this._matrices = matrices;
  }

  bool isSetMatrices() => this.matrices != null;

  unsetMatrices() {
    this.matrices = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case EXPIRES:
        return this.expires;
      case MATRICES:
        return this.matrices;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case EXPIRES:
        if (value == null) {
          unsetExpires();
        } else {
          this.expires = value;
        }
        break;

      case MATRICES:
        if (value == null) {
          unsetMatrices();
        } else {
          this.matrices = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case EXPIRES:
        return isSetExpires();
      case MATRICES:
        return isSetMatrices();
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
        case EXPIRES:
          if (field.type == TType.I64) {
            this.expires = iprot.readI64();
            this.__isset_expires = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case MATRICES:
          if (field.type == TType.LIST) {
            {
              TList _list130 = iprot.readListBegin();
              this.matrices = new List<FriendChannelMatrix>();
              for (int _i131 = 0; _i131 < _list130.length; ++_i131) {
                FriendChannelMatrix _elem132;
                _elem132 = new FriendChannelMatrix();
                _elem132.read(iprot);
                this.matrices.add(_elem132);
              }
              iprot.readListEnd();
            }
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
    oprot.writeFieldBegin(_EXPIRES_FIELD_DESC);
    oprot.writeI64(this.expires);
    oprot.writeFieldEnd();
    if (this.matrices != null) {
      oprot.writeFieldBegin(_MATRICES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.matrices.length));
        for (var elem133 in this.matrices) {
          elem133.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("FriendChannelMatricesResponse(");

    ret.write("expires:");
    ret.write(this.expires);

    ret.write(", ");
    ret.write("matrices:");
    if (this.matrices == null) {
      ret.write("null");
    } else {
      ret.write(this.matrices);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

