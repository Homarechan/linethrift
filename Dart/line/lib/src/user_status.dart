/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.user_status;

class UserStatus {
  static const int NORMAL = 0;
  static const int UNBOUND = 1;
  static const int UNREGISTERED = 2;

  static final Set<int> VALID_VALUES = new Set.from([
    NORMAL
    , UNBOUND
    , UNREGISTERED
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    NORMAL: 'NORMAL'
    , UNBOUND: 'UNBOUND'
    , UNREGISTERED: 'UNREGISTERED'
  };
}
