/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.identity_provider;

class IdentityProvider {
  static const int UNKNOWN = 0;
  static const int LINE = 1;
  static const int NAVER_KR = 2;
  static const int LINE_PHONE = 3;

  static final Set<int> VALID_VALUES = new Set.from([
    UNKNOWN
    , LINE
    , NAVER_KR
    , LINE_PHONE
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    UNKNOWN: 'UNKNOWN'
    , LINE: 'LINE'
    , NAVER_KR: 'NAVER_KR'
    , LINE_PHONE: 'LINE_PHONE'
  };
}
