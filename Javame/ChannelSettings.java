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

public class ChannelSettings implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("ChannelSettings");

  private static final TField UNAPPROVED_MESSAGE_RECEIVABLE_FIELD_DESC = new TField("unapprovedMessageReceivable", TType.BOOL, (short)1);

  private boolean unapprovedMessageReceivable;

  // isset id assignments
  private static final int __UNAPPROVEDMESSAGERECEIVABLE_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public ChannelSettings() {
  }

  public ChannelSettings(
    boolean unapprovedMessageReceivable)
  {
    this();
    this.unapprovedMessageReceivable = unapprovedMessageReceivable;
    setUnapprovedMessageReceivableIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ChannelSettings(ChannelSettings other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.unapprovedMessageReceivable = other.unapprovedMessageReceivable;
  }

  public ChannelSettings deepCopy() {
    return new ChannelSettings(this);
  }

  public void clear() {
    setUnapprovedMessageReceivableIsSet(false);
    this.unapprovedMessageReceivable = false;
  }

  public boolean isUnapprovedMessageReceivable() {
    return this.unapprovedMessageReceivable;
  }

  public void setUnapprovedMessageReceivable(boolean unapprovedMessageReceivable) {
    this.unapprovedMessageReceivable = unapprovedMessageReceivable;
    setUnapprovedMessageReceivableIsSet(true);
  }

  public void unsetUnapprovedMessageReceivable() {
    __isset_vector[__UNAPPROVEDMESSAGERECEIVABLE_ISSET_ID] = false;
  }

  /** Returns true if field unapprovedMessageReceivable is set (has been assigned a value) and false otherwise */
  public boolean isSetUnapprovedMessageReceivable() {
    return __isset_vector[__UNAPPROVEDMESSAGERECEIVABLE_ISSET_ID];
  }

  public void setUnapprovedMessageReceivableIsSet(boolean value) {
    __isset_vector[__UNAPPROVEDMESSAGERECEIVABLE_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ChannelSettings)
      return this.equals((ChannelSettings)that);
    return false;
  }

  public boolean equals(ChannelSettings that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_unapprovedMessageReceivable = true;
    boolean that_present_unapprovedMessageReceivable = true;
    if (this_present_unapprovedMessageReceivable || that_present_unapprovedMessageReceivable) {
      if (!(this_present_unapprovedMessageReceivable && that_present_unapprovedMessageReceivable))
        return false;
      if (this.unapprovedMessageReceivable != that.unapprovedMessageReceivable)
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

    ChannelSettings other = (ChannelSettings)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetUnapprovedMessageReceivable(), other.isSetUnapprovedMessageReceivable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnapprovedMessageReceivable()) {
      lastComparison = TBaseHelper.compareTo(this.unapprovedMessageReceivable, other.unapprovedMessageReceivable);
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
        case 1: // UNAPPROVED_MESSAGE_RECEIVABLE
          if (field.type == TType.BOOL) {
            this.unapprovedMessageReceivable = iprot.readBool();
            setUnapprovedMessageReceivableIsSet(true);
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
    oprot.writeFieldBegin(UNAPPROVED_MESSAGE_RECEIVABLE_FIELD_DESC);
    oprot.writeBool(this.unapprovedMessageReceivable);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("ChannelSettings(");
    boolean first = true;

    sb.append("unapprovedMessageReceivable:");
    sb.append(this.unapprovedMessageReceivable);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

