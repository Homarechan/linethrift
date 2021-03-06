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

public class CreateSquareRequest implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("CreateSquareRequest");

  private static final TField REQ_SEQ_FIELD_DESC = new TField("reqSeq", TType.I32, (short)1);
  private static final TField SQUARE_FIELD_DESC = new TField("square", TType.STRUCT, (short)2);
  private static final TField CREATOR_FIELD_DESC = new TField("creator", TType.STRUCT, (short)3);

  private int reqSeq;
  private Square square;
  private SquareMember creator;

  // isset id assignments
  private static final int __REQSEQ_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public CreateSquareRequest() {
  }

  public CreateSquareRequest(
    int reqSeq,
    Square square,
    SquareMember creator)
  {
    this();
    this.reqSeq = reqSeq;
    setReqSeqIsSet(true);
    this.square = square;
    this.creator = creator;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CreateSquareRequest(CreateSquareRequest other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.reqSeq = other.reqSeq;
    if (other.isSetSquare()) {
      this.square = new Square(other.square);
    }
    if (other.isSetCreator()) {
      this.creator = new SquareMember(other.creator);
    }
  }

  public CreateSquareRequest deepCopy() {
    return new CreateSquareRequest(this);
  }

  public void clear() {
    setReqSeqIsSet(false);
    this.reqSeq = 0;
    this.square = null;
    this.creator = null;
  }

  public int getReqSeq() {
    return this.reqSeq;
  }

  public void setReqSeq(int reqSeq) {
    this.reqSeq = reqSeq;
    setReqSeqIsSet(true);
  }

  public void unsetReqSeq() {
    __isset_vector[__REQSEQ_ISSET_ID] = false;
  }

  /** Returns true if field reqSeq is set (has been assigned a value) and false otherwise */
  public boolean isSetReqSeq() {
    return __isset_vector[__REQSEQ_ISSET_ID];
  }

  public void setReqSeqIsSet(boolean value) {
    __isset_vector[__REQSEQ_ISSET_ID] = value;
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

  public SquareMember getCreator() {
    return this.creator;
  }

  public void setCreator(SquareMember creator) {
    this.creator = creator;
  }

  public void unsetCreator() {
    this.creator = null;
  }

  /** Returns true if field creator is set (has been assigned a value) and false otherwise */
  public boolean isSetCreator() {
    return this.creator != null;
  }

  public void setCreatorIsSet(boolean value) {
    if (!value) {
      this.creator = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CreateSquareRequest)
      return this.equals((CreateSquareRequest)that);
    return false;
  }

  public boolean equals(CreateSquareRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_reqSeq = true;
    boolean that_present_reqSeq = true;
    if (this_present_reqSeq || that_present_reqSeq) {
      if (!(this_present_reqSeq && that_present_reqSeq))
        return false;
      if (this.reqSeq != that.reqSeq)
        return false;
    }

    boolean this_present_square = true && this.isSetSquare();
    boolean that_present_square = true && that.isSetSquare();
    if (this_present_square || that_present_square) {
      if (!(this_present_square && that_present_square))
        return false;
      if (!this.square.equals(that.square))
        return false;
    }

    boolean this_present_creator = true && this.isSetCreator();
    boolean that_present_creator = true && that.isSetCreator();
    if (this_present_creator || that_present_creator) {
      if (!(this_present_creator && that_present_creator))
        return false;
      if (!this.creator.equals(that.creator))
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

    CreateSquareRequest other = (CreateSquareRequest)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetReqSeq(), other.isSetReqSeq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReqSeq()) {
      lastComparison = TBaseHelper.compareTo(this.reqSeq, other.reqSeq);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = TBaseHelper.compareTo(isSetCreator(), other.isSetCreator());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreator()) {
      lastComparison = this.creator.compareTo(other.creator);
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
        case 1: // REQ_SEQ
          if (field.type == TType.I32) {
            this.reqSeq = iprot.readI32();
            setReqSeqIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SQUARE
          if (field.type == TType.STRUCT) {
            this.square = new Square();
            this.square.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // CREATOR
          if (field.type == TType.STRUCT) {
            this.creator = new SquareMember();
            this.creator.read(iprot);
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
    oprot.writeFieldBegin(REQ_SEQ_FIELD_DESC);
    oprot.writeI32(this.reqSeq);
    oprot.writeFieldEnd();
    if (this.square != null) {
      oprot.writeFieldBegin(SQUARE_FIELD_DESC);
      this.square.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.creator != null) {
      oprot.writeFieldBegin(CREATOR_FIELD_DESC);
      this.creator.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("CreateSquareRequest(");
    boolean first = true;

    sb.append("reqSeq:");
    sb.append(this.reqSeq);
    first = false;
    if (!first) sb.append(", ");
    sb.append("square:");
    if (this.square == null) {
      sb.append("null");
    } else {
      sb.append(this.square);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("creator:");
    if (this.creator == null) {
      sb.append("null");
    } else {
      sb.append(this.creator);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

