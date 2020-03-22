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


class LastReadMessageIds implements TBase {
  
  static var STRUCT_DESC = { new TStruct("LastReadMessageIds"); };
  static var CHAT_ID_FIELD_DESC = { new TField("chatId", TType.STRING, 1); };
  static var LAST_READ_MESSAGE_IDS_FIELD_DESC = { new TField("lastReadMessageIds", TType.LIST, 2); };

  @:isVar
  public var chatId(get,set) : String;
  @:isVar
  public var lastReadMessageIds(get,set) : List< LastReadMessageId>;

  inline static var CHATID_FIELD_ID : Int = 1;
  inline static var LASTREADMESSAGEIDS_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_chatId() : String {
    return this.chatId;
  }

  public function set_chatId(chatId:String) : String {
    this.chatId = chatId;
    return this.chatId;
  }

  public function unsetChatId() : Void {
    this.chatId = null;
  }

  // Returns true if field chatId is set (has been assigned a value) and false otherwise
  public function isSetChatId() : Bool {
    return this.chatId != null;
  }

  public function get_lastReadMessageIds() : List< LastReadMessageId> {
    return this.lastReadMessageIds;
  }

  public function set_lastReadMessageIds(lastReadMessageIds:List< LastReadMessageId>) : List< LastReadMessageId> {
    this.lastReadMessageIds = lastReadMessageIds;
    return this.lastReadMessageIds;
  }

  public function unsetLastReadMessageIds() : Void {
    this.lastReadMessageIds = null;
  }

  // Returns true if field lastReadMessageIds is set (has been assigned a value) and false otherwise
  public function isSetLastReadMessageIds() : Bool {
    return this.lastReadMessageIds != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case CHATID_FIELD_ID:
      if (value == null) {
        unsetChatId();
      } else {
        this.chatId = value;
      }

    case LASTREADMESSAGEIDS_FIELD_ID:
      if (value == null) {
        unsetLastReadMessageIds();
      } else {
        this.lastReadMessageIds = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case CHATID_FIELD_ID:
      return this.chatId;
    case LASTREADMESSAGEIDS_FIELD_ID:
      return this.lastReadMessageIds;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case CHATID_FIELD_ID:
      return isSetChatId();
    case LASTREADMESSAGEIDS_FIELD_ID:
      return isSetLastReadMessageIds();
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
          case CHATID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.chatId = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case LASTREADMESSAGEIDS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list159 = iprot.readListBegin();
                this.lastReadMessageIds = new List< LastReadMessageId>();
                for( _i160 in 0 ... _list159.size)
                {
                  var _elem161 : LastReadMessageId;
                  _elem161 = new LastReadMessageId();
                  _elem161.read(iprot);
                  this.lastReadMessageIds.add(_elem161);
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
      if (this.chatId != null) {
        oprot.writeFieldBegin(CHAT_ID_FIELD_DESC);
        oprot.writeString(this.chatId);
        oprot.writeFieldEnd();
      }
      if (this.lastReadMessageIds != null) {
        oprot.writeFieldBegin(LAST_READ_MESSAGE_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.lastReadMessageIds.length));
          for( elem162 in this.lastReadMessageIds)
          {
            elem162.write(oprot);
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
    var ret : String = "LastReadMessageIds(";
    var first : Bool = true;

    ret += "chatId:";
    if (this.chatId == null) {
      ret += "null";
    } else {
      ret += this.chatId;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "lastReadMessageIds:";
    if (this.lastReadMessageIds == null) {
      ret += "null";
    } else {
      ret += this.lastReadMessageIds;
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

