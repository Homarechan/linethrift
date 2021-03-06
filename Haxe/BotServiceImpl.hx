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



class BotServiceImpl implements BotService {

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

  public function notifyLeaveGroup(groupMid : String) : Void {
    oprot_.writeMessageBegin(new TMessage("notifyLeaveGroup", TMessageType.CALL, seqid_));
    var args : NotifyLeaveGroup_args = new NotifyLeaveGroup_args();
    args.groupMid = groupMid;
    args.write(oprot_);
    oprot_.writeMessageEnd();
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
      var result : NotifyLeaveGroup_result = new NotifyLeaveGroup_result();
      result.read(iprot_);
      iprot_.readMessageEnd();
      if (result.e != null) {
        throw result.e;
      }
      return;
    });
  }

  public function notifyLeaveRoom(roomMid : String) : Void {
    oprot_.writeMessageBegin(new TMessage("notifyLeaveRoom", TMessageType.CALL, seqid_));
    var args : NotifyLeaveRoom_args = new NotifyLeaveRoom_args();
    args.roomMid = roomMid;
    args.write(oprot_);
    oprot_.writeMessageEnd();
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
      var result : NotifyLeaveRoom_result = new NotifyLeaveRoom_result();
      result.read(iprot_);
      iprot_.readMessageEnd();
      if (result.e != null) {
        throw result.e;
      }
      return;
    });
  }

  public function getBotUseInfo(botMid : String) : BotUseInfo {
    oprot_.writeMessageBegin(new TMessage("getBotUseInfo", TMessageType.CALL, seqid_));
    var args : GetBotUseInfo_args = new GetBotUseInfo_args();
    args.botMid = botMid;
    args.write(oprot_);
    oprot_.writeMessageEnd();
    var retval : BotUseInfo;
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
      var result : GetBotUseInfo_result = new GetBotUseInfo_result();
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
                                  "getBotUseInfo failed: unknown result");
    });
    return retval;
  }

  public function sendChatCheckedByWatermark(seq : haxe.Int32, mid : String, watermark : haxe.Int64, sessionId : haxe.Int32) : Void {
    oprot_.writeMessageBegin(new TMessage("sendChatCheckedByWatermark", TMessageType.CALL, seqid_));
    var args : SendChatCheckedByWatermark_args = new SendChatCheckedByWatermark_args();
    args.seq = seq;
    args.mid = mid;
    args.watermark = watermark;
    args.sessionId = sessionId;
    args.write(oprot_);
    oprot_.writeMessageEnd();
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
      var result : SendChatCheckedByWatermark_result = new SendChatCheckedByWatermark_result();
      result.read(iprot_);
      iprot_.readMessageEnd();
      if (result.e != null) {
        throw result.e;
      }
      return;
    });
  }

}
