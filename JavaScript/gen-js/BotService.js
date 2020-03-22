//
// Autogenerated by Thrift Compiler (0.14.0)
//
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
//
if (typeof Int64 === 'undefined' && typeof require === 'function') {
  var Int64 = require('node-int64');
}


//HELPER FUNCTIONS AND STRUCTURES

BotService_notifyLeaveGroup_args = function(args) {
  this.groupMid = null;
  if (args) {
    if (args.groupMid !== undefined && args.groupMid !== null) {
      this.groupMid = args.groupMid;
    }
  }
};
BotService_notifyLeaveGroup_args.prototype = {};
BotService_notifyLeaveGroup_args.prototype.read = function(input) {
  input.readStructBegin();
  while (true) {
    var ret = input.readFieldBegin();
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid) {
      case 1:
      if (ftype == Thrift.Type.STRING) {
        this.groupMid = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 0:
        input.skip(ftype);
        break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

BotService_notifyLeaveGroup_args.prototype.write = function(output) {
  output.writeStructBegin('BotService_notifyLeaveGroup_args');
  if (this.groupMid !== null && this.groupMid !== undefined) {
    output.writeFieldBegin('groupMid', Thrift.Type.STRING, 1);
    output.writeString(this.groupMid);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

BotService_notifyLeaveGroup_result = function(args) {
  this.e = null;
  if (args instanceof TalkException) {
    this.e = args;
    return;
  }
  if (args) {
    if (args.e !== undefined && args.e !== null) {
      this.e = args.e;
    }
  }
};
BotService_notifyLeaveGroup_result.prototype = {};
BotService_notifyLeaveGroup_result.prototype.read = function(input) {
  input.readStructBegin();
  while (true) {
    var ret = input.readFieldBegin();
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid) {
      case 1:
      if (ftype == Thrift.Type.STRUCT) {
        this.e = new TalkException();
        this.e.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 0:
        input.skip(ftype);
        break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

BotService_notifyLeaveGroup_result.prototype.write = function(output) {
  output.writeStructBegin('BotService_notifyLeaveGroup_result');
  if (this.e !== null && this.e !== undefined) {
    output.writeFieldBegin('e', Thrift.Type.STRUCT, 1);
    this.e.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

BotService_notifyLeaveRoom_args = function(args) {
  this.roomMid = null;
  if (args) {
    if (args.roomMid !== undefined && args.roomMid !== null) {
      this.roomMid = args.roomMid;
    }
  }
};
BotService_notifyLeaveRoom_args.prototype = {};
BotService_notifyLeaveRoom_args.prototype.read = function(input) {
  input.readStructBegin();
  while (true) {
    var ret = input.readFieldBegin();
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid) {
      case 1:
      if (ftype == Thrift.Type.STRING) {
        this.roomMid = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 0:
        input.skip(ftype);
        break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

BotService_notifyLeaveRoom_args.prototype.write = function(output) {
  output.writeStructBegin('BotService_notifyLeaveRoom_args');
  if (this.roomMid !== null && this.roomMid !== undefined) {
    output.writeFieldBegin('roomMid', Thrift.Type.STRING, 1);
    output.writeString(this.roomMid);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

BotService_notifyLeaveRoom_result = function(args) {
  this.e = null;
  if (args instanceof TalkException) {
    this.e = args;
    return;
  }
  if (args) {
    if (args.e !== undefined && args.e !== null) {
      this.e = args.e;
    }
  }
};
BotService_notifyLeaveRoom_result.prototype = {};
BotService_notifyLeaveRoom_result.prototype.read = function(input) {
  input.readStructBegin();
  while (true) {
    var ret = input.readFieldBegin();
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid) {
      case 1:
      if (ftype == Thrift.Type.STRUCT) {
        this.e = new TalkException();
        this.e.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 0:
        input.skip(ftype);
        break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

BotService_notifyLeaveRoom_result.prototype.write = function(output) {
  output.writeStructBegin('BotService_notifyLeaveRoom_result');
  if (this.e !== null && this.e !== undefined) {
    output.writeFieldBegin('e', Thrift.Type.STRUCT, 1);
    this.e.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

BotService_getBotUseInfo_args = function(args) {
  this.botMid = null;
  if (args) {
    if (args.botMid !== undefined && args.botMid !== null) {
      this.botMid = args.botMid;
    }
  }
};
BotService_getBotUseInfo_args.prototype = {};
BotService_getBotUseInfo_args.prototype.read = function(input) {
  input.readStructBegin();
  while (true) {
    var ret = input.readFieldBegin();
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid) {
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.botMid = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 0:
        input.skip(ftype);
        break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

BotService_getBotUseInfo_args.prototype.write = function(output) {
  output.writeStructBegin('BotService_getBotUseInfo_args');
  if (this.botMid !== null && this.botMid !== undefined) {
    output.writeFieldBegin('botMid', Thrift.Type.STRING, 2);
    output.writeString(this.botMid);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

BotService_getBotUseInfo_result = function(args) {
  this.success = null;
  this.e = null;
  if (args instanceof TalkException) {
    this.e = args;
    return;
  }
  if (args) {
    if (args.success !== undefined && args.success !== null) {
      this.success = new BotUseInfo(args.success);
    }
    if (args.e !== undefined && args.e !== null) {
      this.e = args.e;
    }
  }
};
BotService_getBotUseInfo_result.prototype = {};
BotService_getBotUseInfo_result.prototype.read = function(input) {
  input.readStructBegin();
  while (true) {
    var ret = input.readFieldBegin();
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid) {
      case 0:
      if (ftype == Thrift.Type.STRUCT) {
        this.success = new BotUseInfo();
        this.success.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 1:
      if (ftype == Thrift.Type.STRUCT) {
        this.e = new TalkException();
        this.e.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

BotService_getBotUseInfo_result.prototype.write = function(output) {
  output.writeStructBegin('BotService_getBotUseInfo_result');
  if (this.success !== null && this.success !== undefined) {
    output.writeFieldBegin('success', Thrift.Type.STRUCT, 0);
    this.success.write(output);
    output.writeFieldEnd();
  }
  if (this.e !== null && this.e !== undefined) {
    output.writeFieldBegin('e', Thrift.Type.STRUCT, 1);
    this.e.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

BotService_sendChatCheckedByWatermark_args = function(args) {
  this.seq = null;
  this.mid = null;
  this.watermark = null;
  this.sessionId = null;
  if (args) {
    if (args.seq !== undefined && args.seq !== null) {
      this.seq = args.seq;
    }
    if (args.mid !== undefined && args.mid !== null) {
      this.mid = args.mid;
    }
    if (args.watermark !== undefined && args.watermark !== null) {
      this.watermark = args.watermark;
    }
    if (args.sessionId !== undefined && args.sessionId !== null) {
      this.sessionId = args.sessionId;
    }
  }
};
BotService_sendChatCheckedByWatermark_args.prototype = {};
BotService_sendChatCheckedByWatermark_args.prototype.read = function(input) {
  input.readStructBegin();
  while (true) {
    var ret = input.readFieldBegin();
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid) {
      case 1:
      if (ftype == Thrift.Type.I32) {
        this.seq = input.readI32().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.mid = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I64) {
        this.watermark = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.BYTE) {
        this.sessionId = input.readByte().value;
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

BotService_sendChatCheckedByWatermark_args.prototype.write = function(output) {
  output.writeStructBegin('BotService_sendChatCheckedByWatermark_args');
  if (this.seq !== null && this.seq !== undefined) {
    output.writeFieldBegin('seq', Thrift.Type.I32, 1);
    output.writeI32(this.seq);
    output.writeFieldEnd();
  }
  if (this.mid !== null && this.mid !== undefined) {
    output.writeFieldBegin('mid', Thrift.Type.STRING, 2);
    output.writeString(this.mid);
    output.writeFieldEnd();
  }
  if (this.watermark !== null && this.watermark !== undefined) {
    output.writeFieldBegin('watermark', Thrift.Type.I64, 3);
    output.writeI64(this.watermark);
    output.writeFieldEnd();
  }
  if (this.sessionId !== null && this.sessionId !== undefined) {
    output.writeFieldBegin('sessionId', Thrift.Type.BYTE, 4);
    output.writeByte(this.sessionId);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

BotService_sendChatCheckedByWatermark_result = function(args) {
  this.e = null;
  if (args instanceof TalkException) {
    this.e = args;
    return;
  }
  if (args) {
    if (args.e !== undefined && args.e !== null) {
      this.e = args.e;
    }
  }
};
BotService_sendChatCheckedByWatermark_result.prototype = {};
BotService_sendChatCheckedByWatermark_result.prototype.read = function(input) {
  input.readStructBegin();
  while (true) {
    var ret = input.readFieldBegin();
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid) {
      case 1:
      if (ftype == Thrift.Type.STRUCT) {
        this.e = new TalkException();
        this.e.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 0:
        input.skip(ftype);
        break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

BotService_sendChatCheckedByWatermark_result.prototype.write = function(output) {
  output.writeStructBegin('BotService_sendChatCheckedByWatermark_result');
  if (this.e !== null && this.e !== undefined) {
    output.writeFieldBegin('e', Thrift.Type.STRUCT, 1);
    this.e.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

BotServiceClient = function(input, output) {
  this.input = input;
  this.output = (!output) ? input : output;
  this.seqid = 0;
};
BotServiceClient.prototype = {};

BotServiceClient.prototype.notifyLeaveGroup = function(groupMid, callback) {
  this.send_notifyLeaveGroup(groupMid, callback); 
  if (!callback) {
  this.recv_notifyLeaveGroup();
  }
};

BotServiceClient.prototype.send_notifyLeaveGroup = function(groupMid, callback) {
  var params = {
    groupMid: groupMid
  };
  var args = new BotService_notifyLeaveGroup_args(params);
  try {
    this.output.writeMessageBegin('notifyLeaveGroup', Thrift.MessageType.CALL, this.seqid);
    args.write(this.output);
    this.output.writeMessageEnd();
    if (callback) {
      var self = this;
      this.output.getTransport().flush(true, function() {
        var result = null;
        try {
          result = self.recv_notifyLeaveGroup();
        } catch (e) {
          result = e;
        }
        callback(result);
      });
    } else {
      return this.output.getTransport().flush();
    }
  }
  catch (e) {
    if (typeof this.output.getTransport().reset === 'function') {
      this.output.getTransport().reset();
    }
    throw e;
  }
};

BotServiceClient.prototype.recv_notifyLeaveGroup = function() {
  var ret = this.input.readMessageBegin();
  var mtype = ret.mtype;
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(this.input);
    this.input.readMessageEnd();
    throw x;
  }
  var result = new BotService_notifyLeaveGroup_result();
  result.read(this.input);
  this.input.readMessageEnd();

  if (null !== result.e) {
    throw result.e;
  }
  return;
};

BotServiceClient.prototype.notifyLeaveRoom = function(roomMid, callback) {
  this.send_notifyLeaveRoom(roomMid, callback); 
  if (!callback) {
  this.recv_notifyLeaveRoom();
  }
};

BotServiceClient.prototype.send_notifyLeaveRoom = function(roomMid, callback) {
  var params = {
    roomMid: roomMid
  };
  var args = new BotService_notifyLeaveRoom_args(params);
  try {
    this.output.writeMessageBegin('notifyLeaveRoom', Thrift.MessageType.CALL, this.seqid);
    args.write(this.output);
    this.output.writeMessageEnd();
    if (callback) {
      var self = this;
      this.output.getTransport().flush(true, function() {
        var result = null;
        try {
          result = self.recv_notifyLeaveRoom();
        } catch (e) {
          result = e;
        }
        callback(result);
      });
    } else {
      return this.output.getTransport().flush();
    }
  }
  catch (e) {
    if (typeof this.output.getTransport().reset === 'function') {
      this.output.getTransport().reset();
    }
    throw e;
  }
};

BotServiceClient.prototype.recv_notifyLeaveRoom = function() {
  var ret = this.input.readMessageBegin();
  var mtype = ret.mtype;
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(this.input);
    this.input.readMessageEnd();
    throw x;
  }
  var result = new BotService_notifyLeaveRoom_result();
  result.read(this.input);
  this.input.readMessageEnd();

  if (null !== result.e) {
    throw result.e;
  }
  return;
};

BotServiceClient.prototype.getBotUseInfo = function(botMid, callback) {
  this.send_getBotUseInfo(botMid, callback); 
  if (!callback) {
    return this.recv_getBotUseInfo();
  }
};

BotServiceClient.prototype.send_getBotUseInfo = function(botMid, callback) {
  var params = {
    botMid: botMid
  };
  var args = new BotService_getBotUseInfo_args(params);
  try {
    this.output.writeMessageBegin('getBotUseInfo', Thrift.MessageType.CALL, this.seqid);
    args.write(this.output);
    this.output.writeMessageEnd();
    if (callback) {
      var self = this;
      this.output.getTransport().flush(true, function() {
        var result = null;
        try {
          result = self.recv_getBotUseInfo();
        } catch (e) {
          result = e;
        }
        callback(result);
      });
    } else {
      return this.output.getTransport().flush();
    }
  }
  catch (e) {
    if (typeof this.output.getTransport().reset === 'function') {
      this.output.getTransport().reset();
    }
    throw e;
  }
};

BotServiceClient.prototype.recv_getBotUseInfo = function() {
  var ret = this.input.readMessageBegin();
  var mtype = ret.mtype;
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(this.input);
    this.input.readMessageEnd();
    throw x;
  }
  var result = new BotService_getBotUseInfo_result();
  result.read(this.input);
  this.input.readMessageEnd();

  if (null !== result.e) {
    throw result.e;
  }
  if (null !== result.success) {
    return result.success;
  }
  throw 'getBotUseInfo failed: unknown result';
};

BotServiceClient.prototype.sendChatCheckedByWatermark = function(seq, mid, watermark, sessionId, callback) {
  this.send_sendChatCheckedByWatermark(seq, mid, watermark, sessionId, callback); 
  if (!callback) {
  this.recv_sendChatCheckedByWatermark();
  }
};

BotServiceClient.prototype.send_sendChatCheckedByWatermark = function(seq, mid, watermark, sessionId, callback) {
  var params = {
    seq: seq,
    mid: mid,
    watermark: watermark,
    sessionId: sessionId
  };
  var args = new BotService_sendChatCheckedByWatermark_args(params);
  try {
    this.output.writeMessageBegin('sendChatCheckedByWatermark', Thrift.MessageType.CALL, this.seqid);
    args.write(this.output);
    this.output.writeMessageEnd();
    if (callback) {
      var self = this;
      this.output.getTransport().flush(true, function() {
        var result = null;
        try {
          result = self.recv_sendChatCheckedByWatermark();
        } catch (e) {
          result = e;
        }
        callback(result);
      });
    } else {
      return this.output.getTransport().flush();
    }
  }
  catch (e) {
    if (typeof this.output.getTransport().reset === 'function') {
      this.output.getTransport().reset();
    }
    throw e;
  }
};

BotServiceClient.prototype.recv_sendChatCheckedByWatermark = function() {
  var ret = this.input.readMessageBegin();
  var mtype = ret.mtype;
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(this.input);
    this.input.readMessageEnd();
    throw x;
  }
  var result = new BotService_sendChatCheckedByWatermark_result();
  result.read(this.input);
  this.input.readMessageEnd();

  if (null !== result.e) {
    throw result.e;
  }
  return;
};
