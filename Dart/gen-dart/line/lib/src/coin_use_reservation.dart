/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.coin_use_reservation;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class CoinUseReservation implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("CoinUseReservation");
  static final TField _CHANNEL_ID_FIELD_DESC = new TField("channelId", TType.STRING, 1);
  static final TField _SHOP_ORDER_ID_FIELD_DESC = new TField("shopOrderId", TType.STRING, 2);
  static final TField _APP_STORE_CODE_FIELD_DESC = new TField("appStoreCode", TType.I32, 3);
  static final TField _ITEMS_FIELD_DESC = new TField("items", TType.LIST, 4);
  static final TField _COUNTRY_FIELD_DESC = new TField("country", TType.STRING, 5);

  String _channelId;
  static const int CHANNELID = 1;
  String _shopOrderId;
  static const int SHOPORDERID = 2;
  int _appStoreCode;
  static const int APPSTORECODE = 3;
  List<CoinUseReservationItem> _items;
  static const int ITEMS = 4;
  String _country;
  static const int COUNTRY = 5;

  bool __isset_appStoreCode = false;

  CoinUseReservation() {
  }

  // channelId
  String get channelId => this._channelId;

  set channelId(String channelId) {
    this._channelId = channelId;
  }

  bool isSetChannelId() => this.channelId != null;

  unsetChannelId() {
    this.channelId = null;
  }

  // shopOrderId
  String get shopOrderId => this._shopOrderId;

  set shopOrderId(String shopOrderId) {
    this._shopOrderId = shopOrderId;
  }

  bool isSetShopOrderId() => this.shopOrderId != null;

  unsetShopOrderId() {
    this.shopOrderId = null;
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

  // items
  List<CoinUseReservationItem> get items => this._items;

  set items(List<CoinUseReservationItem> items) {
    this._items = items;
  }

  bool isSetItems() => this.items != null;

  unsetItems() {
    this.items = null;
  }

  // country
  String get country => this._country;

  set country(String country) {
    this._country = country;
  }

  bool isSetCountry() => this.country != null;

  unsetCountry() {
    this.country = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case CHANNELID:
        return this.channelId;
      case SHOPORDERID:
        return this.shopOrderId;
      case APPSTORECODE:
        return this.appStoreCode;
      case ITEMS:
        return this.items;
      case COUNTRY:
        return this.country;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case CHANNELID:
        if (value == null) {
          unsetChannelId();
        } else {
          this.channelId = value;
        }
        break;

      case SHOPORDERID:
        if (value == null) {
          unsetShopOrderId();
        } else {
          this.shopOrderId = value;
        }
        break;

      case APPSTORECODE:
        if (value == null) {
          unsetAppStoreCode();
        } else {
          this.appStoreCode = value;
        }
        break;

      case ITEMS:
        if (value == null) {
          unsetItems();
        } else {
          this.items = value;
        }
        break;

      case COUNTRY:
        if (value == null) {
          unsetCountry();
        } else {
          this.country = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case CHANNELID:
        return isSetChannelId();
      case SHOPORDERID:
        return isSetShopOrderId();
      case APPSTORECODE:
        return isSetAppStoreCode();
      case ITEMS:
        return isSetItems();
      case COUNTRY:
        return isSetCountry();
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
        case CHANNELID:
          if (field.type == TType.STRING) {
            this.channelId = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SHOPORDERID:
          if (field.type == TType.STRING) {
            this.shopOrderId = iprot.readString();
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
        case ITEMS:
          if (field.type == TType.LIST) {
            {
              TList _list114 = iprot.readListBegin();
              this.items = new List<CoinUseReservationItem>();
              for (int _i115 = 0; _i115 < _list114.length; ++_i115) {
                CoinUseReservationItem _elem116;
                _elem116 = new CoinUseReservationItem();
                _elem116.read(iprot);
                this.items.add(_elem116);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case COUNTRY:
          if (field.type == TType.STRING) {
            this.country = iprot.readString();
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
    if (this.channelId != null) {
      oprot.writeFieldBegin(_CHANNEL_ID_FIELD_DESC);
      oprot.writeString(this.channelId);
      oprot.writeFieldEnd();
    }
    if (this.shopOrderId != null) {
      oprot.writeFieldBegin(_SHOP_ORDER_ID_FIELD_DESC);
      oprot.writeString(this.shopOrderId);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_APP_STORE_CODE_FIELD_DESC);
    oprot.writeI32(this.appStoreCode);
    oprot.writeFieldEnd();
    if (this.items != null) {
      oprot.writeFieldBegin(_ITEMS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.items.length));
        for (var elem117 in this.items) {
          elem117.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.country != null) {
      oprot.writeFieldBegin(_COUNTRY_FIELD_DESC);
      oprot.writeString(this.country);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("CoinUseReservation(");

    ret.write("channelId:");
    if (this.channelId == null) {
      ret.write("null");
    } else {
      ret.write(this.channelId);
    }

    ret.write(", ");
    ret.write("shopOrderId:");
    if (this.shopOrderId == null) {
      ret.write("null");
    } else {
      ret.write(this.shopOrderId);
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
    ret.write("items:");
    if (this.items == null) {
      ret.write("null");
    } else {
      ret.write(this.items);
    }

    ret.write(", ");
    ret.write("country:");
    if (this.country == null) {
      ret.write("null");
    } else {
      ret.write(this.country);
    }

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

