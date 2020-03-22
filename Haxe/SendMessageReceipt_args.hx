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


class SendMessageReceipt_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("sendMessageReceipt_args"); };
  static var SEQ_FIELD_DESC = { new TField("seq", TType.I32, 1); };
  static var CONSUMER_FIELD_DESC = { new TField("consumer", TType.STRING, 2); };
  static var MESSAGE_IDS_FIELD_DESC = { new TField("messageIds", TType.LIST, 3); };

  @:isVar
  public var seq(get,set) : haxe.Int32;
  @:isVar
  public var consumer(get,set) : String;
  @:isVar
  public var messageIds(get,set) : List< String>;

  inline static var SEQ_FIELD_ID : Int = 1;
  inline static var CONSUMER_FIELD_ID : Int = 2;
  inline static var MESSAGEIDS_FIELD_ID : Int = 3;

  private var __isset_seq : Bool = false;

  public function new() {
  }

  public function get_seq() : haxe.Int32 {
    return this.seq;
  }

  public function set_seq(seq:haxe.Int32) : haxe.Int32 {
    this.seq = seq;
    this.__isset_seq = true;
    return this.seq;
  }

  public function unsetSeq() : Void {
    this.__isset_seq = false;
  }

  // Returns true if field seq is set (has been assigned a value) and false otherwise
  public function isSetSeq() : Bool {
    return this.__isset_seq;
  }

  public function get_consumer() : String {
    return this.consumer;
  }

  public function set_consumer(consumer:String) : String {
    this.consumer = consumer;
    return this.consumer;
  }

  public function unsetConsumer() : Void {
    this.consumer = null;
  }

  // Returns true if field consumer is set (has been assigned a value) and false otherwise
  public function isSetConsumer() : Bool {
    return this.consumer != null;
  }

  public function get_messageIds() : List< String> {
    return this.messageIds;
  }

  public function set_messageIds(messageIds:List< String>) : List< String> {
    this.messageIds = messageIds;
    return this.messageIds;
  }

  public function unsetMessageIds() : Void {
    this.messageIds = null;
  }

  // Returns true if field messageIds is set (has been assigned a value) and false otherwise
  public function isSetMessageIds() : Bool {
    return this.messageIds != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SEQ_FIELD_ID:
      if (value == null) {
        unsetSeq();
      } else {
        this.seq = value;
      }

    case CONSUMER_FIELD_ID:
      if (value == null) {
        unsetConsumer();
      } else {
        this.consumer = value;
      }

    case MESSAGEIDS_FIELD_ID:
      if (value == null) {
        unsetMessageIds();
      } else {
        this.messageIds = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SEQ_FIELD_ID:
      return this.seq;
    case CONSUMER_FIELD_ID:
      return this.consumer;
    case MESSAGEIDS_FIELD_ID:
      return this.messageIds;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SEQ_FIELD_ID:
      return isSetSeq();
    case CONSUMER_FIELD_ID:
      return isSetConsumer();
    case MESSAGEIDS_FIELD_ID:
      return isSetMessageIds();
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
          case SEQ_FIELD_ID:
            if (field.type == TType.I32) {
              this.seq = iprot.readI32();
              this.__isset_seq = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CONSUMER_FIELD_ID:
            if (field.type == TType.STRING) {
              this.consumer = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case MESSAGEIDS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list1241 = iprot.readListBegin();
                this.messageIds = new List< String>();
                for( _i1242 in 0 ... _list1241.size)
                {
                  var _elem1243 : String;
                  _elem1243 = iprot.readString();
                  this.messageIds.add(_elem1243);
                }
                iprot.readListEnd();
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
      oprot.writeFieldBegin(SEQ_FIELD_DESC);
      oprot.writeI32(this.seq);
      oprot.writeFieldEnd();
      if (this.consumer != null) {
        oprot.writeFieldBegin(CONSUMER_FIELD_DESC);
        oprot.writeString(this.consumer);
        oprot.writeFieldEnd();
      }
      if (this.messageIds != null) {
        oprot.writeFieldBegin(MESSAGE_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.messageIds.length));
          for( elem1244 in this.messageIds)
          {
            oprot.writeString(elem1244);
          }
          oprot.writeListEnd();
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
    var ret : String = "sendMessageReceipt_args(";
    var first : Bool = true;

    ret += "seq:";
    ret += this.seq;
    first = false;
    if (!first) ret +=  ", ";
    ret += "consumer:";
    if (this.consumer == null) {
      ret += "null";
    } else {
      ret += this.consumer;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "messageIds:";
    if (this.messageIds == null) {
      ret += "null";
    } else {
      ret += this.messageIds;
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

