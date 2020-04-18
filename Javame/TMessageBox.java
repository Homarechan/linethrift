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

public class TMessageBox implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("TMessageBox");

  private static final TField ID_FIELD_DESC = new TField("id", TType.STRING, (short)1);
  private static final TField CHANNEL_ID_FIELD_DESC = new TField("channelId", TType.STRING, (short)2);
  private static final TField LAST_SEQ_FIELD_DESC = new TField("lastSeq", TType.I64, (short)5);
  private static final TField UNREAD_COUNT_FIELD_DESC = new TField("unreadCount", TType.I64, (short)6);
  private static final TField LAST_MODIFIED_TIME_FIELD_DESC = new TField("lastModifiedTime", TType.I64, (short)7);
  private static final TField STATUS_FIELD_DESC = new TField("status", TType.I32, (short)8);
  private static final TField MID_TYPE_FIELD_DESC = new TField("midType", TType.I32, (short)9);
  private static final TField LAST_MESSAGES_FIELD_DESC = new TField("lastMessages", TType.LIST, (short)10);

  private String id;
  private String channelId;
  private long lastSeq;
  private long unreadCount;
  private long lastModifiedTime;
  private int status;
  private MIDType midType;
  private Vector lastMessages;

  // isset id assignments
  private static final int __LASTSEQ_ISSET_ID = 0;
  private static final int __UNREADCOUNT_ISSET_ID = 1;
  private static final int __LASTMODIFIEDTIME_ISSET_ID = 2;
  private static final int __STATUS_ISSET_ID = 3;
  private boolean[] __isset_vector = new boolean[4];

  public TMessageBox() {
  }

  public TMessageBox(
    String id,
    String channelId,
    long lastSeq,
    long unreadCount,
    long lastModifiedTime,
    int status,
    MIDType midType,
    Vector lastMessages)
  {
    this();
    this.id = id;
    this.channelId = channelId;
    this.lastSeq = lastSeq;
    setLastSeqIsSet(true);
    this.unreadCount = unreadCount;
    setUnreadCountIsSet(true);
    this.lastModifiedTime = lastModifiedTime;
    setLastModifiedTimeIsSet(true);
    this.status = status;
    setStatusIsSet(true);
    this.midType = midType;
    this.lastMessages = lastMessages;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMessageBox(TMessageBox other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetChannelId()) {
      this.channelId = other.channelId;
    }
    this.lastSeq = other.lastSeq;
    this.unreadCount = other.unreadCount;
    this.lastModifiedTime = other.lastModifiedTime;
    this.status = other.status;
    if (other.isSetMidType()) {
      this.midType = other.midType;
    }
    if (other.isSetLastMessages()) {
      Vector __this__lastMessages = new Vector();
      for (Enumeration other_enum = other.lastMessages.elements(); other_enum.hasMoreElements(); ) {
        Message other_element = (Message)other_enum.nextElement();
        __this__lastMessages.addElement(new Message(other_element));
      }
      this.lastMessages = __this__lastMessages;
    }
  }

  public TMessageBox deepCopy() {
    return new TMessageBox(this);
  }

  public void clear() {
    this.id = null;
    this.channelId = null;
    setLastSeqIsSet(false);
    this.lastSeq = 0;
    setUnreadCountIsSet(false);
    this.unreadCount = 0;
    setLastModifiedTimeIsSet(false);
    this.lastModifiedTime = 0;
    setStatusIsSet(false);
    this.status = 0;
    this.midType = null;
    this.lastMessages = null;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
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

  public long getLastSeq() {
    return this.lastSeq;
  }

  public void setLastSeq(long lastSeq) {
    this.lastSeq = lastSeq;
    setLastSeqIsSet(true);
  }

  public void unsetLastSeq() {
    __isset_vector[__LASTSEQ_ISSET_ID] = false;
  }

  /** Returns true if field lastSeq is set (has been assigned a value) and false otherwise */
  public boolean isSetLastSeq() {
    return __isset_vector[__LASTSEQ_ISSET_ID];
  }

  public void setLastSeqIsSet(boolean value) {
    __isset_vector[__LASTSEQ_ISSET_ID] = value;
  }

  public long getUnreadCount() {
    return this.unreadCount;
  }

  public void setUnreadCount(long unreadCount) {
    this.unreadCount = unreadCount;
    setUnreadCountIsSet(true);
  }

  public void unsetUnreadCount() {
    __isset_vector[__UNREADCOUNT_ISSET_ID] = false;
  }

  /** Returns true if field unreadCount is set (has been assigned a value) and false otherwise */
  public boolean isSetUnreadCount() {
    return __isset_vector[__UNREADCOUNT_ISSET_ID];
  }

  public void setUnreadCountIsSet(boolean value) {
    __isset_vector[__UNREADCOUNT_ISSET_ID] = value;
  }

  public long getLastModifiedTime() {
    return this.lastModifiedTime;
  }

  public void setLastModifiedTime(long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    setLastModifiedTimeIsSet(true);
  }

  public void unsetLastModifiedTime() {
    __isset_vector[__LASTMODIFIEDTIME_ISSET_ID] = false;
  }

  /** Returns true if field lastModifiedTime is set (has been assigned a value) and false otherwise */
  public boolean isSetLastModifiedTime() {
    return __isset_vector[__LASTMODIFIEDTIME_ISSET_ID];
  }

  public void setLastModifiedTimeIsSet(boolean value) {
    __isset_vector[__LASTMODIFIEDTIME_ISSET_ID] = value;
  }

  public int getStatus() {
    return this.status;
  }

  public void setStatus(int status) {
    this.status = status;
    setStatusIsSet(true);
  }

  public void unsetStatus() {
    __isset_vector[__STATUS_ISSET_ID] = false;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return __isset_vector[__STATUS_ISSET_ID];
  }

  public void setStatusIsSet(boolean value) {
    __isset_vector[__STATUS_ISSET_ID] = value;
  }

  /**
   * 
   * @see MIDType
   */
  public MIDType getMidType() {
    return this.midType;
  }

  /**
   * 
   * @see MIDType
   */
  public void setMidType(MIDType midType) {
    this.midType = midType;
  }

  public void unsetMidType() {
    this.midType = null;
  }

  /** Returns true if field midType is set (has been assigned a value) and false otherwise */
  public boolean isSetMidType() {
    return this.midType != null;
  }

  public void setMidTypeIsSet(boolean value) {
    if (!value) {
      this.midType = null;
    }
  }

  public int getLastMessagesSize() {
    return (this.lastMessages == null) ? 0 : this.lastMessages.size();
  }

  public Enumeration getLastMessagesEnumeration() {
    return (this.lastMessages == null) ? null : this.lastMessages.elements();
  }

  public void addToLastMessages(Message elem) {
    if (this.lastMessages == null) {
      this.lastMessages = new Vector();
    }
    this.lastMessages.addElement(elem);
  }

  public Vector getLastMessages() {
    return this.lastMessages;
  }

  public void setLastMessages(Vector lastMessages) {
    this.lastMessages = lastMessages;
  }

  public void unsetLastMessages() {
    this.lastMessages = null;
  }

  /** Returns true if field lastMessages is set (has been assigned a value) and false otherwise */
  public boolean isSetLastMessages() {
    return this.lastMessages != null;
  }

  public void setLastMessagesIsSet(boolean value) {
    if (!value) {
      this.lastMessages = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TMessageBox)
      return this.equals((TMessageBox)that);
    return false;
  }

  public boolean equals(TMessageBox that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_channelId = true && this.isSetChannelId();
    boolean that_present_channelId = true && that.isSetChannelId();
    if (this_present_channelId || that_present_channelId) {
      if (!(this_present_channelId && that_present_channelId))
        return false;
      if (!this.channelId.equals(that.channelId))
        return false;
    }

    boolean this_present_lastSeq = true;
    boolean that_present_lastSeq = true;
    if (this_present_lastSeq || that_present_lastSeq) {
      if (!(this_present_lastSeq && that_present_lastSeq))
        return false;
      if (this.lastSeq != that.lastSeq)
        return false;
    }

    boolean this_present_unreadCount = true;
    boolean that_present_unreadCount = true;
    if (this_present_unreadCount || that_present_unreadCount) {
      if (!(this_present_unreadCount && that_present_unreadCount))
        return false;
      if (this.unreadCount != that.unreadCount)
        return false;
    }

    boolean this_present_lastModifiedTime = true;
    boolean that_present_lastModifiedTime = true;
    if (this_present_lastModifiedTime || that_present_lastModifiedTime) {
      if (!(this_present_lastModifiedTime && that_present_lastModifiedTime))
        return false;
      if (this.lastModifiedTime != that.lastModifiedTime)
        return false;
    }

    boolean this_present_status = true;
    boolean that_present_status = true;
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (this.status != that.status)
        return false;
    }

    boolean this_present_midType = true && this.isSetMidType();
    boolean that_present_midType = true && that.isSetMidType();
    if (this_present_midType || that_present_midType) {
      if (!(this_present_midType && that_present_midType))
        return false;
      if (!this.midType.equals(that.midType))
        return false;
    }

    boolean this_present_lastMessages = true && this.isSetLastMessages();
    boolean that_present_lastMessages = true && that.isSetLastMessages();
    if (this_present_lastMessages || that_present_lastMessages) {
      if (!(this_present_lastMessages && that_present_lastMessages))
        return false;
      if (!this.lastMessages.equals(that.lastMessages))
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

    TMessageBox other = (TMessageBox)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetId(), other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = TBaseHelper.compareTo(isSetLastSeq(), other.isSetLastSeq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastSeq()) {
      lastComparison = TBaseHelper.compareTo(this.lastSeq, other.lastSeq);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetUnreadCount(), other.isSetUnreadCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnreadCount()) {
      lastComparison = TBaseHelper.compareTo(this.unreadCount, other.unreadCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetLastModifiedTime(), other.isSetLastModifiedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastModifiedTime()) {
      lastComparison = TBaseHelper.compareTo(this.lastModifiedTime, other.lastModifiedTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetStatus(), other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetMidType(), other.isSetMidType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMidType()) {
      lastComparison = TBaseHelper.compareTo(this.midType, other.midType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetLastMessages(), other.isSetLastMessages());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastMessages()) {
      lastComparison = TBaseHelper.compareTo(this.lastMessages, other.lastMessages);
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
        case 1: // ID
          if (field.type == TType.STRING) {
            this.id = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // CHANNEL_ID
          if (field.type == TType.STRING) {
            this.channelId = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // LAST_SEQ
          if (field.type == TType.I64) {
            this.lastSeq = iprot.readI64();
            setLastSeqIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // UNREAD_COUNT
          if (field.type == TType.I64) {
            this.unreadCount = iprot.readI64();
            setUnreadCountIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // LAST_MODIFIED_TIME
          if (field.type == TType.I64) {
            this.lastModifiedTime = iprot.readI64();
            setLastModifiedTimeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // STATUS
          if (field.type == TType.I32) {
            this.status = iprot.readI32();
            setStatusIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9: // MID_TYPE
          if (field.type == TType.I32) {
            this.midType = MIDType.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 10: // LAST_MESSAGES
          if (field.type == TType.LIST) {
            {
              TList _list255 = iprot.readListBegin();
              this.lastMessages = new Vector(_list255.size);
              for (int _i256 = 0; _i256 < _list255.size; ++_i256)
              {
                Message _elem257;
                _elem257 = new Message();
                _elem257.read(iprot);
                this.lastMessages.addElement(_elem257);
              }
              iprot.readListEnd();
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
    if (this.id != null) {
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeString(this.id);
      oprot.writeFieldEnd();
    }
    if (this.channelId != null) {
      oprot.writeFieldBegin(CHANNEL_ID_FIELD_DESC);
      oprot.writeString(this.channelId);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(LAST_SEQ_FIELD_DESC);
    oprot.writeI64(this.lastSeq);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(UNREAD_COUNT_FIELD_DESC);
    oprot.writeI64(this.unreadCount);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(LAST_MODIFIED_TIME_FIELD_DESC);
    oprot.writeI64(this.lastModifiedTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(STATUS_FIELD_DESC);
    oprot.writeI32(this.status);
    oprot.writeFieldEnd();
    if (this.midType != null) {
      oprot.writeFieldBegin(MID_TYPE_FIELD_DESC);
      oprot.writeI32(this.midType.getValue());
      oprot.writeFieldEnd();
    }
    if (this.lastMessages != null) {
      oprot.writeFieldBegin(LAST_MESSAGES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.lastMessages.size()));
        for (Enumeration _iter258_enum = this.lastMessages.elements(); _iter258_enum.hasMoreElements(); )         {
          Message _iter258 = (Message)_iter258_enum.nextElement();
          _iter258.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("TMessageBox(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("channelId:");
    if (this.channelId == null) {
      sb.append("null");
    } else {
      sb.append(this.channelId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastSeq:");
    sb.append(this.lastSeq);
    first = false;
    if (!first) sb.append(", ");
    sb.append("unreadCount:");
    sb.append(this.unreadCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastModifiedTime:");
    sb.append(this.lastModifiedTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    sb.append(this.status);
    first = false;
    if (!first) sb.append(", ");
    sb.append("midType:");
    if (this.midType == null) {
      sb.append("null");
    } else {
      sb.append(this.midType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastMessages:");
    if (this.lastMessages == null) {
      sb.append("null");
    } else {
      sb.append(this.lastMessages);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

