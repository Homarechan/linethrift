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


class GetChannelInfo_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("getChannelInfo_args"); };
  static var CHANNEL_ID_FIELD_DESC = { new TField("channelId", TType.STRING, 2); };
  static var LOCALE_FIELD_DESC = { new TField("locale", TType.STRING, 3); };

  @:isVar
  public var channelId(get,set) : String;
  @:isVar
  public var locale(get,set) : String;

  inline static var CHANNELID_FIELD_ID : Int = 2;
  inline static var LOCALE_FIELD_ID : Int = 3;


  public function new() {
  }

  public function get_channelId() : String {
    return this.channelId;
  }

  public function set_channelId(channelId:String) : String {
    this.channelId = channelId;
    return this.channelId;
  }

  public function unsetChannelId() : Void {
    this.channelId = null;
  }

  // Returns true if field channelId is set (has been assigned a value) and false otherwise
  public function isSetChannelId() : Bool {
    return this.channelId != null;
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
    case CHANNELID_FIELD_ID:
      if (value == null) {
        unsetChannelId();
      } else {
        this.channelId = value;
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
    case CHANNELID_FIELD_ID:
      return this.channelId;
    case LOCALE_FIELD_ID:
      return this.locale;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case CHANNELID_FIELD_ID:
      return isSetChannelId();
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
          case CHANNELID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.channelId = iprot.readString();
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
      if (this.channelId != null) {
        oprot.writeFieldBegin(CHANNEL_ID_FIELD_DESC);
        oprot.writeString(this.channelId);
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
    var ret : String = "getChannelInfo_args(";
    var first : Bool = true;

    ret += "channelId:";
    if (this.channelId == null) {
      ret += "null";
    } else {
      ret += this.channelId;
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
  }

}

