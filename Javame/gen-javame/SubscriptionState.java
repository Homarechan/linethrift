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

public class SubscriptionState implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("SubscriptionState");

  private static final TField SUBSCRIPTION_ID_FIELD_DESC = new TField("subscriptionId", TType.I64, (short)1);
  private static final TField TTL_MILLIS_FIELD_DESC = new TField("ttlMillis", TType.I64, (short)2);

  private long subscriptionId;
  private long ttlMillis;

  // isset id assignments
  private static final int __SUBSCRIPTIONID_ISSET_ID = 0;
  private static final int __TTLMILLIS_ISSET_ID = 1;
  private boolean[] __isset_vector = new boolean[2];

  public SubscriptionState() {
  }

  public SubscriptionState(
    long subscriptionId,
    long ttlMillis)
  {
    this();
    this.subscriptionId = subscriptionId;
    setSubscriptionIdIsSet(true);
    this.ttlMillis = ttlMillis;
    setTtlMillisIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SubscriptionState(SubscriptionState other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.subscriptionId = other.subscriptionId;
    this.ttlMillis = other.ttlMillis;
  }

  public SubscriptionState deepCopy() {
    return new SubscriptionState(this);
  }

  public void clear() {
    setSubscriptionIdIsSet(false);
    this.subscriptionId = 0;
    setTtlMillisIsSet(false);
    this.ttlMillis = 0;
  }

  public long getSubscriptionId() {
    return this.subscriptionId;
  }

  public void setSubscriptionId(long subscriptionId) {
    this.subscriptionId = subscriptionId;
    setSubscriptionIdIsSet(true);
  }

  public void unsetSubscriptionId() {
    __isset_vector[__SUBSCRIPTIONID_ISSET_ID] = false;
  }

  /** Returns true if field subscriptionId is set (has been assigned a value) and false otherwise */
  public boolean isSetSubscriptionId() {
    return __isset_vector[__SUBSCRIPTIONID_ISSET_ID];
  }

  public void setSubscriptionIdIsSet(boolean value) {
    __isset_vector[__SUBSCRIPTIONID_ISSET_ID] = value;
  }

  public long getTtlMillis() {
    return this.ttlMillis;
  }

  public void setTtlMillis(long ttlMillis) {
    this.ttlMillis = ttlMillis;
    setTtlMillisIsSet(true);
  }

  public void unsetTtlMillis() {
    __isset_vector[__TTLMILLIS_ISSET_ID] = false;
  }

  /** Returns true if field ttlMillis is set (has been assigned a value) and false otherwise */
  public boolean isSetTtlMillis() {
    return __isset_vector[__TTLMILLIS_ISSET_ID];
  }

  public void setTtlMillisIsSet(boolean value) {
    __isset_vector[__TTLMILLIS_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SubscriptionState)
      return this.equals((SubscriptionState)that);
    return false;
  }

  public boolean equals(SubscriptionState that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_subscriptionId = true;
    boolean that_present_subscriptionId = true;
    if (this_present_subscriptionId || that_present_subscriptionId) {
      if (!(this_present_subscriptionId && that_present_subscriptionId))
        return false;
      if (this.subscriptionId != that.subscriptionId)
        return false;
    }

    boolean this_present_ttlMillis = true;
    boolean that_present_ttlMillis = true;
    if (this_present_ttlMillis || that_present_ttlMillis) {
      if (!(this_present_ttlMillis && that_present_ttlMillis))
        return false;
      if (this.ttlMillis != that.ttlMillis)
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

    SubscriptionState other = (SubscriptionState)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetSubscriptionId(), other.isSetSubscriptionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubscriptionId()) {
      lastComparison = TBaseHelper.compareTo(this.subscriptionId, other.subscriptionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetTtlMillis(), other.isSetTtlMillis());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTtlMillis()) {
      lastComparison = TBaseHelper.compareTo(this.ttlMillis, other.ttlMillis);
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
        case 1: // SUBSCRIPTION_ID
          if (field.type == TType.I64) {
            this.subscriptionId = iprot.readI64();
            setSubscriptionIdIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // TTL_MILLIS
          if (field.type == TType.I64) {
            this.ttlMillis = iprot.readI64();
            setTtlMillisIsSet(true);
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
    oprot.writeFieldBegin(SUBSCRIPTION_ID_FIELD_DESC);
    oprot.writeI64(this.subscriptionId);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(TTL_MILLIS_FIELD_DESC);
    oprot.writeI64(this.ttlMillis);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("SubscriptionState(");
    boolean first = true;

    sb.append("subscriptionId:");
    sb.append(this.subscriptionId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("ttlMillis:");
    sb.append(this.ttlMillis);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

