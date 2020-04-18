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


class StartUpdateVerification_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("startUpdateVerification_args"); };
  static var REGION_FIELD_DESC = { new TField("region", TType.STRING, 2); };
  static var CARRIER_FIELD_DESC = { new TField("carrier", TType.I32, 3); };
  static var PHONE_FIELD_DESC = { new TField("phone", TType.STRING, 4); };
  static var UDID_HASH_FIELD_DESC = { new TField("udidHash", TType.STRING, 5); };
  static var DEVICE_INFO_FIELD_DESC = { new TField("deviceInfo", TType.STRUCT, 6); };
  static var NETWORK_CODE_FIELD_DESC = { new TField("networkCode", TType.STRING, 7); };
  static var LOCALE_FIELD_DESC = { new TField("locale", TType.STRING, 8); };

  @:isVar
  public var region(get,set) : String;
  @:isVar
  public var carrier(get,set) : Int;
  @:isVar
  public var phone(get,set) : String;
  @:isVar
  public var udidHash(get,set) : String;
  @:isVar
  public var deviceInfo(get,set) : DeviceInfo;
  @:isVar
  public var networkCode(get,set) : String;
  @:isVar
  public var locale(get,set) : String;

  inline static var REGION_FIELD_ID : Int = 2;
  inline static var CARRIER_FIELD_ID : Int = 3;
  inline static var PHONE_FIELD_ID : Int = 4;
  inline static var UDIDHASH_FIELD_ID : Int = 5;
  inline static var DEVICEINFO_FIELD_ID : Int = 6;
  inline static var NETWORKCODE_FIELD_ID : Int = 7;
  inline static var LOCALE_FIELD_ID : Int = 8;

  private var __isset_carrier : Bool = false;

  public function new() {
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

  public function get_carrier() : Int {
    return this.carrier;
  }

  public function set_carrier(carrier:Int) : Int {
    this.carrier = carrier;
    this.__isset_carrier = true;
    return this.carrier;
  }

  public function unsetCarrier() : Void {
    this.__isset_carrier = false;
  }

  // Returns true if field carrier is set (has been assigned a value) and false otherwise
  public function isSetCarrier() : Bool {
    return this.__isset_carrier;
  }

  public function get_phone() : String {
    return this.phone;
  }

  public function set_phone(phone:String) : String {
    this.phone = phone;
    return this.phone;
  }

  public function unsetPhone() : Void {
    this.phone = null;
  }

  // Returns true if field phone is set (has been assigned a value) and false otherwise
  public function isSetPhone() : Bool {
    return this.phone != null;
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

  public function get_networkCode() : String {
    return this.networkCode;
  }

  public function set_networkCode(networkCode:String) : String {
    this.networkCode = networkCode;
    return this.networkCode;
  }

  public function unsetNetworkCode() : Void {
    this.networkCode = null;
  }

  // Returns true if field networkCode is set (has been assigned a value) and false otherwise
  public function isSetNetworkCode() : Bool {
    return this.networkCode != null;
  }

  public function get_locale() : String {
    return this.locale;
  }

  public function set_locale(locale:String) : String {
    this.locale = locale;
    return this.locale;
  }

  public function unsetLocale() : Void {
    this.locale = null;
  }

  // Returns true if field locale is set (has been assigned a value) and false otherwise
  public function isSetLocale() : Bool {
    return this.locale != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case REGION_FIELD_ID:
      if (value == null) {
        unsetRegion();
      } else {
        this.region = value;
      }

    case CARRIER_FIELD_ID:
      if (value == null) {
        unsetCarrier();
      } else {
        this.carrier = value;
      }

    case PHONE_FIELD_ID:
      if (value == null) {
        unsetPhone();
      } else {
        this.phone = value;
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

    case NETWORKCODE_FIELD_ID:
      if (value == null) {
        unsetNetworkCode();
      } else {
        this.networkCode = value;
      }

    case LOCALE_FIELD_ID:
      if (value == null) {
        unsetLocale();
      } else {
        this.locale = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case REGION_FIELD_ID:
      return this.region;
    case CARRIER_FIELD_ID:
      return this.carrier;
    case PHONE_FIELD_ID:
      return this.phone;
    case UDIDHASH_FIELD_ID:
      return this.udidHash;
    case DEVICEINFO_FIELD_ID:
      return this.deviceInfo;
    case NETWORKCODE_FIELD_ID:
      return this.networkCode;
    case LOCALE_FIELD_ID:
      return this.locale;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case REGION_FIELD_ID:
      return isSetRegion();
    case CARRIER_FIELD_ID:
      return isSetCarrier();
    case PHONE_FIELD_ID:
      return isSetPhone();
    case UDIDHASH_FIELD_ID:
      return isSetUdidHash();
    case DEVICEINFO_FIELD_ID:
      return isSetDeviceInfo();
    case NETWORKCODE_FIELD_ID:
      return isSetNetworkCode();
    case LOCALE_FIELD_ID:
      return isSetLocale();
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
          case REGION_FIELD_ID:
            if (field.type == TType.STRING) {
              this.region = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CARRIER_FIELD_ID:
            if (field.type == TType.I32) {
              this.carrier = iprot.readI32();
              this.__isset_carrier = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PHONE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.phone = iprot.readString();
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
          case NETWORKCODE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.networkCode = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case LOCALE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.locale = iprot.readString();
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
      if (this.region != null) {
        oprot.writeFieldBegin(REGION_FIELD_DESC);
        oprot.writeString(this.region);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CARRIER_FIELD_DESC);
      oprot.writeI32(this.carrier);
      oprot.writeFieldEnd();
      if (this.phone != null) {
        oprot.writeFieldBegin(PHONE_FIELD_DESC);
        oprot.writeString(this.phone);
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
      if (this.networkCode != null) {
        oprot.writeFieldBegin(NETWORK_CODE_FIELD_DESC);
        oprot.writeString(this.networkCode);
        oprot.writeFieldEnd();
      }
      if (this.locale != null) {
        oprot.writeFieldBegin(LOCALE_FIELD_DESC);
        oprot.writeString(this.locale);
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
    var ret : String = "startUpdateVerification_args(";
    var first : Bool = true;

    ret += "region:";
    if (this.region == null) {
      ret += "null";
    } else {
      ret += this.region;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "carrier:";
    var carrier_name : String = .CarrierCode.VALUES_TO_NAMES[this.carrier];
    if (carrier_name != null) {
      ret += carrier_name;
      ret += " (";
    }
    ret += this.carrier;
    if (carrier_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "phone:";
    if (this.phone == null) {
      ret += "null";
    } else {
      ret += this.phone;
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
    if (!first) ret +=  ", ";
    ret += "networkCode:";
    if (this.networkCode == null) {
      ret += "null";
    } else {
      ret += this.networkCode;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "locale:";
    if (this.locale == null) {
      ret += "null";
    } else {
      ret += this.locale;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetCarrier() && !.CarrierCode.VALID_VALUES.contains(carrier)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'carrier' has been assigned the invalid value " + carrier);
    }
  }

}

