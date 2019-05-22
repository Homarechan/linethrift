/*
 * This auto-generated skeleton file illustrates how to build a server. If you
 * intend to customize it, you should edit a copy with another file name to 
 * avoid overwriting it when running the generator again.
 */
module BuddyService_server;

import std.stdio;
import thrift.codegen.processor;
import thrift.protocol.binary;
import thrift.server.simple;
import thrift.server.transport.socket;
import thrift.transport.buffered;
import thrift.util.hashset;

import BuddyService;
import line_types;


class BuddyServiceHandler : BuddyService {
  this() {
    // Your initialization goes here.
  }

  BuddySearchResult[] findBuddyContactsByQuery(string language, string country, string query, int fromIndex, int count, BuddySearchRequestSource requestSource) {
    // Your implementation goes here.
    writeln("findBuddyContactsByQuery called");
    return typeof(return).init;
  }

  Contact[] getBuddyContacts(string language, string country, string classification, int fromIndex, int count) {
    // Your implementation goes here.
    writeln("getBuddyContacts called");
    return typeof(return).init;
  }

  BuddyDetail getBuddyDetail(string buddyMid) {
    // Your implementation goes here.
    writeln("getBuddyDetail called");
    return typeof(return).init;
  }

  BuddyOnAir getBuddyOnAir(string buddyMid) {
    // Your implementation goes here.
    writeln("getBuddyOnAir called");
    return typeof(return).init;
  }

  string[] getCountriesHavingBuddy() {
    // Your implementation goes here.
    writeln("getCountriesHavingBuddy called");
    return typeof(return).init;
  }

  long[string] getNewlyReleasedBuddyIds(string country) {
    // Your implementation goes here.
    writeln("getNewlyReleasedBuddyIds called");
    return typeof(return).init;
  }

  BuddyBanner getPopularBuddyBanner(string language, string country, ApplicationType applicationType, string resourceSpecification) {
    // Your implementation goes here.
    writeln("getPopularBuddyBanner called");
    return typeof(return).init;
  }

  BuddyList[] getPopularBuddyLists(string language, string country) {
    // Your implementation goes here.
    writeln("getPopularBuddyLists called");
    return typeof(return).init;
  }

  Contact[] getPromotedBuddyContacts(string language, string country) {
    // Your implementation goes here.
    writeln("getPromotedBuddyContacts called");
    return typeof(return).init;
  }

}

void main() {
  auto protocolFactory = new TBinaryProtocolFactory!();
  auto processor = new TServiceProcessor!BuddyService(new BuddyServiceHandler);
  auto serverTransport = new TServerSocket(9090);
  auto transportFactory = new TBufferedTransportFactory;
  auto server = new TSimpleServer(
    processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
}
