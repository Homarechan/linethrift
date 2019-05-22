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


class NotiCenterEventData implements TBase {
  
  static var STRUCT_DESC = { new TStruct("NotiCenterEventData"); };
  static var ID_FIELD_DESC = { new TField("id", TType.STRING, 1); };
  static var TO_FIELD_DESC = { new TField("to", TType.STRING, 2); };
  static var FROM__FIELD_DESC = { new TField("from_", TType.STRING, 3); };
  static var TO_CHANNEL_FIELD_DESC = { new TField("toChannel", TType.STRING, 4); };
  static var FROM_CHANNEL_FIELD_DESC = { new TField("fromChannel", TType.STRING, 5); };
  static var EVENT_TYPE_FIELD_DESC = { new TField("eventType", TType.STRING, 6); };
  static var CREATED_TIME_FIELD_DESC = { new TField("createdTime", TType.I64, 7); };
  static var OPERATION_REVISION_FIELD_DESC = { new TField("operationRevision", TType.I64, 8); };
  static var CONTENT_FIELD_DESC = { new TField("content", TType.MAP, 9); };
  static var PUSH_FIELD_DESC = { new TField("push", TType.MAP, 10); };

  @:isVar
  public var id(get,set) : String;
  @:isVar
  public var to(get,set) : String;
  @:isVar
  public var from_(get,set) : String;
  @:isVar
  public var toChannel(get,set) : String;
  @:isVar
  public var fromChannel(get,set) : String;
  @:isVar
  public var eventType(get,set) : String;
  @:isVar
  public var createdTime(get,set) : haxe.Int64;
  @:isVar
  public var operationRevision(get,set) : haxe.Int64;
  @:isVar
  public var content(get,set) : StringMap< String>;
  @:isVar
  public var push(get,set) : StringMap< String>;

  inline static var ID_FIELD_ID : Int = 1;
  inline static var TO_FIELD_ID : Int = 2;
  inline static var FROM__FIELD_ID : Int = 3;
  inline static var TOCHANNEL_FIELD_ID : Int = 4;
  inline static var FROMCHANNEL_FIELD_ID : Int = 5;
  inline static var EVENTTYPE_FIELD_ID : Int = 6;
  inline static var CREATEDTIME_FIELD_ID : Int = 7;
  inline static var OPERATIONREVISION_FIELD_ID : Int = 8;
  inline static var CONTENT_FIELD_ID : Int = 9;
  inline static var PUSH_FIELD_ID : Int = 10;

  private var __isset_createdTime : Bool = false;
  private var __isset_operationRevision : Bool = false;

  public function new() {
  }

  public function get_id() : String {
    return this.id;
  }

  public function set_id(id:String) : String {
    this.id = id;
    return this.id;
  }

  public function unsetId() : Void {
    this.id = null;
  }

  // Returns true if field id is set (has been assigned a value) and false otherwise
  public function isSetId() : Bool {
    return this.id != null;
  }

  public function get_to() : String {
    return this.to;
  }

  public function set_to(to:String) : String {
    this.to = to;
    return this.to;
  }

  public function unsetTo() : Void {
    this.to = null;
  }

  // Returns true if field to is set (has been assigned a value) and false otherwise
  public function isSetTo() : Bool {
    return this.to != null;
  }

  public function get_from_() : String {
    return this.from_;
  }

  public function set_from_(from_:String) : String {
    this.from_ = from_;
    return this.from_;
  }

  public function unsetFrom_() : Void {
    this.from_ = null;
  }

  // Returns true if field from_ is set (has been assigned a value) and false otherwise
  public function isSetFrom_() : Bool {
    return this.from_ != null;
  }

  public function get_toChannel() : String {
    return this.toChannel;
  }

  public function set_toChannel(toChannel:String) : String {
    this.toChannel = toChannel;
    return this.toChannel;
  }

  public function unsetToChannel() : Void {
    this.toChannel = null;
  }

  // Returns true if field toChannel is set (has been assigned a value) and false otherwise
  public function isSetToChannel() : Bool {
    return this.toChannel != null;
  }

  public function get_fromChannel() : String {
    return this.fromChannel;
  }

  public function set_fromChannel(fromChannel:String) : String {
    this.fromChannel = fromChannel;
    return this.fromChannel;
  }

  public function unsetFromChannel() : Void {
    this.fromChannel = null;
  }

  // Returns true if field fromChannel is set (has been assigned a value) and false otherwise
  public function isSetFromChannel() : Bool {
    return this.fromChannel != null;
  }

  public function get_eventType() : String {
    return this.eventType;
  }

  public function set_eventType(eventType:String) : String {
    this.eventType = eventType;
    return this.eventType;
  }

  public function unsetEventType() : Void {
    this.eventType = null;
  }

