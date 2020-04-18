/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.notification_fetch_result;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class NotificationFetchResult implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("NotificationFetchResult");
  static final TField _FETCH_MODE_FIELD_DESC = new TField("fetchMode", TType.I32, 1);
  static final TField _ITEM_LIST_FIELD_DESC = new TField("itemList", TType.LIST, 2);

  int _fetchMode;
  static const int FETCHMODE = 1;
  List<NotificationItem> _itemList;
  static const int ITEMLIST = 2;

  bool __isset_fetchMode = false;

  NotificationFetchResult() {
  }

  // fetchMode
  int get fetchMode => this._fetchMode;

  set fetchMode(int fetchMode) {
    this._fetchMode = fetchMode;
    this.__isset_fetchMode = true;
  }

  bool isSetFetchMode() => this.__isset_fetchMode;

  unsetFetchMode() {
    this.__isset_fetchMode = false;
  }

  // itemList
  List<NotificationItem> get itemList => this._itemList;

  set itemList(List<NotificationItem> itemList) {
    this._itemList = itemList;
  }

  bool isSetItemList() => this.itemList != null;

  unsetItemList() {
    this.itemList = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case FETCHMODE:
        return this.fetchMode;
      case ITEMLIST:
        return this.itemList;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case FETCHMODE:
        if (value == null) {
          unsetFetchMode();
        } else {
          this.fetchMode = value;
        }
        break;

      case ITEMLIST:
        if (value == null) {
          unsetItemList();
        } else {
          this.itemList = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case FETCHMODE:
        return isSetFetchMode();
      case ITEMLIST:
        return isSetItemList();
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
        case FETCHMODE:
          if (field.type == TType.I32) {
            this.fetchMode = iprot.readI32();
            this.__isset_fetchMode = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ITEMLIST:
          if (field.type == TType.LIST) {
            {
              TList _list192 = iprot.readListBegin();
              this.itemList = new List<NotificationItem>();
              for (int _i193 = 0; _i193 < _list192.length; ++_i193) {
                NotificationItem _elem194;
                _elem194 = new NotificationItem();
                _elem194.read(iprot);
                this.itemList.add(_elem194);
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
    oprot.writeFieldBegin(_FETCH_MODE_FIELD_DESC);
    oprot.writeI32(this.fetchMode);
    oprot.writeFieldEnd();
    if (this.itemList != null) {
      oprot.writeFieldBegin(_ITEM_LIST_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.itemList.length));
        for (var elem195 in this.itemList) {
          elem195.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("NotificationFetchResult(");

    ret.write("fetchMode:");
    String fetchMode_name = NotificationItemFetchMode.VALUES_TO_NAMES[this.fetchMode];
    if (fetchMode_name != null) {
      ret.write(fetchMode_name);
      ret.write(" (");
    }
    ret.write(this.fetchMode);
    if (fetchMode_name != null) {
      ret.write(")");
    }

    ret.write(", ");
    ret.write("itemList:");
    if (this.itemList == null) {
      ret.write("null");
    } else {
      ret.write(this.itemList);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetFetchMode() && !NotificationItemFetchMode.VALID_VALUES.contains(fetchMode)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'fetchMode' has been assigned the invalid value $fetchMode");
    }
  }

}

