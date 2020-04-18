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

public class FriendChannelMatrix implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("FriendChannelMatrix");

  private static final TField CHANNEL_ID_FIELD_DESC = new TField("channelId", TType.STRING, (short)1);
  private static final TField REPRESENT_MID_FIELD_DESC = new TField("representMid", TType.STRING, (short)2);
  private static final TField COUNT_FIELD_DESC = new TField("count", TType.I32, (short)3);
  private static final TField POINT_FIELD_DESC = new TField("point", TType.I32, (short)4);

  private String channelId;
  private String representMid;
  private int count;
  private int point;

  // isset id assignments
  private static final int __COUNT_ISSET_ID = 0;
  private static final int __POINT_ISSET_ID = 1;
  private boolean[] __isset_vector = new boolean[2];

  public FriendChannelMatrix() {
  }

  public FriendChannelMatrix(
    String channelId,
    String representMid,
    int count,
    int point)
  {
    this();
    this.channelId = channelId;
    this.representMid = representMid;
    this.count = count;
    setCountIsSet(true);
    this.point = point;
    setPointIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FriendChannelMatrix(FriendChannelMatrix other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetChannelId()) {
      this.channelId = other.channelId;
    }
    if (other.isSetRepresentMid()) {
      this.representMid = other.representMid;
    }
    this.count = other.count;
    this.point = other.point;
  }

  public FriendChannelMatrix deepCopy() {
    return new FriendChannelMatrix(this);
  }

  public void clear() {
    this.channelId = null;
    this.representMid = null;
    setCountIsSet(false);
    this.count = 0;
    setPointIsSet(false);
    this.point = 0;
  }

  public String getChannelId() {
    return this.channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public void unsetChannelId() {
    this.channelId = null;
  }

  /** Returns true if field channelId is set (has been assigned a value) and false otherwise */
  public boolean isSetChannelId() {
    return this.channelId != null;
  }

  public void setChannelIdIsSet(boolean value) {
    if (!value) {
      this.channelId = null;
    }
  }

  public String getRepresentMid() {
    return this.representMid;
  }

  public void setRepresentMid(String representMid) {
    this.representMid = representMid;
  }

  public void unsetRepresentMid() {
    this.representMid = null;
  }

  /** Returns true if field representMid is set (has been assigned a value) and false otherwise */
  public boolean isSetRepresentMid() {
    return this.representMid != null;
  }

  public void setRepresentMidIsSet(boolean value) {
    if (!value) {
      this.representMid = null;
    }
  }

  public int getCount() {
    return this.count;
  }

  public void setCount(int count) {
    this.count = count;
    setCountIsSet(true);
  }

  public void unsetCount() {
    __isset_vector[__COUNT_ISSET_ID] = false;
  }

  /** Returns true if field count is set (has been assigned a value) and false otherwise */
  public boolean isSetCount() {
    return __isset_vector[__COUNT_ISSET_ID];
  }

  public void setCountIsSet(boolean value) {
    __isset_vector[__COUNT_ISSET_ID] = value;
  }

  public int getPoint() {
    return this.point;
  }

  public void setPoint(int point) {
    this.point = point;
    setPointIsSet(true);
  }

  public void unsetPoint() {
    __isset_vector[__POINT_ISSET_ID] = false;
  }

  /** Returns true if field point is set (has been assigned a value) and false otherwise */
  public boolean isSetPoint() {
    return __isset_vector[__POINT_ISSET_ID];
  }

  public void setPointIsSet(boolean value) {
    __isset_vector[__POINT_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FriendChannelMatrix)
      return this.equals((FriendChannelMatrix)that);
    return false;
  }

  public boolean equals(FriendChannelMatrix that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_channelId = true && this.isSetChannelId();
    boolean that_present_channelId = true && that.isSetChannelId();
    if (this_present_channelId || that_present_channelId) {
      if (!(this_present_channelId && that_present_channelId))
        return false;
      if (!this.channelId.equals(that.channelId))
        return false;
    }

    boolean this_present_representMid = true && this.isSetRepresentMid();
    boolean that_present_representMid = true && that.isSetRepresentMid();
    if (this_present_representMid || that_present_representMid) {
      if (!(this_present_representMid && that_present_representMid))
        return false;
      if (!this.representMid.equals(that.representMid))
        return false;
    }

    boolean this_present_count = true;
    boolean that_present_count = true;
    if (this_present_count || that_present_count) {
      if (!(this_present_count && that_present_count))
        return false;
      if (this.count != that.count)
        return false;
    }

    boolean this_present_point = true;
    boolean that_present_point = true;
    if (this_present_point || that_present_point) {
      if (!(this_present_point && that_present_point))
        return false;
      if (this.point != that.point)
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

    FriendChannelMatrix other = (FriendChannelMatrix)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetChannelId(), other.isSetChannelId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChannelId()) {
      lastComparison = TBaseHelper.compareTo(this.channelId, other.channelId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetRepresentMid(), other.isSetRepresentMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRepresentMid()) {
      lastComparison = TBaseHelper.compareTo(this.representMid, other.representMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetCount(), other.isSetCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCount()) {
      lastComparison = TBaseHelper.compareTo(this.count, other.count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetPoint(), other.isSetPoint());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPoint()) {
      lastComparison = TBaseHelper.compareTo(this.point, other.point);
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
        case 1: // CHANNEL_ID
          if (field.type == TType.STRING) {
            this.channelId = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // REPRESENT_MID
          if (field.type == TType.STRING) {
            this.representMid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // COUNT
          if (field.type == TType.I32) {
            this.count = iprot.readI32();
            setCountIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // POINT
          if (field.type == TType.I32) {
            this.point = iprot.readI32();
            setPointIsSet(true);
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
    if (this.channelId != null) {
      oprot.writeFieldBegin(CHANNEL_ID_FIELD_DESC);
      oprot.writeString(this.channelId);
      oprot.writeFieldEnd();
    }
    if (this.representMid != null) {
      oprot.writeFieldBegin(REPRESENT_MID_FIELD_DESC);
      oprot.writeString(this.representMid);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(COUNT_FIELD_DESC);
    oprot.writeI32(this.count);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(POINT_FIELD_DESC);
    oprot.writeI32(this.point);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("FriendChannelMatrix(");
    boolean first = true;

    sb.append("channelId:");
    if (this.channelId == null) {
      sb.append("null");
    } else {
      sb.append(this.channelId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("representMid:");
    if (this.representMid == null) {
      sb.append("null");
    } else {
      sb.append(this.representMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("count:");
    sb.append(this.count);
    first = false;
    if (!first) sb.append(", ");
    sb.append("point:");
    sb.append(this.point);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

