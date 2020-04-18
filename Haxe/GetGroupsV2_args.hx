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


class GetGroupsV2_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("getGroupsV2_args"); };
  static var GROUP_IDS_FIELD_DESC = { new TField("groupIds", TType.LIST, 2); };

  @:isVar
  public var groupIds(get,set) : List< String>;

  inline static var GROUPIDS_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_groupIds() : List< String> {
    return this.groupIds;
  }

  public function set_groupIds(groupIds:List< String>) : List< String> {
    this.groupIds = groupIds;
    return this.groupIds;
  }

  public function unsetGroupIds() : Void {
    this.groupIds = null;
  }

  // Returns true if field groupIds is set (has been assigned a value) and false otherwise
  public function isSetGroupIds() : Bool {
    return this.groupIds != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case GROUPIDS_FIELD_ID:
      if (value == null) {
        unsetGroupIds();
      } else {
        this.groupIds = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case GROUPIDS_FIELD_ID:
      return this.groupIds;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case GROUPIDS_FIELD_ID:
      return isSetGroupIds();
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
          case GROUPIDS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list1105 = iprot.readListBegin();
                this.groupIds = new List< String>();
                for( _i1106 in 0 ... _list1105.size)
                {
                  var _elem1107 : String;
                  _elem1107 = iprot.readString();
                  this.groupIds.add(_elem1107);
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
      if (this.groupIds != null) {
        oprot.writeFieldBegin(GROUP_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.groupIds.length));
          for( elem1108 in this.groupIds)
          {
            oprot.writeString(elem1108);
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
    var ret : String = "getGroupsV2_args(";
    var first : Bool = true;

    ret += "groupIds:";
    if (this.groupIds == null) {
      ret += "null";
    } else {
      ret += this.groupIds;
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

