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


class PaidCallAdCountry implements TBase {
  
  static var STRUCT_DESC = { new TStruct("PaidCallAdCountry"); };
  static var COUNTRY_CODE_FIELD_DESC = { new TField("countryCode", TType.STRING, 1); };
  static var RATE_DIVISION_FIELD_DESC = { new TField("rateDivision", TType.STRING, 2); };

  @:isVar
  public var countryCode(get,set) : String;
  @:isVar
  public var rateDivision(get,set) : String;

  inline static var COUNTRYCODE_FIELD_ID : Int = 1;
  inline static var RATEDIVISION_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_countryCode() : String {
    return this.countryCode;
  }

  public function set_countryCode(countryCode:String) : String {
    this.countryCode = countryCode;
    return this.countryCode;
  }

  public function unsetCountryCode() : Void {
    this.countryCode = null;
  }

  // Returns true if field countryCode is set (has been assigned a value) and false otherwise
  public function isSetCountryCode() : Bool {
    return this.countryCode != null;
  }

  public function get_rateDivision() : String {
    return this.rateDivision;
  }

  public function set_rateDivision(rateDivision:String) : String {
    this.rateDivision = rateDivision;
    return this.rateDivision;
  }

  public function unsetRateDivision() : Void {
    this.rateDivision = null;
  }

  // Returns true if field rateDivision is set (has been assigned a value) and false otherwise
  public function isSetRateDivision() : Bool {
    return this.rateDivision != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case COUNTRYCODE_FIELD_ID:
      if (value == null) {
        unsetCountryCode();
      } else {
        this.countryCode = value;
      }

    case RATEDIVISION_FIELD_ID:
      if (value == null) {
        unsetRateDivision();
      } else {
        this.rateDivision = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case COUNTRYCODE_FIELD_ID:
      return this.countryCode;
    case RATEDIVISION_FIELD_ID:
      return this.rateDivision;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case COUNTRYCODE_FIELD_ID:
      return isSetCountryCode();
    case RATEDIVISION_FIELD_ID:
      return isSetRateDivision();
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
          case COUNTRYCODE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.countryCode = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case RATEDIVISION_FIELD_ID:
            if (field.type == TType.STRING) {
              this.rateDivision = iprot.readString();
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
      if (this.countryCode != null) {
        oprot.writeFieldBegin(COUNTRY_CODE_FIELD_DESC);
        oprot.writeString(this.countryCode);
        oprot.writeFieldEnd();
      }
      if (this.rateDivision != null) {
        oprot.writeFieldBegin(RATE_DIVISION_FIELD_DESC);
        oprot.writeString(this.rateDivision);
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
    var ret : String = "PaidCallAdCountry(";
    var first : Bool = true;

    ret += "countryCode:";
    if (this.countryCode == null) {
      ret += "null";
    } else {
      ret += this.countryCode;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "rateDivision:";
    if (this.rateDivision == null) {
      ret += "null";
    } else {
      ret += this.rateDivision;
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

