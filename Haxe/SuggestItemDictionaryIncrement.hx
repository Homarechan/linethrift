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


class SuggestItemDictionaryIncrement implements TBase {
  
  static var STRUCT_DESC = { new TStruct("SuggestItemDictionaryIncrement"); };
  static var STATUS_FIELD_DESC = { new TField("status", TType.I32, 1); };
  static var REVISION_FIELD_DESC = { new TField("revision", TType.I64, 2); };
  static var SCHEME_FIELD_DESC = { new TField("scheme", TType.STRING, 3); };
  static var DATA_FIELD_DESC = { new TField("data", TType.STRING, 4); };

  @:isVar
  public var status(get,set) : Int;
  @:isVar
  public var revision(get,set) : haxe.Int64;
  @:isVar
  public var scheme(get,set) : String;
  @:isVar
  public var data(get,set) : haxe.io.Bytes;

  inline static var STATUS_FIELD_ID : Int = 1;
  inline static var REVISION_FIELD_ID : Int = 2;
  inline static var SCHEME_FIELD_ID : Int = 3;
  inline static var DATA_FIELD_ID : Int = 4;

  private var __isset_status : Bool = false;
  private var __isset_revision : Bool = false;

  public function new() {
  }

  public function get_status() : Int {
    return this.status;
  }

  public function set_status(status:Int) : Int {
    this.status = status;
    this.__isset_status = true;
    return this.status;
  }

  public function unsetStatus() : Void {
    this.__isset_status = false;
  }

  // Returns true if field status is set (has been assigned a value) and false otherwise
  public function isSetStatus() : Bool {
    return this.__isset_status;
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

  public function get_scheme() : String {
    return this.scheme;
  }

  public function set_scheme(scheme:String) : String {
    this.scheme = scheme;
    return this.scheme;
  }

  public function unsetScheme() : Void {
    this.scheme = null;
  }

  // Returns true if field scheme is set (has been assigned a value) and false otherwise
  public function isSetScheme() : Bool {
    return this.scheme != null;
  }

  public function get_data() : haxe.io.Bytes {
    return this.data;
  }

  public function set_data(data:haxe.io.Bytes) : haxe.io.Bytes {
    this.data = data;
    return this.data;
  }

  public function unsetData() : Void {
    this.data = null;
  }

  // Returns true if field data is set (has been assigned a value) and false otherwise
  public function isSetData() : Bool {
    return this.data != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case STATUS_FIELD_ID:
      if (value == null) {
        unsetStatus();
      } else {
        this.status = value;
      }

    case REVISION_FIELD_ID:
      if (value == null) {
        unsetRevision();
      } else {
        this.revision = value;
      }

    case SCHEME_FIELD_ID:
      if (value == null) {
        unsetScheme();
      } else {
        this.scheme = value;
      }

    case DATA_FIELD_ID:
      if (value == null) {
        unsetData();
      } else {
        this.data = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case STATUS_FIELD_ID:
      return this.status;
    case REVISION_FIELD_ID:
      return this.revision;
    case SCHEME_FIELD_ID:
      return this.scheme;
    case DATA_FIELD_ID:
      return this.data;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case STATUS_FIELD_ID:
      return isSetStatus();
    case REVISION_FIELD_ID:
      return isSetRevision();
    case SCHEME_FIELD_ID:
      return isSetScheme();
    case DATA_FIELD_ID:
      return isSetData();
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
          case STATUS_FIELD_ID:
            if (field.type == TType.I32) {
              this.status = iprot.readI32();
              this.__isset_status = true;
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
          case SCHEME_FIELD_ID:
            if (field.type == TType.STRING) {
              this.scheme = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case DATA_FIELD_ID:
            if (field.type == TType.STRING) {
              this.data = iprot.readBinary();
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
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeI32(this.status);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(REVISION_FIELD_DESC);
      oprot.writeI64(this.revision);
      oprot.writeFieldEnd();
      if (this.scheme != null) {
        oprot.writeFieldBegin(SCHEME_FIELD_DESC);
        oprot.writeString(this.scheme);
        oprot.writeFieldEnd();
      }
      if (this.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        oprot.writeBinary(this.data);
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
    var ret : String = "SuggestItemDictionaryIncrement(";
    var first : Bool = true;

    ret += "status:";
    ret += this.status;
    first = false;
    if (!first) ret +=  ", ";
    ret += "revision:";
    ret += this.revision;
    first = false;
    if (!first) ret +=  ", ";
    ret += "scheme:";
    if (this.scheme == null) {
      ret += "null";
    } else {
      ret += this.scheme;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "data:";
    if (this.data == null) {
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

