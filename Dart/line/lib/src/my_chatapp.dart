/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.my_chatapp;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class MyChatapp implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("MyChatapp");
  static final TField _APP_FIELD_DESC = new TField("app", TType.STRUCT, 1);
  static final TField _CATEGORY_FIELD_DESC = new TField("category", TType.I32, 2);
  static final TField _PRIORITY_FIELD_DESC = new TField("priority", TType.I64, 3);

  Chatapp _app;
  static const int APP = 1;
  int _category;
  static const int CATEGORY = 2;
  int _priority = 0;
  static const int PRIORITY = 3;

  bool __isset_category = false;
  bool __isset_priority = false;

  MyChatapp() {
  }

  // app
  Chatapp get app => this._app;

  set app(Chatapp app) {
    this._app = app;
  }

  bool isSetApp() => this.app != null;

  unsetApp() {
    this.app = null;
  }

  // category
  int get category => this._category;

  set category(int category) {
    this._category = category;
    this.__isset_category = true;
  }

  bool isSetCategory() => this.__isset_category;

  unsetCategory() {
    this.__isset_category = false;
  }

  // priority
  int get priority => this._priority;

  set priority(int priority) {
    this._priority = priority;
    this.__isset_priority = true;
  }

  bool isSetPriority() => this.__isset_priority;

  unsetPriority() {
    this.__isset_priority = false;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case APP:
        return this.app;
      case CATEGORY:
        return this.category;
      case PRIORITY:
        return this.priority;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case APP:
        if (value == null) {
          unsetApp();
        } else {
          this.app = value;
        }
        break;

      case CATEGORY:
        if (value == null) {
          unsetCategory();
        } else {
          this.category = value;
        }
        break;

      case PRIORITY:
        if (value == null) {
          unsetPriority();
        } else {
          this.priority = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case APP:
        return isSetApp();
      case CATEGORY:
        return isSetCategory();
      case PRIORITY:
        return isSetPriority();
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
        case APP:
          if (field.type == TType.STRUCT) {
            this.app = new Chatapp();
            this.app.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CATEGORY:
          if (field.type == TType.I32) {
            this.category = iprot.readI32();
            this.__isset_category = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PRIORITY:
          if (field.type == TType.I64) {
            this.priority = iprot.readI64();
            this.__isset_priority = true;
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
    if (this.app != null) {
      oprot.writeFieldBegin(_APP_FIELD_DESC);
      this.app.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_CATEGORY_FIELD_DESC);
    oprot.writeI32(this.category);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_PRIORITY_FIELD_DESC);
    oprot.writeI64(this.priority);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("MyChatapp(");

    ret.write("app:");
    if (this.app == null) {
      ret.write("null");
    } else {
      ret.write(this.app);
    }

    ret.write(", ");
    ret.write("category:");
    String category_name = ChatappCategory.VALUES_TO_NAMES[this.category];
    if (category_name != null) {
      ret.write(category_name);
      ret.write(" (");
    }
    ret.write(this.category);
    if (category_name != null) {
      ret.write(")");
    }

    ret.write(", ");
    ret.write("priority:");
    ret.write(this.priority);

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetCategory() && !ChatappCategory.VALID_VALUES.contains(category)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'category' has been assigned the invalid value $category");
    }
  }

}
