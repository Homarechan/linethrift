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

public class SquareEventNotifiedUpdateSquareChatProfileImage implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("SquareEventNotifiedUpdateSquareChatProfileImage");

  private static final TField SQUARE_CHAT_MID_FIELD_DESC = new TField("squareChatMid", TType.STRING, (short)1);
  private static final TField EDITOR_FIELD_DESC = new TField("editor", TType.STRUCT, (short)2);

  private String squareChatMid;
  private SquareMember editor;

  // isset id assignments

  public SquareEventNotifiedUpdateSquareChatProfileImage() {
  }

  public SquareEventNotifiedUpdateSquareChatProfileImage(
    String squareChatMid,
    SquareMember editor)
  {
    this();
    this.squareChatMid = squareChatMid;
    this.editor = editor;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareEventNotifiedUpdateSquareChatProfileImage(SquareEventNotifiedUpdateSquareChatProfileImage other) {
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
    if (other.isSetEditor()) {
      this.editor = new SquareMember(other.editor);
    }
  }

  public SquareEventNotifiedUpdateSquareChatProfileImage deepCopy() {
    return new SquareEventNotifiedUpdateSquareChatProfileImage(this);
  }

  public void clear() {
    this.squareChatMid = null;
    this.editor = null;
  }

  public String getSquareChatMid() {
    return this.squareChatMid;
  }

  public void setSquareChatMid(String squareChatMid) {
    this.squareChatMid = squareChatMid;
  }

  public void unsetSquareChatMid() {
    this.squareChatMid = null;
  }

  /** Returns true if field squareChatMid is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChatMid() {
    return this.squareChatMid != null;
  }

  public void setSquareChatMidIsSet(boolean value) {
    if (!value) {
      this.squareChatMid = null;
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

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareEventNotifiedUpdateSquareChatProfileImage)
      return this.equals((SquareEventNotifiedUpdateSquareChatProfileImage)that);
    return false;
  }

  public boolean equals(SquareEventNotifiedUpdateSquareChatProfileImage that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareChatMid = true && this.isSetSquareChatMid();
    boolean that_present_squareChatMid = true && that.isSetSquareChatMid();
    if (this_present_squareChatMid || that_present_squareChatMid) {
      if (!(this_present_squareChatMid && that_present_squareChatMid))
        return false;
      if (!this.squareChatMid.equals(that.squareChatMid))
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

    return true;
  }

  public int hashCode() {
    return 0;
  }

  public int compareTo(Object otherObject) {
    if (!getClass().equals(otherObject.getClass())) {
      return getClass().getName().compareTo(otherObject.getClass().getName());
    }

    SquareEventNotifiedUpdateSquareChatProfileImage other = (SquareEventNotifiedUpdateSquareChatProfileImage)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetSquareChatMid(), other.isSetSquareChatMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatMid()) {
      lastComparison = TBaseHelper.compareTo(this.squareChatMid, other.squareChatMid);
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
        case 1: // SQUARE_CHAT_MID
          if (field.type == TType.STRING) {
            this.squareChatMid = iprot.readString();
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
    if (this.squareChatMid != null) {
      oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
      oprot.writeString(this.squareChatMid);
      oprot.writeFieldEnd();
    }
    if (this.editor != null) {
      oprot.writeFieldBegin(EDITOR_FIELD_DESC);
      this.editor.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("SquareEventNotifiedUpdateSquareChatProfileImage(");
    boolean first = true;

    sb.append("squareChatMid:");
    if (this.squareChatMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMid);
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
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

