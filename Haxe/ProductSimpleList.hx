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


class ProductSimpleList implements TBase {
  
  static var STRUCT_DESC = { new TStruct("ProductSimpleList"); };
  static var HAS_NEXT_FIELD_DESC = { new TField("hasNext", TType.BOOL, 1); };
  static var REINVOKE_HOUR_FIELD_DESC = { new TField("reinvokeHour", TType.I32, 2); };
  static var LAST_VERSION_SEQ_FIELD_DESC = { new TField("lastVersionSeq", TType.I64, 3); };
  static var PRODUCT_LIST_FIELD_DESC = { new TField("productList", TType.LIST, 4); };
  static var RECENT_NEW_RELEASE_DATE_FIELD_DESC = { new TField("recentNewReleaseDate", TType.I64, 5); };
  static var RECENT_EVENT_RELEASE_DATE_FIELD_DESC = { new TField("recentEventReleaseDate", TType.I64, 6); };

  @:isVar
  public var hasNext(get,set) : Bool;
  @:isVar
  public var reinvokeHour(get,set) : haxe.Int32;
  @:isVar
  public var lastVersionSeq(get,set) : haxe.Int64;
  @:isVar
  public var productList(get,set) : List< ProductSimple>;
  @:isVar
  public var recentNewReleaseDate(get,set) : haxe.Int64;
  @:isVar
  public var recentEventReleaseDate(get,set) : haxe.Int64;

  inline static var HASNEXT_FIELD_ID : Int = 1;
  inline static var REINVOKEHOUR_FIELD_ID : Int = 2;
  inline static var LASTVERSIONSEQ_FIELD_ID : Int = 3;
  inline static var PRODUCTLIST_FIELD_ID : Int = 4;
  inline static var RECENTNEWRELEASEDATE_FIELD_ID : Int = 5;
  inline static var RECENTEVENTRELEASEDATE_FIELD_ID : Int = 6;

  private var __isset_hasNext : Bool = false;
  private var __isset_reinvokeHour : Bool = false;
  private var __isset_lastVersionSeq : Bool = false;
  private var __isset_recentNewReleaseDate : Bool = false;
  private var __isset_recentEventReleaseDate : Bool = false;

  public function new() {
  }

  public function get_hasNext() : Bool {
    return this.hasNext;
  }

  public function set_hasNext(hasNext:Bool) : Bool {
    this.hasNext = hasNext;
    this.__isset_hasNext = true;
    return this.hasNext;
  }

  public function unsetHasNext() : Void {
    this.__isset_hasNext = false;
  }

  // Returns true if field hasNext is set (has been assigned a value) and false otherwise
  public function isSetHasNext() : Bool {
    return this.__isset_hasNext;
  }

  public function get_reinvokeHour() : haxe.Int32 {
    return this.reinvokeHour;
  }

  public function set_reinvokeHour(reinvokeHour:haxe.Int32) : haxe.Int32 {
    this.reinvokeHour = reinvokeHour;
    this.__isset_reinvokeHour = true;
    return this.reinvokeHour;
  }

  public function unsetReinvokeHour() : Void {
    this.__isset_reinvokeHour = false;
  }

  // Returns true if field reinvokeHour is set (has been assigned a value) and false otherwise
  public function isSetReinvokeHour() : Bool {
    return this.__isset_reinvokeHour;
  }

  public function get_lastVersionSeq() : haxe.Int64 {
    return this.lastVersionSeq;
  }

  public function set_lastVersionSeq(lastVersionSeq:haxe.Int64) : haxe.Int64 {
    this.lastVersionSeq = lastVersionSeq;
    this.__isset_lastVersionSeq = true;
    return this.lastVersionSeq;
  }

  public function unsetLastVersionSeq() : Void {
    this.__isset_lastVersionSeq = false;
  }

  // Returns true if field lastVersionSeq is set (has been assigned a value) and false otherwise
  public function isSetLastVersionSeq() : Bool {
    return this.__isset_lastVersionSeq;
  }

  public function get_productList() : List< ProductSimple> {
    return this.productList;
  }

  public function set_productList(productList:List< ProductSimple>) : List< ProductSimple> {
    this.productList = productList;
    return this.productList;
  }

  public function unsetProductList() : Void {
    this.productList = null;
  }

  // Returns true if field productList is set (has been assigned a value) and false otherwise
  public function isSetProductList() : Bool {
    return this.productList != null;
  }

  public function get_recentNewReleaseDate() : haxe.Int64 {
    return this.recentNewReleaseDate;
  }

  public function set_recentNewReleaseDate(recentNewReleaseDate:haxe.Int64) : haxe.Int64 {
    this.recentNewReleaseDate = recentNewReleaseDate;
    this.__isset_recentNewReleaseDate = true;
    return this.recentNewReleaseDate;
  }

  public function unsetRecentNewReleaseDate() : Void {
    this.__isset_recentNewReleaseDate = false;
  }

  // Returns true if field recentNewReleaseDate is set (has been assigned a value) and false otherwise
  public function isSetRecentNewReleaseDate() : Bool {
    return this.__isset_recentNewReleaseDate;
  }

  public function get_recentEventReleaseDate() : haxe.Int64 {
    return this.recentEventReleaseDate;
  }

  public function set_recentEventReleaseDate(recentEventReleaseDate:haxe.Int64) : haxe.Int64 {
    this.recentEventReleaseDate = recentEventReleaseDate;
    this.__isset_recentEventReleaseDate = true;
    return this.recentEventReleaseDate;
  }

