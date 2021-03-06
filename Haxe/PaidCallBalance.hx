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


class PaidCallBalance implements TBase {
  
  static var STRUCT_DESC = { new TStruct("PaidCallBalance"); };
  static var PRODUCT_TYPE_FIELD_DESC = { new TField("productType", TType.I32, 1); };
  static var PRODUCT_NAME_FIELD_DESC = { new TField("productName", TType.STRING, 2); };
  static var UNIT_FIELD_DESC = { new TField("unit", TType.STRING, 3); };
  static var LIMITED_PAID_BALANCE_FIELD_DESC = { new TField("limitedPaidBalance", TType.I32, 4); };
  static var LIMITED_FREE_BALANCE_FIELD_DESC = { new TField("limitedFreeBalance", TType.I32, 5); };
  static var UNLIMITED_PAID_BALANCE_FIELD_DESC = { new TField("unlimitedPaidBalance", TType.I32, 6); };
  static var UNLIMITED_FREE_BALANCE_FIELD_DESC = { new TField("unlimitedFreeBalance", TType.I32, 7); };
  static var START_TIME_FIELD_DESC = { new TField("startTime", TType.I64, 8); };
  static var END_TIME_FIELD_DESC = { new TField("endTime", TType.I64, 9); };
  static var AUTOPAY_ENABLED_FIELD_DESC = { new TField("autopayEnabled", TType.BOOL, 10); };

  @:isVar
  public var productType(get,set) : Int;
  @:isVar
  public var productName(get,set) : String;
  @:isVar
  public var unit(get,set) : String;
  @:isVar
  public var limitedPaidBalance(get,set) : haxe.Int32;
  @:isVar
  public var limitedFreeBalance(get,set) : haxe.Int32;
  @:isVar
  public var unlimitedPaidBalance(get,set) : haxe.Int32;
  @:isVar
  public var unlimitedFreeBalance(get,set) : haxe.Int32;
  @:isVar
  public var startTime(get,set) : haxe.Int64;
  @:isVar
  public var endTime(get,set) : haxe.Int64;
  @:isVar
  public var autopayEnabled(get,set) : Bool;

  inline static var PRODUCTTYPE_FIELD_ID : Int = 1;
  inline static var PRODUCTNAME_FIELD_ID : Int = 2;
  inline static var UNIT_FIELD_ID : Int = 3;
  inline static var LIMITEDPAIDBALANCE_FIELD_ID : Int = 4;
  inline static var LIMITEDFREEBALANCE_FIELD_ID : Int = 5;
  inline static var UNLIMITEDPAIDBALANCE_FIELD_ID : Int = 6;
  inline static var UNLIMITEDFREEBALANCE_FIELD_ID : Int = 7;
  inline static var STARTTIME_FIELD_ID : Int = 8;
  inline static var ENDTIME_FIELD_ID : Int = 9;
  inline static var AUTOPAYENABLED_FIELD_ID : Int = 10;

  private var __isset_productType : Bool = false;
  private var __isset_limitedPaidBalance : Bool = false;
  private var __isset_limitedFreeBalance : Bool = false;
  private var __isset_unlimitedPaidBalance : Bool = false;
  private var __isset_unlimitedFreeBalance : Bool = false;
  private var __isset_startTime : Bool = false;
  private var __isset_endTime : Bool = false;
  private var __isset_autopayEnabled : Bool = false;

  public function new() {
  }

  public function get_productType() : Int {
    return this.productType;
  }

  public function set_productType(productType:Int) : Int {
    this.productType = productType;
    this.__isset_productType = true;
    return this.productType;
  }

  public function unsetProductType() : Void {
    this.__isset_productType = false;
  }

  // Returns true if field productType is set (has been assigned a value) and false otherwise
  public function isSetProductType() : Bool {
    return this.__isset_productType;
  }

  public function get_productName() : String {
    return this.productName;
  }

  public function set_productName(productName:String) : String {
    this.productName = productName;
    return this.productName;
  }

  public function unsetProductName() : Void {
    this.productName = null;
  }

  // Returns true if field productName is set (has been assigned a value) and false otherwise
  public function isSetProductName() : Bool {
    return this.productName != null;
  }

  public function get_unit() : String {
    return this.unit;
  }

