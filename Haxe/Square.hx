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


class Square implements TBase {
  
  static var STRUCT_DESC = { new TStruct("Square"); };
  static var MID_FIELD_DESC = { new TField("mid", TType.STRING, 1); };
  static var NAME_FIELD_DESC = { new TField("name", TType.STRING, 2); };
  static var WELCOME_MESSAGE_FIELD_DESC = { new TField("welcomeMessage", TType.STRING, 3); };
  static var PROFILE_IMAGE_OBS_HASH_FIELD_DESC = { new TField("profileImageObsHash", TType.STRING, 4); };
  static var DESC_FIELD_DESC = { new TField("desc", TType.STRING, 5); };
  static var SEARCHABLE_FIELD_DESC = { new TField("searchable", TType.BOOL, 6); };
  static var TYPE_FIELD_DESC = { new TField("type", TType.I32, 7); };
  static var CATEGORY_ID_FIELD_DESC = { new TField("categoryID", TType.I32, 8); };
  static var INVITATION_URL_FIELD_DESC = { new TField("invitationURL", TType.STRING, 9); };
  static var REVISION_FIELD_DESC = { new TField("revision", TType.I64, 10); };
  static var ABLE_TO_USE_INVITATION_TICKET_FIELD_DESC = { new TField("ableToUseInvitationTicket", TType.BOOL, 11); };
  static var STATE_FIELD_DESC = { new TField("state", TType.I32, 12); };

  @:isVar
  public var mid(get,set) : String;
  @:isVar
  public var name(get,set) : String;
  @:isVar
  public var welcomeMessage(get,set) : String;
  @:isVar
  public var profileImageObsHash(get,set) : String;
  @:isVar
  public var desc(get,set) : String;
  @:isVar
  public var searchable(get,set) : Bool;
  @:isVar
  public var type(get,set) : Int;
  @:isVar
  public var categoryID(get,set) : haxe.Int32;
  @:isVar
  public var invitationURL(get,set) : String;
  @:isVar
  public var revision(get,set) : haxe.Int64;
  @:isVar
  public var ableToUseInvitationTicket(get,set) : Bool;
  @:isVar
  public var state(get,set) : Int;

  inline static var MID_FIELD_ID : Int = 1;
  inline static var NAME_FIELD_ID : Int = 2;
  inline static var WELCOMEMESSAGE_FIELD_ID : Int = 3;
  inline static var PROFILEIMAGEOBSHASH_FIELD_ID : Int = 4;
  inline static var DESC_FIELD_ID : Int = 5;
  inline static var SEARCHABLE_FIELD_ID : Int = 6;
  inline static var TYPE_FIELD_ID : Int = 7;
  inline static var CATEGORYID_FIELD_ID : Int = 8;
  inline static var INVITATIONURL_FIELD_ID : Int = 9;
  inline static var REVISION_FIELD_ID : Int = 10;
  inline static var ABLETOUSEINVITATIONTICKET_FIELD_ID : Int = 11;
  inline static var STATE_FIELD_ID : Int = 12;

  private var __isset_searchable : Bool = false;
  private var __isset_type : Bool = false;
  private var __isset_categoryID : Bool = false;
  private var __isset_revision : Bool = false;
  private var __isset_ableToUseInvitationTicket : Bool = false;
  private var __isset_state : Bool = false;

