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

public class OTPResult implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("OTPResult");

  private static final TField OTP_ID_FIELD_DESC = new TField("otpId", TType.STRING, (short)1);
  private static final TField OTP_FIELD_DESC = new TField("otp", TType.STRING, (short)2);

  private String otpId;
  private String otp;

  // isset id assignments

  public OTPResult() {
  }

  public OTPResult(
    String otpId,
    String otp)
  {
    this();
    this.otpId = otpId;
    this.otp = otp;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OTPResult(OTPResult other) {
    if (other.isSetOtpId()) {
      this.otpId = other.otpId;
    }
    if (other.isSetOtp()) {
      this.otp = other.otp;
    }
  }

  public OTPResult deepCopy() {
    return new OTPResult(this);
  }

  public void clear() {
    this.otpId = null;
    this.otp = null;
  }

  public String getOtpId() {
    return this.otpId;
  }

  public void setOtpId(String otpId) {
    this.otpId = otpId;
  }

  public void unsetOtpId() {
    this.otpId = null;
  }

  /** Returns true if field otpId is set (has been assigned a value) and false otherwise */
  public boolean isSetOtpId() {
    return this.otpId != null;
  }

  public void setOtpIdIsSet(boolean value) {
    if (!value) {
      this.otpId = null;
    }
  }

  public String getOtp() {
    return this.otp;
  }

  public void setOtp(String otp) {
    this.otp = otp;
  }

  public void unsetOtp() {
    this.otp = null;
  }

  /** Returns true if field otp is set (has been assigned a value) and false otherwise */
  public boolean isSetOtp() {
    return this.otp != null;
  }

  public void setOtpIsSet(boolean value) {
    if (!value) {
      this.otp = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof OTPResult)
      return this.equals((OTPResult)that);
    return false;
  }

  public boolean equals(OTPResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_otpId = true && this.isSetOtpId();
    boolean that_present_otpId = true && that.isSetOtpId();
    if (this_present_otpId || that_present_otpId) {
      if (!(this_present_otpId && that_present_otpId))
        return false;
      if (!this.otpId.equals(that.otpId))
        return false;
    }

    boolean this_present_otp = true && this.isSetOtp();
    boolean that_present_otp = true && that.isSetOtp();
    if (this_present_otp || that_present_otp) {
      if (!(this_present_otp && that_present_otp))
        return false;
      if (!this.otp.equals(that.otp))
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

    OTPResult other = (OTPResult)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetOtpId(), other.isSetOtpId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOtpId()) {
      lastComparison = TBaseHelper.compareTo(this.otpId, other.otpId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetOtp(), other.isSetOtp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOtp()) {
      lastComparison = TBaseHelper.compareTo(this.otp, other.otp);
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
        case 1: // OTP_ID
          if (field.type == TType.STRING) {
            this.otpId = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // OTP
          if (field.type == TType.STRING) {
            this.otp = iprot.readString();
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
    if (this.otpId != null) {
      oprot.writeFieldBegin(OTP_ID_FIELD_DESC);
      oprot.writeString(this.otpId);
      oprot.writeFieldEnd();
    }
    if (this.otp != null) {
      oprot.writeFieldBegin(OTP_FIELD_DESC);
      oprot.writeString(this.otp);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("OTPResult(");
    boolean first = true;

    sb.append("otpId:");
    if (this.otpId == null) {
      sb.append("null");
    } else {
      sb.append(this.otpId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("otp:");
    if (this.otp == null) {
      sb.append("null");
    } else {
      sb.append(this.otp);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

