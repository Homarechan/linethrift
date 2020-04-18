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


class UpdateSquareMemberRelationRequest implements TBase {
  
  static var STRUCT_DESC = { new TStruct("UpdateSquareMemberRelationRequest"); };
  static var SQUARE_MID_FIELD_DESC = { new TField("squareMid", TType.STRING, 2); };
  static var TARGET_SQUARE_MEMBER_MID_FIELD_DESC = { new TField("targetSquareMemberMid", TType.STRING, 3); };
  static var UPDATED_ATTRS_FIELD_DESC = { new TField("updatedAttrs", TType.SET, 4); };
  static var RELATION_FIELD_DESC = { new TField("relation", TType.STRUCT, 5); };

  @:isVar
  public var squareMid(get,set) : String;
  @:isVar
  public var targetSquareMemberMid(get,set) : String;
  @:isVar
  public var updatedAttrs(get,set) : IntSet;
  @:isVar
  public var relation(get,set) : SquareMemberRelation;

  inline static var SQUAREMID_FIELD_ID : Int = 2;
  inline static var TARGETSQUAREMEMBERMID_FIELD_ID : Int = 3;
  inline static var UPDATEDATTRS_FIELD_ID : Int = 4;
  inline static var RELATION_FIELD_ID : Int = 5;


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

  public function get_targetSquareMemberMid() : String {
    return this.targetSquareMemberMid;
  }

  public function set_targetSquareMemberMid(targetSquareMemberMid:String) : String {
    this.targetSquareMemberMid = targetSquareMemberMid;
    return this.targetSquareMemberMid;
  }

  public function unsetTargetSquareMemberMid() : Void {
    this.targetSquareMemberMid = null;
  }

  // Returns true if field targetSquareMemberMid is set (has been assigned a value) and false otherwise
  public function isSetTargetSquareMemberMid() : Bool {
    return this.targetSquareMemberMid != null;
  }

  public function get_updatedAttrs() : IntSet {
    return this.updatedAttrs;
  }

  public function set_updatedAttrs(updatedAttrs:IntSet) : IntSet {
    this.updatedAttrs = updatedAttrs;
    return this.updatedAttrs;
  }

  public function unsetUpdatedAttrs() : Void {
    this.updatedAttrs = null;
  }

  // Returns true if field updatedAttrs is set (has been assigned a value) and false otherwise
  public function isSetUpdatedAttrs() : Bool {
    return this.updatedAttrs != null;
  }

  public function get_relation() : SquareMemberRelation {
    return this.relation;
  }

  public function set_relation(relation:SquareMemberRelation) : SquareMemberRelation {
    this.relation = relation;
    return this.relation;
  }

  public function unsetRelation() : Void {
    this.relation = null;
  }

  // Returns true if field relation is set (has been assigned a value) and false otherwise
  public function isSetRelation() : Bool {
    return this.relation != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SQUAREMID_FIELD_ID:
      if (value == null) {
        unsetSquareMid();
      } else {
        this.squareMid = value;
      }

    case TARGETSQUAREMEMBERMID_FIELD_ID:
      if (value == null) {
        unsetTargetSquareMemberMid();
      } else {
        this.targetSquareMemberMid = value;
      }

    case UPDATEDATTRS_FIELD_ID:
      if (value == null) {
        unsetUpdatedAttrs();
      } else {
        this.updatedAttrs = value;
      }

    case RELATION_FIELD_ID:
      if (value == null) {
        unsetRelation();
      } else {
        this.relation = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SQUAREMID_FIELD_ID:
      return this.squareMid;
    case TARGETSQUAREMEMBERMID_FIELD_ID:
      return this.targetSquareMemberMid;
    case UPDATEDATTRS_FIELD_ID:
      return this.updatedAttrs;
    case RELATION_FIELD_ID:
      return this.relation;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SQUAREMID_FIELD_ID:
      return isSetSquareMid();
    case TARGETSQUAREMEMBERMID_FIELD_ID:
      return isSetTargetSquareMemberMid();
    case UPDATEDATTRS_FIELD_ID:
      return isSetUpdatedAttrs();
    case RELATION_FIELD_ID:
      return isSetRelation();
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
          case TARGETSQUAREMEMBERMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.targetSquareMemberMid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case UPDATEDATTRS_FIELD_ID:
            if (field.type == TType.SET) {
              {
                var _set537 = iprot.readSetBegin();
                this.updatedAttrs = new IntSet();
                for( _i538 in 0 ... _set537.size)
                {
                  var _elem539 : Int;
                  _elem539 = iprot.readI32();
                  this.updatedAttrs.add(_elem539);
                }
                iprot.readSetEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case RELATION_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.relation = new SquareMemberRelation();
              this.relation.read(iprot);
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
      if (this.targetSquareMemberMid != null) {
        oprot.writeFieldBegin(TARGET_SQUARE_MEMBER_MID_FIELD_DESC);
        oprot.writeString(this.targetSquareMemberMid);
        oprot.writeFieldEnd();
      }
      if (this.updatedAttrs != null) {
        oprot.writeFieldBegin(UPDATED_ATTRS_FIELD_DESC);
        {
          oprot.writeSetBegin(new TSet(TType.I32, this.updatedAttrs.size));
          for( elem540 in this.updatedAttrs.toArray())
          {
            oprot.writeI32(elem540);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.relation != null) {
        oprot.writeFieldBegin(RELATION_FIELD_DESC);
        this.relation.write(oprot);
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
    var ret : String = "UpdateSquareMemberRelationRequest(";
    var first : Bool = true;

    ret += "squareMid:";
    if (this.squareMid == null) {
      ret += "null";
    } else {
      ret += this.squareMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "targetSquareMemberMid:";
    if (this.targetSquareMemberMid == null) {
      ret += "null";
    } else {
      ret += this.targetSquareMemberMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "updatedAttrs:";
    if (this.updatedAttrs == null) {
      ret += "null";
    } else {
      ret += this.updatedAttrs;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "relation:";
    if (this.relation == null) {
      ret += "null";
    } else {
      ret += this.relation;
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

