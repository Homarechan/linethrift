/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.buddy_result_state;

class BuddyResultState {
  static const int ACCEPTED = 1;
  static const int SUCCEEDED = 2;
  static const int FAILED = 3;
  static const int CANCELLED = 4;
  static const int NOTIFY_FAILED = 5;
  static const int STORING = 11;
  static const int UPLOADING = 21;
  static const int NOTIFYING = 31;
  static const int REMOVING_SUBSCRIPTION = 41;
  static const int UNREGISTERING_ACCOUNT = 42;
  static const int NOTIFYING_LEAVE_CHAT = 43;

  static final Set<int> VALID_VALUES = new Set.from([
    ACCEPTED
    , SUCCEEDED
    , FAILED
    , CANCELLED
    , NOTIFY_FAILED
    , STORING
    , UPLOADING
    , NOTIFYING
    , REMOVING_SUBSCRIPTION
    , UNREGISTERING_ACCOUNT
    , NOTIFYING_LEAVE_CHAT
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    ACCEPTED: 'ACCEPTED'
    , SUCCEEDED: 'SUCCEEDED'
    , FAILED: 'FAILED'
    , CANCELLED: 'CANCELLED'
    , NOTIFY_FAILED: 'NOTIFY_FAILED'
    , STORING: 'STORING'
    , UPLOADING: 'UPLOADING'
    , NOTIFYING: 'NOTIFYING'
    , REMOVING_SUBSCRIPTION: 'REMOVING_SUBSCRIPTION'
    , UNREGISTERING_ACCOUNT: 'UNREGISTERING_ACCOUNT'
    , NOTIFYING_LEAVE_CHAT: 'NOTIFYING_LEAVE_CHAT'
  };
}