/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.personal_info;

class PersonalInfo {
  static const int EMAIL = 0;
  static const int PHONE = 1;
  static const int BIRTHDAY = 2;
  static const int RAW_BIRTHDAY = 3;

  static final Set<int> VALID_VALUES = new Set.from([
    EMAIL
    , PHONE
    , BIRTHDAY
    , RAW_BIRTHDAY
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    EMAIL: 'EMAIL'
    , PHONE: 'PHONE'
    , BIRTHDAY: 'BIRTHDAY'
    , RAW_BIRTHDAY: 'RAW_BIRTHDAY'
  };
}
