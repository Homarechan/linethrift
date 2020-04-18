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


class GetRecentMessages_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("getRecentMessages_args"); };
  static var MESSAGE_BOX_ID_FIELD_DESC = { new TField("messageBoxId", TType.STRING, 2); };
  static var MESSAGES_COUNT_FIELD_DESC = { new TField("messagesCount", TType.I32, 3); };

  @:isVar
  public var messageBoxId(get,set) : String;
  @:isVar
  public var messagesCount(get,set) : haxe.Int32;

  inline static var MESSAGEBOXID_FIELD_ID : Int = 2;
  inline static var MESSAGESCOUNT_FIELD_ID : Int = 3;

  private var __isset_messagesCount : Bool = false;

  public function new() {
  }

  public function get_messageBoxId() : String {
    return this.messageBoxId;
  }

  public function set_messageBoxId(messageBoxId:String) : String {
    this.messageBoxId = messageBoxId;
    return this.messageBoxId;
  }

  public function unsetMessageBoxId() : Void {
    this.messageBoxId = null;
  }

  // Returns true if field messageBoxId is set (has been assigned a value) and false otherwise
  public function isSetMessageBoxId() : Bool {
    return this.messageBoxId != null;
  }

  public function get_messagesCount() : haxe.Int32 {
    return this.messagesCount;
  }

  public function set_messagesCount(messagesCount:haxe.Int32) : haxe.Int32 {
    this.messagesCount = messagesCount;
    this.__isset_messagesCount = true;
    return this.messagesCount;
  }

  public function unsetMessagesCount() : Void {
    this.__isset_messagesCount = false;
  }

  // Returns true if field messagesCount is set (has been assigned a value) and false otherwise
  public function isSetMessagesCount() : Bool {
    return this.__isset_messagesCount;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case MESSAGEBOXID_FIELD_ID:
      if (value == null) {
        unsetMessageBoxId();
      } else {
        this.messageBoxId = value;
      }

    case MESSAGESCOUNT_FIELD_ID:
      if (value == null) {
        unsetMessagesCount();
      } else {
        this.messagesCount = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case MESSAGEBOXID_FIELD_ID:
      return this.messageBoxId;
    case MESSAGESCOUNT_FIELD_ID:
      return this.messagesCount;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case MESSAGEBOXID_FIELD_ID:
      return isSetMessageBoxId();
    case MESSAGESCOUNT_FIELD_ID:
      return isSetMessagesCount();
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
          case MESSAGEBOXID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.messageBoxId = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case MESSAGESCOUNT_FIELD_ID:
            if (field.type == TType.I32) {
              this.messagesCount = iprot.readI32();
              this.__isset_messagesCount = true;
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
      if (this.messageBoxId != null) {
        oprot.writeFieldBegin(MESSAGE_BOX_ID_FIELD_DESC);
        oprot.writeString(this.messageBoxId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MESSAGES_COUNT_FIELD_DESC);
      oprot.writeI32(this.messagesCount);
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
    var ret : String = "getRecentMessages_args(";
    var first : Bool = true;

    ret += "messageBoxId:";
    if (this.messageBoxId == null) {
      ret += "null";
    } else {
      ret += this.messageBoxId;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "messagesCount:";
    ret += this.messagesCount;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

