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

public class PlaceSearchInfo implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("PlaceSearchInfo");

  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)1);
  private static final TField ADDRESS_FIELD_DESC = new TField("address", TType.STRING, (short)2);
  private static final TField LATITUDE_FIELD_DESC = new TField("latitude", TType.DOUBLE, (short)3);
  private static final TField LONGITUDE_FIELD_DESC = new TField("longitude", TType.DOUBLE, (short)4);

  private String name;
  private String address;
  private double latitude;
  private double longitude;

  // isset id assignments
  private static final int __LATITUDE_ISSET_ID = 0;
  private static final int __LONGITUDE_ISSET_ID = 1;
  private boolean[] __isset_vector = new boolean[2];

  public PlaceSearchInfo() {
  }

  public PlaceSearchInfo(
    String name,
    String address,
    double latitude,
    double longitude)
  {
    this();
    this.name = name;
    this.address = address;
    this.latitude = latitude;
    setLatitudeIsSet(true);
    this.longitude = longitude;
    setLongitudeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PlaceSearchInfo(PlaceSearchInfo other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetAddress()) {
      this.address = other.address;
    }
    this.latitude = other.latitude;
    this.longitude = other.longitude;
  }

  public PlaceSearchInfo deepCopy() {
    return new PlaceSearchInfo(this);
  }

  public void clear() {
    this.name = null;
    this.address = null;
    setLatitudeIsSet(false);
    this.latitude = 0.0;
    setLongitudeIsSet(false);
    this.longitude = 0.0;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void unsetAddress() {
    this.address = null;
  }

  /** Returns true if field address is set (has been assigned a value) and false otherwise */
  public boolean isSetAddress() {
    return this.address != null;
  }

  public void setAddressIsSet(boolean value) {
    if (!value) {
      this.address = null;
    }
  }

  public double getLatitude() {
    return this.latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
    setLatitudeIsSet(true);
  }

  public void unsetLatitude() {
    __isset_vector[__LATITUDE_ISSET_ID] = false;
  }

  /** Returns true if field latitude is set (has been assigned a value) and false otherwise */
  public boolean isSetLatitude() {
    return __isset_vector[__LATITUDE_ISSET_ID];
  }

  public void setLatitudeIsSet(boolean value) {
    __isset_vector[__LATITUDE_ISSET_ID] = value;
  }

  public double getLongitude() {
    return this.longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
    setLongitudeIsSet(true);
  }

  public void unsetLongitude() {
    __isset_vector[__LONGITUDE_ISSET_ID] = false;
  }

  /** Returns true if field longitude is set (has been assigned a value) and false otherwise */
  public boolean isSetLongitude() {
    return __isset_vector[__LONGITUDE_ISSET_ID];
  }

  public void setLongitudeIsSet(boolean value) {
    __isset_vector[__LONGITUDE_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PlaceSearchInfo)
      return this.equals((PlaceSearchInfo)that);
    return false;
  }

  public boolean equals(PlaceSearchInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_address = true && this.isSetAddress();
    boolean that_present_address = true && that.isSetAddress();
    if (this_present_address || that_present_address) {
      if (!(this_present_address && that_present_address))
        return false;
      if (!this.address.equals(that.address))
        return false;
    }

    boolean this_present_latitude = true;
    boolean that_present_latitude = true;
    if (this_present_latitude || that_present_latitude) {
      if (!(this_present_latitude && that_present_latitude))
        return false;
      if (this.latitude != that.latitude)
        return false;
    }

    boolean this_present_longitude = true;
    boolean that_present_longitude = true;
    if (this_present_longitude || that_present_longitude) {
      if (!(this_present_longitude && that_present_longitude))
        return false;
      if (this.longitude != that.longitude)
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

    PlaceSearchInfo other = (PlaceSearchInfo)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetName(), other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetAddress(), other.isSetAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddress()) {
      lastComparison = TBaseHelper.compareTo(this.address, other.address);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetLatitude(), other.isSetLatitude());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLatitude()) {
      lastComparison = TBaseHelper.compareTo(this.latitude, other.latitude);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetLongitude(), other.isSetLongitude());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLongitude()) {
      lastComparison = TBaseHelper.compareTo(this.longitude, other.longitude);
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
        case 1: // NAME
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // ADDRESS
          if (field.type == TType.STRING) {
            this.address = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // LATITUDE
          if (field.type == TType.DOUBLE) {
            this.latitude = iprot.readDouble();
            setLatitudeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // LONGITUDE
          if (field.type == TType.DOUBLE) {
            this.longitude = iprot.readDouble();
            setLongitudeIsSet(true);
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
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.address != null) {
      oprot.writeFieldBegin(ADDRESS_FIELD_DESC);
      oprot.writeString(this.address);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(LATITUDE_FIELD_DESC);
    oprot.writeDouble(this.latitude);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(LONGITUDE_FIELD_DESC);
    oprot.writeDouble(this.longitude);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("PlaceSearchInfo(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("address:");
    if (this.address == null) {
      sb.append("null");
    } else {
      sb.append(this.address);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("latitude:");
    sb.append(this.latitude);
    first = false;
    if (!first) sb.append(", ");
    sb.append("longitude:");
    sb.append(this.longitude);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

