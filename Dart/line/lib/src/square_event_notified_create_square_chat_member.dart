/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.square_event_notified_create_square_chat_member;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SquareEventNotifiedCreateSquareChatMember implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SquareEventNotifiedCreateSquareChatMember");
  static final TField _SQUARE_CHAT_MID_FIELD_DESC = new TField("squareChatMid", TType.STRING, 1);
  static final TField _SQUARE_MEMBER_MID_FIELD_DESC = new TField("squareMemberMid", TType.STRING, 2);
  static final TField _SQUARE_CHAT_MEMBER_FIELD_DESC = new TField("squareChatMember", TType.STRUCT, 3);

  String _squareChatMid;
  static const int SQUARECHATMID = 1;
  String _squareMemberMid;
  static const int SQUAREMEMBERMID = 2;
  SquareChatMember _squareChatMember;
  static const int SQUARECHATMEMBER = 3;


  SquareEventNotifiedCreateSquareChatMember() {
  }

  // squareChatMid
  String get squareChatMid => this._squareChatMid;

  set squareChatMid(String squareChatMid) {
    this._squareChatMid = squareChatMid;
  }

  bool isSetSquareChatMid() => this.squareChatMid != null;

  unsetSquareChatMid() {
    this.squareChatMid = null;
  }

  // squareMemberMid
  String get squareMemberMid => this._squareMemberMid;

  set squareMemberMid(String squareMemberMid) {
    this._squareMemberMid = squareMemberMid;
  }

  bool isSetSquareMemberMid() => this.squareMemberMid != null;

  unsetSquareMemberMid() {
    this.squareMemberMid = null;
  }

  // squareChatMember
  SquareChatMember get squareChatMember => this._squareChatMember;

  set squareChatMember(SquareChatMember squareChatMember) {
    this._squareChatMember = squareChatMember;
  }

  bool isSetSquareChatMember() => this.squareChatMember != null;

  unsetSquareChatMember() {
    this.squareChatMember = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SQUARECHATMID:
        return this.squareChatMid;
      case SQUAREMEMBERMID:
        return this.squareMemberMid;
      case SQUARECHATMEMBER:
        return this.squareChatMember;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case SQUARECHATMID:
        if (value == null) {
          unsetSquareChatMid();
        } else {
          this.squareChatMid = value;
        }
        break;

      case SQUAREMEMBERMID:
        if (value == null) {
          unsetSquareMemberMid();
        } else {
          this.squareMemberMid = value;
        }
        break;

      case SQUARECHATMEMBER:
        if (value == null) {
          unsetSquareChatMember();
        } else {
          this.squareChatMember = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case SQUARECHATMID:
        return isSetSquareChatMid();
      case SQUAREMEMBERMID:
        return isSetSquareMemberMid();
      case SQUARECHATMEMBER:
        return isSetSquareChatMember();
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
        case SQUARECHATMID:
          if (field.type == TType.STRING) {
            this.squareChatMid = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SQUAREMEMBERMID:
          if (field.type == TType.STRING) {
            this.squareMemberMid = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SQUARECHATMEMBER:
          if (field.type == TType.STRUCT) {
            this.squareChatMember = new SquareChatMember();
            this.squareChatMember.read(iprot);
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
    if (this.squareChatMid != null) {
      oprot.writeFieldBegin(_SQUARE_CHAT_MID_FIELD_DESC);
      oprot.writeString(this.squareChatMid);
      oprot.writeFieldEnd();
    }
    if (this.squareMemberMid != null) {
      oprot.writeFieldBegin(_SQUARE_MEMBER_MID_FIELD_DESC);
      oprot.writeString(this.squareMemberMid);
      oprot.writeFieldEnd();
    }
    if (this.squareChatMember != null) {
      oprot.writeFieldBegin(_SQUARE_CHAT_MEMBER_FIELD_DESC);
      this.squareChatMember.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SquareEventNotifiedCreateSquareChatMember(");

    ret.write("squareChatMid:");
    if (this.squareChatMid == null) {
      ret.write("null");
    } else {
      ret.write(this.squareChatMid);
    }

    ret.write(", ");
    ret.write("squareMemberMid:");
    if (this.squareMemberMid == null) {
      ret.write("null");
    } else {
      ret.write(this.squareMemberMid);
    }

    ret.write(", ");
    ret.write("squareChatMember:");
    if (this.squareChatMember == null) {
      ret.write("null");
    } else {
      ret.write(this.squareChatMember);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

