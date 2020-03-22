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


class MessageServiceProcessor implements TProcessor {

  private var MessageService_iface_ : MessageService;
  private var PROCESS_MAP = new StringMap< Int->TProtocol->TProtocol->Void >();

  public function new( iface : MessageService)
  {
    MessageService_iface_ = iface;
    PROCESS_MAP.set("fetchMessageOperations", fetchMessageOperations());
    PROCESS_MAP.set("getLastReadMessageIds", getLastReadMessageIds());
    PROCESS_MAP.set("multiGetLastReadMessageIds", multiGetLastReadMessageIds());
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

  private function fetchMessageOperations() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : FetchMessageOperations_args = new FetchMessageOperations_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : FetchMessageOperations_result = new FetchMessageOperations_result();
      try {
        result.success = MessageService_iface_.fetchMessageOperations(args.localRevision, args.lastOpTimestamp, args.count);
      } catch (e:TalkException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing fetchMessageOperations", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing fetchMessageOperations");
        oprot.writeMessageBegin(new TMessage("fetchMessageOperations", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("fetchMessageOperations", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function getLastReadMessageIds() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : GetLastReadMessageIds_args = new GetLastReadMessageIds_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : GetLastReadMessageIds_result = new GetLastReadMessageIds_result();
      try {
        result.success = MessageService_iface_.getLastReadMessageIds(args.chatId);
      } catch (e:TalkException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing getLastReadMessageIds", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing getLastReadMessageIds");
        oprot.writeMessageBegin(new TMessage("getLastReadMessageIds", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("getLastReadMessageIds", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function multiGetLastReadMessageIds() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : MultiGetLastReadMessageIds_args = new MultiGetLastReadMessageIds_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : MultiGetLastReadMessageIds_result = new MultiGetLastReadMessageIds_result();
      try {
        result.success = MessageService_iface_.multiGetLastReadMessageIds(args.chatIds);
      } catch (e:TalkException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing multiGetLastReadMessageIds", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing multiGetLastReadMessageIds");
        oprot.writeMessageBegin(new TMessage("multiGetLastReadMessageIds", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("multiGetLastReadMessageIds", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

}

