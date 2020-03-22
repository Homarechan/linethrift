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


class FindGroupByTicket_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("findGroupByTicket_args"); };
  static var TICKET_ID_FIELD_DESC = { new TField("ticketId", TType.STRING, 1); };

  @:isVar
  public var ticketId(get,set) : String;

  inline static var TICKETID_FIELD_ID : Int = 1;


  public function new() {
  }

  public function get_ticketId() : String {
    return this.ticketId;
  }

  public function set_ticketId(ticketId:String) : String {
    this.ticketId = ticketId;
    return this.ticketId;
  }

  public function unsetTicketId() : Void {
    this.ticketId = null;
  }

  // Returns true if field ticketId is set (has been assigned a value) and false otherwise
  public function isSetTicketId() : Bool {
    return this.ticketId != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case TICKETID_FIELD_ID:
      if (value == null) {
        unsetTicketId();
      } else {
        this.ticketId = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case TICKETID_FIELD_ID:
      return this.ticketId;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case TICKETID_FIELD_ID:
      return isSetTicketId();
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
          case TICKETID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.ticketId = iprot.readString();
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
      if (this.ticketId != null) {
        oprot.writeFieldBegin(TICKET_ID_FIELD_DESC);
        oprot.writeString(this.ticketId);
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
    var ret : String = "findGroupByTicket_args(";
    var first : Bool = true;

    ret += "ticketId:";
    if (this.ticketId == null) {
      ret += "null";
    } else {
      ret += this.ticketId;
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

