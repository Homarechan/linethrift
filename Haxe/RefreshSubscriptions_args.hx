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


class RefreshSubscriptions_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("refreshSubscriptions_args"); };
  static var REQUEST_FIELD_DESC = { new TField("request", TType.STRUCT, 1); };

  @:isVar
  public var request(get,set) : RefreshSubscriptionsRequest;

  inline static var REQUEST_FIELD_ID : Int = 1;


  public function new() {
  }

  public function get_request() : RefreshSubscriptionsRequest {
    return this.request;
  }

  public function set_request(request:RefreshSubscriptionsRequest) : RefreshSubscriptionsRequest {
    this.request = request;
    return this.request;
  }

  public function unsetRequest() : Void {
    this.request = null;
  }

  // Returns true if field request is set (has been assigned a value) and false otherwise
  public function isSetRequest() : Bool {
    return this.request != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case REQUEST_FIELD_ID:
      if (value == null) {
        unsetRequest();
      } else {
        this.request = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case REQUEST_FIELD_ID:
      return this.request;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case REQUEST_FIELD_ID:
      return isSetRequest();
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
          case REQUEST_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.request = new RefreshSubscriptionsRequest();
              this.request.read(iprot);
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
      if (this.request != null) {
        oprot.writeFieldBegin(REQUEST_FIELD_DESC);
        this.request.write(oprot);
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
    var ret : String = "refreshSubscriptions_args(";
    var first : Bool = true;

    ret += "request:";
    if (this.request == null) {
      ret += "null";
    } else {
      ret += this.request;
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

