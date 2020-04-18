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

public class SpotService {

  public interface Iface {

    public SpotPhoneNumberResponse lookupByPhoneNumber(String countryAreaCode, String phoneNumber) throws TalkException, TException;

    public SpotNearbyResponse lookupNearby(Location location, SpotCategory category, String query, String countryAreaCode) throws TalkException, TException;

  }

  public static class Client implements TServiceClient, Iface {
    public Client(TProtocol prot)
    {
      this(prot, prot);
    }

    public Client(TProtocol iprot, TProtocol oprot)
    {
      iprot_ = iprot;
      oprot_ = oprot;
    }

    protected TProtocol iprot_;
    protected TProtocol oprot_;

    protected int seqid_;

    public TProtocol getInputProtocol()
    {
      return this.iprot_;
    }

    public TProtocol getOutputProtocol()
    {
      return this.oprot_;
    }

    public SpotPhoneNumberResponse lookupByPhoneNumber(String countryAreaCode, String phoneNumber) throws TalkException, TException
    {
      send_lookupByPhoneNumber(countryAreaCode, phoneNumber);
      return recv_lookupByPhoneNumber();
    }

    public void send_lookupByPhoneNumber(String countryAreaCode, String phoneNumber) throws TException
    {
      oprot_.writeMessageBegin(new TMessage("lookupByPhoneNumber", TMessageType.CALL, ++seqid_));
      lookupByPhoneNumber_args args = new lookupByPhoneNumber_args();
      args.setCountryAreaCode(countryAreaCode);
      args.setPhoneNumber(phoneNumber);
      args.write(oprot_);
      oprot_.writeMessageEnd();
      oprot_.getTransport().flush();
    }

    public SpotPhoneNumberResponse recv_lookupByPhoneNumber() throws TalkException, TException
    {
      TMessage msg = iprot_.readMessageBegin();
      if (msg.type == TMessageType.EXCEPTION) {
        TApplicationException x = TApplicationException.read(iprot_);
        iprot_.readMessageEnd();
        throw x;
      }
      if (msg.seqid != seqid_) {
        throw new TApplicationException(TApplicationException.BAD_SEQUENCE_ID, "lookupByPhoneNumber failed: out of sequence response");
      }
      lookupByPhoneNumber_result result = new lookupByPhoneNumber_result();
      result.read(iprot_);
      iprot_.readMessageEnd();
      if (result.isSetSuccess()) {
        return result.success;
      }
      if (result.e != null) {
        throw result.e;
      }
      throw new TApplicationException(TApplicationException.MISSING_RESULT, "lookupByPhoneNumber failed: unknown result");
    }

    public SpotNearbyResponse lookupNearby(Location location, SpotCategory category, String query, String countryAreaCode) throws TalkException, TException
    {
      send_lookupNearby(location, category, query, countryAreaCode);
      return recv_lookupNearby();
    }

    public void send_lookupNearby(Location location, SpotCategory category, String query, String countryAreaCode) throws TException
    {
      oprot_.writeMessageBegin(new TMessage("lookupNearby", TMessageType.CALL, ++seqid_));
      lookupNearby_args args = new lookupNearby_args();
      args.setLocation(location);
      args.setCategory(category);
      args.setQuery(query);
      args.setCountryAreaCode(countryAreaCode);
      args.write(oprot_);
      oprot_.writeMessageEnd();
      oprot_.getTransport().flush();
    }

    public SpotNearbyResponse recv_lookupNearby() throws TalkException, TException
    {
      TMessage msg = iprot_.readMessageBegin();
      if (msg.type == TMessageType.EXCEPTION) {
        TApplicationException x = TApplicationException.read(iprot_);
        iprot_.readMessageEnd();
        throw x;
      }
      if (msg.seqid != seqid_) {
        throw new TApplicationException(TApplicationException.BAD_SEQUENCE_ID, "lookupNearby failed: out of sequence response");
      }
      lookupNearby_result result = new lookupNearby_result();
      result.read(iprot_);
      iprot_.readMessageEnd();
      if (result.isSetSuccess()) {
        return result.success;
      }
      if (result.e != null) {
        throw result.e;
      }
      throw new TApplicationException(TApplicationException.MISSING_RESULT, "lookupNearby failed: unknown result");
    }

  }
  public static class Processor implements TProcessor {
    public Processor(Iface iface)
    {
      iface_ = iface;
      processMap_.put("lookupByPhoneNumber", new lookupByPhoneNumber());
      processMap_.put("lookupNearby", new lookupNearby());
    }

