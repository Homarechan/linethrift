/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.report_category;

class ReportCategory {
  static const int PUSH_NORMAL_PLAIN = 0;
  static const int PUSH_NORMAL_E2EE = 1;
  static const int PUSH_VOIP_PLAIN = 2;
  static const int PUSH_VOIP_E2EE = 3;

  static final Set<int> VALID_VALUES = new Set.from([
    PUSH_NORMAL_PLAIN
    , PUSH_NORMAL_E2EE
    , PUSH_VOIP_PLAIN
    , PUSH_VOIP_E2EE
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    PUSH_NORMAL_PLAIN: 'PUSH_NORMAL_PLAIN'
    , PUSH_NORMAL_E2EE: 'PUSH_NORMAL_E2EE'
    , PUSH_VOIP_PLAIN: 'PUSH_VOIP_PLAIN'
    , PUSH_VOIP_E2EE: 'PUSH_VOIP_E2EE'
  };
}
