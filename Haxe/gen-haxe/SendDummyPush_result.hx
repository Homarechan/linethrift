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


class SendDummyPush_result implements TBase {
  
  static var STRUCT_DESC = { new TStruct("SendDummyPush_result"); };
  static var E_FIELD_DESC = { new TField("e", TType.STRUCT, 1); };

  @:isVar
  public var e(get,set) : TalkException;

  inline static var E_FIELD_ID : Int = 1;


  public function new() {
  }

  public function get_e() : TalkException {
    return this.e;
  }

  public function set_e(e:TalkException) : TalkException {
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
    case E_FIELD_ID:
      return this.e;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
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
          case E_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.e = new TalkException();
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

      if (this.isSetE()) {
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
    var ret : String = "SendDummyPush_result(";
    var first : Bool = true;

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

