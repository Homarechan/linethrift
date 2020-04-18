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

public class GetSquareMemberRelationsRequest implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("GetSquareMemberRelationsRequest");

  private static final TField STATE_FIELD_DESC = new TField("state", TType.I32, (short)2);
  private static final TField CONTINUATION_TOKEN_FIELD_DESC = new TField("continuationToken", TType.STRING, (short)3);
  private static final TField LIMIT_FIELD_DESC = new TField("limit", TType.I32, (short)4);

  private SquareMemberRelationState state;
  private String continuationToken;
  private int limit;

  // isset id assignments
  private static final int __LIMIT_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public GetSquareMemberRelationsRequest() {
  }

  public GetSquareMemberRelationsRequest(
    SquareMemberRelationState state,
    String continuationToken,
    int limit)
  {
    this();
    this.state = state;
    this.continuationToken = continuationToken;
    this.limit = limit;
    setLimitIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetSquareMemberRelationsRequest(GetSquareMemberRelationsRequest other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetState()) {
      this.state = other.state;
    }
    if (other.isSetContinuationToken()) {
      this.continuationToken = other.continuationToken;
    }
    this.limit = other.limit;
  }

  public GetSquareMemberRelationsRequest deepCopy() {
    return new GetSquareMemberRelationsRequest(this);
  }

  public void clear() {
    this.state = null;
    this.continuationToken = null;
    setLimitIsSet(false);
    this.limit = 0;
  }

  /**
   * 
   * @see SquareMemberRelationState
   */
  public SquareMemberRelationState getState() {
    return this.state;
  }

  /**
   * 
   * @see SquareMemberRelationState
   */
  public void setState(SquareMemberRelationState state) {
    this.state = state;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  public String getContinuationToken() {
    return this.continuationToken;
  }

  public void setContinuationToken(String continuationToken) {
    this.continuationToken = continuationToken;
  }

  public void unsetContinuationToken() {
    this.continuationToken = null;
  }

  /** Returns true if field continuationToken is set (has been assigned a value) and false otherwise */
  public boolean isSetContinuationToken() {
    return this.continuationToken != null;
  }

  public void setContinuationTokenIsSet(boolean value) {
    if (!value) {
      this.continuationToken = null;
    }
  }

  public int getLimit() {
    return this.limit;
  }

  public void setLimit(int limit) {
    this.limit = limit;
    setLimitIsSet(true);
  }

  public void unsetLimit() {
    __isset_vector[__LIMIT_ISSET_ID] = false;
  }

  /** Returns true if field limit is set (has been assigned a value) and false otherwise */
  public boolean isSetLimit() {
    return __isset_vector[__LIMIT_ISSET_ID];
  }

  public void setLimitIsSet(boolean value) {
    __isset_vector[__LIMIT_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetSquareMemberRelationsRequest)
      return this.equals((GetSquareMemberRelationsRequest)that);
    return false;
  }

  public boolean equals(GetSquareMemberRelationsRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_continuationToken = true && this.isSetContinuationToken();
    boolean that_present_continuationToken = true && that.isSetContinuationToken();
    if (this_present_continuationToken || that_present_continuationToken) {
      if (!(this_present_continuationToken && that_present_continuationToken))
        return false;
      if (!this.continuationToken.equals(that.continuationToken))
        return false;
    }

    boolean this_present_limit = true;
    boolean that_present_limit = true;
    if (this_present_limit || that_present_limit) {
      if (!(this_present_limit && that_present_limit))
        return false;
      if (this.limit != that.limit)
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

    GetSquareMemberRelationsRequest other = (GetSquareMemberRelationsRequest)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetState(), other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetContinuationToken(), other.isSetContinuationToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContinuationToken()) {
      lastComparison = TBaseHelper.compareTo(this.continuationToken, other.continuationToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetLimit(), other.isSetLimit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLimit()) {
      lastComparison = TBaseHelper.compareTo(this.limit, other.limit);
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
        case 2: // STATE
          if (field.type == TType.I32) {
            this.state = SquareMemberRelationState.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // CONTINUATION_TOKEN
          if (field.type == TType.STRING) {
            this.continuationToken = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // LIMIT
          if (field.type == TType.I32) {
            this.limit = iprot.readI32();
            setLimitIsSet(true);
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
    if (this.state != null) {
      oprot.writeFieldBegin(STATE_FIELD_DESC);
      oprot.writeI32(this.state.getValue());
      oprot.writeFieldEnd();
    }
    if (this.continuationToken != null) {
      oprot.writeFieldBegin(CONTINUATION_TOKEN_FIELD_DESC);
      oprot.writeString(this.continuationToken);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(LIMIT_FIELD_DESC);
    oprot.writeI32(this.limit);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("GetSquareMemberRelationsRequest(");
    boolean first = true;

    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("continuationToken:");
    if (this.continuationToken == null) {
      sb.append("null");
    } else {
      sb.append(this.continuationToken);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("limit:");
    sb.append(this.limit);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

