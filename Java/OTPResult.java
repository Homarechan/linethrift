/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2020-04-18")
public class OTPResult implements org.apache.thrift.TBase<OTPResult, OTPResult._Fields>, java.io.Serializable, Cloneable, Comparable<OTPResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("OTPResult");

  private static final org.apache.thrift.protocol.TField OTP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("otpId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField OTP_FIELD_DESC = new org.apache.thrift.protocol.TField("otp", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new OTPResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new OTPResultTupleSchemeFactory();

  public java.lang.String otpId; // required
  public java.lang.String otp; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OTP_ID((short)1, "otpId"),
    OTP((short)2, "otp");

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
        case 1: // OTP_ID
          return OTP_ID;
        case 2: // OTP
          return OTP;
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
    tmpMap.put(_Fields.OTP_ID, new org.apache.thrift.meta_data.FieldMetaData("otpId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OTP, new org.apache.thrift.meta_data.FieldMetaData("otp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(OTPResult.class, metaDataMap);
  }

  public OTPResult() {
  }

  public OTPResult(
    java.lang.String otpId,
    java.lang.String otp)
  {
    this();
    this.otpId = otpId;
    this.otp = otp;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OTPResult(OTPResult other) {
    if (other.isSetOtpId()) {
      this.otpId = other.otpId;
    }
    if (other.isSetOtp()) {
      this.otp = other.otp;
    }
  }

  public OTPResult deepCopy() {
    return new OTPResult(this);
  }

  @Override
  public void clear() {
    this.otpId = null;
    this.otp = null;
  }

  public java.lang.String getOtpId() {
    return this.otpId;
  }

  public OTPResult setOtpId(java.lang.String otpId) {
    this.otpId = otpId;
    return this;
  }

  public void unsetOtpId() {
    this.otpId = null;
  }

  /** Returns true if field otpId is set (has been assigned a value) and false otherwise */
  public boolean isSetOtpId() {
    return this.otpId != null;
  }

  public void setOtpIdIsSet(boolean value) {
    if (!value) {
      this.otpId = null;
    }
  }

  public java.lang.String getOtp() {
    return this.otp;
  }

  public OTPResult setOtp(java.lang.String otp) {
    this.otp = otp;
    return this;
  }

  public void unsetOtp() {
    this.otp = null;
  }

  /** Returns true if field otp is set (has been assigned a value) and false otherwise */
  public boolean isSetOtp() {
    return this.otp != null;
  }

  public void setOtpIsSet(boolean value) {
    if (!value) {
      this.otp = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case OTP_ID:
      if (value == null) {
        unsetOtpId();
      } else {
        setOtpId((java.lang.String)value);
      }
      break;

    case OTP:
      if (value == null) {
        unsetOtp();
      } else {
        setOtp((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case OTP_ID:
      return getOtpId();

    case OTP:
      return getOtp();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case OTP_ID:
      return isSetOtpId();
    case OTP:
      return isSetOtp();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof OTPResult)
      return this.equals((OTPResult)that);
    return false;
  }

  public boolean equals(OTPResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_otpId = true && this.isSetOtpId();
    boolean that_present_otpId = true && that.isSetOtpId();
    if (this_present_otpId || that_present_otpId) {
      if (!(this_present_otpId && that_present_otpId))
        return false;
      if (!this.otpId.equals(that.otpId))
        return false;
    }

    boolean this_present_otp = true && this.isSetOtp();
    boolean that_present_otp = true && that.isSetOtp();
    if (this_present_otp || that_present_otp) {
      if (!(this_present_otp && that_present_otp))
        return false;
      if (!this.otp.equals(that.otp))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetOtpId()) ? 131071 : 524287);
    if (isSetOtpId())
      hashCode = hashCode * 8191 + otpId.hashCode();

    hashCode = hashCode * 8191 + ((isSetOtp()) ? 131071 : 524287);
    if (isSetOtp())
      hashCode = hashCode * 8191 + otp.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(OTPResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetOtpId()).compareTo(other.isSetOtpId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOtpId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.otpId, other.otpId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOtp()).compareTo(other.isSetOtp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOtp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.otp, other.otp);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("OTPResult(");
    boolean first = true;

    sb.append("otpId:");
    if (this.otpId == null) {
      sb.append("null");
    } else {
      sb.append(this.otpId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("otp:");
    if (this.otp == null) {
      sb.append("null");
    } else {
      sb.append(this.otp);
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

  private static class OTPResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public OTPResultStandardScheme getScheme() {
      return new OTPResultStandardScheme();
    }
  }

  private static class OTPResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<OTPResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, OTPResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OTP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.otpId = iprot.readString();
              struct.setOtpIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OTP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.otp = iprot.readString();
              struct.setOtpIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, OTPResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.otpId != null) {
        oprot.writeFieldBegin(OTP_ID_FIELD_DESC);
        oprot.writeString(struct.otpId);
        oprot.writeFieldEnd();
      }
      if (struct.otp != null) {
        oprot.writeFieldBegin(OTP_FIELD_DESC);
        oprot.writeString(struct.otp);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OTPResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public OTPResultTupleScheme getScheme() {
      return new OTPResultTupleScheme();
    }
  }

  private static class OTPResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<OTPResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, OTPResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetOtpId()) {
        optionals.set(0);
      }
      if (struct.isSetOtp()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetOtpId()) {
        oprot.writeString(struct.otpId);
      }
      if (struct.isSetOtp()) {
        oprot.writeString(struct.otp);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, OTPResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.otpId = iprot.readString();
        struct.setOtpIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.otp = iprot.readString();
        struct.setOtpIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

