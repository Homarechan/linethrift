/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.square_chat_member_attribute;

class SquareChatMemberAttribute {
  static const int MEMBERSHIP_STATE = 4;
  static const int NOTIFICATION_MESSAGE = 6;

  static final Set<int> VALID_VALUES = new Set.from([
    MEMBERSHIP_STATE
    , NOTIFICATION_MESSAGE
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    MEMBERSHIP_STATE: 'MEMBERSHIP_STATE'
    , NOTIFICATION_MESSAGE: 'NOTIFICATION_MESSAGE'
  };
}