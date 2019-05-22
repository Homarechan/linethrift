/*
 * This auto-generated skeleton file illustrates how to build a server. If you
 * intend to customize it, you should edit a copy with another file name to 
 * avoid overwriting it when running the generator again.
 */
module BuddyManagementService_server;

import std.stdio;
import thrift.codegen.processor;
import thrift.protocol.binary;
import thrift.server.simple;
import thrift.server.transport.socket;
import thrift.transport.buffered;
import thrift.util.hashset;

import BuddyManagementService;
import line_types;


class BuddyManagementServiceHandler : BuddyManagementService {
  this() {
    // Your initialization goes here.
  }

  void addBuddyMember(string requestId, string userMid) {
    // Your implementation goes here.
    writeln("addBuddyMember called");
  }

  void addBuddyMembers(string requestId, string[] userMids) {
    // Your implementation goes here.
    writeln("addBuddyMembers called");
  }

  void blockBuddyMember(string requestId, string mid) {
    // Your implementation goes here.
    writeln("blockBuddyMember called");
  }

  SendBuddyMessageResult[] commitSendMessagesToAll(string[] requestIdList) {
    // Your implementation goes here.
    writeln("commitSendMessagesToAll called");
    return typeof(return).init;
  }

  SendBuddyMessageResult[] commitSendMessagesToMids(string[] requestIdList, string[] mids) {
    // Your implementation goes here.
    writeln("commitSendMessagesToMids called");
    return typeof(return).init;
  }

  bool containsBuddyMember(string requestId, string userMid) {
    // Your implementation goes here.
    writeln("containsBuddyMember called");
    return typeof(return).init;
  }

  string downloadMessageContent(string requestId, string messageId) {
    // Your implementation goes here.
    writeln("downloadMessageContent called");
    return typeof(return).init;
  }

  string downloadMessageContentPreview(string requestId, string messageId) {
    // Your implementation goes here.
    writeln("downloadMessageContentPreview called");
    return typeof(return).init;
  }

  string downloadProfileImage(string requestId) {
    // Your implementation goes here.
    writeln("downloadProfileImage called");
    return typeof(return).init;
  }

  string downloadProfileImagePreview(string requestId) {
    // Your implementation goes here.
    writeln("downloadProfileImagePreview called");
    return typeof(return).init;
  }

  long getActiveMemberCountByBuddyMid(string buddyMid) {
    // Your implementation goes here.
    writeln("getActiveMemberCountByBuddyMid called");
    return typeof(return).init;
  }

  string[] getActiveMemberMidsByBuddyMid(string buddyMid) {
    // Your implementation goes here.
    writeln("getActiveMemberMidsByBuddyMid called");
    return typeof(return).init;
  }

  string[] getAllBuddyMembers() {
    // Your implementation goes here.
    writeln("getAllBuddyMembers called");
    return typeof(return).init;
  }

  string[] getBlockedBuddyMembers() {
    // Your implementation goes here.
    writeln("getBlockedBuddyMembers called");
    return typeof(return).init;
  }

  long getBlockerCountByBuddyMid(string buddyMid) {
    // Your implementation goes here.
    writeln("getBlockerCountByBuddyMid called");
    return typeof(return).init;
  }

  BuddyDetail getBuddyDetailByMid(string buddyMid) {
    // Your implementation goes here.
    writeln("getBuddyDetailByMid called");
    return typeof(return).init;
  }

  BuddyProfile getBuddyProfile() {
    // Your implementation goes here.
    writeln("getBuddyProfile called");
    return typeof(return).init;
  }

  Ticket getContactTicket() {
    // Your implementation goes here.
    writeln("getContactTicket called");
    return typeof(return).init;
  }

  long getMemberCountByBuddyMid(string buddyMid) {
    // Your implementation goes here.
    writeln("getMemberCountByBuddyMid called");
    return typeof(return).init;
  }

  SendBuddyMessageResult getSendBuddyMessageResult(string sendBuddyMessageRequestId) {
    // Your implementation goes here.
    writeln("getSendBuddyMessageResult called");
    return typeof(return).init;
  }

  SetBuddyOnAirResult getSetBuddyOnAirResult(string setBuddyOnAirRequestId) {
    // Your implementation goes here.
    writeln("getSetBuddyOnAirResult called");
    return typeof(return).init;
  }

  UpdateBuddyProfileResult getUpdateBuddyProfileResult(string updateBuddyProfileRequestId) {
    // Your implementation goes here.
    writeln("getUpdateBuddyProfileResult called");
    return typeof(return).init;
  }

  bool isBuddyOnAirByMid(string buddyMid) {
    // Your implementation goes here.
    writeln("isBuddyOnAirByMid called");
    return typeof(return).init;
  }

  string linkAndSendBuddyContentMessageToAllAsync(string requestId, ref const(Message) msg, string sourceContentId) {
    // Your implementation goes here.
    writeln("linkAndSendBuddyContentMessageToAllAsync called");
    return typeof(return).init;
  }

  SendBuddyMessageResult linkAndSendBuddyContentMessageToMids(string requestId, ref const(Message) msg, string sourceContentId, string[] mids) {
    // Your implementation goes here.
    writeln("linkAndSendBuddyContentMessageToMids called");
    return typeof(return).init;
  }

  void notifyBuddyBlocked(string buddyMid, string blockerMid) {
    // Your implementation goes here.
    writeln("notifyBuddyBlocked called");
  }

  void notifyBuddyUnblocked(string buddyMid, string blockerMid) {
    // Your implementation goes here.
    writeln("notifyBuddyUnblocked called");
  }

  string registerBuddy(string buddyId, string searchId, string displayName, string statusMeessage, string picture, string[string] settings) {
    // Your implementation goes here.
    writeln("registerBuddy called");
    return typeof(return).init;
  }

