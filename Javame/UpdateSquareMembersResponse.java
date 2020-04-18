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

public class UpdateSquareMembersResponse implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("UpdateSquareMembersResponse");

  private static final TField UPDATED_ATTRS_FIELD_DESC = new TField("updatedAttrs", TType.SET, (short)1);
  private static final TField EDITOR_FIELD_DESC = new TField("editor", TType.STRUCT, (short)2);
  private static final TField MEMBERS_FIELD_DESC = new TField("members", TType.MAP, (short)3);

  private Hashtable updatedAttrs;
  private SquareMember editor;
  private Hashtable members;

  // isset id assignments

  public UpdateSquareMembersResponse() {
  }

  public UpdateSquareMembersResponse(
    Hashtable updatedAttrs,
    SquareMember editor,
    Hashtable members)
  {
    this();
    this.updatedAttrs = updatedAttrs;
    this.editor = editor;
    this.members = members;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UpdateSquareMembersResponse(UpdateSquareMembersResponse other) {
    if (other.isSetUpdatedAttrs()) {
      Hashtable __this__updatedAttrs = new Hashtable();
      for (Enumeration other_enum = other.updatedAttrs.elements(); other_enum.hasMoreElements(); ) {
        SquareMemberAttribute other_element = (SquareMemberAttribute)other_enum.nextElement();
        __this__updatedAttrs.addElement(other_element);
      }
      this.updatedAttrs = __this__updatedAttrs;
    }
    if (other.isSetEditor()) {
      this.editor = new SquareMember(other.editor);
    }
    if (other.isSetMembers()) {
      Hashtable __this__members = new Hashtable();
      for (Enumeration other_enum = other.members.keys(); other_enum.hasMoreElements(); ) {

        String other_element_key = (String)other_enum.nextElement();
        SquareMember other_element_value = (SquareMember)other.members.get(other_element_key);

        String __this__members_copy_key = other_element_key;

        SquareMember __this__members_copy_value = new SquareMember(other_element_value);

        __this__members.put(__this__members_copy_key, __this__members_copy_value);
      }
      this.members = __this__members;
    }
  }

  public UpdateSquareMembersResponse deepCopy() {
    return new UpdateSquareMembersResponse(this);
  }

  public void clear() {
    this.updatedAttrs = null;
    this.editor = null;
    this.members = null;
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

  public SquareMember getEditor() {
    return this.editor;
  }

  public void setEditor(SquareMember editor) {
    this.editor = editor;
  }

  public void unsetEditor() {
    this.editor = null;
  }

  /** Returns true if field editor is set (has been assigned a value) and false otherwise */
  public boolean isSetEditor() {
    return this.editor != null;
  }

  public void setEditorIsSet(boolean value) {
    if (!value) {
      this.editor = null;
    }
  }

  public int getMembersSize() {
    return (this.members == null) ? 0 : this.members.size();
  }

  public void putToMembers(String key, SquareMember val) {
    if (this.members == null) {
      this.members = new Hashtable();
    }
    this.members.put(key, val);
  }

  public Hashtable getMembers() {
    return this.members;
  }

  public void setMembers(Hashtable members) {
    this.members = members;
  }

  public void unsetMembers() {
    this.members = null;
  }

  /** Returns true if field members is set (has been assigned a value) and false otherwise */
  public boolean isSetMembers() {
    return this.members != null;
  }

  public void setMembersIsSet(boolean value) {
    if (!value) {
      this.members = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UpdateSquareMembersResponse)
      return this.equals((UpdateSquareMembersResponse)that);
    return false;
  }

  public boolean equals(UpdateSquareMembersResponse that) {
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

    boolean this_present_editor = true && this.isSetEditor();
    boolean that_present_editor = true && that.isSetEditor();
    if (this_present_editor || that_present_editor) {
      if (!(this_present_editor && that_present_editor))
        return false;
      if (!this.editor.equals(that.editor))
        return false;
    }

    boolean this_present_members = true && this.isSetMembers();
    boolean that_present_members = true && that.isSetMembers();
    if (this_present_members || that_present_members) {
      if (!(this_present_members && that_present_members))
        return false;
      if (!this.members.equals(that.members))
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

    UpdateSquareMembersResponse other = (UpdateSquareMembersResponse)otherObject;    int lastComparison = 0;

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
    lastComparison = TBaseHelper.compareTo(isSetEditor(), other.isSetEditor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEditor()) {
      lastComparison = this.editor.compareTo(other.editor);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetMembers(), other.isSetMembers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMembers()) {
      lastComparison = TBaseHelper.compareTo(this.members, other.members);
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
        case 1: // UPDATED_ATTRS
          if (field.type == TType.SET) {
            {
              TSet _set441 = iprot.readSetBegin();
              this.updatedAttrs = new Hashtable(2*_set441.size);
              for (int _i442 = 0; _i442 < _set441.size; ++_i442)
              {
                SquareMemberAttribute _elem443;
                _elem443 = SquareMemberAttribute.findByValue(iprot.readI32());
                this.updatedAttrs.put(_elem443, _elem443);
              }
              iprot.readSetEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // EDITOR
          if (field.type == TType.STRUCT) {
            this.editor = new SquareMember();
            this.editor.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // MEMBERS
          if (field.type == TType.MAP) {
            {
              TMap _map444 = iprot.readMapBegin();
              this.members = new Hashtable(2*_map444.size);
              for (int _i445 = 0; _i445 < _map444.size; ++_i445)
              {
                String _key446;
                SquareMember _val447;
                _key446 = iprot.readString();
                _val447 = new SquareMember();
                _val447.read(iprot);
                this.members.put(_key446, _val447);
              }
              iprot.readMapEnd();
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
    if (this.updatedAttrs != null) {
      oprot.writeFieldBegin(UPDATED_ATTRS_FIELD_DESC);
      {
        oprot.writeSetBegin(new TSet(TType.I32, this.updatedAttrs.size()));
        for (Enumeration _iter448_enum = this.updatedAttrs.keys(); _iter448_enum.hasMoreElements(); )         {
          SquareMemberAttribute _iter448 = (SquareMemberAttribute)_iter448_enum.nextElement();
          oprot.writeI32(_iter448.getValue());
        }
        oprot.writeSetEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.editor != null) {
      oprot.writeFieldBegin(EDITOR_FIELD_DESC);
      this.editor.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.members != null) {
      oprot.writeFieldBegin(MEMBERS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRUCT, this.members.size()));
        for (Enumeration _iter449_enum = this.members.keys(); _iter449_enum.hasMoreElements(); )         {
          String _iter449 = (String)_iter449_enum.nextElement();
          oprot.writeString(_iter449);
          ((SquareMember)this.members.get(_iter449)).write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("UpdateSquareMembersResponse(");
    boolean first = true;

    sb.append("updatedAttrs:");
    if (this.updatedAttrs == null) {
      sb.append("null");
    } else {
      sb.append(this.updatedAttrs);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("editor:");
    if (this.editor == null) {
      sb.append("null");
    } else {
      sb.append(this.editor);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("members:");
    if (this.members == null) {
      sb.append("null");
    } else {
      sb.append(this.members);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

