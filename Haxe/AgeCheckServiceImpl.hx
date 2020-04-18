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



class AgeCheckServiceImpl implements AgeCheckService {

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

  public function checkUserAge(carrier : Int, sessionId : String, verifier : String, standardAge : haxe.Int32) : Int {
    oprot_.writeMessageBegin(new TMessage("checkUserAge", TMessageType.CALL, seqid_));
    var args : CheckUserAge_args = new CheckUserAge_args();
    args.carrier = carrier;
    args.sessionId = sessionId;
    args.verifier = verifier;
    args.standardAge = standardAge;
    args.write(oprot_);
    oprot_.writeMessageEnd();
    var retval : Int;
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
      var result : CheckUserAge_result = new CheckUserAge_result();
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
                                  "checkUserAge failed: unknown result");
    });
    return retval;
  }

  public function checkUserAgeWithDocomo(openIdRedirectUrl : String, standardAge : haxe.Int32, verifier : String) : AgeCheckDocomoResult {
    oprot_.writeMessageBegin(new TMessage("checkUserAgeWithDocomo", TMessageType.CALL, seqid_));
    var args : CheckUserAgeWithDocomo_args = new CheckUserAgeWithDocomo_args();
    args.openIdRedirectUrl = openIdRedirectUrl;
    args.standardAge = standardAge;
    args.verifier = verifier;
    args.write(oprot_);
    oprot_.writeMessageEnd();
    var retval : AgeCheckDocomoResult;
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
      var result : CheckUserAgeWithDocomo_result = new CheckUserAgeWithDocomo_result();
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
                                  "checkUserAgeWithDocomo failed: unknown result");
    });
    return retval;
  }

  public function retrieveOpenIdAuthUrlWithDocomo() : String {
    oprot_.writeMessageBegin(new TMessage("retrieveOpenIdAuthUrlWithDocomo", TMessageType.CALL, seqid_));
    var args : RetrieveOpenIdAuthUrlWithDocomo_args = new RetrieveOpenIdAuthUrlWithDocomo_args();
    args.write(oprot_);
    oprot_.writeMessageEnd();
    var retval : String;
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
      var result : RetrieveOpenIdAuthUrlWithDocomo_result = new RetrieveOpenIdAuthUrlWithDocomo_result();
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
                                  "retrieveOpenIdAuthUrlWithDocomo failed: unknown result");
    });
    return retval;
  }

  public function retrieveRequestToken(carrier : Int) : AgeCheckRequestResult {
    oprot_.writeMessageBegin(new TMessage("retrieveRequestToken", TMessageType.CALL, seqid_));
    var args : RetrieveRequestToken_args = new RetrieveRequestToken_args();
    args.carrier = carrier;
    args.write(oprot_);
    oprot_.writeMessageEnd();
    var retval : AgeCheckRequestResult;
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
      var result : RetrieveRequestToken_result = new RetrieveRequestToken_result();
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
                                  "retrieveRequestToken failed: unknown result");
    });
    return retval;
  }

}
