/**
 * Autogenerated by Thrift Compiler (0.13.0)
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

public class ExtendedProfile implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("ExtendedProfile");

  private static final TField BIRTHDAY_FIELD_DESC = new TField("birthday", TType.STRUCT, (short)1);

  private ExtendedProfileBirthday birthday;

  // isset id assignments

  public ExtendedProfile() {
  }

  public ExtendedProfile(
    ExtendedProfileBirthday birthday)
  {
    this();
    this.birthday = birthday;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExtendedProfile(ExtendedProfile other) {
    if (other.isSetBirthday()) {
      this.birthday = new ExtendedProfileBirthday(other.birthday);
    }
  }

  public ExtendedProfile deepCopy() {
    return new ExtendedProfile(this);
  }

  public void clear() {
    this.birthday = null;
  }

  public ExtendedProfileBirthday getBirthday() {
    return this.birthday;
  }

  public void setBirthday(ExtendedProfileBirthday birthday) {
    this.birthday = birthday;
  }

  public void unsetBirthday() {
    this.birthday = null;
  }

  /** Returns true if field birthday is set (has been assigned a value) and false otherwise */
  public boolean isSetBirthday() {
    return this.birthday != null;
  }

  public void setBirthdayIsSet(boolean value) {
    if (!value) {
      this.birthday = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExtendedProfile)
      return this.equals((ExtendedProfile)that);
    return false;
  }

  public boolean equals(ExtendedProfile that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_birthday = true && this.isSetBirthday();
    boolean that_present_birthday = true && that.isSetBirthday();
    if (this_present_birthday || that_present_birthday) {
      if (!(this_present_birthday && that_present_birthday))
        return false;
      if (!this.birthday.equals(that.birthday))
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

    ExtendedProfile other = (ExtendedProfile)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetBirthday(), other.isSetBirthday());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBirthday()) {
      lastComparison = this.birthday.compareTo(other.birthday);
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
        case 1: // BIRTHDAY
          if (field.type == TType.STRUCT) {
            this.birthday = new ExtendedProfileBirthday();
            this.birthday.read(iprot);
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
    if (this.birthday != null) {
      oprot.writeFieldBegin(BIRTHDAY_FIELD_DESC);
      this.birthday.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("ExtendedProfile(");
    boolean first = true;

    sb.append("birthday:");
    if (this.birthday == null) {
      sb.append("null");
    } else {
      sb.append(this.birthday);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
