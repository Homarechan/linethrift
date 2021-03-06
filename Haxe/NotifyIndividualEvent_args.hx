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


class NotifyIndividualEvent_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("notifyIndividualEvent_args"); };
  static var NOTIFICATION_STATUS_FIELD_DESC = { new TField("notificationStatus", TType.I32, 2); };
  static var RECEIVER_MIDS_FIELD_DESC = { new TField("receiverMids", TType.LIST, 3); };

  @:isVar
  public var notificationStatus(get,set) : Int;
  @:isVar
  public var receiverMids(get,set) : List< String>;

  inline static var NOTIFICATIONSTATUS_FIELD_ID : Int = 2;
  inline static var RECEIVERMIDS_FIELD_ID : Int = 3;

  private var __isset_notificationStatus : Bool = false;

  public function new() {
  }

  public function get_notificationStatus() : Int {
    return this.notificationStatus;
  }

  public function set_notificationStatus(notificationStatus:Int) : Int {
    this.notificationStatus = notificationStatus;
    this.__isset_notificationStatus = true;
    return this.notificationStatus;
  }

  public function unsetNotificationStatus() : Void {
    this.__isset_notificationStatus = false;
  }

  // Returns true if field notificationStatus is set (has been assigned a value) and false otherwise
  public function isSetNotificationStatus() : Bool {
    return this.__isset_notificationStatus;
  }

  public function get_receiverMids() : List< String> {
    return this.receiverMids;
  }

  public function set_receiverMids(receiverMids:List< String>) : List< String> {
    this.receiverMids = receiverMids;
    return this.receiverMids;
  }

  public function unsetReceiverMids() : Void {
    this.receiverMids = null;
  }

  // Returns true if field receiverMids is set (has been assigned a value) and false otherwise
  public function isSetReceiverMids() : Bool {
    return this.receiverMids != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case NOTIFICATIONSTATUS_FIELD_ID:
      if (value == null) {
        unsetNotificationStatus();
      } else {
        this.notificationStatus = value;
      }

    case RECEIVERMIDS_FIELD_ID:
      if (value == null) {
        unsetReceiverMids();
      } else {
        this.receiverMids = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case NOTIFICATIONSTATUS_FIELD_ID:
      return this.notificationStatus;
    case RECEIVERMIDS_FIELD_ID:
      return this.receiverMids;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case NOTIFICATIONSTATUS_FIELD_ID:
      return isSetNotificationStatus();
    case RECEIVERMIDS_FIELD_ID:
      return isSetReceiverMids();
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
          case NOTIFICATIONSTATUS_FIELD_ID:
            if (field.type == TType.I32) {
              this.notificationStatus = iprot.readI32();
              this.__isset_notificationStatus = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case RECEIVERMIDS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list1147 = iprot.readListBegin();
                this.receiverMids = new List< String>();
                for( _i1148 in 0 ... _list1147.size)
                {
                  var _elem1149 : String;
                  _elem1149 = iprot.readString();
                  this.receiverMids.add(_elem1149);
                }
                iprot.readListEnd();
              }
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
      oprot.writeFieldBegin(NOTIFICATION_STATUS_FIELD_DESC);
      oprot.writeI32(this.notificationStatus);
      oprot.writeFieldEnd();
      if (this.receiverMids != null) {
        oprot.writeFieldBegin(RECEIVER_MIDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.receiverMids.length));
          for( elem1150 in this.receiverMids)
          {
            oprot.writeString(elem1150);
          }
          oprot.writeListEnd();
        }
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
    var ret : String = "notifyIndividualEvent_args(";
    var first : Bool = true;

    ret += "notificationStatus:";
    var notificationStatus_name : String = .NotificationStatus.VALUES_TO_NAMES[this.notificationStatus];
    if (notificationStatus_name != null) {
      ret += notificationStatus_name;
      ret += " (";
    }
    ret += this.notificationStatus;
    if (notificationStatus_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "receiverMids:";
    if (this.receiverMids == null) {
      ret += "null";
    } else {
      ret += this.receiverMids;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetNotificationStatus() && !.NotificationStatus.VALID_VALUES.contains(notificationStatus)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'notificationStatus' has been assigned the invalid value " + notificationStatus);
    }
  }

}

