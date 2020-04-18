/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2020-04-18")
public class UpdateSquareMemberRequest implements org.apache.thrift.TBase<UpdateSquareMemberRequest, UpdateSquareMemberRequest._Fields>, java.io.Serializable, Cloneable, Comparable<UpdateSquareMemberRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UpdateSquareMemberRequest");

  private static final org.apache.thrift.protocol.TField UPDATED_ATTRS_FIELD_DESC = new org.apache.thrift.protocol.TField("updatedAttrs", org.apache.thrift.protocol.TType.SET, (short)2);
  private static final org.apache.thrift.protocol.TField UPDATED_PREFERENCE_ATTRS_FIELD_DESC = new org.apache.thrift.protocol.TField("updatedPreferenceAttrs", org.apache.thrift.protocol.TType.SET, (short)3);
  private static final org.apache.thrift.protocol.TField SQUARE_MEMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("squareMember", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UpdateSquareMemberRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UpdateSquareMemberRequestTupleSchemeFactory();

  public java.util.Set<SquareMemberAttribute> updatedAttrs; // required
  public java.util.Set<SquarePreferenceAttribute> updatedPreferenceAttrs; // required
  public SquareMember squareMember; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UPDATED_ATTRS((short)2, "updatedAttrs"),
    UPDATED_PREFERENCE_ATTRS((short)3, "updatedPreferenceAttrs"),
    SQUARE_MEMBER((short)4, "squareMember");

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
        case 2: // UPDATED_ATTRS
          return UPDATED_ATTRS;
        case 3: // UPDATED_PREFERENCE_ATTRS
          return UPDATED_PREFERENCE_ATTRS;
        case 4: // SQUARE_MEMBER
          return SQUARE_MEMBER;
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
    tmpMap.put(_Fields.UPDATED_ATTRS, new org.apache.thrift.meta_data.FieldMetaData("updatedAttrs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SquareMemberAttribute.class))));
    tmpMap.put(_Fields.UPDATED_PREFERENCE_ATTRS, new org.apache.thrift.meta_data.FieldMetaData("updatedPreferenceAttrs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SquarePreferenceAttribute.class))));
    tmpMap.put(_Fields.SQUARE_MEMBER, new org.apache.thrift.meta_data.FieldMetaData("squareMember", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareMember.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UpdateSquareMemberRequest.class, metaDataMap);
  }

  public UpdateSquareMemberRequest() {
  }

  public UpdateSquareMemberRequest(
    java.util.Set<SquareMemberAttribute> updatedAttrs,
    java.util.Set<SquarePreferenceAttribute> updatedPreferenceAttrs,
    SquareMember squareMember)
  {
    this();
    this.updatedAttrs = updatedAttrs;
    this.updatedPreferenceAttrs = updatedPreferenceAttrs;
    this.squareMember = squareMember;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UpdateSquareMemberRequest(UpdateSquareMemberRequest other) {
    if (other.isSetUpdatedAttrs()) {
      java.util.Set<SquareMemberAttribute> __this__updatedAttrs = java.util.EnumSet.noneOf(SquareMemberAttribute.class);
      for (SquareMemberAttribute other_element : other.updatedAttrs) {
        __this__updatedAttrs.add(other_element);
      }
      this.updatedAttrs = __this__updatedAttrs;
    }
    if (other.isSetUpdatedPreferenceAttrs()) {
      java.util.Set<SquarePreferenceAttribute> __this__updatedPreferenceAttrs = java.util.EnumSet.noneOf(SquarePreferenceAttribute.class);
      for (SquarePreferenceAttribute other_element : other.updatedPreferenceAttrs) {
        __this__updatedPreferenceAttrs.add(other_element);
      }
      this.updatedPreferenceAttrs = __this__updatedPreferenceAttrs;
    }
    if (other.isSetSquareMember()) {
      this.squareMember = new SquareMember(other.squareMember);
    }
  }

  public UpdateSquareMemberRequest deepCopy() {
    return new UpdateSquareMemberRequest(this);
  }

  @Override
  public void clear() {
    this.updatedAttrs = null;
    this.updatedPreferenceAttrs = null;
    this.squareMember = null;
  }

  public int getUpdatedAttrsSize() {
    return (this.updatedAttrs == null) ? 0 : this.updatedAttrs.size();
  }

  public java.util.Iterator<SquareMemberAttribute> getUpdatedAttrsIterator() {
    return (this.updatedAttrs == null) ? null : this.updatedAttrs.iterator();
  }

  public void addToUpdatedAttrs(SquareMemberAttribute elem) {
    if (this.updatedAttrs == null) {
      this.updatedAttrs = java.util.EnumSet.noneOf(SquareMemberAttribute.class);
    }
    this.updatedAttrs.add(elem);
  }

  public java.util.Set<SquareMemberAttribute> getUpdatedAttrs() {
    return this.updatedAttrs;
  }

  public UpdateSquareMemberRequest setUpdatedAttrs(java.util.Set<SquareMemberAttribute> updatedAttrs) {
    this.updatedAttrs = updatedAttrs;
    return this;
  }

  public void unsetUpdatedAttrs() {
    this.updatedAttrs = null;
  }

  /** Returns true if field updatedAttrs is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdatedAttrs() {
    return this.updatedAttrs != null;
  }

  public void setUpdatedAttrsIsSet(boolean value) {
    if (!value) {
      this.updatedAttrs = null;
    }
  }

  public int getUpdatedPreferenceAttrsSize() {
    return (this.updatedPreferenceAttrs == null) ? 0 : this.updatedPreferenceAttrs.size();
  }

  public java.util.Iterator<SquarePreferenceAttribute> getUpdatedPreferenceAttrsIterator() {
    return (this.updatedPreferenceAttrs == null) ? null : this.updatedPreferenceAttrs.iterator();
  }

  public void addToUpdatedPreferenceAttrs(SquarePreferenceAttribute elem) {
    if (this.updatedPreferenceAttrs == null) {
      this.updatedPreferenceAttrs = java.util.EnumSet.noneOf(SquarePreferenceAttribute.class);
    }
    this.updatedPreferenceAttrs.add(elem);
  }

  public java.util.Set<SquarePreferenceAttribute> getUpdatedPreferenceAttrs() {
    return this.updatedPreferenceAttrs;
  }

  public UpdateSquareMemberRequest setUpdatedPreferenceAttrs(java.util.Set<SquarePreferenceAttribute> updatedPreferenceAttrs) {
    this.updatedPreferenceAttrs = updatedPreferenceAttrs;
    return this;
  }

  public void unsetUpdatedPreferenceAttrs() {
    this.updatedPreferenceAttrs = null;
  }

  /** Returns true if field updatedPreferenceAttrs is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdatedPreferenceAttrs() {
    return this.updatedPreferenceAttrs != null;
  }

  public void setUpdatedPreferenceAttrsIsSet(boolean value) {
    if (!value) {
      this.updatedPreferenceAttrs = null;
    }
  }

  public SquareMember getSquareMember() {
    return this.squareMember;
  }

  public UpdateSquareMemberRequest setSquareMember(SquareMember squareMember) {
    this.squareMember = squareMember;
    return this;
  }

  public void unsetSquareMember() {
    this.squareMember = null;
  }

  /** Returns true if field squareMember is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareMember() {
    return this.squareMember != null;
  }

  public void setSquareMemberIsSet(boolean value) {
    if (!value) {
      this.squareMember = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case UPDATED_ATTRS:
      if (value == null) {
        unsetUpdatedAttrs();
      } else {
        setUpdatedAttrs((java.util.Set<SquareMemberAttribute>)value);
      }
      break;

    case UPDATED_PREFERENCE_ATTRS:
      if (value == null) {
        unsetUpdatedPreferenceAttrs();
      } else {
        setUpdatedPreferenceAttrs((java.util.Set<SquarePreferenceAttribute>)value);
      }
      break;

    case SQUARE_MEMBER:
      if (value == null) {
        unsetSquareMember();
      } else {
        setSquareMember((SquareMember)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case UPDATED_ATTRS:
      return getUpdatedAttrs();

    case UPDATED_PREFERENCE_ATTRS:
      return getUpdatedPreferenceAttrs();

    case SQUARE_MEMBER:
      return getSquareMember();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case UPDATED_ATTRS:
      return isSetUpdatedAttrs();
    case UPDATED_PREFERENCE_ATTRS:
      return isSetUpdatedPreferenceAttrs();
    case SQUARE_MEMBER:
      return isSetSquareMember();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof UpdateSquareMemberRequest)
      return this.equals((UpdateSquareMemberRequest)that);
    return false;
  }

  public boolean equals(UpdateSquareMemberRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_updatedAttrs = true && this.isSetUpdatedAttrs();
    boolean that_present_updatedAttrs = true && that.isSetUpdatedAttrs();
    if (this_present_updatedAttrs || that_present_updatedAttrs) {
      if (!(this_present_updatedAttrs && that_present_updatedAttrs))
        return false;
      if (!this.updatedAttrs.equals(that.updatedAttrs))
        return false;
    }

    boolean this_present_updatedPreferenceAttrs = true && this.isSetUpdatedPreferenceAttrs();
    boolean that_present_updatedPreferenceAttrs = true && that.isSetUpdatedPreferenceAttrs();
    if (this_present_updatedPreferenceAttrs || that_present_updatedPreferenceAttrs) {
      if (!(this_present_updatedPreferenceAttrs && that_present_updatedPreferenceAttrs))
        return false;
      if (!this.updatedPreferenceAttrs.equals(that.updatedPreferenceAttrs))
        return false;
    }

    boolean this_present_squareMember = true && this.isSetSquareMember();
    boolean that_present_squareMember = true && that.isSetSquareMember();
    if (this_present_squareMember || that_present_squareMember) {
      if (!(this_present_squareMember && that_present_squareMember))
        return false;
      if (!this.squareMember.equals(that.squareMember))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUpdatedAttrs()) ? 131071 : 524287);
    if (isSetUpdatedAttrs())
      hashCode = hashCode * 8191 + updatedAttrs.hashCode();

    hashCode = hashCode * 8191 + ((isSetUpdatedPreferenceAttrs()) ? 131071 : 524287);
    if (isSetUpdatedPreferenceAttrs())
      hashCode = hashCode * 8191 + updatedPreferenceAttrs.hashCode();

    hashCode = hashCode * 8191 + ((isSetSquareMember()) ? 131071 : 524287);
    if (isSetSquareMember())
      hashCode = hashCode * 8191 + squareMember.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(UpdateSquareMemberRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUpdatedAttrs()).compareTo(other.isSetUpdatedAttrs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdatedAttrs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updatedAttrs, other.updatedAttrs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUpdatedPreferenceAttrs()).compareTo(other.isSetUpdatedPreferenceAttrs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdatedPreferenceAttrs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updatedPreferenceAttrs, other.updatedPreferenceAttrs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSquareMember()).compareTo(other.isSetSquareMember());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareMember()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareMember, other.squareMember);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateSquareMemberRequest(");
    boolean first = true;

    sb.append("updatedAttrs:");
    if (this.updatedAttrs == null) {
      sb.append("null");
    } else {
      sb.append(this.updatedAttrs);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("updatedPreferenceAttrs:");
    if (this.updatedPreferenceAttrs == null) {
      sb.append("null");
    } else {
      sb.append(this.updatedPreferenceAttrs);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareMember:");
    if (this.squareMember == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMember);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (squareMember != null) {
      squareMember.validate();
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

  private static class UpdateSquareMemberRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UpdateSquareMemberRequestStandardScheme getScheme() {
      return new UpdateSquareMemberRequestStandardScheme();
    }
  }

  private static class UpdateSquareMemberRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<UpdateSquareMemberRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UpdateSquareMemberRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 2: // UPDATED_ATTRS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set834 = iprot.readSetBegin();
                struct.updatedAttrs = java.util.EnumSet.noneOf(SquareMemberAttribute.class);
                SquareMemberAttribute _elem835;
                for (int _i836 = 0; _i836 < _set834.size; ++_i836)
                {
                  _elem835 = SquareMemberAttribute.findByValue(iprot.readI32());
                  if (_elem835 != null)
                  {
                    struct.updatedAttrs.add(_elem835);
                  }
                }
                iprot.readSetEnd();
              }
              struct.setUpdatedAttrsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UPDATED_PREFERENCE_ATTRS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set837 = iprot.readSetBegin();
                struct.updatedPreferenceAttrs = java.util.EnumSet.noneOf(SquarePreferenceAttribute.class);
                SquarePreferenceAttribute _elem838;
                for (int _i839 = 0; _i839 < _set837.size; ++_i839)
                {
                  _elem838 = SquarePreferenceAttribute.findByValue(iprot.readI32());
                  if (_elem838 != null)
                  {
                    struct.updatedPreferenceAttrs.add(_elem838);
                  }
                }
                iprot.readSetEnd();
              }
              struct.setUpdatedPreferenceAttrsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SQUARE_MEMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.squareMember = new SquareMember();
              struct.squareMember.read(iprot);
              struct.setSquareMemberIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UpdateSquareMemberRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.updatedAttrs != null) {
        oprot.writeFieldBegin(UPDATED_ATTRS_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, struct.updatedAttrs.size()));
          for (SquareMemberAttribute _iter840 : struct.updatedAttrs)
          {
            oprot.writeI32(_iter840.getValue());
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.updatedPreferenceAttrs != null) {
        oprot.writeFieldBegin(UPDATED_PREFERENCE_ATTRS_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, struct.updatedPreferenceAttrs.size()));
          for (SquarePreferenceAttribute _iter841 : struct.updatedPreferenceAttrs)
          {
            oprot.writeI32(_iter841.getValue());
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.squareMember != null) {
        oprot.writeFieldBegin(SQUARE_MEMBER_FIELD_DESC);
        struct.squareMember.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UpdateSquareMemberRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UpdateSquareMemberRequestTupleScheme getScheme() {
      return new UpdateSquareMemberRequestTupleScheme();
    }
  }

  private static class UpdateSquareMemberRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<UpdateSquareMemberRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UpdateSquareMemberRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUpdatedAttrs()) {
        optionals.set(0);
      }
      if (struct.isSetUpdatedPreferenceAttrs()) {
        optionals.set(1);
      }
      if (struct.isSetSquareMember()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetUpdatedAttrs()) {
        {
          oprot.writeI32(struct.updatedAttrs.size());
          for (SquareMemberAttribute _iter842 : struct.updatedAttrs)
          {
            oprot.writeI32(_iter842.getValue());
          }
        }
      }
      if (struct.isSetUpdatedPreferenceAttrs()) {
        {
          oprot.writeI32(struct.updatedPreferenceAttrs.size());
          for (SquarePreferenceAttribute _iter843 : struct.updatedPreferenceAttrs)
          {
            oprot.writeI32(_iter843.getValue());
          }
        }
      }
      if (struct.isSetSquareMember()) {
        struct.squareMember.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UpdateSquareMemberRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TSet _set844 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.updatedAttrs = java.util.EnumSet.noneOf(SquareMemberAttribute.class);
          SquareMemberAttribute _elem845;
          for (int _i846 = 0; _i846 < _set844.size; ++_i846)
          {
            _elem845 = SquareMemberAttribute.findByValue(iprot.readI32());
            if (_elem845 != null)
            {
              struct.updatedAttrs.add(_elem845);
            }
          }
        }
        struct.setUpdatedAttrsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TSet _set847 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.updatedPreferenceAttrs = java.util.EnumSet.noneOf(SquarePreferenceAttribute.class);
          SquarePreferenceAttribute _elem848;
          for (int _i849 = 0; _i849 < _set847.size; ++_i849)
          {
            _elem848 = SquarePreferenceAttribute.findByValue(iprot.readI32());
            if (_elem848 != null)
            {
              struct.updatedPreferenceAttrs.add(_elem848);
            }
          }
        }
        struct.setUpdatedPreferenceAttrsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.squareMember = new SquareMember();
        struct.squareMember.read(iprot);
        struct.setSquareMemberIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

