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


class DeviceInfo implements TBase {
  
  static var STRUCT_DESC = { new TStruct("DeviceInfo"); };
  static var DEVICE_NAME_FIELD_DESC = { new TField("deviceName", TType.STRING, 1); };
  static var SYSTEM_NAME_FIELD_DESC = { new TField("systemName", TType.STRING, 2); };
  static var SYSTEM_VERSION_FIELD_DESC = { new TField("systemVersion", TType.STRING, 3); };
  static var MODEL_FIELD_DESC = { new TField("model", TType.STRING, 4); };
  static var CARRIER_CODE_FIELD_DESC = { new TField("carrierCode", TType.I32, 10); };
  static var CARRIER_NAME_FIELD_DESC = { new TField("carrierName", TType.STRING, 11); };
  static var APPLICATION_TYPE_FIELD_DESC = { new TField("applicationType", TType.I32, 20); };

  @:isVar
  public var deviceName(get,set) : String;
  @:isVar
  public var systemName(get,set) : String;
  @:isVar
  public var systemVersion(get,set) : String;
  @:isVar
  public var model(get,set) : String;
  @:isVar
  public var carrierCode(get,set) : Int;
  @:isVar
  public var carrierName(get,set) : String;
  @:isVar
  public var applicationType(get,set) : Int;

  inline static var DEVICENAME_FIELD_ID : Int = 1;
  inline static var SYSTEMNAME_FIELD_ID : Int = 2;
  inline static var SYSTEMVERSION_FIELD_ID : Int = 3;
  inline static var MODEL_FIELD_ID : Int = 4;
  inline static var CARRIERCODE_FIELD_ID : Int = 10;
  inline static var CARRIERNAME_FIELD_ID : Int = 11;
  inline static var APPLICATIONTYPE_FIELD_ID : Int = 20;

  private var __isset_carrierCode : Bool = false;
  private var __isset_applicationType : Bool = false;

  public function new() {
  }

  public function get_deviceName() : String {
    return this.deviceName;
  }

  public function set_deviceName(deviceName:String) : String {
    this.deviceName = deviceName;
    return this.deviceName;
  }

  public function unsetDeviceName() : Void {
    this.deviceName = null;
  }

  // Returns true if field deviceName is set (has been assigned a value) and false otherwise
  public function isSetDeviceName() : Bool {
    return this.deviceName != null;
  }

  public function get_systemName() : String {
    return this.systemName;
  }

  public function set_systemName(systemName:String) : String {
    this.systemName = systemName;
    return this.systemName;
  }

  public function unsetSystemName() : Void {
    this.systemName = null;
  }

  // Returns true if field systemName is set (has been assigned a value) and false otherwise
  public function isSetSystemName() : Bool {
    return this.systemName != null;
  }

  public function get_systemVersion() : String {
    return this.systemVersion;
  }

  public function set_systemVersion(systemVersion:String) : String {
    this.systemVersion = systemVersion;
    return this.systemVersion;
  }

  public function unsetSystemVersion() : Void {
    this.systemVersion = null;
  }

  // Returns true if field systemVersion is set (has been assigned a value) and false otherwise
  public function isSetSystemVersion() : Bool {
    return this.systemVersion != null;
  }

  public function get_model() : String {
    return this.model;
  }

  public function set_model(model:String) : String {
    this.model = model;
    return this.model;
  }

  public function unsetModel() : Void {
    this.model = null;
  }

  // Returns true if field model is set (has been assigned a value) and false otherwise
  public function isSetModel() : Bool {
    return this.model != null;
  }

  public function get_carrierCode() : Int {
    return this.carrierCode;
  }

  public function set_carrierCode(carrierCode:Int) : Int {
    this.carrierCode = carrierCode;
    this.__isset_carrierCode = true;
    return this.carrierCode;
  }

  public function unsetCarrierCode() : Void {
    this.__isset_carrierCode = false;
  }

  // Returns true if field carrierCode is set (has been assigned a value) and false otherwise
  public function isSetCarrierCode() : Bool {
    return this.__isset_carrierCode;
  }

  public function get_carrierName() : String {
    return this.carrierName;
  }

  public function set_carrierName(carrierName:String) : String {
    this.carrierName = carrierName;
    return this.carrierName;
  }

  public function unsetCarrierName() : Void {
    this.carrierName = null;
  }

  // Returns true if field carrierName is set (has been assigned a value) and false otherwise
  public function isSetCarrierName() : Bool {
    return this.carrierName != null;
  }

  public function get_applicationType() : Int {
    return this.applicationType;
  }

  public function set_applicationType(applicationType:Int) : Int {
    this.applicationType = applicationType;
    this.__isset_applicationType = true;
    return this.applicationType;
  }

  public function unsetApplicationType() : Void {
    this.__isset_applicationType = false;
  }

