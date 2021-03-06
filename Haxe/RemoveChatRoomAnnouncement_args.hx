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


class RemoveChatRoomAnnouncement_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("removeChatRoomAnnouncement_args"); };
  static var REQ_SEQ_FIELD_DESC = { new TField("reqSeq", TType.I32, 1); };
  static var CHAT_ROOM_MID_FIELD_DESC = { new TField("chatRoomMid", TType.STRING, 2); };
  static var ANNOUNCEMENT_SEQ_FIELD_DESC = { new TField("announcementSeq", TType.I64, 3); };

  @:isVar
  public var reqSeq(get,set) : haxe.Int32;
  @:isVar
  public var chatRoomMid(get,set) : String;
  @:isVar
  public var announcementSeq(get,set) : haxe.Int64;

  inline static var REQSEQ_FIELD_ID : Int = 1;
  inline static var CHATROOMMID_FIELD_ID : Int = 2;
  inline static var ANNOUNCEMENTSEQ_FIELD_ID : Int = 3;

  private var __isset_reqSeq : Bool = false;
  private var __isset_announcementSeq : Bool = false;

  public function new() {
  }

  public function get_reqSeq() : haxe.Int32 {
    return this.reqSeq;
  }

  public function set_reqSeq(reqSeq:haxe.Int32) : haxe.Int32 {
    this.reqSeq = reqSeq;
    this.__isset_reqSeq = true;
    return this.reqSeq;
  }

  public function unsetReqSeq() : Void {
    this.__isset_reqSeq = false;
  }

  // Returns true if field reqSeq is set (has been assigned a value) and false otherwise
  public function isSetReqSeq() : Bool {
    return this.__isset_reqSeq;
  }

  public function get_chatRoomMid() : String {
    return this.chatRoomMid;
  }

  public function set_chatRoomMid(chatRoomMid:String) : String {
    this.chatRoomMid = chatRoomMid;
    return this.chatRoomMid;
  }

  public function unsetChatRoomMid() : Void {
    this.chatRoomMid = null;
  }

  // Returns true if field chatRoomMid is set (has been assigned a value) and false otherwise
  public function isSetChatRoomMid() : Bool {
    return this.chatRoomMid != null;
  }

  public function get_announcementSeq() : haxe.Int64 {
    return this.announcementSeq;
  }

  public function set_announcementSeq(announcementSeq:haxe.Int64) : haxe.Int64 {
    this.announcementSeq = announcementSeq;
    this.__isset_announcementSeq = true;
    return this.announcementSeq;
  }

  public function unsetAnnouncementSeq() : Void {
    this.__isset_announcementSeq = false;
  }

  // Returns true if field announcementSeq is set (has been assigned a value) and false otherwise
  public function isSetAnnouncementSeq() : Bool {
    return this.__isset_announcementSeq;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      if (value == null) {
        unsetReqSeq();
      } else {
        this.reqSeq = value;
      }

    case CHATROOMMID_FIELD_ID:
      if (value == null) {
        unsetChatRoomMid();
      } else {
        this.chatRoomMid = value;
      }

    case ANNOUNCEMENTSEQ_FIELD_ID:
      if (value == null) {
        unsetAnnouncementSeq();
      } else {
        this.announcementSeq = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      return this.reqSeq;
    case CHATROOMMID_FIELD_ID:
      return this.chatRoomMid;
    case ANNOUNCEMENTSEQ_FIELD_ID:
      return this.announcementSeq;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      return isSetReqSeq();
    case CHATROOMMID_FIELD_ID:
      return isSetChatRoomMid();
    case ANNOUNCEMENTSEQ_FIELD_ID:
      return isSetAnnouncementSeq();
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
          case REQSEQ_FIELD_ID:
            if (field.type == TType.I32) {
              this.reqSeq = iprot.readI32();
              this.__isset_reqSeq = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CHATROOMMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.chatRoomMid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case ANNOUNCEMENTSEQ_FIELD_ID:
            if (field.type == TType.I64) {
              this.announcementSeq = iprot.readI64();
              this.__isset_announcementSeq = true;
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
      oprot.writeFieldBegin(REQ_SEQ_FIELD_DESC);
      oprot.writeI32(this.reqSeq);
      oprot.writeFieldEnd();
      if (this.chatRoomMid != null) {
        oprot.writeFieldBegin(CHAT_ROOM_MID_FIELD_DESC);
        oprot.writeString(this.chatRoomMid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ANNOUNCEMENT_SEQ_FIELD_DESC);
      oprot.writeI64(this.announcementSeq);
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
    var ret : String = "removeChatRoomAnnouncement_args(";
    var first : Bool = true;

    ret += "reqSeq:";
    ret += this.reqSeq;
    first = false;
    if (!first) ret +=  ", ";
    ret += "chatRoomMid:";
    if (this.chatRoomMid == null) {
      ret += "null";
    } else {
      ret += this.chatRoomMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "announcementSeq:";
    ret += this.announcementSeq;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

