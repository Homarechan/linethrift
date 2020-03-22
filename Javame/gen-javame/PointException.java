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

public class PointException extends Exception implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("PointException");

  private static final TField CODE_FIELD_DESC = new TField("code", TType.I32, (short)1);
  private static final TField REASON_FIELD_DESC = new TField("reason", TType.STRING, (short)2);
  private static final TField EXTRA_FIELD_DESC = new TField("extra", TType.MAP, (short)3);

  private PointErrorCode code;
  private String reason;
  private Hashtable extra;

  // isset id assignments

  public PointException() {
  }

  public PointException(
    PointErrorCode code,
    String reason,
    Hashtable extra)
  {
    this();
    this.code = code;
    this.reason = reason;
    this.extra = extra;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PointException(PointException other) {
    if (other.isSetCode()) {
      this.code = other.code;
    }
    if (other.isSetReason()) {
      this.reason = other.reason;
    }
    if (other.isSetExtra()) {
      Hashtable __this__extra = new Hashtable();
      for (Enumeration other_enum = other.extra.keys(); other_enum.hasMoreElements(); ) {

        String other_element_key = (String)other_enum.nextElement();
        String other_element_value = (String)other.extra.get(other_element_key);

        String __this__extra_copy_key = other_element_key;

        String __this__extra_copy_value = other_element_value;

        __this__extra.put(__this__extra_copy_key, __this__extra_copy_value);
      }
      this.extra = __this__extra;
    }
  }

  public PointException deepCopy() {
    return new PointException(this);
  }

  public void clear() {
    this.code = null;
    this.reason = null;
    this.extra = null;
  }

  /**
   * 
   * @see PointErrorCode
   */
  public PointErrorCode getCode() {
    return this.code;
  }

  /**
   * 
   * @see PointErrorCode
   */
  public void setCode(PointErrorCode code) {
    this.code = code;
  }

  public void unsetCode() {
    this.code = null;
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return this.code != null;
  }

  public void setCodeIsSet(boolean value) {
    if (!value) {
      this.code = null;
    }
  }

  public String getReason() {
    return this.reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public void unsetReason() {
    this.reason = null;
  }

  /** Returns true if field reason is set (has been assigned a value) and false otherwise */
  public boolean isSetReason() {
    return this.reason != null;
  }

  public void setReasonIsSet(boolean value) {
    if (!value) {
      this.reason = null;
    }
  }

  public int getExtraSize() {
    return (this.extra == null) ? 0 : this.extra.size();
  }

  public void putToExtra(String key, String val) {
    if (this.extra == null) {
      this.extra = new Hashtable();
    }
    this.extra.put(key, val);
  }

  public Hashtable getExtra() {
    return this.extra;
  }

  public void setExtra(Hashtable extra) {
    this.extra = extra;
  }

  public void unsetExtra() {
    this.extra = null;
  }

  /** Returns true if field extra is set (has been assigned a value) and false otherwise */
  public boolean isSetExtra() {
    return this.extra != null;
  }

  public void setExtraIsSet(boolean value) {
    if (!value) {
      this.extra = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PointException)
      return this.equals((PointException)that);
    return false;
  }

  public boolean equals(PointException that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_code = true && this.isSetCode();
    boolean that_present_code = true && that.isSetCode();
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (!this.code.equals(that.code))
        return false;
    }

    boolean this_present_reason = true && this.isSetReason();
    boolean that_present_reason = true && that.isSetReason();
    if (this_present_reason || that_present_reason) {
      if (!(this_present_reason && that_present_reason))
        return false;
      if (!this.reason.equals(that.reason))
        return false;
    }

    boolean this_present_extra = true && this.isSetExtra();
    boolean that_present_extra = true && that.isSetExtra();
    if (this_present_extra || that_present_extra) {
      if (!(this_present_extra && that_present_extra))
        return false;
      if (!this.extra.equals(that.extra))
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

    PointException other = (PointException)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetCode(), other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetReason(), other.isSetReason());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReason()) {
      lastComparison = TBaseHelper.compareTo(this.reason, other.reason);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetExtra(), other.isSetExtra());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtra()) {
      lastComparison = TBaseHelper.compareTo(this.extra, other.extra);
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
        case 1: // CODE
          if (field.type == TType.I32) {
            this.code = PointErrorCode.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // REASON
          if (field.type == TType.STRING) {
            this.reason = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // EXTRA
          if (field.type == TType.MAP) {
            {
              TMap _map522 = iprot.readMapBegin();
              this.extra = new Hashtable(2*_map522.size);
              for (int _i523 = 0; _i523 < _map522.size; ++_i523)
              {
                String _key524;
                String _val525;
                _key524 = iprot.readString();
                _val525 = iprot.readString();
                this.extra.put(_key524, _val525);
              }
              iprot.readMapEnd();
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
    if (this.code != null) {
      oprot.writeFieldBegin(CODE_FIELD_DESC);
      oprot.writeI32(this.code.getValue());
      oprot.writeFieldEnd();
    }
    if (this.reason != null) {
      oprot.writeFieldBegin(REASON_FIELD_DESC);
      oprot.writeString(this.reason);
      oprot.writeFieldEnd();
    }
    if (this.extra != null) {
      oprot.writeFieldBegin(EXTRA_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.extra.size()));
        for (Enumeration _iter526_enum = this.extra.keys(); _iter526_enum.hasMoreElements(); )         {
          String _iter526 = (String)_iter526_enum.nextElement();
          oprot.writeString(_iter526);
          oprot.writeString(((String)this.extra.get(_iter526)));
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("PointException(");
    boolean first = true;

    sb.append("code:");
    if (this.code == null) {
      sb.append("null");
    } else {
      sb.append(this.code);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("reason:");
    if (this.reason == null) {
      sb.append("null");
    } else {
      sb.append(this.reason);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("extra:");
    if (this.extra == null) {
      sb.append("null");
    } else {
      sb.append(this.extra);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
