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

public class SuggestDictionaryIncrements implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("SuggestDictionaryIncrements");

  private static final TField ITEM_INCREMENT_FIELD_DESC = new TField("itemIncrement", TType.STRUCT, (short)1);
  private static final TField TAG_INCREMENTS_FIELD_DESC = new TField("tagIncrements", TType.LIST, (short)2);

  private SuggestItemDictionaryIncrement itemIncrement;
  private Vector tagIncrements;

  // isset id assignments

  public SuggestDictionaryIncrements() {
  }

  public SuggestDictionaryIncrements(
    SuggestItemDictionaryIncrement itemIncrement,
    Vector tagIncrements)
  {
    this();
    this.itemIncrement = itemIncrement;
    this.tagIncrements = tagIncrements;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SuggestDictionaryIncrements(SuggestDictionaryIncrements other) {
    if (other.isSetItemIncrement()) {
      this.itemIncrement = new SuggestItemDictionaryIncrement(other.itemIncrement);
    }
    if (other.isSetTagIncrements()) {
      Vector __this__tagIncrements = new Vector();
      for (Enumeration other_enum = other.tagIncrements.elements(); other_enum.hasMoreElements(); ) {
        SuggestTagDictionaryIncrement other_element = (SuggestTagDictionaryIncrement)other_enum.nextElement();
        __this__tagIncrements.addElement(new SuggestTagDictionaryIncrement(other_element));
      }
      this.tagIncrements = __this__tagIncrements;
    }
  }

  public SuggestDictionaryIncrements deepCopy() {
    return new SuggestDictionaryIncrements(this);
  }

  public void clear() {
    this.itemIncrement = null;
    this.tagIncrements = null;
  }

  public SuggestItemDictionaryIncrement getItemIncrement() {
    return this.itemIncrement;
  }

  public void setItemIncrement(SuggestItemDictionaryIncrement itemIncrement) {
    this.itemIncrement = itemIncrement;
  }

  public void unsetItemIncrement() {
    this.itemIncrement = null;
  }

  /** Returns true if field itemIncrement is set (has been assigned a value) and false otherwise */
  public boolean isSetItemIncrement() {
    return this.itemIncrement != null;
  }

  public void setItemIncrementIsSet(boolean value) {
    if (!value) {
      this.itemIncrement = null;
    }
  }

  public int getTagIncrementsSize() {
    return (this.tagIncrements == null) ? 0 : this.tagIncrements.size();
  }

  public Enumeration getTagIncrementsEnumeration() {
    return (this.tagIncrements == null) ? null : this.tagIncrements.elements();
  }

  public void addToTagIncrements(SuggestTagDictionaryIncrement elem) {
    if (this.tagIncrements == null) {
      this.tagIncrements = new Vector();
    }
    this.tagIncrements.addElement(elem);
  }

  public Vector getTagIncrements() {
    return this.tagIncrements;
  }

  public void setTagIncrements(Vector tagIncrements) {
    this.tagIncrements = tagIncrements;
  }

  public void unsetTagIncrements() {
    this.tagIncrements = null;
  }

  /** Returns true if field tagIncrements is set (has been assigned a value) and false otherwise */
  public boolean isSetTagIncrements() {
    return this.tagIncrements != null;
  }

  public void setTagIncrementsIsSet(boolean value) {
    if (!value) {
      this.tagIncrements = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SuggestDictionaryIncrements)
      return this.equals((SuggestDictionaryIncrements)that);
    return false;
  }

  public boolean equals(SuggestDictionaryIncrements that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_itemIncrement = true && this.isSetItemIncrement();
    boolean that_present_itemIncrement = true && that.isSetItemIncrement();
    if (this_present_itemIncrement || that_present_itemIncrement) {
      if (!(this_present_itemIncrement && that_present_itemIncrement))
        return false;
      if (!this.itemIncrement.equals(that.itemIncrement))
        return false;
    }

    boolean this_present_tagIncrements = true && this.isSetTagIncrements();
    boolean that_present_tagIncrements = true && that.isSetTagIncrements();
    if (this_present_tagIncrements || that_present_tagIncrements) {
      if (!(this_present_tagIncrements && that_present_tagIncrements))
        return false;
      if (!this.tagIncrements.equals(that.tagIncrements))
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

    SuggestDictionaryIncrements other = (SuggestDictionaryIncrements)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetItemIncrement(), other.isSetItemIncrement());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItemIncrement()) {
      lastComparison = this.itemIncrement.compareTo(other.itemIncrement);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetTagIncrements(), other.isSetTagIncrements());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTagIncrements()) {
      lastComparison = TBaseHelper.compareTo(this.tagIncrements, other.tagIncrements);
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
        case 1: // ITEM_INCREMENT
          if (field.type == TType.STRUCT) {
            this.itemIncrement = new SuggestItemDictionaryIncrement();
            this.itemIncrement.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // TAG_INCREMENTS
          if (field.type == TType.LIST) {
            {
              TList _list225 = iprot.readListBegin();
              this.tagIncrements = new Vector(_list225.size);
              for (int _i226 = 0; _i226 < _list225.size; ++_i226)
              {
                SuggestTagDictionaryIncrement _elem227;
                _elem227 = new SuggestTagDictionaryIncrement();
                _elem227.read(iprot);
                this.tagIncrements.addElement(_elem227);
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
    if (this.itemIncrement != null) {
      oprot.writeFieldBegin(ITEM_INCREMENT_FIELD_DESC);
      this.itemIncrement.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.tagIncrements != null) {
      oprot.writeFieldBegin(TAG_INCREMENTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.tagIncrements.size()));
        for (Enumeration _iter228_enum = this.tagIncrements.elements(); _iter228_enum.hasMoreElements(); )         {
          SuggestTagDictionaryIncrement _iter228 = (SuggestTagDictionaryIncrement)_iter228_enum.nextElement();
          _iter228.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("SuggestDictionaryIncrements(");
    boolean first = true;

    sb.append("itemIncrement:");
    if (this.itemIncrement == null) {
      sb.append("null");
    } else {
      sb.append(this.itemIncrement);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tagIncrements:");
    if (this.tagIncrements == null) {
      sb.append("null");
    } else {
      sb.append(this.tagIncrements);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