  // Returns true if field applicationType is set (has been assigned a value) and false otherwise
  public function isSetApplicationType() : Bool {
    return this.__isset_applicationType;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case DEVICENAME_FIELD_ID:
      if (value == null) {
        unsetDeviceName();
      } else {
        this.deviceName = value;
      }

    case SYSTEMNAME_FIELD_ID:
      if (value == null) {
        unsetSystemName();
      } else {
        this.systemName = value;
      }

    case SYSTEMVERSION_FIELD_ID:
      if (value == null) {
        unsetSystemVersion();
      } else {
        this.systemVersion = value;
      }

    case MODEL_FIELD_ID:
      if (value == null) {
        unsetModel();
      } else {
        this.model = value;
      }

    case CARRIERCODE_FIELD_ID:
      if (value == null) {
        unsetCarrierCode();
      } else {
        this.carrierCode = value;
      }

    case CARRIERNAME_FIELD_ID:
      if (value == null) {
        unsetCarrierName();
      } else {
        this.carrierName = value;
      }

    case APPLICATIONTYPE_FIELD_ID:
      if (value == null) {
        unsetApplicationType();
      } else {
        this.applicationType = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case DEVICENAME_FIELD_ID:
      return this.deviceName;
    case SYSTEMNAME_FIELD_ID:
      return this.systemName;
    case SYSTEMVERSION_FIELD_ID:
      return this.systemVersion;
    case MODEL_FIELD_ID:
      return this.model;
    case CARRIERCODE_FIELD_ID:
      return this.carrierCode;
    case CARRIERNAME_FIELD_ID:
      return this.carrierName;
    case APPLICATIONTYPE_FIELD_ID:
      return this.applicationType;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case DEVICENAME_FIELD_ID:
      return isSetDeviceName();
    case SYSTEMNAME_FIELD_ID:
      return isSetSystemName();
    case SYSTEMVERSION_FIELD_ID:
      return isSetSystemVersion();
    case MODEL_FIELD_ID:
      return isSetModel();
    case CARRIERCODE_FIELD_ID:
      return isSetCarrierCode();
    case CARRIERNAME_FIELD_ID:
      return isSetCarrierName();
    case APPLICATIONTYPE_FIELD_ID:
      return isSetApplicationType();
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
          case DEVICENAME_FIELD_ID:
            if (field.type == TType.STRING) {
              this.deviceName = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SYSTEMNAME_FIELD_ID:
            if (field.type == TType.STRING) {
              this.systemName = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SYSTEMVERSION_FIELD_ID:
            if (field.type == TType.STRING) {
              this.systemVersion = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case MODEL_FIELD_ID:
            if (field.type == TType.STRING) {
              this.model = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CARRIERCODE_FIELD_ID:
            if (field.type == TType.I32) {
              this.carrierCode = iprot.readI32();
              this.__isset_carrierCode = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CARRIERNAME_FIELD_ID:
            if (field.type == TType.STRING) {
              this.carrierName = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case APPLICATIONTYPE_FIELD_ID:
            if (field.type == TType.I32) {
              this.applicationType = iprot.readI32();
              this.__isset_applicationType = true;
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
      if (this.deviceName != null) {
        oprot.writeFieldBegin(DEVICE_NAME_FIELD_DESC);
        oprot.writeString(this.deviceName);
        oprot.writeFieldEnd();
      }
      if (this.systemName != null) {
        oprot.writeFieldBegin(SYSTEM_NAME_FIELD_DESC);
        oprot.writeString(this.systemName);
        oprot.writeFieldEnd();
      }
      if (this.systemVersion != null) {
        oprot.writeFieldBegin(SYSTEM_VERSION_FIELD_DESC);
        oprot.writeString(this.systemVersion);
        oprot.writeFieldEnd();
      }
      if (this.model != null) {
        oprot.writeFieldBegin(MODEL_FIELD_DESC);
        oprot.writeString(this.model);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CARRIER_CODE_FIELD_DESC);
      oprot.writeI32(this.carrierCode);
      oprot.writeFieldEnd();
      if (this.carrierName != null) {
        oprot.writeFieldBegin(CARRIER_NAME_FIELD_DESC);
        oprot.writeString(this.carrierName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(APPLICATION_TYPE_FIELD_DESC);
      oprot.writeI32(this.applicationType);
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
    var ret : String = "DeviceInfo(";
    var first : Bool = true;

    ret += "deviceName:";
    if (this.deviceName == null) {
      ret += "null";
    } else {
      ret += this.deviceName;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "systemName:";
    if (this.systemName == null) {
      ret += "null";
    } else {
      ret += this.systemName;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "systemVersion:";
    if (this.systemVersion == null) {
      ret += "null";
    } else {
      ret += this.systemVersion;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "model:";
    if (this.model == null) {
      ret += "null";
    } else {
      ret += this.model;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "carrierCode:";
    var carrierCode_name : String = .CarrierCode.VALUES_TO_NAMES[this.carrierCode];
    if (carrierCode_name != null) {
      ret += carrierCode_name;
      ret += " (";
    }
    ret += this.carrierCode;
    if (carrierCode_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "carrierName:";
    if (this.carrierName == null) {
      ret += "null";
    } else {
      ret += this.carrierName;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "applicationType:";
    var applicationType_name : String = .ApplicationType.VALUES_TO_NAMES[this.applicationType];
    if (applicationType_name != null) {
      ret += applicationType_name;
      ret += " (";
    }
    ret += this.applicationType;
    if (applicationType_name != null) {
      ret += ")";
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetCarrierCode() && !.CarrierCode.VALID_VALUES.contains(carrierCode)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'carrierCode' has been assigned the invalid value " + carrierCode);
    }
    if (isSetApplicationType() && !.ApplicationType.VALID_VALUES.contains(applicationType)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'applicationType' has been assigned the invalid value " + applicationType);
    }
  }

}

