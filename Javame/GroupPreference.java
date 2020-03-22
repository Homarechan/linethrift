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

public class GroupPreference implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("GroupPreference");

  private static final TField INVITATION_TICKET_FIELD_DESC = new TField("invitationTicket", TType.STRING, (short)1);
  private static final TField FAVORITE_TIMESTAMP_FIELD_DESC = new TField("favoriteTimestamp", TType.I64, (short)2);

  private String invitationTicket;
  private long favoriteTimestamp;

  // isset id assignments
  private static final int __FAVORITETIMESTAMP_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public GroupPreference() {
  }

  public GroupPreference(
    String invitationTicket,
    long favoriteTimestamp)
  {
    this();
    this.invitationTicket = invitationTicket;
    this.favoriteTimestamp = favoriteTimestamp;
    setFavoriteTimestampIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GroupPreference(GroupPreference other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetInvitationTicket()) {
      this.invitationTicket = other.invitationTicket;
    }
    this.favoriteTimestamp = other.favoriteTimestamp;
  }

  public GroupPreference deepCopy() {
    return new GroupPreference(this);
  }

  public void clear() {
    this.invitationTicket = null;
    setFavoriteTimestampIsSet(false);
    this.favoriteTimestamp = 0;
  }

  public String getInvitationTicket() {
    return this.invitationTicket;
  }

  public void setInvitationTicket(String invitationTicket) {
    this.invitationTicket = invitationTicket;
  }

  public void unsetInvitationTicket() {
    this.invitationTicket = null;
  }

  /** Returns true if field invitationTicket is set (has been assigned a value) and false otherwise */
  public boolean isSetInvitationTicket() {
    return this.invitationTicket != null;
  }

  public void setInvitationTicketIsSet(boolean value) {
    if (!value) {
      this.invitationTicket = null;
    }
  }

  public long getFavoriteTimestamp() {
    return this.favoriteTimestamp;
  }

  public void setFavoriteTimestamp(long favoriteTimestamp) {
    this.favoriteTimestamp = favoriteTimestamp;
    setFavoriteTimestampIsSet(true);
  }

  public void unsetFavoriteTimestamp() {
    __isset_vector[__FAVORITETIMESTAMP_ISSET_ID] = false;
  }

  /** Returns true if field favoriteTimestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetFavoriteTimestamp() {
    return __isset_vector[__FAVORITETIMESTAMP_ISSET_ID];
  }

  public void setFavoriteTimestampIsSet(boolean value) {
    __isset_vector[__FAVORITETIMESTAMP_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GroupPreference)
      return this.equals((GroupPreference)that);
    return false;
  }

  public boolean equals(GroupPreference that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_invitationTicket = true && this.isSetInvitationTicket();
    boolean that_present_invitationTicket = true && that.isSetInvitationTicket();
    if (this_present_invitationTicket || that_present_invitationTicket) {
      if (!(this_present_invitationTicket && that_present_invitationTicket))
        return false;
      if (!this.invitationTicket.equals(that.invitationTicket))
        return false;
    }

    boolean this_present_favoriteTimestamp = true;
    boolean that_present_favoriteTimestamp = true;
    if (this_present_favoriteTimestamp || that_present_favoriteTimestamp) {
      if (!(this_present_favoriteTimestamp && that_present_favoriteTimestamp))
        return false;
      if (this.favoriteTimestamp != that.favoriteTimestamp)
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

    GroupPreference other = (GroupPreference)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetInvitationTicket(), other.isSetInvitationTicket());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInvitationTicket()) {
      lastComparison = TBaseHelper.compareTo(this.invitationTicket, other.invitationTicket);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetFavoriteTimestamp(), other.isSetFavoriteTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFavoriteTimestamp()) {
      lastComparison = TBaseHelper.compareTo(this.favoriteTimestamp, other.favoriteTimestamp);
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
        case 1: // INVITATION_TICKET
          if (field.type == TType.STRING) {
            this.invitationTicket = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // FAVORITE_TIMESTAMP
          if (field.type == TType.I64) {
            this.favoriteTimestamp = iprot.readI64();
            setFavoriteTimestampIsSet(true);
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
    if (this.invitationTicket != null) {
      oprot.writeFieldBegin(INVITATION_TICKET_FIELD_DESC);
      oprot.writeString(this.invitationTicket);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(FAVORITE_TIMESTAMP_FIELD_DESC);
    oprot.writeI64(this.favoriteTimestamp);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("GroupPreference(");
    boolean first = true;

    sb.append("invitationTicket:");
    if (this.invitationTicket == null) {
      sb.append("null");
    } else {
      sb.append(this.invitationTicket);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("favoriteTimestamp:");
    sb.append(this.favoriteTimestamp);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

