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


class SpotServiceProcessor implements TProcessor {

  private var SpotService_iface_ : SpotService;
  private var PROCESS_MAP = new StringMap< Int->TProtocol->TProtocol->Void >();

  public function new( iface : SpotService)
  {
    SpotService_iface_ = iface;
    PROCESS_MAP.set("lookupByPhoneNumber", lookupByPhoneNumber());
    PROCESS_MAP.set("lookupNearby", lookupNearby());
  }

  public function process( iprot : TProtocol, oprot : TProtocol) : Bool
  {
    var msg : TMessage = iprot.readMessageBegin();
    var fn  = PROCESS_MAP.get(msg.name);
    if (fn == null) {
      TProtocolUtil.skip(iprot, TType.STRUCT);
      iprot.readMessageEnd();
      var x = new TApplicationException(TApplicationException.UNKNOWN_METHOD, "Invalid method name: '"+msg.name+"'");
      oprot.writeMessageBegin(new TMessage(msg.name, TMessageType.EXCEPTION, msg.seqid));
      x.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
      return true;
    }
    fn( msg.seqid, iprot, oprot);
    return true;
  }

  private function lookupByPhoneNumber() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : LookupByPhoneNumber_args = new LookupByPhoneNumber_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : LookupByPhoneNumber_result = new LookupByPhoneNumber_result();
      try {
        result.success = SpotService_iface_.lookupByPhoneNumber(args.countryAreaCode, args.phoneNumber);
      } catch (e:TalkException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing lookupByPhoneNumber", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing lookupByPhoneNumber");
        oprot.writeMessageBegin(new TMessage("lookupByPhoneNumber", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("lookupByPhoneNumber", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function lookupNearby() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : LookupNearby_args = new LookupNearby_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : LookupNearby_result = new LookupNearby_result();
      try {
        result.success = SpotService_iface_.lookupNearby(args.location, args.category, args.query, args.countryAreaCode);
      } catch (e:TalkException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing lookupNearby", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing lookupNearby");
        oprot.writeMessageBegin(new TMessage("lookupNearby", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("lookupNearby", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

}

