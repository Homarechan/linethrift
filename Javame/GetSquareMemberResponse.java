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

public class GetSquareMemberResponse implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("GetSquareMemberResponse");

  private static final TField SQUARE_MEMBER_FIELD_DESC = new TField("squareMember", TType.STRUCT, (short)1);
  private static final TField RELATION_FIELD_DESC = new TField("relation", TType.STRUCT, (short)2);
  private static final TField ONE_ON_ONE_CHAT_MID_FIELD_DESC = new TField("oneOnOneChatMid", TType.STRING, (short)3);

  private SquareMember squareMember;
  private SquareMemberRelation relation;
  private String oneOnOneChatMid;

  // isset id assignments

  public GetSquareMemberResponse() {
  }

  public GetSquareMemberResponse(
    SquareMember squareMember,
    SquareMemberRelation relation,
    String oneOnOneChatMid)
  {
    this();
    this.squareMember = squareMember;
    this.relation = relation;
    this.oneOnOneChatMid = oneOnOneChatMid;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetSquareMemberResponse(GetSquareMemberResponse other) {
    if (other.isSetSquareMember()) {
      this.squareMember = new SquareMember(other.squareMember);
    }
    if (other.isSetRelation()) {
      this.relation = new SquareMemberRelation(other.relation);
    }
    if (other.isSetOneOnOneChatMid()) {
      this.oneOnOneChatMid = other.oneOnOneChatMid;
    }
  }

  public GetSquareMemberResponse deepCopy() {
    return new GetSquareMemberResponse(this);
  }

  public void clear() {
    this.squareMember = null;
    this.relation = null;
    this.oneOnOneChatMid = null;
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

  public SquareMemberRelation getRelation() {
    return this.relation;
  }

  public void setRelation(SquareMemberRelation relation) {
    this.relation = relation;
  }

  public void unsetRelation() {
    this.relation = null;
  }

  /** Returns true if field relation is set (has been assigned a value) and false otherwise */
  public boolean isSetRelation() {
    return this.relation != null;
  }

  public void setRelationIsSet(boolean value) {
    if (!value) {
      this.relation = null;
    }
  }

  public String getOneOnOneChatMid() {
    return this.oneOnOneChatMid;
  }

  public void setOneOnOneChatMid(String oneOnOneChatMid) {
    this.oneOnOneChatMid = oneOnOneChatMid;
  }

  public void unsetOneOnOneChatMid() {
    this.oneOnOneChatMid = null;
  }

  /** Returns true if field oneOnOneChatMid is set (has been assigned a value) and false otherwise */
  public boolean isSetOneOnOneChatMid() {
    return this.oneOnOneChatMid != null;
  }

  public void setOneOnOneChatMidIsSet(boolean value) {
    if (!value) {
      this.oneOnOneChatMid = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetSquareMemberResponse)
      return this.equals((GetSquareMemberResponse)that);
    return false;
  }

  public boolean equals(GetSquareMemberResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareMember = true && this.isSetSquareMember();
    boolean that_present_squareMember = true && that.isSetSquareMember();
    if (this_present_squareMember || that_present_squareMember) {
      if (!(this_present_squareMember && that_present_squareMember))
        return false;
      if (!this.squareMember.equals(that.squareMember))
        return false;
    }

    boolean this_present_relation = true && this.isSetRelation();
    boolean that_present_relation = true && that.isSetRelation();
    if (this_present_relation || that_present_relation) {
      if (!(this_present_relation && that_present_relation))
        return false;
      if (!this.relation.equals(that.relation))
        return false;
    }

    boolean this_present_oneOnOneChatMid = true && this.isSetOneOnOneChatMid();
    boolean that_present_oneOnOneChatMid = true && that.isSetOneOnOneChatMid();
    if (this_present_oneOnOneChatMid || that_present_oneOnOneChatMid) {
      if (!(this_present_oneOnOneChatMid && that_present_oneOnOneChatMid))
        return false;
      if (!this.oneOnOneChatMid.equals(that.oneOnOneChatMid))
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

    GetSquareMemberResponse other = (GetSquareMemberResponse)otherObject;    int lastComparison = 0;

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
    lastComparison = TBaseHelper.compareTo(isSetRelation(), other.isSetRelation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRelation()) {
      lastComparison = this.relation.compareTo(other.relation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetOneOnOneChatMid(), other.isSetOneOnOneChatMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOneOnOneChatMid()) {
      lastComparison = TBaseHelper.compareTo(this.oneOnOneChatMid, other.oneOnOneChatMid);
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
        case 1: // SQUARE_MEMBER
          if (field.type == TType.STRUCT) {
            this.squareMember = new SquareMember();
            this.squareMember.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // RELATION
          if (field.type == TType.STRUCT) {
            this.relation = new SquareMemberRelation();
            this.relation.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // ONE_ON_ONE_CHAT_MID
          if (field.type == TType.STRING) {
            this.oneOnOneChatMid = iprot.readString();
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
    if (this.squareMember != null) {
      oprot.writeFieldBegin(SQUARE_MEMBER_FIELD_DESC);
      this.squareMember.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.relation != null) {
      oprot.writeFieldBegin(RELATION_FIELD_DESC);
      this.relation.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.oneOnOneChatMid != null) {
      oprot.writeFieldBegin(ONE_ON_ONE_CHAT_MID_FIELD_DESC);
      oprot.writeString(this.oneOnOneChatMid);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("GetSquareMemberResponse(");
    boolean first = true;

    sb.append("squareMember:");
    if (this.squareMember == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMember);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("relation:");
    if (this.relation == null) {
      sb.append("null");
    } else {
      sb.append(this.relation);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("oneOnOneChatMid:");
    if (this.oneOnOneChatMid == null) {
      sb.append("null");
    } else {
      sb.append(this.oneOnOneChatMid);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

