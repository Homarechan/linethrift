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

public class SquareMemberRelation implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("SquareMemberRelation");

  private static final TField STATE_FIELD_DESC = new TField("state", TType.I32, (short)1);
  private static final TField REVISION_FIELD_DESC = new TField("revision", TType.I64, (short)2);

  private SquareMemberRelationState state;
  private long revision;

  // isset id assignments
  private static final int __REVISION_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public SquareMemberRelation() {
  }

  public SquareMemberRelation(
    SquareMemberRelationState state,
    long revision)
  {
    this();
    this.state = state;
    this.revision = revision;
    setRevisionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareMemberRelation(SquareMemberRelation other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetState()) {
      this.state = other.state;
    }
    this.revision = other.revision;
  }

  public SquareMemberRelation deepCopy() {
    return new SquareMemberRelation(this);
  }

  public void clear() {
    this.state = null;
    setRevisionIsSet(false);
    this.revision = 0;
  }

  /**
   * 
   * @see SquareMemberRelationState
   */
  public SquareMemberRelationState getState() {
    return this.state;
  }

  /**
   * 
   * @see SquareMemberRelationState
   */
  public void setState(SquareMemberRelationState state) {
    this.state = state;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  public long getRevision() {
    return this.revision;
  }

  public void setRevision(long revision) {
    this.revision = revision;
    setRevisionIsSet(true);
  }

  public void unsetRevision() {
    __isset_vector[__REVISION_ISSET_ID] = false;
  }

  /** Returns true if field revision is set (has been assigned a value) and false otherwise */
  public boolean isSetRevision() {
    return __isset_vector[__REVISION_ISSET_ID];
  }

  public void setRevisionIsSet(boolean value) {
    __isset_vector[__REVISION_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareMemberRelation)
      return this.equals((SquareMemberRelation)that);
    return false;
  }

  public boolean equals(SquareMemberRelation that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_revision = true;
    boolean that_present_revision = true;
    if (this_present_revision || that_present_revision) {
      if (!(this_present_revision && that_present_revision))
        return false;
      if (this.revision != that.revision)
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

    SquareMemberRelation other = (SquareMemberRelation)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetState(), other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetRevision(), other.isSetRevision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRevision()) {
      lastComparison = TBaseHelper.compareTo(this.revision, other.revision);
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
        case 1: // STATE
          if (field.type == TType.I32) {
            this.state = SquareMemberRelationState.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // REVISION
          if (field.type == TType.I64) {
            this.revision = iprot.readI64();
            setRevisionIsSet(true);
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
    if (this.state != null) {
      oprot.writeFieldBegin(STATE_FIELD_DESC);
      oprot.writeI32(this.state.getValue());
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(REVISION_FIELD_DESC);
    oprot.writeI64(this.revision);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("SquareMemberRelation(");
    boolean first = true;

    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("revision:");
    sb.append(this.revision);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

