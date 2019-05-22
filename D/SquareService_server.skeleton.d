/*
 * This auto-generated skeleton file illustrates how to build a server. If you
 * intend to customize it, you should edit a copy with another file name to 
 * avoid overwriting it when running the generator again.
 */
module SquareService_server;

import std.stdio;
import thrift.codegen.processor;
import thrift.protocol.binary;
import thrift.server.simple;
import thrift.server.transport.socket;
import thrift.transport.buffered;
import thrift.util.hashset;

import SquareService;
import line_types;


class SquareServiceHandler : SquareService {
  this() {
    // Your initialization goes here.
  }

  GetSquareChatAnnouncementsResponse getSquareChatAnnouncements(ref const(GetSquareChatAnnouncementsRequest) request) {
    // Your implementation goes here.
    writeln("getSquareChatAnnouncements called");
    return typeof(return).init;
  }

  DeleteSquareChatAnnouncementResponse deleteSquareChatAnnouncement(ref const(DeleteSquareChatAnnouncementRequest) request) {
    // Your implementation goes here.
    writeln("deleteSquareChatAnnouncement called");
    return typeof(return).init;
  }

  CreateSquareChatAnnouncementResponse createSquareChatAnnouncement(ref const(CreateSquareChatAnnouncementRequest) request) {
    // Your implementation goes here.
    writeln("createSquareChatAnnouncement called");
    return typeof(return).init;
  }

  GetNoteStatusResponse getNoteStatus(ref const(GetNoteStatusRequest) request) {
    // Your implementation goes here.
    writeln("getNoteStatus called");
    return typeof(return).init;
  }

  GetSquareStatusResponse getSquareStatus(ref const(GetSquareStatusRequest) request) {
    // Your implementation goes here.
    writeln("getSquareStatus called");
    return typeof(return).init;
  }

  ReportSquareMemberResponse reportSquareMember(ref const(ReportSquareMemberRequest) request) {
    // Your implementation goes here.
    writeln("reportSquareMember called");
    return typeof(return).init;
  }

  ReportSquareMessageResponse reportSquareMessage(ref const(ReportSquareMessageRequest) request) {
    // Your implementation goes here.
    writeln("reportSquareMessage called");
    return typeof(return).init;
  }

  ReportSquareChatResponse reportSquareChat(ref const(ReportSquareChatRequest) request) {
    // Your implementation goes here.
    writeln("reportSquareChat called");
    return typeof(return).init;
  }

  ReportSquareResponse reportSquare(ref const(ReportSquareRequest) request) {
    // Your implementation goes here.
    writeln("reportSquare called");
    return typeof(return).init;
  }

  UpdateSquareMemberRelationResponse updateSquareMemberRelation(ref const(UpdateSquareMemberRelationRequest) request) {
    // Your implementation goes here.
    writeln("updateSquareMemberRelation called");
    return typeof(return).init;
  }

  UpdateSquareAuthorityResponse updateSquareAuthority(ref const(UpdateSquareAuthorityRequest) request) {
    // Your implementation goes here.
    writeln("updateSquareAuthority called");
    return typeof(return).init;
  }

  UpdateSquareChatMemberResponse updateSquareChatMember(ref const(UpdateSquareChatMemberRequest) request) {
    // Your implementation goes here.
    writeln("updateSquareChatMember called");
    return typeof(return).init;
  }

  UpdateSquareChatResponse updateSquareChat(ref const(UpdateSquareChatRequest) request) {
    // Your implementation goes here.
    writeln("updateSquareChat called");
    return typeof(return).init;
  }

  RefreshSubscriptionsResponse refreshSubscriptions(ref const(RefreshSubscriptionsRequest) request) {
    // Your implementation goes here.
    writeln("refreshSubscriptions called");
    return typeof(return).init;
  }

  RemoveSubscriptionsResponse removeSubscriptions(ref const(RemoveSubscriptionsRequest) request) {
    // Your implementation goes here.
    writeln("removeSubscriptions called");
    return typeof(return).init;
  }

  RejectSquareMembersResponse rejectSquareMembers(ref const(RejectSquareMembersRequest) request) {
    // Your implementation goes here.
    writeln("rejectSquareMembers called");
    return typeof(return).init;
  }

