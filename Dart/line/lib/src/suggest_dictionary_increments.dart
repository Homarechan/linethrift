/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.suggest_dictionary_increments;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SuggestDictionaryIncrements implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SuggestDictionaryIncrements");
  static final TField _ITEM_INCREMENT_FIELD_DESC = new TField("itemIncrement", TType.STRUCT, 1);
  static final TField _TAG_INCREMENTS_FIELD_DESC = new TField("tagIncrements", TType.LIST, 2);

  SuggestItemDictionaryIncrement _itemIncrement;
  static const int ITEMINCREMENT = 1;
  List<SuggestTagDictionaryIncrement> _tagIncrements;
  static const int TAGINCREMENTS = 2;


  SuggestDictionaryIncrements() {
  }

  // itemIncrement
  SuggestItemDictionaryIncrement get itemIncrement => this._itemIncrement;

  set itemIncrement(SuggestItemDictionaryIncrement itemIncrement) {
    this._itemIncrement = itemIncrement;
  }

  bool isSetItemIncrement() => this.itemIncrement != null;

  unsetItemIncrement() {
    this.itemIncrement = null;
  }

  // tagIncrements
  List<SuggestTagDictionaryIncrement> get tagIncrements => this._tagIncrements;

  set tagIncrements(List<SuggestTagDictionaryIncrement> tagIncrements) {
    this._tagIncrements = tagIncrements;
  }

  bool isSetTagIncrements() => this.tagIncrements != null;

  unsetTagIncrements() {
    this.tagIncrements = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case ITEMINCREMENT:
        return this.itemIncrement;
      case TAGINCREMENTS:
        return this.tagIncrements;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case ITEMINCREMENT:
        if (value == null) {
          unsetItemIncrement();
        } else {
          this.itemIncrement = value;
        }
        break;

      case TAGINCREMENTS:
        if (value == null) {
          unsetTagIncrements();
        } else {
          this.tagIncrements = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case ITEMINCREMENT:
        return isSetItemIncrement();
      case TAGINCREMENTS:
        return isSetTagIncrements();
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
        case ITEMINCREMENT:
          if (field.type == TType.STRUCT) {
            this.itemIncrement = new SuggestItemDictionaryIncrement();
            this.itemIncrement.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TAGINCREMENTS:
          if (field.type == TType.LIST) {
            {
              TList _list234 = iprot.readListBegin();
              this.tagIncrements = new List<SuggestTagDictionaryIncrement>();
              for (int _i235 = 0; _i235 < _list234.length; ++_i235) {
                SuggestTagDictionaryIncrement _elem236;
                _elem236 = new SuggestTagDictionaryIncrement();
                _elem236.read(iprot);
                this.tagIncrements.add(_elem236);
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
    if (this.itemIncrement != null) {
      oprot.writeFieldBegin(_ITEM_INCREMENT_FIELD_DESC);
      this.itemIncrement.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.tagIncrements != null) {
      oprot.writeFieldBegin(_TAG_INCREMENTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.tagIncrements.length));
        for (var elem237 in this.tagIncrements) {
          elem237.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SuggestDictionaryIncrements(");

    ret.write("itemIncrement:");
    if (this.itemIncrement == null) {
      ret.write("null");
    } else {
      ret.write(this.itemIncrement);
    }

    ret.write(", ");
    ret.write("tagIncrements:");
    if (this.tagIncrements == null) {
      ret.write("null");
    } else {
      ret.write(this.tagIncrements);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

