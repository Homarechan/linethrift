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


class CoinHistory implements TBase {
  
  static var STRUCT_DESC = { new TStruct("CoinHistory"); };
  static var PAY_DATE_FIELD_DESC = { new TField("payDate", TType.I64, 1); };
  static var COIN_BALANCE_FIELD_DESC = { new TField("coinBalance", TType.I32, 2); };
  static var COIN_FIELD_DESC = { new TField("coin", TType.I32, 3); };
  static var PRICE_FIELD_DESC = { new TField("price", TType.STRING, 4); };
  static var TITLE_FIELD_DESC = { new TField("title", TType.STRING, 5); };
  static var REFUND_FIELD_DESC = { new TField("refund", TType.BOOL, 6); };
  static var PAY_SEQ_FIELD_DESC = { new TField("paySeq", TType.STRING, 7); };
  static var CURRENCY_FIELD_DESC = { new TField("currency", TType.STRING, 8); };
  static var CURRENCY_SIGN_FIELD_DESC = { new TField("currencySign", TType.STRING, 9); };
  static var DISPLAY_PRICE_FIELD_DESC = { new TField("displayPrice", TType.STRING, 10); };
  static var PAYLOAD_FIELD_DESC = { new TField("payload", TType.STRUCT, 11); };
  static var CHANNEL_ID_FIELD_DESC = { new TField("channelId", TType.STRING, 12); };

  @:isVar
  public var payDate(get,set) : haxe.Int64;
  @:isVar
  public var coinBalance(get,set) : haxe.Int32;
  @:isVar
  public var coin(get,set) : haxe.Int32;
  @:isVar
  public var price(get,set) : String;
  @:isVar
  public var title(get,set) : String;
  @:isVar
  public var refund(get,set) : Bool;
  @:isVar
  public var paySeq(get,set) : String;
  @:isVar
  public var currency(get,set) : String;
  @:isVar
  public var currencySign(get,set) : String;
  @:isVar
  public var displayPrice(get,set) : String;
  @:isVar
  public var payload(get,set) : CoinPayLoad;
  @:isVar
  public var channelId(get,set) : String;

  inline static var PAYDATE_FIELD_ID : Int = 1;
  inline static var COINBALANCE_FIELD_ID : Int = 2;
  inline static var COIN_FIELD_ID : Int = 3;
  inline static var PRICE_FIELD_ID : Int = 4;
  inline static var TITLE_FIELD_ID : Int = 5;
  inline static var REFUND_FIELD_ID : Int = 6;
  inline static var PAYSEQ_FIELD_ID : Int = 7;
  inline static var CURRENCY_FIELD_ID : Int = 8;
  inline static var CURRENCYSIGN_FIELD_ID : Int = 9;
  inline static var DISPLAYPRICE_FIELD_ID : Int = 10;
  inline static var PAYLOAD_FIELD_ID : Int = 11;
  inline static var CHANNELID_FIELD_ID : Int = 12;

  private var __isset_payDate : Bool = false;
  private var __isset_coinBalance : Bool = false;
  private var __isset_coin : Bool = false;
  private var __isset_refund : Bool = false;

  public function new() {
  }

  public function get_payDate() : haxe.Int64 {
    return this.payDate;
  }

  public function set_payDate(payDate:haxe.Int64) : haxe.Int64 {
    this.payDate = payDate;
    this.__isset_payDate = true;
    return this.payDate;
  }

  public function unsetPayDate() : Void {
    this.__isset_payDate = false;
  }

  // Returns true if field payDate is set (has been assigned a value) and false otherwise
  public function isSetPayDate() : Bool {
    return this.__isset_payDate;
  }

  public function get_coinBalance() : haxe.Int32 {
    return this.coinBalance;
  }

  public function set_coinBalance(coinBalance:haxe.Int32) : haxe.Int32 {
    this.coinBalance = coinBalance;
    this.__isset_coinBalance = true;
    return this.coinBalance;
  }

  public function unsetCoinBalance() : Void {
    this.__isset_coinBalance = false;
  }

