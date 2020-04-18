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


class FindSquareByInvitationTicketResponse implements TBase {
  
  static var STRUCT_DESC = { new TStruct("FindSquareByInvitationTicketResponse"); };
  static var SQUARE_FIELD_DESC = { new TField("square", TType.STRUCT, 1); };
  static var MY_MEMBERSHIP_FIELD_DESC = { new TField("myMembership", TType.STRUCT, 2); };
  static var SQUARE_AUTHORITY_FIELD_DESC = { new TField("squareAuthority", TType.STRUCT, 3); };
  static var SQUARE_STATUS_FIELD_DESC = { new TField("squareStatus", TType.STRUCT, 4); };

  @:isVar
  public var square(get,set) : Square;
  @:isVar
  public var myMembership(get,set) : SquareMember;
  @:isVar
  public var squareAuthority(get,set) : SquareAuthority;
  @:isVar
  public var squareStatus(get,set) : SquareStatus;

  inline static var SQUARE_FIELD_ID : Int = 1;
  inline static var MYMEMBERSHIP_FIELD_ID : Int = 2;
  inline static var SQUAREAUTHORITY_FIELD_ID : Int = 3;
  inline static var SQUARESTATUS_FIELD_ID : Int = 4;


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

  public function get_myMembership() : SquareMember {
    return this.myMembership;
  }

  public function set_myMembership(myMembership:SquareMember) : SquareMember {
    this.myMembership = myMembership;
    return this.myMembership;
  }

  public function unsetMyMembership() : Void {
    this.myMembership = null;
  }

  // Returns true if field myMembership is set (has been assigned a value) and false otherwise
  public function isSetMyMembership() : Bool {
    return this.myMembership != null;
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

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SQUARE_FIELD_ID:
      if (value == null) {
        unsetSquare();
      } else {
        this.square = value;
      }

    case MYMEMBERSHIP_FIELD_ID:
      if (value == null) {
        unsetMyMembership();
      } else {
        this.myMembership = value;
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

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SQUARE_FIELD_ID:
      return this.square;
    case MYMEMBERSHIP_FIELD_ID:
      return this.myMembership;
    case SQUAREAUTHORITY_FIELD_ID:
      return this.squareAuthority;
    case SQUARESTATUS_FIELD_ID:
      return this.squareStatus;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SQUARE_FIELD_ID:
      return isSetSquare();
    case MYMEMBERSHIP_FIELD_ID:
      return isSetMyMembership();
    case SQUAREAUTHORITY_FIELD_ID:
      return isSetSquareAuthority();
    case SQUARESTATUS_FIELD_ID:
      return isSetSquareStatus();
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
          case MYMEMBERSHIP_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.myMembership = new SquareMember();
              this.myMembership.read(iprot);
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
      if (this.myMembership != null) {
        oprot.writeFieldBegin(MY_MEMBERSHIP_FIELD_DESC);
        this.myMembership.write(oprot);
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
    var ret : String = "FindSquareByInvitationTicketResponse(";
    var first : Bool = true;

    ret += "square:";
    if (this.square == null) {
      ret += "null";
    } else {
      ret += this.square;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "myMembership:";
    if (this.myMembership == null) {
      ret += "null";
    } else {
      ret += this.myMembership;
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
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

