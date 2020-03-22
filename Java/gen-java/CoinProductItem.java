/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class CoinProductItem implements org.apache.thrift.TBase<CoinProductItem, CoinProductItem._Fields>, java.io.Serializable, Cloneable, Comparable<CoinProductItem> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CoinProductItem");

  private static final org.apache.thrift.protocol.TField ITEM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("itemId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COIN_FIELD_DESC = new org.apache.thrift.protocol.TField("coin", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField FREE_COIN_FIELD_DESC = new org.apache.thrift.protocol.TField("freeCoin", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField CURRENCY_FIELD_DESC = new org.apache.thrift.protocol.TField("currency", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("price", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField DISPLAY_PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("displayPrice", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)8);
  private static final org.apache.thrift.protocol.TField DESC_FIELD_DESC = new org.apache.thrift.protocol.TField("desc", org.apache.thrift.protocol.TType.STRING, (short)9);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CoinProductItemStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CoinProductItemTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String itemId; // required
  public int coin; // required
  public int freeCoin; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String currency; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String price; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String displayPrice; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String name; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String desc; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ITEM_ID((short)1, "itemId"),
    COIN((short)2, "coin"),
    FREE_COIN((short)3, "freeCoin"),
    CURRENCY((short)5, "currency"),
    PRICE((short)6, "price"),
    DISPLAY_PRICE((short)7, "displayPrice"),
    NAME((short)8, "name"),
    DESC((short)9, "desc");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ITEM_ID
          return ITEM_ID;
        case 2: // COIN
          return COIN;
        case 3: // FREE_COIN
          return FREE_COIN;
        case 5: // CURRENCY
          return CURRENCY;
        case 6: // PRICE
          return PRICE;
        case 7: // DISPLAY_PRICE
          return DISPLAY_PRICE;
        case 8: // NAME
          return NAME;
        case 9: // DESC
          return DESC;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __COIN_ISSET_ID = 0;
  private static final int __FREECOIN_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ITEM_ID, new org.apache.thrift.meta_data.FieldMetaData("itemId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COIN, new org.apache.thrift.meta_data.FieldMetaData("coin", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FREE_COIN, new org.apache.thrift.meta_data.FieldMetaData("freeCoin", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CURRENCY, new org.apache.thrift.meta_data.FieldMetaData("currency", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRICE, new org.apache.thrift.meta_data.FieldMetaData("price", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DISPLAY_PRICE, new org.apache.thrift.meta_data.FieldMetaData("displayPrice", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESC, new org.apache.thrift.meta_data.FieldMetaData("desc", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CoinProductItem.class, metaDataMap);
  }

  public CoinProductItem() {
  }

  public CoinProductItem(
    java.lang.String itemId,
    int coin,
    int freeCoin,
    java.lang.String currency,
    java.lang.String price,
    java.lang.String displayPrice,
    java.lang.String name,
    java.lang.String desc)
  {
    this();
    this.itemId = itemId;
    this.coin = coin;
    setCoinIsSet(true);
    this.freeCoin = freeCoin;
    setFreeCoinIsSet(true);
    this.currency = currency;
    this.price = price;
    this.displayPrice = displayPrice;
    this.name = name;
    this.desc = desc;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CoinProductItem(CoinProductItem other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetItemId()) {
      this.itemId = other.itemId;
    }
    this.coin = other.coin;
    this.freeCoin = other.freeCoin;
    if (other.isSetCurrency()) {
      this.currency = other.currency;
    }
    if (other.isSetPrice()) {
      this.price = other.price;
    }
    if (other.isSetDisplayPrice()) {
      this.displayPrice = other.displayPrice;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetDesc()) {
      this.desc = other.desc;
    }
  }

  public CoinProductItem deepCopy() {
    return new CoinProductItem(this);
  }

  @Override
  public void clear() {
    this.itemId = null;
    setCoinIsSet(false);
    this.coin = 0;
    setFreeCoinIsSet(false);
    this.freeCoin = 0;
    this.currency = null;
    this.price = null;
    this.displayPrice = null;
    this.name = null;
    this.desc = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getItemId() {
    return this.itemId;
  }

  public CoinProductItem setItemId(@org.apache.thrift.annotation.Nullable java.lang.String itemId) {
    this.itemId = itemId;
    return this;
  }

  public void unsetItemId() {
    this.itemId = null;
  }

  /** Returns true if field itemId is set (has been assigned a value) and false otherwise */
  public boolean isSetItemId() {
    return this.itemId != null;
  }

  public void setItemIdIsSet(boolean value) {
    if (!value) {
      this.itemId = null;
    }
  }

  public int getCoin() {
    return this.coin;
  }

  public CoinProductItem setCoin(int coin) {
    this.coin = coin;
    setCoinIsSet(true);
    return this;
  }

  public void unsetCoin() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COIN_ISSET_ID);
  }

  /** Returns true if field coin is set (has been assigned a value) and false otherwise */
  public boolean isSetCoin() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COIN_ISSET_ID);
  }

  public void setCoinIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COIN_ISSET_ID, value);
  }

  public int getFreeCoin() {
    return this.freeCoin;
  }

  public CoinProductItem setFreeCoin(int freeCoin) {
    this.freeCoin = freeCoin;
    setFreeCoinIsSet(true);
    return this;
  }

  public void unsetFreeCoin() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FREECOIN_ISSET_ID);
  }

  /** Returns true if field freeCoin is set (has been assigned a value) and false otherwise */
  public boolean isSetFreeCoin() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FREECOIN_ISSET_ID);
  }

  public void setFreeCoinIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FREECOIN_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCurrency() {
    return this.currency;
  }

  public CoinProductItem setCurrency(@org.apache.thrift.annotation.Nullable java.lang.String currency) {
    this.currency = currency;
    return this;
  }

  public void unsetCurrency() {
    this.currency = null;
  }

  /** Returns true if field currency is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrency() {
    return this.currency != null;
  }

  public void setCurrencyIsSet(boolean value) {
    if (!value) {
      this.currency = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPrice() {
    return this.price;
  }

  public CoinProductItem setPrice(@org.apache.thrift.annotation.Nullable java.lang.String price) {
    this.price = price;
    return this;
  }

  public void unsetPrice() {
    this.price = null;
  }

  /** Returns true if field price is set (has been assigned a value) and false otherwise */
  public boolean isSetPrice() {
    return this.price != null;
  }

  public void setPriceIsSet(boolean value) {
    if (!value) {
      this.price = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDisplayPrice() {
    return this.displayPrice;
  }

  public CoinProductItem setDisplayPrice(@org.apache.thrift.annotation.Nullable java.lang.String displayPrice) {
    this.displayPrice = displayPrice;
    return this;
  }

  public void unsetDisplayPrice() {
    this.displayPrice = null;
  }

  /** Returns true if field displayPrice is set (has been assigned a value) and false otherwise */
  public boolean isSetDisplayPrice() {
    return this.displayPrice != null;
  }

  public void setDisplayPriceIsSet(boolean value) {
    if (!value) {
      this.displayPrice = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public CoinProductItem setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDesc() {
    return this.desc;
  }

  public CoinProductItem setDesc(@org.apache.thrift.annotation.Nullable java.lang.String desc) {
    this.desc = desc;
    return this;
  }

  public void unsetDesc() {
    this.desc = null;
  }

  /** Returns true if field desc is set (has been assigned a value) and false otherwise */
  public boolean isSetDesc() {
    return this.desc != null;
  }

  public void setDescIsSet(boolean value) {
    if (!value) {
      this.desc = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ITEM_ID:
      if (value == null) {
        unsetItemId();
      } else {
        setItemId((java.lang.String)value);
      }
      break;

    case COIN:
      if (value == null) {
        unsetCoin();
      } else {
        setCoin((java.lang.Integer)value);
      }
      break;

    case FREE_COIN:
      if (value == null) {
        unsetFreeCoin();
      } else {
        setFreeCoin((java.lang.Integer)value);
      }
      break;

    case CURRENCY:
      if (value == null) {
        unsetCurrency();
      } else {
        setCurrency((java.lang.String)value);
      }
      break;

    case PRICE:
      if (value == null) {
        unsetPrice();
      } else {
        setPrice((java.lang.String)value);
      }
      break;

    case DISPLAY_PRICE:
      if (value == null) {
        unsetDisplayPrice();
      } else {
        setDisplayPrice((java.lang.String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case DESC:
      if (value == null) {
        unsetDesc();
      } else {
        setDesc((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ITEM_ID:
      return getItemId();

    case COIN:
      return getCoin();

    case FREE_COIN:
      return getFreeCoin();

    case CURRENCY:
      return getCurrency();

    case PRICE:
      return getPrice();

    case DISPLAY_PRICE:
      return getDisplayPrice();

    case NAME:
      return getName();

    case DESC:
      return getDesc();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ITEM_ID:
      return isSetItemId();
    case COIN:
      return isSetCoin();
    case FREE_COIN:
      return isSetFreeCoin();
    case CURRENCY:
      return isSetCurrency();
    case PRICE:
      return isSetPrice();
    case DISPLAY_PRICE:
      return isSetDisplayPrice();
    case NAME:
      return isSetName();
    case DESC:
      return isSetDesc();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof CoinProductItem)
      return this.equals((CoinProductItem)that);
    return false;
  }

  public boolean equals(CoinProductItem that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_itemId = true && this.isSetItemId();
    boolean that_present_itemId = true && that.isSetItemId();
    if (this_present_itemId || that_present_itemId) {
      if (!(this_present_itemId && that_present_itemId))
        return false;
      if (!this.itemId.equals(that.itemId))
        return false;
    }

    boolean this_present_coin = true;
    boolean that_present_coin = true;
    if (this_present_coin || that_present_coin) {
      if (!(this_present_coin && that_present_coin))
        return false;
      if (this.coin != that.coin)
        return false;
    }

    boolean this_present_freeCoin = true;
    boolean that_present_freeCoin = true;
    if (this_present_freeCoin || that_present_freeCoin) {
      if (!(this_present_freeCoin && that_present_freeCoin))
        return false;
      if (this.freeCoin != that.freeCoin)
        return false;
    }

    boolean this_present_currency = true && this.isSetCurrency();
    boolean that_present_currency = true && that.isSetCurrency();
    if (this_present_currency || that_present_currency) {
      if (!(this_present_currency && that_present_currency))
        return false;
      if (!this.currency.equals(that.currency))
        return false;
    }

    boolean this_present_price = true && this.isSetPrice();
    boolean that_present_price = true && that.isSetPrice();
    if (this_present_price || that_present_price) {
      if (!(this_present_price && that_present_price))
        return false;
      if (!this.price.equals(that.price))
        return false;
    }

    boolean this_present_displayPrice = true && this.isSetDisplayPrice();
    boolean that_present_displayPrice = true && that.isSetDisplayPrice();
    if (this_present_displayPrice || that_present_displayPrice) {
      if (!(this_present_displayPrice && that_present_displayPrice))
        return false;
      if (!this.displayPrice.equals(that.displayPrice))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_desc = true && this.isSetDesc();
    boolean that_present_desc = true && that.isSetDesc();
    if (this_present_desc || that_present_desc) {
      if (!(this_present_desc && that_present_desc))
        return false;
      if (!this.desc.equals(that.desc))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetItemId()) ? 131071 : 524287);
    if (isSetItemId())
      hashCode = hashCode * 8191 + itemId.hashCode();

    hashCode = hashCode * 8191 + coin;

    hashCode = hashCode * 8191 + freeCoin;

    hashCode = hashCode * 8191 + ((isSetCurrency()) ? 131071 : 524287);
    if (isSetCurrency())
      hashCode = hashCode * 8191 + currency.hashCode();

    hashCode = hashCode * 8191 + ((isSetPrice()) ? 131071 : 524287);
    if (isSetPrice())
      hashCode = hashCode * 8191 + price.hashCode();

    hashCode = hashCode * 8191 + ((isSetDisplayPrice()) ? 131071 : 524287);
    if (isSetDisplayPrice())
      hashCode = hashCode * 8191 + displayPrice.hashCode();

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetDesc()) ? 131071 : 524287);
    if (isSetDesc())
      hashCode = hashCode * 8191 + desc.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(CoinProductItem other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetItemId(), other.isSetItemId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItemId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.itemId, other.itemId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCoin(), other.isSetCoin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCoin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.coin, other.coin);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetFreeCoin(), other.isSetFreeCoin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFreeCoin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.freeCoin, other.freeCoin);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCurrency(), other.isSetCurrency());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrency()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.currency, other.currency);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPrice(), other.isSetPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.price, other.price);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDisplayPrice(), other.isSetDisplayPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.displayPrice, other.displayPrice);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetName(), other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDesc(), other.isSetDesc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDesc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.desc, other.desc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("CoinProductItem(");
    boolean first = true;

    sb.append("itemId:");
    if (this.itemId == null) {
      sb.append("null");
    } else {
      sb.append(this.itemId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("coin:");
    sb.append(this.coin);
    first = false;
    if (!first) sb.append(", ");
    sb.append("freeCoin:");
    sb.append(this.freeCoin);
    first = false;
    if (!first) sb.append(", ");
    sb.append("currency:");
    if (this.currency == null) {
      sb.append("null");
    } else {
      sb.append(this.currency);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("price:");
    if (this.price == null) {
      sb.append("null");
    } else {
      sb.append(this.price);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("displayPrice:");
    if (this.displayPrice == null) {
      sb.append("null");
    } else {
      sb.append(this.displayPrice);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("desc:");
    if (this.desc == null) {
      sb.append("null");
    } else {
      sb.append(this.desc);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CoinProductItemStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CoinProductItemStandardScheme getScheme() {
      return new CoinProductItemStandardScheme();
    }
  }

  private static class CoinProductItemStandardScheme extends org.apache.thrift.scheme.StandardScheme<CoinProductItem> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CoinProductItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ITEM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.itemId = iprot.readString();
              struct.setItemIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COIN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.coin = iprot.readI32();
              struct.setCoinIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FREE_COIN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.freeCoin = iprot.readI32();
              struct.setFreeCoinIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CURRENCY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.currency = iprot.readString();
              struct.setCurrencyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.price = iprot.readString();
              struct.setPriceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DISPLAY_PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.displayPrice = iprot.readString();
              struct.setDisplayPriceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // DESC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.desc = iprot.readString();
              struct.setDescIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CoinProductItem struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.itemId != null) {
        oprot.writeFieldBegin(ITEM_ID_FIELD_DESC);
        oprot.writeString(struct.itemId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(COIN_FIELD_DESC);
      oprot.writeI32(struct.coin);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FREE_COIN_FIELD_DESC);
      oprot.writeI32(struct.freeCoin);
      oprot.writeFieldEnd();
      if (struct.currency != null) {
        oprot.writeFieldBegin(CURRENCY_FIELD_DESC);
        oprot.writeString(struct.currency);
        oprot.writeFieldEnd();
      }
      if (struct.price != null) {
        oprot.writeFieldBegin(PRICE_FIELD_DESC);
        oprot.writeString(struct.price);
        oprot.writeFieldEnd();
      }
      if (struct.displayPrice != null) {
        oprot.writeFieldBegin(DISPLAY_PRICE_FIELD_DESC);
        oprot.writeString(struct.displayPrice);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.desc != null) {
        oprot.writeFieldBegin(DESC_FIELD_DESC);
        oprot.writeString(struct.desc);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CoinProductItemTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CoinProductItemTupleScheme getScheme() {
      return new CoinProductItemTupleScheme();
    }
  }

  private static class CoinProductItemTupleScheme extends org.apache.thrift.scheme.TupleScheme<CoinProductItem> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CoinProductItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetItemId()) {
        optionals.set(0);
      }
      if (struct.isSetCoin()) {
        optionals.set(1);
      }
      if (struct.isSetFreeCoin()) {
        optionals.set(2);
      }
      if (struct.isSetCurrency()) {
        optionals.set(3);
      }
      if (struct.isSetPrice()) {
        optionals.set(4);
      }
      if (struct.isSetDisplayPrice()) {
        optionals.set(5);
      }
      if (struct.isSetName()) {
        optionals.set(6);
      }
      if (struct.isSetDesc()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetItemId()) {
        oprot.writeString(struct.itemId);
      }
      if (struct.isSetCoin()) {
        oprot.writeI32(struct.coin);
      }
      if (struct.isSetFreeCoin()) {
        oprot.writeI32(struct.freeCoin);
      }
      if (struct.isSetCurrency()) {
        oprot.writeString(struct.currency);
      }
      if (struct.isSetPrice()) {
        oprot.writeString(struct.price);
      }
      if (struct.isSetDisplayPrice()) {
        oprot.writeString(struct.displayPrice);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetDesc()) {
        oprot.writeString(struct.desc);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CoinProductItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.itemId = iprot.readString();
        struct.setItemIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.coin = iprot.readI32();
        struct.setCoinIsSet(true);
      }
      if (incoming.get(2)) {
        struct.freeCoin = iprot.readI32();
        struct.setFreeCoinIsSet(true);
      }
      if (incoming.get(3)) {
        struct.currency = iprot.readString();
        struct.setCurrencyIsSet(true);
      }
      if (incoming.get(4)) {
        struct.price = iprot.readString();
        struct.setPriceIsSet(true);
      }
      if (incoming.get(5)) {
        struct.displayPrice = iprot.readString();
        struct.setDisplayPriceIsSet(true);
      }
      if (incoming.get(6)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(7)) {
        struct.desc = iprot.readString();
        struct.setDescIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

