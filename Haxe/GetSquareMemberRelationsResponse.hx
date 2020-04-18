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


class GetSquareMemberRelationsResponse implements TBase {
  
  static var STRUCT_DESC = { new TStruct("GetSquareMemberRelationsResponse"); };
  static var SQUARE_MEMBERS_FIELD_DESC = { new TField("squareMembers", TType.LIST, 1); };
  static var RELATIONS_FIELD_DESC = { new TField("relations", TType.MAP, 2); };
  static var CONTINUATION_TOKEN_FIELD_DESC = { new TField("continuationToken", TType.STRING, 3); };

  @:isVar
  public var squareMembers(get,set) : List< SquareMember>;
  @:isVar
  public var relations(get,set) : StringMap< SquareMemberRelation>;
  @:isVar
  public var continuationToken(get,set) : String;

  inline static var SQUAREMEMBERS_FIELD_ID : Int = 1;
  inline static var RELATIONS_FIELD_ID : Int = 2;
  inline static var CONTINUATIONTOKEN_FIELD_ID : Int = 3;


  public function new() {
  }

  public function get_squareMembers() : List< SquareMember> {
    return this.squareMembers;
  }

  public function set_squareMembers(squareMembers:List< SquareMember>) : List< SquareMember> {
    this.squareMembers = squareMembers;
    return this.squareMembers;
  }

  public function unsetSquareMembers() : Void {
    this.squareMembers = null;
  }

  // Returns true if field squareMembers is set (has been assigned a value) and false otherwise
  public function isSetSquareMembers() : Bool {
    return this.squareMembers != null;
  }

  public function get_relations() : StringMap< SquareMemberRelation> {
    return this.relations;
  }

  public function set_relations(relations:StringMap< SquareMemberRelation>) : StringMap< SquareMemberRelation> {
    this.relations = relations;
    return this.relations;
  }

  public function unsetRelations() : Void {
    this.relations = null;
  }

  // Returns true if field relations is set (has been assigned a value) and false otherwise
  public function isSetRelations() : Bool {
    return this.relations != null;
  }

  public function get_continuationToken() : String {
    return this.continuationToken;
  }

  public function set_continuationToken(continuationToken:String) : String {
    this.continuationToken = continuationToken;
    return this.continuationToken;
  }

  public function unsetContinuationToken() : Void {
    this.continuationToken = null;
  }

  // Returns true if field continuationToken is set (has been assigned a value) and false otherwise
  public function isSetContinuationToken() : Bool {
    return this.continuationToken != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SQUAREMEMBERS_FIELD_ID:
      if (value == null) {
        unsetSquareMembers();
      } else {
        this.squareMembers = value;
      }

    case RELATIONS_FIELD_ID:
      if (value == null) {
        unsetRelations();
      } else {
        this.relations = value;
      }

    case CONTINUATIONTOKEN_FIELD_ID:
      if (value == null) {
        unsetContinuationToken();
      } else {
        this.continuationToken = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SQUAREMEMBERS_FIELD_ID:
      return this.squareMembers;
    case RELATIONS_FIELD_ID:
      return this.relations;
    case CONTINUATIONTOKEN_FIELD_ID:
      return this.continuationToken;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SQUAREMEMBERS_FIELD_ID:
      return isSetSquareMembers();
    case RELATIONS_FIELD_ID:
      return isSetRelations();
    case CONTINUATIONTOKEN_FIELD_ID:
      return isSetContinuationToken();
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
          case SQUAREMEMBERS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list403 = iprot.readListBegin();
                this.squareMembers = new List< SquareMember>();
                for( _i404 in 0 ... _list403.size)
                {
                  var _elem405 : SquareMember;
                  _elem405 = new SquareMember();
                  _elem405.read(iprot);
                  this.squareMembers.add(_elem405);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case RELATIONS_FIELD_ID:
            if (field.type == TType.MAP) {
              {
                var _map406 = iprot.readMapBegin();
                this.relations = new StringMap< SquareMemberRelation>();
                for( _i407 in 0 ... _map406.size)
                {
                  var _key408 : String;
                  var _val409 : SquareMemberRelation;
                  _key408 = iprot.readString();
                  _val409 = new SquareMemberRelation();
                  _val409.read(iprot);
                  this.relations.set( _key408, _val409);
                }
                iprot.readMapEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CONTINUATIONTOKEN_FIELD_ID:
            if (field.type == TType.STRING) {
              this.continuationToken = iprot.readString();
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
      if (this.squareMembers != null) {
        oprot.writeFieldBegin(SQUARE_MEMBERS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.squareMembers.length));
          for( elem410 in this.squareMembers)
          {
            elem410.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.relations != null) {
        oprot.writeFieldBegin(RELATIONS_FIELD_DESC);
        {
          var _sizeCounter412 : Int = 0;
          for( _key411 in this.relations) {
            _sizeCounter412++;
          }
          oprot.writeMapBegin(new TMap(TType.STRING, TType.STRUCT, _sizeCounter412));
          for( elem413 in this.relations.keys())
          {
            oprot.writeString(elem413);
            this.relations.get(elem413).write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.continuationToken != null) {
        oprot.writeFieldBegin(CONTINUATION_TOKEN_FIELD_DESC);
        oprot.writeString(this.continuationToken);
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
    var ret : String = "GetSquareMemberRelationsResponse(";
    var first : Bool = true;

    ret += "squareMembers:";
    if (this.squareMembers == null) {
      ret += "null";
    } else {
      ret += this.squareMembers;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "relations:";
    if (this.relations == null) {
      ret += "null";
    } else {
      ret += this.relations;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "continuationToken:";
    if (this.continuationToken == null) {
      ret += "null";
    } else {
      ret += this.continuationToken;
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

