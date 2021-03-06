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


class SquareEventNotifiedJoinSquareChat implements TBase {
  
  static var STRUCT_DESC = { new TStruct("SquareEventNotifiedJoinSquareChat"); };
  static var SQUARE_CHAT_MID_FIELD_DESC = { new TField("squareChatMid", TType.STRING, 1); };
  static var JOINED_MEMBER_FIELD_DESC = { new TField("joinedMember", TType.STRUCT, 2); };

  @:isVar
  public var squareChatMid(get,set) : String;
  @:isVar
  public var joinedMember(get,set) : SquareMember;

  inline static var SQUARECHATMID_FIELD_ID : Int = 1;
  inline static var JOINEDMEMBER_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_squareChatMid() : String {
    return this.squareChatMid;
  }

  public function set_squareChatMid(squareChatMid:String) : String {
    this.squareChatMid = squareChatMid;
    return this.squareChatMid;
  }

  public function unsetSquareChatMid() : Void {
    this.squareChatMid = null;
  }

  // Returns true if field squareChatMid is set (has been assigned a value) and false otherwise
  public function isSetSquareChatMid() : Bool {
    return this.squareChatMid != null;
  }

  public function get_joinedMember() : SquareMember {
    return this.joinedMember;
  }

  public function set_joinedMember(joinedMember:SquareMember) : SquareMember {
    this.joinedMember = joinedMember;
    return this.joinedMember;
  }

  public function unsetJoinedMember() : Void {
    this.joinedMember = null;
  }

  // Returns true if field joinedMember is set (has been assigned a value) and false otherwise
  public function isSetJoinedMember() : Bool {
    return this.joinedMember != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SQUARECHATMID_FIELD_ID:
      if (value == null) {
        unsetSquareChatMid();
      } else {
        this.squareChatMid = value;
      }

    case JOINEDMEMBER_FIELD_ID:
      if (value == null) {
        unsetJoinedMember();
      } else {
        this.joinedMember = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SQUARECHATMID_FIELD_ID:
      return this.squareChatMid;
    case JOINEDMEMBER_FIELD_ID:
      return this.joinedMember;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SQUARECHATMID_FIELD_ID:
      return isSetSquareChatMid();
    case JOINEDMEMBER_FIELD_ID:
      return isSetJoinedMember();
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
          case SQUARECHATMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.squareChatMid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case JOINEDMEMBER_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.joinedMember = new SquareMember();
              this.joinedMember.read(iprot);
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
      if (this.squareChatMid != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
        oprot.writeString(this.squareChatMid);
        oprot.writeFieldEnd();
      }
      if (this.joinedMember != null) {
        oprot.writeFieldBegin(JOINED_MEMBER_FIELD_DESC);
        this.joinedMember.write(oprot);
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
    var ret : String = "SquareEventNotifiedJoinSquareChat(";
    var first : Bool = true;

    ret += "squareChatMid:";
    if (this.squareChatMid == null) {
      ret += "null";
    } else {
      ret += this.squareChatMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "joinedMember:";
    if (this.joinedMember == null) {
      ret += "null";
    } else {
      ret += this.joinedMember;
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

