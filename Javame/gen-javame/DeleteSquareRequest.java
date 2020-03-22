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

public class DeleteSquareRequest implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("DeleteSquareRequest");

  private static final TField MID_FIELD_DESC = new TField("mid", TType.STRING, (short)2);
  private static final TField REVISION_FIELD_DESC = new TField("revision", TType.I64, (short)3);

  private String mid;
  private long revision;

  // isset id assignments
  private static final int __REVISION_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public DeleteSquareRequest() {
  }

  public DeleteSquareRequest(
    String mid,
    long revision)
  {
    this();
    this.mid = mid;
    this.revision = revision;
    setRevisionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DeleteSquareRequest(DeleteSquareRequest other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetMid()) {
      this.mid = other.mid;
    }
    this.revision = other.revision;
  }

  public DeleteSquareRequest deepCopy() {
    return new DeleteSquareRequest(this);
  }

  public void clear() {
    this.mid = null;
    setRevisionIsSet(false);
    this.revision = 0;
  }

  public String getMid() {
    return this.mid;
  }

  public void setMid(String mid) {
    this.mid = mid;
  }

  public void unsetMid() {
    this.mid = null;
  }

  /** Returns true if field mid is set (has been assigned a value) and false otherwise */
  public boolean isSetMid() {
    return this.mid != null;
  }

  public void setMidIsSet(boolean value) {
    if (!value) {
      this.mid = null;
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
    if (that instanceof DeleteSquareRequest)
      return this.equals((DeleteSquareRequest)that);
    return false;
  }

  public boolean equals(DeleteSquareRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_mid = true && this.isSetMid();
    boolean that_present_mid = true && that.isSetMid();
    if (this_present_mid || that_present_mid) {
      if (!(this_present_mid && that_present_mid))
        return false;
      if (!this.mid.equals(that.mid))
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

    DeleteSquareRequest other = (DeleteSquareRequest)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetMid(), other.isSetMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMid()) {
      lastComparison = TBaseHelper.compareTo(this.mid, other.mid);
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
        case 2: // MID
          if (field.type == TType.STRING) {
            this.mid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // REVISION
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
    if (this.mid != null) {
      oprot.writeFieldBegin(MID_FIELD_DESC);
      oprot.writeString(this.mid);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(REVISION_FIELD_DESC);
    oprot.writeI64(this.revision);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("DeleteSquareRequest(");
    boolean first = true;

    sb.append("mid:");
    if (this.mid == null) {
      sb.append("null");
    } else {
      sb.append(this.mid);
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

