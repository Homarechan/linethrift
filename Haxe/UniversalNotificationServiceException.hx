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


class UniversalNotificationServiceException extends TException implements TBase {
  
  static var STRUCT_DESC = { new TStruct("UniversalNotificationServiceException"); };
  static var CODE_FIELD_DESC = { new TField("code", TType.I32, 1); };
  static var REASON_FIELD_DESC = { new TField("reason", TType.STRING, 2); };
  static var PARAMETER_MAP_FIELD_DESC = { new TField("parameterMap", TType.MAP, 3); };

  @:isVar
  public var code(get,set) : Int;
  @:isVar
  public var reason(get,set) : String;
  @:isVar
  public var parameterMap(get,set) : StringMap< String>;

  inline static var CODE_FIELD_ID : Int = 1;
  inline static var REASON_FIELD_ID : Int = 2;
  inline static var PARAMETERMAP_FIELD_ID : Int = 3;

  private var __isset_code : Bool = false;

  public function new() {
    super();
  }

  public function get_code() : Int {
    return this.code;
  }

  public function set_code(code:Int) : Int {
    this.code = code;
    this.__isset_code = true;
    return this.code;
  }

  public function unsetCode() : Void {
    this.__isset_code = false;
  }

  // Returns true if field code is set (has been assigned a value) and false otherwise
  public function isSetCode() : Bool {
    return this.__isset_code;
  }

  public function get_reason() : String {
    return this.reason;
  }

  public function set_reason(reason:String) : String {
    this.reason = reason;
    return this.reason;
  }

  public function unsetReason() : Void {
    this.reason = null;
  }

  // Returns true if field reason is set (has been assigned a value) and false otherwise
  public function isSetReason() : Bool {
    return this.reason != null;
  }

  public function get_parameterMap() : StringMap< String> {
    return this.parameterMap;
  }

  public function set_parameterMap(parameterMap:StringMap< String>) : StringMap< String> {
    this.parameterMap = parameterMap;
    return this.parameterMap;
  }

  public function unsetParameterMap() : Void {
    this.parameterMap = null;
  }

  // Returns true if field parameterMap is set (has been assigned a value) and false otherwise
  public function isSetParameterMap() : Bool {
    return this.parameterMap != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case CODE_FIELD_ID:
      if (value == null) {
        unsetCode();
      } else {
        this.code = value;
      }

    case REASON_FIELD_ID:
      if (value == null) {
        unsetReason();
      } else {
        this.reason = value;
      }

    case PARAMETERMAP_FIELD_ID:
      if (value == null) {
        unsetParameterMap();
      } else {
        this.parameterMap = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case CODE_FIELD_ID:
      return this.code;
    case REASON_FIELD_ID:
      return this.reason;
    case PARAMETERMAP_FIELD_ID:
      return this.parameterMap;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case CODE_FIELD_ID:
      return isSetCode();
    case REASON_FIELD_ID:
      return isSetReason();
    case PARAMETERMAP_FIELD_ID:
      return isSetParameterMap();
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
          case CODE_FIELD_ID:
            if (field.type == TType.I32) {
              this.code = iprot.readI32();
              this.__isset_code = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case REASON_FIELD_ID:
            if (field.type == TType.STRING) {
              this.reason = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PARAMETERMAP_FIELD_ID:
            if (field.type == TType.MAP) {
              {
                var _map588 = iprot.readMapBegin();
                this.parameterMap = new StringMap< String>();
                for( _i589 in 0 ... _map588.size)
                {
                  var _key590 : String;
                  var _val591 : String;
                  _key590 = iprot.readString();
                  _val591 = iprot.readString();
                  this.parameterMap.set( _key590, _val591);
                }
                iprot.readMapEnd();
              }
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
      oprot.writeFieldBegin(CODE_FIELD_DESC);
      oprot.writeI32(this.code);
      oprot.writeFieldEnd();
      if (this.reason != null) {
        oprot.writeFieldBegin(REASON_FIELD_DESC);
        oprot.writeString(this.reason);
        oprot.writeFieldEnd();
      }
      if (this.parameterMap != null) {
        oprot.writeFieldBegin(PARAMETER_MAP_FIELD_DESC);
        {
          var _sizeCounter593 : Int = 0;
          for( _key592 in this.parameterMap) {
            _sizeCounter593++;
          }
          oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, _sizeCounter593));
          for( elem594 in this.parameterMap.keys())
          {
            oprot.writeString(elem594);
            oprot.writeString(this.parameterMap.get(elem594));
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
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
    var ret : String = "UniversalNotificationServiceException(";
    var first : Bool = true;

    ret += "code:";
    var code_name : String = .UniversalNotificationServiceErrorCode.VALUES_TO_NAMES[this.code];
    if (code_name != null) {
      ret += code_name;
      ret += " (";
    }
    ret += this.code;
    if (code_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "reason:";
    if (this.reason == null) {
      ret += "null";
    } else {
      ret += this.reason;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "parameterMap:";
    if (this.parameterMap == null) {
      ret += "null";
    } else {
      ret += this.parameterMap;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetCode() && !.UniversalNotificationServiceErrorCode.VALID_VALUES.contains(code)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'code' has been assigned the invalid value " + code);
    }
  }

}

