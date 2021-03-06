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


class CreateSquareChatAnnouncementResponse implements TBase {
  
  static var STRUCT_DESC = { new TStruct("CreateSquareChatAnnouncementResponse"); };
  static var ANNOUNCEMENT_FIELD_DESC = { new TField("announcement", TType.STRUCT, 1); };

  @:isVar
  public var announcement(get,set) : SquareChatAnnouncement;

  inline static var ANNOUNCEMENT_FIELD_ID : Int = 1;


  public function new() {
  }

  public function get_announcement() : SquareChatAnnouncement {
    return this.announcement;
  }

  public function set_announcement(announcement:SquareChatAnnouncement) : SquareChatAnnouncement {
    this.announcement = announcement;
    return this.announcement;
  }

  public function unsetAnnouncement() : Void {
    this.announcement = null;
  }

  // Returns true if field announcement is set (has been assigned a value) and false otherwise
  public function isSetAnnouncement() : Bool {
    return this.announcement != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case ANNOUNCEMENT_FIELD_ID:
      if (value == null) {
        unsetAnnouncement();
      } else {
        this.announcement = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case ANNOUNCEMENT_FIELD_ID:
      return this.announcement;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case ANNOUNCEMENT_FIELD_ID:
      return isSetAnnouncement();
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
          case ANNOUNCEMENT_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.announcement = new SquareChatAnnouncement();
              this.announcement.read(iprot);
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
      if (this.announcement != null) {
        oprot.writeFieldBegin(ANNOUNCEMENT_FIELD_DESC);
        this.announcement.write(oprot);
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
    var ret : String = "CreateSquareChatAnnouncementResponse(";
    var first : Bool = true;

    ret += "announcement:";
    if (this.announcement == null) {
      ret += "null";
    } else {
      ret += this.announcement;
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