  public function unsetRecentEventReleaseDate() : Void {
    this.__isset_recentEventReleaseDate = false;
  }

  // Returns true if field recentEventReleaseDate is set (has been assigned a value) and false otherwise
  public function isSetRecentEventReleaseDate() : Bool {
    return this.__isset_recentEventReleaseDate;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case HASNEXT_FIELD_ID:
      if (value == null) {
        unsetHasNext();
      } else {
        this.hasNext = value;
      }

    case REINVOKEHOUR_FIELD_ID:
      if (value == null) {
        unsetReinvokeHour();
      } else {
        this.reinvokeHour = value;
      }

    case LASTVERSIONSEQ_FIELD_ID:
      if (value == null) {
        unsetLastVersionSeq();
      } else {
        this.lastVersionSeq = value;
      }

    case PRODUCTLIST_FIELD_ID:
      if (value == null) {
        unsetProductList();
      } else {
        this.productList = value;
      }

    case RECENTNEWRELEASEDATE_FIELD_ID:
      if (value == null) {
        unsetRecentNewReleaseDate();
      } else {
        this.recentNewReleaseDate = value;
      }

    case RECENTEVENTRELEASEDATE_FIELD_ID:
      if (value == null) {
        unsetRecentEventReleaseDate();
      } else {
        this.recentEventReleaseDate = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case HASNEXT_FIELD_ID:
      return this.hasNext;
    case REINVOKEHOUR_FIELD_ID:
      return this.reinvokeHour;
    case LASTVERSIONSEQ_FIELD_ID:
      return this.lastVersionSeq;
    case PRODUCTLIST_FIELD_ID:
      return this.productList;
    case RECENTNEWRELEASEDATE_FIELD_ID:
      return this.recentNewReleaseDate;
    case RECENTEVENTRELEASEDATE_FIELD_ID:
      return this.recentEventReleaseDate;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case HASNEXT_FIELD_ID:
      return isSetHasNext();
    case REINVOKEHOUR_FIELD_ID:
      return isSetReinvokeHour();
    case LASTVERSIONSEQ_FIELD_ID:
      return isSetLastVersionSeq();
    case PRODUCTLIST_FIELD_ID:
      return isSetProductList();
    case RECENTNEWRELEASEDATE_FIELD_ID:
      return isSetRecentNewReleaseDate();
    case RECENTEVENTRELEASEDATE_FIELD_ID:
      return isSetRecentEventReleaseDate();
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
          case HASNEXT_FIELD_ID:
            if (field.type == TType.BOOL) {
              this.hasNext = iprot.readBool();
              this.__isset_hasNext = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case REINVOKEHOUR_FIELD_ID:
            if (field.type == TType.I32) {
              this.reinvokeHour = iprot.readI32();
              this.__isset_reinvokeHour = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case LASTVERSIONSEQ_FIELD_ID:
            if (field.type == TType.I64) {
              this.lastVersionSeq = iprot.readI64();
              this.__isset_lastVersionSeq = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PRODUCTLIST_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list223 = iprot.readListBegin();
                this.productList = new List< ProductSimple>();
                for( _i224 in 0 ... _list223.size)
                {
                  var _elem225 : ProductSimple;
                  _elem225 = new ProductSimple();
                  _elem225.read(iprot);
                  this.productList.add(_elem225);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case RECENTNEWRELEASEDATE_FIELD_ID:
            if (field.type == TType.I64) {
              this.recentNewReleaseDate = iprot.readI64();
              this.__isset_recentNewReleaseDate = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case RECENTEVENTRELEASEDATE_FIELD_ID:
            if (field.type == TType.I64) {
              this.recentEventReleaseDate = iprot.readI64();
              this.__isset_recentEventReleaseDate = true;
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
      oprot.writeFieldBegin(HAS_NEXT_FIELD_DESC);
      oprot.writeBool(this.hasNext);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(REINVOKE_HOUR_FIELD_DESC);
      oprot.writeI32(this.reinvokeHour);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LAST_VERSION_SEQ_FIELD_DESC);
      oprot.writeI64(this.lastVersionSeq);
      oprot.writeFieldEnd();
      if (this.productList != null) {
        oprot.writeFieldBegin(PRODUCT_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.productList.length));
          for( elem226 in this.productList)
          {
            elem226.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(RECENT_NEW_RELEASE_DATE_FIELD_DESC);
      oprot.writeI64(this.recentNewReleaseDate);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RECENT_EVENT_RELEASE_DATE_FIELD_DESC);
      oprot.writeI64(this.recentEventReleaseDate);
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
    var ret : String = "ProductSimpleList(";
    var first : Bool = true;

    ret += "hasNext:";
    ret += this.hasNext;
    first = false;
    if (!first) ret +=  ", ";
    ret += "reinvokeHour:";
    ret += this.reinvokeHour;
    first = false;
    if (!first) ret +=  ", ";
    ret += "lastVersionSeq:";
    ret += this.lastVersionSeq;
    first = false;
    if (!first) ret +=  ", ";
    ret += "productList:";
    if (this.productList == null) {
      ret += "null";
    } else {
      ret += this.productList;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "recentNewReleaseDate:";
    ret += this.recentNewReleaseDate;
    first = false;
    if (!first) ret +=  ", ";
    ret += "recentEventReleaseDate:";
    ret += this.recentEventReleaseDate;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

