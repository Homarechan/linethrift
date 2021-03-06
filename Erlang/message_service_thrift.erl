%%
%% Autogenerated by Thrift Compiler (0.14.0)
%%
%% DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
%%

-module(message_service_thrift).
-behaviour(thrift_service).


-include("message_service_thrift.hrl").

-export([struct_info/1, function_info/2, function_names/0]).

struct_info(_) -> erlang:error(function_clause).
%%% interface
% fetchMessageOperations(This, LocalRevision, LastOpTimestamp, Count)
function_info('fetchMessageOperations', params_type) ->
  {struct, [{2, i64},
          {3, i64},
          {4, i32}]}
;
function_info('fetchMessageOperations', reply_type) ->
  {struct, {'line_types', 'MessageOperations'}};
function_info('fetchMessageOperations', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% getLastReadMessageIds(This, ChatId)
function_info('getLastReadMessageIds', params_type) ->
  {struct, [{2, string}]}
;
function_info('getLastReadMessageIds', reply_type) ->
  {struct, {'line_types', 'LastReadMessageIds'}};
function_info('getLastReadMessageIds', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% multiGetLastReadMessageIds(This, ChatIds)
function_info('multiGetLastReadMessageIds', params_type) ->
  {struct, [{2, {list, string}}]}
;
function_info('multiGetLastReadMessageIds', reply_type) ->
  {list, {struct, {'line_types', 'LastReadMessageIds'}}};
function_info('multiGetLastReadMessageIds', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
function_info(_Func, _Info) -> erlang:error(function_clause).

function_names() -> 
  ['fetchMessageOperations', 'getLastReadMessageIds', 'multiGetLastReadMessageIds'].

