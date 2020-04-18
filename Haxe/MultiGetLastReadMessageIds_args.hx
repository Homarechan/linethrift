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


class MultiGetLastReadMessageIds_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("multiGetLastReadMessageIds_args"); };
  static var CHAT_IDS_FIELD_DESC = { new TField("chatIds", TType.LIST, 2); };

  @:isVar
  public var chatIds(get,set) : List< String>;

  inline static var CHATIDS_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_chatIds() : List< String> {
    return this.chatIds;
  }

  public function set_chatIds(chatIds:List< String>) : List< String> {
    this.chatIds = chatIds;
    return this.chatIds;
  }

  public function unsetChatIds() : Void {
    this.chatIds = null;
  }

  // Returns true if field chatIds is set (has been assigned a value) and false otherwise
  public function isSetChatIds() : Bool {
    return this.chatIds != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case CHATIDS_FIELD_ID:
      if (value == null) {
        unsetChatIds();
      } else {
        this.chatIds = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case CHATIDS_FIELD_ID:
      return this.chatIds;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case CHATIDS_FIELD_ID:
      return isSetChatIds();
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
          case CHATIDS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list815 = iprot.readListBegin();
                this.chatIds = new List< String>();
                for( _i816 in 0 ... _list815.size)
                {
                  var _elem817 : String;
                  _elem817 = iprot.readString();
                  this.chatIds.add(_elem817);
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
      if (this.chatIds != null) {
        oprot.writeFieldBegin(CHAT_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.chatIds.length));
          for( elem818 in this.chatIds)
          {
            oprot.writeString(elem818);
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
    var ret : String = "multiGetLastReadMessageIds_args(";
    var first : Bool = true;

    ret += "chatIds:";
    if (this.chatIds == null) {
      ret += "null";
    } else {
      ret += this.chatIds;
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

