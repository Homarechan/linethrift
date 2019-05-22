//
// Autogenerated by Thrift Compiler (0.11.0)
//
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
//


//HELPER FUNCTIONS AND STRUCTURES

AccountSupervisorService_getRSAKey_args = function(args) {
};
AccountSupervisorService_getRSAKey_args.prototype = {};
AccountSupervisorService_getRSAKey_args.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    input.skip(ftype);
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

AccountSupervisorService_getRSAKey_args.prototype.write = function(output) {
  output.writeStructBegin('AccountSupervisorService_getRSAKey_args');
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

AccountSupervisorService_getRSAKey_result = function(args) {
  this.success = null;
  this.e = null;
  if (args instanceof TalkException) {
    this.e = args;
    return;
  }
  if (args) {
    if (args.success !== undefined && args.success !== null) {
      this.success = new RSAKey(args.success);
    }
    if (args.e !== undefined && args.e !== null) {
      this.e = args.e;
    }
  }
};
AccountSupervisorService_getRSAKey_result.prototype = {};
AccountSupervisorService_getRSAKey_result.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 0:
      if (ftype == Thrift.Type.STRUCT) {
        this.success = new RSAKey();
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

AccountSupervisorService_getRSAKey_result.prototype.write = function(output) {
  output.writeStructBegin('AccountSupervisorService_getRSAKey_result');
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

AccountSupervisorService_notifyEmailConfirmationResult_args = function(args) {
  this.parameterMap = null;
  if (args) {
    if (args.parameterMap !== undefined && args.parameterMap !== null) {
      this.parameterMap = Thrift.copyMap(args.parameterMap, [null]);
    }
  }
};
AccountSupervisorService_notifyEmailConfirmationResult_args.prototype = {};
AccountSupervisorService_notifyEmailConfirmationResult_args.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 2:
      if (ftype == Thrift.Type.MAP) {
        var _size1266 = 0;
        var _rtmp31270;
        this.parameterMap = {};
        var _ktype1267 = 0;
        var _vtype1268 = 0;
        _rtmp31270 = input.readMapBegin();
        _ktype1267 = _rtmp31270.ktype;
        _vtype1268 = _rtmp31270.vtype;
        _size1266 = _rtmp31270.size;
        for (var _i1271 = 0; _i1271 < _size1266; ++_i1271)
        {
          if (_i1271 > 0 ) {
            if (input.rstack.length > input.rpos[input.rpos.length -1] + 1) {
              input.rstack.pop();
            }
          }
          var key1272 = null;
          var val1273 = null;
          key1272 = input.readString().value;
          val1273 = input.readString().value;
          this.parameterMap[key1272] = val1273;
        }
        input.readMapEnd();
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

AccountSupervisorService_notifyEmailConfirmationResult_args.prototype.write = function(output) {
  output.writeStructBegin('AccountSupervisorService_notifyEmailConfirmationResult_args');
  if (this.parameterMap !== null && this.parameterMap !== undefined) {
    output.writeFieldBegin('parameterMap', Thrift.Type.MAP, 2);
    output.writeMapBegin(Thrift.Type.STRING, Thrift.Type.STRING, Thrift.objectLength(this.parameterMap));
    for (var kiter1274 in this.parameterMap)
    {
      if (this.parameterMap.hasOwnProperty(kiter1274))
      {
        var viter1275 = this.parameterMap[kiter1274];
        output.writeString(kiter1274);
        output.writeString(viter1275);
      }
    }
    output.writeMapEnd();
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

AccountSupervisorService_notifyEmailConfirmationResult_result = function(args) {
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
AccountSupervisorService_notifyEmailConfirmationResult_result.prototype = {};
AccountSupervisorService_notifyEmailConfirmationResult_result.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
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

AccountSupervisorService_notifyEmailConfirmationResult_result.prototype.write = function(output) {
  output.writeStructBegin('AccountSupervisorService_notifyEmailConfirmationResult_result');
  if (this.e !== null && this.e !== undefined) {
    output.writeFieldBegin('e', Thrift.Type.STRUCT, 1);
    this.e.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

AccountSupervisorService_registerVirtualAccount_args = function(args) {
  this.locale = null;
  this.encryptedVirtualUserId = null;
  this.encryptedPassword = null;
  if (args) {
    if (args.locale !== undefined && args.locale !== null) {
      this.locale = args.locale;
    }
    if (args.encryptedVirtualUserId !== undefined && args.encryptedVirtualUserId !== null) {
      this.encryptedVirtualUserId = args.encryptedVirtualUserId;
    }
    if (args.encryptedPassword !== undefined && args.encryptedPassword !== null) {
      this.encryptedPassword = args.encryptedPassword;
    }
  }
};
AccountSupervisorService_registerVirtualAccount_args.prototype = {};
AccountSupervisorService_registerVirtualAccount_args.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.locale = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.STRING) {
        this.encryptedVirtualUserId = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.STRING) {
        this.encryptedPassword = input.readString().value;
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

AccountSupervisorService_registerVirtualAccount_args.prototype.write = function(output) {
  output.writeStructBegin('AccountSupervisorService_registerVirtualAccount_args');
  if (this.locale !== null && this.locale !== undefined) {
    output.writeFieldBegin('locale', Thrift.Type.STRING, 2);
    output.writeString(this.locale);
    output.writeFieldEnd();
  }
  if (this.encryptedVirtualUserId !== null && this.encryptedVirtualUserId !== undefined) {
    output.writeFieldBegin('encryptedVirtualUserId', Thrift.Type.STRING, 3);
    output.writeString(this.encryptedVirtualUserId);
    output.writeFieldEnd();
  }
  if (this.encryptedPassword !== null && this.encryptedPassword !== undefined) {
    output.writeFieldBegin('encryptedPassword', Thrift.Type.STRING, 4);
    output.writeString(this.encryptedPassword);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

AccountSupervisorService_registerVirtualAccount_result = function(args) {
  this.success = null;
  this.e = null;
  if (args instanceof TalkException) {
    this.e = args;
    return;
  }
  if (args) {
    if (args.success !== undefined && args.success !== null) {
      this.success = args.success;
    }
    if (args.e !== undefined && args.e !== null) {
      this.e = args.e;
    }
  }
};
AccountSupervisorService_registerVirtualAccount_result.prototype = {};
AccountSupervisorService_registerVirtualAccount_result.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 0:
      if (ftype == Thrift.Type.STRING) {
        this.success = input.readString().value;
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

AccountSupervisorService_registerVirtualAccount_result.prototype.write = function(output) {
  output.writeStructBegin('AccountSupervisorService_registerVirtualAccount_result');
  if (this.success !== null && this.success !== undefined) {
    output.writeFieldBegin('success', Thrift.Type.STRING, 0);
    output.writeString(this.success);
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

AccountSupervisorService_requestVirtualAccountPasswordChange_args = function(args) {
  this.virtualMid = null;
  this.encryptedVirtualUserId = null;
  this.encryptedOldPassword = null;
  this.encryptedNewPassword = null;
  if (args) {
    if (args.virtualMid !== undefined && args.virtualMid !== null) {
      this.virtualMid = args.virtualMid;
    }
    if (args.encryptedVirtualUserId !== undefined && args.encryptedVirtualUserId !== null) {
      this.encryptedVirtualUserId = args.encryptedVirtualUserId;
    }
    if (args.encryptedOldPassword !== undefined && args.encryptedOldPassword !== null) {
      this.encryptedOldPassword = args.encryptedOldPassword;
    }
    if (args.encryptedNewPassword !== undefined && args.encryptedNewPassword !== null) {
      this.encryptedNewPassword = args.encryptedNewPassword;
    }
  }
};
AccountSupervisorService_requestVirtualAccountPasswordChange_args.prototype = {};
AccountSupervisorService_requestVirtualAccountPasswordChange_args.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.virtualMid = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.STRING) {
        this.encryptedVirtualUserId = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.STRING) {
        this.encryptedOldPassword = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.STRING) {
        this.encryptedNewPassword = input.readString().value;
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

AccountSupervisorService_requestVirtualAccountPasswordChange_args.prototype.write = function(output) {
  output.writeStructBegin('AccountSupervisorService_requestVirtualAccountPasswordChange_args');
  if (this.virtualMid !== null && this.virtualMid !== undefined) {
    output.writeFieldBegin('virtualMid', Thrift.Type.STRING, 2);
    output.writeString(this.virtualMid);
    output.writeFieldEnd();
  }
  if (this.encryptedVirtualUserId !== null && this.encryptedVirtualUserId !== undefined) {
    output.writeFieldBegin('encryptedVirtualUserId', Thrift.Type.STRING, 3);
    output.writeString(this.encryptedVirtualUserId);
    output.writeFieldEnd();
  }
  if (this.encryptedOldPassword !== null && this.encryptedOldPassword !== undefined) {
    output.writeFieldBegin('encryptedOldPassword', Thrift.Type.STRING, 4);
    output.writeString(this.encryptedOldPassword);
    output.writeFieldEnd();
  }
  if (this.encryptedNewPassword !== null && this.encryptedNewPassword !== undefined) {
    output.writeFieldBegin('encryptedNewPassword', Thrift.Type.STRING, 5);
    output.writeString(this.encryptedNewPassword);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

AccountSupervisorService_requestVirtualAccountPasswordChange_result = function(args) {
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
AccountSupervisorService_requestVirtualAccountPasswordChange_result.prototype = {};
AccountSupervisorService_requestVirtualAccountPasswordChange_result.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
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

AccountSupervisorService_requestVirtualAccountPasswordChange_result.prototype.write = function(output) {
  output.writeStructBegin('AccountSupervisorService_requestVirtualAccountPasswordChange_result');
  if (this.e !== null && this.e !== undefined) {
    output.writeFieldBegin('e', Thrift.Type.STRUCT, 1);
    this.e.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

AccountSupervisorService_requestVirtualAccountPasswordSet_args = function(args) {
  this.virtualMid = null;
  this.encryptedVirtualUserId = null;
  this.encryptedNewPassword = null;
  if (args) {
    if (args.virtualMid !== undefined && args.virtualMid !== null) {
      this.virtualMid = args.virtualMid;
    }
    if (args.encryptedVirtualUserId !== undefined && args.encryptedVirtualUserId !== null) {
      this.encryptedVirtualUserId = args.encryptedVirtualUserId;
    }
    if (args.encryptedNewPassword !== undefined && args.encryptedNewPassword !== null) {
      this.encryptedNewPassword = args.encryptedNewPassword;
    }
  }
};
AccountSupervisorService_requestVirtualAccountPasswordSet_args.prototype = {};
AccountSupervisorService_requestVirtualAccountPasswordSet_args.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.virtualMid = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.STRING) {
        this.encryptedVirtualUserId = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.STRING) {
        this.encryptedNewPassword = input.readString().value;
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

AccountSupervisorService_requestVirtualAccountPasswordSet_args.prototype.write = function(output) {
  output.writeStructBegin('AccountSupervisorService_requestVirtualAccountPasswordSet_args');
  if (this.virtualMid !== null && this.virtualMid !== undefined) {
    output.writeFieldBegin('virtualMid', Thrift.Type.STRING, 2);
    output.writeString(this.virtualMid);
    output.writeFieldEnd();
  }
  if (this.encryptedVirtualUserId !== null && this.encryptedVirtualUserId !== undefined) {
    output.writeFieldBegin('encryptedVirtualUserId', Thrift.Type.STRING, 3);
    output.writeString(this.encryptedVirtualUserId);
    output.writeFieldEnd();
  }
  if (this.encryptedNewPassword !== null && this.encryptedNewPassword !== undefined) {
    output.writeFieldBegin('encryptedNewPassword', Thrift.Type.STRING, 4);
    output.writeString(this.encryptedNewPassword);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

AccountSupervisorService_requestVirtualAccountPasswordSet_result = function(args) {
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
AccountSupervisorService_requestVirtualAccountPasswordSet_result.prototype = {};
AccountSupervisorService_requestVirtualAccountPasswordSet_result.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
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

AccountSupervisorService_requestVirtualAccountPasswordSet_result.prototype.write = function(output) {
  output.writeStructBegin('AccountSupervisorService_requestVirtualAccountPasswordSet_result');
  if (this.e !== null && this.e !== undefined) {
    output.writeFieldBegin('e', Thrift.Type.STRUCT, 1);
    this.e.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

AccountSupervisorService_unregisterVirtualAccount_args = function(args) {
  this.virtualMid = null;
  if (args) {
    if (args.virtualMid !== undefined && args.virtualMid !== null) {
      this.virtualMid = args.virtualMid;
    }
  }
};
AccountSupervisorService_unregisterVirtualAccount_args.prototype = {};
AccountSupervisorService_unregisterVirtualAccount_args.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.virtualMid = input.readString().value;
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

AccountSupervisorService_unregisterVirtualAccount_args.prototype.write = function(output) {
  output.writeStructBegin('AccountSupervisorService_unregisterVirtualAccount_args');
  if (this.virtualMid !== null && this.virtualMid !== undefined) {
    output.writeFieldBegin('virtualMid', Thrift.Type.STRING, 2);
    output.writeString(this.virtualMid);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

AccountSupervisorService_unregisterVirtualAccount_result = function(args) {
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
AccountSupervisorService_unregisterVirtualAccount_result.prototype = {};
AccountSupervisorService_unregisterVirtualAccount_result.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
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

AccountSupervisorService_unregisterVirtualAccount_result.prototype.write = function(output) {
  output.writeStructBegin('AccountSupervisorService_unregisterVirtualAccount_result');
  if (this.e !== null && this.e !== undefined) {
    output.writeFieldBegin('e', Thrift.Type.STRUCT, 1);
    this.e.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

AccountSupervisorServiceClient = function(input, output) {
    this.input = input;
    this.output = (!output) ? input : output;
    this.seqid = 0;
};
AccountSupervisorServiceClient.prototype = {};
AccountSupervisorServiceClient.prototype.getRSAKey = function(callback) {
  this.send_getRSAKey(callback); 
  if (!callback) {
    return this.recv_getRSAKey();
  }
};

AccountSupervisorServiceClient.prototype.send_getRSAKey = function(callback) {
  this.output.writeMessageBegin('getRSAKey', Thrift.MessageType.CALL, this.seqid);
  var args = new AccountSupervisorService_getRSAKey_args();
  args.write(this.output);
  this.output.writeMessageEnd();
  if (callback) {
    var self = this;
    this.output.getTransport().flush(true, function() {
      var result = null;
      try {
        result = self.recv_getRSAKey();
      } catch (e) {
        result = e;
      }
      callback(result);
    });
  } else {
    return this.output.getTransport().flush();
  }
};

AccountSupervisorServiceClient.prototype.recv_getRSAKey = function() {
  var ret = this.input.readMessageBegin();
  var fname = ret.fname;
  var mtype = ret.mtype;
  var rseqid = ret.rseqid;
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(this.input);
    this.input.readMessageEnd();
    throw x;
  }
  var result = new AccountSupervisorService_getRSAKey_result();
  result.read(this.input);
  this.input.readMessageEnd();

  if (null !== result.e) {
    throw result.e;
  }
  if (null !== result.success) {
    return result.success;
  }
  throw 'getRSAKey failed: unknown result';
};
AccountSupervisorServiceClient.prototype.notifyEmailConfirmationResult = function(parameterMap, callback) {
  this.send_notifyEmailConfirmationResult(parameterMap, callback); 
  if (!callback) {
  this.recv_notifyEmailConfirmationResult();
  }
};

AccountSupervisorServiceClient.prototype.send_notifyEmailConfirmationResult = function(parameterMap, callback) {
  this.output.writeMessageBegin('notifyEmailConfirmationResult', Thrift.MessageType.CALL, this.seqid);
  var params = {
    parameterMap: parameterMap
  };
  var args = new AccountSupervisorService_notifyEmailConfirmationResult_args(params);
  args.write(this.output);
  this.output.writeMessageEnd();
  if (callback) {
    var self = this;
    this.output.getTransport().flush(true, function() {
      var result = null;
      try {
        result = self.recv_notifyEmailConfirmationResult();
      } catch (e) {
        result = e;
      }
      callback(result);
    });
  } else {
    return this.output.getTransport().flush();
  }
};

AccountSupervisorServiceClient.prototype.recv_notifyEmailConfirmationResult = function() {
  var ret = this.input.readMessageBegin();
  var fname = ret.fname;
  var mtype = ret.mtype;
  var rseqid = ret.rseqid;
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(this.input);
    this.input.readMessageEnd();
    throw x;
  }
  var result = new AccountSupervisorService_notifyEmailConfirmationResult_result();
  result.read(this.input);
  this.input.readMessageEnd();

  if (null !== result.e) {
    throw result.e;
  }
  return;
};
AccountSupervisorServiceClient.prototype.registerVirtualAccount = function(locale, encryptedVirtualUserId, encryptedPassword, callback) {
  this.send_registerVirtualAccount(locale, encryptedVirtualUserId, encryptedPassword, callback); 
  if (!callback) {
    return this.recv_registerVirtualAccount();
  }
};

AccountSupervisorServiceClient.prototype.send_registerVirtualAccount = function(locale, encryptedVirtualUserId, encryptedPassword, callback) {
  this.output.writeMessageBegin('registerVirtualAccount', Thrift.MessageType.CALL, this.seqid);
  var params = {
    locale: locale,
    encryptedVirtualUserId: encryptedVirtualUserId,
    encryptedPassword: encryptedPassword
  };
  var args = new AccountSupervisorService_registerVirtualAccount_args(params);
  args.write(this.output);
  this.output.writeMessageEnd();
  if (callback) {
    var self = this;
    this.output.getTransport().flush(true, function() {
      var result = null;
      try {
        result = self.recv_registerVirtualAccount();
      } catch (e) {
        result = e;
      }
      callback(result);
    });
  } else {
    return this.output.getTransport().flush();
  }
};

AccountSupervisorServiceClient.prototype.recv_registerVirtualAccount = function() {
  var ret = this.input.readMessageBegin();
  var fname = ret.fname;
  var mtype = ret.mtype;
  var rseqid = ret.rseqid;
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(this.input);
    this.input.readMessageEnd();
    throw x;
  }
  var result = new AccountSupervisorService_registerVirtualAccount_result();
  result.read(this.input);
  this.input.readMessageEnd();

  if (null !== result.e) {
    throw result.e;
  }
  if (null !== result.success) {
    return result.success;
  }
  throw 'registerVirtualAccount failed: unknown result';
};
AccountSupervisorServiceClient.prototype.requestVirtualAccountPasswordChange = function(virtualMid, encryptedVirtualUserId, encryptedOldPassword, encryptedNewPassword, callback) {
  this.send_requestVirtualAccountPasswordChange(virtualMid, encryptedVirtualUserId, encryptedOldPassword, encryptedNewPassword, callback); 
  if (!callback) {
  this.recv_requestVirtualAccountPasswordChange();
  }
};

AccountSupervisorServiceClient.prototype.send_requestVirtualAccountPasswordChange = function(virtualMid, encryptedVirtualUserId, encryptedOldPassword, encryptedNewPassword, callback) {
  this.output.writeMessageBegin('requestVirtualAccountPasswordChange', Thrift.MessageType.CALL, this.seqid);
  var params = {
    virtualMid: virtualMid,
    encryptedVirtualUserId: encryptedVirtualUserId,
    encryptedOldPassword: encryptedOldPassword,
    encryptedNewPassword: encryptedNewPassword
  };
  var args = new AccountSupervisorService_requestVirtualAccountPasswordChange_args(params);
  args.write(this.output);
  this.output.writeMessageEnd();
  if (callback) {
    var self = this;
    this.output.getTransport().flush(true, function() {
      var result = null;
      try {
        result = self.recv_requestVirtualAccountPasswordChange();
      } catch (e) {
        result = e;
      }
      callback(result);
    });
  } else {
    return this.output.getTransport().flush();
  }
};

AccountSupervisorServiceClient.prototype.recv_requestVirtualAccountPasswordChange = function() {
  var ret = this.input.readMessageBegin();
  var fname = ret.fname;
  var mtype = ret.mtype;
  var rseqid = ret.rseqid;
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(this.input);
    this.input.readMessageEnd();
    throw x;
  }
  var result = new AccountSupervisorService_requestVirtualAccountPasswordChange_result();
  result.read(this.input);
  this.input.readMessageEnd();

  if (null !== result.e) {
    throw result.e;
  }
  return;
};
AccountSupervisorServiceClient.prototype.requestVirtualAccountPasswordSet = function(virtualMid, encryptedVirtualUserId, encryptedNewPassword, callback) {
  this.send_requestVirtualAccountPasswordSet(virtualMid, encryptedVirtualUserId, encryptedNewPassword, callback); 
  if (!callback) {
  this.recv_requestVirtualAccountPasswordSet();
  }
};

AccountSupervisorServiceClient.prototype.send_requestVirtualAccountPasswordSet = function(virtualMid, encryptedVirtualUserId, encryptedNewPassword, callback) {
  this.output.writeMessageBegin('requestVirtualAccountPasswordSet', Thrift.MessageType.CALL, this.seqid);
  var params = {
    virtualMid: virtualMid,
    encryptedVirtualUserId: encryptedVirtualUserId,
    encryptedNewPassword: encryptedNewPassword
  };
  var args = new AccountSupervisorService_requestVirtualAccountPasswordSet_args(params);
  args.write(this.output);
  this.output.writeMessageEnd();
  if (callback) {
    var self = this;
    this.output.getTransport().flush(true, function() {
      var result = null;
      try {
        result = self.recv_requestVirtualAccountPasswordSet();
      } catch (e) {
        result = e;
      }
      callback(result);
    });
  } else {
    return this.output.getTransport().flush();
  }
};

AccountSupervisorServiceClient.prototype.recv_requestVirtualAccountPasswordSet = function() {
  var ret = this.input.readMessageBegin();
  var fname = ret.fname;
  var mtype = ret.mtype;
  var rseqid = ret.rseqid;
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(this.input);
    this.input.readMessageEnd();
    throw x;
  }
  var result = new AccountSupervisorService_requestVirtualAccountPasswordSet_result();
  result.read(this.input);
  this.input.readMessageEnd();

  if (null !== result.e) {
    throw result.e;
  }
  return;
};
AccountSupervisorServiceClient.prototype.unregisterVirtualAccount = function(virtualMid, callback) {
  this.send_unregisterVirtualAccount(virtualMid, callback); 
  if (!callback) {
  this.recv_unregisterVirtualAccount();
  }
};

AccountSupervisorServiceClient.prototype.send_unregisterVirtualAccount = function(virtualMid, callback) {
  this.output.writeMessageBegin('unregisterVirtualAccount', Thrift.MessageType.CALL, this.seqid);
  var params = {
    virtualMid: virtualMid
  };
  var args = new AccountSupervisorService_unregisterVirtualAccount_args(params);
  args.write(this.output);
  this.output.writeMessageEnd();
  if (callback) {
    var self = this;
    this.output.getTransport().flush(true, function() {
      var result = null;
      try {
        result = self.recv_unregisterVirtualAccount();
      } catch (e) {
        result = e;
      }
      callback(result);
    });
  } else {
    return this.output.getTransport().flush();
  }
};

AccountSupervisorServiceClient.prototype.recv_unregisterVirtualAccount = function() {
  var ret = this.input.readMessageBegin();
  var fname = ret.fname;
  var mtype = ret.mtype;
  var rseqid = ret.rseqid;
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(this.input);
    this.input.readMessageEnd();
    throw x;
  }
  var result = new AccountSupervisorService_unregisterVirtualAccount_result();
  result.read(this.input);
  this.input.readMessageEnd();

  if (null !== result.e) {
    throw result.e;
  }
  return;
};