  public function set_unit(unit:String) : String {
    this.unit = unit;
    return this.unit;
  }

  public function unsetUnit() : Void {
    this.unit = null;
  }

  // Returns true if field unit is set (has been assigned a value) and false otherwise
  public function isSetUnit() : Bool {
    return this.unit != null;
  }

  public function get_limitedPaidBalance() : haxe.Int32 {
    return this.limitedPaidBalance;
  }

  public function set_limitedPaidBalance(limitedPaidBalance:haxe.Int32) : haxe.Int32 {
    this.limitedPaidBalance = limitedPaidBalance;
    this.__isset_limitedPaidBalance = true;
    return this.limitedPaidBalance;
  }

  public function unsetLimitedPaidBalance() : Void {
    this.__isset_limitedPaidBalance = false;
  }

  // Returns true if field limitedPaidBalance is set (has been assigned a value) and false otherwise
  public function isSetLimitedPaidBalance() : Bool {
    return this.__isset_limitedPaidBalance;
  }

  public function get_limitedFreeBalance() : haxe.Int32 {
    return this.limitedFreeBalance;
  }

  public function set_limitedFreeBalance(limitedFreeBalance:haxe.Int32) : haxe.Int32 {
    this.limitedFreeBalance = limitedFreeBalance;
    this.__isset_limitedFreeBalance = true;
    return this.limitedFreeBalance;
  }

  public function unsetLimitedFreeBalance() : Void {
    this.__isset_limitedFreeBalance = false;
  }

  // Returns true if field limitedFreeBalance is set (has been assigned a value) and false otherwise
  public function isSetLimitedFreeBalance() : Bool {
    return this.__isset_limitedFreeBalance;
  }

  public function get_unlimitedPaidBalance() : haxe.Int32 {
    return this.unlimitedPaidBalance;
  }

  public function set_unlimitedPaidBalance(unlimitedPaidBalance:haxe.Int32) : haxe.Int32 {
    this.unlimitedPaidBalance = unlimitedPaidBalance;
    this.__isset_unlimitedPaidBalance = true;
    return this.unlimitedPaidBalance;
  }

  public function unsetUnlimitedPaidBalance() : Void {
    this.__isset_unlimitedPaidBalance = false;
  }

  // Returns true if field unlimitedPaidBalance is set (has been assigned a value) and false otherwise
  public function isSetUnlimitedPaidBalance() : Bool {
    return this.__isset_unlimitedPaidBalance;
  }

  public function get_unlimitedFreeBalance() : haxe.Int32 {
    return this.unlimitedFreeBalance;
  }

  public function set_unlimitedFreeBalance(unlimitedFreeBalance:haxe.Int32) : haxe.Int32 {
    this.unlimitedFreeBalance = unlimitedFreeBalance;
    this.__isset_unlimitedFreeBalance = true;
    return this.unlimitedFreeBalance;
  }

  public function unsetUnlimitedFreeBalance() : Void {
    this.__isset_unlimitedFreeBalance = false;
  }

  // Returns true if field unlimitedFreeBalance is set (has been assigned a value) and false otherwise
  public function isSetUnlimitedFreeBalance() : Bool {
    return this.__isset_unlimitedFreeBalance;
  }

  public function get_startTime() : haxe.Int64 {
    return this.startTime;
  }

  public function set_startTime(startTime:haxe.Int64) : haxe.Int64 {
    this.startTime = startTime;
    this.__isset_startTime = true;
    return this.startTime;
  }

  public function unsetStartTime() : Void {
    this.__isset_startTime = false;
  }

  // Returns true if field startTime is set (has been assigned a value) and false otherwise
  public function isSetStartTime() : Bool {
    return this.__isset_startTime;
  }

  public function get_endTime() : haxe.Int64 {
    return this.endTime;
  }

  public function set_endTime(endTime:haxe.Int64) : haxe.Int64 {
    this.endTime = endTime;
    this.__isset_endTime = true;
    return this.endTime;
  }

  public function unsetEndTime() : Void {
    this.__isset_endTime = false;
  }

  // Returns true if field endTime is set (has been assigned a value) and false otherwise
  public function isSetEndTime() : Bool {
    return this.__isset_endTime;
  }

  public function get_autopayEnabled() : Bool {
    return this.autopayEnabled;
  }

