/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.suggest_tag_dictionary_revision;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SuggestTagDictionaryRevision implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SuggestTagDictionaryRevision");
  static final TField _LANGUAGE_FIELD_DESC = new TField("language", TType.STRING, 1);
  static final TField _REVISION_FIELD_DESC = new TField("revision", TType.I64, 2);
  static final TField _SCHEME_FIELD_DESC = new TField("scheme", TType.STRING, 3);

  String _language;
  static const int LANGUAGE = 1;
  int _revision = 0;
  static const int REVISION = 2;
  String _scheme;
  static const int SCHEME = 3;

  bool __isset_revision = false;

  SuggestTagDictionaryRevision() {
  }

  // language
  String get language => this._language;

  set language(String language) {
    this._language = language;
  }

  bool isSetLanguage() => this.language != null;

  unsetLanguage() {
    this.language = null;
  }

  // revision
  int get revision => this._revision;

  set revision(int revision) {
    this._revision = revision;
    this.__isset_revision = true;
  }

  bool isSetRevision() => this.__isset_revision;

  unsetRevision() {
    this.__isset_revision = false;
  }

  // scheme
  String get scheme => this._scheme;

  set scheme(String scheme) {
    this._scheme = scheme;
  }

  bool isSetScheme() => this.scheme != null;

  unsetScheme() {
    this.scheme = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case LANGUAGE:
        return this.language;
      case REVISION:
        return this.revision;
      case SCHEME:
        return this.scheme;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case LANGUAGE:
        if (value == null) {
          unsetLanguage();
        } else {
          this.language = value;
        }
        break;

      case REVISION:
        if (value == null) {
          unsetRevision();
        } else {
          this.revision = value;
        }
        break;

      case SCHEME:
        if (value == null) {
          unsetScheme();
        } else {
          this.scheme = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case LANGUAGE:
        return isSetLanguage();
      case REVISION:
        return isSetRevision();
      case SCHEME:
        return isSetScheme();
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
        case LANGUAGE:
          if (field.type == TType.STRING) {
            this.language = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case REVISION:
          if (field.type == TType.I64) {
            this.revision = iprot.readI64();
            this.__isset_revision = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SCHEME:
          if (field.type == TType.STRING) {
            this.scheme = iprot.readString();
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
    if (this.language != null) {
      oprot.writeFieldBegin(_LANGUAGE_FIELD_DESC);
      oprot.writeString(this.language);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_REVISION_FIELD_DESC);
    oprot.writeI64(this.revision);
    oprot.writeFieldEnd();
    if (this.scheme != null) {
      oprot.writeFieldBegin(_SCHEME_FIELD_DESC);
      oprot.writeString(this.scheme);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SuggestTagDictionaryRevision(");

    ret.write("language:");
    if (this.language == null) {
      ret.write("null");
    } else {
      ret.write(this.language);
    }

    ret.write(", ");
    ret.write("revision:");
    ret.write(this.revision);

    ret.write(", ");
    ret.write("scheme:");
    if (this.scheme == null) {
      ret.write("null");
    } else {
      ret.write(this.scheme);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

