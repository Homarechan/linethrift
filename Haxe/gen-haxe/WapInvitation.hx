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


class WapInvitation implements TBase {
  
  static var STRUCT_DESC = { new TStruct("WapInvitation"); };
  static var TYPE_FIELD_DESC = { new TField("type", TType.I32, 1); };
  static var INVITEE_EMAIL_FIELD_DESC = { new TField("inviteeEmail", TType.STRING, 10); };
  static var INVITER_MID_FIELD_DESC = { new TField("inviterMid", TType.STRING, 11); };
  static var ROOM_MID_FIELD_DESC = { new TField("roomMid", TType.STRING, 12); };

  @:isVar
  public var type(get,set) : Int;
  @:isVar
  public var inviteeEmail(get,set) : String;
  @:isVar
  public var inviterMid(get,set) : String;
  @:isVar
  public var roomMid(get,set) : String;

  inline static var TYPE_FIELD_ID : Int = 1;
  inline static var INVITEEEMAIL_FIELD_ID : Int = 10;
  inline static var INVITERMID_FIELD_ID : Int = 11;
  inline static var ROOMMID_FIELD_ID : Int = 12;

  private var __isset_type : Bool = false;

  public function new() {
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

  public function get_inviteeEmail() : String {
    return this.inviteeEmail;
  }

  public function set_inviteeEmail(inviteeEmail:String) : String {
    this.inviteeEmail = inviteeEmail;
    return this.inviteeEmail;
  }

  public function unsetInviteeEmail() : Void {
    this.inviteeEmail = null;
  }

  // Returns true if field inviteeEmail is set (has been assigned a value) and false otherwise
  public function isSetInviteeEmail() : Bool {
    return this.inviteeEmail != null;
  }

  public function get_inviterMid() : String {
    return this.inviterMid;
  }

  public function set_inviterMid(inviterMid:String) : String {
    this.inviterMid = inviterMid;
    return this.inviterMid;
  }

  public function unsetInviterMid() : Void {
    this.inviterMid = null;
  }

  // Returns true if field inviterMid is set (has been assigned a value) and false otherwise
  public function isSetInviterMid() : Bool {
    return this.inviterMid != null;
  }

  public function get_roomMid() : String {
    return this.roomMid;
  }

  public function set_roomMid(roomMid:String) : String {
    this.roomMid = roomMid;
    return this.roomMid;
  }

  public function unsetRoomMid() : Void {
    this.roomMid = null;
  }

  // Returns true if field roomMid is set (has been assigned a value) and false otherwise
  public function isSetRoomMid() : Bool {
    return this.roomMid != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case TYPE_FIELD_ID:
      if (value == null) {
        unsetType();
      } else {
        this.type = value;
      }

    case INVITEEEMAIL_FIELD_ID:
      if (value == null) {
        unsetInviteeEmail();
      } else {
        this.inviteeEmail = value;
      }

    case INVITERMID_FIELD_ID:
      if (value == null) {
        unsetInviterMid();
      } else {
        this.inviterMid = value;
      }

    case ROOMMID_FIELD_ID:
      if (value == null) {
        unsetRoomMid();
      } else {
        this.roomMid = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case TYPE_FIELD_ID:
      return this.type;
    case INVITEEEMAIL_FIELD_ID:
      return this.inviteeEmail;
    case INVITERMID_FIELD_ID:
      return this.inviterMid;
    case ROOMMID_FIELD_ID:
      return this.roomMid;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case TYPE_FIELD_ID:
      return isSetType();
    case INVITEEEMAIL_FIELD_ID:
      return isSetInviteeEmail();
    case INVITERMID_FIELD_ID:
      return isSetInviterMid();
    case ROOMMID_FIELD_ID:
      return isSetRoomMid();
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
          case TYPE_FIELD_ID:
            if (field.type == TType.I32) {
              this.type = iprot.readI32();
              this.__isset_type = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case INVITEEEMAIL_FIELD_ID:
            if (field.type == TType.STRING) {
              this.inviteeEmail = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case INVITERMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.inviterMid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case ROOMMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.roomMid = iprot.readString();
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
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeI32(this.type);
      oprot.writeFieldEnd();
      if (this.inviteeEmail != null) {
        oprot.writeFieldBegin(INVITEE_EMAIL_FIELD_DESC);
        oprot.writeString(this.inviteeEmail);
        oprot.writeFieldEnd();
      }
      if (this.inviterMid != null) {
        oprot.writeFieldBegin(INVITER_MID_FIELD_DESC);
        oprot.writeString(this.inviterMid);
        oprot.writeFieldEnd();
      }
      if (this.roomMid != null) {
        oprot.writeFieldBegin(ROOM_MID_FIELD_DESC);
        oprot.writeString(this.roomMid);
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
    var ret : String = "WapInvitation(";
    var first : Bool = true;

    ret += "type:";
    var type_name : String = .WapInvitationType.VALUES_TO_NAMES[this.type];
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
    ret += "inviteeEmail:";
    if (this.inviteeEmail == null) {
      ret += "null";
    } else {
      ret += this.inviteeEmail;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "inviterMid:";
    if (this.inviterMid == null) {
      ret += "null";
    } else {
      ret += this.inviterMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "roomMid:";
    if (this.roomMid == null) {
      ret += "null";
    } else {
      ret += this.roomMid;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetType() && !.WapInvitationType.VALID_VALUES.contains(type)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'type' has been assigned the invalid value " + type);
    }
  }

}

