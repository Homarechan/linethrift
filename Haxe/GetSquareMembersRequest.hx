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


class GetSquareMembersRequest implements TBase {
  
  static var STRUCT_DESC = { new TStruct("GetSquareMembersRequest"); };
  static var MIDS_FIELD_DESC = { new TField("mids", TType.SET, 2); };

  @:isVar
  public var mids(get,set) : StringSet;

  inline static var MIDS_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_mids() : StringSet {
    return this.mids;
  }

  public function set_mids(mids:StringSet) : StringSet {
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
    case MIDS_FIELD_ID:
      return this.mids;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
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
          case MIDS_FIELD_ID:
            if (field.type == TType.SET) {
              {
                var _set399 = iprot.readSetBegin();
                this.mids = new StringSet();
                for( _i400 in 0 ... _set399.size)
                {
                  var _elem401 : String;
                  _elem401 = iprot.readString();
                  this.mids.add(_elem401);
                }
                iprot.readSetEnd();
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
      if (this.mids != null) {
        oprot.writeFieldBegin(MIDS_FIELD_DESC);
        {
          oprot.writeSetBegin(new TSet(TType.STRING, this.mids.size));
          for( elem402 in this.mids.toArray())
          {
            oprot.writeString(elem402);
          }
          oprot.writeSetEnd();
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
    var ret : String = "GetSquareMembersRequest(";
    var first : Bool = true;

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

