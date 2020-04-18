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


class RejectSquareMembersRequest implements TBase {
  
  static var STRUCT_DESC = { new TStruct("RejectSquareMembersRequest"); };
  static var SQUARE_MID_FIELD_DESC = { new TField("squareMid", TType.STRING, 2); };
  static var REQUESTED_MEMBER_MIDS_FIELD_DESC = { new TField("requestedMemberMids", TType.LIST, 3); };

  @:isVar
  public var squareMid(get,set) : String;
  @:isVar
  public var requestedMemberMids(get,set) : List< String>;

  inline static var SQUAREMID_FIELD_ID : Int = 2;
  inline static var REQUESTEDMEMBERMIDS_FIELD_ID : Int = 3;


  public function new() {
  }

  public function get_squareMid() : String {
    return this.squareMid;
  }

  public function set_squareMid(squareMid:String) : String {
    this.squareMid = squareMid;
    return this.squareMid;
  }

  public function unsetSquareMid() : Void {
    this.squareMid = null;
  }

  // Returns true if field squareMid is set (has been assigned a value) and false otherwise
  public function isSetSquareMid() : Bool {
    return this.squareMid != null;
  }

  public function get_requestedMemberMids() : List< String> {
    return this.requestedMemberMids;
  }

  public function set_requestedMemberMids(requestedMemberMids:List< String>) : List< String> {
    this.requestedMemberMids = requestedMemberMids;
    return this.requestedMemberMids;
  }

  public function unsetRequestedMemberMids() : Void {
    this.requestedMemberMids = null;
  }

  // Returns true if field requestedMemberMids is set (has been assigned a value) and false otherwise
  public function isSetRequestedMemberMids() : Bool {
    return this.requestedMemberMids != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SQUAREMID_FIELD_ID:
      if (value == null) {
        unsetSquareMid();
      } else {
        this.squareMid = value;
      }

    case REQUESTEDMEMBERMIDS_FIELD_ID:
      if (value == null) {
        unsetRequestedMemberMids();
      } else {
        this.requestedMemberMids = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SQUAREMID_FIELD_ID:
      return this.squareMid;
    case REQUESTEDMEMBERMIDS_FIELD_ID:
      return this.requestedMemberMids;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SQUAREMID_FIELD_ID:
      return isSetSquareMid();
    case REQUESTEDMEMBERMIDS_FIELD_ID:
      return isSetRequestedMemberMids();
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
          case SQUAREMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.squareMid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case REQUESTEDMEMBERMIDS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list494 = iprot.readListBegin();
                this.requestedMemberMids = new List< String>();
                for( _i495 in 0 ... _list494.size)
                {
                  var _elem496 : String;
                  _elem496 = iprot.readString();
                  this.requestedMemberMids.add(_elem496);
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
      if (this.squareMid != null) {
        oprot.writeFieldBegin(SQUARE_MID_FIELD_DESC);
        oprot.writeString(this.squareMid);
        oprot.writeFieldEnd();
      }
      if (this.requestedMemberMids != null) {
        oprot.writeFieldBegin(REQUESTED_MEMBER_MIDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.requestedMemberMids.length));
          for( elem497 in this.requestedMemberMids)
          {
            oprot.writeString(elem497);
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
    var ret : String = "RejectSquareMembersRequest(";
    var first : Bool = true;

    ret += "squareMid:";
    if (this.squareMid == null) {
      ret += "null";
    } else {
      ret += this.squareMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "requestedMemberMids:";
    if (this.requestedMemberMids == null) {
      ret += "null";
    } else {
      ret += this.requestedMemberMids;
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

