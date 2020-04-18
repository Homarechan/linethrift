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

public class BuddyList implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("BuddyList");

  private static final TField CLASSIFICATION_FIELD_DESC = new TField("classification", TType.STRING, (short)1);
  private static final TField DISPLAY_NAME_FIELD_DESC = new TField("displayName", TType.STRING, (short)2);
  private static final TField TOTAL_BUDDY_COUNT_FIELD_DESC = new TField("totalBuddyCount", TType.I32, (short)3);
  private static final TField POPULAR_CONTACTS_FIELD_DESC = new TField("popularContacts", TType.LIST, (short)4);

  private String classification;
  private String displayName;
  private int totalBuddyCount;
  private Vector popularContacts;

  // isset id assignments
  private static final int __TOTALBUDDYCOUNT_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public BuddyList() {
  }

  public BuddyList(
    String classification,
    String displayName,
    int totalBuddyCount,
    Vector popularContacts)
  {
    this();
    this.classification = classification;
    this.displayName = displayName;
    this.totalBuddyCount = totalBuddyCount;
    setTotalBuddyCountIsSet(true);
    this.popularContacts = popularContacts;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuddyList(BuddyList other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetClassification()) {
      this.classification = other.classification;
    }
    if (other.isSetDisplayName()) {
      this.displayName = other.displayName;
    }
    this.totalBuddyCount = other.totalBuddyCount;
    if (other.isSetPopularContacts()) {
      Vector __this__popularContacts = new Vector();
      for (Enumeration other_enum = other.popularContacts.elements(); other_enum.hasMoreElements(); ) {
        Contact other_element = (Contact)other_enum.nextElement();
        __this__popularContacts.addElement(new Contact(other_element));
      }
      this.popularContacts = __this__popularContacts;
    }
  }

  public BuddyList deepCopy() {
    return new BuddyList(this);
  }

  public void clear() {
    this.classification = null;
    this.displayName = null;
    setTotalBuddyCountIsSet(false);
    this.totalBuddyCount = 0;
    this.popularContacts = null;
  }

  public String getClassification() {
    return this.classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }

  public void unsetClassification() {
    this.classification = null;
  }

  /** Returns true if field classification is set (has been assigned a value) and false otherwise */
  public boolean isSetClassification() {
    return this.classification != null;
  }

  public void setClassificationIsSet(boolean value) {
    if (!value) {
      this.classification = null;
    }
  }

  public String getDisplayName() {
    return this.displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public void unsetDisplayName() {
    this.displayName = null;
  }

  /** Returns true if field displayName is set (has been assigned a value) and false otherwise */
  public boolean isSetDisplayName() {
    return this.displayName != null;
  }

  public void setDisplayNameIsSet(boolean value) {
    if (!value) {
      this.displayName = null;
    }
  }

  public int getTotalBuddyCount() {
    return this.totalBuddyCount;
  }

  public void setTotalBuddyCount(int totalBuddyCount) {
    this.totalBuddyCount = totalBuddyCount;
    setTotalBuddyCountIsSet(true);
  }

  public void unsetTotalBuddyCount() {
    __isset_vector[__TOTALBUDDYCOUNT_ISSET_ID] = false;
  }

  /** Returns true if field totalBuddyCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalBuddyCount() {
    return __isset_vector[__TOTALBUDDYCOUNT_ISSET_ID];
  }

  public void setTotalBuddyCountIsSet(boolean value) {
    __isset_vector[__TOTALBUDDYCOUNT_ISSET_ID] = value;
  }

  public int getPopularContactsSize() {
    return (this.popularContacts == null) ? 0 : this.popularContacts.size();
  }

  public Enumeration getPopularContactsEnumeration() {
    return (this.popularContacts == null) ? null : this.popularContacts.elements();
  }

  public void addToPopularContacts(Contact elem) {
    if (this.popularContacts == null) {
      this.popularContacts = new Vector();
    }
    this.popularContacts.addElement(elem);
  }

  public Vector getPopularContacts() {
    return this.popularContacts;
  }

  public void setPopularContacts(Vector popularContacts) {
    this.popularContacts = popularContacts;
  }

  public void unsetPopularContacts() {
    this.popularContacts = null;
  }

  /** Returns true if field popularContacts is set (has been assigned a value) and false otherwise */
  public boolean isSetPopularContacts() {
    return this.popularContacts != null;
  }

  public void setPopularContactsIsSet(boolean value) {
    if (!value) {
      this.popularContacts = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuddyList)
      return this.equals((BuddyList)that);
    return false;
  }

  public boolean equals(BuddyList that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_classification = true && this.isSetClassification();
    boolean that_present_classification = true && that.isSetClassification();
    if (this_present_classification || that_present_classification) {
      if (!(this_present_classification && that_present_classification))
        return false;
      if (!this.classification.equals(that.classification))
        return false;
    }

    boolean this_present_displayName = true && this.isSetDisplayName();
    boolean that_present_displayName = true && that.isSetDisplayName();
    if (this_present_displayName || that_present_displayName) {
      if (!(this_present_displayName && that_present_displayName))
        return false;
      if (!this.displayName.equals(that.displayName))
        return false;
    }

    boolean this_present_totalBuddyCount = true;
    boolean that_present_totalBuddyCount = true;
    if (this_present_totalBuddyCount || that_present_totalBuddyCount) {
      if (!(this_present_totalBuddyCount && that_present_totalBuddyCount))
        return false;
      if (this.totalBuddyCount != that.totalBuddyCount)
        return false;
    }

    boolean this_present_popularContacts = true && this.isSetPopularContacts();
    boolean that_present_popularContacts = true && that.isSetPopularContacts();
    if (this_present_popularContacts || that_present_popularContacts) {
      if (!(this_present_popularContacts && that_present_popularContacts))
        return false;
      if (!this.popularContacts.equals(that.popularContacts))
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

    BuddyList other = (BuddyList)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetClassification(), other.isSetClassification());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClassification()) {
      lastComparison = TBaseHelper.compareTo(this.classification, other.classification);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetDisplayName(), other.isSetDisplayName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayName()) {
      lastComparison = TBaseHelper.compareTo(this.displayName, other.displayName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetTotalBuddyCount(), other.isSetTotalBuddyCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalBuddyCount()) {
      lastComparison = TBaseHelper.compareTo(this.totalBuddyCount, other.totalBuddyCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetPopularContacts(), other.isSetPopularContacts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPopularContacts()) {
      lastComparison = TBaseHelper.compareTo(this.popularContacts, other.popularContacts);
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
        case 1: // CLASSIFICATION
          if (field.type == TType.STRING) {
            this.classification = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // DISPLAY_NAME
          if (field.type == TType.STRING) {
            this.displayName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // TOTAL_BUDDY_COUNT
          if (field.type == TType.I32) {
            this.totalBuddyCount = iprot.readI32();
            setTotalBuddyCountIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // POPULAR_CONTACTS
          if (field.type == TType.LIST) {
            {
              TList _list60 = iprot.readListBegin();
              this.popularContacts = new Vector(_list60.size);
              for (int _i61 = 0; _i61 < _list60.size; ++_i61)
              {
                Contact _elem62;
                _elem62 = new Contact();
                _elem62.read(iprot);
                this.popularContacts.addElement(_elem62);
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
    if (this.classification != null) {
      oprot.writeFieldBegin(CLASSIFICATION_FIELD_DESC);
      oprot.writeString(this.classification);
      oprot.writeFieldEnd();
    }
    if (this.displayName != null) {
      oprot.writeFieldBegin(DISPLAY_NAME_FIELD_DESC);
      oprot.writeString(this.displayName);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(TOTAL_BUDDY_COUNT_FIELD_DESC);
    oprot.writeI32(this.totalBuddyCount);
    oprot.writeFieldEnd();
    if (this.popularContacts != null) {
      oprot.writeFieldBegin(POPULAR_CONTACTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.popularContacts.size()));
        for (Enumeration _iter63_enum = this.popularContacts.elements(); _iter63_enum.hasMoreElements(); )         {
          Contact _iter63 = (Contact)_iter63_enum.nextElement();
          _iter63.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("BuddyList(");
    boolean first = true;

    sb.append("classification:");
    if (this.classification == null) {
      sb.append("null");
    } else {
      sb.append(this.classification);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("displayName:");
    if (this.displayName == null) {
      sb.append("null");
    } else {
      sb.append(this.displayName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("totalBuddyCount:");
    sb.append(this.totalBuddyCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("popularContacts:");
    if (this.popularContacts == null) {
      sb.append("null");
    } else {
      sb.append(this.popularContacts);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