  // Returns true if field coinBalance is set (has been assigned a value) and false otherwise
  public function isSetCoinBalance() : Bool {
    return this.__isset_coinBalance;
  }

  public function get_coin() : haxe.Int32 {
    return this.coin;
  }

  public function set_coin(coin:haxe.Int32) : haxe.Int32 {
    this.coin = coin;
    this.__isset_coin = true;
    return this.coin;
  }

  public function unsetCoin() : Void {
    this.__isset_coin = false;
  }

  // Returns true if field coin is set (has been assigned a value) and false otherwise
  public function isSetCoin() : Bool {
    return this.__isset_coin;
  }

  public function get_price() : String {
    return this.price;
  }

  public function set_price(price:String) : String {
    this.price = price;
    return this.price;
  }

  public function unsetPrice() : Void {
    this.price = null;
  }

  // Returns true if field price is set (has been assigned a value) and false otherwise
  public function isSetPrice() : Bool {
    return this.price != null;
  }

  public function get_title() : String {
    return this.title;
  }

  public function set_title(title:String) : String {
    this.title = title;
    return this.title;
  }

  public function unsetTitle() : Void {
    this.title = null;
  }

  // Returns true if field title is set (has been assigned a value) and false otherwise
  public function isSetTitle() : Bool {
    return this.title != null;
  }

  public function get_refund() : Bool {
    return this.refund;
  }

  public function set_refund(refund:Bool) : Bool {
    this.refund = refund;
    this.__isset_refund = true;
    return this.refund;
  }

  public function unsetRefund() : Void {
    this.__isset_refund = false;
  }

  // Returns true if field refund is set (has been assigned a value) and false otherwise
  public function isSetRefund() : Bool {
    return this.__isset_refund;
  }

  public function get_paySeq() : String {
    return this.paySeq;
  }

  public function set_paySeq(paySeq:String) : String {
    this.paySeq = paySeq;
    return this.paySeq;
  }

  public function unsetPaySeq() : Void {
    this.paySeq = null;
  }

  // Returns true if field paySeq is set (has been assigned a value) and false otherwise
  public function isSetPaySeq() : Bool {
    return this.paySeq != null;
  }

  public function get_currency() : String {
    return this.currency;
  }

  public function set_currency(currency:String) : String {
    this.currency = currency;
    return this.currency;
  }

  public function unsetCurrency() : Void {
    this.currency = null;
  }

  // Returns true if field currency is set (has been assigned a value) and false otherwise
  public function isSetCurrency() : Bool {
    return this.currency != null;
  }

  public function get_currencySign() : String {
    return this.currencySign;
  }

  public function set_currencySign(currencySign:String) : String {
    this.currencySign = currencySign;
    return this.currencySign;
  }

  public function unsetCurrencySign() : Void {
    this.currencySign = null;
  }

  // Returns true if field currencySign is set (has been assigned a value) and false otherwise
  public function isSetCurrencySign() : Bool {
    return this.currencySign != null;
  }

  public function get_displayPrice() : String {
    return this.displayPrice;
  }

  public function set_displayPrice(displayPrice:String) : String {
    this.displayPrice = displayPrice;
    return this.displayPrice;
  }

  public function unsetDisplayPrice() : Void {
    this.displayPrice = null;
  }

  // Returns true if field displayPrice is set (has been assigned a value) and false otherwise
  public function isSetDisplayPrice() : Bool {
    return this.displayPrice != null;
  }

  public function get_payload() : CoinPayLoad {
    return this.payload;
  }

  public function set_payload(payload:CoinPayLoad) : CoinPayLoad {
    this.payload = payload;
    return this.payload;
  }

  public function unsetPayload() : Void {
    this.payload = null;
  }

  // Returns true if field payload is set (has been assigned a value) and false otherwise
  public function isSetPayload() : Bool {
    return this.payload != null;
  }

  public function get_channelId() : String {
    return this.channelId;
  }

  public function set_channelId(channelId:String) : String {
    this.channelId = channelId;
    return this.channelId;
  }

