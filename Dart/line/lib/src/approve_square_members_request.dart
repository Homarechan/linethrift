/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.approve_square_members_request;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class ApproveSquareMembersRequest implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("ApproveSquareMembersRequest");
  static final TField _SQUARE_MID_FIELD_DESC = new TField("squareMid", TType.STRING, 2);
  static final TField _REQUESTED_MEMBER_MIDS_FIELD_DESC = new TField("requestedMemberMids", TType.LIST, 3);

  String _squareMid;
  static const int SQUAREMID = 2;
  List<String> _requestedMemberMids;
  static const int REQUESTEDMEMBERMIDS = 3;


  ApproveSquareMembersRequest() {
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

  // requestedMemberMids
  List<String> get requestedMemberMids => this._requestedMemberMids;

  set requestedMemberMids(List<String> requestedMemberMids) {
    this._requestedMemberMids = requestedMemberMids;
  }

  bool isSetRequestedMemberMids() => this.requestedMemberMids != null;

  unsetRequestedMemberMids() {
    this.requestedMemberMids = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SQUAREMID:
        return this.squareMid;
      case REQUESTEDMEMBERMIDS:
        return this.requestedMemberMids;
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

      case REQUESTEDMEMBERMIDS:
        if (value == null) {
          unsetRequestedMemberMids();
        } else {
          this.requestedMemberMids = value;
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
      case REQUESTEDMEMBERMIDS:
        return isSetRequestedMemberMids();
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
        case REQUESTEDMEMBERMIDS:
          if (field.type == TType.LIST) {
            {
              TList _list300 = iprot.readListBegin();
              this.requestedMemberMids = new List<String>();
              for (int _i301 = 0; _i301 < _list300.length; ++_i301) {
                String _elem302;
                _elem302 = iprot.readString();
                this.requestedMemberMids.add(_elem302);
              }
              iprot.readListEnd();
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
    if (this.squareMid != null) {
      oprot.writeFieldBegin(_SQUARE_MID_FIELD_DESC);
      oprot.writeString(this.squareMid);
      oprot.writeFieldEnd();
    }
    if (this.requestedMemberMids != null) {
      oprot.writeFieldBegin(_REQUESTED_MEMBER_MIDS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.requestedMemberMids.length));
        for (var elem303 in this.requestedMemberMids) {
          oprot.writeString(elem303);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("ApproveSquareMembersRequest(");

    ret.write("squareMid:");
    if (this.squareMid == null) {
      ret.write("null");
    } else {
      ret.write(this.squareMid);
    }

    ret.write(", ");
    ret.write("requestedMemberMids:");
    if (this.requestedMemberMids == null) {
      ret.write("null");
    } else {
      ret.write(this.requestedMemberMids);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

