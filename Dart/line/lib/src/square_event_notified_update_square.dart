/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.square_event_notified_update_square;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SquareEventNotifiedUpdateSquare implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SquareEventNotifiedUpdateSquare");
  static final TField _SQUARE_MID_FIELD_DESC = new TField("squareMid", TType.STRING, 1);
  static final TField _SQUARE_FIELD_DESC = new TField("square", TType.STRUCT, 2);

  String _squareMid;
  static const int SQUAREMID = 1;
  Square _square;
  static const int SQUARE = 2;


  SquareEventNotifiedUpdateSquare() {
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

  // square
  Square get square => this._square;

  set square(Square square) {
    this._square = square;
  }

  bool isSetSquare() => this.square != null;

  unsetSquare() {
    this.square = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SQUAREMID:
        return this.squareMid;
      case SQUARE:
        return this.square;
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

      case SQUARE:
        if (value == null) {
          unsetSquare();
        } else {
          this.square = value;
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
      case SQUARE:
        return isSetSquare();
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
        case SQUARE:
          if (field.type == TType.STRUCT) {
            this.square = new Square();
            this.square.read(iprot);
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
    if (this.square != null) {
      oprot.writeFieldBegin(_SQUARE_FIELD_DESC);
      this.square.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SquareEventNotifiedUpdateSquare(");

    ret.write("squareMid:");
    if (this.squareMid == null) {
      ret.write("null");
    } else {
      ret.write(this.squareMid);
    }

    ret.write(", ");
    ret.write("square:");
    if (this.square == null) {
      ret.write("null");
    } else {
      ret.write(this.square);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

