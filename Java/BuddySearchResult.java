/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class BuddySearchResult implements org.apache.thrift.TBase<BuddySearchResult, BuddySearchResult._Fields>, java.io.Serializable, Cloneable, Comparable<BuddySearchResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuddySearchResult");

  private static final org.apache.thrift.protocol.TField MID_FIELD_DESC = new org.apache.thrift.protocol.TField("mid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DISPLAY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("displayName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PICTURE_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("pictureStatus", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PICTURE_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("picturePath", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField STATUS_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("statusMessage", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField BUSINESS_ACCOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("businessAccount", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField ICON_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("iconType", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField BOT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("botType", org.apache.thrift.protocol.TType.I32, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new BuddySearchResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new BuddySearchResultTupleSchemeFactory();

  public java.lang.String mid; // required
  public java.lang.String displayName; // required
  public java.lang.String pictureStatus; // required
  public java.lang.String picturePath; // required
  public java.lang.String statusMessage; // required
  public boolean businessAccount; // required
  public int iconType; // required
  /**
   * 
   * @see BotType
   */
  public BotType botType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MID((short)1, "mid"),
    DISPLAY_NAME((short)2, "displayName"),
    PICTURE_STATUS((short)3, "pictureStatus"),
    PICTURE_PATH((short)4, "picturePath"),
    STATUS_MESSAGE((short)5, "statusMessage"),
    BUSINESS_ACCOUNT((short)6, "businessAccount"),
    ICON_TYPE((short)7, "iconType"),
    /**
     * 
     * @see BotType
     */
    BOT_TYPE((short)8, "botType");

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
        case 1: // MID
          return MID;
        case 2: // DISPLAY_NAME
          return DISPLAY_NAME;
        case 3: // PICTURE_STATUS
          return PICTURE_STATUS;
        case 4: // PICTURE_PATH
          return PICTURE_PATH;
        case 5: // STATUS_MESSAGE
          return STATUS_MESSAGE;
        case 6: // BUSINESS_ACCOUNT
          return BUSINESS_ACCOUNT;
        case 7: // ICON_TYPE
          return ICON_TYPE;
        case 8: // BOT_TYPE
          return BOT_TYPE;
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
  private static final int __BUSINESSACCOUNT_ISSET_ID = 0;
  private static final int __ICONTYPE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MID, new org.apache.thrift.meta_data.FieldMetaData("mid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DISPLAY_NAME, new org.apache.thrift.meta_data.FieldMetaData("displayName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PICTURE_STATUS, new org.apache.thrift.meta_data.FieldMetaData("pictureStatus", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PICTURE_PATH, new org.apache.thrift.meta_data.FieldMetaData("picturePath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATUS_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("statusMessage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BUSINESS_ACCOUNT, new org.apache.thrift.meta_data.FieldMetaData("businessAccount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ICON_TYPE, new org.apache.thrift.meta_data.FieldMetaData("iconType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.BOT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("botType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, BotType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuddySearchResult.class, metaDataMap);
  }

  public BuddySearchResult() {
  }

  public BuddySearchResult(
    java.lang.String mid,
    java.lang.String displayName,
    java.lang.String pictureStatus,
    java.lang.String picturePath,
    java.lang.String statusMessage,
    boolean businessAccount,
    int iconType,
    BotType botType)
  {
    this();
    this.mid = mid;
    this.displayName = displayName;
    this.pictureStatus = pictureStatus;
    this.picturePath = picturePath;
    this.statusMessage = statusMessage;
    this.businessAccount = businessAccount;
    setBusinessAccountIsSet(true);
    this.iconType = iconType;
    setIconTypeIsSet(true);
    this.botType = botType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuddySearchResult(BuddySearchResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMid()) {
      this.mid = other.mid;
    }
    if (other.isSetDisplayName()) {
      this.displayName = other.displayName;
    }
    if (other.isSetPictureStatus()) {
      this.pictureStatus = other.pictureStatus;
    }
    if (other.isSetPicturePath()) {
      this.picturePath = other.picturePath;
    }
    if (other.isSetStatusMessage()) {
      this.statusMessage = other.statusMessage;
    }
    this.businessAccount = other.businessAccount;
    this.iconType = other.iconType;
    if (other.isSetBotType()) {
      this.botType = other.botType;
    }
  }

  public BuddySearchResult deepCopy() {
    return new BuddySearchResult(this);
  }

  @Override
  public void clear() {
    this.mid = null;
    this.displayName = null;
    this.pictureStatus = null;
    this.picturePath = null;
    this.statusMessage = null;
    setBusinessAccountIsSet(false);
    this.businessAccount = false;
    setIconTypeIsSet(false);
    this.iconType = 0;
    this.botType = null;
  }

  public java.lang.String getMid() {
    return this.mid;
  }

  public BuddySearchResult setMid(java.lang.String mid) {
    this.mid = mid;
    return this;
  }

  public void unsetMid() {
    this.mid = null;
  }

  /** Returns true if field mid is set (has been assigned a value) and false otherwise */
  public boolean isSetMid() {
    return this.mid != null;
  }

  public void setMidIsSet(boolean value) {
    if (!value) {
      this.mid = null;
    }
  }

  public java.lang.String getDisplayName() {
    return this.displayName;
  }

  public BuddySearchResult setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  public void unsetDisplayName() {
    this.displayName = null;
  }

  /** Returns true if field displayName is set (has been assigned a value) and false otherwise */
  public boolean isSetDisplayName() {
    return this.displayName != null;
  }

  public void setDisplayNameIsSet(boolean value) {
    if (!value) {
      this.displayName = null;
    }
  }

  public java.lang.String getPictureStatus() {
    return this.pictureStatus;
  }

  public BuddySearchResult setPictureStatus(java.lang.String pictureStatus) {
    this.pictureStatus = pictureStatus;
    return this;
  }

  public void unsetPictureStatus() {
    this.pictureStatus = null;
  }

  /** Returns true if field pictureStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetPictureStatus() {
    return this.pictureStatus != null;
  }

  public void setPictureStatusIsSet(boolean value) {
    if (!value) {
      this.pictureStatus = null;
    }
  }

  public java.lang.String getPicturePath() {
    return this.picturePath;
  }

  public BuddySearchResult setPicturePath(java.lang.String picturePath) {
    this.picturePath = picturePath;
    return this;
  }

  public void unsetPicturePath() {
    this.picturePath = null;
  }

  /** Returns true if field picturePath is set (has been assigned a value) and false otherwise */
  public boolean isSetPicturePath() {
    return this.picturePath != null;
  }

  public void setPicturePathIsSet(boolean value) {
    if (!value) {
      this.picturePath = null;
    }
  }

  public java.lang.String getStatusMessage() {
    return this.statusMessage;
  }

  public BuddySearchResult setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  public void unsetStatusMessage() {
    this.statusMessage = null;
  }

  /** Returns true if field statusMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetStatusMessage() {
    return this.statusMessage != null;
  }

  public void setStatusMessageIsSet(boolean value) {
    if (!value) {
      this.statusMessage = null;
    }
  }

  public boolean isBusinessAccount() {
    return this.businessAccount;
  }

  public BuddySearchResult setBusinessAccount(boolean businessAccount) {
    this.businessAccount = businessAccount;
    setBusinessAccountIsSet(true);
    return this;
  }

  public void unsetBusinessAccount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BUSINESSACCOUNT_ISSET_ID);
  }

  /** Returns true if field businessAccount is set (has been assigned a value) and false otherwise */
  public boolean isSetBusinessAccount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BUSINESSACCOUNT_ISSET_ID);
  }

  public void setBusinessAccountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BUSINESSACCOUNT_ISSET_ID, value);
  }

  public int getIconType() {
    return this.iconType;
  }

  public BuddySearchResult setIconType(int iconType) {
    this.iconType = iconType;
    setIconTypeIsSet(true);
    return this;
  }

  public void unsetIconType() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ICONTYPE_ISSET_ID);
  }

  /** Returns true if field iconType is set (has been assigned a value) and false otherwise */
  public boolean isSetIconType() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ICONTYPE_ISSET_ID);
  }

  public void setIconTypeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ICONTYPE_ISSET_ID, value);
  }

  /**
   * 
   * @see BotType
   */
  public BotType getBotType() {
    return this.botType;
  }

  /**
   * 
   * @see BotType
   */
  public BuddySearchResult setBotType(BotType botType) {
    this.botType = botType;
    return this;
  }

  public void unsetBotType() {
    this.botType = null;
  }

  /** Returns true if field botType is set (has been assigned a value) and false otherwise */
  public boolean isSetBotType() {
    return this.botType != null;
  }

  public void setBotTypeIsSet(boolean value) {
    if (!value) {
      this.botType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case MID:
      if (value == null) {
        unsetMid();
      } else {
        setMid((java.lang.String)value);
      }
      break;

    case DISPLAY_NAME:
      if (value == null) {
        unsetDisplayName();
      } else {
        setDisplayName((java.lang.String)value);
      }
      break;

    case PICTURE_STATUS:
      if (value == null) {
        unsetPictureStatus();
      } else {
        setPictureStatus((java.lang.String)value);
      }
      break;

    case PICTURE_PATH:
      if (value == null) {
        unsetPicturePath();
      } else {
        setPicturePath((java.lang.String)value);
      }
      break;

    case STATUS_MESSAGE:
      if (value == null) {
        unsetStatusMessage();
      } else {
        setStatusMessage((java.lang.String)value);
      }
      break;

    case BUSINESS_ACCOUNT:
      if (value == null) {
        unsetBusinessAccount();
      } else {
        setBusinessAccount((java.lang.Boolean)value);
      }
      break;

    case ICON_TYPE:
      if (value == null) {
        unsetIconType();
      } else {
        setIconType((java.lang.Integer)value);
      }
      break;

    case BOT_TYPE:
      if (value == null) {
        unsetBotType();
      } else {
        setBotType((BotType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MID:
      return getMid();

    case DISPLAY_NAME:
      return getDisplayName();

    case PICTURE_STATUS:
      return getPictureStatus();

    case PICTURE_PATH:
      return getPicturePath();

    case STATUS_MESSAGE:
      return getStatusMessage();

    case BUSINESS_ACCOUNT:
      return isBusinessAccount();

    case ICON_TYPE:
      return getIconType();

    case BOT_TYPE:
      return getBotType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case MID:
      return isSetMid();
    case DISPLAY_NAME:
      return isSetDisplayName();
    case PICTURE_STATUS:
      return isSetPictureStatus();
    case PICTURE_PATH:
      return isSetPicturePath();
    case STATUS_MESSAGE:
      return isSetStatusMessage();
    case BUSINESS_ACCOUNT:
      return isSetBusinessAccount();
    case ICON_TYPE:
      return isSetIconType();
    case BOT_TYPE:
      return isSetBotType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof BuddySearchResult)
      return this.equals((BuddySearchResult)that);
    return false;
  }

  public boolean equals(BuddySearchResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_mid = true && this.isSetMid();
    boolean that_present_mid = true && that.isSetMid();
    if (this_present_mid || that_present_mid) {
      if (!(this_present_mid && that_present_mid))
        return false;
      if (!this.mid.equals(that.mid))
        return false;
    }

    boolean this_present_displayName = true && this.isSetDisplayName();
    boolean that_present_displayName = true && that.isSetDisplayName();
    if (this_present_displayName || that_present_displayName) {
      if (!(this_present_displayName && that_present_displayName))
        return false;
      if (!this.displayName.equals(that.displayName))
        return false;
    }

    boolean this_present_pictureStatus = true && this.isSetPictureStatus();
    boolean that_present_pictureStatus = true && that.isSetPictureStatus();
    if (this_present_pictureStatus || that_present_pictureStatus) {
      if (!(this_present_pictureStatus && that_present_pictureStatus))
        return false;
      if (!this.pictureStatus.equals(that.pictureStatus))
        return false;
    }

    boolean this_present_picturePath = true && this.isSetPicturePath();
    boolean that_present_picturePath = true && that.isSetPicturePath();
    if (this_present_picturePath || that_present_picturePath) {
      if (!(this_present_picturePath && that_present_picturePath))
        return false;
      if (!this.picturePath.equals(that.picturePath))
        return false;
    }

    boolean this_present_statusMessage = true && this.isSetStatusMessage();
    boolean that_present_statusMessage = true && that.isSetStatusMessage();
    if (this_present_statusMessage || that_present_statusMessage) {
      if (!(this_present_statusMessage && that_present_statusMessage))
        return false;
      if (!this.statusMessage.equals(that.statusMessage))
        return false;
    }

    boolean this_present_businessAccount = true;
    boolean that_present_businessAccount = true;
    if (this_present_businessAccount || that_present_businessAccount) {
      if (!(this_present_businessAccount && that_present_businessAccount))
        return false;
      if (this.businessAccount != that.businessAccount)
        return false;
    }

    boolean this_present_iconType = true;
    boolean that_present_iconType = true;
    if (this_present_iconType || that_present_iconType) {
      if (!(this_present_iconType && that_present_iconType))
        return false;
      if (this.iconType != that.iconType)
        return false;
    }

    boolean this_present_botType = true && this.isSetBotType();
    boolean that_present_botType = true && that.isSetBotType();
    if (this_present_botType || that_present_botType) {
      if (!(this_present_botType && that_present_botType))
        return false;
      if (!this.botType.equals(that.botType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMid()) ? 131071 : 524287);
    if (isSetMid())
      hashCode = hashCode * 8191 + mid.hashCode();

    hashCode = hashCode * 8191 + ((isSetDisplayName()) ? 131071 : 524287);
    if (isSetDisplayName())
      hashCode = hashCode * 8191 + displayName.hashCode();

    hashCode = hashCode * 8191 + ((isSetPictureStatus()) ? 131071 : 524287);
    if (isSetPictureStatus())
      hashCode = hashCode * 8191 + pictureStatus.hashCode();

    hashCode = hashCode * 8191 + ((isSetPicturePath()) ? 131071 : 524287);
    if (isSetPicturePath())
      hashCode = hashCode * 8191 + picturePath.hashCode();

    hashCode = hashCode * 8191 + ((isSetStatusMessage()) ? 131071 : 524287);
    if (isSetStatusMessage())
      hashCode = hashCode * 8191 + statusMessage.hashCode();

    hashCode = hashCode * 8191 + ((businessAccount) ? 131071 : 524287);

    hashCode = hashCode * 8191 + iconType;

    hashCode = hashCode * 8191 + ((isSetBotType()) ? 131071 : 524287);
    if (isSetBotType())
      hashCode = hashCode * 8191 + botType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(BuddySearchResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetMid()).compareTo(other.isSetMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mid, other.mid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDisplayName()).compareTo(other.isSetDisplayName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.displayName, other.displayName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPictureStatus()).compareTo(other.isSetPictureStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPictureStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pictureStatus, other.pictureStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPicturePath()).compareTo(other.isSetPicturePath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPicturePath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.picturePath, other.picturePath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStatusMessage()).compareTo(other.isSetStatusMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatusMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statusMessage, other.statusMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBusinessAccount()).compareTo(other.isSetBusinessAccount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBusinessAccount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.businessAccount, other.businessAccount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIconType()).compareTo(other.isSetIconType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIconType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iconType, other.iconType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBotType()).compareTo(other.isSetBotType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBotType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.botType, other.botType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("BuddySearchResult(");
    boolean first = true;

    sb.append("mid:");
    if (this.mid == null) {
      sb.append("null");
    } else {
      sb.append(this.mid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("displayName:");
    if (this.displayName == null) {
      sb.append("null");
    } else {
      sb.append(this.displayName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("pictureStatus:");
    if (this.pictureStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.pictureStatus);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("picturePath:");
    if (this.picturePath == null) {
      sb.append("null");
    } else {
      sb.append(this.picturePath);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("statusMessage:");
    if (this.statusMessage == null) {
      sb.append("null");
    } else {
      sb.append(this.statusMessage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("businessAccount:");
    sb.append(this.businessAccount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("iconType:");
    sb.append(this.iconType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("botType:");
    if (this.botType == null) {
      sb.append("null");
    } else {
      sb.append(this.botType);
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

  private static class BuddySearchResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BuddySearchResultStandardScheme getScheme() {
      return new BuddySearchResultStandardScheme();
    }
  }

  private static class BuddySearchResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<BuddySearchResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuddySearchResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mid = iprot.readString();
              struct.setMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DISPLAY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.displayName = iprot.readString();
              struct.setDisplayNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PICTURE_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pictureStatus = iprot.readString();
              struct.setPictureStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PICTURE_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.picturePath = iprot.readString();
              struct.setPicturePathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STATUS_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.statusMessage = iprot.readString();
              struct.setStatusMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // BUSINESS_ACCOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.businessAccount = iprot.readBool();
              struct.setBusinessAccountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // ICON_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.iconType = iprot.readI32();
              struct.setIconTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // BOT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.botType = BotType.findByValue(iprot.readI32());
              struct.setBotTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuddySearchResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mid != null) {
        oprot.writeFieldBegin(MID_FIELD_DESC);
        oprot.writeString(struct.mid);
        oprot.writeFieldEnd();
      }
      if (struct.displayName != null) {
        oprot.writeFieldBegin(DISPLAY_NAME_FIELD_DESC);
        oprot.writeString(struct.displayName);
        oprot.writeFieldEnd();
      }
      if (struct.pictureStatus != null) {
        oprot.writeFieldBegin(PICTURE_STATUS_FIELD_DESC);
        oprot.writeString(struct.pictureStatus);
        oprot.writeFieldEnd();
      }
      if (struct.picturePath != null) {
        oprot.writeFieldBegin(PICTURE_PATH_FIELD_DESC);
        oprot.writeString(struct.picturePath);
        oprot.writeFieldEnd();
      }
      if (struct.statusMessage != null) {
        oprot.writeFieldBegin(STATUS_MESSAGE_FIELD_DESC);
        oprot.writeString(struct.statusMessage);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(BUSINESS_ACCOUNT_FIELD_DESC);
      oprot.writeBool(struct.businessAccount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ICON_TYPE_FIELD_DESC);
      oprot.writeI32(struct.iconType);
      oprot.writeFieldEnd();
      if (struct.botType != null) {
        oprot.writeFieldBegin(BOT_TYPE_FIELD_DESC);
        oprot.writeI32(struct.botType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuddySearchResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BuddySearchResultTupleScheme getScheme() {
      return new BuddySearchResultTupleScheme();
    }
  }

  private static class BuddySearchResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<BuddySearchResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuddySearchResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMid()) {
        optionals.set(0);
      }
      if (struct.isSetDisplayName()) {
        optionals.set(1);
      }
      if (struct.isSetPictureStatus()) {
        optionals.set(2);
      }
      if (struct.isSetPicturePath()) {
        optionals.set(3);
      }
      if (struct.isSetStatusMessage()) {
        optionals.set(4);
      }
      if (struct.isSetBusinessAccount()) {
        optionals.set(5);
      }
      if (struct.isSetIconType()) {
        optionals.set(6);
      }
      if (struct.isSetBotType()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetMid()) {
        oprot.writeString(struct.mid);
      }
      if (struct.isSetDisplayName()) {
        oprot.writeString(struct.displayName);
      }
      if (struct.isSetPictureStatus()) {
        oprot.writeString(struct.pictureStatus);
      }
      if (struct.isSetPicturePath()) {
        oprot.writeString(struct.picturePath);
      }
      if (struct.isSetStatusMessage()) {
        oprot.writeString(struct.statusMessage);
      }
      if (struct.isSetBusinessAccount()) {
        oprot.writeBool(struct.businessAccount);
      }
      if (struct.isSetIconType()) {
        oprot.writeI32(struct.iconType);
      }
      if (struct.isSetBotType()) {
        oprot.writeI32(struct.botType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuddySearchResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.mid = iprot.readString();
        struct.setMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.displayName = iprot.readString();
        struct.setDisplayNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.pictureStatus = iprot.readString();
        struct.setPictureStatusIsSet(true);
      }
      if (incoming.get(3)) {
        struct.picturePath = iprot.readString();
        struct.setPicturePathIsSet(true);
      }
      if (incoming.get(4)) {
        struct.statusMessage = iprot.readString();
        struct.setStatusMessageIsSet(true);
      }
      if (incoming.get(5)) {
        struct.businessAccount = iprot.readBool();
        struct.setBusinessAccountIsSet(true);
      }
      if (incoming.get(6)) {
        struct.iconType = iprot.readI32();
        struct.setIconTypeIsSet(true);
      }
      if (incoming.get(7)) {
        struct.botType = BotType.findByValue(iprot.readI32());
        struct.setBotTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
