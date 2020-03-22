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

public class NoteStatus implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("NoteStatus");

  private static final TField NOTE_COUNT_FIELD_DESC = new TField("noteCount", TType.I32, (short)1);
  private static final TField LATEST_CREATED_AT_FIELD_DESC = new TField("latestCreatedAt", TType.I64, (short)2);

  private int noteCount;
  private long latestCreatedAt;

  // isset id assignments
  private static final int __NOTECOUNT_ISSET_ID = 0;
  private static final int __LATESTCREATEDAT_ISSET_ID = 1;
  private boolean[] __isset_vector = new boolean[2];

  public NoteStatus() {
  }

  public NoteStatus(
    int noteCount,
    long latestCreatedAt)
  {
    this();
    this.noteCount = noteCount;
    setNoteCountIsSet(true);
    this.latestCreatedAt = latestCreatedAt;
    setLatestCreatedAtIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NoteStatus(NoteStatus other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.noteCount = other.noteCount;
    this.latestCreatedAt = other.latestCreatedAt;
  }

  public NoteStatus deepCopy() {
    return new NoteStatus(this);
  }

  public void clear() {
    setNoteCountIsSet(false);
    this.noteCount = 0;
    setLatestCreatedAtIsSet(false);
    this.latestCreatedAt = 0;
  }

  public int getNoteCount() {
    return this.noteCount;
  }

  public void setNoteCount(int noteCount) {
    this.noteCount = noteCount;
    setNoteCountIsSet(true);
  }

  public void unsetNoteCount() {
    __isset_vector[__NOTECOUNT_ISSET_ID] = false;
  }

  /** Returns true if field noteCount is set (has been assigned a value) and false otherwise */
  public boolean isSetNoteCount() {
    return __isset_vector[__NOTECOUNT_ISSET_ID];
  }

  public void setNoteCountIsSet(boolean value) {
    __isset_vector[__NOTECOUNT_ISSET_ID] = value;
  }

  public long getLatestCreatedAt() {
    return this.latestCreatedAt;
  }

  public void setLatestCreatedAt(long latestCreatedAt) {
    this.latestCreatedAt = latestCreatedAt;
    setLatestCreatedAtIsSet(true);
  }

  public void unsetLatestCreatedAt() {
    __isset_vector[__LATESTCREATEDAT_ISSET_ID] = false;
  }

  /** Returns true if field latestCreatedAt is set (has been assigned a value) and false otherwise */
  public boolean isSetLatestCreatedAt() {
    return __isset_vector[__LATESTCREATEDAT_ISSET_ID];
  }

  public void setLatestCreatedAtIsSet(boolean value) {
    __isset_vector[__LATESTCREATEDAT_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NoteStatus)
      return this.equals((NoteStatus)that);
    return false;
  }

  public boolean equals(NoteStatus that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_noteCount = true;
    boolean that_present_noteCount = true;
    if (this_present_noteCount || that_present_noteCount) {
      if (!(this_present_noteCount && that_present_noteCount))
        return false;
      if (this.noteCount != that.noteCount)
        return false;
    }

    boolean this_present_latestCreatedAt = true;
    boolean that_present_latestCreatedAt = true;
    if (this_present_latestCreatedAt || that_present_latestCreatedAt) {
      if (!(this_present_latestCreatedAt && that_present_latestCreatedAt))
        return false;
      if (this.latestCreatedAt != that.latestCreatedAt)
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

    NoteStatus other = (NoteStatus)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetNoteCount(), other.isSetNoteCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNoteCount()) {
      lastComparison = TBaseHelper.compareTo(this.noteCount, other.noteCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetLatestCreatedAt(), other.isSetLatestCreatedAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLatestCreatedAt()) {
      lastComparison = TBaseHelper.compareTo(this.latestCreatedAt, other.latestCreatedAt);
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
        case 1: // NOTE_COUNT
          if (field.type == TType.I32) {
            this.noteCount = iprot.readI32();
            setNoteCountIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // LATEST_CREATED_AT
          if (field.type == TType.I64) {
            this.latestCreatedAt = iprot.readI64();
            setLatestCreatedAtIsSet(true);
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
    oprot.writeFieldBegin(NOTE_COUNT_FIELD_DESC);
    oprot.writeI32(this.noteCount);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(LATEST_CREATED_AT_FIELD_DESC);
    oprot.writeI64(this.latestCreatedAt);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("NoteStatus(");
    boolean first = true;

    sb.append("noteCount:");
    sb.append(this.noteCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("latestCreatedAt:");
    sb.append(this.latestCreatedAt);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

