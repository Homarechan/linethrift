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


class SquareEventNotifiedCreateSquareMember implements TBase {
  
  static var STRUCT_DESC = { new TStruct("SquareEventNotifiedCreateSquareMember"); };
  static var SQUARE_FIELD_DESC = { new TField("square", TType.STRUCT, 1); };
  static var SQUARE_AUTHORITY_FIELD_DESC = { new TField("squareAuthority", TType.STRUCT, 2); };
  static var SQUARE_STATUS_FIELD_DESC = { new TField("squareStatus", TType.STRUCT, 3); };
  static var SQUARE_MEMBER_FIELD_DESC = { new TField("squareMember", TType.STRUCT, 4); };
  static var SQUARE_FEATURE_SET_FIELD_DESC = { new TField("squareFeatureSet", TType.STRUCT, 5); };

  @:isVar
  public var square(get,set) : Square;
  @:isVar
  public var squareAuthority(get,set) : SquareAuthority;
  @:isVar
  public var squareStatus(get,set) : SquareStatus;
  @:isVar
  public var squareMember(get,set) : SquareMember;
  @:isVar
  public var squareFeatureSet(get,set) : SquareFeatureSet;

  inline static var SQUARE_FIELD_ID : Int = 1;
  inline static var SQUAREAUTHORITY_FIELD_ID : Int = 2;
  inline static var SQUARESTATUS_FIELD_ID : Int = 3;
  inline static var SQUAREMEMBER_FIELD_ID : Int = 4;
  inline static var SQUAREFEATURESET_FIELD_ID : Int = 5;


  public function new() {
  }

  public function get_square() : Square {
    return this.square;
  }

  public function set_square(square:Square) : Square {
    this.square = square;
    return this.square;
  }

  public function unsetSquare() : Void {
    this.square = null;
  }

  // Returns true if field square is set (has been assigned a value) and false otherwise
  public function isSetSquare() : Bool {
    return this.square != null;
  }

  public function get_squareAuthority() : SquareAuthority {
    return this.squareAuthority;
  }

  public function set_squareAuthority(squareAuthority:SquareAuthority) : SquareAuthority {
    this.squareAuthority = squareAuthority;
    return this.squareAuthority;
  }

  public function unsetSquareAuthority() : Void {
    this.squareAuthority = null;
  }

  // Returns true if field squareAuthority is set (has been assigned a value) and false otherwise
  public function isSetSquareAuthority() : Bool {
    return this.squareAuthority != null;
  }

  public function get_squareStatus() : SquareStatus {
    return this.squareStatus;
  }

  public function set_squareStatus(squareStatus:SquareStatus) : SquareStatus {
    this.squareStatus = squareStatus;
    return this.squareStatus;
  }

  public function unsetSquareStatus() : Void {
    this.squareStatus = null;
  }

  // Returns true if field squareStatus is set (has been assigned a value) and false otherwise
  public function isSetSquareStatus() : Bool {
    return this.squareStatus != null;
  }

  public function get_squareMember() : SquareMember {
    return this.squareMember;
  }

  public function set_squareMember(squareMember:SquareMember) : SquareMember {
    this.squareMember = squareMember;
    return this.squareMember;
  }

  public function unsetSquareMember() : Void {
    this.squareMember = null;
  }

  // Returns true if field squareMember is set (has been assigned a value) and false otherwise
  public function isSetSquareMember() : Bool {
    return this.squareMember != null;
  }

  public function get_squareFeatureSet() : SquareFeatureSet {
    return this.squareFeatureSet;
  }

  public function set_squareFeatureSet(squareFeatureSet:SquareFeatureSet) : SquareFeatureSet {
    this.squareFeatureSet = squareFeatureSet;
    return this.squareFeatureSet;
  }

  public function unsetSquareFeatureSet() : Void {
    this.squareFeatureSet = null;
  }

