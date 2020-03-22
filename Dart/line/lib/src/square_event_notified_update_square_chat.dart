/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.square_event_notified_update_square_chat;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SquareEventNotifiedUpdateSquareChat implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SquareEventNotifiedUpdateSquareChat");
  static final TField _SQUARE_MID_FIELD_DESC = new TField("squareMid", TType.STRING, 1);
  static final TField _SQUARE_CHAT_MID_FIELD_DESC = new TField("squareChatMid", TType.STRING, 2);
  static final TField _SQUARE_CHAT_FIELD_DESC = new TField("squareChat", TType.STRUCT, 3);

  String _squareMid;
  static const int SQUAREMID = 1;
  String _squareChatMid;
  static const int SQUARECHATMID = 2;
  SquareChat _squareChat;
  static const int SQUARECHAT = 3;


  SquareEventNotifiedUpdateSquareChat() {
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

  // squareChatMid
  String get squareChatMid => this._squareChatMid;

  set squareChatMid(String squareChatMid) {
    this._squareChatMid = squareChatMid;
  }

  bool isSetSquareChatMid() => this.squareChatMid != null;

  unsetSquareChatMid() {
    this.squareChatMid = null;
  }

  // squareChat
  SquareChat get squareChat => this._squareChat;

  set squareChat(SquareChat squareChat) {
    this._squareChat = squareChat;
  }

  bool isSetSquareChat() => this.squareChat != null;

  unsetSquareChat() {
    this.squareChat = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SQUAREMID:
        return this.squareMid;
      case SQUARECHATMID:
        return this.squareChatMid;
      case SQUARECHAT:
        return this.squareChat;
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

      case SQUARECHATMID:
        if (value == null) {
          unsetSquareChatMid();
        } else {
          this.squareChatMid = value;
        }
        break;

      case SQUARECHAT:
        if (value == null) {
          unsetSquareChat();
        } else {
          this.squareChat = value;
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
      case SQUARECHATMID:
        return isSetSquareChatMid();
      case SQUARECHAT:
        return isSetSquareChat();
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
        case SQUARECHATMID:
          if (field.type == TType.STRING) {
            this.squareChatMid = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SQUARECHAT:
          if (field.type == TType.STRUCT) {
            this.squareChat = new SquareChat();
            this.squareChat.read(iprot);
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
    if (this.squareChatMid != null) {
      oprot.writeFieldBegin(_SQUARE_CHAT_MID_FIELD_DESC);
      oprot.writeString(this.squareChatMid);
      oprot.writeFieldEnd();
    }
    if (this.squareChat != null) {
      oprot.writeFieldBegin(_SQUARE_CHAT_FIELD_DESC);
      this.squareChat.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SquareEventNotifiedUpdateSquareChat(");

    ret.write("squareMid:");
    if (this.squareMid == null) {
      ret.write("null");
    } else {
      ret.write(this.squareMid);
    }

    ret.write(", ");
    ret.write("squareChatMid:");
    if (this.squareChatMid == null) {
      ret.write("null");
    } else {
      ret.write(this.squareChatMid);
    }

    ret.write(", ");
    ret.write("squareChat:");
    if (this.squareChat == null) {
      ret.write("null");
    } else {
      ret.write(this.squareChat);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

