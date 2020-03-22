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


class UpdateSettingsAttributes_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("updateSettingsAttributes_args"); };
  static var REQ_SEQ_FIELD_DESC = { new TField("reqSeq", TType.I32, 1); };
  static var ATTR_BITSET_FIELD_DESC = { new TField("attrBitset", TType.I32, 2); };
  static var SETTINGS_FIELD_DESC = { new TField("settings", TType.STRUCT, 3); };

  @:isVar
  public var reqSeq(get,set) : haxe.Int32;
  @:isVar
  public var attrBitset(get,set) : haxe.Int32;
  @:isVar
  public var settings(get,set) : Settings;

  inline static var REQSEQ_FIELD_ID : Int = 1;
  inline static var ATTRBITSET_FIELD_ID : Int = 2;
  inline static var SETTINGS_FIELD_ID : Int = 3;

  private var __isset_reqSeq : Bool = false;
  private var __isset_attrBitset : Bool = false;

  public function new() {
  }

  public function get_reqSeq() : haxe.Int32 {
    return this.reqSeq;
  }

  public function set_reqSeq(reqSeq:haxe.Int32) : haxe.Int32 {
    this.reqSeq = reqSeq;
    this.__isset_reqSeq = true;
    return this.reqSeq;
  }

  public function unsetReqSeq() : Void {
    this.__isset_reqSeq = false;
  }

  // Returns true if field reqSeq is set (has been assigned a value) and false otherwise
  public function isSetReqSeq() : Bool {
    return this.__isset_reqSeq;
  }

  public function get_attrBitset() : haxe.Int32 {
    return this.attrBitset;
  }

  public function set_attrBitset(attrBitset:haxe.Int32) : haxe.Int32 {
    this.attrBitset = attrBitset;
    this.__isset_attrBitset = true;
    return this.attrBitset;
  }

  public function unsetAttrBitset() : Void {
    this.__isset_attrBitset = false;
  }

  // Returns true if field attrBitset is set (has been assigned a value) and false otherwise
  public function isSetAttrBitset() : Bool {
    return this.__isset_attrBitset;
  }

  public function get_settings() : Settings {
    return this.settings;
  }

  public function set_settings(settings:Settings) : Settings {
    this.settings = settings;
    return this.settings;
  }

  public function unsetSettings() : Void {
    this.settings = null;
  }

  // Returns true if field settings is set (has been assigned a value) and false otherwise
  public function isSetSettings() : Bool {
    return this.settings != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      if (value == null) {
        unsetReqSeq();
      } else {
        this.reqSeq = value;
      }

    case ATTRBITSET_FIELD_ID:
      if (value == null) {
        unsetAttrBitset();
      } else {
        this.attrBitset = value;
      }

    case SETTINGS_FIELD_ID:
      if (value == null) {
        unsetSettings();
      } else {
        this.settings = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      return this.reqSeq;
    case ATTRBITSET_FIELD_ID:
      return this.attrBitset;
    case SETTINGS_FIELD_ID:
      return this.settings;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      return isSetReqSeq();
    case ATTRBITSET_FIELD_ID:
      return isSetAttrBitset();
    case SETTINGS_FIELD_ID:
      return isSetSettings();
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
          case REQSEQ_FIELD_ID:
            if (field.type == TType.I32) {
              this.reqSeq = iprot.readI32();
              this.__isset_reqSeq = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case ATTRBITSET_FIELD_ID:
            if (field.type == TType.I32) {
              this.attrBitset = iprot.readI32();
              this.__isset_attrBitset = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SETTINGS_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.settings = new Settings();
              this.settings.read(iprot);
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
      oprot.writeFieldBegin(REQ_SEQ_FIELD_DESC);
      oprot.writeI32(this.reqSeq);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ATTR_BITSET_FIELD_DESC);
      oprot.writeI32(this.attrBitset);
      oprot.writeFieldEnd();
      if (this.settings != null) {
        oprot.writeFieldBegin(SETTINGS_FIELD_DESC);
        this.settings.write(oprot);
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
    var ret : String = "updateSettingsAttributes_args(";
    var first : Bool = true;

    ret += "reqSeq:";
    ret += this.reqSeq;
    first = false;
    if (!first) ret +=  ", ";
    ret += "attrBitset:";
    ret += this.attrBitset;
    first = false;
    if (!first) ret +=  ", ";
    ret += "settings:";
    if (this.settings == null) {
      ret += "null";
    } else {
      ret += this.settings;
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

