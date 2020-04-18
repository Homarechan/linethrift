/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2020-04-18")
public class PhoneInfoForChannel implements org.apache.thrift.TBase<PhoneInfoForChannel, PhoneInfoForChannel._Fields>, java.io.Serializable, Cloneable, Comparable<PhoneInfoForChannel> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PhoneInfoForChannel");

  private static final org.apache.thrift.protocol.TField MID_FIELD_DESC = new org.apache.thrift.protocol.TField("mid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NORMALIZED_PHONE_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("normalizedPhoneNumber", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ALLOWED_TO_SEARCH_BY_PHONE_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("allowedToSearchByPhoneNumber", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField ALLOWED_TO_RECEIVE_MESSAGE_FROM_NON_FRIEND_FIELD_DESC = new org.apache.thrift.protocol.TField("allowedToReceiveMessageFromNonFriend", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField REGION_FIELD_DESC = new org.apache.thrift.protocol.TField("region", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PhoneInfoForChannelStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PhoneInfoForChannelTupleSchemeFactory();

  public java.lang.String mid; // required
  public java.lang.String normalizedPhoneNumber; // required
  public boolean allowedToSearchByPhoneNumber; // required
  public boolean allowedToReceiveMessageFromNonFriend; // required
  public java.lang.String region; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MID((short)1, "mid"),
    NORMALIZED_PHONE_NUMBER((short)2, "normalizedPhoneNumber"),
    ALLOWED_TO_SEARCH_BY_PHONE_NUMBER((short)3, "allowedToSearchByPhoneNumber"),
    ALLOWED_TO_RECEIVE_MESSAGE_FROM_NON_FRIEND((short)4, "allowedToReceiveMessageFromNonFriend"),
    REGION((short)5, "region");

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
        case 1: // MID
          return MID;
        case 2: // NORMALIZED_PHONE_NUMBER
          return NORMALIZED_PHONE_NUMBER;
        case 3: // ALLOWED_TO_SEARCH_BY_PHONE_NUMBER
          return ALLOWED_TO_SEARCH_BY_PHONE_NUMBER;
        case 4: // ALLOWED_TO_RECEIVE_MESSAGE_FROM_NON_FRIEND
          return ALLOWED_TO_RECEIVE_MESSAGE_FROM_NON_FRIEND;
        case 5: // REGION
          return REGION;
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
  private static final int __ALLOWEDTOSEARCHBYPHONENUMBER_ISSET_ID = 0;
  private static final int __ALLOWEDTORECEIVEMESSAGEFROMNONFRIEND_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MID, new org.apache.thrift.meta_data.FieldMetaData("mid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NORMALIZED_PHONE_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("normalizedPhoneNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ALLOWED_TO_SEARCH_BY_PHONE_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("allowedToSearchByPhoneNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ALLOWED_TO_RECEIVE_MESSAGE_FROM_NON_FRIEND, new org.apache.thrift.meta_data.FieldMetaData("allowedToReceiveMessageFromNonFriend", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.REGION, new org.apache.thrift.meta_data.FieldMetaData("region", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PhoneInfoForChannel.class, metaDataMap);
  }

  public PhoneInfoForChannel() {
  }

  public PhoneInfoForChannel(
    java.lang.String mid,
    java.lang.String normalizedPhoneNumber,
    boolean allowedToSearchByPhoneNumber,
    boolean allowedToReceiveMessageFromNonFriend,
    java.lang.String region)
  {
    this();
    this.mid = mid;
    this.normalizedPhoneNumber = normalizedPhoneNumber;
    this.allowedToSearchByPhoneNumber = allowedToSearchByPhoneNumber;
    setAllowedToSearchByPhoneNumberIsSet(true);
    this.allowedToReceiveMessageFromNonFriend = allowedToReceiveMessageFromNonFriend;
    setAllowedToReceiveMessageFromNonFriendIsSet(true);
    this.region = region;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PhoneInfoForChannel(PhoneInfoForChannel other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMid()) {
      this.mid = other.mid;
    }
    if (other.isSetNormalizedPhoneNumber()) {
      this.normalizedPhoneNumber = other.normalizedPhoneNumber;
    }
    this.allowedToSearchByPhoneNumber = other.allowedToSearchByPhoneNumber;
    this.allowedToReceiveMessageFromNonFriend = other.allowedToReceiveMessageFromNonFriend;
    if (other.isSetRegion()) {
      this.region = other.region;
    }
  }

  public PhoneInfoForChannel deepCopy() {
    return new PhoneInfoForChannel(this);
  }

  @Override
  public void clear() {
    this.mid = null;
    this.normalizedPhoneNumber = null;
    setAllowedToSearchByPhoneNumberIsSet(false);
    this.allowedToSearchByPhoneNumber = false;
    setAllowedToReceiveMessageFromNonFriendIsSet(false);
    this.allowedToReceiveMessageFromNonFriend = false;
    this.region = null;
  }

  public java.lang.String getMid() {
    return this.mid;
  }

  public PhoneInfoForChannel setMid(java.lang.String mid) {
    this.mid = mid;
    return this;
  }

  public void unsetMid() {
    this.mid = null;
  }

  /** Returns true if field mid is set (has been assigned a value) and false otherwise */
  public boolean isSetMid() {
    return this.mid != null;
  }

  public void setMidIsSet(boolean value) {
    if (!value) {
      this.mid = null;
    }
  }

  public java.lang.String getNormalizedPhoneNumber() {
    return this.normalizedPhoneNumber;
  }

  public PhoneInfoForChannel setNormalizedPhoneNumber(java.lang.String normalizedPhoneNumber) {
    this.normalizedPhoneNumber = normalizedPhoneNumber;
    return this;
  }

  public void unsetNormalizedPhoneNumber() {
    this.normalizedPhoneNumber = null;
  }

  /** Returns true if field normalizedPhoneNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetNormalizedPhoneNumber() {
    return this.normalizedPhoneNumber != null;
  }

  public void setNormalizedPhoneNumberIsSet(boolean value) {
    if (!value) {
      this.normalizedPhoneNumber = null;
    }
  }

  public boolean isAllowedToSearchByPhoneNumber() {
    return this.allowedToSearchByPhoneNumber;
  }

  public PhoneInfoForChannel setAllowedToSearchByPhoneNumber(boolean allowedToSearchByPhoneNumber) {
    this.allowedToSearchByPhoneNumber = allowedToSearchByPhoneNumber;
    setAllowedToSearchByPhoneNumberIsSet(true);
    return this;
  }

  public void unsetAllowedToSearchByPhoneNumber() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ALLOWEDTOSEARCHBYPHONENUMBER_ISSET_ID);
  }

  /** Returns true if field allowedToSearchByPhoneNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetAllowedToSearchByPhoneNumber() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ALLOWEDTOSEARCHBYPHONENUMBER_ISSET_ID);
  }

  public void setAllowedToSearchByPhoneNumberIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ALLOWEDTOSEARCHBYPHONENUMBER_ISSET_ID, value);
  }

  public boolean isAllowedToReceiveMessageFromNonFriend() {
    return this.allowedToReceiveMessageFromNonFriend;
  }

  public PhoneInfoForChannel setAllowedToReceiveMessageFromNonFriend(boolean allowedToReceiveMessageFromNonFriend) {
    this.allowedToReceiveMessageFromNonFriend = allowedToReceiveMessageFromNonFriend;
    setAllowedToReceiveMessageFromNonFriendIsSet(true);
    return this;
  }

  public void unsetAllowedToReceiveMessageFromNonFriend() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ALLOWEDTORECEIVEMESSAGEFROMNONFRIEND_ISSET_ID);
  }

  /** Returns true if field allowedToReceiveMessageFromNonFriend is set (has been assigned a value) and false otherwise */
  public boolean isSetAllowedToReceiveMessageFromNonFriend() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ALLOWEDTORECEIVEMESSAGEFROMNONFRIEND_ISSET_ID);
  }

  public void setAllowedToReceiveMessageFromNonFriendIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ALLOWEDTORECEIVEMESSAGEFROMNONFRIEND_ISSET_ID, value);
  }

  public java.lang.String getRegion() {
    return this.region;
  }

  public PhoneInfoForChannel setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  public void unsetRegion() {
    this.region = null;
  }

  /** Returns true if field region is set (has been assigned a value) and false otherwise */
  public boolean isSetRegion() {
    return this.region != null;
  }

  public void setRegionIsSet(boolean value) {
    if (!value) {
      this.region = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case MID:
      if (value == null) {
        unsetMid();
      } else {
        setMid((java.lang.String)value);
      }
      break;

    case NORMALIZED_PHONE_NUMBER:
      if (value == null) {
        unsetNormalizedPhoneNumber();
      } else {
        setNormalizedPhoneNumber((java.lang.String)value);
      }
      break;

    case ALLOWED_TO_SEARCH_BY_PHONE_NUMBER:
      if (value == null) {
        unsetAllowedToSearchByPhoneNumber();
      } else {
        setAllowedToSearchByPhoneNumber((java.lang.Boolean)value);
      }
      break;

    case ALLOWED_TO_RECEIVE_MESSAGE_FROM_NON_FRIEND:
      if (value == null) {
        unsetAllowedToReceiveMessageFromNonFriend();
      } else {
        setAllowedToReceiveMessageFromNonFriend((java.lang.Boolean)value);
      }
      break;

    case REGION:
      if (value == null) {
        unsetRegion();
      } else {
        setRegion((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MID:
      return getMid();

    case NORMALIZED_PHONE_NUMBER:
      return getNormalizedPhoneNumber();

    case ALLOWED_TO_SEARCH_BY_PHONE_NUMBER:
      return isAllowedToSearchByPhoneNumber();

    case ALLOWED_TO_RECEIVE_MESSAGE_FROM_NON_FRIEND:
      return isAllowedToReceiveMessageFromNonFriend();

    case REGION:
      return getRegion();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case MID:
      return isSetMid();
    case NORMALIZED_PHONE_NUMBER:
      return isSetNormalizedPhoneNumber();
    case ALLOWED_TO_SEARCH_BY_PHONE_NUMBER:
      return isSetAllowedToSearchByPhoneNumber();
    case ALLOWED_TO_RECEIVE_MESSAGE_FROM_NON_FRIEND:
      return isSetAllowedToReceiveMessageFromNonFriend();
    case REGION:
      return isSetRegion();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof PhoneInfoForChannel)
      return this.equals((PhoneInfoForChannel)that);
    return false;
  }

  public boolean equals(PhoneInfoForChannel that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_mid = true && this.isSetMid();
    boolean that_present_mid = true && that.isSetMid();
    if (this_present_mid || that_present_mid) {
      if (!(this_present_mid && that_present_mid))
        return false;
      if (!this.mid.equals(that.mid))
        return false;
    }

    boolean this_present_normalizedPhoneNumber = true && this.isSetNormalizedPhoneNumber();
    boolean that_present_normalizedPhoneNumber = true && that.isSetNormalizedPhoneNumber();
    if (this_present_normalizedPhoneNumber || that_present_normalizedPhoneNumber) {
      if (!(this_present_normalizedPhoneNumber && that_present_normalizedPhoneNumber))
        return false;
      if (!this.normalizedPhoneNumber.equals(that.normalizedPhoneNumber))
        return false;
    }

    boolean this_present_allowedToSearchByPhoneNumber = true;
    boolean that_present_allowedToSearchByPhoneNumber = true;
    if (this_present_allowedToSearchByPhoneNumber || that_present_allowedToSearchByPhoneNumber) {
      if (!(this_present_allowedToSearchByPhoneNumber && that_present_allowedToSearchByPhoneNumber))
        return false;
      if (this.allowedToSearchByPhoneNumber != that.allowedToSearchByPhoneNumber)
        return false;
    }

    boolean this_present_allowedToReceiveMessageFromNonFriend = true;
    boolean that_present_allowedToReceiveMessageFromNonFriend = true;
    if (this_present_allowedToReceiveMessageFromNonFriend || that_present_allowedToReceiveMessageFromNonFriend) {
      if (!(this_present_allowedToReceiveMessageFromNonFriend && that_present_allowedToReceiveMessageFromNonFriend))
        return false;
      if (this.allowedToReceiveMessageFromNonFriend != that.allowedToReceiveMessageFromNonFriend)
        return false;
    }

    boolean this_present_region = true && this.isSetRegion();
    boolean that_present_region = true && that.isSetRegion();
    if (this_present_region || that_present_region) {
      if (!(this_present_region && that_present_region))
        return false;
      if (!this.region.equals(that.region))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMid()) ? 131071 : 524287);
    if (isSetMid())
      hashCode = hashCode * 8191 + mid.hashCode();

    hashCode = hashCode * 8191 + ((isSetNormalizedPhoneNumber()) ? 131071 : 524287);
    if (isSetNormalizedPhoneNumber())
      hashCode = hashCode * 8191 + normalizedPhoneNumber.hashCode();

    hashCode = hashCode * 8191 + ((allowedToSearchByPhoneNumber) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((allowedToReceiveMessageFromNonFriend) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetRegion()) ? 131071 : 524287);
    if (isSetRegion())
      hashCode = hashCode * 8191 + region.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(PhoneInfoForChannel other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetMid()).compareTo(other.isSetMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mid, other.mid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNormalizedPhoneNumber()).compareTo(other.isSetNormalizedPhoneNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNormalizedPhoneNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.normalizedPhoneNumber, other.normalizedPhoneNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAllowedToSearchByPhoneNumber()).compareTo(other.isSetAllowedToSearchByPhoneNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAllowedToSearchByPhoneNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.allowedToSearchByPhoneNumber, other.allowedToSearchByPhoneNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAllowedToReceiveMessageFromNonFriend()).compareTo(other.isSetAllowedToReceiveMessageFromNonFriend());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAllowedToReceiveMessageFromNonFriend()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.allowedToReceiveMessageFromNonFriend, other.allowedToReceiveMessageFromNonFriend);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRegion()).compareTo(other.isSetRegion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRegion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.region, other.region);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneInfoForChannel(");
    boolean first = true;

    sb.append("mid:");
    if (this.mid == null) {
      sb.append("null");
    } else {
      sb.append(this.mid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("normalizedPhoneNumber:");
    if (this.normalizedPhoneNumber == null) {
      sb.append("null");
    } else {
      sb.append(this.normalizedPhoneNumber);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("allowedToSearchByPhoneNumber:");
    sb.append(this.allowedToSearchByPhoneNumber);
    first = false;
    if (!first) sb.append(", ");
    sb.append("allowedToReceiveMessageFromNonFriend:");
    sb.append(this.allowedToReceiveMessageFromNonFriend);
    first = false;
    if (!first) sb.append(", ");
    sb.append("region:");
    if (this.region == null) {
      sb.append("null");
    } else {
      sb.append(this.region);
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

  private static class PhoneInfoForChannelStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PhoneInfoForChannelStandardScheme getScheme() {
      return new PhoneInfoForChannelStandardScheme();
    }
  }

  private static class PhoneInfoForChannelStandardScheme extends org.apache.thrift.scheme.StandardScheme<PhoneInfoForChannel> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PhoneInfoForChannel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mid = iprot.readString();
              struct.setMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NORMALIZED_PHONE_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.normalizedPhoneNumber = iprot.readString();
              struct.setNormalizedPhoneNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ALLOWED_TO_SEARCH_BY_PHONE_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.allowedToSearchByPhoneNumber = iprot.readBool();
              struct.setAllowedToSearchByPhoneNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ALLOWED_TO_RECEIVE_MESSAGE_FROM_NON_FRIEND
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.allowedToReceiveMessageFromNonFriend = iprot.readBool();
              struct.setAllowedToReceiveMessageFromNonFriendIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // REGION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.region = iprot.readString();
              struct.setRegionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PhoneInfoForChannel struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mid != null) {
        oprot.writeFieldBegin(MID_FIELD_DESC);
        oprot.writeString(struct.mid);
        oprot.writeFieldEnd();
      }
      if (struct.normalizedPhoneNumber != null) {
        oprot.writeFieldBegin(NORMALIZED_PHONE_NUMBER_FIELD_DESC);
        oprot.writeString(struct.normalizedPhoneNumber);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ALLOWED_TO_SEARCH_BY_PHONE_NUMBER_FIELD_DESC);
      oprot.writeBool(struct.allowedToSearchByPhoneNumber);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ALLOWED_TO_RECEIVE_MESSAGE_FROM_NON_FRIEND_FIELD_DESC);
      oprot.writeBool(struct.allowedToReceiveMessageFromNonFriend);
      oprot.writeFieldEnd();
      if (struct.region != null) {
        oprot.writeFieldBegin(REGION_FIELD_DESC);
        oprot.writeString(struct.region);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PhoneInfoForChannelTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PhoneInfoForChannelTupleScheme getScheme() {
      return new PhoneInfoForChannelTupleScheme();
    }
  }

  private static class PhoneInfoForChannelTupleScheme extends org.apache.thrift.scheme.TupleScheme<PhoneInfoForChannel> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PhoneInfoForChannel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMid()) {
        optionals.set(0);
      }
      if (struct.isSetNormalizedPhoneNumber()) {
        optionals.set(1);
      }
      if (struct.isSetAllowedToSearchByPhoneNumber()) {
        optionals.set(2);
      }
      if (struct.isSetAllowedToReceiveMessageFromNonFriend()) {
        optionals.set(3);
      }
      if (struct.isSetRegion()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetMid()) {
        oprot.writeString(struct.mid);
      }
      if (struct.isSetNormalizedPhoneNumber()) {
        oprot.writeString(struct.normalizedPhoneNumber);
      }
      if (struct.isSetAllowedToSearchByPhoneNumber()) {
        oprot.writeBool(struct.allowedToSearchByPhoneNumber);
      }
      if (struct.isSetAllowedToReceiveMessageFromNonFriend()) {
        oprot.writeBool(struct.allowedToReceiveMessageFromNonFriend);
      }
      if (struct.isSetRegion()) {
        oprot.writeString(struct.region);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PhoneInfoForChannel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.mid = iprot.readString();
        struct.setMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.normalizedPhoneNumber = iprot.readString();
        struct.setNormalizedPhoneNumberIsSet(true);
      }
      if (incoming.get(2)) {
        struct.allowedToSearchByPhoneNumber = iprot.readBool();
        struct.setAllowedToSearchByPhoneNumberIsSet(true);
      }
      if (incoming.get(3)) {
        struct.allowedToReceiveMessageFromNonFriend = iprot.readBool();
        struct.setAllowedToReceiveMessageFromNonFriendIsSet(true);
      }
      if (incoming.get(4)) {
        struct.region = iprot.readString();
        struct.setRegionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

