/*
 * This auto-generated skeleton file illustrates how to build a server. If you
 * intend to customize it, you should edit a copy with another file name to 
 * avoid overwriting it when running the generator again.
 */
module AgeCheckService_server;

import std.stdio;
import thrift.codegen.processor;
import thrift.protocol.binary;
import thrift.server.simple;
import thrift.server.transport.socket;
import thrift.transport.buffered;
import thrift.util.hashset;

import AgeCheckService;
import line_types;


class AgeCheckServiceHandler : AgeCheckService {
  this() {
    // Your initialization goes here.
  }

  UserAgeType checkUserAge(CarrierCode carrier, string sessionId, string verifier, int standardAge) {
    // Your implementation goes here.
    writeln("checkUserAge called");
    return typeof(return).init;
  }

  AgeCheckDocomoResult checkUserAgeWithDocomo(string openIdRedirectUrl, int standardAge, string verifier) {
    // Your implementation goes here.
    writeln("checkUserAgeWithDocomo called");
    return typeof(return).init;
  }

  string retrieveOpenIdAuthUrlWithDocomo() {
    // Your implementation goes here.
    writeln("retrieveOpenIdAuthUrlWithDocomo called");
    return typeof(return).init;
  }

  AgeCheckRequestResult retrieveRequestToken(CarrierCode carrier) {
    // Your implementation goes here.
    writeln("retrieveRequestToken called");
    return typeof(return).init;
  }

}

void main() {
  auto protocolFactory = new TBinaryProtocolFactory!();
  auto processor = new TServiceProcessor!AgeCheckService(new AgeCheckServiceHandler);
  auto serverTransport = new TServerSocket(9090);
  auto transportFactory = new TBufferedTransportFactory;
  auto server = new TSimpleServer(
    processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
}