  UpdateSquareMembersResponse updateSquareMembers(ref const(UpdateSquareMembersRequest) request) {
    // Your implementation goes here.
    writeln("updateSquareMembers called");
    return typeof(return).init;
  }

  UpdateSquareMemberResponse updateSquareMember(ref const(UpdateSquareMemberRequest) request) {
    // Your implementation goes here.
    writeln("updateSquareMember called");
    return typeof(return).init;
  }

  UpdateSquareFeatureSetResponse updateSquareFeatureSet(ref const(UpdateSquareFeatureSetRequest) request) {
    // Your implementation goes here.
    writeln("updateSquareFeatureSet called");
    return typeof(return).init;
  }

  GetSquareFeatureSetResponse getSquareFeatureSet(ref const(GetSquareFeatureSetRequest) request) {
    // Your implementation goes here.
    writeln("getSquareFeatureSet called");
    return typeof(return).init;
  }

  SearchSquaresResponse searchSquares(ref const(SearchSquaresRequest) request) {
    // Your implementation goes here.
    writeln("searchSquares called");
    return typeof(return).init;
  }

  UpdateSquareResponse updateSquare(ref const(UpdateSquareRequest) request) {
    // Your implementation goes here.
    writeln("updateSquare called");
    return typeof(return).init;
  }

  GetSquareCategoriesResponse getCategories(ref const(GetSquareCategoriesRequest) request) {
    // Your implementation goes here.
    writeln("getCategories called");
    return typeof(return).init;
  }

  SearchSquareMembersResponse searchSquareMembers(ref const(SearchSquareMembersRequest) request) {
    // Your implementation goes here.
    writeln("searchSquareMembers called");
    return typeof(return).init;
  }

  FetchSquareChatEventsResponse fetchSquareChatEvents(ref const(FetchSquareChatEventsRequest) request) {
    // Your implementation goes here.
    writeln("fetchSquareChatEvents called");
    return typeof(return).init;
  }

  FetchMyEventsResponse fetchMyEvents(ref const(FetchMyEventsRequest) request) {
    // Your implementation goes here.
    writeln("fetchMyEvents called");
    return typeof(return).init;
  }

  MarkAsReadResponse markAsRead(ref const(MarkAsReadRequest) request) {
    // Your implementation goes here.
    writeln("markAsRead called");
    return typeof(return).init;
  }

  GetSquareAuthorityResponse getSquareAuthority(ref const(GetSquareAuthorityRequest) request) {
    // Your implementation goes here.
    writeln("getSquareAuthority called");
    return typeof(return).init;
  }

  SendMessageResponse sendMessage(ref const(SendMessageRequest) request) {
    // Your implementation goes here.
    writeln("sendMessage called");
    return typeof(return).init;
  }

  LeaveSquareResponse leaveSquare(ref const(LeaveSquareRequest) request) {
    // Your implementation goes here.
    writeln("leaveSquare called");
    return typeof(return).init;
  }

  LeaveSquareChatResponse leaveSquareChat(ref const(LeaveSquareChatRequest) request) {
    // Your implementation goes here.
    writeln("leaveSquareChat called");
    return typeof(return).init;
  }

  JoinSquareChatResponse joinSquareChat(ref const(JoinSquareChatRequest) request) {
    // Your implementation goes here.
    writeln("joinSquareChat called");
    return typeof(return).init;
  }

  JoinSquareResponse joinSquare(ref const(JoinSquareRequest) request) {
    // Your implementation goes here.
    writeln("joinSquare called");
    return typeof(return).init;
  }

  InviteToSquareResponse inviteToSquare(ref const(InviteToSquareRequest) request) {
    // Your implementation goes here.
    writeln("inviteToSquare called");
    return typeof(return).init;
  }

  InviteToSquareChatResponse inviteToSquareChat(ref const(InviteToSquareChatRequest) request) {
    // Your implementation goes here.
    writeln("inviteToSquareChat called");
    return typeof(return).init;
  }

  GetSquareMemberResponse getSquareMember(ref const(GetSquareMemberRequest) request) {
    // Your implementation goes here.
    writeln("getSquareMember called");
    return typeof(return).init;
  }

