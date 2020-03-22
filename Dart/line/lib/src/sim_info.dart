/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.sim_info;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SIMInfo implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SIMInfo");
  static final TField _PHONE_NUMBER_FIELD_DESC = new TField("phoneNumber", TType.STRING, 1);
  static final TField _COUNTRY_CODE_FIELD_DESC = new TField("countryCode", TType.STRING, 2);

  String _phoneNumber;
  static const int PHONENUMBER = 1;
  String _countryCode;
  static const int COUNTRYCODE = 2;


  SIMInfo() {
  }

  // phoneNumber
  String get phoneNumber => this._phoneNumber;

  set phoneNumber(String phoneNumber) {
    this._phoneNumber = phoneNumber;
  }

  bool isSetPhoneNumber() => this.phoneNumber != null;

  unsetPhoneNumber() {
    this.phoneNumber = null;
  }

  // countryCode
  String get countryCode => this._countryCode;

  set countryCode(String countryCode) {
    this._countryCode = countryCode;
  }

  bool isSetCountryCode() => this.countryCode != null;

  unsetCountryCode() {
    this.countryCode = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case PHONENUMBER:
        return this.phoneNumber;
      case COUNTRYCODE:
        return this.countryCode;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case PHONENUMBER:
        if (value == null) {
          unsetPhoneNumber();
        } else {
          this.phoneNumber = value;
        }
        break;

      case COUNTRYCODE:
        if (value == null) {
          unsetCountryCode();
        } else {
          this.countryCode = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case PHONENUMBER:
        return isSetPhoneNumber();
      case COUNTRYCODE:
        return isSetCountryCode();
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
        case PHONENUMBER:
          if (field.type == TType.STRING) {
            this.phoneNumber = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case COUNTRYCODE:
          if (field.type == TType.STRING) {
            this.countryCode = iprot.readString();
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
    if (this.phoneNumber != null) {
      oprot.writeFieldBegin(_PHONE_NUMBER_FIELD_DESC);
      oprot.writeString(this.phoneNumber);
      oprot.writeFieldEnd();
    }
    if (this.countryCode != null) {
      oprot.writeFieldBegin(_COUNTRY_CODE_FIELD_DESC);
      oprot.writeString(this.countryCode);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SIMInfo(");

    ret.write("phoneNumber:");
    if (this.phoneNumber == null) {
      ret.write("null");
    } else {
      ret.write(this.phoneNumber);
    }

    ret.write(", ");
    ret.write("countryCode:");
    if (this.countryCode == null) {
      ret.write("null");
    } else {
      ret.write(this.countryCode);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

