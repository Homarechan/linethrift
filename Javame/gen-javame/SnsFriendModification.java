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

public class SnsFriendModification implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("SnsFriendModification");

  private static final TField TYPE_FIELD_DESC = new TField("type", TType.I32, (short)1);
  private static final TField SNS_FRIEND_FIELD_DESC = new TField("snsFriend", TType.STRUCT, (short)2);

  private ModificationType type;
  private SnsFriend snsFriend;

  // isset id assignments

  public SnsFriendModification() {
  }

  public SnsFriendModification(
    ModificationType type,
    SnsFriend snsFriend)
  {
    this();
    this.type = type;
    this.snsFriend = snsFriend;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SnsFriendModification(SnsFriendModification other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetSnsFriend()) {
      this.snsFriend = new SnsFriend(other.snsFriend);
    }
  }

  public SnsFriendModification deepCopy() {
    return new SnsFriendModification(this);
  }

  public void clear() {
    this.type = null;
    this.snsFriend = null;
  }

  /**
   * 
   * @see ModificationType
   */
  public ModificationType getType() {
    return this.type;
  }

  /**
   * 
   * @see ModificationType
   */
  public void setType(ModificationType type) {
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

  public SnsFriend getSnsFriend() {
    return this.snsFriend;
  }

  public void setSnsFriend(SnsFriend snsFriend) {
    this.snsFriend = snsFriend;
  }

  public void unsetSnsFriend() {
    this.snsFriend = null;
  }

  /** Returns true if field snsFriend is set (has been assigned a value) and false otherwise */
  public boolean isSetSnsFriend() {
    return this.snsFriend != null;
  }

  public void setSnsFriendIsSet(boolean value) {
    if (!value) {
      this.snsFriend = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SnsFriendModification)
      return this.equals((SnsFriendModification)that);
    return false;
  }

  public boolean equals(SnsFriendModification that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_snsFriend = true && this.isSetSnsFriend();
    boolean that_present_snsFriend = true && that.isSetSnsFriend();
    if (this_present_snsFriend || that_present_snsFriend) {
      if (!(this_present_snsFriend && that_present_snsFriend))
        return false;
      if (!this.snsFriend.equals(that.snsFriend))
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

    SnsFriendModification other = (SnsFriendModification)otherObject;    int lastComparison = 0;

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
    lastComparison = TBaseHelper.compareTo(isSetSnsFriend(), other.isSetSnsFriend());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSnsFriend()) {
      lastComparison = this.snsFriend.compareTo(other.snsFriend);
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
        case 1: // TYPE
          if (field.type == TType.I32) {
            this.type = ModificationType.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SNS_FRIEND
          if (field.type == TType.STRUCT) {
            this.snsFriend = new SnsFriend();
            this.snsFriend.read(iprot);
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
    if (this.type != null) {
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeI32(this.type.getValue());
      oprot.writeFieldEnd();
    }
    if (this.snsFriend != null) {
      oprot.writeFieldBegin(SNS_FRIEND_FIELD_DESC);
      this.snsFriend.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("SnsFriendModification(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("snsFriend:");
    if (this.snsFriend == null) {
      sb.append("null");
    } else {
      sb.append(this.snsFriend);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

