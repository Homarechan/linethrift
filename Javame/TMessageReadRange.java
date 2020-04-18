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

public class TMessageReadRange implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("TMessageReadRange");

  private static final TField CHAT_ID_FIELD_DESC = new TField("chatId", TType.STRING, (short)1);
  private static final TField RANGES_FIELD_DESC = new TField("ranges", TType.MAP, (short)2);

  private String chatId;
  private Hashtable ranges;

  // isset id assignments

  public TMessageReadRange() {
  }

  public TMessageReadRange(
    String chatId,
    Hashtable ranges)
  {
    this();
    this.chatId = chatId;
    this.ranges = ranges;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMessageReadRange(TMessageReadRange other) {
    if (other.isSetChatId()) {
      this.chatId = other.chatId;
    }
    if (other.isSetRanges()) {
      Hashtable __this__ranges = new Hashtable();
      for (Enumeration other_enum = other.ranges.keys(); other_enum.hasMoreElements(); ) {

        String other_element_key = (String)other_enum.nextElement();
        Vector other_element_value = (Vector)other.ranges.get(other_element_key);

        String __this__ranges_copy_key = other_element_key;

        Vector __this__ranges_copy_value = new Vector();
        for (Enumeration other_element_value_enum = other_element_value.elements(); other_element_value_enum.hasMoreElements(); ) {
          TMessageReadRangeEntry other_element_value_element = (TMessageReadRangeEntry)other_element_value_enum.nextElement();
          __this__ranges_copy_value.addElement(new TMessageReadRangeEntry(other_element_value_element));
        }

        __this__ranges.put(__this__ranges_copy_key, __this__ranges_copy_value);
      }
      this.ranges = __this__ranges;
    }
  }

  public TMessageReadRange deepCopy() {
    return new TMessageReadRange(this);
  }

  public void clear() {
    this.chatId = null;
    this.ranges = null;
  }

  public String getChatId() {
    return this.chatId;
  }

  public void setChatId(String chatId) {
    this.chatId = chatId;
  }

  public void unsetChatId() {
    this.chatId = null;
  }

  /** Returns true if field chatId is set (has been assigned a value) and false otherwise */
  public boolean isSetChatId() {
    return this.chatId != null;
  }

  public void setChatIdIsSet(boolean value) {
    if (!value) {
      this.chatId = null;
    }
  }

  public int getRangesSize() {
    return (this.ranges == null) ? 0 : this.ranges.size();
  }

  public void putToRanges(String key, Vector val) {
    if (this.ranges == null) {
      this.ranges = new Hashtable();
    }
    this.ranges.put(key, val);
  }

  public Hashtable getRanges() {
    return this.ranges;
  }

  public void setRanges(Hashtable ranges) {
    this.ranges = ranges;
  }

  public void unsetRanges() {
    this.ranges = null;
  }

  /** Returns true if field ranges is set (has been assigned a value) and false otherwise */
  public boolean isSetRanges() {
    return this.ranges != null;
  }

  public void setRangesIsSet(boolean value) {
    if (!value) {
      this.ranges = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TMessageReadRange)
      return this.equals((TMessageReadRange)that);
    return false;
  }

  public boolean equals(TMessageReadRange that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_chatId = true && this.isSetChatId();
    boolean that_present_chatId = true && that.isSetChatId();
    if (this_present_chatId || that_present_chatId) {
      if (!(this_present_chatId && that_present_chatId))
        return false;
      if (!this.chatId.equals(that.chatId))
        return false;
    }

    boolean this_present_ranges = true && this.isSetRanges();
    boolean that_present_ranges = true && that.isSetRanges();
    if (this_present_ranges || that_present_ranges) {
      if (!(this_present_ranges && that_present_ranges))
        return false;
      if (!this.ranges.equals(that.ranges))
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

    TMessageReadRange other = (TMessageReadRange)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetChatId(), other.isSetChatId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChatId()) {
      lastComparison = TBaseHelper.compareTo(this.chatId, other.chatId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetRanges(), other.isSetRanges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRanges()) {
      lastComparison = TBaseHelper.compareTo(this.ranges, other.ranges);
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
        case 1: // CHAT_ID
          if (field.type == TType.STRING) {
            this.chatId = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // RANGES
          if (field.type == TType.MAP) {
            {
              TMap _map267 = iprot.readMapBegin();
              this.ranges = new Hashtable(2*_map267.size);
              for (int _i268 = 0; _i268 < _map267.size; ++_i268)
              {
                String _key269;
                Vector _val270;
                _key269 = iprot.readString();
                {
                  TList _list271 = iprot.readListBegin();
                  _val270 = new Vector(_list271.size);
                  for (int _i272 = 0; _i272 < _list271.size; ++_i272)
                  {
                    TMessageReadRangeEntry _elem273;
                    _elem273 = new TMessageReadRangeEntry();
                    _elem273.read(iprot);
                    _val270.addElement(_elem273);
                  }
                  iprot.readListEnd();
                }
                this.ranges.put(_key269, _val270);
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
    if (this.chatId != null) {
      oprot.writeFieldBegin(CHAT_ID_FIELD_DESC);
      oprot.writeString(this.chatId);
      oprot.writeFieldEnd();
    }
    if (this.ranges != null) {
      oprot.writeFieldBegin(RANGES_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.LIST, this.ranges.size()));
        for (Enumeration _iter274_enum = this.ranges.keys(); _iter274_enum.hasMoreElements(); )         {
          String _iter274 = (String)_iter274_enum.nextElement();
          oprot.writeString(_iter274);
          {
            oprot.writeListBegin(new TList(TType.STRUCT, ((Vector)this.ranges.get(_iter274)).size()));
            for (Enumeration _iter275_enum = ((Vector)this.ranges.get(_iter274)).elements(); _iter275_enum.hasMoreElements(); )             {
              TMessageReadRangeEntry _iter275 = (TMessageReadRangeEntry)_iter275_enum.nextElement();
              _iter275.write(oprot);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("TMessageReadRange(");
    boolean first = true;

    sb.append("chatId:");
    if (this.chatId == null) {
      sb.append("null");
    } else {
      sb.append(this.chatId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ranges:");
    if (this.ranges == null) {
      sb.append("null");
    } else {
      sb.append(this.ranges);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

