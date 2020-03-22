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

public class SuggestTagDictionaryIncrement implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("SuggestTagDictionaryIncrement");

  private static final TField STATUS_FIELD_DESC = new TField("status", TType.I32, (short)1);
  private static final TField LANGUAGE_FIELD_DESC = new TField("language", TType.STRING, (short)2);
  private static final TField REVISION_FIELD_DESC = new TField("revision", TType.I64, (short)3);
  private static final TField SCHEME_FIELD_DESC = new TField("scheme", TType.STRING, (short)4);
  private static final TField DATA_FIELD_DESC = new TField("data", TType.STRING, (short)5);

  private SuggestDictionaryIncrementStatus status;
  private String language;
  private long revision;
  private String scheme;
  private byte[] data;

  // isset id assignments
  private static final int __REVISION_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public SuggestTagDictionaryIncrement() {
  }

  public SuggestTagDictionaryIncrement(
    SuggestDictionaryIncrementStatus status,
    String language,
    long revision,
    String scheme,
    byte[] data)
  {
    this();
    this.status = status;
    this.language = language;
    this.revision = revision;
    setRevisionIsSet(true);
    this.scheme = scheme;
    this.data = data;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SuggestTagDictionaryIncrement(SuggestTagDictionaryIncrement other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetLanguage()) {
      this.language = other.language;
    }
    this.revision = other.revision;
    if (other.isSetScheme()) {
      this.scheme = other.scheme;
    }
    if (other.isSetData()) {
      this.data = new byte[other.data.length];
      System.arraycopy(other.data, 0, data, 0, other.data.length);
    }
  }

  public SuggestTagDictionaryIncrement deepCopy() {
    return new SuggestTagDictionaryIncrement(this);
  }

  public void clear() {
    this.status = null;
    this.language = null;
    setRevisionIsSet(false);
    this.revision = 0;
    this.scheme = null;
    this.data = null;
  }

  public SuggestDictionaryIncrementStatus getStatus() {
    return this.status;
  }

  public void setStatus(SuggestDictionaryIncrementStatus status) {
    this.status = status;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public void unsetLanguage() {
    this.language = null;
  }

  /** Returns true if field language is set (has been assigned a value) and false otherwise */
  public boolean isSetLanguage() {
    return this.language != null;
  }

  public void setLanguageIsSet(boolean value) {
    if (!value) {
      this.language = null;
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

  public String getScheme() {
    return this.scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  public void unsetScheme() {
    this.scheme = null;
  }

  /** Returns true if field scheme is set (has been assigned a value) and false otherwise */
  public boolean isSetScheme() {
    return this.scheme != null;
  }

  public void setSchemeIsSet(boolean value) {
    if (!value) {
      this.scheme = null;
    }
  }

  public byte[] getData() {
    return this.data;
  }

  public void setData(byte[] data) {
    this.data = data;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SuggestTagDictionaryIncrement)
      return this.equals((SuggestTagDictionaryIncrement)that);
    return false;
  }

  public boolean equals(SuggestTagDictionaryIncrement that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_language = true && this.isSetLanguage();
    boolean that_present_language = true && that.isSetLanguage();
    if (this_present_language || that_present_language) {
      if (!(this_present_language && that_present_language))
        return false;
      if (!this.language.equals(that.language))
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

    boolean this_present_scheme = true && this.isSetScheme();
    boolean that_present_scheme = true && that.isSetScheme();
    if (this_present_scheme || that_present_scheme) {
      if (!(this_present_scheme && that_present_scheme))
        return false;
      if (!this.scheme.equals(that.scheme))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (TBaseHelper.compareTo(this.data, that.data) != 0)
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

    SuggestTagDictionaryIncrement other = (SuggestTagDictionaryIncrement)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetStatus(), other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetLanguage(), other.isSetLanguage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLanguage()) {
      lastComparison = TBaseHelper.compareTo(this.language, other.language);
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
    lastComparison = TBaseHelper.compareTo(isSetScheme(), other.isSetScheme());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScheme()) {
      lastComparison = TBaseHelper.compareTo(this.scheme, other.scheme);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetData(), other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = TBaseHelper.compareTo(this.data, other.data);
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
        case 1: // STATUS
          if (field.type == TType.I32) {
            this.status = SuggestDictionaryIncrementStatus.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // LANGUAGE
          if (field.type == TType.STRING) {
            this.language = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // REVISION
          if (field.type == TType.I64) {
            this.revision = iprot.readI64();
            setRevisionIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // SCHEME
          if (field.type == TType.STRING) {
            this.scheme = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // DATA
          if (field.type == TType.STRING) {
            this.data = iprot.readBinary();
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
    if (this.status != null) {
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeI32(this.status.getValue());
      oprot.writeFieldEnd();
    }
    if (this.language != null) {
      oprot.writeFieldBegin(LANGUAGE_FIELD_DESC);
      oprot.writeString(this.language);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(REVISION_FIELD_DESC);
    oprot.writeI64(this.revision);
    oprot.writeFieldEnd();
    if (this.scheme != null) {
      oprot.writeFieldBegin(SCHEME_FIELD_DESC);
      oprot.writeString(this.scheme);
      oprot.writeFieldEnd();
    }
    if (this.data != null) {
      oprot.writeFieldBegin(DATA_FIELD_DESC);
      oprot.writeBinary(this.data);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("SuggestTagDictionaryIncrement(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("language:");
    if (this.language == null) {
      sb.append("null");
    } else {
      sb.append(this.language);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("revision:");
    sb.append(this.revision);
    first = false;
    if (!first) sb.append(", ");
    sb.append("scheme:");
    if (this.scheme == null) {
      sb.append("null");
    } else {
      sb.append(this.scheme);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      TBaseHelper.toString(this.data, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

