/**
 * Autogenerated by Thrift Compiler (0.11.0)
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


class SquareEventNotifiedDeleteSquareChat implements TBase {
  
  static var STRUCT_DESC = { new TStruct("SquareEventNotifiedDeleteSquareChat"); };
  static var SQUARE_CHAT_FIELD_DESC = { new TField("squareChat", TType.STRUCT, 1); };

  @:isVar
  public var squareChat(get,set) : SquareChat;

  inline static var SQUARECHAT_FIELD_ID : Int = 1;


  public function new() {
  }

  public function get_squareChat() : SquareChat {
    return this.squareChat;
  }

  public function set_squareChat(squareChat:SquareChat) : SquareChat {
    this.squareChat = squareChat;
    return this.squareChat;
  }

  public function unsetSquareChat() : Void {
    this.squareChat = null;
  }

  // Returns true if field squareChat is set (has been assigned a value) and false otherwise
  public function isSetSquareChat() : Bool {
    return this.squareChat != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SQUARECHAT_FIELD_ID:
      if (value == null) {
        unsetSquareChat();
      } else {
        this.squareChat = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SQUARECHAT_FIELD_ID:
      return this.squareChat;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SQUARECHAT_FIELD_ID:
      return isSetSquareChat();
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
          case SQUARECHAT_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.squareChat = new SquareChat();
              this.squareChat.read(iprot);
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
      if (this.squareChat != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_FIELD_DESC);
        this.squareChat.write(oprot);
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
    var ret : String = "SquareEventNotifiedDeleteSquareChat(";
    var first : Bool = true;

    ret += "squareChat:";
    if (this.squareChat == null) {
      ret += "null";
    } else {
      ret += this.squareChat;
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

