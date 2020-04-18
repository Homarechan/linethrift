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


class GetReverseCompactContacts_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("getReverseCompactContacts_args"); };
  static var IDS_FIELD_DESC = { new TField("ids", TType.LIST, 1); };

  @:isVar
  public var ids(get,set) : List< String>;

  inline static var IDS_FIELD_ID : Int = 1;


  public function new() {
  }

  public function get_ids() : List< String> {
    return this.ids;
  }

  public function set_ids(ids:List< String>) : List< String> {
    this.ids = ids;
    return this.ids;
  }

  public function unsetIds() : Void {
    this.ids = null;
  }

  // Returns true if field ids is set (has been assigned a value) and false otherwise
  public function isSetIds() : Bool {
    return this.ids != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case IDS_FIELD_ID:
      if (value == null) {
        unsetIds();
      } else {
        this.ids = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case IDS_FIELD_ID:
      return this.ids;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case IDS_FIELD_ID:
      return isSetIds();
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
          case IDS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list1406 = iprot.readListBegin();
                this.ids = new List< String>();
                for( _i1407 in 0 ... _list1406.size)
                {
                  var _elem1408 : String;
                  _elem1408 = iprot.readString();
                  this.ids.add(_elem1408);
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
      if (this.ids != null) {
        oprot.writeFieldBegin(IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.ids.length));
          for( elem1409 in this.ids)
          {
            oprot.writeString(elem1409);
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
    var ret : String = "getReverseCompactContacts_args(";
    var first : Bool = true;

    ret += "ids:";
    if (this.ids == null) {
      ret += "null";
    } else {
      ret += this.ids;
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

