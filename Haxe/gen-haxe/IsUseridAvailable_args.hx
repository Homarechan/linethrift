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


class IsUseridAvailable_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("isUseridAvailable_args"); };
  static var USERID_FIELD_DESC = { new TField("userid", TType.STRING, 2); };

  @:isVar
  public var userid(get,set) : String;

  inline static var USERID_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_userid() : String {
    return this.userid;
  }

  public function set_userid(userid:String) : String {
    this.userid = userid;
    return this.userid;
  }

  public function unsetUserid() : Void {
    this.userid = null;
  }

  // Returns true if field userid is set (has been assigned a value) and false otherwise
  public function isSetUserid() : Bool {
    return this.userid != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case USERID_FIELD_ID:
      if (value == null) {
        unsetUserid();
      } else {
        this.userid = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case USERID_FIELD_ID:
      return this.userid;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case USERID_FIELD_ID:
      return isSetUserid();
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
          case USERID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.userid = iprot.readString();
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
      if (this.userid != null) {
        oprot.writeFieldBegin(USERID_FIELD_DESC);
        oprot.writeString(this.userid);
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
    var ret : String = "isUseridAvailable_args(";
    var first : Bool = true;

    ret += "userid:";
    if (this.userid == null) {
      ret += "null";
    } else {
      ret += this.userid;
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