    protected static interface ProcessFunction {
      public void process(int seqid, TProtocol iprot, TProtocol oprot) throws TException;
    }

    private Iface iface_;
    protected final Hashtable processMap_ = new Hashtable();

    public boolean process(TProtocol iprot, TProtocol oprot) throws TException
    {
      TMessage msg = iprot.readMessageBegin();
      ProcessFunction fn = (ProcessFunction)processMap_.get(msg.name);
      if (fn == null) {
        TProtocolUtil.skip(iprot, TType.STRUCT);
        iprot.readMessageEnd();
        TApplicationException x = new TApplicationException(TApplicationException.UNKNOWN_METHOD, "Invalid method name: '"+msg.name+"'");
        oprot.writeMessageBegin(new TMessage(msg.name, TMessageType.EXCEPTION, msg.seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return true;
      }
      fn.process(msg.seqid, iprot, oprot);
      return true;
    }

    private class lookupByPhoneNumber implements ProcessFunction {
      public void process(int seqid, TProtocol iprot, TProtocol oprot) throws TException
      {
        lookupByPhoneNumber_args args = new lookupByPhoneNumber_args();
        try {
          args.read(iprot);
        } catch (TProtocolException e) {
          iprot.readMessageEnd();
          TApplicationException x = new TApplicationException(TApplicationException.PROTOCOL_ERROR, e.getMessage());
          oprot.writeMessageBegin(new TMessage("lookupByPhoneNumber", TMessageType.EXCEPTION, seqid));
          x.write(oprot);
          oprot.writeMessageEnd();
          oprot.getTransport().flush();
          return;
        }
        iprot.readMessageEnd();
        lookupByPhoneNumber_result result = new lookupByPhoneNumber_result();
        try {
          result.success = iface_.lookupByPhoneNumber(args.countryAreaCode, args.phoneNumber);
        } catch (TalkException e) {
          result.e = e;
        } catch (Throwable th) {
          TApplicationException x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing lookupByPhoneNumber");
          oprot.writeMessageBegin(new TMessage("lookupByPhoneNumber", TMessageType.EXCEPTION, seqid));
          x.write(oprot);
          oprot.writeMessageEnd();
          oprot.getTransport().flush();
          return;
        }
        oprot.writeMessageBegin(new TMessage("lookupByPhoneNumber", TMessageType.REPLY, seqid));
        result.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
      }

    }

    private class lookupNearby implements ProcessFunction {
      public void process(int seqid, TProtocol iprot, TProtocol oprot) throws TException
      {
        lookupNearby_args args = new lookupNearby_args();
        try {
          args.read(iprot);
        } catch (TProtocolException e) {
          iprot.readMessageEnd();
          TApplicationException x = new TApplicationException(TApplicationException.PROTOCOL_ERROR, e.getMessage());
          oprot.writeMessageBegin(new TMessage("lookupNearby", TMessageType.EXCEPTION, seqid));
          x.write(oprot);
          oprot.writeMessageEnd();
          oprot.getTransport().flush();
          return;
        }
        iprot.readMessageEnd();
        lookupNearby_result result = new lookupNearby_result();
        try {
          result.success = iface_.lookupNearby(args.location, args.category, args.query, args.countryAreaCode);
        } catch (TalkException e) {
          result.e = e;
        } catch (Throwable th) {
          TApplicationException x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing lookupNearby");
          oprot.writeMessageBegin(new TMessage("lookupNearby", TMessageType.EXCEPTION, seqid));
          x.write(oprot);
          oprot.writeMessageEnd();
          oprot.getTransport().flush();
          return;
        }
        oprot.writeMessageBegin(new TMessage("lookupNearby", TMessageType.REPLY, seqid));
        result.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
      }

    }

  }

  public static class lookupByPhoneNumber_args implements TBase   {
    private static final TStruct STRUCT_DESC = new TStruct("lookupByPhoneNumber_args");

    private static final TField COUNTRY_AREA_CODE_FIELD_DESC = new TField("countryAreaCode", TType.STRING, (short)2);
    private static final TField PHONE_NUMBER_FIELD_DESC = new TField("phoneNumber", TType.STRING, (short)3);

    private String countryAreaCode;
    private String phoneNumber;

    // isset id assignments

    public lookupByPhoneNumber_args() {
    }

    public lookupByPhoneNumber_args(
      String countryAreaCode,
      String phoneNumber)
    {
      this();
      this.countryAreaCode = countryAreaCode;
      this.phoneNumber = phoneNumber;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public lookupByPhoneNumber_args(lookupByPhoneNumber_args other) {
      if (other.isSetCountryAreaCode()) {
        this.countryAreaCode = other.countryAreaCode;
      }
      if (other.isSetPhoneNumber()) {
        this.phoneNumber = other.phoneNumber;
      }
    }

    public lookupByPhoneNumber_args deepCopy() {
      return new lookupByPhoneNumber_args(this);
    }

    public void clear() {
      this.countryAreaCode = null;
      this.phoneNumber = null;
    }

    public String getCountryAreaCode() {
      return this.countryAreaCode;
    }

    public void setCountryAreaCode(String countryAreaCode) {
      this.countryAreaCode = countryAreaCode;
    }

    public void unsetCountryAreaCode() {
      this.countryAreaCode = null;
    }

    /** Returns true if field countryAreaCode is set (has been assigned a value) and false otherwise */
    public boolean isSetCountryAreaCode() {
      return this.countryAreaCode != null;
    }

    public void setCountryAreaCodeIsSet(boolean value) {
      if (!value) {
        this.countryAreaCode = null;
      }
    }

    public String getPhoneNumber() {
      return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
    }

    public void unsetPhoneNumber() {
      this.phoneNumber = null;
    }

    /** Returns true if field phoneNumber is set (has been assigned a value) and false otherwise */
    public boolean isSetPhoneNumber() {
      return this.phoneNumber != null;
    }

    public void setPhoneNumberIsSet(boolean value) {
      if (!value) {
        this.phoneNumber = null;
      }
    }

    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof lookupByPhoneNumber_args)
        return this.equals((lookupByPhoneNumber_args)that);
      return false;
    }

    public boolean equals(lookupByPhoneNumber_args that) {
      if (that == null)
        return false;
      if (this == that)
        return true;

      boolean this_present_countryAreaCode = true && this.isSetCountryAreaCode();
      boolean that_present_countryAreaCode = true && that.isSetCountryAreaCode();
      if (this_present_countryAreaCode || that_present_countryAreaCode) {
        if (!(this_present_countryAreaCode && that_present_countryAreaCode))
          return false;
        if (!this.countryAreaCode.equals(that.countryAreaCode))
          return false;
      }

      boolean this_present_phoneNumber = true && this.isSetPhoneNumber();
      boolean that_present_phoneNumber = true && that.isSetPhoneNumber();
      if (this_present_phoneNumber || that_present_phoneNumber) {
        if (!(this_present_phoneNumber && that_present_phoneNumber))
          return false;
        if (!this.phoneNumber.equals(that.phoneNumber))
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

      lookupByPhoneNumber_args other = (lookupByPhoneNumber_args)otherObject;      int lastComparison = 0;

      lastComparison = TBaseHelper.compareTo(isSetCountryAreaCode(), other.isSetCountryAreaCode());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetCountryAreaCode()) {
        lastComparison = TBaseHelper.compareTo(this.countryAreaCode, other.countryAreaCode);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = TBaseHelper.compareTo(isSetPhoneNumber(), other.isSetPhoneNumber());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetPhoneNumber()) {
        lastComparison = TBaseHelper.compareTo(this.phoneNumber, other.phoneNumber);
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
          case 2: // COUNTRY_AREA_CODE
            if (field.type == TType.STRING) {
              this.countryAreaCode = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case 3: // PHONE_NUMBER
            if (field.type == TType.STRING) {
              this.phoneNumber = iprot.readString();
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
      if (this.countryAreaCode != null) {
        oprot.writeFieldBegin(COUNTRY_AREA_CODE_FIELD_DESC);
        oprot.writeString(this.countryAreaCode);
        oprot.writeFieldEnd();
      }
      if (this.phoneNumber != null) {
        oprot.writeFieldBegin(PHONE_NUMBER_FIELD_DESC);
        oprot.writeString(this.phoneNumber);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

    public String toString() {
      StringBuffer sb = new StringBuffer("lookupByPhoneNumber_args(");
      boolean first = true;

      sb.append("countryAreaCode:");
      if (this.countryAreaCode == null) {
        sb.append("null");
      } else {
        sb.append(this.countryAreaCode);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("phoneNumber:");
      if (this.phoneNumber == null) {
        sb.append("null");
      } else {
        sb.append(this.phoneNumber);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws TException {
      // check for required fields
    }

  }

  public static class lookupByPhoneNumber_result implements TBase   {
    private static final TStruct STRUCT_DESC = new TStruct("lookupByPhoneNumber_result");

    private static final TField SUCCESS_FIELD_DESC = new TField("success", TType.STRUCT, (short)0);
    private static final TField E_FIELD_DESC = new TField("e", TType.STRUCT, (short)1);

    private SpotPhoneNumberResponse success;
    private TalkException e;

    // isset id assignments

    public lookupByPhoneNumber_result() {
    }

    public lookupByPhoneNumber_result(
      SpotPhoneNumberResponse success,
      TalkException e)
    {
      this();
      this.success = success;
      this.e = e;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public lookupByPhoneNumber_result(lookupByPhoneNumber_result other) {
      if (other.isSetSuccess()) {
        this.success = new SpotPhoneNumberResponse(other.success);
      }
      if (other.isSetE()) {
        this.e = new TalkException(other.e);
      }
    }

    public lookupByPhoneNumber_result deepCopy() {
      return new lookupByPhoneNumber_result(this);
    }

    public void clear() {
      this.success = null;
      this.e = null;
    }

    public SpotPhoneNumberResponse getSuccess() {
      return this.success;
    }

    public void setSuccess(SpotPhoneNumberResponse success) {
      this.success = success;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
      if (!value) {
        this.success = null;
      }
    }

    public TalkException getE() {
      return this.e;
    }

    public void setE(TalkException e) {
      this.e = e;
    }

    public void unsetE() {
      this.e = null;
    }

    /** Returns true if field e is set (has been assigned a value) and false otherwise */
    public boolean isSetE() {
      return this.e != null;
    }

    public void setEIsSet(boolean value) {
      if (!value) {
        this.e = null;
      }
    }

    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof lookupByPhoneNumber_result)
        return this.equals((lookupByPhoneNumber_result)that);
      return false;
    }

    public boolean equals(lookupByPhoneNumber_result that) {
      if (that == null)
        return false;
      if (this == that)
        return true;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      boolean this_present_e = true && this.isSetE();
      boolean that_present_e = true && that.isSetE();
      if (this_present_e || that_present_e) {
        if (!(this_present_e && that_present_e))
          return false;
        if (!this.e.equals(that.e))
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

      lookupByPhoneNumber_result other = (lookupByPhoneNumber_result)otherObject;      int lastComparison = 0;

      lastComparison = TBaseHelper.compareTo(isSetSuccess(), other.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = this.success.compareTo(other.success);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = TBaseHelper.compareTo(isSetE(), other.isSetE());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetE()) {
        lastComparison = this.e.compareTo(other.e);
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
          case 0: // SUCCESS
            if (field.type == TType.STRUCT) {
              this.success = new SpotPhoneNumberResponse();
              this.success.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case 1: // E
            if (field.type == TType.STRUCT) {
              this.e = new TalkException();
              this.e.read(iprot);
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
      oprot.writeStructBegin(STRUCT_DESC);

      if (this.isSetSuccess()) {
        oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
        this.success.write(oprot);
        oprot.writeFieldEnd();
      } else if (this.isSetE()) {
        oprot.writeFieldBegin(E_FIELD_DESC);
        this.e.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

    public String toString() {
      StringBuffer sb = new StringBuffer("lookupByPhoneNumber_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("e:");
      if (this.e == null) {
        sb.append("null");
      } else {
        sb.append(this.e);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws TException {
      // check for required fields
    }

  }

  public static class lookupNearby_args implements TBase   {
    private static final TStruct STRUCT_DESC = new TStruct("lookupNearby_args");

    private static final TField LOCATION_FIELD_DESC = new TField("location", TType.STRUCT, (short)2);
    private static final TField CATEGORY_FIELD_DESC = new TField("category", TType.I32, (short)3);
    private static final TField QUERY_FIELD_DESC = new TField("query", TType.STRING, (short)4);
    private static final TField COUNTRY_AREA_CODE_FIELD_DESC = new TField("countryAreaCode", TType.STRING, (short)5);

    private Location location;
    private SpotCategory category;
    private String query;
    private String countryAreaCode;

    // isset id assignments

    public lookupNearby_args() {
    }

    public lookupNearby_args(
      Location location,
      SpotCategory category,
      String query,
      String countryAreaCode)
    {
      this();
      this.location = location;
      this.category = category;
      this.query = query;
      this.countryAreaCode = countryAreaCode;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public lookupNearby_args(lookupNearby_args other) {
      if (other.isSetLocation()) {
        this.location = new Location(other.location);
      }
      if (other.isSetCategory()) {
        this.category = other.category;
      }
      if (other.isSetQuery()) {
        this.query = other.query;
      }
      if (other.isSetCountryAreaCode()) {
        this.countryAreaCode = other.countryAreaCode;
      }
    }

    public lookupNearby_args deepCopy() {
      return new lookupNearby_args(this);
    }

    public void clear() {
      this.location = null;
      this.category = null;
      this.query = null;
      this.countryAreaCode = null;
    }

    public Location getLocation() {
      return this.location;
    }

    public void setLocation(Location location) {
      this.location = location;
    }

    public void unsetLocation() {
      this.location = null;
    }

    /** Returns true if field location is set (has been assigned a value) and false otherwise */
    public boolean isSetLocation() {
      return this.location != null;
    }

    public void setLocationIsSet(boolean value) {
      if (!value) {
        this.location = null;
      }
    }

    /**
     * 
     * @see SpotCategory
     */
    public SpotCategory getCategory() {
      return this.category;
    }

    /**
     * 
     * @see SpotCategory
     */
    public void setCategory(SpotCategory category) {
      this.category = category;
    }

    public void unsetCategory() {
      this.category = null;
    }

    /** Returns true if field category is set (has been assigned a value) and false otherwise */
    public boolean isSetCategory() {
      return this.category != null;
    }

    public void setCategoryIsSet(boolean value) {
      if (!value) {
        this.category = null;
      }
    }

    public String getQuery() {
      return this.query;
    }

    public void setQuery(String query) {
      this.query = query;
    }

    public void unsetQuery() {
      this.query = null;
    }

    /** Returns true if field query is set (has been assigned a value) and false otherwise */
    public boolean isSetQuery() {
      return this.query != null;
    }

    public void setQueryIsSet(boolean value) {
      if (!value) {
        this.query = null;
      }
    }

    public String getCountryAreaCode() {
      return this.countryAreaCode;
    }

    public void setCountryAreaCode(String countryAreaCode) {
      this.countryAreaCode = countryAreaCode;
    }

    public void unsetCountryAreaCode() {
      this.countryAreaCode = null;
    }

    /** Returns true if field countryAreaCode is set (has been assigned a value) and false otherwise */
    public boolean isSetCountryAreaCode() {
      return this.countryAreaCode != null;
    }

    public void setCountryAreaCodeIsSet(boolean value) {
      if (!value) {
        this.countryAreaCode = null;
      }
    }

    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof lookupNearby_args)
        return this.equals((lookupNearby_args)that);
      return false;
    }

    public boolean equals(lookupNearby_args that) {
      if (that == null)
        return false;
      if (this == that)
        return true;

      boolean this_present_location = true && this.isSetLocation();
      boolean that_present_location = true && that.isSetLocation();
      if (this_present_location || that_present_location) {
        if (!(this_present_location && that_present_location))
          return false;
        if (!this.location.equals(that.location))
          return false;
      }

      boolean this_present_category = true && this.isSetCategory();
      boolean that_present_category = true && that.isSetCategory();
      if (this_present_category || that_present_category) {
        if (!(this_present_category && that_present_category))
          return false;
        if (!this.category.equals(that.category))
          return false;
      }

      boolean this_present_query = true && this.isSetQuery();
      boolean that_present_query = true && that.isSetQuery();
      if (this_present_query || that_present_query) {
        if (!(this_present_query && that_present_query))
          return false;
        if (!this.query.equals(that.query))
          return false;
      }

      boolean this_present_countryAreaCode = true && this.isSetCountryAreaCode();
      boolean that_present_countryAreaCode = true && that.isSetCountryAreaCode();
      if (this_present_countryAreaCode || that_present_countryAreaCode) {
        if (!(this_present_countryAreaCode && that_present_countryAreaCode))
          return false;
        if (!this.countryAreaCode.equals(that.countryAreaCode))
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

      lookupNearby_args other = (lookupNearby_args)otherObject;      int lastComparison = 0;

      lastComparison = TBaseHelper.compareTo(isSetLocation(), other.isSetLocation());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetLocation()) {
        lastComparison = this.location.compareTo(other.location);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = TBaseHelper.compareTo(isSetCategory(), other.isSetCategory());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetCategory()) {
        lastComparison = TBaseHelper.compareTo(this.category, other.category);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = TBaseHelper.compareTo(isSetQuery(), other.isSetQuery());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetQuery()) {
        lastComparison = TBaseHelper.compareTo(this.query, other.query);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = TBaseHelper.compareTo(isSetCountryAreaCode(), other.isSetCountryAreaCode());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetCountryAreaCode()) {
        lastComparison = TBaseHelper.compareTo(this.countryAreaCode, other.countryAreaCode);
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
          case 2: // LOCATION
            if (field.type == TType.STRUCT) {
              this.location = new Location();
              this.location.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case 3: // CATEGORY
            if (field.type == TType.I32) {
              this.category = SpotCategory.findByValue(iprot.readI32());
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case 4: // QUERY
            if (field.type == TType.STRING) {
              this.query = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case 5: // COUNTRY_AREA_CODE
            if (field.type == TType.STRING) {
              this.countryAreaCode = iprot.readString();
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
      if (this.location != null) {
        oprot.writeFieldBegin(LOCATION_FIELD_DESC);
        this.location.write(oprot);
        oprot.writeFieldEnd();
      }
      if (this.category != null) {
        oprot.writeFieldBegin(CATEGORY_FIELD_DESC);
        oprot.writeI32(this.category.getValue());
        oprot.writeFieldEnd();
      }
      if (this.query != null) {
        oprot.writeFieldBegin(QUERY_FIELD_DESC);
        oprot.writeString(this.query);
        oprot.writeFieldEnd();
      }
      if (this.countryAreaCode != null) {
        oprot.writeFieldBegin(COUNTRY_AREA_CODE_FIELD_DESC);
        oprot.writeString(this.countryAreaCode);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

    public String toString() {
      StringBuffer sb = new StringBuffer("lookupNearby_args(");
      boolean first = true;

      sb.append("location:");
      if (this.location == null) {
        sb.append("null");
      } else {
        sb.append(this.location);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("category:");
      if (this.category == null) {
        sb.append("null");
      } else {
        sb.append(this.category);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("query:");
      if (this.query == null) {
        sb.append("null");
      } else {
        sb.append(this.query);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("countryAreaCode:");
      if (this.countryAreaCode == null) {
        sb.append("null");
      } else {
        sb.append(this.countryAreaCode);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws TException {
      // check for required fields
    }

  }

  public static class lookupNearby_result implements TBase   {
    private static final TStruct STRUCT_DESC = new TStruct("lookupNearby_result");

    private static final TField SUCCESS_FIELD_DESC = new TField("success", TType.STRUCT, (short)0);
    private static final TField E_FIELD_DESC = new TField("e", TType.STRUCT, (short)1);

    private SpotNearbyResponse success;
    private TalkException e;

    // isset id assignments

    public lookupNearby_result() {
    }

    public lookupNearby_result(
      SpotNearbyResponse success,
      TalkException e)
    {
      this();
      this.success = success;
      this.e = e;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public lookupNearby_result(lookupNearby_result other) {
      if (other.isSetSuccess()) {
        this.success = new SpotNearbyResponse(other.success);
      }
      if (other.isSetE()) {
        this.e = new TalkException(other.e);
      }
    }

    public lookupNearby_result deepCopy() {
      return new lookupNearby_result(this);
    }

    public void clear() {
      this.success = null;
      this.e = null;
    }

    public SpotNearbyResponse getSuccess() {
      return this.success;
    }

    public void setSuccess(SpotNearbyResponse success) {
      this.success = success;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
      if (!value) {
        this.success = null;
      }
    }

    public TalkException getE() {
      return this.e;
    }

    public void setE(TalkException e) {
      this.e = e;
    }

    public void unsetE() {
      this.e = null;
    }

    /** Returns true if field e is set (has been assigned a value) and false otherwise */
    public boolean isSetE() {
      return this.e != null;
    }

    public void setEIsSet(boolean value) {
      if (!value) {
        this.e = null;
      }
    }

    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof lookupNearby_result)
        return this.equals((lookupNearby_result)that);
      return false;
    }

    public boolean equals(lookupNearby_result that) {
      if (that == null)
        return false;
      if (this == that)
        return true;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      boolean this_present_e = true && this.isSetE();
      boolean that_present_e = true && that.isSetE();
      if (this_present_e || that_present_e) {
        if (!(this_present_e && that_present_e))
          return false;
        if (!this.e.equals(that.e))
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

      lookupNearby_result other = (lookupNearby_result)otherObject;      int lastComparison = 0;

      lastComparison = TBaseHelper.compareTo(isSetSuccess(), other.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = this.success.compareTo(other.success);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = TBaseHelper.compareTo(isSetE(), other.isSetE());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetE()) {
        lastComparison = this.e.compareTo(other.e);
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
          case 0: // SUCCESS
            if (field.type == TType.STRUCT) {
              this.success = new SpotNearbyResponse();
              this.success.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case 1: // E
            if (field.type == TType.STRUCT) {
              this.e = new TalkException();
              this.e.read(iprot);
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
      oprot.writeStructBegin(STRUCT_DESC);

      if (this.isSetSuccess()) {
        oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
        this.success.write(oprot);
        oprot.writeFieldEnd();
      } else if (this.isSetE()) {
        oprot.writeFieldBegin(E_FIELD_DESC);
        this.e.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

    public String toString() {
      StringBuffer sb = new StringBuffer("lookupNearby_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("e:");
      if (this.e == null) {
        sb.append("null");
      } else {
        sb.append(this.e);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws TException {
      // check for required fields
    }

  }

}
