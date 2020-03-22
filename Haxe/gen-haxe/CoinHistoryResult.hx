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


class CoinHistoryResult implements TBase {
  
  static var STRUCT_DESC = { new TStruct("CoinHistoryResult"); };
  static var HISTORYS_FIELD_DESC = { new TField("historys", TType.LIST, 1); };
  static var BALANCE_FIELD_DESC = { new TField("balance", TType.STRUCT, 2); };
  static var HAS_NEXT_FIELD_DESC = { new TField("hasNext", TType.BOOL, 3); };

  @:isVar
  public var historys(get,set) : List< CoinHistory>;
  @:isVar
  public var balance(get,set) : Coin;
  @:isVar
  public var hasNext(get,set) : Bool;

  inline static var HISTORYS_FIELD_ID : Int = 1;
  inline static var BALANCE_FIELD_ID : Int = 2;
  inline static var HASNEXT_FIELD_ID : Int = 3;

  private var __isset_hasNext : Bool = false;

  public function new() {
  }

  public function get_historys() : List< CoinHistory> {
    return this.historys;
  }

  public function set_historys(historys:List< CoinHistory>) : List< CoinHistory> {
    this.historys = historys;
    return this.historys;
  }

  public function unsetHistorys() : Void {
    this.historys = null;
  }

  // Returns true if field historys is set (has been assigned a value) and false otherwise
  public function isSetHistorys() : Bool {
    return this.historys != null;
  }

  public function get_balance() : Coin {
    return this.balance;
  }

  public function set_balance(balance:Coin) : Coin {
    this.balance = balance;
    return this.balance;
  }

  public function unsetBalance() : Void {
    this.balance = null;
  }

  // Returns true if field balance is set (has been assigned a value) and false otherwise
  public function isSetBalance() : Bool {
    return this.balance != null;
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

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case HISTORYS_FIELD_ID:
      if (value == null) {
        unsetHistorys();
      } else {
        this.historys = value;
      }

    case BALANCE_FIELD_ID:
      if (value == null) {
        unsetBalance();
      } else {
        this.balance = value;
      }

    case HASNEXT_FIELD_ID:
      if (value == null) {
        unsetHasNext();
      } else {
        this.hasNext = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case HISTORYS_FIELD_ID:
      return this.historys;
    case BALANCE_FIELD_ID:
      return this.balance;
    case HASNEXT_FIELD_ID:
      return this.hasNext;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case HISTORYS_FIELD_ID:
      return isSetHistorys();
    case BALANCE_FIELD_ID:
      return isSetBalance();
    case HASNEXT_FIELD_ID:
      return isSetHasNext();
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
          case HISTORYS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list115 = iprot.readListBegin();
                this.historys = new List< CoinHistory>();
                for( _i116 in 0 ... _list115.size)
                {
                  var _elem117 : CoinHistory;
                  _elem117 = new CoinHistory();
                  _elem117.read(iprot);
                  this.historys.add(_elem117);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case BALANCE_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.balance = new Coin();
              this.balance.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case HASNEXT_FIELD_ID:
            if (field.type == TType.BOOL) {
              this.hasNext = iprot.readBool();
              this.__isset_hasNext = true;
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
      if (this.historys != null) {
        oprot.writeFieldBegin(HISTORYS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.historys.length));
          for( elem118 in this.historys)
          {
            elem118.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.balance != null) {
        oprot.writeFieldBegin(BALANCE_FIELD_DESC);
        this.balance.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(HAS_NEXT_FIELD_DESC);
      oprot.writeBool(this.hasNext);
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
    var ret : String = "CoinHistoryResult(";
    var first : Bool = true;

    ret += "historys:";
    if (this.historys == null) {
      ret += "null";
    } else {
      ret += this.historys;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "balance:";
    if (this.balance == null) {
      ret += "null";
    } else {
      ret += this.balance;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "hasNext:";
    ret += this.hasNext;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

