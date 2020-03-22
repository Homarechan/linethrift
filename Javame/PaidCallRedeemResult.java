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

public class PaidCallRedeemResult implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("PaidCallRedeemResult");

  private static final TField EVENT_NAME_FIELD_DESC = new TField("eventName", TType.STRING, (short)1);
  private static final TField EVENT_AMOUNT_FIELD_DESC = new TField("eventAmount", TType.I32, (short)2);

  private String eventName;
  private int eventAmount;

  // isset id assignments
  private static final int __EVENTAMOUNT_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public PaidCallRedeemResult() {
  }

  public PaidCallRedeemResult(
    String eventName,
    int eventAmount)
  {
    this();
    this.eventName = eventName;
    this.eventAmount = eventAmount;
    setEventAmountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PaidCallRedeemResult(PaidCallRedeemResult other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetEventName()) {
      this.eventName = other.eventName;
    }
    this.eventAmount = other.eventAmount;
  }

  public PaidCallRedeemResult deepCopy() {
    return new PaidCallRedeemResult(this);
  }

  public void clear() {
    this.eventName = null;
    setEventAmountIsSet(false);
    this.eventAmount = 0;
  }

  public String getEventName() {
    return this.eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public void unsetEventName() {
    this.eventName = null;
  }

  /** Returns true if field eventName is set (has been assigned a value) and false otherwise */
  public boolean isSetEventName() {
    return this.eventName != null;
  }

  public void setEventNameIsSet(boolean value) {
    if (!value) {
      this.eventName = null;
    }
  }

  public int getEventAmount() {
    return this.eventAmount;
  }

  public void setEventAmount(int eventAmount) {
    this.eventAmount = eventAmount;
    setEventAmountIsSet(true);
  }

  public void unsetEventAmount() {
    __isset_vector[__EVENTAMOUNT_ISSET_ID] = false;
  }

  /** Returns true if field eventAmount is set (has been assigned a value) and false otherwise */
  public boolean isSetEventAmount() {
    return __isset_vector[__EVENTAMOUNT_ISSET_ID];
  }

  public void setEventAmountIsSet(boolean value) {
    __isset_vector[__EVENTAMOUNT_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PaidCallRedeemResult)
      return this.equals((PaidCallRedeemResult)that);
    return false;
  }

  public boolean equals(PaidCallRedeemResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_eventName = true && this.isSetEventName();
    boolean that_present_eventName = true && that.isSetEventName();
    if (this_present_eventName || that_present_eventName) {
      if (!(this_present_eventName && that_present_eventName))
        return false;
      if (!this.eventName.equals(that.eventName))
        return false;
    }

    boolean this_present_eventAmount = true;
    boolean that_present_eventAmount = true;
    if (this_present_eventAmount || that_present_eventAmount) {
      if (!(this_present_eventAmount && that_present_eventAmount))
        return false;
      if (this.eventAmount != that.eventAmount)
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

    PaidCallRedeemResult other = (PaidCallRedeemResult)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetEventName(), other.isSetEventName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEventName()) {
      lastComparison = TBaseHelper.compareTo(this.eventName, other.eventName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetEventAmount(), other.isSetEventAmount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEventAmount()) {
      lastComparison = TBaseHelper.compareTo(this.eventAmount, other.eventAmount);
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
        case 1: // EVENT_NAME
          if (field.type == TType.STRING) {
            this.eventName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // EVENT_AMOUNT
          if (field.type == TType.I32) {
            this.eventAmount = iprot.readI32();
            setEventAmountIsSet(true);
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
    if (this.eventName != null) {
      oprot.writeFieldBegin(EVENT_NAME_FIELD_DESC);
      oprot.writeString(this.eventName);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(EVENT_AMOUNT_FIELD_DESC);
    oprot.writeI32(this.eventAmount);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("PaidCallRedeemResult(");
    boolean first = true;

    sb.append("eventName:");
    if (this.eventName == null) {
      sb.append("null");
    } else {
      sb.append(this.eventName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("eventAmount:");
    sb.append(this.eventAmount);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

