/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.buddy_on_air_label;

class BuddyOnAirLabel {
  static const int ON_AIR = 0;
  static const int LIVE = 1;

  static final Set<int> VALID_VALUES = new Set.from([
    ON_AIR
    , LIVE
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    ON_AIR: 'ON_AIR'
    , LIVE: 'LIVE'
  };
}
