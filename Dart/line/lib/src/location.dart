/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.location;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class Location implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("Location");
  static final TField _TITLE_FIELD_DESC = new TField("title", TType.STRING, 1);
  static final TField _ADDRESS_FIELD_DESC = new TField("address", TType.STRING, 2);
  static final TField _LATITUDE_FIELD_DESC = new TField("latitude", TType.DOUBLE, 3);
  static final TField _LONGITUDE_FIELD_DESC = new TField("longitude", TType.DOUBLE, 4);
  static final TField _PHONE_FIELD_DESC = new TField("phone", TType.STRING, 5);

  String _title;
  static const int TITLE = 1;
  String _address;
  static const int ADDRESS = 2;
  double _latitude = 0.0;
  static const int LATITUDE = 3;
  double _longitude = 0.0;
  static const int LONGITUDE = 4;
  String _phone;
  static const int PHONE = 5;

  bool __isset_latitude = false;
  bool __isset_longitude = false;

  Location() {
  }

  // title
  String get title => this._title;

  set title(String title) {
    this._title = title;
  }

  bool isSetTitle() => this.title != null;

  unsetTitle() {
    this.title = null;
  }

  // address
  String get address => this._address;

  set address(String address) {
    this._address = address;
  }

  bool isSetAddress() => this.address != null;

  unsetAddress() {
    this.address = null;
  }

  // latitude
  double get latitude => this._latitude;

  set latitude(double latitude) {
    this._latitude = latitude;
    this.__isset_latitude = true;
  }

  bool isSetLatitude() => this.__isset_latitude;

  unsetLatitude() {
    this.__isset_latitude = false;
  }

  // longitude
  double get longitude => this._longitude;

  set longitude(double longitude) {
    this._longitude = longitude;
    this.__isset_longitude = true;
  }

  bool isSetLongitude() => this.__isset_longitude;

  unsetLongitude() {
    this.__isset_longitude = false;
  }

  // phone
  String get phone => this._phone;

  set phone(String phone) {
    this._phone = phone;
  }

  bool isSetPhone() => this.phone != null;

  unsetPhone() {
    this.phone = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case TITLE:
        return this.title;
      case ADDRESS:
        return this.address;
      case LATITUDE:
        return this.latitude;
      case LONGITUDE:
        return this.longitude;
      case PHONE:
        return this.phone;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case TITLE:
        if (value == null) {
          unsetTitle();
        } else {
          this.title = value;
        }
        break;

      case ADDRESS:
        if (value == null) {
          unsetAddress();
        } else {
          this.address = value;
        }
        break;

      case LATITUDE:
        if (value == null) {
          unsetLatitude();
        } else {
          this.latitude = value;
        }
        break;

      case LONGITUDE:
        if (value == null) {
          unsetLongitude();
        } else {
          this.longitude = value;
        }
        break;

      case PHONE:
        if (value == null) {
          unsetPhone();
        } else {
          this.phone = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case TITLE:
        return isSetTitle();
      case ADDRESS:
        return isSetAddress();
      case LATITUDE:
        return isSetLatitude();
      case LONGITUDE:
        return isSetLongitude();
      case PHONE:
        return isSetPhone();
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
        case TITLE:
          if (field.type == TType.STRING) {
            this.title = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ADDRESS:
          if (field.type == TType.STRING) {
            this.address = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case LATITUDE:
          if (field.type == TType.DOUBLE) {
            this.latitude = iprot.readDouble();
            this.__isset_latitude = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case LONGITUDE:
          if (field.type == TType.DOUBLE) {
            this.longitude = iprot.readDouble();
            this.__isset_longitude = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PHONE:
          if (field.type == TType.STRING) {
            this.phone = iprot.readString();
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
    if (this.title != null) {
      oprot.writeFieldBegin(_TITLE_FIELD_DESC);
      oprot.writeString(this.title);
      oprot.writeFieldEnd();
    }
    if (this.address != null) {
      oprot.writeFieldBegin(_ADDRESS_FIELD_DESC);
      oprot.writeString(this.address);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_LATITUDE_FIELD_DESC);
    oprot.writeDouble(this.latitude);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_LONGITUDE_FIELD_DESC);
    oprot.writeDouble(this.longitude);
    oprot.writeFieldEnd();
    if (this.phone != null) {
      oprot.writeFieldBegin(_PHONE_FIELD_DESC);
      oprot.writeString(this.phone);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("Location(");

    ret.write("title:");
    if (this.title == null) {
      ret.write("null");
    } else {
      ret.write(this.title);
    }

    ret.write(", ");
    ret.write("address:");
    if (this.address == null) {
      ret.write("null");
    } else {
      ret.write(this.address);
    }

    ret.write(", ");
    ret.write("latitude:");
    ret.write(this.latitude);

    ret.write(", ");
    ret.write("longitude:");
    ret.write(this.longitude);

    ret.write(", ");
    ret.write("phone:");
    if (this.phone == null) {
      ret.write("null");
    } else {
      ret.write(this.phone);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

