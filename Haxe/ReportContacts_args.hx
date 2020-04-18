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


class ReportContacts_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("reportContacts_args"); };
  static var SYNC_OP_REVISION_FIELD_DESC = { new TField("syncOpRevision", TType.I64, 2); };
  static var CATEGORY_FIELD_DESC = { new TField("category", TType.I32, 3); };
  static var CONTACT_REPORTS_FIELD_DESC = { new TField("contactReports", TType.LIST, 4); };
  static var ACTION_TYPE_FIELD_DESC = { new TField("actionType", TType.I32, 5); };

  @:isVar
  public var syncOpRevision(get,set) : haxe.Int64;
  @:isVar
  public var category(get,set) : Int;
  @:isVar
  public var contactReports(get,set) : List< ContactReport>;
  @:isVar
  public var actionType(get,set) : Int;

  inline static var SYNCOPREVISION_FIELD_ID : Int = 2;
  inline static var CATEGORY_FIELD_ID : Int = 3;
  inline static var CONTACTREPORTS_FIELD_ID : Int = 4;
  inline static var ACTIONTYPE_FIELD_ID : Int = 5;

  private var __isset_syncOpRevision : Bool = false;
  private var __isset_category : Bool = false;
  private var __isset_actionType : Bool = false;

  public function new() {
  }

  public function get_syncOpRevision() : haxe.Int64 {
    return this.syncOpRevision;
  }

  public function set_syncOpRevision(syncOpRevision:haxe.Int64) : haxe.Int64 {
    this.syncOpRevision = syncOpRevision;
    this.__isset_syncOpRevision = true;
    return this.syncOpRevision;
  }

  public function unsetSyncOpRevision() : Void {
    this.__isset_syncOpRevision = false;
  }

  // Returns true if field syncOpRevision is set (has been assigned a value) and false otherwise
  public function isSetSyncOpRevision() : Bool {
    return this.__isset_syncOpRevision;
  }

  public function get_category() : Int {
    return this.category;
  }

  public function set_category(category:Int) : Int {
    this.category = category;
    this.__isset_category = true;
    return this.category;
  }

  public function unsetCategory() : Void {
    this.__isset_category = false;
  }

  // Returns true if field category is set (has been assigned a value) and false otherwise
  public function isSetCategory() : Bool {
    return this.__isset_category;
  }

  public function get_contactReports() : List< ContactReport> {
    return this.contactReports;
  }

  public function set_contactReports(contactReports:List< ContactReport>) : List< ContactReport> {
    this.contactReports = contactReports;
    return this.contactReports;
  }

  public function unsetContactReports() : Void {
    this.contactReports = null;
  }

  // Returns true if field contactReports is set (has been assigned a value) and false otherwise
  public function isSetContactReports() : Bool {
    return this.contactReports != null;
  }

  public function get_actionType() : Int {
    return this.actionType;
  }

  public function set_actionType(actionType:Int) : Int {
    this.actionType = actionType;
    this.__isset_actionType = true;
    return this.actionType;
  }

  public function unsetActionType() : Void {
    this.__isset_actionType = false;
  }

  // Returns true if field actionType is set (has been assigned a value) and false otherwise
  public function isSetActionType() : Bool {
    return this.__isset_actionType;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SYNCOPREVISION_FIELD_ID:
      if (value == null) {
        unsetSyncOpRevision();
      } else {
        this.syncOpRevision = value;
      }

    case CATEGORY_FIELD_ID:
      if (value == null) {
        unsetCategory();
      } else {
        this.category = value;
      }

    case CONTACTREPORTS_FIELD_ID:
      if (value == null) {
        unsetContactReports();
      } else {
        this.contactReports = value;
      }

    case ACTIONTYPE_FIELD_ID:
      if (value == null) {
        unsetActionType();
      } else {
        this.actionType = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SYNCOPREVISION_FIELD_ID:
      return this.syncOpRevision;
    case CATEGORY_FIELD_ID:
      return this.category;
    case CONTACTREPORTS_FIELD_ID:
      return this.contactReports;
    case ACTIONTYPE_FIELD_ID:
      return this.actionType;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SYNCOPREVISION_FIELD_ID:
      return isSetSyncOpRevision();
    case CATEGORY_FIELD_ID:
      return isSetCategory();
    case CONTACTREPORTS_FIELD_ID:
      return isSetContactReports();
    case ACTIONTYPE_FIELD_ID:
      return isSetActionType();
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
          case SYNCOPREVISION_FIELD_ID:
            if (field.type == TType.I64) {
              this.syncOpRevision = iprot.readI64();
              this.__isset_syncOpRevision = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CATEGORY_FIELD_ID:
            if (field.type == TType.I32) {
              this.category = iprot.readI32();
              this.__isset_category = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CONTACTREPORTS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list1159 = iprot.readListBegin();
                this.contactReports = new List< ContactReport>();
                for( _i1160 in 0 ... _list1159.size)
                {
                  var _elem1161 : ContactReport;
                  _elem1161 = new ContactReport();
                  _elem1161.read(iprot);
                  this.contactReports.add(_elem1161);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case ACTIONTYPE_FIELD_ID:
            if (field.type == TType.I32) {
              this.actionType = iprot.readI32();
              this.__isset_actionType = true;
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
      oprot.writeFieldBegin(SYNC_OP_REVISION_FIELD_DESC);
      oprot.writeI64(this.syncOpRevision);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CATEGORY_FIELD_DESC);
      oprot.writeI32(this.category);
      oprot.writeFieldEnd();
      if (this.contactReports != null) {
        oprot.writeFieldBegin(CONTACT_REPORTS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.contactReports.length));
          for( elem1162 in this.contactReports)
          {
            elem1162.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ACTION_TYPE_FIELD_DESC);
      oprot.writeI32(this.actionType);
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
    var ret : String = "reportContacts_args(";
    var first : Bool = true;

    ret += "syncOpRevision:";
    ret += this.syncOpRevision;
    first = false;
    if (!first) ret +=  ", ";
    ret += "category:";
    var category_name : String = .SyncCategory.VALUES_TO_NAMES[this.category];
    if (category_name != null) {
      ret += category_name;
      ret += " (";
    }
    ret += this.category;
    if (category_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "contactReports:";
    if (this.contactReports == null) {
      ret += "null";
    } else {
      ret += this.contactReports;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "actionType:";
    var actionType_name : String = .SyncActionType.VALUES_TO_NAMES[this.actionType];
    if (actionType_name != null) {
      ret += actionType_name;
      ret += " (";
    }
    ret += this.actionType;
    if (actionType_name != null) {
      ret += ")";
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetCategory() && !.SyncCategory.VALID_VALUES.contains(category)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'category' has been assigned the invalid value " + category);
    }
    if (isSetActionType() && !.SyncActionType.VALID_VALUES.contains(actionType)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'actionType' has been assigned the invalid value " + actionType);
    }
  }

}

