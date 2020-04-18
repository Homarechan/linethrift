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


class SendChatCheckedByWatermark_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("sendChatCheckedByWatermark_args"); };
  static var SEQ_FIELD_DESC = { new TField("seq", TType.I32, 1); };
  static var MID_FIELD_DESC = { new TField("mid", TType.STRING, 2); };
  static var WATERMARK_FIELD_DESC = { new TField("watermark", TType.I64, 3); };
  static var SESSION_ID_FIELD_DESC = { new TField("sessionId", TType.BYTE, 4); };

  @:isVar
  public var seq(get,set) : haxe.Int32;
  @:isVar
  public var mid(get,set) : String;
  @:isVar
  public var watermark(get,set) : haxe.Int64;
  @:isVar
  public var sessionId(get,set) : haxe.Int32;

  inline static var SEQ_FIELD_ID : Int = 1;
  inline static var MID_FIELD_ID : Int = 2;
  inline static var WATERMARK_FIELD_ID : Int = 3;
  inline static var SESSIONID_FIELD_ID : Int = 4;

  private var __isset_seq : Bool = false;
  private var __isset_watermark : Bool = false;
  private var __isset_sessionId : Bool = false;

  public function new() {
  }

  public function get_seq() : haxe.Int32 {
    return this.seq;
  }

  public function set_seq(seq:haxe.Int32) : haxe.Int32 {
    this.seq = seq;
    this.__isset_seq = true;
    return this.seq;
  }

  public function unsetSeq() : Void {
    this.__isset_seq = false;
  }

  // Returns true if field seq is set (has been assigned a value) and false otherwise
  public function isSetSeq() : Bool {
    return this.__isset_seq;
  }

  public function get_mid() : String {
    return this.mid;
  }

  public function set_mid(mid:String) : String {
    this.mid = mid;
    return this.mid;
  }

  public function unsetMid() : Void {
    this.mid = null;
  }

  // Returns true if field mid is set (has been assigned a value) and false otherwise
  public function isSetMid() : Bool {
    return this.mid != null;
  }

  public function get_watermark() : haxe.Int64 {
    return this.watermark;
  }

  public function set_watermark(watermark:haxe.Int64) : haxe.Int64 {
    this.watermark = watermark;
    this.__isset_watermark = true;
    return this.watermark;
  }

  public function unsetWatermark() : Void {
    this.__isset_watermark = false;
  }

  // Returns true if field watermark is set (has been assigned a value) and false otherwise
  public function isSetWatermark() : Bool {
    return this.__isset_watermark;
  }

  public function get_sessionId() : haxe.Int32 {
    return this.sessionId;
  }

  public function set_sessionId(sessionId:haxe.Int32) : haxe.Int32 {
    this.sessionId = sessionId;
    this.__isset_sessionId = true;
    return this.sessionId;
  }

  public function unsetSessionId() : Void {
    this.__isset_sessionId = false;
  }

  // Returns true if field sessionId is set (has been assigned a value) and false otherwise
  public function isSetSessionId() : Bool {
    return this.__isset_sessionId;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SEQ_FIELD_ID:
      if (value == null) {
        unsetSeq();
      } else {
        this.seq = value;
      }

    case MID_FIELD_ID:
      if (value == null) {
        unsetMid();
      } else {
        this.mid = value;
      }

    case WATERMARK_FIELD_ID:
      if (value == null) {
        unsetWatermark();
      } else {
        this.watermark = value;
      }

    case SESSIONID_FIELD_ID:
      if (value == null) {
        unsetSessionId();
      } else {
        this.sessionId = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SEQ_FIELD_ID:
      return this.seq;
    case MID_FIELD_ID:
      return this.mid;
    case WATERMARK_FIELD_ID:
      return this.watermark;
    case SESSIONID_FIELD_ID:
      return this.sessionId;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SEQ_FIELD_ID:
      return isSetSeq();
    case MID_FIELD_ID:
      return isSetMid();
    case WATERMARK_FIELD_ID:
      return isSetWatermark();
    case SESSIONID_FIELD_ID:
      return isSetSessionId();
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
          case SEQ_FIELD_ID:
            if (field.type == TType.I32) {
              this.seq = iprot.readI32();
              this.__isset_seq = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case MID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.mid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case WATERMARK_FIELD_ID:
            if (field.type == TType.I64) {
              this.watermark = iprot.readI64();
              this.__isset_watermark = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SESSIONID_FIELD_ID:
            if (field.type == TType.BYTE) {
              this.sessionId = iprot.readByte();
              this.__isset_sessionId = true;
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
      oprot.writeFieldBegin(SEQ_FIELD_DESC);
      oprot.writeI32(this.seq);
      oprot.writeFieldEnd();
      if (this.mid != null) {
        oprot.writeFieldBegin(MID_FIELD_DESC);
        oprot.writeString(this.mid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(WATERMARK_FIELD_DESC);
      oprot.writeI64(this.watermark);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SESSION_ID_FIELD_DESC);
      oprot.writeByte(this.sessionId);
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
    var ret : String = "sendChatCheckedByWatermark_args(";
    var first : Bool = true;

    ret += "seq:";
    ret += this.seq;
    first = false;
    if (!first) ret +=  ", ";
    ret += "mid:";
    if (this.mid == null) {
      ret += "null";
    } else {
      ret += this.mid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "watermark:";
    ret += this.watermark;
    first = false;
    if (!first) ret +=  ", ";
    ret += "sessionId:";
    ret += this.sessionId;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

