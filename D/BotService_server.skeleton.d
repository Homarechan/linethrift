/*
 * This auto-generated skeleton file illustrates how to build a server. If you
 * intend to customize it, you should edit a copy with another file name to 
 * avoid overwriting it when running the generator again.
 */
module BotService_server;

import std.stdio;
import thrift.codegen.processor;
import thrift.protocol.binary;
import thrift.server.simple;
import thrift.server.transport.socket;
import thrift.transport.buffered;
import thrift.util.hashset;

import BotService;
import line_types;


class BotServiceHandler : BotService {
  this() {
    // Your initialization goes here.
  }

  void notifyLeaveGroup(string groupMid) {
    // Your implementation goes here.
    writeln("notifyLeaveGroup called");
  }

  void notifyLeaveRoom(string roomMid) {
    // Your implementation goes here.
    writeln("notifyLeaveRoom called");
  }

  BotUseInfo getBotUseInfo(string botMid) {
    // Your implementation goes here.
    writeln("getBotUseInfo called");
    return typeof(return).init;
  }

  void sendChatCheckedByWatermark(int seq, string mid, long watermark, byte sessionId) {
    // Your implementation goes here.
    writeln("sendChatCheckedByWatermark called");
  }

}

void main() {
  auto protocolFactory = new TBinaryProtocolFactory!();
  auto processor = new TServiceProcessor!BotService(new BotServiceHandler);
  auto serverTransport = new TServerSocket(9090);
  auto transportFactory = new TBufferedTransportFactory;
  auto server = new TSimpleServer(
    processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
}
