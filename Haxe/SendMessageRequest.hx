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


class SendMessageRequest implements TBase {
  
  static var STRUCT_DESC = { new TStruct("SendMessageRequest"); };
  static var REQ_SEQ_FIELD_DESC = { new TField("reqSeq", TType.I32, 1); };
  static var SQUARE_CHAT_MID_FIELD_DESC = { new TField("squareChatMid", TType.STRING, 2); };
  static var SQUARE_MESSAGE_FIELD_DESC = { new TField("squareMessage", TType.STRUCT, 3); };

  @:isVar
  public var reqSeq(get,set) : haxe.Int32;
  @:isVar
  public var squareChatMid(get,set) : String;
  @:isVar
  public var squareMessage(get,set) : SquareMessage;

  inline static var REQSEQ_FIELD_ID : Int = 1;
  inline static var SQUARECHATMID_FIELD_ID : Int = 2;
  inline static var SQUAREMESSAGE_FIELD_ID : Int = 3;

  private var __isset_reqSeq : Bool = false;

  public function new() {
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

  public function get_squareChatMid() : String {
    return this.squareChatMid;
  }

  public function set_squareChatMid(squareChatMid:String) : String {
    this.squareChatMid = squareChatMid;
    return this.squareChatMid;
  }

  public function unsetSquareChatMid() : Void {
    this.squareChatMid = null;
  }

  // Returns true if field squareChatMid is set (has been assigned a value) and false otherwise
  public function isSetSquareChatMid() : Bool {
    return this.squareChatMid != null;
  }

  public function get_squareMessage() : SquareMessage {
    return this.squareMessage;
  }

  public function set_squareMessage(squareMessage:SquareMessage) : SquareMessage {
    this.squareMessage = squareMessage;
    return this.squareMessage;
  }

  public function unsetSquareMessage() : Void {
    this.squareMessage = null;
  }

  // Returns true if field squareMessage is set (has been assigned a value) and false otherwise
  public function isSetSquareMessage() : Bool {
    return this.squareMessage != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      if (value == null) {
        unsetReqSeq();
      } else {
        this.reqSeq = value;
      }

    case SQUARECHATMID_FIELD_ID:
      if (value == null) {
        unsetSquareChatMid();
      } else {
        this.squareChatMid = value;
      }

    case SQUAREMESSAGE_FIELD_ID:
      if (value == null) {
        unsetSquareMessage();
      } else {
        this.squareMessage = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      return this.reqSeq;
    case SQUARECHATMID_FIELD_ID:
      return this.squareChatMid;
    case SQUAREMESSAGE_FIELD_ID:
      return this.squareMessage;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      return isSetReqSeq();
    case SQUARECHATMID_FIELD_ID:
      return isSetSquareChatMid();
    case SQUAREMESSAGE_FIELD_ID:
      return isSetSquareMessage();
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
          case REQSEQ_FIELD_ID:
            if (field.type == TType.I32) {
              this.reqSeq = iprot.readI32();
              this.__isset_reqSeq = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SQUARECHATMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.squareChatMid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SQUAREMESSAGE_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.squareMessage = new SquareMessage();
              this.squareMessage.read(iprot);
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
      oprot.writeFieldBegin(REQ_SEQ_FIELD_DESC);
      oprot.writeI32(this.reqSeq);
      oprot.writeFieldEnd();
      if (this.squareChatMid != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
        oprot.writeString(this.squareChatMid);
        oprot.writeFieldEnd();
      }
      if (this.squareMessage != null) {
        oprot.writeFieldBegin(SQUARE_MESSAGE_FIELD_DESC);
        this.squareMessage.write(oprot);
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
    var ret : String = "SendMessageRequest(";
    var first : Bool = true;

    ret += "reqSeq:";
    ret += this.reqSeq;
    first = false;
    if (!first) ret +=  ", ";
    ret += "squareChatMid:";
    if (this.squareChatMid == null) {
      ret += "null";
    } else {
      ret += this.squareChatMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "squareMessage:";
    if (this.squareMessage == null) {
      ret += "null";
    } else {
      ret += this.squareMessage;
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

