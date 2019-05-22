/*
 * This auto-generated skeleton file illustrates how to build a server. If you
 * intend to customize it, you should edit a copy with another file name to 
 * avoid overwriting it when running the generator again.
 */
module AuthService_server;

import std.stdio;
import thrift.codegen.processor;
import thrift.protocol.binary;
import thrift.server.simple;
import thrift.server.transport.socket;
import thrift.transport.buffered;
import thrift.util.hashset;

import AuthService;
import line_types;


class AuthServiceHandler : AuthService {
  this() {
    // Your initialization goes here.
  }

  IdentityCredentialResponse updatePassword(string authSessionId, ref const(IdentityCredentialRequest) request) {
    // Your implementation goes here.
    writeln("updatePassword called");
    return typeof(return).init;
  }

  RSAKey getAuthRSAKey(string authSessionId, IdentityProvider identityProvider) {
    // Your implementation goes here.
    writeln("getAuthRSAKey called");
    return typeof(return).init;
  }

  string openAuthSession(ref const(AuthSessionRequest) request) {
    // Your implementation goes here.
    writeln("openAuthSession called");
    return typeof(return).init;
  }

  string normalizePhoneNumber(string countryCode, string phoneNumber, string countryCodeHint) {
    // Your implementation goes here.
    writeln("normalizePhoneNumber called");
    return typeof(return).init;
  }

  void respondE2EELoginRequest(string verifier, ref const(E2EEPublicKey) publicKey, string encryptedKeyChain, string hashKeyChain, ErrorCode errorCode) {
    // Your implementation goes here.
    writeln("respondE2EELoginRequest called");
  }

  string confirmE2EELogin(string verifier, string deviceSecret) {
    // Your implementation goes here.
    writeln("confirmE2EELogin called");
    return typeof(return).init;
  }

  void logoutZ() {
    // Your implementation goes here.
    writeln("logoutZ called");
  }

  LoginResult loginZ(ref const(LoginRequest) loginRequest) {
    // Your implementation goes here.
    writeln("loginZ called");
    return typeof(return).init;
  }

  SecurityCenterResult issueTokenForAccountMigrationSettings(bool enforce) {
    // Your implementation goes here.
    writeln("issueTokenForAccountMigrationSettings called");
    return typeof(return).init;
  }

  SecurityCenterResult issueTokenForAccountMigration(string migrationSessionId) {
    // Your implementation goes here.
    writeln("issueTokenForAccountMigration called");
    return typeof(return).init;
  }

  string verifyQrcodeWithE2EE(string verifier, string pinCode, ErrorCode errorCode, ref const(E2EEPublicKey) publicKey, string encryptedKeyChain, string hashKeyChain) {
    // Your implementation goes here.
    writeln("verifyQrcodeWithE2EE called");
    return typeof(return).init;
  }

}

void main() {
  auto protocolFactory = new TBinaryProtocolFactory!();
  auto processor = new TServiceProcessor!AuthService(new AuthServiceHandler);
  auto serverTransport = new TServerSocket(9090);
  auto transportFactory = new TBufferedTransportFactory;
  auto server = new TSimpleServer(
    processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
}
