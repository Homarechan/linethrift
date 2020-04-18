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

public class ReportSquareMessageRequest implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("ReportSquareMessageRequest");

  private static final TField SQUARE_MID_FIELD_DESC = new TField("squareMid", TType.STRING, (short)2);
  private static final TField SQUARE_CHAT_MID_FIELD_DESC = new TField("squareChatMid", TType.STRING, (short)3);
  private static final TField SQUARE_MESSAGE_ID_FIELD_DESC = new TField("squareMessageId", TType.STRING, (short)4);
  private static final TField REPORT_TYPE_FIELD_DESC = new TField("reportType", TType.I32, (short)5);
  private static final TField OTHER_REASON_FIELD_DESC = new TField("otherReason", TType.STRING, (short)6);

  private String squareMid;
  private String squareChatMid;
  private String squareMessageId;
  private ReportType reportType;
  private String otherReason;

  // isset id assignments

  public ReportSquareMessageRequest() {
  }

  public ReportSquareMessageRequest(
    String squareMid,
    String squareChatMid,
    String squareMessageId,
    ReportType reportType,
    String otherReason)
  {
    this();
    this.squareMid = squareMid;
    this.squareChatMid = squareChatMid;
    this.squareMessageId = squareMessageId;
    this.reportType = reportType;
    this.otherReason = otherReason;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReportSquareMessageRequest(ReportSquareMessageRequest other) {
    if (other.isSetSquareMid()) {
      this.squareMid = other.squareMid;
    }
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
    if (other.isSetSquareMessageId()) {
      this.squareMessageId = other.squareMessageId;
    }
    if (other.isSetReportType()) {
      this.reportType = other.reportType;
    }
    if (other.isSetOtherReason()) {
      this.otherReason = other.otherReason;
    }
  }

  public ReportSquareMessageRequest deepCopy() {
    return new ReportSquareMessageRequest(this);
  }

  public void clear() {
    this.squareMid = null;
    this.squareChatMid = null;
    this.squareMessageId = null;
    this.reportType = null;
    this.otherReason = null;
  }

  public String getSquareMid() {
    return this.squareMid;
  }

  public void setSquareMid(String squareMid) {
    this.squareMid = squareMid;
  }

  public void unsetSquareMid() {
    this.squareMid = null;
  }

  /** Returns true if field squareMid is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareMid() {
    return this.squareMid != null;
  }

  public void setSquareMidIsSet(boolean value) {
    if (!value) {
      this.squareMid = null;
    }
  }

  public String getSquareChatMid() {
    return this.squareChatMid;
  }

  public void setSquareChatMid(String squareChatMid) {
    this.squareChatMid = squareChatMid;
  }

  public void unsetSquareChatMid() {
    this.squareChatMid = null;
  }

  /** Returns true if field squareChatMid is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChatMid() {
    return this.squareChatMid != null;
  }

  public void setSquareChatMidIsSet(boolean value) {
    if (!value) {
      this.squareChatMid = null;
    }
  }

  public String getSquareMessageId() {
    return this.squareMessageId;
  }

  public void setSquareMessageId(String squareMessageId) {
    this.squareMessageId = squareMessageId;
  }

  public void unsetSquareMessageId() {
    this.squareMessageId = null;
  }

  /** Returns true if field squareMessageId is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareMessageId() {
    return this.squareMessageId != null;
  }

  public void setSquareMessageIdIsSet(boolean value) {
    if (!value) {
      this.squareMessageId = null;
    }
  }

  /**
   * 
   * @see ReportType
   */
  public ReportType getReportType() {
    return this.reportType;
  }

  /**
   * 
   * @see ReportType
   */
  public void setReportType(ReportType reportType) {
    this.reportType = reportType;
  }

  public void unsetReportType() {
    this.reportType = null;
  }

  /** Returns true if field reportType is set (has been assigned a value) and false otherwise */
  public boolean isSetReportType() {
    return this.reportType != null;
  }

  public void setReportTypeIsSet(boolean value) {
    if (!value) {
      this.reportType = null;
    }
  }

  public String getOtherReason() {
    return this.otherReason;
  }

  public void setOtherReason(String otherReason) {
    this.otherReason = otherReason;
  }

  public void unsetOtherReason() {
    this.otherReason = null;
  }

  /** Returns true if field otherReason is set (has been assigned a value) and false otherwise */
  public boolean isSetOtherReason() {
    return this.otherReason != null;
  }

  public void setOtherReasonIsSet(boolean value) {
    if (!value) {
      this.otherReason = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ReportSquareMessageRequest)
      return this.equals((ReportSquareMessageRequest)that);
    return false;
  }

  public boolean equals(ReportSquareMessageRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareMid = true && this.isSetSquareMid();
    boolean that_present_squareMid = true && that.isSetSquareMid();
    if (this_present_squareMid || that_present_squareMid) {
      if (!(this_present_squareMid && that_present_squareMid))
        return false;
      if (!this.squareMid.equals(that.squareMid))
        return false;
    }

    boolean this_present_squareChatMid = true && this.isSetSquareChatMid();
    boolean that_present_squareChatMid = true && that.isSetSquareChatMid();
    if (this_present_squareChatMid || that_present_squareChatMid) {
      if (!(this_present_squareChatMid && that_present_squareChatMid))
        return false;
      if (!this.squareChatMid.equals(that.squareChatMid))
        return false;
    }

    boolean this_present_squareMessageId = true && this.isSetSquareMessageId();
    boolean that_present_squareMessageId = true && that.isSetSquareMessageId();
    if (this_present_squareMessageId || that_present_squareMessageId) {
      if (!(this_present_squareMessageId && that_present_squareMessageId))
        return false;
      if (!this.squareMessageId.equals(that.squareMessageId))
        return false;
    }

    boolean this_present_reportType = true && this.isSetReportType();
    boolean that_present_reportType = true && that.isSetReportType();
    if (this_present_reportType || that_present_reportType) {
      if (!(this_present_reportType && that_present_reportType))
        return false;
      if (!this.reportType.equals(that.reportType))
        return false;
    }

    boolean this_present_otherReason = true && this.isSetOtherReason();
    boolean that_present_otherReason = true && that.isSetOtherReason();
    if (this_present_otherReason || that_present_otherReason) {
      if (!(this_present_otherReason && that_present_otherReason))
        return false;
      if (!this.otherReason.equals(that.otherReason))
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

    ReportSquareMessageRequest other = (ReportSquareMessageRequest)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetSquareMid(), other.isSetSquareMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareMid()) {
      lastComparison = TBaseHelper.compareTo(this.squareMid, other.squareMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSquareChatMid(), other.isSetSquareChatMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatMid()) {
      lastComparison = TBaseHelper.compareTo(this.squareChatMid, other.squareChatMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSquareMessageId(), other.isSetSquareMessageId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareMessageId()) {
      lastComparison = TBaseHelper.compareTo(this.squareMessageId, other.squareMessageId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetReportType(), other.isSetReportType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReportType()) {
      lastComparison = TBaseHelper.compareTo(this.reportType, other.reportType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetOtherReason(), other.isSetOtherReason());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOtherReason()) {
      lastComparison = TBaseHelper.compareTo(this.otherReason, other.otherReason);
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
        case 2: // SQUARE_MID
          if (field.type == TType.STRING) {
            this.squareMid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // SQUARE_CHAT_MID
          if (field.type == TType.STRING) {
            this.squareChatMid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // SQUARE_MESSAGE_ID
          if (field.type == TType.STRING) {
            this.squareMessageId = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // REPORT_TYPE
          if (field.type == TType.I32) {
            this.reportType = ReportType.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // OTHER_REASON
          if (field.type == TType.STRING) {
            this.otherReason = iprot.readString();
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
    if (this.squareMid != null) {
      oprot.writeFieldBegin(SQUARE_MID_FIELD_DESC);
      oprot.writeString(this.squareMid);
      oprot.writeFieldEnd();
    }
    if (this.squareChatMid != null) {
      oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
      oprot.writeString(this.squareChatMid);
      oprot.writeFieldEnd();
    }
    if (this.squareMessageId != null) {
      oprot.writeFieldBegin(SQUARE_MESSAGE_ID_FIELD_DESC);
      oprot.writeString(this.squareMessageId);
      oprot.writeFieldEnd();
    }
    if (this.reportType != null) {
      oprot.writeFieldBegin(REPORT_TYPE_FIELD_DESC);
      oprot.writeI32(this.reportType.getValue());
      oprot.writeFieldEnd();
    }
    if (this.otherReason != null) {
      oprot.writeFieldBegin(OTHER_REASON_FIELD_DESC);
      oprot.writeString(this.otherReason);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("ReportSquareMessageRequest(");
    boolean first = true;

    sb.append("squareMid:");
    if (this.squareMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareChatMid:");
    if (this.squareChatMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareMessageId:");
    if (this.squareMessageId == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMessageId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("reportType:");
    if (this.reportType == null) {
      sb.append("null");
    } else {
      sb.append(this.reportType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("otherReason:");
    if (this.otherReason == null) {
      sb.append("null");
    } else {
      sb.append(this.otherReason);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

