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

public class PaidCallCurrencyExchangeRate implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("PaidCallCurrencyExchangeRate");

  private static final TField CURRENCY_CODE_FIELD_DESC = new TField("currencyCode", TType.STRING, (short)1);
  private static final TField CURRENCY_NAME_FIELD_DESC = new TField("currencyName", TType.STRING, (short)2);
  private static final TField CURRENCY_SIGN_FIELD_DESC = new TField("currencySign", TType.STRING, (short)3);
  private static final TField PREFERRED_FIELD_DESC = new TField("preferred", TType.BOOL, (short)4);
  private static final TField COIN_RATE_FIELD_DESC = new TField("coinRate", TType.STRING, (short)5);
  private static final TField CREDIT_RATE_FIELD_DESC = new TField("creditRate", TType.STRING, (short)6);

  private String currencyCode;
  private String currencyName;
  private String currencySign;
  private boolean preferred;
  private String coinRate;
  private String creditRate;

  // isset id assignments
  private static final int __PREFERRED_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public PaidCallCurrencyExchangeRate() {
  }

  public PaidCallCurrencyExchangeRate(
    String currencyCode,
    String currencyName,
    String currencySign,
    boolean preferred,
    String coinRate,
    String creditRate)
  {
    this();
    this.currencyCode = currencyCode;
    this.currencyName = currencyName;
    this.currencySign = currencySign;
    this.preferred = preferred;
    setPreferredIsSet(true);
    this.coinRate = coinRate;
    this.creditRate = creditRate;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PaidCallCurrencyExchangeRate(PaidCallCurrencyExchangeRate other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetCurrencyCode()) {
      this.currencyCode = other.currencyCode;
    }
    if (other.isSetCurrencyName()) {
      this.currencyName = other.currencyName;
    }
    if (other.isSetCurrencySign()) {
      this.currencySign = other.currencySign;
    }
    this.preferred = other.preferred;
    if (other.isSetCoinRate()) {
      this.coinRate = other.coinRate;
    }
    if (other.isSetCreditRate()) {
      this.creditRate = other.creditRate;
    }
  }

  public PaidCallCurrencyExchangeRate deepCopy() {
    return new PaidCallCurrencyExchangeRate(this);
  }

  public void clear() {
    this.currencyCode = null;
    this.currencyName = null;
    this.currencySign = null;
    setPreferredIsSet(false);
    this.preferred = false;
    this.coinRate = null;
    this.creditRate = null;
  }

  public String getCurrencyCode() {
    return this.currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public void unsetCurrencyCode() {
    this.currencyCode = null;
  }

  /** Returns true if field currencyCode is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrencyCode() {
    return this.currencyCode != null;
  }

  public void setCurrencyCodeIsSet(boolean value) {
    if (!value) {
      this.currencyCode = null;
    }
  }

  public String getCurrencyName() {
    return this.currencyName;
  }

  public void setCurrencyName(String currencyName) {
    this.currencyName = currencyName;
  }

  public void unsetCurrencyName() {
    this.currencyName = null;
  }

  /** Returns true if field currencyName is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrencyName() {
    return this.currencyName != null;
  }

  public void setCurrencyNameIsSet(boolean value) {
    if (!value) {
      this.currencyName = null;
    }
  }

  public String getCurrencySign() {
    return this.currencySign;
  }

  public void setCurrencySign(String currencySign) {
    this.currencySign = currencySign;
  }

  public void unsetCurrencySign() {
    this.currencySign = null;
  }

  /** Returns true if field currencySign is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrencySign() {
    return this.currencySign != null;
  }

  public void setCurrencySignIsSet(boolean value) {
    if (!value) {
      this.currencySign = null;
    }
  }

  public boolean isPreferred() {
    return this.preferred;
  }

  public void setPreferred(boolean preferred) {
    this.preferred = preferred;
    setPreferredIsSet(true);
  }

  public void unsetPreferred() {
    __isset_vector[__PREFERRED_ISSET_ID] = false;
  }

  /** Returns true if field preferred is set (has been assigned a value) and false otherwise */
  public boolean isSetPreferred() {
    return __isset_vector[__PREFERRED_ISSET_ID];
  }

  public void setPreferredIsSet(boolean value) {
    __isset_vector[__PREFERRED_ISSET_ID] = value;
  }

  public String getCoinRate() {
    return this.coinRate;
  }

  public void setCoinRate(String coinRate) {
    this.coinRate = coinRate;
  }

  public void unsetCoinRate() {
    this.coinRate = null;
  }

  /** Returns true if field coinRate is set (has been assigned a value) and false otherwise */
  public boolean isSetCoinRate() {
    return this.coinRate != null;
  }

  public void setCoinRateIsSet(boolean value) {
    if (!value) {
      this.coinRate = null;
    }
  }

  public String getCreditRate() {
    return this.creditRate;
  }

  public void setCreditRate(String creditRate) {
    this.creditRate = creditRate;
  }

  public void unsetCreditRate() {
    this.creditRate = null;
  }

  /** Returns true if field creditRate is set (has been assigned a value) and false otherwise */
  public boolean isSetCreditRate() {
    return this.creditRate != null;
  }

  public void setCreditRateIsSet(boolean value) {
    if (!value) {
      this.creditRate = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PaidCallCurrencyExchangeRate)
      return this.equals((PaidCallCurrencyExchangeRate)that);
    return false;
  }

  public boolean equals(PaidCallCurrencyExchangeRate that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_currencyCode = true && this.isSetCurrencyCode();
    boolean that_present_currencyCode = true && that.isSetCurrencyCode();
    if (this_present_currencyCode || that_present_currencyCode) {
      if (!(this_present_currencyCode && that_present_currencyCode))
        return false;
      if (!this.currencyCode.equals(that.currencyCode))
        return false;
    }

    boolean this_present_currencyName = true && this.isSetCurrencyName();
    boolean that_present_currencyName = true && that.isSetCurrencyName();
    if (this_present_currencyName || that_present_currencyName) {
      if (!(this_present_currencyName && that_present_currencyName))
        return false;
      if (!this.currencyName.equals(that.currencyName))
        return false;
    }

    boolean this_present_currencySign = true && this.isSetCurrencySign();
    boolean that_present_currencySign = true && that.isSetCurrencySign();
    if (this_present_currencySign || that_present_currencySign) {
      if (!(this_present_currencySign && that_present_currencySign))
        return false;
      if (!this.currencySign.equals(that.currencySign))
        return false;
    }

    boolean this_present_preferred = true;
    boolean that_present_preferred = true;
    if (this_present_preferred || that_present_preferred) {
      if (!(this_present_preferred && that_present_preferred))
        return false;
      if (this.preferred != that.preferred)
        return false;
    }

    boolean this_present_coinRate = true && this.isSetCoinRate();
    boolean that_present_coinRate = true && that.isSetCoinRate();
    if (this_present_coinRate || that_present_coinRate) {
      if (!(this_present_coinRate && that_present_coinRate))
        return false;
      if (!this.coinRate.equals(that.coinRate))
        return false;
    }

    boolean this_present_creditRate = true && this.isSetCreditRate();
    boolean that_present_creditRate = true && that.isSetCreditRate();
    if (this_present_creditRate || that_present_creditRate) {
      if (!(this_present_creditRate && that_present_creditRate))
        return false;
      if (!this.creditRate.equals(that.creditRate))
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

    PaidCallCurrencyExchangeRate other = (PaidCallCurrencyExchangeRate)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetCurrencyCode(), other.isSetCurrencyCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrencyCode()) {
      lastComparison = TBaseHelper.compareTo(this.currencyCode, other.currencyCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetCurrencyName(), other.isSetCurrencyName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrencyName()) {
      lastComparison = TBaseHelper.compareTo(this.currencyName, other.currencyName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetCurrencySign(), other.isSetCurrencySign());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrencySign()) {
      lastComparison = TBaseHelper.compareTo(this.currencySign, other.currencySign);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetPreferred(), other.isSetPreferred());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPreferred()) {
      lastComparison = TBaseHelper.compareTo(this.preferred, other.preferred);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetCoinRate(), other.isSetCoinRate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCoinRate()) {
      lastComparison = TBaseHelper.compareTo(this.coinRate, other.coinRate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetCreditRate(), other.isSetCreditRate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreditRate()) {
      lastComparison = TBaseHelper.compareTo(this.creditRate, other.creditRate);
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
        case 1: // CURRENCY_CODE
          if (field.type == TType.STRING) {
            this.currencyCode = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // CURRENCY_NAME
          if (field.type == TType.STRING) {
            this.currencyName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // CURRENCY_SIGN
          if (field.type == TType.STRING) {
            this.currencySign = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // PREFERRED
          if (field.type == TType.BOOL) {
            this.preferred = iprot.readBool();
            setPreferredIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // COIN_RATE
          if (field.type == TType.STRING) {
            this.coinRate = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // CREDIT_RATE
          if (field.type == TType.STRING) {
            this.creditRate = iprot.readString();
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
    if (this.currencyCode != null) {
      oprot.writeFieldBegin(CURRENCY_CODE_FIELD_DESC);
      oprot.writeString(this.currencyCode);
      oprot.writeFieldEnd();
    }
    if (this.currencyName != null) {
      oprot.writeFieldBegin(CURRENCY_NAME_FIELD_DESC);
      oprot.writeString(this.currencyName);
      oprot.writeFieldEnd();
    }
    if (this.currencySign != null) {
      oprot.writeFieldBegin(CURRENCY_SIGN_FIELD_DESC);
      oprot.writeString(this.currencySign);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(PREFERRED_FIELD_DESC);
    oprot.writeBool(this.preferred);
    oprot.writeFieldEnd();
    if (this.coinRate != null) {
      oprot.writeFieldBegin(COIN_RATE_FIELD_DESC);
      oprot.writeString(this.coinRate);
      oprot.writeFieldEnd();
    }
    if (this.creditRate != null) {
      oprot.writeFieldBegin(CREDIT_RATE_FIELD_DESC);
      oprot.writeString(this.creditRate);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("PaidCallCurrencyExchangeRate(");
    boolean first = true;

    sb.append("currencyCode:");
    if (this.currencyCode == null) {
      sb.append("null");
    } else {
      sb.append(this.currencyCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("currencyName:");
    if (this.currencyName == null) {
      sb.append("null");
    } else {
      sb.append(this.currencyName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("currencySign:");
    if (this.currencySign == null) {
      sb.append("null");
    } else {
      sb.append(this.currencySign);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("preferred:");
    sb.append(this.preferred);
    first = false;
    if (!first) sb.append(", ");
    sb.append("coinRate:");
    if (this.coinRate == null) {
      sb.append("null");
    } else {
      sb.append(this.coinRate);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("creditRate:");
    if (this.creditRate == null) {
      sb.append("null");
    } else {
      sb.append(this.creditRate);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

