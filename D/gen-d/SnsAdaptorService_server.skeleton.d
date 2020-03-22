/*
 * This auto-generated skeleton file illustrates how to build a server. If you
 * intend to customize it, you should edit a copy with another file name to 
 * avoid overwriting it when running the generator again.
 */
module SnsAdaptorService_server;

import std.stdio;
import thrift.codegen.processor;
import thrift.protocol.binary;
import thrift.server.simple;
import thrift.server.transport.socket;
import thrift.transport.buffered;
import thrift.util.hashset;

import SnsAdaptorService;
import line_types;


class SnsAdaptorServiceHandler : SnsAdaptorService {
  this() {
    // Your initialization goes here.
  }

  SnsFriends getSnsFriends(SnsIdType snsIdType, string snsAccessToken, int startIdx, int limit) {
    // Your implementation goes here.
    writeln("getSnsFriends called");
    return typeof(return).init;
  }

  SnsProfile getSnsMyProfile(SnsIdType snsIdType, string snsAccessToken) {
    // Your implementation goes here.
    writeln("getSnsMyProfile called");
    return typeof(return).init;
  }

  void postSnsInvitationMessage(SnsIdType snsIdType, string snsAccessToken, string toSnsUserId) {
    // Your implementation goes here.
    writeln("postSnsInvitationMessage called");
  }

}

void main() {
  auto protocolFactory = new TBinaryProtocolFactory!();
  auto processor = new TServiceProcessor!SnsAdaptorService(new SnsAdaptorServiceHandler);
  auto serverTransport = new TServerSocket(9090);
  auto transportFactory = new TBufferedTransportFactory;
  auto server = new TSimpleServer(
    processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
}
