/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.suggest_dictionary_revisions;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SuggestDictionaryRevisions implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SuggestDictionaryRevisions");
  static final TField _ITEM_REVISION_FIELD_DESC = new TField("itemRevision", TType.STRUCT, 1);
  static final TField _TAG_REVISIONS_FIELD_DESC = new TField("tagRevisions", TType.LIST, 2);

  SuggestItemDictionaryRevision _itemRevision;
  static const int ITEMREVISION = 1;
  List<SuggestTagDictionaryRevision> _tagRevisions;
  static const int TAGREVISIONS = 2;


  SuggestDictionaryRevisions() {
  }

  // itemRevision
  SuggestItemDictionaryRevision get itemRevision => this._itemRevision;

  set itemRevision(SuggestItemDictionaryRevision itemRevision) {
    this._itemRevision = itemRevision;
  }

  bool isSetItemRevision() => this.itemRevision != null;

  unsetItemRevision() {
    this.itemRevision = null;
  }

  // tagRevisions
  List<SuggestTagDictionaryRevision> get tagRevisions => this._tagRevisions;

  set tagRevisions(List<SuggestTagDictionaryRevision> tagRevisions) {
    this._tagRevisions = tagRevisions;
  }

  bool isSetTagRevisions() => this.tagRevisions != null;

  unsetTagRevisions() {
    this.tagRevisions = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case ITEMREVISION:
        return this.itemRevision;
      case TAGREVISIONS:
        return this.tagRevisions;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case ITEMREVISION:
        if (value == null) {
          unsetItemRevision();
        } else {
          this.itemRevision = value;
        }
        break;

      case TAGREVISIONS:
        if (value == null) {
          unsetTagRevisions();
        } else {
          this.tagRevisions = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case ITEMREVISION:
        return isSetItemRevision();
      case TAGREVISIONS:
        return isSetTagRevisions();
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
        case ITEMREVISION:
          if (field.type == TType.STRUCT) {
            this.itemRevision = new SuggestItemDictionaryRevision();
            this.itemRevision.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TAGREVISIONS:
          if (field.type == TType.LIST) {
            {
              TList _list238 = iprot.readListBegin();
              this.tagRevisions = new List<SuggestTagDictionaryRevision>();
              for (int _i239 = 0; _i239 < _list238.length; ++_i239) {
                SuggestTagDictionaryRevision _elem240;
                _elem240 = new SuggestTagDictionaryRevision();
                _elem240.read(iprot);
                this.tagRevisions.add(_elem240);
              }
              iprot.readListEnd();
            }
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
    if (this.itemRevision != null) {
      oprot.writeFieldBegin(_ITEM_REVISION_FIELD_DESC);
      this.itemRevision.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.tagRevisions != null) {
      oprot.writeFieldBegin(_TAG_REVISIONS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.tagRevisions.length));
        for (var elem241 in this.tagRevisions) {
          elem241.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SuggestDictionaryRevisions(");

    ret.write("itemRevision:");
    if (this.itemRevision == null) {
      ret.write("null");
    } else {
      ret.write(this.itemRevision);
    }

    ret.write(", ");
    ret.write("tagRevisions:");
    if (this.tagRevisions == null) {
      ret.write("null");
    } else {
      ret.write(this.tagRevisions);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

