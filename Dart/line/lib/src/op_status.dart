/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.op_status;

class OpStatus {
  static const int NORMAL = 0;
  static const int ALERT_DISABLED = 1;
  static const int ALWAYS = 2;

  static final Set<int> VALID_VALUES = new Set.from([
    NORMAL
    , ALERT_DISABLED
    , ALWAYS
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    NORMAL: 'NORMAL'
    , ALERT_DISABLED: 'ALERT_DISABLED'
    , ALWAYS: 'ALWAYS'
  };
}
