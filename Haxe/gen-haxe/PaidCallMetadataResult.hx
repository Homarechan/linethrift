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


class PaidCallMetadataResult implements TBase {
  
  static var STRUCT_DESC = { new TStruct("PaidCallMetadataResult"); };
  static var CURRENCY_EXCHANGE_RATES_FIELD_DESC = { new TField("currencyExchangeRates", TType.LIST, 1); };
  static var RECOMMENDED_COUNTRY_CODES_FIELD_DESC = { new TField("recommendedCountryCodes", TType.LIST, 2); };
  static var AD_COUNTRIES_FIELD_DESC = { new TField("adCountries", TType.LIST, 3); };

  @:isVar
  public var currencyExchangeRates(get,set) : List< PaidCallCurrencyExchangeRate>;
  @:isVar
  public var recommendedCountryCodes(get,set) : List< String>;
  @:isVar
  public var adCountries(get,set) : List< PaidCallAdCountry>;

  inline static var CURRENCYEXCHANGERATES_FIELD_ID : Int = 1;
  inline static var RECOMMENDEDCOUNTRYCODES_FIELD_ID : Int = 2;
  inline static var ADCOUNTRIES_FIELD_ID : Int = 3;


  public function new() {
  }

  public function get_currencyExchangeRates() : List< PaidCallCurrencyExchangeRate> {
    return this.currencyExchangeRates;
  }

  public function set_currencyExchangeRates(currencyExchangeRates:List< PaidCallCurrencyExchangeRate>) : List< PaidCallCurrencyExchangeRate> {
    this.currencyExchangeRates = currencyExchangeRates;
    return this.currencyExchangeRates;
  }

  public function unsetCurrencyExchangeRates() : Void {
    this.currencyExchangeRates = null;
  }

  // Returns true if field currencyExchangeRates is set (has been assigned a value) and false otherwise
  public function isSetCurrencyExchangeRates() : Bool {
    return this.currencyExchangeRates != null;
  }

  public function get_recommendedCountryCodes() : List< String> {
    return this.recommendedCountryCodes;
  }

  public function set_recommendedCountryCodes(recommendedCountryCodes:List< String>) : List< String> {
    this.recommendedCountryCodes = recommendedCountryCodes;
    return this.recommendedCountryCodes;
  }

  public function unsetRecommendedCountryCodes() : Void {
    this.recommendedCountryCodes = null;
  }

  // Returns true if field recommendedCountryCodes is set (has been assigned a value) and false otherwise
  public function isSetRecommendedCountryCodes() : Bool {
    return this.recommendedCountryCodes != null;
  }

  public function get_adCountries() : List< PaidCallAdCountry> {
    return this.adCountries;
  }

  public function set_adCountries(adCountries:List< PaidCallAdCountry>) : List< PaidCallAdCountry> {
    this.adCountries = adCountries;
    return this.adCountries;
  }

  public function unsetAdCountries() : Void {
    this.adCountries = null;
  }

  // Returns true if field adCountries is set (has been assigned a value) and false otherwise
  public function isSetAdCountries() : Bool {
    return this.adCountries != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case CURRENCYEXCHANGERATES_FIELD_ID:
      if (value == null) {
        unsetCurrencyExchangeRates();
      } else {
        this.currencyExchangeRates = value;
      }

    case RECOMMENDEDCOUNTRYCODES_FIELD_ID:
      if (value == null) {
        unsetRecommendedCountryCodes();
      } else {
        this.recommendedCountryCodes = value;
      }

    case ADCOUNTRIES_FIELD_ID:
      if (value == null) {
        unsetAdCountries();
      } else {
        this.adCountries = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case CURRENCYEXCHANGERATES_FIELD_ID:
      return this.currencyExchangeRates;
    case RECOMMENDEDCOUNTRYCODES_FIELD_ID:
      return this.recommendedCountryCodes;
    case ADCOUNTRIES_FIELD_ID:
      return this.adCountries;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case CURRENCYEXCHANGERATES_FIELD_ID:
      return isSetCurrencyExchangeRates();
    case RECOMMENDEDCOUNTRYCODES_FIELD_ID:
      return isSetRecommendedCountryCodes();
    case ADCOUNTRIES_FIELD_ID:
      return isSetAdCountries();
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
          case CURRENCYEXCHANGERATES_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list20 = iprot.readListBegin();
                this.currencyExchangeRates = new List< PaidCallCurrencyExchangeRate>();
                for( _i21 in 0 ... _list20.size)
                {
                  var _elem22 : PaidCallCurrencyExchangeRate;
                  _elem22 = new PaidCallCurrencyExchangeRate();
                  _elem22.read(iprot);
                  this.currencyExchangeRates.add(_elem22);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case RECOMMENDEDCOUNTRYCODES_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list23 = iprot.readListBegin();
                this.recommendedCountryCodes = new List< String>();
                for( _i24 in 0 ... _list23.size)
                {
                  var _elem25 : String;
                  _elem25 = iprot.readString();
                  this.recommendedCountryCodes.add(_elem25);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case ADCOUNTRIES_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list26 = iprot.readListBegin();
                this.adCountries = new List< PaidCallAdCountry>();
                for( _i27 in 0 ... _list26.size)
                {
                  var _elem28 : PaidCallAdCountry;
                  _elem28 = new PaidCallAdCountry();
                  _elem28.read(iprot);
                  this.adCountries.add(_elem28);
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
      if (this.currencyExchangeRates != null) {
        oprot.writeFieldBegin(CURRENCY_EXCHANGE_RATES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.currencyExchangeRates.length));
          for( elem29 in this.currencyExchangeRates)
          {
            elem29.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.recommendedCountryCodes != null) {
        oprot.writeFieldBegin(RECOMMENDED_COUNTRY_CODES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.recommendedCountryCodes.length));
          for( elem30 in this.recommendedCountryCodes)
          {
            oprot.writeString(elem30);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.adCountries != null) {
        oprot.writeFieldBegin(AD_COUNTRIES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.adCountries.length));
          for( elem31 in this.adCountries)
          {
            elem31.write(oprot);
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
    var ret : String = "PaidCallMetadataResult(";
    var first : Bool = true;

    ret += "currencyExchangeRates:";
    if (this.currencyExchangeRates == null) {
      ret += "null";
    } else {
      ret += this.currencyExchangeRates;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "recommendedCountryCodes:";
    if (this.recommendedCountryCodes == null) {
      ret += "null";
    } else {
      ret += this.recommendedCountryCodes;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "adCountries:";
    if (this.adCountries == null) {
      ret += "null";
    } else {
      ret += this.adCountries;
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

