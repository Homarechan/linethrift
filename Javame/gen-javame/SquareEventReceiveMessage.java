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

public class SquareEventReceiveMessage implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("SquareEventReceiveMessage");

  private static final TField SQUARE_CHAT_MID_FIELD_DESC = new TField("squareChatMid", TType.STRING, (short)1);
  private static final TField SQUARE_MESSAGE_FIELD_DESC = new TField("squareMessage", TType.STRUCT, (short)2);

  private String squareChatMid;
  private SquareMessage squareMessage;

  // isset id assignments

  public SquareEventReceiveMessage() {
  }

  public SquareEventReceiveMessage(
    String squareChatMid,
    SquareMessage squareMessage)
  {
    this();
    this.squareChatMid = squareChatMid;
    this.squareMessage = squareMessage;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareEventReceiveMessage(SquareEventReceiveMessage other) {
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
    if (other.isSetSquareMessage()) {
      this.squareMessage = new SquareMessage(other.squareMessage);
    }
  }

  public SquareEventReceiveMessage deepCopy() {
    return new SquareEventReceiveMessage(this);
  }

  public void clear() {
    this.squareChatMid = null;
    this.squareMessage = null;
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
    if (that instanceof SquareEventReceiveMessage)
      return this.equals((SquareEventReceiveMessage)that);
    return false;
  }

  public boolean equals(SquareEventReceiveMessage that) {
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

    SquareEventReceiveMessage other = (SquareEventReceiveMessage)otherObject;    int lastComparison = 0;

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
        case 1: // SQUARE_CHAT_MID
          if (field.type == TType.STRING) {
            this.squareChatMid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SQUARE_MESSAGE
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
    StringBuffer sb = new StringBuffer("SquareEventReceiveMessage(");
    boolean first = true;

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

