/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.create_square_response;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class CreateSquareResponse implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("CreateSquareResponse");
  static final TField _SQUARE_FIELD_DESC = new TField("square", TType.STRUCT, 1);
  static final TField _CREATOR_FIELD_DESC = new TField("creator", TType.STRUCT, 2);
  static final TField _AUTHORITY_FIELD_DESC = new TField("authority", TType.STRUCT, 3);
  static final TField _STATUS_FIELD_DESC = new TField("status", TType.STRUCT, 4);

  Square _square;
  static const int SQUARE = 1;
  SquareMember _creator;
  static const int CREATOR = 2;
  SquareAuthority _authority;
  static const int AUTHORITY = 3;
  SquareStatus _status;
  static const int STATUS = 4;


  CreateSquareResponse() {
  }

  // square
  Square get square => this._square;

  set square(Square square) {
    this._square = square;
  }

  bool isSetSquare() => this.square != null;

  unsetSquare() {
    this.square = null;
  }

  // creator
  SquareMember get creator => this._creator;

  set creator(SquareMember creator) {
    this._creator = creator;
  }

  bool isSetCreator() => this.creator != null;

  unsetCreator() {
    this.creator = null;
  }

  // authority
  SquareAuthority get authority => this._authority;

  set authority(SquareAuthority authority) {
    this._authority = authority;
  }

  bool isSetAuthority() => this.authority != null;

  unsetAuthority() {
    this.authority = null;
  }

  // status
  SquareStatus get status => this._status;

  set status(SquareStatus status) {
    this._status = status;
  }

  bool isSetStatus() => this.status != null;

  unsetStatus() {
    this.status = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SQUARE:
        return this.square;
      case CREATOR:
        return this.creator;
      case AUTHORITY:
        return this.authority;
      case STATUS:
        return this.status;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case SQUARE:
        if (value == null) {
          unsetSquare();
        } else {
          this.square = value;
        }
        break;

      case CREATOR:
        if (value == null) {
          unsetCreator();
        } else {
          this.creator = value;
        }
        break;

      case AUTHORITY:
        if (value == null) {
          unsetAuthority();
        } else {
          this.authority = value;
        }
        break;

      case STATUS:
        if (value == null) {
          unsetStatus();
        } else {
          this.status = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case SQUARE:
        return isSetSquare();
      case CREATOR:
        return isSetCreator();
      case AUTHORITY:
        return isSetAuthority();
      case STATUS:
        return isSetStatus();
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
        case SQUARE:
          if (field.type == TType.STRUCT) {
            this.square = new Square();
            this.square.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CREATOR:
          if (field.type == TType.STRUCT) {
            this.creator = new SquareMember();
            this.creator.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case AUTHORITY:
          if (field.type == TType.STRUCT) {
            this.authority = new SquareAuthority();
            this.authority.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case STATUS:
          if (field.type == TType.STRUCT) {
            this.status = new SquareStatus();
            this.status.read(iprot);
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
    if (this.square != null) {
      oprot.writeFieldBegin(_SQUARE_FIELD_DESC);
      this.square.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.creator != null) {
      oprot.writeFieldBegin(_CREATOR_FIELD_DESC);
      this.creator.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.authority != null) {
      oprot.writeFieldBegin(_AUTHORITY_FIELD_DESC);
      this.authority.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.status != null) {
      oprot.writeFieldBegin(_STATUS_FIELD_DESC);
      this.status.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("CreateSquareResponse(");

    ret.write("square:");
    if (this.square == null) {
      ret.write("null");
    } else {
      ret.write(this.square);
    }

    ret.write(", ");
    ret.write("creator:");
    if (this.creator == null) {
      ret.write("null");
    } else {
      ret.write(this.creator);
    }

    ret.write(", ");
    ret.write("authority:");
    if (this.authority == null) {
      ret.write("null");
    } else {
      ret.write(this.authority);
    }

    ret.write(", ");
    ret.write("status:");
    if (this.status == null) {
      ret.write("null");
    } else {
      ret.write(this.status);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