  string registerBuddyAdmin(string buddyId, string searchId, string displayName, string statusMessage, string picture) {
    // Your implementation goes here.
    writeln("registerBuddyAdmin called");
    return typeof(return).init;
  }

  string reissueContactTicket(long expirationTime, int maxUseCount) {
    // Your implementation goes here.
    writeln("reissueContactTicket called");
    return typeof(return).init;
  }

  void removeBuddyMember(string requestId, string userMid) {
    // Your implementation goes here.
    writeln("removeBuddyMember called");
  }

  void removeBuddyMembers(string requestId, string[] userMids) {
    // Your implementation goes here.
    writeln("removeBuddyMembers called");
  }

  SendBuddyMessageResult sendBuddyContentMessageToAll(string requestId, ref const(Message) msg, string content) {
    // Your implementation goes here.
    writeln("sendBuddyContentMessageToAll called");
    return typeof(return).init;
  }

  string sendBuddyContentMessageToAllAsync(string requestId, ref const(Message) msg, string content) {
    // Your implementation goes here.
    writeln("sendBuddyContentMessageToAllAsync called");
    return typeof(return).init;
  }

  SendBuddyMessageResult sendBuddyContentMessageToMids(string requestId, ref const(Message) msg, string content, string[] mids) {
    // Your implementation goes here.
    writeln("sendBuddyContentMessageToMids called");
    return typeof(return).init;
  }

  string sendBuddyContentMessageToMidsAsync(string requestId, ref const(Message) msg, string content, string[] mids) {
    // Your implementation goes here.
    writeln("sendBuddyContentMessageToMidsAsync called");
    return typeof(return).init;
  }

  SendBuddyMessageResult sendBuddyMessageToAll(string requestId, ref const(Message) msg) {
    // Your implementation goes here.
    writeln("sendBuddyMessageToAll called");
    return typeof(return).init;
  }

  string sendBuddyMessageToAllAsync(string requestId, ref const(Message) msg) {
    // Your implementation goes here.
    writeln("sendBuddyMessageToAllAsync called");
    return typeof(return).init;
  }

  SendBuddyMessageResult sendBuddyMessageToMids(string requestId, ref const(Message) msg, string[] mids) {
    // Your implementation goes here.
    writeln("sendBuddyMessageToMids called");
    return typeof(return).init;
  }

  string sendBuddyMessageToMidsAsync(string requestId, ref const(Message) msg, string[] mids) {
    // Your implementation goes here.
    writeln("sendBuddyMessageToMidsAsync called");
    return typeof(return).init;
  }

  void sendIndividualEventToAllAsync(string requestId, string buddyMid, NotificationStatus notificationStatus) {
    // Your implementation goes here.
    writeln("sendIndividualEventToAllAsync called");
  }

  SetBuddyOnAirResult setBuddyOnAir(string requestId, bool onAir) {
    // Your implementation goes here.
    writeln("setBuddyOnAir called");
    return typeof(return).init;
  }

  string setBuddyOnAirAsync(string requestId, bool onAir) {
    // Your implementation goes here.
    writeln("setBuddyOnAirAsync called");
    return typeof(return).init;
  }

  SendBuddyMessageResult storeMessage(string requestId, ref const(BuddyMessageRequest) messageRequest) {
    // Your implementation goes here.
    writeln("storeMessage called");
    return typeof(return).init;
  }

  void unblockBuddyMember(string requestId, string mid) {
    // Your implementation goes here.
    writeln("unblockBuddyMember called");
  }

  void unregisterBuddy(string requestId) {
    // Your implementation goes here.
    writeln("unregisterBuddy called");
  }

  void unregisterBuddyAdmin(string requestId) {
    // Your implementation goes here.
    writeln("unregisterBuddyAdmin called");
  }

  void updateBuddyAdminProfileAttribute(string requestId, string[string] attributes) {
    // Your implementation goes here.
    writeln("updateBuddyAdminProfileAttribute called");
  }

  void updateBuddyAdminProfileImage(string requestId, string picture) {
    // Your implementation goes here.
    writeln("updateBuddyAdminProfileImage called");
  }

  UpdateBuddyProfileResult updateBuddyProfileAttributes(string requestId, string[string] attributes) {
    // Your implementation goes here.
    writeln("updateBuddyProfileAttributes called");
    return typeof(return).init;
  }

  string updateBuddyProfileAttributesAsync(string requestId, string[string] attributes) {
    // Your implementation goes here.
    writeln("updateBuddyProfileAttributesAsync called");
    return typeof(return).init;
  }

  UpdateBuddyProfileResult updateBuddyProfileImage(string requestId, string image) {
    // Your implementation goes here.
    writeln("updateBuddyProfileImage called");
    return typeof(return).init;
  }

  string updateBuddyProfileImageAsync(string requestId, string image) {
    // Your implementation goes here.
    writeln("updateBuddyProfileImageAsync called");
    return typeof(return).init;
  }

  void updateBuddySearchId(string requestId, string searchId) {
    // Your implementation goes here.
    writeln("updateBuddySearchId called");
  }

  void updateBuddySettings(string[string] settings) {
    // Your implementation goes here.
    writeln("updateBuddySettings called");
  }

  string uploadBuddyContent(ContentType contentType, string content) {
    // Your implementation goes here.
    writeln("uploadBuddyContent called");
    return typeof(return).init;
  }

}

void main() {
  auto protocolFactory = new TBinaryProtocolFactory!();
  auto processor = new TServiceProcessor!BuddyManagementService(new BuddyManagementServiceHandler);
  auto serverTransport = new TServerSocket(9090);
  auto transportFactory = new TBufferedTransportFactory;
  auto server = new TSimpleServer(
    processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
}
