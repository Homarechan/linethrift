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

public class JoinSquareResponse implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("JoinSquareResponse");

  private static final TField SQUARE_FIELD_DESC = new TField("square", TType.STRUCT, (short)1);
  private static final TField SQUARE_AUTHORITY_FIELD_DESC = new TField("squareAuthority", TType.STRUCT, (short)2);
  private static final TField SQUARE_STATUS_FIELD_DESC = new TField("squareStatus", TType.STRUCT, (short)3);
  private static final TField SQUARE_MEMBER_FIELD_DESC = new TField("squareMember", TType.STRUCT, (short)4);
  private static final TField SQUARE_FEATURE_SET_FIELD_DESC = new TField("squareFeatureSet", TType.STRUCT, (short)5);
  private static final TField NOTE_STATUS_FIELD_DESC = new TField("noteStatus", TType.STRUCT, (short)6);

  private Square square;
  private SquareAuthority squareAuthority;
  private SquareStatus squareStatus;
  private SquareMember squareMember;
  private SquareFeatureSet squareFeatureSet;
  private NoteStatus noteStatus;

  // isset id assignments

  public JoinSquareResponse() {
  }

  public JoinSquareResponse(
    Square square,
    SquareAuthority squareAuthority,
    SquareStatus squareStatus,
    SquareMember squareMember,
    SquareFeatureSet squareFeatureSet,
    NoteStatus noteStatus)
  {
    this();
    this.square = square;
    this.squareAuthority = squareAuthority;
    this.squareStatus = squareStatus;
    this.squareMember = squareMember;
    this.squareFeatureSet = squareFeatureSet;
    this.noteStatus = noteStatus;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JoinSquareResponse(JoinSquareResponse other) {
    if (other.isSetSquare()) {
      this.square = new Square(other.square);
    }
    if (other.isSetSquareAuthority()) {
      this.squareAuthority = new SquareAuthority(other.squareAuthority);
    }
    if (other.isSetSquareStatus()) {
      this.squareStatus = new SquareStatus(other.squareStatus);
    }
    if (other.isSetSquareMember()) {
      this.squareMember = new SquareMember(other.squareMember);
    }
    if (other.isSetSquareFeatureSet()) {
      this.squareFeatureSet = new SquareFeatureSet(other.squareFeatureSet);
    }
    if (other.isSetNoteStatus()) {
      this.noteStatus = new NoteStatus(other.noteStatus);
    }
  }

  public JoinSquareResponse deepCopy() {
    return new JoinSquareResponse(this);
  }

  public void clear() {
    this.square = null;
    this.squareAuthority = null;
    this.squareStatus = null;
    this.squareMember = null;
    this.squareFeatureSet = null;
    this.noteStatus = null;
  }

  public Square getSquare() {
    return this.square;
  }

  public void setSquare(Square square) {
    this.square = square;
  }

  public void unsetSquare() {
    this.square = null;
  }

  /** Returns true if field square is set (has been assigned a value) and false otherwise */
  public boolean isSetSquare() {
    return this.square != null;
  }

  public void setSquareIsSet(boolean value) {
    if (!value) {
      this.square = null;
    }
  }

  public SquareAuthority getSquareAuthority() {
    return this.squareAuthority;
  }

  public void setSquareAuthority(SquareAuthority squareAuthority) {
    this.squareAuthority = squareAuthority;
  }

  public void unsetSquareAuthority() {
    this.squareAuthority = null;
  }

  /** Returns true if field squareAuthority is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareAuthority() {
    return this.squareAuthority != null;
  }

  public void setSquareAuthorityIsSet(boolean value) {
    if (!value) {
      this.squareAuthority = null;
    }
  }

  public SquareStatus getSquareStatus() {
    return this.squareStatus;
  }

  public void setSquareStatus(SquareStatus squareStatus) {
    this.squareStatus = squareStatus;
  }

  public void unsetSquareStatus() {
    this.squareStatus = null;
  }

  /** Returns true if field squareStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareStatus() {
    return this.squareStatus != null;
  }

  public void setSquareStatusIsSet(boolean value) {
    if (!value) {
      this.squareStatus = null;
    }
  }

  public SquareMember getSquareMember() {
    return this.squareMember;
  }

  public void setSquareMember(SquareMember squareMember) {
    this.squareMember = squareMember;
  }

  public void unsetSquareMember() {
    this.squareMember = null;
  }

  /** Returns true if field squareMember is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareMember() {
    return this.squareMember != null;
  }

  public void setSquareMemberIsSet(boolean value) {
    if (!value) {
      this.squareMember = null;
    }
  }

  public SquareFeatureSet getSquareFeatureSet() {
    return this.squareFeatureSet;
  }

  public void setSquareFeatureSet(SquareFeatureSet squareFeatureSet) {
    this.squareFeatureSet = squareFeatureSet;
  }

  public void unsetSquareFeatureSet() {
    this.squareFeatureSet = null;
  }

  /** Returns true if field squareFeatureSet is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareFeatureSet() {
    return this.squareFeatureSet != null;
  }

  public void setSquareFeatureSetIsSet(boolean value) {
    if (!value) {
      this.squareFeatureSet = null;
    }
  }

  public NoteStatus getNoteStatus() {
    return this.noteStatus;
  }

  public void setNoteStatus(NoteStatus noteStatus) {
    this.noteStatus = noteStatus;
  }

  public void unsetNoteStatus() {
    this.noteStatus = null;
  }

  /** Returns true if field noteStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetNoteStatus() {
    return this.noteStatus != null;
  }

  public void setNoteStatusIsSet(boolean value) {
    if (!value) {
      this.noteStatus = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JoinSquareResponse)
      return this.equals((JoinSquareResponse)that);
    return false;
  }

  public boolean equals(JoinSquareResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_square = true && this.isSetSquare();
    boolean that_present_square = true && that.isSetSquare();
    if (this_present_square || that_present_square) {
      if (!(this_present_square && that_present_square))
        return false;
      if (!this.square.equals(that.square))
        return false;
    }

    boolean this_present_squareAuthority = true && this.isSetSquareAuthority();
    boolean that_present_squareAuthority = true && that.isSetSquareAuthority();
    if (this_present_squareAuthority || that_present_squareAuthority) {
      if (!(this_present_squareAuthority && that_present_squareAuthority))
        return false;
      if (!this.squareAuthority.equals(that.squareAuthority))
        return false;
    }

    boolean this_present_squareStatus = true && this.isSetSquareStatus();
    boolean that_present_squareStatus = true && that.isSetSquareStatus();
    if (this_present_squareStatus || that_present_squareStatus) {
      if (!(this_present_squareStatus && that_present_squareStatus))
        return false;
      if (!this.squareStatus.equals(that.squareStatus))
        return false;
    }

    boolean this_present_squareMember = true && this.isSetSquareMember();
    boolean that_present_squareMember = true && that.isSetSquareMember();
    if (this_present_squareMember || that_present_squareMember) {
      if (!(this_present_squareMember && that_present_squareMember))
        return false;
      if (!this.squareMember.equals(that.squareMember))
        return false;
    }

    boolean this_present_squareFeatureSet = true && this.isSetSquareFeatureSet();
    boolean that_present_squareFeatureSet = true && that.isSetSquareFeatureSet();
    if (this_present_squareFeatureSet || that_present_squareFeatureSet) {
      if (!(this_present_squareFeatureSet && that_present_squareFeatureSet))
        return false;
      if (!this.squareFeatureSet.equals(that.squareFeatureSet))
        return false;
    }

    boolean this_present_noteStatus = true && this.isSetNoteStatus();
    boolean that_present_noteStatus = true && that.isSetNoteStatus();
    if (this_present_noteStatus || that_present_noteStatus) {
      if (!(this_present_noteStatus && that_present_noteStatus))
        return false;
      if (!this.noteStatus.equals(that.noteStatus))
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

    JoinSquareResponse other = (JoinSquareResponse)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetSquare(), other.isSetSquare());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquare()) {
      lastComparison = this.square.compareTo(other.square);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSquareAuthority(), other.isSetSquareAuthority());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareAuthority()) {
      lastComparison = this.squareAuthority.compareTo(other.squareAuthority);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSquareStatus(), other.isSetSquareStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareStatus()) {
      lastComparison = this.squareStatus.compareTo(other.squareStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSquareMember(), other.isSetSquareMember());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareMember()) {
      lastComparison = this.squareMember.compareTo(other.squareMember);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSquareFeatureSet(), other.isSetSquareFeatureSet());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareFeatureSet()) {
      lastComparison = this.squareFeatureSet.compareTo(other.squareFeatureSet);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetNoteStatus(), other.isSetNoteStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNoteStatus()) {
      lastComparison = this.noteStatus.compareTo(other.noteStatus);
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
        case 1: // SQUARE
          if (field.type == TType.STRUCT) {
            this.square = new Square();
            this.square.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SQUARE_AUTHORITY
          if (field.type == TType.STRUCT) {
            this.squareAuthority = new SquareAuthority();
            this.squareAuthority.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // SQUARE_STATUS
          if (field.type == TType.STRUCT) {
            this.squareStatus = new SquareStatus();
            this.squareStatus.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // SQUARE_MEMBER
          if (field.type == TType.STRUCT) {
            this.squareMember = new SquareMember();
            this.squareMember.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // SQUARE_FEATURE_SET
          if (field.type == TType.STRUCT) {
            this.squareFeatureSet = new SquareFeatureSet();
            this.squareFeatureSet.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // NOTE_STATUS
          if (field.type == TType.STRUCT) {
            this.noteStatus = new NoteStatus();
            this.noteStatus.read(iprot);
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
    if (this.square != null) {
      oprot.writeFieldBegin(SQUARE_FIELD_DESC);
      this.square.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.squareAuthority != null) {
      oprot.writeFieldBegin(SQUARE_AUTHORITY_FIELD_DESC);
      this.squareAuthority.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.squareStatus != null) {
      oprot.writeFieldBegin(SQUARE_STATUS_FIELD_DESC);
      this.squareStatus.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.squareMember != null) {
      oprot.writeFieldBegin(SQUARE_MEMBER_FIELD_DESC);
      this.squareMember.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.squareFeatureSet != null) {
      oprot.writeFieldBegin(SQUARE_FEATURE_SET_FIELD_DESC);
      this.squareFeatureSet.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.noteStatus != null) {
      oprot.writeFieldBegin(NOTE_STATUS_FIELD_DESC);
      this.noteStatus.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("JoinSquareResponse(");
    boolean first = true;

    sb.append("square:");
    if (this.square == null) {
      sb.append("null");
    } else {
      sb.append(this.square);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareAuthority:");
    if (this.squareAuthority == null) {
      sb.append("null");
    } else {
      sb.append(this.squareAuthority);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareStatus:");
    if (this.squareStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.squareStatus);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareMember:");
    if (this.squareMember == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMember);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareFeatureSet:");
    if (this.squareFeatureSet == null) {
      sb.append("null");
    } else {
      sb.append(this.squareFeatureSet);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("noteStatus:");
    if (this.noteStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.noteStatus);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

