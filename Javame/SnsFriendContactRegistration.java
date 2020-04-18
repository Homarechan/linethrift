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

public class SnsFriendContactRegistration implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("SnsFriendContactRegistration");

  private static final TField CONTACT_FIELD_DESC = new TField("contact", TType.STRUCT, (short)1);
  private static final TField SNS_ID_TYPE_FIELD_DESC = new TField("snsIdType", TType.I32, (short)2);
  private static final TField SNS_USER_ID_FIELD_DESC = new TField("snsUserId", TType.STRING, (short)3);

  private Contact contact;
  private SnsIdType snsIdType;
  private String snsUserId;

  // isset id assignments

  public SnsFriendContactRegistration() {
  }

  public SnsFriendContactRegistration(
    Contact contact,
    SnsIdType snsIdType,
    String snsUserId)
  {
    this();
    this.contact = contact;
    this.snsIdType = snsIdType;
    this.snsUserId = snsUserId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SnsFriendContactRegistration(SnsFriendContactRegistration other) {
    if (other.isSetContact()) {
      this.contact = new Contact(other.contact);
    }
    if (other.isSetSnsIdType()) {
      this.snsIdType = other.snsIdType;
    }
    if (other.isSetSnsUserId()) {
      this.snsUserId = other.snsUserId;
    }
  }

  public SnsFriendContactRegistration deepCopy() {
    return new SnsFriendContactRegistration(this);
  }

  public void clear() {
    this.contact = null;
    this.snsIdType = null;
    this.snsUserId = null;
  }

  public Contact getContact() {
    return this.contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public void unsetContact() {
    this.contact = null;
  }

  /** Returns true if field contact is set (has been assigned a value) and false otherwise */
  public boolean isSetContact() {
    return this.contact != null;
  }

  public void setContactIsSet(boolean value) {
    if (!value) {
      this.contact = null;
    }
  }

  /**
   * 
   * @see SnsIdType
   */
  public SnsIdType getSnsIdType() {
    return this.snsIdType;
  }

  /**
   * 
   * @see SnsIdType
   */
  public void setSnsIdType(SnsIdType snsIdType) {
    this.snsIdType = snsIdType;
  }

  public void unsetSnsIdType() {
    this.snsIdType = null;
  }

  /** Returns true if field snsIdType is set (has been assigned a value) and false otherwise */
  public boolean isSetSnsIdType() {
    return this.snsIdType != null;
  }

  public void setSnsIdTypeIsSet(boolean value) {
    if (!value) {
      this.snsIdType = null;
    }
  }

  public String getSnsUserId() {
    return this.snsUserId;
  }

  public void setSnsUserId(String snsUserId) {
    this.snsUserId = snsUserId;
  }

  public void unsetSnsUserId() {
    this.snsUserId = null;
  }

  /** Returns true if field snsUserId is set (has been assigned a value) and false otherwise */
  public boolean isSetSnsUserId() {
    return this.snsUserId != null;
  }

  public void setSnsUserIdIsSet(boolean value) {
    if (!value) {
      this.snsUserId = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SnsFriendContactRegistration)
      return this.equals((SnsFriendContactRegistration)that);
    return false;
  }

  public boolean equals(SnsFriendContactRegistration that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_contact = true && this.isSetContact();
    boolean that_present_contact = true && that.isSetContact();
    if (this_present_contact || that_present_contact) {
      if (!(this_present_contact && that_present_contact))
        return false;
      if (!this.contact.equals(that.contact))
        return false;
    }

    boolean this_present_snsIdType = true && this.isSetSnsIdType();
    boolean that_present_snsIdType = true && that.isSetSnsIdType();
    if (this_present_snsIdType || that_present_snsIdType) {
      if (!(this_present_snsIdType && that_present_snsIdType))
        return false;
      if (!this.snsIdType.equals(that.snsIdType))
        return false;
    }

    boolean this_present_snsUserId = true && this.isSetSnsUserId();
    boolean that_present_snsUserId = true && that.isSetSnsUserId();
    if (this_present_snsUserId || that_present_snsUserId) {
      if (!(this_present_snsUserId && that_present_snsUserId))
        return false;
      if (!this.snsUserId.equals(that.snsUserId))
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

    SnsFriendContactRegistration other = (SnsFriendContactRegistration)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetContact(), other.isSetContact());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContact()) {
      lastComparison = this.contact.compareTo(other.contact);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSnsIdType(), other.isSetSnsIdType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSnsIdType()) {
      lastComparison = TBaseHelper.compareTo(this.snsIdType, other.snsIdType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSnsUserId(), other.isSetSnsUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSnsUserId()) {
      lastComparison = TBaseHelper.compareTo(this.snsUserId, other.snsUserId);
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
        case 1: // CONTACT
          if (field.type == TType.STRUCT) {
            this.contact = new Contact();
            this.contact.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SNS_ID_TYPE
          if (field.type == TType.I32) {
            this.snsIdType = SnsIdType.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // SNS_USER_ID
          if (field.type == TType.STRING) {
            this.snsUserId = iprot.readString();
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
    if (this.contact != null) {
      oprot.writeFieldBegin(CONTACT_FIELD_DESC);
      this.contact.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.snsIdType != null) {
      oprot.writeFieldBegin(SNS_ID_TYPE_FIELD_DESC);
      oprot.writeI32(this.snsIdType.getValue());
      oprot.writeFieldEnd();
    }
    if (this.snsUserId != null) {
      oprot.writeFieldBegin(SNS_USER_ID_FIELD_DESC);
      oprot.writeString(this.snsUserId);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("SnsFriendContactRegistration(");
    boolean first = true;

    sb.append("contact:");
    if (this.contact == null) {
      sb.append("null");
    } else {
      sb.append(this.contact);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("snsIdType:");
    if (this.snsIdType == null) {
      sb.append("null");
    } else {
      sb.append(this.snsIdType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("snsUserId:");
    if (this.snsUserId == null) {
      sb.append("null");
    } else {
      sb.append(this.snsUserId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