  GetSquareMembersResponse getSquareMembers(ref const(GetSquareMembersRequest) request) {
    // Your implementation goes here.
    writeln("getSquareMembers called");
    return typeof(return).init;
  }

  GetSquareMemberRelationResponse getSquareMemberRelation(ref const(GetSquareMemberRelationRequest) request) {
    // Your implementation goes here.
    writeln("getSquareMemberRelation called");
    return typeof(return).init;
  }

  GetSquareMemberRelationsResponse getSquareMemberRelations(ref const(GetSquareMemberRelationsRequest) request) {
    // Your implementation goes here.
    writeln("getSquareMemberRelations called");
    return typeof(return).init;
  }

  GetSquareChatMembersResponse getSquareChatMembers(ref const(GetSquareChatMembersRequest) request) {
    // Your implementation goes here.
    writeln("getSquareChatMembers called");
    return typeof(return).init;
  }

  GetSquareChatStatusResponse getSquareChatStatus(ref const(GetSquareChatStatusRequest) request) {
    // Your implementation goes here.
    writeln("getSquareChatStatus called");
    return typeof(return).init;
  }

  GetSquareChatResponse getSquareChat(ref const(GetSquareChatRequest) request) {
    // Your implementation goes here.
    writeln("getSquareChat called");
    return typeof(return).init;
  }

  GetSquareResponse getSquare(ref const(GetSquareRequest) request) {
    // Your implementation goes here.
    writeln("getSquare called");
    return typeof(return).init;
  }

  GetJoinedSquaresResponse getJoinedSquares(ref const(GetJoinedSquaresRequest) request) {
    // Your implementation goes here.
    writeln("getJoinedSquares called");
    return typeof(return).init;
  }

  GetJoinedSquareChatsResponse getJoinedSquareChats(ref const(GetJoinedSquareChatsRequest) request) {
    // Your implementation goes here.
    writeln("getJoinedSquareChats called");
    return typeof(return).init;
  }

  ApproveSquareMembersResponse approveSquareMembers(ref const(ApproveSquareMembersRequest) request) {
    // Your implementation goes here.
    writeln("approveSquareMembers called");
    return typeof(return).init;
  }

  CreateSquareChatResponse createSquareChat(ref const(CreateSquareChatRequest) request) {
    // Your implementation goes here.
    writeln("createSquareChat called");
    return typeof(return).init;
  }

  CreateSquareResponse createSquare(ref const(CreateSquareRequest) request) {
    // Your implementation goes here.
    writeln("createSquare called");
    return typeof(return).init;
  }

  DeleteSquareChatResponse deleteSquareChat(ref const(DeleteSquareChatRequest) request) {
    // Your implementation goes here.
    writeln("deleteSquareChat called");
    return typeof(return).init;
  }

  DeleteSquareResponse deleteSquare(ref const(DeleteSquareRequest) request) {
    // Your implementation goes here.
    writeln("deleteSquare called");
    return typeof(return).init;
  }

  DestroyMessageResponse destroyMessage(ref const(DestroyMessageRequest) request) {
    // Your implementation goes here.
    writeln("destroyMessage called");
    return typeof(return).init;
  }

  GetJoinableSquareChatsResponse getJoinableSquareChats(ref const(GetJoinableSquareChatsRequest) request) {
    // Your implementation goes here.
    writeln("getJoinableSquareChats called");
    return typeof(return).init;
  }

  GetInvitationTicketUrlResponse getInvitationTicketUrl(ref const(GetInvitationTicketUrlRequest) request) {
    // Your implementation goes here.
    writeln("getInvitationTicketUrl called");
    return typeof(return).init;
  }

  FindSquareByInvitationTicketResponse findSquareByInvitationTicket(ref const(FindSquareByInvitationTicketRequest) request) {
    // Your implementation goes here.
    writeln("findSquareByInvitationTicket called");
    return typeof(return).init;
  }

}

void main() {
  auto protocolFactory = new TBinaryProtocolFactory!();
  auto processor = new TServiceProcessor!SquareService(new SquareServiceHandler);
  auto serverTransport = new TServerSocket(9090);
  auto transportFactory = new TBufferedTransportFactory;
  auto server = new TSimpleServer(
    processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
}
