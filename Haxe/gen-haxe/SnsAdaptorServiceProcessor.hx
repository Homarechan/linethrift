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


class SnsAdaptorServiceProcessor implements TProcessor {

  private var SnsAdaptorService_iface_ : SnsAdaptorService;
  private var PROCESS_MAP = new StringMap< Int->TProtocol->TProtocol->Void >();

  public function new( iface : SnsAdaptorService)
  {
    SnsAdaptorService_iface_ = iface;
    PROCESS_MAP.set("getSnsFriends", getSnsFriends());
    PROCESS_MAP.set("getSnsMyProfile", getSnsMyProfile());
    PROCESS_MAP.set("postSnsInvitationMessage", postSnsInvitationMessage());
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

  private function getSnsFriends() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : GetSnsFriends_args = new GetSnsFriends_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : GetSnsFriends_result = new GetSnsFriends_result();
      try {
        result.success = SnsAdaptorService_iface_.getSnsFriends(args.snsIdType, args.snsAccessToken, args.startIdx, args.limit);
      } catch (e:TalkException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing getSnsFriends", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing getSnsFriends");
        oprot.writeMessageBegin(new TMessage("getSnsFriends", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("getSnsFriends", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function getSnsMyProfile() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : GetSnsMyProfile_args = new GetSnsMyProfile_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : GetSnsMyProfile_result = new GetSnsMyProfile_result();
      try {
        result.success = SnsAdaptorService_iface_.getSnsMyProfile(args.snsIdType, args.snsAccessToken);
      } catch (e:TalkException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing getSnsMyProfile", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing getSnsMyProfile");
        oprot.writeMessageBegin(new TMessage("getSnsMyProfile", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("getSnsMyProfile", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function postSnsInvitationMessage() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : PostSnsInvitationMessage_args = new PostSnsInvitationMessage_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : PostSnsInvitationMessage_result = new PostSnsInvitationMessage_result();
      try {
        SnsAdaptorService_iface_.postSnsInvitationMessage(args.snsIdType, args.snsAccessToken, args.toSnsUserId);
      } catch (e:TalkException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing postSnsInvitationMessage", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing postSnsInvitationMessage");
        oprot.writeMessageBegin(new TMessage("postSnsInvitationMessage", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("postSnsInvitationMessage", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

}
