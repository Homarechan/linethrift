/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.meta_profile;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class MetaProfile implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("MetaProfile");
  static final TField _CREATE_TIME_FIELD_DESC = new TField("createTime", TType.I64, 1);
  static final TField _REGION_CODE_FIELD_DESC = new TField("regionCode", TType.STRING, 2);
  static final TField _IDENTITIES_FIELD_DESC = new TField("identities", TType.MAP, 3);

  int _createTime = 0;
  static const int CREATETIME = 1;
  String _regionCode;
  static const int REGIONCODE = 2;
  Map<int, String> _identities;
  static const int IDENTITIES = 3;

  bool __isset_createTime = false;

  MetaProfile() {
  }

  // createTime
  int get createTime => this._createTime;

  set createTime(int createTime) {
    this._createTime = createTime;
    this.__isset_createTime = true;
  }

  bool isSetCreateTime() => this.__isset_createTime;

  unsetCreateTime() {
    this.__isset_createTime = false;
  }

  // regionCode
  String get regionCode => this._regionCode;

  set regionCode(String regionCode) {
    this._regionCode = regionCode;
  }

  bool isSetRegionCode() => this.regionCode != null;

  unsetRegionCode() {
    this.regionCode = null;
  }

  // identities
  Map<int, String> get identities => this._identities;

  set identities(Map<int, String> identities) {
    this._identities = identities;
  }

  bool isSetIdentities() => this.identities != null;

  unsetIdentities() {
    this.identities = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case CREATETIME:
        return this.createTime;
      case REGIONCODE:
        return this.regionCode;
      case IDENTITIES:
        return this.identities;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case CREATETIME:
        if (value == null) {
          unsetCreateTime();
        } else {
          this.createTime = value;
        }
        break;

      case REGIONCODE:
        if (value == null) {
          unsetRegionCode();
        } else {
          this.regionCode = value;
        }
        break;

      case IDENTITIES:
        if (value == null) {
          unsetIdentities();
        } else {
          this.identities = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case CREATETIME:
        return isSetCreateTime();
      case REGIONCODE:
        return isSetRegionCode();
      case IDENTITIES:
        return isSetIdentities();
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
        case CREATETIME:
          if (field.type == TType.I64) {
            this.createTime = iprot.readI64();
            this.__isset_createTime = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case REGIONCODE:
          if (field.type == TType.STRING) {
            this.regionCode = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case IDENTITIES:
          if (field.type == TType.MAP) {
            {
              TMap _map180 = iprot.readMapBegin();
              this.identities = new Map<int, String>();
              for (int _i181 = 0; _i181 < _map180.length; ++_i181) {
                int _key182;
                String _val183;
                _key182 = iprot.readI32();
                _val183 = iprot.readString();
                this.identities[_key182] = _val183;
              }
              iprot.readMapEnd();
            }
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
    oprot.writeFieldBegin(_CREATE_TIME_FIELD_DESC);
    oprot.writeI64(this.createTime);
    oprot.writeFieldEnd();
    if (this.regionCode != null) {
      oprot.writeFieldBegin(_REGION_CODE_FIELD_DESC);
      oprot.writeString(this.regionCode);
      oprot.writeFieldEnd();
    }
    if (this.identities != null) {
      oprot.writeFieldBegin(_IDENTITIES_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.STRING, this.identities.length));
        for (var elem185 in this.identities.keys) {
          oprot.writeI32(elem185);
          oprot.writeString(this.identities[elem185]);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("MetaProfile(");

    ret.write("createTime:");
    ret.write(this.createTime);

    ret.write(", ");
    ret.write("regionCode:");
    if (this.regionCode == null) {
      ret.write("null");
    } else {
      ret.write(this.regionCode);
    }

    ret.write(", ");
    ret.write("identities:");
    if (this.identities == null) {
      ret.write("null");
    } else {
      ret.write(this.identities);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

