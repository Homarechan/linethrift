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

public class LeaveSquareChatRequest implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("LeaveSquareChatRequest");

  private static final TField SQUARE_CHAT_MID_FIELD_DESC = new TField("squareChatMid", TType.STRING, (short)2);
  private static final TField SAY_GOODBYE_FIELD_DESC = new TField("sayGoodbye", TType.BOOL, (short)3);
  private static final TField SQUARE_CHAT_MEMBER_REVISION_FIELD_DESC = new TField("squareChatMemberRevision", TType.I64, (short)4);

  private String squareChatMid;
  private boolean sayGoodbye;
  private long squareChatMemberRevision;

  // isset id assignments
  private static final int __SAYGOODBYE_ISSET_ID = 0;
  private static final int __SQUARECHATMEMBERREVISION_ISSET_ID = 1;
  private boolean[] __isset_vector = new boolean[2];

  public LeaveSquareChatRequest() {
  }

  public LeaveSquareChatRequest(
    String squareChatMid,
    boolean sayGoodbye,
    long squareChatMemberRevision)
  {
    this();
    this.squareChatMid = squareChatMid;
    this.sayGoodbye = sayGoodbye;
    setSayGoodbyeIsSet(true);
    this.squareChatMemberRevision = squareChatMemberRevision;
    setSquareChatMemberRevisionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LeaveSquareChatRequest(LeaveSquareChatRequest other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
    this.sayGoodbye = other.sayGoodbye;
    this.squareChatMemberRevision = other.squareChatMemberRevision;
  }

  public LeaveSquareChatRequest deepCopy() {
    return new LeaveSquareChatRequest(this);
  }

  public void clear() {
    this.squareChatMid = null;
    setSayGoodbyeIsSet(false);
    this.sayGoodbye = false;
    setSquareChatMemberRevisionIsSet(false);
    this.squareChatMemberRevision = 0;
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

  public boolean isSayGoodbye() {
    return this.sayGoodbye;
  }

  public void setSayGoodbye(boolean sayGoodbye) {
    this.sayGoodbye = sayGoodbye;
    setSayGoodbyeIsSet(true);
  }

  public void unsetSayGoodbye() {
    __isset_vector[__SAYGOODBYE_ISSET_ID] = false;
  }

  /** Returns true if field sayGoodbye is set (has been assigned a value) and false otherwise */
  public boolean isSetSayGoodbye() {
    return __isset_vector[__SAYGOODBYE_ISSET_ID];
  }

  public void setSayGoodbyeIsSet(boolean value) {
    __isset_vector[__SAYGOODBYE_ISSET_ID] = value;
  }

  public long getSquareChatMemberRevision() {
    return this.squareChatMemberRevision;
  }

  public void setSquareChatMemberRevision(long squareChatMemberRevision) {
    this.squareChatMemberRevision = squareChatMemberRevision;
    setSquareChatMemberRevisionIsSet(true);
  }

  public void unsetSquareChatMemberRevision() {
    __isset_vector[__SQUARECHATMEMBERREVISION_ISSET_ID] = false;
  }

  /** Returns true if field squareChatMemberRevision is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChatMemberRevision() {
    return __isset_vector[__SQUARECHATMEMBERREVISION_ISSET_ID];
  }

  public void setSquareChatMemberRevisionIsSet(boolean value) {
    __isset_vector[__SQUARECHATMEMBERREVISION_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LeaveSquareChatRequest)
      return this.equals((LeaveSquareChatRequest)that);
    return false;
  }

  public boolean equals(LeaveSquareChatRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareChatMid = true && this.isSetSquareChatMid();
    boolean that_present_squareChatMid = true && that.isSetSquareChatMid();
    if (this_present_squareChatMid || that_present_squareChatMid) {
      if (!(this_present_squareChatMid && that_present_squareChatMid))
        return false;
      if (!this.squareChatMid.equals(that.squareChatMid))
        return false;
    }

    boolean this_present_sayGoodbye = true;
    boolean that_present_sayGoodbye = true;
    if (this_present_sayGoodbye || that_present_sayGoodbye) {
      if (!(this_present_sayGoodbye && that_present_sayGoodbye))
        return false;
      if (this.sayGoodbye != that.sayGoodbye)
        return false;
    }

    boolean this_present_squareChatMemberRevision = true;
    boolean that_present_squareChatMemberRevision = true;
    if (this_present_squareChatMemberRevision || that_present_squareChatMemberRevision) {
      if (!(this_present_squareChatMemberRevision && that_present_squareChatMemberRevision))
        return false;
      if (this.squareChatMemberRevision != that.squareChatMemberRevision)
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

    LeaveSquareChatRequest other = (LeaveSquareChatRequest)otherObject;    int lastComparison = 0;

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
    lastComparison = TBaseHelper.compareTo(isSetSayGoodbye(), other.isSetSayGoodbye());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSayGoodbye()) {
      lastComparison = TBaseHelper.compareTo(this.sayGoodbye, other.sayGoodbye);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSquareChatMemberRevision(), other.isSetSquareChatMemberRevision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatMemberRevision()) {
      lastComparison = TBaseHelper.compareTo(this.squareChatMemberRevision, other.squareChatMemberRevision);
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
        case 2: // SQUARE_CHAT_MID
          if (field.type == TType.STRING) {
            this.squareChatMid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // SAY_GOODBYE
          if (field.type == TType.BOOL) {
            this.sayGoodbye = iprot.readBool();
            setSayGoodbyeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // SQUARE_CHAT_MEMBER_REVISION
          if (field.type == TType.I64) {
            this.squareChatMemberRevision = iprot.readI64();
            setSquareChatMemberRevisionIsSet(true);
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
    if (this.squareChatMid != null) {
      oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
      oprot.writeString(this.squareChatMid);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(SAY_GOODBYE_FIELD_DESC);
    oprot.writeBool(this.sayGoodbye);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(SQUARE_CHAT_MEMBER_REVISION_FIELD_DESC);
    oprot.writeI64(this.squareChatMemberRevision);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("LeaveSquareChatRequest(");
    boolean first = true;

    sb.append("squareChatMid:");
    if (this.squareChatMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sayGoodbye:");
    sb.append(this.sayGoodbye);
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareChatMemberRevision:");
    sb.append(this.squareChatMemberRevision);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

