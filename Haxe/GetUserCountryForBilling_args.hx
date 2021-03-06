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


class GetUserCountryForBilling_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("getUserCountryForBilling_args"); };
  static var COUNTRY_FIELD_DESC = { new TField("country", TType.STRING, 2); };
  static var REMOTE_IP_FIELD_DESC = { new TField("remoteIp", TType.STRING, 3); };

  @:isVar
  public var country(get,set) : String;
  @:isVar
  public var remoteIp(get,set) : String;

  inline static var COUNTRY_FIELD_ID : Int = 2;
  inline static var REMOTEIP_FIELD_ID : Int = 3;


  public function new() {
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

  public function get_remoteIp() : String {
    return this.remoteIp;
  }

  public function set_remoteIp(remoteIp:String) : String {
    this.remoteIp = remoteIp;
    return this.remoteIp;
  }

  public function unsetRemoteIp() : Void {
    this.remoteIp = null;
  }

  // Returns true if field remoteIp is set (has been assigned a value) and false otherwise
  public function isSetRemoteIp() : Bool {
    return this.remoteIp != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case COUNTRY_FIELD_ID:
      if (value == null) {
        unsetCountry();
      } else {
        this.country = value;
      }

    case REMOTEIP_FIELD_ID:
      if (value == null) {
        unsetRemoteIp();
      } else {
        this.remoteIp = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case COUNTRY_FIELD_ID:
      return this.country;
    case REMOTEIP_FIELD_ID:
      return this.remoteIp;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case COUNTRY_FIELD_ID:
      return isSetCountry();
    case REMOTEIP_FIELD_ID:
      return isSetRemoteIp();
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
          case COUNTRY_FIELD_ID:
            if (field.type == TType.STRING) {
              this.country = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case REMOTEIP_FIELD_ID:
            if (field.type == TType.STRING) {
              this.remoteIp = iprot.readString();
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
      if (this.country != null) {
        oprot.writeFieldBegin(COUNTRY_FIELD_DESC);
        oprot.writeString(this.country);
        oprot.writeFieldEnd();
      }
      if (this.remoteIp != null) {
        oprot.writeFieldBegin(REMOTE_IP_FIELD_DESC);
        oprot.writeString(this.remoteIp);
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
    var ret : String = "getUserCountryForBilling_args(";
    var first : Bool = true;

    ret += "country:";
    if (this.country == null) {
      ret += "null";
    } else {
      ret += this.country;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "remoteIp:";
    if (this.remoteIp == null) {
      ret += "null";
    } else {
      ret += this.remoteIp;
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

