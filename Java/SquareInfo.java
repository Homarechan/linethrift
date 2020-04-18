/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2020-04-18")
public class SquareInfo implements org.apache.thrift.TBase<SquareInfo, SquareInfo._Fields>, java.io.Serializable, Cloneable, Comparable<SquareInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareInfo");

  private static final org.apache.thrift.protocol.TField SQUARE_FIELD_DESC = new org.apache.thrift.protocol.TField("square", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SQUARE_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("squareStatus", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField SQUARE_NOTE_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("squareNoteStatus", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SquareInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SquareInfoTupleSchemeFactory();

  public Square square; // required
  public SquareStatus squareStatus; // required
  public NoteStatus squareNoteStatus; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE((short)1, "square"),
    SQUARE_STATUS((short)2, "squareStatus"),
    SQUARE_NOTE_STATUS((short)3, "squareNoteStatus");

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
        case 1: // SQUARE
          return SQUARE;
        case 2: // SQUARE_STATUS
          return SQUARE_STATUS;
        case 3: // SQUARE_NOTE_STATUS
          return SQUARE_NOTE_STATUS;
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
    tmpMap.put(_Fields.SQUARE, new org.apache.thrift.meta_data.FieldMetaData("square", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Square.class)));
    tmpMap.put(_Fields.SQUARE_STATUS, new org.apache.thrift.meta_data.FieldMetaData("squareStatus", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareStatus.class)));
    tmpMap.put(_Fields.SQUARE_NOTE_STATUS, new org.apache.thrift.meta_data.FieldMetaData("squareNoteStatus", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NoteStatus.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareInfo.class, metaDataMap);
  }

  public SquareInfo() {
  }

  public SquareInfo(
    Square square,
    SquareStatus squareStatus,
    NoteStatus squareNoteStatus)
  {
    this();
    this.square = square;
    this.squareStatus = squareStatus;
    this.squareNoteStatus = squareNoteStatus;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareInfo(SquareInfo other) {
    if (other.isSetSquare()) {
      this.square = new Square(other.square);
    }
    if (other.isSetSquareStatus()) {
      this.squareStatus = new SquareStatus(other.squareStatus);
    }
    if (other.isSetSquareNoteStatus()) {
      this.squareNoteStatus = new NoteStatus(other.squareNoteStatus);
    }
  }

  public SquareInfo deepCopy() {
    return new SquareInfo(this);
  }

  @Override
  public void clear() {
    this.square = null;
    this.squareStatus = null;
    this.squareNoteStatus = null;
  }

  public Square getSquare() {
    return this.square;
  }

  public SquareInfo setSquare(Square square) {
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

  public SquareStatus getSquareStatus() {
    return this.squareStatus;
  }

  public SquareInfo setSquareStatus(SquareStatus squareStatus) {
    this.squareStatus = squareStatus;
    return this;
  }

  public void unsetSquareStatus() {
    this.squareStatus = null;
  }

  /** Returns true if field squareStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareStatus() {
    return this.squareStatus != null;
  }

  public void setSquareStatusIsSet(boolean value) {
    if (!value) {
      this.squareStatus = null;
    }
  }

  public NoteStatus getSquareNoteStatus() {
    return this.squareNoteStatus;
  }

  public SquareInfo setSquareNoteStatus(NoteStatus squareNoteStatus) {
    this.squareNoteStatus = squareNoteStatus;
    return this;
  }

  public void unsetSquareNoteStatus() {
    this.squareNoteStatus = null;
  }

  /** Returns true if field squareNoteStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareNoteStatus() {
    return this.squareNoteStatus != null;
  }

  public void setSquareNoteStatusIsSet(boolean value) {
    if (!value) {
      this.squareNoteStatus = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SQUARE:
      if (value == null) {
        unsetSquare();
      } else {
        setSquare((Square)value);
      }
      break;

    case SQUARE_STATUS:
      if (value == null) {
        unsetSquareStatus();
      } else {
        setSquareStatus((SquareStatus)value);
      }
      break;

    case SQUARE_NOTE_STATUS:
      if (value == null) {
        unsetSquareNoteStatus();
      } else {
        setSquareNoteStatus((NoteStatus)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE:
      return getSquare();

    case SQUARE_STATUS:
      return getSquareStatus();

    case SQUARE_NOTE_STATUS:
      return getSquareNoteStatus();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SQUARE:
      return isSetSquare();
    case SQUARE_STATUS:
      return isSetSquareStatus();
    case SQUARE_NOTE_STATUS:
      return isSetSquareNoteStatus();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareInfo)
      return this.equals((SquareInfo)that);
    return false;
  }

  public boolean equals(SquareInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_square = true && this.isSetSquare();
    boolean that_present_square = true && that.isSetSquare();
    if (this_present_square || that_present_square) {
      if (!(this_present_square && that_present_square))
        return false;
      if (!this.square.equals(that.square))
        return false;
    }

    boolean this_present_squareStatus = true && this.isSetSquareStatus();
    boolean that_present_squareStatus = true && that.isSetSquareStatus();
    if (this_present_squareStatus || that_present_squareStatus) {
      if (!(this_present_squareStatus && that_present_squareStatus))
        return false;
      if (!this.squareStatus.equals(that.squareStatus))
        return false;
    }

    boolean this_present_squareNoteStatus = true && this.isSetSquareNoteStatus();
    boolean that_present_squareNoteStatus = true && that.isSetSquareNoteStatus();
    if (this_present_squareNoteStatus || that_present_squareNoteStatus) {
      if (!(this_present_squareNoteStatus && that_present_squareNoteStatus))
        return false;
      if (!this.squareNoteStatus.equals(that.squareNoteStatus))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSquare()) ? 131071 : 524287);
    if (isSetSquare())
      hashCode = hashCode * 8191 + square.hashCode();

    hashCode = hashCode * 8191 + ((isSetSquareStatus()) ? 131071 : 524287);
    if (isSetSquareStatus())
      hashCode = hashCode * 8191 + squareStatus.hashCode();

    hashCode = hashCode * 8191 + ((isSetSquareNoteStatus()) ? 131071 : 524287);
    if (isSetSquareNoteStatus())
      hashCode = hashCode * 8191 + squareNoteStatus.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SquareInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.valueOf(isSetSquareStatus()).compareTo(other.isSetSquareStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareStatus, other.squareStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSquareNoteStatus()).compareTo(other.isSetSquareNoteStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareNoteStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareNoteStatus, other.squareNoteStatus);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SquareInfo(");
    boolean first = true;

    sb.append("square:");
    if (this.square == null) {
      sb.append("null");
    } else {
      sb.append(this.square);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareStatus:");
    if (this.squareStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.squareStatus);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareNoteStatus:");
    if (this.squareNoteStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.squareNoteStatus);
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
    if (squareStatus != null) {
      squareStatus.validate();
    }
    if (squareNoteStatus != null) {
      squareNoteStatus.validate();
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

  private static class SquareInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareInfoStandardScheme getScheme() {
      return new SquareInfoStandardScheme();
    }
  }

  private static class SquareInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<SquareInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SQUARE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.square = new Square();
              struct.square.read(iprot);
              struct.setSquareIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SQUARE_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.squareStatus = new SquareStatus();
              struct.squareStatus.read(iprot);
              struct.setSquareStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SQUARE_NOTE_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.squareNoteStatus = new NoteStatus();
              struct.squareNoteStatus.read(iprot);
              struct.setSquareNoteStatusIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.square != null) {
        oprot.writeFieldBegin(SQUARE_FIELD_DESC);
        struct.square.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.squareStatus != null) {
        oprot.writeFieldBegin(SQUARE_STATUS_FIELD_DESC);
        struct.squareStatus.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.squareNoteStatus != null) {
        oprot.writeFieldBegin(SQUARE_NOTE_STATUS_FIELD_DESC);
        struct.squareNoteStatus.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareInfoTupleScheme getScheme() {
      return new SquareInfoTupleScheme();
    }
  }

  private static class SquareInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<SquareInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSquare()) {
        optionals.set(0);
      }
      if (struct.isSetSquareStatus()) {
        optionals.set(1);
      }
      if (struct.isSetSquareNoteStatus()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSquare()) {
        struct.square.write(oprot);
      }
      if (struct.isSetSquareStatus()) {
        struct.squareStatus.write(oprot);
      }
      if (struct.isSetSquareNoteStatus()) {
        struct.squareNoteStatus.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.square = new Square();
        struct.square.read(iprot);
        struct.setSquareIsSet(true);
      }
      if (incoming.get(1)) {
        struct.squareStatus = new SquareStatus();
        struct.squareStatus.read(iprot);
        struct.setSquareStatusIsSet(true);
      }
      if (incoming.get(2)) {
        struct.squareNoteStatus = new NoteStatus();
        struct.squareNoteStatus.read(iprot);
        struct.setSquareNoteStatusIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

