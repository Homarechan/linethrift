/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class MessageStoreResult implements org.apache.thrift.TBase<MessageStoreResult, MessageStoreResult._Fields>, java.io.Serializable, Cloneable, Comparable<MessageStoreResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MessageStoreResult");

  private static final org.apache.thrift.protocol.TField REQUEST_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("requestId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MESSAGE_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("messageIds", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MessageStoreResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MessageStoreResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String requestId; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> messageIds; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REQUEST_ID((short)1, "requestId"),
    MESSAGE_IDS((short)2, "messageIds");

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
        case 1: // REQUEST_ID
          return REQUEST_ID;
        case 2: // MESSAGE_IDS
          return MESSAGE_IDS;
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
    tmpMap.put(_Fields.REQUEST_ID, new org.apache.thrift.meta_data.FieldMetaData("requestId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE_IDS, new org.apache.thrift.meta_data.FieldMetaData("messageIds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MessageStoreResult.class, metaDataMap);
  }

  public MessageStoreResult() {
  }

  public MessageStoreResult(
    java.lang.String requestId,
    java.util.List<java.lang.String> messageIds)
  {
    this();
    this.requestId = requestId;
    this.messageIds = messageIds;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MessageStoreResult(MessageStoreResult other) {
    if (other.isSetRequestId()) {
      this.requestId = other.requestId;
    }
    if (other.isSetMessageIds()) {
      java.util.List<java.lang.String> __this__messageIds = new java.util.ArrayList<java.lang.String>(other.messageIds);
      this.messageIds = __this__messageIds;
    }
  }

  public MessageStoreResult deepCopy() {
    return new MessageStoreResult(this);
  }

  @Override
  public void clear() {
    this.requestId = null;
    this.messageIds = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getRequestId() {
    return this.requestId;
  }

  public MessageStoreResult setRequestId(@org.apache.thrift.annotation.Nullable java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  public void unsetRequestId() {
    this.requestId = null;
  }

  /** Returns true if field requestId is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestId() {
    return this.requestId != null;
  }

  public void setRequestIdIsSet(boolean value) {
    if (!value) {
      this.requestId = null;
    }
  }

  public int getMessageIdsSize() {
    return (this.messageIds == null) ? 0 : this.messageIds.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getMessageIdsIterator() {
    return (this.messageIds == null) ? null : this.messageIds.iterator();
  }

  public void addToMessageIds(java.lang.String elem) {
    if (this.messageIds == null) {
      this.messageIds = new java.util.ArrayList<java.lang.String>();
    }
    this.messageIds.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getMessageIds() {
    return this.messageIds;
  }

  public MessageStoreResult setMessageIds(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> messageIds) {
    this.messageIds = messageIds;
    return this;
  }

  public void unsetMessageIds() {
    this.messageIds = null;
  }

  /** Returns true if field messageIds is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageIds() {
    return this.messageIds != null;
  }

  public void setMessageIdsIsSet(boolean value) {
    if (!value) {
      this.messageIds = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case REQUEST_ID:
      if (value == null) {
        unsetRequestId();
      } else {
        setRequestId((java.lang.String)value);
      }
      break;

    case MESSAGE_IDS:
      if (value == null) {
        unsetMessageIds();
      } else {
        setMessageIds((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case REQUEST_ID:
      return getRequestId();

    case MESSAGE_IDS:
      return getMessageIds();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case REQUEST_ID:
      return isSetRequestId();
    case MESSAGE_IDS:
      return isSetMessageIds();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof MessageStoreResult)
      return this.equals((MessageStoreResult)that);
    return false;
  }

  public boolean equals(MessageStoreResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_requestId = true && this.isSetRequestId();
    boolean that_present_requestId = true && that.isSetRequestId();
    if (this_present_requestId || that_present_requestId) {
      if (!(this_present_requestId && that_present_requestId))
        return false;
      if (!this.requestId.equals(that.requestId))
        return false;
    }

    boolean this_present_messageIds = true && this.isSetMessageIds();
    boolean that_present_messageIds = true && that.isSetMessageIds();
    if (this_present_messageIds || that_present_messageIds) {
      if (!(this_present_messageIds && that_present_messageIds))
        return false;
      if (!this.messageIds.equals(that.messageIds))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetRequestId()) ? 131071 : 524287);
    if (isSetRequestId())
      hashCode = hashCode * 8191 + requestId.hashCode();

    hashCode = hashCode * 8191 + ((isSetMessageIds()) ? 131071 : 524287);
    if (isSetMessageIds())
      hashCode = hashCode * 8191 + messageIds.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(MessageStoreResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetRequestId(), other.isSetRequestId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestId, other.requestId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMessageIds(), other.isSetMessageIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messageIds, other.messageIds);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("MessageStoreResult(");
    boolean first = true;

    sb.append("requestId:");
    if (this.requestId == null) {
      sb.append("null");
    } else {
      sb.append(this.requestId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageIds:");
    if (this.messageIds == null) {
      sb.append("null");
    } else {
      sb.append(this.messageIds);
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

  private static class MessageStoreResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MessageStoreResultStandardScheme getScheme() {
      return new MessageStoreResultStandardScheme();
    }
  }

  private static class MessageStoreResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<MessageStoreResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MessageStoreResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REQUEST_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.requestId = iprot.readString();
              struct.setRequestIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESSAGE_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list340 = iprot.readListBegin();
                struct.messageIds = new java.util.ArrayList<java.lang.String>(_list340.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem341;
                for (int _i342 = 0; _i342 < _list340.size; ++_i342)
                {
                  _elem341 = iprot.readString();
                  struct.messageIds.add(_elem341);
                }
                iprot.readListEnd();
              }
              struct.setMessageIdsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MessageStoreResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.requestId != null) {
        oprot.writeFieldBegin(REQUEST_ID_FIELD_DESC);
        oprot.writeString(struct.requestId);
        oprot.writeFieldEnd();
      }
      if (struct.messageIds != null) {
        oprot.writeFieldBegin(MESSAGE_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.messageIds.size()));
          for (java.lang.String _iter343 : struct.messageIds)
          {
            oprot.writeString(_iter343);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MessageStoreResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MessageStoreResultTupleScheme getScheme() {
      return new MessageStoreResultTupleScheme();
    }
  }

  private static class MessageStoreResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<MessageStoreResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MessageStoreResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRequestId()) {
        optionals.set(0);
      }
      if (struct.isSetMessageIds()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetRequestId()) {
        oprot.writeString(struct.requestId);
      }
      if (struct.isSetMessageIds()) {
        {
          oprot.writeI32(struct.messageIds.size());
          for (java.lang.String _iter344 : struct.messageIds)
          {
            oprot.writeString(_iter344);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MessageStoreResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.requestId = iprot.readString();
        struct.setRequestIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list345 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.messageIds = new java.util.ArrayList<java.lang.String>(_list345.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem346;
          for (int _i347 = 0; _i347 < _list345.size; ++_i347)
          {
            _elem346 = iprot.readString();
            struct.messageIds.add(_elem346);
          }
        }
        struct.setMessageIdsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

