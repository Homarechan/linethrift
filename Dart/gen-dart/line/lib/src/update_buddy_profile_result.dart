/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.update_buddy_profile_result;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class UpdateBuddyProfileResult implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("UpdateBuddyProfileResult");
  static final TField _REQUEST_ID_FIELD_DESC = new TField("requestId", TType.STRING, 1);
  static final TField _STATE_FIELD_DESC = new TField("state", TType.I32, 2);
  static final TField _EVENT_NO_FIELD_DESC = new TField("eventNo", TType.I32, 3);
  static final TField _RECEIVER_COUNT_FIELD_DESC = new TField("receiverCount", TType.I64, 11);
  static final TField _SUCCESS_COUNT_FIELD_DESC = new TField("successCount", TType.I64, 12);
  static final TField _FAIL_COUNT_FIELD_DESC = new TField("failCount", TType.I64, 13);
  static final TField _CANCEL_COUNT_FIELD_DESC = new TField("cancelCount", TType.I64, 14);
  static final TField _UNREGISTER_COUNT_FIELD_DESC = new TField("unregisterCount", TType.I64, 15);
  static final TField _TIMESTAMP_FIELD_DESC = new TField("timestamp", TType.I64, 21);
  static final TField _MESSAGE_FIELD_DESC = new TField("message", TType.STRING, 22);

  String _requestId;
  static const int REQUESTID = 1;
  int _state;
  static const int STATE = 2;
  int _eventNo = 0;
  static const int EVENTNO = 3;
  int _receiverCount = 0;
  static const int RECEIVERCOUNT = 11;
  int _successCount = 0;
  static const int SUCCESSCOUNT = 12;
  int _failCount = 0;
  static const int FAILCOUNT = 13;
  int _cancelCount = 0;
  static const int CANCELCOUNT = 14;
  int _unregisterCount = 0;
  static const int UNREGISTERCOUNT = 15;
  int _timestamp = 0;
  static const int TIMESTAMP = 21;
  String _message;
  static const int MESSAGE = 22;

  bool __isset_state = false;
  bool __isset_eventNo = false;
  bool __isset_receiverCount = false;
  bool __isset_successCount = false;
  bool __isset_failCount = false;
  bool __isset_cancelCount = false;
  bool __isset_unregisterCount = false;
  bool __isset_timestamp = false;

  UpdateBuddyProfileResult() {
  }

  // requestId
  String get requestId => this._requestId;

  set requestId(String requestId) {
    this._requestId = requestId;
  }

  bool isSetRequestId() => this.requestId != null;

  unsetRequestId() {
    this.requestId = null;
  }

  // state
  int get state => this._state;

  set state(int state) {
    this._state = state;
    this.__isset_state = true;
  }

  bool isSetState() => this.__isset_state;

  unsetState() {
    this.__isset_state = false;
  }

  // eventNo
  int get eventNo => this._eventNo;

  set eventNo(int eventNo) {
    this._eventNo = eventNo;
    this.__isset_eventNo = true;
  }

  bool isSetEventNo() => this.__isset_eventNo;

  unsetEventNo() {
    this.__isset_eventNo = false;
  }

  // receiverCount
  int get receiverCount => this._receiverCount;

  set receiverCount(int receiverCount) {
    this._receiverCount = receiverCount;
    this.__isset_receiverCount = true;
  }

  bool isSetReceiverCount() => this.__isset_receiverCount;

  unsetReceiverCount() {
    this.__isset_receiverCount = false;
  }

  // successCount
  int get successCount => this._successCount;

  set successCount(int successCount) {
    this._successCount = successCount;
    this.__isset_successCount = true;
  }

  bool isSetSuccessCount() => this.__isset_successCount;

  unsetSuccessCount() {
    this.__isset_successCount = false;
  }

  // failCount
  int get failCount => this._failCount;

  set failCount(int failCount) {
    this._failCount = failCount;
    this.__isset_failCount = true;
  }

  bool isSetFailCount() => this.__isset_failCount;

  unsetFailCount() {
    this.__isset_failCount = false;
  }

  // cancelCount
  int get cancelCount => this._cancelCount;

  set cancelCount(int cancelCount) {
    this._cancelCount = cancelCount;
    this.__isset_cancelCount = true;
  }

  bool isSetCancelCount() => this.__isset_cancelCount;

  unsetCancelCount() {
    this.__isset_cancelCount = false;
  }

  // unregisterCount
  int get unregisterCount => this._unregisterCount;

  set unregisterCount(int unregisterCount) {
    this._unregisterCount = unregisterCount;
    this.__isset_unregisterCount = true;
  }

  bool isSetUnregisterCount() => this.__isset_unregisterCount;

  unsetUnregisterCount() {
    this.__isset_unregisterCount = false;
  }

  // timestamp
  int get timestamp => this._timestamp;

  set timestamp(int timestamp) {
    this._timestamp = timestamp;
    this.__isset_timestamp = true;
  }

  bool isSetTimestamp() => this.__isset_timestamp;

  unsetTimestamp() {
    this.__isset_timestamp = false;
  }

  // message
  String get message => this._message;

  set message(String message) {
    this._message = message;
  }

  bool isSetMessage() => this.message != null;

  unsetMessage() {
    this.message = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case REQUESTID:
        return this.requestId;
      case STATE:
        return this.state;
      case EVENTNO:
        return this.eventNo;
      case RECEIVERCOUNT:
        return this.receiverCount;
      case SUCCESSCOUNT:
        return this.successCount;
      case FAILCOUNT:
        return this.failCount;
      case CANCELCOUNT:
        return this.cancelCount;
      case UNREGISTERCOUNT:
        return this.unregisterCount;
      case TIMESTAMP:
        return this.timestamp;
      case MESSAGE:
        return this.message;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case REQUESTID:
        if (value == null) {
          unsetRequestId();
        } else {
          this.requestId = value;
        }
        break;

      case STATE:
        if (value == null) {
          unsetState();
        } else {
          this.state = value;
        }
        break;

      case EVENTNO:
        if (value == null) {
          unsetEventNo();
        } else {
          this.eventNo = value;
        }
        break;

      case RECEIVERCOUNT:
        if (value == null) {
          unsetReceiverCount();
        } else {
          this.receiverCount = value;
        }
        break;

      case SUCCESSCOUNT:
        if (value == null) {
          unsetSuccessCount();
        } else {
          this.successCount = value;
        }
        break;

      case FAILCOUNT:
        if (value == null) {
          unsetFailCount();
        } else {
          this.failCount = value;
        }
        break;

      case CANCELCOUNT:
        if (value == null) {
          unsetCancelCount();
        } else {
          this.cancelCount = value;
        }
        break;

      case UNREGISTERCOUNT:
        if (value == null) {
          unsetUnregisterCount();
        } else {
          this.unregisterCount = value;
        }
        break;

      case TIMESTAMP:
        if (value == null) {
          unsetTimestamp();
        } else {
          this.timestamp = value;
        }
        break;

      case MESSAGE:
        if (value == null) {
          unsetMessage();
        } else {
          this.message = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case REQUESTID:
        return isSetRequestId();
      case STATE:
        return isSetState();
      case EVENTNO:
        return isSetEventNo();
      case RECEIVERCOUNT:
        return isSetReceiverCount();
      case SUCCESSCOUNT:
        return isSetSuccessCount();
      case FAILCOUNT:
        return isSetFailCount();
      case CANCELCOUNT:
        return isSetCancelCount();
      case UNREGISTERCOUNT:
        return isSetUnregisterCount();
      case TIMESTAMP:
        return isSetTimestamp();
      case MESSAGE:
        return isSetMessage();
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  read(TProtocol iprot) {
    TField field;
    iprot.readStructBegin();
    while (true) {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case REQUESTID:
          if (field.type == TType.STRING) {
            this.requestId = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case STATE:
          if (field.type == TType.I32) {
            this.state = iprot.readI32();
            this.__isset_state = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EVENTNO:
          if (field.type == TType.I32) {
            this.eventNo = iprot.readI32();
            this.__isset_eventNo = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case RECEIVERCOUNT:
          if (field.type == TType.I64) {
            this.receiverCount = iprot.readI64();
            this.__isset_receiverCount = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SUCCESSCOUNT:
          if (field.type == TType.I64) {
            this.successCount = iprot.readI64();
            this.__isset_successCount = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case FAILCOUNT:
          if (field.type == TType.I64) {
            this.failCount = iprot.readI64();
            this.__isset_failCount = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CANCELCOUNT:
          if (field.type == TType.I64) {
            this.cancelCount = iprot.readI64();
            this.__isset_cancelCount = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case UNREGISTERCOUNT:
          if (field.type == TType.I64) {
            this.unregisterCount = iprot.readI64();
            this.__isset_unregisterCount = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TIMESTAMP:
          if (field.type == TType.I64) {
            this.timestamp = iprot.readI64();
            this.__isset_timestamp = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case MESSAGE:
          if (field.type == TType.STRING) {
            this.message = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  write(TProtocol oprot) {
    validate();

    oprot.writeStructBegin(_STRUCT_DESC);
    if (this.requestId != null) {
      oprot.writeFieldBegin(_REQUEST_ID_FIELD_DESC);
      oprot.writeString(this.requestId);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_STATE_FIELD_DESC);
    oprot.writeI32(this.state);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_EVENT_NO_FIELD_DESC);
    oprot.writeI32(this.eventNo);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_RECEIVER_COUNT_FIELD_DESC);
    oprot.writeI64(this.receiverCount);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_SUCCESS_COUNT_FIELD_DESC);
    oprot.writeI64(this.successCount);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_FAIL_COUNT_FIELD_DESC);
    oprot.writeI64(this.failCount);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_CANCEL_COUNT_FIELD_DESC);
    oprot.writeI64(this.cancelCount);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_UNREGISTER_COUNT_FIELD_DESC);
    oprot.writeI64(this.unregisterCount);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_TIMESTAMP_FIELD_DESC);
    oprot.writeI64(this.timestamp);
    oprot.writeFieldEnd();
    if (this.message != null) {
      oprot.writeFieldBegin(_MESSAGE_FIELD_DESC);
      oprot.writeString(this.message);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("UpdateBuddyProfileResult(");

    ret.write("requestId:");
    if (this.requestId == null) {
      ret.write("null");
    } else {
      ret.write(this.requestId);
    }

    ret.write(", ");
    ret.write("state:");
    String state_name = BuddyResultState.VALUES_TO_NAMES[this.state];
    if (state_name != null) {
      ret.write(state_name);
      ret.write(" (");
    }
    ret.write(this.state);
    if (state_name != null) {
      ret.write(")");
    }

    ret.write(", ");
    ret.write("eventNo:");
    ret.write(this.eventNo);

    ret.write(", ");
    ret.write("receiverCount:");
    ret.write(this.receiverCount);

    ret.write(", ");
    ret.write("successCount:");
    ret.write(this.successCount);

    ret.write(", ");
    ret.write("failCount:");
    ret.write(this.failCount);

    ret.write(", ");
    ret.write("cancelCount:");
    ret.write(this.cancelCount);

    ret.write(", ");
    ret.write("unregisterCount:");
    ret.write(this.unregisterCount);

    ret.write(", ");
    ret.write("timestamp:");
    ret.write(this.timestamp);

    ret.write(", ");
    ret.write("message:");
    if (this.message == null) {
      ret.write("null");
    } else {
      ret.write(this.message);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetState() && !BuddyResultState.VALID_VALUES.contains(state)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'state' has been assigned the invalid value $state");
    }
  }

}

