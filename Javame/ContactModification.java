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

public class ContactModification implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("ContactModification");

  private static final TField TYPE_FIELD_DESC = new TField("type", TType.I32, (short)1);
  private static final TField LUID_FIELD_DESC = new TField("luid", TType.STRING, (short)2);
  private static final TField PHONES_FIELD_DESC = new TField("phones", TType.LIST, (short)11);
  private static final TField EMAILS_FIELD_DESC = new TField("emails", TType.LIST, (short)12);
  private static final TField USERIDS_FIELD_DESC = new TField("userids", TType.LIST, (short)13);

  private ModificationType type;
  private String luid;
  private Vector phones;
  private Vector emails;
  private Vector userids;

  // isset id assignments

  public ContactModification() {
  }

  public ContactModification(
    ModificationType type,
    String luid,
    Vector phones,
    Vector emails,
    Vector userids)
  {
    this();
    this.type = type;
    this.luid = luid;
    this.phones = phones;
    this.emails = emails;
    this.userids = userids;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ContactModification(ContactModification other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetLuid()) {
      this.luid = other.luid;
    }
    if (other.isSetPhones()) {
      Vector __this__phones = new Vector();
      for (Enumeration other_enum = other.phones.elements(); other_enum.hasMoreElements(); ) {
        String other_element = (String)other_enum.nextElement();
        __this__phones.addElement(other_element);
      }
      this.phones = __this__phones;
    }
    if (other.isSetEmails()) {
      Vector __this__emails = new Vector();
      for (Enumeration other_enum = other.emails.elements(); other_enum.hasMoreElements(); ) {
        String other_element = (String)other_enum.nextElement();
        __this__emails.addElement(other_element);
      }
      this.emails = __this__emails;
    }
    if (other.isSetUserids()) {
      Vector __this__userids = new Vector();
      for (Enumeration other_enum = other.userids.elements(); other_enum.hasMoreElements(); ) {
        String other_element = (String)other_enum.nextElement();
        __this__userids.addElement(other_element);
      }
      this.userids = __this__userids;
    }
  }

  public ContactModification deepCopy() {
    return new ContactModification(this);
  }

  public void clear() {
    this.type = null;
    this.luid = null;
    this.phones = null;
    this.emails = null;
    this.userids = null;
  }

  /**
   * 
   * @see ModificationType
   */
  public ModificationType getType() {
    return this.type;
  }

  /**
   * 
   * @see ModificationType
   */
  public void setType(ModificationType type) {
    this.type = type;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public String getLuid() {
    return this.luid;
  }

  public void setLuid(String luid) {
    this.luid = luid;
  }

  public void unsetLuid() {
    this.luid = null;
  }

  /** Returns true if field luid is set (has been assigned a value) and false otherwise */
  public boolean isSetLuid() {
    return this.luid != null;
  }

  public void setLuidIsSet(boolean value) {
    if (!value) {
      this.luid = null;
    }
  }

  public int getPhonesSize() {
    return (this.phones == null) ? 0 : this.phones.size();
  }

  public Enumeration getPhonesEnumeration() {
    return (this.phones == null) ? null : this.phones.elements();
  }

  public void addToPhones(String elem) {
    if (this.phones == null) {
      this.phones = new Vector();
    }
    this.phones.addElement(elem);
  }

  public Vector getPhones() {
    return this.phones;
  }

  public void setPhones(Vector phones) {
    this.phones = phones;
  }

  public void unsetPhones() {
    this.phones = null;
  }

  /** Returns true if field phones is set (has been assigned a value) and false otherwise */
  public boolean isSetPhones() {
    return this.phones != null;
  }

  public void setPhonesIsSet(boolean value) {
    if (!value) {
      this.phones = null;
    }
  }

  public int getEmailsSize() {
    return (this.emails == null) ? 0 : this.emails.size();
  }

  public Enumeration getEmailsEnumeration() {
    return (this.emails == null) ? null : this.emails.elements();
  }

  public void addToEmails(String elem) {
    if (this.emails == null) {
      this.emails = new Vector();
    }
    this.emails.addElement(elem);
  }

  public Vector getEmails() {
    return this.emails;
  }

  public void setEmails(Vector emails) {
    this.emails = emails;
  }

  public void unsetEmails() {
    this.emails = null;
  }

  /** Returns true if field emails is set (has been assigned a value) and false otherwise */
  public boolean isSetEmails() {
    return this.emails != null;
  }

  public void setEmailsIsSet(boolean value) {
    if (!value) {
      this.emails = null;
    }
  }

  public int getUseridsSize() {
    return (this.userids == null) ? 0 : this.userids.size();
  }

  public Enumeration getUseridsEnumeration() {
    return (this.userids == null) ? null : this.userids.elements();
  }

  public void addToUserids(String elem) {
    if (this.userids == null) {
      this.userids = new Vector();
    }
    this.userids.addElement(elem);
  }

  public Vector getUserids() {
    return this.userids;
  }

  public void setUserids(Vector userids) {
    this.userids = userids;
  }

  public void unsetUserids() {
    this.userids = null;
  }

  /** Returns true if field userids is set (has been assigned a value) and false otherwise */
  public boolean isSetUserids() {
    return this.userids != null;
  }

  public void setUseridsIsSet(boolean value) {
    if (!value) {
      this.userids = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ContactModification)
      return this.equals((ContactModification)that);
    return false;
  }

  public boolean equals(ContactModification that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_luid = true && this.isSetLuid();
    boolean that_present_luid = true && that.isSetLuid();
    if (this_present_luid || that_present_luid) {
      if (!(this_present_luid && that_present_luid))
        return false;
      if (!this.luid.equals(that.luid))
        return false;
    }

    boolean this_present_phones = true && this.isSetPhones();
    boolean that_present_phones = true && that.isSetPhones();
    if (this_present_phones || that_present_phones) {
      if (!(this_present_phones && that_present_phones))
        return false;
      if (!this.phones.equals(that.phones))
        return false;
    }

    boolean this_present_emails = true && this.isSetEmails();
    boolean that_present_emails = true && that.isSetEmails();
    if (this_present_emails || that_present_emails) {
      if (!(this_present_emails && that_present_emails))
        return false;
      if (!this.emails.equals(that.emails))
        return false;
    }

    boolean this_present_userids = true && this.isSetUserids();
    boolean that_present_userids = true && that.isSetUserids();
    if (this_present_userids || that_present_userids) {
      if (!(this_present_userids && that_present_userids))
        return false;
      if (!this.userids.equals(that.userids))
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

    ContactModification other = (ContactModification)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetType(), other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetLuid(), other.isSetLuid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLuid()) {
      lastComparison = TBaseHelper.compareTo(this.luid, other.luid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetPhones(), other.isSetPhones());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPhones()) {
      lastComparison = TBaseHelper.compareTo(this.phones, other.phones);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetEmails(), other.isSetEmails());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmails()) {
      lastComparison = TBaseHelper.compareTo(this.emails, other.emails);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetUserids(), other.isSetUserids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserids()) {
      lastComparison = TBaseHelper.compareTo(this.userids, other.userids);
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
        case 1: // TYPE
          if (field.type == TType.I32) {
            this.type = ModificationType.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // LUID
          if (field.type == TType.STRING) {
            this.luid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 11: // PHONES
          if (field.type == TType.LIST) {
            {
              TList _list113 = iprot.readListBegin();
              this.phones = new Vector(_list113.size);
              for (int _i114 = 0; _i114 < _list113.size; ++_i114)
              {
                String _elem115;
                _elem115 = iprot.readString();
                this.phones.addElement(_elem115);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 12: // EMAILS
          if (field.type == TType.LIST) {
            {
              TList _list116 = iprot.readListBegin();
              this.emails = new Vector(_list116.size);
              for (int _i117 = 0; _i117 < _list116.size; ++_i117)
              {
                String _elem118;
                _elem118 = iprot.readString();
                this.emails.addElement(_elem118);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 13: // USERIDS
          if (field.type == TType.LIST) {
            {
              TList _list119 = iprot.readListBegin();
              this.userids = new Vector(_list119.size);
              for (int _i120 = 0; _i120 < _list119.size; ++_i120)
              {
                String _elem121;
                _elem121 = iprot.readString();
                this.userids.addElement(_elem121);
              }
              iprot.readListEnd();
            }
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
    if (this.type != null) {
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeI32(this.type.getValue());
      oprot.writeFieldEnd();
    }
    if (this.luid != null) {
      oprot.writeFieldBegin(LUID_FIELD_DESC);
      oprot.writeString(this.luid);
      oprot.writeFieldEnd();
    }
    if (this.phones != null) {
      oprot.writeFieldBegin(PHONES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.phones.size()));
        for (Enumeration _iter122_enum = this.phones.elements(); _iter122_enum.hasMoreElements(); )         {
          String _iter122 = (String)_iter122_enum.nextElement();
          oprot.writeString(_iter122);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.emails != null) {
      oprot.writeFieldBegin(EMAILS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.emails.size()));
        for (Enumeration _iter123_enum = this.emails.elements(); _iter123_enum.hasMoreElements(); )         {
          String _iter123 = (String)_iter123_enum.nextElement();
          oprot.writeString(_iter123);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.userids != null) {
      oprot.writeFieldBegin(USERIDS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.userids.size()));
        for (Enumeration _iter124_enum = this.userids.elements(); _iter124_enum.hasMoreElements(); )         {
          String _iter124 = (String)_iter124_enum.nextElement();
          oprot.writeString(_iter124);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("ContactModification(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("luid:");
    if (this.luid == null) {
      sb.append("null");
    } else {
      sb.append(this.luid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("phones:");
    if (this.phones == null) {
      sb.append("null");
    } else {
      sb.append(this.phones);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("emails:");
    if (this.emails == null) {
      sb.append("null");
    } else {
      sb.append(this.emails);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userids:");
    if (this.userids == null) {
      sb.append("null");
    } else {
      sb.append(this.userids);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

