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

public class InviteToSquareChatResponse implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("InviteToSquareChatResponse");

  private static final TField INVITEE_MIDS_FIELD_DESC = new TField("inviteeMids", TType.LIST, (short)1);

  private Vector inviteeMids;

  // isset id assignments

  public InviteToSquareChatResponse() {
  }

  public InviteToSquareChatResponse(
    Vector inviteeMids)
  {
    this();
    this.inviteeMids = inviteeMids;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InviteToSquareChatResponse(InviteToSquareChatResponse other) {
    if (other.isSetInviteeMids()) {
      Vector __this__inviteeMids = new Vector();
      for (Enumeration other_enum = other.inviteeMids.elements(); other_enum.hasMoreElements(); ) {
        String other_element = (String)other_enum.nextElement();
        __this__inviteeMids.addElement(other_element);
      }
      this.inviteeMids = __this__inviteeMids;
    }
  }

  public InviteToSquareChatResponse deepCopy() {
    return new InviteToSquareChatResponse(this);
  }

  public void clear() {
    this.inviteeMids = null;
  }

  public int getInviteeMidsSize() {
    return (this.inviteeMids == null) ? 0 : this.inviteeMids.size();
  }

  public Enumeration getInviteeMidsEnumeration() {
    return (this.inviteeMids == null) ? null : this.inviteeMids.elements();
  }

  public void addToInviteeMids(String elem) {
    if (this.inviteeMids == null) {
      this.inviteeMids = new Vector();
    }
    this.inviteeMids.addElement(elem);
  }

  public Vector getInviteeMids() {
    return this.inviteeMids;
  }

  public void setInviteeMids(Vector inviteeMids) {
    this.inviteeMids = inviteeMids;
  }

  public void unsetInviteeMids() {
    this.inviteeMids = null;
  }

  /** Returns true if field inviteeMids is set (has been assigned a value) and false otherwise */
  public boolean isSetInviteeMids() {
    return this.inviteeMids != null;
  }

  public void setInviteeMidsIsSet(boolean value) {
    if (!value) {
      this.inviteeMids = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InviteToSquareChatResponse)
      return this.equals((InviteToSquareChatResponse)that);
    return false;
  }

  public boolean equals(InviteToSquareChatResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_inviteeMids = true && this.isSetInviteeMids();
    boolean that_present_inviteeMids = true && that.isSetInviteeMids();
    if (this_present_inviteeMids || that_present_inviteeMids) {
      if (!(this_present_inviteeMids && that_present_inviteeMids))
        return false;
      if (!this.inviteeMids.equals(that.inviteeMids))
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

    InviteToSquareChatResponse other = (InviteToSquareChatResponse)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetInviteeMids(), other.isSetInviteeMids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInviteeMids()) {
      lastComparison = TBaseHelper.compareTo(this.inviteeMids, other.inviteeMids);
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
        case 1: // INVITEE_MIDS
          if (field.type == TType.LIST) {
            {
              TList _list361 = iprot.readListBegin();
              this.inviteeMids = new Vector(_list361.size);
              for (int _i362 = 0; _i362 < _list361.size; ++_i362)
              {
                String _elem363;
                _elem363 = iprot.readString();
                this.inviteeMids.addElement(_elem363);
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
    if (this.inviteeMids != null) {
      oprot.writeFieldBegin(INVITEE_MIDS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.inviteeMids.size()));
        for (Enumeration _iter364_enum = this.inviteeMids.elements(); _iter364_enum.hasMoreElements(); )         {
          String _iter364 = (String)_iter364_enum.nextElement();
          oprot.writeString(_iter364);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("InviteToSquareChatResponse(");
    boolean first = true;

    sb.append("inviteeMids:");
    if (this.inviteeMids == null) {
      sb.append("null");
    } else {
      sb.append(this.inviteeMids);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