  public function new() {
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

  public function get_name() : String {
    return this.name;
  }

  public function set_name(name:String) : String {
    this.name = name;
    return this.name;
  }

  public function unsetName() : Void {
    this.name = null;
  }

  // Returns true if field name is set (has been assigned a value) and false otherwise
  public function isSetName() : Bool {
    return this.name != null;
  }

  public function get_welcomeMessage() : String {
    return this.welcomeMessage;
  }

  public function set_welcomeMessage(welcomeMessage:String) : String {
    this.welcomeMessage = welcomeMessage;
    return this.welcomeMessage;
  }

  public function unsetWelcomeMessage() : Void {
    this.welcomeMessage = null;
  }

  // Returns true if field welcomeMessage is set (has been assigned a value) and false otherwise
  public function isSetWelcomeMessage() : Bool {
    return this.welcomeMessage != null;
  }

  public function get_profileImageObsHash() : String {
    return this.profileImageObsHash;
  }

  public function set_profileImageObsHash(profileImageObsHash:String) : String {
    this.profileImageObsHash = profileImageObsHash;
    return this.profileImageObsHash;
  }

  public function unsetProfileImageObsHash() : Void {
    this.profileImageObsHash = null;
  }

  // Returns true if field profileImageObsHash is set (has been assigned a value) and false otherwise
  public function isSetProfileImageObsHash() : Bool {
    return this.profileImageObsHash != null;
  }

  public function get_desc() : String {
    return this.desc;
  }

  public function set_desc(desc:String) : String {
    this.desc = desc;
    return this.desc;
  }

  public function unsetDesc() : Void {
    this.desc = null;
  }

  // Returns true if field desc is set (has been assigned a value) and false otherwise
  public function isSetDesc() : Bool {
    return this.desc != null;
  }

  public function get_searchable() : Bool {
    return this.searchable;
  }

  public function set_searchable(searchable:Bool) : Bool {
    this.searchable = searchable;
    this.__isset_searchable = true;
    return this.searchable;
  }

  public function unsetSearchable() : Void {
    this.__isset_searchable = false;
  }

  // Returns true if field searchable is set (has been assigned a value) and false otherwise
  public function isSetSearchable() : Bool {
    return this.__isset_searchable;
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

  public function get_categoryID() : haxe.Int32 {
    return this.categoryID;
  }

  public function set_categoryID(categoryID:haxe.Int32) : haxe.Int32 {
    this.categoryID = categoryID;
    this.__isset_categoryID = true;
    return this.categoryID;
  }

  public function unsetCategoryID() : Void {
    this.__isset_categoryID = false;
  }

  // Returns true if field categoryID is set (has been assigned a value) and false otherwise
  public function isSetCategoryID() : Bool {
    return this.__isset_categoryID;
  }

  public function get_invitationURL() : String {
    return this.invitationURL;
  }

  public function set_invitationURL(invitationURL:String) : String {
    this.invitationURL = invitationURL;
    return this.invitationURL;
  }

  public function unsetInvitationURL() : Void {
    this.invitationURL = null;
  }

  // Returns true if field invitationURL is set (has been assigned a value) and false otherwise
  public function isSetInvitationURL() : Bool {
    return this.invitationURL != null;
  }

  public function get_revision() : haxe.Int64 {
    return this.revision;
  }

  public function set_revision(revision:haxe.Int64) : haxe.Int64 {
    this.revision = revision;
    this.__isset_revision = true;
    return this.revision;
  }

  public function unsetRevision() : Void {
    this.__isset_revision = false;
  }

  // Returns true if field revision is set (has been assigned a value) and false otherwise
  public function isSetRevision() : Bool {
    return this.__isset_revision;
  }

  public function get_ableToUseInvitationTicket() : Bool {
    return this.ableToUseInvitationTicket;
  }

  public function set_ableToUseInvitationTicket(ableToUseInvitationTicket:Bool) : Bool {
    this.ableToUseInvitationTicket = ableToUseInvitationTicket;
    this.__isset_ableToUseInvitationTicket = true;
    return this.ableToUseInvitationTicket;
  }

  public function unsetAbleToUseInvitationTicket() : Void {
    this.__isset_ableToUseInvitationTicket = false;
  }

  // Returns true if field ableToUseInvitationTicket is set (has been assigned a value) and false otherwise
  public function isSetAbleToUseInvitationTicket() : Bool {
    return this.__isset_ableToUseInvitationTicket;
  }

  public function get_state() : Int {
    return this.state;
  }

  public function set_state(state:Int) : Int {
    this.state = state;
    this.__isset_state = true;
    return this.state;
  }

  public function unsetState() : Void {
    this.__isset_state = false;
  }

  // Returns true if field state is set (has been assigned a value) and false otherwise
  public function isSetState() : Bool {
    return this.__isset_state;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case MID_FIELD_ID:
      if (value == null) {
        unsetMid();
      } else {
        this.mid = value;
      }

    case NAME_FIELD_ID:
      if (value == null) {
        unsetName();
      } else {
        this.name = value;
      }

    case WELCOMEMESSAGE_FIELD_ID:
      if (value == null) {
        unsetWelcomeMessage();
      } else {
        this.welcomeMessage = value;
      }

    case PROFILEIMAGEOBSHASH_FIELD_ID:
      if (value == null) {
        unsetProfileImageObsHash();
      } else {
        this.profileImageObsHash = value;
      }

    case DESC_FIELD_ID:
      if (value == null) {
        unsetDesc();
      } else {
        this.desc = value;
      }

    case SEARCHABLE_FIELD_ID:
      if (value == null) {
        unsetSearchable();
      } else {
        this.searchable = value;
      }

    case TYPE_FIELD_ID:
      if (value == null) {
        unsetType();
      } else {
        this.type = value;
      }

    case CATEGORYID_FIELD_ID:
      if (value == null) {
        unsetCategoryID();
      } else {
        this.categoryID = value;
      }

    case INVITATIONURL_FIELD_ID:
      if (value == null) {
        unsetInvitationURL();
      } else {
        this.invitationURL = value;
      }

    case REVISION_FIELD_ID:
      if (value == null) {
        unsetRevision();
      } else {
        this.revision = value;
      }

    case ABLETOUSEINVITATIONTICKET_FIELD_ID:
      if (value == null) {
        unsetAbleToUseInvitationTicket();
      } else {
        this.ableToUseInvitationTicket = value;
      }

    case STATE_FIELD_ID:
      if (value == null) {
        unsetState();
      } else {
        this.state = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case MID_FIELD_ID:
      return this.mid;
    case NAME_FIELD_ID:
      return this.name;
    case WELCOMEMESSAGE_FIELD_ID:
      return this.welcomeMessage;
    case PROFILEIMAGEOBSHASH_FIELD_ID:
      return this.profileImageObsHash;
    case DESC_FIELD_ID:
      return this.desc;
    case SEARCHABLE_FIELD_ID:
      return this.searchable;
    case TYPE_FIELD_ID:
      return this.type;
    case CATEGORYID_FIELD_ID:
      return this.categoryID;
    case INVITATIONURL_FIELD_ID:
      return this.invitationURL;
    case REVISION_FIELD_ID:
      return this.revision;
    case ABLETOUSEINVITATIONTICKET_FIELD_ID:
      return this.ableToUseInvitationTicket;
    case STATE_FIELD_ID:
      return this.state;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case MID_FIELD_ID:
      return isSetMid();
    case NAME_FIELD_ID:
      return isSetName();
    case WELCOMEMESSAGE_FIELD_ID:
      return isSetWelcomeMessage();
    case PROFILEIMAGEOBSHASH_FIELD_ID:
      return isSetProfileImageObsHash();
    case DESC_FIELD_ID:
      return isSetDesc();
    case SEARCHABLE_FIELD_ID:
      return isSetSearchable();
    case TYPE_FIELD_ID:
      return isSetType();
    case CATEGORYID_FIELD_ID:
      return isSetCategoryID();
    case INVITATIONURL_FIELD_ID:
      return isSetInvitationURL();
    case REVISION_FIELD_ID:
      return isSetRevision();
    case ABLETOUSEINVITATIONTICKET_FIELD_ID:
      return isSetAbleToUseInvitationTicket();
    case STATE_FIELD_ID:
      return isSetState();
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
          case MID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.mid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case NAME_FIELD_ID:
            if (field.type == TType.STRING) {
              this.name = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case WELCOMEMESSAGE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.welcomeMessage = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PROFILEIMAGEOBSHASH_FIELD_ID:
            if (field.type == TType.STRING) {
              this.profileImageObsHash = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case DESC_FIELD_ID:
            if (field.type == TType.STRING) {
              this.desc = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SEARCHABLE_FIELD_ID:
            if (field.type == TType.BOOL) {
              this.searchable = iprot.readBool();
              this.__isset_searchable = true;
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
          case CATEGORYID_FIELD_ID:
            if (field.type == TType.I32) {
              this.categoryID = iprot.readI32();
              this.__isset_categoryID = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case INVITATIONURL_FIELD_ID:
            if (field.type == TType.STRING) {
              this.invitationURL = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case REVISION_FIELD_ID:
            if (field.type == TType.I64) {
              this.revision = iprot.readI64();
              this.__isset_revision = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case ABLETOUSEINVITATIONTICKET_FIELD_ID:
            if (field.type == TType.BOOL) {
              this.ableToUseInvitationTicket = iprot.readBool();
              this.__isset_ableToUseInvitationTicket = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case STATE_FIELD_ID:
            if (field.type == TType.I32) {
              this.state = iprot.readI32();
              this.__isset_state = true;
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
      if (this.mid != null) {
        oprot.writeFieldBegin(MID_FIELD_DESC);
        oprot.writeString(this.mid);
        oprot.writeFieldEnd();
      }
      if (this.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(this.name);
        oprot.writeFieldEnd();
      }
      if (this.welcomeMessage != null) {
        oprot.writeFieldBegin(WELCOME_MESSAGE_FIELD_DESC);
        oprot.writeString(this.welcomeMessage);
        oprot.writeFieldEnd();
      }
      if (this.profileImageObsHash != null) {
        oprot.writeFieldBegin(PROFILE_IMAGE_OBS_HASH_FIELD_DESC);
        oprot.writeString(this.profileImageObsHash);
        oprot.writeFieldEnd();
      }
      if (this.desc != null) {
        oprot.writeFieldBegin(DESC_FIELD_DESC);
        oprot.writeString(this.desc);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SEARCHABLE_FIELD_DESC);
      oprot.writeBool(this.searchable);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeI32(this.type);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CATEGORY_ID_FIELD_DESC);
      oprot.writeI32(this.categoryID);
      oprot.writeFieldEnd();
      if (this.invitationURL != null) {
        oprot.writeFieldBegin(INVITATION_URL_FIELD_DESC);
        oprot.writeString(this.invitationURL);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REVISION_FIELD_DESC);
      oprot.writeI64(this.revision);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ABLE_TO_USE_INVITATION_TICKET_FIELD_DESC);
      oprot.writeBool(this.ableToUseInvitationTicket);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STATE_FIELD_DESC);
      oprot.writeI32(this.state);
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
    var ret : String = "Square(";
    var first : Bool = true;

    ret += "mid:";
    if (this.mid == null) {
      ret += "null";
    } else {
      ret += this.mid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "name:";
    if (this.name == null) {
      ret += "null";
    } else {
      ret += this.name;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "welcomeMessage:";
    if (this.welcomeMessage == null) {
      ret += "null";
    } else {
      ret += this.welcomeMessage;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "profileImageObsHash:";
    if (this.profileImageObsHash == null) {
      ret += "null";
    } else {
      ret += this.profileImageObsHash;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "desc:";
    if (this.desc == null) {
      ret += "null";
    } else {
      ret += this.desc;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "searchable:";
    ret += this.searchable;
    first = false;
    if (!first) ret +=  ", ";
    ret += "type:";
    var type_name : String = .SquareType.VALUES_TO_NAMES[this.type];
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
    ret += "categoryID:";
    ret += this.categoryID;
    first = false;
    if (!first) ret +=  ", ";
    ret += "invitationURL:";
    if (this.invitationURL == null) {
      ret += "null";
    } else {
      ret += this.invitationURL;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "revision:";
    ret += this.revision;
    first = false;
    if (!first) ret +=  ", ";
    ret += "ableToUseInvitationTicket:";
    ret += this.ableToUseInvitationTicket;
    first = false;
    if (!first) ret +=  ", ";
    ret += "state:";
    var state_name : String = .SquareState.VALUES_TO_NAMES[this.state];
    if (state_name != null) {
      ret += state_name;
      ret += " (";
    }
    ret += this.state;
    if (state_name != null) {
      ret += ")";
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetType() && !.SquareType.VALID_VALUES.contains(type)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'type' has been assigned the invalid value " + type);
    }
    if (isSetState() && !.SquareState.VALID_VALUES.contains(state)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'state' has been assigned the invalid value " + state);
    }
  }

}

