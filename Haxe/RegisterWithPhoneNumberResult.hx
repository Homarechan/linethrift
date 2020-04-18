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


class RegisterWithPhoneNumberResult implements TBase {
  
  static var STRUCT_DESC = { new TStruct("RegisterWithPhoneNumberResult"); };
  static var AUTH_TOKEN_FIELD_DESC = { new TField("authToken", TType.STRING, 1); };
  static var RECOMMEND_EMAIL_REGISTRATION_FIELD_DESC = { new TField("recommendEmailRegistration", TType.BOOL, 2); };
  static var CERTIFICATE_FIELD_DESC = { new TField("certificate", TType.STRING, 3); };

  @:isVar
  public var authToken(get,set) : String;
  @:isVar
  public var recommendEmailRegistration(get,set) : Bool;
  @:isVar
  public var certificate(get,set) : String;

  inline static var AUTHTOKEN_FIELD_ID : Int = 1;
  inline static var RECOMMENDEMAILREGISTRATION_FIELD_ID : Int = 2;
  inline static var CERTIFICATE_FIELD_ID : Int = 3;

  private var __isset_recommendEmailRegistration : Bool = false;

  public function new() {
  }

  public function get_authToken() : String {
    return this.authToken;
  }

  public function set_authToken(authToken:String) : String {
    this.authToken = authToken;
    return this.authToken;
  }

  public function unsetAuthToken() : Void {
    this.authToken = null;
  }

  // Returns true if field authToken is set (has been assigned a value) and false otherwise
  public function isSetAuthToken() : Bool {
    return this.authToken != null;
  }

  public function get_recommendEmailRegistration() : Bool {
    return this.recommendEmailRegistration;
  }

  public function set_recommendEmailRegistration(recommendEmailRegistration:Bool) : Bool {
    this.recommendEmailRegistration = recommendEmailRegistration;
    this.__isset_recommendEmailRegistration = true;
    return this.recommendEmailRegistration;
  }

  public function unsetRecommendEmailRegistration() : Void {
    this.__isset_recommendEmailRegistration = false;
  }

  // Returns true if field recommendEmailRegistration is set (has been assigned a value) and false otherwise
  public function isSetRecommendEmailRegistration() : Bool {
    return this.__isset_recommendEmailRegistration;
  }

  public function get_certificate() : String {
    return this.certificate;
  }

  public function set_certificate(certificate:String) : String {
    this.certificate = certificate;
    return this.certificate;
  }

  public function unsetCertificate() : Void {
    this.certificate = null;
  }

  // Returns true if field certificate is set (has been assigned a value) and false otherwise
  public function isSetCertificate() : Bool {
    return this.certificate != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case AUTHTOKEN_FIELD_ID:
      if (value == null) {
        unsetAuthToken();
      } else {
        this.authToken = value;
      }

    case RECOMMENDEMAILREGISTRATION_FIELD_ID:
      if (value == null) {
        unsetRecommendEmailRegistration();
      } else {
        this.recommendEmailRegistration = value;
      }

    case CERTIFICATE_FIELD_ID:
      if (value == null) {
        unsetCertificate();
      } else {
        this.certificate = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case AUTHTOKEN_FIELD_ID:
      return this.authToken;
    case RECOMMENDEMAILREGISTRATION_FIELD_ID:
      return this.recommendEmailRegistration;
    case CERTIFICATE_FIELD_ID:
      return this.certificate;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case AUTHTOKEN_FIELD_ID:
      return isSetAuthToken();
    case RECOMMENDEMAILREGISTRATION_FIELD_ID:
      return isSetRecommendEmailRegistration();
    case CERTIFICATE_FIELD_ID:
      return isSetCertificate();
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
          case AUTHTOKEN_FIELD_ID:
            if (field.type == TType.STRING) {
              this.authToken = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case RECOMMENDEMAILREGISTRATION_FIELD_ID:
            if (field.type == TType.BOOL) {
              this.recommendEmailRegistration = iprot.readBool();
              this.__isset_recommendEmailRegistration = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CERTIFICATE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.certificate = iprot.readString();
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
      if (this.authToken != null) {
        oprot.writeFieldBegin(AUTH_TOKEN_FIELD_DESC);
        oprot.writeString(this.authToken);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(RECOMMEND_EMAIL_REGISTRATION_FIELD_DESC);
      oprot.writeBool(this.recommendEmailRegistration);
      oprot.writeFieldEnd();
      if (this.certificate != null) {
        oprot.writeFieldBegin(CERTIFICATE_FIELD_DESC);
        oprot.writeString(this.certificate);
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
    var ret : String = "RegisterWithPhoneNumberResult(";
    var first : Bool = true;

    ret += "authToken:";
    if (this.authToken == null) {
      ret += "null";
    } else {
      ret += this.authToken;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "recommendEmailRegistration:";
    ret += this.recommendEmailRegistration;
    first = false;
    if (!first) ret +=  ", ";
    ret += "certificate:";
    if (this.certificate == null) {
      ret += "null";
    } else {
      ret += this.certificate;
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

