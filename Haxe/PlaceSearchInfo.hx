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


class PlaceSearchInfo implements TBase {
  
  static var STRUCT_DESC = { new TStruct("PlaceSearchInfo"); };
  static var NAME_FIELD_DESC = { new TField("name", TType.STRING, 1); };
  static var ADDRESS_FIELD_DESC = { new TField("address", TType.STRING, 2); };
  static var LATITUDE_FIELD_DESC = { new TField("latitude", TType.DOUBLE, 3); };
  static var LONGITUDE_FIELD_DESC = { new TField("longitude", TType.DOUBLE, 4); };

  @:isVar
  public var name(get,set) : String;
  @:isVar
  public var address(get,set) : String;
  @:isVar
  public var latitude(get,set) : Float;
  @:isVar
  public var longitude(get,set) : Float;

  inline static var NAME_FIELD_ID : Int = 1;
  inline static var ADDRESS_FIELD_ID : Int = 2;
  inline static var LATITUDE_FIELD_ID : Int = 3;
  inline static var LONGITUDE_FIELD_ID : Int = 4;

  private var __isset_latitude : Bool = false;
  private var __isset_longitude : Bool = false;

  public function new() {
  }

  public function get_name() : String {
    return this.name;
  }

  public function set_name(name:String) : String {
    this.name = name;
    return this.name;
  }

  public function unsetName() : Void {
    this.name = null;
  }

  // Returns true if field name is set (has been assigned a value) and false otherwise
  public function isSetName() : Bool {
    return this.name != null;
  }

  public function get_address() : String {
    return this.address;
  }

  public function set_address(address:String) : String {
    this.address = address;
    return this.address;
  }

  public function unsetAddress() : Void {
    this.address = null;
  }

  // Returns true if field address is set (has been assigned a value) and false otherwise
  public function isSetAddress() : Bool {
    return this.address != null;
  }

  public function get_latitude() : Float {
    return this.latitude;
  }

  public function set_latitude(latitude:Float) : Float {
    this.latitude = latitude;
    this.__isset_latitude = true;
    return this.latitude;
  }

  public function unsetLatitude() : Void {
    this.__isset_latitude = false;
  }

  // Returns true if field latitude is set (has been assigned a value) and false otherwise
  public function isSetLatitude() : Bool {
    return this.__isset_latitude;
  }

  public function get_longitude() : Float {
    return this.longitude;
  }

  public function set_longitude(longitude:Float) : Float {
    this.longitude = longitude;
    this.__isset_longitude = true;
    return this.longitude;
  }

  public function unsetLongitude() : Void {
    this.__isset_longitude = false;
  }

  // Returns true if field longitude is set (has been assigned a value) and false otherwise
  public function isSetLongitude() : Bool {
    return this.__isset_longitude;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case NAME_FIELD_ID:
      if (value == null) {
        unsetName();
      } else {
        this.name = value;
      }

    case ADDRESS_FIELD_ID:
      if (value == null) {
        unsetAddress();
      } else {
        this.address = value;
      }

    case LATITUDE_FIELD_ID:
      if (value == null) {
        unsetLatitude();
      } else {
        this.latitude = value;
      }

    case LONGITUDE_FIELD_ID:
      if (value == null) {
        unsetLongitude();
      } else {
        this.longitude = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case NAME_FIELD_ID:
      return this.name;
    case ADDRESS_FIELD_ID:
      return this.address;
    case LATITUDE_FIELD_ID:
      return this.latitude;
    case LONGITUDE_FIELD_ID:
      return this.longitude;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case NAME_FIELD_ID:
      return isSetName();
    case ADDRESS_FIELD_ID:
      return isSetAddress();
    case LATITUDE_FIELD_ID:
      return isSetLatitude();
    case LONGITUDE_FIELD_ID:
      return isSetLongitude();
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
          case NAME_FIELD_ID:
            if (field.type == TType.STRING) {
              this.name = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case ADDRESS_FIELD_ID:
            if (field.type == TType.STRING) {
              this.address = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case LATITUDE_FIELD_ID:
            if (field.type == TType.DOUBLE) {
              this.latitude = iprot.readDouble();
              this.__isset_latitude = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case LONGITUDE_FIELD_ID:
            if (field.type == TType.DOUBLE) {
              this.longitude = iprot.readDouble();
              this.__isset_longitude = true;
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
      if (this.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(this.name);
        oprot.writeFieldEnd();
      }
      if (this.address != null) {
        oprot.writeFieldBegin(ADDRESS_FIELD_DESC);
        oprot.writeString(this.address);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LATITUDE_FIELD_DESC);
      oprot.writeDouble(this.latitude);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LONGITUDE_FIELD_DESC);
      oprot.writeDouble(this.longitude);
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
    var ret : String = "PlaceSearchInfo(";
    var first : Bool = true;

    ret += "name:";
    if (this.name == null) {
      ret += "null";
    } else {
      ret += this.name;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "address:";
    if (this.address == null) {
      ret += "null";
    } else {
      ret += this.address;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "latitude:";
    ret += this.latitude;
    first = false;
    if (!first) ret +=  ", ";
    ret += "longitude:";
    ret += this.longitude;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

