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

public class GetSquareMemberRelationRequest implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("GetSquareMemberRelationRequest");

  private static final TField SQUARE_MID_FIELD_DESC = new TField("squareMid", TType.STRING, (short)2);
  private static final TField TARGET_SQUARE_MEMBER_MID_FIELD_DESC = new TField("targetSquareMemberMid", TType.STRING, (short)3);

  private String squareMid;
  private String targetSquareMemberMid;

  // isset id assignments

  public GetSquareMemberRelationRequest() {
  }

  public GetSquareMemberRelationRequest(
    String squareMid,
    String targetSquareMemberMid)
  {
    this();
    this.squareMid = squareMid;
    this.targetSquareMemberMid = targetSquareMemberMid;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetSquareMemberRelationRequest(GetSquareMemberRelationRequest other) {
    if (other.isSetSquareMid()) {
      this.squareMid = other.squareMid;
    }
    if (other.isSetTargetSquareMemberMid()) {
      this.targetSquareMemberMid = other.targetSquareMemberMid;
    }
  }

  public GetSquareMemberRelationRequest deepCopy() {
    return new GetSquareMemberRelationRequest(this);
  }

  public void clear() {
    this.squareMid = null;
    this.targetSquareMemberMid = null;
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

  public String getTargetSquareMemberMid() {
    return this.targetSquareMemberMid;
  }

  public void setTargetSquareMemberMid(String targetSquareMemberMid) {
    this.targetSquareMemberMid = targetSquareMemberMid;
  }

  public void unsetTargetSquareMemberMid() {
    this.targetSquareMemberMid = null;
  }

  /** Returns true if field targetSquareMemberMid is set (has been assigned a value) and false otherwise */
  public boolean isSetTargetSquareMemberMid() {
    return this.targetSquareMemberMid != null;
  }

  public void setTargetSquareMemberMidIsSet(boolean value) {
    if (!value) {
      this.targetSquareMemberMid = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetSquareMemberRelationRequest)
      return this.equals((GetSquareMemberRelationRequest)that);
    return false;
  }

  public boolean equals(GetSquareMemberRelationRequest that) {
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

    boolean this_present_targetSquareMemberMid = true && this.isSetTargetSquareMemberMid();
    boolean that_present_targetSquareMemberMid = true && that.isSetTargetSquareMemberMid();
    if (this_present_targetSquareMemberMid || that_present_targetSquareMemberMid) {
      if (!(this_present_targetSquareMemberMid && that_present_targetSquareMemberMid))
        return false;
      if (!this.targetSquareMemberMid.equals(that.targetSquareMemberMid))
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

    GetSquareMemberRelationRequest other = (GetSquareMemberRelationRequest)otherObject;    int lastComparison = 0;

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
    lastComparison = TBaseHelper.compareTo(isSetTargetSquareMemberMid(), other.isSetTargetSquareMemberMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargetSquareMemberMid()) {
      lastComparison = TBaseHelper.compareTo(this.targetSquareMemberMid, other.targetSquareMemberMid);
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
        case 3: // TARGET_SQUARE_MEMBER_MID
          if (field.type == TType.STRING) {
            this.targetSquareMemberMid = iprot.readString();
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
    if (this.targetSquareMemberMid != null) {
      oprot.writeFieldBegin(TARGET_SQUARE_MEMBER_MID_FIELD_DESC);
      oprot.writeString(this.targetSquareMemberMid);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("GetSquareMemberRelationRequest(");
    boolean first = true;

    sb.append("squareMid:");
    if (this.squareMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("targetSquareMemberMid:");
    if (this.targetSquareMemberMid == null) {
      sb.append("null");
    } else {
      sb.append(this.targetSquareMemberMid);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

