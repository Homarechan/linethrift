/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.friend_channel_matrix;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class FriendChannelMatrix implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("FriendChannelMatrix");
  static final TField _CHANNEL_ID_FIELD_DESC = new TField("channelId", TType.STRING, 1);
  static final TField _REPRESENT_MID_FIELD_DESC = new TField("representMid", TType.STRING, 2);
  static final TField _COUNT_FIELD_DESC = new TField("count", TType.I32, 3);
  static final TField _POINT_FIELD_DESC = new TField("point", TType.I32, 4);

  String _channelId;
  static const int CHANNELID = 1;
  String _representMid;
  static const int REPRESENTMID = 2;
  int _count = 0;
  static const int COUNT = 3;
  int _point = 0;
  static const int POINT = 4;

  bool __isset_count = false;
  bool __isset_point = false;

  FriendChannelMatrix() {
  }

  // channelId
  String get channelId => this._channelId;

  set channelId(String channelId) {
    this._channelId = channelId;
  }

  bool isSetChannelId() => this.channelId != null;

  unsetChannelId() {
    this.channelId = null;
  }

  // representMid
  String get representMid => this._representMid;

  set representMid(String representMid) {
    this._representMid = representMid;
  }

  bool isSetRepresentMid() => this.representMid != null;

  unsetRepresentMid() {
    this.representMid = null;
  }

  // count
  int get count => this._count;

  set count(int count) {
    this._count = count;
    this.__isset_count = true;
  }

  bool isSetCount() => this.__isset_count;

  unsetCount() {
    this.__isset_count = false;
  }

  // point
  int get point => this._point;

  set point(int point) {
    this._point = point;
    this.__isset_point = true;
  }

  bool isSetPoint() => this.__isset_point;

  unsetPoint() {
    this.__isset_point = false;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case CHANNELID:
        return this.channelId;
      case REPRESENTMID:
        return this.representMid;
      case COUNT:
        return this.count;
      case POINT:
        return this.point;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case CHANNELID:
        if (value == null) {
          unsetChannelId();
        } else {
          this.channelId = value;
        }
        break;

      case REPRESENTMID:
        if (value == null) {
          unsetRepresentMid();
        } else {
          this.representMid = value;
        }
        break;

      case COUNT:
        if (value == null) {
          unsetCount();
        } else {
          this.count = value;
        }
        break;

      case POINT:
        if (value == null) {
          unsetPoint();
        } else {
          this.point = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case CHANNELID:
        return isSetChannelId();
      case REPRESENTMID:
        return isSetRepresentMid();
      case COUNT:
        return isSetCount();
      case POINT:
        return isSetPoint();
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
        case CHANNELID:
          if (field.type == TType.STRING) {
            this.channelId = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case REPRESENTMID:
          if (field.type == TType.STRING) {
            this.representMid = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case COUNT:
          if (field.type == TType.I32) {
            this.count = iprot.readI32();
            this.__isset_count = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case POINT:
          if (field.type == TType.I32) {
            this.point = iprot.readI32();
            this.__isset_point = true;
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
    if (this.channelId != null) {
      oprot.writeFieldBegin(_CHANNEL_ID_FIELD_DESC);
      oprot.writeString(this.channelId);
      oprot.writeFieldEnd();
    }
    if (this.representMid != null) {
      oprot.writeFieldBegin(_REPRESENT_MID_FIELD_DESC);
      oprot.writeString(this.representMid);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_COUNT_FIELD_DESC);
    oprot.writeI32(this.count);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_POINT_FIELD_DESC);
    oprot.writeI32(this.point);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("FriendChannelMatrix(");

    ret.write("channelId:");
    if (this.channelId == null) {
      ret.write("null");
    } else {
      ret.write(this.channelId);
    }

    ret.write(", ");
    ret.write("representMid:");
    if (this.representMid == null) {
      ret.write("null");
    } else {
      ret.write(this.representMid);
    }

    ret.write(", ");
    ret.write("count:");
    ret.write(this.count);

    ret.write(", ");
    ret.write("point:");
    ret.write(this.point);

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

