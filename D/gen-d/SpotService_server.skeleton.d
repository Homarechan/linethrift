/*
 * This auto-generated skeleton file illustrates how to build a server. If you
 * intend to customize it, you should edit a copy with another file name to 
 * avoid overwriting it when running the generator again.
 */
module SpotService_server;

import std.stdio;
import thrift.codegen.processor;
import thrift.protocol.binary;
import thrift.server.simple;
import thrift.server.transport.socket;
import thrift.transport.buffered;
import thrift.util.hashset;

import SpotService;
import line_types;


class SpotServiceHandler : SpotService {
  this() {
    // Your initialization goes here.
  }

  SpotPhoneNumberResponse lookupByPhoneNumber(string countryAreaCode, string phoneNumber) {
    // Your implementation goes here.
    writeln("lookupByPhoneNumber called");
    return typeof(return).init;
  }

  SpotNearbyResponse lookupNearby(ref const(Location) location, SpotCategory category, string query, string countryAreaCode) {
    // Your implementation goes here.
    writeln("lookupNearby called");
    return typeof(return).init;
  }

}

void main() {
  auto protocolFactory = new TBinaryProtocolFactory!();
  auto processor = new TServiceProcessor!SpotService(new SpotServiceHandler);
  auto serverTransport = new TServerSocket(9090);
  auto transportFactory = new TBufferedTransportFactory;
  auto server = new TSimpleServer(
    processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
}
