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

public class ContactReport implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("ContactReport");

  private static final TField MID_FIELD_DESC = new TField("mid", TType.STRING, (short)1);
  private static final TField EXISTS_FIELD_DESC = new TField("exists", TType.BOOL, (short)2);
  private static final TField CONTACT_FIELD_DESC = new TField("contact", TType.STRUCT, (short)3);

  private String mid;
  private boolean exists;
  private Contact contact;

  // isset id assignments
  private static final int __EXISTS_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public ContactReport() {
  }

  public ContactReport(
    String mid,
    boolean exists,
    Contact contact)
  {
    this();
    this.mid = mid;
    this.exists = exists;
    setExistsIsSet(true);
    this.contact = contact;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ContactReport(ContactReport other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetMid()) {
      this.mid = other.mid;
    }
    this.exists = other.exists;
    if (other.isSetContact()) {
      this.contact = new Contact(other.contact);
    }
  }

  public ContactReport deepCopy() {
    return new ContactReport(this);
  }

  public void clear() {
    this.mid = null;
    setExistsIsSet(false);
    this.exists = false;
    this.contact = null;
  }

  public String getMid() {
    return this.mid;
  }

  public void setMid(String mid) {
    this.mid = mid;
  }

  public void unsetMid() {
    this.mid = null;
  }

  /** Returns true if field mid is set (has been assigned a value) and false otherwise */
  public boolean isSetMid() {
    return this.mid != null;
  }

  public void setMidIsSet(boolean value) {
    if (!value) {
      this.mid = null;
    }
  }

  public boolean isExists() {
    return this.exists;
  }

  public void setExists(boolean exists) {
    this.exists = exists;
    setExistsIsSet(true);
  }

  public void unsetExists() {
    __isset_vector[__EXISTS_ISSET_ID] = false;
  }

  /** Returns true if field exists is set (has been assigned a value) and false otherwise */
  public boolean isSetExists() {
    return __isset_vector[__EXISTS_ISSET_ID];
  }

  public void setExistsIsSet(boolean value) {
    __isset_vector[__EXISTS_ISSET_ID] = value;
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

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ContactReport)
      return this.equals((ContactReport)that);
    return false;
  }

  public boolean equals(ContactReport that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_mid = true && this.isSetMid();
    boolean that_present_mid = true && that.isSetMid();
    if (this_present_mid || that_present_mid) {
      if (!(this_present_mid && that_present_mid))
        return false;
      if (!this.mid.equals(that.mid))
        return false;
    }

    boolean this_present_exists = true;
    boolean that_present_exists = true;
    if (this_present_exists || that_present_exists) {
      if (!(this_present_exists && that_present_exists))
        return false;
      if (this.exists != that.exists)
        return false;
    }

    boolean this_present_contact = true && this.isSetContact();
    boolean that_present_contact = true && that.isSetContact();
    if (this_present_contact || that_present_contact) {
      if (!(this_present_contact && that_present_contact))
        return false;
      if (!this.contact.equals(that.contact))
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

    ContactReport other = (ContactReport)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetMid(), other.isSetMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMid()) {
      lastComparison = TBaseHelper.compareTo(this.mid, other.mid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetExists(), other.isSetExists());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExists()) {
      lastComparison = TBaseHelper.compareTo(this.exists, other.exists);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
        case 1: // MID
          if (field.type == TType.STRING) {
            this.mid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // EXISTS
          if (field.type == TType.BOOL) {
            this.exists = iprot.readBool();
            setExistsIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // CONTACT
          if (field.type == TType.STRUCT) {
            this.contact = new Contact();
            this.contact.read(iprot);
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
    if (this.mid != null) {
      oprot.writeFieldBegin(MID_FIELD_DESC);
      oprot.writeString(this.mid);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(EXISTS_FIELD_DESC);
    oprot.writeBool(this.exists);
    oprot.writeFieldEnd();
    if (this.contact != null) {
      oprot.writeFieldBegin(CONTACT_FIELD_DESC);
      this.contact.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("ContactReport(");
    boolean first = true;

    sb.append("mid:");
    if (this.mid == null) {
      sb.append("null");
    } else {
      sb.append(this.mid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("exists:");
    sb.append(this.exists);
    first = false;
    if (!first) sb.append(", ");
    sb.append("contact:");
    if (this.contact == null) {
      sb.append("null");
    } else {
      sb.append(this.contact);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

