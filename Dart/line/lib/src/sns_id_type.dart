/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.sns_id_type;

class SnsIdType {
  static const int FACEBOOK = 1;
  static const int SINA = 2;
  static const int RENREN = 3;
  static const int FEIXIN = 4;
  static const int BBM = 5;

  static final Set<int> VALID_VALUES = new Set.from([
    FACEBOOK
    , SINA
    , RENREN
    , FEIXIN
    , BBM
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    FACEBOOK: 'FACEBOOK'
    , SINA: 'SINA'
    , RENREN: 'RENREN'
    , FEIXIN: 'FEIXIN'
    , BBM: 'BBM'
  };
}
