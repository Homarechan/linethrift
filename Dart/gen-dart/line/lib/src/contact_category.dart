/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.contact_category;

class ContactCategory {
  static const int NORMAL = 0;
  static const int RECOMMEND = 1;

  static final Set<int> VALID_VALUES = new Set.from([
    NORMAL
    , RECOMMEND
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    NORMAL: 'NORMAL'
    , RECOMMEND: 'RECOMMEND'
  };
}