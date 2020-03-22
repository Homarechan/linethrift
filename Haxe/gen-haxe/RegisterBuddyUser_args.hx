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


class RegisterBuddyUser_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("registerBuddyUser_args"); };
  static var BUDDY_ID_FIELD_DESC = { new TField("buddyId", TType.STRING, 2); };
  static var REGISTRAR_PASSWORD_FIELD_DESC = { new TField("registrarPassword", TType.STRING, 3); };

  @:isVar
  public var buddyId(get,set) : String;
  @:isVar
  public var registrarPassword(get,set) : String;

  inline static var BUDDYID_FIELD_ID : Int = 2;
  inline static var REGISTRARPASSWORD_FIELD_ID : Int = 3;


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

  public function get_registrarPassword() : String {
    return this.registrarPassword;
  }

  public function set_registrarPassword(registrarPassword:String) : String {
    this.registrarPassword = registrarPassword;
    return this.registrarPassword;
  }

  public function unsetRegistrarPassword() : Void {
    this.registrarPassword = null;
  }

  // Returns true if field registrarPassword is set (has been assigned a value) and false otherwise
  public function isSetRegistrarPassword() : Bool {
    return this.registrarPassword != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case BUDDYID_FIELD_ID:
      if (value == null) {
        unsetBuddyId();
      } else {
        this.buddyId = value;
      }

    case REGISTRARPASSWORD_FIELD_ID:
      if (value == null) {
        unsetRegistrarPassword();
      } else {
        this.registrarPassword = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case BUDDYID_FIELD_ID:
      return this.buddyId;
    case REGISTRARPASSWORD_FIELD_ID:
      return this.registrarPassword;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case BUDDYID_FIELD_ID:
      return isSetBuddyId();
    case REGISTRARPASSWORD_FIELD_ID:
      return isSetRegistrarPassword();
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
          case REGISTRARPASSWORD_FIELD_ID:
            if (field.type == TType.STRING) {
              this.registrarPassword = iprot.readString();
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
      if (this.registrarPassword != null) {
        oprot.writeFieldBegin(REGISTRAR_PASSWORD_FIELD_DESC);
        oprot.writeString(this.registrarPassword);
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
    var ret : String = "registerBuddyUser_args(";
    var first : Bool = true;

    ret += "buddyId:";
    if (this.buddyId == null) {
      ret += "null";
    } else {
      ret += this.buddyId;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "registrarPassword:";
    if (this.registrarPassword == null) {
      ret += "null";
    } else {
      ret += this.registrarPassword;
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

