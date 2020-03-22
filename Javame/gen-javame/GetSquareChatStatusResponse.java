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

public class GetSquareChatStatusResponse implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("GetSquareChatStatusResponse");

  private static final TField CHAT_STATUS_FIELD_DESC = new TField("chatStatus", TType.STRUCT, (short)1);

  private SquareChatStatus chatStatus;

  // isset id assignments

  public GetSquareChatStatusResponse() {
  }

  public GetSquareChatStatusResponse(
    SquareChatStatus chatStatus)
  {
    this();
    this.chatStatus = chatStatus;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetSquareChatStatusResponse(GetSquareChatStatusResponse other) {
    if (other.isSetChatStatus()) {
      this.chatStatus = new SquareChatStatus(other.chatStatus);
    }
  }

  public GetSquareChatStatusResponse deepCopy() {
    return new GetSquareChatStatusResponse(this);
  }

  public void clear() {
    this.chatStatus = null;
  }

  public SquareChatStatus getChatStatus() {
    return this.chatStatus;
  }

  public void setChatStatus(SquareChatStatus chatStatus) {
    this.chatStatus = chatStatus;
  }

  public void unsetChatStatus() {
    this.chatStatus = null;
  }

  /** Returns true if field chatStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetChatStatus() {
    return this.chatStatus != null;
  }

  public void setChatStatusIsSet(boolean value) {
    if (!value) {
      this.chatStatus = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetSquareChatStatusResponse)
      return this.equals((GetSquareChatStatusResponse)that);
    return false;
  }

  public boolean equals(GetSquareChatStatusResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_chatStatus = true && this.isSetChatStatus();
    boolean that_present_chatStatus = true && that.isSetChatStatus();
    if (this_present_chatStatus || that_present_chatStatus) {
      if (!(this_present_chatStatus && that_present_chatStatus))
        return false;
      if (!this.chatStatus.equals(that.chatStatus))
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

    GetSquareChatStatusResponse other = (GetSquareChatStatusResponse)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetChatStatus(), other.isSetChatStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChatStatus()) {
      lastComparison = this.chatStatus.compareTo(other.chatStatus);
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
        case 1: // CHAT_STATUS
          if (field.type == TType.STRUCT) {
            this.chatStatus = new SquareChatStatus();
            this.chatStatus.read(iprot);
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
    if (this.chatStatus != null) {
      oprot.writeFieldBegin(CHAT_STATUS_FIELD_DESC);
      this.chatStatus.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("GetSquareChatStatusResponse(");
    boolean first = true;

    sb.append("chatStatus:");
    if (this.chatStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.chatStatus);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

