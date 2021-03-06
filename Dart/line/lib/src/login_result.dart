/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.login_result;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class LoginResult implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("LoginResult");
  static final TField _AUTH_TOKEN_FIELD_DESC = new TField("authToken", TType.STRING, 1);
  static final TField _CERTIFICATE_FIELD_DESC = new TField("certificate", TType.STRING, 2);
  static final TField _VERIFIER_FIELD_DESC = new TField("verifier", TType.STRING, 3);
  static final TField _PIN_CODE_FIELD_DESC = new TField("pinCode", TType.STRING, 4);
  static final TField _TYPE_FIELD_DESC = new TField("type", TType.I32, 5);
  static final TField _LAST_PRIMARY_BIND_TIME_FIELD_DESC = new TField("lastPrimaryBindTime", TType.I64, 6);
  static final TField _DISPLAY_MESSAGE_FIELD_DESC = new TField("displayMessage", TType.STRING, 7);
  static final TField _SESSION_FOR_SMSCONFIRM_FIELD_DESC = new TField("sessionForSMSConfirm", TType.STRUCT, 8);

  String _authToken;
  static const int AUTHTOKEN = 1;
  String _certificate;
  static const int CERTIFICATE = 2;
  String _verifier;
  static const int VERIFIER = 3;
  String _pinCode;
  static const int PINCODE = 4;
  int _type;
  static const int TYPE = 5;
  int _lastPrimaryBindTime = 0;
  static const int LASTPRIMARYBINDTIME = 6;
  String _displayMessage;
  static const int DISPLAYMESSAGE = 7;
  VerificationSessionData _sessionForSMSConfirm;
  static const int SESSIONFORSMSCONFIRM = 8;

  bool __isset_type = false;
  bool __isset_lastPrimaryBindTime = false;

  LoginResult() {
  }

  // authToken
  String get authToken => this._authToken;

  set authToken(String authToken) {
    this._authToken = authToken;
  }

  bool isSetAuthToken() => this.authToken != null;

  unsetAuthToken() {
    this.authToken = null;
  }

  // certificate
  String get certificate => this._certificate;

  set certificate(String certificate) {
    this._certificate = certificate;
  }

  bool isSetCertificate() => this.certificate != null;

  unsetCertificate() {
    this.certificate = null;
  }

  // verifier
  String get verifier => this._verifier;

  set verifier(String verifier) {
    this._verifier = verifier;
  }

  bool isSetVerifier() => this.verifier != null;

  unsetVerifier() {
    this.verifier = null;
  }

  // pinCode
  String get pinCode => this._pinCode;

  set pinCode(String pinCode) {
    this._pinCode = pinCode;
  }

  bool isSetPinCode() => this.pinCode != null;

  unsetPinCode() {
    this.pinCode = null;
  }

  // type
  int get type => this._type;

  set type(int type) {
    this._type = type;
    this.__isset_type = true;
  }

  bool isSetType() => this.__isset_type;

  unsetType() {
    this.__isset_type = false;
  }

  // lastPrimaryBindTime
  int get lastPrimaryBindTime => this._lastPrimaryBindTime;

  set lastPrimaryBindTime(int lastPrimaryBindTime) {
    this._lastPrimaryBindTime = lastPrimaryBindTime;
    this.__isset_lastPrimaryBindTime = true;
  }

  bool isSetLastPrimaryBindTime() => this.__isset_lastPrimaryBindTime;

  unsetLastPrimaryBindTime() {
    this.__isset_lastPrimaryBindTime = false;
  }

  // displayMessage
  String get displayMessage => this._displayMessage;

  set displayMessage(String displayMessage) {
    this._displayMessage = displayMessage;
  }

  bool isSetDisplayMessage() => this.displayMessage != null;

  unsetDisplayMessage() {
    this.displayMessage = null;
  }

  // sessionForSMSConfirm
  VerificationSessionData get sessionForSMSConfirm => this._sessionForSMSConfirm;

  set sessionForSMSConfirm(VerificationSessionData sessionForSMSConfirm) {
    this._sessionForSMSConfirm = sessionForSMSConfirm;
  }

  bool isSetSessionForSMSConfirm() => this.sessionForSMSConfirm != null;

  unsetSessionForSMSConfirm() {
    this.sessionForSMSConfirm = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case AUTHTOKEN:
        return this.authToken;
      case CERTIFICATE:
        return this.certificate;
      case VERIFIER:
        return this.verifier;
      case PINCODE:
        return this.pinCode;
      case TYPE:
        return this.type;
      case LASTPRIMARYBINDTIME:
        return this.lastPrimaryBindTime;
      case DISPLAYMESSAGE:
        return this.displayMessage;
      case SESSIONFORSMSCONFIRM:
        return this.sessionForSMSConfirm;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case AUTHTOKEN:
        if (value == null) {
          unsetAuthToken();
        } else {
          this.authToken = value;
        }
        break;

      case CERTIFICATE:
        if (value == null) {
          unsetCertificate();
        } else {
          this.certificate = value;
        }
        break;

      case VERIFIER:
        if (value == null) {
          unsetVerifier();
        } else {
          this.verifier = value;
        }
        break;

      case PINCODE:
        if (value == null) {
          unsetPinCode();
        } else {
          this.pinCode = value;
        }
        break;

      case TYPE:
        if (value == null) {
          unsetType();
        } else {
          this.type = value;
        }
        break;

      case LASTPRIMARYBINDTIME:
        if (value == null) {
          unsetLastPrimaryBindTime();
        } else {
          this.lastPrimaryBindTime = value;
        }
        break;

      case DISPLAYMESSAGE:
        if (value == null) {
          unsetDisplayMessage();
        } else {
          this.displayMessage = value;
        }
        break;

      case SESSIONFORSMSCONFIRM:
        if (value == null) {
          unsetSessionForSMSConfirm();
        } else {
          this.sessionForSMSConfirm = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case AUTHTOKEN:
        return isSetAuthToken();
      case CERTIFICATE:
        return isSetCertificate();
      case VERIFIER:
        return isSetVerifier();
      case PINCODE:
        return isSetPinCode();
      case TYPE:
        return isSetType();
      case LASTPRIMARYBINDTIME:
        return isSetLastPrimaryBindTime();
      case DISPLAYMESSAGE:
        return isSetDisplayMessage();
      case SESSIONFORSMSCONFIRM:
        return isSetSessionForSMSConfirm();
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
        case AUTHTOKEN:
          if (field.type == TType.STRING) {
            this.authToken = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CERTIFICATE:
          if (field.type == TType.STRING) {
            this.certificate = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case VERIFIER:
          if (field.type == TType.STRING) {
            this.verifier = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PINCODE:
          if (field.type == TType.STRING) {
            this.pinCode = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TYPE:
          if (field.type == TType.I32) {
            this.type = iprot.readI32();
            this.__isset_type = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case LASTPRIMARYBINDTIME:
          if (field.type == TType.I64) {
            this.lastPrimaryBindTime = iprot.readI64();
            this.__isset_lastPrimaryBindTime = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DISPLAYMESSAGE:
          if (field.type == TType.STRING) {
            this.displayMessage = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SESSIONFORSMSCONFIRM:
          if (field.type == TType.STRUCT) {
            this.sessionForSMSConfirm = new VerificationSessionData();
            this.sessionForSMSConfirm.read(iprot);
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
    if (this.authToken != null) {
      oprot.writeFieldBegin(_AUTH_TOKEN_FIELD_DESC);
      oprot.writeString(this.authToken);
      oprot.writeFieldEnd();
    }
    if (this.certificate != null) {
      oprot.writeFieldBegin(_CERTIFICATE_FIELD_DESC);
      oprot.writeString(this.certificate);
      oprot.writeFieldEnd();
    }
    if (this.verifier != null) {
      oprot.writeFieldBegin(_VERIFIER_FIELD_DESC);
      oprot.writeString(this.verifier);
      oprot.writeFieldEnd();
    }
    if (this.pinCode != null) {
      oprot.writeFieldBegin(_PIN_CODE_FIELD_DESC);
      oprot.writeString(this.pinCode);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_TYPE_FIELD_DESC);
    oprot.writeI32(this.type);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_LAST_PRIMARY_BIND_TIME_FIELD_DESC);
    oprot.writeI64(this.lastPrimaryBindTime);
    oprot.writeFieldEnd();
    if (this.displayMessage != null) {
      oprot.writeFieldBegin(_DISPLAY_MESSAGE_FIELD_DESC);
      oprot.writeString(this.displayMessage);
      oprot.writeFieldEnd();
    }
    if (this.sessionForSMSConfirm != null) {
      oprot.writeFieldBegin(_SESSION_FOR_SMSCONFIRM_FIELD_DESC);
      this.sessionForSMSConfirm.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("LoginResult(");

    ret.write("authToken:");
    if (this.authToken == null) {
      ret.write("null");
    } else {
      ret.write(this.authToken);
    }

    ret.write(", ");
    ret.write("certificate:");
    if (this.certificate == null) {
      ret.write("null");
    } else {
      ret.write(this.certificate);
    }

    ret.write(", ");
    ret.write("verifier:");
    if (this.verifier == null) {
      ret.write("null");
    } else {
      ret.write(this.verifier);
    }

    ret.write(", ");
    ret.write("pinCode:");
    if (this.pinCode == null) {
      ret.write("null");
    } else {
      ret.write(this.pinCode);
    }

    ret.write(", ");
    ret.write("type:");
    String type_name = LoginResultType.VALUES_TO_NAMES[this.type];
    if (type_name != null) {
      ret.write(type_name);
      ret.write(" (");
    }
    ret.write(this.type);
    if (type_name != null) {
      ret.write(")");
    }

    ret.write(", ");
    ret.write("lastPrimaryBindTime:");
    ret.write(this.lastPrimaryBindTime);

    ret.write(", ");
    ret.write("displayMessage:");
    if (this.displayMessage == null) {
      ret.write("null");
    } else {
      ret.write(this.displayMessage);
    }

    ret.write(", ");
    ret.write("sessionForSMSConfirm:");
    if (this.sessionForSMSConfirm == null) {
      ret.write("null");
    } else {
      ret.write(this.sessionForSMSConfirm);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetType() && !LoginResultType.VALID_VALUES.contains(type)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'type' has been assigned the invalid value $type");
    }
  }

}

