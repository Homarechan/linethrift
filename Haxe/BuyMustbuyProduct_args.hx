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


class BuyMustbuyProduct_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("buyMustbuyProduct_args"); };
  static var RECEIVER_MID_FIELD_DESC = { new TField("receiverMid", TType.STRING, 2); };
  static var PRODUCT_ID_FIELD_DESC = { new TField("productId", TType.STRING, 3); };
  static var MESSAGE_TEMPLATE_FIELD_DESC = { new TField("messageTemplate", TType.I32, 4); };
  static var LANGUAGE_FIELD_DESC = { new TField("language", TType.STRING, 5); };
  static var COUNTRY_FIELD_DESC = { new TField("country", TType.STRING, 6); };
  static var PACKAGE_ID_FIELD_DESC = { new TField("packageId", TType.I64, 7); };
  static var SERIAL_NUMBER_FIELD_DESC = { new TField("serialNumber", TType.STRING, 8); };

  @:isVar
  public var receiverMid(get,set) : String;
  @:isVar
  public var productId(get,set) : String;
  @:isVar
  public var messageTemplate(get,set) : haxe.Int32;
  @:isVar
  public var language(get,set) : String;
  @:isVar
  public var country(get,set) : String;
  @:isVar
  public var packageId(get,set) : haxe.Int64;
  @:isVar
  public var serialNumber(get,set) : String;

  inline static var RECEIVERMID_FIELD_ID : Int = 2;
  inline static var PRODUCTID_FIELD_ID : Int = 3;
  inline static var MESSAGETEMPLATE_FIELD_ID : Int = 4;
  inline static var LANGUAGE_FIELD_ID : Int = 5;
  inline static var COUNTRY_FIELD_ID : Int = 6;
  inline static var PACKAGEID_FIELD_ID : Int = 7;
  inline static var SERIALNUMBER_FIELD_ID : Int = 8;

  private var __isset_messageTemplate : Bool = false;
  private var __isset_packageId : Bool = false;

  public function new() {
  }

  public function get_receiverMid() : String {
    return this.receiverMid;
  }

  public function set_receiverMid(receiverMid:String) : String {
    this.receiverMid = receiverMid;
    return this.receiverMid;
  }

  public function unsetReceiverMid() : Void {
    this.receiverMid = null;
  }

  // Returns true if field receiverMid is set (has been assigned a value) and false otherwise
  public function isSetReceiverMid() : Bool {
    return this.receiverMid != null;
  }

  public function get_productId() : String {
    return this.productId;
  }

  public function set_productId(productId:String) : String {
    this.productId = productId;
    return this.productId;
  }

  public function unsetProductId() : Void {
    this.productId = null;
  }

  // Returns true if field productId is set (has been assigned a value) and false otherwise
  public function isSetProductId() : Bool {
    return this.productId != null;
  }

  public function get_messageTemplate() : haxe.Int32 {
    return this.messageTemplate;
  }

  public function set_messageTemplate(messageTemplate:haxe.Int32) : haxe.Int32 {
    this.messageTemplate = messageTemplate;
    this.__isset_messageTemplate = true;
    return this.messageTemplate;
  }

  public function unsetMessageTemplate() : Void {
    this.__isset_messageTemplate = false;
  }

  // Returns true if field messageTemplate is set (has been assigned a value) and false otherwise
  public function isSetMessageTemplate() : Bool {
    return this.__isset_messageTemplate;
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

  public function get_packageId() : haxe.Int64 {
    return this.packageId;
  }

  public function set_packageId(packageId:haxe.Int64) : haxe.Int64 {
    this.packageId = packageId;
    this.__isset_packageId = true;
    return this.packageId;
  }

  public function unsetPackageId() : Void {
    this.__isset_packageId = false;
  }

  // Returns true if field packageId is set (has been assigned a value) and false otherwise
  public function isSetPackageId() : Bool {
    return this.__isset_packageId;
  }

  public function get_serialNumber() : String {
    return this.serialNumber;
  }

  public function set_serialNumber(serialNumber:String) : String {
    this.serialNumber = serialNumber;
    return this.serialNumber;
  }

  public function unsetSerialNumber() : Void {
    this.serialNumber = null;
  }

  // Returns true if field serialNumber is set (has been assigned a value) and false otherwise
  public function isSetSerialNumber() : Bool {
    return this.serialNumber != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case RECEIVERMID_FIELD_ID:
      if (value == null) {
        unsetReceiverMid();
      } else {
        this.receiverMid = value;
      }

    case PRODUCTID_FIELD_ID:
      if (value == null) {
        unsetProductId();
      } else {
        this.productId = value;
      }

    case MESSAGETEMPLATE_FIELD_ID:
      if (value == null) {
        unsetMessageTemplate();
      } else {
        this.messageTemplate = value;
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

    case PACKAGEID_FIELD_ID:
      if (value == null) {
        unsetPackageId();
      } else {
        this.packageId = value;
      }

    case SERIALNUMBER_FIELD_ID:
      if (value == null) {
        unsetSerialNumber();
      } else {
        this.serialNumber = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case RECEIVERMID_FIELD_ID:
      return this.receiverMid;
    case PRODUCTID_FIELD_ID:
      return this.productId;
    case MESSAGETEMPLATE_FIELD_ID:
      return this.messageTemplate;
    case LANGUAGE_FIELD_ID:
      return this.language;
    case COUNTRY_FIELD_ID:
      return this.country;
    case PACKAGEID_FIELD_ID:
      return this.packageId;
    case SERIALNUMBER_FIELD_ID:
      return this.serialNumber;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case RECEIVERMID_FIELD_ID:
      return isSetReceiverMid();
    case PRODUCTID_FIELD_ID:
      return isSetProductId();
    case MESSAGETEMPLATE_FIELD_ID:
      return isSetMessageTemplate();
    case LANGUAGE_FIELD_ID:
      return isSetLanguage();
    case COUNTRY_FIELD_ID:
      return isSetCountry();
    case PACKAGEID_FIELD_ID:
      return isSetPackageId();
    case SERIALNUMBER_FIELD_ID:
      return isSetSerialNumber();
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
          case RECEIVERMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.receiverMid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PRODUCTID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.productId = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case MESSAGETEMPLATE_FIELD_ID:
            if (field.type == TType.I32) {
              this.messageTemplate = iprot.readI32();
              this.__isset_messageTemplate = true;
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
          case PACKAGEID_FIELD_ID:
            if (field.type == TType.I64) {
              this.packageId = iprot.readI64();
              this.__isset_packageId = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SERIALNUMBER_FIELD_ID:
            if (field.type == TType.STRING) {
              this.serialNumber = iprot.readString();
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
      if (this.receiverMid != null) {
        oprot.writeFieldBegin(RECEIVER_MID_FIELD_DESC);
        oprot.writeString(this.receiverMid);
        oprot.writeFieldEnd();
      }
      if (this.productId != null) {
        oprot.writeFieldBegin(PRODUCT_ID_FIELD_DESC);
        oprot.writeString(this.productId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MESSAGE_TEMPLATE_FIELD_DESC);
      oprot.writeI32(this.messageTemplate);
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
      oprot.writeFieldBegin(PACKAGE_ID_FIELD_DESC);
      oprot.writeI64(this.packageId);
      oprot.writeFieldEnd();
      if (this.serialNumber != null) {
        oprot.writeFieldBegin(SERIAL_NUMBER_FIELD_DESC);
        oprot.writeString(this.serialNumber);
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
    var ret : String = "buyMustbuyProduct_args(";
    var first : Bool = true;

    ret += "receiverMid:";
    if (this.receiverMid == null) {
      ret += "null";
    } else {
      ret += this.receiverMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "productId:";
    if (this.productId == null) {
      ret += "null";
    } else {
      ret += this.productId;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "messageTemplate:";
    ret += this.messageTemplate;
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
    if (!first) ret +=  ", ";
    ret += "packageId:";
    ret += this.packageId;
    first = false;
    if (!first) ret +=  ", ";
    ret += "serialNumber:";
    if (this.serialNumber == null) {
      ret += "null";
    } else {
      ret += this.serialNumber;
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

