/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2020-04-18")
public class Ticket implements org.apache.thrift.TBase<Ticket, Ticket._Fields>, java.io.Serializable, Cloneable, Comparable<Ticket> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Ticket");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField EXPIRATION_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("expirationTime", org.apache.thrift.protocol.TType.I64, (short)10);
  private static final org.apache.thrift.protocol.TField MAX_USE_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("maxUseCount", org.apache.thrift.protocol.TType.I32, (short)21);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TicketStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TicketTupleSchemeFactory();

  public java.lang.String id; // required
  public long expirationTime; // required
  public int maxUseCount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    EXPIRATION_TIME((short)10, "expirationTime"),
    MAX_USE_COUNT((short)21, "maxUseCount");

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
        case 1: // ID
          return ID;
        case 10: // EXPIRATION_TIME
          return EXPIRATION_TIME;
        case 21: // MAX_USE_COUNT
          return MAX_USE_COUNT;
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
  private static final int __EXPIRATIONTIME_ISSET_ID = 0;
  private static final int __MAXUSECOUNT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXPIRATION_TIME, new org.apache.thrift.meta_data.FieldMetaData("expirationTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MAX_USE_COUNT, new org.apache.thrift.meta_data.FieldMetaData("maxUseCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Ticket.class, metaDataMap);
  }

  public Ticket() {
  }

  public Ticket(
    java.lang.String id,
    long expirationTime,
    int maxUseCount)
  {
    this();
    this.id = id;
    this.expirationTime = expirationTime;
    setExpirationTimeIsSet(true);
    this.maxUseCount = maxUseCount;
    setMaxUseCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Ticket(Ticket other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    this.expirationTime = other.expirationTime;
    this.maxUseCount = other.maxUseCount;
  }

  public Ticket deepCopy() {
    return new Ticket(this);
  }

  @Override
  public void clear() {
    this.id = null;
    setExpirationTimeIsSet(false);
    this.expirationTime = 0;
    setMaxUseCountIsSet(false);
    this.maxUseCount = 0;
  }

  public java.lang.String getId() {
    return this.id;
  }

  public Ticket setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public long getExpirationTime() {
    return this.expirationTime;
  }

  public Ticket setExpirationTime(long expirationTime) {
    this.expirationTime = expirationTime;
    setExpirationTimeIsSet(true);
    return this;
  }

  public void unsetExpirationTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EXPIRATIONTIME_ISSET_ID);
  }

  /** Returns true if field expirationTime is set (has been assigned a value) and false otherwise */
  public boolean isSetExpirationTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EXPIRATIONTIME_ISSET_ID);
  }

  public void setExpirationTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EXPIRATIONTIME_ISSET_ID, value);
  }

  public int getMaxUseCount() {
    return this.maxUseCount;
  }

  public Ticket setMaxUseCount(int maxUseCount) {
    this.maxUseCount = maxUseCount;
    setMaxUseCountIsSet(true);
    return this;
  }

  public void unsetMaxUseCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MAXUSECOUNT_ISSET_ID);
  }

  /** Returns true if field maxUseCount is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxUseCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MAXUSECOUNT_ISSET_ID);
  }

  public void setMaxUseCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MAXUSECOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.String)value);
      }
      break;

    case EXPIRATION_TIME:
      if (value == null) {
        unsetExpirationTime();
      } else {
        setExpirationTime((java.lang.Long)value);
      }
      break;

    case MAX_USE_COUNT:
      if (value == null) {
        unsetMaxUseCount();
      } else {
        setMaxUseCount((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case EXPIRATION_TIME:
      return getExpirationTime();

    case MAX_USE_COUNT:
      return getMaxUseCount();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case EXPIRATION_TIME:
      return isSetExpirationTime();
    case MAX_USE_COUNT:
      return isSetMaxUseCount();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Ticket)
      return this.equals((Ticket)that);
    return false;
  }

  public boolean equals(Ticket that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_expirationTime = true;
    boolean that_present_expirationTime = true;
    if (this_present_expirationTime || that_present_expirationTime) {
      if (!(this_present_expirationTime && that_present_expirationTime))
        return false;
      if (this.expirationTime != that.expirationTime)
        return false;
    }

    boolean this_present_maxUseCount = true;
    boolean that_present_maxUseCount = true;
    if (this_present_maxUseCount || that_present_maxUseCount) {
      if (!(this_present_maxUseCount && that_present_maxUseCount))
        return false;
      if (this.maxUseCount != that.maxUseCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(expirationTime);

    hashCode = hashCode * 8191 + maxUseCount;

    return hashCode;
  }

  @Override
  public int compareTo(Ticket other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetExpirationTime()).compareTo(other.isSetExpirationTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpirationTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expirationTime, other.expirationTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMaxUseCount()).compareTo(other.isSetMaxUseCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxUseCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxUseCount, other.maxUseCount);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Ticket(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("expirationTime:");
    sb.append(this.expirationTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("maxUseCount:");
    sb.append(this.maxUseCount);
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

  private static class TicketStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TicketStandardScheme getScheme() {
      return new TicketStandardScheme();
    }
  }

  private static class TicketStandardScheme extends org.apache.thrift.scheme.StandardScheme<Ticket> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Ticket struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // EXPIRATION_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.expirationTime = iprot.readI64();
              struct.setExpirationTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 21: // MAX_USE_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.maxUseCount = iprot.readI32();
              struct.setMaxUseCountIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Ticket struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(EXPIRATION_TIME_FIELD_DESC);
      oprot.writeI64(struct.expirationTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MAX_USE_COUNT_FIELD_DESC);
      oprot.writeI32(struct.maxUseCount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TicketTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TicketTupleScheme getScheme() {
      return new TicketTupleScheme();
    }
  }

  private static class TicketTupleScheme extends org.apache.thrift.scheme.TupleScheme<Ticket> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Ticket struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetExpirationTime()) {
        optionals.set(1);
      }
      if (struct.isSetMaxUseCount()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetExpirationTime()) {
        oprot.writeI64(struct.expirationTime);
      }
      if (struct.isSetMaxUseCount()) {
        oprot.writeI32(struct.maxUseCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Ticket struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.expirationTime = iprot.readI64();
        struct.setExpirationTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.maxUseCount = iprot.readI32();
        struct.setMaxUseCountIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

