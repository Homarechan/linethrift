/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class ContactModification implements org.apache.thrift.TBase<ContactModification, ContactModification._Fields>, java.io.Serializable, Cloneable, Comparable<ContactModification> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ContactModification");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LUID_FIELD_DESC = new org.apache.thrift.protocol.TField("luid", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PHONES_FIELD_DESC = new org.apache.thrift.protocol.TField("phones", org.apache.thrift.protocol.TType.LIST, (short)11);
  private static final org.apache.thrift.protocol.TField EMAILS_FIELD_DESC = new org.apache.thrift.protocol.TField("emails", org.apache.thrift.protocol.TType.LIST, (short)12);
  private static final org.apache.thrift.protocol.TField USERIDS_FIELD_DESC = new org.apache.thrift.protocol.TField("userids", org.apache.thrift.protocol.TType.LIST, (short)13);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ContactModificationStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ContactModificationTupleSchemeFactory();

  /**
   * 
   * @see ModificationType
   */
  public @org.apache.thrift.annotation.Nullable ModificationType type; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String luid; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> phones; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> emails; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> userids; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see ModificationType
     */
    TYPE((short)1, "type"),
    LUID((short)2, "luid"),
    PHONES((short)11, "phones"),
    EMAILS((short)12, "emails"),
    USERIDS((short)13, "userids");

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
        case 1: // TYPE
          return TYPE;
        case 2: // LUID
          return LUID;
        case 11: // PHONES
          return PHONES;
        case 12: // EMAILS
          return EMAILS;
        case 13: // USERIDS
          return USERIDS;
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
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ModificationType.class)));
    tmpMap.put(_Fields.LUID, new org.apache.thrift.meta_data.FieldMetaData("luid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PHONES, new org.apache.thrift.meta_data.FieldMetaData("phones", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.EMAILS, new org.apache.thrift.meta_data.FieldMetaData("emails", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.USERIDS, new org.apache.thrift.meta_data.FieldMetaData("userids", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ContactModification.class, metaDataMap);
  }

  public ContactModification() {
  }

  public ContactModification(
    ModificationType type,
    java.lang.String luid,
    java.util.List<java.lang.String> phones,
    java.util.List<java.lang.String> emails,
    java.util.List<java.lang.String> userids)
  {
    this();
    this.type = type;
    this.luid = luid;
    this.phones = phones;
    this.emails = emails;
    this.userids = userids;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ContactModification(ContactModification other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetLuid()) {
      this.luid = other.luid;
    }
    if (other.isSetPhones()) {
      java.util.List<java.lang.String> __this__phones = new java.util.ArrayList<java.lang.String>(other.phones);
      this.phones = __this__phones;
    }
    if (other.isSetEmails()) {
      java.util.List<java.lang.String> __this__emails = new java.util.ArrayList<java.lang.String>(other.emails);
      this.emails = __this__emails;
    }
    if (other.isSetUserids()) {
      java.util.List<java.lang.String> __this__userids = new java.util.ArrayList<java.lang.String>(other.userids);
      this.userids = __this__userids;
    }
  }

  public ContactModification deepCopy() {
    return new ContactModification(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.luid = null;
    this.phones = null;
    this.emails = null;
    this.userids = null;
  }

  /**
   * 
   * @see ModificationType
   */
  @org.apache.thrift.annotation.Nullable
  public ModificationType getType() {
    return this.type;
  }

  /**
   * 
   * @see ModificationType
   */
  public ContactModification setType(@org.apache.thrift.annotation.Nullable ModificationType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getLuid() {
    return this.luid;
  }

  public ContactModification setLuid(@org.apache.thrift.annotation.Nullable java.lang.String luid) {
    this.luid = luid;
    return this;
  }

  public void unsetLuid() {
    this.luid = null;
  }

  /** Returns true if field luid is set (has been assigned a value) and false otherwise */
  public boolean isSetLuid() {
    return this.luid != null;
  }

  public void setLuidIsSet(boolean value) {
    if (!value) {
      this.luid = null;
    }
  }

  public int getPhonesSize() {
    return (this.phones == null) ? 0 : this.phones.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getPhonesIterator() {
    return (this.phones == null) ? null : this.phones.iterator();
  }

  public void addToPhones(java.lang.String elem) {
    if (this.phones == null) {
      this.phones = new java.util.ArrayList<java.lang.String>();
    }
    this.phones.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getPhones() {
    return this.phones;
  }

  public ContactModification setPhones(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> phones) {
    this.phones = phones;
    return this;
  }

  public void unsetPhones() {
    this.phones = null;
  }

  /** Returns true if field phones is set (has been assigned a value) and false otherwise */
  public boolean isSetPhones() {
    return this.phones != null;
  }

  public void setPhonesIsSet(boolean value) {
    if (!value) {
      this.phones = null;
    }
  }

  public int getEmailsSize() {
    return (this.emails == null) ? 0 : this.emails.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getEmailsIterator() {
    return (this.emails == null) ? null : this.emails.iterator();
  }

  public void addToEmails(java.lang.String elem) {
    if (this.emails == null) {
      this.emails = new java.util.ArrayList<java.lang.String>();
    }
    this.emails.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getEmails() {
    return this.emails;
  }

  public ContactModification setEmails(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> emails) {
    this.emails = emails;
    return this;
  }

  public void unsetEmails() {
    this.emails = null;
  }

  /** Returns true if field emails is set (has been assigned a value) and false otherwise */
  public boolean isSetEmails() {
    return this.emails != null;
  }

  public void setEmailsIsSet(boolean value) {
    if (!value) {
      this.emails = null;
    }
  }

  public int getUseridsSize() {
    return (this.userids == null) ? 0 : this.userids.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getUseridsIterator() {
    return (this.userids == null) ? null : this.userids.iterator();
  }

  public void addToUserids(java.lang.String elem) {
    if (this.userids == null) {
      this.userids = new java.util.ArrayList<java.lang.String>();
    }
    this.userids.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getUserids() {
    return this.userids;
  }

  public ContactModification setUserids(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> userids) {
    this.userids = userids;
    return this;
  }

  public void unsetUserids() {
    this.userids = null;
  }

  /** Returns true if field userids is set (has been assigned a value) and false otherwise */
  public boolean isSetUserids() {
    return this.userids != null;
  }

  public void setUseridsIsSet(boolean value) {
    if (!value) {
      this.userids = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((ModificationType)value);
      }
      break;

    case LUID:
      if (value == null) {
        unsetLuid();
      } else {
        setLuid((java.lang.String)value);
      }
      break;

    case PHONES:
      if (value == null) {
        unsetPhones();
      } else {
        setPhones((java.util.List<java.lang.String>)value);
      }
      break;

    case EMAILS:
      if (value == null) {
        unsetEmails();
      } else {
        setEmails((java.util.List<java.lang.String>)value);
      }
      break;

    case USERIDS:
      if (value == null) {
        unsetUserids();
      } else {
        setUserids((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case LUID:
      return getLuid();

    case PHONES:
      return getPhones();

    case EMAILS:
      return getEmails();

    case USERIDS:
      return getUserids();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case LUID:
      return isSetLuid();
    case PHONES:
      return isSetPhones();
    case EMAILS:
      return isSetEmails();
    case USERIDS:
      return isSetUserids();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ContactModification)
      return this.equals((ContactModification)that);
    return false;
  }

  public boolean equals(ContactModification that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_luid = true && this.isSetLuid();
    boolean that_present_luid = true && that.isSetLuid();
    if (this_present_luid || that_present_luid) {
      if (!(this_present_luid && that_present_luid))
        return false;
      if (!this.luid.equals(that.luid))
        return false;
    }

    boolean this_present_phones = true && this.isSetPhones();
    boolean that_present_phones = true && that.isSetPhones();
    if (this_present_phones || that_present_phones) {
      if (!(this_present_phones && that_present_phones))
        return false;
      if (!this.phones.equals(that.phones))
        return false;
    }

    boolean this_present_emails = true && this.isSetEmails();
    boolean that_present_emails = true && that.isSetEmails();
    if (this_present_emails || that_present_emails) {
      if (!(this_present_emails && that_present_emails))
        return false;
      if (!this.emails.equals(that.emails))
        return false;
    }

    boolean this_present_userids = true && this.isSetUserids();
    boolean that_present_userids = true && that.isSetUserids();
    if (this_present_userids || that_present_userids) {
      if (!(this_present_userids && that_present_userids))
        return false;
      if (!this.userids.equals(that.userids))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    hashCode = hashCode * 8191 + ((isSetLuid()) ? 131071 : 524287);
    if (isSetLuid())
      hashCode = hashCode * 8191 + luid.hashCode();

    hashCode = hashCode * 8191 + ((isSetPhones()) ? 131071 : 524287);
    if (isSetPhones())
      hashCode = hashCode * 8191 + phones.hashCode();

    hashCode = hashCode * 8191 + ((isSetEmails()) ? 131071 : 524287);
    if (isSetEmails())
      hashCode = hashCode * 8191 + emails.hashCode();

    hashCode = hashCode * 8191 + ((isSetUserids()) ? 131071 : 524287);
    if (isSetUserids())
      hashCode = hashCode * 8191 + userids.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ContactModification other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetType(), other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetLuid(), other.isSetLuid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLuid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.luid, other.luid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPhones(), other.isSetPhones());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPhones()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.phones, other.phones);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEmails(), other.isSetEmails());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmails()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.emails, other.emails);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetUserids(), other.isSetUserids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserids()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userids, other.userids);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactModification(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("luid:");
    if (this.luid == null) {
      sb.append("null");
    } else {
      sb.append(this.luid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("phones:");
    if (this.phones == null) {
      sb.append("null");
    } else {
      sb.append(this.phones);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("emails:");
    if (this.emails == null) {
      sb.append("null");
    } else {
      sb.append(this.emails);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userids:");
    if (this.userids == null) {
      sb.append("null");
    } else {
      sb.append(this.userids);
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

  private static class ContactModificationStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ContactModificationStandardScheme getScheme() {
      return new ContactModificationStandardScheme();
    }
  }

  private static class ContactModificationStandardScheme extends org.apache.thrift.scheme.StandardScheme<ContactModification> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ContactModification struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = ModificationType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LUID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.luid = iprot.readString();
              struct.setLuidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // PHONES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list226 = iprot.readListBegin();
                struct.phones = new java.util.ArrayList<java.lang.String>(_list226.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem227;
                for (int _i228 = 0; _i228 < _list226.size; ++_i228)
                {
                  _elem227 = iprot.readString();
                  struct.phones.add(_elem227);
                }
                iprot.readListEnd();
              }
              struct.setPhonesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 12: // EMAILS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list229 = iprot.readListBegin();
                struct.emails = new java.util.ArrayList<java.lang.String>(_list229.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem230;
                for (int _i231 = 0; _i231 < _list229.size; ++_i231)
                {
                  _elem230 = iprot.readString();
                  struct.emails.add(_elem230);
                }
                iprot.readListEnd();
              }
              struct.setEmailsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 13: // USERIDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list232 = iprot.readListBegin();
                struct.userids = new java.util.ArrayList<java.lang.String>(_list232.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem233;
                for (int _i234 = 0; _i234 < _list232.size; ++_i234)
                {
                  _elem233 = iprot.readString();
                  struct.userids.add(_elem233);
                }
                iprot.readListEnd();
              }
              struct.setUseridsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ContactModification struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.luid != null) {
        oprot.writeFieldBegin(LUID_FIELD_DESC);
        oprot.writeString(struct.luid);
        oprot.writeFieldEnd();
      }
      if (struct.phones != null) {
        oprot.writeFieldBegin(PHONES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.phones.size()));
          for (java.lang.String _iter235 : struct.phones)
          {
            oprot.writeString(_iter235);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.emails != null) {
        oprot.writeFieldBegin(EMAILS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.emails.size()));
          for (java.lang.String _iter236 : struct.emails)
          {
            oprot.writeString(_iter236);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.userids != null) {
        oprot.writeFieldBegin(USERIDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.userids.size()));
          for (java.lang.String _iter237 : struct.userids)
          {
            oprot.writeString(_iter237);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ContactModificationTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ContactModificationTupleScheme getScheme() {
      return new ContactModificationTupleScheme();
    }
  }

  private static class ContactModificationTupleScheme extends org.apache.thrift.scheme.TupleScheme<ContactModification> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ContactModification struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetLuid()) {
        optionals.set(1);
      }
      if (struct.isSetPhones()) {
        optionals.set(2);
      }
      if (struct.isSetEmails()) {
        optionals.set(3);
      }
      if (struct.isSetUserids()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetLuid()) {
        oprot.writeString(struct.luid);
      }
      if (struct.isSetPhones()) {
        {
          oprot.writeI32(struct.phones.size());
          for (java.lang.String _iter238 : struct.phones)
          {
            oprot.writeString(_iter238);
          }
        }
      }
      if (struct.isSetEmails()) {
        {
          oprot.writeI32(struct.emails.size());
          for (java.lang.String _iter239 : struct.emails)
          {
            oprot.writeString(_iter239);
          }
        }
      }
      if (struct.isSetUserids()) {
        {
          oprot.writeI32(struct.userids.size());
          for (java.lang.String _iter240 : struct.userids)
          {
            oprot.writeString(_iter240);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ContactModification struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.type = ModificationType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.luid = iprot.readString();
        struct.setLuidIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list241 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.phones = new java.util.ArrayList<java.lang.String>(_list241.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem242;
          for (int _i243 = 0; _i243 < _list241.size; ++_i243)
          {
            _elem242 = iprot.readString();
            struct.phones.add(_elem242);
          }
        }
        struct.setPhonesIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list244 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.emails = new java.util.ArrayList<java.lang.String>(_list244.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem245;
          for (int _i246 = 0; _i246 < _list244.size; ++_i246)
          {
            _elem245 = iprot.readString();
            struct.emails.add(_elem245);
          }
        }
        struct.setEmailsIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list247 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.userids = new java.util.ArrayList<java.lang.String>(_list247.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem248;
          for (int _i249 = 0; _i249 < _list247.size; ++_i249)
          {
            _elem248 = iprot.readString();
            struct.userids.add(_elem248);
          }
        }
        struct.setUseridsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

