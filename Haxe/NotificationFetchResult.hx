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


class NotificationFetchResult implements TBase {
  
  static var STRUCT_DESC = { new TStruct("NotificationFetchResult"); };
  static var FETCH_MODE_FIELD_DESC = { new TField("fetchMode", TType.I32, 1); };
  static var ITEM_LIST_FIELD_DESC = { new TField("itemList", TType.LIST, 2); };

  @:isVar
  public var fetchMode(get,set) : Int;
  @:isVar
  public var itemList(get,set) : List< NotificationItem>;

  inline static var FETCHMODE_FIELD_ID : Int = 1;
  inline static var ITEMLIST_FIELD_ID : Int = 2;

  private var __isset_fetchMode : Bool = false;

  public function new() {
  }

  public function get_fetchMode() : Int {
    return this.fetchMode;
  }

  public function set_fetchMode(fetchMode:Int) : Int {
    this.fetchMode = fetchMode;
    this.__isset_fetchMode = true;
    return this.fetchMode;
  }

  public function unsetFetchMode() : Void {
    this.__isset_fetchMode = false;
  }

  // Returns true if field fetchMode is set (has been assigned a value) and false otherwise
  public function isSetFetchMode() : Bool {
    return this.__isset_fetchMode;
  }

  public function get_itemList() : List< NotificationItem> {
    return this.itemList;
  }

  public function set_itemList(itemList:List< NotificationItem>) : List< NotificationItem> {
    this.itemList = itemList;
    return this.itemList;
  }

  public function unsetItemList() : Void {
    this.itemList = null;
  }

  // Returns true if field itemList is set (has been assigned a value) and false otherwise
  public function isSetItemList() : Bool {
    return this.itemList != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case FETCHMODE_FIELD_ID:
      if (value == null) {
        unsetFetchMode();
      } else {
        this.fetchMode = value;
      }

    case ITEMLIST_FIELD_ID:
      if (value == null) {
        unsetItemList();
      } else {
        this.itemList = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case FETCHMODE_FIELD_ID:
      return this.fetchMode;
    case ITEMLIST_FIELD_ID:
      return this.itemList;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case FETCHMODE_FIELD_ID:
      return isSetFetchMode();
    case ITEMLIST_FIELD_ID:
      return isSetItemList();
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
          case FETCHMODE_FIELD_ID:
            if (field.type == TType.I32) {
              this.fetchMode = iprot.readI32();
              this.__isset_fetchMode = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case ITEMLIST_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list200 = iprot.readListBegin();
                this.itemList = new List< NotificationItem>();
                for( _i201 in 0 ... _list200.size)
                {
                  var _elem202 : NotificationItem;
                  _elem202 = new NotificationItem();
                  _elem202.read(iprot);
                  this.itemList.add(_elem202);
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
      oprot.writeFieldBegin(FETCH_MODE_FIELD_DESC);
      oprot.writeI32(this.fetchMode);
      oprot.writeFieldEnd();
      if (this.itemList != null) {
        oprot.writeFieldBegin(ITEM_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.itemList.length));
          for( elem203 in this.itemList)
          {
            elem203.write(oprot);
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
    var ret : String = "NotificationFetchResult(";
    var first : Bool = true;

    ret += "fetchMode:";
    var fetchMode_name : String = .NotificationItemFetchMode.VALUES_TO_NAMES[this.fetchMode];
    if (fetchMode_name != null) {
      ret += fetchMode_name;
      ret += " (";
    }
    ret += this.fetchMode;
    if (fetchMode_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "itemList:";
    if (this.itemList == null) {
      ret += "null";
    } else {
      ret += this.itemList;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetFetchMode() && !.NotificationItemFetchMode.VALID_VALUES.contains(fetchMode)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'fetchMode' has been assigned the invalid value " + fetchMode);
    }
  }

}

