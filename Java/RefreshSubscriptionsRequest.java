/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class RefreshSubscriptionsRequest implements org.apache.thrift.TBase<RefreshSubscriptionsRequest, RefreshSubscriptionsRequest._Fields>, java.io.Serializable, Cloneable, Comparable<RefreshSubscriptionsRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RefreshSubscriptionsRequest");

  private static final org.apache.thrift.protocol.TField SUBSCRIPTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("subscriptions", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RefreshSubscriptionsRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RefreshSubscriptionsRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Long> subscriptions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUBSCRIPTIONS((short)2, "subscriptions");

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
        case 2: // SUBSCRIPTIONS
          return SUBSCRIPTIONS;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUBSCRIPTIONS, new org.apache.thrift.meta_data.FieldMetaData("subscriptions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RefreshSubscriptionsRequest.class, metaDataMap);
  }

  public RefreshSubscriptionsRequest() {
  }

  public RefreshSubscriptionsRequest(
    java.util.List<java.lang.Long> subscriptions)
  {
    this();
    this.subscriptions = subscriptions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RefreshSubscriptionsRequest(RefreshSubscriptionsRequest other) {
    if (other.isSetSubscriptions()) {
      java.util.List<java.lang.Long> __this__subscriptions = new java.util.ArrayList<java.lang.Long>(other.subscriptions);
      this.subscriptions = __this__subscriptions;
    }
  }

  public RefreshSubscriptionsRequest deepCopy() {
    return new RefreshSubscriptionsRequest(this);
  }

  @Override
  public void clear() {
    this.subscriptions = null;
  }

  public int getSubscriptionsSize() {
    return (this.subscriptions == null) ? 0 : this.subscriptions.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Long> getSubscriptionsIterator() {
    return (this.subscriptions == null) ? null : this.subscriptions.iterator();
  }

  public void addToSubscriptions(long elem) {
    if (this.subscriptions == null) {
      this.subscriptions = new java.util.ArrayList<java.lang.Long>();
    }
    this.subscriptions.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Long> getSubscriptions() {
    return this.subscriptions;
  }

  public RefreshSubscriptionsRequest setSubscriptions(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Long> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public void unsetSubscriptions() {
    this.subscriptions = null;
  }

  /** Returns true if field subscriptions is set (has been assigned a value) and false otherwise */
  public boolean isSetSubscriptions() {
    return this.subscriptions != null;
  }

  public void setSubscriptionsIsSet(boolean value) {
    if (!value) {
      this.subscriptions = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SUBSCRIPTIONS:
      if (value == null) {
        unsetSubscriptions();
      } else {
        setSubscriptions((java.util.List<java.lang.Long>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SUBSCRIPTIONS:
      return getSubscriptions();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SUBSCRIPTIONS:
      return isSetSubscriptions();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof RefreshSubscriptionsRequest)
      return this.equals((RefreshSubscriptionsRequest)that);
    return false;
  }

  public boolean equals(RefreshSubscriptionsRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_subscriptions = true && this.isSetSubscriptions();
    boolean that_present_subscriptions = true && that.isSetSubscriptions();
    if (this_present_subscriptions || that_present_subscriptions) {
      if (!(this_present_subscriptions && that_present_subscriptions))
        return false;
      if (!this.subscriptions.equals(that.subscriptions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSubscriptions()) ? 131071 : 524287);
    if (isSetSubscriptions())
      hashCode = hashCode * 8191 + subscriptions.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(RefreshSubscriptionsRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetSubscriptions(), other.isSetSubscriptions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubscriptions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subscriptions, other.subscriptions);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RefreshSubscriptionsRequest(");
    boolean first = true;

    sb.append("subscriptions:");
    if (this.subscriptions == null) {
      sb.append("null");
    } else {
      sb.append(this.subscriptions);
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

  private static class RefreshSubscriptionsRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RefreshSubscriptionsRequestStandardScheme getScheme() {
      return new RefreshSubscriptionsRequestStandardScheme();
    }
  }

  private static class RefreshSubscriptionsRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<RefreshSubscriptionsRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RefreshSubscriptionsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 2: // SUBSCRIPTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list924 = iprot.readListBegin();
                struct.subscriptions = new java.util.ArrayList<java.lang.Long>(_list924.size);
                long _elem925;
                for (int _i926 = 0; _i926 < _list924.size; ++_i926)
                {
                  _elem925 = iprot.readI64();
                  struct.subscriptions.add(_elem925);
                }
                iprot.readListEnd();
              }
              struct.setSubscriptionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RefreshSubscriptionsRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.subscriptions != null) {
        oprot.writeFieldBegin(SUBSCRIPTIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.subscriptions.size()));
          for (long _iter927 : struct.subscriptions)
          {
            oprot.writeI64(_iter927);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RefreshSubscriptionsRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RefreshSubscriptionsRequestTupleScheme getScheme() {
      return new RefreshSubscriptionsRequestTupleScheme();
    }
  }

  private static class RefreshSubscriptionsRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<RefreshSubscriptionsRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RefreshSubscriptionsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSubscriptions()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetSubscriptions()) {
        {
          oprot.writeI32(struct.subscriptions.size());
          for (long _iter928 : struct.subscriptions)
          {
            oprot.writeI64(_iter928);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RefreshSubscriptionsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list929 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.subscriptions = new java.util.ArrayList<java.lang.Long>(_list929.size);
          long _elem930;
          for (int _i931 = 0; _i931 < _list929.size; ++_i931)
          {
            _elem930 = iprot.readI64();
            struct.subscriptions.add(_elem930);
          }
        }
        struct.setSubscriptionsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

