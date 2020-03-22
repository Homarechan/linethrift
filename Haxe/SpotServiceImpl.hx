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



class SpotServiceImpl implements SpotService {

  public function new( iprot : TProtocol, oprot : TProtocol = null)
  {
    iprot_ = iprot;
    if (oprot == null) {
      oprot_ = iprot;
    } else {
      oprot_ = oprot;
    }
  }

  private var iprot_ : TProtocol;
  private var oprot_ : TProtocol;
  private var seqid_ : Int;

  public function getInputProtocol() : TProtocol
  {
    return this.iprot_;
  }

  public function getOutputProtocol() : TProtocol
  {
    return this.oprot_;
  }

  public function lookupByPhoneNumber(countryAreaCode : String, phoneNumber : String) : SpotPhoneNumberResponse {
    oprot_.writeMessageBegin(new TMessage("lookupByPhoneNumber", TMessageType.CALL, seqid_));
    var args : LookupByPhoneNumber_args = new LookupByPhoneNumber_args();
    args.countryAreaCode = countryAreaCode;
    args.phoneNumber = phoneNumber;
    args.write(oprot_);
    oprot_.writeMessageEnd();
    var retval : SpotPhoneNumberResponse;
    oprot_.getTransport().flush(function(error:Dynamic) : Void {
      if (error != null) {
        throw error;
      }
      var msg : TMessage = iprot_.readMessageBegin();
      if (msg.type == TMessageType.EXCEPTION) {
        var x = TApplicationException.read(iprot_);
        iprot_.readMessageEnd();
        throw x;
      }
      var result : LookupByPhoneNumber_result = new LookupByPhoneNumber_result();
      result.read(iprot_);
      iprot_.readMessageEnd();
      if (result.isSetSuccess()) {
        retval = result.success;
        return;
      }
      if (result.e != null) {
        throw result.e;
      }
      throw new TApplicationException(TApplicationException.MISSING_RESULT,
                                  "lookupByPhoneNumber failed: unknown result");
    });
    return retval;
  }

  public function lookupNearby(location : Location, category : Int, query : String, countryAreaCode : String) : SpotNearbyResponse {
    oprot_.writeMessageBegin(new TMessage("lookupNearby", TMessageType.CALL, seqid_));
    var args : LookupNearby_args = new LookupNearby_args();
    args.location = location;
    args.category = category;
    args.query = query;
    args.countryAreaCode = countryAreaCode;
    args.write(oprot_);
    oprot_.writeMessageEnd();
    var retval : SpotNearbyResponse;
    oprot_.getTransport().flush(function(error:Dynamic) : Void {
      if (error != null) {
        throw error;
      }
      var msg : TMessage = iprot_.readMessageBegin();
      if (msg.type == TMessageType.EXCEPTION) {
        var x = TApplicationException.read(iprot_);
        iprot_.readMessageEnd();
        throw x;
      }
      var result : LookupNearby_result = new LookupNearby_result();
      result.read(iprot_);
      iprot_.readMessageEnd();
      if (result.isSetSuccess()) {
        retval = result.success;
        return;
      }
      if (result.e != null) {
        throw result.e;
      }
      throw new TApplicationException(TApplicationException.MISSING_RESULT,
                                  "lookupNearby failed: unknown result");
    });
    return retval;
  }

}
