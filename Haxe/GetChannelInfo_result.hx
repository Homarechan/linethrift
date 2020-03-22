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


class GetChannelInfo_result implements TBase {
  
  static var STRUCT_DESC = { new TStruct("GetChannelInfo_result"); };
  static var SUCCESS_FIELD_DESC = { new TField("success", TType.STRUCT, 0); };
  static var E_FIELD_DESC = { new TField("e", TType.STRUCT, 1); };

  @:isVar
  public var success(get,set) : ChannelInfo;
  @:isVar
  public var e(get,set) : ChannelException;

  inline static var SUCCESS_FIELD_ID : Int = 0;
  inline static var E_FIELD_ID : Int = 1;


  public function new() {
  }

  public function get_success() : ChannelInfo {
    return this.success;
  }

  public function set_success(success:ChannelInfo) : ChannelInfo {
    this.success = success;
    return this.success;
  }

  public function unsetSuccess() : Void {
    this.success = null;
  }

  // Returns true if field success is set (has been assigned a value) and false otherwise
  public function isSetSuccess() : Bool {
    return this.success != null;
  }

  public function get_e() : ChannelException {
    return this.e;
  }

  public function set_e(e:ChannelException) : ChannelException {
    this.e = e;
    return this.e;
  }

  public function unsetE() : Void {
    this.e = null;
  }

  // Returns true if field e is set (has been assigned a value) and false otherwise
  public function isSetE() : Bool {
    return this.e != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SUCCESS_FIELD_ID:
      if (value == null) {
        unsetSuccess();
      } else {
        this.success = value;
      }

    case E_FIELD_ID:
      if (value == null) {
        unsetE();
      } else {
        this.e = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SUCCESS_FIELD_ID:
      return this.success;
    case E_FIELD_ID:
      return this.e;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SUCCESS_FIELD_ID:
      return isSetSuccess();
    case E_FIELD_ID:
      return isSetE();
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
          case SUCCESS_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.success = new ChannelInfo();
              this.success.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case E_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.e = new ChannelException();
              this.e.read(iprot);
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
    oprot.IncrementRecursionDepth();
    try
    {
      oprot.writeStructBegin(STRUCT_DESC);

      if (this.isSetSuccess()) {
        oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
        this.success.write(oprot);
        oprot.writeFieldEnd();
      } else if (this.isSetE()) {
        oprot.writeFieldBegin(E_FIELD_DESC);
        this.e.write(oprot);
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
    var ret : String = "GetChannelInfo_result(";
    var first : Bool = true;

    ret += "success:";
    if (this.success == null) {
      ret += "null";
    } else {
      ret += this.success;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "e:";
    if (this.e == null) {
      ret += "null";
    } else {
      ret += this.e;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

