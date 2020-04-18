/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.square_event_notified_update_square_feature_set;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SquareEventNotifiedUpdateSquareFeatureSet implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SquareEventNotifiedUpdateSquareFeatureSet");
  static final TField _SQUARE_FEATURE_SET_FIELD_DESC = new TField("squareFeatureSet", TType.STRUCT, 1);

  SquareFeatureSet _squareFeatureSet;
  static const int SQUAREFEATURESET = 1;


  SquareEventNotifiedUpdateSquareFeatureSet() {
  }

  // squareFeatureSet
  SquareFeatureSet get squareFeatureSet => this._squareFeatureSet;

  set squareFeatureSet(SquareFeatureSet squareFeatureSet) {
    this._squareFeatureSet = squareFeatureSet;
  }

  bool isSetSquareFeatureSet() => this.squareFeatureSet != null;

  unsetSquareFeatureSet() {
    this.squareFeatureSet = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SQUAREFEATURESET:
        return this.squareFeatureSet;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case SQUAREFEATURESET:
        if (value == null) {
          unsetSquareFeatureSet();
        } else {
          this.squareFeatureSet = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case SQUAREFEATURESET:
        return isSetSquareFeatureSet();
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
        case SQUAREFEATURESET:
          if (field.type == TType.STRUCT) {
            this.squareFeatureSet = new SquareFeatureSet();
            this.squareFeatureSet.read(iprot);
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
    if (this.squareFeatureSet != null) {
      oprot.writeFieldBegin(_SQUARE_FEATURE_SET_FIELD_DESC);
      this.squareFeatureSet.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SquareEventNotifiedUpdateSquareFeatureSet(");

    ret.write("squareFeatureSet:");
    if (this.squareFeatureSet == null) {
      ret.write("null");
    } else {
      ret.write(this.squareFeatureSet);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

