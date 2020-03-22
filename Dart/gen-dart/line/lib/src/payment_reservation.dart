/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.payment_reservation;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class PaymentReservation implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("PaymentReservation");
  static final TField _RECEIVER_MID_FIELD_DESC = new TField("receiverMid", TType.STRING, 1);
  static final TField _PRODUCT_ID_FIELD_DESC = new TField("productId", TType.STRING, 2);
  static final TField _LANGUAGE_FIELD_DESC = new TField("language", TType.STRING, 3);
  static final TField _LOCATION_FIELD_DESC = new TField("location", TType.STRING, 4);
  static final TField _CURRENCY_FIELD_DESC = new TField("currency", TType.STRING, 5);
  static final TField _PRICE_FIELD_DESC = new TField("price", TType.STRING, 6);
  static final TField _APP_STORE_CODE_FIELD_DESC = new TField("appStoreCode", TType.I32, 7);
  static final TField _MESSAGE_TEXT_FIELD_DESC = new TField("messageText", TType.STRING, 8);
  static final TField _MESSAGE_TEMPLATE_FIELD_DESC = new TField("messageTemplate", TType.I32, 9);
  static final TField _PACKAGE_ID_FIELD_DESC = new TField("packageId", TType.I64, 10);

  String _receiverMid;
  static const int RECEIVERMID = 1;
  String _productId;
  static const int PRODUCTID = 2;
  String _language;
  static const int LANGUAGE = 3;
  String _location;
  static const int LOCATION = 4;
  String _currency;
  static const int CURRENCY = 5;
  String _price;
  static const int PRICE = 6;
  int _appStoreCode;
  static const int APPSTORECODE = 7;
  String _messageText;
  static const int MESSAGETEXT = 8;
  int _messageTemplate = 0;
  static const int MESSAGETEMPLATE = 9;
  int _packageId = 0;
  static const int PACKAGEID = 10;

  bool __isset_appStoreCode = false;
  bool __isset_messageTemplate = false;
  bool __isset_packageId = false;

  PaymentReservation() {
  }

  // receiverMid
  String get receiverMid => this._receiverMid;

  set receiverMid(String receiverMid) {
    this._receiverMid = receiverMid;
  }

  bool isSetReceiverMid() => this.receiverMid != null;

  unsetReceiverMid() {
    this.receiverMid = null;
  }

  // productId
  String get productId => this._productId;

  set productId(String productId) {
    this._productId = productId;
  }

  bool isSetProductId() => this.productId != null;

  unsetProductId() {
    this.productId = null;
  }

  // language
  String get language => this._language;

  set language(String language) {
    this._language = language;
  }

  bool isSetLanguage() => this.language != null;

  unsetLanguage() {
    this.language = null;
  }

  // location
  String get location => this._location;

  set location(String location) {
    this._location = location;
  }

  bool isSetLocation() => this.location != null;

  unsetLocation() {
    this.location = null;
  }

  // currency
  String get currency => this._currency;

  set currency(String currency) {
    this._currency = currency;
  }

  bool isSetCurrency() => this.currency != null;

  unsetCurrency() {
    this.currency = null;
  }

  // price
  String get price => this._price;

  set price(String price) {
    this._price = price;
  }

  bool isSetPrice() => this.price != null;

  unsetPrice() {
    this.price = null;
  }

  // appStoreCode
  int get appStoreCode => this._appStoreCode;

  set appStoreCode(int appStoreCode) {
    this._appStoreCode = appStoreCode;
    this.__isset_appStoreCode = true;
  }

  bool isSetAppStoreCode() => this.__isset_appStoreCode;

  unsetAppStoreCode() {
    this.__isset_appStoreCode = false;
  }

  // messageText
  String get messageText => this._messageText;

  set messageText(String messageText) {
    this._messageText = messageText;
  }

  bool isSetMessageText() => this.messageText != null;

  unsetMessageText() {
    this.messageText = null;
  }

  // messageTemplate
  int get messageTemplate => this._messageTemplate;

  set messageTemplate(int messageTemplate) {
    this._messageTemplate = messageTemplate;
    this.__isset_messageTemplate = true;
  }

  bool isSetMessageTemplate() => this.__isset_messageTemplate;

  unsetMessageTemplate() {
    this.__isset_messageTemplate = false;
  }

  // packageId
  int get packageId => this._packageId;

  set packageId(int packageId) {
    this._packageId = packageId;
    this.__isset_packageId = true;
  }

  bool isSetPackageId() => this.__isset_packageId;

  unsetPackageId() {
    this.__isset_packageId = false;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case RECEIVERMID:
        return this.receiverMid;
      case PRODUCTID:
        return this.productId;
      case LANGUAGE:
        return this.language;
      case LOCATION:
        return this.location;
      case CURRENCY:
        return this.currency;
      case PRICE:
        return this.price;
      case APPSTORECODE:
        return this.appStoreCode;
      case MESSAGETEXT:
        return this.messageText;
      case MESSAGETEMPLATE:
        return this.messageTemplate;
      case PACKAGEID:
        return this.packageId;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case RECEIVERMID:
        if (value == null) {
          unsetReceiverMid();
        } else {
          this.receiverMid = value;
        }
        break;

      case PRODUCTID:
        if (value == null) {
          unsetProductId();
        } else {
          this.productId = value;
        }
        break;

      case LANGUAGE:
        if (value == null) {
          unsetLanguage();
        } else {
          this.language = value;
        }
        break;

      case LOCATION:
        if (value == null) {
          unsetLocation();
        } else {
          this.location = value;
        }
        break;

      case CURRENCY:
        if (value == null) {
          unsetCurrency();
        } else {
          this.currency = value;
        }
        break;

      case PRICE:
        if (value == null) {
          unsetPrice();
        } else {
          this.price = value;
        }
        break;

      case APPSTORECODE:
        if (value == null) {
          unsetAppStoreCode();
        } else {
          this.appStoreCode = value;
        }
        break;

      case MESSAGETEXT:
        if (value == null) {
          unsetMessageText();
        } else {
          this.messageText = value;
        }
        break;

      case MESSAGETEMPLATE:
        if (value == null) {
          unsetMessageTemplate();
        } else {
          this.messageTemplate = value;
        }
        break;

      case PACKAGEID:
        if (value == null) {
          unsetPackageId();
        } else {
          this.packageId = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case RECEIVERMID:
        return isSetReceiverMid();
      case PRODUCTID:
        return isSetProductId();
      case LANGUAGE:
        return isSetLanguage();
      case LOCATION:
        return isSetLocation();
      case CURRENCY:
        return isSetCurrency();
      case PRICE:
        return isSetPrice();
      case APPSTORECODE:
        return isSetAppStoreCode();
      case MESSAGETEXT:
        return isSetMessageText();
      case MESSAGETEMPLATE:
        return isSetMessageTemplate();
      case PACKAGEID:
        return isSetPackageId();
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
        case RECEIVERMID:
          if (field.type == TType.STRING) {
            this.receiverMid = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PRODUCTID:
          if (field.type == TType.STRING) {
            this.productId = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case LANGUAGE:
          if (field.type == TType.STRING) {
            this.language = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case LOCATION:
          if (field.type == TType.STRING) {
            this.location = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CURRENCY:
          if (field.type == TType.STRING) {
            this.currency = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PRICE:
          if (field.type == TType.STRING) {
            this.price = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case APPSTORECODE:
          if (field.type == TType.I32) {
            this.appStoreCode = iprot.readI32();
            this.__isset_appStoreCode = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case MESSAGETEXT:
          if (field.type == TType.STRING) {
            this.messageText = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case MESSAGETEMPLATE:
          if (field.type == TType.I32) {
            this.messageTemplate = iprot.readI32();
            this.__isset_messageTemplate = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PACKAGEID:
          if (field.type == TType.I64) {
            this.packageId = iprot.readI64();
            this.__isset_packageId = true;
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
    if (this.receiverMid != null) {
      oprot.writeFieldBegin(_RECEIVER_MID_FIELD_DESC);
      oprot.writeString(this.receiverMid);
      oprot.writeFieldEnd();
    }
    if (this.productId != null) {
      oprot.writeFieldBegin(_PRODUCT_ID_FIELD_DESC);
      oprot.writeString(this.productId);
      oprot.writeFieldEnd();
    }
    if (this.language != null) {
      oprot.writeFieldBegin(_LANGUAGE_FIELD_DESC);
      oprot.writeString(this.language);
      oprot.writeFieldEnd();
    }
    if (this.location != null) {
      oprot.writeFieldBegin(_LOCATION_FIELD_DESC);
      oprot.writeString(this.location);
      oprot.writeFieldEnd();
    }
    if (this.currency != null) {
      oprot.writeFieldBegin(_CURRENCY_FIELD_DESC);
      oprot.writeString(this.currency);
      oprot.writeFieldEnd();
    }
    if (this.price != null) {
      oprot.writeFieldBegin(_PRICE_FIELD_DESC);
      oprot.writeString(this.price);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_APP_STORE_CODE_FIELD_DESC);
    oprot.writeI32(this.appStoreCode);
    oprot.writeFieldEnd();
    if (this.messageText != null) {
      oprot.writeFieldBegin(_MESSAGE_TEXT_FIELD_DESC);
      oprot.writeString(this.messageText);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_MESSAGE_TEMPLATE_FIELD_DESC);
    oprot.writeI32(this.messageTemplate);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_PACKAGE_ID_FIELD_DESC);
    oprot.writeI64(this.packageId);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("PaymentReservation(");

    ret.write("receiverMid:");
    if (this.receiverMid == null) {
      ret.write("null");
    } else {
      ret.write(this.receiverMid);
    }

    ret.write(", ");
    ret.write("productId:");
    if (this.productId == null) {
      ret.write("null");
    } else {
      ret.write(this.productId);
    }

    ret.write(", ");
    ret.write("language:");
    if (this.language == null) {
      ret.write("null");
    } else {
      ret.write(this.language);
    }

    ret.write(", ");
    ret.write("location:");
    if (this.location == null) {
      ret.write("null");
    } else {
      ret.write(this.location);
    }

    ret.write(", ");
    ret.write("currency:");
    if (this.currency == null) {
      ret.write("null");
    } else {
      ret.write(this.currency);
    }

    ret.write(", ");
    ret.write("price:");
    if (this.price == null) {
      ret.write("null");
    } else {
      ret.write(this.price);
    }

    ret.write(", ");
    ret.write("appStoreCode:");
    String appStoreCode_name = PaymentType.VALUES_TO_NAMES[this.appStoreCode];
    if (appStoreCode_name != null) {
      ret.write(appStoreCode_name);
      ret.write(" (");
    }
    ret.write(this.appStoreCode);
    if (appStoreCode_name != null) {
      ret.write(")");
    }

    ret.write(", ");
    ret.write("messageText:");
    if (this.messageText == null) {
      ret.write("null");
    } else {
      ret.write(this.messageText);
    }

    ret.write(", ");
    ret.write("messageTemplate:");
    ret.write(this.messageTemplate);

    ret.write(", ");
    ret.write("packageId:");
    ret.write(this.packageId);

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetAppStoreCode() && !PaymentType.VALID_VALUES.contains(appStoreCode)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'appStoreCode' has been assigned the invalid value $appStoreCode");
    }
  }

}

