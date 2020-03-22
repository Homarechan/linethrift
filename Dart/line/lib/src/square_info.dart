/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.square_info;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SquareInfo implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SquareInfo");
  static final TField _SQUARE_FIELD_DESC = new TField("square", TType.STRUCT, 1);
  static final TField _SQUARE_STATUS_FIELD_DESC = new TField("squareStatus", TType.STRUCT, 2);
  static final TField _SQUARE_NOTE_STATUS_FIELD_DESC = new TField("squareNoteStatus", TType.STRUCT, 3);

  Square _square;
  static const int SQUARE = 1;
  SquareStatus _squareStatus;
  static const int SQUARESTATUS = 2;
  NoteStatus _squareNoteStatus;
  static const int SQUARENOTESTATUS = 3;


  SquareInfo() {
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

  // squareStatus
  SquareStatus get squareStatus => this._squareStatus;

  set squareStatus(SquareStatus squareStatus) {
    this._squareStatus = squareStatus;
  }

  bool isSetSquareStatus() => this.squareStatus != null;

  unsetSquareStatus() {
    this.squareStatus = null;
  }

  // squareNoteStatus
  NoteStatus get squareNoteStatus => this._squareNoteStatus;

  set squareNoteStatus(NoteStatus squareNoteStatus) {
    this._squareNoteStatus = squareNoteStatus;
  }

  bool isSetSquareNoteStatus() => this.squareNoteStatus != null;

  unsetSquareNoteStatus() {
    this.squareNoteStatus = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SQUARE:
        return this.square;
      case SQUARESTATUS:
        return this.squareStatus;
      case SQUARENOTESTATUS:
        return this.squareNoteStatus;
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

      case SQUARESTATUS:
        if (value == null) {
          unsetSquareStatus();
        } else {
          this.squareStatus = value;
        }
        break;

      case SQUARENOTESTATUS:
        if (value == null) {
          unsetSquareNoteStatus();
        } else {
          this.squareNoteStatus = value;
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
      case SQUARESTATUS:
        return isSetSquareStatus();
      case SQUARENOTESTATUS:
        return isSetSquareNoteStatus();
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
        case SQUARESTATUS:
          if (field.type == TType.STRUCT) {
            this.squareStatus = new SquareStatus();
            this.squareStatus.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SQUARENOTESTATUS:
          if (field.type == TType.STRUCT) {
            this.squareNoteStatus = new NoteStatus();
            this.squareNoteStatus.read(iprot);
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
    if (this.squareStatus != null) {
      oprot.writeFieldBegin(_SQUARE_STATUS_FIELD_DESC);
      this.squareStatus.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.squareNoteStatus != null) {
      oprot.writeFieldBegin(_SQUARE_NOTE_STATUS_FIELD_DESC);
      this.squareNoteStatus.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SquareInfo(");

    ret.write("square:");
    if (this.square == null) {
      ret.write("null");
    } else {
      ret.write(this.square);
    }

    ret.write(", ");
    ret.write("squareStatus:");
    if (this.squareStatus == null) {
      ret.write("null");
    } else {
      ret.write(this.squareStatus);
    }

    ret.write(", ");
    ret.write("squareNoteStatus:");
    if (this.squareNoteStatus == null) {
      ret.write("null");
    } else {
      ret.write(this.squareNoteStatus);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

