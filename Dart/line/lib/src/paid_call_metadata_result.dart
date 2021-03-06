/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.paid_call_metadata_result;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class PaidCallMetadataResult implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("PaidCallMetadataResult");
  static final TField _CURRENCY_EXCHANGE_RATES_FIELD_DESC = new TField("currencyExchangeRates", TType.LIST, 1);
  static final TField _RECOMMENDED_COUNTRY_CODES_FIELD_DESC = new TField("recommendedCountryCodes", TType.LIST, 2);
  static final TField _AD_COUNTRIES_FIELD_DESC = new TField("adCountries", TType.LIST, 3);

  List<PaidCallCurrencyExchangeRate> _currencyExchangeRates;
  static const int CURRENCYEXCHANGERATES = 1;
  List<String> _recommendedCountryCodes;
  static const int RECOMMENDEDCOUNTRYCODES = 2;
  List<PaidCallAdCountry> _adCountries;
  static const int ADCOUNTRIES = 3;


  PaidCallMetadataResult() {
  }

  // currencyExchangeRates
  List<PaidCallCurrencyExchangeRate> get currencyExchangeRates => this._currencyExchangeRates;

  set currencyExchangeRates(List<PaidCallCurrencyExchangeRate> currencyExchangeRates) {
    this._currencyExchangeRates = currencyExchangeRates;
  }

  bool isSetCurrencyExchangeRates() => this.currencyExchangeRates != null;

  unsetCurrencyExchangeRates() {
    this.currencyExchangeRates = null;
  }

  // recommendedCountryCodes
  List<String> get recommendedCountryCodes => this._recommendedCountryCodes;

  set recommendedCountryCodes(List<String> recommendedCountryCodes) {
    this._recommendedCountryCodes = recommendedCountryCodes;
  }

  bool isSetRecommendedCountryCodes() => this.recommendedCountryCodes != null;

  unsetRecommendedCountryCodes() {
    this.recommendedCountryCodes = null;
  }

  // adCountries
  List<PaidCallAdCountry> get adCountries => this._adCountries;

  set adCountries(List<PaidCallAdCountry> adCountries) {
    this._adCountries = adCountries;
  }

  bool isSetAdCountries() => this.adCountries != null;

  unsetAdCountries() {
    this.adCountries = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case CURRENCYEXCHANGERATES:
        return this.currencyExchangeRates;
      case RECOMMENDEDCOUNTRYCODES:
        return this.recommendedCountryCodes;
      case ADCOUNTRIES:
        return this.adCountries;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case CURRENCYEXCHANGERATES:
        if (value == null) {
          unsetCurrencyExchangeRates();
        } else {
          this.currencyExchangeRates = value;
        }
        break;

      case RECOMMENDEDCOUNTRYCODES:
        if (value == null) {
          unsetRecommendedCountryCodes();
        } else {
          this.recommendedCountryCodes = value;
        }
        break;

      case ADCOUNTRIES:
        if (value == null) {
          unsetAdCountries();
        } else {
          this.adCountries = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case CURRENCYEXCHANGERATES:
        return isSetCurrencyExchangeRates();
      case RECOMMENDEDCOUNTRYCODES:
        return isSetRecommendedCountryCodes();
      case ADCOUNTRIES:
        return isSetAdCountries();
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  read(TProtocol iprot) {
    TField field;
    iprot.readStructBegin();
    while (true) {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case CURRENCYEXCHANGERATES:
          if (field.type == TType.LIST) {
            {
              TList _list20 = iprot.readListBegin();
              this.currencyExchangeRates = new List<PaidCallCurrencyExchangeRate>();
              for (int _i21 = 0; _i21 < _list20.length; ++_i21) {
                PaidCallCurrencyExchangeRate _elem22;
                _elem22 = new PaidCallCurrencyExchangeRate();
                _elem22.read(iprot);
                this.currencyExchangeRates.add(_elem22);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case RECOMMENDEDCOUNTRYCODES:
          if (field.type == TType.LIST) {
            {
              TList _list23 = iprot.readListBegin();
              this.recommendedCountryCodes = new List<String>();
              for (int _i24 = 0; _i24 < _list23.length; ++_i24) {
                String _elem25;
                _elem25 = iprot.readString();
                this.recommendedCountryCodes.add(_elem25);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ADCOUNTRIES:
          if (field.type == TType.LIST) {
            {
              TList _list26 = iprot.readListBegin();
              this.adCountries = new List<PaidCallAdCountry>();
              for (int _i27 = 0; _i27 < _list26.length; ++_i27) {
                PaidCallAdCountry _elem28;
                _elem28 = new PaidCallAdCountry();
                _elem28.read(iprot);
                this.adCountries.add(_elem28);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  write(TProtocol oprot) {
    validate();

    oprot.writeStructBegin(_STRUCT_DESC);
    if (this.currencyExchangeRates != null) {
      oprot.writeFieldBegin(_CURRENCY_EXCHANGE_RATES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.currencyExchangeRates.length));
        for (var elem29 in this.currencyExchangeRates) {
          elem29.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.recommendedCountryCodes != null) {
      oprot.writeFieldBegin(_RECOMMENDED_COUNTRY_CODES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.recommendedCountryCodes.length));
        for (var elem30 in this.recommendedCountryCodes) {
          oprot.writeString(elem30);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.adCountries != null) {
      oprot.writeFieldBegin(_AD_COUNTRIES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.adCountries.length));
        for (var elem31 in this.adCountries) {
          elem31.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("PaidCallMetadataResult(");

    ret.write("currencyExchangeRates:");
    if (this.currencyExchangeRates == null) {
      ret.write("null");
    } else {
      ret.write(this.currencyExchangeRates);
    }

    ret.write(", ");
    ret.write("recommendedCountryCodes:");
    if (this.recommendedCountryCodes == null) {
      ret.write("null");
    } else {
      ret.write(this.recommendedCountryCodes);
    }

    ret.write(", ");
    ret.write("adCountries:");
    if (this.adCountries == null) {
      ret.write("null");
    } else {
      ret.write(this.adCountries);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

