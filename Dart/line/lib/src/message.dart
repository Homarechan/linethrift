/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.message;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class Message implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("Message");
  static final TField __FROM_FIELD_DESC = new TField("_from", TType.STRING, 1);
  static final TField _TO_FIELD_DESC = new TField("to", TType.STRING, 2);
  static final TField _TO_TYPE_FIELD_DESC = new TField("toType", TType.I32, 3);
  static final TField _ID_FIELD_DESC = new TField("id", TType.STRING, 4);
  static final TField _CREATED_TIME_FIELD_DESC = new TField("createdTime", TType.I64, 5);
  static final TField _DELIVERED_TIME_FIELD_DESC = new TField("deliveredTime", TType.I64, 6);
  static final TField _TEXT_FIELD_DESC = new TField("text", TType.STRING, 10);
  static final TField _LOCATION_FIELD_DESC = new TField("location", TType.STRUCT, 11);
  static final TField _HAS_CONTENT_FIELD_DESC = new TField("hasContent", TType.BOOL, 14);
  static final TField _CONTENT_TYPE_FIELD_DESC = new TField("contentType", TType.I32, 15);
  static final TField _CONTENT_PREVIEW_FIELD_DESC = new TField("contentPreview", TType.STRING, 17);
  static final TField _CONTENT_METADATA_FIELD_DESC = new TField("contentMetadata", TType.MAP, 18);
  static final TField _SESSION_ID_FIELD_DESC = new TField("sessionId", TType.BYTE, 19);
  static final TField _CHUNKS_FIELD_DESC = new TField("chunks", TType.LIST, 20);
  static final TField _RELATED_MESSAGE_ID_FIELD_DESC = new TField("relatedMessageId", TType.STRING, 21);
  static final TField _MESSAGE_RELATION_TYPE_FIELD_DESC = new TField("messageRelationType", TType.I32, 22);
  static final TField _READ_COUNT_FIELD_DESC = new TField("readCount", TType.I64, 23);
  static final TField _RELATED_MESSAGE_SERVICE_CODE_FIELD_DESC = new TField("relatedMessageServiceCode", TType.I32, 24);

  String __from;
  static const int _FROM = 1;
  String _to;
  static const int TO = 2;
  int _toType;
  static const int TOTYPE = 3;
  String _id;
  static const int ID = 4;
  int _createdTime = 0;
  static const int CREATEDTIME = 5;
  int _deliveredTime = 0;
  static const int DELIVEREDTIME = 6;
  String _text;
  static const int TEXT = 10;
  Location _location;
  static const int LOCATION = 11;
  bool _hasContent = false;
  static const int HASCONTENT = 14;
  int _contentType;
  static const int CONTENTTYPE = 15;
  Uint8List _contentPreview;
  static const int CONTENTPREVIEW = 17;
  Map<String, String> _contentMetadata;
  static const int CONTENTMETADATA = 18;
  int _sessionId = 0;
  static const int SESSIONID = 19;
  List<Uint8List> _chunks;
  static const int CHUNKS = 20;
  String _relatedMessageId;
  static const int RELATEDMESSAGEID = 21;
  int _messageRelationType;
  static const int MESSAGERELATIONTYPE = 22;
  int _readCount = 0;
  static const int READCOUNT = 23;
  int _relatedMessageServiceCode;
  static const int RELATEDMESSAGESERVICECODE = 24;

  bool __isset_toType = false;
  bool __isset_createdTime = false;
  bool __isset_deliveredTime = false;
  bool __isset_hasContent = false;
  bool __isset_contentType = false;
  bool __isset_sessionId = false;
  bool __isset_messageRelationType = false;
  bool __isset_readCount = false;
  bool __isset_relatedMessageServiceCode = false;

  Message() {
  }

  // _from
  String get _from => this.__from;

  set _from(String _from) {
    this.__from = _from;
  }

  bool isSet_from() => this._from != null;

  unset_from() {
    this._from = null;
  }

  // to
  String get to => this._to;

  set to(String to) {
    this._to = to;
  }

  bool isSetTo() => this.to != null;

  unsetTo() {
    this.to = null;
  }

  // toType
  int get toType => this._toType;

  set toType(int toType) {
    this._toType = toType;
    this.__isset_toType = true;
  }

  bool isSetToType() => this.__isset_toType;

  unsetToType() {
    this.__isset_toType = false;
  }

  // id
  String get id => this._id;

  set id(String id) {
    this._id = id;
  }

  bool isSetId() => this.id != null;

  unsetId() {
    this.id = null;
  }

  // createdTime
  int get createdTime => this._createdTime;

  set createdTime(int createdTime) {
    this._createdTime = createdTime;
    this.__isset_createdTime = true;
  }

  bool isSetCreatedTime() => this.__isset_createdTime;

  unsetCreatedTime() {
    this.__isset_createdTime = false;
  }

  // deliveredTime
  int get deliveredTime => this._deliveredTime;

  set deliveredTime(int deliveredTime) {
    this._deliveredTime = deliveredTime;
    this.__isset_deliveredTime = true;
  }

  bool isSetDeliveredTime() => this.__isset_deliveredTime;

  unsetDeliveredTime() {
    this.__isset_deliveredTime = false;
  }

  // text
  String get text => this._text;

  set text(String text) {
    this._text = text;
  }

  bool isSetText() => this.text != null;

  unsetText() {
    this.text = null;
  }

  // location
  Location get location => this._location;

  set location(Location location) {
    this._location = location;
  }

  bool isSetLocation() => this.location != null;

  unsetLocation() {
    this.location = null;
  }

  // hasContent
  bool get hasContent => this._hasContent;

  set hasContent(bool hasContent) {
    this._hasContent = hasContent;
    this.__isset_hasContent = true;
  }

  bool isSetHasContent() => this.__isset_hasContent;

  unsetHasContent() {
    this.__isset_hasContent = false;
  }

  // contentType
  int get contentType => this._contentType;

  set contentType(int contentType) {
    this._contentType = contentType;
    this.__isset_contentType = true;
  }

  bool isSetContentType() => this.__isset_contentType;

  unsetContentType() {
    this.__isset_contentType = false;
  }

  // contentPreview
  Uint8List get contentPreview => this._contentPreview;

  set contentPreview(Uint8List contentPreview) {
    this._contentPreview = contentPreview;
  }

  bool isSetContentPreview() => this.contentPreview != null;

  unsetContentPreview() {
    this.contentPreview = null;
  }

  // contentMetadata
  Map<String, String> get contentMetadata => this._contentMetadata;

  set contentMetadata(Map<String, String> contentMetadata) {
    this._contentMetadata = contentMetadata;
  }

  bool isSetContentMetadata() => this.contentMetadata != null;

  unsetContentMetadata() {
    this.contentMetadata = null;
  }

  // sessionId
  int get sessionId => this._sessionId;

  set sessionId(int sessionId) {
    this._sessionId = sessionId;
    this.__isset_sessionId = true;
  }

  bool isSetSessionId() => this.__isset_sessionId;

  unsetSessionId() {
    this.__isset_sessionId = false;
  }

  // chunks
  List<Uint8List> get chunks => this._chunks;

  set chunks(List<Uint8List> chunks) {
    this._chunks = chunks;
  }

  bool isSetChunks() => this.chunks != null;

  unsetChunks() {
    this.chunks = null;
  }

  // relatedMessageId
  String get relatedMessageId => this._relatedMessageId;

  set relatedMessageId(String relatedMessageId) {
    this._relatedMessageId = relatedMessageId;
  }

  bool isSetRelatedMessageId() => this.relatedMessageId != null;

  unsetRelatedMessageId() {
    this.relatedMessageId = null;
  }

  // messageRelationType
  int get messageRelationType => this._messageRelationType;

  set messageRelationType(int messageRelationType) {
    this._messageRelationType = messageRelationType;
    this.__isset_messageRelationType = true;
  }

  bool isSetMessageRelationType() => this.__isset_messageRelationType;

  unsetMessageRelationType() {
    this.__isset_messageRelationType = false;
  }

  // readCount
  int get readCount => this._readCount;

  set readCount(int readCount) {
    this._readCount = readCount;
    this.__isset_readCount = true;
  }

  bool isSetReadCount() => this.__isset_readCount;

  unsetReadCount() {
    this.__isset_readCount = false;
  }

  // relatedMessageServiceCode
  int get relatedMessageServiceCode => this._relatedMessageServiceCode;

  set relatedMessageServiceCode(int relatedMessageServiceCode) {
    this._relatedMessageServiceCode = relatedMessageServiceCode;
    this.__isset_relatedMessageServiceCode = true;
  }

  bool isSetRelatedMessageServiceCode() => this.__isset_relatedMessageServiceCode;

  unsetRelatedMessageServiceCode() {
    this.__isset_relatedMessageServiceCode = false;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case _FROM:
        return this._from;
      case TO:
        return this.to;
      case TOTYPE:
        return this.toType;
      case ID:
        return this.id;
      case CREATEDTIME:
        return this.createdTime;
      case DELIVEREDTIME:
        return this.deliveredTime;
      case TEXT:
        return this.text;
      case LOCATION:
        return this.location;
      case HASCONTENT:
        return this.hasContent;
      case CONTENTTYPE:
        return this.contentType;
      case CONTENTPREVIEW:
        return this.contentPreview;
      case CONTENTMETADATA:
        return this.contentMetadata;
      case SESSIONID:
        return this.sessionId;
      case CHUNKS:
        return this.chunks;
      case RELATEDMESSAGEID:
        return this.relatedMessageId;
      case MESSAGERELATIONTYPE:
        return this.messageRelationType;
      case READCOUNT:
        return this.readCount;
      case RELATEDMESSAGESERVICECODE:
        return this.relatedMessageServiceCode;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case _FROM:
        if (value == null) {
          unset_from();
        } else {
          this._from = value;
        }
        break;

      case TO:
        if (value == null) {
          unsetTo();
        } else {
          this.to = value;
        }
        break;

      case TOTYPE:
        if (value == null) {
          unsetToType();
        } else {
          this.toType = value;
        }
        break;

      case ID:
        if (value == null) {
          unsetId();
        } else {
          this.id = value;
        }
        break;

      case CREATEDTIME:
        if (value == null) {
          unsetCreatedTime();
        } else {
          this.createdTime = value;
        }
        break;

      case DELIVEREDTIME:
        if (value == null) {
          unsetDeliveredTime();
        } else {
          this.deliveredTime = value;
        }
        break;

      case TEXT:
        if (value == null) {
          unsetText();
        } else {
          this.text = value;
        }
        break;

      case LOCATION:
        if (value == null) {
          unsetLocation();
        } else {
          this.location = value;
        }
        break;

      case HASCONTENT:
        if (value == null) {
          unsetHasContent();
        } else {
          this.hasContent = value;
        }
        break;

      case CONTENTTYPE:
        if (value == null) {
          unsetContentType();
        } else {
          this.contentType = value;
        }
        break;

      case CONTENTPREVIEW:
        if (value == null) {
          unsetContentPreview();
        } else {
          this.contentPreview = value;
        }
        break;

      case CONTENTMETADATA:
        if (value == null) {
          unsetContentMetadata();
        } else {
          this.contentMetadata = value;
        }
        break;

      case SESSIONID:
        if (value == null) {
          unsetSessionId();
        } else {
          this.sessionId = value;
        }
        break;

      case CHUNKS:
        if (value == null) {
          unsetChunks();
        } else {
          this.chunks = value;
        }
        break;

      case RELATEDMESSAGEID:
        if (value == null) {
          unsetRelatedMessageId();
        } else {
          this.relatedMessageId = value;
        }
        break;

      case MESSAGERELATIONTYPE:
        if (value == null) {
          unsetMessageRelationType();
        } else {
          this.messageRelationType = value;
        }
        break;

      case READCOUNT:
        if (value == null) {
          unsetReadCount();
        } else {
          this.readCount = value;
        }
        break;

      case RELATEDMESSAGESERVICECODE:
        if (value == null) {
          unsetRelatedMessageServiceCode();
        } else {
          this.relatedMessageServiceCode = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case _FROM:
        return isSet_from();
      case TO:
        return isSetTo();
      case TOTYPE:
        return isSetToType();
      case ID:
        return isSetId();
      case CREATEDTIME:
        return isSetCreatedTime();
      case DELIVEREDTIME:
        return isSetDeliveredTime();
      case TEXT:
        return isSetText();
      case LOCATION:
        return isSetLocation();
      case HASCONTENT:
        return isSetHasContent();
      case CONTENTTYPE:
        return isSetContentType();
      case CONTENTPREVIEW:
        return isSetContentPreview();
      case CONTENTMETADATA:
        return isSetContentMetadata();
      case SESSIONID:
        return isSetSessionId();
      case CHUNKS:
        return isSetChunks();
      case RELATEDMESSAGEID:
        return isSetRelatedMessageId();
      case MESSAGERELATIONTYPE:
        return isSetMessageRelationType();
      case READCOUNT:
        return isSetReadCount();
      case RELATEDMESSAGESERVICECODE:
        return isSetRelatedMessageServiceCode();
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
        case _FROM:
          if (field.type == TType.STRING) {
            this._from = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TO:
          if (field.type == TType.STRING) {
            this.to = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TOTYPE:
          if (field.type == TType.I32) {
            this.toType = iprot.readI32();
            this.__isset_toType = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ID:
          if (field.type == TType.STRING) {
            this.id = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CREATEDTIME:
          if (field.type == TType.I64) {
            this.createdTime = iprot.readI64();
            this.__isset_createdTime = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DELIVEREDTIME:
          if (field.type == TType.I64) {
            this.deliveredTime = iprot.readI64();
            this.__isset_deliveredTime = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TEXT:
          if (field.type == TType.STRING) {
            this.text = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case LOCATION:
          if (field.type == TType.STRUCT) {
            this.location = new Location();
            this.location.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case HASCONTENT:
          if (field.type == TType.BOOL) {
            this.hasContent = iprot.readBool();
            this.__isset_hasContent = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CONTENTTYPE:
          if (field.type == TType.I32) {
            this.contentType = iprot.readI32();
            this.__isset_contentType = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CONTENTPREVIEW:
          if (field.type == TType.STRING) {
            this.contentPreview = iprot.readBinary();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CONTENTMETADATA:
          if (field.type == TType.MAP) {
            {
              TMap _map162 = iprot.readMapBegin();
              this.contentMetadata = new Map<String, String>();
              for (int _i163 = 0; _i163 < _map162.length; ++_i163) {
                String _key164;
                String _val165;
                _key164 = iprot.readString();
                _val165 = iprot.readString();
                this.contentMetadata[_key164] = _val165;
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SESSIONID:
          if (field.type == TType.BYTE) {
            this.sessionId = iprot.readByte();
            this.__isset_sessionId = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CHUNKS:
          if (field.type == TType.LIST) {
            {
              TList _list166 = iprot.readListBegin();
              this.chunks = new List<Uint8List>();
              for (int _i167 = 0; _i167 < _list166.length; ++_i167) {
                Uint8List _elem168;
                _elem168 = iprot.readBinary();
                this.chunks.add(_elem168);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case RELATEDMESSAGEID:
          if (field.type == TType.STRING) {
            this.relatedMessageId = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case MESSAGERELATIONTYPE:
          if (field.type == TType.I32) {
            this.messageRelationType = iprot.readI32();
            this.__isset_messageRelationType = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case READCOUNT:
          if (field.type == TType.I64) {
            this.readCount = iprot.readI64();
            this.__isset_readCount = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case RELATEDMESSAGESERVICECODE:
          if (field.type == TType.I32) {
            this.relatedMessageServiceCode = iprot.readI32();
            this.__isset_relatedMessageServiceCode = true;
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
    if (this._from != null) {
      oprot.writeFieldBegin(__FROM_FIELD_DESC);
      oprot.writeString(this._from);
      oprot.writeFieldEnd();
    }
    if (this.to != null) {
      oprot.writeFieldBegin(_TO_FIELD_DESC);
      oprot.writeString(this.to);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_TO_TYPE_FIELD_DESC);
    oprot.writeI32(this.toType);
    oprot.writeFieldEnd();
    if (this.id != null) {
      oprot.writeFieldBegin(_ID_FIELD_DESC);
      oprot.writeString(this.id);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_CREATED_TIME_FIELD_DESC);
    oprot.writeI64(this.createdTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_DELIVERED_TIME_FIELD_DESC);
    oprot.writeI64(this.deliveredTime);
    oprot.writeFieldEnd();
    if (this.text != null) {
      oprot.writeFieldBegin(_TEXT_FIELD_DESC);
      oprot.writeString(this.text);
      oprot.writeFieldEnd();
    }
    if (this.location != null) {
      oprot.writeFieldBegin(_LOCATION_FIELD_DESC);
      this.location.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_HAS_CONTENT_FIELD_DESC);
    oprot.writeBool(this.hasContent);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_CONTENT_TYPE_FIELD_DESC);
    oprot.writeI32(this.contentType);
    oprot.writeFieldEnd();
    if (this.contentPreview != null) {
      oprot.writeFieldBegin(_CONTENT_PREVIEW_FIELD_DESC);
      oprot.writeBinary(this.contentPreview);
      oprot.writeFieldEnd();
    }
    if (this.contentMetadata != null) {
      oprot.writeFieldBegin(_CONTENT_METADATA_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.contentMetadata.length));
        for (var elem170 in this.contentMetadata.keys) {
          oprot.writeString(elem170);
          oprot.writeString(this.contentMetadata[elem170]);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_SESSION_ID_FIELD_DESC);
    oprot.writeByte(this.sessionId);
    oprot.writeFieldEnd();
    if (this.chunks != null) {
      oprot.writeFieldBegin(_CHUNKS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.chunks.length));
        for (var elem171 in this.chunks) {
          oprot.writeBinary(elem171);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.relatedMessageId != null) {
      oprot.writeFieldBegin(_RELATED_MESSAGE_ID_FIELD_DESC);
      oprot.writeString(this.relatedMessageId);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_MESSAGE_RELATION_TYPE_FIELD_DESC);
    oprot.writeI32(this.messageRelationType);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_READ_COUNT_FIELD_DESC);
    oprot.writeI64(this.readCount);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_RELATED_MESSAGE_SERVICE_CODE_FIELD_DESC);
    oprot.writeI32(this.relatedMessageServiceCode);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("Message(");

    ret.write("_from:");
    if (this._from == null) {
      ret.write("null");
    } else {
      ret.write(this._from);
    }

    ret.write(", ");
    ret.write("to:");
    if (this.to == null) {
      ret.write("null");
    } else {
      ret.write(this.to);
    }

    ret.write(", ");
    ret.write("toType:");
    String toType_name = MIDType.VALUES_TO_NAMES[this.toType];
    if (toType_name != null) {
      ret.write(toType_name);
      ret.write(" (");
    }
    ret.write(this.toType);
    if (toType_name != null) {
      ret.write(")");
    }

    ret.write(", ");
    ret.write("id:");
    if (this.id == null) {
      ret.write("null");
    } else {
      ret.write(this.id);
    }

    ret.write(", ");
    ret.write("createdTime:");
    ret.write(this.createdTime);

    ret.write(", ");
    ret.write("deliveredTime:");
    ret.write(this.deliveredTime);

    ret.write(", ");
    ret.write("text:");
    if (this.text == null) {
      ret.write("null");
    } else {
      ret.write(this.text);
    }

    ret.write(", ");
    ret.write("location:");
    if (this.location == null) {
      ret.write("null");
    } else {
      ret.write(this.location);
    }

    ret.write(", ");
    ret.write("hasContent:");
    ret.write(this.hasContent);

    ret.write(", ");
    ret.write("contentType:");
    String contentType_name = ContentType.VALUES_TO_NAMES[this.contentType];
    if (contentType_name != null) {
      ret.write(contentType_name);
      ret.write(" (");
    }
    ret.write(this.contentType);
    if (contentType_name != null) {
      ret.write(")");
    }

    ret.write(", ");
    ret.write("contentPreview:");
    if (this.contentPreview == null) {
      ret.write("null");
    } else {
      ret.write("BINARY");
    }

    ret.write(", ");
    ret.write("contentMetadata:");
    if (this.contentMetadata == null) {
      ret.write("null");
    } else {
      ret.write(this.contentMetadata);
    }

    ret.write(", ");
    ret.write("sessionId:");
    ret.write(this.sessionId);

    ret.write(", ");
    ret.write("chunks:");
    if (this.chunks == null) {
      ret.write("null");
    } else {
      ret.write(this.chunks);
    }

    ret.write(", ");
    ret.write("relatedMessageId:");
    if (this.relatedMessageId == null) {
      ret.write("null");
    } else {
      ret.write(this.relatedMessageId);
    }

    ret.write(", ");
    ret.write("messageRelationType:");
    String messageRelationType_name = MessageRelationType.VALUES_TO_NAMES[this.messageRelationType];
    if (messageRelationType_name != null) {
      ret.write(messageRelationType_name);
      ret.write(" (");
    }
    ret.write(this.messageRelationType);
    if (messageRelationType_name != null) {
      ret.write(")");
    }

    ret.write(", ");
    ret.write("readCount:");
    ret.write(this.readCount);

    ret.write(", ");
    ret.write("relatedMessageServiceCode:");
    String relatedMessageServiceCode_name = ServiceCode.VALUES_TO_NAMES[this.relatedMessageServiceCode];
    if (relatedMessageServiceCode_name != null) {
      ret.write(relatedMessageServiceCode_name);
      ret.write(" (");
    }
    ret.write(this.relatedMessageServiceCode);
    if (relatedMessageServiceCode_name != null) {
      ret.write(")");
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetToType() && !MIDType.VALID_VALUES.contains(toType)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'toType' has been assigned the invalid value $toType");
    }
    if (isSetContentType() && !ContentType.VALID_VALUES.contains(contentType)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'contentType' has been assigned the invalid value $contentType");
    }
    if (isSetMessageRelationType() && !MessageRelationType.VALID_VALUES.contains(messageRelationType)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'messageRelationType' has been assigned the invalid value $messageRelationType");
    }
    if (isSetRelatedMessageServiceCode() && !ServiceCode.VALID_VALUES.contains(relatedMessageServiceCode)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'relatedMessageServiceCode' has been assigned the invalid value $relatedMessageServiceCode");
    }
  }

}