  public function set_autopayEnabled(autopayEnabled:Bool) : Bool {
    this.autopayEnabled = autopayEnabled;
    this.__isset_autopayEnabled = true;
    return this.autopayEnabled;
  }

  public function unsetAutopayEnabled() : Void {
    this.__isset_autopayEnabled = false;
  }

  // Returns true if field autopayEnabled is set (has been assigned a value) and false otherwise
  public function isSetAutopayEnabled() : Bool {
    return this.__isset_autopayEnabled;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case PRODUCTTYPE_FIELD_ID:
      if (value == null) {
        unsetProductType();
      } else {
        this.productType = value;
      }

    case PRODUCTNAME_FIELD_ID:
      if (value == null) {
        unsetProductName();
      } else {
        this.productName = value;
      }

    case UNIT_FIELD_ID:
      if (value == null) {
        unsetUnit();
      } else {
        this.unit = value;
      }

    case LIMITEDPAIDBALANCE_FIELD_ID:
      if (value == null) {
        unsetLimitedPaidBalance();
      } else {
        this.limitedPaidBalance = value;
      }

    case LIMITEDFREEBALANCE_FIELD_ID:
      if (value == null) {
        unsetLimitedFreeBalance();
      } else {
        this.limitedFreeBalance = value;
      }

    case UNLIMITEDPAIDBALANCE_FIELD_ID:
      if (value == null) {
        unsetUnlimitedPaidBalance();
      } else {
        this.unlimitedPaidBalance = value;
      }

    case UNLIMITEDFREEBALANCE_FIELD_ID:
      if (value == null) {
        unsetUnlimitedFreeBalance();
      } else {
        this.unlimitedFreeBalance = value;
      }

    case STARTTIME_FIELD_ID:
      if (value == null) {
        unsetStartTime();
      } else {
        this.startTime = value;
      }

    case ENDTIME_FIELD_ID:
      if (value == null) {
        unsetEndTime();
      } else {
        this.endTime = value;
      }

    case AUTOPAYENABLED_FIELD_ID:
      if (value == null) {
        unsetAutopayEnabled();
      } else {
        this.autopayEnabled = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case PRODUCTTYPE_FIELD_ID:
      return this.productType;
    case PRODUCTNAME_FIELD_ID:
      return this.productName;
    case UNIT_FIELD_ID:
      return this.unit;
    case LIMITEDPAIDBALANCE_FIELD_ID:
      return this.limitedPaidBalance;
    case LIMITEDFREEBALANCE_FIELD_ID:
      return this.limitedFreeBalance;
    case UNLIMITEDPAIDBALANCE_FIELD_ID:
      return this.unlimitedPaidBalance;
    case UNLIMITEDFREEBALANCE_FIELD_ID:
      return this.unlimitedFreeBalance;
    case STARTTIME_FIELD_ID:
      return this.startTime;
    case ENDTIME_FIELD_ID:
      return this.endTime;
    case AUTOPAYENABLED_FIELD_ID:
      return this.autopayEnabled;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case PRODUCTTYPE_FIELD_ID:
      return isSetProductType();
    case PRODUCTNAME_FIELD_ID:
      return isSetProductName();
    case UNIT_FIELD_ID:
      return isSetUnit();
    case LIMITEDPAIDBALANCE_FIELD_ID:
      return isSetLimitedPaidBalance();
    case LIMITEDFREEBALANCE_FIELD_ID:
      return isSetLimitedFreeBalance();
    case UNLIMITEDPAIDBALANCE_FIELD_ID:
      return isSetUnlimitedPaidBalance();
    case UNLIMITEDFREEBALANCE_FIELD_ID:
      return isSetUnlimitedFreeBalance();
    case STARTTIME_FIELD_ID:
      return isSetStartTime();
    case ENDTIME_FIELD_ID:
      return isSetEndTime();
    case AUTOPAYENABLED_FIELD_ID:
      return isSetAutopayEnabled();
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
          case PRODUCTTYPE_FIELD_ID:
            if (field.type == TType.I32) {
              this.productType = iprot.readI32();
              this.__isset_productType = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PRODUCTNAME_FIELD_ID:
            if (field.type == TType.STRING) {
              this.productName = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case UNIT_FIELD_ID:
            if (field.type == TType.STRING) {
              this.unit = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case LIMITEDPAIDBALANCE_FIELD_ID:
            if (field.type == TType.I32) {
              this.limitedPaidBalance = iprot.readI32();
              this.__isset_limitedPaidBalance = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case LIMITEDFREEBALANCE_FIELD_ID:
            if (field.type == TType.I32) {
              this.limitedFreeBalance = iprot.readI32();
              this.__isset_limitedFreeBalance = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case UNLIMITEDPAIDBALANCE_FIELD_ID:
            if (field.type == TType.I32) {
              this.unlimitedPaidBalance = iprot.readI32();
              this.__isset_unlimitedPaidBalance = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case UNLIMITEDFREEBALANCE_FIELD_ID:
            if (field.type == TType.I32) {
              this.unlimitedFreeBalance = iprot.readI32();
              this.__isset_unlimitedFreeBalance = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case STARTTIME_FIELD_ID:
            if (field.type == TType.I64) {
              this.startTime = iprot.readI64();
              this.__isset_startTime = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case ENDTIME_FIELD_ID:
            if (field.type == TType.I64) {
              this.endTime = iprot.readI64();
              this.__isset_endTime = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case AUTOPAYENABLED_FIELD_ID:
            if (field.type == TType.BOOL) {
              this.autopayEnabled = iprot.readBool();
              this.__isset_autopayEnabled = true;
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
      oprot.writeFieldBegin(PRODUCT_TYPE_FIELD_DESC);
      oprot.writeI32(this.productType);
      oprot.writeFieldEnd();
      if (this.productName != null) {
        oprot.writeFieldBegin(PRODUCT_NAME_FIELD_DESC);
        oprot.writeString(this.productName);
        oprot.writeFieldEnd();
      }
      if (this.unit != null) {
        oprot.writeFieldBegin(UNIT_FIELD_DESC);
        oprot.writeString(this.unit);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LIMITED_PAID_BALANCE_FIELD_DESC);
      oprot.writeI32(this.limitedPaidBalance);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LIMITED_FREE_BALANCE_FIELD_DESC);
      oprot.writeI32(this.limitedFreeBalance);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UNLIMITED_PAID_BALANCE_FIELD_DESC);
      oprot.writeI32(this.unlimitedPaidBalance);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UNLIMITED_FREE_BALANCE_FIELD_DESC);
      oprot.writeI32(this.unlimitedFreeBalance);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(START_TIME_FIELD_DESC);
      oprot.writeI64(this.startTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(END_TIME_FIELD_DESC);
      oprot.writeI64(this.endTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(AUTOPAY_ENABLED_FIELD_DESC);
      oprot.writeBool(this.autopayEnabled);
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
    var ret : String = "PaidCallBalance(";
    var first : Bool = true;

    ret += "productType:";
    var productType_name : String = .PaidCallProductType.VALUES_TO_NAMES[this.productType];
    if (productType_name != null) {
      ret += productType_name;
      ret += " (";
    }
    ret += this.productType;
    if (productType_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "productName:";
    if (this.productName == null) {
      ret += "null";
    } else {
      ret += this.productName;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "unit:";
    if (this.unit == null) {
      ret += "null";
    } else {
      ret += this.unit;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "limitedPaidBalance:";
    ret += this.limitedPaidBalance;
    first = false;
    if (!first) ret +=  ", ";
    ret += "limitedFreeBalance:";
    ret += this.limitedFreeBalance;
    first = false;
    if (!first) ret +=  ", ";
    ret += "unlimitedPaidBalance:";
    ret += this.unlimitedPaidBalance;
    first = false;
    if (!first) ret +=  ", ";
    ret += "unlimitedFreeBalance:";
    ret += this.unlimitedFreeBalance;
    first = false;
    if (!first) ret +=  ", ";
    ret += "startTime:";
    ret += this.startTime;
    first = false;
    if (!first) ret +=  ", ";
    ret += "endTime:";
    ret += this.endTime;
    first = false;
    if (!first) ret +=  ", ";
    ret += "autopayEnabled:";
    ret += this.autopayEnabled;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetProductType() && !.PaidCallProductType.VALID_VALUES.contains(productType)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'productType' has been assigned the invalid value " + productType);
    }
  }

}

