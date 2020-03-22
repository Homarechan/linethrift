/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class UpdateSquareMembersRequest implements org.apache.thrift.TBase<UpdateSquareMembersRequest, UpdateSquareMembersRequest._Fields>, java.io.Serializable, Cloneable, Comparable<UpdateSquareMembersRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UpdateSquareMembersRequest");

  private static final org.apache.thrift.protocol.TField UPDATED_ATTRS_FIELD_DESC = new org.apache.thrift.protocol.TField("updatedAttrs", org.apache.thrift.protocol.TType.SET, (short)2);
  private static final org.apache.thrift.protocol.TField MEMBERS_FIELD_DESC = new org.apache.thrift.protocol.TField("members", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UpdateSquareMembersRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UpdateSquareMembersRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.Set<SquareMemberAttribute> updatedAttrs; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<SquareMember> members; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UPDATED_ATTRS((short)2, "updatedAttrs"),
    MEMBERS((short)3, "members");

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
        case 2: // UPDATED_ATTRS
          return UPDATED_ATTRS;
        case 3: // MEMBERS
          return MEMBERS;
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
    tmpMap.put(_Fields.UPDATED_ATTRS, new org.apache.thrift.meta_data.FieldMetaData("updatedAttrs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SquareMemberAttribute.class))));
    tmpMap.put(_Fields.MEMBERS, new org.apache.thrift.meta_data.FieldMetaData("members", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareMember.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UpdateSquareMembersRequest.class, metaDataMap);
  }

  public UpdateSquareMembersRequest() {
  }

  public UpdateSquareMembersRequest(
    java.util.Set<SquareMemberAttribute> updatedAttrs,
    java.util.List<SquareMember> members)
  {
    this();
    this.updatedAttrs = updatedAttrs;
    this.members = members;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UpdateSquareMembersRequest(UpdateSquareMembersRequest other) {
    if (other.isSetUpdatedAttrs()) {
      java.util.Set<SquareMemberAttribute> __this__updatedAttrs = java.util.EnumSet.noneOf(SquareMemberAttribute.class);
      for (SquareMemberAttribute other_element : other.updatedAttrs) {
        __this__updatedAttrs.add(other_element);
      }
      this.updatedAttrs = __this__updatedAttrs;
    }
    if (other.isSetMembers()) {
      java.util.List<SquareMember> __this__members = new java.util.ArrayList<SquareMember>(other.members.size());
      for (SquareMember other_element : other.members) {
        __this__members.add(new SquareMember(other_element));
      }
      this.members = __this__members;
    }
  }

  public UpdateSquareMembersRequest deepCopy() {
    return new UpdateSquareMembersRequest(this);
  }

  @Override
  public void clear() {
    this.updatedAttrs = null;
    this.members = null;
  }

  public int getUpdatedAttrsSize() {
    return (this.updatedAttrs == null) ? 0 : this.updatedAttrs.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<SquareMemberAttribute> getUpdatedAttrsIterator() {
    return (this.updatedAttrs == null) ? null : this.updatedAttrs.iterator();
  }

  public void addToUpdatedAttrs(SquareMemberAttribute elem) {
    if (this.updatedAttrs == null) {
      this.updatedAttrs = java.util.EnumSet.noneOf(SquareMemberAttribute.class);
    }
    this.updatedAttrs.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Set<SquareMemberAttribute> getUpdatedAttrs() {
    return this.updatedAttrs;
  }

  public UpdateSquareMembersRequest setUpdatedAttrs(@org.apache.thrift.annotation.Nullable java.util.Set<SquareMemberAttribute> updatedAttrs) {
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

  public int getMembersSize() {
    return (this.members == null) ? 0 : this.members.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<SquareMember> getMembersIterator() {
    return (this.members == null) ? null : this.members.iterator();
  }

  public void addToMembers(SquareMember elem) {
    if (this.members == null) {
      this.members = new java.util.ArrayList<SquareMember>();
    }
    this.members.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<SquareMember> getMembers() {
    return this.members;
  }

  public UpdateSquareMembersRequest setMembers(@org.apache.thrift.annotation.Nullable java.util.List<SquareMember> members) {
    this.members = members;
    return this;
  }

  public void unsetMembers() {
    this.members = null;
  }

  /** Returns true if field members is set (has been assigned a value) and false otherwise */
  public boolean isSetMembers() {
    return this.members != null;
  }

  public void setMembersIsSet(boolean value) {
    if (!value) {
      this.members = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case UPDATED_ATTRS:
      if (value == null) {
        unsetUpdatedAttrs();
      } else {
        setUpdatedAttrs((java.util.Set<SquareMemberAttribute>)value);
      }
      break;

    case MEMBERS:
      if (value == null) {
        unsetMembers();
      } else {
        setMembers((java.util.List<SquareMember>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case UPDATED_ATTRS:
      return getUpdatedAttrs();

    case MEMBERS:
      return getMembers();

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
    case MEMBERS:
      return isSetMembers();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof UpdateSquareMembersRequest)
      return this.equals((UpdateSquareMembersRequest)that);
    return false;
  }

  public boolean equals(UpdateSquareMembersRequest that) {
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

    boolean this_present_members = true && this.isSetMembers();
    boolean that_present_members = true && that.isSetMembers();
    if (this_present_members || that_present_members) {
      if (!(this_present_members && that_present_members))
        return false;
      if (!this.members.equals(that.members))
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

    hashCode = hashCode * 8191 + ((isSetMembers()) ? 131071 : 524287);
    if (isSetMembers())
      hashCode = hashCode * 8191 + members.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(UpdateSquareMembersRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetUpdatedAttrs(), other.isSetUpdatedAttrs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdatedAttrs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updatedAttrs, other.updatedAttrs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMembers(), other.isSetMembers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMembers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.members, other.members);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateSquareMembersRequest(");
    boolean first = true;

    sb.append("updatedAttrs:");
    if (this.updatedAttrs == null) {
      sb.append("null");
    } else {
      sb.append(this.updatedAttrs);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("members:");
    if (this.members == null) {
      sb.append("null");
    } else {
      sb.append(this.members);
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

  private static class UpdateSquareMembersRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UpdateSquareMembersRequestStandardScheme getScheme() {
      return new UpdateSquareMembersRequestStandardScheme();
    }
  }

  private static class UpdateSquareMembersRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<UpdateSquareMembersRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UpdateSquareMembersRequest struct) throws org.apache.thrift.TException {
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
                org.apache.thrift.protocol.TSet _set866 = iprot.readSetBegin();
                struct.updatedAttrs = java.util.EnumSet.noneOf(SquareMemberAttribute.class);
                @org.apache.thrift.annotation.Nullable SquareMemberAttribute _elem867;
                for (int _i868 = 0; _i868 < _set866.size; ++_i868)
                {
                  _elem867 = SquareMemberAttribute.findByValue(iprot.readI32());
                  if (_elem867 != null)
                  {
                    struct.updatedAttrs.add(_elem867);
                  }
                }
                iprot.readSetEnd();
              }
              struct.setUpdatedAttrsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MEMBERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list869 = iprot.readListBegin();
                struct.members = new java.util.ArrayList<SquareMember>(_list869.size);
                @org.apache.thrift.annotation.Nullable SquareMember _elem870;
                for (int _i871 = 0; _i871 < _list869.size; ++_i871)
                {
                  _elem870 = new SquareMember();
                  _elem870.read(iprot);
                  struct.members.add(_elem870);
                }
                iprot.readListEnd();
              }
              struct.setMembersIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UpdateSquareMembersRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.updatedAttrs != null) {
        oprot.writeFieldBegin(UPDATED_ATTRS_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, struct.updatedAttrs.size()));
          for (SquareMemberAttribute _iter872 : struct.updatedAttrs)
          {
            oprot.writeI32(_iter872.getValue());
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.members != null) {
        oprot.writeFieldBegin(MEMBERS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.members.size()));
          for (SquareMember _iter873 : struct.members)
          {
            _iter873.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UpdateSquareMembersRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UpdateSquareMembersRequestTupleScheme getScheme() {
      return new UpdateSquareMembersRequestTupleScheme();
    }
  }

  private static class UpdateSquareMembersRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<UpdateSquareMembersRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UpdateSquareMembersRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUpdatedAttrs()) {
        optionals.set(0);
      }
      if (struct.isSetMembers()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUpdatedAttrs()) {
        {
          oprot.writeI32(struct.updatedAttrs.size());
          for (SquareMemberAttribute _iter874 : struct.updatedAttrs)
          {
            oprot.writeI32(_iter874.getValue());
          }
        }
      }
      if (struct.isSetMembers()) {
        {
          oprot.writeI32(struct.members.size());
          for (SquareMember _iter875 : struct.members)
          {
            _iter875.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UpdateSquareMembersRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TSet _set876 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.updatedAttrs = java.util.EnumSet.noneOf(SquareMemberAttribute.class);
          @org.apache.thrift.annotation.Nullable SquareMemberAttribute _elem877;
          for (int _i878 = 0; _i878 < _set876.size; ++_i878)
          {
            _elem877 = SquareMemberAttribute.findByValue(iprot.readI32());
            if (_elem877 != null)
            {
              struct.updatedAttrs.add(_elem877);
            }
          }
        }
        struct.setUpdatedAttrsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list879 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.members = new java.util.ArrayList<SquareMember>(_list879.size);
          @org.apache.thrift.annotation.Nullable SquareMember _elem880;
          for (int _i881 = 0; _i881 < _list879.size; ++_i881)
          {
            _elem880 = new SquareMember();
            _elem880.read(iprot);
            struct.members.add(_elem880);
          }
        }
        struct.setMembersIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

