/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.square_feature;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SquareFeature implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SquareFeature");
  static final TField _CONTROL_STATE_FIELD_DESC = new TField("controlState", TType.I32, 1);
  static final TField _BOOLEAN_VALUE_FIELD_DESC = new TField("booleanValue", TType.I32, 2);

  int _controlState;
  static const int CONTROLSTATE = 1;
  int _booleanValue;
  static const int BOOLEANVALUE = 2;

  bool __isset_controlState = false;
  bool __isset_booleanValue = false;

  SquareFeature() {
  }

  // controlState
  int get controlState => this._controlState;

  set controlState(int controlState) {
    this._controlState = controlState;
    this.__isset_controlState = true;
  }

  bool isSetControlState() => this.__isset_controlState;

  unsetControlState() {
    this.__isset_controlState = false;
  }

  // booleanValue
  int get booleanValue => this._booleanValue;

  set booleanValue(int booleanValue) {
    this._booleanValue = booleanValue;
    this.__isset_booleanValue = true;
  }

  bool isSetBooleanValue() => this.__isset_booleanValue;

  unsetBooleanValue() {
    this.__isset_booleanValue = false;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case CONTROLSTATE:
        return this.controlState;
      case BOOLEANVALUE:
        return this.booleanValue;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case CONTROLSTATE:
        if (value == null) {
          unsetControlState();
        } else {
          this.controlState = value;
        }
        break;

      case BOOLEANVALUE:
        if (value == null) {
          unsetBooleanValue();
        } else {
          this.booleanValue = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case CONTROLSTATE:
        return isSetControlState();
      case BOOLEANVALUE:
        return isSetBooleanValue();
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
        case CONTROLSTATE:
          if (field.type == TType.I32) {
            this.controlState = iprot.readI32();
            this.__isset_controlState = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case BOOLEANVALUE:
          if (field.type == TType.I32) {
            this.booleanValue = iprot.readI32();
            this.__isset_booleanValue = true;
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
    oprot.writeFieldBegin(_CONTROL_STATE_FIELD_DESC);
    oprot.writeI32(this.controlState);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_BOOLEAN_VALUE_FIELD_DESC);
    oprot.writeI32(this.booleanValue);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SquareFeature(");

    ret.write("controlState:");
    String controlState_name = SquareFeatureControlState.VALUES_TO_NAMES[this.controlState];
    if (controlState_name != null) {
      ret.write(controlState_name);
      ret.write(" (");
    }
    ret.write(this.controlState);
    if (controlState_name != null) {
      ret.write(")");
    }

    ret.write(", ");
    ret.write("booleanValue:");
    String booleanValue_name = BooleanState.VALUES_TO_NAMES[this.booleanValue];
    if (booleanValue_name != null) {
      ret.write(booleanValue_name);
      ret.write(" (");
    }
    ret.write(this.booleanValue);
    if (booleanValue_name != null) {
      ret.write(")");
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetControlState() && !SquareFeatureControlState.VALID_VALUES.contains(controlState)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'controlState' has been assigned the invalid value $controlState");
    }
    if (isSetBooleanValue() && !BooleanState.VALID_VALUES.contains(booleanValue)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'booleanValue' has been assigned the invalid value $booleanValue");
    }
  }

}

