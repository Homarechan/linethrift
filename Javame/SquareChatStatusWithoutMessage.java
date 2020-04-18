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

public class SquareChatStatusWithoutMessage implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("SquareChatStatusWithoutMessage");

  private static final TField MEMBER_COUNT_FIELD_DESC = new TField("memberCount", TType.I32, (short)1);
  private static final TField UNREAD_MESSAGE_COUNT_FIELD_DESC = new TField("unreadMessageCount", TType.I32, (short)2);

  private int memberCount;
  private int unreadMessageCount;

  // isset id assignments
  private static final int __MEMBERCOUNT_ISSET_ID = 0;
  private static final int __UNREADMESSAGECOUNT_ISSET_ID = 1;
  private boolean[] __isset_vector = new boolean[2];

  public SquareChatStatusWithoutMessage() {
  }

  public SquareChatStatusWithoutMessage(
    int memberCount,
    int unreadMessageCount)
  {
    this();
    this.memberCount = memberCount;
    setMemberCountIsSet(true);
    this.unreadMessageCount = unreadMessageCount;
    setUnreadMessageCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareChatStatusWithoutMessage(SquareChatStatusWithoutMessage other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.memberCount = other.memberCount;
    this.unreadMessageCount = other.unreadMessageCount;
  }

  public SquareChatStatusWithoutMessage deepCopy() {
    return new SquareChatStatusWithoutMessage(this);
  }

  public void clear() {
    setMemberCountIsSet(false);
    this.memberCount = 0;
    setUnreadMessageCountIsSet(false);
    this.unreadMessageCount = 0;
  }

  public int getMemberCount() {
    return this.memberCount;
  }

  public void setMemberCount(int memberCount) {
    this.memberCount = memberCount;
    setMemberCountIsSet(true);
  }

  public void unsetMemberCount() {
    __isset_vector[__MEMBERCOUNT_ISSET_ID] = false;
  }

  /** Returns true if field memberCount is set (has been assigned a value) and false otherwise */
  public boolean isSetMemberCount() {
    return __isset_vector[__MEMBERCOUNT_ISSET_ID];
  }

  public void setMemberCountIsSet(boolean value) {
    __isset_vector[__MEMBERCOUNT_ISSET_ID] = value;
  }

  public int getUnreadMessageCount() {
    return this.unreadMessageCount;
  }

  public void setUnreadMessageCount(int unreadMessageCount) {
    this.unreadMessageCount = unreadMessageCount;
    setUnreadMessageCountIsSet(true);
  }

  public void unsetUnreadMessageCount() {
    __isset_vector[__UNREADMESSAGECOUNT_ISSET_ID] = false;
  }

  /** Returns true if field unreadMessageCount is set (has been assigned a value) and false otherwise */
  public boolean isSetUnreadMessageCount() {
    return __isset_vector[__UNREADMESSAGECOUNT_ISSET_ID];
  }

  public void setUnreadMessageCountIsSet(boolean value) {
    __isset_vector[__UNREADMESSAGECOUNT_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareChatStatusWithoutMessage)
      return this.equals((SquareChatStatusWithoutMessage)that);
    return false;
  }

  public boolean equals(SquareChatStatusWithoutMessage that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_memberCount = true;
    boolean that_present_memberCount = true;
    if (this_present_memberCount || that_present_memberCount) {
      if (!(this_present_memberCount && that_present_memberCount))
        return false;
      if (this.memberCount != that.memberCount)
        return false;
    }

    boolean this_present_unreadMessageCount = true;
    boolean that_present_unreadMessageCount = true;
    if (this_present_unreadMessageCount || that_present_unreadMessageCount) {
      if (!(this_present_unreadMessageCount && that_present_unreadMessageCount))
        return false;
      if (this.unreadMessageCount != that.unreadMessageCount)
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

    SquareChatStatusWithoutMessage other = (SquareChatStatusWithoutMessage)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetMemberCount(), other.isSetMemberCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMemberCount()) {
      lastComparison = TBaseHelper.compareTo(this.memberCount, other.memberCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetUnreadMessageCount(), other.isSetUnreadMessageCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnreadMessageCount()) {
      lastComparison = TBaseHelper.compareTo(this.unreadMessageCount, other.unreadMessageCount);
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
        case 1: // MEMBER_COUNT
          if (field.type == TType.I32) {
            this.memberCount = iprot.readI32();
            setMemberCountIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // UNREAD_MESSAGE_COUNT
          if (field.type == TType.I32) {
            this.unreadMessageCount = iprot.readI32();
            setUnreadMessageCountIsSet(true);
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
    oprot.writeFieldBegin(MEMBER_COUNT_FIELD_DESC);
    oprot.writeI32(this.memberCount);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(UNREAD_MESSAGE_COUNT_FIELD_DESC);
    oprot.writeI32(this.unreadMessageCount);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("SquareChatStatusWithoutMessage(");
    boolean first = true;

    sb.append("memberCount:");
    sb.append(this.memberCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("unreadMessageCount:");
    sb.append(this.unreadMessageCount);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

