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


class ChatRoomAnnouncement implements TBase {
  
  static var STRUCT_DESC = { new TStruct("ChatRoomAnnouncement"); };
  static var ANNOUNCEMENT_SEQ_FIELD_DESC = { new TField("announcementSeq", TType.I64, 1); };
  static var TYPE_FIELD_DESC = { new TField("type", TType.I32, 2); };
  static var CONTENTS_FIELD_DESC = { new TField("contents", TType.STRUCT, 3); };
  static var CREATOR_MID_FIELD_DESC = { new TField("creatorMid", TType.STRING, 4); };
  static var CREATED_TIME_FIELD_DESC = { new TField("createdTime", TType.I64, 5); };

  @:isVar
  public var announcementSeq(get,set) : haxe.Int64;
  @:isVar
  public var type(get,set) : Int;
  @:isVar
  public var contents(get,set) : ChatRoomAnnouncementContents;
  @:isVar
  public var creatorMid(get,set) : String;
  @:isVar
  public var createdTime(get,set) : haxe.Int64;

  inline static var ANNOUNCEMENTSEQ_FIELD_ID : Int = 1;
  inline static var TYPE_FIELD_ID : Int = 2;
  inline static var CONTENTS_FIELD_ID : Int = 3;
  inline static var CREATORMID_FIELD_ID : Int = 4;
  inline static var CREATEDTIME_FIELD_ID : Int = 5;

  private var __isset_announcementSeq : Bool = false;
  private var __isset_type : Bool = false;
  private var __isset_createdTime : Bool = false;

  public function new() {
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

  public function get_type() : Int {
    return this.type;
  }

  public function set_type(type:Int) : Int {
    this.type = type;
    this.__isset_type = true;
    return this.type;
  }

  public function unsetType() : Void {
    this.__isset_type = false;
  }

  // Returns true if field type is set (has been assigned a value) and false otherwise
  public function isSetType() : Bool {
    return this.__isset_type;
  }

  public function get_contents() : ChatRoomAnnouncementContents {
    return this.contents;
  }

  public function set_contents(contents:ChatRoomAnnouncementContents) : ChatRoomAnnouncementContents {
    this.contents = contents;
    return this.contents;
  }

  public function unsetContents() : Void {
    this.contents = null;
  }

  // Returns true if field contents is set (has been assigned a value) and false otherwise
  public function isSetContents() : Bool {
    return this.contents != null;
  }

  public function get_creatorMid() : String {
    return this.creatorMid;
  }

  public function set_creatorMid(creatorMid:String) : String {
    this.creatorMid = creatorMid;
    return this.creatorMid;
  }

  public function unsetCreatorMid() : Void {
    this.creatorMid = null;
  }

  // Returns true if field creatorMid is set (has been assigned a value) and false otherwise
  public function isSetCreatorMid() : Bool {
    return this.creatorMid != null;
  }

  public function get_createdTime() : haxe.Int64 {
    return this.createdTime;
  }

  public function set_createdTime(createdTime:haxe.Int64) : haxe.Int64 {
    this.createdTime = createdTime;
    this.__isset_createdTime = true;
    return this.createdTime;
  }

  public function unsetCreatedTime() : Void {
    this.__isset_createdTime = false;
  }

  // Returns true if field createdTime is set (has been assigned a value) and false otherwise
  public function isSetCreatedTime() : Bool {
    return this.__isset_createdTime;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case ANNOUNCEMENTSEQ_FIELD_ID:
      if (value == null) {
        unsetAnnouncementSeq();
      } else {
        this.announcementSeq = value;
      }

    case TYPE_FIELD_ID:
      if (value == null) {
        unsetType();
      } else {
        this.type = value;
      }

    case CONTENTS_FIELD_ID:
      if (value == null) {
        unsetContents();
      } else {
        this.contents = value;
      }

    case CREATORMID_FIELD_ID:
      if (value == null) {
        unsetCreatorMid();
      } else {
        this.creatorMid = value;
      }

    case CREATEDTIME_FIELD_ID:
      if (value == null) {
        unsetCreatedTime();
      } else {
        this.createdTime = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case ANNOUNCEMENTSEQ_FIELD_ID:
      return this.announcementSeq;
    case TYPE_FIELD_ID:
      return this.type;
    case CONTENTS_FIELD_ID:
      return this.contents;
    case CREATORMID_FIELD_ID:
      return this.creatorMid;
    case CREATEDTIME_FIELD_ID:
      return this.createdTime;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case ANNOUNCEMENTSEQ_FIELD_ID:
      return isSetAnnouncementSeq();
    case TYPE_FIELD_ID:
      return isSetType();
    case CONTENTS_FIELD_ID:
      return isSetContents();
    case CREATORMID_FIELD_ID:
      return isSetCreatorMid();
    case CREATEDTIME_FIELD_ID:
      return isSetCreatedTime();
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
          case ANNOUNCEMENTSEQ_FIELD_ID:
            if (field.type == TType.I64) {
              this.announcementSeq = iprot.readI64();
              this.__isset_announcementSeq = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case TYPE_FIELD_ID:
            if (field.type == TType.I32) {
              this.type = iprot.readI32();
              this.__isset_type = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CONTENTS_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.contents = new ChatRoomAnnouncementContents();
              this.contents.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CREATORMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.creatorMid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CREATEDTIME_FIELD_ID:
            if (field.type == TType.I64) {
              this.createdTime = iprot.readI64();
              this.__isset_createdTime = true;
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
      oprot.writeFieldBegin(ANNOUNCEMENT_SEQ_FIELD_DESC);
      oprot.writeI64(this.announcementSeq);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeI32(this.type);
      oprot.writeFieldEnd();
      if (this.contents != null) {
        oprot.writeFieldBegin(CONTENTS_FIELD_DESC);
        this.contents.write(oprot);
        oprot.writeFieldEnd();
      }
      if (this.creatorMid != null) {
        oprot.writeFieldBegin(CREATOR_MID_FIELD_DESC);
        oprot.writeString(this.creatorMid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
      oprot.writeI64(this.createdTime);
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
    var ret : String = "ChatRoomAnnouncement(";
    var first : Bool = true;

    ret += "announcementSeq:";
    ret += this.announcementSeq;
    first = false;
    if (!first) ret +=  ", ";
    ret += "type:";
    var type_name : String = .ChatRoomAnnouncementType.VALUES_TO_NAMES[this.type];
    if (type_name != null) {
      ret += type_name;
      ret += " (";
    }
    ret += this.type;
    if (type_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "contents:";
    if (this.contents == null) {
      ret += "null";
    } else {
      ret += this.contents;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "creatorMid:";
    if (this.creatorMid == null) {
      ret += "null";
    } else {
      ret += this.creatorMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "createdTime:";
    ret += this.createdTime;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetType() && !.ChatRoomAnnouncementType.VALID_VALUES.contains(type)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'type' has been assigned the invalid value " + type);
    }
  }

}

