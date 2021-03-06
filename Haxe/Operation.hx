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


class Operation implements TBase {
  
  static var STRUCT_DESC = { new TStruct("Operation"); };
  static var REVISION_FIELD_DESC = { new TField("revision", TType.I64, 1); };
  static var CREATED_TIME_FIELD_DESC = { new TField("createdTime", TType.I64, 2); };
  static var TYPE_FIELD_DESC = { new TField("type", TType.I32, 3); };
  static var REQ_SEQ_FIELD_DESC = { new TField("reqSeq", TType.I32, 4); };
  static var CHECKSUM_FIELD_DESC = { new TField("checksum", TType.STRING, 5); };
  static var STATUS_FIELD_DESC = { new TField("status", TType.I32, 7); };
  static var PARAM1_FIELD_DESC = { new TField("param1", TType.STRING, 10); };
  static var PARAM2_FIELD_DESC = { new TField("param2", TType.STRING, 11); };
  static var PARAM3_FIELD_DESC = { new TField("param3", TType.STRING, 12); };
  static var MESSAGE_FIELD_DESC = { new TField("message", TType.STRUCT, 20); };

  @:isVar
  public var revision(get,set) : haxe.Int64;
  @:isVar
  public var createdTime(get,set) : haxe.Int64;
  @:isVar
  public var type(get,set) : Int;
  @:isVar
  public var reqSeq(get,set) : haxe.Int32;
  @:isVar
  public var checksum(get,set) : String;
  @:isVar
  public var status(get,set) : Int;
  @:isVar
  public var param1(get,set) : String;
  @:isVar
  public var param2(get,set) : String;
  @:isVar
  public var param3(get,set) : String;
  @:isVar
  public var message(get,set) : Message;

  inline static var REVISION_FIELD_ID : Int = 1;
  inline static var CREATEDTIME_FIELD_ID : Int = 2;
  inline static var TYPE_FIELD_ID : Int = 3;
  inline static var REQSEQ_FIELD_ID : Int = 4;
  inline static var CHECKSUM_FIELD_ID : Int = 5;
  inline static var STATUS_FIELD_ID : Int = 7;
  inline static var PARAM1_FIELD_ID : Int = 10;
  inline static var PARAM2_FIELD_ID : Int = 11;
  inline static var PARAM3_FIELD_ID : Int = 12;
  inline static var MESSAGE_FIELD_ID : Int = 20;

  private var __isset_revision : Bool = false;
  private var __isset_createdTime : Bool = false;
  private var __isset_type : Bool = false;
  private var __isset_reqSeq : Bool = false;
  private var __isset_status : Bool = false;

  public function new() {
  }

  public function get_revision() : haxe.Int64 {
    return this.revision;
  }

  public function set_revision(revision:haxe.Int64) : haxe.Int64 {
    this.revision = revision;
    this.__isset_revision = true;
    return this.revision;
  }

  public function unsetRevision() : Void {
    this.__isset_revision = false;
  }

