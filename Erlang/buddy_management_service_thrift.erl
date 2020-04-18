%%
%% Autogenerated by Thrift Compiler (0.11.0)
%%
%% DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
%%

-module(buddy_management_service_thrift).
-behaviour(thrift_service).


-include("buddy_management_service_thrift.hrl").

-export([struct_info/1, function_info/2, function_names/0]).

struct_info(_) -> erlang:error(function_clause).
%%% interface
% addBuddyMember(This, RequestId, UserMid)
function_info('addBuddyMember', params_type) ->
  {struct, [{1, string},
          {2, string}]}
;
function_info('addBuddyMember', reply_type) ->
  {struct, []};
function_info('addBuddyMember', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% addBuddyMembers(This, RequestId, UserMids)
function_info('addBuddyMembers', params_type) ->
  {struct, [{1, string},
          {2, {list, string}}]}
;
function_info('addBuddyMembers', reply_type) ->
  {struct, []};
function_info('addBuddyMembers', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% blockBuddyMember(This, RequestId, Mid)
function_info('blockBuddyMember', params_type) ->
  {struct, [{1, string},
          {2, string}]}
;
function_info('blockBuddyMember', reply_type) ->
  {struct, []};
function_info('blockBuddyMember', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% commitSendMessagesToAll(This, RequestIdList)
function_info('commitSendMessagesToAll', params_type) ->
  {struct, [{1, {list, string}}]}
;
function_info('commitSendMessagesToAll', reply_type) ->
  {list, {struct, {'line_types', 'SendBuddyMessageResult'}}};
function_info('commitSendMessagesToAll', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% commitSendMessagesToMids(This, RequestIdList, Mids)
function_info('commitSendMessagesToMids', params_type) ->
  {struct, [{1, {list, string}},
          {2, {list, string}}]}
;
function_info('commitSendMessagesToMids', reply_type) ->
  {list, {struct, {'line_types', 'SendBuddyMessageResult'}}};
function_info('commitSendMessagesToMids', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% containsBuddyMember(This, RequestId, UserMid)
function_info('containsBuddyMember', params_type) ->
  {struct, [{1, string},
          {2, string}]}
;
function_info('containsBuddyMember', reply_type) ->
  bool;
function_info('containsBuddyMember', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% downloadMessageContent(This, RequestId, MessageId)
function_info('downloadMessageContent', params_type) ->
  {struct, [{1, string},
          {2, string}]}
;
function_info('downloadMessageContent', reply_type) ->
  string;
function_info('downloadMessageContent', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% downloadMessageContentPreview(This, RequestId, MessageId)
function_info('downloadMessageContentPreview', params_type) ->
  {struct, [{1, string},
          {2, string}]}
;
function_info('downloadMessageContentPreview', reply_type) ->
  string;
function_info('downloadMessageContentPreview', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% downloadProfileImage(This, RequestId)
function_info('downloadProfileImage', params_type) ->
  {struct, [{1, string}]}
;
function_info('downloadProfileImage', reply_type) ->
  string;
function_info('downloadProfileImage', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% downloadProfileImagePreview(This, RequestId)
function_info('downloadProfileImagePreview', params_type) ->
  {struct, [{1, string}]}
;
function_info('downloadProfileImagePreview', reply_type) ->
  string;
function_info('downloadProfileImagePreview', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getActiveMemberCountByBuddyMid(This, BuddyMid)
function_info('getActiveMemberCountByBuddyMid', params_type) ->
  {struct, [{2, string}]}
;
function_info('getActiveMemberCountByBuddyMid', reply_type) ->
  i64;
function_info('getActiveMemberCountByBuddyMid', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getActiveMemberMidsByBuddyMid(This, BuddyMid)
function_info('getActiveMemberMidsByBuddyMid', params_type) ->
  {struct, [{2, string}]}
;
function_info('getActiveMemberMidsByBuddyMid', reply_type) ->
  {list, string};
function_info('getActiveMemberMidsByBuddyMid', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getAllBuddyMembers(This)
function_info('getAllBuddyMembers', params_type) ->
  {struct, []}
;
function_info('getAllBuddyMembers', reply_type) ->
  {list, string};
function_info('getAllBuddyMembers', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getBlockedBuddyMembers(This)
function_info('getBlockedBuddyMembers', params_type) ->
  {struct, []}
;
function_info('getBlockedBuddyMembers', reply_type) ->
  {list, string};
function_info('getBlockedBuddyMembers', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getBlockerCountByBuddyMid(This, BuddyMid)
function_info('getBlockerCountByBuddyMid', params_type) ->
  {struct, [{2, string}]}
;
function_info('getBlockerCountByBuddyMid', reply_type) ->
  i64;
function_info('getBlockerCountByBuddyMid', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getBuddyDetailByMid(This, BuddyMid)
function_info('getBuddyDetailByMid', params_type) ->
  {struct, [{2, string}]}
;
function_info('getBuddyDetailByMid', reply_type) ->
  {struct, {'line_types', 'BuddyDetail'}};
function_info('getBuddyDetailByMid', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getBuddyProfile(This)
function_info('getBuddyProfile', params_type) ->
  {struct, []}
;
function_info('getBuddyProfile', reply_type) ->
  {struct, {'line_types', 'BuddyProfile'}};
function_info('getBuddyProfile', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getContactTicket(This)
function_info('getContactTicket', params_type) ->
  {struct, []}
;
function_info('getContactTicket', reply_type) ->
  {struct, {'line_types', 'Ticket'}};
function_info('getContactTicket', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getMemberCountByBuddyMid(This, BuddyMid)
function_info('getMemberCountByBuddyMid', params_type) ->
  {struct, [{2, string}]}
;
function_info('getMemberCountByBuddyMid', reply_type) ->
  i64;
function_info('getMemberCountByBuddyMid', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getSendBuddyMessageResult(This, SendBuddyMessageRequestId)
function_info('getSendBuddyMessageResult', params_type) ->
  {struct, [{1, string}]}
;
function_info('getSendBuddyMessageResult', reply_type) ->
  {struct, {'line_types', 'SendBuddyMessageResult'}};
function_info('getSendBuddyMessageResult', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getSetBuddyOnAirResult(This, SetBuddyOnAirRequestId)
function_info('getSetBuddyOnAirResult', params_type) ->
  {struct, [{1, string}]}
;
function_info('getSetBuddyOnAirResult', reply_type) ->
  {struct, {'line_types', 'SetBuddyOnAirResult'}};
function_info('getSetBuddyOnAirResult', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getUpdateBuddyProfileResult(This, UpdateBuddyProfileRequestId)
function_info('getUpdateBuddyProfileResult', params_type) ->
  {struct, [{1, string}]}
;
function_info('getUpdateBuddyProfileResult', reply_type) ->
  {struct, {'line_types', 'UpdateBuddyProfileResult'}};
function_info('getUpdateBuddyProfileResult', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% isBuddyOnAirByMid(This, BuddyMid)
function_info('isBuddyOnAirByMid', params_type) ->
  {struct, [{2, string}]}
;
function_info('isBuddyOnAirByMid', reply_type) ->
  bool;
function_info('isBuddyOnAirByMid', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% linkAndSendBuddyContentMessageToAllAsync(This, RequestId, Msg, SourceContentId)
function_info('linkAndSendBuddyContentMessageToAllAsync', params_type) ->
  {struct, [{1, string},
          {2, {struct, {'line_types', 'Message'}}},
          {3, string}]}
;
function_info('linkAndSendBuddyContentMessageToAllAsync', reply_type) ->
  string;
function_info('linkAndSendBuddyContentMessageToAllAsync', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% linkAndSendBuddyContentMessageToMids(This, RequestId, Msg, SourceContentId, Mids)
function_info('linkAndSendBuddyContentMessageToMids', params_type) ->
  {struct, [{1, string},
          {2, {struct, {'line_types', 'Message'}}},
          {3, string},
          {4, {list, string}}]}
;
function_info('linkAndSendBuddyContentMessageToMids', reply_type) ->
  {struct, {'line_types', 'SendBuddyMessageResult'}};
function_info('linkAndSendBuddyContentMessageToMids', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% notifyBuddyBlocked(This, BuddyMid, BlockerMid)
function_info('notifyBuddyBlocked', params_type) ->
  {struct, [{1, string},
          {2, string}]}
;
function_info('notifyBuddyBlocked', reply_type) ->
  {struct, []};
function_info('notifyBuddyBlocked', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% notifyBuddyUnblocked(This, BuddyMid, BlockerMid)
function_info('notifyBuddyUnblocked', params_type) ->
  {struct, [{1, string},
          {2, string}]}
;
function_info('notifyBuddyUnblocked', reply_type) ->
  {struct, []};
function_info('notifyBuddyUnblocked', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% registerBuddy(This, BuddyId, SearchId, DisplayName, StatusMeessage, Picture, Settings)
function_info('registerBuddy', params_type) ->
  {struct, [{2, string},
          {3, string},
          {4, string},
          {5, string},
          {6, string},
          {7, {map, string, string}}]}
;
function_info('registerBuddy', reply_type) ->
  string;
function_info('registerBuddy', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% registerBuddyAdmin(This, BuddyId, SearchId, DisplayName, StatusMessage, Picture)
function_info('registerBuddyAdmin', params_type) ->
  {struct, [{2, string},
          {3, string},
          {4, string},
          {5, string},
          {6, string}]}
;
function_info('registerBuddyAdmin', reply_type) ->
  string;
function_info('registerBuddyAdmin', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% reissueContactTicket(This, ExpirationTime, MaxUseCount)
function_info('reissueContactTicket', params_type) ->
  {struct, [{3, i64},
          {4, i32}]}
;
function_info('reissueContactTicket', reply_type) ->
  string;
function_info('reissueContactTicket', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% removeBuddyMember(This, RequestId, UserMid)
function_info('removeBuddyMember', params_type) ->
  {struct, [{1, string},
          {2, string}]}
;
function_info('removeBuddyMember', reply_type) ->
  {struct, []};
function_info('removeBuddyMember', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% removeBuddyMembers(This, RequestId, UserMids)
function_info('removeBuddyMembers', params_type) ->
  {struct, [{1, string},
          {2, {list, string}}]}
;
function_info('removeBuddyMembers', reply_type) ->
  {struct, []};
function_info('removeBuddyMembers', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% sendBuddyContentMessageToAll(This, RequestId, Msg, Content)
function_info('sendBuddyContentMessageToAll', params_type) ->
  {struct, [{1, string},
          {2, {struct, {'line_types', 'Message'}}},
          {3, string}]}
;
function_info('sendBuddyContentMessageToAll', reply_type) ->
  {struct, {'line_types', 'SendBuddyMessageResult'}};
function_info('sendBuddyContentMessageToAll', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% sendBuddyContentMessageToAllAsync(This, RequestId, Msg, Content)
function_info('sendBuddyContentMessageToAllAsync', params_type) ->
  {struct, [{1, string},
          {2, {struct, {'line_types', 'Message'}}},
          {3, string}]}
;
function_info('sendBuddyContentMessageToAllAsync', reply_type) ->
  string;
function_info('sendBuddyContentMessageToAllAsync', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% sendBuddyContentMessageToMids(This, RequestId, Msg, Content, Mids)
function_info('sendBuddyContentMessageToMids', params_type) ->
  {struct, [{1, string},
          {2, {struct, {'line_types', 'Message'}}},
          {3, string},
          {4, {list, string}}]}
;
function_info('sendBuddyContentMessageToMids', reply_type) ->
  {struct, {'line_types', 'SendBuddyMessageResult'}};
function_info('sendBuddyContentMessageToMids', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% sendBuddyContentMessageToMidsAsync(This, RequestId, Msg, Content, Mids)
function_info('sendBuddyContentMessageToMidsAsync', params_type) ->
  {struct, [{1, string},
          {2, {struct, {'line_types', 'Message'}}},
          {3, string},
          {4, {list, string}}]}
;
function_info('sendBuddyContentMessageToMidsAsync', reply_type) ->
  string;
function_info('sendBuddyContentMessageToMidsAsync', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% sendBuddyMessageToAll(This, RequestId, Msg)
function_info('sendBuddyMessageToAll', params_type) ->
  {struct, [{1, string},
          {2, {struct, {'line_types', 'Message'}}}]}
;
function_info('sendBuddyMessageToAll', reply_type) ->
  {struct, {'line_types', 'SendBuddyMessageResult'}};
function_info('sendBuddyMessageToAll', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% sendBuddyMessageToAllAsync(This, RequestId, Msg)
function_info('sendBuddyMessageToAllAsync', params_type) ->
  {struct, [{1, string},
          {2, {struct, {'line_types', 'Message'}}}]}
;
function_info('sendBuddyMessageToAllAsync', reply_type) ->
  string;
function_info('sendBuddyMessageToAllAsync', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% sendBuddyMessageToMids(This, RequestId, Msg, Mids)
function_info('sendBuddyMessageToMids', params_type) ->
  {struct, [{1, string},
          {2, {struct, {'line_types', 'Message'}}},
          {3, {list, string}}]}
;
function_info('sendBuddyMessageToMids', reply_type) ->
  {struct, {'line_types', 'SendBuddyMessageResult'}};
function_info('sendBuddyMessageToMids', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% sendBuddyMessageToMidsAsync(This, RequestId, Msg, Mids)
function_info('sendBuddyMessageToMidsAsync', params_type) ->
  {struct, [{1, string},
          {2, {struct, {'line_types', 'Message'}}},
          {3, {list, string}}]}
;
function_info('sendBuddyMessageToMidsAsync', reply_type) ->
  string;
function_info('sendBuddyMessageToMidsAsync', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% sendIndividualEventToAllAsync(This, RequestId, BuddyMid, NotificationStatus)
function_info('sendIndividualEventToAllAsync', params_type) ->
  {struct, [{1, string},
          {2, string},
          {3, i32}]}
;
function_info('sendIndividualEventToAllAsync', reply_type) ->
  {struct, []};
function_info('sendIndividualEventToAllAsync', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% setBuddyOnAir(This, RequestId, OnAir)
function_info('setBuddyOnAir', params_type) ->
  {struct, [{1, string},
          {2, bool}]}
;
function_info('setBuddyOnAir', reply_type) ->
  {struct, {'line_types', 'SetBuddyOnAirResult'}};
function_info('setBuddyOnAir', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% setBuddyOnAirAsync(This, RequestId, OnAir)
function_info('setBuddyOnAirAsync', params_type) ->
  {struct, [{1, string},
          {2, bool}]}
;
function_info('setBuddyOnAirAsync', reply_type) ->
  string;
function_info('setBuddyOnAirAsync', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% storeMessage(This, RequestId, MessageRequest)
function_info('storeMessage', params_type) ->
  {struct, [{1, string},
          {2, {struct, {'line_types', 'BuddyMessageRequest'}}}]}
;
function_info('storeMessage', reply_type) ->
  {struct, {'line_types', 'SendBuddyMessageResult'}};
function_info('storeMessage', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% unblockBuddyMember(This, RequestId, Mid)
function_info('unblockBuddyMember', params_type) ->
  {struct, [{1, string},
          {2, string}]}
;
function_info('unblockBuddyMember', reply_type) ->
  {struct, []};
function_info('unblockBuddyMember', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% unregisterBuddy(This, RequestId)
function_info('unregisterBuddy', params_type) ->
  {struct, [{1, string}]}
;
function_info('unregisterBuddy', reply_type) ->
  {struct, []};
function_info('unregisterBuddy', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% unregisterBuddyAdmin(This, RequestId)
function_info('unregisterBuddyAdmin', params_type) ->
  {struct, [{1, string}]}
;
function_info('unregisterBuddyAdmin', reply_type) ->
  {struct, []};
function_info('unregisterBuddyAdmin', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% updateBuddyAdminProfileAttribute(This, RequestId, Attributes)
function_info('updateBuddyAdminProfileAttribute', params_type) ->
  {struct, [{1, string},
          {2, {map, string, string}}]}
;
function_info('updateBuddyAdminProfileAttribute', reply_type) ->
  {struct, []};
function_info('updateBuddyAdminProfileAttribute', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% updateBuddyAdminProfileImage(This, RequestId, Picture)
function_info('updateBuddyAdminProfileImage', params_type) ->
  {struct, [{1, string},
          {2, string}]}
;
function_info('updateBuddyAdminProfileImage', reply_type) ->
  {struct, []};
function_info('updateBuddyAdminProfileImage', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% updateBuddyProfileAttributes(This, RequestId, Attributes)
function_info('updateBuddyProfileAttributes', params_type) ->
  {struct, [{1, string},
          {2, {map, string, string}}]}
;
function_info('updateBuddyProfileAttributes', reply_type) ->
  {struct, {'line_types', 'UpdateBuddyProfileResult'}};
function_info('updateBuddyProfileAttributes', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% updateBuddyProfileAttributesAsync(This, RequestId, Attributes)
function_info('updateBuddyProfileAttributesAsync', params_type) ->
  {struct, [{1, string},
          {2, {map, string, string}}]}
;
function_info('updateBuddyProfileAttributesAsync', reply_type) ->
  string;
function_info('updateBuddyProfileAttributesAsync', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% updateBuddyProfileImage(This, RequestId, Image)
function_info('updateBuddyProfileImage', params_type) ->
  {struct, [{1, string},
          {2, string}]}
;
function_info('updateBuddyProfileImage', reply_type) ->
  {struct, {'line_types', 'UpdateBuddyProfileResult'}};
function_info('updateBuddyProfileImage', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% updateBuddyProfileImageAsync(This, RequestId, Image)
function_info('updateBuddyProfileImageAsync', params_type) ->
  {struct, [{1, string},
          {2, string}]}
;
function_info('updateBuddyProfileImageAsync', reply_type) ->
  string;
function_info('updateBuddyProfileImageAsync', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% updateBuddySearchId(This, RequestId, SearchId)
function_info('updateBuddySearchId', params_type) ->
  {struct, [{1, string},
          {2, string}]}
;
function_info('updateBuddySearchId', reply_type) ->
  {struct, []};
function_info('updateBuddySearchId', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% updateBuddySettings(This, Settings)
function_info('updateBuddySettings', params_type) ->
  {struct, [{2, {map, string, string}}]}
;
function_info('updateBuddySettings', reply_type) ->
  {struct, []};
function_info('updateBuddySettings', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% uploadBuddyContent(This, ContentType, Content)
function_info('uploadBuddyContent', params_type) ->
  {struct, [{2, i32},
          {3, string}]}
;
function_info('uploadBuddyContent', reply_type) ->
  string;
function_info('uploadBuddyContent', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
function_info(_Func, _Info) -> erlang:error(function_clause).

function_names() -> 
  ['addBuddyMember', 'addBuddyMembers', 'blockBuddyMember', 'commitSendMessagesToAll', 'commitSendMessagesToMids', 'containsBuddyMember', 'downloadMessageContent', 'downloadMessageContentPreview', 'downloadProfileImage', 'downloadProfileImagePreview', 'getActiveMemberCountByBuddyMid', 'getActiveMemberMidsByBuddyMid', 'getAllBuddyMembers', 'getBlockedBuddyMembers', 'getBlockerCountByBuddyMid', 'getBuddyDetailByMid', 'getBuddyProfile', 'getContactTicket', 'getMemberCountByBuddyMid', 'getSendBuddyMessageResult', 'getSetBuddyOnAirResult', 'getUpdateBuddyProfileResult', 'isBuddyOnAirByMid', 'linkAndSendBuddyContentMessageToAllAsync', 'linkAndSendBuddyContentMessageToMids', 'notifyBuddyBlocked', 'notifyBuddyUnblocked', 'registerBuddy', 'registerBuddyAdmin', 'reissueContactTicket', 'removeBuddyMember', 'removeBuddyMembers', 'sendBuddyContentMessageToAll', 'sendBuddyContentMessageToAllAsync', 'sendBuddyContentMessageToMids', 'sendBuddyContentMessageToMidsAsync', 'sendBuddyMessageToAll', 'sendBuddyMessageToAllAsync', 'sendBuddyMessageToMids', 'sendBuddyMessageToMidsAsync', 'sendIndividualEventToAllAsync', 'setBuddyOnAir', 'setBuddyOnAirAsync', 'storeMessage', 'unblockBuddyMember', 'unregisterBuddy', 'unregisterBuddyAdmin', 'updateBuddyAdminProfileAttribute', 'updateBuddyAdminProfileImage', 'updateBuddyProfileAttributes', 'updateBuddyProfileAttributesAsync', 'updateBuddyProfileImage', 'updateBuddyProfileImageAsync', 'updateBuddySearchId', 'updateBuddySettings', 'uploadBuddyContent'].

