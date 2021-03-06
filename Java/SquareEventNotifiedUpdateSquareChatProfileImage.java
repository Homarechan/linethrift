/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class SquareEventNotifiedUpdateSquareChatProfileImage implements org.apache.thrift.TBase<SquareEventNotifiedUpdateSquareChatProfileImage, SquareEventNotifiedUpdateSquareChatProfileImage._Fields>, java.io.Serializable, Cloneable, Comparable<SquareEventNotifiedUpdateSquareChatProfileImage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareEventNotifiedUpdateSquareChatProfileImage");

  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatMid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField EDITOR_FIELD_DESC = new org.apache.thrift.protocol.TField("editor", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SquareEventNotifiedUpdateSquareChatProfileImageStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SquareEventNotifiedUpdateSquareChatProfileImageTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String squareChatMid; // required
  public @org.apache.thrift.annotation.Nullable SquareMember editor; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_CHAT_MID((short)1, "squareChatMid"),
    EDITOR((short)2, "editor");

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
        case 1: // SQUARE_CHAT_MID
          return SQUARE_CHAT_MID;
        case 2: // EDITOR
          return EDITOR;
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
    tmpMap.put(_Fields.SQUARE_CHAT_MID, new org.apache.thrift.meta_data.FieldMetaData("squareChatMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EDITOR, new org.apache.thrift.meta_data.FieldMetaData("editor", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareMember.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareEventNotifiedUpdateSquareChatProfileImage.class, metaDataMap);
  }

  public SquareEventNotifiedUpdateSquareChatProfileImage() {
  }

  public SquareEventNotifiedUpdateSquareChatProfileImage(
    java.lang.String squareChatMid,
    SquareMember editor)
  {
    this();
    this.squareChatMid = squareChatMid;
    this.editor = editor;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareEventNotifiedUpdateSquareChatProfileImage(SquareEventNotifiedUpdateSquareChatProfileImage other) {
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
    if (other.isSetEditor()) {
      this.editor = new SquareMember(other.editor);
    }
  }

  public SquareEventNotifiedUpdateSquareChatProfileImage deepCopy() {
    return new SquareEventNotifiedUpdateSquareChatProfileImage(this);
  }

  @Override
  public void clear() {
    this.squareChatMid = null;
    this.editor = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSquareChatMid() {
    return this.squareChatMid;
  }

  public SquareEventNotifiedUpdateSquareChatProfileImage setSquareChatMid(@org.apache.thrift.annotation.Nullable java.lang.String squareChatMid) {
    this.squareChatMid = squareChatMid;
    return this;
  }

  public void unsetSquareChatMid() {
    this.squareChatMid = null;
  }

  /** Returns true if field squareChatMid is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChatMid() {
    return this.squareChatMid != null;
  }

  public void setSquareChatMidIsSet(boolean value) {
    if (!value) {
      this.squareChatMid = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public SquareMember getEditor() {
    return this.editor;
  }

  public SquareEventNotifiedUpdateSquareChatProfileImage setEditor(@org.apache.thrift.annotation.Nullable SquareMember editor) {
    this.editor = editor;
    return this;
  }

  public void unsetEditor() {
    this.editor = null;
  }

  /** Returns true if field editor is set (has been assigned a value) and false otherwise */
  public boolean isSetEditor() {
    return this.editor != null;
  }

  public void setEditorIsSet(boolean value) {
    if (!value) {
      this.editor = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SQUARE_CHAT_MID:
      if (value == null) {
        unsetSquareChatMid();
      } else {
        setSquareChatMid((java.lang.String)value);
      }
      break;

    case EDITOR:
      if (value == null) {
        unsetEditor();
      } else {
        setEditor((SquareMember)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_CHAT_MID:
      return getSquareChatMid();

    case EDITOR:
      return getEditor();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SQUARE_CHAT_MID:
      return isSetSquareChatMid();
    case EDITOR:
      return isSetEditor();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof SquareEventNotifiedUpdateSquareChatProfileImage)
      return this.equals((SquareEventNotifiedUpdateSquareChatProfileImage)that);
    return false;
  }

  public boolean equals(SquareEventNotifiedUpdateSquareChatProfileImage that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareChatMid = true && this.isSetSquareChatMid();
    boolean that_present_squareChatMid = true && that.isSetSquareChatMid();
    if (this_present_squareChatMid || that_present_squareChatMid) {
      if (!(this_present_squareChatMid && that_present_squareChatMid))
        return false;
      if (!this.squareChatMid.equals(that.squareChatMid))
        return false;
    }

    boolean this_present_editor = true && this.isSetEditor();
    boolean that_present_editor = true && that.isSetEditor();
    if (this_present_editor || that_present_editor) {
      if (!(this_present_editor && that_present_editor))
        return false;
      if (!this.editor.equals(that.editor))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSquareChatMid()) ? 131071 : 524287);
    if (isSetSquareChatMid())
      hashCode = hashCode * 8191 + squareChatMid.hashCode();

    hashCode = hashCode * 8191 + ((isSetEditor()) ? 131071 : 524287);
    if (isSetEditor())
      hashCode = hashCode * 8191 + editor.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SquareEventNotifiedUpdateSquareChatProfileImage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetSquareChatMid(), other.isSetSquareChatMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareChatMid, other.squareChatMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEditor(), other.isSetEditor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEditor()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.editor, other.editor);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SquareEventNotifiedUpdateSquareChatProfileImage(");
    boolean first = true;

    sb.append("squareChatMid:");
    if (this.squareChatMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("editor:");
    if (this.editor == null) {
      sb.append("null");
    } else {
      sb.append(this.editor);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (editor != null) {
      editor.validate();
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

  private static class SquareEventNotifiedUpdateSquareChatProfileImageStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareEventNotifiedUpdateSquareChatProfileImageStandardScheme getScheme() {
      return new SquareEventNotifiedUpdateSquareChatProfileImageStandardScheme();
    }
  }

  private static class SquareEventNotifiedUpdateSquareChatProfileImageStandardScheme extends org.apache.thrift.scheme.StandardScheme<SquareEventNotifiedUpdateSquareChatProfileImage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareEventNotifiedUpdateSquareChatProfileImage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SQUARE_CHAT_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.squareChatMid = iprot.readString();
              struct.setSquareChatMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EDITOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.editor = new SquareMember();
              struct.editor.read(iprot);
              struct.setEditorIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareEventNotifiedUpdateSquareChatProfileImage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareChatMid != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
        oprot.writeString(struct.squareChatMid);
        oprot.writeFieldEnd();
      }
      if (struct.editor != null) {
        oprot.writeFieldBegin(EDITOR_FIELD_DESC);
        struct.editor.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareEventNotifiedUpdateSquareChatProfileImageTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareEventNotifiedUpdateSquareChatProfileImageTupleScheme getScheme() {
      return new SquareEventNotifiedUpdateSquareChatProfileImageTupleScheme();
    }
  }

  private static class SquareEventNotifiedUpdateSquareChatProfileImageTupleScheme extends org.apache.thrift.scheme.TupleScheme<SquareEventNotifiedUpdateSquareChatProfileImage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareEventNotifiedUpdateSquareChatProfileImage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSquareChatMid()) {
        optionals.set(0);
      }
      if (struct.isSetEditor()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSquareChatMid()) {
        oprot.writeString(struct.squareChatMid);
      }
      if (struct.isSetEditor()) {
        struct.editor.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareEventNotifiedUpdateSquareChatProfileImage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.squareChatMid = iprot.readString();
        struct.setSquareChatMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.editor = new SquareMember();
        struct.editor.read(iprot);
        struct.setEditorIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

