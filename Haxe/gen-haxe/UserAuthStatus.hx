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


class UserAuthStatus implements TBase {
  
  static var STRUCT_DESC = { new TStruct("UserAuthStatus"); };
  static var PHONE_NUMBER_REGISTERED_FIELD_DESC = { new TField("phoneNumberRegistered", TType.BOOL, 1); };
  static var REGISTERED_SNS_ID_TYPES_FIELD_DESC = { new TField("registeredSnsIdTypes", TType.LIST, 2); };

  @:isVar
  public var phoneNumberRegistered(get,set) : Bool;
  @:isVar
  public var registeredSnsIdTypes(get,set) : List< Int>;

  inline static var PHONENUMBERREGISTERED_FIELD_ID : Int = 1;
  inline static var REGISTEREDSNSIDTYPES_FIELD_ID : Int = 2;

  private var __isset_phoneNumberRegistered : Bool = false;

  public function new() {
  }

  public function get_phoneNumberRegistered() : Bool {
    return this.phoneNumberRegistered;
  }

  public function set_phoneNumberRegistered(phoneNumberRegistered:Bool) : Bool {
    this.phoneNumberRegistered = phoneNumberRegistered;
    this.__isset_phoneNumberRegistered = true;
    return this.phoneNumberRegistered;
  }

  public function unsetPhoneNumberRegistered() : Void {
    this.__isset_phoneNumberRegistered = false;
  }

  // Returns true if field phoneNumberRegistered is set (has been assigned a value) and false otherwise
  public function isSetPhoneNumberRegistered() : Bool {
    return this.__isset_phoneNumberRegistered;
  }

  public function get_registeredSnsIdTypes() : List< Int> {
    return this.registeredSnsIdTypes;
  }

  public function set_registeredSnsIdTypes(registeredSnsIdTypes:List< Int>) : List< Int> {
    this.registeredSnsIdTypes = registeredSnsIdTypes;
    return this.registeredSnsIdTypes;
  }

  public function unsetRegisteredSnsIdTypes() : Void {
    this.registeredSnsIdTypes = null;
  }

  // Returns true if field registeredSnsIdTypes is set (has been assigned a value) and false otherwise
  public function isSetRegisteredSnsIdTypes() : Bool {
    return this.registeredSnsIdTypes != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case PHONENUMBERREGISTERED_FIELD_ID:
      if (value == null) {
        unsetPhoneNumberRegistered();
      } else {
        this.phoneNumberRegistered = value;
      }

    case REGISTEREDSNSIDTYPES_FIELD_ID:
      if (value == null) {
        unsetRegisteredSnsIdTypes();
      } else {
        this.registeredSnsIdTypes = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case PHONENUMBERREGISTERED_FIELD_ID:
      return this.phoneNumberRegistered;
    case REGISTEREDSNSIDTYPES_FIELD_ID:
      return this.registeredSnsIdTypes;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case PHONENUMBERREGISTERED_FIELD_ID:
      return isSetPhoneNumberRegistered();
    case REGISTEREDSNSIDTYPES_FIELD_ID:
      return isSetRegisteredSnsIdTypes();
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
          case PHONENUMBERREGISTERED_FIELD_ID:
            if (field.type == TType.BOOL) {
              this.phoneNumberRegistered = iprot.readBool();
              this.__isset_phoneNumberRegistered = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case REGISTEREDSNSIDTYPES_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list595 = iprot.readListBegin();
                this.registeredSnsIdTypes = new List< Int>();
                for( _i596 in 0 ... _list595.size)
                {
                  var _elem597 : Int;
                  _elem597 = iprot.readI32();
                  this.registeredSnsIdTypes.add(_elem597);
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
      oprot.writeFieldBegin(PHONE_NUMBER_REGISTERED_FIELD_DESC);
      oprot.writeBool(this.phoneNumberRegistered);
      oprot.writeFieldEnd();
      if (this.registeredSnsIdTypes != null) {
        oprot.writeFieldBegin(REGISTERED_SNS_ID_TYPES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.I32, this.registeredSnsIdTypes.length));
          for( elem598 in this.registeredSnsIdTypes)
          {
            oprot.writeI32(elem598);
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
    var ret : String = "UserAuthStatus(";
    var first : Bool = true;

    ret += "phoneNumberRegistered:";
    ret += this.phoneNumberRegistered;
    first = false;
    if (!first) ret +=  ", ";
    ret += "registeredSnsIdTypes:";
    if (this.registeredSnsIdTypes == null) {
      ret += "null";
    } else {
      ret += this.registeredSnsIdTypes;
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

