/**
 * Autogenerated by Thrift Compiler (0.14.0)
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


class GetNotificationPolicy_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("getNotificationPolicy_args"); };
  static var CARRIER_FIELD_DESC = { new TField("carrier", TType.I32, 2); };

  @:isVar
  public var carrier(get,set) : Int;

  inline static var CARRIER_FIELD_ID : Int = 2;

  private var __isset_carrier : Bool = false;

  public function new() {
  }

  public function get_carrier() : Int {
    return this.carrier;
  }

  public function set_carrier(carrier:Int) : Int {
    this.carrier = carrier;
    this.__isset_carrier = true;
    return this.carrier;
  }

  public function unsetCarrier() : Void {
    this.__isset_carrier = false;
  }

  // Returns true if field carrier is set (has been assigned a value) and false otherwise
  public function isSetCarrier() : Bool {
    return this.__isset_carrier;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case CARRIER_FIELD_ID:
      if (value == null) {
        unsetCarrier();
      } else {
        this.carrier = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case CARRIER_FIELD_ID:
      return this.carrier;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case CARRIER_FIELD_ID:
      return isSetCarrier();
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
          case CARRIER_FIELD_ID:
            if (field.type == TType.I32) {
              this.carrier = iprot.readI32();
              this.__isset_carrier = true;
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
      oprot.writeFieldBegin(CARRIER_FIELD_DESC);
      oprot.writeI32(this.carrier);
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
    var ret : String = "getNotificationPolicy_args(";
    var first : Bool = true;

    ret += "carrier:";
    var carrier_name : String = .CarrierCode.VALUES_TO_NAMES[this.carrier];
    if (carrier_name != null) {
      ret += carrier_name;
      ret += " (";
    }
    ret += this.carrier;
    if (carrier_name != null) {
      ret += ")";
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetCarrier() && !.CarrierCode.VALID_VALUES.contains(carrier)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'carrier' has been assigned the invalid value " + carrier);
    }
  }

}

