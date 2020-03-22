/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class TMessageBoxWrapUp implements org.apache.thrift.TBase<TMessageBoxWrapUp, TMessageBoxWrapUp._Fields>, java.io.Serializable, Cloneable, Comparable<TMessageBoxWrapUp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMessageBoxWrapUp");

  private static final org.apache.thrift.protocol.TField MESSAGE_BOX_FIELD_DESC = new org.apache.thrift.protocol.TField("messageBox", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CONTACTS_FIELD_DESC = new org.apache.thrift.protocol.TField("contacts", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField PICTURE_REVISION_FIELD_DESC = new org.apache.thrift.protocol.TField("pictureRevision", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMessageBoxWrapUpStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMessageBoxWrapUpTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable TMessageBox messageBox; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String name; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<Contact> contacts; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String pictureRevision; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MESSAGE_BOX((short)1, "messageBox"),
    NAME((short)2, "name"),
    CONTACTS((short)3, "contacts"),
    PICTURE_REVISION((short)4, "pictureRevision");

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
        case 1: // MESSAGE_BOX
          return MESSAGE_BOX;
        case 2: // NAME
          return NAME;
        case 3: // CONTACTS
          return CONTACTS;
        case 4: // PICTURE_REVISION
          return PICTURE_REVISION;
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
    tmpMap.put(_Fields.MESSAGE_BOX, new org.apache.thrift.meta_data.FieldMetaData("messageBox", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TMessageBox.class)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTACTS, new org.apache.thrift.meta_data.FieldMetaData("contacts", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Contact.class))));
    tmpMap.put(_Fields.PICTURE_REVISION, new org.apache.thrift.meta_data.FieldMetaData("pictureRevision", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMessageBoxWrapUp.class, metaDataMap);
  }

  public TMessageBoxWrapUp() {
  }

  public TMessageBoxWrapUp(
    TMessageBox messageBox,
    java.lang.String name,
    java.util.List<Contact> contacts,
    java.lang.String pictureRevision)
  {
    this();
    this.messageBox = messageBox;
    this.name = name;
    this.contacts = contacts;
    this.pictureRevision = pictureRevision;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMessageBoxWrapUp(TMessageBoxWrapUp other) {
    if (other.isSetMessageBox()) {
      this.messageBox = new TMessageBox(other.messageBox);
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetContacts()) {
      java.util.List<Contact> __this__contacts = new java.util.ArrayList<Contact>(other.contacts.size());
      for (Contact other_element : other.contacts) {
        __this__contacts.add(new Contact(other_element));
      }
      this.contacts = __this__contacts;
    }
    if (other.isSetPictureRevision()) {
      this.pictureRevision = other.pictureRevision;
    }
  }

  public TMessageBoxWrapUp deepCopy() {
    return new TMessageBoxWrapUp(this);
  }

  @Override
  public void clear() {
    this.messageBox = null;
    this.name = null;
    this.contacts = null;
    this.pictureRevision = null;
  }

  @org.apache.thrift.annotation.Nullable
  public TMessageBox getMessageBox() {
    return this.messageBox;
  }

  public TMessageBoxWrapUp setMessageBox(@org.apache.thrift.annotation.Nullable TMessageBox messageBox) {
    this.messageBox = messageBox;
    return this;
  }

  public void unsetMessageBox() {
    this.messageBox = null;
  }

  /** Returns true if field messageBox is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageBox() {
    return this.messageBox != null;
  }

  public void setMessageBoxIsSet(boolean value) {
    if (!value) {
      this.messageBox = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public TMessageBoxWrapUp setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getContactsSize() {
    return (this.contacts == null) ? 0 : this.contacts.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<Contact> getContactsIterator() {
    return (this.contacts == null) ? null : this.contacts.iterator();
  }

  public void addToContacts(Contact elem) {
    if (this.contacts == null) {
      this.contacts = new java.util.ArrayList<Contact>();
    }
    this.contacts.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<Contact> getContacts() {
    return this.contacts;
  }

  public TMessageBoxWrapUp setContacts(@org.apache.thrift.annotation.Nullable java.util.List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public void unsetContacts() {
    this.contacts = null;
  }

  /** Returns true if field contacts is set (has been assigned a value) and false otherwise */
  public boolean isSetContacts() {
    return this.contacts != null;
  }

  public void setContactsIsSet(boolean value) {
    if (!value) {
      this.contacts = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPictureRevision() {
    return this.pictureRevision;
  }

  public TMessageBoxWrapUp setPictureRevision(@org.apache.thrift.annotation.Nullable java.lang.String pictureRevision) {
    this.pictureRevision = pictureRevision;
    return this;
  }

  public void unsetPictureRevision() {
    this.pictureRevision = null;
  }

  /** Returns true if field pictureRevision is set (has been assigned a value) and false otherwise */
  public boolean isSetPictureRevision() {
    return this.pictureRevision != null;
  }

  public void setPictureRevisionIsSet(boolean value) {
    if (!value) {
      this.pictureRevision = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case MESSAGE_BOX:
      if (value == null) {
        unsetMessageBox();
      } else {
        setMessageBox((TMessageBox)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case CONTACTS:
      if (value == null) {
        unsetContacts();
      } else {
        setContacts((java.util.List<Contact>)value);
      }
      break;

    case PICTURE_REVISION:
      if (value == null) {
        unsetPictureRevision();
      } else {
        setPictureRevision((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MESSAGE_BOX:
      return getMessageBox();

    case NAME:
      return getName();

    case CONTACTS:
      return getContacts();

    case PICTURE_REVISION:
      return getPictureRevision();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case MESSAGE_BOX:
      return isSetMessageBox();
    case NAME:
      return isSetName();
    case CONTACTS:
      return isSetContacts();
    case PICTURE_REVISION:
      return isSetPictureRevision();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TMessageBoxWrapUp)
      return this.equals((TMessageBoxWrapUp)that);
    return false;
  }

  public boolean equals(TMessageBoxWrapUp that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_messageBox = true && this.isSetMessageBox();
    boolean that_present_messageBox = true && that.isSetMessageBox();
    if (this_present_messageBox || that_present_messageBox) {
      if (!(this_present_messageBox && that_present_messageBox))
        return false;
      if (!this.messageBox.equals(that.messageBox))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_contacts = true && this.isSetContacts();
    boolean that_present_contacts = true && that.isSetContacts();
    if (this_present_contacts || that_present_contacts) {
      if (!(this_present_contacts && that_present_contacts))
        return false;
      if (!this.contacts.equals(that.contacts))
        return false;
    }

    boolean this_present_pictureRevision = true && this.isSetPictureRevision();
    boolean that_present_pictureRevision = true && that.isSetPictureRevision();
    if (this_present_pictureRevision || that_present_pictureRevision) {
      if (!(this_present_pictureRevision && that_present_pictureRevision))
        return false;
      if (!this.pictureRevision.equals(that.pictureRevision))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMessageBox()) ? 131071 : 524287);
    if (isSetMessageBox())
      hashCode = hashCode * 8191 + messageBox.hashCode();

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetContacts()) ? 131071 : 524287);
    if (isSetContacts())
      hashCode = hashCode * 8191 + contacts.hashCode();

    hashCode = hashCode * 8191 + ((isSetPictureRevision()) ? 131071 : 524287);
    if (isSetPictureRevision())
      hashCode = hashCode * 8191 + pictureRevision.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TMessageBoxWrapUp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetMessageBox(), other.isSetMessageBox());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageBox()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messageBox, other.messageBox);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetName(), other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetContacts(), other.isSetContacts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContacts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contacts, other.contacts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPictureRevision(), other.isSetPictureRevision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPictureRevision()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pictureRevision, other.pictureRevision);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMessageBoxWrapUp(");
    boolean first = true;

    sb.append("messageBox:");
    if (this.messageBox == null) {
      sb.append("null");
    } else {
      sb.append(this.messageBox);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("contacts:");
    if (this.contacts == null) {
      sb.append("null");
    } else {
      sb.append(this.contacts);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("pictureRevision:");
    if (this.pictureRevision == null) {
      sb.append("null");
    } else {
      sb.append(this.pictureRevision);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (messageBox != null) {
      messageBox.validate();
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

  private static class TMessageBoxWrapUpStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMessageBoxWrapUpStandardScheme getScheme() {
      return new TMessageBoxWrapUpStandardScheme();
    }
  }

  private static class TMessageBoxWrapUpStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMessageBoxWrapUp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TMessageBoxWrapUp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MESSAGE_BOX
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.messageBox = new TMessageBox();
              struct.messageBox.read(iprot);
              struct.setMessageBoxIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONTACTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list518 = iprot.readListBegin();
                struct.contacts = new java.util.ArrayList<Contact>(_list518.size);
                @org.apache.thrift.annotation.Nullable Contact _elem519;
                for (int _i520 = 0; _i520 < _list518.size; ++_i520)
                {
                  _elem519 = new Contact();
                  _elem519.read(iprot);
                  struct.contacts.add(_elem519);
                }
                iprot.readListEnd();
              }
              struct.setContactsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PICTURE_REVISION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pictureRevision = iprot.readString();
              struct.setPictureRevisionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TMessageBoxWrapUp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.messageBox != null) {
        oprot.writeFieldBegin(MESSAGE_BOX_FIELD_DESC);
        struct.messageBox.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.contacts != null) {
        oprot.writeFieldBegin(CONTACTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.contacts.size()));
          for (Contact _iter521 : struct.contacts)
          {
            _iter521.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.pictureRevision != null) {
        oprot.writeFieldBegin(PICTURE_REVISION_FIELD_DESC);
        oprot.writeString(struct.pictureRevision);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMessageBoxWrapUpTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMessageBoxWrapUpTupleScheme getScheme() {
      return new TMessageBoxWrapUpTupleScheme();
    }
  }

  private static class TMessageBoxWrapUpTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMessageBoxWrapUp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMessageBoxWrapUp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMessageBox()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetContacts()) {
        optionals.set(2);
      }
      if (struct.isSetPictureRevision()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetMessageBox()) {
        struct.messageBox.write(oprot);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetContacts()) {
        {
          oprot.writeI32(struct.contacts.size());
          for (Contact _iter522 : struct.contacts)
          {
            _iter522.write(oprot);
          }
        }
      }
      if (struct.isSetPictureRevision()) {
        oprot.writeString(struct.pictureRevision);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMessageBoxWrapUp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.messageBox = new TMessageBox();
        struct.messageBox.read(iprot);
        struct.setMessageBoxIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list523 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.contacts = new java.util.ArrayList<Contact>(_list523.size);
          @org.apache.thrift.annotation.Nullable Contact _elem524;
          for (int _i525 = 0; _i525 < _list523.size; ++_i525)
          {
            _elem524 = new Contact();
            _elem524.read(iprot);
            struct.contacts.add(_elem524);
          }
        }
        struct.setContactsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.pictureRevision = iprot.readString();
        struct.setPictureRevisionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

