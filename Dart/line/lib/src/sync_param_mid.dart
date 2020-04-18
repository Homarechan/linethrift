/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.sync_param_mid;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SyncParamMid implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SyncParamMid");
  static final TField _MID_FIELD_DESC = new TField("mid", TType.STRING, 1);
  static final TField _DIFF_FIELD_DESC = new TField("diff", TType.I32, 2);
  static final TField _REVISION_FIELD_DESC = new TField("revision", TType.I64, 3);

  String _mid;
  static const int MID = 1;
  int _diff;
  static const int DIFF = 2;
  int _revision = 0;
  static const int REVISION = 3;

  bool __isset_diff = false;
  bool __isset_revision = false;

  SyncParamMid() {
  }

  // mid
  String get mid => this._mid;

  set mid(String mid) {
    this._mid = mid;
  }

  bool isSetMid() => this.mid != null;

  unsetMid() {
    this.mid = null;
  }

  // diff
  int get diff => this._diff;

  set diff(int diff) {
    this._diff = diff;
    this.__isset_diff = true;
  }

  bool isSetDiff() => this.__isset_diff;

  unsetDiff() {
    this.__isset_diff = false;
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

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case MID:
        return this.mid;
      case DIFF:
        return this.diff;
      case REVISION:
        return this.revision;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case MID:
        if (value == null) {
          unsetMid();
        } else {
          this.mid = value;
        }
        break;

      case DIFF:
        if (value == null) {
          unsetDiff();
        } else {
          this.diff = value;
        }
        break;

      case REVISION:
        if (value == null) {
          unsetRevision();
        } else {
          this.revision = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case MID:
        return isSetMid();
      case DIFF:
        return isSetDiff();
      case REVISION:
        return isSetRevision();
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
        case MID:
          if (field.type == TType.STRING) {
            this.mid = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DIFF:
          if (field.type == TType.I32) {
            this.diff = iprot.readI32();
            this.__isset_diff = true;
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
    if (this.mid != null) {
      oprot.writeFieldBegin(_MID_FIELD_DESC);
      oprot.writeString(this.mid);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_DIFF_FIELD_DESC);
    oprot.writeI32(this.diff);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_REVISION_FIELD_DESC);
    oprot.writeI64(this.revision);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SyncParamMid(");

    ret.write("mid:");
    if (this.mid == null) {
      ret.write("null");
    } else {
      ret.write(this.mid);
    }

    ret.write(", ");
    ret.write("diff:");
    String diff_name = Diff.VALUES_TO_NAMES[this.diff];
    if (diff_name != null) {
      ret.write(diff_name);
      ret.write(" (");
    }
    ret.write(this.diff);
    if (diff_name != null) {
      ret.write(")");
    }

    ret.write(", ");
    ret.write("revision:");
    ret.write(this.revision);

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetDiff() && !Diff.VALID_VALUES.contains(diff)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'diff' has been assigned the invalid value $diff");
    }
  }

}

