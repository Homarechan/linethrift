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

public class StickerIdRange implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("StickerIdRange");

  private static final TField START_FIELD_DESC = new TField("start", TType.I64, (short)1);
  private static final TField SIZE_FIELD_DESC = new TField("size", TType.I32, (short)2);

  private long start;
  private int size;

  // isset id assignments
  private static final int __START_ISSET_ID = 0;
  private static final int __SIZE_ISSET_ID = 1;
  private boolean[] __isset_vector = new boolean[2];

  public StickerIdRange() {
  }

  public StickerIdRange(
    long start,
    int size)
  {
    this();
    this.start = start;
    setStartIsSet(true);
    this.size = size;
    setSizeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StickerIdRange(StickerIdRange other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.start = other.start;
    this.size = other.size;
  }

  public StickerIdRange deepCopy() {
    return new StickerIdRange(this);
  }

  public void clear() {
    setStartIsSet(false);
    this.start = 0;
    setSizeIsSet(false);
    this.size = 0;
  }

  public long getStart() {
    return this.start;
  }

  public void setStart(long start) {
    this.start = start;
    setStartIsSet(true);
  }

  public void unsetStart() {
    __isset_vector[__START_ISSET_ID] = false;
  }

  /** Returns true if field start is set (has been assigned a value) and false otherwise */
  public boolean isSetStart() {
    return __isset_vector[__START_ISSET_ID];
  }

  public void setStartIsSet(boolean value) {
    __isset_vector[__START_ISSET_ID] = value;
  }

  public int getSize() {
    return this.size;
  }

  public void setSize(int size) {
    this.size = size;
    setSizeIsSet(true);
  }

  public void unsetSize() {
    __isset_vector[__SIZE_ISSET_ID] = false;
  }

  /** Returns true if field size is set (has been assigned a value) and false otherwise */
  public boolean isSetSize() {
    return __isset_vector[__SIZE_ISSET_ID];
  }

  public void setSizeIsSet(boolean value) {
    __isset_vector[__SIZE_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StickerIdRange)
      return this.equals((StickerIdRange)that);
    return false;
  }

  public boolean equals(StickerIdRange that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_start = true;
    boolean that_present_start = true;
    if (this_present_start || that_present_start) {
      if (!(this_present_start && that_present_start))
        return false;
      if (this.start != that.start)
        return false;
    }

    boolean this_present_size = true;
    boolean that_present_size = true;
    if (this_present_size || that_present_size) {
      if (!(this_present_size && that_present_size))
        return false;
      if (this.size != that.size)
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

    StickerIdRange other = (StickerIdRange)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetStart(), other.isSetStart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart()) {
      lastComparison = TBaseHelper.compareTo(this.start, other.start);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSize(), other.isSetSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSize()) {
      lastComparison = TBaseHelper.compareTo(this.size, other.size);
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
        case 1: // START
          if (field.type == TType.I64) {
            this.start = iprot.readI64();
            setStartIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SIZE
          if (field.type == TType.I32) {
            this.size = iprot.readI32();
            setSizeIsSet(true);
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
    oprot.writeFieldBegin(START_FIELD_DESC);
    oprot.writeI64(this.start);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(SIZE_FIELD_DESC);
    oprot.writeI32(this.size);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("StickerIdRange(");
    boolean first = true;

    sb.append("start:");
    sb.append(this.start);
    first = false;
    if (!first) sb.append(", ");
    sb.append("size:");
    sb.append(this.size);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

