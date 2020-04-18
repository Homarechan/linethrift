/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2020-04-18")
public class ChannelToken implements org.apache.thrift.TBase<ChannelToken, ChannelToken._Fields>, java.io.Serializable, Cloneable, Comparable<ChannelToken> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ChannelToken");

  private static final org.apache.thrift.protocol.TField TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("token", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField OBS_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("obsToken", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EXPIRATION_FIELD_DESC = new org.apache.thrift.protocol.TField("expiration", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField REFRESH_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("refreshToken", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CHANNEL_ACCESS_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("channelAccessToken", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ChannelTokenStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ChannelTokenTupleSchemeFactory();

  public java.lang.String token; // required
  public java.lang.String obsToken; // required
  public long expiration; // required
  public java.lang.String refreshToken; // required
  public java.lang.String channelAccessToken; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOKEN((short)1, "token"),
    OBS_TOKEN((short)2, "obsToken"),
    EXPIRATION((short)3, "expiration"),
    REFRESH_TOKEN((short)4, "refreshToken"),
    CHANNEL_ACCESS_TOKEN((short)5, "channelAccessToken");

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
        case 1: // TOKEN
          return TOKEN;
        case 2: // OBS_TOKEN
          return OBS_TOKEN;
        case 3: // EXPIRATION
          return EXPIRATION;
        case 4: // REFRESH_TOKEN
          return REFRESH_TOKEN;
        case 5: // CHANNEL_ACCESS_TOKEN
          return CHANNEL_ACCESS_TOKEN;
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
  private static final int __EXPIRATION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOKEN, new org.apache.thrift.meta_data.FieldMetaData("token", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OBS_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("obsToken", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXPIRATION, new org.apache.thrift.meta_data.FieldMetaData("expiration", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.REFRESH_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("refreshToken", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CHANNEL_ACCESS_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("channelAccessToken", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ChannelToken.class, metaDataMap);
  }

  public ChannelToken() {
  }

  public ChannelToken(
    java.lang.String token,
    java.lang.String obsToken,
    long expiration,
    java.lang.String refreshToken,
    java.lang.String channelAccessToken)
  {
    this();
    this.token = token;
    this.obsToken = obsToken;
    this.expiration = expiration;
    setExpirationIsSet(true);
    this.refreshToken = refreshToken;
    this.channelAccessToken = channelAccessToken;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ChannelToken(ChannelToken other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetToken()) {
      this.token = other.token;
    }
    if (other.isSetObsToken()) {
      this.obsToken = other.obsToken;
    }
    this.expiration = other.expiration;
    if (other.isSetRefreshToken()) {
      this.refreshToken = other.refreshToken;
    }
    if (other.isSetChannelAccessToken()) {
      this.channelAccessToken = other.channelAccessToken;
    }
  }

  public ChannelToken deepCopy() {
    return new ChannelToken(this);
  }

  @Override
  public void clear() {
    this.token = null;
    this.obsToken = null;
    setExpirationIsSet(false);
    this.expiration = 0;
    this.refreshToken = null;
    this.channelAccessToken = null;
  }

  public java.lang.String getToken() {
    return this.token;
  }

  public ChannelToken setToken(java.lang.String token) {
    this.token = token;
    return this;
  }

  public void unsetToken() {
    this.token = null;
  }

  /** Returns true if field token is set (has been assigned a value) and false otherwise */
  public boolean isSetToken() {
    return this.token != null;
  }

  public void setTokenIsSet(boolean value) {
    if (!value) {
      this.token = null;
    }
  }

  public java.lang.String getObsToken() {
    return this.obsToken;
  }

  public ChannelToken setObsToken(java.lang.String obsToken) {
    this.obsToken = obsToken;
    return this;
  }

  public void unsetObsToken() {
    this.obsToken = null;
  }

  /** Returns true if field obsToken is set (has been assigned a value) and false otherwise */
  public boolean isSetObsToken() {
    return this.obsToken != null;
  }

  public void setObsTokenIsSet(boolean value) {
    if (!value) {
      this.obsToken = null;
    }
  }

  public long getExpiration() {
    return this.expiration;
  }

  public ChannelToken setExpiration(long expiration) {
    this.expiration = expiration;
    setExpirationIsSet(true);
    return this;
  }

  public void unsetExpiration() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EXPIRATION_ISSET_ID);
  }

  /** Returns true if field expiration is set (has been assigned a value) and false otherwise */
  public boolean isSetExpiration() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EXPIRATION_ISSET_ID);
  }

  public void setExpirationIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EXPIRATION_ISSET_ID, value);
  }

  public java.lang.String getRefreshToken() {
    return this.refreshToken;
  }

  public ChannelToken setRefreshToken(java.lang.String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  public void unsetRefreshToken() {
    this.refreshToken = null;
  }

  /** Returns true if field refreshToken is set (has been assigned a value) and false otherwise */
  public boolean isSetRefreshToken() {
    return this.refreshToken != null;
  }

  public void setRefreshTokenIsSet(boolean value) {
    if (!value) {
      this.refreshToken = null;
    }
  }

  public java.lang.String getChannelAccessToken() {
    return this.channelAccessToken;
  }

  public ChannelToken setChannelAccessToken(java.lang.String channelAccessToken) {
    this.channelAccessToken = channelAccessToken;
    return this;
  }

  public void unsetChannelAccessToken() {
    this.channelAccessToken = null;
  }

  /** Returns true if field channelAccessToken is set (has been assigned a value) and false otherwise */
  public boolean isSetChannelAccessToken() {
    return this.channelAccessToken != null;
  }

  public void setChannelAccessTokenIsSet(boolean value) {
    if (!value) {
      this.channelAccessToken = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TOKEN:
      if (value == null) {
        unsetToken();
      } else {
        setToken((java.lang.String)value);
      }
      break;

    case OBS_TOKEN:
      if (value == null) {
        unsetObsToken();
      } else {
        setObsToken((java.lang.String)value);
      }
      break;

    case EXPIRATION:
      if (value == null) {
        unsetExpiration();
      } else {
        setExpiration((java.lang.Long)value);
      }
      break;

    case REFRESH_TOKEN:
      if (value == null) {
        unsetRefreshToken();
      } else {
        setRefreshToken((java.lang.String)value);
      }
      break;

    case CHANNEL_ACCESS_TOKEN:
      if (value == null) {
        unsetChannelAccessToken();
      } else {
        setChannelAccessToken((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TOKEN:
      return getToken();

    case OBS_TOKEN:
      return getObsToken();

    case EXPIRATION:
      return getExpiration();

    case REFRESH_TOKEN:
      return getRefreshToken();

    case CHANNEL_ACCESS_TOKEN:
      return getChannelAccessToken();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TOKEN:
      return isSetToken();
    case OBS_TOKEN:
      return isSetObsToken();
    case EXPIRATION:
      return isSetExpiration();
    case REFRESH_TOKEN:
      return isSetRefreshToken();
    case CHANNEL_ACCESS_TOKEN:
      return isSetChannelAccessToken();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ChannelToken)
      return this.equals((ChannelToken)that);
    return false;
  }

  public boolean equals(ChannelToken that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_token = true && this.isSetToken();
    boolean that_present_token = true && that.isSetToken();
    if (this_present_token || that_present_token) {
      if (!(this_present_token && that_present_token))
        return false;
      if (!this.token.equals(that.token))
        return false;
    }

    boolean this_present_obsToken = true && this.isSetObsToken();
    boolean that_present_obsToken = true && that.isSetObsToken();
    if (this_present_obsToken || that_present_obsToken) {
      if (!(this_present_obsToken && that_present_obsToken))
        return false;
      if (!this.obsToken.equals(that.obsToken))
        return false;
    }

    boolean this_present_expiration = true;
    boolean that_present_expiration = true;
    if (this_present_expiration || that_present_expiration) {
      if (!(this_present_expiration && that_present_expiration))
        return false;
      if (this.expiration != that.expiration)
        return false;
    }

    boolean this_present_refreshToken = true && this.isSetRefreshToken();
    boolean that_present_refreshToken = true && that.isSetRefreshToken();
    if (this_present_refreshToken || that_present_refreshToken) {
      if (!(this_present_refreshToken && that_present_refreshToken))
        return false;
      if (!this.refreshToken.equals(that.refreshToken))
        return false;
    }

    boolean this_present_channelAccessToken = true && this.isSetChannelAccessToken();
    boolean that_present_channelAccessToken = true && that.isSetChannelAccessToken();
    if (this_present_channelAccessToken || that_present_channelAccessToken) {
      if (!(this_present_channelAccessToken && that_present_channelAccessToken))
        return false;
      if (!this.channelAccessToken.equals(that.channelAccessToken))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetToken()) ? 131071 : 524287);
    if (isSetToken())
      hashCode = hashCode * 8191 + token.hashCode();

    hashCode = hashCode * 8191 + ((isSetObsToken()) ? 131071 : 524287);
    if (isSetObsToken())
      hashCode = hashCode * 8191 + obsToken.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(expiration);

    hashCode = hashCode * 8191 + ((isSetRefreshToken()) ? 131071 : 524287);
    if (isSetRefreshToken())
      hashCode = hashCode * 8191 + refreshToken.hashCode();

    hashCode = hashCode * 8191 + ((isSetChannelAccessToken()) ? 131071 : 524287);
    if (isSetChannelAccessToken())
      hashCode = hashCode * 8191 + channelAccessToken.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ChannelToken other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetToken()).compareTo(other.isSetToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.token, other.token);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetObsToken()).compareTo(other.isSetObsToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObsToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.obsToken, other.obsToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetExpiration()).compareTo(other.isSetExpiration());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpiration()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expiration, other.expiration);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRefreshToken()).compareTo(other.isSetRefreshToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRefreshToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.refreshToken, other.refreshToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetChannelAccessToken()).compareTo(other.isSetChannelAccessToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChannelAccessToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.channelAccessToken, other.channelAccessToken);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ChannelToken(");
    boolean first = true;

    sb.append("token:");
    if (this.token == null) {
      sb.append("null");
    } else {
      sb.append(this.token);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("obsToken:");
    if (this.obsToken == null) {
      sb.append("null");
    } else {
      sb.append(this.obsToken);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("expiration:");
    sb.append(this.expiration);
    first = false;
    if (!first) sb.append(", ");
    sb.append("refreshToken:");
    if (this.refreshToken == null) {
      sb.append("null");
    } else {
      sb.append(this.refreshToken);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("channelAccessToken:");
    if (this.channelAccessToken == null) {
      sb.append("null");
    } else {
      sb.append(this.channelAccessToken);
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

  private static class ChannelTokenStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ChannelTokenStandardScheme getScheme() {
      return new ChannelTokenStandardScheme();
    }
  }

  private static class ChannelTokenStandardScheme extends org.apache.thrift.scheme.StandardScheme<ChannelToken> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ChannelToken struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.token = iprot.readString();
              struct.setTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OBS_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.obsToken = iprot.readString();
              struct.setObsTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXPIRATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.expiration = iprot.readI64();
              struct.setExpirationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // REFRESH_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.refreshToken = iprot.readString();
              struct.setRefreshTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CHANNEL_ACCESS_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.channelAccessToken = iprot.readString();
              struct.setChannelAccessTokenIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ChannelToken struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.token != null) {
        oprot.writeFieldBegin(TOKEN_FIELD_DESC);
        oprot.writeString(struct.token);
        oprot.writeFieldEnd();
      }
      if (struct.obsToken != null) {
        oprot.writeFieldBegin(OBS_TOKEN_FIELD_DESC);
        oprot.writeString(struct.obsToken);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(EXPIRATION_FIELD_DESC);
      oprot.writeI64(struct.expiration);
      oprot.writeFieldEnd();
      if (struct.refreshToken != null) {
        oprot.writeFieldBegin(REFRESH_TOKEN_FIELD_DESC);
        oprot.writeString(struct.refreshToken);
        oprot.writeFieldEnd();
      }
      if (struct.channelAccessToken != null) {
        oprot.writeFieldBegin(CHANNEL_ACCESS_TOKEN_FIELD_DESC);
        oprot.writeString(struct.channelAccessToken);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ChannelTokenTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ChannelTokenTupleScheme getScheme() {
      return new ChannelTokenTupleScheme();
    }
  }

  private static class ChannelTokenTupleScheme extends org.apache.thrift.scheme.TupleScheme<ChannelToken> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ChannelToken struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetToken()) {
        optionals.set(0);
      }
      if (struct.isSetObsToken()) {
        optionals.set(1);
      }
      if (struct.isSetExpiration()) {
        optionals.set(2);
      }
      if (struct.isSetRefreshToken()) {
        optionals.set(3);
      }
      if (struct.isSetChannelAccessToken()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetToken()) {
        oprot.writeString(struct.token);
      }
      if (struct.isSetObsToken()) {
        oprot.writeString(struct.obsToken);
      }
      if (struct.isSetExpiration()) {
        oprot.writeI64(struct.expiration);
      }
      if (struct.isSetRefreshToken()) {
        oprot.writeString(struct.refreshToken);
      }
      if (struct.isSetChannelAccessToken()) {
        oprot.writeString(struct.channelAccessToken);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ChannelToken struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.token = iprot.readString();
        struct.setTokenIsSet(true);
      }
      if (incoming.get(1)) {
        struct.obsToken = iprot.readString();
        struct.setObsTokenIsSet(true);
      }
      if (incoming.get(2)) {
        struct.expiration = iprot.readI64();
        struct.setExpirationIsSet(true);
      }
      if (incoming.get(3)) {
        struct.refreshToken = iprot.readString();
        struct.setRefreshTokenIsSet(true);
      }
      if (incoming.get(4)) {
        struct.channelAccessToken = iprot.readString();
        struct.setChannelAccessTokenIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

