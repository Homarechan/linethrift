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


class NotifyBuddyOnAir_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("notifyBuddyOnAir_args"); };
  static var SEQ_FIELD_DESC = { new TField("seq", TType.I32, 1); };
  static var RECEIVER_MIDS_FIELD_DESC = { new TField("receiverMids", TType.LIST, 2); };

  @:isVar
  public var seq(get,set) : haxe.Int32;
  @:isVar
  public var receiverMids(get,set) : List< String>;

  inline static var SEQ_FIELD_ID : Int = 1;
  inline static var RECEIVERMIDS_FIELD_ID : Int = 2;

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
          case RECEIVERMIDS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list1136 = iprot.readListBegin();
                this.receiverMids = new List< String>();
                for( _i1137 in 0 ... _list1136.size)
                {
                  var _elem1138 : String;
                  _elem1138 = iprot.readString();
                  this.receiverMids.add(_elem1138);
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
      if (this.receiverMids != null) {
        oprot.writeFieldBegin(RECEIVER_MIDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.receiverMids.length));
          for( elem1139 in this.receiverMids)
          {
            oprot.writeString(elem1139);
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
    var ret : String = "notifyBuddyOnAir_args(";
    var first : Bool = true;

    ret += "seq:";
    ret += this.seq;
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

