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

public class BuddyDetail implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("BuddyDetail");

  private static final TField MID_FIELD_DESC = new TField("mid", TType.STRING, (short)1);
  private static final TField MEMBER_COUNT_FIELD_DESC = new TField("memberCount", TType.I64, (short)2);
  private static final TField ON_AIR_FIELD_DESC = new TField("onAir", TType.BOOL, (short)3);
  private static final TField BUSINESS_ACCOUNT_FIELD_DESC = new TField("businessAccount", TType.BOOL, (short)4);
  private static final TField ADDABLE_FIELD_DESC = new TField("addable", TType.BOOL, (short)5);
  private static final TField ACCEPTABLE_CONTENT_TYPES_FIELD_DESC = new TField("acceptableContentTypes", TType.SET, (short)6);
  private static final TField CAPABLE_MYHOME_FIELD_DESC = new TField("capableMyhome", TType.BOOL, (short)7);

  private String mid;
  private long memberCount;
  private boolean onAir;
  private boolean businessAccount;
  private boolean addable;
  private Hashtable acceptableContentTypes;
  private boolean capableMyhome;

  // isset id assignments
  private static final int __MEMBERCOUNT_ISSET_ID = 0;
  private static final int __ONAIR_ISSET_ID = 1;
  private static final int __BUSINESSACCOUNT_ISSET_ID = 2;
  private static final int __ADDABLE_ISSET_ID = 3;
  private static final int __CAPABLEMYHOME_ISSET_ID = 4;
  private boolean[] __isset_vector = new boolean[5];

  public BuddyDetail() {
  }

  public BuddyDetail(
    String mid,
    long memberCount,
    boolean onAir,
    boolean businessAccount,
    boolean addable,
    Hashtable acceptableContentTypes,
    boolean capableMyhome)
  {
    this();
    this.mid = mid;
    this.memberCount = memberCount;
    setMemberCountIsSet(true);
    this.onAir = onAir;
    setOnAirIsSet(true);
    this.businessAccount = businessAccount;
    setBusinessAccountIsSet(true);
    this.addable = addable;
    setAddableIsSet(true);
    this.acceptableContentTypes = acceptableContentTypes;
    this.capableMyhome = capableMyhome;
    setCapableMyhomeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuddyDetail(BuddyDetail other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetMid()) {
      this.mid = other.mid;
    }
    this.memberCount = other.memberCount;
    this.onAir = other.onAir;
    this.businessAccount = other.businessAccount;
    this.addable = other.addable;
    if (other.isSetAcceptableContentTypes()) {
      Hashtable __this__acceptableContentTypes = new Hashtable();
      for (Enumeration other_enum = other.acceptableContentTypes.elements(); other_enum.hasMoreElements(); ) {
        ContentType other_element = (ContentType)other_enum.nextElement();
        __this__acceptableContentTypes.addElement(other_element);
      }
      this.acceptableContentTypes = __this__acceptableContentTypes;
    }
    this.capableMyhome = other.capableMyhome;
  }

  public BuddyDetail deepCopy() {
    return new BuddyDetail(this);
  }

  public void clear() {
    this.mid = null;
    setMemberCountIsSet(false);
    this.memberCount = 0;
    setOnAirIsSet(false);
    this.onAir = false;
    setBusinessAccountIsSet(false);
    this.businessAccount = false;
    setAddableIsSet(false);
    this.addable = false;
    this.acceptableContentTypes = null;
    setCapableMyhomeIsSet(false);
    this.capableMyhome = false;
  }

  public String getMid() {
    return this.mid;
  }

  public void setMid(String mid) {
    this.mid = mid;
  }

  public void unsetMid() {
    this.mid = null;
  }

  /** Returns true if field mid is set (has been assigned a value) and false otherwise */
  public boolean isSetMid() {
    return this.mid != null;
  }

  public void setMidIsSet(boolean value) {
    if (!value) {
      this.mid = null;
    }
  }

  public long getMemberCount() {
    return this.memberCount;
  }

  public void setMemberCount(long memberCount) {
    this.memberCount = memberCount;
    setMemberCountIsSet(true);
  }

  public void unsetMemberCount() {
    __isset_vector[__MEMBERCOUNT_ISSET_ID] = false;
  }

  /** Returns true if field memberCount is set (has been assigned a value) and false otherwise */
  public boolean isSetMemberCount() {
    return __isset_vector[__MEMBERCOUNT_ISSET_ID];
  }

  public void setMemberCountIsSet(boolean value) {
    __isset_vector[__MEMBERCOUNT_ISSET_ID] = value;
  }

  public boolean isOnAir() {
    return this.onAir;
  }

  public void setOnAir(boolean onAir) {
    this.onAir = onAir;
    setOnAirIsSet(true);
  }

  public void unsetOnAir() {
    __isset_vector[__ONAIR_ISSET_ID] = false;
  }

  /** Returns true if field onAir is set (has been assigned a value) and false otherwise */
  public boolean isSetOnAir() {
    return __isset_vector[__ONAIR_ISSET_ID];
  }

  public void setOnAirIsSet(boolean value) {
    __isset_vector[__ONAIR_ISSET_ID] = value;
  }

  public boolean isBusinessAccount() {
    return this.businessAccount;
  }

  public void setBusinessAccount(boolean businessAccount) {
    this.businessAccount = businessAccount;
    setBusinessAccountIsSet(true);
  }

  public void unsetBusinessAccount() {
    __isset_vector[__BUSINESSACCOUNT_ISSET_ID] = false;
  }

  /** Returns true if field businessAccount is set (has been assigned a value) and false otherwise */
  public boolean isSetBusinessAccount() {
    return __isset_vector[__BUSINESSACCOUNT_ISSET_ID];
  }

  public void setBusinessAccountIsSet(boolean value) {
    __isset_vector[__BUSINESSACCOUNT_ISSET_ID] = value;
  }

  public boolean isAddable() {
    return this.addable;
  }

  public void setAddable(boolean addable) {
    this.addable = addable;
    setAddableIsSet(true);
  }

  public void unsetAddable() {
    __isset_vector[__ADDABLE_ISSET_ID] = false;
  }

  /** Returns true if field addable is set (has been assigned a value) and false otherwise */
  public boolean isSetAddable() {
    return __isset_vector[__ADDABLE_ISSET_ID];
  }

  public void setAddableIsSet(boolean value) {
    __isset_vector[__ADDABLE_ISSET_ID] = value;
  }

  public int getAcceptableContentTypesSize() {
    return (this.acceptableContentTypes == null) ? 0 : this.acceptableContentTypes.size();
  }

  public Enumeration getAcceptableContentTypesEnumeration() {
    return (this.acceptableContentTypes == null) ? null : this.acceptableContentTypes.elements();
  }

  public void addToAcceptableContentTypes(ContentType elem) {
    if (this.acceptableContentTypes == null) {
      this.acceptableContentTypes = new Hashtable();
    }
    this.acceptableContentTypes.put(elem, elem);
  }

  public Hashtable getAcceptableContentTypes() {
    return this.acceptableContentTypes;
  }

  public void setAcceptableContentTypes(Hashtable acceptableContentTypes) {
    this.acceptableContentTypes = acceptableContentTypes;
  }

  public void unsetAcceptableContentTypes() {
    this.acceptableContentTypes = null;
  }

  /** Returns true if field acceptableContentTypes is set (has been assigned a value) and false otherwise */
  public boolean isSetAcceptableContentTypes() {
    return this.acceptableContentTypes != null;
  }

  public void setAcceptableContentTypesIsSet(boolean value) {
    if (!value) {
      this.acceptableContentTypes = null;
    }
  }

  public boolean isCapableMyhome() {
    return this.capableMyhome;
  }

  public void setCapableMyhome(boolean capableMyhome) {
    this.capableMyhome = capableMyhome;
    setCapableMyhomeIsSet(true);
  }

  public void unsetCapableMyhome() {
    __isset_vector[__CAPABLEMYHOME_ISSET_ID] = false;
  }

  /** Returns true if field capableMyhome is set (has been assigned a value) and false otherwise */
  public boolean isSetCapableMyhome() {
    return __isset_vector[__CAPABLEMYHOME_ISSET_ID];
  }

  public void setCapableMyhomeIsSet(boolean value) {
    __isset_vector[__CAPABLEMYHOME_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuddyDetail)
      return this.equals((BuddyDetail)that);
    return false;
  }

  public boolean equals(BuddyDetail that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_mid = true && this.isSetMid();
    boolean that_present_mid = true && that.isSetMid();
    if (this_present_mid || that_present_mid) {
      if (!(this_present_mid && that_present_mid))
        return false;
      if (!this.mid.equals(that.mid))
        return false;
    }

    boolean this_present_memberCount = true;
    boolean that_present_memberCount = true;
    if (this_present_memberCount || that_present_memberCount) {
      if (!(this_present_memberCount && that_present_memberCount))
        return false;
      if (this.memberCount != that.memberCount)
        return false;
    }

    boolean this_present_onAir = true;
    boolean that_present_onAir = true;
    if (this_present_onAir || that_present_onAir) {
      if (!(this_present_onAir && that_present_onAir))
        return false;
      if (this.onAir != that.onAir)
        return false;
    }

    boolean this_present_businessAccount = true;
    boolean that_present_businessAccount = true;
    if (this_present_businessAccount || that_present_businessAccount) {
      if (!(this_present_businessAccount && that_present_businessAccount))
        return false;
      if (this.businessAccount != that.businessAccount)
        return false;
    }

    boolean this_present_addable = true;
    boolean that_present_addable = true;
    if (this_present_addable || that_present_addable) {
      if (!(this_present_addable && that_present_addable))
        return false;
      if (this.addable != that.addable)
        return false;
    }

    boolean this_present_acceptableContentTypes = true && this.isSetAcceptableContentTypes();
    boolean that_present_acceptableContentTypes = true && that.isSetAcceptableContentTypes();
    if (this_present_acceptableContentTypes || that_present_acceptableContentTypes) {
      if (!(this_present_acceptableContentTypes && that_present_acceptableContentTypes))
        return false;
      if (!this.acceptableContentTypes.equals(that.acceptableContentTypes))
        return false;
    }

    boolean this_present_capableMyhome = true;
    boolean that_present_capableMyhome = true;
    if (this_present_capableMyhome || that_present_capableMyhome) {
      if (!(this_present_capableMyhome && that_present_capableMyhome))
        return false;
      if (this.capableMyhome != that.capableMyhome)
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

    BuddyDetail other = (BuddyDetail)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetMid(), other.isSetMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMid()) {
      lastComparison = TBaseHelper.compareTo(this.mid, other.mid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetMemberCount(), other.isSetMemberCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMemberCount()) {
      lastComparison = TBaseHelper.compareTo(this.memberCount, other.memberCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetOnAir(), other.isSetOnAir());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOnAir()) {
      lastComparison = TBaseHelper.compareTo(this.onAir, other.onAir);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetBusinessAccount(), other.isSetBusinessAccount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBusinessAccount()) {
      lastComparison = TBaseHelper.compareTo(this.businessAccount, other.businessAccount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetAddable(), other.isSetAddable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddable()) {
      lastComparison = TBaseHelper.compareTo(this.addable, other.addable);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetAcceptableContentTypes(), other.isSetAcceptableContentTypes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAcceptableContentTypes()) {
      lastComparison = TBaseHelper.compareTo(this.acceptableContentTypes, other.acceptableContentTypes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetCapableMyhome(), other.isSetCapableMyhome());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCapableMyhome()) {
      lastComparison = TBaseHelper.compareTo(this.capableMyhome, other.capableMyhome);
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
        case 1: // MID
          if (field.type == TType.STRING) {
            this.mid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // MEMBER_COUNT
          if (field.type == TType.I64) {
            this.memberCount = iprot.readI64();
            setMemberCountIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // ON_AIR
          if (field.type == TType.BOOL) {
            this.onAir = iprot.readBool();
            setOnAirIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // BUSINESS_ACCOUNT
          if (field.type == TType.BOOL) {
            this.businessAccount = iprot.readBool();
            setBusinessAccountIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // ADDABLE
          if (field.type == TType.BOOL) {
            this.addable = iprot.readBool();
            setAddableIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // ACCEPTABLE_CONTENT_TYPES
          if (field.type == TType.SET) {
            {
              TSet _set56 = iprot.readSetBegin();
              this.acceptableContentTypes = new Hashtable(2*_set56.size);
              for (int _i57 = 0; _i57 < _set56.size; ++_i57)
              {
                ContentType _elem58;
                _elem58 = ContentType.findByValue(iprot.readI32());
                this.acceptableContentTypes.put(_elem58, _elem58);
              }
              iprot.readSetEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // CAPABLE_MYHOME
          if (field.type == TType.BOOL) {
            this.capableMyhome = iprot.readBool();
            setCapableMyhomeIsSet(true);
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
    if (this.mid != null) {
      oprot.writeFieldBegin(MID_FIELD_DESC);
      oprot.writeString(this.mid);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(MEMBER_COUNT_FIELD_DESC);
    oprot.writeI64(this.memberCount);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(ON_AIR_FIELD_DESC);
    oprot.writeBool(this.onAir);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(BUSINESS_ACCOUNT_FIELD_DESC);
    oprot.writeBool(this.businessAccount);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(ADDABLE_FIELD_DESC);
    oprot.writeBool(this.addable);
    oprot.writeFieldEnd();
    if (this.acceptableContentTypes != null) {
      oprot.writeFieldBegin(ACCEPTABLE_CONTENT_TYPES_FIELD_DESC);
      {
        oprot.writeSetBegin(new TSet(TType.I32, this.acceptableContentTypes.size()));
        for (Enumeration _iter59_enum = this.acceptableContentTypes.keys(); _iter59_enum.hasMoreElements(); )         {
          ContentType _iter59 = (ContentType)_iter59_enum.nextElement();
          oprot.writeI32(_iter59.getValue());
        }
        oprot.writeSetEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(CAPABLE_MYHOME_FIELD_DESC);
    oprot.writeBool(this.capableMyhome);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("BuddyDetail(");
    boolean first = true;

    sb.append("mid:");
    if (this.mid == null) {
      sb.append("null");
    } else {
      sb.append(this.mid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("memberCount:");
    sb.append(this.memberCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("onAir:");
    sb.append(this.onAir);
    first = false;
    if (!first) sb.append(", ");
    sb.append("businessAccount:");
    sb.append(this.businessAccount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("addable:");
    sb.append(this.addable);
    first = false;
    if (!first) sb.append(", ");
    sb.append("acceptableContentTypes:");
    if (this.acceptableContentTypes == null) {
      sb.append("null");
    } else {
      sb.append(this.acceptableContentTypes);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("capableMyhome:");
    sb.append(this.capableMyhome);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

