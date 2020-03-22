/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.error_extra_info;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class ErrorExtraInfo implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("ErrorExtraInfo");
  static final TField _PRECONDITION_FAILED_EXTRA_INFO_FIELD_DESC = new TField("preconditionFailedExtraInfo", TType.I32, 1);

  int _preconditionFailedExtraInfo;
  static const int PRECONDITIONFAILEDEXTRAINFO = 1;

  bool __isset_preconditionFailedExtraInfo = false;

  ErrorExtraInfo() {
  }

  // preconditionFailedExtraInfo
  int get preconditionFailedExtraInfo => this._preconditionFailedExtraInfo;

  set preconditionFailedExtraInfo(int preconditionFailedExtraInfo) {
    this._preconditionFailedExtraInfo = preconditionFailedExtraInfo;
    this.__isset_preconditionFailedExtraInfo = true;
  }

  bool isSetPreconditionFailedExtraInfo() => this.__isset_preconditionFailedExtraInfo;

  unsetPreconditionFailedExtraInfo() {
    this.__isset_preconditionFailedExtraInfo = false;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case PRECONDITIONFAILEDEXTRAINFO:
        return this.preconditionFailedExtraInfo;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case PRECONDITIONFAILEDEXTRAINFO:
        if (value == null) {
          unsetPreconditionFailedExtraInfo();
        } else {
          this.preconditionFailedExtraInfo = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case PRECONDITIONFAILEDEXTRAINFO:
        return isSetPreconditionFailedExtraInfo();
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
        case PRECONDITIONFAILEDEXTRAINFO:
          if (field.type == TType.I32) {
            this.preconditionFailedExtraInfo = iprot.readI32();
            this.__isset_preconditionFailedExtraInfo = true;
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
    oprot.writeFieldBegin(_PRECONDITION_FAILED_EXTRA_INFO_FIELD_DESC);
    oprot.writeI32(this.preconditionFailedExtraInfo);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("ErrorExtraInfo(");

    ret.write("preconditionFailedExtraInfo:");
    String preconditionFailedExtraInfo_name = PreconditionFailedExtraInfo.VALUES_TO_NAMES[this.preconditionFailedExtraInfo];
    if (preconditionFailedExtraInfo_name != null) {
      ret.write(preconditionFailedExtraInfo_name);
      ret.write(" (");
    }
    ret.write(this.preconditionFailedExtraInfo);
    if (preconditionFailedExtraInfo_name != null) {
      ret.write(")");
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetPreconditionFailedExtraInfo() && !PreconditionFailedExtraInfo.VALID_VALUES.contains(preconditionFailedExtraInfo)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'preconditionFailedExtraInfo' has been assigned the invalid value $preconditionFailedExtraInfo");
    }
  }

}

