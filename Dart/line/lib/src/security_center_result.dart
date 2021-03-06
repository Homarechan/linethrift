/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.security_center_result;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SecurityCenterResult implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SecurityCenterResult");
  static final TField _URI_FIELD_DESC = new TField("uri", TType.STRING, 1);
  static final TField _TOKEN_FIELD_DESC = new TField("token", TType.STRING, 2);
  static final TField _COOKIE_PATH_FIELD_DESC = new TField("cookiePath", TType.STRING, 3);
  static final TField _SKIP_FIELD_DESC = new TField("skip", TType.BOOL, 4);

  String _uri;
  static const int URI = 1;
  String _token;
  static const int TOKEN = 2;
  String _cookiePath;
  static const int COOKIEPATH = 3;
  bool _skip = false;
  static const int SKIP = 4;

  bool __isset_skip = false;

  SecurityCenterResult() {
  }

  // uri
  String get uri => this._uri;

  set uri(String uri) {
    this._uri = uri;
  }

  bool isSetUri() => this.uri != null;

  unsetUri() {
    this.uri = null;
  }

  // token
  String get token => this._token;

  set token(String token) {
    this._token = token;
  }

  bool isSetToken() => this.token != null;

  unsetToken() {
    this.token = null;
  }

  // cookiePath
  String get cookiePath => this._cookiePath;

  set cookiePath(String cookiePath) {
    this._cookiePath = cookiePath;
  }

  bool isSetCookiePath() => this.cookiePath != null;

  unsetCookiePath() {
    this.cookiePath = null;
  }

  // skip
  bool get skip => this._skip;

  set skip(bool skip) {
    this._skip = skip;
    this.__isset_skip = true;
  }

  bool isSetSkip() => this.__isset_skip;

  unsetSkip() {
    this.__isset_skip = false;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case URI:
        return this.uri;
      case TOKEN:
        return this.token;
      case COOKIEPATH:
        return this.cookiePath;
      case SKIP:
        return this.skip;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case URI:
        if (value == null) {
          unsetUri();
        } else {
          this.uri = value;
        }
        break;

      case TOKEN:
        if (value == null) {
          unsetToken();
        } else {
          this.token = value;
        }
        break;

      case COOKIEPATH:
        if (value == null) {
          unsetCookiePath();
        } else {
          this.cookiePath = value;
        }
        break;

      case SKIP:
        if (value == null) {
          unsetSkip();
        } else {
          this.skip = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case URI:
        return isSetUri();
      case TOKEN:
        return isSetToken();
      case COOKIEPATH:
        return isSetCookiePath();
      case SKIP:
        return isSetSkip();
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
        case URI:
          if (field.type == TType.STRING) {
            this.uri = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TOKEN:
          if (field.type == TType.STRING) {
            this.token = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case COOKIEPATH:
          if (field.type == TType.STRING) {
            this.cookiePath = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SKIP:
          if (field.type == TType.BOOL) {
            this.skip = iprot.readBool();
            this.__isset_skip = true;
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
    if (this.uri != null) {
      oprot.writeFieldBegin(_URI_FIELD_DESC);
      oprot.writeString(this.uri);
      oprot.writeFieldEnd();
    }
    if (this.token != null) {
      oprot.writeFieldBegin(_TOKEN_FIELD_DESC);
      oprot.writeString(this.token);
      oprot.writeFieldEnd();
    }
    if (this.cookiePath != null) {
      oprot.writeFieldBegin(_COOKIE_PATH_FIELD_DESC);
      oprot.writeString(this.cookiePath);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_SKIP_FIELD_DESC);
    oprot.writeBool(this.skip);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SecurityCenterResult(");

    ret.write("uri:");
    if (this.uri == null) {
      ret.write("null");
    } else {
      ret.write(this.uri);
    }

    ret.write(", ");
    ret.write("token:");
    if (this.token == null) {
      ret.write("null");
    } else {
      ret.write(this.token);
    }

    ret.write(", ");
    ret.write("cookiePath:");
    if (this.cookiePath == null) {
      ret.write("null");
    } else {
      ret.write(this.cookiePath);
    }

    ret.write(", ");
    ret.write("skip:");
    ret.write(this.skip);

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

