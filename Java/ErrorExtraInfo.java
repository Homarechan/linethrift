/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class ErrorExtraInfo implements org.apache.thrift.TBase<ErrorExtraInfo, ErrorExtraInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ErrorExtraInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ErrorExtraInfo");

  private static final org.apache.thrift.protocol.TField PRECONDITION_FAILED_EXTRA_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("preconditionFailedExtraInfo", org.apache.thrift.protocol.TType.I32, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ErrorExtraInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ErrorExtraInfoTupleSchemeFactory();

  /**
   * 
   * @see PreconditionFailedExtraInfo
   */
  public @org.apache.thrift.annotation.Nullable PreconditionFailedExtraInfo preconditionFailedExtraInfo; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see PreconditionFailedExtraInfo
     */
    PRECONDITION_FAILED_EXTRA_INFO((short)1, "preconditionFailedExtraInfo");

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
        case 1: // PRECONDITION_FAILED_EXTRA_INFO
          return PRECONDITION_FAILED_EXTRA_INFO;
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
    tmpMap.put(_Fields.PRECONDITION_FAILED_EXTRA_INFO, new org.apache.thrift.meta_data.FieldMetaData("preconditionFailedExtraInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PreconditionFailedExtraInfo.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ErrorExtraInfo.class, metaDataMap);
  }

  public ErrorExtraInfo() {
  }

  public ErrorExtraInfo(
    PreconditionFailedExtraInfo preconditionFailedExtraInfo)
  {
    this();
    this.preconditionFailedExtraInfo = preconditionFailedExtraInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ErrorExtraInfo(ErrorExtraInfo other) {
    if (other.isSetPreconditionFailedExtraInfo()) {
      this.preconditionFailedExtraInfo = other.preconditionFailedExtraInfo;
    }
  }

  public ErrorExtraInfo deepCopy() {
    return new ErrorExtraInfo(this);
  }

  @Override
  public void clear() {
    this.preconditionFailedExtraInfo = null;
  }

  /**
   * 
   * @see PreconditionFailedExtraInfo
   */
  @org.apache.thrift.annotation.Nullable
  public PreconditionFailedExtraInfo getPreconditionFailedExtraInfo() {
    return this.preconditionFailedExtraInfo;
  }

  /**
   * 
   * @see PreconditionFailedExtraInfo
   */
  public ErrorExtraInfo setPreconditionFailedExtraInfo(@org.apache.thrift.annotation.Nullable PreconditionFailedExtraInfo preconditionFailedExtraInfo) {
    this.preconditionFailedExtraInfo = preconditionFailedExtraInfo;
    return this;
  }

  public void unsetPreconditionFailedExtraInfo() {
    this.preconditionFailedExtraInfo = null;
  }

  /** Returns true if field preconditionFailedExtraInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetPreconditionFailedExtraInfo() {
    return this.preconditionFailedExtraInfo != null;
  }

  public void setPreconditionFailedExtraInfoIsSet(boolean value) {
    if (!value) {
      this.preconditionFailedExtraInfo = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PRECONDITION_FAILED_EXTRA_INFO:
      if (value == null) {
        unsetPreconditionFailedExtraInfo();
      } else {
        setPreconditionFailedExtraInfo((PreconditionFailedExtraInfo)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PRECONDITION_FAILED_EXTRA_INFO:
      return getPreconditionFailedExtraInfo();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PRECONDITION_FAILED_EXTRA_INFO:
      return isSetPreconditionFailedExtraInfo();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ErrorExtraInfo)
      return this.equals((ErrorExtraInfo)that);
    return false;
  }

  public boolean equals(ErrorExtraInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_preconditionFailedExtraInfo = true && this.isSetPreconditionFailedExtraInfo();
    boolean that_present_preconditionFailedExtraInfo = true && that.isSetPreconditionFailedExtraInfo();
    if (this_present_preconditionFailedExtraInfo || that_present_preconditionFailedExtraInfo) {
      if (!(this_present_preconditionFailedExtraInfo && that_present_preconditionFailedExtraInfo))
        return false;
      if (!this.preconditionFailedExtraInfo.equals(that.preconditionFailedExtraInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPreconditionFailedExtraInfo()) ? 131071 : 524287);
    if (isSetPreconditionFailedExtraInfo())
      hashCode = hashCode * 8191 + preconditionFailedExtraInfo.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(ErrorExtraInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPreconditionFailedExtraInfo(), other.isSetPreconditionFailedExtraInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPreconditionFailedExtraInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.preconditionFailedExtraInfo, other.preconditionFailedExtraInfo);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorExtraInfo(");
    boolean first = true;

    sb.append("preconditionFailedExtraInfo:");
    if (this.preconditionFailedExtraInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.preconditionFailedExtraInfo);
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

  private static class ErrorExtraInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ErrorExtraInfoStandardScheme getScheme() {
      return new ErrorExtraInfoStandardScheme();
    }
  }

  private static class ErrorExtraInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<ErrorExtraInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ErrorExtraInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PRECONDITION_FAILED_EXTRA_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.preconditionFailedExtraInfo = PreconditionFailedExtraInfo.findByValue(iprot.readI32());
              struct.setPreconditionFailedExtraInfoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ErrorExtraInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.preconditionFailedExtraInfo != null) {
        oprot.writeFieldBegin(PRECONDITION_FAILED_EXTRA_INFO_FIELD_DESC);
        oprot.writeI32(struct.preconditionFailedExtraInfo.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ErrorExtraInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ErrorExtraInfoTupleScheme getScheme() {
      return new ErrorExtraInfoTupleScheme();
    }
  }

  private static class ErrorExtraInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<ErrorExtraInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ErrorExtraInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPreconditionFailedExtraInfo()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetPreconditionFailedExtraInfo()) {
        oprot.writeI32(struct.preconditionFailedExtraInfo.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ErrorExtraInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.preconditionFailedExtraInfo = PreconditionFailedExtraInfo.findByValue(iprot.readI32());
        struct.setPreconditionFailedExtraInfoIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

