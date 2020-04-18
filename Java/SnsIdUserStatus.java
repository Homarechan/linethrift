/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2020-04-18")
public class SnsIdUserStatus implements org.apache.thrift.TBase<SnsIdUserStatus, SnsIdUserStatus._Fields>, java.io.Serializable, Cloneable, Comparable<SnsIdUserStatus> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SnsIdUserStatus");

  private static final org.apache.thrift.protocol.TField USER_EXISTING_FIELD_DESC = new org.apache.thrift.protocol.TField("userExisting", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField PHONE_NUMBER_REGISTERED_FIELD_DESC = new org.apache.thrift.protocol.TField("phoneNumberRegistered", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField SAME_DEVICE_FIELD_DESC = new org.apache.thrift.protocol.TField("sameDevice", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SnsIdUserStatusStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SnsIdUserStatusTupleSchemeFactory();

  public boolean userExisting; // required
  public boolean phoneNumberRegistered; // required
  public boolean sameDevice; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_EXISTING((short)1, "userExisting"),
    PHONE_NUMBER_REGISTERED((short)2, "phoneNumberRegistered"),
    SAME_DEVICE((short)3, "sameDevice");

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
        case 1: // USER_EXISTING
          return USER_EXISTING;
        case 2: // PHONE_NUMBER_REGISTERED
          return PHONE_NUMBER_REGISTERED;
        case 3: // SAME_DEVICE
          return SAME_DEVICE;
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
  private static final int __USEREXISTING_ISSET_ID = 0;
  private static final int __PHONENUMBERREGISTERED_ISSET_ID = 1;
  private static final int __SAMEDEVICE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_EXISTING, new org.apache.thrift.meta_data.FieldMetaData("userExisting", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.PHONE_NUMBER_REGISTERED, new org.apache.thrift.meta_data.FieldMetaData("phoneNumberRegistered", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SAME_DEVICE, new org.apache.thrift.meta_data.FieldMetaData("sameDevice", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SnsIdUserStatus.class, metaDataMap);
  }

  public SnsIdUserStatus() {
  }

  public SnsIdUserStatus(
    boolean userExisting,
    boolean phoneNumberRegistered,
    boolean sameDevice)
  {
    this();
    this.userExisting = userExisting;
    setUserExistingIsSet(true);
    this.phoneNumberRegistered = phoneNumberRegistered;
    setPhoneNumberRegisteredIsSet(true);
    this.sameDevice = sameDevice;
    setSameDeviceIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SnsIdUserStatus(SnsIdUserStatus other) {
    __isset_bitfield = other.__isset_bitfield;
    this.userExisting = other.userExisting;
    this.phoneNumberRegistered = other.phoneNumberRegistered;
    this.sameDevice = other.sameDevice;
  }

  public SnsIdUserStatus deepCopy() {
    return new SnsIdUserStatus(this);
  }

  @Override
  public void clear() {
    setUserExistingIsSet(false);
    this.userExisting = false;
    setPhoneNumberRegisteredIsSet(false);
    this.phoneNumberRegistered = false;
    setSameDeviceIsSet(false);
    this.sameDevice = false;
  }

  public boolean isUserExisting() {
    return this.userExisting;
  }

  public SnsIdUserStatus setUserExisting(boolean userExisting) {
    this.userExisting = userExisting;
    setUserExistingIsSet(true);
    return this;
  }

  public void unsetUserExisting() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USEREXISTING_ISSET_ID);
  }

  /** Returns true if field userExisting is set (has been assigned a value) and false otherwise */
  public boolean isSetUserExisting() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USEREXISTING_ISSET_ID);
  }

  public void setUserExistingIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USEREXISTING_ISSET_ID, value);
  }

  public boolean isPhoneNumberRegistered() {
    return this.phoneNumberRegistered;
  }

  public SnsIdUserStatus setPhoneNumberRegistered(boolean phoneNumberRegistered) {
    this.phoneNumberRegistered = phoneNumberRegistered;
    setPhoneNumberRegisteredIsSet(true);
    return this;
  }

  public void unsetPhoneNumberRegistered() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PHONENUMBERREGISTERED_ISSET_ID);
  }

  /** Returns true if field phoneNumberRegistered is set (has been assigned a value) and false otherwise */
  public boolean isSetPhoneNumberRegistered() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PHONENUMBERREGISTERED_ISSET_ID);
  }

  public void setPhoneNumberRegisteredIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PHONENUMBERREGISTERED_ISSET_ID, value);
  }

  public boolean isSameDevice() {
    return this.sameDevice;
  }

  public SnsIdUserStatus setSameDevice(boolean sameDevice) {
    this.sameDevice = sameDevice;
    setSameDeviceIsSet(true);
    return this;
  }

  public void unsetSameDevice() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SAMEDEVICE_ISSET_ID);
  }

  /** Returns true if field sameDevice is set (has been assigned a value) and false otherwise */
  public boolean isSetSameDevice() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SAMEDEVICE_ISSET_ID);
  }

  public void setSameDeviceIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SAMEDEVICE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USER_EXISTING:
      if (value == null) {
        unsetUserExisting();
      } else {
        setUserExisting((java.lang.Boolean)value);
      }
      break;

    case PHONE_NUMBER_REGISTERED:
      if (value == null) {
        unsetPhoneNumberRegistered();
      } else {
        setPhoneNumberRegistered((java.lang.Boolean)value);
      }
      break;

    case SAME_DEVICE:
      if (value == null) {
        unsetSameDevice();
      } else {
        setSameDevice((java.lang.Boolean)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_EXISTING:
      return isUserExisting();

    case PHONE_NUMBER_REGISTERED:
      return isPhoneNumberRegistered();

    case SAME_DEVICE:
      return isSameDevice();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USER_EXISTING:
      return isSetUserExisting();
    case PHONE_NUMBER_REGISTERED:
      return isSetPhoneNumberRegistered();
    case SAME_DEVICE:
      return isSetSameDevice();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SnsIdUserStatus)
      return this.equals((SnsIdUserStatus)that);
    return false;
  }

  public boolean equals(SnsIdUserStatus that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_userExisting = true;
    boolean that_present_userExisting = true;
    if (this_present_userExisting || that_present_userExisting) {
      if (!(this_present_userExisting && that_present_userExisting))
        return false;
      if (this.userExisting != that.userExisting)
        return false;
    }

    boolean this_present_phoneNumberRegistered = true;
    boolean that_present_phoneNumberRegistered = true;
    if (this_present_phoneNumberRegistered || that_present_phoneNumberRegistered) {
      if (!(this_present_phoneNumberRegistered && that_present_phoneNumberRegistered))
        return false;
      if (this.phoneNumberRegistered != that.phoneNumberRegistered)
        return false;
    }

    boolean this_present_sameDevice = true;
    boolean that_present_sameDevice = true;
    if (this_present_sameDevice || that_present_sameDevice) {
      if (!(this_present_sameDevice && that_present_sameDevice))
        return false;
      if (this.sameDevice != that.sameDevice)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((userExisting) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((phoneNumberRegistered) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((sameDevice) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(SnsIdUserStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUserExisting()).compareTo(other.isSetUserExisting());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserExisting()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userExisting, other.userExisting);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPhoneNumberRegistered()).compareTo(other.isSetPhoneNumberRegistered());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPhoneNumberRegistered()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.phoneNumberRegistered, other.phoneNumberRegistered);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSameDevice()).compareTo(other.isSetSameDevice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSameDevice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sameDevice, other.sameDevice);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SnsIdUserStatus(");
    boolean first = true;

    sb.append("userExisting:");
    sb.append(this.userExisting);
    first = false;
    if (!first) sb.append(", ");
    sb.append("phoneNumberRegistered:");
    sb.append(this.phoneNumberRegistered);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sameDevice:");
    sb.append(this.sameDevice);
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

  private static class SnsIdUserStatusStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SnsIdUserStatusStandardScheme getScheme() {
      return new SnsIdUserStatusStandardScheme();
    }
  }

  private static class SnsIdUserStatusStandardScheme extends org.apache.thrift.scheme.StandardScheme<SnsIdUserStatus> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SnsIdUserStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_EXISTING
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.userExisting = iprot.readBool();
              struct.setUserExistingIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PHONE_NUMBER_REGISTERED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.phoneNumberRegistered = iprot.readBool();
              struct.setPhoneNumberRegisteredIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SAME_DEVICE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.sameDevice = iprot.readBool();
              struct.setSameDeviceIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SnsIdUserStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(USER_EXISTING_FIELD_DESC);
      oprot.writeBool(struct.userExisting);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PHONE_NUMBER_REGISTERED_FIELD_DESC);
      oprot.writeBool(struct.phoneNumberRegistered);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SAME_DEVICE_FIELD_DESC);
      oprot.writeBool(struct.sameDevice);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SnsIdUserStatusTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SnsIdUserStatusTupleScheme getScheme() {
      return new SnsIdUserStatusTupleScheme();
    }
  }

  private static class SnsIdUserStatusTupleScheme extends org.apache.thrift.scheme.TupleScheme<SnsIdUserStatus> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SnsIdUserStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUserExisting()) {
        optionals.set(0);
      }
      if (struct.isSetPhoneNumberRegistered()) {
        optionals.set(1);
      }
      if (struct.isSetSameDevice()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetUserExisting()) {
        oprot.writeBool(struct.userExisting);
      }
      if (struct.isSetPhoneNumberRegistered()) {
        oprot.writeBool(struct.phoneNumberRegistered);
      }
      if (struct.isSetSameDevice()) {
        oprot.writeBool(struct.sameDevice);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SnsIdUserStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.userExisting = iprot.readBool();
        struct.setUserExistingIsSet(true);
      }
      if (incoming.get(1)) {
        struct.phoneNumberRegistered = iprot.readBool();
        struct.setPhoneNumberRegisteredIsSet(true);
      }
      if (incoming.get(2)) {
        struct.sameDevice = iprot.readBool();
        struct.setSameDeviceIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

