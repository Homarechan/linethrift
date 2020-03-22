/*
 * This auto-generated skeleton file illustrates how to build a server. If you
 * intend to customize it, you should edit a copy with another file name to 
 * avoid overwriting it when running the generator again.
 */
module ChannelService_server;

import std.stdio;
import thrift.codegen.processor;
import thrift.protocol.binary;
import thrift.server.simple;
import thrift.server.transport.socket;
import thrift.transport.buffered;
import thrift.util.hashset;

import ChannelService;
import line_types;


class ChannelServiceHandler : ChannelService {
  this() {
    // Your initialization goes here.
  }

  OTPResult issueOTP(string channelId) {
    // Your implementation goes here.
    writeln("issueOTP called");
    return typeof(return).init;
  }

  ChannelToken approveChannelAndIssueChannelToken(string channelId) {
    // Your implementation goes here.
    writeln("approveChannelAndIssueChannelToken called");
    return typeof(return).init;
  }

  string approveChannelAndIssueRequestToken(string channelId, string otpId) {
    // Your implementation goes here.
    writeln("approveChannelAndIssueRequestToken called");
    return typeof(return).init;
  }

  NotificationFetchResult fetchNotificationItems(long localRev) {
    // Your implementation goes here.
    writeln("fetchNotificationItems called");
    return typeof(return).init;
  }

  ApprovedChannelInfos getApprovedChannels(long lastSynced, string locale) {
    // Your implementation goes here.
    writeln("getApprovedChannels called");
    return typeof(return).init;
  }

  ChannelInfo getChannelInfo(string channelId, string locale) {
    // Your implementation goes here.
    writeln("getChannelInfo called");
    return typeof(return).init;
  }

  ChannelNotificationSetting getChannelNotificationSetting(string channelId, string locale) {
    // Your implementation goes here.
    writeln("getChannelNotificationSetting called");
    return typeof(return).init;
  }

  ChannelNotificationSetting[] getChannelNotificationSettings(string locale) {
    // Your implementation goes here.
    writeln("getChannelNotificationSettings called");
    return typeof(return).init;
  }

  ChannelInfos getChannels(long lastSynced, string locale) {
    // Your implementation goes here.
    writeln("getChannels called");
    return typeof(return).init;
  }

  ChannelDomains getDomains(long lastSynced) {
    // Your implementation goes here.
    writeln("getDomains called");
    return typeof(return).init;
  }

  FriendChannelMatricesResponse getFriendChannelMatrices(string[] channelIds) {
    // Your implementation goes here.
    writeln("getFriendChannelMatrices called");
    return typeof(return).init;
  }

  bool updateChannelSettings(ref const(ChannelSettings) channelSettings) {
    // Your implementation goes here.
    writeln("updateChannelSettings called");
    return typeof(return).init;
  }

  ChannelDomains getCommonDomains(long lastSynced) {
    // Your implementation goes here.
    writeln("getCommonDomains called");
    return typeof(return).init;
  }

  int getNotificationBadgeCount(long localRev) {
    // Your implementation goes here.
    writeln("getNotificationBadgeCount called");
    return typeof(return).init;
  }

  ChannelToken issueChannelToken(string channelId) {
    // Your implementation goes here.
    writeln("issueChannelToken called");
    return typeof(return).init;
  }

  string issueRequestToken(string channelId, string otpId) {
    // Your implementation goes here.
    writeln("issueRequestToken called");
    return typeof(return).init;
  }

  RequestTokenResponse issueRequestTokenWithAuthScheme(string channelId, string otpId, string[] authScheme, string returnUrl) {
    // Your implementation goes here.
    writeln("issueRequestTokenWithAuthScheme called");
    return typeof(return).init;
  }

  string issueRequestTokenForAutoLogin(string channelId, string otpId, string redirectUrl) {
    // Your implementation goes here.
    writeln("issueRequestTokenForAutoLogin called");
    return typeof(return).init;
  }

  string[] getUpdatedChannelIds(ChannelIdWithLastUpdated[] channelIds) {
    // Your implementation goes here.
    writeln("getUpdatedChannelIds called");
    return typeof(return).init;
  }

  string reserveCoinUse(ref const(CoinUseReservation) request, string locale) {
    // Your implementation goes here.
    writeln("reserveCoinUse called");
    return typeof(return).init;
  }

  void revokeChannel(string channelId) {
    // Your implementation goes here.
    writeln("revokeChannel called");
  }

  ChannelSyncDatas syncChannelData(long lastSynced, string locale) {
    // Your implementation goes here.
    writeln("syncChannelData called");
    return typeof(return).init;
  }

  void updateChannelNotificationSetting(ChannelNotificationSetting[] setting) {
    // Your implementation goes here.
    writeln("updateChannelNotificationSetting called");
  }

}

void main() {
  auto protocolFactory = new TBinaryProtocolFactory!();
  auto processor = new TServiceProcessor!ChannelService(new ChannelServiceHandler);
  auto serverTransport = new TServerSocket(9090);
  auto transportFactory = new TBufferedTransportFactory;
  auto server = new TSimpleServer(
    processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
}
