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

public class SquareChatMember implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("SquareChatMember");

  private static final TField SQUARE_MEMBER_MID_FIELD_DESC = new TField("squareMemberMid", TType.STRING, (short)1);
  private static final TField SQUARE_CHAT_MID_FIELD_DESC = new TField("squareChatMid", TType.STRING, (short)2);
  private static final TField REVISION_FIELD_DESC = new TField("revision", TType.I64, (short)3);
  private static final TField MEMBERSHIP_STATE_FIELD_DESC = new TField("membershipState", TType.I32, (short)4);
  private static final TField NOTIFICATION_FOR_MESSAGE_FIELD_DESC = new TField("notificationForMessage", TType.BOOL, (short)5);

  private String squareMemberMid;
  private String squareChatMid;
  private long revision;
  private SquareChatMembershipState membershipState;
  private boolean notificationForMessage;

  // isset id assignments
  private static final int __REVISION_ISSET_ID = 0;
  private static final int __NOTIFICATIONFORMESSAGE_ISSET_ID = 1;
  private boolean[] __isset_vector = new boolean[2];

  public SquareChatMember() {
  }

  public SquareChatMember(
    String squareMemberMid,
    String squareChatMid,
    long revision,
    SquareChatMembershipState membershipState,
    boolean notificationForMessage)
  {
    this();
    this.squareMemberMid = squareMemberMid;
    this.squareChatMid = squareChatMid;
    this.revision = revision;
    setRevisionIsSet(true);
    this.membershipState = membershipState;
    this.notificationForMessage = notificationForMessage;
    setNotificationForMessageIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareChatMember(SquareChatMember other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetSquareMemberMid()) {
      this.squareMemberMid = other.squareMemberMid;
    }
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
    this.revision = other.revision;
    if (other.isSetMembershipState()) {
      this.membershipState = other.membershipState;
    }
    this.notificationForMessage = other.notificationForMessage;
  }

  public SquareChatMember deepCopy() {
    return new SquareChatMember(this);
  }

  public void clear() {
    this.squareMemberMid = null;
    this.squareChatMid = null;
    setRevisionIsSet(false);
    this.revision = 0;
    this.membershipState = null;
    setNotificationForMessageIsSet(false);
    this.notificationForMessage = false;
  }

  public String getSquareMemberMid() {
    return this.squareMemberMid;
  }

  public void setSquareMemberMid(String squareMemberMid) {
    this.squareMemberMid = squareMemberMid;
  }

  public void unsetSquareMemberMid() {
    this.squareMemberMid = null;
  }

  /** Returns true if field squareMemberMid is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareMemberMid() {
    return this.squareMemberMid != null;
  }

  public void setSquareMemberMidIsSet(boolean value) {
    if (!value) {
      this.squareMemberMid = null;
    }
  }

  public String getSquareChatMid() {
    return this.squareChatMid;
  }

  public void setSquareChatMid(String squareChatMid) {
    this.squareChatMid = squareChatMid;
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

  public long getRevision() {
    return this.revision;
  }

  public void setRevision(long revision) {
    this.revision = revision;
    setRevisionIsSet(true);
  }

  public void unsetRevision() {
    __isset_vector[__REVISION_ISSET_ID] = false;
  }

  /** Returns true if field revision is set (has been assigned a value) and false otherwise */
  public boolean isSetRevision() {
    return __isset_vector[__REVISION_ISSET_ID];
  }

  public void setRevisionIsSet(boolean value) {
    __isset_vector[__REVISION_ISSET_ID] = value;
  }

  /**
   * 
   * @see SquareChatMembershipState
   */
  public SquareChatMembershipState getMembershipState() {
    return this.membershipState;
  }

  /**
   * 
   * @see SquareChatMembershipState
   */
  public void setMembershipState(SquareChatMembershipState membershipState) {
    this.membershipState = membershipState;
  }

  public void unsetMembershipState() {
    this.membershipState = null;
  }

  /** Returns true if field membershipState is set (has been assigned a value) and false otherwise */
  public boolean isSetMembershipState() {
    return this.membershipState != null;
  }

  public void setMembershipStateIsSet(boolean value) {
    if (!value) {
      this.membershipState = null;
    }
  }

  public boolean isNotificationForMessage() {
    return this.notificationForMessage;
  }

  public void setNotificationForMessage(boolean notificationForMessage) {
    this.notificationForMessage = notificationForMessage;
    setNotificationForMessageIsSet(true);
  }

  public void unsetNotificationForMessage() {
    __isset_vector[__NOTIFICATIONFORMESSAGE_ISSET_ID] = false;
  }

  /** Returns true if field notificationForMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetNotificationForMessage() {
    return __isset_vector[__NOTIFICATIONFORMESSAGE_ISSET_ID];
  }

  public void setNotificationForMessageIsSet(boolean value) {
    __isset_vector[__NOTIFICATIONFORMESSAGE_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareChatMember)
      return this.equals((SquareChatMember)that);
    return false;
  }

  public boolean equals(SquareChatMember that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareMemberMid = true && this.isSetSquareMemberMid();
    boolean that_present_squareMemberMid = true && that.isSetSquareMemberMid();
    if (this_present_squareMemberMid || that_present_squareMemberMid) {
      if (!(this_present_squareMemberMid && that_present_squareMemberMid))
        return false;
      if (!this.squareMemberMid.equals(that.squareMemberMid))
        return false;
    }

    boolean this_present_squareChatMid = true && this.isSetSquareChatMid();
    boolean that_present_squareChatMid = true && that.isSetSquareChatMid();
    if (this_present_squareChatMid || that_present_squareChatMid) {
      if (!(this_present_squareChatMid && that_present_squareChatMid))
        return false;
      if (!this.squareChatMid.equals(that.squareChatMid))
        return false;
    }

    boolean this_present_revision = true;
    boolean that_present_revision = true;
    if (this_present_revision || that_present_revision) {
      if (!(this_present_revision && that_present_revision))
        return false;
      if (this.revision != that.revision)
        return false;
    }

    boolean this_present_membershipState = true && this.isSetMembershipState();
    boolean that_present_membershipState = true && that.isSetMembershipState();
    if (this_present_membershipState || that_present_membershipState) {
      if (!(this_present_membershipState && that_present_membershipState))
        return false;
      if (!this.membershipState.equals(that.membershipState))
        return false;
    }

    boolean this_present_notificationForMessage = true;
    boolean that_present_notificationForMessage = true;
    if (this_present_notificationForMessage || that_present_notificationForMessage) {
      if (!(this_present_notificationForMessage && that_present_notificationForMessage))
        return false;
      if (this.notificationForMessage != that.notificationForMessage)
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

    SquareChatMember other = (SquareChatMember)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetSquareMemberMid(), other.isSetSquareMemberMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareMemberMid()) {
      lastComparison = TBaseHelper.compareTo(this.squareMemberMid, other.squareMemberMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSquareChatMid(), other.isSetSquareChatMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatMid()) {
      lastComparison = TBaseHelper.compareTo(this.squareChatMid, other.squareChatMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetRevision(), other.isSetRevision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRevision()) {
      lastComparison = TBaseHelper.compareTo(this.revision, other.revision);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetMembershipState(), other.isSetMembershipState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMembershipState()) {
      lastComparison = TBaseHelper.compareTo(this.membershipState, other.membershipState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetNotificationForMessage(), other.isSetNotificationForMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotificationForMessage()) {
      lastComparison = TBaseHelper.compareTo(this.notificationForMessage, other.notificationForMessage);
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
        case 1: // SQUARE_MEMBER_MID
          if (field.type == TType.STRING) {
            this.squareMemberMid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SQUARE_CHAT_MID
          if (field.type == TType.STRING) {
            this.squareChatMid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // REVISION
          if (field.type == TType.I64) {
            this.revision = iprot.readI64();
            setRevisionIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // MEMBERSHIP_STATE
          if (field.type == TType.I32) {
            this.membershipState = SquareChatMembershipState.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // NOTIFICATION_FOR_MESSAGE
          if (field.type == TType.BOOL) {
            this.notificationForMessage = iprot.readBool();
            setNotificationForMessageIsSet(true);
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
    if (this.squareMemberMid != null) {
      oprot.writeFieldBegin(SQUARE_MEMBER_MID_FIELD_DESC);
      oprot.writeString(this.squareMemberMid);
      oprot.writeFieldEnd();
    }
    if (this.squareChatMid != null) {
      oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
      oprot.writeString(this.squareChatMid);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(REVISION_FIELD_DESC);
    oprot.writeI64(this.revision);
    oprot.writeFieldEnd();
    if (this.membershipState != null) {
      oprot.writeFieldBegin(MEMBERSHIP_STATE_FIELD_DESC);
      oprot.writeI32(this.membershipState.getValue());
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(NOTIFICATION_FOR_MESSAGE_FIELD_DESC);
    oprot.writeBool(this.notificationForMessage);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("SquareChatMember(");
    boolean first = true;

    sb.append("squareMemberMid:");
    if (this.squareMemberMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMemberMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareChatMid:");
    if (this.squareChatMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("revision:");
    sb.append(this.revision);
    first = false;
    if (!first) sb.append(", ");
    sb.append("membershipState:");
    if (this.membershipState == null) {
      sb.append("null");
    } else {
      sb.append(this.membershipState);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("notificationForMessage:");
    sb.append(this.notificationForMessage);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

