/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.square_chat_status;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SquareChatStatus implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SquareChatStatus");
  static final TField _LAST_MESSAGE_FIELD_DESC = new TField("lastMessage", TType.STRUCT, 3);
  static final TField _SENDER_DISPLAY_NAME_FIELD_DESC = new TField("senderDisplayName", TType.STRING, 4);
  static final TField _OTHER_STATUS_FIELD_DESC = new TField("otherStatus", TType.STRUCT, 5);

  SquareMessage _lastMessage;
  static const int LASTMESSAGE = 3;
  String _senderDisplayName;
  static const int SENDERDISPLAYNAME = 4;
  SquareChatStatusWithoutMessage _otherStatus;
  static const int OTHERSTATUS = 5;


  SquareChatStatus() {
  }

  // lastMessage
  SquareMessage get lastMessage => this._lastMessage;

  set lastMessage(SquareMessage lastMessage) {
    this._lastMessage = lastMessage;
  }

  bool isSetLastMessage() => this.lastMessage != null;

  unsetLastMessage() {
    this.lastMessage = null;
  }

  // senderDisplayName
  String get senderDisplayName => this._senderDisplayName;

  set senderDisplayName(String senderDisplayName) {
    this._senderDisplayName = senderDisplayName;
  }

  bool isSetSenderDisplayName() => this.senderDisplayName != null;

  unsetSenderDisplayName() {
    this.senderDisplayName = null;
  }

  // otherStatus
  SquareChatStatusWithoutMessage get otherStatus => this._otherStatus;

  set otherStatus(SquareChatStatusWithoutMessage otherStatus) {
    this._otherStatus = otherStatus;
  }

  bool isSetOtherStatus() => this.otherStatus != null;

  unsetOtherStatus() {
    this.otherStatus = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case LASTMESSAGE:
        return this.lastMessage;
      case SENDERDISPLAYNAME:
        return this.senderDisplayName;
      case OTHERSTATUS:
        return this.otherStatus;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case LASTMESSAGE:
        if (value == null) {
          unsetLastMessage();
        } else {
          this.lastMessage = value;
        }
        break;

      case SENDERDISPLAYNAME:
        if (value == null) {
          unsetSenderDisplayName();
        } else {
          this.senderDisplayName = value;
        }
        break;

      case OTHERSTATUS:
        if (value == null) {
          unsetOtherStatus();
        } else {
          this.otherStatus = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case LASTMESSAGE:
        return isSetLastMessage();
      case SENDERDISPLAYNAME:
        return isSetSenderDisplayName();
      case OTHERSTATUS:
        return isSetOtherStatus();
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
        case LASTMESSAGE:
          if (field.type == TType.STRUCT) {
            this.lastMessage = new SquareMessage();
            this.lastMessage.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SENDERDISPLAYNAME:
          if (field.type == TType.STRING) {
            this.senderDisplayName = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case OTHERSTATUS:
          if (field.type == TType.STRUCT) {
            this.otherStatus = new SquareChatStatusWithoutMessage();
            this.otherStatus.read(iprot);
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
    if (this.lastMessage != null) {
      oprot.writeFieldBegin(_LAST_MESSAGE_FIELD_DESC);
      this.lastMessage.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.senderDisplayName != null) {
      oprot.writeFieldBegin(_SENDER_DISPLAY_NAME_FIELD_DESC);
      oprot.writeString(this.senderDisplayName);
      oprot.writeFieldEnd();
    }
    if (this.otherStatus != null) {
      oprot.writeFieldBegin(_OTHER_STATUS_FIELD_DESC);
      this.otherStatus.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SquareChatStatus(");

    ret.write("lastMessage:");
    if (this.lastMessage == null) {
      ret.write("null");
    } else {
      ret.write(this.lastMessage);
    }

    ret.write(", ");
    ret.write("senderDisplayName:");
    if (this.senderDisplayName == null) {
      ret.write("null");
    } else {
      ret.write(this.senderDisplayName);
    }

    ret.write(", ");
    ret.write("otherStatus:");
    if (this.otherStatus == null) {
      ret.write("null");
    } else {
      ret.write(this.otherStatus);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

