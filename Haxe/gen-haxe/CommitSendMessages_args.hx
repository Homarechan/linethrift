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


class CommitSendMessages_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("commitSendMessages_args"); };
  static var SEQ_FIELD_DESC = { new TField("seq", TType.I32, 1); };
  static var MESSAGE_IDS_FIELD_DESC = { new TField("messageIds", TType.LIST, 2); };
  static var RECEIVER_MIDS_FIELD_DESC = { new TField("receiverMids", TType.LIST, 3); };

  @:isVar
  public var seq(get,set) : haxe.Int32;
  @:isVar
  public var messageIds(get,set) : List< String>;
  @:isVar
  public var receiverMids(get,set) : List< String>;

  inline static var SEQ_FIELD_ID : Int = 1;
  inline static var MESSAGEIDS_FIELD_ID : Int = 2;
  inline static var RECEIVERMIDS_FIELD_ID : Int = 3;

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

  public function get_receiverMids() : List< String> {
    return this.receiverMids;
  }

  public function set_receiverMids(receiverMids:List< String>) : List< String> {
    this.receiverMids = receiverMids;
    return this.receiverMids;
  }

  public function unsetReceiverMids() : Void {
    this.receiverMids = null;
  }

  // Returns true if field receiverMids is set (has been assigned a value) and false otherwise
  public function isSetReceiverMids() : Bool {
    return this.receiverMids != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SEQ_FIELD_ID:
      if (value == null) {
        unsetSeq();
      } else {
        this.seq = value;
      }

    case MESSAGEIDS_FIELD_ID:
      if (value == null) {
        unsetMessageIds();
      } else {
        this.messageIds = value;
      }

    case RECEIVERMIDS_FIELD_ID:
      if (value == null) {
        unsetReceiverMids();
      } else {
        this.receiverMids = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SEQ_FIELD_ID:
      return this.seq;
    case MESSAGEIDS_FIELD_ID:
      return this.messageIds;
    case RECEIVERMIDS_FIELD_ID:
      return this.receiverMids;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SEQ_FIELD_ID:
      return isSetSeq();
    case MESSAGEIDS_FIELD_ID:
      return isSetMessageIds();
    case RECEIVERMIDS_FIELD_ID:
      return isSetReceiverMids();
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
          case MESSAGEIDS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list881 = iprot.readListBegin();
                this.messageIds = new List< String>();
                for( _i882 in 0 ... _list881.size)
                {
                  var _elem883 : String;
                  _elem883 = iprot.readString();
                  this.messageIds.add(_elem883);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case RECEIVERMIDS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list884 = iprot.readListBegin();
                this.receiverMids = new List< String>();
                for( _i885 in 0 ... _list884.size)
                {
                  var _elem886 : String;
                  _elem886 = iprot.readString();
                  this.receiverMids.add(_elem886);
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
      if (this.messageIds != null) {
        oprot.writeFieldBegin(MESSAGE_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.messageIds.length));
          for( elem887 in this.messageIds)
          {
            oprot.writeString(elem887);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.receiverMids != null) {
        oprot.writeFieldBegin(RECEIVER_MIDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.receiverMids.length));
          for( elem888 in this.receiverMids)
          {
            oprot.writeString(elem888);
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
    var ret : String = "commitSendMessages_args(";
    var first : Bool = true;

    ret += "seq:";
    ret += this.seq;
    first = false;
    if (!first) ret +=  ", ";
    ret += "messageIds:";
    if (this.messageIds == null) {
      ret += "null";
    } else {
      ret += this.messageIds;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "receiverMids:";
    if (this.receiverMids == null) {
      ret += "null";
    } else {
      ret += this.receiverMids;
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

