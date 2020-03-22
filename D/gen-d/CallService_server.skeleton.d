/*
 * This auto-generated skeleton file illustrates how to build a server. If you
 * intend to customize it, you should edit a copy with another file name to 
 * avoid overwriting it when running the generator again.
 */
module CallService_server;

import std.stdio;
import thrift.codegen.processor;
import thrift.protocol.binary;
import thrift.server.simple;
import thrift.server.transport.socket;
import thrift.transport.buffered;
import thrift.util.hashset;

import CallService;
import line_types;


class CallServiceHandler : CallService {
  this() {
    // Your initialization goes here.
  }

  UserStatus getUserStatus(string mid) {
    // Your implementation goes here.
    writeln("getUserStatus called");
    return typeof(return).init;
  }

  void updateProfileAttributeForChannel(ProfileAttribute profileAttribute, string value) {
    // Your implementation goes here.
    writeln("updateProfileAttributeForChannel called");
  }

  void updateExtendedProfileAttribute(ExtendedProfileAttribute attr, ref const(ExtendedProfile) extendedProfile) {
    // Your implementation goes here.
    writeln("updateExtendedProfileAttribute called");
  }

  SimpleChannelContact[] getAllSimpleChannelContacts(bool statusSticonFallbackDisabled) {
    // Your implementation goes here.
    writeln("getAllSimpleChannelContacts called");
    return typeof(return).init;
  }

  string[RegistrationType] getUserIdentities() {
    // Your implementation goes here.
    writeln("getUserIdentities called");
    return typeof(return).init;
  }

  PaidCallDialing markPaidCallAd(string dialedNumber, string language, bool disableCallerId) {
    // Your implementation goes here.
    writeln("markPaidCallAd called");
    return typeof(return).init;
  }

  bool isGroupMember(string groupId) {
    // Your implementation goes here.
    writeln("isGroupMember called");
    return typeof(return).init;
  }

  PhoneInfoForChannel getPhoneInfoFromPhoneNumber(string region, string phoneNumber) {
    // Your implementation goes here.
    writeln("getPhoneInfoFromPhoneNumber called");
    return typeof(return).init;
  }

  PaidCallRedeemResult redeemPaidCallVoucher(string serial, string language) {
    // Your implementation goes here.
    writeln("redeemPaidCallVoucher called");
    return typeof(return).init;
  }

  string[string] getPreferredDisplayName(string[] mids) {
    // Your implementation goes here.
    writeln("getPreferredDisplayName called");
    return typeof(return).init;
  }

  Contact[] getContactsForChannel(string[] ids) {
    // Your implementation goes here.
    writeln("getContactsForChannel called");
    return typeof(return).init;
  }

  CoinProductItem[] getCallCreditProducts(PaymentType appStoreCode, PaymentPgType pgCode, string country, string language) {
    // Your implementation goes here.
    writeln("getCallCreditProducts called");
    return typeof(return).init;
  }

  CompactContact[] getCompactContacts(long lastModifiedTimestamp) {
    // Your implementation goes here.
    writeln("getCompactContacts called");
    return typeof(return).init;
  }

  void notifyNotiCenterEvent(ref const(NotiCenterEventData) event) {
    // Your implementation goes here.
    writeln("notifyNotiCenterEvent called");
  }

  bool isInContact(string mid) {
    // Your implementation goes here.
    writeln("isInContact called");
    return typeof(return).init;
  }

  SimpleChannelContact[] lookupGroupMembers(string groupId, string[] mids) {
    // Your implementation goes here.
    writeln("lookupGroupMembers called");
    return typeof(return).init;
  }

  Room getRoomInformation(string roomMid) {
    // Your implementation goes here.
    writeln("getRoomInformation called");
    return typeof(return).init;
  }

  GroupCall getGroupCall(string chatMid) {
    // Your implementation goes here.
    writeln("getGroupCall called");
    return typeof(return).init;
  }

  bool isAllowSecondaryDeviceLogin() {
    // Your implementation goes here.
    writeln("isAllowSecondaryDeviceLogin called");
    return typeof(return).init;
  }

  SimpleChannelClient getPrimaryClientForChannel() {
    // Your implementation goes here.
    writeln("getPrimaryClientForChannel called");
    return typeof(return).init;
  }

  Room createRoomWithBuddy(int reqSeq, string buddyMid, string[] contactIds) {
    // Your implementation goes here.
    writeln("createRoomWithBuddy called");
    return typeof(return).init;
  }

  string getDisplayName(string mid) {
    // Your implementation goes here.
    writeln("getDisplayName called");
    return typeof(return).init;
  }

