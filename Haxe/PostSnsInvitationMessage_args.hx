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


class PostSnsInvitationMessage_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("postSnsInvitationMessage_args"); };
  static var SNS_ID_TYPE_FIELD_DESC = { new TField("snsIdType", TType.I32, 2); };
  static var SNS_ACCESS_TOKEN_FIELD_DESC = { new TField("snsAccessToken", TType.STRING, 3); };
  static var TO_SNS_USER_ID_FIELD_DESC = { new TField("toSnsUserId", TType.STRING, 4); };

  @:isVar
  public var snsIdType(get,set) : Int;
  @:isVar
  public var snsAccessToken(get,set) : String;
  @:isVar
  public var toSnsUserId(get,set) : String;

  inline static var SNSIDTYPE_FIELD_ID : Int = 2;
  inline static var SNSACCESSTOKEN_FIELD_ID : Int = 3;
  inline static var TOSNSUSERID_FIELD_ID : Int = 4;

  private var __isset_snsIdType : Bool = false;

  public function new() {
  }

  public function get_snsIdType() : Int {
    return this.snsIdType;
  }

  public function set_snsIdType(snsIdType:Int) : Int {
    this.snsIdType = snsIdType;
    this.__isset_snsIdType = true;
    return this.snsIdType;
  }

  public function unsetSnsIdType() : Void {
    this.__isset_snsIdType = false;
  }

  // Returns true if field snsIdType is set (has been assigned a value) and false otherwise
  public function isSetSnsIdType() : Bool {
    return this.__isset_snsIdType;
  }

  public function get_snsAccessToken() : String {
    return this.snsAccessToken;
  }

  public function set_snsAccessToken(snsAccessToken:String) : String {
    this.snsAccessToken = snsAccessToken;
    return this.snsAccessToken;
  }

  public function unsetSnsAccessToken() : Void {
    this.snsAccessToken = null;
  }

  // Returns true if field snsAccessToken is set (has been assigned a value) and false otherwise
  public function isSetSnsAccessToken() : Bool {
    return this.snsAccessToken != null;
  }

  public function get_toSnsUserId() : String {
    return this.toSnsUserId;
  }

  public function set_toSnsUserId(toSnsUserId:String) : String {
    this.toSnsUserId = toSnsUserId;
    return this.toSnsUserId;
  }

  public function unsetToSnsUserId() : Void {
    this.toSnsUserId = null;
  }

  // Returns true if field toSnsUserId is set (has been assigned a value) and false otherwise
  public function isSetToSnsUserId() : Bool {
    return this.toSnsUserId != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SNSIDTYPE_FIELD_ID:
      if (value == null) {
        unsetSnsIdType();
      } else {
        this.snsIdType = value;
      }

    case SNSACCESSTOKEN_FIELD_ID:
      if (value == null) {
        unsetSnsAccessToken();
      } else {
        this.snsAccessToken = value;
      }

    case TOSNSUSERID_FIELD_ID:
      if (value == null) {
        unsetToSnsUserId();
      } else {
        this.toSnsUserId = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SNSIDTYPE_FIELD_ID:
      return this.snsIdType;
    case SNSACCESSTOKEN_FIELD_ID:
      return this.snsAccessToken;
    case TOSNSUSERID_FIELD_ID:
      return this.toSnsUserId;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SNSIDTYPE_FIELD_ID:
      return isSetSnsIdType();
    case SNSACCESSTOKEN_FIELD_ID:
      return isSetSnsAccessToken();
    case TOSNSUSERID_FIELD_ID:
      return isSetToSnsUserId();
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
          case SNSIDTYPE_FIELD_ID:
            if (field.type == TType.I32) {
              this.snsIdType = iprot.readI32();
              this.__isset_snsIdType = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SNSACCESSTOKEN_FIELD_ID:
            if (field.type == TType.STRING) {
              this.snsAccessToken = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case TOSNSUSERID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.toSnsUserId = iprot.readString();
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
      oprot.writeFieldBegin(SNS_ID_TYPE_FIELD_DESC);
      oprot.writeI32(this.snsIdType);
      oprot.writeFieldEnd();
      if (this.snsAccessToken != null) {
        oprot.writeFieldBegin(SNS_ACCESS_TOKEN_FIELD_DESC);
        oprot.writeString(this.snsAccessToken);
        oprot.writeFieldEnd();
      }
      if (this.toSnsUserId != null) {
        oprot.writeFieldBegin(TO_SNS_USER_ID_FIELD_DESC);
        oprot.writeString(this.toSnsUserId);
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
    var ret : String = "postSnsInvitationMessage_args(";
    var first : Bool = true;

    ret += "snsIdType:";
    var snsIdType_name : String = .SnsIdType.VALUES_TO_NAMES[this.snsIdType];
    if (snsIdType_name != null) {
      ret += snsIdType_name;
      ret += " (";
    }
    ret += this.snsIdType;
    if (snsIdType_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "snsAccessToken:";
    if (this.snsAccessToken == null) {
      ret += "null";
    } else {
      ret += this.snsAccessToken;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "toSnsUserId:";
    if (this.toSnsUserId == null) {
      ret += "null";
    } else {
      ret += this.toSnsUserId;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetSnsIdType() && !.SnsIdType.VALID_VALUES.contains(snsIdType)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'snsIdType' has been assigned the invalid value " + snsIdType);
    }
  }

}

