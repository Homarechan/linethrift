/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.spot_category;

class SpotCategory {
  static const int UNKNOWN = 0;
  static const int GOURMET = 1;
  static const int BEAUTY = 2;
  static const int TRAVEL = 3;
  static const int SHOPPING = 4;
  static const int ENTERTAINMENT = 5;
  static const int SPORTS = 6;
  static const int TRANSPORT = 7;
  static const int LIFE = 8;
  static const int HOSPITAL = 9;
  static const int FINANCE = 10;
  static const int EDUCATION = 11;
  static const int OTHER = 12;
  static const int ALL = 10000;

  static final Set<int> VALID_VALUES = new Set.from([
    UNKNOWN
    , GOURMET
    , BEAUTY
    , TRAVEL
    , SHOPPING
    , ENTERTAINMENT
    , SPORTS
    , TRANSPORT
    , LIFE
    , HOSPITAL
    , FINANCE
    , EDUCATION
    , OTHER
    , ALL
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    UNKNOWN: 'UNKNOWN'
    , GOURMET: 'GOURMET'
    , BEAUTY: 'BEAUTY'
    , TRAVEL: 'TRAVEL'
    , SHOPPING: 'SHOPPING'
    , ENTERTAINMENT: 'ENTERTAINMENT'
    , SPORTS: 'SPORTS'
    , TRANSPORT: 'TRANSPORT'
    , LIFE: 'LIFE'
    , HOSPITAL: 'HOSPITAL'
    , FINANCE: 'FINANCE'
    , EDUCATION: 'EDUCATION'
    , OTHER: 'OTHER'
    , ALL: 'ALL'
  };
}