  PaidCallMetadataResult getPaidCallMetadata(string language) {
    // Your implementation goes here.
    writeln("getPaidCallMetadata called");
    return typeof(return).init;
  }

  string getMid() {
    // Your implementation goes here.
    writeln("getMid called");
    return typeof(return).init;
  }

  string getUserCountryForBilling(string country, string remoteIp) {
    // Your implementation goes here.
    writeln("getUserCountryForBilling called");
    return typeof(return).init;
  }

  string[] getFavoriteGroupIdsForChannel() {
    // Your implementation goes here.
    writeln("getFavoriteGroupIdsForChannel called");
    return typeof(return).init;
  }

  PaidCallHistoryResult getPaidCallHistory(long start, int size, string language) {
    // Your implementation goes here.
    writeln("getPaidCallHistory called");
    return typeof(return).init;
  }

  void sendPinCodeOperation(string verifier) {
    // Your implementation goes here.
    writeln("sendPinCodeOperation called");
  }

  void inviteIntoGroupCall(string chatMid, string[] memberMids, GroupCallMediaType mediaType) {
    // Your implementation goes here.
    writeln("inviteIntoGroupCall called");
  }

  string[] getFriendMids() {
    // Your implementation goes here.
    writeln("getFriendMids called");
    return typeof(return).init;
  }

  MetaProfile getMetaProfile() {
    // Your implementation goes here.
    writeln("getMetaProfile called");
    return typeof(return).init;
  }

  Message sendMessageForChannel(ref const(Message) message) {
    // Your implementation goes here.
    writeln("sendMessageForChannel called");
    return typeof(return).init;
  }

  long activeBuddySubscriberCount() {
    // Your implementation goes here.
    writeln("activeBuddySubscriberCount called");
    return typeof(return).init;
  }

  CoinHistoryResult getCallCreditPurchaseHistory(ref const(CoinHistoryCondition) request) {
    // Your implementation goes here.
    writeln("getCallCreditPurchaseHistory called");
    return typeof(return).init;
  }

  bool isRoomMember(string roomId) {
    // Your implementation goes here.
    writeln("isRoomMember called");
    return typeof(return).init;
  }

  Message sendSystemOAMessage(ref const(Message) message) {
    // Your implementation goes here.
    writeln("sendSystemOAMessage called");
    return typeof(return).init;
  }

  PaidCallResponse acquirePaidCallRoute(PaidCallType paidCallType, string dialedNumber, string language, string networkCode, bool disableCallerId, string referer, string adSessionId) {
    // Your implementation goes here.
    writeln("acquirePaidCallRoute called");
    return typeof(return).init;
  }

  Group[] getGroupsForChannel(string[] groupIds) {
    // Your implementation goes here.
    writeln("getGroupsForChannel called");
    return typeof(return).init;
  }

  long getUserCreateTime() {
    // Your implementation goes here.
    writeln("getUserCreateTime called");
    return typeof(return).init;
  }

  string registerChannelCP(string cpId, string registerPassword) {
    // Your implementation goes here.
    writeln("registerChannelCP called");
    return typeof(return).init;
  }

  PaymentReservationResult reserveCallCreditPurchase(ref const(CoinPurchaseReservation) request) {
    // Your implementation goes here.
    writeln("reserveCallCreditPurchase called");
    return typeof(return).init;
  }

  PaidCallCurrencyExchangeRate[] acquirePaidCallCurrencyExchangeRate(string language) {
    // Your implementation goes here.
    writeln("acquirePaidCallCurrencyExchangeRate called");
    return typeof(return).init;
  }

  string[] getRoomMemberMidsForAppPlatform(string roomId) {
    // Your implementation goes here.
    writeln("getRoomMemberMidsForAppPlatform called");
    return typeof(return).init;
  }

  PaidCallBalance[] getPaidCallBalanceList(string language) {
    // Your implementation goes here.
    writeln("getPaidCallBalanceList called");
    return typeof(return).init;
  }

  string[PersonalInfo] getPersonalInfos(HashSet!(PersonalInfo) requiredPersonalInfos) {
    // Your implementation goes here.
    writeln("getPersonalInfos called");
    return typeof(return).init;
  }

  SimpleChannelClient[] getPrimaryClientsForChannel(string[] userMids) {
    // Your implementation goes here.
    writeln("getPrimaryClientsForChannel called");
    return typeof(return).init;
  }

  ContactTransition addBuddyToContact(string buddyMid) {
    // Your implementation goes here.
    writeln("addBuddyToContact called");
    return typeof(return).init;
  }

  string[] getGroupMemberMidsForAppPlatform(string groupId) {
    // Your implementation goes here.
    writeln("getGroupMemberMidsForAppPlatform called");
    return typeof(return).init;
  }

