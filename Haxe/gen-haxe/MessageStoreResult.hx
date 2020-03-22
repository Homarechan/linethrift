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


class MessageStoreResult implements TBase {
  
  static var STRUCT_DESC = { new TStruct("MessageStoreResult"); };
  static var REQUEST_ID_FIELD_DESC = { new TField("requestId", TType.STRING, 1); };
  static var MESSAGE_IDS_FIELD_DESC = { new TField("messageIds", TType.LIST, 2); };

  @:isVar
  public var requestId(get,set) : String;
  @:isVar
  public var messageIds(get,set) : List< String>;

  inline static var REQUESTID_FIELD_ID : Int = 1;
  inline static var MESSAGEIDS_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_requestId() : String {
    return this.requestId;
  }

  public function set_requestId(requestId:String) : String {
    this.requestId = requestId;
    return this.requestId;
  }

  public function unsetRequestId() : Void {
    this.requestId = null;
  }

  // Returns true if field requestId is set (has been assigned a value) and false otherwise
  public function isSetRequestId() : Bool {
    return this.requestId != null;
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
    case REQUESTID_FIELD_ID:
      if (value == null) {
        unsetRequestId();
      } else {
        this.requestId = value;
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
    case REQUESTID_FIELD_ID:
      return this.requestId;
    case MESSAGEIDS_FIELD_ID:
      return this.messageIds;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case REQUESTID_FIELD_ID:
      return isSetRequestId();
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
          case REQUESTID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.requestId = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case MESSAGEIDS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list182 = iprot.readListBegin();
                this.messageIds = new List< String>();
                for( _i183 in 0 ... _list182.size)
                {
                  var _elem184 : String;
                  _elem184 = iprot.readString();
                  this.messageIds.add(_elem184);
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
      if (this.requestId != null) {
        oprot.writeFieldBegin(REQUEST_ID_FIELD_DESC);
        oprot.writeString(this.requestId);
        oprot.writeFieldEnd();
      }
      if (this.messageIds != null) {
        oprot.writeFieldBegin(MESSAGE_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.messageIds.length));
          for( elem185 in this.messageIds)
          {
            oprot.writeString(elem185);
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
    var ret : String = "MessageStoreResult(";
    var first : Bool = true;

    ret += "requestId:";
    if (this.requestId == null) {
      ret += "null";
    } else {
      ret += this.requestId;
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

