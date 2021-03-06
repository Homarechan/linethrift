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

public class SquareChatAnnouncement implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("SquareChatAnnouncement");

  private static final TField ANNOUNCEMENT_SEQ_FIELD_DESC = new TField("announcementSeq", TType.I64, (short)1);
  private static final TField TYPE_FIELD_DESC = new TField("type", TType.I32, (short)2);
  private static final TField CONTENTS_FIELD_DESC = new TField("contents", TType.STRUCT, (short)3);

  private long announcementSeq;
  private SquareChatAnnouncementType type;
  private SquareChatAnnouncementContents contents;

  // isset id assignments
  private static final int __ANNOUNCEMENTSEQ_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public SquareChatAnnouncement() {
  }

  public SquareChatAnnouncement(
    long announcementSeq,
    SquareChatAnnouncementType type,
    SquareChatAnnouncementContents contents)
  {
    this();
    this.announcementSeq = announcementSeq;
    setAnnouncementSeqIsSet(true);
    this.type = type;
    this.contents = contents;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareChatAnnouncement(SquareChatAnnouncement other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.announcementSeq = other.announcementSeq;
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetContents()) {
      this.contents = new SquareChatAnnouncementContents(other.contents);
    }
  }

  public SquareChatAnnouncement deepCopy() {
    return new SquareChatAnnouncement(this);
  }

  public void clear() {
    setAnnouncementSeqIsSet(false);
    this.announcementSeq = 0;
    this.type = null;
    this.contents = null;
  }

  public long getAnnouncementSeq() {
    return this.announcementSeq;
  }

  public void setAnnouncementSeq(long announcementSeq) {
    this.announcementSeq = announcementSeq;
    setAnnouncementSeqIsSet(true);
  }

  public void unsetAnnouncementSeq() {
    __isset_vector[__ANNOUNCEMENTSEQ_ISSET_ID] = false;
  }

  /** Returns true if field announcementSeq is set (has been assigned a value) and false otherwise */
  public boolean isSetAnnouncementSeq() {
    return __isset_vector[__ANNOUNCEMENTSEQ_ISSET_ID];
  }

  public void setAnnouncementSeqIsSet(boolean value) {
    __isset_vector[__ANNOUNCEMENTSEQ_ISSET_ID] = value;
  }

  /**
   * 
   * @see SquareChatAnnouncementType
   */
  public SquareChatAnnouncementType getType() {
    return this.type;
  }

  /**
   * 
   * @see SquareChatAnnouncementType
   */
  public void setType(SquareChatAnnouncementType type) {
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

  public SquareChatAnnouncementContents getContents() {
    return this.contents;
  }

  public void setContents(SquareChatAnnouncementContents contents) {
    this.contents = contents;
  }

  public void unsetContents() {
    this.contents = null;
  }

  /** Returns true if field contents is set (has been assigned a value) and false otherwise */
  public boolean isSetContents() {
    return this.contents != null;
  }

  public void setContentsIsSet(boolean value) {
    if (!value) {
      this.contents = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareChatAnnouncement)
      return this.equals((SquareChatAnnouncement)that);
    return false;
  }

  public boolean equals(SquareChatAnnouncement that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_announcementSeq = true;
    boolean that_present_announcementSeq = true;
    if (this_present_announcementSeq || that_present_announcementSeq) {
      if (!(this_present_announcementSeq && that_present_announcementSeq))
        return false;
      if (this.announcementSeq != that.announcementSeq)
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_contents = true && this.isSetContents();
    boolean that_present_contents = true && that.isSetContents();
    if (this_present_contents || that_present_contents) {
      if (!(this_present_contents && that_present_contents))
        return false;
      if (!this.contents.equals(that.contents))
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

    SquareChatAnnouncement other = (SquareChatAnnouncement)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetAnnouncementSeq(), other.isSetAnnouncementSeq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnnouncementSeq()) {
      lastComparison = TBaseHelper.compareTo(this.announcementSeq, other.announcementSeq);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = TBaseHelper.compareTo(isSetContents(), other.isSetContents());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContents()) {
      lastComparison = this.contents.compareTo(other.contents);
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
        case 1: // ANNOUNCEMENT_SEQ
          if (field.type == TType.I64) {
            this.announcementSeq = iprot.readI64();
            setAnnouncementSeqIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // TYPE
          if (field.type == TType.I32) {
            this.type = SquareChatAnnouncementType.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // CONTENTS
          if (field.type == TType.STRUCT) {
            this.contents = new SquareChatAnnouncementContents();
            this.contents.read(iprot);
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
    oprot.writeFieldBegin(ANNOUNCEMENT_SEQ_FIELD_DESC);
    oprot.writeI64(this.announcementSeq);
    oprot.writeFieldEnd();
    if (this.type != null) {
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeI32(this.type.getValue());
      oprot.writeFieldEnd();
    }
    if (this.contents != null) {
      oprot.writeFieldBegin(CONTENTS_FIELD_DESC);
      this.contents.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("SquareChatAnnouncement(");
    boolean first = true;

    sb.append("announcementSeq:");
    sb.append(this.announcementSeq);
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("contents:");
    if (this.contents == null) {
      sb.append("null");
    } else {
      sb.append(this.contents);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

