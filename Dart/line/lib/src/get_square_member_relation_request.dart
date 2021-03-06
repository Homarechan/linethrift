/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.get_square_member_relation_request;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class GetSquareMemberRelationRequest implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("GetSquareMemberRelationRequest");
  static final TField _SQUARE_MID_FIELD_DESC = new TField("squareMid", TType.STRING, 2);
  static final TField _TARGET_SQUARE_MEMBER_MID_FIELD_DESC = new TField("targetSquareMemberMid", TType.STRING, 3);

  String _squareMid;
  static const int SQUAREMID = 2;
  String _targetSquareMemberMid;
  static const int TARGETSQUAREMEMBERMID = 3;


  GetSquareMemberRelationRequest() {
  }

  // squareMid
  String get squareMid => this._squareMid;

  set squareMid(String squareMid) {
    this._squareMid = squareMid;
  }

  bool isSetSquareMid() => this.squareMid != null;

  unsetSquareMid() {
    this.squareMid = null;
  }

  // targetSquareMemberMid
  String get targetSquareMemberMid => this._targetSquareMemberMid;

  set targetSquareMemberMid(String targetSquareMemberMid) {
    this._targetSquareMemberMid = targetSquareMemberMid;
  }

  bool isSetTargetSquareMemberMid() => this.targetSquareMemberMid != null;

  unsetTargetSquareMemberMid() {
    this.targetSquareMemberMid = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SQUAREMID:
        return this.squareMid;
      case TARGETSQUAREMEMBERMID:
        return this.targetSquareMemberMid;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case SQUAREMID:
        if (value == null) {
          unsetSquareMid();
        } else {
          this.squareMid = value;
        }
        break;

      case TARGETSQUAREMEMBERMID:
        if (value == null) {
          unsetTargetSquareMemberMid();
        } else {
          this.targetSquareMemberMid = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case SQUAREMID:
        return isSetSquareMid();
      case TARGETSQUAREMEMBERMID:
        return isSetTargetSquareMemberMid();
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
        case SQUAREMID:
          if (field.type == TType.STRING) {
            this.squareMid = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TARGETSQUAREMEMBERMID:
          if (field.type == TType.STRING) {
            this.targetSquareMemberMid = iprot.readString();
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
    if (this.squareMid != null) {
      oprot.writeFieldBegin(_SQUARE_MID_FIELD_DESC);
      oprot.writeString(this.squareMid);
      oprot.writeFieldEnd();
    }
    if (this.targetSquareMemberMid != null) {
      oprot.writeFieldBegin(_TARGET_SQUARE_MEMBER_MID_FIELD_DESC);
      oprot.writeString(this.targetSquareMemberMid);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("GetSquareMemberRelationRequest(");

    ret.write("squareMid:");
    if (this.squareMid == null) {
      ret.write("null");
    } else {
      ret.write(this.squareMid);
    }

    ret.write(", ");
    ret.write("targetSquareMemberMid:");
    if (this.targetSquareMemberMid == null) {
      ret.write("null");
    } else {
      ret.write(this.targetSquareMemberMid);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

