// This autogenerated skeleton file illustrates how to build a server.
// You should copy it to another filename to avoid overwriting it.

#include "SquareService.h"
#include <thrift/protocol/TBinaryProtocol.h>
#include <thrift/server/TSimpleServer.h>
#include <thrift/transport/TServerSocket.h>
#include <thrift/transport/TBufferTransports.h>

using namespace ::apache::thrift;
using namespace ::apache::thrift::protocol;
using namespace ::apache::thrift::transport;
using namespace ::apache::thrift::server;

class SquareServiceHandler : virtual public SquareServiceIf {
 public:
  SquareServiceHandler() {
    // Your initialization goes here
  }

  void getSquareChatAnnouncements(GetSquareChatAnnouncementsResponse& _return, const GetSquareChatAnnouncementsRequest& request) {
    // Your implementation goes here
    printf("getSquareChatAnnouncements\n");
  }

  void deleteSquareChatAnnouncement(DeleteSquareChatAnnouncementResponse& _return, const DeleteSquareChatAnnouncementRequest& request) {
    // Your implementation goes here
    printf("deleteSquareChatAnnouncement\n");
  }

  void createSquareChatAnnouncement(CreateSquareChatAnnouncementResponse& _return, const CreateSquareChatAnnouncementRequest& request) {
    // Your implementation goes here
    printf("createSquareChatAnnouncement\n");
  }

  void getNoteStatus(GetNoteStatusResponse& _return, const GetNoteStatusRequest& request) {
    // Your implementation goes here
    printf("getNoteStatus\n");
  }

  void getSquareStatus(GetSquareStatusResponse& _return, const GetSquareStatusRequest& request) {
    // Your implementation goes here
    printf("getSquareStatus\n");
  }

  void reportSquareMember(ReportSquareMemberResponse& _return, const ReportSquareMemberRequest& request) {
    // Your implementation goes here
    printf("reportSquareMember\n");
  }

  void reportSquareMessage(ReportSquareMessageResponse& _return, const ReportSquareMessageRequest& request) {
    // Your implementation goes here
    printf("reportSquareMessage\n");
  }

  void reportSquareChat(ReportSquareChatResponse& _return, const ReportSquareChatRequest& request) {
    // Your implementation goes here
    printf("reportSquareChat\n");
  }

  void reportSquare(ReportSquareResponse& _return, const ReportSquareRequest& request) {
    // Your implementation goes here
    printf("reportSquare\n");
  }

  void updateSquareMemberRelation(UpdateSquareMemberRelationResponse& _return, const UpdateSquareMemberRelationRequest& request) {
    // Your implementation goes here
    printf("updateSquareMemberRelation\n");
  }

  void updateSquareAuthority(UpdateSquareAuthorityResponse& _return, const UpdateSquareAuthorityRequest& request) {
    // Your implementation goes here
    printf("updateSquareAuthority\n");
  }

  void updateSquareChatMember(UpdateSquareChatMemberResponse& _return, const UpdateSquareChatMemberRequest& request) {
    // Your implementation goes here
    printf("updateSquareChatMember\n");
  }

  void updateSquareChat(UpdateSquareChatResponse& _return, const UpdateSquareChatRequest& request) {
    // Your implementation goes here
    printf("updateSquareChat\n");
  }

  void refreshSubscriptions(RefreshSubscriptionsResponse& _return, const RefreshSubscriptionsRequest& request) {
    // Your implementation goes here
    printf("refreshSubscriptions\n");
  }

  void removeSubscriptions(RemoveSubscriptionsResponse& _return, const RemoveSubscriptionsRequest& request) {
    // Your implementation goes here
    printf("removeSubscriptions\n");
  }

  void rejectSquareMembers(RejectSquareMembersResponse& _return, const RejectSquareMembersRequest& request) {
    // Your implementation goes here
    printf("rejectSquareMembers\n");
  }

  void updateSquareMembers(UpdateSquareMembersResponse& _return, const UpdateSquareMembersRequest& request) {
    // Your implementation goes here
    printf("updateSquareMembers\n");
  }

  void updateSquareMember(UpdateSquareMemberResponse& _return, const UpdateSquareMemberRequest& request) {
    // Your implementation goes here
    printf("updateSquareMember\n");
  }

  void updateSquareFeatureSet(UpdateSquareFeatureSetResponse& _return, const UpdateSquareFeatureSetRequest& request) {
    // Your implementation goes here
    printf("updateSquareFeatureSet\n");
  }

  void getSquareFeatureSet(GetSquareFeatureSetResponse& _return, const GetSquareFeatureSetRequest& request) {
    // Your implementation goes here
    printf("getSquareFeatureSet\n");
  }

  void searchSquares(SearchSquaresResponse& _return, const SearchSquaresRequest& request) {
    // Your implementation goes here
    printf("searchSquares\n");
  }

  void updateSquare(UpdateSquareResponse& _return, const UpdateSquareRequest& request) {
    // Your implementation goes here
    printf("updateSquare\n");
  }

  void getCategories(GetSquareCategoriesResponse& _return, const GetSquareCategoriesRequest& request) {
    // Your implementation goes here
    printf("getCategories\n");
  }

  void searchSquareMembers(SearchSquareMembersResponse& _return, const SearchSquareMembersRequest& request) {
    // Your implementation goes here
    printf("searchSquareMembers\n");
  }

  void fetchSquareChatEvents(FetchSquareChatEventsResponse& _return, const FetchSquareChatEventsRequest& request) {
    // Your implementation goes here
    printf("fetchSquareChatEvents\n");
  }

  void fetchMyEvents(FetchMyEventsResponse& _return, const FetchMyEventsRequest& request) {
    // Your implementation goes here
    printf("fetchMyEvents\n");
  }

