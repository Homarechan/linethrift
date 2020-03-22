/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public class SyncRelations implements org.apache.thrift.TBase<SyncRelations, SyncRelations._Fields>, java.io.Serializable, Cloneable, Comparable<SyncRelations> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SyncRelations");

  private static final org.apache.thrift.protocol.TField SYNC_ALL_FIELD_DESC = new org.apache.thrift.protocol.TField("syncAll", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField SYNC_PARAM_CONTACT_FIELD_DESC = new org.apache.thrift.protocol.TField("syncParamContact", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField SYNC_PARAM_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("syncParamMid", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SyncRelationsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SyncRelationsTupleSchemeFactory();

  public boolean syncAll; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<SyncParamContact> syncParamContact; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<SyncParamMid> syncParamMid; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SYNC_ALL((short)1, "syncAll"),
    SYNC_PARAM_CONTACT((short)2, "syncParamContact"),
    SYNC_PARAM_MID((short)3, "syncParamMid");

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
        case 1: // SYNC_ALL
          return SYNC_ALL;
        case 2: // SYNC_PARAM_CONTACT
          return SYNC_PARAM_CONTACT;
        case 3: // SYNC_PARAM_MID
          return SYNC_PARAM_MID;
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
  private static final int __SYNCALL_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SYNC_ALL, new org.apache.thrift.meta_data.FieldMetaData("syncAll", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SYNC_PARAM_CONTACT, new org.apache.thrift.meta_data.FieldMetaData("syncParamContact", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SyncParamContact.class))));
    tmpMap.put(_Fields.SYNC_PARAM_MID, new org.apache.thrift.meta_data.FieldMetaData("syncParamMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SyncParamMid.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SyncRelations.class, metaDataMap);
  }

  public SyncRelations() {
  }

  public SyncRelations(
    boolean syncAll,
    java.util.List<SyncParamContact> syncParamContact,
    java.util.List<SyncParamMid> syncParamMid)
  {
    this();
    this.syncAll = syncAll;
    setSyncAllIsSet(true);
    this.syncParamContact = syncParamContact;
    this.syncParamMid = syncParamMid;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SyncRelations(SyncRelations other) {
    __isset_bitfield = other.__isset_bitfield;
    this.syncAll = other.syncAll;
    if (other.isSetSyncParamContact()) {
      java.util.List<SyncParamContact> __this__syncParamContact = new java.util.ArrayList<SyncParamContact>(other.syncParamContact.size());
      for (SyncParamContact other_element : other.syncParamContact) {
        __this__syncParamContact.add(new SyncParamContact(other_element));
      }
      this.syncParamContact = __this__syncParamContact;
    }
    if (other.isSetSyncParamMid()) {
      java.util.List<SyncParamMid> __this__syncParamMid = new java.util.ArrayList<SyncParamMid>(other.syncParamMid.size());
      for (SyncParamMid other_element : other.syncParamMid) {
        __this__syncParamMid.add(new SyncParamMid(other_element));
      }
      this.syncParamMid = __this__syncParamMid;
    }
  }

  public SyncRelations deepCopy() {
    return new SyncRelations(this);
  }

  @Override
  public void clear() {
    setSyncAllIsSet(false);
    this.syncAll = false;
    this.syncParamContact = null;
    this.syncParamMid = null;
  }

  public boolean isSyncAll() {
    return this.syncAll;
  }

  public SyncRelations setSyncAll(boolean syncAll) {
    this.syncAll = syncAll;
    setSyncAllIsSet(true);
    return this;
  }

  public void unsetSyncAll() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SYNCALL_ISSET_ID);
  }

  /** Returns true if field syncAll is set (has been assigned a value) and false otherwise */
  public boolean isSetSyncAll() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SYNCALL_ISSET_ID);
  }

  public void setSyncAllIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SYNCALL_ISSET_ID, value);
  }

  public int getSyncParamContactSize() {
    return (this.syncParamContact == null) ? 0 : this.syncParamContact.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<SyncParamContact> getSyncParamContactIterator() {
    return (this.syncParamContact == null) ? null : this.syncParamContact.iterator();
  }

  public void addToSyncParamContact(SyncParamContact elem) {
    if (this.syncParamContact == null) {
      this.syncParamContact = new java.util.ArrayList<SyncParamContact>();
    }
    this.syncParamContact.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<SyncParamContact> getSyncParamContact() {
    return this.syncParamContact;
  }

  public SyncRelations setSyncParamContact(@org.apache.thrift.annotation.Nullable java.util.List<SyncParamContact> syncParamContact) {
    this.syncParamContact = syncParamContact;
    return this;
  }

  public void unsetSyncParamContact() {
    this.syncParamContact = null;
  }

  /** Returns true if field syncParamContact is set (has been assigned a value) and false otherwise */
  public boolean isSetSyncParamContact() {
    return this.syncParamContact != null;
  }

  public void setSyncParamContactIsSet(boolean value) {
    if (!value) {
      this.syncParamContact = null;
    }
  }

  public int getSyncParamMidSize() {
    return (this.syncParamMid == null) ? 0 : this.syncParamMid.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<SyncParamMid> getSyncParamMidIterator() {
    return (this.syncParamMid == null) ? null : this.syncParamMid.iterator();
  }

  public void addToSyncParamMid(SyncParamMid elem) {
    if (this.syncParamMid == null) {
      this.syncParamMid = new java.util.ArrayList<SyncParamMid>();
    }
    this.syncParamMid.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<SyncParamMid> getSyncParamMid() {
    return this.syncParamMid;
  }

  public SyncRelations setSyncParamMid(@org.apache.thrift.annotation.Nullable java.util.List<SyncParamMid> syncParamMid) {
    this.syncParamMid = syncParamMid;
    return this;
  }

  public void unsetSyncParamMid() {
    this.syncParamMid = null;
  }

  /** Returns true if field syncParamMid is set (has been assigned a value) and false otherwise */
  public boolean isSetSyncParamMid() {
    return this.syncParamMid != null;
  }

  public void setSyncParamMidIsSet(boolean value) {
    if (!value) {
      this.syncParamMid = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SYNC_ALL:
      if (value == null) {
        unsetSyncAll();
      } else {
        setSyncAll((java.lang.Boolean)value);
      }
      break;

    case SYNC_PARAM_CONTACT:
      if (value == null) {
        unsetSyncParamContact();
      } else {
        setSyncParamContact((java.util.List<SyncParamContact>)value);
      }
      break;

    case SYNC_PARAM_MID:
      if (value == null) {
        unsetSyncParamMid();
      } else {
        setSyncParamMid((java.util.List<SyncParamMid>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SYNC_ALL:
      return isSyncAll();

    case SYNC_PARAM_CONTACT:
      return getSyncParamContact();

    case SYNC_PARAM_MID:
      return getSyncParamMid();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SYNC_ALL:
      return isSetSyncAll();
    case SYNC_PARAM_CONTACT:
      return isSetSyncParamContact();
    case SYNC_PARAM_MID:
      return isSetSyncParamMid();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof SyncRelations)
      return this.equals((SyncRelations)that);
    return false;
  }

  public boolean equals(SyncRelations that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_syncAll = true;
    boolean that_present_syncAll = true;
    if (this_present_syncAll || that_present_syncAll) {
      if (!(this_present_syncAll && that_present_syncAll))
        return false;
      if (this.syncAll != that.syncAll)
        return false;
    }

    boolean this_present_syncParamContact = true && this.isSetSyncParamContact();
    boolean that_present_syncParamContact = true && that.isSetSyncParamContact();
    if (this_present_syncParamContact || that_present_syncParamContact) {
      if (!(this_present_syncParamContact && that_present_syncParamContact))
        return false;
      if (!this.syncParamContact.equals(that.syncParamContact))
        return false;
    }

    boolean this_present_syncParamMid = true && this.isSetSyncParamMid();
    boolean that_present_syncParamMid = true && that.isSetSyncParamMid();
    if (this_present_syncParamMid || that_present_syncParamMid) {
      if (!(this_present_syncParamMid && that_present_syncParamMid))
        return false;
      if (!this.syncParamMid.equals(that.syncParamMid))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((syncAll) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetSyncParamContact()) ? 131071 : 524287);
    if (isSetSyncParamContact())
      hashCode = hashCode * 8191 + syncParamContact.hashCode();

    hashCode = hashCode * 8191 + ((isSetSyncParamMid()) ? 131071 : 524287);
    if (isSetSyncParamMid())
      hashCode = hashCode * 8191 + syncParamMid.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SyncRelations other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetSyncAll(), other.isSetSyncAll());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSyncAll()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.syncAll, other.syncAll);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSyncParamContact(), other.isSetSyncParamContact());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSyncParamContact()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.syncParamContact, other.syncParamContact);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSyncParamMid(), other.isSetSyncParamMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSyncParamMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.syncParamMid, other.syncParamMid);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SyncRelations(");
    boolean first = true;

    sb.append("syncAll:");
    sb.append(this.syncAll);
    first = false;
    if (!first) sb.append(", ");
    sb.append("syncParamContact:");
    if (this.syncParamContact == null) {
      sb.append("null");
    } else {
      sb.append(this.syncParamContact);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("syncParamMid:");
    if (this.syncParamMid == null) {
      sb.append("null");
    } else {
      sb.append(this.syncParamMid);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SyncRelationsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SyncRelationsStandardScheme getScheme() {
      return new SyncRelationsStandardScheme();
    }
  }

  private static class SyncRelationsStandardScheme extends org.apache.thrift.scheme.StandardScheme<SyncRelations> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SyncRelations struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SYNC_ALL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.syncAll = iprot.readBool();
              struct.setSyncAllIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SYNC_PARAM_CONTACT
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list552 = iprot.readListBegin();
                struct.syncParamContact = new java.util.ArrayList<SyncParamContact>(_list552.size);
                @org.apache.thrift.annotation.Nullable SyncParamContact _elem553;
                for (int _i554 = 0; _i554 < _list552.size; ++_i554)
                {
                  _elem553 = new SyncParamContact();
                  _elem553.read(iprot);
                  struct.syncParamContact.add(_elem553);
                }
                iprot.readListEnd();
              }
              struct.setSyncParamContactIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SYNC_PARAM_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list555 = iprot.readListBegin();
                struct.syncParamMid = new java.util.ArrayList<SyncParamMid>(_list555.size);
                @org.apache.thrift.annotation.Nullable SyncParamMid _elem556;
                for (int _i557 = 0; _i557 < _list555.size; ++_i557)
                {
                  _elem556 = new SyncParamMid();
                  _elem556.read(iprot);
                  struct.syncParamMid.add(_elem556);
                }
                iprot.readListEnd();
              }
              struct.setSyncParamMidIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SyncRelations struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SYNC_ALL_FIELD_DESC);
      oprot.writeBool(struct.syncAll);
      oprot.writeFieldEnd();
      if (struct.syncParamContact != null) {
        oprot.writeFieldBegin(SYNC_PARAM_CONTACT_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.syncParamContact.size()));
          for (SyncParamContact _iter558 : struct.syncParamContact)
          {
            _iter558.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.syncParamMid != null) {
        oprot.writeFieldBegin(SYNC_PARAM_MID_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.syncParamMid.size()));
          for (SyncParamMid _iter559 : struct.syncParamMid)
          {
            _iter559.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SyncRelationsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SyncRelationsTupleScheme getScheme() {
      return new SyncRelationsTupleScheme();
    }
  }

  private static class SyncRelationsTupleScheme extends org.apache.thrift.scheme.TupleScheme<SyncRelations> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SyncRelations struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSyncAll()) {
        optionals.set(0);
      }
      if (struct.isSetSyncParamContact()) {
        optionals.set(1);
      }
      if (struct.isSetSyncParamMid()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSyncAll()) {
        oprot.writeBool(struct.syncAll);
      }
      if (struct.isSetSyncParamContact()) {
        {
          oprot.writeI32(struct.syncParamContact.size());
          for (SyncParamContact _iter560 : struct.syncParamContact)
          {
            _iter560.write(oprot);
          }
        }
      }
      if (struct.isSetSyncParamMid()) {
        {
          oprot.writeI32(struct.syncParamMid.size());
          for (SyncParamMid _iter561 : struct.syncParamMid)
          {
            _iter561.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SyncRelations struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.syncAll = iprot.readBool();
        struct.setSyncAllIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list562 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.syncParamContact = new java.util.ArrayList<SyncParamContact>(_list562.size);
          @org.apache.thrift.annotation.Nullable SyncParamContact _elem563;
          for (int _i564 = 0; _i564 < _list562.size; ++_i564)
          {
            _elem563 = new SyncParamContact();
            _elem563.read(iprot);
            struct.syncParamContact.add(_elem563);
          }
        }
        struct.setSyncParamContactIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list565 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.syncParamMid = new java.util.ArrayList<SyncParamMid>(_list565.size);
          @org.apache.thrift.annotation.Nullable SyncParamMid _elem566;
          for (int _i567 = 0; _i567 < _list565.size; ++_i567)
          {
            _elem566 = new SyncParamMid();
            _elem566.read(iprot);
            struct.syncParamMid.add(_elem566);
          }
        }
        struct.setSyncParamMidIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

