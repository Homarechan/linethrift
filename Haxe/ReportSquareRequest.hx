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


class ReportSquareRequest implements TBase {
  
  static var STRUCT_DESC = { new TStruct("ReportSquareRequest"); };
  static var SQUARE_MID_FIELD_DESC = { new TField("squareMid", TType.STRING, 2); };
  static var REPORT_TYPE_FIELD_DESC = { new TField("reportType", TType.I32, 3); };
  static var OTHER_REASON_FIELD_DESC = { new TField("otherReason", TType.STRING, 4); };

  @:isVar
  public var squareMid(get,set) : String;
  @:isVar
  public var reportType(get,set) : Int;
  @:isVar
  public var otherReason(get,set) : String;

  inline static var SQUAREMID_FIELD_ID : Int = 2;
  inline static var REPORTTYPE_FIELD_ID : Int = 3;
  inline static var OTHERREASON_FIELD_ID : Int = 4;

  private var __isset_reportType : Bool = false;

  public function new() {
  }

  public function get_squareMid() : String {
    return this.squareMid;
  }

  public function set_squareMid(squareMid:String) : String {
    this.squareMid = squareMid;
    return this.squareMid;
  }

  public function unsetSquareMid() : Void {
    this.squareMid = null;
  }

  // Returns true if field squareMid is set (has been assigned a value) and false otherwise
  public function isSetSquareMid() : Bool {
    return this.squareMid != null;
  }

  public function get_reportType() : Int {
    return this.reportType;
  }

  public function set_reportType(reportType:Int) : Int {
    this.reportType = reportType;
    this.__isset_reportType = true;
    return this.reportType;
  }

  public function unsetReportType() : Void {
    this.__isset_reportType = false;
  }

  // Returns true if field reportType is set (has been assigned a value) and false otherwise
  public function isSetReportType() : Bool {
    return this.__isset_reportType;
  }

  public function get_otherReason() : String {
    return this.otherReason;
  }

  public function set_otherReason(otherReason:String) : String {
    this.otherReason = otherReason;
    return this.otherReason;
  }

  public function unsetOtherReason() : Void {
    this.otherReason = null;
  }

  // Returns true if field otherReason is set (has been assigned a value) and false otherwise
  public function isSetOtherReason() : Bool {
    return this.otherReason != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SQUAREMID_FIELD_ID:
      if (value == null) {
        unsetSquareMid();
      } else {
        this.squareMid = value;
      }

    case REPORTTYPE_FIELD_ID:
      if (value == null) {
        unsetReportType();
      } else {
        this.reportType = value;
      }

    case OTHERREASON_FIELD_ID:
      if (value == null) {
        unsetOtherReason();
      } else {
        this.otherReason = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SQUAREMID_FIELD_ID:
      return this.squareMid;
    case REPORTTYPE_FIELD_ID:
      return this.reportType;
    case OTHERREASON_FIELD_ID:
      return this.otherReason;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SQUAREMID_FIELD_ID:
      return isSetSquareMid();
    case REPORTTYPE_FIELD_ID:
      return isSetReportType();
    case OTHERREASON_FIELD_ID:
      return isSetOtherReason();
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
          case SQUAREMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.squareMid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case REPORTTYPE_FIELD_ID:
            if (field.type == TType.I32) {
              this.reportType = iprot.readI32();
              this.__isset_reportType = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case OTHERREASON_FIELD_ID:
            if (field.type == TType.STRING) {
              this.otherReason = iprot.readString();
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
      if (this.squareMid != null) {
        oprot.writeFieldBegin(SQUARE_MID_FIELD_DESC);
        oprot.writeString(this.squareMid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REPORT_TYPE_FIELD_DESC);
      oprot.writeI32(this.reportType);
      oprot.writeFieldEnd();
      if (this.otherReason != null) {
        oprot.writeFieldBegin(OTHER_REASON_FIELD_DESC);
        oprot.writeString(this.otherReason);
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
    var ret : String = "ReportSquareRequest(";
    var first : Bool = true;

    ret += "squareMid:";
    if (this.squareMid == null) {
      ret += "null";
    } else {
      ret += this.squareMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "reportType:";
    var reportType_name : String = .ReportType.VALUES_TO_NAMES[this.reportType];
    if (reportType_name != null) {
      ret += reportType_name;
      ret += " (";
    }
    ret += this.reportType;
    if (reportType_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "otherReason:";
    if (this.otherReason == null) {
      ret += "null";
    } else {
      ret += this.otherReason;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetReportType() && !.ReportType.VALID_VALUES.contains(reportType)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'reportType' has been assigned the invalid value " + reportType);
    }
  }

}

