/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class SquareEventNotifiedLeaveSquareChat implements org.apache.thrift.TBase<SquareEventNotifiedLeaveSquareChat, SquareEventNotifiedLeaveSquareChat._Fields>, java.io.Serializable, Cloneable, Comparable<SquareEventNotifiedLeaveSquareChat> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareEventNotifiedLeaveSquareChat");

  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatMid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SQUARE_MEMBER_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareMemberMid", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SAY_GOODBYE_FIELD_DESC = new org.apache.thrift.protocol.TField("sayGoodbye", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField SQUARE_MEMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("squareMember", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SquareEventNotifiedLeaveSquareChatStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SquareEventNotifiedLeaveSquareChatTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String squareChatMid; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String squareMemberMid; // required
  public boolean sayGoodbye; // required
  public @org.apache.thrift.annotation.Nullable SquareMember squareMember; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_CHAT_MID((short)1, "squareChatMid"),
    SQUARE_MEMBER_MID((short)2, "squareMemberMid"),
    SAY_GOODBYE((short)3, "sayGoodbye"),
    SQUARE_MEMBER((short)4, "squareMember");

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
        case 2: // SQUARE_MEMBER_MID
          return SQUARE_MEMBER_MID;
        case 3: // SAY_GOODBYE
          return SAY_GOODBYE;
        case 4: // SQUARE_MEMBER
          return SQUARE_MEMBER;
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
  private static final int __SAYGOODBYE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SQUARE_CHAT_MID, new org.apache.thrift.meta_data.FieldMetaData("squareChatMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SQUARE_MEMBER_MID, new org.apache.thrift.meta_data.FieldMetaData("squareMemberMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SAY_GOODBYE, new org.apache.thrift.meta_data.FieldMetaData("sayGoodbye", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SQUARE_MEMBER, new org.apache.thrift.meta_data.FieldMetaData("squareMember", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareMember.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareEventNotifiedLeaveSquareChat.class, metaDataMap);
  }

  public SquareEventNotifiedLeaveSquareChat() {
  }

  public SquareEventNotifiedLeaveSquareChat(
    java.lang.String squareChatMid,
    java.lang.String squareMemberMid,
    boolean sayGoodbye,
    SquareMember squareMember)
  {
    this();
    this.squareChatMid = squareChatMid;
    this.squareMemberMid = squareMemberMid;
    this.sayGoodbye = sayGoodbye;
    setSayGoodbyeIsSet(true);
    this.squareMember = squareMember;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareEventNotifiedLeaveSquareChat(SquareEventNotifiedLeaveSquareChat other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
    if (other.isSetSquareMemberMid()) {
      this.squareMemberMid = other.squareMemberMid;
    }
    this.sayGoodbye = other.sayGoodbye;
    if (other.isSetSquareMember()) {
      this.squareMember = new SquareMember(other.squareMember);
    }
  }

  public SquareEventNotifiedLeaveSquareChat deepCopy() {
    return new SquareEventNotifiedLeaveSquareChat(this);
  }

  @Override
  public void clear() {
    this.squareChatMid = null;
    this.squareMemberMid = null;
    setSayGoodbyeIsSet(false);
    this.sayGoodbye = false;
    this.squareMember = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSquareChatMid() {
    return this.squareChatMid;
  }

  public SquareEventNotifiedLeaveSquareChat setSquareChatMid(@org.apache.thrift.annotation.Nullable java.lang.String squareChatMid) {
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
  public java.lang.String getSquareMemberMid() {
    return this.squareMemberMid;
  }

  public SquareEventNotifiedLeaveSquareChat setSquareMemberMid(@org.apache.thrift.annotation.Nullable java.lang.String squareMemberMid) {
    this.squareMemberMid = squareMemberMid;
    return this;
  }

  public void unsetSquareMemberMid() {
    this.squareMemberMid = null;
  }

  /** Returns true if field squareMemberMid is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareMemberMid() {
    return this.squareMemberMid != null;
  }

  public void setSquareMemberMidIsSet(boolean value) {
    if (!value) {
      this.squareMemberMid = null;
    }
  }

  public boolean isSayGoodbye() {
    return this.sayGoodbye;
  }

  public SquareEventNotifiedLeaveSquareChat setSayGoodbye(boolean sayGoodbye) {
    this.sayGoodbye = sayGoodbye;
    setSayGoodbyeIsSet(true);
    return this;
  }

  public void unsetSayGoodbye() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SAYGOODBYE_ISSET_ID);
  }

  /** Returns true if field sayGoodbye is set (has been assigned a value) and false otherwise */
  public boolean isSetSayGoodbye() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SAYGOODBYE_ISSET_ID);
  }

  public void setSayGoodbyeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SAYGOODBYE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public SquareMember getSquareMember() {
    return this.squareMember;
  }

  public SquareEventNotifiedLeaveSquareChat setSquareMember(@org.apache.thrift.annotation.Nullable SquareMember squareMember) {
    this.squareMember = squareMember;
    return this;
  }

  public void unsetSquareMember() {
    this.squareMember = null;
  }

  /** Returns true if field squareMember is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareMember() {
    return this.squareMember != null;
  }

  public void setSquareMemberIsSet(boolean value) {
    if (!value) {
      this.squareMember = null;
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

    case SQUARE_MEMBER_MID:
      if (value == null) {
        unsetSquareMemberMid();
      } else {
        setSquareMemberMid((java.lang.String)value);
      }
      break;

    case SAY_GOODBYE:
      if (value == null) {
        unsetSayGoodbye();
      } else {
        setSayGoodbye((java.lang.Boolean)value);
      }
      break;

    case SQUARE_MEMBER:
      if (value == null) {
        unsetSquareMember();
      } else {
        setSquareMember((SquareMember)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_CHAT_MID:
      return getSquareChatMid();

    case SQUARE_MEMBER_MID:
      return getSquareMemberMid();

    case SAY_GOODBYE:
      return isSayGoodbye();

    case SQUARE_MEMBER:
      return getSquareMember();

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
    case SQUARE_MEMBER_MID:
      return isSetSquareMemberMid();
    case SAY_GOODBYE:
      return isSetSayGoodbye();
    case SQUARE_MEMBER:
      return isSetSquareMember();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof SquareEventNotifiedLeaveSquareChat)
      return this.equals((SquareEventNotifiedLeaveSquareChat)that);
    return false;
  }

  public boolean equals(SquareEventNotifiedLeaveSquareChat that) {
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

    boolean this_present_squareMemberMid = true && this.isSetSquareMemberMid();
    boolean that_present_squareMemberMid = true && that.isSetSquareMemberMid();
    if (this_present_squareMemberMid || that_present_squareMemberMid) {
      if (!(this_present_squareMemberMid && that_present_squareMemberMid))
        return false;
      if (!this.squareMemberMid.equals(that.squareMemberMid))
        return false;
    }

    boolean this_present_sayGoodbye = true;
    boolean that_present_sayGoodbye = true;
    if (this_present_sayGoodbye || that_present_sayGoodbye) {
      if (!(this_present_sayGoodbye && that_present_sayGoodbye))
        return false;
      if (this.sayGoodbye != that.sayGoodbye)
        return false;
    }

    boolean this_present_squareMember = true && this.isSetSquareMember();
    boolean that_present_squareMember = true && that.isSetSquareMember();
    if (this_present_squareMember || that_present_squareMember) {
      if (!(this_present_squareMember && that_present_squareMember))
        return false;
      if (!this.squareMember.equals(that.squareMember))
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

    hashCode = hashCode * 8191 + ((isSetSquareMemberMid()) ? 131071 : 524287);
    if (isSetSquareMemberMid())
      hashCode = hashCode * 8191 + squareMemberMid.hashCode();

    hashCode = hashCode * 8191 + ((sayGoodbye) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetSquareMember()) ? 131071 : 524287);
    if (isSetSquareMember())
      hashCode = hashCode * 8191 + squareMember.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SquareEventNotifiedLeaveSquareChat other) {
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
    lastComparison = java.lang.Boolean.compare(isSetSquareMemberMid(), other.isSetSquareMemberMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareMemberMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareMemberMid, other.squareMemberMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSayGoodbye(), other.isSetSayGoodbye());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSayGoodbye()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sayGoodbye, other.sayGoodbye);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSquareMember(), other.isSetSquareMember());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareMember()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareMember, other.squareMember);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SquareEventNotifiedLeaveSquareChat(");
    boolean first = true;

    sb.append("squareChatMid:");
    if (this.squareChatMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareMemberMid:");
    if (this.squareMemberMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMemberMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sayGoodbye:");
    sb.append(this.sayGoodbye);
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareMember:");
    if (this.squareMember == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMember);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (squareMember != null) {
      squareMember.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SquareEventNotifiedLeaveSquareChatStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareEventNotifiedLeaveSquareChatStandardScheme getScheme() {
      return new SquareEventNotifiedLeaveSquareChatStandardScheme();
    }
  }

  private static class SquareEventNotifiedLeaveSquareChatStandardScheme extends org.apache.thrift.scheme.StandardScheme<SquareEventNotifiedLeaveSquareChat> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareEventNotifiedLeaveSquareChat struct) throws org.apache.thrift.TException {
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
          case 2: // SQUARE_MEMBER_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.squareMemberMid = iprot.readString();
              struct.setSquareMemberMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SAY_GOODBYE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.sayGoodbye = iprot.readBool();
              struct.setSayGoodbyeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SQUARE_MEMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.squareMember = new SquareMember();
              struct.squareMember.read(iprot);
              struct.setSquareMemberIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareEventNotifiedLeaveSquareChat struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareChatMid != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
        oprot.writeString(struct.squareChatMid);
        oprot.writeFieldEnd();
      }
      if (struct.squareMemberMid != null) {
        oprot.writeFieldBegin(SQUARE_MEMBER_MID_FIELD_DESC);
        oprot.writeString(struct.squareMemberMid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SAY_GOODBYE_FIELD_DESC);
      oprot.writeBool(struct.sayGoodbye);
      oprot.writeFieldEnd();
      if (struct.squareMember != null) {
        oprot.writeFieldBegin(SQUARE_MEMBER_FIELD_DESC);
        struct.squareMember.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareEventNotifiedLeaveSquareChatTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareEventNotifiedLeaveSquareChatTupleScheme getScheme() {
      return new SquareEventNotifiedLeaveSquareChatTupleScheme();
    }
  }

  private static class SquareEventNotifiedLeaveSquareChatTupleScheme extends org.apache.thrift.scheme.TupleScheme<SquareEventNotifiedLeaveSquareChat> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareEventNotifiedLeaveSquareChat struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSquareChatMid()) {
        optionals.set(0);
      }
      if (struct.isSetSquareMemberMid()) {
        optionals.set(1);
      }
      if (struct.isSetSayGoodbye()) {
        optionals.set(2);
      }
      if (struct.isSetSquareMember()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetSquareChatMid()) {
        oprot.writeString(struct.squareChatMid);
      }
      if (struct.isSetSquareMemberMid()) {
        oprot.writeString(struct.squareMemberMid);
      }
      if (struct.isSetSayGoodbye()) {
        oprot.writeBool(struct.sayGoodbye);
      }
      if (struct.isSetSquareMember()) {
        struct.squareMember.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareEventNotifiedLeaveSquareChat struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.squareChatMid = iprot.readString();
        struct.setSquareChatMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.squareMemberMid = iprot.readString();
        struct.setSquareMemberMidIsSet(true);
      }
      if (incoming.get(2)) {
        struct.sayGoodbye = iprot.readBool();
        struct.setSayGoodbyeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.squareMember = new SquareMember();
        struct.squareMember.read(iprot);
        struct.setSquareMemberIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

