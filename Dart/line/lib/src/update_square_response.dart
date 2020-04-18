/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.update_square_response;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class UpdateSquareResponse implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("UpdateSquareResponse");
  static final TField _UPDATED_ATTRS_FIELD_DESC = new TField("updatedAttrs", TType.SET, 1);
  static final TField _SQUARE_FIELD_DESC = new TField("square", TType.STRUCT, 2);

  Set<int> _updatedAttrs;
  static const int UPDATEDATTRS = 1;
  Square _square;
  static const int SQUARE = 2;


  UpdateSquareResponse() {
  }

  // updatedAttrs
  Set<int> get updatedAttrs => this._updatedAttrs;

  set updatedAttrs(Set<int> updatedAttrs) {
    this._updatedAttrs = updatedAttrs;
  }

  bool isSetUpdatedAttrs() => this.updatedAttrs != null;

  unsetUpdatedAttrs() {
    this.updatedAttrs = null;
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
      case UPDATEDATTRS:
        return this.updatedAttrs;
      case SQUARE:
        return this.square;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case UPDATEDATTRS:
        if (value == null) {
          unsetUpdatedAttrs();
        } else {
          this.updatedAttrs = value;
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
      case UPDATEDATTRS:
        return isSetUpdatedAttrs();
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
        case UPDATEDATTRS:
          if (field.type == TType.SET) {
            {
              TSet _set404 = iprot.readSetBegin();
              this.updatedAttrs = new Set<int>();
              for (int _i405 = 0; _i405 < _set404.length; ++_i405) {
                int _elem406;
                _elem406 = iprot.readI32();
                this.updatedAttrs.add(_elem406);
              }
              iprot.readSetEnd();
            }
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
    if (this.updatedAttrs != null) {
      oprot.writeFieldBegin(_UPDATED_ATTRS_FIELD_DESC);
      {
        oprot.writeSetBegin(new TSet(TType.I32, this.updatedAttrs.length));
        for (var elem407 in this.updatedAttrs) {
          oprot.writeI32(elem407);
        }
        oprot.writeSetEnd();
      }
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
    StringBuffer ret = new StringBuffer("UpdateSquareResponse(");

    ret.write("updatedAttrs:");
    if (this.updatedAttrs == null) {
      ret.write("null");
    } else {
      ret.write(this.updatedAttrs);
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

