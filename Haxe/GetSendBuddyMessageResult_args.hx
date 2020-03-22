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


class GetSendBuddyMessageResult_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("getSendBuddyMessageResult_args"); };
  static var SEND_BUDDY_MESSAGE_REQUEST_ID_FIELD_DESC = { new TField("sendBuddyMessageRequestId", TType.STRING, 1); };

  @:isVar
  public var sendBuddyMessageRequestId(get,set) : String;

  inline static var SENDBUDDYMESSAGEREQUESTID_FIELD_ID : Int = 1;


  public function new() {
  }

  public function get_sendBuddyMessageRequestId() : String {
    return this.sendBuddyMessageRequestId;
  }

  public function set_sendBuddyMessageRequestId(sendBuddyMessageRequestId:String) : String {
    this.sendBuddyMessageRequestId = sendBuddyMessageRequestId;
    return this.sendBuddyMessageRequestId;
  }

  public function unsetSendBuddyMessageRequestId() : Void {
    this.sendBuddyMessageRequestId = null;
  }

  // Returns true if field sendBuddyMessageRequestId is set (has been assigned a value) and false otherwise
  public function isSetSendBuddyMessageRequestId() : Bool {
    return this.sendBuddyMessageRequestId != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SENDBUDDYMESSAGEREQUESTID_FIELD_ID:
      if (value == null) {
        unsetSendBuddyMessageRequestId();
      } else {
        this.sendBuddyMessageRequestId = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SENDBUDDYMESSAGEREQUESTID_FIELD_ID:
      return this.sendBuddyMessageRequestId;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SENDBUDDYMESSAGEREQUESTID_FIELD_ID:
      return isSetSendBuddyMessageRequestId();
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
          case SENDBUDDYMESSAGEREQUESTID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.sendBuddyMessageRequestId = iprot.readString();
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
      if (this.sendBuddyMessageRequestId != null) {
        oprot.writeFieldBegin(SEND_BUDDY_MESSAGE_REQUEST_ID_FIELD_DESC);
        oprot.writeString(this.sendBuddyMessageRequestId);
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
    var ret : String = "getSendBuddyMessageResult_args(";
    var first : Bool = true;

    ret += "sendBuddyMessageRequestId:";
    if (this.sendBuddyMessageRequestId == null) {
      ret += "null";
    } else {
      ret += this.sendBuddyMessageRequestId;
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

