/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import java.util.Hashtable;
import java.util.Vector;
import java.util.Enumeration;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class BuddySearchResult implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("BuddySearchResult");

  private static final TField MID_FIELD_DESC = new TField("mid", TType.STRING, (short)1);
  private static final TField DISPLAY_NAME_FIELD_DESC = new TField("displayName", TType.STRING, (short)2);
  private static final TField PICTURE_STATUS_FIELD_DESC = new TField("pictureStatus", TType.STRING, (short)3);
  private static final TField PICTURE_PATH_FIELD_DESC = new TField("picturePath", TType.STRING, (short)4);
  private static final TField STATUS_MESSAGE_FIELD_DESC = new TField("statusMessage", TType.STRING, (short)5);
  private static final TField BUSINESS_ACCOUNT_FIELD_DESC = new TField("businessAccount", TType.BOOL, (short)6);

  private String mid;
  private String displayName;
  private String pictureStatus;
  private String picturePath;
  private String statusMessage;
  private boolean businessAccount;

  // isset id assignments
  private static final int __BUSINESSACCOUNT_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public BuddySearchResult() {
  }

  public BuddySearchResult(
    String mid,
    String displayName,
    String pictureStatus,
    String picturePath,
    String statusMessage,
    boolean businessAccount)
  {
    this();
    this.mid = mid;
    this.displayName = displayName;
    this.pictureStatus = pictureStatus;
    this.picturePath = picturePath;
    this.statusMessage = statusMessage;
    this.businessAccount = businessAccount;
    setBusinessAccountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuddySearchResult(BuddySearchResult other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
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
  }

  public BuddySearchResult deepCopy() {
    return new BuddySearchResult(this);
  }

  public void clear() {
    this.mid = null;
    this.displayName = null;
    this.pictureStatus = null;
    this.picturePath = null;
    this.statusMessage = null;
    setBusinessAccountIsSet(false);
    this.businessAccount = false;
  }

  public String getMid() {
    return this.mid;
  }

  public void setMid(String mid) {
    this.mid = mid;
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

  public String getDisplayName() {
    return this.displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
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

  public String getPictureStatus() {
    return this.pictureStatus;
  }

  public void setPictureStatus(String pictureStatus) {
    this.pictureStatus = pictureStatus;
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

  public String getPicturePath() {
    return this.picturePath;
  }

  public void setPicturePath(String picturePath) {
    this.picturePath = picturePath;
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

  public String getStatusMessage() {
    return this.statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
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

  public void setBusinessAccount(boolean businessAccount) {
    this.businessAccount = businessAccount;
    setBusinessAccountIsSet(true);
  }

  public void unsetBusinessAccount() {
    __isset_vector[__BUSINESSACCOUNT_ISSET_ID] = false;
  }

  /** Returns true if field businessAccount is set (has been assigned a value) and false otherwise */
  public boolean isSetBusinessAccount() {
    return __isset_vector[__BUSINESSACCOUNT_ISSET_ID];
  }

  public void setBusinessAccountIsSet(boolean value) {
    __isset_vector[__BUSINESSACCOUNT_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
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

    return true;
  }

  public int hashCode() {
    return 0;
  }

  public int compareTo(Object otherObject) {
    if (!getClass().equals(otherObject.getClass())) {
      return getClass().getName().compareTo(otherObject.getClass().getName());
    }

    BuddySearchResult other = (BuddySearchResult)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetMid(), other.isSetMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMid()) {
      lastComparison = TBaseHelper.compareTo(this.mid, other.mid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetDisplayName(), other.isSetDisplayName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayName()) {
      lastComparison = TBaseHelper.compareTo(this.displayName, other.displayName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetPictureStatus(), other.isSetPictureStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPictureStatus()) {
      lastComparison = TBaseHelper.compareTo(this.pictureStatus, other.pictureStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetPicturePath(), other.isSetPicturePath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPicturePath()) {
      lastComparison = TBaseHelper.compareTo(this.picturePath, other.picturePath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetStatusMessage(), other.isSetStatusMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatusMessage()) {
      lastComparison = TBaseHelper.compareTo(this.statusMessage, other.statusMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetBusinessAccount(), other.isSetBusinessAccount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBusinessAccount()) {
      lastComparison = TBaseHelper.compareTo(this.businessAccount, other.businessAccount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // MID
          if (field.type == TType.STRING) {
            this.mid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // DISPLAY_NAME
          if (field.type == TType.STRING) {
            this.displayName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // PICTURE_STATUS
          if (field.type == TType.STRING) {
            this.pictureStatus = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // PICTURE_PATH
          if (field.type == TType.STRING) {
            this.picturePath = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // STATUS_MESSAGE
          if (field.type == TType.STRING) {
            this.statusMessage = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // BUSINESS_ACCOUNT
          if (field.type == TType.BOOL) {
            this.businessAccount = iprot.readBool();
            setBusinessAccountIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.mid != null) {
      oprot.writeFieldBegin(MID_FIELD_DESC);
      oprot.writeString(this.mid);
      oprot.writeFieldEnd();
    }
    if (this.displayName != null) {
      oprot.writeFieldBegin(DISPLAY_NAME_FIELD_DESC);
      oprot.writeString(this.displayName);
      oprot.writeFieldEnd();
    }
    if (this.pictureStatus != null) {
      oprot.writeFieldBegin(PICTURE_STATUS_FIELD_DESC);
      oprot.writeString(this.pictureStatus);
      oprot.writeFieldEnd();
    }
    if (this.picturePath != null) {
      oprot.writeFieldBegin(PICTURE_PATH_FIELD_DESC);
      oprot.writeString(this.picturePath);
      oprot.writeFieldEnd();
    }
    if (this.statusMessage != null) {
      oprot.writeFieldBegin(STATUS_MESSAGE_FIELD_DESC);
      oprot.writeString(this.statusMessage);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(BUSINESS_ACCOUNT_FIELD_DESC);
    oprot.writeBool(this.businessAccount);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("BuddySearchResult(");
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
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
