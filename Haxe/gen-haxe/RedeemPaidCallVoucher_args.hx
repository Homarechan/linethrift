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


class RedeemPaidCallVoucher_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("redeemPaidCallVoucher_args"); };
  static var SERIAL_FIELD_DESC = { new TField("serial", TType.STRING, 2); };
  static var LANGUAGE_FIELD_DESC = { new TField("language", TType.STRING, 3); };

  @:isVar
  public var serial(get,set) : String;
  @:isVar
  public var language(get,set) : String;

  inline static var SERIAL_FIELD_ID : Int = 2;
  inline static var LANGUAGE_FIELD_ID : Int = 3;


  public function new() {
  }

  public function get_serial() : String {
    return this.serial;
  }

  public function set_serial(serial:String) : String {
    this.serial = serial;
    return this.serial;
  }

  public function unsetSerial() : Void {
    this.serial = null;
  }

  // Returns true if field serial is set (has been assigned a value) and false otherwise
  public function isSetSerial() : Bool {
    return this.serial != null;
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

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SERIAL_FIELD_ID:
      if (value == null) {
        unsetSerial();
      } else {
        this.serial = value;
      }

    case LANGUAGE_FIELD_ID:
      if (value == null) {
        unsetLanguage();
      } else {
        this.language = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SERIAL_FIELD_ID:
      return this.serial;
    case LANGUAGE_FIELD_ID:
      return this.language;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SERIAL_FIELD_ID:
      return isSetSerial();
    case LANGUAGE_FIELD_ID:
      return isSetLanguage();
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
          case SERIAL_FIELD_ID:
            if (field.type == TType.STRING) {
              this.serial = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case LANGUAGE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.language = iprot.readString();
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
      if (this.serial != null) {
        oprot.writeFieldBegin(SERIAL_FIELD_DESC);
        oprot.writeString(this.serial);
        oprot.writeFieldEnd();
      }
      if (this.language != null) {
        oprot.writeFieldBegin(LANGUAGE_FIELD_DESC);
        oprot.writeString(this.language);
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
    var ret : String = "redeemPaidCallVoucher_args(";
    var first : Bool = true;

    ret += "serial:";
    if (this.serial == null) {
      ret += "null";
    } else {
      ret += this.serial;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "language:";
    if (this.language == null) {
      ret += "null";
    } else {
      ret += this.language;
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

