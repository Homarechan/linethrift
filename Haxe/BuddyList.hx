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


class BuddyList implements TBase {
  
  static var STRUCT_DESC = { new TStruct("BuddyList"); };
  static var CLASSIFICATION_FIELD_DESC = { new TField("classification", TType.STRING, 1); };
  static var DISPLAY_NAME_FIELD_DESC = { new TField("displayName", TType.STRING, 2); };
  static var TOTAL_BUDDY_COUNT_FIELD_DESC = { new TField("totalBuddyCount", TType.I32, 3); };
  static var POPULAR_CONTACTS_FIELD_DESC = { new TField("popularContacts", TType.LIST, 4); };

  @:isVar
  public var classification(get,set) : String;
  @:isVar
  public var displayName(get,set) : String;
  @:isVar
  public var totalBuddyCount(get,set) : haxe.Int32;
  @:isVar
  public var popularContacts(get,set) : List< Contact>;

  inline static var CLASSIFICATION_FIELD_ID : Int = 1;
  inline static var DISPLAYNAME_FIELD_ID : Int = 2;
  inline static var TOTALBUDDYCOUNT_FIELD_ID : Int = 3;
  inline static var POPULARCONTACTS_FIELD_ID : Int = 4;

  private var __isset_totalBuddyCount : Bool = false;

  public function new() {
  }

  public function get_classification() : String {
    return this.classification;
  }

  public function set_classification(classification:String) : String {
    this.classification = classification;
    return this.classification;
  }

  public function unsetClassification() : Void {
    this.classification = null;
  }

  // Returns true if field classification is set (has been assigned a value) and false otherwise
  public function isSetClassification() : Bool {
    return this.classification != null;
  }

  public function get_displayName() : String {
    return this.displayName;
  }

  public function set_displayName(displayName:String) : String {
    this.displayName = displayName;
    return this.displayName;
  }

  public function unsetDisplayName() : Void {
    this.displayName = null;
  }

  // Returns true if field displayName is set (has been assigned a value) and false otherwise
  public function isSetDisplayName() : Bool {
    return this.displayName != null;
  }

  public function get_totalBuddyCount() : haxe.Int32 {
    return this.totalBuddyCount;
  }

  public function set_totalBuddyCount(totalBuddyCount:haxe.Int32) : haxe.Int32 {
    this.totalBuddyCount = totalBuddyCount;
    this.__isset_totalBuddyCount = true;
    return this.totalBuddyCount;
  }

  public function unsetTotalBuddyCount() : Void {
    this.__isset_totalBuddyCount = false;
  }

  // Returns true if field totalBuddyCount is set (has been assigned a value) and false otherwise
  public function isSetTotalBuddyCount() : Bool {
    return this.__isset_totalBuddyCount;
  }

  public function get_popularContacts() : List< Contact> {
    return this.popularContacts;
  }

  public function set_popularContacts(popularContacts:List< Contact>) : List< Contact> {
    this.popularContacts = popularContacts;
    return this.popularContacts;
  }

  public function unsetPopularContacts() : Void {
    this.popularContacts = null;
  }

  // Returns true if field popularContacts is set (has been assigned a value) and false otherwise
  public function isSetPopularContacts() : Bool {
    return this.popularContacts != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case CLASSIFICATION_FIELD_ID:
      if (value == null) {
        unsetClassification();
      } else {
        this.classification = value;
      }

    case DISPLAYNAME_FIELD_ID:
      if (value == null) {
        unsetDisplayName();
      } else {
        this.displayName = value;
      }

    case TOTALBUDDYCOUNT_FIELD_ID:
      if (value == null) {
        unsetTotalBuddyCount();
      } else {
        this.totalBuddyCount = value;
      }

    case POPULARCONTACTS_FIELD_ID:
      if (value == null) {
        unsetPopularContacts();
      } else {
        this.popularContacts = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case CLASSIFICATION_FIELD_ID:
      return this.classification;
    case DISPLAYNAME_FIELD_ID:
      return this.displayName;
    case TOTALBUDDYCOUNT_FIELD_ID:
      return this.totalBuddyCount;
    case POPULARCONTACTS_FIELD_ID:
      return this.popularContacts;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case CLASSIFICATION_FIELD_ID:
      return isSetClassification();
    case DISPLAYNAME_FIELD_ID:
      return isSetDisplayName();
    case TOTALBUDDYCOUNT_FIELD_ID:
      return isSetTotalBuddyCount();
    case POPULARCONTACTS_FIELD_ID:
      return isSetPopularContacts();
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
          case CLASSIFICATION_FIELD_ID:
            if (field.type == TType.STRING) {
              this.classification = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case DISPLAYNAME_FIELD_ID:
            if (field.type == TType.STRING) {
              this.displayName = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case TOTALBUDDYCOUNT_FIELD_ID:
            if (field.type == TType.I32) {
              this.totalBuddyCount = iprot.readI32();
              this.__isset_totalBuddyCount = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case POPULARCONTACTS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list60 = iprot.readListBegin();
                this.popularContacts = new List< Contact>();
                for( _i61 in 0 ... _list60.size)
                {
                  var _elem62 : Contact;
                  _elem62 = new Contact();
                  _elem62.read(iprot);
                  this.popularContacts.add(_elem62);
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
      if (this.classification != null) {
        oprot.writeFieldBegin(CLASSIFICATION_FIELD_DESC);
        oprot.writeString(this.classification);
        oprot.writeFieldEnd();
      }
      if (this.displayName != null) {
        oprot.writeFieldBegin(DISPLAY_NAME_FIELD_DESC);
        oprot.writeString(this.displayName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TOTAL_BUDDY_COUNT_FIELD_DESC);
      oprot.writeI32(this.totalBuddyCount);
      oprot.writeFieldEnd();
      if (this.popularContacts != null) {
        oprot.writeFieldBegin(POPULAR_CONTACTS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.popularContacts.length));
          for( elem63 in this.popularContacts)
          {
            elem63.write(oprot);
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
    var ret : String = "BuddyList(";
    var first : Bool = true;

    ret += "classification:";
    if (this.classification == null) {
      ret += "null";
    } else {
      ret += this.classification;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "displayName:";
    if (this.displayName == null) {
      ret += "null";
    } else {
      ret += this.displayName;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "totalBuddyCount:";
    ret += this.totalBuddyCount;
    first = false;
    if (!first) ret +=  ", ";
    ret += "popularContacts:";
    if (this.popularContacts == null) {
      ret += "null";
    } else {
      ret += this.popularContacts;
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

