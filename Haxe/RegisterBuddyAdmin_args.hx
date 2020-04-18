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


class RegisterBuddyAdmin_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("registerBuddyAdmin_args"); };
  static var BUDDY_ID_FIELD_DESC = { new TField("buddyId", TType.STRING, 2); };
  static var SEARCH_ID_FIELD_DESC = { new TField("searchId", TType.STRING, 3); };
  static var DISPLAY_NAME_FIELD_DESC = { new TField("displayName", TType.STRING, 4); };
  static var STATUS_MESSAGE_FIELD_DESC = { new TField("statusMessage", TType.STRING, 5); };
  static var PICTURE_FIELD_DESC = { new TField("picture", TType.STRING, 6); };

  @:isVar
  public var buddyId(get,set) : String;
  @:isVar
  public var searchId(get,set) : String;
  @:isVar
  public var displayName(get,set) : String;
  @:isVar
  public var statusMessage(get,set) : String;
  @:isVar
  public var picture(get,set) : haxe.io.Bytes;

  inline static var BUDDYID_FIELD_ID : Int = 2;
  inline static var SEARCHID_FIELD_ID : Int = 3;
  inline static var DISPLAYNAME_FIELD_ID : Int = 4;
  inline static var STATUSMESSAGE_FIELD_ID : Int = 5;
  inline static var PICTURE_FIELD_ID : Int = 6;


  public function new() {
  }

  public function get_buddyId() : String {
    return this.buddyId;
  }

  public function set_buddyId(buddyId:String) : String {
    this.buddyId = buddyId;
    return this.buddyId;
  }

  public function unsetBuddyId() : Void {
    this.buddyId = null;
  }

  // Returns true if field buddyId is set (has been assigned a value) and false otherwise
  public function isSetBuddyId() : Bool {
    return this.buddyId != null;
  }

  public function get_searchId() : String {
    return this.searchId;
  }

  public function set_searchId(searchId:String) : String {
    this.searchId = searchId;
    return this.searchId;
  }

  public function unsetSearchId() : Void {
    this.searchId = null;
  }

  // Returns true if field searchId is set (has been assigned a value) and false otherwise
  public function isSetSearchId() : Bool {
    return this.searchId != null;
  }

  public function get_displayName() : String {
    return this.displayName;
  }

  public function set_displayName(displayName:String) : String {
    this.displayName = displayName;
    return this.displayName;
  }

  public function unsetDisplayName() : Void {
    this.displayName = null;
  }

  // Returns true if field displayName is set (has been assigned a value) and false otherwise
  public function isSetDisplayName() : Bool {
    return this.displayName != null;
  }

  public function get_statusMessage() : String {
    return this.statusMessage;
  }

  public function set_statusMessage(statusMessage:String) : String {
    this.statusMessage = statusMessage;
    return this.statusMessage;
  }

  public function unsetStatusMessage() : Void {
    this.statusMessage = null;
  }

  // Returns true if field statusMessage is set (has been assigned a value) and false otherwise
  public function isSetStatusMessage() : Bool {
    return this.statusMessage != null;
  }

  public function get_picture() : haxe.io.Bytes {
    return this.picture;
  }

  public function set_picture(picture:haxe.io.Bytes) : haxe.io.Bytes {
    this.picture = picture;
    return this.picture;
  }

  public function unsetPicture() : Void {
    this.picture = null;
  }

  // Returns true if field picture is set (has been assigned a value) and false otherwise
  public function isSetPicture() : Bool {
    return this.picture != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case BUDDYID_FIELD_ID:
      if (value == null) {
        unsetBuddyId();
      } else {
        this.buddyId = value;
      }

    case SEARCHID_FIELD_ID:
      if (value == null) {
        unsetSearchId();
      } else {
        this.searchId = value;
      }

    case DISPLAYNAME_FIELD_ID:
      if (value == null) {
        unsetDisplayName();
      } else {
        this.displayName = value;
      }

    case STATUSMESSAGE_FIELD_ID:
      if (value == null) {
        unsetStatusMessage();
      } else {
        this.statusMessage = value;
      }

    case PICTURE_FIELD_ID:
      if (value == null) {
        unsetPicture();
      } else {
        this.picture = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case BUDDYID_FIELD_ID:
      return this.buddyId;
    case SEARCHID_FIELD_ID:
      return this.searchId;
    case DISPLAYNAME_FIELD_ID:
      return this.displayName;
    case STATUSMESSAGE_FIELD_ID:
      return this.statusMessage;
    case PICTURE_FIELD_ID:
      return this.picture;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case BUDDYID_FIELD_ID:
      return isSetBuddyId();
    case SEARCHID_FIELD_ID:
      return isSetSearchId();
    case DISPLAYNAME_FIELD_ID:
      return isSetDisplayName();
    case STATUSMESSAGE_FIELD_ID:
      return isSetStatusMessage();
    case PICTURE_FIELD_ID:
      return isSetPicture();
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
          case BUDDYID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.buddyId = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SEARCHID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.searchId = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case DISPLAYNAME_FIELD_ID:
            if (field.type == TType.STRING) {
              this.displayName = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case STATUSMESSAGE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.statusMessage = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PICTURE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.picture = iprot.readBinary();
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
      if (this.buddyId != null) {
        oprot.writeFieldBegin(BUDDY_ID_FIELD_DESC);
        oprot.writeString(this.buddyId);
        oprot.writeFieldEnd();
      }
      if (this.searchId != null) {
        oprot.writeFieldBegin(SEARCH_ID_FIELD_DESC);
        oprot.writeString(this.searchId);
        oprot.writeFieldEnd();
      }
      if (this.displayName != null) {
        oprot.writeFieldBegin(DISPLAY_NAME_FIELD_DESC);
        oprot.writeString(this.displayName);
        oprot.writeFieldEnd();
      }
      if (this.statusMessage != null) {
        oprot.writeFieldBegin(STATUS_MESSAGE_FIELD_DESC);
        oprot.writeString(this.statusMessage);
        oprot.writeFieldEnd();
      }
      if (this.picture != null) {
        oprot.writeFieldBegin(PICTURE_FIELD_DESC);
        oprot.writeBinary(this.picture);
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
    var ret : String = "registerBuddyAdmin_args(";
    var first : Bool = true;

    ret += "buddyId:";
    if (this.buddyId == null) {
      ret += "null";
    } else {
      ret += this.buddyId;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "searchId:";
    if (this.searchId == null) {
      ret += "null";
    } else {
      ret += this.searchId;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "displayName:";
    if (this.displayName == null) {
      ret += "null";
    } else {
      ret += this.displayName;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "statusMessage:";
    if (this.statusMessage == null) {
      ret += "null";
    } else {
      ret += this.statusMessage;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "picture:";
    if (this.picture == null) {
      ret += "null";
    } else {
        ret += "BINARY";
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

