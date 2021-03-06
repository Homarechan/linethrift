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


class AddBuddyToContact_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("addBuddyToContact_args"); };
  static var BUDDY_MID_FIELD_DESC = { new TField("buddyMid", TType.STRING, 1); };

  @:isVar
  public var buddyMid(get,set) : String;

  inline static var BUDDYMID_FIELD_ID : Int = 1;


  public function new() {
  }

  public function get_buddyMid() : String {
    return this.buddyMid;
  }

  public function set_buddyMid(buddyMid:String) : String {
    this.buddyMid = buddyMid;
    return this.buddyMid;
  }

  public function unsetBuddyMid() : Void {
    this.buddyMid = null;
  }

  // Returns true if field buddyMid is set (has been assigned a value) and false otherwise
  public function isSetBuddyMid() : Bool {
    return this.buddyMid != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case BUDDYMID_FIELD_ID:
      if (value == null) {
        unsetBuddyMid();
      } else {
        this.buddyMid = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case BUDDYMID_FIELD_ID:
      return this.buddyMid;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case BUDDYMID_FIELD_ID:
      return isSetBuddyMid();
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
          case BUDDYMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.buddyMid = iprot.readString();
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
      if (this.buddyMid != null) {
        oprot.writeFieldBegin(BUDDY_MID_FIELD_DESC);
        oprot.writeString(this.buddyMid);
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
    var ret : String = "addBuddyToContact_args(";
    var first : Bool = true;

    ret += "buddyMid:";
    if (this.buddyMid == null) {
      ret += "null";
    } else {
      ret += this.buddyMid;
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

