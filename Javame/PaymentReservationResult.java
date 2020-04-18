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

public class PaymentReservationResult implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("PaymentReservationResult");

  private static final TField ORDER_ID_FIELD_DESC = new TField("orderId", TType.STRING, (short)1);
  private static final TField CONFIRM_URL_FIELD_DESC = new TField("confirmUrl", TType.STRING, (short)2);
  private static final TField EXTRAS_FIELD_DESC = new TField("extras", TType.MAP, (short)3);

  private String orderId;
  private String confirmUrl;
  private Hashtable extras;

  // isset id assignments

  public PaymentReservationResult() {
  }

  public PaymentReservationResult(
    String orderId,
    String confirmUrl,
    Hashtable extras)
  {
    this();
    this.orderId = orderId;
    this.confirmUrl = confirmUrl;
    this.extras = extras;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PaymentReservationResult(PaymentReservationResult other) {
    if (other.isSetOrderId()) {
      this.orderId = other.orderId;
    }
    if (other.isSetConfirmUrl()) {
      this.confirmUrl = other.confirmUrl;
    }
    if (other.isSetExtras()) {
      Hashtable __this__extras = new Hashtable();
      for (Enumeration other_enum = other.extras.keys(); other_enum.hasMoreElements(); ) {

        String other_element_key = (String)other_enum.nextElement();
        String other_element_value = (String)other.extras.get(other_element_key);

        String __this__extras_copy_key = other_element_key;

        String __this__extras_copy_value = other_element_value;

        __this__extras.put(__this__extras_copy_key, __this__extras_copy_value);
      }
      this.extras = __this__extras;
    }
  }

  public PaymentReservationResult deepCopy() {
    return new PaymentReservationResult(this);
  }

  public void clear() {
    this.orderId = null;
    this.confirmUrl = null;
    this.extras = null;
  }

  public String getOrderId() {
    return this.orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public void unsetOrderId() {
    this.orderId = null;
  }

  /** Returns true if field orderId is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderId() {
    return this.orderId != null;
  }

  public void setOrderIdIsSet(boolean value) {
    if (!value) {
      this.orderId = null;
    }
  }

  public String getConfirmUrl() {
    return this.confirmUrl;
  }

  public void setConfirmUrl(String confirmUrl) {
    this.confirmUrl = confirmUrl;
  }

  public void unsetConfirmUrl() {
    this.confirmUrl = null;
  }

  /** Returns true if field confirmUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetConfirmUrl() {
    return this.confirmUrl != null;
  }

  public void setConfirmUrlIsSet(boolean value) {
    if (!value) {
      this.confirmUrl = null;
    }
  }

  public int getExtrasSize() {
    return (this.extras == null) ? 0 : this.extras.size();
  }

  public void putToExtras(String key, String val) {
    if (this.extras == null) {
      this.extras = new Hashtable();
    }
    this.extras.put(key, val);
  }

  public Hashtable getExtras() {
    return this.extras;
  }

  public void setExtras(Hashtable extras) {
    this.extras = extras;
  }

  public void unsetExtras() {
    this.extras = null;
  }

  /** Returns true if field extras is set (has been assigned a value) and false otherwise */
  public boolean isSetExtras() {
    return this.extras != null;
  }

  public void setExtrasIsSet(boolean value) {
    if (!value) {
      this.extras = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PaymentReservationResult)
      return this.equals((PaymentReservationResult)that);
    return false;
  }

  public boolean equals(PaymentReservationResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_orderId = true && this.isSetOrderId();
    boolean that_present_orderId = true && that.isSetOrderId();
    if (this_present_orderId || that_present_orderId) {
      if (!(this_present_orderId && that_present_orderId))
        return false;
      if (!this.orderId.equals(that.orderId))
        return false;
    }

    boolean this_present_confirmUrl = true && this.isSetConfirmUrl();
    boolean that_present_confirmUrl = true && that.isSetConfirmUrl();
    if (this_present_confirmUrl || that_present_confirmUrl) {
      if (!(this_present_confirmUrl && that_present_confirmUrl))
        return false;
      if (!this.confirmUrl.equals(that.confirmUrl))
        return false;
    }

    boolean this_present_extras = true && this.isSetExtras();
    boolean that_present_extras = true && that.isSetExtras();
    if (this_present_extras || that_present_extras) {
      if (!(this_present_extras && that_present_extras))
        return false;
      if (!this.extras.equals(that.extras))
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

    PaymentReservationResult other = (PaymentReservationResult)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetOrderId(), other.isSetOrderId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderId()) {
      lastComparison = TBaseHelper.compareTo(this.orderId, other.orderId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetConfirmUrl(), other.isSetConfirmUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfirmUrl()) {
      lastComparison = TBaseHelper.compareTo(this.confirmUrl, other.confirmUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetExtras(), other.isSetExtras());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtras()) {
      lastComparison = TBaseHelper.compareTo(this.extras, other.extras);
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
        case 1: // ORDER_ID
          if (field.type == TType.STRING) {
            this.orderId = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // CONFIRM_URL
          if (field.type == TType.STRING) {
            this.confirmUrl = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // EXTRAS
          if (field.type == TType.MAP) {
            {
              TMap _map188 = iprot.readMapBegin();
              this.extras = new Hashtable(2*_map188.size);
              for (int _i189 = 0; _i189 < _map188.size; ++_i189)
              {
                String _key190;
                String _val191;
                _key190 = iprot.readString();
                _val191 = iprot.readString();
                this.extras.put(_key190, _val191);
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
    if (this.orderId != null) {
      oprot.writeFieldBegin(ORDER_ID_FIELD_DESC);
      oprot.writeString(this.orderId);
      oprot.writeFieldEnd();
    }
    if (this.confirmUrl != null) {
      oprot.writeFieldBegin(CONFIRM_URL_FIELD_DESC);
      oprot.writeString(this.confirmUrl);
      oprot.writeFieldEnd();
    }
    if (this.extras != null) {
      oprot.writeFieldBegin(EXTRAS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.extras.size()));
        for (Enumeration _iter192_enum = this.extras.keys(); _iter192_enum.hasMoreElements(); )         {
          String _iter192 = (String)_iter192_enum.nextElement();
          oprot.writeString(_iter192);
          oprot.writeString(((String)this.extras.get(_iter192)));
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("PaymentReservationResult(");
    boolean first = true;

    sb.append("orderId:");
    if (this.orderId == null) {
      sb.append("null");
    } else {
      sb.append(this.orderId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("confirmUrl:");
    if (this.confirmUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.confirmUrl);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("extras:");
    if (this.extras == null) {
      sb.append("null");
    } else {
      sb.append(this.extras);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

