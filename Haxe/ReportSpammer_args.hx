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


class ReportSpammer_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("reportSpammer_args"); };
  static var SPAMMER_MID_FIELD_DESC = { new TField("spammerMid", TType.STRING, 2); };
  static var SPAMMER_REASONS_FIELD_DESC = { new TField("spammerReasons", TType.LIST, 3); };
  static var SPAM_MESSAGE_IDS_FIELD_DESC = { new TField("spamMessageIds", TType.LIST, 4); };

  @:isVar
  public var spammerMid(get,set) : String;
  @:isVar
  public var spammerReasons(get,set) : List< Int>;
  @:isVar
  public var spamMessageIds(get,set) : List< String>;

  inline static var SPAMMERMID_FIELD_ID : Int = 2;
  inline static var SPAMMERREASONS_FIELD_ID : Int = 3;
  inline static var SPAMMESSAGEIDS_FIELD_ID : Int = 4;


  public function new() {
  }

  public function get_spammerMid() : String {
    return this.spammerMid;
  }

  public function set_spammerMid(spammerMid:String) : String {
    this.spammerMid = spammerMid;
    return this.spammerMid;
  }

  public function unsetSpammerMid() : Void {
    this.spammerMid = null;
  }

  // Returns true if field spammerMid is set (has been assigned a value) and false otherwise
  public function isSetSpammerMid() : Bool {
    return this.spammerMid != null;
  }

  public function get_spammerReasons() : List< Int> {
    return this.spammerReasons;
  }

  public function set_spammerReasons(spammerReasons:List< Int>) : List< Int> {
    this.spammerReasons = spammerReasons;
    return this.spammerReasons;
  }

  public function unsetSpammerReasons() : Void {
    this.spammerReasons = null;
  }

  // Returns true if field spammerReasons is set (has been assigned a value) and false otherwise
  public function isSetSpammerReasons() : Bool {
    return this.spammerReasons != null;
  }

  public function get_spamMessageIds() : List< String> {
    return this.spamMessageIds;
  }

  public function set_spamMessageIds(spamMessageIds:List< String>) : List< String> {
    this.spamMessageIds = spamMessageIds;
    return this.spamMessageIds;
  }

  public function unsetSpamMessageIds() : Void {
    this.spamMessageIds = null;
  }

  // Returns true if field spamMessageIds is set (has been assigned a value) and false otherwise
  public function isSetSpamMessageIds() : Bool {
    return this.spamMessageIds != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SPAMMERMID_FIELD_ID:
      if (value == null) {
        unsetSpammerMid();
      } else {
        this.spammerMid = value;
      }

    case SPAMMERREASONS_FIELD_ID:
      if (value == null) {
        unsetSpammerReasons();
      } else {
        this.spammerReasons = value;
      }

    case SPAMMESSAGEIDS_FIELD_ID:
      if (value == null) {
        unsetSpamMessageIds();
      } else {
        this.spamMessageIds = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SPAMMERMID_FIELD_ID:
      return this.spammerMid;
    case SPAMMERREASONS_FIELD_ID:
      return this.spammerReasons;
    case SPAMMESSAGEIDS_FIELD_ID:
      return this.spamMessageIds;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SPAMMERMID_FIELD_ID:
      return isSetSpammerMid();
    case SPAMMERREASONS_FIELD_ID:
      return isSetSpammerReasons();
    case SPAMMESSAGEIDS_FIELD_ID:
      return isSetSpamMessageIds();
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
          case SPAMMERMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.spammerMid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SPAMMERREASONS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list1195 = iprot.readListBegin();
                this.spammerReasons = new List< Int>();
                for( _i1196 in 0 ... _list1195.size)
                {
                  var _elem1197 : Int;
                  _elem1197 = iprot.readI32();
                  this.spammerReasons.add(_elem1197);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SPAMMESSAGEIDS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list1198 = iprot.readListBegin();
                this.spamMessageIds = new List< String>();
                for( _i1199 in 0 ... _list1198.size)
                {
                  var _elem1200 : String;
                  _elem1200 = iprot.readString();
                  this.spamMessageIds.add(_elem1200);
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
      if (this.spammerMid != null) {
        oprot.writeFieldBegin(SPAMMER_MID_FIELD_DESC);
        oprot.writeString(this.spammerMid);
        oprot.writeFieldEnd();
      }
      if (this.spammerReasons != null) {
        oprot.writeFieldBegin(SPAMMER_REASONS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.I32, this.spammerReasons.length));
          for( elem1201 in this.spammerReasons)
          {
            oprot.writeI32(elem1201);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.spamMessageIds != null) {
        oprot.writeFieldBegin(SPAM_MESSAGE_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.spamMessageIds.length));
          for( elem1202 in this.spamMessageIds)
          {
            oprot.writeString(elem1202);
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
    var ret : String = "reportSpammer_args(";
    var first : Bool = true;

    ret += "spammerMid:";
    if (this.spammerMid == null) {
      ret += "null";
    } else {
      ret += this.spammerMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "spammerReasons:";
    if (this.spammerReasons == null) {
      ret += "null";
    } else {
      ret += this.spammerReasons;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "spamMessageIds:";
    if (this.spamMessageIds == null) {
      ret += "null";
    } else {
      ret += this.spamMessageIds;
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

