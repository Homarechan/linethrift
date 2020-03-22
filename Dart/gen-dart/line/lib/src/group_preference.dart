/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.group_preference;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class GroupPreference implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("GroupPreference");
  static final TField _INVITATION_TICKET_FIELD_DESC = new TField("invitationTicket", TType.STRING, 1);
  static final TField _FAVORITE_TIMESTAMP_FIELD_DESC = new TField("favoriteTimestamp", TType.I64, 2);

  String _invitationTicket;
  static const int INVITATIONTICKET = 1;
  int _favoriteTimestamp = 0;
  static const int FAVORITETIMESTAMP = 2;

  bool __isset_favoriteTimestamp = false;

  GroupPreference() {
  }

  // invitationTicket
  String get invitationTicket => this._invitationTicket;

  set invitationTicket(String invitationTicket) {
    this._invitationTicket = invitationTicket;
  }

  bool isSetInvitationTicket() => this.invitationTicket != null;

  unsetInvitationTicket() {
    this.invitationTicket = null;
  }

  // favoriteTimestamp
  int get favoriteTimestamp => this._favoriteTimestamp;

  set favoriteTimestamp(int favoriteTimestamp) {
    this._favoriteTimestamp = favoriteTimestamp;
    this.__isset_favoriteTimestamp = true;
  }

  bool isSetFavoriteTimestamp() => this.__isset_favoriteTimestamp;

  unsetFavoriteTimestamp() {
    this.__isset_favoriteTimestamp = false;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case INVITATIONTICKET:
        return this.invitationTicket;
      case FAVORITETIMESTAMP:
        return this.favoriteTimestamp;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case INVITATIONTICKET:
        if (value == null) {
          unsetInvitationTicket();
        } else {
          this.invitationTicket = value;
        }
        break;

      case FAVORITETIMESTAMP:
        if (value == null) {
          unsetFavoriteTimestamp();
        } else {
          this.favoriteTimestamp = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case INVITATIONTICKET:
        return isSetInvitationTicket();
      case FAVORITETIMESTAMP:
        return isSetFavoriteTimestamp();
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
        case INVITATIONTICKET:
          if (field.type == TType.STRING) {
            this.invitationTicket = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case FAVORITETIMESTAMP:
          if (field.type == TType.I64) {
            this.favoriteTimestamp = iprot.readI64();
            this.__isset_favoriteTimestamp = true;
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
    if (this.invitationTicket != null) {
      oprot.writeFieldBegin(_INVITATION_TICKET_FIELD_DESC);
      oprot.writeString(this.invitationTicket);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_FAVORITE_TIMESTAMP_FIELD_DESC);
    oprot.writeI64(this.favoriteTimestamp);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("GroupPreference(");

    ret.write("invitationTicket:");
    if (this.invitationTicket == null) {
      ret.write("null");
    } else {
      ret.write(this.invitationTicket);
    }

    ret.write(", ");
    ret.write("favoriteTimestamp:");
    ret.write(this.favoriteTimestamp);

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}
