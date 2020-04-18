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

public class UpdateSquareMemberRequest implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("UpdateSquareMemberRequest");

  private static final TField UPDATED_ATTRS_FIELD_DESC = new TField("updatedAttrs", TType.SET, (short)2);
  private static final TField UPDATED_PREFERENCE_ATTRS_FIELD_DESC = new TField("updatedPreferenceAttrs", TType.SET, (short)3);
  private static final TField SQUARE_MEMBER_FIELD_DESC = new TField("squareMember", TType.STRUCT, (short)4);

  private Hashtable updatedAttrs;
  private Hashtable updatedPreferenceAttrs;
  private SquareMember squareMember;

  // isset id assignments

  public UpdateSquareMemberRequest() {
  }

  public UpdateSquareMemberRequest(
    Hashtable updatedAttrs,
    Hashtable updatedPreferenceAttrs,
    SquareMember squareMember)
  {
    this();
    this.updatedAttrs = updatedAttrs;
    this.updatedPreferenceAttrs = updatedPreferenceAttrs;
    this.squareMember = squareMember;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UpdateSquareMemberRequest(UpdateSquareMemberRequest other) {
    if (other.isSetUpdatedAttrs()) {
      Hashtable __this__updatedAttrs = new Hashtable();
      for (Enumeration other_enum = other.updatedAttrs.elements(); other_enum.hasMoreElements(); ) {
        SquareMemberAttribute other_element = (SquareMemberAttribute)other_enum.nextElement();
        __this__updatedAttrs.addElement(other_element);
      }
      this.updatedAttrs = __this__updatedAttrs;
    }
    if (other.isSetUpdatedPreferenceAttrs()) {
      Hashtable __this__updatedPreferenceAttrs = new Hashtable();
      for (Enumeration other_enum = other.updatedPreferenceAttrs.elements(); other_enum.hasMoreElements(); ) {
        SquarePreferenceAttribute other_element = (SquarePreferenceAttribute)other_enum.nextElement();
        __this__updatedPreferenceAttrs.addElement(other_element);
      }
      this.updatedPreferenceAttrs = __this__updatedPreferenceAttrs;
    }
    if (other.isSetSquareMember()) {
      this.squareMember = new SquareMember(other.squareMember);
    }
  }

  public UpdateSquareMemberRequest deepCopy() {
    return new UpdateSquareMemberRequest(this);
  }

  public void clear() {
    this.updatedAttrs = null;
    this.updatedPreferenceAttrs = null;
    this.squareMember = null;
  }

  public int getUpdatedAttrsSize() {
    return (this.updatedAttrs == null) ? 0 : this.updatedAttrs.size();
  }

  public Enumeration getUpdatedAttrsEnumeration() {
    return (this.updatedAttrs == null) ? null : this.updatedAttrs.elements();
  }

  public void addToUpdatedAttrs(SquareMemberAttribute elem) {
    if (this.updatedAttrs == null) {
      this.updatedAttrs = new Hashtable();
    }
    this.updatedAttrs.put(elem, elem);
  }

  public Hashtable getUpdatedAttrs() {
    return this.updatedAttrs;
  }

  public void setUpdatedAttrs(Hashtable updatedAttrs) {
    this.updatedAttrs = updatedAttrs;
  }

  public void unsetUpdatedAttrs() {
    this.updatedAttrs = null;
  }

  /** Returns true if field updatedAttrs is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdatedAttrs() {
    return this.updatedAttrs != null;
  }

  public void setUpdatedAttrsIsSet(boolean value) {
    if (!value) {
      this.updatedAttrs = null;
    }
  }

  public int getUpdatedPreferenceAttrsSize() {
    return (this.updatedPreferenceAttrs == null) ? 0 : this.updatedPreferenceAttrs.size();
  }

  public Enumeration getUpdatedPreferenceAttrsEnumeration() {
    return (this.updatedPreferenceAttrs == null) ? null : this.updatedPreferenceAttrs.elements();
  }

  public void addToUpdatedPreferenceAttrs(SquarePreferenceAttribute elem) {
    if (this.updatedPreferenceAttrs == null) {
      this.updatedPreferenceAttrs = new Hashtable();
    }
    this.updatedPreferenceAttrs.put(elem, elem);
  }

  public Hashtable getUpdatedPreferenceAttrs() {
    return this.updatedPreferenceAttrs;
  }

  public void setUpdatedPreferenceAttrs(Hashtable updatedPreferenceAttrs) {
    this.updatedPreferenceAttrs = updatedPreferenceAttrs;
  }

  public void unsetUpdatedPreferenceAttrs() {
    this.updatedPreferenceAttrs = null;
  }

  /** Returns true if field updatedPreferenceAttrs is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdatedPreferenceAttrs() {
    return this.updatedPreferenceAttrs != null;
  }

  public void setUpdatedPreferenceAttrsIsSet(boolean value) {
    if (!value) {
      this.updatedPreferenceAttrs = null;
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

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UpdateSquareMemberRequest)
      return this.equals((UpdateSquareMemberRequest)that);
    return false;
  }

  public boolean equals(UpdateSquareMemberRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_updatedAttrs = true && this.isSetUpdatedAttrs();
    boolean that_present_updatedAttrs = true && that.isSetUpdatedAttrs();
    if (this_present_updatedAttrs || that_present_updatedAttrs) {
      if (!(this_present_updatedAttrs && that_present_updatedAttrs))
        return false;
      if (!this.updatedAttrs.equals(that.updatedAttrs))
        return false;
    }

    boolean this_present_updatedPreferenceAttrs = true && this.isSetUpdatedPreferenceAttrs();
    boolean that_present_updatedPreferenceAttrs = true && that.isSetUpdatedPreferenceAttrs();
    if (this_present_updatedPreferenceAttrs || that_present_updatedPreferenceAttrs) {
      if (!(this_present_updatedPreferenceAttrs && that_present_updatedPreferenceAttrs))
        return false;
      if (!this.updatedPreferenceAttrs.equals(that.updatedPreferenceAttrs))
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

    return true;
  }

  public int hashCode() {
    return 0;
  }

  public int compareTo(Object otherObject) {
    if (!getClass().equals(otherObject.getClass())) {
      return getClass().getName().compareTo(otherObject.getClass().getName());
    }

    UpdateSquareMemberRequest other = (UpdateSquareMemberRequest)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetUpdatedAttrs(), other.isSetUpdatedAttrs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdatedAttrs()) {
      lastComparison = TBaseHelper.compareTo(this.updatedAttrs, other.updatedAttrs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetUpdatedPreferenceAttrs(), other.isSetUpdatedPreferenceAttrs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdatedPreferenceAttrs()) {
      lastComparison = TBaseHelper.compareTo(this.updatedPreferenceAttrs, other.updatedPreferenceAttrs);
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
        case 2: // UPDATED_ATTRS
          if (field.type == TType.SET) {
            {
              TSet _set417 = iprot.readSetBegin();
              this.updatedAttrs = new Hashtable(2*_set417.size);
              for (int _i418 = 0; _i418 < _set417.size; ++_i418)
              {
                SquareMemberAttribute _elem419;
                _elem419 = SquareMemberAttribute.findByValue(iprot.readI32());
                this.updatedAttrs.put(_elem419, _elem419);
              }
              iprot.readSetEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // UPDATED_PREFERENCE_ATTRS
          if (field.type == TType.SET) {
            {
              TSet _set420 = iprot.readSetBegin();
              this.updatedPreferenceAttrs = new Hashtable(2*_set420.size);
              for (int _i421 = 0; _i421 < _set420.size; ++_i421)
              {
                SquarePreferenceAttribute _elem422;
                _elem422 = SquarePreferenceAttribute.findByValue(iprot.readI32());
                this.updatedPreferenceAttrs.put(_elem422, _elem422);
              }
              iprot.readSetEnd();
            }
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
    if (this.updatedAttrs != null) {
      oprot.writeFieldBegin(UPDATED_ATTRS_FIELD_DESC);
      {
        oprot.writeSetBegin(new TSet(TType.I32, this.updatedAttrs.size()));
        for (Enumeration _iter423_enum = this.updatedAttrs.keys(); _iter423_enum.hasMoreElements(); )         {
          SquareMemberAttribute _iter423 = (SquareMemberAttribute)_iter423_enum.nextElement();
          oprot.writeI32(_iter423.getValue());
        }
        oprot.writeSetEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.updatedPreferenceAttrs != null) {
      oprot.writeFieldBegin(UPDATED_PREFERENCE_ATTRS_FIELD_DESC);
      {
        oprot.writeSetBegin(new TSet(TType.I32, this.updatedPreferenceAttrs.size()));
        for (Enumeration _iter424_enum = this.updatedPreferenceAttrs.keys(); _iter424_enum.hasMoreElements(); )         {
          SquarePreferenceAttribute _iter424 = (SquarePreferenceAttribute)_iter424_enum.nextElement();
          oprot.writeI32(_iter424.getValue());
        }
        oprot.writeSetEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.squareMember != null) {
      oprot.writeFieldBegin(SQUARE_MEMBER_FIELD_DESC);
      this.squareMember.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("UpdateSquareMemberRequest(");
    boolean first = true;

    sb.append("updatedAttrs:");
    if (this.updatedAttrs == null) {
      sb.append("null");
    } else {
      sb.append(this.updatedAttrs);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("updatedPreferenceAttrs:");
    if (this.updatedPreferenceAttrs == null) {
      sb.append("null");
    } else {
      sb.append(this.updatedPreferenceAttrs);
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
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

