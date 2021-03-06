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

public class SquareEventNotifiedUpdateSquareFeatureSet implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("SquareEventNotifiedUpdateSquareFeatureSet");

  private static final TField SQUARE_FEATURE_SET_FIELD_DESC = new TField("squareFeatureSet", TType.STRUCT, (short)1);

  private SquareFeatureSet squareFeatureSet;

  // isset id assignments

  public SquareEventNotifiedUpdateSquareFeatureSet() {
  }

  public SquareEventNotifiedUpdateSquareFeatureSet(
    SquareFeatureSet squareFeatureSet)
  {
    this();
    this.squareFeatureSet = squareFeatureSet;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareEventNotifiedUpdateSquareFeatureSet(SquareEventNotifiedUpdateSquareFeatureSet other) {
    if (other.isSetSquareFeatureSet()) {
      this.squareFeatureSet = new SquareFeatureSet(other.squareFeatureSet);
    }
  }

  public SquareEventNotifiedUpdateSquareFeatureSet deepCopy() {
    return new SquareEventNotifiedUpdateSquareFeatureSet(this);
  }

  public void clear() {
    this.squareFeatureSet = null;
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

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareEventNotifiedUpdateSquareFeatureSet)
      return this.equals((SquareEventNotifiedUpdateSquareFeatureSet)that);
    return false;
  }

  public boolean equals(SquareEventNotifiedUpdateSquareFeatureSet that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareFeatureSet = true && this.isSetSquareFeatureSet();
    boolean that_present_squareFeatureSet = true && that.isSetSquareFeatureSet();
    if (this_present_squareFeatureSet || that_present_squareFeatureSet) {
      if (!(this_present_squareFeatureSet && that_present_squareFeatureSet))
        return false;
      if (!this.squareFeatureSet.equals(that.squareFeatureSet))
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

    SquareEventNotifiedUpdateSquareFeatureSet other = (SquareEventNotifiedUpdateSquareFeatureSet)otherObject;    int lastComparison = 0;

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
        case 1: // SQUARE_FEATURE_SET
          if (field.type == TType.STRUCT) {
            this.squareFeatureSet = new SquareFeatureSet();
            this.squareFeatureSet.read(iprot);
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
    if (this.squareFeatureSet != null) {
      oprot.writeFieldBegin(SQUARE_FEATURE_SET_FIELD_DESC);
      this.squareFeatureSet.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("SquareEventNotifiedUpdateSquareFeatureSet(");
    boolean first = true;

    sb.append("squareFeatureSet:");
    if (this.squareFeatureSet == null) {
      sb.append("null");
    } else {
      sb.append(this.squareFeatureSet);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

