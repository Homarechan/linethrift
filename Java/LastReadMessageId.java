/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2020-04-18")
public class LastReadMessageId implements org.apache.thrift.TBase<LastReadMessageId, LastReadMessageId._Fields>, java.io.Serializable, Cloneable, Comparable<LastReadMessageId> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LastReadMessageId");

  private static final org.apache.thrift.protocol.TField MID_FIELD_DESC = new org.apache.thrift.protocol.TField("mid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LAST_READ_MESSAGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("lastReadMessageId", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new LastReadMessageIdStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new LastReadMessageIdTupleSchemeFactory();

  public java.lang.String mid; // required
  public java.lang.String lastReadMessageId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MID((short)1, "mid"),
    LAST_READ_MESSAGE_ID((short)2, "lastReadMessageId");

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
        case 1: // MID
          return MID;
        case 2: // LAST_READ_MESSAGE_ID
          return LAST_READ_MESSAGE_ID;
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
    tmpMap.put(_Fields.MID, new org.apache.thrift.meta_data.FieldMetaData("mid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LAST_READ_MESSAGE_ID, new org.apache.thrift.meta_data.FieldMetaData("lastReadMessageId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LastReadMessageId.class, metaDataMap);
  }

  public LastReadMessageId() {
  }

  public LastReadMessageId(
    java.lang.String mid,
    java.lang.String lastReadMessageId)
  {
    this();
    this.mid = mid;
    this.lastReadMessageId = lastReadMessageId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LastReadMessageId(LastReadMessageId other) {
    if (other.isSetMid()) {
      this.mid = other.mid;
    }
    if (other.isSetLastReadMessageId()) {
      this.lastReadMessageId = other.lastReadMessageId;
    }
  }

  public LastReadMessageId deepCopy() {
    return new LastReadMessageId(this);
  }

  @Override
  public void clear() {
    this.mid = null;
    this.lastReadMessageId = null;
  }

  public java.lang.String getMid() {
    return this.mid;
  }

  public LastReadMessageId setMid(java.lang.String mid) {
    this.mid = mid;
    return this;
  }

  public void unsetMid() {
    this.mid = null;
  }

  /** Returns true if field mid is set (has been assigned a value) and false otherwise */
  public boolean isSetMid() {
    return this.mid != null;
  }

  public void setMidIsSet(boolean value) {
    if (!value) {
      this.mid = null;
    }
  }

  public java.lang.String getLastReadMessageId() {
    return this.lastReadMessageId;
  }

  public LastReadMessageId setLastReadMessageId(java.lang.String lastReadMessageId) {
    this.lastReadMessageId = lastReadMessageId;
    return this;
  }

  public void unsetLastReadMessageId() {
    this.lastReadMessageId = null;
  }

  /** Returns true if field lastReadMessageId is set (has been assigned a value) and false otherwise */
  public boolean isSetLastReadMessageId() {
    return this.lastReadMessageId != null;
  }

  public void setLastReadMessageIdIsSet(boolean value) {
    if (!value) {
      this.lastReadMessageId = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case MID:
      if (value == null) {
        unsetMid();
      } else {
        setMid((java.lang.String)value);
      }
      break;

    case LAST_READ_MESSAGE_ID:
      if (value == null) {
        unsetLastReadMessageId();
      } else {
        setLastReadMessageId((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MID:
      return getMid();

    case LAST_READ_MESSAGE_ID:
      return getLastReadMessageId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case MID:
      return isSetMid();
    case LAST_READ_MESSAGE_ID:
      return isSetLastReadMessageId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof LastReadMessageId)
      return this.equals((LastReadMessageId)that);
    return false;
  }

  public boolean equals(LastReadMessageId that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_mid = true && this.isSetMid();
    boolean that_present_mid = true && that.isSetMid();
    if (this_present_mid || that_present_mid) {
      if (!(this_present_mid && that_present_mid))
        return false;
      if (!this.mid.equals(that.mid))
        return false;
    }

    boolean this_present_lastReadMessageId = true && this.isSetLastReadMessageId();
    boolean that_present_lastReadMessageId = true && that.isSetLastReadMessageId();
    if (this_present_lastReadMessageId || that_present_lastReadMessageId) {
      if (!(this_present_lastReadMessageId && that_present_lastReadMessageId))
        return false;
      if (!this.lastReadMessageId.equals(that.lastReadMessageId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMid()) ? 131071 : 524287);
    if (isSetMid())
      hashCode = hashCode * 8191 + mid.hashCode();

    hashCode = hashCode * 8191 + ((isSetLastReadMessageId()) ? 131071 : 524287);
    if (isSetLastReadMessageId())
      hashCode = hashCode * 8191 + lastReadMessageId.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(LastReadMessageId other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetMid()).compareTo(other.isSetMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mid, other.mid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLastReadMessageId()).compareTo(other.isSetLastReadMessageId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastReadMessageId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastReadMessageId, other.lastReadMessageId);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("LastReadMessageId(");
    boolean first = true;

    sb.append("mid:");
    if (this.mid == null) {
      sb.append("null");
    } else {
      sb.append(this.mid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastReadMessageId:");
    if (this.lastReadMessageId == null) {
      sb.append("null");
    } else {
      sb.append(this.lastReadMessageId);
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

  private static class LastReadMessageIdStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LastReadMessageIdStandardScheme getScheme() {
      return new LastReadMessageIdStandardScheme();
    }
  }

  private static class LastReadMessageIdStandardScheme extends org.apache.thrift.scheme.StandardScheme<LastReadMessageId> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LastReadMessageId struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mid = iprot.readString();
              struct.setMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LAST_READ_MESSAGE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.lastReadMessageId = iprot.readString();
              struct.setLastReadMessageIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, LastReadMessageId struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mid != null) {
        oprot.writeFieldBegin(MID_FIELD_DESC);
        oprot.writeString(struct.mid);
        oprot.writeFieldEnd();
      }
      if (struct.lastReadMessageId != null) {
        oprot.writeFieldBegin(LAST_READ_MESSAGE_ID_FIELD_DESC);
        oprot.writeString(struct.lastReadMessageId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LastReadMessageIdTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LastReadMessageIdTupleScheme getScheme() {
      return new LastReadMessageIdTupleScheme();
    }
  }

  private static class LastReadMessageIdTupleScheme extends org.apache.thrift.scheme.TupleScheme<LastReadMessageId> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LastReadMessageId struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMid()) {
        optionals.set(0);
      }
      if (struct.isSetLastReadMessageId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMid()) {
        oprot.writeString(struct.mid);
      }
      if (struct.isSetLastReadMessageId()) {
        oprot.writeString(struct.lastReadMessageId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LastReadMessageId struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.mid = iprot.readString();
        struct.setMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.lastReadMessageId = iprot.readString();
        struct.setLastReadMessageIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

