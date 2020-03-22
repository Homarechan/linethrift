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


class KickoutFromGroup_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("kickoutFromGroup_args"); };
  static var REQ_SEQ_FIELD_DESC = { new TField("reqSeq", TType.I32, 1); };
  static var GROUP_ID_FIELD_DESC = { new TField("groupId", TType.STRING, 2); };
  static var CONTACT_IDS_FIELD_DESC = { new TField("contactIds", TType.LIST, 3); };

  @:isVar
  public var reqSeq(get,set) : haxe.Int32;
  @:isVar
  public var groupId(get,set) : String;
  @:isVar
  public var contactIds(get,set) : List< String>;

  inline static var REQSEQ_FIELD_ID : Int = 1;
  inline static var GROUPID_FIELD_ID : Int = 2;
  inline static var CONTACTIDS_FIELD_ID : Int = 3;

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

  public function get_groupId() : String {
    return this.groupId;
  }

  public function set_groupId(groupId:String) : String {
    this.groupId = groupId;
    return this.groupId;
  }

  public function unsetGroupId() : Void {
    this.groupId = null;
  }

  // Returns true if field groupId is set (has been assigned a value) and false otherwise
  public function isSetGroupId() : Bool {
    return this.groupId != null;
  }

  public function get_contactIds() : List< String> {
    return this.contactIds;
  }

  public function set_contactIds(contactIds:List< String>) : List< String> {
    this.contactIds = contactIds;
    return this.contactIds;
  }

  public function unsetContactIds() : Void {
    this.contactIds = null;
  }

  // Returns true if field contactIds is set (has been assigned a value) and false otherwise
  public function isSetContactIds() : Bool {
    return this.contactIds != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      if (value == null) {
        unsetReqSeq();
      } else {
        this.reqSeq = value;
      }

    case GROUPID_FIELD_ID:
      if (value == null) {
        unsetGroupId();
      } else {
        this.groupId = value;
      }

    case CONTACTIDS_FIELD_ID:
      if (value == null) {
        unsetContactIds();
      } else {
        this.contactIds = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      return this.reqSeq;
    case GROUPID_FIELD_ID:
      return this.groupId;
    case CONTACTIDS_FIELD_ID:
      return this.contactIds;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      return isSetReqSeq();
    case GROUPID_FIELD_ID:
      return isSetGroupId();
    case CONTACTIDS_FIELD_ID:
      return isSetContactIds();
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
          case GROUPID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.groupId = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CONTACTIDS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list1125 = iprot.readListBegin();
                this.contactIds = new List< String>();
                for( _i1126 in 0 ... _list1125.size)
                {
                  var _elem1127 : String;
                  _elem1127 = iprot.readString();
                  this.contactIds.add(_elem1127);
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
      oprot.writeFieldBegin(REQ_SEQ_FIELD_DESC);
      oprot.writeI32(this.reqSeq);
      oprot.writeFieldEnd();
      if (this.groupId != null) {
        oprot.writeFieldBegin(GROUP_ID_FIELD_DESC);
        oprot.writeString(this.groupId);
        oprot.writeFieldEnd();
      }
      if (this.contactIds != null) {
        oprot.writeFieldBegin(CONTACT_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.contactIds.length));
          for( elem1128 in this.contactIds)
          {
            oprot.writeString(elem1128);
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
    var ret : String = "kickoutFromGroup_args(";
    var first : Bool = true;

    ret += "reqSeq:";
    ret += this.reqSeq;
    first = false;
    if (!first) ret +=  ", ";
    ret += "groupId:";
    if (this.groupId == null) {
      ret += "null";
    } else {
      ret += this.groupId;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "contactIds:";
    if (this.contactIds == null) {
      ret += "null";
    } else {
      ret += this.contactIds;
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

