/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.square_event_notified_invite_into_square_chat;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SquareEventNotifiedInviteIntoSquareChat implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SquareEventNotifiedInviteIntoSquareChat");
  static final TField _SQUARE_CHAT_MID_FIELD_DESC = new TField("squareChatMid", TType.STRING, 1);
  static final TField _INVITEES_FIELD_DESC = new TField("invitees", TType.LIST, 2);
  static final TField _INVITOR_FIELD_DESC = new TField("invitor", TType.STRUCT, 3);
  static final TField _INVITOR_RELATION_FIELD_DESC = new TField("invitorRelation", TType.STRUCT, 4);

  String _squareChatMid;
  static const int SQUARECHATMID = 1;
  List<SquareMember> _invitees;
  static const int INVITEES = 2;
  SquareMember _invitor;
  static const int INVITOR = 3;
  SquareMemberRelation _invitorRelation;
  static const int INVITORRELATION = 4;


  SquareEventNotifiedInviteIntoSquareChat() {
  }

  // squareChatMid
  String get squareChatMid => this._squareChatMid;

  set squareChatMid(String squareChatMid) {
    this._squareChatMid = squareChatMid;
  }

  bool isSetSquareChatMid() => this.squareChatMid != null;

  unsetSquareChatMid() {
    this.squareChatMid = null;
  }

  // invitees
  List<SquareMember> get invitees => this._invitees;

  set invitees(List<SquareMember> invitees) {
    this._invitees = invitees;
  }

  bool isSetInvitees() => this.invitees != null;

  unsetInvitees() {
    this.invitees = null;
  }

  // invitor
  SquareMember get invitor => this._invitor;

  set invitor(SquareMember invitor) {
    this._invitor = invitor;
  }

  bool isSetInvitor() => this.invitor != null;

  unsetInvitor() {
    this.invitor = null;
  }

  // invitorRelation
  SquareMemberRelation get invitorRelation => this._invitorRelation;

  set invitorRelation(SquareMemberRelation invitorRelation) {
    this._invitorRelation = invitorRelation;
  }

  bool isSetInvitorRelation() => this.invitorRelation != null;

  unsetInvitorRelation() {
    this.invitorRelation = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SQUARECHATMID:
        return this.squareChatMid;
      case INVITEES:
        return this.invitees;
      case INVITOR:
        return this.invitor;
      case INVITORRELATION:
        return this.invitorRelation;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case SQUARECHATMID:
        if (value == null) {
          unsetSquareChatMid();
        } else {
          this.squareChatMid = value;
        }
        break;

      case INVITEES:
        if (value == null) {
          unsetInvitees();
        } else {
          this.invitees = value;
        }
        break;

      case INVITOR:
        if (value == null) {
          unsetInvitor();
        } else {
          this.invitor = value;
        }
        break;

      case INVITORRELATION:
        if (value == null) {
          unsetInvitorRelation();
        } else {
          this.invitorRelation = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case SQUARECHATMID:
        return isSetSquareChatMid();
      case INVITEES:
        return isSetInvitees();
      case INVITOR:
        return isSetInvitor();
      case INVITORRELATION:
        return isSetInvitorRelation();
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
        case SQUARECHATMID:
          if (field.type == TType.STRING) {
            this.squareChatMid = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case INVITEES:
          if (field.type == TType.LIST) {
            {
              TList _list354 = iprot.readListBegin();
              this.invitees = new List<SquareMember>();
              for (int _i355 = 0; _i355 < _list354.length; ++_i355) {
                SquareMember _elem356;
                _elem356 = new SquareMember();
                _elem356.read(iprot);
                this.invitees.add(_elem356);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case INVITOR:
          if (field.type == TType.STRUCT) {
            this.invitor = new SquareMember();
            this.invitor.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case INVITORRELATION:
          if (field.type == TType.STRUCT) {
            this.invitorRelation = new SquareMemberRelation();
            this.invitorRelation.read(iprot);
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
    if (this.squareChatMid != null) {
      oprot.writeFieldBegin(_SQUARE_CHAT_MID_FIELD_DESC);
      oprot.writeString(this.squareChatMid);
      oprot.writeFieldEnd();
    }
    if (this.invitees != null) {
      oprot.writeFieldBegin(_INVITEES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.invitees.length));
        for (var elem357 in this.invitees) {
          elem357.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.invitor != null) {
      oprot.writeFieldBegin(_INVITOR_FIELD_DESC);
      this.invitor.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.invitorRelation != null) {
      oprot.writeFieldBegin(_INVITOR_RELATION_FIELD_DESC);
      this.invitorRelation.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SquareEventNotifiedInviteIntoSquareChat(");

    ret.write("squareChatMid:");
    if (this.squareChatMid == null) {
      ret.write("null");
    } else {
      ret.write(this.squareChatMid);
    }

    ret.write(", ");
    ret.write("invitees:");
    if (this.invitees == null) {
      ret.write("null");
    } else {
      ret.write(this.invitees);
    }

    ret.write(", ");
    ret.write("invitor:");
    if (this.invitor == null) {
      ret.write("null");
    } else {
      ret.write(this.invitor);
    }

    ret.write(", ");
    ret.write("invitorRelation:");
    if (this.invitorRelation == null) {
      ret.write("null");
    } else {
      ret.write(this.invitorRelation);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

