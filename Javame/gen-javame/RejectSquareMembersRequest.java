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

public class RejectSquareMembersRequest implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("RejectSquareMembersRequest");

  private static final TField SQUARE_MID_FIELD_DESC = new TField("squareMid", TType.STRING, (short)2);
  private static final TField REQUESTED_MEMBER_MIDS_FIELD_DESC = new TField("requestedMemberMids", TType.LIST, (short)3);

  private String squareMid;
  private Vector requestedMemberMids;

  // isset id assignments

  public RejectSquareMembersRequest() {
  }

  public RejectSquareMembersRequest(
    String squareMid,
    Vector requestedMemberMids)
  {
    this();
    this.squareMid = squareMid;
    this.requestedMemberMids = requestedMemberMids;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RejectSquareMembersRequest(RejectSquareMembersRequest other) {
    if (other.isSetSquareMid()) {
      this.squareMid = other.squareMid;
    }
    if (other.isSetRequestedMemberMids()) {
      Vector __this__requestedMemberMids = new Vector();
      for (Enumeration other_enum = other.requestedMemberMids.elements(); other_enum.hasMoreElements(); ) {
        String other_element = (String)other_enum.nextElement();
        __this__requestedMemberMids.addElement(other_element);
      }
      this.requestedMemberMids = __this__requestedMemberMids;
    }
  }

  public RejectSquareMembersRequest deepCopy() {
    return new RejectSquareMembersRequest(this);
  }

  public void clear() {
    this.squareMid = null;
    this.requestedMemberMids = null;
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

  public int getRequestedMemberMidsSize() {
    return (this.requestedMemberMids == null) ? 0 : this.requestedMemberMids.size();
  }

  public Enumeration getRequestedMemberMidsEnumeration() {
    return (this.requestedMemberMids == null) ? null : this.requestedMemberMids.elements();
  }

  public void addToRequestedMemberMids(String elem) {
    if (this.requestedMemberMids == null) {
      this.requestedMemberMids = new Vector();
    }
    this.requestedMemberMids.addElement(elem);
  }

  public Vector getRequestedMemberMids() {
    return this.requestedMemberMids;
  }

  public void setRequestedMemberMids(Vector requestedMemberMids) {
    this.requestedMemberMids = requestedMemberMids;
  }

  public void unsetRequestedMemberMids() {
    this.requestedMemberMids = null;
  }

  /** Returns true if field requestedMemberMids is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestedMemberMids() {
    return this.requestedMemberMids != null;
  }

  public void setRequestedMemberMidsIsSet(boolean value) {
    if (!value) {
      this.requestedMemberMids = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RejectSquareMembersRequest)
      return this.equals((RejectSquareMembersRequest)that);
    return false;
  }

  public boolean equals(RejectSquareMembersRequest that) {
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

    boolean this_present_requestedMemberMids = true && this.isSetRequestedMemberMids();
    boolean that_present_requestedMemberMids = true && that.isSetRequestedMemberMids();
    if (this_present_requestedMemberMids || that_present_requestedMemberMids) {
      if (!(this_present_requestedMemberMids && that_present_requestedMemberMids))
        return false;
      if (!this.requestedMemberMids.equals(that.requestedMemberMids))
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

    RejectSquareMembersRequest other = (RejectSquareMembersRequest)otherObject;    int lastComparison = 0;

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
    lastComparison = TBaseHelper.compareTo(isSetRequestedMemberMids(), other.isSetRequestedMemberMids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestedMemberMids()) {
      lastComparison = TBaseHelper.compareTo(this.requestedMemberMids, other.requestedMemberMids);
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
        case 3: // REQUESTED_MEMBER_MIDS
          if (field.type == TType.LIST) {
            {
              TList _list450 = iprot.readListBegin();
              this.requestedMemberMids = new Vector(_list450.size);
              for (int _i451 = 0; _i451 < _list450.size; ++_i451)
              {
                String _elem452;
                _elem452 = iprot.readString();
                this.requestedMemberMids.addElement(_elem452);
              }
              iprot.readListEnd();
            }
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
    if (this.requestedMemberMids != null) {
      oprot.writeFieldBegin(REQUESTED_MEMBER_MIDS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.requestedMemberMids.size()));
        for (Enumeration _iter453_enum = this.requestedMemberMids.elements(); _iter453_enum.hasMoreElements(); )         {
          String _iter453 = (String)_iter453_enum.nextElement();
          oprot.writeString(_iter453);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("RejectSquareMembersRequest(");
    boolean first = true;

    sb.append("squareMid:");
    if (this.squareMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("requestedMemberMids:");
    if (this.requestedMemberMids == null) {
      sb.append("null");
    } else {
      sb.append(this.requestedMemberMids);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