  // Returns true if field eventType is set (has been assigned a value) and false otherwise
  public function isSetEventType() : Bool {
    return this.eventType != null;
  }

  public function get_createdTime() : haxe.Int64 {
    return this.createdTime;
  }

  public function set_createdTime(createdTime:haxe.Int64) : haxe.Int64 {
    this.createdTime = createdTime;
    this.__isset_createdTime = true;
    return this.createdTime;
  }

  public function unsetCreatedTime() : Void {
    this.__isset_createdTime = false;
  }

  // Returns true if field createdTime is set (has been assigned a value) and false otherwise
  public function isSetCreatedTime() : Bool {
    return this.__isset_createdTime;
  }

  public function get_operationRevision() : haxe.Int64 {
    return this.operationRevision;
  }

  public function set_operationRevision(operationRevision:haxe.Int64) : haxe.Int64 {
    this.operationRevision = operationRevision;
    this.__isset_operationRevision = true;
    return this.operationRevision;
  }

  public function unsetOperationRevision() : Void {
    this.__isset_operationRevision = false;
  }

  // Returns true if field operationRevision is set (has been assigned a value) and false otherwise
  public function isSetOperationRevision() : Bool {
    return this.__isset_operationRevision;
  }

  public function get_content() : StringMap< String> {
    return this.content;
  }

  public function set_content(content:StringMap< String>) : StringMap< String> {
    this.content = content;
    return this.content;
  }

  public function unsetContent() : Void {
    this.content = null;
  }

  // Returns true if field content is set (has been assigned a value) and false otherwise
  public function isSetContent() : Bool {
    return this.content != null;
  }

  public function get_push() : StringMap< String> {
    return this.push;
  }

  public function set_push(push:StringMap< String>) : StringMap< String> {
    this.push = push;
    return this.push;
  }

  public function unsetPush() : Void {
    this.push = null;
  }

