/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class ProductSimple implements org.apache.thrift.TBase<ProductSimple, ProductSimple._Fields>, java.io.Serializable, Cloneable, Comparable<ProductSimple> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProductSimple");

  private static final org.apache.thrift.protocol.TField PRODUCT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("productId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PACKAGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("packageId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField ON_SALE_FIELD_DESC = new org.apache.thrift.protocol.TField("onSale", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField VALID_UNTIL_FIELD_DESC = new org.apache.thrift.protocol.TField("validUntil", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField STICKER_ID_RANGES_FIELD_DESC = new org.apache.thrift.protocol.TField("stickerIdRanges", org.apache.thrift.protocol.TType.LIST, (short)10);
  private static final org.apache.thrift.protocol.TField GRANTED_BY_DEFAULT_FIELD_DESC = new org.apache.thrift.protocol.TField("grantedByDefault", org.apache.thrift.protocol.TType.BOOL, (short)41);
  private static final org.apache.thrift.protocol.TField DISPLAY_ORDER_FIELD_DESC = new org.apache.thrift.protocol.TField("displayOrder", org.apache.thrift.protocol.TType.I32, (short)42);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ProductSimpleStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ProductSimpleTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String productId; // required
  public long packageId; // required
  public int version; // required
  public boolean onSale; // required
  public long validUntil; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<StickerIdRange> stickerIdRanges; // required
  public boolean grantedByDefault; // required
  public int displayOrder; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PRODUCT_ID((short)1, "productId"),
    PACKAGE_ID((short)2, "packageId"),
    VERSION((short)3, "version"),
    ON_SALE((short)4, "onSale"),
    VALID_UNTIL((short)5, "validUntil"),
    STICKER_ID_RANGES((short)10, "stickerIdRanges"),
    GRANTED_BY_DEFAULT((short)41, "grantedByDefault"),
    DISPLAY_ORDER((short)42, "displayOrder");

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
        case 1: // PRODUCT_ID
          return PRODUCT_ID;
        case 2: // PACKAGE_ID
          return PACKAGE_ID;
        case 3: // VERSION
          return VERSION;
        case 4: // ON_SALE
          return ON_SALE;
        case 5: // VALID_UNTIL
          return VALID_UNTIL;
        case 10: // STICKER_ID_RANGES
          return STICKER_ID_RANGES;
        case 41: // GRANTED_BY_DEFAULT
          return GRANTED_BY_DEFAULT;
        case 42: // DISPLAY_ORDER
          return DISPLAY_ORDER;
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
  private static final int __PACKAGEID_ISSET_ID = 0;
  private static final int __VERSION_ISSET_ID = 1;
  private static final int __ONSALE_ISSET_ID = 2;
  private static final int __VALIDUNTIL_ISSET_ID = 3;
  private static final int __GRANTEDBYDEFAULT_ISSET_ID = 4;
  private static final int __DISPLAYORDER_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRODUCT_ID, new org.apache.thrift.meta_data.FieldMetaData("productId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PACKAGE_ID, new org.apache.thrift.meta_data.FieldMetaData("packageId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ON_SALE, new org.apache.thrift.meta_data.FieldMetaData("onSale", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.VALID_UNTIL, new org.apache.thrift.meta_data.FieldMetaData("validUntil", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.STICKER_ID_RANGES, new org.apache.thrift.meta_data.FieldMetaData("stickerIdRanges", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StickerIdRange.class))));
    tmpMap.put(_Fields.GRANTED_BY_DEFAULT, new org.apache.thrift.meta_data.FieldMetaData("grantedByDefault", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DISPLAY_ORDER, new org.apache.thrift.meta_data.FieldMetaData("displayOrder", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProductSimple.class, metaDataMap);
  }

  public ProductSimple() {
  }

  public ProductSimple(
    java.lang.String productId,
    long packageId,
    int version,
    boolean onSale,
    long validUntil,
    java.util.List<StickerIdRange> stickerIdRanges,
    boolean grantedByDefault,
    int displayOrder)
  {
    this();
    this.productId = productId;
    this.packageId = packageId;
    setPackageIdIsSet(true);
    this.version = version;
    setVersionIsSet(true);
    this.onSale = onSale;
    setOnSaleIsSet(true);
    this.validUntil = validUntil;
    setValidUntilIsSet(true);
    this.stickerIdRanges = stickerIdRanges;
    this.grantedByDefault = grantedByDefault;
    setGrantedByDefaultIsSet(true);
    this.displayOrder = displayOrder;
    setDisplayOrderIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProductSimple(ProductSimple other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetProductId()) {
      this.productId = other.productId;
    }
    this.packageId = other.packageId;
    this.version = other.version;
    this.onSale = other.onSale;
    this.validUntil = other.validUntil;
    if (other.isSetStickerIdRanges()) {
      java.util.List<StickerIdRange> __this__stickerIdRanges = new java.util.ArrayList<StickerIdRange>(other.stickerIdRanges.size());
      for (StickerIdRange other_element : other.stickerIdRanges) {
        __this__stickerIdRanges.add(new StickerIdRange(other_element));
      }
      this.stickerIdRanges = __this__stickerIdRanges;
    }
    this.grantedByDefault = other.grantedByDefault;
    this.displayOrder = other.displayOrder;
  }

  public ProductSimple deepCopy() {
    return new ProductSimple(this);
  }

  @Override
  public void clear() {
    this.productId = null;
    setPackageIdIsSet(false);
    this.packageId = 0;
    setVersionIsSet(false);
    this.version = 0;
    setOnSaleIsSet(false);
    this.onSale = false;
    setValidUntilIsSet(false);
    this.validUntil = 0;
    this.stickerIdRanges = null;
    setGrantedByDefaultIsSet(false);
    this.grantedByDefault = false;
    setDisplayOrderIsSet(false);
    this.displayOrder = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getProductId() {
    return this.productId;
  }

  public ProductSimple setProductId(@org.apache.thrift.annotation.Nullable java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  public void unsetProductId() {
    this.productId = null;
  }

  /** Returns true if field productId is set (has been assigned a value) and false otherwise */
  public boolean isSetProductId() {
    return this.productId != null;
  }

  public void setProductIdIsSet(boolean value) {
    if (!value) {
      this.productId = null;
    }
  }

  public long getPackageId() {
    return this.packageId;
  }

  public ProductSimple setPackageId(long packageId) {
    this.packageId = packageId;
    setPackageIdIsSet(true);
    return this;
  }

  public void unsetPackageId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PACKAGEID_ISSET_ID);
  }

  /** Returns true if field packageId is set (has been assigned a value) and false otherwise */
  public boolean isSetPackageId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PACKAGEID_ISSET_ID);
  }

  public void setPackageIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PACKAGEID_ISSET_ID, value);
  }

  public int getVersion() {
    return this.version;
  }

  public ProductSimple setVersion(int version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  public boolean isOnSale() {
    return this.onSale;
  }

  public ProductSimple setOnSale(boolean onSale) {
    this.onSale = onSale;
    setOnSaleIsSet(true);
    return this;
  }

  public void unsetOnSale() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ONSALE_ISSET_ID);
  }

  /** Returns true if field onSale is set (has been assigned a value) and false otherwise */
  public boolean isSetOnSale() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ONSALE_ISSET_ID);
  }

  public void setOnSaleIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ONSALE_ISSET_ID, value);
  }

  public long getValidUntil() {
    return this.validUntil;
  }

  public ProductSimple setValidUntil(long validUntil) {
    this.validUntil = validUntil;
    setValidUntilIsSet(true);
    return this;
  }

  public void unsetValidUntil() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VALIDUNTIL_ISSET_ID);
  }

  /** Returns true if field validUntil is set (has been assigned a value) and false otherwise */
  public boolean isSetValidUntil() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VALIDUNTIL_ISSET_ID);
  }

  public void setValidUntilIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VALIDUNTIL_ISSET_ID, value);
  }

  public int getStickerIdRangesSize() {
    return (this.stickerIdRanges == null) ? 0 : this.stickerIdRanges.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<StickerIdRange> getStickerIdRangesIterator() {
    return (this.stickerIdRanges == null) ? null : this.stickerIdRanges.iterator();
  }

  public void addToStickerIdRanges(StickerIdRange elem) {
    if (this.stickerIdRanges == null) {
      this.stickerIdRanges = new java.util.ArrayList<StickerIdRange>();
    }
    this.stickerIdRanges.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<StickerIdRange> getStickerIdRanges() {
    return this.stickerIdRanges;
  }

  public ProductSimple setStickerIdRanges(@org.apache.thrift.annotation.Nullable java.util.List<StickerIdRange> stickerIdRanges) {
    this.stickerIdRanges = stickerIdRanges;
    return this;
  }

  public void unsetStickerIdRanges() {
    this.stickerIdRanges = null;
  }

  /** Returns true if field stickerIdRanges is set (has been assigned a value) and false otherwise */
  public boolean isSetStickerIdRanges() {
    return this.stickerIdRanges != null;
  }

  public void setStickerIdRangesIsSet(boolean value) {
    if (!value) {
      this.stickerIdRanges = null;
    }
  }

  public boolean isGrantedByDefault() {
    return this.grantedByDefault;
  }

  public ProductSimple setGrantedByDefault(boolean grantedByDefault) {
    this.grantedByDefault = grantedByDefault;
    setGrantedByDefaultIsSet(true);
    return this;
  }

  public void unsetGrantedByDefault() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __GRANTEDBYDEFAULT_ISSET_ID);
  }

  /** Returns true if field grantedByDefault is set (has been assigned a value) and false otherwise */
  public boolean isSetGrantedByDefault() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __GRANTEDBYDEFAULT_ISSET_ID);
  }

  public void setGrantedByDefaultIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __GRANTEDBYDEFAULT_ISSET_ID, value);
  }

  public int getDisplayOrder() {
    return this.displayOrder;
  }

  public ProductSimple setDisplayOrder(int displayOrder) {
    this.displayOrder = displayOrder;
    setDisplayOrderIsSet(true);
    return this;
  }

  public void unsetDisplayOrder() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DISPLAYORDER_ISSET_ID);
  }

  /** Returns true if field displayOrder is set (has been assigned a value) and false otherwise */
  public boolean isSetDisplayOrder() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DISPLAYORDER_ISSET_ID);
  }

  public void setDisplayOrderIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DISPLAYORDER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PRODUCT_ID:
      if (value == null) {
        unsetProductId();
      } else {
        setProductId((java.lang.String)value);
      }
      break;

    case PACKAGE_ID:
      if (value == null) {
        unsetPackageId();
      } else {
        setPackageId((java.lang.Long)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((java.lang.Integer)value);
      }
      break;

    case ON_SALE:
      if (value == null) {
        unsetOnSale();
      } else {
        setOnSale((java.lang.Boolean)value);
      }
      break;

    case VALID_UNTIL:
      if (value == null) {
        unsetValidUntil();
      } else {
        setValidUntil((java.lang.Long)value);
      }
      break;

    case STICKER_ID_RANGES:
      if (value == null) {
        unsetStickerIdRanges();
      } else {
        setStickerIdRanges((java.util.List<StickerIdRange>)value);
      }
      break;

    case GRANTED_BY_DEFAULT:
      if (value == null) {
        unsetGrantedByDefault();
      } else {
        setGrantedByDefault((java.lang.Boolean)value);
      }
      break;

    case DISPLAY_ORDER:
      if (value == null) {
        unsetDisplayOrder();
      } else {
        setDisplayOrder((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PRODUCT_ID:
      return getProductId();

    case PACKAGE_ID:
      return getPackageId();

    case VERSION:
      return getVersion();

    case ON_SALE:
      return isOnSale();

    case VALID_UNTIL:
      return getValidUntil();

    case STICKER_ID_RANGES:
      return getStickerIdRanges();

    case GRANTED_BY_DEFAULT:
      return isGrantedByDefault();

    case DISPLAY_ORDER:
      return getDisplayOrder();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PRODUCT_ID:
      return isSetProductId();
    case PACKAGE_ID:
      return isSetPackageId();
    case VERSION:
      return isSetVersion();
    case ON_SALE:
      return isSetOnSale();
    case VALID_UNTIL:
      return isSetValidUntil();
    case STICKER_ID_RANGES:
      return isSetStickerIdRanges();
    case GRANTED_BY_DEFAULT:
      return isSetGrantedByDefault();
    case DISPLAY_ORDER:
      return isSetDisplayOrder();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ProductSimple)
      return this.equals((ProductSimple)that);
    return false;
  }

  public boolean equals(ProductSimple that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_productId = true && this.isSetProductId();
    boolean that_present_productId = true && that.isSetProductId();
    if (this_present_productId || that_present_productId) {
      if (!(this_present_productId && that_present_productId))
        return false;
      if (!this.productId.equals(that.productId))
        return false;
    }

    boolean this_present_packageId = true;
    boolean that_present_packageId = true;
    if (this_present_packageId || that_present_packageId) {
      if (!(this_present_packageId && that_present_packageId))
        return false;
      if (this.packageId != that.packageId)
        return false;
    }

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_onSale = true;
    boolean that_present_onSale = true;
    if (this_present_onSale || that_present_onSale) {
      if (!(this_present_onSale && that_present_onSale))
        return false;
      if (this.onSale != that.onSale)
        return false;
    }

    boolean this_present_validUntil = true;
    boolean that_present_validUntil = true;
    if (this_present_validUntil || that_present_validUntil) {
      if (!(this_present_validUntil && that_present_validUntil))
        return false;
      if (this.validUntil != that.validUntil)
        return false;
    }

    boolean this_present_stickerIdRanges = true && this.isSetStickerIdRanges();
    boolean that_present_stickerIdRanges = true && that.isSetStickerIdRanges();
    if (this_present_stickerIdRanges || that_present_stickerIdRanges) {
      if (!(this_present_stickerIdRanges && that_present_stickerIdRanges))
        return false;
      if (!this.stickerIdRanges.equals(that.stickerIdRanges))
        return false;
    }

    boolean this_present_grantedByDefault = true;
    boolean that_present_grantedByDefault = true;
    if (this_present_grantedByDefault || that_present_grantedByDefault) {
      if (!(this_present_grantedByDefault && that_present_grantedByDefault))
        return false;
      if (this.grantedByDefault != that.grantedByDefault)
        return false;
    }

    boolean this_present_displayOrder = true;
    boolean that_present_displayOrder = true;
    if (this_present_displayOrder || that_present_displayOrder) {
      if (!(this_present_displayOrder && that_present_displayOrder))
        return false;
      if (this.displayOrder != that.displayOrder)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetProductId()) ? 131071 : 524287);
    if (isSetProductId())
      hashCode = hashCode * 8191 + productId.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(packageId);

    hashCode = hashCode * 8191 + version;

    hashCode = hashCode * 8191 + ((onSale) ? 131071 : 524287);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(validUntil);

    hashCode = hashCode * 8191 + ((isSetStickerIdRanges()) ? 131071 : 524287);
    if (isSetStickerIdRanges())
      hashCode = hashCode * 8191 + stickerIdRanges.hashCode();

    hashCode = hashCode * 8191 + ((grantedByDefault) ? 131071 : 524287);

    hashCode = hashCode * 8191 + displayOrder;

    return hashCode;
  }

  @Override
  public int compareTo(ProductSimple other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetProductId(), other.isSetProductId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProductId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.productId, other.productId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPackageId(), other.isSetPackageId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPackageId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.packageId, other.packageId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetVersion(), other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetOnSale(), other.isSetOnSale());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOnSale()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.onSale, other.onSale);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetValidUntil(), other.isSetValidUntil());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValidUntil()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.validUntil, other.validUntil);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetStickerIdRanges(), other.isSetStickerIdRanges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStickerIdRanges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stickerIdRanges, other.stickerIdRanges);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetGrantedByDefault(), other.isSetGrantedByDefault());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrantedByDefault()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.grantedByDefault, other.grantedByDefault);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDisplayOrder(), other.isSetDisplayOrder());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayOrder()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.displayOrder, other.displayOrder);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ProductSimple(");
    boolean first = true;

    sb.append("productId:");
    if (this.productId == null) {
      sb.append("null");
    } else {
      sb.append(this.productId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("packageId:");
    sb.append(this.packageId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("onSale:");
    sb.append(this.onSale);
    first = false;
    if (!first) sb.append(", ");
    sb.append("validUntil:");
    sb.append(this.validUntil);
    first = false;
    if (!first) sb.append(", ");
    sb.append("stickerIdRanges:");
    if (this.stickerIdRanges == null) {
      sb.append("null");
    } else {
      sb.append(this.stickerIdRanges);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("grantedByDefault:");
    sb.append(this.grantedByDefault);
    first = false;
    if (!first) sb.append(", ");
    sb.append("displayOrder:");
    sb.append(this.displayOrder);
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

  private static class ProductSimpleStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProductSimpleStandardScheme getScheme() {
      return new ProductSimpleStandardScheme();
    }
  }

  private static class ProductSimpleStandardScheme extends org.apache.thrift.scheme.StandardScheme<ProductSimple> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProductSimple struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PRODUCT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.productId = iprot.readString();
              struct.setProductIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PACKAGE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.packageId = iprot.readI64();
              struct.setPackageIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.version = iprot.readI32();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ON_SALE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.onSale = iprot.readBool();
              struct.setOnSaleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // VALID_UNTIL
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.validUntil = iprot.readI64();
              struct.setValidUntilIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // STICKER_ID_RANGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list402 = iprot.readListBegin();
                struct.stickerIdRanges = new java.util.ArrayList<StickerIdRange>(_list402.size);
                @org.apache.thrift.annotation.Nullable StickerIdRange _elem403;
                for (int _i404 = 0; _i404 < _list402.size; ++_i404)
                {
                  _elem403 = new StickerIdRange();
                  _elem403.read(iprot);
                  struct.stickerIdRanges.add(_elem403);
                }
                iprot.readListEnd();
              }
              struct.setStickerIdRangesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 41: // GRANTED_BY_DEFAULT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.grantedByDefault = iprot.readBool();
              struct.setGrantedByDefaultIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 42: // DISPLAY_ORDER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.displayOrder = iprot.readI32();
              struct.setDisplayOrderIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProductSimple struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.productId != null) {
        oprot.writeFieldBegin(PRODUCT_ID_FIELD_DESC);
        oprot.writeString(struct.productId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PACKAGE_ID_FIELD_DESC);
      oprot.writeI64(struct.packageId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI32(struct.version);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ON_SALE_FIELD_DESC);
      oprot.writeBool(struct.onSale);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VALID_UNTIL_FIELD_DESC);
      oprot.writeI64(struct.validUntil);
      oprot.writeFieldEnd();
      if (struct.stickerIdRanges != null) {
        oprot.writeFieldBegin(STICKER_ID_RANGES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.stickerIdRanges.size()));
          for (StickerIdRange _iter405 : struct.stickerIdRanges)
          {
            _iter405.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(GRANTED_BY_DEFAULT_FIELD_DESC);
      oprot.writeBool(struct.grantedByDefault);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DISPLAY_ORDER_FIELD_DESC);
      oprot.writeI32(struct.displayOrder);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProductSimpleTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProductSimpleTupleScheme getScheme() {
      return new ProductSimpleTupleScheme();
    }
  }

  private static class ProductSimpleTupleScheme extends org.apache.thrift.scheme.TupleScheme<ProductSimple> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProductSimple struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetProductId()) {
        optionals.set(0);
      }
      if (struct.isSetPackageId()) {
        optionals.set(1);
      }
      if (struct.isSetVersion()) {
        optionals.set(2);
      }
      if (struct.isSetOnSale()) {
        optionals.set(3);
      }
      if (struct.isSetValidUntil()) {
        optionals.set(4);
      }
      if (struct.isSetStickerIdRanges()) {
        optionals.set(5);
      }
      if (struct.isSetGrantedByDefault()) {
        optionals.set(6);
      }
      if (struct.isSetDisplayOrder()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetProductId()) {
        oprot.writeString(struct.productId);
      }
      if (struct.isSetPackageId()) {
        oprot.writeI64(struct.packageId);
      }
      if (struct.isSetVersion()) {
        oprot.writeI32(struct.version);
      }
      if (struct.isSetOnSale()) {
        oprot.writeBool(struct.onSale);
      }
      if (struct.isSetValidUntil()) {
        oprot.writeI64(struct.validUntil);
      }
      if (struct.isSetStickerIdRanges()) {
        {
          oprot.writeI32(struct.stickerIdRanges.size());
          for (StickerIdRange _iter406 : struct.stickerIdRanges)
          {
            _iter406.write(oprot);
          }
        }
      }
      if (struct.isSetGrantedByDefault()) {
        oprot.writeBool(struct.grantedByDefault);
      }
      if (struct.isSetDisplayOrder()) {
        oprot.writeI32(struct.displayOrder);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProductSimple struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.productId = iprot.readString();
        struct.setProductIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.packageId = iprot.readI64();
        struct.setPackageIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.version = iprot.readI32();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.onSale = iprot.readBool();
        struct.setOnSaleIsSet(true);
      }
      if (incoming.get(4)) {
        struct.validUntil = iprot.readI64();
        struct.setValidUntilIsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TList _list407 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.stickerIdRanges = new java.util.ArrayList<StickerIdRange>(_list407.size);
          @org.apache.thrift.annotation.Nullable StickerIdRange _elem408;
          for (int _i409 = 0; _i409 < _list407.size; ++_i409)
          {
            _elem408 = new StickerIdRange();
            _elem408.read(iprot);
            struct.stickerIdRanges.add(_elem408);
          }
        }
        struct.setStickerIdRangesIsSet(true);
      }
      if (incoming.get(6)) {
        struct.grantedByDefault = iprot.readBool();
        struct.setGrantedByDefaultIsSet(true);
      }
      if (incoming.get(7)) {
        struct.displayOrder = iprot.readI32();
        struct.setDisplayOrderIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