  // Returns true if field revision is set (has been assigned a value) and false otherwise
  public function isSetRevision() : Bool {
    return this.__isset_revision;
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

  public function get_type() : Int {
    return this.type;
  }

  public function set_type(type:Int) : Int {
    this.type = type;
    this.__isset_type = true;
    return this.type;
  }

  public function unsetType() : Void {
    this.__isset_type = false;
  }

  // Returns true if field type is set (has been assigned a value) and false otherwise
  public function isSetType() : Bool {
    return this.__isset_type;
  }

  public function get_reqSeq() : haxe.Int32 {
    return this.reqSeq;
  }

  public function set_reqSeq(reqSeq:haxe.Int32) : haxe.Int32 {
    this.reqSeq = reqSeq;
    this.__isset_reqSeq = true;
    return this.reqSeq;
  }

  public function unsetReqSeq() : Void {
    this.__isset_reqSeq = false;
  }

  // Returns true if field reqSeq is set (has been assigned a value) and false otherwise
  public function isSetReqSeq() : Bool {
    return this.__isset_reqSeq;
  }

  public function get_checksum() : String {
    return this.checksum;
  }

  public function set_checksum(checksum:String) : String {
    this.checksum = checksum;
    return this.checksum;
  }

  public function unsetChecksum() : Void {
    this.checksum = null;
  }

  // Returns true if field checksum is set (has been assigned a value) and false otherwise
  public function isSetChecksum() : Bool {
    return this.checksum != null;
  }

  public function get_status() : Int {
    return this.status;
  }

  public function set_status(status:Int) : Int {
    this.status = status;
    this.__isset_status = true;
    return this.status;
  }

  public function unsetStatus() : Void {
    this.__isset_status = false;
  }

  // Returns true if field status is set (has been assigned a value) and false otherwise
  public function isSetStatus() : Bool {
    return this.__isset_status;
  }

  public function get_param1() : String {
    return this.param1;
  }

  public function set_param1(param1:String) : String {
    this.param1 = param1;
    return this.param1;
  }

  public function unsetParam1() : Void {
    this.param1 = null;
  }

  // Returns true if field param1 is set (has been assigned a value) and false otherwise
  public function isSetParam1() : Bool {
    return this.param1 != null;
  }

  public function get_param2() : String {
    return this.param2;
  }

  public function set_param2(param2:String) : String {
    this.param2 = param2;
    return this.param2;
  }

  public function unsetParam2() : Void {
    this.param2 = null;
  }

  // Returns true if field param2 is set (has been assigned a value) and false otherwise
  public function isSetParam2() : Bool {
    return this.param2 != null;
  }

  public function get_param3() : String {
    return this.param3;
  }

  public function set_param3(param3:String) : String {
    this.param3 = param3;
    return this.param3;
  }

  public function unsetParam3() : Void {
    this.param3 = null;
  }

  // Returns true if field param3 is set (has been assigned a value) and false otherwise
  public function isSetParam3() : Bool {
    return this.param3 != null;
  }

  public function get_message() : Message {
    return this.message;
  }

  public function set_message(message:Message) : Message {
    this.message = message;
    return this.message;
  }

  public function unsetMessage() : Void {
    this.message = null;
  }

  // Returns true if field message is set (has been assigned a value) and false otherwise
  public function isSetMessage() : Bool {
    return this.message != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case REVISION_FIELD_ID:
      if (value == null) {
        unsetRevision();
      } else {
        this.revision = value;
      }

    case CREATEDTIME_FIELD_ID:
      if (value == null) {
        unsetCreatedTime();
      } else {
        this.createdTime = value;
      }

    case TYPE_FIELD_ID:
      if (value == null) {
        unsetType();
      } else {
        this.type = value;
      }

    case REQSEQ_FIELD_ID:
      if (value == null) {
        unsetReqSeq();
      } else {
        this.reqSeq = value;
      }

    case CHECKSUM_FIELD_ID:
      if (value == null) {
        unsetChecksum();
      } else {
        this.checksum = value;
      }

    case STATUS_FIELD_ID:
      if (value == null) {
        unsetStatus();
      } else {
        this.status = value;
      }

    case PARAM1_FIELD_ID:
      if (value == null) {
        unsetParam1();
      } else {
        this.param1 = value;
      }

    case PARAM2_FIELD_ID:
      if (value == null) {
        unsetParam2();
      } else {
        this.param2 = value;
      }

    case PARAM3_FIELD_ID:
      if (value == null) {
        unsetParam3();
      } else {
        this.param3 = value;
      }

    case MESSAGE_FIELD_ID:
      if (value == null) {
        unsetMessage();
      } else {
        this.message = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case REVISION_FIELD_ID:
      return this.revision;
    case CREATEDTIME_FIELD_ID:
      return this.createdTime;
    case TYPE_FIELD_ID:
      return this.type;
    case REQSEQ_FIELD_ID:
      return this.reqSeq;
    case CHECKSUM_FIELD_ID:
      return this.checksum;
    case STATUS_FIELD_ID:
      return this.status;
    case PARAM1_FIELD_ID:
      return this.param1;
    case PARAM2_FIELD_ID:
      return this.param2;
    case PARAM3_FIELD_ID:
      return this.param3;
    case MESSAGE_FIELD_ID:
      return this.message;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case REVISION_FIELD_ID:
      return isSetRevision();
    case CREATEDTIME_FIELD_ID:
      return isSetCreatedTime();
    case TYPE_FIELD_ID:
      return isSetType();
    case REQSEQ_FIELD_ID:
      return isSetReqSeq();
    case CHECKSUM_FIELD_ID:
      return isSetChecksum();
    case STATUS_FIELD_ID:
      return isSetStatus();
    case PARAM1_FIELD_ID:
      return isSetParam1();
    case PARAM2_FIELD_ID:
      return isSetParam2();
    case PARAM3_FIELD_ID:
      return isSetParam3();
    case MESSAGE_FIELD_ID:
      return isSetMessage();
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
          case REVISION_FIELD_ID:
            if (field.type == TType.I64) {
              this.revision = iprot.readI64();
              this.__isset_revision = true;
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
          case TYPE_FIELD_ID:
            if (field.type == TType.I32) {
              this.type = iprot.readI32();
              this.__isset_type = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case REQSEQ_FIELD_ID:
            if (field.type == TType.I32) {
              this.reqSeq = iprot.readI32();
              this.__isset_reqSeq = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CHECKSUM_FIELD_ID:
            if (field.type == TType.STRING) {
              this.checksum = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case STATUS_FIELD_ID:
            if (field.type == TType.I32) {
              this.status = iprot.readI32();
              this.__isset_status = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PARAM1_FIELD_ID:
            if (field.type == TType.STRING) {
              this.param1 = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PARAM2_FIELD_ID:
            if (field.type == TType.STRING) {
              this.param2 = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PARAM3_FIELD_ID:
            if (field.type == TType.STRING) {
              this.param3 = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case MESSAGE_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.message = new Message();
              this.message.read(iprot);
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
      oprot.writeFieldBegin(REVISION_FIELD_DESC);
      oprot.writeI64(this.revision);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
      oprot.writeI64(this.createdTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeI32(this.type);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(REQ_SEQ_FIELD_DESC);
      oprot.writeI32(this.reqSeq);
      oprot.writeFieldEnd();
      if (this.checksum != null) {
        oprot.writeFieldBegin(CHECKSUM_FIELD_DESC);
        oprot.writeString(this.checksum);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeI32(this.status);
      oprot.writeFieldEnd();
      if (this.param1 != null) {
        oprot.writeFieldBegin(PARAM1_FIELD_DESC);
        oprot.writeString(this.param1);
        oprot.writeFieldEnd();
      }
      if (this.param2 != null) {
        oprot.writeFieldBegin(PARAM2_FIELD_DESC);
        oprot.writeString(this.param2);
        oprot.writeFieldEnd();
      }
      if (this.param3 != null) {
        oprot.writeFieldBegin(PARAM3_FIELD_DESC);
        oprot.writeString(this.param3);
        oprot.writeFieldEnd();
      }
      if (this.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        this.message.write(oprot);
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
    var ret : String = "Operation(";
    var first : Bool = true;

    ret += "revision:";
    ret += this.revision;
    first = false;
    if (!first) ret +=  ", ";
    ret += "createdTime:";
    ret += this.createdTime;
    first = false;
    if (!first) ret +=  ", ";
    ret += "type:";
    var type_name : String = .OpType.VALUES_TO_NAMES[this.type];
    if (type_name != null) {
      ret += type_name;
      ret += " (";
    }
    ret += this.type;
    if (type_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "reqSeq:";
    ret += this.reqSeq;
    first = false;
    if (!first) ret +=  ", ";
    ret += "checksum:";
    if (this.checksum == null) {
      ret += "null";
    } else {
      ret += this.checksum;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "status:";
    var status_name : String = .OpStatus.VALUES_TO_NAMES[this.status];
    if (status_name != null) {
      ret += status_name;
      ret += " (";
    }
    ret += this.status;
    if (status_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "param1:";
    if (this.param1 == null) {
      ret += "null";
    } else {
      ret += this.param1;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "param2:";
    if (this.param2 == null) {
      ret += "null";
    } else {
      ret += this.param2;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "param3:";
    if (this.param3 == null) {
      ret += "null";
    } else {
      ret += this.param3;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "message:";
    if (this.message == null) {
      ret += "null";
    } else {
      ret += this.message;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetType() && !.OpType.VALID_VALUES.contains(type)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'type' has been assigned the invalid value " + type);
    }
    if (isSetStatus() && !.OpStatus.VALID_VALUES.contains(status)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'status' has been assigned the invalid value " + status);
    }
  }

}

