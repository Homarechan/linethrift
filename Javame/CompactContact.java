/**
 * Autogenerated by Thrift Compiler (0.11.0)
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

public class CompactContact implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("CompactContact");

  private static final TField MID_FIELD_DESC = new TField("mid", TType.STRING, (short)1);
  private static final TField CREATED_TIME_FIELD_DESC = new TField("createdTime", TType.I64, (short)2);
  private static final TField MODIFIED_TIME_FIELD_DESC = new TField("modifiedTime", TType.I64, (short)3);
  private static final TField STATUS_FIELD_DESC = new TField("status", TType.I32, (short)4);
  private static final TField SETTINGS_FIELD_DESC = new TField("settings", TType.I64, (short)5);
  private static final TField DISPLAY_NAME_OVERRIDDEN_FIELD_DESC = new TField("displayNameOverridden", TType.STRING, (short)6);

  private String mid;
  private long createdTime;
  private long modifiedTime;
  private ContactStatus status;
  private long settings;
  private String displayNameOverridden;

  // isset id assignments
  private static final int __CREATEDTIME_ISSET_ID = 0;
  private static final int __MODIFIEDTIME_ISSET_ID = 1;
  private static final int __SETTINGS_ISSET_ID = 2;
  private boolean[] __isset_vector = new boolean[3];

  public CompactContact() {
  }

  public CompactContact(
    String mid,
    long createdTime,
    long modifiedTime,
    ContactStatus status,
    long settings,
    String displayNameOverridden)
  {
    this();
    this.mid = mid;
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    this.modifiedTime = modifiedTime;
    setModifiedTimeIsSet(true);
    this.status = status;
    this.settings = settings;
    setSettingsIsSet(true);
    this.displayNameOverridden = displayNameOverridden;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CompactContact(CompactContact other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetMid()) {
      this.mid = other.mid;
    }
    this.createdTime = other.createdTime;
    this.modifiedTime = other.modifiedTime;
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    this.settings = other.settings;
    if (other.isSetDisplayNameOverridden()) {
      this.displayNameOverridden = other.displayNameOverridden;
    }
  }

  public CompactContact deepCopy() {
    return new CompactContact(this);
  }

  public void clear() {
    this.mid = null;
    setCreatedTimeIsSet(false);
    this.createdTime = 0;
    setModifiedTimeIsSet(false);
    this.modifiedTime = 0;
    this.status = null;
    setSettingsIsSet(false);
    this.settings = 0;
    this.displayNameOverridden = null;
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

  public long getCreatedTime() {
    return this.createdTime;
  }

  public void setCreatedTime(long createdTime) {
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
  }

  public void unsetCreatedTime() {
    __isset_vector[__CREATEDTIME_ISSET_ID] = false;
  }

  /** Returns true if field createdTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedTime() {
    return __isset_vector[__CREATEDTIME_ISSET_ID];
  }

  public void setCreatedTimeIsSet(boolean value) {
    __isset_vector[__CREATEDTIME_ISSET_ID] = value;
  }

  public long getModifiedTime() {
    return this.modifiedTime;
  }

  public void setModifiedTime(long modifiedTime) {
    this.modifiedTime = modifiedTime;
    setModifiedTimeIsSet(true);
  }

  public void unsetModifiedTime() {
    __isset_vector[__MODIFIEDTIME_ISSET_ID] = false;
  }

  /** Returns true if field modifiedTime is set (has been assigned a value) and false otherwise */
  public boolean isSetModifiedTime() {
    return __isset_vector[__MODIFIEDTIME_ISSET_ID];
  }

  public void setModifiedTimeIsSet(boolean value) {
    __isset_vector[__MODIFIEDTIME_ISSET_ID] = value;
  }

  /**
   * 
   * @see ContactStatus
   */
  public ContactStatus getStatus() {
    return this.status;
  }

  /**
   * 
   * @see ContactStatus
   */
  public void setStatus(ContactStatus status) {
    this.status = status;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public long getSettings() {
    return this.settings;
  }

  public void setSettings(long settings) {
    this.settings = settings;
    setSettingsIsSet(true);
  }

  public void unsetSettings() {
    __isset_vector[__SETTINGS_ISSET_ID] = false;
  }

  /** Returns true if field settings is set (has been assigned a value) and false otherwise */
  public boolean isSetSettings() {
    return __isset_vector[__SETTINGS_ISSET_ID];
  }

  public void setSettingsIsSet(boolean value) {
    __isset_vector[__SETTINGS_ISSET_ID] = value;
  }

  public String getDisplayNameOverridden() {
    return this.displayNameOverridden;
  }

  public void setDisplayNameOverridden(String displayNameOverridden) {
    this.displayNameOverridden = displayNameOverridden;
  }

  public void unsetDisplayNameOverridden() {
    this.displayNameOverridden = null;
  }

  /** Returns true if field displayNameOverridden is set (has been assigned a value) and false otherwise */
  public boolean isSetDisplayNameOverridden() {
    return this.displayNameOverridden != null;
  }

  public void setDisplayNameOverriddenIsSet(boolean value) {
    if (!value) {
      this.displayNameOverridden = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CompactContact)
      return this.equals((CompactContact)that);
    return false;
  }

  public boolean equals(CompactContact that) {
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

    boolean this_present_createdTime = true;
    boolean that_present_createdTime = true;
    if (this_present_createdTime || that_present_createdTime) {
      if (!(this_present_createdTime && that_present_createdTime))
        return false;
      if (this.createdTime != that.createdTime)
        return false;
    }

    boolean this_present_modifiedTime = true;
    boolean that_present_modifiedTime = true;
    if (this_present_modifiedTime || that_present_modifiedTime) {
      if (!(this_present_modifiedTime && that_present_modifiedTime))
        return false;
      if (this.modifiedTime != that.modifiedTime)
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_settings = true;
    boolean that_present_settings = true;
    if (this_present_settings || that_present_settings) {
      if (!(this_present_settings && that_present_settings))
        return false;
      if (this.settings != that.settings)
        return false;
    }

    boolean this_present_displayNameOverridden = true && this.isSetDisplayNameOverridden();
    boolean that_present_displayNameOverridden = true && that.isSetDisplayNameOverridden();
    if (this_present_displayNameOverridden || that_present_displayNameOverridden) {
      if (!(this_present_displayNameOverridden && that_present_displayNameOverridden))
        return false;
      if (!this.displayNameOverridden.equals(that.displayNameOverridden))
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

    CompactContact other = (CompactContact)otherObject;    int lastComparison = 0;

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
    lastComparison = TBaseHelper.compareTo(isSetCreatedTime(), other.isSetCreatedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedTime()) {
      lastComparison = TBaseHelper.compareTo(this.createdTime, other.createdTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetModifiedTime(), other.isSetModifiedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetModifiedTime()) {
      lastComparison = TBaseHelper.compareTo(this.modifiedTime, other.modifiedTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetStatus(), other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSettings(), other.isSetSettings());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSettings()) {
      lastComparison = TBaseHelper.compareTo(this.settings, other.settings);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetDisplayNameOverridden(), other.isSetDisplayNameOverridden());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayNameOverridden()) {
      lastComparison = TBaseHelper.compareTo(this.displayNameOverridden, other.displayNameOverridden);
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
        case 2: // CREATED_TIME
          if (field.type == TType.I64) {
            this.createdTime = iprot.readI64();
            setCreatedTimeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // MODIFIED_TIME
          if (field.type == TType.I64) {
            this.modifiedTime = iprot.readI64();
            setModifiedTimeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // STATUS
          if (field.type == TType.I32) {
            this.status = ContactStatus.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // SETTINGS
          if (field.type == TType.I64) {
            this.settings = iprot.readI64();
            setSettingsIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // DISPLAY_NAME_OVERRIDDEN
          if (field.type == TType.STRING) {
            this.displayNameOverridden = iprot.readString();
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
    oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
    oprot.writeI64(this.createdTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(MODIFIED_TIME_FIELD_DESC);
    oprot.writeI64(this.modifiedTime);
    oprot.writeFieldEnd();
    if (this.status != null) {
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeI32(this.status.getValue());
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(SETTINGS_FIELD_DESC);
    oprot.writeI64(this.settings);
    oprot.writeFieldEnd();
    if (this.displayNameOverridden != null) {
      oprot.writeFieldBegin(DISPLAY_NAME_OVERRIDDEN_FIELD_DESC);
      oprot.writeString(this.displayNameOverridden);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("CompactContact(");
    boolean first = true;

    sb.append("mid:");
    if (this.mid == null) {
      sb.append("null");
    } else {
      sb.append(this.mid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("createdTime:");
    sb.append(this.createdTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("modifiedTime:");
    sb.append(this.modifiedTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("settings:");
    sb.append(this.settings);
    first = false;
    if (!first) sb.append(", ");
    sb.append("displayNameOverridden:");
    if (this.displayNameOverridden == null) {
      sb.append("null");
    } else {
      sb.append(this.displayNameOverridden);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

