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

public class SquareEventNotificationMemberUpdate implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("SquareEventNotificationMemberUpdate");

  private static final TField SQUARE_MID_FIELD_DESC = new TField("squareMid", TType.STRING, (short)1);
  private static final TField SQUARE_NAME_FIELD_DESC = new TField("squareName", TType.STRING, (short)2);
  private static final TField PROFILE_IMAGE_OBS_HASH_FIELD_DESC = new TField("profileImageObsHash", TType.STRING, (short)3);

  private String squareMid;
  private String squareName;
  private String profileImageObsHash;

  // isset id assignments

  public SquareEventNotificationMemberUpdate() {
  }

  public SquareEventNotificationMemberUpdate(
    String squareMid,
    String squareName,
    String profileImageObsHash)
  {
    this();
    this.squareMid = squareMid;
    this.squareName = squareName;
    this.profileImageObsHash = profileImageObsHash;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareEventNotificationMemberUpdate(SquareEventNotificationMemberUpdate other) {
    if (other.isSetSquareMid()) {
      this.squareMid = other.squareMid;
    }
    if (other.isSetSquareName()) {
      this.squareName = other.squareName;
    }
    if (other.isSetProfileImageObsHash()) {
      this.profileImageObsHash = other.profileImageObsHash;
    }
  }

  public SquareEventNotificationMemberUpdate deepCopy() {
    return new SquareEventNotificationMemberUpdate(this);
  }

  public void clear() {
    this.squareMid = null;
    this.squareName = null;
    this.profileImageObsHash = null;
  }

  public String getSquareMid() {
    return this.squareMid;
  }

  public void setSquareMid(String squareMid) {
    this.squareMid = squareMid;
  }

  public void unsetSquareMid() {
    this.squareMid = null;
  }

  /** Returns true if field squareMid is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareMid() {
    return this.squareMid != null;
  }

  public void setSquareMidIsSet(boolean value) {
    if (!value) {
      this.squareMid = null;
    }
  }

  public String getSquareName() {
    return this.squareName;
  }

  public void setSquareName(String squareName) {
    this.squareName = squareName;
  }

  public void unsetSquareName() {
    this.squareName = null;
  }

  /** Returns true if field squareName is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareName() {
    return this.squareName != null;
  }

  public void setSquareNameIsSet(boolean value) {
    if (!value) {
      this.squareName = null;
    }
  }

  public String getProfileImageObsHash() {
    return this.profileImageObsHash;
  }

  public void setProfileImageObsHash(String profileImageObsHash) {
    this.profileImageObsHash = profileImageObsHash;
  }

  public void unsetProfileImageObsHash() {
    this.profileImageObsHash = null;
  }

  /** Returns true if field profileImageObsHash is set (has been assigned a value) and false otherwise */
  public boolean isSetProfileImageObsHash() {
    return this.profileImageObsHash != null;
  }

  public void setProfileImageObsHashIsSet(boolean value) {
    if (!value) {
      this.profileImageObsHash = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareEventNotificationMemberUpdate)
      return this.equals((SquareEventNotificationMemberUpdate)that);
    return false;
  }

  public boolean equals(SquareEventNotificationMemberUpdate that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareMid = true && this.isSetSquareMid();
    boolean that_present_squareMid = true && that.isSetSquareMid();
    if (this_present_squareMid || that_present_squareMid) {
      if (!(this_present_squareMid && that_present_squareMid))
        return false;
      if (!this.squareMid.equals(that.squareMid))
        return false;
    }

    boolean this_present_squareName = true && this.isSetSquareName();
    boolean that_present_squareName = true && that.isSetSquareName();
    if (this_present_squareName || that_present_squareName) {
      if (!(this_present_squareName && that_present_squareName))
        return false;
      if (!this.squareName.equals(that.squareName))
        return false;
    }

    boolean this_present_profileImageObsHash = true && this.isSetProfileImageObsHash();
    boolean that_present_profileImageObsHash = true && that.isSetProfileImageObsHash();
    if (this_present_profileImageObsHash || that_present_profileImageObsHash) {
      if (!(this_present_profileImageObsHash && that_present_profileImageObsHash))
        return false;
      if (!this.profileImageObsHash.equals(that.profileImageObsHash))
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

    SquareEventNotificationMemberUpdate other = (SquareEventNotificationMemberUpdate)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetSquareMid(), other.isSetSquareMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareMid()) {
      lastComparison = TBaseHelper.compareTo(this.squareMid, other.squareMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSquareName(), other.isSetSquareName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareName()) {
      lastComparison = TBaseHelper.compareTo(this.squareName, other.squareName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetProfileImageObsHash(), other.isSetProfileImageObsHash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProfileImageObsHash()) {
      lastComparison = TBaseHelper.compareTo(this.profileImageObsHash, other.profileImageObsHash);
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
        case 1: // SQUARE_MID
          if (field.type == TType.STRING) {
            this.squareMid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SQUARE_NAME
          if (field.type == TType.STRING) {
            this.squareName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // PROFILE_IMAGE_OBS_HASH
          if (field.type == TType.STRING) {
            this.profileImageObsHash = iprot.readString();
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
    if (this.squareMid != null) {
      oprot.writeFieldBegin(SQUARE_MID_FIELD_DESC);
      oprot.writeString(this.squareMid);
      oprot.writeFieldEnd();
    }
    if (this.squareName != null) {
      oprot.writeFieldBegin(SQUARE_NAME_FIELD_DESC);
      oprot.writeString(this.squareName);
      oprot.writeFieldEnd();
    }
    if (this.profileImageObsHash != null) {
      oprot.writeFieldBegin(PROFILE_IMAGE_OBS_HASH_FIELD_DESC);
      oprot.writeString(this.profileImageObsHash);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("SquareEventNotificationMemberUpdate(");
    boolean first = true;

    sb.append("squareMid:");
    if (this.squareMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareName:");
    if (this.squareName == null) {
      sb.append("null");
    } else {
      sb.append(this.squareName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("profileImageObsHash:");
    if (this.profileImageObsHash == null) {
      sb.append("null");
    } else {
      sb.append(this.profileImageObsHash);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

