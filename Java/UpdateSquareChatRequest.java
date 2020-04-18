/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2020-04-18")
public class UpdateSquareChatRequest implements org.apache.thrift.TBase<UpdateSquareChatRequest, UpdateSquareChatRequest._Fields>, java.io.Serializable, Cloneable, Comparable<UpdateSquareChatRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UpdateSquareChatRequest");

  private static final org.apache.thrift.protocol.TField UPDATED_ATTRS_FIELD_DESC = new org.apache.thrift.protocol.TField("updatedAttrs", org.apache.thrift.protocol.TType.SET, (short)2);
  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChat", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UpdateSquareChatRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UpdateSquareChatRequestTupleSchemeFactory();

  public java.util.Set<SquareChatAttribute> updatedAttrs; // required
  public SquareChat squareChat; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UPDATED_ATTRS((short)2, "updatedAttrs"),
    SQUARE_CHAT((short)3, "squareChat");

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
        case 3: // SQUARE_CHAT
          return SQUARE_CHAT;
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
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SquareChatAttribute.class))));
    tmpMap.put(_Fields.SQUARE_CHAT, new org.apache.thrift.meta_data.FieldMetaData("squareChat", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareChat.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UpdateSquareChatRequest.class, metaDataMap);
  }

  public UpdateSquareChatRequest() {
  }

  public UpdateSquareChatRequest(
    java.util.Set<SquareChatAttribute> updatedAttrs,
    SquareChat squareChat)
  {
    this();
    this.updatedAttrs = updatedAttrs;
    this.squareChat = squareChat;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UpdateSquareChatRequest(UpdateSquareChatRequest other) {
    if (other.isSetUpdatedAttrs()) {
      java.util.Set<SquareChatAttribute> __this__updatedAttrs = java.util.EnumSet.noneOf(SquareChatAttribute.class);
      for (SquareChatAttribute other_element : other.updatedAttrs) {
        __this__updatedAttrs.add(other_element);
      }
      this.updatedAttrs = __this__updatedAttrs;
    }
    if (other.isSetSquareChat()) {
      this.squareChat = new SquareChat(other.squareChat);
    }
  }

  public UpdateSquareChatRequest deepCopy() {
    return new UpdateSquareChatRequest(this);
  }

  @Override
  public void clear() {
    this.updatedAttrs = null;
    this.squareChat = null;
  }

  public int getUpdatedAttrsSize() {
    return (this.updatedAttrs == null) ? 0 : this.updatedAttrs.size();
  }

  public java.util.Iterator<SquareChatAttribute> getUpdatedAttrsIterator() {
    return (this.updatedAttrs == null) ? null : this.updatedAttrs.iterator();
  }

  public void addToUpdatedAttrs(SquareChatAttribute elem) {
    if (this.updatedAttrs == null) {
      this.updatedAttrs = java.util.EnumSet.noneOf(SquareChatAttribute.class);
    }
    this.updatedAttrs.add(elem);
  }

  public java.util.Set<SquareChatAttribute> getUpdatedAttrs() {
    return this.updatedAttrs;
  }

  public UpdateSquareChatRequest setUpdatedAttrs(java.util.Set<SquareChatAttribute> updatedAttrs) {
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

  public SquareChat getSquareChat() {
    return this.squareChat;
  }

  public UpdateSquareChatRequest setSquareChat(SquareChat squareChat) {
    this.squareChat = squareChat;
    return this;
  }

  public void unsetSquareChat() {
    this.squareChat = null;
  }

  /** Returns true if field squareChat is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChat() {
    return this.squareChat != null;
  }

  public void setSquareChatIsSet(boolean value) {
    if (!value) {
      this.squareChat = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case UPDATED_ATTRS:
      if (value == null) {
        unsetUpdatedAttrs();
      } else {
        setUpdatedAttrs((java.util.Set<SquareChatAttribute>)value);
      }
      break;

    case SQUARE_CHAT:
      if (value == null) {
        unsetSquareChat();
      } else {
        setSquareChat((SquareChat)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case UPDATED_ATTRS:
      return getUpdatedAttrs();

    case SQUARE_CHAT:
      return getSquareChat();

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
    case SQUARE_CHAT:
      return isSetSquareChat();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof UpdateSquareChatRequest)
      return this.equals((UpdateSquareChatRequest)that);
    return false;
  }

  public boolean equals(UpdateSquareChatRequest that) {
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

    boolean this_present_squareChat = true && this.isSetSquareChat();
    boolean that_present_squareChat = true && that.isSetSquareChat();
    if (this_present_squareChat || that_present_squareChat) {
      if (!(this_present_squareChat && that_present_squareChat))
        return false;
      if (!this.squareChat.equals(that.squareChat))
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

    hashCode = hashCode * 8191 + ((isSetSquareChat()) ? 131071 : 524287);
    if (isSetSquareChat())
      hashCode = hashCode * 8191 + squareChat.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(UpdateSquareChatRequest other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetSquareChat()).compareTo(other.isSetSquareChat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChat()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareChat, other.squareChat);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateSquareChatRequest(");
    boolean first = true;

    sb.append("updatedAttrs:");
    if (this.updatedAttrs == null) {
      sb.append("null");
    } else {
      sb.append(this.updatedAttrs);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareChat:");
    if (this.squareChat == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChat);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (squareChat != null) {
      squareChat.validate();
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

  private static class UpdateSquareChatRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UpdateSquareChatRequestStandardScheme getScheme() {
      return new UpdateSquareChatRequestStandardScheme();
    }
  }

  private static class UpdateSquareChatRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<UpdateSquareChatRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UpdateSquareChatRequest struct) throws org.apache.thrift.TException {
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
                org.apache.thrift.protocol.TSet _set942 = iprot.readSetBegin();
                struct.updatedAttrs = java.util.EnumSet.noneOf(SquareChatAttribute.class);
                SquareChatAttribute _elem943;
                for (int _i944 = 0; _i944 < _set942.size; ++_i944)
                {
                  _elem943 = SquareChatAttribute.findByValue(iprot.readI32());
                  if (_elem943 != null)
                  {
                    struct.updatedAttrs.add(_elem943);
                  }
                }
                iprot.readSetEnd();
              }
              struct.setUpdatedAttrsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SQUARE_CHAT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.squareChat = new SquareChat();
              struct.squareChat.read(iprot);
              struct.setSquareChatIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UpdateSquareChatRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.updatedAttrs != null) {
        oprot.writeFieldBegin(UPDATED_ATTRS_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, struct.updatedAttrs.size()));
          for (SquareChatAttribute _iter945 : struct.updatedAttrs)
          {
            oprot.writeI32(_iter945.getValue());
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.squareChat != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_FIELD_DESC);
        struct.squareChat.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UpdateSquareChatRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UpdateSquareChatRequestTupleScheme getScheme() {
      return new UpdateSquareChatRequestTupleScheme();
    }
  }

  private static class UpdateSquareChatRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<UpdateSquareChatRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UpdateSquareChatRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUpdatedAttrs()) {
        optionals.set(0);
      }
      if (struct.isSetSquareChat()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUpdatedAttrs()) {
        {
          oprot.writeI32(struct.updatedAttrs.size());
          for (SquareChatAttribute _iter946 : struct.updatedAttrs)
          {
            oprot.writeI32(_iter946.getValue());
          }
        }
      }
      if (struct.isSetSquareChat()) {
        struct.squareChat.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UpdateSquareChatRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TSet _set947 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.updatedAttrs = java.util.EnumSet.noneOf(SquareChatAttribute.class);
          SquareChatAttribute _elem948;
          for (int _i949 = 0; _i949 < _set947.size; ++_i949)
          {
            _elem948 = SquareChatAttribute.findByValue(iprot.readI32());
            if (_elem948 != null)
            {
              struct.updatedAttrs.add(_elem948);
            }
          }
        }
        struct.setUpdatedAttrsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.squareChat = new SquareChat();
        struct.squareChat.read(iprot);
        struct.setSquareChatIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

