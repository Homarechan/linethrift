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


class LookupRoomMembers_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("lookupRoomMembers_args"); };
  static var ROOM_ID_FIELD_DESC = { new TField("roomId", TType.STRING, 1); };
  static var MIDS_FIELD_DESC = { new TField("mids", TType.LIST, 2); };

  @:isVar
  public var roomId(get,set) : String;
  @:isVar
  public var mids(get,set) : List< String>;

  inline static var ROOMID_FIELD_ID : Int = 1;
  inline static var MIDS_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_roomId() : String {
    return this.roomId;
  }

  public function set_roomId(roomId:String) : String {
    this.roomId = roomId;
    return this.roomId;
  }

  public function unsetRoomId() : Void {
    this.roomId = null;
  }

  // Returns true if field roomId is set (has been assigned a value) and false otherwise
  public function isSetRoomId() : Bool {
    return this.roomId != null;
  }

  public function get_mids() : List< String> {
    return this.mids;
  }

  public function set_mids(mids:List< String>) : List< String> {
    this.mids = mids;
    return this.mids;
  }

  public function unsetMids() : Void {
    this.mids = null;
  }

  // Returns true if field mids is set (has been assigned a value) and false otherwise
  public function isSetMids() : Bool {
    return this.mids != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case ROOMID_FIELD_ID:
      if (value == null) {
        unsetRoomId();
      } else {
        this.roomId = value;
      }

    case MIDS_FIELD_ID:
      if (value == null) {
        unsetMids();
      } else {
        this.mids = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case ROOMID_FIELD_ID:
      return this.roomId;
    case MIDS_FIELD_ID:
      return this.mids;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case ROOMID_FIELD_ID:
      return isSetRoomId();
    case MIDS_FIELD_ID:
      return isSetMids();
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
          case ROOMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.roomId = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case MIDS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list1432 = iprot.readListBegin();
                this.mids = new List< String>();
                for( _i1433 in 0 ... _list1432.size)
                {
                  var _elem1434 : String;
                  _elem1434 = iprot.readString();
                  this.mids.add(_elem1434);
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
      if (this.roomId != null) {
        oprot.writeFieldBegin(ROOM_ID_FIELD_DESC);
        oprot.writeString(this.roomId);
        oprot.writeFieldEnd();
      }
      if (this.mids != null) {
        oprot.writeFieldBegin(MIDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.mids.length));
          for( elem1435 in this.mids)
          {
            oprot.writeString(elem1435);
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
    var ret : String = "lookupRoomMembers_args(";
    var first : Bool = true;

    ret += "roomId:";
    if (this.roomId == null) {
      ret += "null";
    } else {
      ret += this.roomId;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "mids:";
    if (this.mids == null) {
      ret += "null";
    } else {
      ret += this.mids;
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

