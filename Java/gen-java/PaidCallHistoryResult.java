/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class PaidCallHistoryResult implements org.apache.thrift.TBase<PaidCallHistoryResult, PaidCallHistoryResult._Fields>, java.io.Serializable, Cloneable, Comparable<PaidCallHistoryResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PaidCallHistoryResult");

  private static final org.apache.thrift.protocol.TField HISTORYS_FIELD_DESC = new org.apache.thrift.protocol.TField("historys", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField HAS_NEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("hasNext", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PaidCallHistoryResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PaidCallHistoryResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<PaidCallHistory> historys; // required
  public boolean hasNext; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HISTORYS((short)1, "historys"),
    HAS_NEXT((short)2, "hasNext");

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
        case 1: // HISTORYS
          return HISTORYS;
        case 2: // HAS_NEXT
          return HAS_NEXT;
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
  private static final int __HASNEXT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HISTORYS, new org.apache.thrift.meta_data.FieldMetaData("historys", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PaidCallHistory.class))));
    tmpMap.put(_Fields.HAS_NEXT, new org.apache.thrift.meta_data.FieldMetaData("hasNext", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PaidCallHistoryResult.class, metaDataMap);
  }

  public PaidCallHistoryResult() {
  }

  public PaidCallHistoryResult(
    java.util.List<PaidCallHistory> historys,
    boolean hasNext)
  {
    this();
    this.historys = historys;
    this.hasNext = hasNext;
    setHasNextIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PaidCallHistoryResult(PaidCallHistoryResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHistorys()) {
      java.util.List<PaidCallHistory> __this__historys = new java.util.ArrayList<PaidCallHistory>(other.historys.size());
      for (PaidCallHistory other_element : other.historys) {
        __this__historys.add(new PaidCallHistory(other_element));
      }
      this.historys = __this__historys;
    }
    this.hasNext = other.hasNext;
  }

  public PaidCallHistoryResult deepCopy() {
    return new PaidCallHistoryResult(this);
  }

  @Override
  public void clear() {
    this.historys = null;
    setHasNextIsSet(false);
    this.hasNext = false;
  }

  public int getHistorysSize() {
    return (this.historys == null) ? 0 : this.historys.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<PaidCallHistory> getHistorysIterator() {
    return (this.historys == null) ? null : this.historys.iterator();
  }

  public void addToHistorys(PaidCallHistory elem) {
    if (this.historys == null) {
      this.historys = new java.util.ArrayList<PaidCallHistory>();
    }
    this.historys.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<PaidCallHistory> getHistorys() {
    return this.historys;
  }

  public PaidCallHistoryResult setHistorys(@org.apache.thrift.annotation.Nullable java.util.List<PaidCallHistory> historys) {
    this.historys = historys;
    return this;
  }

  public void unsetHistorys() {
    this.historys = null;
  }

  /** Returns true if field historys is set (has been assigned a value) and false otherwise */
  public boolean isSetHistorys() {
    return this.historys != null;
  }

  public void setHistorysIsSet(boolean value) {
    if (!value) {
      this.historys = null;
    }
  }

  public boolean isHasNext() {
    return this.hasNext;
  }

  public PaidCallHistoryResult setHasNext(boolean hasNext) {
    this.hasNext = hasNext;
    setHasNextIsSet(true);
    return this;
  }

  public void unsetHasNext() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HASNEXT_ISSET_ID);
  }

  /** Returns true if field hasNext is set (has been assigned a value) and false otherwise */
  public boolean isSetHasNext() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HASNEXT_ISSET_ID);
  }

  public void setHasNextIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HASNEXT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case HISTORYS:
      if (value == null) {
        unsetHistorys();
      } else {
        setHistorys((java.util.List<PaidCallHistory>)value);
      }
      break;

    case HAS_NEXT:
      if (value == null) {
        unsetHasNext();
      } else {
        setHasNext((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case HISTORYS:
      return getHistorys();

    case HAS_NEXT:
      return isHasNext();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case HISTORYS:
      return isSetHistorys();
    case HAS_NEXT:
      return isSetHasNext();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof PaidCallHistoryResult)
      return this.equals((PaidCallHistoryResult)that);
    return false;
  }

  public boolean equals(PaidCallHistoryResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_historys = true && this.isSetHistorys();
    boolean that_present_historys = true && that.isSetHistorys();
    if (this_present_historys || that_present_historys) {
      if (!(this_present_historys && that_present_historys))
        return false;
      if (!this.historys.equals(that.historys))
        return false;
    }

    boolean this_present_hasNext = true;
    boolean that_present_hasNext = true;
    if (this_present_hasNext || that_present_hasNext) {
      if (!(this_present_hasNext && that_present_hasNext))
        return false;
      if (this.hasNext != that.hasNext)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetHistorys()) ? 131071 : 524287);
    if (isSetHistorys())
      hashCode = hashCode * 8191 + historys.hashCode();

    hashCode = hashCode * 8191 + ((hasNext) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(PaidCallHistoryResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetHistorys(), other.isSetHistorys());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHistorys()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.historys, other.historys);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetHasNext(), other.isSetHasNext());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasNext()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hasNext, other.hasNext);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PaidCallHistoryResult(");
    boolean first = true;

    sb.append("historys:");
    if (this.historys == null) {
      sb.append("null");
    } else {
      sb.append(this.historys);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hasNext:");
    sb.append(this.hasNext);
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

  private static class PaidCallHistoryResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PaidCallHistoryResultStandardScheme getScheme() {
      return new PaidCallHistoryResultStandardScheme();
    }
  }

  private static class PaidCallHistoryResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<PaidCallHistoryResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PaidCallHistoryResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HISTORYS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list32 = iprot.readListBegin();
                struct.historys = new java.util.ArrayList<PaidCallHistory>(_list32.size);
                @org.apache.thrift.annotation.Nullable PaidCallHistory _elem33;
                for (int _i34 = 0; _i34 < _list32.size; ++_i34)
                {
                  _elem33 = new PaidCallHistory();
                  _elem33.read(iprot);
                  struct.historys.add(_elem33);
                }
                iprot.readListEnd();
              }
              struct.setHistorysIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HAS_NEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.hasNext = iprot.readBool();
              struct.setHasNextIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PaidCallHistoryResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.historys != null) {
        oprot.writeFieldBegin(HISTORYS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.historys.size()));
          for (PaidCallHistory _iter35 : struct.historys)
          {
            _iter35.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(HAS_NEXT_FIELD_DESC);
      oprot.writeBool(struct.hasNext);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PaidCallHistoryResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PaidCallHistoryResultTupleScheme getScheme() {
      return new PaidCallHistoryResultTupleScheme();
    }
  }

  private static class PaidCallHistoryResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<PaidCallHistoryResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PaidCallHistoryResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetHistorys()) {
        optionals.set(0);
      }
      if (struct.isSetHasNext()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetHistorys()) {
        {
          oprot.writeI32(struct.historys.size());
          for (PaidCallHistory _iter36 : struct.historys)
          {
            _iter36.write(oprot);
          }
        }
      }
      if (struct.isSetHasNext()) {
        oprot.writeBool(struct.hasNext);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PaidCallHistoryResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list37 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.historys = new java.util.ArrayList<PaidCallHistory>(_list37.size);
          @org.apache.thrift.annotation.Nullable PaidCallHistory _elem38;
          for (int _i39 = 0; _i39 < _list37.size; ++_i39)
          {
            _elem38 = new PaidCallHistory();
            _elem38.read(iprot);
            struct.historys.add(_elem38);
          }
        }
        struct.setHistorysIsSet(true);
      }
      if (incoming.get(1)) {
        struct.hasNext = iprot.readBool();
        struct.setHasNextIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
