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

public class SnsFriends implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("SnsFriends");

  private static final TField SNS_FRIENDS_FIELD_DESC = new TField("snsFriends", TType.LIST, (short)1);
  private static final TField HAS_MORE_FIELD_DESC = new TField("hasMore", TType.BOOL, (short)2);

  private Vector snsFriends;
  private boolean hasMore;

  // isset id assignments
  private static final int __HASMORE_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public SnsFriends() {
  }

  public SnsFriends(
    Vector snsFriends,
    boolean hasMore)
  {
    this();
    this.snsFriends = snsFriends;
    this.hasMore = hasMore;
    setHasMoreIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SnsFriends(SnsFriends other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetSnsFriends()) {
      Vector __this__snsFriends = new Vector();
      for (Enumeration other_enum = other.snsFriends.elements(); other_enum.hasMoreElements(); ) {
        SnsFriend other_element = (SnsFriend)other_enum.nextElement();
        __this__snsFriends.addElement(new SnsFriend(other_element));
      }
      this.snsFriends = __this__snsFriends;
    }
    this.hasMore = other.hasMore;
  }

  public SnsFriends deepCopy() {
    return new SnsFriends(this);
  }

  public void clear() {
    this.snsFriends = null;
    setHasMoreIsSet(false);
    this.hasMore = false;
  }

  public int getSnsFriendsSize() {
    return (this.snsFriends == null) ? 0 : this.snsFriends.size();
  }

  public Enumeration getSnsFriendsEnumeration() {
    return (this.snsFriends == null) ? null : this.snsFriends.elements();
  }

  public void addToSnsFriends(SnsFriend elem) {
    if (this.snsFriends == null) {
      this.snsFriends = new Vector();
    }
    this.snsFriends.addElement(elem);
  }

  public Vector getSnsFriends() {
    return this.snsFriends;
  }

  public void setSnsFriends(Vector snsFriends) {
    this.snsFriends = snsFriends;
  }

  public void unsetSnsFriends() {
    this.snsFriends = null;
  }

  /** Returns true if field snsFriends is set (has been assigned a value) and false otherwise */
  public boolean isSetSnsFriends() {
    return this.snsFriends != null;
  }

  public void setSnsFriendsIsSet(boolean value) {
    if (!value) {
      this.snsFriends = null;
    }
  }

  public boolean isHasMore() {
    return this.hasMore;
  }

  public void setHasMore(boolean hasMore) {
    this.hasMore = hasMore;
    setHasMoreIsSet(true);
  }

  public void unsetHasMore() {
    __isset_vector[__HASMORE_ISSET_ID] = false;
  }

  /** Returns true if field hasMore is set (has been assigned a value) and false otherwise */
  public boolean isSetHasMore() {
    return __isset_vector[__HASMORE_ISSET_ID];
  }

  public void setHasMoreIsSet(boolean value) {
    __isset_vector[__HASMORE_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SnsFriends)
      return this.equals((SnsFriends)that);
    return false;
  }

  public boolean equals(SnsFriends that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_snsFriends = true && this.isSetSnsFriends();
    boolean that_present_snsFriends = true && that.isSetSnsFriends();
    if (this_present_snsFriends || that_present_snsFriends) {
      if (!(this_present_snsFriends && that_present_snsFriends))
        return false;
      if (!this.snsFriends.equals(that.snsFriends))
        return false;
    }

    boolean this_present_hasMore = true;
    boolean that_present_hasMore = true;
    if (this_present_hasMore || that_present_hasMore) {
      if (!(this_present_hasMore && that_present_hasMore))
        return false;
      if (this.hasMore != that.hasMore)
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

    SnsFriends other = (SnsFriends)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetSnsFriends(), other.isSetSnsFriends());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSnsFriends()) {
      lastComparison = TBaseHelper.compareTo(this.snsFriends, other.snsFriends);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetHasMore(), other.isSetHasMore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasMore()) {
      lastComparison = TBaseHelper.compareTo(this.hasMore, other.hasMore);
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
        case 1: // SNS_FRIENDS
          if (field.type == TType.LIST) {
            {
              TList _list251 = iprot.readListBegin();
              this.snsFriends = new Vector(_list251.size);
              for (int _i252 = 0; _i252 < _list251.size; ++_i252)
              {
                SnsFriend _elem253;
                _elem253 = new SnsFriend();
                _elem253.read(iprot);
                this.snsFriends.addElement(_elem253);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // HAS_MORE
          if (field.type == TType.BOOL) {
            this.hasMore = iprot.readBool();
            setHasMoreIsSet(true);
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
    if (this.snsFriends != null) {
      oprot.writeFieldBegin(SNS_FRIENDS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.snsFriends.size()));
        for (Enumeration _iter254_enum = this.snsFriends.elements(); _iter254_enum.hasMoreElements(); )         {
          SnsFriend _iter254 = (SnsFriend)_iter254_enum.nextElement();
          _iter254.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(HAS_MORE_FIELD_DESC);
    oprot.writeBool(this.hasMore);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("SnsFriends(");
    boolean first = true;

    sb.append("snsFriends:");
    if (this.snsFriends == null) {
      sb.append("null");
    } else {
      sb.append(this.snsFriends);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hasMore:");
    sb.append(this.hasMore);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

