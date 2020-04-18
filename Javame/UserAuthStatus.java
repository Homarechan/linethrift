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

public class UserAuthStatus implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("UserAuthStatus");

  private static final TField PHONE_NUMBER_REGISTERED_FIELD_DESC = new TField("phoneNumberRegistered", TType.BOOL, (short)1);
  private static final TField REGISTERED_SNS_ID_TYPES_FIELD_DESC = new TField("registeredSnsIdTypes", TType.LIST, (short)2);

  private boolean phoneNumberRegistered;
  private Vector registeredSnsIdTypes;

  // isset id assignments
  private static final int __PHONENUMBERREGISTERED_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public UserAuthStatus() {
  }

  public UserAuthStatus(
    boolean phoneNumberRegistered,
    Vector registeredSnsIdTypes)
  {
    this();
    this.phoneNumberRegistered = phoneNumberRegistered;
    setPhoneNumberRegisteredIsSet(true);
    this.registeredSnsIdTypes = registeredSnsIdTypes;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserAuthStatus(UserAuthStatus other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.phoneNumberRegistered = other.phoneNumberRegistered;
    if (other.isSetRegisteredSnsIdTypes()) {
      Vector __this__registeredSnsIdTypes = new Vector();
      for (Enumeration other_enum = other.registeredSnsIdTypes.elements(); other_enum.hasMoreElements(); ) {
        SnsIdType other_element = (SnsIdType)other_enum.nextElement();
        __this__registeredSnsIdTypes.addElement(other_element);
      }
      this.registeredSnsIdTypes = __this__registeredSnsIdTypes;
    }
  }

  public UserAuthStatus deepCopy() {
    return new UserAuthStatus(this);
  }

  public void clear() {
    setPhoneNumberRegisteredIsSet(false);
    this.phoneNumberRegistered = false;
    this.registeredSnsIdTypes = null;
  }

  public boolean isPhoneNumberRegistered() {
    return this.phoneNumberRegistered;
  }

  public void setPhoneNumberRegistered(boolean phoneNumberRegistered) {
    this.phoneNumberRegistered = phoneNumberRegistered;
    setPhoneNumberRegisteredIsSet(true);
  }

  public void unsetPhoneNumberRegistered() {
    __isset_vector[__PHONENUMBERREGISTERED_ISSET_ID] = false;
  }

  /** Returns true if field phoneNumberRegistered is set (has been assigned a value) and false otherwise */
  public boolean isSetPhoneNumberRegistered() {
    return __isset_vector[__PHONENUMBERREGISTERED_ISSET_ID];
  }

  public void setPhoneNumberRegisteredIsSet(boolean value) {
    __isset_vector[__PHONENUMBERREGISTERED_ISSET_ID] = value;
  }

  public int getRegisteredSnsIdTypesSize() {
    return (this.registeredSnsIdTypes == null) ? 0 : this.registeredSnsIdTypes.size();
  }

  public Enumeration getRegisteredSnsIdTypesEnumeration() {
    return (this.registeredSnsIdTypes == null) ? null : this.registeredSnsIdTypes.elements();
  }

  public void addToRegisteredSnsIdTypes(SnsIdType elem) {
    if (this.registeredSnsIdTypes == null) {
      this.registeredSnsIdTypes = new Vector();
    }
    this.registeredSnsIdTypes.addElement(elem);
  }

  public Vector getRegisteredSnsIdTypes() {
    return this.registeredSnsIdTypes;
  }

  public void setRegisteredSnsIdTypes(Vector registeredSnsIdTypes) {
    this.registeredSnsIdTypes = registeredSnsIdTypes;
  }

  public void unsetRegisteredSnsIdTypes() {
    this.registeredSnsIdTypes = null;
  }

  /** Returns true if field registeredSnsIdTypes is set (has been assigned a value) and false otherwise */
  public boolean isSetRegisteredSnsIdTypes() {
    return this.registeredSnsIdTypes != null;
  }

  public void setRegisteredSnsIdTypesIsSet(boolean value) {
    if (!value) {
      this.registeredSnsIdTypes = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UserAuthStatus)
      return this.equals((UserAuthStatus)that);
    return false;
  }

  public boolean equals(UserAuthStatus that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_phoneNumberRegistered = true;
    boolean that_present_phoneNumberRegistered = true;
    if (this_present_phoneNumberRegistered || that_present_phoneNumberRegistered) {
      if (!(this_present_phoneNumberRegistered && that_present_phoneNumberRegistered))
        return false;
      if (this.phoneNumberRegistered != that.phoneNumberRegistered)
        return false;
    }

    boolean this_present_registeredSnsIdTypes = true && this.isSetRegisteredSnsIdTypes();
    boolean that_present_registeredSnsIdTypes = true && that.isSetRegisteredSnsIdTypes();
    if (this_present_registeredSnsIdTypes || that_present_registeredSnsIdTypes) {
      if (!(this_present_registeredSnsIdTypes && that_present_registeredSnsIdTypes))
        return false;
      if (!this.registeredSnsIdTypes.equals(that.registeredSnsIdTypes))
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

    UserAuthStatus other = (UserAuthStatus)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetPhoneNumberRegistered(), other.isSetPhoneNumberRegistered());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPhoneNumberRegistered()) {
      lastComparison = TBaseHelper.compareTo(this.phoneNumberRegistered, other.phoneNumberRegistered);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetRegisteredSnsIdTypes(), other.isSetRegisteredSnsIdTypes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRegisteredSnsIdTypes()) {
      lastComparison = TBaseHelper.compareTo(this.registeredSnsIdTypes, other.registeredSnsIdTypes);
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
        case 1: // PHONE_NUMBER_REGISTERED
          if (field.type == TType.BOOL) {
            this.phoneNumberRegistered = iprot.readBool();
            setPhoneNumberRegisteredIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // REGISTERED_SNS_ID_TYPES
          if (field.type == TType.LIST) {
            {
              TList _list537 = iprot.readListBegin();
              this.registeredSnsIdTypes = new Vector(_list537.size);
              for (int _i538 = 0; _i538 < _list537.size; ++_i538)
              {
                SnsIdType _elem539;
                _elem539 = SnsIdType.findByValue(iprot.readI32());
                this.registeredSnsIdTypes.addElement(_elem539);
              }
              iprot.readListEnd();
            }
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
    oprot.writeFieldBegin(PHONE_NUMBER_REGISTERED_FIELD_DESC);
    oprot.writeBool(this.phoneNumberRegistered);
    oprot.writeFieldEnd();
    if (this.registeredSnsIdTypes != null) {
      oprot.writeFieldBegin(REGISTERED_SNS_ID_TYPES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I32, this.registeredSnsIdTypes.size()));
        for (Enumeration _iter540_enum = this.registeredSnsIdTypes.elements(); _iter540_enum.hasMoreElements(); )         {
          SnsIdType _iter540 = (SnsIdType)_iter540_enum.nextElement();
          oprot.writeI32(_iter540.getValue());
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("UserAuthStatus(");
    boolean first = true;

    sb.append("phoneNumberRegistered:");
    sb.append(this.phoneNumberRegistered);
    first = false;
    if (!first) sb.append(", ");
    sb.append("registeredSnsIdTypes:");
    if (this.registeredSnsIdTypes == null) {
      sb.append("null");
    } else {
      sb.append(this.registeredSnsIdTypes);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

