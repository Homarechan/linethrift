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


class ApprovedChannelInfos implements TBase {
  
  static var STRUCT_DESC = { new TStruct("ApprovedChannelInfos"); };
  static var APPROVED_CHANNEL_INFOS_FIELD_DESC = { new TField("approvedChannelInfos", TType.LIST, 1); };
  static var REVISION_FIELD_DESC = { new TField("revision", TType.I64, 2); };

  @:isVar
  public var approvedChannelInfos(get,set) : List< ApprovedChannelInfo>;
  @:isVar
  public var revision(get,set) : haxe.Int64;

  inline static var APPROVEDCHANNELINFOS_FIELD_ID : Int = 1;
  inline static var REVISION_FIELD_ID : Int = 2;

  private var __isset_revision : Bool = false;

  public function new() {
  }

  public function get_approvedChannelInfos() : List< ApprovedChannelInfo> {
    return this.approvedChannelInfos;
  }

  public function set_approvedChannelInfos(approvedChannelInfos:List< ApprovedChannelInfo>) : List< ApprovedChannelInfo> {
    this.approvedChannelInfos = approvedChannelInfos;
    return this.approvedChannelInfos;
  }

  public function unsetApprovedChannelInfos() : Void {
    this.approvedChannelInfos = null;
  }

  // Returns true if field approvedChannelInfos is set (has been assigned a value) and false otherwise
  public function isSetApprovedChannelInfos() : Bool {
    return this.approvedChannelInfos != null;
  }

  public function get_revision() : haxe.Int64 {
    return this.revision;
  }

  public function set_revision(revision:haxe.Int64) : haxe.Int64 {
    this.revision = revision;
    this.__isset_revision = true;
    return this.revision;
  }

  public function unsetRevision() : Void {
    this.__isset_revision = false;
  }

  // Returns true if field revision is set (has been assigned a value) and false otherwise
  public function isSetRevision() : Bool {
    return this.__isset_revision;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case APPROVEDCHANNELINFOS_FIELD_ID:
      if (value == null) {
        unsetApprovedChannelInfos();
      } else {
        this.approvedChannelInfos = value;
      }

    case REVISION_FIELD_ID:
      if (value == null) {
        unsetRevision();
      } else {
        this.revision = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case APPROVEDCHANNELINFOS_FIELD_ID:
      return this.approvedChannelInfos;
    case REVISION_FIELD_ID:
      return this.revision;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case APPROVEDCHANNELINFOS_FIELD_ID:
      return isSetApprovedChannelInfos();
    case REVISION_FIELD_ID:
      return isSetRevision();
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
          case APPROVEDCHANNELINFOS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list52 = iprot.readListBegin();
                this.approvedChannelInfos = new List< ApprovedChannelInfo>();
                for( _i53 in 0 ... _list52.size)
                {
                  var _elem54 : ApprovedChannelInfo;
                  _elem54 = new ApprovedChannelInfo();
                  _elem54.read(iprot);
                  this.approvedChannelInfos.add(_elem54);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case REVISION_FIELD_ID:
            if (field.type == TType.I64) {
              this.revision = iprot.readI64();
              this.__isset_revision = true;
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
      if (this.approvedChannelInfos != null) {
        oprot.writeFieldBegin(APPROVED_CHANNEL_INFOS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.approvedChannelInfos.length));
          for( elem55 in this.approvedChannelInfos)
          {
            elem55.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REVISION_FIELD_DESC);
      oprot.writeI64(this.revision);
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
    var ret : String = "ApprovedChannelInfos(";
    var first : Bool = true;

    ret += "approvedChannelInfos:";
    if (this.approvedChannelInfos == null) {
      ret += "null";
    } else {
      ret += this.approvedChannelInfos;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "revision:";
    ret += this.revision;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

