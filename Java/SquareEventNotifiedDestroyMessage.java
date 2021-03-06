/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class SquareEventNotifiedDestroyMessage implements org.apache.thrift.TBase<SquareEventNotifiedDestroyMessage, SquareEventNotifiedDestroyMessage._Fields>, java.io.Serializable, Cloneable, Comparable<SquareEventNotifiedDestroyMessage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareEventNotifiedDestroyMessage");

  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatMid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MESSAGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("messageId", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SquareEventNotifiedDestroyMessageStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SquareEventNotifiedDestroyMessageTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String squareChatMid; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String messageId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_CHAT_MID((short)1, "squareChatMid"),
    MESSAGE_ID((short)3, "messageId");

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
        case 1: // SQUARE_CHAT_MID
          return SQUARE_CHAT_MID;
        case 3: // MESSAGE_ID
          return MESSAGE_ID;
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
    tmpMap.put(_Fields.SQUARE_CHAT_MID, new org.apache.thrift.meta_data.FieldMetaData("squareChatMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE_ID, new org.apache.thrift.meta_data.FieldMetaData("messageId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareEventNotifiedDestroyMessage.class, metaDataMap);
  }

  public SquareEventNotifiedDestroyMessage() {
  }

  public SquareEventNotifiedDestroyMessage(
    java.lang.String squareChatMid,
    java.lang.String messageId)
  {
    this();
    this.squareChatMid = squareChatMid;
    this.messageId = messageId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareEventNotifiedDestroyMessage(SquareEventNotifiedDestroyMessage other) {
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
    if (other.isSetMessageId()) {
      this.messageId = other.messageId;
    }
  }

  public SquareEventNotifiedDestroyMessage deepCopy() {
    return new SquareEventNotifiedDestroyMessage(this);
  }

  @Override
  public void clear() {
    this.squareChatMid = null;
    this.messageId = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSquareChatMid() {
    return this.squareChatMid;
  }

  public SquareEventNotifiedDestroyMessage setSquareChatMid(@org.apache.thrift.annotation.Nullable java.lang.String squareChatMid) {
    this.squareChatMid = squareChatMid;
    return this;
  }

  public void unsetSquareChatMid() {
    this.squareChatMid = null;
  }

  /** Returns true if field squareChatMid is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChatMid() {
    return this.squareChatMid != null;
  }

  public void setSquareChatMidIsSet(boolean value) {
    if (!value) {
      this.squareChatMid = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getMessageId() {
    return this.messageId;
  }

  public SquareEventNotifiedDestroyMessage setMessageId(@org.apache.thrift.annotation.Nullable java.lang.String messageId) {
    this.messageId = messageId;
    return this;
  }

  public void unsetMessageId() {
    this.messageId = null;
  }

  /** Returns true if field messageId is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageId() {
    return this.messageId != null;
  }

  public void setMessageIdIsSet(boolean value) {
    if (!value) {
      this.messageId = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SQUARE_CHAT_MID:
      if (value == null) {
        unsetSquareChatMid();
      } else {
        setSquareChatMid((java.lang.String)value);
      }
      break;

    case MESSAGE_ID:
      if (value == null) {
        unsetMessageId();
      } else {
        setMessageId((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_CHAT_MID:
      return getSquareChatMid();

    case MESSAGE_ID:
      return getMessageId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SQUARE_CHAT_MID:
      return isSetSquareChatMid();
    case MESSAGE_ID:
      return isSetMessageId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof SquareEventNotifiedDestroyMessage)
      return this.equals((SquareEventNotifiedDestroyMessage)that);
    return false;
  }

  public boolean equals(SquareEventNotifiedDestroyMessage that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareChatMid = true && this.isSetSquareChatMid();
    boolean that_present_squareChatMid = true && that.isSetSquareChatMid();
    if (this_present_squareChatMid || that_present_squareChatMid) {
      if (!(this_present_squareChatMid && that_present_squareChatMid))
        return false;
      if (!this.squareChatMid.equals(that.squareChatMid))
        return false;
    }

    boolean this_present_messageId = true && this.isSetMessageId();
    boolean that_present_messageId = true && that.isSetMessageId();
    if (this_present_messageId || that_present_messageId) {
      if (!(this_present_messageId && that_present_messageId))
        return false;
      if (!this.messageId.equals(that.messageId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSquareChatMid()) ? 131071 : 524287);
    if (isSetSquareChatMid())
      hashCode = hashCode * 8191 + squareChatMid.hashCode();

    hashCode = hashCode * 8191 + ((isSetMessageId()) ? 131071 : 524287);
    if (isSetMessageId())
      hashCode = hashCode * 8191 + messageId.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SquareEventNotifiedDestroyMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetSquareChatMid(), other.isSetSquareChatMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareChatMid, other.squareChatMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMessageId(), other.isSetMessageId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messageId, other.messageId);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SquareEventNotifiedDestroyMessage(");
    boolean first = true;

    sb.append("squareChatMid:");
    if (this.squareChatMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageId:");
    if (this.messageId == null) {
      sb.append("null");
    } else {
      sb.append(this.messageId);
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

  private static class SquareEventNotifiedDestroyMessageStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareEventNotifiedDestroyMessageStandardScheme getScheme() {
      return new SquareEventNotifiedDestroyMessageStandardScheme();
    }
  }

  private static class SquareEventNotifiedDestroyMessageStandardScheme extends org.apache.thrift.scheme.StandardScheme<SquareEventNotifiedDestroyMessage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareEventNotifiedDestroyMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SQUARE_CHAT_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.squareChatMid = iprot.readString();
              struct.setSquareChatMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MESSAGE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.messageId = iprot.readString();
              struct.setMessageIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareEventNotifiedDestroyMessage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareChatMid != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
        oprot.writeString(struct.squareChatMid);
        oprot.writeFieldEnd();
      }
      if (struct.messageId != null) {
        oprot.writeFieldBegin(MESSAGE_ID_FIELD_DESC);
        oprot.writeString(struct.messageId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareEventNotifiedDestroyMessageTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareEventNotifiedDestroyMessageTupleScheme getScheme() {
      return new SquareEventNotifiedDestroyMessageTupleScheme();
    }
  }

  private static class SquareEventNotifiedDestroyMessageTupleScheme extends org.apache.thrift.scheme.TupleScheme<SquareEventNotifiedDestroyMessage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareEventNotifiedDestroyMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSquareChatMid()) {
        optionals.set(0);
      }
      if (struct.isSetMessageId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSquareChatMid()) {
        oprot.writeString(struct.squareChatMid);
      }
      if (struct.isSetMessageId()) {
        oprot.writeString(struct.messageId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareEventNotifiedDestroyMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.squareChatMid = iprot.readString();
        struct.setSquareChatMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.messageId = iprot.readString();
        struct.setMessageIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

