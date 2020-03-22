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


class UpdateChannelNotificationSetting_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("updateChannelNotificationSetting_args"); };
  static var SETTING_FIELD_DESC = { new TField("setting", TType.LIST, 1); };

  @:isVar
  public var setting(get,set) : List< ChannelNotificationSetting>;

  inline static var SETTING_FIELD_ID : Int = 1;


  public function new() {
  }

  public function get_setting() : List< ChannelNotificationSetting> {
    return this.setting;
  }

  public function set_setting(setting:List< ChannelNotificationSetting>) : List< ChannelNotificationSetting> {
    this.setting = setting;
    return this.setting;
  }

  public function unsetSetting() : Void {
    this.setting = null;
  }

  // Returns true if field setting is set (has been assigned a value) and false otherwise
  public function isSetSetting() : Bool {
    return this.setting != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SETTING_FIELD_ID:
      if (value == null) {
        unsetSetting();
      } else {
        this.setting = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SETTING_FIELD_ID:
      return this.setting;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SETTING_FIELD_ID:
      return isSetSetting();
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
          case SETTING_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list811 = iprot.readListBegin();
                this.setting = new List< ChannelNotificationSetting>();
                for( _i812 in 0 ... _list811.size)
                {
                  var _elem813 : ChannelNotificationSetting;
                  _elem813 = new ChannelNotificationSetting();
                  _elem813.read(iprot);
                  this.setting.add(_elem813);
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
      if (this.setting != null) {
        oprot.writeFieldBegin(SETTING_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.setting.length));
          for( elem814 in this.setting)
          {
            elem814.write(oprot);
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
    var ret : String = "updateChannelNotificationSetting_args(";
    var first : Bool = true;

    ret += "setting:";
    if (this.setting == null) {
      ret += "null";
    } else {
      ret += this.setting;
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

