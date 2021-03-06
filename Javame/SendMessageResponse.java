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

public class SendMessageResponse implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("SendMessageResponse");

  private static final TField CREATED_SQUARE_MESSAGE_FIELD_DESC = new TField("createdSquareMessage", TType.STRUCT, (short)1);

  private SquareMessage createdSquareMessage;

  // isset id assignments

  public SendMessageResponse() {
  }

  public SendMessageResponse(
    SquareMessage createdSquareMessage)
  {
    this();
    this.createdSquareMessage = createdSquareMessage;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SendMessageResponse(SendMessageResponse other) {
    if (other.isSetCreatedSquareMessage()) {
      this.createdSquareMessage = new SquareMessage(other.createdSquareMessage);
    }
  }

  public SendMessageResponse deepCopy() {
    return new SendMessageResponse(this);
  }

  public void clear() {
    this.createdSquareMessage = null;
  }

  public SquareMessage getCreatedSquareMessage() {
    return this.createdSquareMessage;
  }

  public void setCreatedSquareMessage(SquareMessage createdSquareMessage) {
    this.createdSquareMessage = createdSquareMessage;
  }

  public void unsetCreatedSquareMessage() {
    this.createdSquareMessage = null;
  }

  /** Returns true if field createdSquareMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedSquareMessage() {
    return this.createdSquareMessage != null;
  }

  public void setCreatedSquareMessageIsSet(boolean value) {
    if (!value) {
      this.createdSquareMessage = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SendMessageResponse)
      return this.equals((SendMessageResponse)that);
    return false;
  }

  public boolean equals(SendMessageResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_createdSquareMessage = true && this.isSetCreatedSquareMessage();
    boolean that_present_createdSquareMessage = true && that.isSetCreatedSquareMessage();
    if (this_present_createdSquareMessage || that_present_createdSquareMessage) {
      if (!(this_present_createdSquareMessage && that_present_createdSquareMessage))
        return false;
      if (!this.createdSquareMessage.equals(that.createdSquareMessage))
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

    SendMessageResponse other = (SendMessageResponse)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetCreatedSquareMessage(), other.isSetCreatedSquareMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedSquareMessage()) {
      lastComparison = this.createdSquareMessage.compareTo(other.createdSquareMessage);
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
        case 1: // CREATED_SQUARE_MESSAGE
          if (field.type == TType.STRUCT) {
            this.createdSquareMessage = new SquareMessage();
            this.createdSquareMessage.read(iprot);
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
    if (this.createdSquareMessage != null) {
      oprot.writeFieldBegin(CREATED_SQUARE_MESSAGE_FIELD_DESC);
      this.createdSquareMessage.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("SendMessageResponse(");
    boolean first = true;

    sb.append("createdSquareMessage:");
    if (this.createdSquareMessage == null) {
      sb.append("null");
    } else {
      sb.append(this.createdSquareMessage);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

