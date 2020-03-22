/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.get_square_member_response;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class GetSquareMemberResponse implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("GetSquareMemberResponse");
  static final TField _SQUARE_MEMBER_FIELD_DESC = new TField("squareMember", TType.STRUCT, 1);
  static final TField _RELATION_FIELD_DESC = new TField("relation", TType.STRUCT, 2);
  static final TField _ONE_ON_ONE_CHAT_MID_FIELD_DESC = new TField("oneOnOneChatMid", TType.STRING, 3);

  SquareMember _squareMember;
  static const int SQUAREMEMBER = 1;
  SquareMemberRelation _relation;
  static const int RELATION = 2;
  String _oneOnOneChatMid;
  static const int ONEONONECHATMID = 3;


  GetSquareMemberResponse() {
  }

  // squareMember
  SquareMember get squareMember => this._squareMember;

  set squareMember(SquareMember squareMember) {
    this._squareMember = squareMember;
  }

  bool isSetSquareMember() => this.squareMember != null;

  unsetSquareMember() {
    this.squareMember = null;
  }

  // relation
  SquareMemberRelation get relation => this._relation;

  set relation(SquareMemberRelation relation) {
    this._relation = relation;
  }

  bool isSetRelation() => this.relation != null;

  unsetRelation() {
    this.relation = null;
  }

  // oneOnOneChatMid
  String get oneOnOneChatMid => this._oneOnOneChatMid;

  set oneOnOneChatMid(String oneOnOneChatMid) {
    this._oneOnOneChatMid = oneOnOneChatMid;
  }

  bool isSetOneOnOneChatMid() => this.oneOnOneChatMid != null;

  unsetOneOnOneChatMid() {
    this.oneOnOneChatMid = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SQUAREMEMBER:
        return this.squareMember;
      case RELATION:
        return this.relation;
      case ONEONONECHATMID:
        return this.oneOnOneChatMid;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case SQUAREMEMBER:
        if (value == null) {
          unsetSquareMember();
        } else {
          this.squareMember = value;
        }
        break;

      case RELATION:
        if (value == null) {
          unsetRelation();
        } else {
          this.relation = value;
        }
        break;

      case ONEONONECHATMID:
        if (value == null) {
          unsetOneOnOneChatMid();
        } else {
          this.oneOnOneChatMid = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case SQUAREMEMBER:
        return isSetSquareMember();
      case RELATION:
        return isSetRelation();
      case ONEONONECHATMID:
        return isSetOneOnOneChatMid();
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
        case SQUAREMEMBER:
          if (field.type == TType.STRUCT) {
            this.squareMember = new SquareMember();
            this.squareMember.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case RELATION:
          if (field.type == TType.STRUCT) {
            this.relation = new SquareMemberRelation();
            this.relation.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ONEONONECHATMID:
          if (field.type == TType.STRING) {
            this.oneOnOneChatMid = iprot.readString();
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
    if (this.squareMember != null) {
      oprot.writeFieldBegin(_SQUARE_MEMBER_FIELD_DESC);
      this.squareMember.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.relation != null) {
      oprot.writeFieldBegin(_RELATION_FIELD_DESC);
      this.relation.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.oneOnOneChatMid != null) {
      oprot.writeFieldBegin(_ONE_ON_ONE_CHAT_MID_FIELD_DESC);
      oprot.writeString(this.oneOnOneChatMid);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("GetSquareMemberResponse(");

    ret.write("squareMember:");
    if (this.squareMember == null) {
      ret.write("null");
    } else {
      ret.write(this.squareMember);
    }

    ret.write(", ");
    ret.write("relation:");
    if (this.relation == null) {
      ret.write("null");
    } else {
      ret.write(this.relation);
    }

    ret.write(", ");
    ret.write("oneOnOneChatMid:");
    if (this.oneOnOneChatMid == null) {
      ret.write("null");
    } else {
      ret.write(this.oneOnOneChatMid);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

