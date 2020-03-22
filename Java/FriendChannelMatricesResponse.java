/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class FriendChannelMatricesResponse implements org.apache.thrift.TBase<FriendChannelMatricesResponse, FriendChannelMatricesResponse._Fields>, java.io.Serializable, Cloneable, Comparable<FriendChannelMatricesResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FriendChannelMatricesResponse");

  private static final org.apache.thrift.protocol.TField EXPIRES_FIELD_DESC = new org.apache.thrift.protocol.TField("expires", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField MATRICES_FIELD_DESC = new org.apache.thrift.protocol.TField("matrices", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new FriendChannelMatricesResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new FriendChannelMatricesResponseTupleSchemeFactory();

  public long expires; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<FriendChannelMatrix> matrices; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXPIRES((short)1, "expires"),
    MATRICES((short)2, "matrices");

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
        case 1: // EXPIRES
          return EXPIRES;
        case 2: // MATRICES
          return MATRICES;
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
  private static final int __EXPIRES_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXPIRES, new org.apache.thrift.meta_data.FieldMetaData("expires", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MATRICES, new org.apache.thrift.meta_data.FieldMetaData("matrices", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FriendChannelMatrix.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FriendChannelMatricesResponse.class, metaDataMap);
  }

  public FriendChannelMatricesResponse() {
  }

  public FriendChannelMatricesResponse(
    long expires,
    java.util.List<FriendChannelMatrix> matrices)
  {
    this();
    this.expires = expires;
    setExpiresIsSet(true);
    this.matrices = matrices;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FriendChannelMatricesResponse(FriendChannelMatricesResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.expires = other.expires;
    if (other.isSetMatrices()) {
      java.util.List<FriendChannelMatrix> __this__matrices = new java.util.ArrayList<FriendChannelMatrix>(other.matrices.size());
      for (FriendChannelMatrix other_element : other.matrices) {
        __this__matrices.add(new FriendChannelMatrix(other_element));
      }
      this.matrices = __this__matrices;
    }
  }

  public FriendChannelMatricesResponse deepCopy() {
    return new FriendChannelMatricesResponse(this);
  }

  @Override
  public void clear() {
    setExpiresIsSet(false);
    this.expires = 0;
    this.matrices = null;
  }

  public long getExpires() {
    return this.expires;
  }

  public FriendChannelMatricesResponse setExpires(long expires) {
    this.expires = expires;
    setExpiresIsSet(true);
    return this;
  }

  public void unsetExpires() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EXPIRES_ISSET_ID);
  }

  /** Returns true if field expires is set (has been assigned a value) and false otherwise */
  public boolean isSetExpires() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EXPIRES_ISSET_ID);
  }

  public void setExpiresIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EXPIRES_ISSET_ID, value);
  }

  public int getMatricesSize() {
    return (this.matrices == null) ? 0 : this.matrices.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<FriendChannelMatrix> getMatricesIterator() {
    return (this.matrices == null) ? null : this.matrices.iterator();
  }

  public void addToMatrices(FriendChannelMatrix elem) {
    if (this.matrices == null) {
      this.matrices = new java.util.ArrayList<FriendChannelMatrix>();
    }
    this.matrices.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<FriendChannelMatrix> getMatrices() {
    return this.matrices;
  }

  public FriendChannelMatricesResponse setMatrices(@org.apache.thrift.annotation.Nullable java.util.List<FriendChannelMatrix> matrices) {
    this.matrices = matrices;
    return this;
  }

  public void unsetMatrices() {
    this.matrices = null;
  }

  /** Returns true if field matrices is set (has been assigned a value) and false otherwise */
  public boolean isSetMatrices() {
    return this.matrices != null;
  }

  public void setMatricesIsSet(boolean value) {
    if (!value) {
      this.matrices = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case EXPIRES:
      if (value == null) {
        unsetExpires();
      } else {
        setExpires((java.lang.Long)value);
      }
      break;

    case MATRICES:
      if (value == null) {
        unsetMatrices();
      } else {
        setMatrices((java.util.List<FriendChannelMatrix>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case EXPIRES:
      return getExpires();

    case MATRICES:
      return getMatrices();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case EXPIRES:
      return isSetExpires();
    case MATRICES:
      return isSetMatrices();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof FriendChannelMatricesResponse)
      return this.equals((FriendChannelMatricesResponse)that);
    return false;
  }

  public boolean equals(FriendChannelMatricesResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_expires = true;
    boolean that_present_expires = true;
    if (this_present_expires || that_present_expires) {
      if (!(this_present_expires && that_present_expires))
        return false;
      if (this.expires != that.expires)
        return false;
    }

    boolean this_present_matrices = true && this.isSetMatrices();
    boolean that_present_matrices = true && that.isSetMatrices();
    if (this_present_matrices || that_present_matrices) {
      if (!(this_present_matrices && that_present_matrices))
        return false;
      if (!this.matrices.equals(that.matrices))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(expires);

    hashCode = hashCode * 8191 + ((isSetMatrices()) ? 131071 : 524287);
    if (isSetMatrices())
      hashCode = hashCode * 8191 + matrices.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(FriendChannelMatricesResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetExpires(), other.isSetExpires());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpires()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expires, other.expires);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMatrices(), other.isSetMatrices());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMatrices()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.matrices, other.matrices);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("FriendChannelMatricesResponse(");
    boolean first = true;

    sb.append("expires:");
    sb.append(this.expires);
    first = false;
    if (!first) sb.append(", ");
    sb.append("matrices:");
    if (this.matrices == null) {
      sb.append("null");
    } else {
      sb.append(this.matrices);
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

  private static class FriendChannelMatricesResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FriendChannelMatricesResponseStandardScheme getScheme() {
      return new FriendChannelMatricesResponseStandardScheme();
    }
  }

  private static class FriendChannelMatricesResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<FriendChannelMatricesResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FriendChannelMatricesResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXPIRES
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.expires = iprot.readI64();
              struct.setExpiresIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MATRICES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list250 = iprot.readListBegin();
                struct.matrices = new java.util.ArrayList<FriendChannelMatrix>(_list250.size);
                @org.apache.thrift.annotation.Nullable FriendChannelMatrix _elem251;
                for (int _i252 = 0; _i252 < _list250.size; ++_i252)
                {
                  _elem251 = new FriendChannelMatrix();
                  _elem251.read(iprot);
                  struct.matrices.add(_elem251);
                }
                iprot.readListEnd();
              }
              struct.setMatricesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FriendChannelMatricesResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(EXPIRES_FIELD_DESC);
      oprot.writeI64(struct.expires);
      oprot.writeFieldEnd();
      if (struct.matrices != null) {
        oprot.writeFieldBegin(MATRICES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.matrices.size()));
          for (FriendChannelMatrix _iter253 : struct.matrices)
          {
            _iter253.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FriendChannelMatricesResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FriendChannelMatricesResponseTupleScheme getScheme() {
      return new FriendChannelMatricesResponseTupleScheme();
    }
  }

  private static class FriendChannelMatricesResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<FriendChannelMatricesResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FriendChannelMatricesResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetExpires()) {
        optionals.set(0);
      }
      if (struct.isSetMatrices()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetExpires()) {
        oprot.writeI64(struct.expires);
      }
      if (struct.isSetMatrices()) {
        {
          oprot.writeI32(struct.matrices.size());
          for (FriendChannelMatrix _iter254 : struct.matrices)
          {
            _iter254.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FriendChannelMatricesResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.expires = iprot.readI64();
        struct.setExpiresIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list255 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.matrices = new java.util.ArrayList<FriendChannelMatrix>(_list255.size);
          @org.apache.thrift.annotation.Nullable FriendChannelMatrix _elem256;
          for (int _i257 = 0; _i257 < _list255.size; ++_i257)
          {
            _elem256 = new FriendChannelMatrix();
            _elem256.read(iprot);
            struct.matrices.add(_elem256);
          }
        }
        struct.setMatricesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