  string getUserLanguage() {
    // Your implementation goes here.
    writeln("getUserLanguage called");
    return typeof(return).init;
  }

  PaidCallResponse lookupPaidCall(string dialedNumber, string language, string referer) {
    // Your implementation goes here.
    writeln("lookupPaidCall called");
    return typeof(return).init;
  }

  ExtendedProfile getExtendedProfile() {
    // Your implementation goes here.
    writeln("getExtendedProfile called");
    return typeof(return).init;
  }

  CompactContact[string] getReverseCompactContacts(string[] ids) {
    // Your implementation goes here.
    writeln("getReverseCompactContacts called");
    return typeof(return).init;
  }

  PaidCallAdResult getPaidCallAdStatus() {
    // Your implementation goes here.
    writeln("getPaidCallAdStatus called");
    return typeof(return).init;
  }

  Contact findContactByUseridWithoutAbuseBlockForChannel(string userid) {
    // Your implementation goes here.
    writeln("findContactByUseridWithoutAbuseBlockForChannel called");
    return typeof(return).init;
  }

  string[] getGroupMemberMids(string groupId) {
    // Your implementation goes here.
    writeln("getGroupMemberMids called");
    return typeof(return).init;
  }

  Message sendMessageWithoutRelationship(ref const(Message) message) {
    // Your implementation goes here.
    writeln("sendMessageWithoutRelationship called");
    return typeof(return).init;
  }

  long[string] displayBuddySubscriberCountInBulk(string[] mids) {
    // Your implementation goes here.
    writeln("displayBuddySubscriberCountInBulk called");
    return typeof(return).init;
  }

  SimpleChannelContact[] lookupRoomMembers(string roomId, string[] mids) {
    // Your implementation goes here.
    writeln("lookupRoomMembers called");
    return typeof(return).init;
  }

  string[] getFavoriteMidsForChannel() {
    // Your implementation goes here.
    writeln("getFavoriteMidsForChannel called");
    return typeof(return).init;
  }

  string[] getAllContactIdsForChannel() {
    // Your implementation goes here.
    writeln("getAllContactIdsForChannel called");
    return typeof(return).init;
  }

  long displayBuddySubscriberCount() {
    // Your implementation goes here.
    writeln("displayBuddySubscriberCount called");
    return typeof(return).init;
  }

  Profile getProfileForChannel() {
    // Your implementation goes here.
    writeln("getProfileForChannel called");
    return typeof(return).init;
  }

  UserTicketResponse[] getUserTickets(string[] userMids) {
    // Your implementation goes here.
    writeln("getUserTickets called");
    return typeof(return).init;
  }

  string[] getOAFriendMids() {
    // Your implementation goes here.
    writeln("getOAFriendMids called");
    return typeof(return).init;
  }

  PaidCallUserRate[] searchPaidCallUserRate(string countryCode, string language) {
    // Your implementation goes here.
    writeln("searchPaidCallUserRate called");
    return typeof(return).init;
  }

  string[] getJoinedGroupIdsForChannel() {
    // Your implementation goes here.
    writeln("getJoinedGroupIdsForChannel called");
    return typeof(return).init;
  }

  GroupCallRoute acquireGroupCallRoute(string chatMid, GroupCallMediaType mediaType) {
    // Your implementation goes here.
    writeln("acquireGroupCallRoute called");
    return typeof(return).init;
  }

  string[] getUserMidsWhoAddedMe() {
    // Your implementation goes here.
    writeln("getUserMidsWhoAddedMe called");
    return typeof(return).init;
  }

  IdentityCredential getIdentityCredential() {
    // Your implementation goes here.
    writeln("getIdentityCredential called");
    return typeof(return).init;
  }

  void addOperationForChannel(OpType opType, string param1, string param2, string param3) {
    // Your implementation goes here.
    writeln("addOperationForChannel called");
  }

  SimpleChannelContact[] getSimpleChannelContacts(string[] ids, bool statusSticonFallbackDisabled) {
    // Your implementation goes here.
    writeln("getSimpleChannelContacts called");
    return typeof(return).init;
  }

  long getUserLastSentMessageTimeStamp(string mid) {
    // Your implementation goes here.
    writeln("getUserLastSentMessageTimeStamp called");
    return typeof(return).init;
  }

}

void main() {
  auto protocolFactory = new TBinaryProtocolFactory!();
  auto processor = new TServiceProcessor!CallService(new CallServiceHandler);
  auto serverTransport = new TServerSocket(9090);
  auto transportFactory = new TBufferedTransportFactory;
  auto server = new TSimpleServer(
    processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
}
