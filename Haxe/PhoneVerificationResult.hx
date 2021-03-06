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


class PhoneVerificationResult implements TBase {
  
  static var STRUCT_DESC = { new TStruct("PhoneVerificationResult"); };
  static var VERIFICATION_RESULT_FIELD_DESC = { new TField("verificationResult", TType.I32, 1); };
  static var ACCOUNT_MIGRATION_CHECK_TYPE_FIELD_DESC = { new TField("accountMigrationCheckType", TType.I32, 2); };
  static var RECOMMEND_ADD_FRIENDS_FIELD_DESC = { new TField("recommendAddFriends", TType.BOOL, 3); };

  @:isVar
  public var verificationResult(get,set) : Int;
  @:isVar
  public var accountMigrationCheckType(get,set) : Int;
  @:isVar
  public var recommendAddFriends(get,set) : Bool;

  inline static var VERIFICATIONRESULT_FIELD_ID : Int = 1;
  inline static var ACCOUNTMIGRATIONCHECKTYPE_FIELD_ID : Int = 2;
  inline static var RECOMMENDADDFRIENDS_FIELD_ID : Int = 3;

  private var __isset_verificationResult : Bool = false;
  private var __isset_accountMigrationCheckType : Bool = false;
  private var __isset_recommendAddFriends : Bool = false;

  public function new() {
  }

  public function get_verificationResult() : Int {
    return this.verificationResult;
  }

  public function set_verificationResult(verificationResult:Int) : Int {
    this.verificationResult = verificationResult;
    this.__isset_verificationResult = true;
    return this.verificationResult;
  }

  public function unsetVerificationResult() : Void {
    this.__isset_verificationResult = false;
  }

  // Returns true if field verificationResult is set (has been assigned a value) and false otherwise
  public function isSetVerificationResult() : Bool {
    return this.__isset_verificationResult;
  }

  public function get_accountMigrationCheckType() : Int {
    return this.accountMigrationCheckType;
  }

  public function set_accountMigrationCheckType(accountMigrationCheckType:Int) : Int {
    this.accountMigrationCheckType = accountMigrationCheckType;
    this.__isset_accountMigrationCheckType = true;
    return this.accountMigrationCheckType;
  }

  public function unsetAccountMigrationCheckType() : Void {
    this.__isset_accountMigrationCheckType = false;
  }

  // Returns true if field accountMigrationCheckType is set (has been assigned a value) and false otherwise
  public function isSetAccountMigrationCheckType() : Bool {
    return this.__isset_accountMigrationCheckType;
  }

  public function get_recommendAddFriends() : Bool {
    return this.recommendAddFriends;
  }

  public function set_recommendAddFriends(recommendAddFriends:Bool) : Bool {
    this.recommendAddFriends = recommendAddFriends;
    this.__isset_recommendAddFriends = true;
    return this.recommendAddFriends;
  }

  public function unsetRecommendAddFriends() : Void {
    this.__isset_recommendAddFriends = false;
  }

  // Returns true if field recommendAddFriends is set (has been assigned a value) and false otherwise
  public function isSetRecommendAddFriends() : Bool {
    return this.__isset_recommendAddFriends;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case VERIFICATIONRESULT_FIELD_ID:
      if (value == null) {
        unsetVerificationResult();
      } else {
        this.verificationResult = value;
      }

    case ACCOUNTMIGRATIONCHECKTYPE_FIELD_ID:
      if (value == null) {
        unsetAccountMigrationCheckType();
      } else {
        this.accountMigrationCheckType = value;
      }

    case RECOMMENDADDFRIENDS_FIELD_ID:
      if (value == null) {
        unsetRecommendAddFriends();
      } else {
        this.recommendAddFriends = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case VERIFICATIONRESULT_FIELD_ID:
      return this.verificationResult;
    case ACCOUNTMIGRATIONCHECKTYPE_FIELD_ID:
      return this.accountMigrationCheckType;
    case RECOMMENDADDFRIENDS_FIELD_ID:
      return this.recommendAddFriends;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case VERIFICATIONRESULT_FIELD_ID:
      return isSetVerificationResult();
    case ACCOUNTMIGRATIONCHECKTYPE_FIELD_ID:
      return isSetAccountMigrationCheckType();
    case RECOMMENDADDFRIENDS_FIELD_ID:
      return isSetRecommendAddFriends();
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
          case VERIFICATIONRESULT_FIELD_ID:
            if (field.type == TType.I32) {
              this.verificationResult = iprot.readI32();
              this.__isset_verificationResult = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case ACCOUNTMIGRATIONCHECKTYPE_FIELD_ID:
            if (field.type == TType.I32) {
              this.accountMigrationCheckType = iprot.readI32();
              this.__isset_accountMigrationCheckType = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case RECOMMENDADDFRIENDS_FIELD_ID:
            if (field.type == TType.BOOL) {
              this.recommendAddFriends = iprot.readBool();
              this.__isset_recommendAddFriends = true;
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
      oprot.writeFieldBegin(VERIFICATION_RESULT_FIELD_DESC);
      oprot.writeI32(this.verificationResult);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ACCOUNT_MIGRATION_CHECK_TYPE_FIELD_DESC);
      oprot.writeI32(this.accountMigrationCheckType);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RECOMMEND_ADD_FRIENDS_FIELD_DESC);
      oprot.writeBool(this.recommendAddFriends);
      oprot.writeFieldEnd();
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
    var ret : String = "PhoneVerificationResult(";
    var first : Bool = true;

    ret += "verificationResult:";
    var verificationResult_name : String = .VerificationResult.VALUES_TO_NAMES[this.verificationResult];
    if (verificationResult_name != null) {
      ret += verificationResult_name;
      ret += " (";
    }
    ret += this.verificationResult;
    if (verificationResult_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "accountMigrationCheckType:";
    var accountMigrationCheckType_name : String = .AccountMigrationCheckType.VALUES_TO_NAMES[this.accountMigrationCheckType];
    if (accountMigrationCheckType_name != null) {
      ret += accountMigrationCheckType_name;
      ret += " (";
    }
    ret += this.accountMigrationCheckType;
    if (accountMigrationCheckType_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "recommendAddFriends:";
    ret += this.recommendAddFriends;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetVerificationResult() && !.VerificationResult.VALID_VALUES.contains(verificationResult)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'verificationResult' has been assigned the invalid value " + verificationResult);
    }
    if (isSetAccountMigrationCheckType() && !.AccountMigrationCheckType.VALID_VALUES.contains(accountMigrationCheckType)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'accountMigrationCheckType' has been assigned the invalid value " + accountMigrationCheckType);
    }
  }

}

