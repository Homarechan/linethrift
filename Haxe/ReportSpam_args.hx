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


class ReportSpam_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("reportSpam_args"); };
  static var CHAT_MID_FIELD_DESC = { new TField("chatMid", TType.STRING, 2); };
  static var MEMBER_MIDS_FIELD_DESC = { new TField("memberMids", TType.LIST, 3); };
  static var SPAMMER_REASONS_FIELD_DESC = { new TField("spammerReasons", TType.LIST, 4); };
  static var SENDER_MIDS_FIELD_DESC = { new TField("senderMids", TType.LIST, 5); };
  static var SPAM_MESSAGE_IDS_FIELD_DESC = { new TField("spamMessageIds", TType.LIST, 6); };
  static var SPAM_MESSAGES_FIELD_DESC = { new TField("spamMessages", TType.LIST, 7); };

  @:isVar
  public var chatMid(get,set) : String;
  @:isVar
  public var memberMids(get,set) : List< String>;
  @:isVar
  public var spammerReasons(get,set) : List< Int>;
  @:isVar
  public var senderMids(get,set) : List< String>;
  @:isVar
  public var spamMessageIds(get,set) : List< String>;
  @:isVar
  public var spamMessages(get,set) : List< String>;

  inline static var CHATMID_FIELD_ID : Int = 2;
  inline static var MEMBERMIDS_FIELD_ID : Int = 3;
  inline static var SPAMMERREASONS_FIELD_ID : Int = 4;
  inline static var SENDERMIDS_FIELD_ID : Int = 5;
  inline static var SPAMMESSAGEIDS_FIELD_ID : Int = 6;
  inline static var SPAMMESSAGES_FIELD_ID : Int = 7;


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

  public function get_memberMids() : List< String> {
    return this.memberMids;
  }

  public function set_memberMids(memberMids:List< String>) : List< String> {
    this.memberMids = memberMids;
    return this.memberMids;
  }

  public function unsetMemberMids() : Void {
    this.memberMids = null;
  }

  // Returns true if field memberMids is set (has been assigned a value) and false otherwise
  public function isSetMemberMids() : Bool {
    return this.memberMids != null;
  }

  public function get_spammerReasons() : List< Int> {
    return this.spammerReasons;
  }

  public function set_spammerReasons(spammerReasons:List< Int>) : List< Int> {
    this.spammerReasons = spammerReasons;
    return this.spammerReasons;
  }

  public function unsetSpammerReasons() : Void {
    this.spammerReasons = null;
  }

  // Returns true if field spammerReasons is set (has been assigned a value) and false otherwise
  public function isSetSpammerReasons() : Bool {
    return this.spammerReasons != null;
  }

  public function get_senderMids() : List< String> {
    return this.senderMids;
  }

  public function set_senderMids(senderMids:List< String>) : List< String> {
    this.senderMids = senderMids;
    return this.senderMids;
  }

  public function unsetSenderMids() : Void {
    this.senderMids = null;
  }

  // Returns true if field senderMids is set (has been assigned a value) and false otherwise
  public function isSetSenderMids() : Bool {
    return this.senderMids != null;
  }

  public function get_spamMessageIds() : List< String> {
    return this.spamMessageIds;
  }

  public function set_spamMessageIds(spamMessageIds:List< String>) : List< String> {
    this.spamMessageIds = spamMessageIds;
    return this.spamMessageIds;
  }

  public function unsetSpamMessageIds() : Void {
    this.spamMessageIds = null;
  }

  // Returns true if field spamMessageIds is set (has been assigned a value) and false otherwise
  public function isSetSpamMessageIds() : Bool {
    return this.spamMessageIds != null;
  }

  public function get_spamMessages() : List< String> {
    return this.spamMessages;
  }

  public function set_spamMessages(spamMessages:List< String>) : List< String> {
    this.spamMessages = spamMessages;
    return this.spamMessages;
  }

  public function unsetSpamMessages() : Void {
    this.spamMessages = null;
  }

  // Returns true if field spamMessages is set (has been assigned a value) and false otherwise
  public function isSetSpamMessages() : Bool {
    return this.spamMessages != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case CHATMID_FIELD_ID:
      if (value == null) {
        unsetChatMid();
      } else {
        this.chatMid = value;
      }

    case MEMBERMIDS_FIELD_ID:
      if (value == null) {
        unsetMemberMids();
      } else {
        this.memberMids = value;
      }

    case SPAMMERREASONS_FIELD_ID:
      if (value == null) {
        unsetSpammerReasons();
      } else {
        this.spammerReasons = value;
      }

    case SENDERMIDS_FIELD_ID:
      if (value == null) {
        unsetSenderMids();
      } else {
        this.senderMids = value;
      }

    case SPAMMESSAGEIDS_FIELD_ID:
      if (value == null) {
        unsetSpamMessageIds();
      } else {
        this.spamMessageIds = value;
      }

    case SPAMMESSAGES_FIELD_ID:
      if (value == null) {
        unsetSpamMessages();
      } else {
        this.spamMessages = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case CHATMID_FIELD_ID:
      return this.chatMid;
    case MEMBERMIDS_FIELD_ID:
      return this.memberMids;
    case SPAMMERREASONS_FIELD_ID:
      return this.spammerReasons;
    case SENDERMIDS_FIELD_ID:
      return this.senderMids;
    case SPAMMESSAGEIDS_FIELD_ID:
      return this.spamMessageIds;
    case SPAMMESSAGES_FIELD_ID:
      return this.spamMessages;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case CHATMID_FIELD_ID:
      return isSetChatMid();
    case MEMBERMIDS_FIELD_ID:
      return isSetMemberMids();
    case SPAMMERREASONS_FIELD_ID:
      return isSetSpammerReasons();
    case SENDERMIDS_FIELD_ID:
      return isSetSenderMids();
    case SPAMMESSAGEIDS_FIELD_ID:
      return isSetSpamMessageIds();
    case SPAMMESSAGES_FIELD_ID:
      return isSetSpamMessages();
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
          case MEMBERMIDS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list1175 = iprot.readListBegin();
                this.memberMids = new List< String>();
                for( _i1176 in 0 ... _list1175.size)
                {
                  var _elem1177 : String;
                  _elem1177 = iprot.readString();
                  this.memberMids.add(_elem1177);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SPAMMERREASONS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list1178 = iprot.readListBegin();
                this.spammerReasons = new List< Int>();
                for( _i1179 in 0 ... _list1178.size)
                {
                  var _elem1180 : Int;
                  _elem1180 = iprot.readI32();
                  this.spammerReasons.add(_elem1180);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SENDERMIDS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list1181 = iprot.readListBegin();
                this.senderMids = new List< String>();
                for( _i1182 in 0 ... _list1181.size)
                {
                  var _elem1183 : String;
                  _elem1183 = iprot.readString();
                  this.senderMids.add(_elem1183);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SPAMMESSAGEIDS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list1184 = iprot.readListBegin();
                this.spamMessageIds = new List< String>();
                for( _i1185 in 0 ... _list1184.size)
                {
                  var _elem1186 : String;
                  _elem1186 = iprot.readString();
                  this.spamMessageIds.add(_elem1186);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SPAMMESSAGES_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list1187 = iprot.readListBegin();
                this.spamMessages = new List< String>();
                for( _i1188 in 0 ... _list1187.size)
                {
                  var _elem1189 : String;
                  _elem1189 = iprot.readString();
                  this.spamMessages.add(_elem1189);
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
      if (this.chatMid != null) {
        oprot.writeFieldBegin(CHAT_MID_FIELD_DESC);
        oprot.writeString(this.chatMid);
        oprot.writeFieldEnd();
      }
      if (this.memberMids != null) {
        oprot.writeFieldBegin(MEMBER_MIDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.memberMids.length));
          for( elem1190 in this.memberMids)
          {
            oprot.writeString(elem1190);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.spammerReasons != null) {
        oprot.writeFieldBegin(SPAMMER_REASONS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.I32, this.spammerReasons.length));
          for( elem1191 in this.spammerReasons)
          {
            oprot.writeI32(elem1191);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.senderMids != null) {
        oprot.writeFieldBegin(SENDER_MIDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.senderMids.length));
          for( elem1192 in this.senderMids)
          {
            oprot.writeString(elem1192);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.spamMessageIds != null) {
        oprot.writeFieldBegin(SPAM_MESSAGE_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.spamMessageIds.length));
          for( elem1193 in this.spamMessageIds)
          {
            oprot.writeString(elem1193);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.spamMessages != null) {
        oprot.writeFieldBegin(SPAM_MESSAGES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.spamMessages.length));
          for( elem1194 in this.spamMessages)
          {
            oprot.writeString(elem1194);
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
    var ret : String = "reportSpam_args(";
    var first : Bool = true;

    ret += "chatMid:";
    if (this.chatMid == null) {
      ret += "null";
    } else {
      ret += this.chatMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "memberMids:";
    if (this.memberMids == null) {
      ret += "null";
    } else {
      ret += this.memberMids;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "spammerReasons:";
    if (this.spammerReasons == null) {
      ret += "null";
    } else {
      ret += this.spammerReasons;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "senderMids:";
    if (this.senderMids == null) {
      ret += "null";
    } else {
      ret += this.senderMids;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "spamMessageIds:";
    if (this.spamMessageIds == null) {
      ret += "null";
    } else {
      ret += this.spamMessageIds;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "spamMessages:";
    if (this.spamMessages == null) {
      ret += "null";
    } else {
      ret += this.spamMessages;
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

