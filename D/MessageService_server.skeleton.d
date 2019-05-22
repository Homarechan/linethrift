/*
 * This auto-generated skeleton file illustrates how to build a server. If you
 * intend to customize it, you should edit a copy with another file name to 
 * avoid overwriting it when running the generator again.
 */
module MessageService_server;

import std.stdio;
import thrift.codegen.processor;
import thrift.protocol.binary;
import thrift.server.simple;
import thrift.server.transport.socket;
import thrift.transport.buffered;
import thrift.util.hashset;

import MessageService;
import line_types;


class MessageServiceHandler : MessageService {
  this() {
    // Your initialization goes here.
  }

  MessageOperations fetchMessageOperations(long localRevision, long lastOpTimestamp, int count) {
    // Your implementation goes here.
    writeln("fetchMessageOperations called");
    return typeof(return).init;
  }

  LastReadMessageIds getLastReadMessageIds(string chatId) {
    // Your implementation goes here.
    writeln("getLastReadMessageIds called");
    return typeof(return).init;
  }

  LastReadMessageIds[] multiGetLastReadMessageIds(string[] chatIds) {
    // Your implementation goes here.
    writeln("multiGetLastReadMessageIds called");
    return typeof(return).init;
  }

}

void main() {
  auto protocolFactory = new TBinaryProtocolFactory!();
  auto processor = new TServiceProcessor!MessageService(new MessageServiceHandler);
  auto serverTransport = new TServerSocket(9090);
  auto transportFactory = new TBufferedTransportFactory;
  auto server = new TSimpleServer(
    processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
}
