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


class TMessageBoxWrapUpResponse implements TBase {
  
  static var STRUCT_DESC = { new TStruct("TMessageBoxWrapUpResponse"); };
  static var MESSAGE_BOX_WRAP_UP_LIST_FIELD_DESC = { new TField("messageBoxWrapUpList", TType.LIST, 1); };
  static var TOTAL_SIZE_FIELD_DESC = { new TField("totalSize", TType.I32, 2); };

  @:isVar
  public var messageBoxWrapUpList(get,set) : List< TMessageBoxWrapUp>;
  @:isVar
  public var totalSize(get,set) : haxe.Int32;

  inline static var MESSAGEBOXWRAPUPLIST_FIELD_ID : Int = 1;
  inline static var TOTALSIZE_FIELD_ID : Int = 2;

  private var __isset_totalSize : Bool = false;

  public function new() {
  }

  public function get_messageBoxWrapUpList() : List< TMessageBoxWrapUp> {
    return this.messageBoxWrapUpList;
  }

  public function set_messageBoxWrapUpList(messageBoxWrapUpList:List< TMessageBoxWrapUp>) : List< TMessageBoxWrapUp> {
    this.messageBoxWrapUpList = messageBoxWrapUpList;
    return this.messageBoxWrapUpList;
  }

  public function unsetMessageBoxWrapUpList() : Void {
    this.messageBoxWrapUpList = null;
  }

  // Returns true if field messageBoxWrapUpList is set (has been assigned a value) and false otherwise
  public function isSetMessageBoxWrapUpList() : Bool {
    return this.messageBoxWrapUpList != null;
  }

  public function get_totalSize() : haxe.Int32 {
    return this.totalSize;
  }

  public function set_totalSize(totalSize:haxe.Int32) : haxe.Int32 {
    this.totalSize = totalSize;
    this.__isset_totalSize = true;
    return this.totalSize;
  }

  public function unsetTotalSize() : Void {
    this.__isset_totalSize = false;
  }

  // Returns true if field totalSize is set (has been assigned a value) and false otherwise
  public function isSetTotalSize() : Bool {
    return this.__isset_totalSize;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case MESSAGEBOXWRAPUPLIST_FIELD_ID:
      if (value == null) {
        unsetMessageBoxWrapUpList();
      } else {
        this.messageBoxWrapUpList = value;
      }

    case TOTALSIZE_FIELD_ID:
      if (value == null) {
        unsetTotalSize();
      } else {
        this.totalSize = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case MESSAGEBOXWRAPUPLIST_FIELD_ID:
      return this.messageBoxWrapUpList;
    case TOTALSIZE_FIELD_ID:
      return this.totalSize;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case MESSAGEBOXWRAPUPLIST_FIELD_ID:
      return isSetMessageBoxWrapUpList();
    case TOTALSIZE_FIELD_ID:
      return isSetTotalSize();
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
          case MESSAGEBOXWRAPUPLIST_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list285 = iprot.readListBegin();
                this.messageBoxWrapUpList = new List< TMessageBoxWrapUp>();
                for( _i286 in 0 ... _list285.size)
                {
                  var _elem287 : TMessageBoxWrapUp;
                  _elem287 = new TMessageBoxWrapUp();
                  _elem287.read(iprot);
                  this.messageBoxWrapUpList.add(_elem287);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case TOTALSIZE_FIELD_ID:
            if (field.type == TType.I32) {
              this.totalSize = iprot.readI32();
              this.__isset_totalSize = true;
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
      if (this.messageBoxWrapUpList != null) {
        oprot.writeFieldBegin(MESSAGE_BOX_WRAP_UP_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.messageBoxWrapUpList.length));
          for( elem288 in this.messageBoxWrapUpList)
          {
            elem288.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TOTAL_SIZE_FIELD_DESC);
      oprot.writeI32(this.totalSize);
      oprot.writeFieldEnd();
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
    var ret : String = "TMessageBoxWrapUpResponse(";
    var first : Bool = true;

    ret += "messageBoxWrapUpList:";
    if (this.messageBoxWrapUpList == null) {
      ret += "null";
    } else {
      ret += this.messageBoxWrapUpList;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "totalSize:";
    ret += this.totalSize;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

