/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.square_event_receive_message;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SquareEventReceiveMessage implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SquareEventReceiveMessage");
  static final TField _SQUARE_CHAT_MID_FIELD_DESC = new TField("squareChatMid", TType.STRING, 1);
  static final TField _SQUARE_MESSAGE_FIELD_DESC = new TField("squareMessage", TType.STRUCT, 2);

  String _squareChatMid;
  static const int SQUARECHATMID = 1;
  SquareMessage _squareMessage;
  static const int SQUAREMESSAGE = 2;


  SquareEventReceiveMessage() {
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

  // squareMessage
  SquareMessage get squareMessage => this._squareMessage;

  set squareMessage(SquareMessage squareMessage) {
    this._squareMessage = squareMessage;
  }

  bool isSetSquareMessage() => this.squareMessage != null;

  unsetSquareMessage() {
    this.squareMessage = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SQUARECHATMID:
        return this.squareChatMid;
      case SQUAREMESSAGE:
        return this.squareMessage;
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

      case SQUAREMESSAGE:
        if (value == null) {
          unsetSquareMessage();
        } else {
          this.squareMessage = value;
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
      case SQUAREMESSAGE:
        return isSetSquareMessage();
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
        case SQUAREMESSAGE:
          if (field.type == TType.STRUCT) {
            this.squareMessage = new SquareMessage();
            this.squareMessage.read(iprot);
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
    if (this.squareMessage != null) {
      oprot.writeFieldBegin(_SQUARE_MESSAGE_FIELD_DESC);
      this.squareMessage.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SquareEventReceiveMessage(");

    ret.write("squareChatMid:");
    if (this.squareChatMid == null) {
      ret.write("null");
    } else {
      ret.write(this.squareChatMid);
    }

    ret.write(", ");
    ret.write("squareMessage:");
    if (this.squareMessage == null) {
      ret.write("null");
    } else {
      ret.write(this.squareMessage);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

