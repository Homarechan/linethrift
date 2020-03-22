/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.fetch_my_events_response;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class FetchMyEventsResponse implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("FetchMyEventsResponse");
  static final TField _SUBSCRIPTION_FIELD_DESC = new TField("subscription", TType.STRUCT, 1);
  static final TField _EVENTS_FIELD_DESC = new TField("events", TType.LIST, 2);
  static final TField _SYNC_TOKEN_FIELD_DESC = new TField("syncToken", TType.STRING, 3);
  static final TField _CONTINUATION_TOKEN_FIELD_DESC = new TField("continuationToken", TType.STRING, 4);

  SubscriptionState _subscription;
  static const int SUBSCRIPTION = 1;
  List<SquareEvent> _events;
  static const int EVENTS = 2;
  String _syncToken;
  static const int SYNCTOKEN = 3;
  String _continuationToken;
  static const int CONTINUATIONTOKEN = 4;


  FetchMyEventsResponse() {
  }

  // subscription
  SubscriptionState get subscription => this._subscription;

  set subscription(SubscriptionState subscription) {
    this._subscription = subscription;
  }

  bool isSetSubscription() => this.subscription != null;

  unsetSubscription() {
    this.subscription = null;
  }

  // events
  List<SquareEvent> get events => this._events;

  set events(List<SquareEvent> events) {
    this._events = events;
  }

  bool isSetEvents() => this.events != null;

  unsetEvents() {
    this.events = null;
  }

  // syncToken
  String get syncToken => this._syncToken;

  set syncToken(String syncToken) {
    this._syncToken = syncToken;
  }

  bool isSetSyncToken() => this.syncToken != null;

  unsetSyncToken() {
    this.syncToken = null;
  }

  // continuationToken
  String get continuationToken => this._continuationToken;

  set continuationToken(String continuationToken) {
    this._continuationToken = continuationToken;
  }

  bool isSetContinuationToken() => this.continuationToken != null;

  unsetContinuationToken() {
    this.continuationToken = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SUBSCRIPTION:
        return this.subscription;
      case EVENTS:
        return this.events;
      case SYNCTOKEN:
        return this.syncToken;
      case CONTINUATIONTOKEN:
        return this.continuationToken;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case SUBSCRIPTION:
        if (value == null) {
          unsetSubscription();
        } else {
          this.subscription = value;
        }
        break;

      case EVENTS:
        if (value == null) {
          unsetEvents();
        } else {
          this.events = value;
        }
        break;

      case SYNCTOKEN:
        if (value == null) {
          unsetSyncToken();
        } else {
          this.syncToken = value;
        }
        break;

      case CONTINUATIONTOKEN:
        if (value == null) {
          unsetContinuationToken();
        } else {
          this.continuationToken = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case SUBSCRIPTION:
        return isSetSubscription();
      case EVENTS:
        return isSetEvents();
      case SYNCTOKEN:
        return isSetSyncToken();
      case CONTINUATIONTOKEN:
        return isSetContinuationToken();
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
        case SUBSCRIPTION:
          if (field.type == TType.STRUCT) {
            this.subscription = new SubscriptionState();
            this.subscription.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EVENTS:
          if (field.type == TType.LIST) {
            {
              TList _list362 = iprot.readListBegin();
              this.events = new List<SquareEvent>();
              for (int _i363 = 0; _i363 < _list362.length; ++_i363) {
                SquareEvent _elem364;
                _elem364 = new SquareEvent();
                _elem364.read(iprot);
                this.events.add(_elem364);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SYNCTOKEN:
          if (field.type == TType.STRING) {
            this.syncToken = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CONTINUATIONTOKEN:
          if (field.type == TType.STRING) {
            this.continuationToken = iprot.readString();
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
    if (this.subscription != null) {
      oprot.writeFieldBegin(_SUBSCRIPTION_FIELD_DESC);
      this.subscription.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.events != null) {
      oprot.writeFieldBegin(_EVENTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.events.length));
        for (var elem365 in this.events) {
          elem365.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.syncToken != null) {
      oprot.writeFieldBegin(_SYNC_TOKEN_FIELD_DESC);
      oprot.writeString(this.syncToken);
      oprot.writeFieldEnd();
    }
    if (this.continuationToken != null) {
      oprot.writeFieldBegin(_CONTINUATION_TOKEN_FIELD_DESC);
      oprot.writeString(this.continuationToken);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("FetchMyEventsResponse(");

    ret.write("subscription:");
    if (this.subscription == null) {
      ret.write("null");
    } else {
      ret.write(this.subscription);
    }

    ret.write(", ");
    ret.write("events:");
    if (this.events == null) {
      ret.write("null");
    } else {
      ret.write(this.events);
    }

    ret.write(", ");
    ret.write("syncToken:");
    if (this.syncToken == null) {
      ret.write("null");
    } else {
      ret.write(this.syncToken);
    }

    ret.write(", ");
    ret.write("continuationToken:");
    if (this.continuationToken == null) {
      ret.write("null");
    } else {
      ret.write(this.continuationToken);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

