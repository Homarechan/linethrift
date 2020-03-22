/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.get_square_member_relations_response;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class GetSquareMemberRelationsResponse implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("GetSquareMemberRelationsResponse");
  static final TField _SQUARE_MEMBERS_FIELD_DESC = new TField("squareMembers", TType.LIST, 1);
  static final TField _RELATIONS_FIELD_DESC = new TField("relations", TType.MAP, 2);
  static final TField _CONTINUATION_TOKEN_FIELD_DESC = new TField("continuationToken", TType.STRING, 3);

  List<SquareMember> _squareMembers;
  static const int SQUAREMEMBERS = 1;
  Map<String, SquareMemberRelation> _relations;
  static const int RELATIONS = 2;
  String _continuationToken;
  static const int CONTINUATIONTOKEN = 3;


  GetSquareMemberRelationsResponse() {
  }

  // squareMembers
  List<SquareMember> get squareMembers => this._squareMembers;

  set squareMembers(List<SquareMember> squareMembers) {
    this._squareMembers = squareMembers;
  }

  bool isSetSquareMembers() => this.squareMembers != null;

  unsetSquareMembers() {
    this.squareMembers = null;
  }

  // relations
  Map<String, SquareMemberRelation> get relations => this._relations;

  set relations(Map<String, SquareMemberRelation> relations) {
    this._relations = relations;
  }

  bool isSetRelations() => this.relations != null;

  unsetRelations() {
    this.relations = null;
  }

  // continuationToken
  String get continuationToken => this._continuationToken;

  set continuationToken(String continuationToken) {
    this._continuationToken = continuationToken;
  }

  bool isSetContinuationToken() => this.continuationToken != null;

  unsetContinuationToken() {
    this.continuationToken = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SQUAREMEMBERS:
        return this.squareMembers;
      case RELATIONS:
        return this.relations;
      case CONTINUATIONTOKEN:
        return this.continuationToken;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case SQUAREMEMBERS:
        if (value == null) {
          unsetSquareMembers();
        } else {
          this.squareMembers = value;
        }
        break;

      case RELATIONS:
        if (value == null) {
          unsetRelations();
        } else {
          this.relations = value;
        }
        break;

      case CONTINUATIONTOKEN:
        if (value == null) {
          unsetContinuationToken();
        } else {
          this.continuationToken = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case SQUAREMEMBERS:
        return isSetSquareMembers();
      case RELATIONS:
        return isSetRelations();
      case CONTINUATIONTOKEN:
        return isSetContinuationToken();
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
        case SQUAREMEMBERS:
          if (field.type == TType.LIST) {
            {
              TList _list386 = iprot.readListBegin();
              this.squareMembers = new List<SquareMember>();
              for (int _i387 = 0; _i387 < _list386.length; ++_i387) {
                SquareMember _elem388;
                _elem388 = new SquareMember();
                _elem388.read(iprot);
                this.squareMembers.add(_elem388);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case RELATIONS:
          if (field.type == TType.MAP) {
            {
              TMap _map389 = iprot.readMapBegin();
              this.relations = new Map<String, SquareMemberRelation>();
              for (int _i390 = 0; _i390 < _map389.length; ++_i390) {
                String _key391;
                SquareMemberRelation _val392;
                _key391 = iprot.readString();
                _val392 = new SquareMemberRelation();
                _val392.read(iprot);
                this.relations[_key391] = _val392;
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CONTINUATIONTOKEN:
          if (field.type == TType.STRING) {
            this.continuationToken = iprot.readString();
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
    if (this.squareMembers != null) {
      oprot.writeFieldBegin(_SQUARE_MEMBERS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.squareMembers.length));
        for (var elem393 in this.squareMembers) {
          elem393.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.relations != null) {
      oprot.writeFieldBegin(_RELATIONS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRUCT, this.relations.length));
        for (var elem395 in this.relations.keys) {
          oprot.writeString(elem395);
          this.relations[elem395].write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.continuationToken != null) {
      oprot.writeFieldBegin(_CONTINUATION_TOKEN_FIELD_DESC);
      oprot.writeString(this.continuationToken);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("GetSquareMemberRelationsResponse(");

    ret.write("squareMembers:");
    if (this.squareMembers == null) {
      ret.write("null");
    } else {
      ret.write(this.squareMembers);
    }

    ret.write(", ");
    ret.write("relations:");
    if (this.relations == null) {
      ret.write("null");
    } else {
      ret.write(this.relations);
    }

    ret.write(", ");
    ret.write("continuationToken:");
    if (this.continuationToken == null) {
      ret.write("null");
    } else {
      ret.write(this.continuationToken);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