  // Returns true if field squareFeatureSet is set (has been assigned a value) and false otherwise
  public function isSetSquareFeatureSet() : Bool {
    return this.squareFeatureSet != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SQUARE_FIELD_ID:
      if (value == null) {
        unsetSquare();
      } else {
        this.square = value;
      }

    case SQUAREAUTHORITY_FIELD_ID:
      if (value == null) {
        unsetSquareAuthority();
      } else {
        this.squareAuthority = value;
      }

    case SQUARESTATUS_FIELD_ID:
      if (value == null) {
        unsetSquareStatus();
      } else {
        this.squareStatus = value;
      }

    case SQUAREMEMBER_FIELD_ID:
      if (value == null) {
        unsetSquareMember();
      } else {
        this.squareMember = value;
      }

    case SQUAREFEATURESET_FIELD_ID:
      if (value == null) {
        unsetSquareFeatureSet();
      } else {
        this.squareFeatureSet = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SQUARE_FIELD_ID:
      return this.square;
    case SQUAREAUTHORITY_FIELD_ID:
      return this.squareAuthority;
    case SQUARESTATUS_FIELD_ID:
      return this.squareStatus;
    case SQUAREMEMBER_FIELD_ID:
      return this.squareMember;
    case SQUAREFEATURESET_FIELD_ID:
      return this.squareFeatureSet;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SQUARE_FIELD_ID:
      return isSetSquare();
    case SQUAREAUTHORITY_FIELD_ID:
      return isSetSquareAuthority();
    case SQUARESTATUS_FIELD_ID:
      return isSetSquareStatus();
    case SQUAREMEMBER_FIELD_ID:
      return isSetSquareMember();
    case SQUAREFEATURESET_FIELD_ID:
      return isSetSquareFeatureSet();
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
          case SQUARE_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.square = new Square();
              this.square.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SQUAREAUTHORITY_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.squareAuthority = new SquareAuthority();
              this.squareAuthority.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SQUARESTATUS_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.squareStatus = new SquareStatus();
              this.squareStatus.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SQUAREMEMBER_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.squareMember = new SquareMember();
              this.squareMember.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SQUAREFEATURESET_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.squareFeatureSet = new SquareFeatureSet();
              this.squareFeatureSet.read(iprot);
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
      if (this.square != null) {
        oprot.writeFieldBegin(SQUARE_FIELD_DESC);
        this.square.write(oprot);
        oprot.writeFieldEnd();
      }
      if (this.squareAuthority != null) {
        oprot.writeFieldBegin(SQUARE_AUTHORITY_FIELD_DESC);
        this.squareAuthority.write(oprot);
        oprot.writeFieldEnd();
      }
      if (this.squareStatus != null) {
        oprot.writeFieldBegin(SQUARE_STATUS_FIELD_DESC);
        this.squareStatus.write(oprot);
        oprot.writeFieldEnd();
      }
      if (this.squareMember != null) {
        oprot.writeFieldBegin(SQUARE_MEMBER_FIELD_DESC);
        this.squareMember.write(oprot);
        oprot.writeFieldEnd();
      }
      if (this.squareFeatureSet != null) {
        oprot.writeFieldBegin(SQUARE_FEATURE_SET_FIELD_DESC);
        this.squareFeatureSet.write(oprot);
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
    var ret : String = "SquareEventNotifiedCreateSquareMember(";
    var first : Bool = true;

    ret += "square:";
    if (this.square == null) {
      ret += "null";
    } else {
      ret += this.square;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "squareAuthority:";
    if (this.squareAuthority == null) {
      ret += "null";
    } else {
      ret += this.squareAuthority;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "squareStatus:";
    if (this.squareStatus == null) {
      ret += "null";
    } else {
      ret += this.squareStatus;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "squareMember:";
    if (this.squareMember == null) {
      ret += "null";
    } else {
      ret += this.squareMember;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "squareFeatureSet:";
    if (this.squareFeatureSet == null) {
      ret += "null";
    } else {
      ret += this.squareFeatureSet;
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

