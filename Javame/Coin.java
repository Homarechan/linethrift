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

public class Coin implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("Coin");

  private static final TField FREE_COIN_BALANCE_FIELD_DESC = new TField("freeCoinBalance", TType.I32, (short)1);
  private static final TField PAYED_COIN_BALANCE_FIELD_DESC = new TField("payedCoinBalance", TType.I32, (short)2);
  private static final TField TOTAL_COIN_BALANCE_FIELD_DESC = new TField("totalCoinBalance", TType.I32, (short)3);
  private static final TField REWARD_COIN_BALANCE_FIELD_DESC = new TField("rewardCoinBalance", TType.I32, (short)4);

  private int freeCoinBalance;
  private int payedCoinBalance;
  private int totalCoinBalance;
  private int rewardCoinBalance;

  // isset id assignments
  private static final int __FREECOINBALANCE_ISSET_ID = 0;
  private static final int __PAYEDCOINBALANCE_ISSET_ID = 1;
  private static final int __TOTALCOINBALANCE_ISSET_ID = 2;
  private static final int __REWARDCOINBALANCE_ISSET_ID = 3;
  private boolean[] __isset_vector = new boolean[4];

  public Coin() {
  }

  public Coin(
    int freeCoinBalance,
    int payedCoinBalance,
    int totalCoinBalance,
    int rewardCoinBalance)
  {
    this();
    this.freeCoinBalance = freeCoinBalance;
    setFreeCoinBalanceIsSet(true);
    this.payedCoinBalance = payedCoinBalance;
    setPayedCoinBalanceIsSet(true);
    this.totalCoinBalance = totalCoinBalance;
    setTotalCoinBalanceIsSet(true);
    this.rewardCoinBalance = rewardCoinBalance;
    setRewardCoinBalanceIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Coin(Coin other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.freeCoinBalance = other.freeCoinBalance;
    this.payedCoinBalance = other.payedCoinBalance;
    this.totalCoinBalance = other.totalCoinBalance;
    this.rewardCoinBalance = other.rewardCoinBalance;
  }

  public Coin deepCopy() {
    return new Coin(this);
  }

  public void clear() {
    setFreeCoinBalanceIsSet(false);
    this.freeCoinBalance = 0;
    setPayedCoinBalanceIsSet(false);
    this.payedCoinBalance = 0;
    setTotalCoinBalanceIsSet(false);
    this.totalCoinBalance = 0;
    setRewardCoinBalanceIsSet(false);
    this.rewardCoinBalance = 0;
  }

  public int getFreeCoinBalance() {
    return this.freeCoinBalance;
  }

  public void setFreeCoinBalance(int freeCoinBalance) {
    this.freeCoinBalance = freeCoinBalance;
    setFreeCoinBalanceIsSet(true);
  }

  public void unsetFreeCoinBalance() {
    __isset_vector[__FREECOINBALANCE_ISSET_ID] = false;
  }

  /** Returns true if field freeCoinBalance is set (has been assigned a value) and false otherwise */
  public boolean isSetFreeCoinBalance() {
    return __isset_vector[__FREECOINBALANCE_ISSET_ID];
  }

  public void setFreeCoinBalanceIsSet(boolean value) {
    __isset_vector[__FREECOINBALANCE_ISSET_ID] = value;
  }

  public int getPayedCoinBalance() {
    return this.payedCoinBalance;
  }

  public void setPayedCoinBalance(int payedCoinBalance) {
    this.payedCoinBalance = payedCoinBalance;
    setPayedCoinBalanceIsSet(true);
  }

  public void unsetPayedCoinBalance() {
    __isset_vector[__PAYEDCOINBALANCE_ISSET_ID] = false;
  }

  /** Returns true if field payedCoinBalance is set (has been assigned a value) and false otherwise */
  public boolean isSetPayedCoinBalance() {
    return __isset_vector[__PAYEDCOINBALANCE_ISSET_ID];
  }

  public void setPayedCoinBalanceIsSet(boolean value) {
    __isset_vector[__PAYEDCOINBALANCE_ISSET_ID] = value;
  }

  public int getTotalCoinBalance() {
    return this.totalCoinBalance;
  }

  public void setTotalCoinBalance(int totalCoinBalance) {
    this.totalCoinBalance = totalCoinBalance;
    setTotalCoinBalanceIsSet(true);
  }

  public void unsetTotalCoinBalance() {
    __isset_vector[__TOTALCOINBALANCE_ISSET_ID] = false;
  }

  /** Returns true if field totalCoinBalance is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalCoinBalance() {
    return __isset_vector[__TOTALCOINBALANCE_ISSET_ID];
  }

  public void setTotalCoinBalanceIsSet(boolean value) {
    __isset_vector[__TOTALCOINBALANCE_ISSET_ID] = value;
  }

  public int getRewardCoinBalance() {
    return this.rewardCoinBalance;
  }

  public void setRewardCoinBalance(int rewardCoinBalance) {
    this.rewardCoinBalance = rewardCoinBalance;
    setRewardCoinBalanceIsSet(true);
  }

  public void unsetRewardCoinBalance() {
    __isset_vector[__REWARDCOINBALANCE_ISSET_ID] = false;
  }

  /** Returns true if field rewardCoinBalance is set (has been assigned a value) and false otherwise */
  public boolean isSetRewardCoinBalance() {
    return __isset_vector[__REWARDCOINBALANCE_ISSET_ID];
  }

  public void setRewardCoinBalanceIsSet(boolean value) {
    __isset_vector[__REWARDCOINBALANCE_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Coin)
      return this.equals((Coin)that);
    return false;
  }

  public boolean equals(Coin that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_freeCoinBalance = true;
    boolean that_present_freeCoinBalance = true;
    if (this_present_freeCoinBalance || that_present_freeCoinBalance) {
      if (!(this_present_freeCoinBalance && that_present_freeCoinBalance))
        return false;
      if (this.freeCoinBalance != that.freeCoinBalance)
        return false;
    }

    boolean this_present_payedCoinBalance = true;
    boolean that_present_payedCoinBalance = true;
    if (this_present_payedCoinBalance || that_present_payedCoinBalance) {
      if (!(this_present_payedCoinBalance && that_present_payedCoinBalance))
        return false;
      if (this.payedCoinBalance != that.payedCoinBalance)
        return false;
    }

    boolean this_present_totalCoinBalance = true;
    boolean that_present_totalCoinBalance = true;
    if (this_present_totalCoinBalance || that_present_totalCoinBalance) {
      if (!(this_present_totalCoinBalance && that_present_totalCoinBalance))
        return false;
      if (this.totalCoinBalance != that.totalCoinBalance)
        return false;
    }

    boolean this_present_rewardCoinBalance = true;
    boolean that_present_rewardCoinBalance = true;
    if (this_present_rewardCoinBalance || that_present_rewardCoinBalance) {
      if (!(this_present_rewardCoinBalance && that_present_rewardCoinBalance))
        return false;
      if (this.rewardCoinBalance != that.rewardCoinBalance)
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

    Coin other = (Coin)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetFreeCoinBalance(), other.isSetFreeCoinBalance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFreeCoinBalance()) {
      lastComparison = TBaseHelper.compareTo(this.freeCoinBalance, other.freeCoinBalance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetPayedCoinBalance(), other.isSetPayedCoinBalance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPayedCoinBalance()) {
      lastComparison = TBaseHelper.compareTo(this.payedCoinBalance, other.payedCoinBalance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetTotalCoinBalance(), other.isSetTotalCoinBalance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalCoinBalance()) {
      lastComparison = TBaseHelper.compareTo(this.totalCoinBalance, other.totalCoinBalance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetRewardCoinBalance(), other.isSetRewardCoinBalance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRewardCoinBalance()) {
      lastComparison = TBaseHelper.compareTo(this.rewardCoinBalance, other.rewardCoinBalance);
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
        case 1: // FREE_COIN_BALANCE
          if (field.type == TType.I32) {
            this.freeCoinBalance = iprot.readI32();
            setFreeCoinBalanceIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // PAYED_COIN_BALANCE
          if (field.type == TType.I32) {
            this.payedCoinBalance = iprot.readI32();
            setPayedCoinBalanceIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // TOTAL_COIN_BALANCE
          if (field.type == TType.I32) {
            this.totalCoinBalance = iprot.readI32();
            setTotalCoinBalanceIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // REWARD_COIN_BALANCE
          if (field.type == TType.I32) {
            this.rewardCoinBalance = iprot.readI32();
            setRewardCoinBalanceIsSet(true);
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
    oprot.writeFieldBegin(FREE_COIN_BALANCE_FIELD_DESC);
    oprot.writeI32(this.freeCoinBalance);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(PAYED_COIN_BALANCE_FIELD_DESC);
    oprot.writeI32(this.payedCoinBalance);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(TOTAL_COIN_BALANCE_FIELD_DESC);
    oprot.writeI32(this.totalCoinBalance);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(REWARD_COIN_BALANCE_FIELD_DESC);
    oprot.writeI32(this.rewardCoinBalance);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("Coin(");
    boolean first = true;

    sb.append("freeCoinBalance:");
    sb.append(this.freeCoinBalance);
    first = false;
    if (!first) sb.append(", ");
    sb.append("payedCoinBalance:");
    sb.append(this.payedCoinBalance);
    first = false;
    if (!first) sb.append(", ");
    sb.append("totalCoinBalance:");
    sb.append(this.totalCoinBalance);
    first = false;
    if (!first) sb.append(", ");
    sb.append("rewardCoinBalance:");
    sb.append(this.rewardCoinBalance);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

