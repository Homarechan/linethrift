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


class SquareEventNotificationMemberUpdate implements TBase {
  
  static var STRUCT_DESC = { new TStruct("SquareEventNotificationMemberUpdate"); };
  static var SQUARE_MID_FIELD_DESC = { new TField("squareMid", TType.STRING, 1); };
  static var SQUARE_NAME_FIELD_DESC = { new TField("squareName", TType.STRING, 2); };
  static var PROFILE_IMAGE_OBS_HASH_FIELD_DESC = { new TField("profileImageObsHash", TType.STRING, 3); };

  @:isVar
  public var squareMid(get,set) : String;
  @:isVar
  public var squareName(get,set) : String;
  @:isVar
  public var profileImageObsHash(get,set) : String;

  inline static var SQUAREMID_FIELD_ID : Int = 1;
  inline static var SQUARENAME_FIELD_ID : Int = 2;
  inline static var PROFILEIMAGEOBSHASH_FIELD_ID : Int = 3;


  public function new() {
  }

  public function get_squareMid() : String {
    return this.squareMid;
  }

  public function set_squareMid(squareMid:String) : String {
    this.squareMid = squareMid;
    return this.squareMid;
  }

  public function unsetSquareMid() : Void {
    this.squareMid = null;
  }

  // Returns true if field squareMid is set (has been assigned a value) and false otherwise
  public function isSetSquareMid() : Bool {
    return this.squareMid != null;
  }

  public function get_squareName() : String {
    return this.squareName;
  }

  public function set_squareName(squareName:String) : String {
    this.squareName = squareName;
    return this.squareName;
  }

  public function unsetSquareName() : Void {
    this.squareName = null;
  }

  // Returns true if field squareName is set (has been assigned a value) and false otherwise
  public function isSetSquareName() : Bool {
    return this.squareName != null;
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

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SQUAREMID_FIELD_ID:
      if (value == null) {
        unsetSquareMid();
      } else {
        this.squareMid = value;
      }

    case SQUARENAME_FIELD_ID:
      if (value == null) {
        unsetSquareName();
      } else {
        this.squareName = value;
      }

    case PROFILEIMAGEOBSHASH_FIELD_ID:
      if (value == null) {
        unsetProfileImageObsHash();
      } else {
        this.profileImageObsHash = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SQUAREMID_FIELD_ID:
      return this.squareMid;
    case SQUARENAME_FIELD_ID:
      return this.squareName;
    case PROFILEIMAGEOBSHASH_FIELD_ID:
      return this.profileImageObsHash;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SQUAREMID_FIELD_ID:
      return isSetSquareMid();
    case SQUARENAME_FIELD_ID:
      return isSetSquareName();
    case PROFILEIMAGEOBSHASH_FIELD_ID:
      return isSetProfileImageObsHash();
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
          case SQUAREMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.squareMid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SQUARENAME_FIELD_ID:
            if (field.type == TType.STRING) {
              this.squareName = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PROFILEIMAGEOBSHASH_FIELD_ID:
            if (field.type == TType.STRING) {
              this.profileImageObsHash = iprot.readString();
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
      if (this.squareMid != null) {
        oprot.writeFieldBegin(SQUARE_MID_FIELD_DESC);
        oprot.writeString(this.squareMid);
        oprot.writeFieldEnd();
      }
      if (this.squareName != null) {
        oprot.writeFieldBegin(SQUARE_NAME_FIELD_DESC);
        oprot.writeString(this.squareName);
        oprot.writeFieldEnd();
      }
      if (this.profileImageObsHash != null) {
        oprot.writeFieldBegin(PROFILE_IMAGE_OBS_HASH_FIELD_DESC);
        oprot.writeString(this.profileImageObsHash);
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
    var ret : String = "SquareEventNotificationMemberUpdate(";
    var first : Bool = true;

    ret += "squareMid:";
    if (this.squareMid == null) {
      ret += "null";
    } else {
      ret += this.squareMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "squareName:";
    if (this.squareName == null) {
      ret += "null";
    } else {
      ret += this.squareName;
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
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

