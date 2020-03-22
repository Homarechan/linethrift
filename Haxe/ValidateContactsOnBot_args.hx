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


class ValidateContactsOnBot_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("validateContactsOnBot_args"); };
  static var CONTACTS_FIELD_DESC = { new TField("contacts", TType.LIST, 2); };

  @:isVar
  public var contacts(get,set) : List< String>;

  inline static var CONTACTS_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_contacts() : List< String> {
    return this.contacts;
  }

  public function set_contacts(contacts:List< String>) : List< String> {
    this.contacts = contacts;
    return this.contacts;
  }

  public function unsetContacts() : Void {
    this.contacts = null;
  }

  // Returns true if field contacts is set (has been assigned a value) and false otherwise
  public function isSetContacts() : Bool {
    return this.contacts != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case CONTACTS_FIELD_ID:
      if (value == null) {
        unsetContacts();
      } else {
        this.contacts = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case CONTACTS_FIELD_ID:
      return this.contacts;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case CONTACTS_FIELD_ID:
      return isSetContacts();
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
          case CONTACTS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list1283 = iprot.readListBegin();
                this.contacts = new List< String>();
                for( _i1284 in 0 ... _list1283.size)
                {
                  var _elem1285 : String;
                  _elem1285 = iprot.readString();
                  this.contacts.add(_elem1285);
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
      if (this.contacts != null) {
        oprot.writeFieldBegin(CONTACTS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.contacts.length));
          for( elem1286 in this.contacts)
          {
            oprot.writeString(elem1286);
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
    var ret : String = "validateContactsOnBot_args(";
    var first : Bool = true;

    ret += "contacts:";
    if (this.contacts == null) {
      ret += "null";
    } else {
      ret += this.contacts;
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

