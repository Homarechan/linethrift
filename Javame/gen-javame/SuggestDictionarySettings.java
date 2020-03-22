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

public class SuggestDictionarySettings implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("SuggestDictionarySettings");

  private static final TField REVISION_FIELD_DESC = new TField("revision", TType.I64, (short)1);
  private static final TField NEW_REVISION_FIELD_DESC = new TField("newRevision", TType.I64, (short)2);
  private static final TField DICTIONARIES_FIELD_DESC = new TField("dictionaries", TType.LIST, (short)3);
  private static final TField PRELOADED_DICTIONARIES_FIELD_DESC = new TField("preloadedDictionaries", TType.LIST, (short)4);

  private long revision;
  private long newRevision;
  private Vector dictionaries;
  private Vector preloadedDictionaries;

  // isset id assignments
  private static final int __REVISION_ISSET_ID = 0;
  private static final int __NEWREVISION_ISSET_ID = 1;
  private boolean[] __isset_vector = new boolean[2];

  public SuggestDictionarySettings() {
  }

  public SuggestDictionarySettings(
    long revision,
    long newRevision,
    Vector dictionaries,
    Vector preloadedDictionaries)
  {
    this();
    this.revision = revision;
    setRevisionIsSet(true);
    this.newRevision = newRevision;
    setNewRevisionIsSet(true);
    this.dictionaries = dictionaries;
    this.preloadedDictionaries = preloadedDictionaries;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SuggestDictionarySettings(SuggestDictionarySettings other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.revision = other.revision;
    this.newRevision = other.newRevision;
    if (other.isSetDictionaries()) {
      Vector __this__dictionaries = new Vector();
      for (Enumeration other_enum = other.dictionaries.elements(); other_enum.hasMoreElements(); ) {
        SuggestDictionary other_element = (SuggestDictionary)other_enum.nextElement();
        __this__dictionaries.addElement(new SuggestDictionary(other_element));
      }
      this.dictionaries = __this__dictionaries;
    }
    if (other.isSetPreloadedDictionaries()) {
      Vector __this__preloadedDictionaries = new Vector();
      for (Enumeration other_enum = other.preloadedDictionaries.elements(); other_enum.hasMoreElements(); ) {
        String other_element = (String)other_enum.nextElement();
        __this__preloadedDictionaries.addElement(other_element);
      }
      this.preloadedDictionaries = __this__preloadedDictionaries;
    }
  }

  public SuggestDictionarySettings deepCopy() {
    return new SuggestDictionarySettings(this);
  }

  public void clear() {
    setRevisionIsSet(false);
    this.revision = 0;
    setNewRevisionIsSet(false);
    this.newRevision = 0;
    this.dictionaries = null;
    this.preloadedDictionaries = null;
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

  public long getNewRevision() {
    return this.newRevision;
  }

  public void setNewRevision(long newRevision) {
    this.newRevision = newRevision;
    setNewRevisionIsSet(true);
  }

  public void unsetNewRevision() {
    __isset_vector[__NEWREVISION_ISSET_ID] = false;
  }

  /** Returns true if field newRevision is set (has been assigned a value) and false otherwise */
  public boolean isSetNewRevision() {
    return __isset_vector[__NEWREVISION_ISSET_ID];
  }

  public void setNewRevisionIsSet(boolean value) {
    __isset_vector[__NEWREVISION_ISSET_ID] = value;
  }

  public int getDictionariesSize() {
    return (this.dictionaries == null) ? 0 : this.dictionaries.size();
  }

  public Enumeration getDictionariesEnumeration() {
    return (this.dictionaries == null) ? null : this.dictionaries.elements();
  }

  public void addToDictionaries(SuggestDictionary elem) {
    if (this.dictionaries == null) {
      this.dictionaries = new Vector();
    }
    this.dictionaries.addElement(elem);
  }

  public Vector getDictionaries() {
    return this.dictionaries;
  }

  public void setDictionaries(Vector dictionaries) {
    this.dictionaries = dictionaries;
  }

  public void unsetDictionaries() {
    this.dictionaries = null;
  }

  /** Returns true if field dictionaries is set (has been assigned a value) and false otherwise */
  public boolean isSetDictionaries() {
    return this.dictionaries != null;
  }

  public void setDictionariesIsSet(boolean value) {
    if (!value) {
      this.dictionaries = null;
    }
  }

  public int getPreloadedDictionariesSize() {
    return (this.preloadedDictionaries == null) ? 0 : this.preloadedDictionaries.size();
  }

  public Enumeration getPreloadedDictionariesEnumeration() {
    return (this.preloadedDictionaries == null) ? null : this.preloadedDictionaries.elements();
  }

  public void addToPreloadedDictionaries(String elem) {
    if (this.preloadedDictionaries == null) {
      this.preloadedDictionaries = new Vector();
    }
    this.preloadedDictionaries.addElement(elem);
  }

  public Vector getPreloadedDictionaries() {
    return this.preloadedDictionaries;
  }

  public void setPreloadedDictionaries(Vector preloadedDictionaries) {
    this.preloadedDictionaries = preloadedDictionaries;
  }

  public void unsetPreloadedDictionaries() {
    this.preloadedDictionaries = null;
  }

  /** Returns true if field preloadedDictionaries is set (has been assigned a value) and false otherwise */
  public boolean isSetPreloadedDictionaries() {
    return this.preloadedDictionaries != null;
  }

  public void setPreloadedDictionariesIsSet(boolean value) {
    if (!value) {
      this.preloadedDictionaries = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SuggestDictionarySettings)
      return this.equals((SuggestDictionarySettings)that);
    return false;
  }

  public boolean equals(SuggestDictionarySettings that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_revision = true;
    boolean that_present_revision = true;
    if (this_present_revision || that_present_revision) {
      if (!(this_present_revision && that_present_revision))
        return false;
      if (this.revision != that.revision)
        return false;
    }

    boolean this_present_newRevision = true;
    boolean that_present_newRevision = true;
    if (this_present_newRevision || that_present_newRevision) {
      if (!(this_present_newRevision && that_present_newRevision))
        return false;
      if (this.newRevision != that.newRevision)
        return false;
    }

    boolean this_present_dictionaries = true && this.isSetDictionaries();
    boolean that_present_dictionaries = true && that.isSetDictionaries();
    if (this_present_dictionaries || that_present_dictionaries) {
      if (!(this_present_dictionaries && that_present_dictionaries))
        return false;
      if (!this.dictionaries.equals(that.dictionaries))
        return false;
    }

    boolean this_present_preloadedDictionaries = true && this.isSetPreloadedDictionaries();
    boolean that_present_preloadedDictionaries = true && that.isSetPreloadedDictionaries();
    if (this_present_preloadedDictionaries || that_present_preloadedDictionaries) {
      if (!(this_present_preloadedDictionaries && that_present_preloadedDictionaries))
        return false;
      if (!this.preloadedDictionaries.equals(that.preloadedDictionaries))
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

    SuggestDictionarySettings other = (SuggestDictionarySettings)otherObject;    int lastComparison = 0;

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
    lastComparison = TBaseHelper.compareTo(isSetNewRevision(), other.isSetNewRevision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNewRevision()) {
      lastComparison = TBaseHelper.compareTo(this.newRevision, other.newRevision);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetDictionaries(), other.isSetDictionaries());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDictionaries()) {
      lastComparison = TBaseHelper.compareTo(this.dictionaries, other.dictionaries);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetPreloadedDictionaries(), other.isSetPreloadedDictionaries());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPreloadedDictionaries()) {
      lastComparison = TBaseHelper.compareTo(this.preloadedDictionaries, other.preloadedDictionaries);
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
        case 1: // REVISION
          if (field.type == TType.I64) {
            this.revision = iprot.readI64();
            setRevisionIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NEW_REVISION
          if (field.type == TType.I64) {
            this.newRevision = iprot.readI64();
            setNewRevisionIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // DICTIONARIES
          if (field.type == TType.LIST) {
            {
              TList _list233 = iprot.readListBegin();
              this.dictionaries = new Vector(_list233.size);
              for (int _i234 = 0; _i234 < _list233.size; ++_i234)
              {
                SuggestDictionary _elem235;
                _elem235 = new SuggestDictionary();
                _elem235.read(iprot);
                this.dictionaries.addElement(_elem235);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // PRELOADED_DICTIONARIES
          if (field.type == TType.LIST) {
            {
              TList _list236 = iprot.readListBegin();
              this.preloadedDictionaries = new Vector(_list236.size);
              for (int _i237 = 0; _i237 < _list236.size; ++_i237)
              {
                String _elem238;
                _elem238 = iprot.readString();
                this.preloadedDictionaries.addElement(_elem238);
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
    oprot.writeFieldBegin(REVISION_FIELD_DESC);
    oprot.writeI64(this.revision);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(NEW_REVISION_FIELD_DESC);
    oprot.writeI64(this.newRevision);
    oprot.writeFieldEnd();
    if (this.dictionaries != null) {
      oprot.writeFieldBegin(DICTIONARIES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.dictionaries.size()));
        for (Enumeration _iter239_enum = this.dictionaries.elements(); _iter239_enum.hasMoreElements(); )         {
          SuggestDictionary _iter239 = (SuggestDictionary)_iter239_enum.nextElement();
          _iter239.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.preloadedDictionaries != null) {
      oprot.writeFieldBegin(PRELOADED_DICTIONARIES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.preloadedDictionaries.size()));
        for (Enumeration _iter240_enum = this.preloadedDictionaries.elements(); _iter240_enum.hasMoreElements(); )         {
          String _iter240 = (String)_iter240_enum.nextElement();
          oprot.writeString(_iter240);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("SuggestDictionarySettings(");
    boolean first = true;

    sb.append("revision:");
    sb.append(this.revision);
    first = false;
    if (!first) sb.append(", ");
    sb.append("newRevision:");
    sb.append(this.newRevision);
    first = false;
    if (!first) sb.append(", ");
    sb.append("dictionaries:");
    if (this.dictionaries == null) {
      sb.append("null");
    } else {
      sb.append(this.dictionaries);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("preloadedDictionaries:");
    if (this.preloadedDictionaries == null) {
      sb.append("null");
    } else {
      sb.append(this.preloadedDictionaries);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

