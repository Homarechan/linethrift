/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2020-04-18")
public class SquareEventNotifiedUpdateSquareChatMember implements org.apache.thrift.TBase<SquareEventNotifiedUpdateSquareChatMember, SquareEventNotifiedUpdateSquareChatMember._Fields>, java.io.Serializable, Cloneable, Comparable<SquareEventNotifiedUpdateSquareChatMember> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareEventNotifiedUpdateSquareChatMember");

  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatMid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SQUARE_MEMBER_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareMemberMid", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_MEMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatMember", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SquareEventNotifiedUpdateSquareChatMemberStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SquareEventNotifiedUpdateSquareChatMemberTupleSchemeFactory();

  public java.lang.String squareChatMid; // required
  public java.lang.String squareMemberMid; // required
  public SquareChatMember squareChatMember; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_CHAT_MID((short)1, "squareChatMid"),
    SQUARE_MEMBER_MID((short)2, "squareMemberMid"),
    SQUARE_CHAT_MEMBER((short)3, "squareChatMember");

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
        case 1: // SQUARE_CHAT_MID
          return SQUARE_CHAT_MID;
        case 2: // SQUARE_MEMBER_MID
          return SQUARE_MEMBER_MID;
        case 3: // SQUARE_CHAT_MEMBER
          return SQUARE_CHAT_MEMBER;
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
    tmpMap.put(_Fields.SQUARE_CHAT_MID, new org.apache.thrift.meta_data.FieldMetaData("squareChatMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SQUARE_MEMBER_MID, new org.apache.thrift.meta_data.FieldMetaData("squareMemberMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SQUARE_CHAT_MEMBER, new org.apache.thrift.meta_data.FieldMetaData("squareChatMember", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareChatMember.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareEventNotifiedUpdateSquareChatMember.class, metaDataMap);
  }

  public SquareEventNotifiedUpdateSquareChatMember() {
  }

  public SquareEventNotifiedUpdateSquareChatMember(
    java.lang.String squareChatMid,
    java.lang.String squareMemberMid,
    SquareChatMember squareChatMember)
  {
    this();
    this.squareChatMid = squareChatMid;
    this.squareMemberMid = squareMemberMid;
    this.squareChatMember = squareChatMember;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareEventNotifiedUpdateSquareChatMember(SquareEventNotifiedUpdateSquareChatMember other) {
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
    if (other.isSetSquareMemberMid()) {
      this.squareMemberMid = other.squareMemberMid;
    }
    if (other.isSetSquareChatMember()) {
      this.squareChatMember = new SquareChatMember(other.squareChatMember);
    }
  }

  public SquareEventNotifiedUpdateSquareChatMember deepCopy() {
    return new SquareEventNotifiedUpdateSquareChatMember(this);
  }

  @Override
  public void clear() {
    this.squareChatMid = null;
    this.squareMemberMid = null;
    this.squareChatMember = null;
  }

  public java.lang.String getSquareChatMid() {
    return this.squareChatMid;
  }

  public SquareEventNotifiedUpdateSquareChatMember setSquareChatMid(java.lang.String squareChatMid) {
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

  public java.lang.String getSquareMemberMid() {
    return this.squareMemberMid;
  }

  public SquareEventNotifiedUpdateSquareChatMember setSquareMemberMid(java.lang.String squareMemberMid) {
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

  public SquareChatMember getSquareChatMember() {
    return this.squareChatMember;
  }

  public SquareEventNotifiedUpdateSquareChatMember setSquareChatMember(SquareChatMember squareChatMember) {
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

  public void setFieldValue(_Fields field, java.lang.Object value) {
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

    case SQUARE_CHAT_MEMBER:
      if (value == null) {
        unsetSquareChatMember();
      } else {
        setSquareChatMember((SquareChatMember)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_CHAT_MID:
      return getSquareChatMid();

    case SQUARE_MEMBER_MID:
      return getSquareMemberMid();

    case SQUARE_CHAT_MEMBER:
      return getSquareChatMember();

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
    case SQUARE_CHAT_MEMBER:
      return isSetSquareChatMember();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareEventNotifiedUpdateSquareChatMember)
      return this.equals((SquareEventNotifiedUpdateSquareChatMember)that);
    return false;
  }

  public boolean equals(SquareEventNotifiedUpdateSquareChatMember that) {
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

    boolean this_present_squareChatMember = true && this.isSetSquareChatMember();
    boolean that_present_squareChatMember = true && that.isSetSquareChatMember();
    if (this_present_squareChatMember || that_present_squareChatMember) {
      if (!(this_present_squareChatMember && that_present_squareChatMember))
        return false;
      if (!this.squareChatMember.equals(that.squareChatMember))
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

    hashCode = hashCode * 8191 + ((isSetSquareChatMember()) ? 131071 : 524287);
    if (isSetSquareChatMember())
      hashCode = hashCode * 8191 + squareChatMember.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SquareEventNotifiedUpdateSquareChatMember other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSquareChatMid()).compareTo(other.isSetSquareChatMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareChatMid, other.squareChatMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSquareMemberMid()).compareTo(other.isSetSquareMemberMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareMemberMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareMemberMid, other.squareMemberMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSquareChatMember()).compareTo(other.isSetSquareChatMember());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatMember()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareChatMember, other.squareChatMember);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SquareEventNotifiedUpdateSquareChatMember(");
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
    sb.append("squareChatMember:");
    if (this.squareChatMember == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMember);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (squareChatMember != null) {
      squareChatMember.validate();
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

  private static class SquareEventNotifiedUpdateSquareChatMemberStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareEventNotifiedUpdateSquareChatMemberStandardScheme getScheme() {
      return new SquareEventNotifiedUpdateSquareChatMemberStandardScheme();
    }
  }

  private static class SquareEventNotifiedUpdateSquareChatMemberStandardScheme extends org.apache.thrift.scheme.StandardScheme<SquareEventNotifiedUpdateSquareChatMember> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareEventNotifiedUpdateSquareChatMember struct) throws org.apache.thrift.TException {
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
          case 3: // SQUARE_CHAT_MEMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.squareChatMember = new SquareChatMember();
              struct.squareChatMember.read(iprot);
              struct.setSquareChatMemberIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareEventNotifiedUpdateSquareChatMember struct) throws org.apache.thrift.TException {
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
      if (struct.squareChatMember != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_MEMBER_FIELD_DESC);
        struct.squareChatMember.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareEventNotifiedUpdateSquareChatMemberTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareEventNotifiedUpdateSquareChatMemberTupleScheme getScheme() {
      return new SquareEventNotifiedUpdateSquareChatMemberTupleScheme();
    }
  }

  private static class SquareEventNotifiedUpdateSquareChatMemberTupleScheme extends org.apache.thrift.scheme.TupleScheme<SquareEventNotifiedUpdateSquareChatMember> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareEventNotifiedUpdateSquareChatMember struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSquareChatMid()) {
        optionals.set(0);
      }
      if (struct.isSetSquareMemberMid()) {
        optionals.set(1);
      }
      if (struct.isSetSquareChatMember()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSquareChatMid()) {
        oprot.writeString(struct.squareChatMid);
      }
      if (struct.isSetSquareMemberMid()) {
        oprot.writeString(struct.squareMemberMid);
      }
      if (struct.isSetSquareChatMember()) {
        struct.squareChatMember.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareEventNotifiedUpdateSquareChatMember struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.squareChatMid = iprot.readString();
        struct.setSquareChatMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.squareMemberMid = iprot.readString();
        struct.setSquareMemberMidIsSet(true);
      }
      if (incoming.get(2)) {
        struct.squareChatMember = new SquareChatMember();
        struct.squareChatMember.read(iprot);
        struct.setSquareChatMemberIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

