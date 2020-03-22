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

public class SquareFeatureSet implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("SquareFeatureSet");

  private static final TField SQUARE_MID_FIELD_DESC = new TField("squareMid", TType.STRING, (short)1);
  private static final TField REVISION_FIELD_DESC = new TField("revision", TType.I64, (short)2);
  private static final TField CREATING_SECRET_SQUARE_CHAT_FIELD_DESC = new TField("creatingSecretSquareChat", TType.STRUCT, (short)11);
  private static final TField INVITING_INTO_OPEN_SQUARE_CHAT_FIELD_DESC = new TField("invitingIntoOpenSquareChat", TType.STRUCT, (short)12);

  private String squareMid;
  private long revision;
  private SquareFeature creatingSecretSquareChat;
  private SquareFeature invitingIntoOpenSquareChat;

  // isset id assignments
  private static final int __REVISION_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public SquareFeatureSet() {
  }

  public SquareFeatureSet(
    String squareMid,
    long revision,
    SquareFeature creatingSecretSquareChat,
    SquareFeature invitingIntoOpenSquareChat)
  {
    this();
    this.squareMid = squareMid;
    this.revision = revision;
    setRevisionIsSet(true);
    this.creatingSecretSquareChat = creatingSecretSquareChat;
    this.invitingIntoOpenSquareChat = invitingIntoOpenSquareChat;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareFeatureSet(SquareFeatureSet other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetSquareMid()) {
      this.squareMid = other.squareMid;
    }
    this.revision = other.revision;
    if (other.isSetCreatingSecretSquareChat()) {
      this.creatingSecretSquareChat = new SquareFeature(other.creatingSecretSquareChat);
    }
    if (other.isSetInvitingIntoOpenSquareChat()) {
      this.invitingIntoOpenSquareChat = new SquareFeature(other.invitingIntoOpenSquareChat);
    }
  }

  public SquareFeatureSet deepCopy() {
    return new SquareFeatureSet(this);
  }

  public void clear() {
    this.squareMid = null;
    setRevisionIsSet(false);
    this.revision = 0;
    this.creatingSecretSquareChat = null;
    this.invitingIntoOpenSquareChat = null;
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

  public long getRevision() {
    return this.revision;
  }

  public void setRevision(long revision) {
    this.revision = revision;
    setRevisionIsSet(true);
  }

  public void unsetRevision() {
    __isset_vector[__REVISION_ISSET_ID] = false;
  }

  /** Returns true if field revision is set (has been assigned a value) and false otherwise */
  public boolean isSetRevision() {
    return __isset_vector[__REVISION_ISSET_ID];
  }

  public void setRevisionIsSet(boolean value) {
    __isset_vector[__REVISION_ISSET_ID] = value;
  }

  public SquareFeature getCreatingSecretSquareChat() {
    return this.creatingSecretSquareChat;
  }

  public void setCreatingSecretSquareChat(SquareFeature creatingSecretSquareChat) {
    this.creatingSecretSquareChat = creatingSecretSquareChat;
  }

  public void unsetCreatingSecretSquareChat() {
    this.creatingSecretSquareChat = null;
  }

  /** Returns true if field creatingSecretSquareChat is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatingSecretSquareChat() {
    return this.creatingSecretSquareChat != null;
  }

  public void setCreatingSecretSquareChatIsSet(boolean value) {
    if (!value) {
      this.creatingSecretSquareChat = null;
    }
  }

  public SquareFeature getInvitingIntoOpenSquareChat() {
    return this.invitingIntoOpenSquareChat;
  }

  public void setInvitingIntoOpenSquareChat(SquareFeature invitingIntoOpenSquareChat) {
    this.invitingIntoOpenSquareChat = invitingIntoOpenSquareChat;
  }

  public void unsetInvitingIntoOpenSquareChat() {
    this.invitingIntoOpenSquareChat = null;
  }

  /** Returns true if field invitingIntoOpenSquareChat is set (has been assigned a value) and false otherwise */
  public boolean isSetInvitingIntoOpenSquareChat() {
    return this.invitingIntoOpenSquareChat != null;
  }

  public void setInvitingIntoOpenSquareChatIsSet(boolean value) {
    if (!value) {
      this.invitingIntoOpenSquareChat = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareFeatureSet)
      return this.equals((SquareFeatureSet)that);
    return false;
  }

  public boolean equals(SquareFeatureSet that) {
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

    boolean this_present_revision = true;
    boolean that_present_revision = true;
    if (this_present_revision || that_present_revision) {
      if (!(this_present_revision && that_present_revision))
        return false;
      if (this.revision != that.revision)
        return false;
    }

    boolean this_present_creatingSecretSquareChat = true && this.isSetCreatingSecretSquareChat();
    boolean that_present_creatingSecretSquareChat = true && that.isSetCreatingSecretSquareChat();
    if (this_present_creatingSecretSquareChat || that_present_creatingSecretSquareChat) {
      if (!(this_present_creatingSecretSquareChat && that_present_creatingSecretSquareChat))
        return false;
      if (!this.creatingSecretSquareChat.equals(that.creatingSecretSquareChat))
        return false;
    }

    boolean this_present_invitingIntoOpenSquareChat = true && this.isSetInvitingIntoOpenSquareChat();
    boolean that_present_invitingIntoOpenSquareChat = true && that.isSetInvitingIntoOpenSquareChat();
    if (this_present_invitingIntoOpenSquareChat || that_present_invitingIntoOpenSquareChat) {
      if (!(this_present_invitingIntoOpenSquareChat && that_present_invitingIntoOpenSquareChat))
        return false;
      if (!this.invitingIntoOpenSquareChat.equals(that.invitingIntoOpenSquareChat))
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

    SquareFeatureSet other = (SquareFeatureSet)otherObject;    int lastComparison = 0;

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
    lastComparison = TBaseHelper.compareTo(isSetRevision(), other.isSetRevision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRevision()) {
      lastComparison = TBaseHelper.compareTo(this.revision, other.revision);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetCreatingSecretSquareChat(), other.isSetCreatingSecretSquareChat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatingSecretSquareChat()) {
      lastComparison = this.creatingSecretSquareChat.compareTo(other.creatingSecretSquareChat);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetInvitingIntoOpenSquareChat(), other.isSetInvitingIntoOpenSquareChat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInvitingIntoOpenSquareChat()) {
      lastComparison = this.invitingIntoOpenSquareChat.compareTo(other.invitingIntoOpenSquareChat);
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
        case 1: // SQUARE_MID
          if (field.type == TType.STRING) {
            this.squareMid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // REVISION
          if (field.type == TType.I64) {
            this.revision = iprot.readI64();
            setRevisionIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 11: // CREATING_SECRET_SQUARE_CHAT
          if (field.type == TType.STRUCT) {
            this.creatingSecretSquareChat = new SquareFeature();
            this.creatingSecretSquareChat.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 12: // INVITING_INTO_OPEN_SQUARE_CHAT
          if (field.type == TType.STRUCT) {
            this.invitingIntoOpenSquareChat = new SquareFeature();
            this.invitingIntoOpenSquareChat.read(iprot);
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
    oprot.writeFieldBegin(REVISION_FIELD_DESC);
    oprot.writeI64(this.revision);
    oprot.writeFieldEnd();
    if (this.creatingSecretSquareChat != null) {
      oprot.writeFieldBegin(CREATING_SECRET_SQUARE_CHAT_FIELD_DESC);
      this.creatingSecretSquareChat.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.invitingIntoOpenSquareChat != null) {
      oprot.writeFieldBegin(INVITING_INTO_OPEN_SQUARE_CHAT_FIELD_DESC);
      this.invitingIntoOpenSquareChat.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("SquareFeatureSet(");
    boolean first = true;

    sb.append("squareMid:");
    if (this.squareMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("revision:");
    sb.append(this.revision);
    first = false;
    if (!first) sb.append(", ");
    sb.append("creatingSecretSquareChat:");
    if (this.creatingSecretSquareChat == null) {
      sb.append("null");
    } else {
      sb.append(this.creatingSecretSquareChat);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("invitingIntoOpenSquareChat:");
    if (this.invitingIntoOpenSquareChat == null) {
      sb.append("null");
    } else {
      sb.append(this.invitingIntoOpenSquareChat);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

