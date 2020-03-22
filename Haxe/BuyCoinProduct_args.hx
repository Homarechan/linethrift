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


class BuyCoinProduct_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("buyCoinProduct_args"); };
  static var PAYMENT_RESERVATION_FIELD_DESC = { new TField("paymentReservation", TType.STRUCT, 2); };

  @:isVar
  public var paymentReservation(get,set) : PaymentReservation;

  inline static var PAYMENTRESERVATION_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_paymentReservation() : PaymentReservation {
    return this.paymentReservation;
  }

  public function set_paymentReservation(paymentReservation:PaymentReservation) : PaymentReservation {
    this.paymentReservation = paymentReservation;
    return this.paymentReservation;
  }

  public function unsetPaymentReservation() : Void {
    this.paymentReservation = null;
  }

  // Returns true if field paymentReservation is set (has been assigned a value) and false otherwise
  public function isSetPaymentReservation() : Bool {
    return this.paymentReservation != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case PAYMENTRESERVATION_FIELD_ID:
      if (value == null) {
        unsetPaymentReservation();
      } else {
        this.paymentReservation = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case PAYMENTRESERVATION_FIELD_ID:
      return this.paymentReservation;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case PAYMENTRESERVATION_FIELD_ID:
      return isSetPaymentReservation();
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
          case PAYMENTRESERVATION_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.paymentReservation = new PaymentReservation();
              this.paymentReservation.read(iprot);
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
      if (this.paymentReservation != null) {
        oprot.writeFieldBegin(PAYMENT_RESERVATION_FIELD_DESC);
        this.paymentReservation.write(oprot);
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
    var ret : String = "buyCoinProduct_args(";
    var first : Bool = true;

    ret += "paymentReservation:";
    if (this.paymentReservation == null) {
      ret += "null";
    } else {
      ret += this.paymentReservation;
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

