/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class SquareEventNotifiedKickoutFromSquare implements org.apache.thrift.TBase<SquareEventNotifiedKickoutFromSquare, SquareEventNotifiedKickoutFromSquare._Fields>, java.io.Serializable, Cloneable, Comparable<SquareEventNotifiedKickoutFromSquare> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareEventNotifiedKickoutFromSquare");

  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatMid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField KICKEES_FIELD_DESC = new org.apache.thrift.protocol.TField("kickees", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SquareEventNotifiedKickoutFromSquareStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SquareEventNotifiedKickoutFromSquareTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String squareChatMid; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<SquareMember> kickees; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_CHAT_MID((short)1, "squareChatMid"),
    KICKEES((short)2, "kickees");

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
        case 2: // KICKEES
          return KICKEES;
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
    tmpMap.put(_Fields.KICKEES, new org.apache.thrift.meta_data.FieldMetaData("kickees", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareMember.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareEventNotifiedKickoutFromSquare.class, metaDataMap);
  }

  public SquareEventNotifiedKickoutFromSquare() {
  }

  public SquareEventNotifiedKickoutFromSquare(
    java.lang.String squareChatMid,
    java.util.List<SquareMember> kickees)
  {
    this();
    this.squareChatMid = squareChatMid;
    this.kickees = kickees;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareEventNotifiedKickoutFromSquare(SquareEventNotifiedKickoutFromSquare other) {
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
    if (other.isSetKickees()) {
      java.util.List<SquareMember> __this__kickees = new java.util.ArrayList<SquareMember>(other.kickees.size());
      for (SquareMember other_element : other.kickees) {
        __this__kickees.add(new SquareMember(other_element));
      }
      this.kickees = __this__kickees;
    }
  }

  public SquareEventNotifiedKickoutFromSquare deepCopy() {
    return new SquareEventNotifiedKickoutFromSquare(this);
  }

  @Override
  public void clear() {
    this.squareChatMid = null;
    this.kickees = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSquareChatMid() {
    return this.squareChatMid;
  }

  public SquareEventNotifiedKickoutFromSquare setSquareChatMid(@org.apache.thrift.annotation.Nullable java.lang.String squareChatMid) {
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

  public int getKickeesSize() {
    return (this.kickees == null) ? 0 : this.kickees.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<SquareMember> getKickeesIterator() {
    return (this.kickees == null) ? null : this.kickees.iterator();
  }

  public void addToKickees(SquareMember elem) {
    if (this.kickees == null) {
      this.kickees = new java.util.ArrayList<SquareMember>();
    }
    this.kickees.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<SquareMember> getKickees() {
    return this.kickees;
  }

  public SquareEventNotifiedKickoutFromSquare setKickees(@org.apache.thrift.annotation.Nullable java.util.List<SquareMember> kickees) {
    this.kickees = kickees;
    return this;
  }

  public void unsetKickees() {
    this.kickees = null;
  }

  /** Returns true if field kickees is set (has been assigned a value) and false otherwise */
  public boolean isSetKickees() {
    return this.kickees != null;
  }

  public void setKickeesIsSet(boolean value) {
    if (!value) {
      this.kickees = null;
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

    case KICKEES:
      if (value == null) {
        unsetKickees();
      } else {
        setKickees((java.util.List<SquareMember>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_CHAT_MID:
      return getSquareChatMid();

    case KICKEES:
      return getKickees();

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
    case KICKEES:
      return isSetKickees();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof SquareEventNotifiedKickoutFromSquare)
      return this.equals((SquareEventNotifiedKickoutFromSquare)that);
    return false;
  }

  public boolean equals(SquareEventNotifiedKickoutFromSquare that) {
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

    boolean this_present_kickees = true && this.isSetKickees();
    boolean that_present_kickees = true && that.isSetKickees();
    if (this_present_kickees || that_present_kickees) {
      if (!(this_present_kickees && that_present_kickees))
        return false;
      if (!this.kickees.equals(that.kickees))
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

    hashCode = hashCode * 8191 + ((isSetKickees()) ? 131071 : 524287);
    if (isSetKickees())
      hashCode = hashCode * 8191 + kickees.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SquareEventNotifiedKickoutFromSquare other) {
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
    lastComparison = java.lang.Boolean.compare(isSetKickees(), other.isSetKickees());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKickees()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.kickees, other.kickees);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SquareEventNotifiedKickoutFromSquare(");
    boolean first = true;

    sb.append("squareChatMid:");
    if (this.squareChatMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("kickees:");
    if (this.kickees == null) {
      sb.append("null");
    } else {
      sb.append(this.kickees);
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

  private static class SquareEventNotifiedKickoutFromSquareStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareEventNotifiedKickoutFromSquareStandardScheme getScheme() {
      return new SquareEventNotifiedKickoutFromSquareStandardScheme();
    }
  }

  private static class SquareEventNotifiedKickoutFromSquareStandardScheme extends org.apache.thrift.scheme.StandardScheme<SquareEventNotifiedKickoutFromSquare> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareEventNotifiedKickoutFromSquare struct) throws org.apache.thrift.TException {
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
          case 2: // KICKEES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list682 = iprot.readListBegin();
                struct.kickees = new java.util.ArrayList<SquareMember>(_list682.size);
                @org.apache.thrift.annotation.Nullable SquareMember _elem683;
                for (int _i684 = 0; _i684 < _list682.size; ++_i684)
                {
                  _elem683 = new SquareMember();
                  _elem683.read(iprot);
                  struct.kickees.add(_elem683);
                }
                iprot.readListEnd();
              }
              struct.setKickeesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareEventNotifiedKickoutFromSquare struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareChatMid != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
        oprot.writeString(struct.squareChatMid);
        oprot.writeFieldEnd();
      }
      if (struct.kickees != null) {
        oprot.writeFieldBegin(KICKEES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.kickees.size()));
          for (SquareMember _iter685 : struct.kickees)
          {
            _iter685.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareEventNotifiedKickoutFromSquareTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareEventNotifiedKickoutFromSquareTupleScheme getScheme() {
      return new SquareEventNotifiedKickoutFromSquareTupleScheme();
    }
  }

  private static class SquareEventNotifiedKickoutFromSquareTupleScheme extends org.apache.thrift.scheme.TupleScheme<SquareEventNotifiedKickoutFromSquare> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareEventNotifiedKickoutFromSquare struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSquareChatMid()) {
        optionals.set(0);
      }
      if (struct.isSetKickees()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSquareChatMid()) {
        oprot.writeString(struct.squareChatMid);
      }
      if (struct.isSetKickees()) {
        {
          oprot.writeI32(struct.kickees.size());
          for (SquareMember _iter686 : struct.kickees)
          {
            _iter686.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareEventNotifiedKickoutFromSquare struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.squareChatMid = iprot.readString();
        struct.setSquareChatMidIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list687 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.kickees = new java.util.ArrayList<SquareMember>(_list687.size);
          @org.apache.thrift.annotation.Nullable SquareMember _elem688;
          for (int _i689 = 0; _i689 < _list687.size; ++_i689)
          {
            _elem688 = new SquareMember();
            _elem688.read(iprot);
            struct.kickees.add(_elem688);
          }
        }
        struct.setKickeesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

