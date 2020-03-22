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

public class PaidCallAdResult implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("PaidCallAdResult");

  private static final TField AD_REMAINS_FIELD_DESC = new TField("adRemains", TType.I32, (short)1);

  private int adRemains;

  // isset id assignments
  private static final int __ADREMAINS_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public PaidCallAdResult() {
  }

  public PaidCallAdResult(
    int adRemains)
  {
    this();
    this.adRemains = adRemains;
    setAdRemainsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PaidCallAdResult(PaidCallAdResult other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.adRemains = other.adRemains;
  }

  public PaidCallAdResult deepCopy() {
    return new PaidCallAdResult(this);
  }

  public void clear() {
    setAdRemainsIsSet(false);
    this.adRemains = 0;
  }

  public int getAdRemains() {
    return this.adRemains;
  }

  public void setAdRemains(int adRemains) {
    this.adRemains = adRemains;
    setAdRemainsIsSet(true);
  }

  public void unsetAdRemains() {
    __isset_vector[__ADREMAINS_ISSET_ID] = false;
  }

  /** Returns true if field adRemains is set (has been assigned a value) and false otherwise */
  public boolean isSetAdRemains() {
    return __isset_vector[__ADREMAINS_ISSET_ID];
  }

  public void setAdRemainsIsSet(boolean value) {
    __isset_vector[__ADREMAINS_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PaidCallAdResult)
      return this.equals((PaidCallAdResult)that);
    return false;
  }

  public boolean equals(PaidCallAdResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_adRemains = true;
    boolean that_present_adRemains = true;
    if (this_present_adRemains || that_present_adRemains) {
      if (!(this_present_adRemains && that_present_adRemains))
        return false;
      if (this.adRemains != that.adRemains)
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

    PaidCallAdResult other = (PaidCallAdResult)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetAdRemains(), other.isSetAdRemains());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdRemains()) {
      lastComparison = TBaseHelper.compareTo(this.adRemains, other.adRemains);
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
        case 1: // AD_REMAINS
          if (field.type == TType.I32) {
            this.adRemains = iprot.readI32();
            setAdRemainsIsSet(true);
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
    oprot.writeFieldBegin(AD_REMAINS_FIELD_DESC);
    oprot.writeI32(this.adRemains);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("PaidCallAdResult(");
    boolean first = true;

    sb.append("adRemains:");
    sb.append(this.adRemains);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

