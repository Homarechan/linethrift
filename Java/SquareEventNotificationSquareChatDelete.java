/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class SquareEventNotificationSquareChatDelete implements org.apache.thrift.TBase<SquareEventNotificationSquareChatDelete, SquareEventNotificationSquareChatDelete._Fields>, java.io.Serializable, Cloneable, Comparable<SquareEventNotificationSquareChatDelete> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareEventNotificationSquareChatDelete");

  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatMid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PROFILE_IMAGE_OBS_HASH_FIELD_DESC = new org.apache.thrift.protocol.TField("profileImageObsHash", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SquareEventNotificationSquareChatDeleteStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SquareEventNotificationSquareChatDeleteTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String squareChatMid; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String squareChatName; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String profileImageObsHash; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_CHAT_MID((short)1, "squareChatMid"),
    SQUARE_CHAT_NAME((short)2, "squareChatName"),
    PROFILE_IMAGE_OBS_HASH((short)3, "profileImageObsHash");

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
        case 2: // SQUARE_CHAT_NAME
          return SQUARE_CHAT_NAME;
        case 3: // PROFILE_IMAGE_OBS_HASH
          return PROFILE_IMAGE_OBS_HASH;
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
    tmpMap.put(_Fields.SQUARE_CHAT_NAME, new org.apache.thrift.meta_data.FieldMetaData("squareChatName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROFILE_IMAGE_OBS_HASH, new org.apache.thrift.meta_data.FieldMetaData("profileImageObsHash", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareEventNotificationSquareChatDelete.class, metaDataMap);
  }

  public SquareEventNotificationSquareChatDelete() {
  }

  public SquareEventNotificationSquareChatDelete(
    java.lang.String squareChatMid,
    java.lang.String squareChatName,
    java.lang.String profileImageObsHash)
  {
    this();
    this.squareChatMid = squareChatMid;
    this.squareChatName = squareChatName;
    this.profileImageObsHash = profileImageObsHash;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareEventNotificationSquareChatDelete(SquareEventNotificationSquareChatDelete other) {
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
    if (other.isSetSquareChatName()) {
      this.squareChatName = other.squareChatName;
    }
    if (other.isSetProfileImageObsHash()) {
      this.profileImageObsHash = other.profileImageObsHash;
    }
  }

  public SquareEventNotificationSquareChatDelete deepCopy() {
    return new SquareEventNotificationSquareChatDelete(this);
  }

  @Override
  public void clear() {
    this.squareChatMid = null;
    this.squareChatName = null;
    this.profileImageObsHash = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSquareChatMid() {
    return this.squareChatMid;
  }

  public SquareEventNotificationSquareChatDelete setSquareChatMid(@org.apache.thrift.annotation.Nullable java.lang.String squareChatMid) {
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
  public java.lang.String getSquareChatName() {
    return this.squareChatName;
  }

  public SquareEventNotificationSquareChatDelete setSquareChatName(@org.apache.thrift.annotation.Nullable java.lang.String squareChatName) {
    this.squareChatName = squareChatName;
    return this;
  }

  public void unsetSquareChatName() {
    this.squareChatName = null;
  }

  /** Returns true if field squareChatName is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChatName() {
    return this.squareChatName != null;
  }

  public void setSquareChatNameIsSet(boolean value) {
    if (!value) {
      this.squareChatName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getProfileImageObsHash() {
    return this.profileImageObsHash;
  }

  public SquareEventNotificationSquareChatDelete setProfileImageObsHash(@org.apache.thrift.annotation.Nullable java.lang.String profileImageObsHash) {
    this.profileImageObsHash = profileImageObsHash;
    return this;
  }

  public void unsetProfileImageObsHash() {
    this.profileImageObsHash = null;
  }

  /** Returns true if field profileImageObsHash is set (has been assigned a value) and false otherwise */
  public boolean isSetProfileImageObsHash() {
    return this.profileImageObsHash != null;
  }

  public void setProfileImageObsHashIsSet(boolean value) {
    if (!value) {
      this.profileImageObsHash = null;
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

    case SQUARE_CHAT_NAME:
      if (value == null) {
        unsetSquareChatName();
      } else {
        setSquareChatName((java.lang.String)value);
      }
      break;

    case PROFILE_IMAGE_OBS_HASH:
      if (value == null) {
        unsetProfileImageObsHash();
      } else {
        setProfileImageObsHash((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_CHAT_MID:
      return getSquareChatMid();

    case SQUARE_CHAT_NAME:
      return getSquareChatName();

    case PROFILE_IMAGE_OBS_HASH:
      return getProfileImageObsHash();

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
    case SQUARE_CHAT_NAME:
      return isSetSquareChatName();
    case PROFILE_IMAGE_OBS_HASH:
      return isSetProfileImageObsHash();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof SquareEventNotificationSquareChatDelete)
      return this.equals((SquareEventNotificationSquareChatDelete)that);
    return false;
  }

  public boolean equals(SquareEventNotificationSquareChatDelete that) {
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

    boolean this_present_squareChatName = true && this.isSetSquareChatName();
    boolean that_present_squareChatName = true && that.isSetSquareChatName();
    if (this_present_squareChatName || that_present_squareChatName) {
      if (!(this_present_squareChatName && that_present_squareChatName))
        return false;
      if (!this.squareChatName.equals(that.squareChatName))
        return false;
    }

    boolean this_present_profileImageObsHash = true && this.isSetProfileImageObsHash();
    boolean that_present_profileImageObsHash = true && that.isSetProfileImageObsHash();
    if (this_present_profileImageObsHash || that_present_profileImageObsHash) {
      if (!(this_present_profileImageObsHash && that_present_profileImageObsHash))
        return false;
      if (!this.profileImageObsHash.equals(that.profileImageObsHash))
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

    hashCode = hashCode * 8191 + ((isSetSquareChatName()) ? 131071 : 524287);
    if (isSetSquareChatName())
      hashCode = hashCode * 8191 + squareChatName.hashCode();

    hashCode = hashCode * 8191 + ((isSetProfileImageObsHash()) ? 131071 : 524287);
    if (isSetProfileImageObsHash())
      hashCode = hashCode * 8191 + profileImageObsHash.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SquareEventNotificationSquareChatDelete other) {
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
    lastComparison = java.lang.Boolean.compare(isSetSquareChatName(), other.isSetSquareChatName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareChatName, other.squareChatName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetProfileImageObsHash(), other.isSetProfileImageObsHash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProfileImageObsHash()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.profileImageObsHash, other.profileImageObsHash);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SquareEventNotificationSquareChatDelete(");
    boolean first = true;

    sb.append("squareChatMid:");
    if (this.squareChatMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareChatName:");
    if (this.squareChatName == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("profileImageObsHash:");
    if (this.profileImageObsHash == null) {
      sb.append("null");
    } else {
      sb.append(this.profileImageObsHash);
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

  private static class SquareEventNotificationSquareChatDeleteStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareEventNotificationSquareChatDeleteStandardScheme getScheme() {
      return new SquareEventNotificationSquareChatDeleteStandardScheme();
    }
  }

  private static class SquareEventNotificationSquareChatDeleteStandardScheme extends org.apache.thrift.scheme.StandardScheme<SquareEventNotificationSquareChatDelete> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareEventNotificationSquareChatDelete struct) throws org.apache.thrift.TException {
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
          case 2: // SQUARE_CHAT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.squareChatName = iprot.readString();
              struct.setSquareChatNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PROFILE_IMAGE_OBS_HASH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.profileImageObsHash = iprot.readString();
              struct.setProfileImageObsHashIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareEventNotificationSquareChatDelete struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareChatMid != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
        oprot.writeString(struct.squareChatMid);
        oprot.writeFieldEnd();
      }
      if (struct.squareChatName != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_NAME_FIELD_DESC);
        oprot.writeString(struct.squareChatName);
        oprot.writeFieldEnd();
      }
      if (struct.profileImageObsHash != null) {
        oprot.writeFieldBegin(PROFILE_IMAGE_OBS_HASH_FIELD_DESC);
        oprot.writeString(struct.profileImageObsHash);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareEventNotificationSquareChatDeleteTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareEventNotificationSquareChatDeleteTupleScheme getScheme() {
      return new SquareEventNotificationSquareChatDeleteTupleScheme();
    }
  }

  private static class SquareEventNotificationSquareChatDeleteTupleScheme extends org.apache.thrift.scheme.TupleScheme<SquareEventNotificationSquareChatDelete> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareEventNotificationSquareChatDelete struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSquareChatMid()) {
        optionals.set(0);
      }
      if (struct.isSetSquareChatName()) {
        optionals.set(1);
      }
      if (struct.isSetProfileImageObsHash()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSquareChatMid()) {
        oprot.writeString(struct.squareChatMid);
      }
      if (struct.isSetSquareChatName()) {
        oprot.writeString(struct.squareChatName);
      }
      if (struct.isSetProfileImageObsHash()) {
        oprot.writeString(struct.profileImageObsHash);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareEventNotificationSquareChatDelete struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.squareChatMid = iprot.readString();
        struct.setSquareChatMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.squareChatName = iprot.readString();
        struct.setSquareChatNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.profileImageObsHash = iprot.readString();
        struct.setProfileImageObsHashIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

