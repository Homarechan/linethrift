/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2020-04-18")
public class SpotPhoneNumberResponse implements org.apache.thrift.TBase<SpotPhoneNumberResponse, SpotPhoneNumberResponse._Fields>, java.io.Serializable, Cloneable, Comparable<SpotPhoneNumberResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SpotPhoneNumberResponse");

  private static final org.apache.thrift.protocol.TField SPOT_ITEMS_FIELD_DESC = new org.apache.thrift.protocol.TField("spotItems", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SpotPhoneNumberResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SpotPhoneNumberResponseTupleSchemeFactory();

  public java.util.List<SpotItem> spotItems; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SPOT_ITEMS((short)1, "spotItems");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SPOT_ITEMS
          return SPOT_ITEMS;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SPOT_ITEMS, new org.apache.thrift.meta_data.FieldMetaData("spotItems", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SpotItem.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SpotPhoneNumberResponse.class, metaDataMap);
  }

  public SpotPhoneNumberResponse() {
  }

  public SpotPhoneNumberResponse(
    java.util.List<SpotItem> spotItems)
  {
    this();
    this.spotItems = spotItems;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SpotPhoneNumberResponse(SpotPhoneNumberResponse other) {
    if (other.isSetSpotItems()) {
      java.util.List<SpotItem> __this__spotItems = new java.util.ArrayList<SpotItem>(other.spotItems.size());
      for (SpotItem other_element : other.spotItems) {
        __this__spotItems.add(new SpotItem(other_element));
      }
      this.spotItems = __this__spotItems;
    }
  }

  public SpotPhoneNumberResponse deepCopy() {
    return new SpotPhoneNumberResponse(this);
  }

  @Override
  public void clear() {
    this.spotItems = null;
  }

  public int getSpotItemsSize() {
    return (this.spotItems == null) ? 0 : this.spotItems.size();
  }

  public java.util.Iterator<SpotItem> getSpotItemsIterator() {
    return (this.spotItems == null) ? null : this.spotItems.iterator();
  }

  public void addToSpotItems(SpotItem elem) {
    if (this.spotItems == null) {
      this.spotItems = new java.util.ArrayList<SpotItem>();
    }
    this.spotItems.add(elem);
  }

  public java.util.List<SpotItem> getSpotItems() {
    return this.spotItems;
  }

  public SpotPhoneNumberResponse setSpotItems(java.util.List<SpotItem> spotItems) {
    this.spotItems = spotItems;
    return this;
  }

  public void unsetSpotItems() {
    this.spotItems = null;
  }

  /** Returns true if field spotItems is set (has been assigned a value) and false otherwise */
  public boolean isSetSpotItems() {
    return this.spotItems != null;
  }

  public void setSpotItemsIsSet(boolean value) {
    if (!value) {
      this.spotItems = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SPOT_ITEMS:
      if (value == null) {
        unsetSpotItems();
      } else {
        setSpotItems((java.util.List<SpotItem>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SPOT_ITEMS:
      return getSpotItems();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SPOT_ITEMS:
      return isSetSpotItems();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SpotPhoneNumberResponse)
      return this.equals((SpotPhoneNumberResponse)that);
    return false;
  }

  public boolean equals(SpotPhoneNumberResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_spotItems = true && this.isSetSpotItems();
    boolean that_present_spotItems = true && that.isSetSpotItems();
    if (this_present_spotItems || that_present_spotItems) {
      if (!(this_present_spotItems && that_present_spotItems))
        return false;
      if (!this.spotItems.equals(that.spotItems))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSpotItems()) ? 131071 : 524287);
    if (isSetSpotItems())
      hashCode = hashCode * 8191 + spotItems.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SpotPhoneNumberResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSpotItems()).compareTo(other.isSetSpotItems());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpotItems()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.spotItems, other.spotItems);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SpotPhoneNumberResponse(");
    boolean first = true;

    sb.append("spotItems:");
    if (this.spotItems == null) {
      sb.append("null");
    } else {
      sb.append(this.spotItems);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SpotPhoneNumberResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SpotPhoneNumberResponseStandardScheme getScheme() {
      return new SpotPhoneNumberResponseStandardScheme();
    }
  }

  private static class SpotPhoneNumberResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<SpotPhoneNumberResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SpotPhoneNumberResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SPOT_ITEMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.spotItems = new java.util.ArrayList<SpotItem>(_list24.size);
                SpotItem _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = new SpotItem();
                  _elem25.read(iprot);
                  struct.spotItems.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setSpotItemsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SpotPhoneNumberResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.spotItems != null) {
        oprot.writeFieldBegin(SPOT_ITEMS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.spotItems.size()));
          for (SpotItem _iter27 : struct.spotItems)
          {
            _iter27.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SpotPhoneNumberResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SpotPhoneNumberResponseTupleScheme getScheme() {
      return new SpotPhoneNumberResponseTupleScheme();
    }
  }

  private static class SpotPhoneNumberResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<SpotPhoneNumberResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SpotPhoneNumberResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSpotItems()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetSpotItems()) {
        {
          oprot.writeI32(struct.spotItems.size());
          for (SpotItem _iter28 : struct.spotItems)
          {
            _iter28.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SpotPhoneNumberResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.spotItems = new java.util.ArrayList<SpotItem>(_list29.size);
          SpotItem _elem30;
          for (int _i31 = 0; _i31 < _list29.size; ++_i31)
          {
            _elem30 = new SpotItem();
            _elem30.read(iprot);
            struct.spotItems.add(_elem30);
          }
        }
        struct.setSpotItemsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

