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

public class PaidCallHistory implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("PaidCallHistory");

  private static final TField SEQ_FIELD_DESC = new TField("seq", TType.I64, (short)1);
  private static final TField TYPE_FIELD_DESC = new TField("type", TType.I32, (short)2);
  private static final TField DIALED_NUMBER_FIELD_DESC = new TField("dialedNumber", TType.STRING, (short)3);
  private static final TField CALLED_NUMBER_FIELD_DESC = new TField("calledNumber", TType.STRING, (short)4);
  private static final TField TO_MID_FIELD_DESC = new TField("toMid", TType.STRING, (short)5);
  private static final TField TO_NAME_FIELD_DESC = new TField("toName", TType.STRING, (short)6);
  private static final TField SETUP_TIME_FIELD_DESC = new TField("setupTime", TType.I64, (short)7);
  private static final TField START_TIME_FIELD_DESC = new TField("startTime", TType.I64, (short)8);
  private static final TField END_TIME_FIELD_DESC = new TField("endTime", TType.I64, (short)9);
  private static final TField DURATION_FIELD_DESC = new TField("duration", TType.I64, (short)10);
  private static final TField TERMINATE_FIELD_DESC = new TField("terminate", TType.I32, (short)11);
  private static final TField PRODUCT_TYPE_FIELD_DESC = new TField("productType", TType.I32, (short)12);
  private static final TField CHARGE_FIELD_DESC = new TField("charge", TType.I32, (short)13);
  private static final TField UNIT_FIELD_DESC = new TField("unit", TType.STRING, (short)14);
  private static final TField RESULT_FIELD_DESC = new TField("result", TType.STRING, (short)15);

  private long seq;
  private PaidCallType type;
  private String dialedNumber;
  private String calledNumber;
  private String toMid;
  private String toName;
  private long setupTime;
  private long startTime;
  private long endTime;
  private long duration;
  private int terminate;
  private PaidCallProductType productType;
  private int charge;
  private String unit;
  private String result;

  // isset id assignments
  private static final int __SEQ_ISSET_ID = 0;
  private static final int __SETUPTIME_ISSET_ID = 1;
  private static final int __STARTTIME_ISSET_ID = 2;
  private static final int __ENDTIME_ISSET_ID = 3;
  private static final int __DURATION_ISSET_ID = 4;
  private static final int __TERMINATE_ISSET_ID = 5;
  private static final int __CHARGE_ISSET_ID = 6;
  private boolean[] __isset_vector = new boolean[7];

  public PaidCallHistory() {
  }

  public PaidCallHistory(
    long seq,
    PaidCallType type,
    String dialedNumber,
    String calledNumber,
    String toMid,
    String toName,
    long setupTime,
    long startTime,
    long endTime,
    long duration,
    int terminate,
    PaidCallProductType productType,
    int charge,
    String unit,
    String result)
  {
    this();
    this.seq = seq;
    setSeqIsSet(true);
    this.type = type;
    this.dialedNumber = dialedNumber;
    this.calledNumber = calledNumber;
    this.toMid = toMid;
    this.toName = toName;
    this.setupTime = setupTime;
    setSetupTimeIsSet(true);
    this.startTime = startTime;
    setStartTimeIsSet(true);
    this.endTime = endTime;
    setEndTimeIsSet(true);
    this.duration = duration;
    setDurationIsSet(true);
    this.terminate = terminate;
    setTerminateIsSet(true);
    this.productType = productType;
    this.charge = charge;
    setChargeIsSet(true);
    this.unit = unit;
    this.result = result;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PaidCallHistory(PaidCallHistory other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.seq = other.seq;
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetDialedNumber()) {
      this.dialedNumber = other.dialedNumber;
    }
    if (other.isSetCalledNumber()) {
      this.calledNumber = other.calledNumber;
    }
    if (other.isSetToMid()) {
      this.toMid = other.toMid;
    }
    if (other.isSetToName()) {
      this.toName = other.toName;
    }
    this.setupTime = other.setupTime;
    this.startTime = other.startTime;
    this.endTime = other.endTime;
    this.duration = other.duration;
    this.terminate = other.terminate;
    if (other.isSetProductType()) {
      this.productType = other.productType;
    }
    this.charge = other.charge;
    if (other.isSetUnit()) {
      this.unit = other.unit;
    }
    if (other.isSetResult()) {
      this.result = other.result;
    }
  }

  public PaidCallHistory deepCopy() {
    return new PaidCallHistory(this);
  }

  public void clear() {
    setSeqIsSet(false);
    this.seq = 0;
    this.type = null;
    this.dialedNumber = null;
    this.calledNumber = null;
    this.toMid = null;
    this.toName = null;
    setSetupTimeIsSet(false);
    this.setupTime = 0;
    setStartTimeIsSet(false);
    this.startTime = 0;
    setEndTimeIsSet(false);
    this.endTime = 0;
    setDurationIsSet(false);
    this.duration = 0;
    setTerminateIsSet(false);
    this.terminate = 0;
    this.productType = null;
    setChargeIsSet(false);
    this.charge = 0;
    this.unit = null;
    this.result = null;
  }

  public long getSeq() {
    return this.seq;
  }

  public void setSeq(long seq) {
    this.seq = seq;
    setSeqIsSet(true);
  }

  public void unsetSeq() {
    __isset_vector[__SEQ_ISSET_ID] = false;
  }

  /** Returns true if field seq is set (has been assigned a value) and false otherwise */
  public boolean isSetSeq() {
    return __isset_vector[__SEQ_ISSET_ID];
  }

  public void setSeqIsSet(boolean value) {
    __isset_vector[__SEQ_ISSET_ID] = value;
  }

  /**
   * 
   * @see PaidCallType
   */
  public PaidCallType getType() {
    return this.type;
  }

  /**
   * 
   * @see PaidCallType
   */
  public void setType(PaidCallType type) {
    this.type = type;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public String getDialedNumber() {
    return this.dialedNumber;
  }

  public void setDialedNumber(String dialedNumber) {
    this.dialedNumber = dialedNumber;
  }

  public void unsetDialedNumber() {
    this.dialedNumber = null;
  }

  /** Returns true if field dialedNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetDialedNumber() {
    return this.dialedNumber != null;
  }

  public void setDialedNumberIsSet(boolean value) {
    if (!value) {
      this.dialedNumber = null;
    }
  }

  public String getCalledNumber() {
    return this.calledNumber;
  }

  public void setCalledNumber(String calledNumber) {
    this.calledNumber = calledNumber;
  }

  public void unsetCalledNumber() {
    this.calledNumber = null;
  }

  /** Returns true if field calledNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetCalledNumber() {
    return this.calledNumber != null;
  }

  public void setCalledNumberIsSet(boolean value) {
    if (!value) {
      this.calledNumber = null;
    }
  }

  public String getToMid() {
    return this.toMid;
  }

  public void setToMid(String toMid) {
    this.toMid = toMid;
  }

  public void unsetToMid() {
    this.toMid = null;
  }

  /** Returns true if field toMid is set (has been assigned a value) and false otherwise */
  public boolean isSetToMid() {
    return this.toMid != null;
  }

  public void setToMidIsSet(boolean value) {
    if (!value) {
      this.toMid = null;
    }
  }

  public String getToName() {
    return this.toName;
  }

  public void setToName(String toName) {
    this.toName = toName;
  }

  public void unsetToName() {
    this.toName = null;
  }

  /** Returns true if field toName is set (has been assigned a value) and false otherwise */
  public boolean isSetToName() {
    return this.toName != null;
  }

  public void setToNameIsSet(boolean value) {
    if (!value) {
      this.toName = null;
    }
  }

  public long getSetupTime() {
    return this.setupTime;
  }

  public void setSetupTime(long setupTime) {
    this.setupTime = setupTime;
    setSetupTimeIsSet(true);
  }

  public void unsetSetupTime() {
    __isset_vector[__SETUPTIME_ISSET_ID] = false;
  }

  /** Returns true if field setupTime is set (has been assigned a value) and false otherwise */
  public boolean isSetSetupTime() {
    return __isset_vector[__SETUPTIME_ISSET_ID];
  }

  public void setSetupTimeIsSet(boolean value) {
    __isset_vector[__SETUPTIME_ISSET_ID] = value;
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

  public long getDuration() {
    return this.duration;
  }

  public void setDuration(long duration) {
    this.duration = duration;
    setDurationIsSet(true);
  }

  public void unsetDuration() {
    __isset_vector[__DURATION_ISSET_ID] = false;
  }

  /** Returns true if field duration is set (has been assigned a value) and false otherwise */
  public boolean isSetDuration() {
    return __isset_vector[__DURATION_ISSET_ID];
  }

  public void setDurationIsSet(boolean value) {
    __isset_vector[__DURATION_ISSET_ID] = value;
  }

  public int getTerminate() {
    return this.terminate;
  }

  public void setTerminate(int terminate) {
    this.terminate = terminate;
    setTerminateIsSet(true);
  }

  public void unsetTerminate() {
    __isset_vector[__TERMINATE_ISSET_ID] = false;
  }

  /** Returns true if field terminate is set (has been assigned a value) and false otherwise */
  public boolean isSetTerminate() {
    return __isset_vector[__TERMINATE_ISSET_ID];
  }

  public void setTerminateIsSet(boolean value) {
    __isset_vector[__TERMINATE_ISSET_ID] = value;
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

  public int getCharge() {
    return this.charge;
  }

  public void setCharge(int charge) {
    this.charge = charge;
    setChargeIsSet(true);
  }

  public void unsetCharge() {
    __isset_vector[__CHARGE_ISSET_ID] = false;
  }

  /** Returns true if field charge is set (has been assigned a value) and false otherwise */
  public boolean isSetCharge() {
    return __isset_vector[__CHARGE_ISSET_ID];
  }

  public void setChargeIsSet(boolean value) {
    __isset_vector[__CHARGE_ISSET_ID] = value;
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

  public String getResult() {
    return this.result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public void unsetResult() {
    this.result = null;
  }

  /** Returns true if field result is set (has been assigned a value) and false otherwise */
  public boolean isSetResult() {
    return this.result != null;
  }

  public void setResultIsSet(boolean value) {
    if (!value) {
      this.result = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PaidCallHistory)
      return this.equals((PaidCallHistory)that);
    return false;
  }

  public boolean equals(PaidCallHistory that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_seq = true;
    boolean that_present_seq = true;
    if (this_present_seq || that_present_seq) {
      if (!(this_present_seq && that_present_seq))
        return false;
      if (this.seq != that.seq)
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_dialedNumber = true && this.isSetDialedNumber();
    boolean that_present_dialedNumber = true && that.isSetDialedNumber();
    if (this_present_dialedNumber || that_present_dialedNumber) {
      if (!(this_present_dialedNumber && that_present_dialedNumber))
        return false;
      if (!this.dialedNumber.equals(that.dialedNumber))
        return false;
    }

    boolean this_present_calledNumber = true && this.isSetCalledNumber();
    boolean that_present_calledNumber = true && that.isSetCalledNumber();
    if (this_present_calledNumber || that_present_calledNumber) {
      if (!(this_present_calledNumber && that_present_calledNumber))
        return false;
      if (!this.calledNumber.equals(that.calledNumber))
        return false;
    }

    boolean this_present_toMid = true && this.isSetToMid();
    boolean that_present_toMid = true && that.isSetToMid();
    if (this_present_toMid || that_present_toMid) {
      if (!(this_present_toMid && that_present_toMid))
        return false;
      if (!this.toMid.equals(that.toMid))
        return false;
    }

    boolean this_present_toName = true && this.isSetToName();
    boolean that_present_toName = true && that.isSetToName();
    if (this_present_toName || that_present_toName) {
      if (!(this_present_toName && that_present_toName))
        return false;
      if (!this.toName.equals(that.toName))
        return false;
    }

    boolean this_present_setupTime = true;
    boolean that_present_setupTime = true;
    if (this_present_setupTime || that_present_setupTime) {
      if (!(this_present_setupTime && that_present_setupTime))
        return false;
      if (this.setupTime != that.setupTime)
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

    boolean this_present_duration = true;
    boolean that_present_duration = true;
    if (this_present_duration || that_present_duration) {
      if (!(this_present_duration && that_present_duration))
        return false;
      if (this.duration != that.duration)
        return false;
    }

    boolean this_present_terminate = true;
    boolean that_present_terminate = true;
    if (this_present_terminate || that_present_terminate) {
      if (!(this_present_terminate && that_present_terminate))
        return false;
      if (this.terminate != that.terminate)
        return false;
    }

    boolean this_present_productType = true && this.isSetProductType();
    boolean that_present_productType = true && that.isSetProductType();
    if (this_present_productType || that_present_productType) {
      if (!(this_present_productType && that_present_productType))
        return false;
      if (!this.productType.equals(that.productType))
        return false;
    }

    boolean this_present_charge = true;
    boolean that_present_charge = true;
    if (this_present_charge || that_present_charge) {
      if (!(this_present_charge && that_present_charge))
        return false;
      if (this.charge != that.charge)
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

    boolean this_present_result = true && this.isSetResult();
    boolean that_present_result = true && that.isSetResult();
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (!this.result.equals(that.result))
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

    PaidCallHistory other = (PaidCallHistory)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetSeq(), other.isSetSeq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSeq()) {
      lastComparison = TBaseHelper.compareTo(this.seq, other.seq);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetType(), other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetDialedNumber(), other.isSetDialedNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDialedNumber()) {
      lastComparison = TBaseHelper.compareTo(this.dialedNumber, other.dialedNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetCalledNumber(), other.isSetCalledNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCalledNumber()) {
      lastComparison = TBaseHelper.compareTo(this.calledNumber, other.calledNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetToMid(), other.isSetToMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToMid()) {
      lastComparison = TBaseHelper.compareTo(this.toMid, other.toMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetToName(), other.isSetToName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToName()) {
      lastComparison = TBaseHelper.compareTo(this.toName, other.toName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSetupTime(), other.isSetSetupTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSetupTime()) {
      lastComparison = TBaseHelper.compareTo(this.setupTime, other.setupTime);
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
    lastComparison = TBaseHelper.compareTo(isSetDuration(), other.isSetDuration());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDuration()) {
      lastComparison = TBaseHelper.compareTo(this.duration, other.duration);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetTerminate(), other.isSetTerminate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTerminate()) {
      lastComparison = TBaseHelper.compareTo(this.terminate, other.terminate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = TBaseHelper.compareTo(isSetCharge(), other.isSetCharge());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCharge()) {
      lastComparison = TBaseHelper.compareTo(this.charge, other.charge);
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
    lastComparison = TBaseHelper.compareTo(isSetResult(), other.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResult()) {
      lastComparison = TBaseHelper.compareTo(this.result, other.result);
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
        case 1: // SEQ
          if (field.type == TType.I64) {
            this.seq = iprot.readI64();
            setSeqIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // TYPE
          if (field.type == TType.I32) {
            this.type = PaidCallType.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // DIALED_NUMBER
          if (field.type == TType.STRING) {
            this.dialedNumber = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // CALLED_NUMBER
          if (field.type == TType.STRING) {
            this.calledNumber = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // TO_MID
          if (field.type == TType.STRING) {
            this.toMid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // TO_NAME
          if (field.type == TType.STRING) {
            this.toName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // SETUP_TIME
          if (field.type == TType.I64) {
            this.setupTime = iprot.readI64();
            setSetupTimeIsSet(true);
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
        case 10: // DURATION
          if (field.type == TType.I64) {
            this.duration = iprot.readI64();
            setDurationIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 11: // TERMINATE
          if (field.type == TType.I32) {
            this.terminate = iprot.readI32();
            setTerminateIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 12: // PRODUCT_TYPE
          if (field.type == TType.I32) {
            this.productType = PaidCallProductType.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 13: // CHARGE
          if (field.type == TType.I32) {
            this.charge = iprot.readI32();
            setChargeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 14: // UNIT
          if (field.type == TType.STRING) {
            this.unit = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 15: // RESULT
          if (field.type == TType.STRING) {
            this.result = iprot.readString();
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
    oprot.writeFieldBegin(SEQ_FIELD_DESC);
    oprot.writeI64(this.seq);
    oprot.writeFieldEnd();
    if (this.type != null) {
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeI32(this.type.getValue());
      oprot.writeFieldEnd();
    }
    if (this.dialedNumber != null) {
      oprot.writeFieldBegin(DIALED_NUMBER_FIELD_DESC);
      oprot.writeString(this.dialedNumber);
      oprot.writeFieldEnd();
    }
    if (this.calledNumber != null) {
      oprot.writeFieldBegin(CALLED_NUMBER_FIELD_DESC);
      oprot.writeString(this.calledNumber);
      oprot.writeFieldEnd();
    }
    if (this.toMid != null) {
      oprot.writeFieldBegin(TO_MID_FIELD_DESC);
      oprot.writeString(this.toMid);
      oprot.writeFieldEnd();
    }
    if (this.toName != null) {
      oprot.writeFieldBegin(TO_NAME_FIELD_DESC);
      oprot.writeString(this.toName);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(SETUP_TIME_FIELD_DESC);
    oprot.writeI64(this.setupTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(START_TIME_FIELD_DESC);
    oprot.writeI64(this.startTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(END_TIME_FIELD_DESC);
    oprot.writeI64(this.endTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(DURATION_FIELD_DESC);
    oprot.writeI64(this.duration);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(TERMINATE_FIELD_DESC);
    oprot.writeI32(this.terminate);
    oprot.writeFieldEnd();
    if (this.productType != null) {
      oprot.writeFieldBegin(PRODUCT_TYPE_FIELD_DESC);
      oprot.writeI32(this.productType.getValue());
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(CHARGE_FIELD_DESC);
    oprot.writeI32(this.charge);
    oprot.writeFieldEnd();
    if (this.unit != null) {
      oprot.writeFieldBegin(UNIT_FIELD_DESC);
      oprot.writeString(this.unit);
      oprot.writeFieldEnd();
    }
    if (this.result != null) {
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      oprot.writeString(this.result);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("PaidCallHistory(");
    boolean first = true;

    sb.append("seq:");
    sb.append(this.seq);
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dialedNumber:");
    if (this.dialedNumber == null) {
      sb.append("null");
    } else {
      sb.append(this.dialedNumber);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("calledNumber:");
    if (this.calledNumber == null) {
      sb.append("null");
    } else {
      sb.append(this.calledNumber);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("toMid:");
    if (this.toMid == null) {
      sb.append("null");
    } else {
      sb.append(this.toMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("toName:");
    if (this.toName == null) {
      sb.append("null");
    } else {
      sb.append(this.toName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("setupTime:");
    sb.append(this.setupTime);
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
    sb.append("duration:");
    sb.append(this.duration);
    first = false;
    if (!first) sb.append(", ");
    sb.append("terminate:");
    sb.append(this.terminate);
    first = false;
    if (!first) sb.append(", ");
    sb.append("productType:");
    if (this.productType == null) {
      sb.append("null");
    } else {
      sb.append(this.productType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("charge:");
    sb.append(this.charge);
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
    sb.append("result:");
    if (this.result == null) {
      sb.append("null");
    } else {
      sb.append(this.result);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

