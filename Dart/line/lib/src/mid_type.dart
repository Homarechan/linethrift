/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.mid_type;

class MIDType {
  static const int USER = 0;
  static const int ROOM = 1;
  static const int GROUP = 2;
  static const int SQUARE = 3;
  static const int SQUARE_CHAT = 4;
  static const int SQUARE_MEMBER = 5;
  static const int BOT = 6;

  static final Set<int> VALID_VALUES = new Set.from([
    USER
    , ROOM
    , GROUP
    , SQUARE
    , SQUARE_CHAT
    , SQUARE_MEMBER
    , BOT
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    USER: 'USER'
    , ROOM: 'ROOM'
    , GROUP: 'GROUP'
    , SQUARE: 'SQUARE'
    , SQUARE_CHAT: 'SQUARE_CHAT'
    , SQUARE_MEMBER: 'SQUARE_MEMBER'
    , BOT: 'BOT'
  };
}
