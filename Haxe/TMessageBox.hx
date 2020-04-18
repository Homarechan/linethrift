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


class TMessageBox implements TBase {
  
  static var STRUCT_DESC = { new TStruct("TMessageBox"); };
  static var ID_FIELD_DESC = { new TField("id", TType.STRING, 1); };
  static var CHANNEL_ID_FIELD_DESC = { new TField("channelId", TType.STRING, 2); };
  static var LAST_SEQ_FIELD_DESC = { new TField("lastSeq", TType.I64, 5); };
  static var UNREAD_COUNT_FIELD_DESC = { new TField("unreadCount", TType.I64, 6); };
  static var LAST_MODIFIED_TIME_FIELD_DESC = { new TField("lastModifiedTime", TType.I64, 7); };
  static var STATUS_FIELD_DESC = { new TField("status", TType.I32, 8); };
  static var MID_TYPE_FIELD_DESC = { new TField("midType", TType.I32, 9); };
  static var LAST_MESSAGES_FIELD_DESC = { new TField("lastMessages", TType.LIST, 10); };

  @:isVar
  public var id(get,set) : String;
  @:isVar
  public var channelId(get,set) : String;
  @:isVar
  public var lastSeq(get,set) : haxe.Int64;
  @:isVar
  public var unreadCount(get,set) : haxe.Int64;
  @:isVar
  public var lastModifiedTime(get,set) : haxe.Int64;
  @:isVar
  public var status(get,set) : haxe.Int32;
  @:isVar
  public var midType(get,set) : Int;
  @:isVar
  public var lastMessages(get,set) : List< Message>;

  inline static var ID_FIELD_ID : Int = 1;
  inline static var CHANNELID_FIELD_ID : Int = 2;
  inline static var LASTSEQ_FIELD_ID : Int = 5;
  inline static var UNREADCOUNT_FIELD_ID : Int = 6;
  inline static var LASTMODIFIEDTIME_FIELD_ID : Int = 7;
  inline static var STATUS_FIELD_ID : Int = 8;
  inline static var MIDTYPE_FIELD_ID : Int = 9;
  inline static var LASTMESSAGES_FIELD_ID : Int = 10;

  private var __isset_lastSeq : Bool = false;
  private var __isset_unreadCount : Bool = false;
  private var __isset_lastModifiedTime : Bool = false;
  private var __isset_status : Bool = false;
  private var __isset_midType : Bool = false;

  public function new() {
  }

  public function get_id() : String {
    return this.id;
  }

  public function set_id(id:String) : String {
    this.id = id;
    return this.id;
  }

  public function unsetId() : Void {
    this.id = null;
  }

