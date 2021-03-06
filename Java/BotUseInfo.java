/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class BotUseInfo implements org.apache.thrift.TBase<BotUseInfo, BotUseInfo._Fields>, java.io.Serializable, Cloneable, Comparable<BotUseInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BotUseInfo");

  private static final org.apache.thrift.protocol.TField BOT_USE_AGREEMENT_ACCEPTED_FIELD_DESC = new org.apache.thrift.protocol.TField("botUseAgreementAccepted", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField BOT_IN_FRIENDS_FIELD_DESC = new org.apache.thrift.protocol.TField("botInFriends", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField PRIMARY_APPLICATION_FIELD_DESC = new org.apache.thrift.protocol.TField("primaryApplication", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField LOCALE_FIELD_DESC = new org.apache.thrift.protocol.TField("locale", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new BotUseInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new BotUseInfoTupleSchemeFactory();

  public boolean botUseAgreementAccepted; // required
  public boolean botInFriends; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String primaryApplication; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String locale; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BOT_USE_AGREEMENT_ACCEPTED((short)1, "botUseAgreementAccepted"),
    BOT_IN_FRIENDS((short)2, "botInFriends"),
    PRIMARY_APPLICATION((short)3, "primaryApplication"),
    LOCALE((short)4, "locale");

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
        case 1: // BOT_USE_AGREEMENT_ACCEPTED
          return BOT_USE_AGREEMENT_ACCEPTED;
        case 2: // BOT_IN_FRIENDS
          return BOT_IN_FRIENDS;
        case 3: // PRIMARY_APPLICATION
          return PRIMARY_APPLICATION;
        case 4: // LOCALE
          return LOCALE;
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
  private static final int __BOTUSEAGREEMENTACCEPTED_ISSET_ID = 0;
  private static final int __BOTINFRIENDS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BOT_USE_AGREEMENT_ACCEPTED, new org.apache.thrift.meta_data.FieldMetaData("botUseAgreementAccepted", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.BOT_IN_FRIENDS, new org.apache.thrift.meta_data.FieldMetaData("botInFriends", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.PRIMARY_APPLICATION, new org.apache.thrift.meta_data.FieldMetaData("primaryApplication", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOCALE, new org.apache.thrift.meta_data.FieldMetaData("locale", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BotUseInfo.class, metaDataMap);
  }

  public BotUseInfo() {
  }

  public BotUseInfo(
    boolean botUseAgreementAccepted,
    boolean botInFriends,
    java.lang.String primaryApplication,
    java.lang.String locale)
  {
    this();
    this.botUseAgreementAccepted = botUseAgreementAccepted;
    setBotUseAgreementAcceptedIsSet(true);
    this.botInFriends = botInFriends;
    setBotInFriendsIsSet(true);
    this.primaryApplication = primaryApplication;
    this.locale = locale;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BotUseInfo(BotUseInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.botUseAgreementAccepted = other.botUseAgreementAccepted;
    this.botInFriends = other.botInFriends;
    if (other.isSetPrimaryApplication()) {
      this.primaryApplication = other.primaryApplication;
    }
    if (other.isSetLocale()) {
      this.locale = other.locale;
    }
  }

  public BotUseInfo deepCopy() {
    return new BotUseInfo(this);
  }

  @Override
  public void clear() {
    setBotUseAgreementAcceptedIsSet(false);
    this.botUseAgreementAccepted = false;
    setBotInFriendsIsSet(false);
    this.botInFriends = false;
    this.primaryApplication = null;
    this.locale = null;
  }

  public boolean isBotUseAgreementAccepted() {
    return this.botUseAgreementAccepted;
  }

  public BotUseInfo setBotUseAgreementAccepted(boolean botUseAgreementAccepted) {
    this.botUseAgreementAccepted = botUseAgreementAccepted;
    setBotUseAgreementAcceptedIsSet(true);
    return this;
  }

  public void unsetBotUseAgreementAccepted() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BOTUSEAGREEMENTACCEPTED_ISSET_ID);
  }

  /** Returns true if field botUseAgreementAccepted is set (has been assigned a value) and false otherwise */
  public boolean isSetBotUseAgreementAccepted() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BOTUSEAGREEMENTACCEPTED_ISSET_ID);
  }

  public void setBotUseAgreementAcceptedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BOTUSEAGREEMENTACCEPTED_ISSET_ID, value);
  }

  public boolean isBotInFriends() {
    return this.botInFriends;
  }

  public BotUseInfo setBotInFriends(boolean botInFriends) {
    this.botInFriends = botInFriends;
    setBotInFriendsIsSet(true);
    return this;
  }

  public void unsetBotInFriends() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BOTINFRIENDS_ISSET_ID);
  }

  /** Returns true if field botInFriends is set (has been assigned a value) and false otherwise */
  public boolean isSetBotInFriends() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BOTINFRIENDS_ISSET_ID);
  }

  public void setBotInFriendsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BOTINFRIENDS_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPrimaryApplication() {
    return this.primaryApplication;
  }

  public BotUseInfo setPrimaryApplication(@org.apache.thrift.annotation.Nullable java.lang.String primaryApplication) {
    this.primaryApplication = primaryApplication;
    return this;
  }

  public void unsetPrimaryApplication() {
    this.primaryApplication = null;
  }

  /** Returns true if field primaryApplication is set (has been assigned a value) and false otherwise */
  public boolean isSetPrimaryApplication() {
    return this.primaryApplication != null;
  }

  public void setPrimaryApplicationIsSet(boolean value) {
    if (!value) {
      this.primaryApplication = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getLocale() {
    return this.locale;
  }

  public BotUseInfo setLocale(@org.apache.thrift.annotation.Nullable java.lang.String locale) {
    this.locale = locale;
    return this;
  }

  public void unsetLocale() {
    this.locale = null;
  }

  /** Returns true if field locale is set (has been assigned a value) and false otherwise */
  public boolean isSetLocale() {
    return this.locale != null;
  }

  public void setLocaleIsSet(boolean value) {
    if (!value) {
      this.locale = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case BOT_USE_AGREEMENT_ACCEPTED:
      if (value == null) {
        unsetBotUseAgreementAccepted();
      } else {
        setBotUseAgreementAccepted((java.lang.Boolean)value);
      }
      break;

    case BOT_IN_FRIENDS:
      if (value == null) {
        unsetBotInFriends();
      } else {
        setBotInFriends((java.lang.Boolean)value);
      }
      break;

    case PRIMARY_APPLICATION:
      if (value == null) {
        unsetPrimaryApplication();
      } else {
        setPrimaryApplication((java.lang.String)value);
      }
      break;

    case LOCALE:
      if (value == null) {
        unsetLocale();
      } else {
        setLocale((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case BOT_USE_AGREEMENT_ACCEPTED:
      return isBotUseAgreementAccepted();

    case BOT_IN_FRIENDS:
      return isBotInFriends();

    case PRIMARY_APPLICATION:
      return getPrimaryApplication();

    case LOCALE:
      return getLocale();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case BOT_USE_AGREEMENT_ACCEPTED:
      return isSetBotUseAgreementAccepted();
    case BOT_IN_FRIENDS:
      return isSetBotInFriends();
    case PRIMARY_APPLICATION:
      return isSetPrimaryApplication();
    case LOCALE:
      return isSetLocale();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof BotUseInfo)
      return this.equals((BotUseInfo)that);
    return false;
  }

  public boolean equals(BotUseInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_botUseAgreementAccepted = true;
    boolean that_present_botUseAgreementAccepted = true;
    if (this_present_botUseAgreementAccepted || that_present_botUseAgreementAccepted) {
      if (!(this_present_botUseAgreementAccepted && that_present_botUseAgreementAccepted))
        return false;
      if (this.botUseAgreementAccepted != that.botUseAgreementAccepted)
        return false;
    }

    boolean this_present_botInFriends = true;
    boolean that_present_botInFriends = true;
    if (this_present_botInFriends || that_present_botInFriends) {
      if (!(this_present_botInFriends && that_present_botInFriends))
        return false;
      if (this.botInFriends != that.botInFriends)
        return false;
    }

    boolean this_present_primaryApplication = true && this.isSetPrimaryApplication();
    boolean that_present_primaryApplication = true && that.isSetPrimaryApplication();
    if (this_present_primaryApplication || that_present_primaryApplication) {
      if (!(this_present_primaryApplication && that_present_primaryApplication))
        return false;
      if (!this.primaryApplication.equals(that.primaryApplication))
        return false;
    }

    boolean this_present_locale = true && this.isSetLocale();
    boolean that_present_locale = true && that.isSetLocale();
    if (this_present_locale || that_present_locale) {
      if (!(this_present_locale && that_present_locale))
        return false;
      if (!this.locale.equals(that.locale))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((botUseAgreementAccepted) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((botInFriends) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetPrimaryApplication()) ? 131071 : 524287);
    if (isSetPrimaryApplication())
      hashCode = hashCode * 8191 + primaryApplication.hashCode();

    hashCode = hashCode * 8191 + ((isSetLocale()) ? 131071 : 524287);
    if (isSetLocale())
      hashCode = hashCode * 8191 + locale.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(BotUseInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetBotUseAgreementAccepted(), other.isSetBotUseAgreementAccepted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBotUseAgreementAccepted()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.botUseAgreementAccepted, other.botUseAgreementAccepted);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBotInFriends(), other.isSetBotInFriends());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBotInFriends()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.botInFriends, other.botInFriends);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPrimaryApplication(), other.isSetPrimaryApplication());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrimaryApplication()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.primaryApplication, other.primaryApplication);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetLocale(), other.isSetLocale());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocale()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.locale, other.locale);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("BotUseInfo(");
    boolean first = true;

    sb.append("botUseAgreementAccepted:");
    sb.append(this.botUseAgreementAccepted);
    first = false;
    if (!first) sb.append(", ");
    sb.append("botInFriends:");
    sb.append(this.botInFriends);
    first = false;
    if (!first) sb.append(", ");
    sb.append("primaryApplication:");
    if (this.primaryApplication == null) {
      sb.append("null");
    } else {
      sb.append(this.primaryApplication);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("locale:");
    if (this.locale == null) {
      sb.append("null");
    } else {
      sb.append(this.locale);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BotUseInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BotUseInfoStandardScheme getScheme() {
      return new BotUseInfoStandardScheme();
    }
  }

  private static class BotUseInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<BotUseInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BotUseInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BOT_USE_AGREEMENT_ACCEPTED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.botUseAgreementAccepted = iprot.readBool();
              struct.setBotUseAgreementAcceptedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BOT_IN_FRIENDS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.botInFriends = iprot.readBool();
              struct.setBotInFriendsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRIMARY_APPLICATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.primaryApplication = iprot.readString();
              struct.setPrimaryApplicationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LOCALE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.locale = iprot.readString();
              struct.setLocaleIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BotUseInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(BOT_USE_AGREEMENT_ACCEPTED_FIELD_DESC);
      oprot.writeBool(struct.botUseAgreementAccepted);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BOT_IN_FRIENDS_FIELD_DESC);
      oprot.writeBool(struct.botInFriends);
      oprot.writeFieldEnd();
      if (struct.primaryApplication != null) {
        oprot.writeFieldBegin(PRIMARY_APPLICATION_FIELD_DESC);
        oprot.writeString(struct.primaryApplication);
        oprot.writeFieldEnd();
      }
      if (struct.locale != null) {
        oprot.writeFieldBegin(LOCALE_FIELD_DESC);
        oprot.writeString(struct.locale);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BotUseInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BotUseInfoTupleScheme getScheme() {
      return new BotUseInfoTupleScheme();
    }
  }

  private static class BotUseInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<BotUseInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BotUseInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetBotUseAgreementAccepted()) {
        optionals.set(0);
      }
      if (struct.isSetBotInFriends()) {
        optionals.set(1);
      }
      if (struct.isSetPrimaryApplication()) {
        optionals.set(2);
      }
      if (struct.isSetLocale()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetBotUseAgreementAccepted()) {
        oprot.writeBool(struct.botUseAgreementAccepted);
      }
      if (struct.isSetBotInFriends()) {
        oprot.writeBool(struct.botInFriends);
      }
      if (struct.isSetPrimaryApplication()) {
        oprot.writeString(struct.primaryApplication);
      }
      if (struct.isSetLocale()) {
        oprot.writeString(struct.locale);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BotUseInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.botUseAgreementAccepted = iprot.readBool();
        struct.setBotUseAgreementAcceptedIsSet(true);
      }
      if (incoming.get(1)) {
        struct.botInFriends = iprot.readBool();
        struct.setBotInFriendsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.primaryApplication = iprot.readString();
        struct.setPrimaryApplicationIsSet(true);
      }
      if (incoming.get(3)) {
        struct.locale = iprot.readString();
        struct.setLocaleIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

