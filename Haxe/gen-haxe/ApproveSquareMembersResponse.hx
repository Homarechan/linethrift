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


class ApproveSquareMembersResponse implements TBase {
  
  static var STRUCT_DESC = { new TStruct("ApproveSquareMembersResponse"); };
  static var APPROVED_MEMBERS_FIELD_DESC = { new TField("approvedMembers", TType.LIST, 1); };
  static var STATUS_FIELD_DESC = { new TField("status", TType.STRUCT, 2); };

  @:isVar
  public var approvedMembers(get,set) : List< SquareMember>;
  @:isVar
  public var status(get,set) : SquareStatus;

  inline static var APPROVEDMEMBERS_FIELD_ID : Int = 1;
  inline static var STATUS_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_approvedMembers() : List< SquareMember> {
    return this.approvedMembers;
  }

  public function set_approvedMembers(approvedMembers:List< SquareMember>) : List< SquareMember> {
    this.approvedMembers = approvedMembers;
    return this.approvedMembers;
  }

  public function unsetApprovedMembers() : Void {
    this.approvedMembers = null;
  }

  // Returns true if field approvedMembers is set (has been assigned a value) and false otherwise
  public function isSetApprovedMembers() : Bool {
    return this.approvedMembers != null;
  }

  public function get_status() : SquareStatus {
    return this.status;
  }

  public function set_status(status:SquareStatus) : SquareStatus {
    this.status = status;
    return this.status;
  }

  public function unsetStatus() : Void {
    this.status = null;
  }

  // Returns true if field status is set (has been assigned a value) and false otherwise
  public function isSetStatus() : Bool {
    return this.status != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case APPROVEDMEMBERS_FIELD_ID:
      if (value == null) {
        unsetApprovedMembers();
      } else {
        this.approvedMembers = value;
      }

    case STATUS_FIELD_ID:
      if (value == null) {
        unsetStatus();
      } else {
        this.status = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case APPROVEDMEMBERS_FIELD_ID:
      return this.approvedMembers;
    case STATUS_FIELD_ID:
      return this.status;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case APPROVEDMEMBERS_FIELD_ID:
      return isSetApprovedMembers();
    case STATUS_FIELD_ID:
      return isSetStatus();
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
          case APPROVEDMEMBERS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list308 = iprot.readListBegin();
                this.approvedMembers = new List< SquareMember>();
                for( _i309 in 0 ... _list308.size)
                {
                  var _elem310 : SquareMember;
                  _elem310 = new SquareMember();
                  _elem310.read(iprot);
                  this.approvedMembers.add(_elem310);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case STATUS_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.status = new SquareStatus();
              this.status.read(iprot);
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
      if (this.approvedMembers != null) {
        oprot.writeFieldBegin(APPROVED_MEMBERS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.approvedMembers.length));
          for( elem311 in this.approvedMembers)
          {
            elem311.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        this.status.write(oprot);
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
    var ret : String = "ApproveSquareMembersResponse(";
    var first : Bool = true;

    ret += "approvedMembers:";
    if (this.approvedMembers == null) {
      ret += "null";
    } else {
      ret += this.approvedMembers;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "status:";
    if (this.status == null) {
      ret += "null";
    } else {
      ret += this.status;
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

