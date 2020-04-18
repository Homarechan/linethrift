/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.sq_error_code;

class SQErrorCode {
  static const int UNKNOWN = 0;
  static const int ILLEGAL_ARGUMENT = 400;
  static const int AUTHENTICATION_FAILURE = 401;
  static const int FORBIDDEN = 403;
  static const int NOT_FOUND = 404;
  static const int REVISION_MISMATCH = 409;
  static const int PRECONDITION_FAILED = 410;
  static const int INTERNAL_ERROR = 500;
  static const int NOT_IMPLEMENTED = 501;
  static const int TRY_AGAIN_LATER = 505;

  static final Set<int> VALID_VALUES = new Set.from([
    UNKNOWN
    , ILLEGAL_ARGUMENT
    , AUTHENTICATION_FAILURE
    , FORBIDDEN
    , NOT_FOUND
    , REVISION_MISMATCH
    , PRECONDITION_FAILED
    , INTERNAL_ERROR
    , NOT_IMPLEMENTED
    , TRY_AGAIN_LATER
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    UNKNOWN: 'UNKNOWN'
    , ILLEGAL_ARGUMENT: 'ILLEGAL_ARGUMENT'
    , AUTHENTICATION_FAILURE: 'AUTHENTICATION_FAILURE'
    , FORBIDDEN: 'FORBIDDEN'
    , NOT_FOUND: 'NOT_FOUND'
    , REVISION_MISMATCH: 'REVISION_MISMATCH'
    , PRECONDITION_FAILED: 'PRECONDITION_FAILED'
    , INTERNAL_ERROR: 'INTERNAL_ERROR'
    , NOT_IMPLEMENTED: 'NOT_IMPLEMENTED'
    , TRY_AGAIN_LATER: 'TRY_AGAIN_LATER'
  };
}
