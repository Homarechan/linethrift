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


class FindContactsByPhone_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("findContactsByPhone_args"); };
  static var PHONES_FIELD_DESC = { new TField("phones", TType.SET, 2); };

  @:isVar
  public var phones(get,set) : StringSet;

  inline static var PHONES_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_phones() : StringSet {
    return this.phones;
  }

  public function set_phones(phones:StringSet) : StringSet {
    this.phones = phones;
    return this.phones;
  }

  public function unsetPhones() : Void {
    this.phones = null;
  }

  // Returns true if field phones is set (has been assigned a value) and false otherwise
  public function isSetPhones() : Bool {
    return this.phones != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case PHONES_FIELD_ID:
      if (value == null) {
        unsetPhones();
      } else {
        this.phones = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case PHONES_FIELD_ID:
      return this.phones;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case PHONES_FIELD_ID:
      return isSetPhones();
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
          case PHONES_FIELD_ID:
            if (field.type == TType.SET) {
              {
                var _set986 = iprot.readSetBegin();
                this.phones = new StringSet();
                for( _i987 in 0 ... _set986.size)
                {
                  var _elem988 : String;
                  _elem988 = iprot.readString();
                  this.phones.add(_elem988);
                }
                iprot.readSetEnd();
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
      if (this.phones != null) {
        oprot.writeFieldBegin(PHONES_FIELD_DESC);
        {
          oprot.writeSetBegin(new TSet(TType.STRING, this.phones.size));
          for( elem989 in this.phones.toArray())
          {
            oprot.writeString(elem989);
          }
          oprot.writeSetEnd();
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
    var ret : String = "findContactsByPhone_args(";
    var first : Bool = true;

    ret += "phones:";
    if (this.phones == null) {
      ret += "null";
    } else {
      ret += this.phones;
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

