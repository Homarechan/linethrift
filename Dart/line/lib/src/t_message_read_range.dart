/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.t_message_read_range;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class TMessageReadRange implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("TMessageReadRange");
  static final TField _CHAT_ID_FIELD_DESC = new TField("chatId", TType.STRING, 1);
  static final TField _RANGES_FIELD_DESC = new TField("ranges", TType.MAP, 2);

  String _chatId;
  static const int CHATID = 1;
  Map<String, List<TMessageReadRangeEntry>> _ranges;
  static const int RANGES = 2;


  TMessageReadRange() {
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

  // ranges
  Map<String, List<TMessageReadRangeEntry>> get ranges => this._ranges;

  set ranges(Map<String, List<TMessageReadRangeEntry>> ranges) {
    this._ranges = ranges;
  }

  bool isSetRanges() => this.ranges != null;

  unsetRanges() {
    this.ranges = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case CHATID:
        return this.chatId;
      case RANGES:
        return this.ranges;
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

      case RANGES:
        if (value == null) {
          unsetRanges();
        } else {
          this.ranges = value;
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
      case RANGES:
        return isSetRanges();
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
        case RANGES:
          if (field.type == TType.MAP) {
            {
              TMap _map278 = iprot.readMapBegin();
              this.ranges = new Map<String, List<TMessageReadRangeEntry>>();
              for (int _i279 = 0; _i279 < _map278.length; ++_i279) {
                String _key280;
                List<TMessageReadRangeEntry> _val281;
                _key280 = iprot.readString();
                {
                  TList _list282 = iprot.readListBegin();
                  _val281 = new List<TMessageReadRangeEntry>();
                  for (int _i283 = 0; _i283 < _list282.length; ++_i283) {
                    TMessageReadRangeEntry _elem284;
                    _elem284 = new TMessageReadRangeEntry();
                    _elem284.read(iprot);
                    _val281.add(_elem284);
                  }
                  iprot.readListEnd();
                }
                this.ranges[_key280] = _val281;
              }
              iprot.readMapEnd();
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
    if (this.ranges != null) {
      oprot.writeFieldBegin(_RANGES_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.LIST, this.ranges.length));
        for (var elem286 in this.ranges.keys) {
          oprot.writeString(elem286);
          {
            oprot.writeListBegin(new TList(TType.STRUCT, this.ranges[elem286].length));
            for (var elem287 in this.ranges[elem286]) {
              elem287.write(oprot);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("TMessageReadRange(");

    ret.write("chatId:");
    if (this.chatId == null) {
      ret.write("null");
    } else {
      ret.write(this.chatId);
    }

    ret.write(", ");
    ret.write("ranges:");
    if (this.ranges == null) {
      ret.write("null");
    } else {
      ret.write(this.ranges);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

