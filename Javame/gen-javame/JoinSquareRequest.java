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

public class JoinSquareRequest implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("JoinSquareRequest");

  private static final TField SQUARE_MID_FIELD_DESC = new TField("squareMid", TType.STRING, (short)2);
  private static final TField MEMBER_FIELD_DESC = new TField("member", TType.STRUCT, (short)3);

  private String squareMid;
  private SquareMember member;

  // isset id assignments

  public JoinSquareRequest() {
  }

  public JoinSquareRequest(
    String squareMid,
    SquareMember member)
  {
    this();
    this.squareMid = squareMid;
    this.member = member;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JoinSquareRequest(JoinSquareRequest other) {
    if (other.isSetSquareMid()) {
      this.squareMid = other.squareMid;
    }
    if (other.isSetMember()) {
      this.member = new SquareMember(other.member);
    }
  }

  public JoinSquareRequest deepCopy() {
    return new JoinSquareRequest(this);
  }

  public void clear() {
    this.squareMid = null;
    this.member = null;
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

  public SquareMember getMember() {
    return this.member;
  }

  public void setMember(SquareMember member) {
    this.member = member;
  }

  public void unsetMember() {
    this.member = null;
  }

  /** Returns true if field member is set (has been assigned a value) and false otherwise */
  public boolean isSetMember() {
    return this.member != null;
  }

  public void setMemberIsSet(boolean value) {
    if (!value) {
      this.member = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JoinSquareRequest)
      return this.equals((JoinSquareRequest)that);
    return false;
  }

  public boolean equals(JoinSquareRequest that) {
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

    boolean this_present_member = true && this.isSetMember();
    boolean that_present_member = true && that.isSetMember();
    if (this_present_member || that_present_member) {
      if (!(this_present_member && that_present_member))
        return false;
      if (!this.member.equals(that.member))
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

    JoinSquareRequest other = (JoinSquareRequest)otherObject;    int lastComparison = 0;

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
    lastComparison = TBaseHelper.compareTo(isSetMember(), other.isSetMember());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMember()) {
      lastComparison = this.member.compareTo(other.member);
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
        case 2: // SQUARE_MID
          if (field.type == TType.STRING) {
            this.squareMid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // MEMBER
          if (field.type == TType.STRUCT) {
            this.member = new SquareMember();
            this.member.read(iprot);
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
    if (this.member != null) {
      oprot.writeFieldBegin(MEMBER_FIELD_DESC);
      this.member.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("JoinSquareRequest(");
    boolean first = true;

    sb.append("squareMid:");
    if (this.squareMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("member:");
    if (this.member == null) {
      sb.append("null");
    } else {
      sb.append(this.member);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

