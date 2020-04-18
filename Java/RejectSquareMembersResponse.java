/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2020-04-18")
public class RejectSquareMembersResponse implements org.apache.thrift.TBase<RejectSquareMembersResponse, RejectSquareMembersResponse._Fields>, java.io.Serializable, Cloneable, Comparable<RejectSquareMembersResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RejectSquareMembersResponse");

  private static final org.apache.thrift.protocol.TField REJECTED_MEMBERS_FIELD_DESC = new org.apache.thrift.protocol.TField("rejectedMembers", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RejectSquareMembersResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RejectSquareMembersResponseTupleSchemeFactory();

  public java.util.List<SquareMember> rejectedMembers; // required
  public SquareStatus status; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REJECTED_MEMBERS((short)1, "rejectedMembers"),
    STATUS((short)2, "status");

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
        case 1: // REJECTED_MEMBERS
          return REJECTED_MEMBERS;
        case 2: // STATUS
          return STATUS;
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
    tmpMap.put(_Fields.REJECTED_MEMBERS, new org.apache.thrift.meta_data.FieldMetaData("rejectedMembers", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareMember.class))));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareStatus.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RejectSquareMembersResponse.class, metaDataMap);
  }

  public RejectSquareMembersResponse() {
  }

  public RejectSquareMembersResponse(
    java.util.List<SquareMember> rejectedMembers,
    SquareStatus status)
  {
    this();
    this.rejectedMembers = rejectedMembers;
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RejectSquareMembersResponse(RejectSquareMembersResponse other) {
    if (other.isSetRejectedMembers()) {
      java.util.List<SquareMember> __this__rejectedMembers = new java.util.ArrayList<SquareMember>(other.rejectedMembers.size());
      for (SquareMember other_element : other.rejectedMembers) {
        __this__rejectedMembers.add(new SquareMember(other_element));
      }
      this.rejectedMembers = __this__rejectedMembers;
    }
    if (other.isSetStatus()) {
      this.status = new SquareStatus(other.status);
    }
  }

  public RejectSquareMembersResponse deepCopy() {
    return new RejectSquareMembersResponse(this);
  }

  @Override
  public void clear() {
    this.rejectedMembers = null;
    this.status = null;
  }

  public int getRejectedMembersSize() {
    return (this.rejectedMembers == null) ? 0 : this.rejectedMembers.size();
  }

  public java.util.Iterator<SquareMember> getRejectedMembersIterator() {
    return (this.rejectedMembers == null) ? null : this.rejectedMembers.iterator();
  }

  public void addToRejectedMembers(SquareMember elem) {
    if (this.rejectedMembers == null) {
      this.rejectedMembers = new java.util.ArrayList<SquareMember>();
    }
    this.rejectedMembers.add(elem);
  }

  public java.util.List<SquareMember> getRejectedMembers() {
    return this.rejectedMembers;
  }

  public RejectSquareMembersResponse setRejectedMembers(java.util.List<SquareMember> rejectedMembers) {
    this.rejectedMembers = rejectedMembers;
    return this;
  }

  public void unsetRejectedMembers() {
    this.rejectedMembers = null;
  }

  /** Returns true if field rejectedMembers is set (has been assigned a value) and false otherwise */
  public boolean isSetRejectedMembers() {
    return this.rejectedMembers != null;
  }

  public void setRejectedMembersIsSet(boolean value) {
    if (!value) {
      this.rejectedMembers = null;
    }
  }

  public SquareStatus getStatus() {
    return this.status;
  }

  public RejectSquareMembersResponse setStatus(SquareStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case REJECTED_MEMBERS:
      if (value == null) {
        unsetRejectedMembers();
      } else {
        setRejectedMembers((java.util.List<SquareMember>)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((SquareStatus)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case REJECTED_MEMBERS:
      return getRejectedMembers();

    case STATUS:
      return getStatus();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case REJECTED_MEMBERS:
      return isSetRejectedMembers();
    case STATUS:
      return isSetStatus();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof RejectSquareMembersResponse)
      return this.equals((RejectSquareMembersResponse)that);
    return false;
  }

  public boolean equals(RejectSquareMembersResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_rejectedMembers = true && this.isSetRejectedMembers();
    boolean that_present_rejectedMembers = true && that.isSetRejectedMembers();
    if (this_present_rejectedMembers || that_present_rejectedMembers) {
      if (!(this_present_rejectedMembers && that_present_rejectedMembers))
        return false;
      if (!this.rejectedMembers.equals(that.rejectedMembers))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetRejectedMembers()) ? 131071 : 524287);
    if (isSetRejectedMembers())
      hashCode = hashCode * 8191 + rejectedMembers.hashCode();

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(RejectSquareMembersResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetRejectedMembers()).compareTo(other.isSetRejectedMembers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRejectedMembers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rejectedMembers, other.rejectedMembers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RejectSquareMembersResponse(");
    boolean first = true;

    sb.append("rejectedMembers:");
    if (this.rejectedMembers == null) {
      sb.append("null");
    } else {
      sb.append(this.rejectedMembers);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (status != null) {
      status.validate();
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

  private static class RejectSquareMembersResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RejectSquareMembersResponseStandardScheme getScheme() {
      return new RejectSquareMembersResponseStandardScheme();
    }
  }

  private static class RejectSquareMembersResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<RejectSquareMembersResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RejectSquareMembersResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REJECTED_MEMBERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list908 = iprot.readListBegin();
                struct.rejectedMembers = new java.util.ArrayList<SquareMember>(_list908.size);
                SquareMember _elem909;
                for (int _i910 = 0; _i910 < _list908.size; ++_i910)
                {
                  _elem909 = new SquareMember();
                  _elem909.read(iprot);
                  struct.rejectedMembers.add(_elem909);
                }
                iprot.readListEnd();
              }
              struct.setRejectedMembersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new SquareStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RejectSquareMembersResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.rejectedMembers != null) {
        oprot.writeFieldBegin(REJECTED_MEMBERS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.rejectedMembers.size()));
          for (SquareMember _iter911 : struct.rejectedMembers)
          {
            _iter911.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RejectSquareMembersResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RejectSquareMembersResponseTupleScheme getScheme() {
      return new RejectSquareMembersResponseTupleScheme();
    }
  }

  private static class RejectSquareMembersResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<RejectSquareMembersResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RejectSquareMembersResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRejectedMembers()) {
        optionals.set(0);
      }
      if (struct.isSetStatus()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetRejectedMembers()) {
        {
          oprot.writeI32(struct.rejectedMembers.size());
          for (SquareMember _iter912 : struct.rejectedMembers)
          {
            _iter912.write(oprot);
          }
        }
      }
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RejectSquareMembersResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list913 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.rejectedMembers = new java.util.ArrayList<SquareMember>(_list913.size);
          SquareMember _elem914;
          for (int _i915 = 0; _i915 < _list913.size; ++_i915)
          {
            _elem914 = new SquareMember();
            _elem914.read(iprot);
            struct.rejectedMembers.add(_elem914);
          }
        }
        struct.setRejectedMembersIsSet(true);
      }
      if (incoming.get(1)) {
        struct.status = new SquareStatus();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

