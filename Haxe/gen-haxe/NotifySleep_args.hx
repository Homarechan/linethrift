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


class NotifySleep_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("notifySleep_args"); };
  static var LAST_REV_FIELD_DESC = { new TField("lastRev", TType.I64, 2); };
  static var BADGE_FIELD_DESC = { new TField("badge", TType.I32, 3); };

  @:isVar
  public var lastRev(get,set) : haxe.Int64;
  @:isVar
  public var badge(get,set) : haxe.Int32;

  inline static var LASTREV_FIELD_ID : Int = 2;
  inline static var BADGE_FIELD_ID : Int = 3;

  private var __isset_lastRev : Bool = false;
  private var __isset_badge : Bool = false;

  public function new() {
  }

  public function get_lastRev() : haxe.Int64 {
    return this.lastRev;
  }

  public function set_lastRev(lastRev:haxe.Int64) : haxe.Int64 {
    this.lastRev = lastRev;
    this.__isset_lastRev = true;
    return this.lastRev;
  }

  public function unsetLastRev() : Void {
    this.__isset_lastRev = false;
  }

  // Returns true if field lastRev is set (has been assigned a value) and false otherwise
  public function isSetLastRev() : Bool {
    return this.__isset_lastRev;
  }

  public function get_badge() : haxe.Int32 {
    return this.badge;
  }

  public function set_badge(badge:haxe.Int32) : haxe.Int32 {
    this.badge = badge;
    this.__isset_badge = true;
    return this.badge;
  }

  public function unsetBadge() : Void {
    this.__isset_badge = false;
  }

  // Returns true if field badge is set (has been assigned a value) and false otherwise
  public function isSetBadge() : Bool {
    return this.__isset_badge;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case LASTREV_FIELD_ID:
      if (value == null) {
        unsetLastRev();
      } else {
        this.lastRev = value;
      }

    case BADGE_FIELD_ID:
      if (value == null) {
        unsetBadge();
      } else {
        this.badge = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case LASTREV_FIELD_ID:
      return this.lastRev;
    case BADGE_FIELD_ID:
      return this.badge;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case LASTREV_FIELD_ID:
      return isSetLastRev();
    case BADGE_FIELD_ID:
      return isSetBadge();
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
          case LASTREV_FIELD_ID:
            if (field.type == TType.I64) {
              this.lastRev = iprot.readI64();
              this.__isset_lastRev = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case BADGE_FIELD_ID:
            if (field.type == TType.I32) {
              this.badge = iprot.readI32();
              this.__isset_badge = true;
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
      oprot.writeFieldBegin(LAST_REV_FIELD_DESC);
      oprot.writeI64(this.lastRev);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BADGE_FIELD_DESC);
      oprot.writeI32(this.badge);
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
    var ret : String = "notifySleep_args(";
    var first : Bool = true;

    ret += "lastRev:";
    ret += this.lastRev;
    first = false;
    if (!first) ret +=  ", ";
    ret += "badge:";
    ret += this.badge;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

