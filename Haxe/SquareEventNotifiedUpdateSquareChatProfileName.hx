/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;
import haxe.io.Bytes;
import haxe.ds.IntMap;
import haxe.ds.StringMap;
import haxe.ds.ObjectMap;

#if flash
import flash.errors.ArgumentError;
#end

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;


class SquareEventNotifiedUpdateSquareChatProfileName implements TBase {
  
  static var STRUCT_DESC = { new TStruct("SquareEventNotifiedUpdateSquareChatProfileName"); };
  static var SQUARE_CHAT_MID_FIELD_DESC = { new TField("squareChatMid", TType.STRING, 1); };
  static var EDITOR_FIELD_DESC = { new TField("editor", TType.STRUCT, 2); };
  static var UPDATED_CHAT_NAME_FIELD_DESC = { new TField("updatedChatName", TType.STRING, 3); };

  @:isVar
  public var squareChatMid(get,set) : String;
  @:isVar
  public var editor(get,set) : SquareMember;
  @:isVar
  public var updatedChatName(get,set) : String;

  inline static var SQUARECHATMID_FIELD_ID : Int = 1;
  inline static var EDITOR_FIELD_ID : Int = 2;
  inline static var UPDATEDCHATNAME_FIELD_ID : Int = 3;


  public function new() {
  }

  public function get_squareChatMid() : String {
    return this.squareChatMid;
  }

  public function set_squareChatMid(squareChatMid:String) : String {
    this.squareChatMid = squareChatMid;
    return this.squareChatMid;
  }

  public function unsetSquareChatMid() : Void {
    this.squareChatMid = null;
  }

  // Returns true if field squareChatMid is set (has been assigned a value) and false otherwise
  public function isSetSquareChatMid() : Bool {
    return this.squareChatMid != null;
  }

  public function get_editor() : SquareMember {
    return this.editor;
  }

  public function set_editor(editor:SquareMember) : SquareMember {
    this.editor = editor;
    return this.editor;
  }

  public function unsetEditor() : Void {
    this.editor = null;
  }

  // Returns true if field editor is set (has been assigned a value) and false otherwise
  public function isSetEditor() : Bool {
    return this.editor != null;
  }

  public function get_updatedChatName() : String {
    return this.updatedChatName;
  }

  public function set_updatedChatName(updatedChatName:String) : String {
    this.updatedChatName = updatedChatName;
    return this.updatedChatName;
  }

  public function unsetUpdatedChatName() : Void {
    this.updatedChatName = null;
  }

  // Returns true if field updatedChatName is set (has been assigned a value) and false otherwise
  public function isSetUpdatedChatName() : Bool {
    return this.updatedChatName != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SQUARECHATMID_FIELD_ID:
      if (value == null) {
        unsetSquareChatMid();
      } else {
        this.squareChatMid = value;
      }

    case EDITOR_FIELD_ID:
      if (value == null) {
        unsetEditor();
      } else {
        this.editor = value;
      }

    case UPDATEDCHATNAME_FIELD_ID:
      if (value == null) {
        unsetUpdatedChatName();
      } else {
        this.updatedChatName = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SQUARECHATMID_FIELD_ID:
      return this.squareChatMid;
    case EDITOR_FIELD_ID:
      return this.editor;
    case UPDATEDCHATNAME_FIELD_ID:
      return this.updatedChatName;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SQUARECHATMID_FIELD_ID:
      return isSetSquareChatMid();
    case EDITOR_FIELD_ID:
      return isSetEditor();
    case UPDATEDCHATNAME_FIELD_ID:
      return isSetUpdatedChatName();
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function read( iprot : TProtocol) : Void {
    iprot.IncrementRecursionDepth();
    try
    {
      var field : TField;
      iprot.readStructBegin();
      while (true)
      {
        field = iprot.readFieldBegin();
        if (field.type == TType.STOP) { 
          break;
        }
        switch (field.id)
        {
          case SQUARECHATMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.squareChatMid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case EDITOR_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.editor = new SquareMember();
              this.editor.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case UPDATEDCHATNAME_FIELD_ID:
            if (field.type == TType.STRING) {
              this.updatedChatName = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          default:
            TProtocolUtil.skip(iprot, field.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      iprot.DecrementRecursionDepth();
    }
    catch(e:Dynamic)
    {
      iprot.DecrementRecursionDepth();
      throw e;
    }

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public function write(oprot:TProtocol) : Void {
    validate();
    oprot.IncrementRecursionDepth();
    try
    {
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
      if (this.updatedChatName != null) {
        oprot.writeFieldBegin(UPDATED_CHAT_NAME_FIELD_DESC);
        oprot.writeString(this.updatedChatName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
      oprot.DecrementRecursionDepth();
    }
    catch(e:Dynamic)
    {
      oprot.DecrementRecursionDepth();
      throw e;
    }
  }

  public function toString() : String {
    var ret : String = "SquareEventNotifiedUpdateSquareChatProfileName(";
    var first : Bool = true;

    ret += "squareChatMid:";
    if (this.squareChatMid == null) {
      ret += "null";
    } else {
      ret += this.squareChatMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "editor:";
    if (this.editor == null) {
      ret += "null";
    } else {
      ret += this.editor;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "updatedChatName:";
    if (this.updatedChatName == null) {
      ret += "null";
    } else {
      ret += this.updatedChatName;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

