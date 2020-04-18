/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.square_event_notified_delete_square_chat;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SquareEventNotifiedDeleteSquareChat implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SquareEventNotifiedDeleteSquareChat");
  static final TField _SQUARE_CHAT_FIELD_DESC = new TField("squareChat", TType.STRUCT, 1);

  SquareChat _squareChat;
  static const int SQUARECHAT = 1;


  SquareEventNotifiedDeleteSquareChat() {
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
      case SQUARECHAT:
        return this.squareChat;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
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
    if (this.squareChat != null) {
      oprot.writeFieldBegin(_SQUARE_CHAT_FIELD_DESC);
      this.squareChat.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SquareEventNotifiedDeleteSquareChat(");

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

