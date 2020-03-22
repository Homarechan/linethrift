/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.square_event_notified_destroy_message;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SquareEventNotifiedDestroyMessage implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SquareEventNotifiedDestroyMessage");
  static final TField _SQUARE_CHAT_MID_FIELD_DESC = new TField("squareChatMid", TType.STRING, 1);
  static final TField _MESSAGE_ID_FIELD_DESC = new TField("messageId", TType.STRING, 3);

  String _squareChatMid;
  static const int SQUARECHATMID = 1;
  String _messageId;
  static const int MESSAGEID = 3;


  SquareEventNotifiedDestroyMessage() {
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

  // messageId
  String get messageId => this._messageId;

  set messageId(String messageId) {
    this._messageId = messageId;
  }

  bool isSetMessageId() => this.messageId != null;

  unsetMessageId() {
    this.messageId = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SQUARECHATMID:
        return this.squareChatMid;
      case MESSAGEID:
        return this.messageId;
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

      case MESSAGEID:
        if (value == null) {
          unsetMessageId();
        } else {
          this.messageId = value;
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
      case MESSAGEID:
        return isSetMessageId();
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
        case MESSAGEID:
          if (field.type == TType.STRING) {
            this.messageId = iprot.readString();
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
    if (this.messageId != null) {
      oprot.writeFieldBegin(_MESSAGE_ID_FIELD_DESC);
      oprot.writeString(this.messageId);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SquareEventNotifiedDestroyMessage(");

    ret.write("squareChatMid:");
    if (this.squareChatMid == null) {
      ret.write("null");
    } else {
      ret.write(this.squareChatMid);
    }

    ret.write(", ");
    ret.write("messageId:");
    if (this.messageId == null) {
      ret.write("null");
    } else {
      ret.write(this.messageId);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

