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

public class PaidCallBalance implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("PaidCallBalance");

  private static final TField PRODUCT_TYPE_FIELD_DESC = new TField("productType", TType.I32, (short)1);
  private static final TField PRODUCT_NAME_FIELD_DESC = new TField("productName", TType.STRING, (short)2);
  private static final TField UNIT_FIELD_DESC = new TField("unit", TType.STRING, (short)3);
  private static final TField LIMITED_PAID_BALANCE_FIELD_DESC = new TField("limitedPaidBalance", TType.I32, (short)4);
  private static final TField LIMITED_FREE_BALANCE_FIELD_DESC = new TField("limitedFreeBalance", TType.I32, (short)5);
  private static final TField UNLIMITED_PAID_BALANCE_FIELD_DESC = new TField("unlimitedPaidBalance", TType.I32, (short)6);
  private static final TField UNLIMITED_FREE_BALANCE_FIELD_DESC = new TField("unlimitedFreeBalance", TType.I32, (short)7);
  private static final TField START_TIME_FIELD_DESC = new TField("startTime", TType.I64, (short)8);
  private static final TField END_TIME_FIELD_DESC = new TField("endTime", TType.I64, (short)9);
  private static final TField AUTOPAY_ENABLED_FIELD_DESC = new TField("autopayEnabled", TType.BOOL, (short)10);

  private PaidCallProductType productType;
  private String productName;
  private String unit;
  private int limitedPaidBalance;
  private int limitedFreeBalance;
  private int unlimitedPaidBalance;
  private int unlimitedFreeBalance;
  private long startTime;
  private long endTime;
  private boolean autopayEnabled;

  // isset id assignments
  private static final int __LIMITEDPAIDBALANCE_ISSET_ID = 0;
  private static final int __LIMITEDFREEBALANCE_ISSET_ID = 1;
  private static final int __UNLIMITEDPAIDBALANCE_ISSET_ID = 2;
  private static final int __UNLIMITEDFREEBALANCE_ISSET_ID = 3;
  private static final int __STARTTIME_ISSET_ID = 4;
  private static final int __ENDTIME_ISSET_ID = 5;
  private static final int __AUTOPAYENABLED_ISSET_ID = 6;
  private boolean[] __isset_vector = new boolean[7];

  public PaidCallBalance() {
  }

  public PaidCallBalance(
    PaidCallProductType productType,
    String productName,
    String unit,
    int limitedPaidBalance,
    int limitedFreeBalance,
    int unlimitedPaidBalance,
    int unlimitedFreeBalance,
    long startTime,
    long endTime,
    boolean autopayEnabled)
  {
    this();
    this.productType = productType;
    this.productName = productName;
    this.unit = unit;
    this.limitedPaidBalance = limitedPaidBalance;
    setLimitedPaidBalanceIsSet(true);
    this.limitedFreeBalance = limitedFreeBalance;
    setLimitedFreeBalanceIsSet(true);
    this.unlimitedPaidBalance = unlimitedPaidBalance;
    setUnlimitedPaidBalanceIsSet(true);
    this.unlimitedFreeBalance = unlimitedFreeBalance;
    setUnlimitedFreeBalanceIsSet(true);
    this.startTime = startTime;
    setStartTimeIsSet(true);
    this.endTime = endTime;
    setEndTimeIsSet(true);
    this.autopayEnabled = autopayEnabled;
    setAutopayEnabledIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PaidCallBalance(PaidCallBalance other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetProductType()) {
      this.productType = other.productType;
    }
    if (other.isSetProductName()) {
      this.productName = other.productName;
    }
    if (other.isSetUnit()) {
      this.unit = other.unit;
    }
    this.limitedPaidBalance = other.limitedPaidBalance;
    this.limitedFreeBalance = other.limitedFreeBalance;
    this.unlimitedPaidBalance = other.unlimitedPaidBalance;
    this.unlimitedFreeBalance = other.unlimitedFreeBalance;
    this.startTime = other.startTime;
    this.endTime = other.endTime;
    this.autopayEnabled = other.autopayEnabled;
  }

  public PaidCallBalance deepCopy() {
    return new PaidCallBalance(this);
  }

  public void clear() {
    this.productType = null;
    this.productName = null;
    this.unit = null;
    setLimitedPaidBalanceIsSet(false);
    this.limitedPaidBalance = 0;
    setLimitedFreeBalanceIsSet(false);
    this.limitedFreeBalance = 0;
    setUnlimitedPaidBalanceIsSet(false);
    this.unlimitedPaidBalance = 0;
    setUnlimitedFreeBalanceIsSet(false);
    this.unlimitedFreeBalance = 0;
    setStartTimeIsSet(false);
    this.startTime = 0;
    setEndTimeIsSet(false);
    this.endTime = 0;
    setAutopayEnabledIsSet(false);
    this.autopayEnabled = false;
  }

  /**
   * 
   * @see PaidCallProductType
   */
  public PaidCallProductType getProductType() {
    return this.productType;
  }

  /**
   * 
   * @see PaidCallProductType
   */
  public void setProductType(PaidCallProductType productType) {
    this.productType = productType;
  }

  public void unsetProductType() {
    this.productType = null;
  }

  /** Returns true if field productType is set (has been assigned a value) and false otherwise */
  public boolean isSetProductType() {
    return this.productType != null;
  }

  public void setProductTypeIsSet(boolean value) {
    if (!value) {
      this.productType = null;
    }
  }

  public String getProductName() {
    return this.productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public void unsetProductName() {
    this.productName = null;
  }

  /** Returns true if field productName is set (has been assigned a value) and false otherwise */
  public boolean isSetProductName() {
    return this.productName != null;
  }

  public void setProductNameIsSet(boolean value) {
    if (!value) {
      this.productName = null;
    }
  }

  public String getUnit() {
    return this.unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public void unsetUnit() {
    this.unit = null;
  }

  /** Returns true if field unit is set (has been assigned a value) and false otherwise */
  public boolean isSetUnit() {
    return this.unit != null;
  }

  public void setUnitIsSet(boolean value) {
    if (!value) {
      this.unit = null;
    }
  }

  public int getLimitedPaidBalance() {
    return this.limitedPaidBalance;
  }

  public void setLimitedPaidBalance(int limitedPaidBalance) {
    this.limitedPaidBalance = limitedPaidBalance;
    setLimitedPaidBalanceIsSet(true);
  }

  public void unsetLimitedPaidBalance() {
    __isset_vector[__LIMITEDPAIDBALANCE_ISSET_ID] = false;
  }

  /** Returns true if field limitedPaidBalance is set (has been assigned a value) and false otherwise */
  public boolean isSetLimitedPaidBalance() {
    return __isset_vector[__LIMITEDPAIDBALANCE_ISSET_ID];
  }

  public void setLimitedPaidBalanceIsSet(boolean value) {
    __isset_vector[__LIMITEDPAIDBALANCE_ISSET_ID] = value;
  }

  public int getLimitedFreeBalance() {
    return this.limitedFreeBalance;
  }

  public void setLimitedFreeBalance(int limitedFreeBalance) {
    this.limitedFreeBalance = limitedFreeBalance;
    setLimitedFreeBalanceIsSet(true);
  }

  public void unsetLimitedFreeBalance() {
    __isset_vector[__LIMITEDFREEBALANCE_ISSET_ID] = false;
  }

  /** Returns true if field limitedFreeBalance is set (has been assigned a value) and false otherwise */
  public boolean isSetLimitedFreeBalance() {
    return __isset_vector[__LIMITEDFREEBALANCE_ISSET_ID];
  }

  public void setLimitedFreeBalanceIsSet(boolean value) {
    __isset_vector[__LIMITEDFREEBALANCE_ISSET_ID] = value;
  }

  public int getUnlimitedPaidBalance() {
    return this.unlimitedPaidBalance;
  }

  public void setUnlimitedPaidBalance(int unlimitedPaidBalance) {
    this.unlimitedPaidBalance = unlimitedPaidBalance;
    setUnlimitedPaidBalanceIsSet(true);
  }

  public void unsetUnlimitedPaidBalance() {
    __isset_vector[__UNLIMITEDPAIDBALANCE_ISSET_ID] = false;
  }

  /** Returns true if field unlimitedPaidBalance is set (has been assigned a value) and false otherwise */
  public boolean isSetUnlimitedPaidBalance() {
    return __isset_vector[__UNLIMITEDPAIDBALANCE_ISSET_ID];
  }

  public void setUnlimitedPaidBalanceIsSet(boolean value) {
    __isset_vector[__UNLIMITEDPAIDBALANCE_ISSET_ID] = value;
  }

  public int getUnlimitedFreeBalance() {
    return this.unlimitedFreeBalance;
  }

  public void setUnlimitedFreeBalance(int unlimitedFreeBalance) {
    this.unlimitedFreeBalance = unlimitedFreeBalance;
    setUnlimitedFreeBalanceIsSet(true);
  }

  public void unsetUnlimitedFreeBalance() {
    __isset_vector[__UNLIMITEDFREEBALANCE_ISSET_ID] = false;
  }

  /** Returns true if field unlimitedFreeBalance is set (has been assigned a value) and false otherwise */
  public boolean isSetUnlimitedFreeBalance() {
    return __isset_vector[__UNLIMITEDFREEBALANCE_ISSET_ID];
  }

  public void setUnlimitedFreeBalanceIsSet(boolean value) {
    __isset_vector[__UNLIMITEDFREEBALANCE_ISSET_ID] = value;
  }

  public long getStartTime() {
    return this.startTime;
  }

  public void setStartTime(long startTime) {
    this.startTime = startTime;
    setStartTimeIsSet(true);
  }

  public void unsetStartTime() {
    __isset_vector[__STARTTIME_ISSET_ID] = false;
  }

  /** Returns true if field startTime is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTime() {
    return __isset_vector[__STARTTIME_ISSET_ID];
  }

  public void setStartTimeIsSet(boolean value) {
    __isset_vector[__STARTTIME_ISSET_ID] = value;
  }

  public long getEndTime() {
    return this.endTime;
  }

  public void setEndTime(long endTime) {
    this.endTime = endTime;
    setEndTimeIsSet(true);
  }

  public void unsetEndTime() {
    __isset_vector[__ENDTIME_ISSET_ID] = false;
  }

  /** Returns true if field endTime is set (has been assigned a value) and false otherwise */
  public boolean isSetEndTime() {
    return __isset_vector[__ENDTIME_ISSET_ID];
  }

  public void setEndTimeIsSet(boolean value) {
    __isset_vector[__ENDTIME_ISSET_ID] = value;
  }

  public boolean isAutopayEnabled() {
    return this.autopayEnabled;
  }

  public void setAutopayEnabled(boolean autopayEnabled) {
    this.autopayEnabled = autopayEnabled;
    setAutopayEnabledIsSet(true);
  }

  public void unsetAutopayEnabled() {
    __isset_vector[__AUTOPAYENABLED_ISSET_ID] = false;
  }

  /** Returns true if field autopayEnabled is set (has been assigned a value) and false otherwise */
  public boolean isSetAutopayEnabled() {
    return __isset_vector[__AUTOPAYENABLED_ISSET_ID];
  }

  public void setAutopayEnabledIsSet(boolean value) {
    __isset_vector[__AUTOPAYENABLED_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PaidCallBalance)
      return this.equals((PaidCallBalance)that);
    return false;
  }

  public boolean equals(PaidCallBalance that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_productType = true && this.isSetProductType();
    boolean that_present_productType = true && that.isSetProductType();
    if (this_present_productType || that_present_productType) {
      if (!(this_present_productType && that_present_productType))
        return false;
      if (!this.productType.equals(that.productType))
        return false;
    }

    boolean this_present_productName = true && this.isSetProductName();
    boolean that_present_productName = true && that.isSetProductName();
    if (this_present_productName || that_present_productName) {
      if (!(this_present_productName && that_present_productName))
        return false;
      if (!this.productName.equals(that.productName))
        return false;
    }

    boolean this_present_unit = true && this.isSetUnit();
    boolean that_present_unit = true && that.isSetUnit();
    if (this_present_unit || that_present_unit) {
      if (!(this_present_unit && that_present_unit))
        return false;
      if (!this.unit.equals(that.unit))
        return false;
    }

    boolean this_present_limitedPaidBalance = true;
    boolean that_present_limitedPaidBalance = true;
    if (this_present_limitedPaidBalance || that_present_limitedPaidBalance) {
      if (!(this_present_limitedPaidBalance && that_present_limitedPaidBalance))
        return false;
      if (this.limitedPaidBalance != that.limitedPaidBalance)
        return false;
    }

    boolean this_present_limitedFreeBalance = true;
    boolean that_present_limitedFreeBalance = true;
    if (this_present_limitedFreeBalance || that_present_limitedFreeBalance) {
      if (!(this_present_limitedFreeBalance && that_present_limitedFreeBalance))
        return false;
      if (this.limitedFreeBalance != that.limitedFreeBalance)
        return false;
    }

    boolean this_present_unlimitedPaidBalance = true;
    boolean that_present_unlimitedPaidBalance = true;
    if (this_present_unlimitedPaidBalance || that_present_unlimitedPaidBalance) {
      if (!(this_present_unlimitedPaidBalance && that_present_unlimitedPaidBalance))
        return false;
      if (this.unlimitedPaidBalance != that.unlimitedPaidBalance)
        return false;
    }

    boolean this_present_unlimitedFreeBalance = true;
    boolean that_present_unlimitedFreeBalance = true;
    if (this_present_unlimitedFreeBalance || that_present_unlimitedFreeBalance) {
      if (!(this_present_unlimitedFreeBalance && that_present_unlimitedFreeBalance))
        return false;
      if (this.unlimitedFreeBalance != that.unlimitedFreeBalance)
        return false;
    }

    boolean this_present_startTime = true;
    boolean that_present_startTime = true;
    if (this_present_startTime || that_present_startTime) {
      if (!(this_present_startTime && that_present_startTime))
        return false;
      if (this.startTime != that.startTime)
        return false;
    }

    boolean this_present_endTime = true;
    boolean that_present_endTime = true;
    if (this_present_endTime || that_present_endTime) {
      if (!(this_present_endTime && that_present_endTime))
        return false;
      if (this.endTime != that.endTime)
        return false;
    }

    boolean this_present_autopayEnabled = true;
    boolean that_present_autopayEnabled = true;
    if (this_present_autopayEnabled || that_present_autopayEnabled) {
      if (!(this_present_autopayEnabled && that_present_autopayEnabled))
        return false;
      if (this.autopayEnabled != that.autopayEnabled)
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

    PaidCallBalance other = (PaidCallBalance)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetProductType(), other.isSetProductType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProductType()) {
      lastComparison = TBaseHelper.compareTo(this.productType, other.productType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetProductName(), other.isSetProductName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProductName()) {
      lastComparison = TBaseHelper.compareTo(this.productName, other.productName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetUnit(), other.isSetUnit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnit()) {
      lastComparison = TBaseHelper.compareTo(this.unit, other.unit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetLimitedPaidBalance(), other.isSetLimitedPaidBalance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLimitedPaidBalance()) {
      lastComparison = TBaseHelper.compareTo(this.limitedPaidBalance, other.limitedPaidBalance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetLimitedFreeBalance(), other.isSetLimitedFreeBalance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLimitedFreeBalance()) {
      lastComparison = TBaseHelper.compareTo(this.limitedFreeBalance, other.limitedFreeBalance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetUnlimitedPaidBalance(), other.isSetUnlimitedPaidBalance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnlimitedPaidBalance()) {
      lastComparison = TBaseHelper.compareTo(this.unlimitedPaidBalance, other.unlimitedPaidBalance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetUnlimitedFreeBalance(), other.isSetUnlimitedFreeBalance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnlimitedFreeBalance()) {
      lastComparison = TBaseHelper.compareTo(this.unlimitedFreeBalance, other.unlimitedFreeBalance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetStartTime(), other.isSetStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTime()) {
      lastComparison = TBaseHelper.compareTo(this.startTime, other.startTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetEndTime(), other.isSetEndTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndTime()) {
      lastComparison = TBaseHelper.compareTo(this.endTime, other.endTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetAutopayEnabled(), other.isSetAutopayEnabled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAutopayEnabled()) {
      lastComparison = TBaseHelper.compareTo(this.autopayEnabled, other.autopayEnabled);
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
        case 1: // PRODUCT_TYPE
          if (field.type == TType.I32) {
            this.productType = PaidCallProductType.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // PRODUCT_NAME
          if (field.type == TType.STRING) {
            this.productName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // UNIT
          if (field.type == TType.STRING) {
            this.unit = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // LIMITED_PAID_BALANCE
          if (field.type == TType.I32) {
            this.limitedPaidBalance = iprot.readI32();
            setLimitedPaidBalanceIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // LIMITED_FREE_BALANCE
          if (field.type == TType.I32) {
            this.limitedFreeBalance = iprot.readI32();
            setLimitedFreeBalanceIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // UNLIMITED_PAID_BALANCE
          if (field.type == TType.I32) {
            this.unlimitedPaidBalance = iprot.readI32();
            setUnlimitedPaidBalanceIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // UNLIMITED_FREE_BALANCE
          if (field.type == TType.I32) {
            this.unlimitedFreeBalance = iprot.readI32();
            setUnlimitedFreeBalanceIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // START_TIME
          if (field.type == TType.I64) {
            this.startTime = iprot.readI64();
            setStartTimeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9: // END_TIME
          if (field.type == TType.I64) {
            this.endTime = iprot.readI64();
            setEndTimeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 10: // AUTOPAY_ENABLED
          if (field.type == TType.BOOL) {
            this.autopayEnabled = iprot.readBool();
            setAutopayEnabledIsSet(true);
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
    if (this.productType != null) {
      oprot.writeFieldBegin(PRODUCT_TYPE_FIELD_DESC);
      oprot.writeI32(this.productType.getValue());
      oprot.writeFieldEnd();
    }
    if (this.productName != null) {
      oprot.writeFieldBegin(PRODUCT_NAME_FIELD_DESC);
      oprot.writeString(this.productName);
      oprot.writeFieldEnd();
    }
    if (this.unit != null) {
      oprot.writeFieldBegin(UNIT_FIELD_DESC);
      oprot.writeString(this.unit);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(LIMITED_PAID_BALANCE_FIELD_DESC);
    oprot.writeI32(this.limitedPaidBalance);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(LIMITED_FREE_BALANCE_FIELD_DESC);
    oprot.writeI32(this.limitedFreeBalance);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(UNLIMITED_PAID_BALANCE_FIELD_DESC);
    oprot.writeI32(this.unlimitedPaidBalance);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(UNLIMITED_FREE_BALANCE_FIELD_DESC);
    oprot.writeI32(this.unlimitedFreeBalance);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(START_TIME_FIELD_DESC);
    oprot.writeI64(this.startTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(END_TIME_FIELD_DESC);
    oprot.writeI64(this.endTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(AUTOPAY_ENABLED_FIELD_DESC);
    oprot.writeBool(this.autopayEnabled);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("PaidCallBalance(");
    boolean first = true;

    sb.append("productType:");
    if (this.productType == null) {
      sb.append("null");
    } else {
      sb.append(this.productType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("productName:");
    if (this.productName == null) {
      sb.append("null");
    } else {
      sb.append(this.productName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("unit:");
    if (this.unit == null) {
      sb.append("null");
    } else {
      sb.append(this.unit);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("limitedPaidBalance:");
    sb.append(this.limitedPaidBalance);
    first = false;
    if (!first) sb.append(", ");
    sb.append("limitedFreeBalance:");
    sb.append(this.limitedFreeBalance);
    first = false;
    if (!first) sb.append(", ");
    sb.append("unlimitedPaidBalance:");
    sb.append(this.unlimitedPaidBalance);
    first = false;
    if (!first) sb.append(", ");
    sb.append("unlimitedFreeBalance:");
    sb.append(this.unlimitedFreeBalance);
    first = false;
    if (!first) sb.append(", ");
    sb.append("startTime:");
    sb.append(this.startTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("endTime:");
    sb.append(this.endTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("autopayEnabled:");
    sb.append(this.autopayEnabled);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

