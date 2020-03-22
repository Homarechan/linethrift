%%
%% Autogenerated by Thrift Compiler (0.14.0)
%%
%% DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
%%

-module(spot_service_thrift).
-behaviour(thrift_service).


-include("spot_service_thrift.hrl").

-export([struct_info/1, function_info/2, function_names/0]).

struct_info(_) -> erlang:error(function_clause).
%%% interface
% lookupByPhoneNumber(This, CountryAreaCode, PhoneNumber)
function_info('lookupByPhoneNumber', params_type) ->
  {struct, [{2, string},
          {3, string}]}
;
function_info('lookupByPhoneNumber', reply_type) ->
  {struct, {'line_types', 'SpotPhoneNumberResponse'}};
function_info('lookupByPhoneNumber', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% lookupNearby(This, Location, Category, Query, CountryAreaCode)
function_info('lookupNearby', params_type) ->
  {struct, [{2, {struct, {'line_types', 'Location'}}},
          {3, i32},
          {4, string},
          {5, string}]}
;
function_info('lookupNearby', reply_type) ->
  {struct, {'line_types', 'SpotNearbyResponse'}};
function_info('lookupNearby', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
function_info(_Func, _Info) -> erlang:error(function_clause).

function_names() -> 
  ['lookupByPhoneNumber', 'lookupNearby'].
