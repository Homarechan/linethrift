/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.place_search_provider;

class PlaceSearchProvider {
  static const int GOOGLE = 0;
  static const int BAIDU = 1;

  static final Set<int> VALID_VALUES = new Set.from([
    GOOGLE
    , BAIDU
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    GOOGLE: 'GOOGLE'
    , BAIDU: 'BAIDU'
  };
}
