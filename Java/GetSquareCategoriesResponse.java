/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2020-04-18")
public class GetSquareCategoriesResponse implements org.apache.thrift.TBase<GetSquareCategoriesResponse, GetSquareCategoriesResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetSquareCategoriesResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetSquareCategoriesResponse");

  private static final org.apache.thrift.protocol.TField CATEGORY_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("categoryList", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetSquareCategoriesResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetSquareCategoriesResponseTupleSchemeFactory();

  public java.util.List<Category> categoryList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CATEGORY_LIST((short)1, "categoryList");

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
        case 1: // CATEGORY_LIST
          return CATEGORY_LIST;
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
    tmpMap.put(_Fields.CATEGORY_LIST, new org.apache.thrift.meta_data.FieldMetaData("categoryList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Category.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetSquareCategoriesResponse.class, metaDataMap);
  }

  public GetSquareCategoriesResponse() {
  }

  public GetSquareCategoriesResponse(
    java.util.List<Category> categoryList)
  {
    this();
    this.categoryList = categoryList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetSquareCategoriesResponse(GetSquareCategoriesResponse other) {
    if (other.isSetCategoryList()) {
      java.util.List<Category> __this__categoryList = new java.util.ArrayList<Category>(other.categoryList.size());
      for (Category other_element : other.categoryList) {
        __this__categoryList.add(new Category(other_element));
      }
      this.categoryList = __this__categoryList;
    }
  }

  public GetSquareCategoriesResponse deepCopy() {
    return new GetSquareCategoriesResponse(this);
  }

  @Override
  public void clear() {
    this.categoryList = null;
  }

  public int getCategoryListSize() {
    return (this.categoryList == null) ? 0 : this.categoryList.size();
  }

  public java.util.Iterator<Category> getCategoryListIterator() {
    return (this.categoryList == null) ? null : this.categoryList.iterator();
  }

  public void addToCategoryList(Category elem) {
    if (this.categoryList == null) {
      this.categoryList = new java.util.ArrayList<Category>();
    }
    this.categoryList.add(elem);
  }

  public java.util.List<Category> getCategoryList() {
    return this.categoryList;
  }

  public GetSquareCategoriesResponse setCategoryList(java.util.List<Category> categoryList) {
    this.categoryList = categoryList;
    return this;
  }

  public void unsetCategoryList() {
    this.categoryList = null;
  }

  /** Returns true if field categoryList is set (has been assigned a value) and false otherwise */
  public boolean isSetCategoryList() {
    return this.categoryList != null;
  }

  public void setCategoryListIsSet(boolean value) {
    if (!value) {
      this.categoryList = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case CATEGORY_LIST:
      if (value == null) {
        unsetCategoryList();
      } else {
        setCategoryList((java.util.List<Category>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CATEGORY_LIST:
      return getCategoryList();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CATEGORY_LIST:
      return isSetCategoryList();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GetSquareCategoriesResponse)
      return this.equals((GetSquareCategoriesResponse)that);
    return false;
  }

  public boolean equals(GetSquareCategoriesResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_categoryList = true && this.isSetCategoryList();
    boolean that_present_categoryList = true && that.isSetCategoryList();
    if (this_present_categoryList || that_present_categoryList) {
      if (!(this_present_categoryList && that_present_categoryList))
        return false;
      if (!this.categoryList.equals(that.categoryList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCategoryList()) ? 131071 : 524287);
    if (isSetCategoryList())
      hashCode = hashCode * 8191 + categoryList.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GetSquareCategoriesResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCategoryList()).compareTo(other.isSetCategoryList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCategoryList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.categoryList, other.categoryList);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetSquareCategoriesResponse(");
    boolean first = true;

    sb.append("categoryList:");
    if (this.categoryList == null) {
      sb.append("null");
    } else {
      sb.append(this.categoryList);
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

  private static class GetSquareCategoriesResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetSquareCategoriesResponseStandardScheme getScheme() {
      return new GetSquareCategoriesResponseStandardScheme();
    }
  }

  private static class GetSquareCategoriesResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetSquareCategoriesResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetSquareCategoriesResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CATEGORY_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list756 = iprot.readListBegin();
                struct.categoryList = new java.util.ArrayList<Category>(_list756.size);
                Category _elem757;
                for (int _i758 = 0; _i758 < _list756.size; ++_i758)
                {
                  _elem757 = new Category();
                  _elem757.read(iprot);
                  struct.categoryList.add(_elem757);
                }
                iprot.readListEnd();
              }
              struct.setCategoryListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetSquareCategoriesResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.categoryList != null) {
        oprot.writeFieldBegin(CATEGORY_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.categoryList.size()));
          for (Category _iter759 : struct.categoryList)
          {
            _iter759.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetSquareCategoriesResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetSquareCategoriesResponseTupleScheme getScheme() {
      return new GetSquareCategoriesResponseTupleScheme();
    }
  }

  private static class GetSquareCategoriesResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetSquareCategoriesResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetSquareCategoriesResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCategoryList()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetCategoryList()) {
        {
          oprot.writeI32(struct.categoryList.size());
          for (Category _iter760 : struct.categoryList)
          {
            _iter760.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetSquareCategoriesResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list761 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.categoryList = new java.util.ArrayList<Category>(_list761.size);
          Category _elem762;
          for (int _i763 = 0; _i763 < _list761.size; ++_i763)
          {
            _elem762 = new Category();
            _elem762.read(iprot);
            struct.categoryList.add(_elem762);
          }
        }
        struct.setCategoryListIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

