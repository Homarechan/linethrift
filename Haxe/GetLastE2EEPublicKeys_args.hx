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


class GetLastE2EEPublicKeys_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("getLastE2EEPublicKeys_args"); };
  static var CHAT_MID_FIELD_DESC = { new TField("chatMid", TType.STRING, 2); };

  @:isVar
  public var chatMid(get,set) : String;

  inline static var CHATMID_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_chatMid() : String {
    return this.chatMid;
  }

  public function set_chatMid(chatMid:String) : String {
    this.chatMid = chatMid;
    return this.chatMid;
  }

  public function unsetChatMid() : Void {
    this.chatMid = null;
  }

  // Returns true if field chatMid is set (has been assigned a value) and false otherwise
  public function isSetChatMid() : Bool {
    return this.chatMid != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case CHATMID_FIELD_ID:
      if (value == null) {
        unsetChatMid();
      } else {
        this.chatMid = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case CHATMID_FIELD_ID:
      return this.chatMid;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case CHATMID_FIELD_ID:
      return isSetChatMid();
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
          case CHATMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.chatMid = iprot.readString();
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
      if (this.chatMid != null) {
        oprot.writeFieldBegin(CHAT_MID_FIELD_DESC);
        oprot.writeString(this.chatMid);
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
    var ret : String = "getLastE2EEPublicKeys_args(";
    var first : Bool = true;

    ret += "chatMid:";
    if (this.chatMid == null) {
      ret += "null";
    } else {
      ret += this.chatMid;
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

