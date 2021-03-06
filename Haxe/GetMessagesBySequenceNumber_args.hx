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


class GetMessagesBySequenceNumber_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("getMessagesBySequenceNumber_args"); };
  static var CHANNEL_ID_FIELD_DESC = { new TField("channelId", TType.STRING, 2); };
  static var MESSAGE_BOX_ID_FIELD_DESC = { new TField("messageBoxId", TType.STRING, 3); };
  static var START_SEQ_FIELD_DESC = { new TField("startSeq", TType.I64, 4); };
  static var END_SEQ_FIELD_DESC = { new TField("endSeq", TType.I64, 5); };

  @:isVar
  public var channelId(get,set) : String;
  @:isVar
  public var messageBoxId(get,set) : String;
  @:isVar
  public var startSeq(get,set) : haxe.Int64;
  @:isVar
  public var endSeq(get,set) : haxe.Int64;

  inline static var CHANNELID_FIELD_ID : Int = 2;
  inline static var MESSAGEBOXID_FIELD_ID : Int = 3;
  inline static var STARTSEQ_FIELD_ID : Int = 4;
  inline static var ENDSEQ_FIELD_ID : Int = 5;

  private var __isset_startSeq : Bool = false;
  private var __isset_endSeq : Bool = false;

  public function new() {
  }

  public function get_channelId() : String {
    return this.channelId;
  }

  public function set_channelId(channelId:String) : String {
    this.channelId = channelId;
    return this.channelId;
  }

  public function unsetChannelId() : Void {
    this.channelId = null;
  }

  // Returns true if field channelId is set (has been assigned a value) and false otherwise
  public function isSetChannelId() : Bool {
    return this.channelId != null;
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

  public function get_startSeq() : haxe.Int64 {
    return this.startSeq;
  }

  public function set_startSeq(startSeq:haxe.Int64) : haxe.Int64 {
    this.startSeq = startSeq;
    this.__isset_startSeq = true;
    return this.startSeq;
  }

  public function unsetStartSeq() : Void {
    this.__isset_startSeq = false;
  }

  // Returns true if field startSeq is set (has been assigned a value) and false otherwise
  public function isSetStartSeq() : Bool {
    return this.__isset_startSeq;
  }

  public function get_endSeq() : haxe.Int64 {
    return this.endSeq;
  }

  public function set_endSeq(endSeq:haxe.Int64) : haxe.Int64 {
    this.endSeq = endSeq;
    this.__isset_endSeq = true;
    return this.endSeq;
  }

  public function unsetEndSeq() : Void {
    this.__isset_endSeq = false;
  }

  // Returns true if field endSeq is set (has been assigned a value) and false otherwise
  public function isSetEndSeq() : Bool {
    return this.__isset_endSeq;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case CHANNELID_FIELD_ID:
      if (value == null) {
        unsetChannelId();
      } else {
        this.channelId = value;
      }

    case MESSAGEBOXID_FIELD_ID:
      if (value == null) {
        unsetMessageBoxId();
      } else {
        this.messageBoxId = value;
      }

    case STARTSEQ_FIELD_ID:
      if (value == null) {
        unsetStartSeq();
      } else {
        this.startSeq = value;
      }

    case ENDSEQ_FIELD_ID:
      if (value == null) {
        unsetEndSeq();
      } else {
        this.endSeq = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case CHANNELID_FIELD_ID:
      return this.channelId;
    case MESSAGEBOXID_FIELD_ID:
      return this.messageBoxId;
    case STARTSEQ_FIELD_ID:
      return this.startSeq;
    case ENDSEQ_FIELD_ID:
      return this.endSeq;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case CHANNELID_FIELD_ID:
      return isSetChannelId();
    case MESSAGEBOXID_FIELD_ID:
      return isSetMessageBoxId();
    case STARTSEQ_FIELD_ID:
      return isSetStartSeq();
    case ENDSEQ_FIELD_ID:
      return isSetEndSeq();
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
          case CHANNELID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.channelId = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case MESSAGEBOXID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.messageBoxId = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case STARTSEQ_FIELD_ID:
            if (field.type == TType.I64) {
              this.startSeq = iprot.readI64();
              this.__isset_startSeq = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case ENDSEQ_FIELD_ID:
            if (field.type == TType.I64) {
              this.endSeq = iprot.readI64();
              this.__isset_endSeq = true;
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
      if (this.channelId != null) {
        oprot.writeFieldBegin(CHANNEL_ID_FIELD_DESC);
        oprot.writeString(this.channelId);
        oprot.writeFieldEnd();
      }
      if (this.messageBoxId != null) {
        oprot.writeFieldBegin(MESSAGE_BOX_ID_FIELD_DESC);
        oprot.writeString(this.messageBoxId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(START_SEQ_FIELD_DESC);
      oprot.writeI64(this.startSeq);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(END_SEQ_FIELD_DESC);
      oprot.writeI64(this.endSeq);
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
    var ret : String = "getMessagesBySequenceNumber_args(";
    var first : Bool = true;

    ret += "channelId:";
    if (this.channelId == null) {
      ret += "null";
    } else {
      ret += this.channelId;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "messageBoxId:";
    if (this.messageBoxId == null) {
      ret += "null";
    } else {
      ret += this.messageBoxId;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "startSeq:";
    ret += this.startSeq;
    first = false;
    if (!first) ret +=  ", ";
    ret += "endSeq:";
    ret += this.endSeq;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

