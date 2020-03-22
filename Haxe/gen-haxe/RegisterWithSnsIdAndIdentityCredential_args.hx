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


class RegisterWithSnsIdAndIdentityCredential_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("registerWithSnsIdAndIdentityCredential_args"); };
  static var SNS_ID_TYPE_FIELD_DESC = { new TField("snsIdType", TType.I32, 2); };
  static var SNS_ACCESS_TOKEN_FIELD_DESC = { new TField("snsAccessToken", TType.STRING, 3); };
  static var IDENTITY_CREDENTIAL_FIELD_DESC = { new TField("identityCredential", TType.STRUCT, 4); };
  static var REGION_FIELD_DESC = { new TField("region", TType.STRING, 5); };
  static var UDID_HASH_FIELD_DESC = { new TField("udidHash", TType.STRING, 6); };
  static var DEVICE_INFO_FIELD_DESC = { new TField("deviceInfo", TType.STRUCT, 7); };

  @:isVar
  public var snsIdType(get,set) : Int;
  @:isVar
  public var snsAccessToken(get,set) : String;
  @:isVar
  public var identityCredential(get,set) : IdentityCredential;
  @:isVar
  public var region(get,set) : String;
  @:isVar
  public var udidHash(get,set) : String;
  @:isVar
  public var deviceInfo(get,set) : DeviceInfo;

  inline static var SNSIDTYPE_FIELD_ID : Int = 2;
  inline static var SNSACCESSTOKEN_FIELD_ID : Int = 3;
  inline static var IDENTITYCREDENTIAL_FIELD_ID : Int = 4;
  inline static var REGION_FIELD_ID : Int = 5;
  inline static var UDIDHASH_FIELD_ID : Int = 6;
  inline static var DEVICEINFO_FIELD_ID : Int = 7;

  private var __isset_snsIdType : Bool = false;

  public function new() {
  }

  public function get_snsIdType() : Int {
    return this.snsIdType;
  }

  public function set_snsIdType(snsIdType:Int) : Int {
    this.snsIdType = snsIdType;
    this.__isset_snsIdType = true;
    return this.snsIdType;
  }

  public function unsetSnsIdType() : Void {
    this.__isset_snsIdType = false;
  }

  // Returns true if field snsIdType is set (has been assigned a value) and false otherwise
  public function isSetSnsIdType() : Bool {
    return this.__isset_snsIdType;
  }

  public function get_snsAccessToken() : String {
    return this.snsAccessToken;
  }

  public function set_snsAccessToken(snsAccessToken:String) : String {
    this.snsAccessToken = snsAccessToken;
    return this.snsAccessToken;
  }

  public function unsetSnsAccessToken() : Void {
    this.snsAccessToken = null;
  }

  // Returns true if field snsAccessToken is set (has been assigned a value) and false otherwise
  public function isSetSnsAccessToken() : Bool {
    return this.snsAccessToken != null;
  }

  public function get_identityCredential() : IdentityCredential {
    return this.identityCredential;
  }

  public function set_identityCredential(identityCredential:IdentityCredential) : IdentityCredential {
    this.identityCredential = identityCredential;
    return this.identityCredential;
  }

  public function unsetIdentityCredential() : Void {
    this.identityCredential = null;
  }

  // Returns true if field identityCredential is set (has been assigned a value) and false otherwise
  public function isSetIdentityCredential() : Bool {
    return this.identityCredential != null;
  }

  public function get_region() : String {
    return this.region;
  }

  public function set_region(region:String) : String {
    this.region = region;
    return this.region;
  }

  public function unsetRegion() : Void {
    this.region = null;
  }

  // Returns true if field region is set (has been assigned a value) and false otherwise
  public function isSetRegion() : Bool {
    return this.region != null;
  }

  public function get_udidHash() : String {
    return this.udidHash;
  }

  public function set_udidHash(udidHash:String) : String {
    this.udidHash = udidHash;
    return this.udidHash;
  }

  public function unsetUdidHash() : Void {
    this.udidHash = null;
  }

  // Returns true if field udidHash is set (has been assigned a value) and false otherwise
  public function isSetUdidHash() : Bool {
    return this.udidHash != null;
  }

  public function get_deviceInfo() : DeviceInfo {
    return this.deviceInfo;
  }

  public function set_deviceInfo(deviceInfo:DeviceInfo) : DeviceInfo {
    this.deviceInfo = deviceInfo;
    return this.deviceInfo;
  }

  public function unsetDeviceInfo() : Void {
    this.deviceInfo = null;
  }

  // Returns true if field deviceInfo is set (has been assigned a value) and false otherwise
  public function isSetDeviceInfo() : Bool {
    return this.deviceInfo != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SNSIDTYPE_FIELD_ID:
      if (value == null) {
        unsetSnsIdType();
      } else {
        this.snsIdType = value;
      }

    case SNSACCESSTOKEN_FIELD_ID:
      if (value == null) {
        unsetSnsAccessToken();
      } else {
        this.snsAccessToken = value;
      }

    case IDENTITYCREDENTIAL_FIELD_ID:
      if (value == null) {
        unsetIdentityCredential();
      } else {
        this.identityCredential = value;
      }

    case REGION_FIELD_ID:
      if (value == null) {
        unsetRegion();
      } else {
        this.region = value;
      }

    case UDIDHASH_FIELD_ID:
      if (value == null) {
        unsetUdidHash();
      } else {
        this.udidHash = value;
      }

    case DEVICEINFO_FIELD_ID:
      if (value == null) {
        unsetDeviceInfo();
      } else {
        this.deviceInfo = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SNSIDTYPE_FIELD_ID:
      return this.snsIdType;
    case SNSACCESSTOKEN_FIELD_ID:
      return this.snsAccessToken;
    case IDENTITYCREDENTIAL_FIELD_ID:
      return this.identityCredential;
    case REGION_FIELD_ID:
      return this.region;
    case UDIDHASH_FIELD_ID:
      return this.udidHash;
    case DEVICEINFO_FIELD_ID:
      return this.deviceInfo;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SNSIDTYPE_FIELD_ID:
      return isSetSnsIdType();
    case SNSACCESSTOKEN_FIELD_ID:
      return isSetSnsAccessToken();
    case IDENTITYCREDENTIAL_FIELD_ID:
      return isSetIdentityCredential();
    case REGION_FIELD_ID:
      return isSetRegion();
    case UDIDHASH_FIELD_ID:
      return isSetUdidHash();
    case DEVICEINFO_FIELD_ID:
      return isSetDeviceInfo();
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
          case SNSIDTYPE_FIELD_ID:
            if (field.type == TType.I32) {
              this.snsIdType = iprot.readI32();
              this.__isset_snsIdType = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SNSACCESSTOKEN_FIELD_ID:
            if (field.type == TType.STRING) {
              this.snsAccessToken = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case IDENTITYCREDENTIAL_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.identityCredential = new IdentityCredential();
              this.identityCredential.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case REGION_FIELD_ID:
            if (field.type == TType.STRING) {
              this.region = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case UDIDHASH_FIELD_ID:
            if (field.type == TType.STRING) {
              this.udidHash = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case DEVICEINFO_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.deviceInfo = new DeviceInfo();
              this.deviceInfo.read(iprot);
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
      oprot.writeFieldBegin(SNS_ID_TYPE_FIELD_DESC);
      oprot.writeI32(this.snsIdType);
      oprot.writeFieldEnd();
      if (this.snsAccessToken != null) {
        oprot.writeFieldBegin(SNS_ACCESS_TOKEN_FIELD_DESC);
        oprot.writeString(this.snsAccessToken);
        oprot.writeFieldEnd();
      }
      if (this.identityCredential != null) {
        oprot.writeFieldBegin(IDENTITY_CREDENTIAL_FIELD_DESC);
        this.identityCredential.write(oprot);
        oprot.writeFieldEnd();
      }
      if (this.region != null) {
        oprot.writeFieldBegin(REGION_FIELD_DESC);
        oprot.writeString(this.region);
        oprot.writeFieldEnd();
      }
      if (this.udidHash != null) {
        oprot.writeFieldBegin(UDID_HASH_FIELD_DESC);
        oprot.writeString(this.udidHash);
        oprot.writeFieldEnd();
      }
      if (this.deviceInfo != null) {
        oprot.writeFieldBegin(DEVICE_INFO_FIELD_DESC);
        this.deviceInfo.write(oprot);
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
    var ret : String = "registerWithSnsIdAndIdentityCredential_args(";
    var first : Bool = true;

    ret += "snsIdType:";
    var snsIdType_name : String = .SnsIdType.VALUES_TO_NAMES[this.snsIdType];
    if (snsIdType_name != null) {
      ret += snsIdType_name;
      ret += " (";
    }
    ret += this.snsIdType;
    if (snsIdType_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "snsAccessToken:";
    if (this.snsAccessToken == null) {
      ret += "null";
    } else {
      ret += this.snsAccessToken;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "identityCredential:";
    if (this.identityCredential == null) {
      ret += "null";
    } else {
      ret += this.identityCredential;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "region:";
    if (this.region == null) {
      ret += "null";
    } else {
      ret += this.region;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "udidHash:";
    if (this.udidHash == null) {
      ret += "null";
    } else {
      ret += this.udidHash;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "deviceInfo:";
    if (this.deviceInfo == null) {
      ret += "null";
    } else {
      ret += this.deviceInfo;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetSnsIdType() && !.SnsIdType.VALID_VALUES.contains(snsIdType)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'snsIdType' has been assigned the invalid value " + snsIdType);
    }
  }

}

