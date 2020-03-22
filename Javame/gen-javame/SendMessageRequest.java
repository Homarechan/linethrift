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

public class SendMessageRequest implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("SendMessageRequest");

  private static final TField REQ_SEQ_FIELD_DESC = new TField("reqSeq", TType.I32, (short)1);
  private static final TField SQUARE_CHAT_MID_FIELD_DESC = new TField("squareChatMid", TType.STRING, (short)2);
  private static final TField SQUARE_MESSAGE_FIELD_DESC = new TField("squareMessage", TType.STRUCT, (short)3);

  private int reqSeq;
  private String squareChatMid;
  private SquareMessage squareMessage;

  // isset id assignments
  private static final int __REQSEQ_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public SendMessageRequest() {
  }

  public SendMessageRequest(
    int reqSeq,
    String squareChatMid,
    SquareMessage squareMessage)
  {
    this();
    this.reqSeq = reqSeq;
    setReqSeqIsSet(true);
    this.squareChatMid = squareChatMid;
    this.squareMessage = squareMessage;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SendMessageRequest(SendMessageRequest other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.reqSeq = other.reqSeq;
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
    if (other.isSetSquareMessage()) {
      this.squareMessage = new SquareMessage(other.squareMessage);
    }
  }

  public SendMessageRequest deepCopy() {
    return new SendMessageRequest(this);
  }

  public void clear() {
    setReqSeqIsSet(false);
    this.reqSeq = 0;
    this.squareChatMid = null;
    this.squareMessage = null;
  }

  public int getReqSeq() {
    return this.reqSeq;
  }

  public void setReqSeq(int reqSeq) {
    this.reqSeq = reqSeq;
    setReqSeqIsSet(true);
  }

  public void unsetReqSeq() {
    __isset_vector[__REQSEQ_ISSET_ID] = false;
  }

  /** Returns true if field reqSeq is set (has been assigned a value) and false otherwise */
  public boolean isSetReqSeq() {
    return __isset_vector[__REQSEQ_ISSET_ID];
  }

  public void setReqSeqIsSet(boolean value) {
    __isset_vector[__REQSEQ_ISSET_ID] = value;
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

  public SquareMessage getSquareMessage() {
    return this.squareMessage;
  }

  public void setSquareMessage(SquareMessage squareMessage) {
    this.squareMessage = squareMessage;
  }

  public void unsetSquareMessage() {
    this.squareMessage = null;
  }

  /** Returns true if field squareMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareMessage() {
    return this.squareMessage != null;
  }

  public void setSquareMessageIsSet(boolean value) {
    if (!value) {
      this.squareMessage = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SendMessageRequest)
      return this.equals((SendMessageRequest)that);
    return false;
  }

  public boolean equals(SendMessageRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_reqSeq = true;
    boolean that_present_reqSeq = true;
    if (this_present_reqSeq || that_present_reqSeq) {
      if (!(this_present_reqSeq && that_present_reqSeq))
        return false;
      if (this.reqSeq != that.reqSeq)
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

    boolean this_present_squareMessage = true && this.isSetSquareMessage();
    boolean that_present_squareMessage = true && that.isSetSquareMessage();
    if (this_present_squareMessage || that_present_squareMessage) {
      if (!(this_present_squareMessage && that_present_squareMessage))
        return false;
      if (!this.squareMessage.equals(that.squareMessage))
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

    SendMessageRequest other = (SendMessageRequest)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetReqSeq(), other.isSetReqSeq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReqSeq()) {
      lastComparison = TBaseHelper.compareTo(this.reqSeq, other.reqSeq);
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
    lastComparison = TBaseHelper.compareTo(isSetSquareMessage(), other.isSetSquareMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareMessage()) {
      lastComparison = this.squareMessage.compareTo(other.squareMessage);
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
        case 1: // REQ_SEQ
          if (field.type == TType.I32) {
            this.reqSeq = iprot.readI32();
            setReqSeqIsSet(true);
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
        case 3: // SQUARE_MESSAGE
          if (field.type == TType.STRUCT) {
            this.squareMessage = new SquareMessage();
            this.squareMessage.read(iprot);
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
    oprot.writeFieldBegin(REQ_SEQ_FIELD_DESC);
    oprot.writeI32(this.reqSeq);
    oprot.writeFieldEnd();
    if (this.squareChatMid != null) {
      oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
      oprot.writeString(this.squareChatMid);
      oprot.writeFieldEnd();
    }
    if (this.squareMessage != null) {
      oprot.writeFieldBegin(SQUARE_MESSAGE_FIELD_DESC);
      this.squareMessage.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("SendMessageRequest(");
    boolean first = true;

    sb.append("reqSeq:");
    sb.append(this.reqSeq);
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
    sb.append("squareMessage:");
    if (this.squareMessage == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMessage);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
