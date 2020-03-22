/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.should_sync_exception;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class ShouldSyncException implements TBase, Exception  {
  static final TStruct _STRUCT_DESC = new TStruct("ShouldSyncException");
  static final TField _SYNC_OP_REVISION_FIELD_DESC = new TField("syncOpRevision", TType.I64, 1);
  static final TField _SYNC_SCOPE_FIELD_DESC = new TField("syncScope", TType.STRUCT, 2);
  static final TField _SYNC_REASON_FIELD_DESC = new TField("syncReason", TType.I32, 3);
  static final TField _MESSAGE_FIELD_DESC = new TField("message", TType.STRING, 4);

  int _syncOpRevision = 0;
  static const int SYNCOPREVISION = 1;
  SyncScope _syncScope;
  static const int SYNCSCOPE = 2;
  int _syncReason;
  static const int SYNCREASON = 3;
  String _message;
  static const int MESSAGE = 4;

  bool __isset_syncOpRevision = false;
  bool __isset_syncReason = false;

  ShouldSyncException() {
  }

  // syncOpRevision
  int get syncOpRevision => this._syncOpRevision;

  set syncOpRevision(int syncOpRevision) {
    this._syncOpRevision = syncOpRevision;
    this.__isset_syncOpRevision = true;
  }

  bool isSetSyncOpRevision() => this.__isset_syncOpRevision;

  unsetSyncOpRevision() {
    this.__isset_syncOpRevision = false;
  }

  // syncScope
  SyncScope get syncScope => this._syncScope;

  set syncScope(SyncScope syncScope) {
    this._syncScope = syncScope;
  }

  bool isSetSyncScope() => this.syncScope != null;

  unsetSyncScope() {
    this.syncScope = null;
  }

  // syncReason
  int get syncReason => this._syncReason;

  set syncReason(int syncReason) {
    this._syncReason = syncReason;
    this.__isset_syncReason = true;
  }

  bool isSetSyncReason() => this.__isset_syncReason;

  unsetSyncReason() {
    this.__isset_syncReason = false;
  }

  // message
  String get message => this._message;

  set message(String message) {
    this._message = message;
  }

  bool isSetMessage() => this.message != null;

  unsetMessage() {
    this.message = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SYNCOPREVISION:
        return this.syncOpRevision;
      case SYNCSCOPE:
        return this.syncScope;
      case SYNCREASON:
        return this.syncReason;
      case MESSAGE:
        return this.message;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case SYNCOPREVISION:
        if (value == null) {
          unsetSyncOpRevision();
        } else {
          this.syncOpRevision = value;
        }
        break;

      case SYNCSCOPE:
        if (value == null) {
          unsetSyncScope();
        } else {
          this.syncScope = value;
        }
        break;

      case SYNCREASON:
        if (value == null) {
          unsetSyncReason();
        } else {
          this.syncReason = value;
        }
        break;

      case MESSAGE:
        if (value == null) {
          unsetMessage();
        } else {
          this.message = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case SYNCOPREVISION:
        return isSetSyncOpRevision();
      case SYNCSCOPE:
        return isSetSyncScope();
      case SYNCREASON:
        return isSetSyncReason();
      case MESSAGE:
        return isSetMessage();
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
        case SYNCOPREVISION:
          if (field.type == TType.I64) {
            this.syncOpRevision = iprot.readI64();
            this.__isset_syncOpRevision = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SYNCSCOPE:
          if (field.type == TType.STRUCT) {
            this.syncScope = new SyncScope();
            this.syncScope.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SYNCREASON:
          if (field.type == TType.I32) {
            this.syncReason = iprot.readI32();
            this.__isset_syncReason = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case MESSAGE:
          if (field.type == TType.STRING) {
            this.message = iprot.readString();
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
    oprot.writeFieldBegin(_SYNC_OP_REVISION_FIELD_DESC);
    oprot.writeI64(this.syncOpRevision);
    oprot.writeFieldEnd();
    if (this.syncScope != null) {
      oprot.writeFieldBegin(_SYNC_SCOPE_FIELD_DESC);
      this.syncScope.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_SYNC_REASON_FIELD_DESC);
    oprot.writeI32(this.syncReason);
    oprot.writeFieldEnd();
    if (this.message != null) {
      oprot.writeFieldBegin(_MESSAGE_FIELD_DESC);
      oprot.writeString(this.message);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("ShouldSyncException(");

    ret.write("syncOpRevision:");
    ret.write(this.syncOpRevision);

    ret.write(", ");
    ret.write("syncScope:");
    if (this.syncScope == null) {
      ret.write("null");
    } else {
      ret.write(this.syncScope);
    }

    ret.write(", ");
    ret.write("syncReason:");
    String syncReason_name = SyncTriggerReason.VALUES_TO_NAMES[this.syncReason];
    if (syncReason_name != null) {
      ret.write(syncReason_name);
      ret.write(" (");
    }
    ret.write(this.syncReason);
    if (syncReason_name != null) {
      ret.write(")");
    }

    ret.write(", ");
    ret.write("message:");
    if (this.message == null) {
      ret.write("null");
    } else {
      ret.write(this.message);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetSyncReason() && !SyncTriggerReason.VALID_VALUES.contains(syncReason)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'syncReason' has been assigned the invalid value $syncReason");
    }
  }

}

