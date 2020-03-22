%%
%% Autogenerated by Thrift Compiler (0.14.0)
%%
%% DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
%%

-module(channel_service_thrift).
-behaviour(thrift_service).


-include("channel_service_thrift.hrl").

-export([struct_info/1, function_info/2, function_names/0]).

struct_info(_) -> erlang:error(function_clause).
%%% interface
% issueOTP(This, ChannelId)
function_info('issueOTP', params_type) ->
  {struct, [{2, string}]}
;
function_info('issueOTP', reply_type) ->
  {struct, {'line_types', 'OTPResult'}};
function_info('issueOTP', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% approveChannelAndIssueChannelToken(This, ChannelId)
function_info('approveChannelAndIssueChannelToken', params_type) ->
  {struct, [{1, string}]}
;
function_info('approveChannelAndIssueChannelToken', reply_type) ->
  {struct, {'line_types', 'ChannelToken'}};
function_info('approveChannelAndIssueChannelToken', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% approveChannelAndIssueRequestToken(This, ChannelId, OtpId)
function_info('approveChannelAndIssueRequestToken', params_type) ->
  {struct, [{1, string},
          {2, string}]}
;
function_info('approveChannelAndIssueRequestToken', reply_type) ->
  string;
function_info('approveChannelAndIssueRequestToken', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% fetchNotificationItems(This, LocalRev)
function_info('fetchNotificationItems', params_type) ->
  {struct, [{2, i64}]}
;
function_info('fetchNotificationItems', reply_type) ->
  {struct, {'line_types', 'NotificationFetchResult'}};
function_info('fetchNotificationItems', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% getApprovedChannels(This, LastSynced, Locale)
function_info('getApprovedChannels', params_type) ->
  {struct, [{2, i64},
          {3, string}]}
;
function_info('getApprovedChannels', reply_type) ->
  {struct, {'line_types', 'ApprovedChannelInfos'}};
function_info('getApprovedChannels', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% getChannelInfo(This, ChannelId, Locale)
function_info('getChannelInfo', params_type) ->
  {struct, [{2, string},
          {3, string}]}
;
function_info('getChannelInfo', reply_type) ->
  {struct, {'line_types', 'ChannelInfo'}};
function_info('getChannelInfo', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% getChannelNotificationSetting(This, ChannelId, Locale)
function_info('getChannelNotificationSetting', params_type) ->
  {struct, [{1, string},
          {2, string}]}
;
function_info('getChannelNotificationSetting', reply_type) ->
  {struct, {'line_types', 'ChannelNotificationSetting'}};
function_info('getChannelNotificationSetting', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% getChannelNotificationSettings(This, Locale)
function_info('getChannelNotificationSettings', params_type) ->
  {struct, [{1, string}]}
;
function_info('getChannelNotificationSettings', reply_type) ->
  {list, {struct, {'line_types', 'ChannelNotificationSetting'}}};
function_info('getChannelNotificationSettings', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% getChannels(This, LastSynced, Locale)
function_info('getChannels', params_type) ->
  {struct, [{2, i64},
          {3, string}]}
;
function_info('getChannels', reply_type) ->
  {struct, {'line_types', 'ChannelInfos'}};
function_info('getChannels', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% getDomains(This, LastSynced)
function_info('getDomains', params_type) ->
  {struct, [{2, i64}]}
;
function_info('getDomains', reply_type) ->
  {struct, {'line_types', 'ChannelDomains'}};
function_info('getDomains', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% getFriendChannelMatrices(This, ChannelIds)
function_info('getFriendChannelMatrices', params_type) ->
  {struct, [{1, {list, string}}]}
;
function_info('getFriendChannelMatrices', reply_type) ->
  {struct, {'line_types', 'FriendChannelMatricesResponse'}};
function_info('getFriendChannelMatrices', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% updateChannelSettings(This, ChannelSettings)
function_info('updateChannelSettings', params_type) ->
  {struct, [{1, {struct, {'line_types', 'ChannelSettings'}}}]}
;
function_info('updateChannelSettings', reply_type) ->
  bool;
function_info('updateChannelSettings', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% getCommonDomains(This, LastSynced)
function_info('getCommonDomains', params_type) ->
  {struct, [{1, i64}]}
;
function_info('getCommonDomains', reply_type) ->
  {struct, {'line_types', 'ChannelDomains'}};
function_info('getCommonDomains', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% getNotificationBadgeCount(This, LocalRev)
function_info('getNotificationBadgeCount', params_type) ->
  {struct, [{2, i64}]}
;
function_info('getNotificationBadgeCount', reply_type) ->
  i32;
function_info('getNotificationBadgeCount', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% issueChannelToken(This, ChannelId)
function_info('issueChannelToken', params_type) ->
  {struct, [{1, string}]}
;
function_info('issueChannelToken', reply_type) ->
  {struct, {'line_types', 'ChannelToken'}};
function_info('issueChannelToken', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% issueRequestToken(This, ChannelId, OtpId)
function_info('issueRequestToken', params_type) ->
  {struct, [{1, string},
          {2, string}]}
;
function_info('issueRequestToken', reply_type) ->
  string;
function_info('issueRequestToken', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% issueRequestTokenWithAuthScheme(This, ChannelId, OtpId, AuthScheme, ReturnUrl)
function_info('issueRequestTokenWithAuthScheme', params_type) ->
  {struct, [{1, string},
          {2, string},
          {3, {list, string}},
          {4, string}]}
;
function_info('issueRequestTokenWithAuthScheme', reply_type) ->
  {struct, {'line_types', 'RequestTokenResponse'}};
function_info('issueRequestTokenWithAuthScheme', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% issueRequestTokenForAutoLogin(This, ChannelId, OtpId, RedirectUrl)
function_info('issueRequestTokenForAutoLogin', params_type) ->
  {struct, [{2, string},
          {3, string},
          {4, string}]}
;
function_info('issueRequestTokenForAutoLogin', reply_type) ->
  string;
function_info('issueRequestTokenForAutoLogin', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% getUpdatedChannelIds(This, ChannelIds)
function_info('getUpdatedChannelIds', params_type) ->
  {struct, [{1, {list, {struct, {'line_types', 'ChannelIdWithLastUpdated'}}}}]}
;
function_info('getUpdatedChannelIds', reply_type) ->
  {list, string};
function_info('getUpdatedChannelIds', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% reserveCoinUse(This, Request, Locale)
function_info('reserveCoinUse', params_type) ->
  {struct, [{2, {struct, {'line_types', 'CoinUseReservation'}}},
          {3, string}]}
;
function_info('reserveCoinUse', reply_type) ->
  string;
function_info('reserveCoinUse', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% revokeChannel(This, ChannelId)
function_info('revokeChannel', params_type) ->
  {struct, [{1, string}]}
;
function_info('revokeChannel', reply_type) ->
  {struct, []};
function_info('revokeChannel', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% syncChannelData(This, LastSynced, Locale)
function_info('syncChannelData', params_type) ->
  {struct, [{2, i64},
          {3, string}]}
;
function_info('syncChannelData', reply_type) ->
  {struct, {'line_types', 'ChannelSyncDatas'}};
function_info('syncChannelData', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
% updateChannelNotificationSetting(This, Setting)
function_info('updateChannelNotificationSetting', params_type) ->
  {struct, [{1, {list, {struct, {'line_types', 'ChannelNotificationSetting'}}}}]}
;
function_info('updateChannelNotificationSetting', reply_type) ->
  {struct, []};
function_info('updateChannelNotificationSetting', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'ChannelException'}}}]}
;
function_info(_Func, _Info) -> erlang:error(function_clause).

function_names() -> 
  ['issueOTP', 'approveChannelAndIssueChannelToken', 'approveChannelAndIssueRequestToken', 'fetchNotificationItems', 'getApprovedChannels', 'getChannelInfo', 'getChannelNotificationSetting', 'getChannelNotificationSettings', 'getChannels', 'getDomains', 'getFriendChannelMatrices', 'updateChannelSettings', 'getCommonDomains', 'getNotificationBadgeCount', 'issueChannelToken', 'issueRequestToken', 'issueRequestTokenWithAuthScheme', 'issueRequestTokenForAutoLogin', 'getUpdatedChannelIds', 'reserveCoinUse', 'revokeChannel', 'syncChannelData', 'updateChannelNotificationSetting'].
