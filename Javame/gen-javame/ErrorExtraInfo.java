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

public class ErrorExtraInfo implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("ErrorExtraInfo");

  private static final TField PRECONDITION_FAILED_EXTRA_INFO_FIELD_DESC = new TField("preconditionFailedExtraInfo", TType.I32, (short)1);

  private PreconditionFailedExtraInfo preconditionFailedExtraInfo;

  // isset id assignments

  public ErrorExtraInfo() {
  }

  public ErrorExtraInfo(
    PreconditionFailedExtraInfo preconditionFailedExtraInfo)
  {
    this();
    this.preconditionFailedExtraInfo = preconditionFailedExtraInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ErrorExtraInfo(ErrorExtraInfo other) {
    if (other.isSetPreconditionFailedExtraInfo()) {
      this.preconditionFailedExtraInfo = other.preconditionFailedExtraInfo;
    }
  }

  public ErrorExtraInfo deepCopy() {
    return new ErrorExtraInfo(this);
  }

  public void clear() {
    this.preconditionFailedExtraInfo = null;
  }

  /**
   * 
   * @see PreconditionFailedExtraInfo
   */
  public PreconditionFailedExtraInfo getPreconditionFailedExtraInfo() {
    return this.preconditionFailedExtraInfo;
  }

  /**
   * 
   * @see PreconditionFailedExtraInfo
   */
  public void setPreconditionFailedExtraInfo(PreconditionFailedExtraInfo preconditionFailedExtraInfo) {
    this.preconditionFailedExtraInfo = preconditionFailedExtraInfo;
  }

  public void unsetPreconditionFailedExtraInfo() {
    this.preconditionFailedExtraInfo = null;
  }

  /** Returns true if field preconditionFailedExtraInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetPreconditionFailedExtraInfo() {
    return this.preconditionFailedExtraInfo != null;
  }

  public void setPreconditionFailedExtraInfoIsSet(boolean value) {
    if (!value) {
      this.preconditionFailedExtraInfo = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ErrorExtraInfo)
      return this.equals((ErrorExtraInfo)that);
    return false;
  }

  public boolean equals(ErrorExtraInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_preconditionFailedExtraInfo = true && this.isSetPreconditionFailedExtraInfo();
    boolean that_present_preconditionFailedExtraInfo = true && that.isSetPreconditionFailedExtraInfo();
    if (this_present_preconditionFailedExtraInfo || that_present_preconditionFailedExtraInfo) {
      if (!(this_present_preconditionFailedExtraInfo && that_present_preconditionFailedExtraInfo))
        return false;
      if (!this.preconditionFailedExtraInfo.equals(that.preconditionFailedExtraInfo))
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

    ErrorExtraInfo other = (ErrorExtraInfo)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetPreconditionFailedExtraInfo(), other.isSetPreconditionFailedExtraInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPreconditionFailedExtraInfo()) {
      lastComparison = TBaseHelper.compareTo(this.preconditionFailedExtraInfo, other.preconditionFailedExtraInfo);
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
        case 1: // PRECONDITION_FAILED_EXTRA_INFO
          if (field.type == TType.I32) {
            this.preconditionFailedExtraInfo = PreconditionFailedExtraInfo.findByValue(iprot.readI32());
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
    if (this.preconditionFailedExtraInfo != null) {
      oprot.writeFieldBegin(PRECONDITION_FAILED_EXTRA_INFO_FIELD_DESC);
      oprot.writeI32(this.preconditionFailedExtraInfo.getValue());
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("ErrorExtraInfo(");
    boolean first = true;

    sb.append("preconditionFailedExtraInfo:");
    if (this.preconditionFailedExtraInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.preconditionFailedExtraInfo);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

