/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.square_event_notification_member_update;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SquareEventNotificationMemberUpdate implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SquareEventNotificationMemberUpdate");
  static final TField _SQUARE_MID_FIELD_DESC = new TField("squareMid", TType.STRING, 1);
  static final TField _SQUARE_NAME_FIELD_DESC = new TField("squareName", TType.STRING, 2);
  static final TField _PROFILE_IMAGE_OBS_HASH_FIELD_DESC = new TField("profileImageObsHash", TType.STRING, 3);

  String _squareMid;
  static const int SQUAREMID = 1;
  String _squareName;
  static const int SQUARENAME = 2;
  String _profileImageObsHash;
  static const int PROFILEIMAGEOBSHASH = 3;


  SquareEventNotificationMemberUpdate() {
  }

  // squareMid
  String get squareMid => this._squareMid;

  set squareMid(String squareMid) {
    this._squareMid = squareMid;
  }

  bool isSetSquareMid() => this.squareMid != null;

  unsetSquareMid() {
    this.squareMid = null;
  }

  // squareName
  String get squareName => this._squareName;

  set squareName(String squareName) {
    this._squareName = squareName;
  }

  bool isSetSquareName() => this.squareName != null;

  unsetSquareName() {
    this.squareName = null;
  }

  // profileImageObsHash
  String get profileImageObsHash => this._profileImageObsHash;

  set profileImageObsHash(String profileImageObsHash) {
    this._profileImageObsHash = profileImageObsHash;
  }

  bool isSetProfileImageObsHash() => this.profileImageObsHash != null;

  unsetProfileImageObsHash() {
    this.profileImageObsHash = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SQUAREMID:
        return this.squareMid;
      case SQUARENAME:
        return this.squareName;
      case PROFILEIMAGEOBSHASH:
        return this.profileImageObsHash;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case SQUAREMID:
        if (value == null) {
          unsetSquareMid();
        } else {
          this.squareMid = value;
        }
        break;

      case SQUARENAME:
        if (value == null) {
          unsetSquareName();
        } else {
          this.squareName = value;
        }
        break;

      case PROFILEIMAGEOBSHASH:
        if (value == null) {
          unsetProfileImageObsHash();
        } else {
          this.profileImageObsHash = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case SQUAREMID:
        return isSetSquareMid();
      case SQUARENAME:
        return isSetSquareName();
      case PROFILEIMAGEOBSHASH:
        return isSetProfileImageObsHash();
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
        case SQUAREMID:
          if (field.type == TType.STRING) {
            this.squareMid = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SQUARENAME:
          if (field.type == TType.STRING) {
            this.squareName = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PROFILEIMAGEOBSHASH:
          if (field.type == TType.STRING) {
            this.profileImageObsHash = iprot.readString();
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
    if (this.squareMid != null) {
      oprot.writeFieldBegin(_SQUARE_MID_FIELD_DESC);
      oprot.writeString(this.squareMid);
      oprot.writeFieldEnd();
    }
    if (this.squareName != null) {
      oprot.writeFieldBegin(_SQUARE_NAME_FIELD_DESC);
      oprot.writeString(this.squareName);
      oprot.writeFieldEnd();
    }
    if (this.profileImageObsHash != null) {
      oprot.writeFieldBegin(_PROFILE_IMAGE_OBS_HASH_FIELD_DESC);
      oprot.writeString(this.profileImageObsHash);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SquareEventNotificationMemberUpdate(");

    ret.write("squareMid:");
    if (this.squareMid == null) {
      ret.write("null");
    } else {
      ret.write(this.squareMid);
    }

    ret.write(", ");
    ret.write("squareName:");
    if (this.squareName == null) {
      ret.write("null");
    } else {
      ret.write(this.squareName);
    }

    ret.write(", ");
    ret.write("profileImageObsHash:");
    if (this.profileImageObsHash == null) {
      ret.write("null");
    } else {
      ret.write(this.profileImageObsHash);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}
