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


class ProximityMatchCandidateResult implements TBase {
  
  static var STRUCT_DESC = { new TStruct("ProximityMatchCandidateResult"); };
  static var USERS_FIELD_DESC = { new TField("users", TType.LIST, 1); };
  static var BUDDIES_FIELD_DESC = { new TField("buddies", TType.LIST, 2); };

  @:isVar
  public var users(get,set) : List< Contact>;
  @:isVar
  public var buddies(get,set) : List< Contact>;

  inline static var USERS_FIELD_ID : Int = 1;
  inline static var BUDDIES_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_users() : List< Contact> {
    return this.users;
  }

  public function set_users(users:List< Contact>) : List< Contact> {
    this.users = users;
    return this.users;
  }

  public function unsetUsers() : Void {
    this.users = null;
  }

  // Returns true if field users is set (has been assigned a value) and false otherwise
  public function isSetUsers() : Bool {
    return this.users != null;
  }

  public function get_buddies() : List< Contact> {
    return this.buddies;
  }

  public function set_buddies(buddies:List< Contact>) : List< Contact> {
    this.buddies = buddies;
    return this.buddies;
  }

  public function unsetBuddies() : Void {
    this.buddies = null;
  }

  // Returns true if field buddies is set (has been assigned a value) and false otherwise
  public function isSetBuddies() : Bool {
    return this.buddies != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case USERS_FIELD_ID:
      if (value == null) {
        unsetUsers();
      } else {
        this.users = value;
      }

    case BUDDIES_FIELD_ID:
      if (value == null) {
        unsetBuddies();
      } else {
        this.buddies = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case USERS_FIELD_ID:
      return this.users;
    case BUDDIES_FIELD_ID:
      return this.buddies;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case USERS_FIELD_ID:
      return isSetUsers();
    case BUDDIES_FIELD_ID:
      return isSetBuddies();
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
          case USERS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list227 = iprot.readListBegin();
                this.users = new List< Contact>();
                for( _i228 in 0 ... _list227.size)
                {
                  var _elem229 : Contact;
                  _elem229 = new Contact();
                  _elem229.read(iprot);
                  this.users.add(_elem229);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case BUDDIES_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list230 = iprot.readListBegin();
                this.buddies = new List< Contact>();
                for( _i231 in 0 ... _list230.size)
                {
                  var _elem232 : Contact;
                  _elem232 = new Contact();
                  _elem232.read(iprot);
                  this.buddies.add(_elem232);
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
      if (this.users != null) {
        oprot.writeFieldBegin(USERS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.users.length));
          for( elem233 in this.users)
          {
            elem233.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.buddies != null) {
        oprot.writeFieldBegin(BUDDIES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.buddies.length));
          for( elem234 in this.buddies)
          {
            elem234.write(oprot);
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
    var ret : String = "ProximityMatchCandidateResult(";
    var first : Bool = true;

    ret += "users:";
    if (this.users == null) {
      ret += "null";
    } else {
      ret += this.users;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "buddies:";
    if (this.buddies == null) {
      ret += "null";
    } else {
      ret += this.buddies;
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

