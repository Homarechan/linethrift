/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class SquareFeature implements org.apache.thrift.TBase<SquareFeature, SquareFeature._Fields>, java.io.Serializable, Cloneable, Comparable<SquareFeature> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareFeature");

  private static final org.apache.thrift.protocol.TField CONTROL_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("controlState", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField BOOLEAN_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("booleanValue", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SquareFeatureStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SquareFeatureTupleSchemeFactory();

  /**
   * 
   * @see SquareFeatureControlState
   */
  public @org.apache.thrift.annotation.Nullable SquareFeatureControlState controlState; // required
  /**
   * 
   * @see BooleanState
   */
  public @org.apache.thrift.annotation.Nullable BooleanState booleanValue; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see SquareFeatureControlState
     */
    CONTROL_STATE((short)1, "controlState"),
    /**
     * 
     * @see BooleanState
     */
    BOOLEAN_VALUE((short)2, "booleanValue");

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
        case 1: // CONTROL_STATE
          return CONTROL_STATE;
        case 2: // BOOLEAN_VALUE
          return BOOLEAN_VALUE;
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
    tmpMap.put(_Fields.CONTROL_STATE, new org.apache.thrift.meta_data.FieldMetaData("controlState", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SquareFeatureControlState.class)));
    tmpMap.put(_Fields.BOOLEAN_VALUE, new org.apache.thrift.meta_data.FieldMetaData("booleanValue", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, BooleanState.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareFeature.class, metaDataMap);
  }

  public SquareFeature() {
  }

  public SquareFeature(
    SquareFeatureControlState controlState,
    BooleanState booleanValue)
  {
    this();
    this.controlState = controlState;
    this.booleanValue = booleanValue;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareFeature(SquareFeature other) {
    if (other.isSetControlState()) {
      this.controlState = other.controlState;
    }
    if (other.isSetBooleanValue()) {
      this.booleanValue = other.booleanValue;
    }
  }

  public SquareFeature deepCopy() {
    return new SquareFeature(this);
  }

  @Override
  public void clear() {
    this.controlState = null;
    this.booleanValue = null;
  }

  /**
   * 
   * @see SquareFeatureControlState
   */
  @org.apache.thrift.annotation.Nullable
  public SquareFeatureControlState getControlState() {
    return this.controlState;
  }

  /**
   * 
   * @see SquareFeatureControlState
   */
  public SquareFeature setControlState(@org.apache.thrift.annotation.Nullable SquareFeatureControlState controlState) {
    this.controlState = controlState;
    return this;
  }

  public void unsetControlState() {
    this.controlState = null;
  }

  /** Returns true if field controlState is set (has been assigned a value) and false otherwise */
  public boolean isSetControlState() {
    return this.controlState != null;
  }

  public void setControlStateIsSet(boolean value) {
    if (!value) {
      this.controlState = null;
    }
  }

  /**
   * 
   * @see BooleanState
   */
  @org.apache.thrift.annotation.Nullable
  public BooleanState getBooleanValue() {
    return this.booleanValue;
  }

  /**
   * 
   * @see BooleanState
   */
  public SquareFeature setBooleanValue(@org.apache.thrift.annotation.Nullable BooleanState booleanValue) {
    this.booleanValue = booleanValue;
    return this;
  }

  public void unsetBooleanValue() {
    this.booleanValue = null;
  }

  /** Returns true if field booleanValue is set (has been assigned a value) and false otherwise */
  public boolean isSetBooleanValue() {
    return this.booleanValue != null;
  }

  public void setBooleanValueIsSet(boolean value) {
    if (!value) {
      this.booleanValue = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CONTROL_STATE:
      if (value == null) {
        unsetControlState();
      } else {
        setControlState((SquareFeatureControlState)value);
      }
      break;

    case BOOLEAN_VALUE:
      if (value == null) {
        unsetBooleanValue();
      } else {
        setBooleanValue((BooleanState)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CONTROL_STATE:
      return getControlState();

    case BOOLEAN_VALUE:
      return getBooleanValue();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CONTROL_STATE:
      return isSetControlState();
    case BOOLEAN_VALUE:
      return isSetBooleanValue();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof SquareFeature)
      return this.equals((SquareFeature)that);
    return false;
  }

  public boolean equals(SquareFeature that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_controlState = true && this.isSetControlState();
    boolean that_present_controlState = true && that.isSetControlState();
    if (this_present_controlState || that_present_controlState) {
      if (!(this_present_controlState && that_present_controlState))
        return false;
      if (!this.controlState.equals(that.controlState))
        return false;
    }

    boolean this_present_booleanValue = true && this.isSetBooleanValue();
    boolean that_present_booleanValue = true && that.isSetBooleanValue();
    if (this_present_booleanValue || that_present_booleanValue) {
      if (!(this_present_booleanValue && that_present_booleanValue))
        return false;
      if (!this.booleanValue.equals(that.booleanValue))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetControlState()) ? 131071 : 524287);
    if (isSetControlState())
      hashCode = hashCode * 8191 + controlState.getValue();

    hashCode = hashCode * 8191 + ((isSetBooleanValue()) ? 131071 : 524287);
    if (isSetBooleanValue())
      hashCode = hashCode * 8191 + booleanValue.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(SquareFeature other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetControlState(), other.isSetControlState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetControlState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.controlState, other.controlState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBooleanValue(), other.isSetBooleanValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBooleanValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.booleanValue, other.booleanValue);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SquareFeature(");
    boolean first = true;

    sb.append("controlState:");
    if (this.controlState == null) {
      sb.append("null");
    } else {
      sb.append(this.controlState);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("booleanValue:");
    if (this.booleanValue == null) {
      sb.append("null");
    } else {
      sb.append(this.booleanValue);
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

  private static class SquareFeatureStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareFeatureStandardScheme getScheme() {
      return new SquareFeatureStandardScheme();
    }
  }

  private static class SquareFeatureStandardScheme extends org.apache.thrift.scheme.StandardScheme<SquareFeature> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareFeature struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONTROL_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.controlState = SquareFeatureControlState.findByValue(iprot.readI32());
              struct.setControlStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BOOLEAN_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.booleanValue = BooleanState.findByValue(iprot.readI32());
              struct.setBooleanValueIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareFeature struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.controlState != null) {
        oprot.writeFieldBegin(CONTROL_STATE_FIELD_DESC);
        oprot.writeI32(struct.controlState.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.booleanValue != null) {
        oprot.writeFieldBegin(BOOLEAN_VALUE_FIELD_DESC);
        oprot.writeI32(struct.booleanValue.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareFeatureTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareFeatureTupleScheme getScheme() {
      return new SquareFeatureTupleScheme();
    }
  }

  private static class SquareFeatureTupleScheme extends org.apache.thrift.scheme.TupleScheme<SquareFeature> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareFeature struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetControlState()) {
        optionals.set(0);
      }
      if (struct.isSetBooleanValue()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetControlState()) {
        oprot.writeI32(struct.controlState.getValue());
      }
      if (struct.isSetBooleanValue()) {
        oprot.writeI32(struct.booleanValue.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareFeature struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.controlState = SquareFeatureControlState.findByValue(iprot.readI32());
        struct.setControlStateIsSet(true);
      }
      if (incoming.get(1)) {
        struct.booleanValue = BooleanState.findByValue(iprot.readI32());
        struct.setBooleanValueIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