  // Returns true if field id is set (has been assigned a value) and false otherwise
  public function isSetId() : Bool {
    return this.id != null;
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

  public function get_lastSeq() : haxe.Int64 {
    return this.lastSeq;
  }

  public function set_lastSeq(lastSeq:haxe.Int64) : haxe.Int64 {
    this.lastSeq = lastSeq;
    this.__isset_lastSeq = true;
    return this.lastSeq;
  }

  public function unsetLastSeq() : Void {
    this.__isset_lastSeq = false;
  }

  // Returns true if field lastSeq is set (has been assigned a value) and false otherwise
  public function isSetLastSeq() : Bool {
    return this.__isset_lastSeq;
  }

  public function get_unreadCount() : haxe.Int64 {
    return this.unreadCount;
  }

  public function set_unreadCount(unreadCount:haxe.Int64) : haxe.Int64 {
    this.unreadCount = unreadCount;
    this.__isset_unreadCount = true;
    return this.unreadCount;
  }

  public function unsetUnreadCount() : Void {
    this.__isset_unreadCount = false;
  }

  // Returns true if field unreadCount is set (has been assigned a value) and false otherwise
  public function isSetUnreadCount() : Bool {
    return this.__isset_unreadCount;
  }

  public function get_lastModifiedTime() : haxe.Int64 {
    return this.lastModifiedTime;
  }

  public function set_lastModifiedTime(lastModifiedTime:haxe.Int64) : haxe.Int64 {
    this.lastModifiedTime = lastModifiedTime;
    this.__isset_lastModifiedTime = true;
    return this.lastModifiedTime;
  }

  public function unsetLastModifiedTime() : Void {
    this.__isset_lastModifiedTime = false;
  }

  // Returns true if field lastModifiedTime is set (has been assigned a value) and false otherwise
  public function isSetLastModifiedTime() : Bool {
    return this.__isset_lastModifiedTime;
  }

  public function get_status() : haxe.Int32 {
    return this.status;
  }

  public function set_status(status:haxe.Int32) : haxe.Int32 {
    this.status = status;
    this.__isset_status = true;
    return this.status;
  }

  public function unsetStatus() : Void {
    this.__isset_status = false;
  }

  // Returns true if field status is set (has been assigned a value) and false otherwise
  public function isSetStatus() : Bool {
    return this.__isset_status;
  }

  public function get_midType() : Int {
    return this.midType;
  }

  public function set_midType(midType:Int) : Int {
    this.midType = midType;
    this.__isset_midType = true;
    return this.midType;
  }

  public function unsetMidType() : Void {
    this.__isset_midType = false;
  }

  // Returns true if field midType is set (has been assigned a value) and false otherwise
  public function isSetMidType() : Bool {
    return this.__isset_midType;
  }

  public function get_lastMessages() : List< Message> {
    return this.lastMessages;
  }

  public function set_lastMessages(lastMessages:List< Message>) : List< Message> {
    this.lastMessages = lastMessages;
    return this.lastMessages;
  }

  public function unsetLastMessages() : Void {
    this.lastMessages = null;
  }

  // Returns true if field lastMessages is set (has been assigned a value) and false otherwise
  public function isSetLastMessages() : Bool {
    return this.lastMessages != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case ID_FIELD_ID:
      if (value == null) {
        unsetId();
      } else {
        this.id = value;
      }

    case CHANNELID_FIELD_ID:
      if (value == null) {
        unsetChannelId();
      } else {
        this.channelId = value;
      }

    case LASTSEQ_FIELD_ID:
      if (value == null) {
        unsetLastSeq();
      } else {
        this.lastSeq = value;
      }

    case UNREADCOUNT_FIELD_ID:
      if (value == null) {
        unsetUnreadCount();
      } else {
        this.unreadCount = value;
      }

    case LASTMODIFIEDTIME_FIELD_ID:
      if (value == null) {
        unsetLastModifiedTime();
      } else {
        this.lastModifiedTime = value;
      }

    case STATUS_FIELD_ID:
      if (value == null) {
        unsetStatus();
      } else {
        this.status = value;
      }

    case MIDTYPE_FIELD_ID:
      if (value == null) {
        unsetMidType();
      } else {
        this.midType = value;
      }

    case LASTMESSAGES_FIELD_ID:
      if (value == null) {
        unsetLastMessages();
      } else {
        this.lastMessages = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case ID_FIELD_ID:
      return this.id;
    case CHANNELID_FIELD_ID:
      return this.channelId;
    case LASTSEQ_FIELD_ID:
      return this.lastSeq;
    case UNREADCOUNT_FIELD_ID:
      return this.unreadCount;
    case LASTMODIFIEDTIME_FIELD_ID:
      return this.lastModifiedTime;
    case STATUS_FIELD_ID:
      return this.status;
    case MIDTYPE_FIELD_ID:
      return this.midType;
    case LASTMESSAGES_FIELD_ID:
      return this.lastMessages;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case ID_FIELD_ID:
      return isSetId();
    case CHANNELID_FIELD_ID:
      return isSetChannelId();
    case LASTSEQ_FIELD_ID:
      return isSetLastSeq();
    case UNREADCOUNT_FIELD_ID:
      return isSetUnreadCount();
    case LASTMODIFIEDTIME_FIELD_ID:
      return isSetLastModifiedTime();
    case STATUS_FIELD_ID:
      return isSetStatus();
    case MIDTYPE_FIELD_ID:
      return isSetMidType();
    case LASTMESSAGES_FIELD_ID:
      return isSetLastMessages();
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
          case ID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.id = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CHANNELID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.channelId = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case LASTSEQ_FIELD_ID:
            if (field.type == TType.I64) {
              this.lastSeq = iprot.readI64();
              this.__isset_lastSeq = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case UNREADCOUNT_FIELD_ID:
            if (field.type == TType.I64) {
              this.unreadCount = iprot.readI64();
              this.__isset_unreadCount = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case LASTMODIFIEDTIME_FIELD_ID:
            if (field.type == TType.I64) {
              this.lastModifiedTime = iprot.readI64();
              this.__isset_lastModifiedTime = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case STATUS_FIELD_ID:
            if (field.type == TType.I32) {
              this.status = iprot.readI32();
              this.__isset_status = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case MIDTYPE_FIELD_ID:
            if (field.type == TType.I32) {
              this.midType = iprot.readI32();
              this.__isset_midType = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case LASTMESSAGES_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list277 = iprot.readListBegin();
                this.lastMessages = new List< Message>();
                for( _i278 in 0 ... _list277.size)
                {
                  var _elem279 : Message;
                  _elem279 = new Message();
                  _elem279.read(iprot);
                  this.lastMessages.add(_elem279);
                }
                iprot.readListEnd();
              }
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
      if (this.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(this.id);
        oprot.writeFieldEnd();
      }
      if (this.channelId != null) {
        oprot.writeFieldBegin(CHANNEL_ID_FIELD_DESC);
        oprot.writeString(this.channelId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LAST_SEQ_FIELD_DESC);
      oprot.writeI64(this.lastSeq);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UNREAD_COUNT_FIELD_DESC);
      oprot.writeI64(this.unreadCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LAST_MODIFIED_TIME_FIELD_DESC);
      oprot.writeI64(this.lastModifiedTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeI32(this.status);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MID_TYPE_FIELD_DESC);
      oprot.writeI32(this.midType);
      oprot.writeFieldEnd();
      if (this.lastMessages != null) {
        oprot.writeFieldBegin(LAST_MESSAGES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.lastMessages.length));
          for( elem280 in this.lastMessages)
          {
            elem280.write(oprot);
          }
          oprot.writeListEnd();
        }
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
    var ret : String = "TMessageBox(";
    var first : Bool = true;

    ret += "id:";
    if (this.id == null) {
      ret += "null";
    } else {
      ret += this.id;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "channelId:";
    if (this.channelId == null) {
      ret += "null";
    } else {
      ret += this.channelId;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "lastSeq:";
    ret += this.lastSeq;
    first = false;
    if (!first) ret +=  ", ";
    ret += "unreadCount:";
    ret += this.unreadCount;
    first = false;
    if (!first) ret +=  ", ";
    ret += "lastModifiedTime:";
    ret += this.lastModifiedTime;
    first = false;
    if (!first) ret +=  ", ";
    ret += "status:";
    ret += this.status;
    first = false;
    if (!first) ret +=  ", ";
    ret += "midType:";
    var midType_name : String = .MIDType.VALUES_TO_NAMES[this.midType];
    if (midType_name != null) {
      ret += midType_name;
      ret += " (";
    }
    ret += this.midType;
    if (midType_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "lastMessages:";
    if (this.lastMessages == null) {
      ret += "null";
    } else {
      ret += this.lastMessages;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetMidType() && !.MIDType.VALID_VALUES.contains(midType)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'midType' has been assigned the invalid value " + midType);
    }
  }

}

