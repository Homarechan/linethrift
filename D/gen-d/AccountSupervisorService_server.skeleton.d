/*
 * This auto-generated skeleton file illustrates how to build a server. If you
 * intend to customize it, you should edit a copy with another file name to 
 * avoid overwriting it when running the generator again.
 */
module AccountSupervisorService_server;

import std.stdio;
import thrift.codegen.processor;
import thrift.protocol.binary;
import thrift.server.simple;
import thrift.server.transport.socket;
import thrift.transport.buffered;
import thrift.util.hashset;

import AccountSupervisorService;
import line_types;


class AccountSupervisorServiceHandler : AccountSupervisorService {
  this() {
    // Your initialization goes here.
  }

  RSAKey getRSAKey() {
    // Your implementation goes here.
    writeln("getRSAKey called");
    return typeof(return).init;
  }

  void notifyEmailConfirmationResult(string[string] parameterMap) {
    // Your implementation goes here.
    writeln("notifyEmailConfirmationResult called");
  }

  string registerVirtualAccount(string locale, string encryptedVirtualUserId, string encryptedPassword) {
    // Your implementation goes here.
    writeln("registerVirtualAccount called");
    return typeof(return).init;
  }

  void requestVirtualAccountPasswordChange(string virtualMid, string encryptedVirtualUserId, string encryptedOldPassword, string encryptedNewPassword) {
    // Your implementation goes here.
    writeln("requestVirtualAccountPasswordChange called");
  }

  void requestVirtualAccountPasswordSet(string virtualMid, string encryptedVirtualUserId, string encryptedNewPassword) {
    // Your implementation goes here.
    writeln("requestVirtualAccountPasswordSet called");
  }

  void unregisterVirtualAccount(string virtualMid) {
    // Your implementation goes here.
    writeln("unregisterVirtualAccount called");
  }

}

void main() {
  auto protocolFactory = new TBinaryProtocolFactory!();
  auto processor = new TServiceProcessor!AccountSupervisorService(new AccountSupervisorServiceHandler);
  auto serverTransport = new TServerSocket(9090);
  auto transportFactory = new TBufferedTransportFactory;
  auto server = new TSimpleServer(
    processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
}
