/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class GetSquareChatResponse implements org.apache.thrift.TBase<GetSquareChatResponse, GetSquareChatResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetSquareChatResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetSquareChatResponse");

  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChat", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_MEMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatMember", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatStatus", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetSquareChatResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetSquareChatResponseTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable SquareChat squareChat; // required
  public @org.apache.thrift.annotation.Nullable SquareChatMember squareChatMember; // required
  public @org.apache.thrift.annotation.Nullable SquareChatStatus squareChatStatus; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_CHAT((short)1, "squareChat"),
    SQUARE_CHAT_MEMBER((short)2, "squareChatMember"),
    SQUARE_CHAT_STATUS((short)3, "squareChatStatus");

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
        case 1: // SQUARE_CHAT
          return SQUARE_CHAT;
        case 2: // SQUARE_CHAT_MEMBER
          return SQUARE_CHAT_MEMBER;
        case 3: // SQUARE_CHAT_STATUS
          return SQUARE_CHAT_STATUS;
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
    tmpMap.put(_Fields.SQUARE_CHAT, new org.apache.thrift.meta_data.FieldMetaData("squareChat", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareChat.class)));
    tmpMap.put(_Fields.SQUARE_CHAT_MEMBER, new org.apache.thrift.meta_data.FieldMetaData("squareChatMember", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareChatMember.class)));
    tmpMap.put(_Fields.SQUARE_CHAT_STATUS, new org.apache.thrift.meta_data.FieldMetaData("squareChatStatus", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareChatStatus.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetSquareChatResponse.class, metaDataMap);
  }

  public GetSquareChatResponse() {
  }

  public GetSquareChatResponse(
    SquareChat squareChat,
    SquareChatMember squareChatMember,
    SquareChatStatus squareChatStatus)
  {
    this();
    this.squareChat = squareChat;
    this.squareChatMember = squareChatMember;
    this.squareChatStatus = squareChatStatus;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetSquareChatResponse(GetSquareChatResponse other) {
    if (other.isSetSquareChat()) {
      this.squareChat = new SquareChat(other.squareChat);
    }
    if (other.isSetSquareChatMember()) {
      this.squareChatMember = new SquareChatMember(other.squareChatMember);
    }
    if (other.isSetSquareChatStatus()) {
      this.squareChatStatus = new SquareChatStatus(other.squareChatStatus);
    }
  }

  public GetSquareChatResponse deepCopy() {
    return new GetSquareChatResponse(this);
  }

  @Override
  public void clear() {
    this.squareChat = null;
    this.squareChatMember = null;
    this.squareChatStatus = null;
  }

  @org.apache.thrift.annotation.Nullable
  public SquareChat getSquareChat() {
    return this.squareChat;
  }

  public GetSquareChatResponse setSquareChat(@org.apache.thrift.annotation.Nullable SquareChat squareChat) {
    this.squareChat = squareChat;
    return this;
  }

  public void unsetSquareChat() {
    this.squareChat = null;
  }

  /** Returns true if field squareChat is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChat() {
    return this.squareChat != null;
  }

  public void setSquareChatIsSet(boolean value) {
    if (!value) {
      this.squareChat = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public SquareChatMember getSquareChatMember() {
    return this.squareChatMember;
  }

  public GetSquareChatResponse setSquareChatMember(@org.apache.thrift.annotation.Nullable SquareChatMember squareChatMember) {
    this.squareChatMember = squareChatMember;
    return this;
  }

  public void unsetSquareChatMember() {
    this.squareChatMember = null;
  }

  /** Returns true if field squareChatMember is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChatMember() {
    return this.squareChatMember != null;
  }

  public void setSquareChatMemberIsSet(boolean value) {
    if (!value) {
      this.squareChatMember = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public SquareChatStatus getSquareChatStatus() {
    return this.squareChatStatus;
  }

  public GetSquareChatResponse setSquareChatStatus(@org.apache.thrift.annotation.Nullable SquareChatStatus squareChatStatus) {
    this.squareChatStatus = squareChatStatus;
    return this;
  }

  public void unsetSquareChatStatus() {
    this.squareChatStatus = null;
  }

  /** Returns true if field squareChatStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChatStatus() {
    return this.squareChatStatus != null;
  }

  public void setSquareChatStatusIsSet(boolean value) {
    if (!value) {
      this.squareChatStatus = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SQUARE_CHAT:
      if (value == null) {
        unsetSquareChat();
      } else {
        setSquareChat((SquareChat)value);
      }
      break;

    case SQUARE_CHAT_MEMBER:
      if (value == null) {
        unsetSquareChatMember();
      } else {
        setSquareChatMember((SquareChatMember)value);
      }
      break;

    case SQUARE_CHAT_STATUS:
      if (value == null) {
        unsetSquareChatStatus();
      } else {
        setSquareChatStatus((SquareChatStatus)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_CHAT:
      return getSquareChat();

    case SQUARE_CHAT_MEMBER:
      return getSquareChatMember();

    case SQUARE_CHAT_STATUS:
      return getSquareChatStatus();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SQUARE_CHAT:
      return isSetSquareChat();
    case SQUARE_CHAT_MEMBER:
      return isSetSquareChatMember();
    case SQUARE_CHAT_STATUS:
      return isSetSquareChatStatus();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof GetSquareChatResponse)
      return this.equals((GetSquareChatResponse)that);
    return false;
  }

  public boolean equals(GetSquareChatResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareChat = true && this.isSetSquareChat();
    boolean that_present_squareChat = true && that.isSetSquareChat();
    if (this_present_squareChat || that_present_squareChat) {
      if (!(this_present_squareChat && that_present_squareChat))
        return false;
      if (!this.squareChat.equals(that.squareChat))
        return false;
    }

    boolean this_present_squareChatMember = true && this.isSetSquareChatMember();
    boolean that_present_squareChatMember = true && that.isSetSquareChatMember();
    if (this_present_squareChatMember || that_present_squareChatMember) {
      if (!(this_present_squareChatMember && that_present_squareChatMember))
        return false;
      if (!this.squareChatMember.equals(that.squareChatMember))
        return false;
    }

    boolean this_present_squareChatStatus = true && this.isSetSquareChatStatus();
    boolean that_present_squareChatStatus = true && that.isSetSquareChatStatus();
    if (this_present_squareChatStatus || that_present_squareChatStatus) {
      if (!(this_present_squareChatStatus && that_present_squareChatStatus))
        return false;
      if (!this.squareChatStatus.equals(that.squareChatStatus))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSquareChat()) ? 131071 : 524287);
    if (isSetSquareChat())
      hashCode = hashCode * 8191 + squareChat.hashCode();

    hashCode = hashCode * 8191 + ((isSetSquareChatMember()) ? 131071 : 524287);
    if (isSetSquareChatMember())
      hashCode = hashCode * 8191 + squareChatMember.hashCode();

    hashCode = hashCode * 8191 + ((isSetSquareChatStatus()) ? 131071 : 524287);
    if (isSetSquareChatStatus())
      hashCode = hashCode * 8191 + squareChatStatus.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GetSquareChatResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetSquareChat(), other.isSetSquareChat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChat()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareChat, other.squareChat);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSquareChatMember(), other.isSetSquareChatMember());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatMember()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareChatMember, other.squareChatMember);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSquareChatStatus(), other.isSetSquareChatStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareChatStatus, other.squareChatStatus);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetSquareChatResponse(");
    boolean first = true;

    sb.append("squareChat:");
    if (this.squareChat == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChat);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareChatMember:");
    if (this.squareChatMember == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMember);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareChatStatus:");
    if (this.squareChatStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatStatus);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (squareChat != null) {
      squareChat.validate();
    }
    if (squareChatMember != null) {
      squareChatMember.validate();
    }
    if (squareChatStatus != null) {
      squareChatStatus.validate();
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

  private static class GetSquareChatResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetSquareChatResponseStandardScheme getScheme() {
      return new GetSquareChatResponseStandardScheme();
    }
  }

  private static class GetSquareChatResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetSquareChatResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetSquareChatResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SQUARE_CHAT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.squareChat = new SquareChat();
              struct.squareChat.read(iprot);
              struct.setSquareChatIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SQUARE_CHAT_MEMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.squareChatMember = new SquareChatMember();
              struct.squareChatMember.read(iprot);
              struct.setSquareChatMemberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SQUARE_CHAT_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.squareChatStatus = new SquareChatStatus();
              struct.squareChatStatus.read(iprot);
              struct.setSquareChatStatusIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetSquareChatResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareChat != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_FIELD_DESC);
        struct.squareChat.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.squareChatMember != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_MEMBER_FIELD_DESC);
        struct.squareChatMember.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.squareChatStatus != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_STATUS_FIELD_DESC);
        struct.squareChatStatus.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetSquareChatResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetSquareChatResponseTupleScheme getScheme() {
      return new GetSquareChatResponseTupleScheme();
    }
  }

  private static class GetSquareChatResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetSquareChatResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetSquareChatResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSquareChat()) {
        optionals.set(0);
      }
      if (struct.isSetSquareChatMember()) {
        optionals.set(1);
      }
      if (struct.isSetSquareChatStatus()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSquareChat()) {
        struct.squareChat.write(oprot);
      }
      if (struct.isSetSquareChatMember()) {
        struct.squareChatMember.write(oprot);
      }
      if (struct.isSetSquareChatStatus()) {
        struct.squareChatStatus.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetSquareChatResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.squareChat = new SquareChat();
        struct.squareChat.read(iprot);
        struct.setSquareChatIsSet(true);
      }
      if (incoming.get(1)) {
        struct.squareChatMember = new SquareChatMember();
        struct.squareChatMember.read(iprot);
        struct.setSquareChatMemberIsSet(true);
      }
      if (incoming.get(2)) {
        struct.squareChatStatus = new SquareChatStatus();
        struct.squareChatStatus.read(iprot);
        struct.setSquareChatStatusIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

