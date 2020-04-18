/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2020-04-18")
public class TMessageReadRangeEntry implements org.apache.thrift.TBase<TMessageReadRangeEntry, TMessageReadRangeEntry._Fields>, java.io.Serializable, Cloneable, Comparable<TMessageReadRangeEntry> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMessageReadRangeEntry");

  private static final org.apache.thrift.protocol.TField START_MESSAGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("startMessageId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField END_MESSAGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("endMessageId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField START_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("startTime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField END_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("endTime", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMessageReadRangeEntryStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMessageReadRangeEntryTupleSchemeFactory();

  public long startMessageId; // required
  public long endMessageId; // required
  public long startTime; // required
  public long endTime; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    START_MESSAGE_ID((short)1, "startMessageId"),
    END_MESSAGE_ID((short)2, "endMessageId"),
    START_TIME((short)3, "startTime"),
    END_TIME((short)4, "endTime");

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
        case 1: // START_MESSAGE_ID
          return START_MESSAGE_ID;
        case 2: // END_MESSAGE_ID
          return END_MESSAGE_ID;
        case 3: // START_TIME
          return START_TIME;
        case 4: // END_TIME
          return END_TIME;
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
  private static final int __STARTMESSAGEID_ISSET_ID = 0;
  private static final int __ENDMESSAGEID_ISSET_ID = 1;
  private static final int __STARTTIME_ISSET_ID = 2;
  private static final int __ENDTIME_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START_MESSAGE_ID, new org.apache.thrift.meta_data.FieldMetaData("startMessageId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.END_MESSAGE_ID, new org.apache.thrift.meta_data.FieldMetaData("endMessageId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.START_TIME, new org.apache.thrift.meta_data.FieldMetaData("startTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.END_TIME, new org.apache.thrift.meta_data.FieldMetaData("endTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMessageReadRangeEntry.class, metaDataMap);
  }

  public TMessageReadRangeEntry() {
  }

  public TMessageReadRangeEntry(
    long startMessageId,
    long endMessageId,
    long startTime,
    long endTime)
  {
    this();
    this.startMessageId = startMessageId;
    setStartMessageIdIsSet(true);
    this.endMessageId = endMessageId;
    setEndMessageIdIsSet(true);
    this.startTime = startTime;
    setStartTimeIsSet(true);
    this.endTime = endTime;
    setEndTimeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMessageReadRangeEntry(TMessageReadRangeEntry other) {
    __isset_bitfield = other.__isset_bitfield;
    this.startMessageId = other.startMessageId;
    this.endMessageId = other.endMessageId;
    this.startTime = other.startTime;
    this.endTime = other.endTime;
  }

  public TMessageReadRangeEntry deepCopy() {
    return new TMessageReadRangeEntry(this);
  }

  @Override
  public void clear() {
    setStartMessageIdIsSet(false);
    this.startMessageId = 0;
    setEndMessageIdIsSet(false);
    this.endMessageId = 0;
    setStartTimeIsSet(false);
    this.startTime = 0;
    setEndTimeIsSet(false);
    this.endTime = 0;
  }

  public long getStartMessageId() {
    return this.startMessageId;
  }

  public TMessageReadRangeEntry setStartMessageId(long startMessageId) {
    this.startMessageId = startMessageId;
    setStartMessageIdIsSet(true);
    return this;
  }

  public void unsetStartMessageId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STARTMESSAGEID_ISSET_ID);
  }

  /** Returns true if field startMessageId is set (has been assigned a value) and false otherwise */
  public boolean isSetStartMessageId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STARTMESSAGEID_ISSET_ID);
  }

  public void setStartMessageIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STARTMESSAGEID_ISSET_ID, value);
  }

  public long getEndMessageId() {
    return this.endMessageId;
  }

  public TMessageReadRangeEntry setEndMessageId(long endMessageId) {
    this.endMessageId = endMessageId;
    setEndMessageIdIsSet(true);
    return this;
  }

  public void unsetEndMessageId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ENDMESSAGEID_ISSET_ID);
  }

  /** Returns true if field endMessageId is set (has been assigned a value) and false otherwise */
  public boolean isSetEndMessageId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ENDMESSAGEID_ISSET_ID);
  }

  public void setEndMessageIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ENDMESSAGEID_ISSET_ID, value);
  }

  public long getStartTime() {
    return this.startTime;
  }

  public TMessageReadRangeEntry setStartTime(long startTime) {
    this.startTime = startTime;
    setStartTimeIsSet(true);
    return this;
  }

  public void unsetStartTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  /** Returns true if field startTime is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  public void setStartTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STARTTIME_ISSET_ID, value);
  }

  public long getEndTime() {
    return this.endTime;
  }

  public TMessageReadRangeEntry setEndTime(long endTime) {
    this.endTime = endTime;
    setEndTimeIsSet(true);
    return this;
  }

  public void unsetEndTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ENDTIME_ISSET_ID);
  }

  /** Returns true if field endTime is set (has been assigned a value) and false otherwise */
  public boolean isSetEndTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ENDTIME_ISSET_ID);
  }

  public void setEndTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ENDTIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case START_MESSAGE_ID:
      if (value == null) {
        unsetStartMessageId();
      } else {
        setStartMessageId((java.lang.Long)value);
      }
      break;

    case END_MESSAGE_ID:
      if (value == null) {
        unsetEndMessageId();
      } else {
        setEndMessageId((java.lang.Long)value);
      }
      break;

    case START_TIME:
      if (value == null) {
        unsetStartTime();
      } else {
        setStartTime((java.lang.Long)value);
      }
      break;

    case END_TIME:
      if (value == null) {
        unsetEndTime();
      } else {
        setEndTime((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case START_MESSAGE_ID:
      return getStartMessageId();

    case END_MESSAGE_ID:
      return getEndMessageId();

    case START_TIME:
      return getStartTime();

    case END_TIME:
      return getEndTime();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case START_MESSAGE_ID:
      return isSetStartMessageId();
    case END_MESSAGE_ID:
      return isSetEndMessageId();
    case START_TIME:
      return isSetStartTime();
    case END_TIME:
      return isSetEndTime();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TMessageReadRangeEntry)
      return this.equals((TMessageReadRangeEntry)that);
    return false;
  }

  public boolean equals(TMessageReadRangeEntry that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_startMessageId = true;
    boolean that_present_startMessageId = true;
    if (this_present_startMessageId || that_present_startMessageId) {
      if (!(this_present_startMessageId && that_present_startMessageId))
        return false;
      if (this.startMessageId != that.startMessageId)
        return false;
    }

    boolean this_present_endMessageId = true;
    boolean that_present_endMessageId = true;
    if (this_present_endMessageId || that_present_endMessageId) {
      if (!(this_present_endMessageId && that_present_endMessageId))
        return false;
      if (this.endMessageId != that.endMessageId)
        return false;
    }

    boolean this_present_startTime = true;
    boolean that_present_startTime = true;
    if (this_present_startTime || that_present_startTime) {
      if (!(this_present_startTime && that_present_startTime))
        return false;
      if (this.startTime != that.startTime)
        return false;
    }

    boolean this_present_endTime = true;
    boolean that_present_endTime = true;
    if (this_present_endTime || that_present_endTime) {
      if (!(this_present_endTime && that_present_endTime))
        return false;
      if (this.endTime != that.endTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(startMessageId);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(endMessageId);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(startTime);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(endTime);

    return hashCode;
  }

  @Override
  public int compareTo(TMessageReadRangeEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStartMessageId()).compareTo(other.isSetStartMessageId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartMessageId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startMessageId, other.startMessageId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEndMessageId()).compareTo(other.isSetEndMessageId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndMessageId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endMessageId, other.endMessageId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStartTime()).compareTo(other.isSetStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startTime, other.startTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEndTime()).compareTo(other.isSetEndTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endTime, other.endTime);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMessageReadRangeEntry(");
    boolean first = true;

    sb.append("startMessageId:");
    sb.append(this.startMessageId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("endMessageId:");
    sb.append(this.endMessageId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("startTime:");
    sb.append(this.startTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("endTime:");
    sb.append(this.endTime);
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

  private static class TMessageReadRangeEntryStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMessageReadRangeEntryStandardScheme getScheme() {
      return new TMessageReadRangeEntryStandardScheme();
    }
  }

  private static class TMessageReadRangeEntryStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMessageReadRangeEntry> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TMessageReadRangeEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START_MESSAGE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.startMessageId = iprot.readI64();
              struct.setStartMessageIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // END_MESSAGE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.endMessageId = iprot.readI64();
              struct.setEndMessageIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // START_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.startTime = iprot.readI64();
              struct.setStartTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // END_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.endTime = iprot.readI64();
              struct.setEndTimeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TMessageReadRangeEntry struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(START_MESSAGE_ID_FIELD_DESC);
      oprot.writeI64(struct.startMessageId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(END_MESSAGE_ID_FIELD_DESC);
      oprot.writeI64(struct.endMessageId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(START_TIME_FIELD_DESC);
      oprot.writeI64(struct.startTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(END_TIME_FIELD_DESC);
      oprot.writeI64(struct.endTime);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMessageReadRangeEntryTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMessageReadRangeEntryTupleScheme getScheme() {
      return new TMessageReadRangeEntryTupleScheme();
    }
  }

  private static class TMessageReadRangeEntryTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMessageReadRangeEntry> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMessageReadRangeEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStartMessageId()) {
        optionals.set(0);
      }
      if (struct.isSetEndMessageId()) {
        optionals.set(1);
      }
      if (struct.isSetStartTime()) {
        optionals.set(2);
      }
      if (struct.isSetEndTime()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetStartMessageId()) {
        oprot.writeI64(struct.startMessageId);
      }
      if (struct.isSetEndMessageId()) {
        oprot.writeI64(struct.endMessageId);
      }
      if (struct.isSetStartTime()) {
        oprot.writeI64(struct.startTime);
      }
      if (struct.isSetEndTime()) {
        oprot.writeI64(struct.endTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMessageReadRangeEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.startMessageId = iprot.readI64();
        struct.setStartMessageIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.endMessageId = iprot.readI64();
        struct.setEndMessageIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.startTime = iprot.readI64();
        struct.setStartTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.endTime = iprot.readI64();
        struct.setEndTimeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

