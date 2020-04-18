/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.approved_channel_infos;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class ApprovedChannelInfos implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("ApprovedChannelInfos");
  static final TField _APPROVED_CHANNEL_INFOS_FIELD_DESC = new TField("approvedChannelInfos", TType.LIST, 1);
  static final TField _REVISION_FIELD_DESC = new TField("revision", TType.I64, 2);

  List<ApprovedChannelInfo> _approvedChannelInfos;
  static const int APPROVEDCHANNELINFOS = 1;
  int _revision = 0;
  static const int REVISION = 2;

  bool __isset_revision = false;

  ApprovedChannelInfos() {
  }

  // approvedChannelInfos
  List<ApprovedChannelInfo> get approvedChannelInfos => this._approvedChannelInfos;

  set approvedChannelInfos(List<ApprovedChannelInfo> approvedChannelInfos) {
    this._approvedChannelInfos = approvedChannelInfos;
  }

  bool isSetApprovedChannelInfos() => this.approvedChannelInfos != null;

  unsetApprovedChannelInfos() {
    this.approvedChannelInfos = null;
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
      case APPROVEDCHANNELINFOS:
        return this.approvedChannelInfos;
      case REVISION:
        return this.revision;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case APPROVEDCHANNELINFOS:
        if (value == null) {
          unsetApprovedChannelInfos();
        } else {
          this.approvedChannelInfos = value;
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
      case APPROVEDCHANNELINFOS:
        return isSetApprovedChannelInfos();
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
        case APPROVEDCHANNELINFOS:
          if (field.type == TType.LIST) {
            {
              TList _list52 = iprot.readListBegin();
              this.approvedChannelInfos = new List<ApprovedChannelInfo>();
              for (int _i53 = 0; _i53 < _list52.length; ++_i53) {
                ApprovedChannelInfo _elem54;
                _elem54 = new ApprovedChannelInfo();
                _elem54.read(iprot);
                this.approvedChannelInfos.add(_elem54);
              }
              iprot.readListEnd();
            }
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
    if (this.approvedChannelInfos != null) {
      oprot.writeFieldBegin(_APPROVED_CHANNEL_INFOS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.approvedChannelInfos.length));
        for (var elem55 in this.approvedChannelInfos) {
          elem55.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_REVISION_FIELD_DESC);
    oprot.writeI64(this.revision);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("ApprovedChannelInfos(");

    ret.write("approvedChannelInfos:");
    if (this.approvedChannelInfos == null) {
      ret.write("null");
    } else {
      ret.write(this.approvedChannelInfos);
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
  }

}

