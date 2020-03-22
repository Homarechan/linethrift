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


class CheckUserAgeWithDocomo_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("checkUserAgeWithDocomo_args"); };
  static var OPEN_ID_REDIRECT_URL_FIELD_DESC = { new TField("openIdRedirectUrl", TType.STRING, 2); };
  static var STANDARD_AGE_FIELD_DESC = { new TField("standardAge", TType.I32, 3); };
  static var VERIFIER_FIELD_DESC = { new TField("verifier", TType.STRING, 4); };

  @:isVar
  public var openIdRedirectUrl(get,set) : String;
  @:isVar
  public var standardAge(get,set) : haxe.Int32;
  @:isVar
  public var verifier(get,set) : String;

  inline static var OPENIDREDIRECTURL_FIELD_ID : Int = 2;
  inline static var STANDARDAGE_FIELD_ID : Int = 3;
  inline static var VERIFIER_FIELD_ID : Int = 4;

  private var __isset_standardAge : Bool = false;

  public function new() {
  }

  public function get_openIdRedirectUrl() : String {
    return this.openIdRedirectUrl;
  }

  public function set_openIdRedirectUrl(openIdRedirectUrl:String) : String {
    this.openIdRedirectUrl = openIdRedirectUrl;
    return this.openIdRedirectUrl;
  }

  public function unsetOpenIdRedirectUrl() : Void {
    this.openIdRedirectUrl = null;
  }

  // Returns true if field openIdRedirectUrl is set (has been assigned a value) and false otherwise
  public function isSetOpenIdRedirectUrl() : Bool {
    return this.openIdRedirectUrl != null;
  }

  public function get_standardAge() : haxe.Int32 {
    return this.standardAge;
  }

  public function set_standardAge(standardAge:haxe.Int32) : haxe.Int32 {
    this.standardAge = standardAge;
    this.__isset_standardAge = true;
    return this.standardAge;
  }

  public function unsetStandardAge() : Void {
    this.__isset_standardAge = false;
  }

  // Returns true if field standardAge is set (has been assigned a value) and false otherwise
  public function isSetStandardAge() : Bool {
    return this.__isset_standardAge;
  }

  public function get_verifier() : String {
    return this.verifier;
  }

  public function set_verifier(verifier:String) : String {
    this.verifier = verifier;
    return this.verifier;
  }

  public function unsetVerifier() : Void {
    this.verifier = null;
  }

  // Returns true if field verifier is set (has been assigned a value) and false otherwise
  public function isSetVerifier() : Bool {
    return this.verifier != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case OPENIDREDIRECTURL_FIELD_ID:
      if (value == null) {
        unsetOpenIdRedirectUrl();
      } else {
        this.openIdRedirectUrl = value;
      }

    case STANDARDAGE_FIELD_ID:
      if (value == null) {
        unsetStandardAge();
      } else {
        this.standardAge = value;
      }

    case VERIFIER_FIELD_ID:
      if (value == null) {
        unsetVerifier();
      } else {
        this.verifier = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case OPENIDREDIRECTURL_FIELD_ID:
      return this.openIdRedirectUrl;
    case STANDARDAGE_FIELD_ID:
      return this.standardAge;
    case VERIFIER_FIELD_ID:
      return this.verifier;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case OPENIDREDIRECTURL_FIELD_ID:
      return isSetOpenIdRedirectUrl();
    case STANDARDAGE_FIELD_ID:
      return isSetStandardAge();
    case VERIFIER_FIELD_ID:
      return isSetVerifier();
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
          case OPENIDREDIRECTURL_FIELD_ID:
            if (field.type == TType.STRING) {
              this.openIdRedirectUrl = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case STANDARDAGE_FIELD_ID:
            if (field.type == TType.I32) {
              this.standardAge = iprot.readI32();
              this.__isset_standardAge = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case VERIFIER_FIELD_ID:
            if (field.type == TType.STRING) {
              this.verifier = iprot.readString();
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
      if (this.openIdRedirectUrl != null) {
        oprot.writeFieldBegin(OPEN_ID_REDIRECT_URL_FIELD_DESC);
        oprot.writeString(this.openIdRedirectUrl);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(STANDARD_AGE_FIELD_DESC);
      oprot.writeI32(this.standardAge);
      oprot.writeFieldEnd();
      if (this.verifier != null) {
        oprot.writeFieldBegin(VERIFIER_FIELD_DESC);
        oprot.writeString(this.verifier);
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
    var ret : String = "checkUserAgeWithDocomo_args(";
    var first : Bool = true;

    ret += "openIdRedirectUrl:";
    if (this.openIdRedirectUrl == null) {
      ret += "null";
    } else {
      ret += this.openIdRedirectUrl;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "standardAge:";
    ret += this.standardAge;
    first = false;
    if (!first) ret +=  ", ";
    ret += "verifier:";
    if (this.verifier == null) {
      ret += "null";
    } else {
      ret += this.verifier;
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