  // Returns true if field push is set (has been assigned a value) and false otherwise
  public function isSetPush() : Bool {
    return this.push != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case ID_FIELD_ID:
      if (value == null) {
        unsetId();
      } else {
        this.id = value;
      }

    case TO_FIELD_ID:
      if (value == null) {
        unsetTo();
      } else {
        this.to = value;
      }

    case FROM__FIELD_ID:
      if (value == null) {
        unsetFrom_();
      } else {
        this.from_ = value;
      }

    case TOCHANNEL_FIELD_ID:
      if (value == null) {
        unsetToChannel();
      } else {
        this.toChannel = value;
      }

    case FROMCHANNEL_FIELD_ID:
      if (value == null) {
        unsetFromChannel();
      } else {
        this.fromChannel = value;
      }

    case EVENTTYPE_FIELD_ID:
      if (value == null) {
        unsetEventType();
      } else {
        this.eventType = value;
      }

    case CREATEDTIME_FIELD_ID:
      if (value == null) {
        unsetCreatedTime();
      } else {
        this.createdTime = value;
      }

    case OPERATIONREVISION_FIELD_ID:
      if (value == null) {
        unsetOperationRevision();
      } else {
        this.operationRevision = value;
      }

    case CONTENT_FIELD_ID:
      if (value == null) {
        unsetContent();
      } else {
        this.content = value;
      }

    case PUSH_FIELD_ID:
      if (value == null) {
        unsetPush();
      } else {
        this.push = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case ID_FIELD_ID:
      return this.id;
    case TO_FIELD_ID:
      return this.to;
    case FROM__FIELD_ID:
      return this.from_;
    case TOCHANNEL_FIELD_ID:
      return this.toChannel;
    case FROMCHANNEL_FIELD_ID:
      return this.fromChannel;
    case EVENTTYPE_FIELD_ID:
      return this.eventType;
    case CREATEDTIME_FIELD_ID:
      return this.createdTime;
    case OPERATIONREVISION_FIELD_ID:
      return this.operationRevision;
    case CONTENT_FIELD_ID:
      return this.content;
    case PUSH_FIELD_ID:
      return this.push;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case ID_FIELD_ID:
      return isSetId();
    case TO_FIELD_ID:
      return isSetTo();
    case FROM__FIELD_ID:
      return isSetFrom_();
    case TOCHANNEL_FIELD_ID:
      return isSetToChannel();
    case FROMCHANNEL_FIELD_ID:
      return isSetFromChannel();
    case EVENTTYPE_FIELD_ID:
      return isSetEventType();
    case CREATEDTIME_FIELD_ID:
      return isSetCreatedTime();
    case OPERATIONREVISION_FIELD_ID:
      return isSetOperationRevision();
    case CONTENT_FIELD_ID:
      return isSetContent();
    case PUSH_FIELD_ID:
      return isSetPush();
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
          case ID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.id = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case TO_FIELD_ID:
            if (field.type == TType.STRING) {
              this.to = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case FROM__FIELD_ID:
            if (field.type == TType.STRING) {
              this.from_ = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case TOCHANNEL_FIELD_ID:
            if (field.type == TType.STRING) {
              this.toChannel = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case FROMCHANNEL_FIELD_ID:
            if (field.type == TType.STRING) {
              this.fromChannel = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case EVENTTYPE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.eventType = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CREATEDTIME_FIELD_ID:
            if (field.type == TType.I64) {
              this.createdTime = iprot.readI64();
              this.__isset_createdTime = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case OPERATIONREVISION_FIELD_ID:
            if (field.type == TType.I64) {
              this.operationRevision = iprot.readI64();
              this.__isset_operationRevision = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CONTENT_FIELD_ID:
            if (field.type == TType.MAP) {
              {
                var _map197 = iprot.readMapBegin();
                this.content = new StringMap< String>();
                for( _i198 in 0 ... _map197.size)
                {
                  var _key199 : String;
                  var _val200 : String;
                  _key199 = iprot.readString();
                  _val200 = iprot.readString();
                  this.content.set( _key199, _val200);
                }
                iprot.readMapEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PUSH_FIELD_ID:
            if (field.type == TType.MAP) {
              {
                var _map201 = iprot.readMapBegin();
                this.push = new StringMap< String>();
                for( _i202 in 0 ... _map201.size)
                {
                  var _key203 : String;
                  var _val204 : String;
                  _key203 = iprot.readString();
                  _val204 = iprot.readString();
                  this.push.set( _key203, _val204);
                }
                iprot.readMapEnd();
              }
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
      if (this.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(this.id);
        oprot.writeFieldEnd();
      }
      if (this.to != null) {
        oprot.writeFieldBegin(TO_FIELD_DESC);
        oprot.writeString(this.to);
        oprot.writeFieldEnd();
      }
      if (this.from_ != null) {
        oprot.writeFieldBegin(FROM__FIELD_DESC);
        oprot.writeString(this.from_);
        oprot.writeFieldEnd();
      }
      if (this.toChannel != null) {
        oprot.writeFieldBegin(TO_CHANNEL_FIELD_DESC);
        oprot.writeString(this.toChannel);
        oprot.writeFieldEnd();
      }
      if (this.fromChannel != null) {
        oprot.writeFieldBegin(FROM_CHANNEL_FIELD_DESC);
        oprot.writeString(this.fromChannel);
        oprot.writeFieldEnd();
      }
      if (this.eventType != null) {
        oprot.writeFieldBegin(EVENT_TYPE_FIELD_DESC);
        oprot.writeString(this.eventType);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
      oprot.writeI64(this.createdTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(OPERATION_REVISION_FIELD_DESC);
      oprot.writeI64(this.operationRevision);
      oprot.writeFieldEnd();
      if (this.content != null) {
        oprot.writeFieldBegin(CONTENT_FIELD_DESC);
        {
          var _sizeCounter206 : Int = 0;
          for( _key205 in this.content) {
            _sizeCounter206++;
          }
          oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, _sizeCounter206));
          for( elem207 in this.content.keys())
          {
            oprot.writeString(elem207);
            oprot.writeString(this.content.get(elem207));
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.push != null) {
        oprot.writeFieldBegin(PUSH_FIELD_DESC);
        {
          var _sizeCounter209 : Int = 0;
          for( _key208 in this.push) {
            _sizeCounter209++;
          }
          oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, _sizeCounter209));
          for( elem210 in this.push.keys())
          {
            oprot.writeString(elem210);
            oprot.writeString(this.push.get(elem210));
          }
          oprot.writeMapEnd();
        }
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
    var ret : String = "NotiCenterEventData(";
    var first : Bool = true;

    ret += "id:";
    if (this.id == null) {
      ret += "null";
    } else {
      ret += this.id;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "to:";
    if (this.to == null) {
      ret += "null";
    } else {
      ret += this.to;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "from_:";
    if (this.from_ == null) {
      ret += "null";
    } else {
      ret += this.from_;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "toChannel:";
    if (this.toChannel == null) {
      ret += "null";
    } else {
      ret += this.toChannel;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "fromChannel:";
    if (this.fromChannel == null) {
      ret += "null";
    } else {
      ret += this.fromChannel;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "eventType:";
    if (this.eventType == null) {
      ret += "null";
    } else {
      ret += this.eventType;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "createdTime:";
    ret += this.createdTime;
    first = false;
    if (!first) ret +=  ", ";
    ret += "operationRevision:";
    ret += this.operationRevision;
    first = false;
    if (!first) ret +=  ", ";
    ret += "content:";
    if (this.content == null) {
      ret += "null";
    } else {
      ret += this.content;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "push:";
    if (this.push == null) {
      ret += "null";
    } else {
      ret += this.push;
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
