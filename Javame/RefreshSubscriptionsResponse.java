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

public class RefreshSubscriptionsResponse implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("RefreshSubscriptionsResponse");

  private static final TField TTL_MILLIS_FIELD_DESC = new TField("ttlMillis", TType.I64, (short)1);
  private static final TField SUBSCRIPTION_STATES_FIELD_DESC = new TField("subscriptionStates", TType.MAP, (short)2);

  private long ttlMillis;
  private Hashtable subscriptionStates;

  // isset id assignments
  private static final int __TTLMILLIS_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public RefreshSubscriptionsResponse() {
  }

  public RefreshSubscriptionsResponse(
    long ttlMillis,
    Hashtable subscriptionStates)
  {
    this();
    this.ttlMillis = ttlMillis;
    setTtlMillisIsSet(true);
    this.subscriptionStates = subscriptionStates;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RefreshSubscriptionsResponse(RefreshSubscriptionsResponse other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.ttlMillis = other.ttlMillis;
    if (other.isSetSubscriptionStates()) {
      Hashtable __this__subscriptionStates = new Hashtable();
      for (Enumeration other_enum = other.subscriptionStates.keys(); other_enum.hasMoreElements(); ) {

        Long other_element_key = (Long)other_enum.nextElement();
        SubscriptionState other_element_value = (SubscriptionState)other.subscriptionStates.get(other_element_key);

        Long __this__subscriptionStates_copy_key = other_element_key;

        SubscriptionState __this__subscriptionStates_copy_value = new SubscriptionState(other_element_value);

        __this__subscriptionStates.put(__this__subscriptionStates_copy_key, __this__subscriptionStates_copy_value);
      }
      this.subscriptionStates = __this__subscriptionStates;
    }
  }

  public RefreshSubscriptionsResponse deepCopy() {
    return new RefreshSubscriptionsResponse(this);
  }

  public void clear() {
    setTtlMillisIsSet(false);
    this.ttlMillis = 0;
    this.subscriptionStates = null;
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

  public int getSubscriptionStatesSize() {
    return (this.subscriptionStates == null) ? 0 : this.subscriptionStates.size();
  }

  public void putToSubscriptionStates(Long key, SubscriptionState val) {
    if (this.subscriptionStates == null) {
      this.subscriptionStates = new Hashtable();
    }
    this.subscriptionStates.put(key, val);
  }

  public Hashtable getSubscriptionStates() {
    return this.subscriptionStates;
  }

  public void setSubscriptionStates(Hashtable subscriptionStates) {
    this.subscriptionStates = subscriptionStates;
  }

  public void unsetSubscriptionStates() {
    this.subscriptionStates = null;
  }

  /** Returns true if field subscriptionStates is set (has been assigned a value) and false otherwise */
  public boolean isSetSubscriptionStates() {
    return this.subscriptionStates != null;
  }

  public void setSubscriptionStatesIsSet(boolean value) {
    if (!value) {
      this.subscriptionStates = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RefreshSubscriptionsResponse)
      return this.equals((RefreshSubscriptionsResponse)that);
    return false;
  }

  public boolean equals(RefreshSubscriptionsResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_ttlMillis = true;
    boolean that_present_ttlMillis = true;
    if (this_present_ttlMillis || that_present_ttlMillis) {
      if (!(this_present_ttlMillis && that_present_ttlMillis))
        return false;
      if (this.ttlMillis != that.ttlMillis)
        return false;
    }

    boolean this_present_subscriptionStates = true && this.isSetSubscriptionStates();
    boolean that_present_subscriptionStates = true && that.isSetSubscriptionStates();
    if (this_present_subscriptionStates || that_present_subscriptionStates) {
      if (!(this_present_subscriptionStates && that_present_subscriptionStates))
        return false;
      if (!this.subscriptionStates.equals(that.subscriptionStates))
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

    RefreshSubscriptionsResponse other = (RefreshSubscriptionsResponse)otherObject;    int lastComparison = 0;

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
    lastComparison = TBaseHelper.compareTo(isSetSubscriptionStates(), other.isSetSubscriptionStates());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubscriptionStates()) {
      lastComparison = TBaseHelper.compareTo(this.subscriptionStates, other.subscriptionStates);
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
        case 1: // TTL_MILLIS
          if (field.type == TType.I64) {
            this.ttlMillis = iprot.readI64();
            setTtlMillisIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SUBSCRIPTION_STATES
          if (field.type == TType.MAP) {
            {
              TMap _map466 = iprot.readMapBegin();
              this.subscriptionStates = new Hashtable(2*_map466.size);
              for (int _i467 = 0; _i467 < _map466.size; ++_i467)
              {
                long _key468;
                SubscriptionState _val469;
                _key468 = iprot.readI64();
                _val469 = new SubscriptionState();
                _val469.read(iprot);
                this.subscriptionStates.put(new Long(_key468), _val469);
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
    oprot.writeFieldBegin(TTL_MILLIS_FIELD_DESC);
    oprot.writeI64(this.ttlMillis);
    oprot.writeFieldEnd();
    if (this.subscriptionStates != null) {
      oprot.writeFieldBegin(SUBSCRIPTION_STATES_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I64, TType.STRUCT, this.subscriptionStates.size()));
        for (Enumeration _iter470_enum = this.subscriptionStates.keys(); _iter470_enum.hasMoreElements(); )         {
          Long _iter470 = (Long)_iter470_enum.nextElement();
          oprot.writeI64(_iter470);
          ((SubscriptionState)this.subscriptionStates.get(_iter470)).write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("RefreshSubscriptionsResponse(");
    boolean first = true;

    sb.append("ttlMillis:");
    sb.append(this.ttlMillis);
    first = false;
    if (!first) sb.append(", ");
    sb.append("subscriptionStates:");
    if (this.subscriptionStates == null) {
      sb.append("null");
    } else {
      sb.append(this.subscriptionStates);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

