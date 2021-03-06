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

public class GetJoinableSquareChatsResponse implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("GetJoinableSquareChatsResponse");

  private static final TField SQUARE_CHATS_FIELD_DESC = new TField("squareChats", TType.LIST, (short)1);
  private static final TField CONTINUATION_TOKEN_FIELD_DESC = new TField("continuationToken", TType.STRING, (short)2);
  private static final TField TOTAL_SQUARE_CHAT_COUNT_FIELD_DESC = new TField("totalSquareChatCount", TType.I32, (short)3);
  private static final TField SQUARE_CHAT_STATUSES_FIELD_DESC = new TField("squareChatStatuses", TType.MAP, (short)4);

  private Vector squareChats;
  private String continuationToken;
  private int totalSquareChatCount;
  private Hashtable squareChatStatuses;

  // isset id assignments
  private static final int __TOTALSQUARECHATCOUNT_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public GetJoinableSquareChatsResponse() {
  }

  public GetJoinableSquareChatsResponse(
    Vector squareChats,
    String continuationToken,
    int totalSquareChatCount,
    Hashtable squareChatStatuses)
  {
    this();
    this.squareChats = squareChats;
    this.continuationToken = continuationToken;
    this.totalSquareChatCount = totalSquareChatCount;
    setTotalSquareChatCountIsSet(true);
    this.squareChatStatuses = squareChatStatuses;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetJoinableSquareChatsResponse(GetJoinableSquareChatsResponse other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetSquareChats()) {
      Vector __this__squareChats = new Vector();
      for (Enumeration other_enum = other.squareChats.elements(); other_enum.hasMoreElements(); ) {
        SquareChat other_element = (SquareChat)other_enum.nextElement();
        __this__squareChats.addElement(new SquareChat(other_element));
      }
      this.squareChats = __this__squareChats;
    }
    if (other.isSetContinuationToken()) {
      this.continuationToken = other.continuationToken;
    }
    this.totalSquareChatCount = other.totalSquareChatCount;
    if (other.isSetSquareChatStatuses()) {
      Hashtable __this__squareChatStatuses = new Hashtable();
      for (Enumeration other_enum = other.squareChatStatuses.keys(); other_enum.hasMoreElements(); ) {

        String other_element_key = (String)other_enum.nextElement();
        SquareChatStatus other_element_value = (SquareChatStatus)other.squareChatStatuses.get(other_element_key);

        String __this__squareChatStatuses_copy_key = other_element_key;

        SquareChatStatus __this__squareChatStatuses_copy_value = new SquareChatStatus(other_element_value);

        __this__squareChatStatuses.put(__this__squareChatStatuses_copy_key, __this__squareChatStatuses_copy_value);
      }
      this.squareChatStatuses = __this__squareChatStatuses;
    }
  }

  public GetJoinableSquareChatsResponse deepCopy() {
    return new GetJoinableSquareChatsResponse(this);
  }

  public void clear() {
    this.squareChats = null;
    this.continuationToken = null;
    setTotalSquareChatCountIsSet(false);
    this.totalSquareChatCount = 0;
    this.squareChatStatuses = null;
  }

  public int getSquareChatsSize() {
    return (this.squareChats == null) ? 0 : this.squareChats.size();
  }

  public Enumeration getSquareChatsEnumeration() {
    return (this.squareChats == null) ? null : this.squareChats.elements();
  }

  public void addToSquareChats(SquareChat elem) {
    if (this.squareChats == null) {
      this.squareChats = new Vector();
    }
    this.squareChats.addElement(elem);
  }

  public Vector getSquareChats() {
    return this.squareChats;
  }

  public void setSquareChats(Vector squareChats) {
    this.squareChats = squareChats;
  }

  public void unsetSquareChats() {
    this.squareChats = null;
  }

  /** Returns true if field squareChats is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChats() {
    return this.squareChats != null;
  }

  public void setSquareChatsIsSet(boolean value) {
    if (!value) {
      this.squareChats = null;
    }
  }

  public String getContinuationToken() {
    return this.continuationToken;
  }

  public void setContinuationToken(String continuationToken) {
    this.continuationToken = continuationToken;
  }

  public void unsetContinuationToken() {
    this.continuationToken = null;
  }

  /** Returns true if field continuationToken is set (has been assigned a value) and false otherwise */
  public boolean isSetContinuationToken() {
    return this.continuationToken != null;
  }

  public void setContinuationTokenIsSet(boolean value) {
    if (!value) {
      this.continuationToken = null;
    }
  }

  public int getTotalSquareChatCount() {
    return this.totalSquareChatCount;
  }

  public void setTotalSquareChatCount(int totalSquareChatCount) {
    this.totalSquareChatCount = totalSquareChatCount;
    setTotalSquareChatCountIsSet(true);
  }

  public void unsetTotalSquareChatCount() {
    __isset_vector[__TOTALSQUARECHATCOUNT_ISSET_ID] = false;
  }

  /** Returns true if field totalSquareChatCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalSquareChatCount() {
    return __isset_vector[__TOTALSQUARECHATCOUNT_ISSET_ID];
  }

  public void setTotalSquareChatCountIsSet(boolean value) {
    __isset_vector[__TOTALSQUARECHATCOUNT_ISSET_ID] = value;
  }

  public int getSquareChatStatusesSize() {
    return (this.squareChatStatuses == null) ? 0 : this.squareChatStatuses.size();
  }

  public void putToSquareChatStatuses(String key, SquareChatStatus val) {
    if (this.squareChatStatuses == null) {
      this.squareChatStatuses = new Hashtable();
    }
    this.squareChatStatuses.put(key, val);
  }

  public Hashtable getSquareChatStatuses() {
    return this.squareChatStatuses;
  }

  public void setSquareChatStatuses(Hashtable squareChatStatuses) {
    this.squareChatStatuses = squareChatStatuses;
  }

  public void unsetSquareChatStatuses() {
    this.squareChatStatuses = null;
  }

  /** Returns true if field squareChatStatuses is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChatStatuses() {
    return this.squareChatStatuses != null;
  }

  public void setSquareChatStatusesIsSet(boolean value) {
    if (!value) {
      this.squareChatStatuses = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetJoinableSquareChatsResponse)
      return this.equals((GetJoinableSquareChatsResponse)that);
    return false;
  }

  public boolean equals(GetJoinableSquareChatsResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareChats = true && this.isSetSquareChats();
    boolean that_present_squareChats = true && that.isSetSquareChats();
    if (this_present_squareChats || that_present_squareChats) {
      if (!(this_present_squareChats && that_present_squareChats))
        return false;
      if (!this.squareChats.equals(that.squareChats))
        return false;
    }

    boolean this_present_continuationToken = true && this.isSetContinuationToken();
    boolean that_present_continuationToken = true && that.isSetContinuationToken();
    if (this_present_continuationToken || that_present_continuationToken) {
      if (!(this_present_continuationToken && that_present_continuationToken))
        return false;
      if (!this.continuationToken.equals(that.continuationToken))
        return false;
    }

    boolean this_present_totalSquareChatCount = true;
    boolean that_present_totalSquareChatCount = true;
    if (this_present_totalSquareChatCount || that_present_totalSquareChatCount) {
      if (!(this_present_totalSquareChatCount && that_present_totalSquareChatCount))
        return false;
      if (this.totalSquareChatCount != that.totalSquareChatCount)
        return false;
    }

    boolean this_present_squareChatStatuses = true && this.isSetSquareChatStatuses();
    boolean that_present_squareChatStatuses = true && that.isSetSquareChatStatuses();
    if (this_present_squareChatStatuses || that_present_squareChatStatuses) {
      if (!(this_present_squareChatStatuses && that_present_squareChatStatuses))
        return false;
      if (!this.squareChatStatuses.equals(that.squareChatStatuses))
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

    GetJoinableSquareChatsResponse other = (GetJoinableSquareChatsResponse)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetSquareChats(), other.isSetSquareChats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChats()) {
      lastComparison = TBaseHelper.compareTo(this.squareChats, other.squareChats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetContinuationToken(), other.isSetContinuationToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContinuationToken()) {
      lastComparison = TBaseHelper.compareTo(this.continuationToken, other.continuationToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetTotalSquareChatCount(), other.isSetTotalSquareChatCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalSquareChatCount()) {
      lastComparison = TBaseHelper.compareTo(this.totalSquareChatCount, other.totalSquareChatCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSquareChatStatuses(), other.isSetSquareChatStatuses());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatStatuses()) {
      lastComparison = TBaseHelper.compareTo(this.squareChatStatuses, other.squareChatStatuses);
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
        case 1: // SQUARE_CHATS
          if (field.type == TType.LIST) {
            {
              TList _list320 = iprot.readListBegin();
              this.squareChats = new Vector(_list320.size);
              for (int _i321 = 0; _i321 < _list320.size; ++_i321)
              {
                SquareChat _elem322;
                _elem322 = new SquareChat();
                _elem322.read(iprot);
                this.squareChats.addElement(_elem322);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // CONTINUATION_TOKEN
          if (field.type == TType.STRING) {
            this.continuationToken = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // TOTAL_SQUARE_CHAT_COUNT
          if (field.type == TType.I32) {
            this.totalSquareChatCount = iprot.readI32();
            setTotalSquareChatCountIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // SQUARE_CHAT_STATUSES
          if (field.type == TType.MAP) {
            {
              TMap _map323 = iprot.readMapBegin();
              this.squareChatStatuses = new Hashtable(2*_map323.size);
              for (int _i324 = 0; _i324 < _map323.size; ++_i324)
              {
                String _key325;
                SquareChatStatus _val326;
                _key325 = iprot.readString();
                _val326 = new SquareChatStatus();
                _val326.read(iprot);
                this.squareChatStatuses.put(_key325, _val326);
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
    if (this.squareChats != null) {
      oprot.writeFieldBegin(SQUARE_CHATS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.squareChats.size()));
        for (Enumeration _iter327_enum = this.squareChats.elements(); _iter327_enum.hasMoreElements(); )         {
          SquareChat _iter327 = (SquareChat)_iter327_enum.nextElement();
          _iter327.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.continuationToken != null) {
      oprot.writeFieldBegin(CONTINUATION_TOKEN_FIELD_DESC);
      oprot.writeString(this.continuationToken);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(TOTAL_SQUARE_CHAT_COUNT_FIELD_DESC);
    oprot.writeI32(this.totalSquareChatCount);
    oprot.writeFieldEnd();
    if (this.squareChatStatuses != null) {
      oprot.writeFieldBegin(SQUARE_CHAT_STATUSES_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRUCT, this.squareChatStatuses.size()));
        for (Enumeration _iter328_enum = this.squareChatStatuses.keys(); _iter328_enum.hasMoreElements(); )         {
          String _iter328 = (String)_iter328_enum.nextElement();
          oprot.writeString(_iter328);
          ((SquareChatStatus)this.squareChatStatuses.get(_iter328)).write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("GetJoinableSquareChatsResponse(");
    boolean first = true;

    sb.append("squareChats:");
    if (this.squareChats == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChats);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("continuationToken:");
    if (this.continuationToken == null) {
      sb.append("null");
    } else {
      sb.append(this.continuationToken);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("totalSquareChatCount:");
    sb.append(this.totalSquareChatCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareChatStatuses:");
    if (this.squareChatStatuses == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatStatuses);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

