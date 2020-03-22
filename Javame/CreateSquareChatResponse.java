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

public class CreateSquareChatResponse implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("CreateSquareChatResponse");

  private static final TField SQUARE_CHAT_FIELD_DESC = new TField("squareChat", TType.STRUCT, (short)1);
  private static final TField SQUARE_CHAT_STATUS_FIELD_DESC = new TField("squareChatStatus", TType.STRUCT, (short)2);
  private static final TField SQUARE_CHAT_MEMBER_FIELD_DESC = new TField("squareChatMember", TType.STRUCT, (short)3);

  private SquareChat squareChat;
  private SquareChatStatus squareChatStatus;
  private SquareChatMember squareChatMember;

  // isset id assignments

  public CreateSquareChatResponse() {
  }

  public CreateSquareChatResponse(
    SquareChat squareChat,
    SquareChatStatus squareChatStatus,
    SquareChatMember squareChatMember)
  {
    this();
    this.squareChat = squareChat;
    this.squareChatStatus = squareChatStatus;
    this.squareChatMember = squareChatMember;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CreateSquareChatResponse(CreateSquareChatResponse other) {
    if (other.isSetSquareChat()) {
      this.squareChat = new SquareChat(other.squareChat);
    }
    if (other.isSetSquareChatStatus()) {
      this.squareChatStatus = new SquareChatStatus(other.squareChatStatus);
    }
    if (other.isSetSquareChatMember()) {
      this.squareChatMember = new SquareChatMember(other.squareChatMember);
    }
  }

  public CreateSquareChatResponse deepCopy() {
    return new CreateSquareChatResponse(this);
  }

  public void clear() {
    this.squareChat = null;
    this.squareChatStatus = null;
    this.squareChatMember = null;
  }

  public SquareChat getSquareChat() {
    return this.squareChat;
  }

  public void setSquareChat(SquareChat squareChat) {
    this.squareChat = squareChat;
  }

  public void unsetSquareChat() {
    this.squareChat = null;
  }

  /** Returns true if field squareChat is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChat() {
    return this.squareChat != null;
  }

  public void setSquareChatIsSet(boolean value) {
    if (!value) {
      this.squareChat = null;
    }
  }

  public SquareChatStatus getSquareChatStatus() {
    return this.squareChatStatus;
  }

  public void setSquareChatStatus(SquareChatStatus squareChatStatus) {
    this.squareChatStatus = squareChatStatus;
  }

  public void unsetSquareChatStatus() {
    this.squareChatStatus = null;
  }

  /** Returns true if field squareChatStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChatStatus() {
    return this.squareChatStatus != null;
  }

  public void setSquareChatStatusIsSet(boolean value) {
    if (!value) {
      this.squareChatStatus = null;
    }
  }

  public SquareChatMember getSquareChatMember() {
    return this.squareChatMember;
  }

  public void setSquareChatMember(SquareChatMember squareChatMember) {
    this.squareChatMember = squareChatMember;
  }

  public void unsetSquareChatMember() {
    this.squareChatMember = null;
  }

  /** Returns true if field squareChatMember is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChatMember() {
    return this.squareChatMember != null;
  }

  public void setSquareChatMemberIsSet(boolean value) {
    if (!value) {
      this.squareChatMember = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CreateSquareChatResponse)
      return this.equals((CreateSquareChatResponse)that);
    return false;
  }

  public boolean equals(CreateSquareChatResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareChat = true && this.isSetSquareChat();
    boolean that_present_squareChat = true && that.isSetSquareChat();
    if (this_present_squareChat || that_present_squareChat) {
      if (!(this_present_squareChat && that_present_squareChat))
        return false;
      if (!this.squareChat.equals(that.squareChat))
        return false;
    }

    boolean this_present_squareChatStatus = true && this.isSetSquareChatStatus();
    boolean that_present_squareChatStatus = true && that.isSetSquareChatStatus();
    if (this_present_squareChatStatus || that_present_squareChatStatus) {
      if (!(this_present_squareChatStatus && that_present_squareChatStatus))
        return false;
      if (!this.squareChatStatus.equals(that.squareChatStatus))
        return false;
    }

    boolean this_present_squareChatMember = true && this.isSetSquareChatMember();
    boolean that_present_squareChatMember = true && that.isSetSquareChatMember();
    if (this_present_squareChatMember || that_present_squareChatMember) {
      if (!(this_present_squareChatMember && that_present_squareChatMember))
        return false;
      if (!this.squareChatMember.equals(that.squareChatMember))
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

    CreateSquareChatResponse other = (CreateSquareChatResponse)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetSquareChat(), other.isSetSquareChat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChat()) {
      lastComparison = this.squareChat.compareTo(other.squareChat);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSquareChatStatus(), other.isSetSquareChatStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatStatus()) {
      lastComparison = this.squareChatStatus.compareTo(other.squareChatStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSquareChatMember(), other.isSetSquareChatMember());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatMember()) {
      lastComparison = this.squareChatMember.compareTo(other.squareChatMember);
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
        case 1: // SQUARE_CHAT
          if (field.type == TType.STRUCT) {
            this.squareChat = new SquareChat();
            this.squareChat.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SQUARE_CHAT_STATUS
          if (field.type == TType.STRUCT) {
            this.squareChatStatus = new SquareChatStatus();
            this.squareChatStatus.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // SQUARE_CHAT_MEMBER
          if (field.type == TType.STRUCT) {
            this.squareChatMember = new SquareChatMember();
            this.squareChatMember.read(iprot);
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
    if (this.squareChat != null) {
      oprot.writeFieldBegin(SQUARE_CHAT_FIELD_DESC);
      this.squareChat.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.squareChatStatus != null) {
      oprot.writeFieldBegin(SQUARE_CHAT_STATUS_FIELD_DESC);
      this.squareChatStatus.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.squareChatMember != null) {
      oprot.writeFieldBegin(SQUARE_CHAT_MEMBER_FIELD_DESC);
      this.squareChatMember.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("CreateSquareChatResponse(");
    boolean first = true;

    sb.append("squareChat:");
    if (this.squareChat == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChat);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareChatStatus:");
    if (this.squareChatStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatStatus);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareChatMember:");
    if (this.squareChatMember == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMember);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

