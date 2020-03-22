%%
%% Autogenerated by Thrift Compiler (0.14.0)
%%
%% DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
%%

-module(auth_service_thrift).
-behaviour(thrift_service).


-include("auth_service_thrift.hrl").

-export([struct_info/1, function_info/2, function_names/0]).

struct_info(_) -> erlang:error(function_clause).
%%% interface
% normalizePhoneNumber(This, CountryCode, PhoneNumber, CountryCodeHint)
function_info('normalizePhoneNumber', params_type) ->
  {struct, [{2, string},
          {3, string},
          {4, string}]}
;
function_info('normalizePhoneNumber', reply_type) ->
  string;
function_info('normalizePhoneNumber', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% respondE2EELoginRequest(This, Verifier, PublicKey, EncryptedKeyChain, HashKeyChain, ErrorCode)
function_info('respondE2EELoginRequest', params_type) ->
  {struct, [{1, string},
          {2, {struct, {'line_types', 'E2EEPublicKey'}}},
          {3, string},
          {4, string},
          {5, i32}]}
;
function_info('respondE2EELoginRequest', reply_type) ->
  {struct, []};
function_info('respondE2EELoginRequest', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% confirmE2EELogin(This, Verifier, DeviceSecret)
function_info('confirmE2EELogin', params_type) ->
  {struct, [{1, string},
          {2, string}]}
;
function_info('confirmE2EELogin', reply_type) ->
  string;
function_info('confirmE2EELogin', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% logoutZ(This)
function_info('logoutZ', params_type) ->
  {struct, []}
;
function_info('logoutZ', reply_type) ->
  {struct, []};
function_info('logoutZ', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% loginZ(This, LoginRequest)
function_info('loginZ', params_type) ->
  {struct, [{2, {struct, {'line_types', 'LoginRequest'}}}]}
;
function_info('loginZ', reply_type) ->
  {struct, {'line_types', 'LoginResult'}};
function_info('loginZ', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% issueTokenForAccountMigrationSettings(This, Enforce)
function_info('issueTokenForAccountMigrationSettings', params_type) ->
  {struct, [{2, bool}]}
;
function_info('issueTokenForAccountMigrationSettings', reply_type) ->
  {struct, {'line_types', 'SecurityCenterResult'}};
function_info('issueTokenForAccountMigrationSettings', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% issueTokenForAccountMigration(This, MigrationSessionId)
function_info('issueTokenForAccountMigration', params_type) ->
  {struct, [{2, string}]}
;
function_info('issueTokenForAccountMigration', reply_type) ->
  {struct, {'line_types', 'SecurityCenterResult'}};
function_info('issueTokenForAccountMigration', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
% verifyQrcodeWithE2EE(This, Verifier, PinCode, ErrorCode, PublicKey, EncryptedKeyChain, HashKeyChain)
function_info('verifyQrcodeWithE2EE', params_type) ->
  {struct, [{2, string},
          {3, string},
          {4, i32},
          {5, {struct, {'line_types', 'E2EEPublicKey'}}},
          {6, string},
          {7, string}]}
;
function_info('verifyQrcodeWithE2EE', reply_type) ->
  string;
function_info('verifyQrcodeWithE2EE', exceptions) ->
  {struct, [{1, {struct, {'line_types', 'TalkException'}}}]}
;
function_info(_Func, _Info) -> erlang:error(function_clause).

function_names() -> 
  ['normalizePhoneNumber', 'respondE2EELoginRequest', 'confirmE2EELogin', 'logoutZ', 'loginZ', 'issueTokenForAccountMigrationSettings', 'issueTokenForAccountMigration', 'verifyQrcodeWithE2EE'].

