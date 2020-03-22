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


class GetPresentsSent_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("getPresentsSent_args"); };
  static var START_FIELD_DESC = { new TField("start", TType.I64, 2); };
  static var SIZE_FIELD_DESC = { new TField("size", TType.I32, 3); };
  static var LANGUAGE_FIELD_DESC = { new TField("language", TType.STRING, 4); };
  static var COUNTRY_FIELD_DESC = { new TField("country", TType.STRING, 5); };

  @:isVar
  public var start(get,set) : haxe.Int64;
  @:isVar
  public var size(get,set) : haxe.Int32;
  @:isVar
  public var language(get,set) : String;
  @:isVar
  public var country(get,set) : String;

  inline static var START_FIELD_ID : Int = 2;
  inline static var SIZE_FIELD_ID : Int = 3;
  inline static var LANGUAGE_FIELD_ID : Int = 4;
  inline static var COUNTRY_FIELD_ID : Int = 5;

  private var __isset_start : Bool = false;
  private var __isset_size : Bool = false;

  public function new() {
  }

  public function get_start() : haxe.Int64 {
    return this.start;
  }

  public function set_start(start:haxe.Int64) : haxe.Int64 {
    this.start = start;
    this.__isset_start = true;
    return this.start;
  }

  public function unsetStart() : Void {
    this.__isset_start = false;
  }

  // Returns true if field start is set (has been assigned a value) and false otherwise
  public function isSetStart() : Bool {
    return this.__isset_start;
  }

  public function get_size() : haxe.Int32 {
    return this.size;
  }

  public function set_size(size:haxe.Int32) : haxe.Int32 {
    this.size = size;
    this.__isset_size = true;
    return this.size;
  }

  public function unsetSize() : Void {
    this.__isset_size = false;
  }

  // Returns true if field size is set (has been assigned a value) and false otherwise
  public function isSetSize() : Bool {
    return this.__isset_size;
  }

  public function get_language() : String {
    return this.language;
  }

  public function set_language(language:String) : String {
    this.language = language;
    return this.language;
  }

  public function unsetLanguage() : Void {
    this.language = null;
  }

  // Returns true if field language is set (has been assigned a value) and false otherwise
  public function isSetLanguage() : Bool {
    return this.language != null;
  }

  public function get_country() : String {
    return this.country;
  }

  public function set_country(country:String) : String {
    this.country = country;
    return this.country;
  }

  public function unsetCountry() : Void {
    this.country = null;
  }

  // Returns true if field country is set (has been assigned a value) and false otherwise
  public function isSetCountry() : Bool {
    return this.country != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case START_FIELD_ID:
      if (value == null) {
        unsetStart();
      } else {
        this.start = value;
      }

    case SIZE_FIELD_ID:
      if (value == null) {
        unsetSize();
      } else {
        this.size = value;
      }

    case LANGUAGE_FIELD_ID:
      if (value == null) {
        unsetLanguage();
      } else {
        this.language = value;
      }

    case COUNTRY_FIELD_ID:
      if (value == null) {
        unsetCountry();
      } else {
        this.country = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case START_FIELD_ID:
      return this.start;
    case SIZE_FIELD_ID:
      return this.size;
    case LANGUAGE_FIELD_ID:
      return this.language;
    case COUNTRY_FIELD_ID:
      return this.country;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case START_FIELD_ID:
      return isSetStart();
    case SIZE_FIELD_ID:
      return isSetSize();
    case LANGUAGE_FIELD_ID:
      return isSetLanguage();
    case COUNTRY_FIELD_ID:
      return isSetCountry();
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
          case START_FIELD_ID:
            if (field.type == TType.I64) {
              this.start = iprot.readI64();
              this.__isset_start = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SIZE_FIELD_ID:
            if (field.type == TType.I32) {
              this.size = iprot.readI32();
              this.__isset_size = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case LANGUAGE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.language = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case COUNTRY_FIELD_ID:
            if (field.type == TType.STRING) {
              this.country = iprot.readString();
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
      oprot.writeFieldBegin(START_FIELD_DESC);
      oprot.writeI64(this.start);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SIZE_FIELD_DESC);
      oprot.writeI32(this.size);
      oprot.writeFieldEnd();
      if (this.language != null) {
        oprot.writeFieldBegin(LANGUAGE_FIELD_DESC);
        oprot.writeString(this.language);
        oprot.writeFieldEnd();
      }
      if (this.country != null) {
        oprot.writeFieldBegin(COUNTRY_FIELD_DESC);
        oprot.writeString(this.country);
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
    var ret : String = "getPresentsSent_args(";
    var first : Bool = true;

    ret += "start:";
    ret += this.start;
    first = false;
    if (!first) ret +=  ", ";
    ret += "size:";
    ret += this.size;
    first = false;
    if (!first) ret +=  ", ";
    ret += "language:";
    if (this.language == null) {
      ret += "null";
    } else {
      ret += this.language;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "country:";
    if (this.country == null) {
      ret += "null";
    } else {
      ret += this.country;
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