  void markAsRead(MarkAsReadResponse& _return, const MarkAsReadRequest& request) {
    // Your implementation goes here
    printf("markAsRead\n");
  }

  void getSquareAuthority(GetSquareAuthorityResponse& _return, const GetSquareAuthorityRequest& request) {
    // Your implementation goes here
    printf("getSquareAuthority\n");
  }

  void sendMessage(SendMessageResponse& _return, const SendMessageRequest& request) {
    // Your implementation goes here
    printf("sendMessage\n");
  }

  void leaveSquare(LeaveSquareResponse& _return, const LeaveSquareRequest& request) {
    // Your implementation goes here
    printf("leaveSquare\n");
  }

  void leaveSquareChat(LeaveSquareChatResponse& _return, const LeaveSquareChatRequest& request) {
    // Your implementation goes here
    printf("leaveSquareChat\n");
  }

  void joinSquareChat(JoinSquareChatResponse& _return, const JoinSquareChatRequest& request) {
    // Your implementation goes here
    printf("joinSquareChat\n");
  }

  void joinSquare(JoinSquareResponse& _return, const JoinSquareRequest& request) {
    // Your implementation goes here
    printf("joinSquare\n");
  }

  void inviteToSquare(InviteToSquareResponse& _return, const InviteToSquareRequest& request) {
    // Your implementation goes here
    printf("inviteToSquare\n");
  }

  void inviteToSquareChat(InviteToSquareChatResponse& _return, const InviteToSquareChatRequest& request) {
    // Your implementation goes here
    printf("inviteToSquareChat\n");
  }

  void getSquareMember(GetSquareMemberResponse& _return, const GetSquareMemberRequest& request) {
    // Your implementation goes here
    printf("getSquareMember\n");
  }

  void getSquareMembers(GetSquareMembersResponse& _return, const GetSquareMembersRequest& request) {
    // Your implementation goes here
    printf("getSquareMembers\n");
  }

  void getSquareMemberRelation(GetSquareMemberRelationResponse& _return, const GetSquareMemberRelationRequest& request) {
    // Your implementation goes here
    printf("getSquareMemberRelation\n");
  }

  void getSquareMemberRelations(GetSquareMemberRelationsResponse& _return, const GetSquareMemberRelationsRequest& request) {
    // Your implementation goes here
    printf("getSquareMemberRelations\n");
  }

  void getSquareChatMembers(GetSquareChatMembersResponse& _return, const GetSquareChatMembersRequest& request) {
    // Your implementation goes here
    printf("getSquareChatMembers\n");
  }

  void getSquareChatStatus(GetSquareChatStatusResponse& _return, const GetSquareChatStatusRequest& request) {
    // Your implementation goes here
    printf("getSquareChatStatus\n");
  }

  void getSquareChat(GetSquareChatResponse& _return, const GetSquareChatRequest& request) {
    // Your implementation goes here
    printf("getSquareChat\n");
  }

  void getSquare(GetSquareResponse& _return, const GetSquareRequest& request) {
    // Your implementation goes here
    printf("getSquare\n");
  }

  void getJoinedSquares(GetJoinedSquaresResponse& _return, const GetJoinedSquaresRequest& request) {
    // Your implementation goes here
    printf("getJoinedSquares\n");
  }

  void getJoinedSquareChats(GetJoinedSquareChatsResponse& _return, const GetJoinedSquareChatsRequest& request) {
    // Your implementation goes here
    printf("getJoinedSquareChats\n");
  }

  void approveSquareMembers(ApproveSquareMembersResponse& _return, const ApproveSquareMembersRequest& request) {
    // Your implementation goes here
    printf("approveSquareMembers\n");
  }

  void createSquareChat(CreateSquareChatResponse& _return, const CreateSquareChatRequest& request) {
    // Your implementation goes here
    printf("createSquareChat\n");
  }

  void createSquare(CreateSquareResponse& _return, const CreateSquareRequest& request) {
    // Your implementation goes here
    printf("createSquare\n");
  }

  void deleteSquareChat(DeleteSquareChatResponse& _return, const DeleteSquareChatRequest& request) {
    // Your implementation goes here
    printf("deleteSquareChat\n");
  }

  void deleteSquare(DeleteSquareResponse& _return, const DeleteSquareRequest& request) {
    // Your implementation goes here
    printf("deleteSquare\n");
  }

  void destroyMessage(DestroyMessageResponse& _return, const DestroyMessageRequest& request) {
    // Your implementation goes here
    printf("destroyMessage\n");
  }

  void getJoinableSquareChats(GetJoinableSquareChatsResponse& _return, const GetJoinableSquareChatsRequest& request) {
    // Your implementation goes here
    printf("getJoinableSquareChats\n");
  }

  void getInvitationTicketUrl(GetInvitationTicketUrlResponse& _return, const GetInvitationTicketUrlRequest& request) {
    // Your implementation goes here
    printf("getInvitationTicketUrl\n");
  }

  void findSquareByInvitationTicket(FindSquareByInvitationTicketResponse& _return, const FindSquareByInvitationTicketRequest& request) {
    // Your implementation goes here
    printf("findSquareByInvitationTicket\n");
  }

};

int main(int argc, char **argv) {
  int port = 9090;
  ::std::shared_ptr<SquareServiceHandler> handler(new SquareServiceHandler());
  ::std::shared_ptr<TProcessor> processor(new SquareServiceProcessor(handler));
  ::std::shared_ptr<TServerTransport> serverTransport(new TServerSocket(port));
  ::std::shared_ptr<TTransportFactory> transportFactory(new TBufferedTransportFactory());
  ::std::shared_ptr<TProtocolFactory> protocolFactory(new TBinaryProtocolFactory());

  TSimpleServer server(processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
  return 0;
}

