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


class FriendChannelMatrix implements TBase {
  
  static var STRUCT_DESC = { new TStruct("FriendChannelMatrix"); };
  static var CHANNEL_ID_FIELD_DESC = { new TField("channelId", TType.STRING, 1); };
  static var REPRESENT_MID_FIELD_DESC = { new TField("representMid", TType.STRING, 2); };
  static var COUNT_FIELD_DESC = { new TField("count", TType.I32, 3); };
  static var POINT_FIELD_DESC = { new TField("point", TType.I32, 4); };

  @:isVar
  public var channelId(get,set) : String;
  @:isVar
  public var representMid(get,set) : String;
  @:isVar
  public var count(get,set) : haxe.Int32;
  @:isVar
  public var point(get,set) : haxe.Int32;

  inline static var CHANNELID_FIELD_ID : Int = 1;
  inline static var REPRESENTMID_FIELD_ID : Int = 2;
  inline static var COUNT_FIELD_ID : Int = 3;
  inline static var POINT_FIELD_ID : Int = 4;

  private var __isset_count : Bool = false;
  private var __isset_point : Bool = false;

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

  public function get_representMid() : String {
    return this.representMid;
  }

  public function set_representMid(representMid:String) : String {
    this.representMid = representMid;
    return this.representMid;
  }

  public function unsetRepresentMid() : Void {
    this.representMid = null;
  }

  // Returns true if field representMid is set (has been assigned a value) and false otherwise
  public function isSetRepresentMid() : Bool {
    return this.representMid != null;
  }

  public function get_count() : haxe.Int32 {
    return this.count;
  }

  public function set_count(count:haxe.Int32) : haxe.Int32 {
    this.count = count;
    this.__isset_count = true;
    return this.count;
  }

  public function unsetCount() : Void {
    this.__isset_count = false;
  }

  // Returns true if field count is set (has been assigned a value) and false otherwise
  public function isSetCount() : Bool {
    return this.__isset_count;
  }

  public function get_point() : haxe.Int32 {
    return this.point;
  }

  public function set_point(point:haxe.Int32) : haxe.Int32 {
    this.point = point;
    this.__isset_point = true;
    return this.point;
  }

  public function unsetPoint() : Void {
    this.__isset_point = false;
  }

  // Returns true if field point is set (has been assigned a value) and false otherwise
  public function isSetPoint() : Bool {
    return this.__isset_point;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case CHANNELID_FIELD_ID:
      if (value == null) {
        unsetChannelId();
      } else {
        this.channelId = value;
      }

    case REPRESENTMID_FIELD_ID:
      if (value == null) {
        unsetRepresentMid();
      } else {
        this.representMid = value;
      }

    case COUNT_FIELD_ID:
      if (value == null) {
        unsetCount();
      } else {
        this.count = value;
      }

    case POINT_FIELD_ID:
      if (value == null) {
        unsetPoint();
      } else {
        this.point = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case CHANNELID_FIELD_ID:
      return this.channelId;
    case REPRESENTMID_FIELD_ID:
      return this.representMid;
    case COUNT_FIELD_ID:
      return this.count;
    case POINT_FIELD_ID:
      return this.point;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case CHANNELID_FIELD_ID:
      return isSetChannelId();
    case REPRESENTMID_FIELD_ID:
      return isSetRepresentMid();
    case COUNT_FIELD_ID:
      return isSetCount();
    case POINT_FIELD_ID:
      return isSetPoint();
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
          case REPRESENTMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.representMid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case COUNT_FIELD_ID:
            if (field.type == TType.I32) {
              this.count = iprot.readI32();
              this.__isset_count = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case POINT_FIELD_ID:
            if (field.type == TType.I32) {
              this.point = iprot.readI32();
              this.__isset_point = true;
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
      if (this.representMid != null) {
        oprot.writeFieldBegin(REPRESENT_MID_FIELD_DESC);
        oprot.writeString(this.representMid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(COUNT_FIELD_DESC);
      oprot.writeI32(this.count);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(POINT_FIELD_DESC);
      oprot.writeI32(this.point);
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
    var ret : String = "FriendChannelMatrix(";
    var first : Bool = true;

    ret += "channelId:";
    if (this.channelId == null) {
      ret += "null";
    } else {
      ret += this.channelId;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "representMid:";
    if (this.representMid == null) {
      ret += "null";
    } else {
      ret += this.representMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "count:";
    ret += this.count;
    first = false;
    if (!first) ret +=  ", ";
    ret += "point:";
    ret += this.point;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}
