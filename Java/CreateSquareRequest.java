/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2020-04-18")
public class CreateSquareRequest implements org.apache.thrift.TBase<CreateSquareRequest, CreateSquareRequest._Fields>, java.io.Serializable, Cloneable, Comparable<CreateSquareRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CreateSquareRequest");

  private static final org.apache.thrift.protocol.TField REQ_SEQ_FIELD_DESC = new org.apache.thrift.protocol.TField("reqSeq", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SQUARE_FIELD_DESC = new org.apache.thrift.protocol.TField("square", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField CREATOR_FIELD_DESC = new org.apache.thrift.protocol.TField("creator", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CreateSquareRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CreateSquareRequestTupleSchemeFactory();

  public int reqSeq; // required
  public Square square; // required
  public SquareMember creator; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REQ_SEQ((short)1, "reqSeq"),
    SQUARE((short)2, "square"),
    CREATOR((short)3, "creator");

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
        case 1: // REQ_SEQ
          return REQ_SEQ;
        case 2: // SQUARE
          return SQUARE;
        case 3: // CREATOR
          return CREATOR;
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
  private static final int __REQSEQ_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REQ_SEQ, new org.apache.thrift.meta_data.FieldMetaData("reqSeq", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SQUARE, new org.apache.thrift.meta_data.FieldMetaData("square", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Square.class)));
    tmpMap.put(_Fields.CREATOR, new org.apache.thrift.meta_data.FieldMetaData("creator", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareMember.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CreateSquareRequest.class, metaDataMap);
  }

  public CreateSquareRequest() {
  }

  public CreateSquareRequest(
    int reqSeq,
    Square square,
    SquareMember creator)
  {
    this();
    this.reqSeq = reqSeq;
    setReqSeqIsSet(true);
    this.square = square;
    this.creator = creator;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CreateSquareRequest(CreateSquareRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.reqSeq = other.reqSeq;
    if (other.isSetSquare()) {
      this.square = new Square(other.square);
    }
    if (other.isSetCreator()) {
      this.creator = new SquareMember(other.creator);
    }
  }

  public CreateSquareRequest deepCopy() {
    return new CreateSquareRequest(this);
  }

  @Override
  public void clear() {
    setReqSeqIsSet(false);
    this.reqSeq = 0;
    this.square = null;
    this.creator = null;
  }

  public int getReqSeq() {
    return this.reqSeq;
  }

  public CreateSquareRequest setReqSeq(int reqSeq) {
    this.reqSeq = reqSeq;
    setReqSeqIsSet(true);
    return this;
  }

  public void unsetReqSeq() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __REQSEQ_ISSET_ID);
  }

  /** Returns true if field reqSeq is set (has been assigned a value) and false otherwise */
  public boolean isSetReqSeq() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __REQSEQ_ISSET_ID);
  }

  public void setReqSeqIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __REQSEQ_ISSET_ID, value);
  }

  public Square getSquare() {
    return this.square;
  }

  public CreateSquareRequest setSquare(Square square) {
    this.square = square;
    return this;
  }

  public void unsetSquare() {
    this.square = null;
  }

  /** Returns true if field square is set (has been assigned a value) and false otherwise */
  public boolean isSetSquare() {
    return this.square != null;
  }

  public void setSquareIsSet(boolean value) {
    if (!value) {
      this.square = null;
    }
  }

  public SquareMember getCreator() {
    return this.creator;
  }

  public CreateSquareRequest setCreator(SquareMember creator) {
    this.creator = creator;
    return this;
  }

  public void unsetCreator() {
    this.creator = null;
  }

  /** Returns true if field creator is set (has been assigned a value) and false otherwise */
  public boolean isSetCreator() {
    return this.creator != null;
  }

  public void setCreatorIsSet(boolean value) {
    if (!value) {
      this.creator = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case REQ_SEQ:
      if (value == null) {
        unsetReqSeq();
      } else {
        setReqSeq((java.lang.Integer)value);
      }
      break;

    case SQUARE:
      if (value == null) {
        unsetSquare();
      } else {
        setSquare((Square)value);
      }
      break;

    case CREATOR:
      if (value == null) {
        unsetCreator();
      } else {
        setCreator((SquareMember)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case REQ_SEQ:
      return getReqSeq();

    case SQUARE:
      return getSquare();

    case CREATOR:
      return getCreator();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case REQ_SEQ:
      return isSetReqSeq();
    case SQUARE:
      return isSetSquare();
    case CREATOR:
      return isSetCreator();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof CreateSquareRequest)
      return this.equals((CreateSquareRequest)that);
    return false;
  }

  public boolean equals(CreateSquareRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_reqSeq = true;
    boolean that_present_reqSeq = true;
    if (this_present_reqSeq || that_present_reqSeq) {
      if (!(this_present_reqSeq && that_present_reqSeq))
        return false;
      if (this.reqSeq != that.reqSeq)
        return false;
    }

    boolean this_present_square = true && this.isSetSquare();
    boolean that_present_square = true && that.isSetSquare();
    if (this_present_square || that_present_square) {
      if (!(this_present_square && that_present_square))
        return false;
      if (!this.square.equals(that.square))
        return false;
    }

    boolean this_present_creator = true && this.isSetCreator();
    boolean that_present_creator = true && that.isSetCreator();
    if (this_present_creator || that_present_creator) {
      if (!(this_present_creator && that_present_creator))
        return false;
      if (!this.creator.equals(that.creator))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + reqSeq;

    hashCode = hashCode * 8191 + ((isSetSquare()) ? 131071 : 524287);
    if (isSetSquare())
      hashCode = hashCode * 8191 + square.hashCode();

    hashCode = hashCode * 8191 + ((isSetCreator()) ? 131071 : 524287);
    if (isSetCreator())
      hashCode = hashCode * 8191 + creator.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(CreateSquareRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetReqSeq()).compareTo(other.isSetReqSeq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReqSeq()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reqSeq, other.reqSeq);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSquare()).compareTo(other.isSetSquare());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquare()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.square, other.square);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCreator()).compareTo(other.isSetCreator());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreator()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.creator, other.creator);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateSquareRequest(");
    boolean first = true;

    sb.append("reqSeq:");
    sb.append(this.reqSeq);
    first = false;
    if (!first) sb.append(", ");
    sb.append("square:");
    if (this.square == null) {
      sb.append("null");
    } else {
      sb.append(this.square);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("creator:");
    if (this.creator == null) {
      sb.append("null");
    } else {
      sb.append(this.creator);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (square != null) {
      square.validate();
    }
    if (creator != null) {
      creator.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CreateSquareRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CreateSquareRequestStandardScheme getScheme() {
      return new CreateSquareRequestStandardScheme();
    }
  }

  private static class CreateSquareRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<CreateSquareRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CreateSquareRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REQ_SEQ
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.reqSeq = iprot.readI32();
              struct.setReqSeqIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SQUARE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.square = new Square();
              struct.square.read(iprot);
              struct.setSquareIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CREATOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.creator = new SquareMember();
              struct.creator.read(iprot);
              struct.setCreatorIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CreateSquareRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(REQ_SEQ_FIELD_DESC);
      oprot.writeI32(struct.reqSeq);
      oprot.writeFieldEnd();
      if (struct.square != null) {
        oprot.writeFieldBegin(SQUARE_FIELD_DESC);
        struct.square.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.creator != null) {
        oprot.writeFieldBegin(CREATOR_FIELD_DESC);
        struct.creator.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CreateSquareRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CreateSquareRequestTupleScheme getScheme() {
      return new CreateSquareRequestTupleScheme();
    }
  }

  private static class CreateSquareRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<CreateSquareRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CreateSquareRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetReqSeq()) {
        optionals.set(0);
      }
      if (struct.isSetSquare()) {
        optionals.set(1);
      }
      if (struct.isSetCreator()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetReqSeq()) {
        oprot.writeI32(struct.reqSeq);
      }
      if (struct.isSetSquare()) {
        struct.square.write(oprot);
      }
      if (struct.isSetCreator()) {
        struct.creator.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CreateSquareRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.reqSeq = iprot.readI32();
        struct.setReqSeqIsSet(true);
      }
      if (incoming.get(1)) {
        struct.square = new Square();
        struct.square.read(iprot);
        struct.setSquareIsSet(true);
      }
      if (incoming.get(2)) {
        struct.creator = new SquareMember();
        struct.creator.read(iprot);
        struct.setCreatorIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

