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

public class GetSquareMemberRelationsResponse implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("GetSquareMemberRelationsResponse");

  private static final TField SQUARE_MEMBERS_FIELD_DESC = new TField("squareMembers", TType.LIST, (short)1);
  private static final TField RELATIONS_FIELD_DESC = new TField("relations", TType.MAP, (short)2);
  private static final TField CONTINUATION_TOKEN_FIELD_DESC = new TField("continuationToken", TType.STRING, (short)3);

  private Vector squareMembers;
  private Hashtable relations;
  private String continuationToken;

  // isset id assignments

  public GetSquareMemberRelationsResponse() {
  }

  public GetSquareMemberRelationsResponse(
    Vector squareMembers,
    Hashtable relations,
    String continuationToken)
  {
    this();
    this.squareMembers = squareMembers;
    this.relations = relations;
    this.continuationToken = continuationToken;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetSquareMemberRelationsResponse(GetSquareMemberRelationsResponse other) {
    if (other.isSetSquareMembers()) {
      Vector __this__squareMembers = new Vector();
      for (Enumeration other_enum = other.squareMembers.elements(); other_enum.hasMoreElements(); ) {
        SquareMember other_element = (SquareMember)other_enum.nextElement();
        __this__squareMembers.addElement(new SquareMember(other_element));
      }
      this.squareMembers = __this__squareMembers;
    }
    if (other.isSetRelations()) {
      Hashtable __this__relations = new Hashtable();
      for (Enumeration other_enum = other.relations.keys(); other_enum.hasMoreElements(); ) {

        String other_element_key = (String)other_enum.nextElement();
        SquareMemberRelation other_element_value = (SquareMemberRelation)other.relations.get(other_element_key);

        String __this__relations_copy_key = other_element_key;

        SquareMemberRelation __this__relations_copy_value = new SquareMemberRelation(other_element_value);

        __this__relations.put(__this__relations_copy_key, __this__relations_copy_value);
      }
      this.relations = __this__relations;
    }
    if (other.isSetContinuationToken()) {
      this.continuationToken = other.continuationToken;
    }
  }

  public GetSquareMemberRelationsResponse deepCopy() {
    return new GetSquareMemberRelationsResponse(this);
  }

  public void clear() {
    this.squareMembers = null;
    this.relations = null;
    this.continuationToken = null;
  }

  public int getSquareMembersSize() {
    return (this.squareMembers == null) ? 0 : this.squareMembers.size();
  }

  public Enumeration getSquareMembersEnumeration() {
    return (this.squareMembers == null) ? null : this.squareMembers.elements();
  }

  public void addToSquareMembers(SquareMember elem) {
    if (this.squareMembers == null) {
      this.squareMembers = new Vector();
    }
    this.squareMembers.addElement(elem);
  }

  public Vector getSquareMembers() {
    return this.squareMembers;
  }

  public void setSquareMembers(Vector squareMembers) {
    this.squareMembers = squareMembers;
  }

  public void unsetSquareMembers() {
    this.squareMembers = null;
  }

  /** Returns true if field squareMembers is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareMembers() {
    return this.squareMembers != null;
  }

  public void setSquareMembersIsSet(boolean value) {
    if (!value) {
      this.squareMembers = null;
    }
  }

  public int getRelationsSize() {
    return (this.relations == null) ? 0 : this.relations.size();
  }

  public void putToRelations(String key, SquareMemberRelation val) {
    if (this.relations == null) {
      this.relations = new Hashtable();
    }
    this.relations.put(key, val);
  }

  public Hashtable getRelations() {
    return this.relations;
  }

  public void setRelations(Hashtable relations) {
    this.relations = relations;
  }

  public void unsetRelations() {
    this.relations = null;
  }

  /** Returns true if field relations is set (has been assigned a value) and false otherwise */
  public boolean isSetRelations() {
    return this.relations != null;
  }

  public void setRelationsIsSet(boolean value) {
    if (!value) {
      this.relations = null;
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

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetSquareMemberRelationsResponse)
      return this.equals((GetSquareMemberRelationsResponse)that);
    return false;
  }

  public boolean equals(GetSquareMemberRelationsResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareMembers = true && this.isSetSquareMembers();
    boolean that_present_squareMembers = true && that.isSetSquareMembers();
    if (this_present_squareMembers || that_present_squareMembers) {
      if (!(this_present_squareMembers && that_present_squareMembers))
        return false;
      if (!this.squareMembers.equals(that.squareMembers))
        return false;
    }

    boolean this_present_relations = true && this.isSetRelations();
    boolean that_present_relations = true && that.isSetRelations();
    if (this_present_relations || that_present_relations) {
      if (!(this_present_relations && that_present_relations))
        return false;
      if (!this.relations.equals(that.relations))
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

    return true;
  }

  public int hashCode() {
    return 0;
  }

  public int compareTo(Object otherObject) {
    if (!getClass().equals(otherObject.getClass())) {
      return getClass().getName().compareTo(otherObject.getClass().getName());
    }

    GetSquareMemberRelationsResponse other = (GetSquareMemberRelationsResponse)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetSquareMembers(), other.isSetSquareMembers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareMembers()) {
      lastComparison = TBaseHelper.compareTo(this.squareMembers, other.squareMembers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetRelations(), other.isSetRelations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRelations()) {
      lastComparison = TBaseHelper.compareTo(this.relations, other.relations);
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
        case 1: // SQUARE_MEMBERS
          if (field.type == TType.LIST) {
            {
              TList _list369 = iprot.readListBegin();
              this.squareMembers = new Vector(_list369.size);
              for (int _i370 = 0; _i370 < _list369.size; ++_i370)
              {
                SquareMember _elem371;
                _elem371 = new SquareMember();
                _elem371.read(iprot);
                this.squareMembers.addElement(_elem371);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // RELATIONS
          if (field.type == TType.MAP) {
            {
              TMap _map372 = iprot.readMapBegin();
              this.relations = new Hashtable(2*_map372.size);
              for (int _i373 = 0; _i373 < _map372.size; ++_i373)
              {
                String _key374;
                SquareMemberRelation _val375;
                _key374 = iprot.readString();
                _val375 = new SquareMemberRelation();
                _val375.read(iprot);
                this.relations.put(_key374, _val375);
              }
              iprot.readMapEnd();
            }
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
    if (this.squareMembers != null) {
      oprot.writeFieldBegin(SQUARE_MEMBERS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.squareMembers.size()));
        for (Enumeration _iter376_enum = this.squareMembers.elements(); _iter376_enum.hasMoreElements(); )         {
          SquareMember _iter376 = (SquareMember)_iter376_enum.nextElement();
          _iter376.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.relations != null) {
      oprot.writeFieldBegin(RELATIONS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRUCT, this.relations.size()));
        for (Enumeration _iter377_enum = this.relations.keys(); _iter377_enum.hasMoreElements(); )         {
          String _iter377 = (String)_iter377_enum.nextElement();
          oprot.writeString(_iter377);
          ((SquareMemberRelation)this.relations.get(_iter377)).write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.continuationToken != null) {
      oprot.writeFieldBegin(CONTINUATION_TOKEN_FIELD_DESC);
      oprot.writeString(this.continuationToken);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("GetSquareMemberRelationsResponse(");
    boolean first = true;

    sb.append("squareMembers:");
    if (this.squareMembers == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMembers);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("relations:");
    if (this.relations == null) {
      sb.append("null");
    } else {
      sb.append(this.relations);
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
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

