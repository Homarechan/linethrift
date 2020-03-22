/*
 * This auto-generated skeleton file illustrates how to build a server. If you
 * intend to customize it, you should edit a copy with another file name to 
 * avoid overwriting it when running the generator again.
 */
module ChannelApplicationProvidedService_server;

import std.stdio;
import thrift.codegen.processor;
import thrift.protocol.binary;
import thrift.server.simple;
import thrift.server.transport.socket;
import thrift.transport.buffered;
import thrift.util.hashset;

import ChannelApplicationProvidedService;
import line_types;


class ChannelApplicationProvidedServiceHandler : ChannelApplicationProvidedService {
  this() {
    // Your initialization goes here.
  }

  long activeBuddySubscriberCount() {
    // Your implementation goes here.
    writeln("activeBuddySubscriberCount called");
    return typeof(return).init;
  }

  void addOperationForChannel(OpType opType, string param1, string param2, string param3) {
    // Your implementation goes here.
    writeln("addOperationForChannel called");
  }

  long displayBuddySubscriberCount() {
    // Your implementation goes here.
    writeln("displayBuddySubscriberCount called");
    return typeof(return).init;
  }

  Contact findContactByUseridWithoutAbuseBlockForChannel(string userid) {
    // Your implementation goes here.
    writeln("findContactByUseridWithoutAbuseBlockForChannel called");
    return typeof(return).init;
  }

  string[] getAllContactIdsForChannel() {
    // Your implementation goes here.
    writeln("getAllContactIdsForChannel called");
    return typeof(return).init;
  }

  CompactContact[] getCompactContacts(long lastModifiedTimestamp) {
    // Your implementation goes here.
    writeln("getCompactContacts called");
    return typeof(return).init;
  }

  Contact[] getContactsForChannel(string[] ids) {
    // Your implementation goes here.
    writeln("getContactsForChannel called");
    return typeof(return).init;
  }

  string getDisplayName(string mid) {
    // Your implementation goes here.
    writeln("getDisplayName called");
    return typeof(return).init;
  }

  string[] getFavoriteMidsForChannel() {
    // Your implementation goes here.
    writeln("getFavoriteMidsForChannel called");
    return typeof(return).init;
  }

  string[] getFriendMids() {
    // Your implementation goes here.
    writeln("getFriendMids called");
    return typeof(return).init;
  }

  string[] getGroupMemberMids(string groupId) {
    // Your implementation goes here.
    writeln("getGroupMemberMids called");
    return typeof(return).init;
  }

  Group[] getGroupsForChannel(string[] groupIds) {
    // Your implementation goes here.
    writeln("getGroupsForChannel called");
    return typeof(return).init;
  }

  IdentityCredential getIdentityCredential() {
    // Your implementation goes here.
    writeln("getIdentityCredential called");
    return typeof(return).init;
  }

  string[] getJoinedGroupIdsForChannel() {
    // Your implementation goes here.
    writeln("getJoinedGroupIdsForChannel called");
    return typeof(return).init;
  }

  MetaProfile getMetaProfile() {
    // Your implementation goes here.
    writeln("getMetaProfile called");
    return typeof(return).init;
  }

  string getMid() {
    // Your implementation goes here.
    writeln("getMid called");
    return typeof(return).init;
  }

  SimpleChannelClient getPrimaryClientForChannel() {
    // Your implementation goes here.
    writeln("getPrimaryClientForChannel called");
    return typeof(return).init;
  }

  Profile getProfileForChannel() {
    // Your implementation goes here.
    writeln("getProfileForChannel called");
    return typeof(return).init;
  }

  SimpleChannelContact[] getSimpleChannelContacts(string[] ids) {
    // Your implementation goes here.
    writeln("getSimpleChannelContacts called");
    return typeof(return).init;
  }

  string getUserCountryForBilling(string country, string remoteIp) {
    // Your implementation goes here.
    writeln("getUserCountryForBilling called");
    return typeof(return).init;
  }

  long getUserCreateTime() {
    // Your implementation goes here.
    writeln("getUserCreateTime called");
    return typeof(return).init;
  }

  string[RegistrationType] getUserIdentities() {
    // Your implementation goes here.
    writeln("getUserIdentities called");
    return typeof(return).init;
  }

  string getUserLanguage() {
    // Your implementation goes here.
    writeln("getUserLanguage called");
    return typeof(return).init;
  }

  string[] getUserMidsWhoAddedMe() {
    // Your implementation goes here.
    writeln("getUserMidsWhoAddedMe called");
    return typeof(return).init;
  }

  bool isGroupMember(string groupId) {
    // Your implementation goes here.
    writeln("isGroupMember called");
    return typeof(return).init;
  }

  bool isInContact(string mid) {
    // Your implementation goes here.
    writeln("isInContact called");
    return typeof(return).init;
  }

  string registerChannelCP(string cpId, string registerPassword) {
    // Your implementation goes here.
    writeln("registerChannelCP called");
    return typeof(return).init;
  }

  void removeNotificationStatus(NotificationStatus notificationStatus) {
    // Your implementation goes here.
    writeln("removeNotificationStatus called");
  }

  Message sendMessageForChannel(ref const(Message) message) {
    // Your implementation goes here.
    writeln("sendMessageForChannel called");
    return typeof(return).init;
  }

  void sendPinCodeOperation(string verifier) {
    // Your implementation goes here.
    writeln("sendPinCodeOperation called");
  }

  void updateProfileAttributeForChannel(ProfileAttribute profileAttribute, string value) {
    // Your implementation goes here.
    writeln("updateProfileAttributeForChannel called");
  }

}

void main() {
  auto protocolFactory = new TBinaryProtocolFactory!();
  auto processor = new TServiceProcessor!ChannelApplicationProvidedService(new ChannelApplicationProvidedServiceHandler);
  auto serverTransport = new TServerSocket(9090);
  auto transportFactory = new TBufferedTransportFactory;
  auto server = new TSimpleServer(
    processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
}
