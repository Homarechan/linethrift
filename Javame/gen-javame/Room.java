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

public class Room implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("Room");

  private static final TField MID_FIELD_DESC = new TField("mid", TType.STRING, (short)1);
  private static final TField CREATED_TIME_FIELD_DESC = new TField("createdTime", TType.I64, (short)2);
  private static final TField CONTACTS_FIELD_DESC = new TField("contacts", TType.LIST, (short)10);
  private static final TField NOTIFICATION_DISABLED_FIELD_DESC = new TField("notificationDisabled", TType.BOOL, (short)31);
  private static final TField MEMBER_MIDS_FIELD_DESC = new TField("memberMids", TType.LIST, (short)40);

  private String mid;
  private long createdTime;
  private Vector contacts;
  private boolean notificationDisabled;
  private Vector memberMids;

  // isset id assignments
  private static final int __CREATEDTIME_ISSET_ID = 0;
  private static final int __NOTIFICATIONDISABLED_ISSET_ID = 1;
  private boolean[] __isset_vector = new boolean[2];

  public Room() {
  }

  public Room(
    String mid,
    long createdTime,
    Vector contacts,
    boolean notificationDisabled,
    Vector memberMids)
  {
    this();
    this.mid = mid;
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    this.contacts = contacts;
    this.notificationDisabled = notificationDisabled;
    setNotificationDisabledIsSet(true);
    this.memberMids = memberMids;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Room(Room other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetMid()) {
      this.mid = other.mid;
    }
    this.createdTime = other.createdTime;
    if (other.isSetContacts()) {
      Vector __this__contacts = new Vector();
      for (Enumeration other_enum = other.contacts.elements(); other_enum.hasMoreElements(); ) {
        Contact other_element = (Contact)other_enum.nextElement();
        __this__contacts.addElement(new Contact(other_element));
      }
      this.contacts = __this__contacts;
    }
    this.notificationDisabled = other.notificationDisabled;
    if (other.isSetMemberMids()) {
      Vector __this__memberMids = new Vector();
      for (Enumeration other_enum = other.memberMids.elements(); other_enum.hasMoreElements(); ) {
        String other_element = (String)other_enum.nextElement();
        __this__memberMids.addElement(other_element);
      }
      this.memberMids = __this__memberMids;
    }
  }

  public Room deepCopy() {
    return new Room(this);
  }

  public void clear() {
    this.mid = null;
    setCreatedTimeIsSet(false);
    this.createdTime = 0;
    this.contacts = null;
    setNotificationDisabledIsSet(false);
    this.notificationDisabled = false;
    this.memberMids = null;
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

  public long getCreatedTime() {
    return this.createdTime;
  }

  public void setCreatedTime(long createdTime) {
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
  }

  public void unsetCreatedTime() {
    __isset_vector[__CREATEDTIME_ISSET_ID] = false;
  }

  /** Returns true if field createdTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedTime() {
    return __isset_vector[__CREATEDTIME_ISSET_ID];
  }

  public void setCreatedTimeIsSet(boolean value) {
    __isset_vector[__CREATEDTIME_ISSET_ID] = value;
  }

  public int getContactsSize() {
    return (this.contacts == null) ? 0 : this.contacts.size();
  }

  public Enumeration getContactsEnumeration() {
    return (this.contacts == null) ? null : this.contacts.elements();
  }

  public void addToContacts(Contact elem) {
    if (this.contacts == null) {
      this.contacts = new Vector();
    }
    this.contacts.addElement(elem);
  }

  public Vector getContacts() {
    return this.contacts;
  }

  public void setContacts(Vector contacts) {
    this.contacts = contacts;
  }

  public void unsetContacts() {
    this.contacts = null;
  }

  /** Returns true if field contacts is set (has been assigned a value) and false otherwise */
  public boolean isSetContacts() {
    return this.contacts != null;
  }

  public void setContactsIsSet(boolean value) {
    if (!value) {
      this.contacts = null;
    }
  }

  public boolean isNotificationDisabled() {
    return this.notificationDisabled;
  }

  public void setNotificationDisabled(boolean notificationDisabled) {
    this.notificationDisabled = notificationDisabled;
    setNotificationDisabledIsSet(true);
  }

  public void unsetNotificationDisabled() {
    __isset_vector[__NOTIFICATIONDISABLED_ISSET_ID] = false;
  }

  /** Returns true if field notificationDisabled is set (has been assigned a value) and false otherwise */
  public boolean isSetNotificationDisabled() {
    return __isset_vector[__NOTIFICATIONDISABLED_ISSET_ID];
  }

  public void setNotificationDisabledIsSet(boolean value) {
    __isset_vector[__NOTIFICATIONDISABLED_ISSET_ID] = value;
  }

  public int getMemberMidsSize() {
    return (this.memberMids == null) ? 0 : this.memberMids.size();
  }

  public Enumeration getMemberMidsEnumeration() {
    return (this.memberMids == null) ? null : this.memberMids.elements();
  }

  public void addToMemberMids(String elem) {
    if (this.memberMids == null) {
      this.memberMids = new Vector();
    }
    this.memberMids.addElement(elem);
  }

  public Vector getMemberMids() {
    return this.memberMids;
  }

  public void setMemberMids(Vector memberMids) {
    this.memberMids = memberMids;
  }

  public void unsetMemberMids() {
    this.memberMids = null;
  }

  /** Returns true if field memberMids is set (has been assigned a value) and false otherwise */
  public boolean isSetMemberMids() {
    return this.memberMids != null;
  }

  public void setMemberMidsIsSet(boolean value) {
    if (!value) {
      this.memberMids = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Room)
      return this.equals((Room)that);
    return false;
  }

  public boolean equals(Room that) {
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

    boolean this_present_createdTime = true;
    boolean that_present_createdTime = true;
    if (this_present_createdTime || that_present_createdTime) {
      if (!(this_present_createdTime && that_present_createdTime))
        return false;
      if (this.createdTime != that.createdTime)
        return false;
    }

    boolean this_present_contacts = true && this.isSetContacts();
    boolean that_present_contacts = true && that.isSetContacts();
    if (this_present_contacts || that_present_contacts) {
      if (!(this_present_contacts && that_present_contacts))
        return false;
      if (!this.contacts.equals(that.contacts))
        return false;
    }

    boolean this_present_notificationDisabled = true;
    boolean that_present_notificationDisabled = true;
    if (this_present_notificationDisabled || that_present_notificationDisabled) {
      if (!(this_present_notificationDisabled && that_present_notificationDisabled))
        return false;
      if (this.notificationDisabled != that.notificationDisabled)
        return false;
    }

    boolean this_present_memberMids = true && this.isSetMemberMids();
    boolean that_present_memberMids = true && that.isSetMemberMids();
    if (this_present_memberMids || that_present_memberMids) {
      if (!(this_present_memberMids && that_present_memberMids))
        return false;
      if (!this.memberMids.equals(that.memberMids))
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

    Room other = (Room)otherObject;    int lastComparison = 0;

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
    lastComparison = TBaseHelper.compareTo(isSetCreatedTime(), other.isSetCreatedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedTime()) {
      lastComparison = TBaseHelper.compareTo(this.createdTime, other.createdTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetContacts(), other.isSetContacts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContacts()) {
      lastComparison = TBaseHelper.compareTo(this.contacts, other.contacts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetNotificationDisabled(), other.isSetNotificationDisabled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotificationDisabled()) {
      lastComparison = TBaseHelper.compareTo(this.notificationDisabled, other.notificationDisabled);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetMemberMids(), other.isSetMemberMids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMemberMids()) {
      lastComparison = TBaseHelper.compareTo(this.memberMids, other.memberMids);
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
        case 2: // CREATED_TIME
          if (field.type == TType.I64) {
            this.createdTime = iprot.readI64();
            setCreatedTimeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 10: // CONTACTS
          if (field.type == TType.LIST) {
            {
              TList _list217 = iprot.readListBegin();
              this.contacts = new Vector(_list217.size);
              for (int _i218 = 0; _i218 < _list217.size; ++_i218)
              {
                Contact _elem219;
                _elem219 = new Contact();
                _elem219.read(iprot);
                this.contacts.addElement(_elem219);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 31: // NOTIFICATION_DISABLED
          if (field.type == TType.BOOL) {
            this.notificationDisabled = iprot.readBool();
            setNotificationDisabledIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 40: // MEMBER_MIDS
          if (field.type == TType.LIST) {
            {
              TList _list220 = iprot.readListBegin();
              this.memberMids = new Vector(_list220.size);
              for (int _i221 = 0; _i221 < _list220.size; ++_i221)
              {
                String _elem222;
                _elem222 = iprot.readString();
                this.memberMids.addElement(_elem222);
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
    if (this.mid != null) {
      oprot.writeFieldBegin(MID_FIELD_DESC);
      oprot.writeString(this.mid);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
    oprot.writeI64(this.createdTime);
    oprot.writeFieldEnd();
    if (this.contacts != null) {
      oprot.writeFieldBegin(CONTACTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.contacts.size()));
        for (Enumeration _iter223_enum = this.contacts.elements(); _iter223_enum.hasMoreElements(); )         {
          Contact _iter223 = (Contact)_iter223_enum.nextElement();
          _iter223.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(NOTIFICATION_DISABLED_FIELD_DESC);
    oprot.writeBool(this.notificationDisabled);
    oprot.writeFieldEnd();
    if (this.memberMids != null) {
      oprot.writeFieldBegin(MEMBER_MIDS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.memberMids.size()));
        for (Enumeration _iter224_enum = this.memberMids.elements(); _iter224_enum.hasMoreElements(); )         {
          String _iter224 = (String)_iter224_enum.nextElement();
          oprot.writeString(_iter224);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("Room(");
    boolean first = true;

    sb.append("mid:");
    if (this.mid == null) {
      sb.append("null");
    } else {
      sb.append(this.mid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("createdTime:");
    sb.append(this.createdTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("contacts:");
    if (this.contacts == null) {
      sb.append("null");
    } else {
      sb.append(this.contacts);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("notificationDisabled:");
    sb.append(this.notificationDisabled);
    first = false;
    if (!first) sb.append(", ");
    sb.append("memberMids:");
    if (this.memberMids == null) {
      sb.append("null");
    } else {
      sb.append(this.memberMids);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

