/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class TMessageBoxWrapUpResponse implements org.apache.thrift.TBase<TMessageBoxWrapUpResponse, TMessageBoxWrapUpResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TMessageBoxWrapUpResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMessageBoxWrapUpResponse");

  private static final org.apache.thrift.protocol.TField MESSAGE_BOX_WRAP_UP_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("messageBoxWrapUpList", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField TOTAL_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("totalSize", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMessageBoxWrapUpResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMessageBoxWrapUpResponseTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<TMessageBoxWrapUp> messageBoxWrapUpList; // required
  public int totalSize; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MESSAGE_BOX_WRAP_UP_LIST((short)1, "messageBoxWrapUpList"),
    TOTAL_SIZE((short)2, "totalSize");

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
        case 1: // MESSAGE_BOX_WRAP_UP_LIST
          return MESSAGE_BOX_WRAP_UP_LIST;
        case 2: // TOTAL_SIZE
          return TOTAL_SIZE;
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
  private static final int __TOTALSIZE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MESSAGE_BOX_WRAP_UP_LIST, new org.apache.thrift.meta_data.FieldMetaData("messageBoxWrapUpList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TMessageBoxWrapUp.class))));
    tmpMap.put(_Fields.TOTAL_SIZE, new org.apache.thrift.meta_data.FieldMetaData("totalSize", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMessageBoxWrapUpResponse.class, metaDataMap);
  }

  public TMessageBoxWrapUpResponse() {
  }

  public TMessageBoxWrapUpResponse(
    java.util.List<TMessageBoxWrapUp> messageBoxWrapUpList,
    int totalSize)
  {
    this();
    this.messageBoxWrapUpList = messageBoxWrapUpList;
    this.totalSize = totalSize;
    setTotalSizeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMessageBoxWrapUpResponse(TMessageBoxWrapUpResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMessageBoxWrapUpList()) {
      java.util.List<TMessageBoxWrapUp> __this__messageBoxWrapUpList = new java.util.ArrayList<TMessageBoxWrapUp>(other.messageBoxWrapUpList.size());
      for (TMessageBoxWrapUp other_element : other.messageBoxWrapUpList) {
        __this__messageBoxWrapUpList.add(new TMessageBoxWrapUp(other_element));
      }
      this.messageBoxWrapUpList = __this__messageBoxWrapUpList;
    }
    this.totalSize = other.totalSize;
  }

  public TMessageBoxWrapUpResponse deepCopy() {
    return new TMessageBoxWrapUpResponse(this);
  }

  @Override
  public void clear() {
    this.messageBoxWrapUpList = null;
    setTotalSizeIsSet(false);
    this.totalSize = 0;
  }

  public int getMessageBoxWrapUpListSize() {
    return (this.messageBoxWrapUpList == null) ? 0 : this.messageBoxWrapUpList.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TMessageBoxWrapUp> getMessageBoxWrapUpListIterator() {
    return (this.messageBoxWrapUpList == null) ? null : this.messageBoxWrapUpList.iterator();
  }

  public void addToMessageBoxWrapUpList(TMessageBoxWrapUp elem) {
    if (this.messageBoxWrapUpList == null) {
      this.messageBoxWrapUpList = new java.util.ArrayList<TMessageBoxWrapUp>();
    }
    this.messageBoxWrapUpList.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TMessageBoxWrapUp> getMessageBoxWrapUpList() {
    return this.messageBoxWrapUpList;
  }

  public TMessageBoxWrapUpResponse setMessageBoxWrapUpList(@org.apache.thrift.annotation.Nullable java.util.List<TMessageBoxWrapUp> messageBoxWrapUpList) {
    this.messageBoxWrapUpList = messageBoxWrapUpList;
    return this;
  }

  public void unsetMessageBoxWrapUpList() {
    this.messageBoxWrapUpList = null;
  }

  /** Returns true if field messageBoxWrapUpList is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageBoxWrapUpList() {
    return this.messageBoxWrapUpList != null;
  }

  public void setMessageBoxWrapUpListIsSet(boolean value) {
    if (!value) {
      this.messageBoxWrapUpList = null;
    }
  }

  public int getTotalSize() {
    return this.totalSize;
  }

  public TMessageBoxWrapUpResponse setTotalSize(int totalSize) {
    this.totalSize = totalSize;
    setTotalSizeIsSet(true);
    return this;
  }

  public void unsetTotalSize() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOTALSIZE_ISSET_ID);
  }

  /** Returns true if field totalSize is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalSize() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOTALSIZE_ISSET_ID);
  }

  public void setTotalSizeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOTALSIZE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case MESSAGE_BOX_WRAP_UP_LIST:
      if (value == null) {
        unsetMessageBoxWrapUpList();
      } else {
        setMessageBoxWrapUpList((java.util.List<TMessageBoxWrapUp>)value);
      }
      break;

    case TOTAL_SIZE:
      if (value == null) {
        unsetTotalSize();
      } else {
        setTotalSize((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MESSAGE_BOX_WRAP_UP_LIST:
      return getMessageBoxWrapUpList();

    case TOTAL_SIZE:
      return getTotalSize();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case MESSAGE_BOX_WRAP_UP_LIST:
      return isSetMessageBoxWrapUpList();
    case TOTAL_SIZE:
      return isSetTotalSize();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TMessageBoxWrapUpResponse)
      return this.equals((TMessageBoxWrapUpResponse)that);
    return false;
  }

  public boolean equals(TMessageBoxWrapUpResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_messageBoxWrapUpList = true && this.isSetMessageBoxWrapUpList();
    boolean that_present_messageBoxWrapUpList = true && that.isSetMessageBoxWrapUpList();
    if (this_present_messageBoxWrapUpList || that_present_messageBoxWrapUpList) {
      if (!(this_present_messageBoxWrapUpList && that_present_messageBoxWrapUpList))
        return false;
      if (!this.messageBoxWrapUpList.equals(that.messageBoxWrapUpList))
        return false;
    }

    boolean this_present_totalSize = true;
    boolean that_present_totalSize = true;
    if (this_present_totalSize || that_present_totalSize) {
      if (!(this_present_totalSize && that_present_totalSize))
        return false;
      if (this.totalSize != that.totalSize)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMessageBoxWrapUpList()) ? 131071 : 524287);
    if (isSetMessageBoxWrapUpList())
      hashCode = hashCode * 8191 + messageBoxWrapUpList.hashCode();

    hashCode = hashCode * 8191 + totalSize;

    return hashCode;
  }

  @Override
  public int compareTo(TMessageBoxWrapUpResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetMessageBoxWrapUpList(), other.isSetMessageBoxWrapUpList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageBoxWrapUpList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messageBoxWrapUpList, other.messageBoxWrapUpList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTotalSize(), other.isSetTotalSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalSize, other.totalSize);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMessageBoxWrapUpResponse(");
    boolean first = true;

    sb.append("messageBoxWrapUpList:");
    if (this.messageBoxWrapUpList == null) {
      sb.append("null");
    } else {
      sb.append(this.messageBoxWrapUpList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("totalSize:");
    sb.append(this.totalSize);
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

  private static class TMessageBoxWrapUpResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMessageBoxWrapUpResponseStandardScheme getScheme() {
      return new TMessageBoxWrapUpResponseStandardScheme();
    }
  }

  private static class TMessageBoxWrapUpResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMessageBoxWrapUpResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TMessageBoxWrapUpResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MESSAGE_BOX_WRAP_UP_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list526 = iprot.readListBegin();
                struct.messageBoxWrapUpList = new java.util.ArrayList<TMessageBoxWrapUp>(_list526.size);
                @org.apache.thrift.annotation.Nullable TMessageBoxWrapUp _elem527;
                for (int _i528 = 0; _i528 < _list526.size; ++_i528)
                {
                  _elem527 = new TMessageBoxWrapUp();
                  _elem527.read(iprot);
                  struct.messageBoxWrapUpList.add(_elem527);
                }
                iprot.readListEnd();
              }
              struct.setMessageBoxWrapUpListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOTAL_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.totalSize = iprot.readI32();
              struct.setTotalSizeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TMessageBoxWrapUpResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.messageBoxWrapUpList != null) {
        oprot.writeFieldBegin(MESSAGE_BOX_WRAP_UP_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.messageBoxWrapUpList.size()));
          for (TMessageBoxWrapUp _iter529 : struct.messageBoxWrapUpList)
          {
            _iter529.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TOTAL_SIZE_FIELD_DESC);
      oprot.writeI32(struct.totalSize);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMessageBoxWrapUpResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMessageBoxWrapUpResponseTupleScheme getScheme() {
      return new TMessageBoxWrapUpResponseTupleScheme();
    }
  }

  private static class TMessageBoxWrapUpResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMessageBoxWrapUpResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMessageBoxWrapUpResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMessageBoxWrapUpList()) {
        optionals.set(0);
      }
      if (struct.isSetTotalSize()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMessageBoxWrapUpList()) {
        {
          oprot.writeI32(struct.messageBoxWrapUpList.size());
          for (TMessageBoxWrapUp _iter530 : struct.messageBoxWrapUpList)
          {
            _iter530.write(oprot);
          }
        }
      }
      if (struct.isSetTotalSize()) {
        oprot.writeI32(struct.totalSize);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMessageBoxWrapUpResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list531 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.messageBoxWrapUpList = new java.util.ArrayList<TMessageBoxWrapUp>(_list531.size);
          @org.apache.thrift.annotation.Nullable TMessageBoxWrapUp _elem532;
          for (int _i533 = 0; _i533 < _list531.size; ++_i533)
          {
            _elem532 = new TMessageBoxWrapUp();
            _elem532.read(iprot);
            struct.messageBoxWrapUpList.add(_elem532);
          }
        }
        struct.setMessageBoxWrapUpListIsSet(true);
      }
      if (incoming.get(1)) {
        struct.totalSize = iprot.readI32();
        struct.setTotalSizeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

