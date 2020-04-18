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

public class GetSquareChatMembersResponse implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("GetSquareChatMembersResponse");

  private static final TField SQUARE_CHAT_MEMBERS_FIELD_DESC = new TField("squareChatMembers", TType.STRUCT, (short)1);
  private static final TField CONTINUATION_TOKEN_FIELD_DESC = new TField("continuationToken", TType.STRING, (short)2);

  private SquareMember squareChatMembers;
  private String continuationToken;

  // isset id assignments

  public GetSquareChatMembersResponse() {
  }

  public GetSquareChatMembersResponse(
    SquareMember squareChatMembers,
    String continuationToken)
  {
    this();
    this.squareChatMembers = squareChatMembers;
    this.continuationToken = continuationToken;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetSquareChatMembersResponse(GetSquareChatMembersResponse other) {
    if (other.isSetSquareChatMembers()) {
      this.squareChatMembers = new SquareMember(other.squareChatMembers);
    }
    if (other.isSetContinuationToken()) {
      this.continuationToken = other.continuationToken;
    }
  }

  public GetSquareChatMembersResponse deepCopy() {
    return new GetSquareChatMembersResponse(this);
  }

  public void clear() {
    this.squareChatMembers = null;
    this.continuationToken = null;
  }

  public SquareMember getSquareChatMembers() {
    return this.squareChatMembers;
  }

  public void setSquareChatMembers(SquareMember squareChatMembers) {
    this.squareChatMembers = squareChatMembers;
  }

  public void unsetSquareChatMembers() {
    this.squareChatMembers = null;
  }

  /** Returns true if field squareChatMembers is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChatMembers() {
    return this.squareChatMembers != null;
  }

  public void setSquareChatMembersIsSet(boolean value) {
    if (!value) {
      this.squareChatMembers = null;
    }
  }

  public String getContinuationToken() {
    return this.continuationToken;
  }

  public void setContinuationToken(String continuationToken) {
    this.continuationToken = continuationToken;
  }

  public void unsetContinuationToken() {
    this.continuationToken = null;
  }

  /** Returns true if field continuationToken is set (has been assigned a value) and false otherwise */
  public boolean isSetContinuationToken() {
    return this.continuationToken != null;
  }

  public void setContinuationTokenIsSet(boolean value) {
    if (!value) {
      this.continuationToken = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetSquareChatMembersResponse)
      return this.equals((GetSquareChatMembersResponse)that);
    return false;
  }

  public boolean equals(GetSquareChatMembersResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareChatMembers = true && this.isSetSquareChatMembers();
    boolean that_present_squareChatMembers = true && that.isSetSquareChatMembers();
    if (this_present_squareChatMembers || that_present_squareChatMembers) {
      if (!(this_present_squareChatMembers && that_present_squareChatMembers))
        return false;
      if (!this.squareChatMembers.equals(that.squareChatMembers))
        return false;
    }

    boolean this_present_continuationToken = true && this.isSetContinuationToken();
    boolean that_present_continuationToken = true && that.isSetContinuationToken();
    if (this_present_continuationToken || that_present_continuationToken) {
      if (!(this_present_continuationToken && that_present_continuationToken))
        return false;
      if (!this.continuationToken.equals(that.continuationToken))
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

    GetSquareChatMembersResponse other = (GetSquareChatMembersResponse)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetSquareChatMembers(), other.isSetSquareChatMembers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatMembers()) {
      lastComparison = this.squareChatMembers.compareTo(other.squareChatMembers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetContinuationToken(), other.isSetContinuationToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContinuationToken()) {
      lastComparison = TBaseHelper.compareTo(this.continuationToken, other.continuationToken);
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
        case 1: // SQUARE_CHAT_MEMBERS
          if (field.type == TType.STRUCT) {
            this.squareChatMembers = new SquareMember();
            this.squareChatMembers.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // CONTINUATION_TOKEN
          if (field.type == TType.STRING) {
            this.continuationToken = iprot.readString();
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
    if (this.squareChatMembers != null) {
      oprot.writeFieldBegin(SQUARE_CHAT_MEMBERS_FIELD_DESC);
      this.squareChatMembers.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.continuationToken != null) {
      oprot.writeFieldBegin(CONTINUATION_TOKEN_FIELD_DESC);
      oprot.writeString(this.continuationToken);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("GetSquareChatMembersResponse(");
    boolean first = true;

    sb.append("squareChatMembers:");
    if (this.squareChatMembers == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMembers);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("continuationToken:");
    if (this.continuationToken == null) {
      sb.append("null");
    } else {
      sb.append(this.continuationToken);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

