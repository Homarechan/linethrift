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


class OTPResult implements TBase {
  
  static var STRUCT_DESC = { new TStruct("OTPResult"); };
  static var OTP_ID_FIELD_DESC = { new TField("otpId", TType.STRING, 1); };
  static var OTP_FIELD_DESC = { new TField("otp", TType.STRING, 2); };

  @:isVar
  public var otpId(get,set) : String;
  @:isVar
  public var otp(get,set) : String;

  inline static var OTPID_FIELD_ID : Int = 1;
  inline static var OTP_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_otpId() : String {
    return this.otpId;
  }

  public function set_otpId(otpId:String) : String {
    this.otpId = otpId;
    return this.otpId;
  }

  public function unsetOtpId() : Void {
    this.otpId = null;
  }

  // Returns true if field otpId is set (has been assigned a value) and false otherwise
  public function isSetOtpId() : Bool {
    return this.otpId != null;
  }

  public function get_otp() : String {
    return this.otp;
  }

  public function set_otp(otp:String) : String {
    this.otp = otp;
    return this.otp;
  }

  public function unsetOtp() : Void {
    this.otp = null;
  }

  // Returns true if field otp is set (has been assigned a value) and false otherwise
  public function isSetOtp() : Bool {
    return this.otp != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case OTPID_FIELD_ID:
      if (value == null) {
        unsetOtpId();
      } else {
        this.otpId = value;
      }

    case OTP_FIELD_ID:
      if (value == null) {
        unsetOtp();
      } else {
        this.otp = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case OTPID_FIELD_ID:
      return this.otpId;
    case OTP_FIELD_ID:
      return this.otp;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case OTPID_FIELD_ID:
      return isSetOtpId();
    case OTP_FIELD_ID:
      return isSetOtp();
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
          case OTPID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.otpId = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case OTP_FIELD_ID:
            if (field.type == TType.STRING) {
              this.otp = iprot.readString();
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
      if (this.otpId != null) {
        oprot.writeFieldBegin(OTP_ID_FIELD_DESC);
        oprot.writeString(this.otpId);
        oprot.writeFieldEnd();
      }
      if (this.otp != null) {
        oprot.writeFieldBegin(OTP_FIELD_DESC);
        oprot.writeString(this.otp);
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
    var ret : String = "OTPResult(";
    var first : Bool = true;

    ret += "otpId:";
    if (this.otpId == null) {
      ret += "null";
    } else {
      ret += this.otpId;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "otp:";
    if (this.otp == null) {
      ret += "null";
    } else {
      ret += this.otp;
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
