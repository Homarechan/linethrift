/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class ChannelDomains implements org.apache.thrift.TBase<ChannelDomains, ChannelDomains._Fields>, java.io.Serializable, Cloneable, Comparable<ChannelDomains> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ChannelDomains");

  private static final org.apache.thrift.protocol.TField CHANNEL_DOMAINS_FIELD_DESC = new org.apache.thrift.protocol.TField("channelDomains", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField REVISION_FIELD_DESC = new org.apache.thrift.protocol.TField("revision", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ChannelDomainsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ChannelDomainsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<ChannelDomain> channelDomains; // required
  public long revision; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CHANNEL_DOMAINS((short)1, "channelDomains"),
    REVISION((short)2, "revision");

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
        case 1: // CHANNEL_DOMAINS
          return CHANNEL_DOMAINS;
        case 2: // REVISION
          return REVISION;
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
  private static final int __REVISION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHANNEL_DOMAINS, new org.apache.thrift.meta_data.FieldMetaData("channelDomains", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ChannelDomain.class))));
    tmpMap.put(_Fields.REVISION, new org.apache.thrift.meta_data.FieldMetaData("revision", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ChannelDomains.class, metaDataMap);
  }

  public ChannelDomains() {
  }

  public ChannelDomains(
    java.util.List<ChannelDomain> channelDomains,
    long revision)
  {
    this();
    this.channelDomains = channelDomains;
    this.revision = revision;
    setRevisionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ChannelDomains(ChannelDomains other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetChannelDomains()) {
      java.util.List<ChannelDomain> __this__channelDomains = new java.util.ArrayList<ChannelDomain>(other.channelDomains.size());
      for (ChannelDomain other_element : other.channelDomains) {
        __this__channelDomains.add(new ChannelDomain(other_element));
      }
      this.channelDomains = __this__channelDomains;
    }
    this.revision = other.revision;
  }

  public ChannelDomains deepCopy() {
    return new ChannelDomains(this);
  }

  @Override
  public void clear() {
    this.channelDomains = null;
    setRevisionIsSet(false);
    this.revision = 0;
  }

  public int getChannelDomainsSize() {
    return (this.channelDomains == null) ? 0 : this.channelDomains.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<ChannelDomain> getChannelDomainsIterator() {
    return (this.channelDomains == null) ? null : this.channelDomains.iterator();
  }

  public void addToChannelDomains(ChannelDomain elem) {
    if (this.channelDomains == null) {
      this.channelDomains = new java.util.ArrayList<ChannelDomain>();
    }
    this.channelDomains.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<ChannelDomain> getChannelDomains() {
    return this.channelDomains;
  }

  public ChannelDomains setChannelDomains(@org.apache.thrift.annotation.Nullable java.util.List<ChannelDomain> channelDomains) {
    this.channelDomains = channelDomains;
    return this;
  }

  public void unsetChannelDomains() {
    this.channelDomains = null;
  }

  /** Returns true if field channelDomains is set (has been assigned a value) and false otherwise */
  public boolean isSetChannelDomains() {
    return this.channelDomains != null;
  }

  public void setChannelDomainsIsSet(boolean value) {
    if (!value) {
      this.channelDomains = null;
    }
  }

  public long getRevision() {
    return this.revision;
  }

  public ChannelDomains setRevision(long revision) {
    this.revision = revision;
    setRevisionIsSet(true);
    return this;
  }

  public void unsetRevision() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __REVISION_ISSET_ID);
  }

  /** Returns true if field revision is set (has been assigned a value) and false otherwise */
  public boolean isSetRevision() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __REVISION_ISSET_ID);
  }

  public void setRevisionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __REVISION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CHANNEL_DOMAINS:
      if (value == null) {
        unsetChannelDomains();
      } else {
        setChannelDomains((java.util.List<ChannelDomain>)value);
      }
      break;

    case REVISION:
      if (value == null) {
        unsetRevision();
      } else {
        setRevision((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CHANNEL_DOMAINS:
      return getChannelDomains();

    case REVISION:
      return getRevision();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CHANNEL_DOMAINS:
      return isSetChannelDomains();
    case REVISION:
      return isSetRevision();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ChannelDomains)
      return this.equals((ChannelDomains)that);
    return false;
  }

  public boolean equals(ChannelDomains that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_channelDomains = true && this.isSetChannelDomains();
    boolean that_present_channelDomains = true && that.isSetChannelDomains();
    if (this_present_channelDomains || that_present_channelDomains) {
      if (!(this_present_channelDomains && that_present_channelDomains))
        return false;
      if (!this.channelDomains.equals(that.channelDomains))
        return false;
    }

    boolean this_present_revision = true;
    boolean that_present_revision = true;
    if (this_present_revision || that_present_revision) {
      if (!(this_present_revision && that_present_revision))
        return false;
      if (this.revision != that.revision)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetChannelDomains()) ? 131071 : 524287);
    if (isSetChannelDomains())
      hashCode = hashCode * 8191 + channelDomains.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(revision);

    return hashCode;
  }

  @Override
  public int compareTo(ChannelDomains other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetChannelDomains(), other.isSetChannelDomains());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChannelDomains()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.channelDomains, other.channelDomains);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRevision(), other.isSetRevision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRevision()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.revision, other.revision);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ChannelDomains(");
    boolean first = true;

    sb.append("channelDomains:");
    if (this.channelDomains == null) {
      sb.append("null");
    } else {
      sb.append(this.channelDomains);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("revision:");
    sb.append(this.revision);
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

  private static class ChannelDomainsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ChannelDomainsStandardScheme getScheme() {
      return new ChannelDomainsStandardScheme();
    }
  }

  private static class ChannelDomainsStandardScheme extends org.apache.thrift.scheme.StandardScheme<ChannelDomains> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ChannelDomains struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHANNEL_DOMAINS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list158 = iprot.readListBegin();
                struct.channelDomains = new java.util.ArrayList<ChannelDomain>(_list158.size);
                @org.apache.thrift.annotation.Nullable ChannelDomain _elem159;
                for (int _i160 = 0; _i160 < _list158.size; ++_i160)
                {
                  _elem159 = new ChannelDomain();
                  _elem159.read(iprot);
                  struct.channelDomains.add(_elem159);
                }
                iprot.readListEnd();
              }
              struct.setChannelDomainsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REVISION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.revision = iprot.readI64();
              struct.setRevisionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ChannelDomains struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.channelDomains != null) {
        oprot.writeFieldBegin(CHANNEL_DOMAINS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.channelDomains.size()));
          for (ChannelDomain _iter161 : struct.channelDomains)
          {
            _iter161.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REVISION_FIELD_DESC);
      oprot.writeI64(struct.revision);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ChannelDomainsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ChannelDomainsTupleScheme getScheme() {
      return new ChannelDomainsTupleScheme();
    }
  }

  private static class ChannelDomainsTupleScheme extends org.apache.thrift.scheme.TupleScheme<ChannelDomains> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ChannelDomains struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetChannelDomains()) {
        optionals.set(0);
      }
      if (struct.isSetRevision()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetChannelDomains()) {
        {
          oprot.writeI32(struct.channelDomains.size());
          for (ChannelDomain _iter162 : struct.channelDomains)
          {
            _iter162.write(oprot);
          }
        }
      }
      if (struct.isSetRevision()) {
        oprot.writeI64(struct.revision);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ChannelDomains struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list163 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.channelDomains = new java.util.ArrayList<ChannelDomain>(_list163.size);
          @org.apache.thrift.annotation.Nullable ChannelDomain _elem164;
          for (int _i165 = 0; _i165 < _list163.size; ++_i165)
          {
            _elem164 = new ChannelDomain();
            _elem164.read(iprot);
            struct.channelDomains.add(_elem164);
          }
        }
        struct.setChannelDomainsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.revision = iprot.readI64();
        struct.setRevisionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

