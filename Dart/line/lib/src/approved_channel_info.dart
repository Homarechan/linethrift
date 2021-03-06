/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.approved_channel_info;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class ApprovedChannelInfo implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("ApprovedChannelInfo");
  static final TField _CHANNEL_INFO_FIELD_DESC = new TField("channelInfo", TType.STRUCT, 1);
  static final TField _APPROVED_AT_FIELD_DESC = new TField("approvedAt", TType.I64, 2);

  ChannelInfo _channelInfo;
  static const int CHANNELINFO = 1;
  int _approvedAt = 0;
  static const int APPROVEDAT = 2;

  bool __isset_approvedAt = false;

  ApprovedChannelInfo() {
  }

  // channelInfo
  ChannelInfo get channelInfo => this._channelInfo;

  set channelInfo(ChannelInfo channelInfo) {
    this._channelInfo = channelInfo;
  }

  bool isSetChannelInfo() => this.channelInfo != null;

  unsetChannelInfo() {
    this.channelInfo = null;
  }

  // approvedAt
  int get approvedAt => this._approvedAt;

  set approvedAt(int approvedAt) {
    this._approvedAt = approvedAt;
    this.__isset_approvedAt = true;
  }

  bool isSetApprovedAt() => this.__isset_approvedAt;

  unsetApprovedAt() {
    this.__isset_approvedAt = false;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case CHANNELINFO:
        return this.channelInfo;
      case APPROVEDAT:
        return this.approvedAt;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case CHANNELINFO:
        if (value == null) {
          unsetChannelInfo();
        } else {
          this.channelInfo = value;
        }
        break;

      case APPROVEDAT:
        if (value == null) {
          unsetApprovedAt();
        } else {
          this.approvedAt = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case CHANNELINFO:
        return isSetChannelInfo();
      case APPROVEDAT:
        return isSetApprovedAt();
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
        case CHANNELINFO:
          if (field.type == TType.STRUCT) {
            this.channelInfo = new ChannelInfo();
            this.channelInfo.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case APPROVEDAT:
          if (field.type == TType.I64) {
            this.approvedAt = iprot.readI64();
            this.__isset_approvedAt = true;
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
    if (this.channelInfo != null) {
      oprot.writeFieldBegin(_CHANNEL_INFO_FIELD_DESC);
      this.channelInfo.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_APPROVED_AT_FIELD_DESC);
    oprot.writeI64(this.approvedAt);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("ApprovedChannelInfo(");

    ret.write("channelInfo:");
    if (this.channelInfo == null) {
      ret.write("null");
    } else {
      ret.write(this.channelInfo);
    }

    ret.write(", ");
    ret.write("approvedAt:");
    ret.write(this.approvedAt);

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

