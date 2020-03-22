/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.universal_notification_service_error_code;

class UniversalNotificationServiceErrorCode {
  static const int INTERNAL_ERROR = 0;
  static const int INVALID_KEY = 1;
  static const int ILLEGAL_ARGUMENT = 2;
  static const int TOO_MANY_REQUEST = 3;
  static const int AUTHENTICATION_FAILED = 4;
  static const int NO_WRITE_PERMISSION = 5;

  static final Set<int> VALID_VALUES = new Set.from([
    INTERNAL_ERROR
    , INVALID_KEY
    , ILLEGAL_ARGUMENT
    , TOO_MANY_REQUEST
    , AUTHENTICATION_FAILED
    , NO_WRITE_PERMISSION
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    INTERNAL_ERROR: 'INTERNAL_ERROR'
    , INVALID_KEY: 'INVALID_KEY'
    , ILLEGAL_ARGUMENT: 'ILLEGAL_ARGUMENT'
    , TOO_MANY_REQUEST: 'TOO_MANY_REQUEST'
    , AUTHENTICATION_FAILED: 'AUTHENTICATION_FAILED'
    , NO_WRITE_PERMISSION: 'NO_WRITE_PERMISSION'
  };
}
