/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;
import haxe.io.Bytes;
import haxe.ds.IntMap;
import haxe.ds.StringMap;
import haxe.ds.ObjectMap;

#if flash
import flash.errors.ArgumentError;
#end

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;


class SquareFeature implements TBase {
  
  static var STRUCT_DESC = { new TStruct("SquareFeature"); };
  static var CONTROL_STATE_FIELD_DESC = { new TField("controlState", TType.I32, 1); };
  static var BOOLEAN_VALUE_FIELD_DESC = { new TField("booleanValue", TType.I32, 2); };

  @:isVar
  public var controlState(get,set) : Int;
  @:isVar
  public var booleanValue(get,set) : Int;

  inline static var CONTROLSTATE_FIELD_ID : Int = 1;
  inline static var BOOLEANVALUE_FIELD_ID : Int = 2;

  private var __isset_controlState : Bool = false;
  private var __isset_booleanValue : Bool = false;

  public function new() {
  }

  public function get_controlState() : Int {
    return this.controlState;
  }

  public function set_controlState(controlState:Int) : Int {
    this.controlState = controlState;
    this.__isset_controlState = true;
    return this.controlState;
  }

  public function unsetControlState() : Void {
    this.__isset_controlState = false;
  }

  // Returns true if field controlState is set (has been assigned a value) and false otherwise
  public function isSetControlState() : Bool {
    return this.__isset_controlState;
  }

  public function get_booleanValue() : Int {
    return this.booleanValue;
  }

  public function set_booleanValue(booleanValue:Int) : Int {
    this.booleanValue = booleanValue;
    this.__isset_booleanValue = true;
    return this.booleanValue;
  }

  public function unsetBooleanValue() : Void {
    this.__isset_booleanValue = false;
  }

  // Returns true if field booleanValue is set (has been assigned a value) and false otherwise
  public function isSetBooleanValue() : Bool {
    return this.__isset_booleanValue;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case CONTROLSTATE_FIELD_ID:
      if (value == null) {
        unsetControlState();
      } else {
        this.controlState = value;
      }

    case BOOLEANVALUE_FIELD_ID:
      if (value == null) {
        unsetBooleanValue();
      } else {
        this.booleanValue = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case CONTROLSTATE_FIELD_ID:
      return this.controlState;
    case BOOLEANVALUE_FIELD_ID:
      return this.booleanValue;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case CONTROLSTATE_FIELD_ID:
      return isSetControlState();
    case BOOLEANVALUE_FIELD_ID:
      return isSetBooleanValue();
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function read( iprot : TProtocol) : Void {
    iprot.IncrementRecursionDepth();
    try
    {
      var field : TField;
      iprot.readStructBegin();
      while (true)
      {
        field = iprot.readFieldBegin();
        if (field.type == TType.STOP) { 
          break;
        }
        switch (field.id)
        {
          case CONTROLSTATE_FIELD_ID:
            if (field.type == TType.I32) {
              this.controlState = iprot.readI32();
              this.__isset_controlState = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case BOOLEANVALUE_FIELD_ID:
            if (field.type == TType.I32) {
              this.booleanValue = iprot.readI32();
              this.__isset_booleanValue = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          default:
            TProtocolUtil.skip(iprot, field.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      iprot.DecrementRecursionDepth();
    }
    catch(e:Dynamic)
    {
      iprot.DecrementRecursionDepth();
      throw e;
    }

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public function write(oprot:TProtocol) : Void {
    validate();
    oprot.IncrementRecursionDepth();
    try
    {
      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CONTROL_STATE_FIELD_DESC);
      oprot.writeI32(this.controlState);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BOOLEAN_VALUE_FIELD_DESC);
      oprot.writeI32(this.booleanValue);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
      oprot.DecrementRecursionDepth();
    }
    catch(e:Dynamic)
    {
      oprot.DecrementRecursionDepth();
      throw e;
    }
  }

  public function toString() : String {
    var ret : String = "SquareFeature(";
    var first : Bool = true;

    ret += "controlState:";
    var controlState_name : String = .SquareFeatureControlState.VALUES_TO_NAMES[this.controlState];
    if (controlState_name != null) {
      ret += controlState_name;
      ret += " (";
    }
    ret += this.controlState;
    if (controlState_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "booleanValue:";
    var booleanValue_name : String = .BooleanState.VALUES_TO_NAMES[this.booleanValue];
    if (booleanValue_name != null) {
      ret += booleanValue_name;
      ret += " (";
    }
    ret += this.booleanValue;
    if (booleanValue_name != null) {
      ret += ")";
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetControlState() && !.SquareFeatureControlState.VALID_VALUES.contains(controlState)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'controlState' has been assigned the invalid value " + controlState);
    }
    if (isSetBooleanValue() && !.BooleanState.VALID_VALUES.contains(booleanValue)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'booleanValue' has been assigned the invalid value " + booleanValue);
    }
  }

}

