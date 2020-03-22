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


class TMessageBoxWrapUp implements TBase {
  
  static var STRUCT_DESC = { new TStruct("TMessageBoxWrapUp"); };
  static var MESSAGE_BOX_FIELD_DESC = { new TField("messageBox", TType.STRUCT, 1); };
  static var NAME_FIELD_DESC = { new TField("name", TType.STRING, 2); };
  static var CONTACTS_FIELD_DESC = { new TField("contacts", TType.LIST, 3); };
  static var PICTURE_REVISION_FIELD_DESC = { new TField("pictureRevision", TType.STRING, 4); };

  @:isVar
  public var messageBox(get,set) : TMessageBox;
  @:isVar
  public var name(get,set) : String;
  @:isVar
  public var contacts(get,set) : List< Contact>;
  @:isVar
  public var pictureRevision(get,set) : String;

  inline static var MESSAGEBOX_FIELD_ID : Int = 1;
  inline static var NAME_FIELD_ID : Int = 2;
  inline static var CONTACTS_FIELD_ID : Int = 3;
  inline static var PICTUREREVISION_FIELD_ID : Int = 4;


  public function new() {
  }

  public function get_messageBox() : TMessageBox {
    return this.messageBox;
  }

  public function set_messageBox(messageBox:TMessageBox) : TMessageBox {
    this.messageBox = messageBox;
    return this.messageBox;
  }

  public function unsetMessageBox() : Void {
    this.messageBox = null;
  }

  // Returns true if field messageBox is set (has been assigned a value) and false otherwise
  public function isSetMessageBox() : Bool {
    return this.messageBox != null;
  }

  public function get_name() : String {
    return this.name;
  }

  public function set_name(name:String) : String {
    this.name = name;
    return this.name;
  }

  public function unsetName() : Void {
    this.name = null;
  }

  // Returns true if field name is set (has been assigned a value) and false otherwise
  public function isSetName() : Bool {
    return this.name != null;
  }

  public function get_contacts() : List< Contact> {
    return this.contacts;
  }

  public function set_contacts(contacts:List< Contact>) : List< Contact> {
    this.contacts = contacts;
    return this.contacts;
  }

  public function unsetContacts() : Void {
    this.contacts = null;
  }

  // Returns true if field contacts is set (has been assigned a value) and false otherwise
  public function isSetContacts() : Bool {
    return this.contacts != null;
  }

  public function get_pictureRevision() : String {
    return this.pictureRevision;
  }

  public function set_pictureRevision(pictureRevision:String) : String {
    this.pictureRevision = pictureRevision;
    return this.pictureRevision;
  }

  public function unsetPictureRevision() : Void {
    this.pictureRevision = null;
  }

  // Returns true if field pictureRevision is set (has been assigned a value) and false otherwise
  public function isSetPictureRevision() : Bool {
    return this.pictureRevision != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case MESSAGEBOX_FIELD_ID:
      if (value == null) {
        unsetMessageBox();
      } else {
        this.messageBox = value;
      }

    case NAME_FIELD_ID:
      if (value == null) {
        unsetName();
      } else {
        this.name = value;
      }

    case CONTACTS_FIELD_ID:
      if (value == null) {
        unsetContacts();
      } else {
        this.contacts = value;
      }

    case PICTUREREVISION_FIELD_ID:
      if (value == null) {
        unsetPictureRevision();
      } else {
        this.pictureRevision = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case MESSAGEBOX_FIELD_ID:
      return this.messageBox;
    case NAME_FIELD_ID:
      return this.name;
    case CONTACTS_FIELD_ID:
      return this.contacts;
    case PICTUREREVISION_FIELD_ID:
      return this.pictureRevision;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case MESSAGEBOX_FIELD_ID:
      return isSetMessageBox();
    case NAME_FIELD_ID:
      return isSetName();
    case CONTACTS_FIELD_ID:
      return isSetContacts();
    case PICTUREREVISION_FIELD_ID:
      return isSetPictureRevision();
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
          case MESSAGEBOX_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.messageBox = new TMessageBox();
              this.messageBox.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case NAME_FIELD_ID:
            if (field.type == TType.STRING) {
              this.name = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CONTACTS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list281 = iprot.readListBegin();
                this.contacts = new List< Contact>();
                for( _i282 in 0 ... _list281.size)
                {
                  var _elem283 : Contact;
                  _elem283 = new Contact();
                  _elem283.read(iprot);
                  this.contacts.add(_elem283);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PICTUREREVISION_FIELD_ID:
            if (field.type == TType.STRING) {
              this.pictureRevision = iprot.readString();
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
      if (this.messageBox != null) {
        oprot.writeFieldBegin(MESSAGE_BOX_FIELD_DESC);
        this.messageBox.write(oprot);
        oprot.writeFieldEnd();
      }
      if (this.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(this.name);
        oprot.writeFieldEnd();
      }
      if (this.contacts != null) {
        oprot.writeFieldBegin(CONTACTS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.contacts.length));
          for( elem284 in this.contacts)
          {
            elem284.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.pictureRevision != null) {
        oprot.writeFieldBegin(PICTURE_REVISION_FIELD_DESC);
        oprot.writeString(this.pictureRevision);
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
    var ret : String = "TMessageBoxWrapUp(";
    var first : Bool = true;

    ret += "messageBox:";
    if (this.messageBox == null) {
      ret += "null";
    } else {
      ret += this.messageBox;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "name:";
    if (this.name == null) {
      ret += "null";
    } else {
      ret += this.name;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "contacts:";
    if (this.contacts == null) {
      ret += "null";
    } else {
      ret += this.contacts;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "pictureRevision:";
    if (this.pictureRevision == null) {
      ret += "null";
    } else {
      ret += this.pictureRevision;
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

