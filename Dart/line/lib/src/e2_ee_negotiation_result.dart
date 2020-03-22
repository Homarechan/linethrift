/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.e2_ee_negotiation_result;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class E2EENegotiationResult implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("E2EENegotiationResult");
  static final TField _ALLOWED_TYPES_FIELD_DESC = new TField("allowedTypes", TType.SET, 1);
  static final TField _PUBLIC_KEY_FIELD_DESC = new TField("publicKey", TType.STRUCT, 2);

  Set<int> _allowedTypes;
  static const int ALLOWEDTYPES = 1;
  E2EEPublicKey _publicKey;
  static const int PUBLICKEY = 2;


  E2EENegotiationResult() {
  }

  // allowedTypes
  Set<int> get allowedTypes => this._allowedTypes;

  set allowedTypes(Set<int> allowedTypes) {
    this._allowedTypes = allowedTypes;
  }

  bool isSetAllowedTypes() => this.allowedTypes != null;

  unsetAllowedTypes() {
    this.allowedTypes = null;
  }

  // publicKey
  E2EEPublicKey get publicKey => this._publicKey;

  set publicKey(E2EEPublicKey publicKey) {
    this._publicKey = publicKey;
  }

  bool isSetPublicKey() => this.publicKey != null;

  unsetPublicKey() {
    this.publicKey = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case ALLOWEDTYPES:
        return this.allowedTypes;
      case PUBLICKEY:
        return this.publicKey;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case ALLOWEDTYPES:
        if (value == null) {
          unsetAllowedTypes();
        } else {
          this.allowedTypes = value;
        }
        break;

      case PUBLICKEY:
        if (value == null) {
          unsetPublicKey();
        } else {
          this.publicKey = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case ALLOWEDTYPES:
        return isSetAllowedTypes();
      case PUBLICKEY:
        return isSetPublicKey();
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
        case ALLOWEDTYPES:
          if (field.type == TType.SET) {
            {
              TSet _set4 = iprot.readSetBegin();
              this.allowedTypes = new Set<int>();
              for (int _i5 = 0; _i5 < _set4.length; ++_i5) {
                int _elem6;
                _elem6 = iprot.readI32();
                this.allowedTypes.add(_elem6);
              }
              iprot.readSetEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PUBLICKEY:
          if (field.type == TType.STRUCT) {
            this.publicKey = new E2EEPublicKey();
            this.publicKey.read(iprot);
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
    if (this.allowedTypes != null) {
      oprot.writeFieldBegin(_ALLOWED_TYPES_FIELD_DESC);
      {
        oprot.writeSetBegin(new TSet(TType.I32, this.allowedTypes.length));
        for (var elem7 in this.allowedTypes) {
          oprot.writeI32(elem7);
        }
        oprot.writeSetEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.publicKey != null) {
      oprot.writeFieldBegin(_PUBLIC_KEY_FIELD_DESC);
      this.publicKey.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("E2EENegotiationResult(");

    ret.write("allowedTypes:");
    if (this.allowedTypes == null) {
      ret.write("null");
    } else {
      ret.write(this.allowedTypes);
    }

    ret.write(", ");
    ret.write("publicKey:");
    if (this.publicKey == null) {
      ret.write("null");
    } else {
      ret.write(this.publicKey);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

