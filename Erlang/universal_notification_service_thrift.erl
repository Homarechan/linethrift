%%
%% Autogenerated by Thrift Compiler (0.14.0)
%%
%% DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
%%

-module(universal_notification_service_thrift).
-behaviour(thrift_service).


-include("universal_notification_service_thrift.hrl").

-export([struct_info/1, function_info/2, function_names/0]).

struct_info(_) -> erlang:error(function_clause).
%%% interface
% notify(This, Event)
function_info('notify', params_type) ->
  {struct, [{2, {struct, {'line_types', 'GlobalEvent'}}}]}
;
function_info('notify', reply_type) ->
  {struct, []};
function_info('notify', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'UniversalNotificationServiceException'}}}]}
;
function_info(_Func, _Info) -> erlang:error(function_clause).

function_names() -> 
  ['notify'].

