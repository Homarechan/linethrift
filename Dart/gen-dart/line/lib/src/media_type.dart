/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.media_type;

class MediaType {
  static const int AUDIO = 1;
  static const int VIDEO = 2;

  static final Set<int> VALID_VALUES = new Set.from([
    AUDIO
    , VIDEO
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    AUDIO: 'AUDIO'
    , VIDEO: 'VIDEO'
  };
}
