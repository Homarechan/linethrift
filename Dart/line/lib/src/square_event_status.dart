/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.square_event_status;

class SquareEventStatus {
  static const int NORMAL = 1;
  static const int ALERT_DISABLED = 2;

  static final Set<int> VALID_VALUES = new Set.from([
    NORMAL
    , ALERT_DISABLED
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    NORMAL: 'NORMAL'
    , ALERT_DISABLED: 'ALERT_DISABLED'
  };
}