  public function unsetChannelId() : Void {
    this.channelId = null;
  }

  // Returns true if field channelId is set (has been assigned a value) and false otherwise
  public function isSetChannelId() : Bool {
    return this.channelId != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case PAYDATE_FIELD_ID:
      if (value == null) {
        unsetPayDate();
      } else {
        this.payDate = value;
      }

    case COINBALANCE_FIELD_ID:
      if (value == null) {
        unsetCoinBalance();
      } else {
        this.coinBalance = value;
      }

    case COIN_FIELD_ID:
      if (value == null) {
        unsetCoin();
      } else {
        this.coin = value;
      }

    case PRICE_FIELD_ID:
      if (value == null) {
        unsetPrice();
      } else {
        this.price = value;
      }

    case TITLE_FIELD_ID:
      if (value == null) {
        unsetTitle();
      } else {
        this.title = value;
      }

    case REFUND_FIELD_ID:
      if (value == null) {
        unsetRefund();
      } else {
        this.refund = value;
      }

    case PAYSEQ_FIELD_ID:
      if (value == null) {
        unsetPaySeq();
      } else {
        this.paySeq = value;
      }

    case CURRENCY_FIELD_ID:
      if (value == null) {
        unsetCurrency();
      } else {
        this.currency = value;
      }

    case CURRENCYSIGN_FIELD_ID:
      if (value == null) {
        unsetCurrencySign();
      } else {
        this.currencySign = value;
      }

    case DISPLAYPRICE_FIELD_ID:
      if (value == null) {
        unsetDisplayPrice();
      } else {
        this.displayPrice = value;
      }

    case PAYLOAD_FIELD_ID:
      if (value == null) {
        unsetPayload();
      } else {
        this.payload = value;
      }

    case CHANNELID_FIELD_ID:
      if (value == null) {
        unsetChannelId();
      } else {
        this.channelId = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case PAYDATE_FIELD_ID:
      return this.payDate;
    case COINBALANCE_FIELD_ID:
      return this.coinBalance;
    case COIN_FIELD_ID:
      return this.coin;
    case PRICE_FIELD_ID:
      return this.price;
    case TITLE_FIELD_ID:
      return this.title;
    case REFUND_FIELD_ID:
      return this.refund;
    case PAYSEQ_FIELD_ID:
      return this.paySeq;
    case CURRENCY_FIELD_ID:
      return this.currency;
    case CURRENCYSIGN_FIELD_ID:
      return this.currencySign;
    case DISPLAYPRICE_FIELD_ID:
      return this.displayPrice;
    case PAYLOAD_FIELD_ID:
      return this.payload;
    case CHANNELID_FIELD_ID:
      return this.channelId;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case PAYDATE_FIELD_ID:
      return isSetPayDate();
    case COINBALANCE_FIELD_ID:
      return isSetCoinBalance();
    case COIN_FIELD_ID:
      return isSetCoin();
    case PRICE_FIELD_ID:
      return isSetPrice();
    case TITLE_FIELD_ID:
      return isSetTitle();
    case REFUND_FIELD_ID:
      return isSetRefund();
    case PAYSEQ_FIELD_ID:
      return isSetPaySeq();
    case CURRENCY_FIELD_ID:
      return isSetCurrency();
    case CURRENCYSIGN_FIELD_ID:
      return isSetCurrencySign();
    case DISPLAYPRICE_FIELD_ID:
      return isSetDisplayPrice();
    case PAYLOAD_FIELD_ID:
      return isSetPayload();
    case CHANNELID_FIELD_ID:
      return isSetChannelId();
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
          case PAYDATE_FIELD_ID:
            if (field.type == TType.I64) {
              this.payDate = iprot.readI64();
              this.__isset_payDate = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case COINBALANCE_FIELD_ID:
            if (field.type == TType.I32) {
              this.coinBalance = iprot.readI32();
              this.__isset_coinBalance = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case COIN_FIELD_ID:
            if (field.type == TType.I32) {
              this.coin = iprot.readI32();
              this.__isset_coin = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PRICE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.price = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case TITLE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.title = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case REFUND_FIELD_ID:
            if (field.type == TType.BOOL) {
              this.refund = iprot.readBool();
              this.__isset_refund = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PAYSEQ_FIELD_ID:
            if (field.type == TType.STRING) {
              this.paySeq = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CURRENCY_FIELD_ID:
            if (field.type == TType.STRING) {
              this.currency = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CURRENCYSIGN_FIELD_ID:
            if (field.type == TType.STRING) {
              this.currencySign = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case DISPLAYPRICE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.displayPrice = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PAYLOAD_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.payload = new CoinPayLoad();
              this.payload.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CHANNELID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.channelId = iprot.readString();
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
      oprot.writeFieldBegin(PAY_DATE_FIELD_DESC);
      oprot.writeI64(this.payDate);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(COIN_BALANCE_FIELD_DESC);
      oprot.writeI32(this.coinBalance);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(COIN_FIELD_DESC);
      oprot.writeI32(this.coin);
      oprot.writeFieldEnd();
      if (this.price != null) {
        oprot.writeFieldBegin(PRICE_FIELD_DESC);
        oprot.writeString(this.price);
        oprot.writeFieldEnd();
      }
      if (this.title != null) {
        oprot.writeFieldBegin(TITLE_FIELD_DESC);
        oprot.writeString(this.title);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REFUND_FIELD_DESC);
      oprot.writeBool(this.refund);
      oprot.writeFieldEnd();
      if (this.paySeq != null) {
        oprot.writeFieldBegin(PAY_SEQ_FIELD_DESC);
        oprot.writeString(this.paySeq);
        oprot.writeFieldEnd();
      }
      if (this.currency != null) {
        oprot.writeFieldBegin(CURRENCY_FIELD_DESC);
        oprot.writeString(this.currency);
        oprot.writeFieldEnd();
      }
      if (this.currencySign != null) {
        oprot.writeFieldBegin(CURRENCY_SIGN_FIELD_DESC);
        oprot.writeString(this.currencySign);
        oprot.writeFieldEnd();
      }
      if (this.displayPrice != null) {
        oprot.writeFieldBegin(DISPLAY_PRICE_FIELD_DESC);
        oprot.writeString(this.displayPrice);
        oprot.writeFieldEnd();
      }
      if (this.payload != null) {
        oprot.writeFieldBegin(PAYLOAD_FIELD_DESC);
        this.payload.write(oprot);
        oprot.writeFieldEnd();
      }
      if (this.channelId != null) {
        oprot.writeFieldBegin(CHANNEL_ID_FIELD_DESC);
        oprot.writeString(this.channelId);
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
    var ret : String = "CoinHistory(";
    var first : Bool = true;

    ret += "payDate:";
    ret += this.payDate;
    first = false;
    if (!first) ret +=  ", ";
    ret += "coinBalance:";
    ret += this.coinBalance;
    first = false;
    if (!first) ret +=  ", ";
    ret += "coin:";
    ret += this.coin;
    first = false;
    if (!first) ret +=  ", ";
    ret += "price:";
    if (this.price == null) {
      ret += "null";
    } else {
      ret += this.price;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "title:";
    if (this.title == null) {
      ret += "null";
    } else {
      ret += this.title;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "refund:";
    ret += this.refund;
    first = false;
    if (!first) ret +=  ", ";
    ret += "paySeq:";
    if (this.paySeq == null) {
      ret += "null";
    } else {
      ret += this.paySeq;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "currency:";
    if (this.currency == null) {
      ret += "null";
    } else {
      ret += this.currency;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "currencySign:";
    if (this.currencySign == null) {
      ret += "null";
    } else {
      ret += this.currencySign;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "displayPrice:";
    if (this.displayPrice == null) {
      ret += "null";
    } else {
      ret += this.displayPrice;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "payload:";
    if (this.payload == null) {
      ret += "null";
    } else {
      ret += this.payload;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "channelId:";
    if (this.channelId == null) {
      ret += "null";
    } else {
      ret += this.channelId;
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

