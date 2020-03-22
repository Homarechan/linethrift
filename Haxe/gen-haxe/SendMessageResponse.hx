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


class SendMessageResponse implements TBase {
  
  static var STRUCT_DESC = { new TStruct("SendMessageResponse"); };
  static var CREATED_SQUARE_MESSAGE_FIELD_DESC = { new TField("createdSquareMessage", TType.STRUCT, 1); };

  @:isVar
  public var createdSquareMessage(get,set) : SquareMessage;

  inline static var CREATEDSQUAREMESSAGE_FIELD_ID : Int = 1;


  public function new() {
  }

  public function get_createdSquareMessage() : SquareMessage {
    return this.createdSquareMessage;
  }

  public function set_createdSquareMessage(createdSquareMessage:SquareMessage) : SquareMessage {
    this.createdSquareMessage = createdSquareMessage;
    return this.createdSquareMessage;
  }

  public function unsetCreatedSquareMessage() : Void {
    this.createdSquareMessage = null;
  }

  // Returns true if field createdSquareMessage is set (has been assigned a value) and false otherwise
  public function isSetCreatedSquareMessage() : Bool {
    return this.createdSquareMessage != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case CREATEDSQUAREMESSAGE_FIELD_ID:
      if (value == null) {
        unsetCreatedSquareMessage();
      } else {
        this.createdSquareMessage = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case CREATEDSQUAREMESSAGE_FIELD_ID:
      return this.createdSquareMessage;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case CREATEDSQUAREMESSAGE_FIELD_ID:
      return isSetCreatedSquareMessage();
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
          case CREATEDSQUAREMESSAGE_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.createdSquareMessage = new SquareMessage();
              this.createdSquareMessage.read(iprot);
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
      if (this.createdSquareMessage != null) {
        oprot.writeFieldBegin(CREATED_SQUARE_MESSAGE_FIELD_DESC);
        this.createdSquareMessage.write(oprot);
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
    var ret : String = "SendMessageResponse(";
    var first : Bool = true;

    ret += "createdSquareMessage:";
    if (this.createdSquareMessage == null) {
      ret += "null";
    } else {
      ret += this.createdSquareMessage;
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
