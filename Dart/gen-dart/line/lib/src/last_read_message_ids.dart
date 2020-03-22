/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.last_read_message_ids;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class LastReadMessageIds implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("LastReadMessageIds");
  static final TField _CHAT_ID_FIELD_DESC = new TField("chatId", TType.STRING, 1);
  static final TField _LAST_READ_MESSAGE_IDS_FIELD_DESC = new TField("lastReadMessageIds", TType.LIST, 2);

  String _chatId;
  static const int CHATID = 1;
  List<LastReadMessageId> _lastReadMessageIds;
  static const int LASTREADMESSAGEIDS = 2;


  LastReadMessageIds() {
  }

  // chatId
  String get chatId => this._chatId;

  set chatId(String chatId) {
    this._chatId = chatId;
  }

  bool isSetChatId() => this.chatId != null;

  unsetChatId() {
    this.chatId = null;
  }

  // lastReadMessageIds
  List<LastReadMessageId> get lastReadMessageIds => this._lastReadMessageIds;

  set lastReadMessageIds(List<LastReadMessageId> lastReadMessageIds) {
    this._lastReadMessageIds = lastReadMessageIds;
  }

  bool isSetLastReadMessageIds() => this.lastReadMessageIds != null;

  unsetLastReadMessageIds() {
    this.lastReadMessageIds = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case CHATID:
        return this.chatId;
      case LASTREADMESSAGEIDS:
        return this.lastReadMessageIds;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case CHATID:
        if (value == null) {
          unsetChatId();
        } else {
          this.chatId = value;
        }
        break;

      case LASTREADMESSAGEIDS:
        if (value == null) {
          unsetLastReadMessageIds();
        } else {
          this.lastReadMessageIds = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case CHATID:
        return isSetChatId();
      case LASTREADMESSAGEIDS:
        return isSetLastReadMessageIds();
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
        case CHATID:
          if (field.type == TType.STRING) {
            this.chatId = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case LASTREADMESSAGEIDS:
          if (field.type == TType.LIST) {
            {
              TList _list154 = iprot.readListBegin();
              this.lastReadMessageIds = new List<LastReadMessageId>();
              for (int _i155 = 0; _i155 < _list154.length; ++_i155) {
                LastReadMessageId _elem156;
                _elem156 = new LastReadMessageId();
                _elem156.read(iprot);
                this.lastReadMessageIds.add(_elem156);
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
    if (this.chatId != null) {
      oprot.writeFieldBegin(_CHAT_ID_FIELD_DESC);
      oprot.writeString(this.chatId);
      oprot.writeFieldEnd();
    }
    if (this.lastReadMessageIds != null) {
      oprot.writeFieldBegin(_LAST_READ_MESSAGE_IDS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.lastReadMessageIds.length));
        for (var elem157 in this.lastReadMessageIds) {
          elem157.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("LastReadMessageIds(");

    ret.write("chatId:");
    if (this.chatId == null) {
      ret.write("null");
    } else {
      ret.write(this.chatId);
    }

    ret.write(", ");
    ret.write("lastReadMessageIds:");
    if (this.lastReadMessageIds == null) {
      ret.write("null");
    } else {
      ret.write(this.lastReadMessageIds);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

