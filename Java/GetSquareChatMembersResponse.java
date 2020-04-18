/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2020-04-18")
public class GetSquareChatMembersResponse implements org.apache.thrift.TBase<GetSquareChatMembersResponse, GetSquareChatMembersResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetSquareChatMembersResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetSquareChatMembersResponse");

  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_MEMBERS_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatMembers", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField CONTINUATION_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("continuationToken", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetSquareChatMembersResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetSquareChatMembersResponseTupleSchemeFactory();

  public SquareMember squareChatMembers; // required
  public java.lang.String continuationToken; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_CHAT_MEMBERS((short)1, "squareChatMembers"),
    CONTINUATION_TOKEN((short)2, "continuationToken");

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
        case 1: // SQUARE_CHAT_MEMBERS
          return SQUARE_CHAT_MEMBERS;
        case 2: // CONTINUATION_TOKEN
          return CONTINUATION_TOKEN;
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
    tmpMap.put(_Fields.SQUARE_CHAT_MEMBERS, new org.apache.thrift.meta_data.FieldMetaData("squareChatMembers", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareMember.class)));
    tmpMap.put(_Fields.CONTINUATION_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("continuationToken", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetSquareChatMembersResponse.class, metaDataMap);
  }

  public GetSquareChatMembersResponse() {
  }

  public GetSquareChatMembersResponse(
    SquareMember squareChatMembers,
    java.lang.String continuationToken)
  {
    this();
    this.squareChatMembers = squareChatMembers;
    this.continuationToken = continuationToken;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetSquareChatMembersResponse(GetSquareChatMembersResponse other) {
    if (other.isSetSquareChatMembers()) {
      this.squareChatMembers = new SquareMember(other.squareChatMembers);
    }
    if (other.isSetContinuationToken()) {
      this.continuationToken = other.continuationToken;
    }
  }

  public GetSquareChatMembersResponse deepCopy() {
    return new GetSquareChatMembersResponse(this);
  }

  @Override
  public void clear() {
    this.squareChatMembers = null;
    this.continuationToken = null;
  }

  public SquareMember getSquareChatMembers() {
    return this.squareChatMembers;
  }

  public GetSquareChatMembersResponse setSquareChatMembers(SquareMember squareChatMembers) {
    this.squareChatMembers = squareChatMembers;
    return this;
  }

  public void unsetSquareChatMembers() {
    this.squareChatMembers = null;
  }

  /** Returns true if field squareChatMembers is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChatMembers() {
    return this.squareChatMembers != null;
  }

  public void setSquareChatMembersIsSet(boolean value) {
    if (!value) {
      this.squareChatMembers = null;
    }
  }

  public java.lang.String getContinuationToken() {
    return this.continuationToken;
  }

  public GetSquareChatMembersResponse setContinuationToken(java.lang.String continuationToken) {
    this.continuationToken = continuationToken;
    return this;
  }

  public void unsetContinuationToken() {
    this.continuationToken = null;
  }

  /** Returns true if field continuationToken is set (has been assigned a value) and false otherwise */
  public boolean isSetContinuationToken() {
    return this.continuationToken != null;
  }

  public void setContinuationTokenIsSet(boolean value) {
    if (!value) {
      this.continuationToken = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SQUARE_CHAT_MEMBERS:
      if (value == null) {
        unsetSquareChatMembers();
      } else {
        setSquareChatMembers((SquareMember)value);
      }
      break;

    case CONTINUATION_TOKEN:
      if (value == null) {
        unsetContinuationToken();
      } else {
        setContinuationToken((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_CHAT_MEMBERS:
      return getSquareChatMembers();

    case CONTINUATION_TOKEN:
      return getContinuationToken();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SQUARE_CHAT_MEMBERS:
      return isSetSquareChatMembers();
    case CONTINUATION_TOKEN:
      return isSetContinuationToken();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GetSquareChatMembersResponse)
      return this.equals((GetSquareChatMembersResponse)that);
    return false;
  }

  public boolean equals(GetSquareChatMembersResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareChatMembers = true && this.isSetSquareChatMembers();
    boolean that_present_squareChatMembers = true && that.isSetSquareChatMembers();
    if (this_present_squareChatMembers || that_present_squareChatMembers) {
      if (!(this_present_squareChatMembers && that_present_squareChatMembers))
        return false;
      if (!this.squareChatMembers.equals(that.squareChatMembers))
        return false;
    }

    boolean this_present_continuationToken = true && this.isSetContinuationToken();
    boolean that_present_continuationToken = true && that.isSetContinuationToken();
    if (this_present_continuationToken || that_present_continuationToken) {
      if (!(this_present_continuationToken && that_present_continuationToken))
        return false;
      if (!this.continuationToken.equals(that.continuationToken))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSquareChatMembers()) ? 131071 : 524287);
    if (isSetSquareChatMembers())
      hashCode = hashCode * 8191 + squareChatMembers.hashCode();

    hashCode = hashCode * 8191 + ((isSetContinuationToken()) ? 131071 : 524287);
    if (isSetContinuationToken())
      hashCode = hashCode * 8191 + continuationToken.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GetSquareChatMembersResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSquareChatMembers()).compareTo(other.isSetSquareChatMembers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatMembers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareChatMembers, other.squareChatMembers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetContinuationToken()).compareTo(other.isSetContinuationToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContinuationToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.continuationToken, other.continuationToken);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetSquareChatMembersResponse(");
    boolean first = true;

    sb.append("squareChatMembers:");
    if (this.squareChatMembers == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMembers);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("continuationToken:");
    if (this.continuationToken == null) {
      sb.append("null");
    } else {
      sb.append(this.continuationToken);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (squareChatMembers != null) {
      squareChatMembers.validate();
    }
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

  private static class GetSquareChatMembersResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetSquareChatMembersResponseStandardScheme getScheme() {
      return new GetSquareChatMembersResponseStandardScheme();
    }
  }

  private static class GetSquareChatMembersResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetSquareChatMembersResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetSquareChatMembersResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SQUARE_CHAT_MEMBERS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.squareChatMembers = new SquareMember();
              struct.squareChatMembers.read(iprot);
              struct.setSquareChatMembersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CONTINUATION_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.continuationToken = iprot.readString();
              struct.setContinuationTokenIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetSquareChatMembersResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareChatMembers != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_MEMBERS_FIELD_DESC);
        struct.squareChatMembers.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.continuationToken != null) {
        oprot.writeFieldBegin(CONTINUATION_TOKEN_FIELD_DESC);
        oprot.writeString(struct.continuationToken);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetSquareChatMembersResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetSquareChatMembersResponseTupleScheme getScheme() {
      return new GetSquareChatMembersResponseTupleScheme();
    }
  }

  private static class GetSquareChatMembersResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetSquareChatMembersResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetSquareChatMembersResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSquareChatMembers()) {
        optionals.set(0);
      }
      if (struct.isSetContinuationToken()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSquareChatMembers()) {
        struct.squareChatMembers.write(oprot);
      }
      if (struct.isSetContinuationToken()) {
        oprot.writeString(struct.continuationToken);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetSquareChatMembersResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.squareChatMembers = new SquareMember();
        struct.squareChatMembers.read(iprot);
        struct.setSquareChatMembersIsSet(true);
      }
      if (incoming.get(1)) {
        struct.continuationToken = iprot.readString();
        struct.setContinuationTokenIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

