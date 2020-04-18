/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.update_square_member_response;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class UpdateSquareMemberResponse implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("UpdateSquareMemberResponse");
  static final TField _UPDATED_ATTRS_FIELD_DESC = new TField("updatedAttrs", TType.SET, 1);
  static final TField _SQUARE_MEMBER_FIELD_DESC = new TField("squareMember", TType.STRUCT, 2);
  static final TField _UPDATED_PREFERENCE_ATTRS_FIELD_DESC = new TField("updatedPreferenceAttrs", TType.SET, 3);

  Set<int> _updatedAttrs;
  static const int UPDATEDATTRS = 1;
  SquareMember _squareMember;
  static const int SQUAREMEMBER = 2;
  Set<int> _updatedPreferenceAttrs;
  static const int UPDATEDPREFERENCEATTRS = 3;


  UpdateSquareMemberResponse() {
  }

  // updatedAttrs
  Set<int> get updatedAttrs => this._updatedAttrs;

  set updatedAttrs(Set<int> updatedAttrs) {
    this._updatedAttrs = updatedAttrs;
  }

  bool isSetUpdatedAttrs() => this.updatedAttrs != null;

  unsetUpdatedAttrs() {
    this.updatedAttrs = null;
  }

  // squareMember
  SquareMember get squareMember => this._squareMember;

  set squareMember(SquareMember squareMember) {
    this._squareMember = squareMember;
  }

  bool isSetSquareMember() => this.squareMember != null;

  unsetSquareMember() {
    this.squareMember = null;
  }

  // updatedPreferenceAttrs
  Set<int> get updatedPreferenceAttrs => this._updatedPreferenceAttrs;

  set updatedPreferenceAttrs(Set<int> updatedPreferenceAttrs) {
    this._updatedPreferenceAttrs = updatedPreferenceAttrs;
  }

  bool isSetUpdatedPreferenceAttrs() => this.updatedPreferenceAttrs != null;

  unsetUpdatedPreferenceAttrs() {
    this.updatedPreferenceAttrs = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case UPDATEDATTRS:
        return this.updatedAttrs;
      case SQUAREMEMBER:
        return this.squareMember;
      case UPDATEDPREFERENCEATTRS:
        return this.updatedPreferenceAttrs;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case UPDATEDATTRS:
        if (value == null) {
          unsetUpdatedAttrs();
        } else {
          this.updatedAttrs = value;
        }
        break;

      case SQUAREMEMBER:
        if (value == null) {
          unsetSquareMember();
        } else {
          this.squareMember = value;
        }
        break;

      case UPDATEDPREFERENCEATTRS:
        if (value == null) {
          unsetUpdatedPreferenceAttrs();
        } else {
          this.updatedPreferenceAttrs = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case UPDATEDATTRS:
        return isSetUpdatedAttrs();
      case SQUAREMEMBER:
        return isSetSquareMember();
      case UPDATEDPREFERENCEATTRS:
        return isSetUpdatedPreferenceAttrs();
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
        case UPDATEDATTRS:
          if (field.type == TType.SET) {
            {
              TSet _set446 = iprot.readSetBegin();
              this.updatedAttrs = new Set<int>();
              for (int _i447 = 0; _i447 < _set446.length; ++_i447) {
                int _elem448;
                _elem448 = iprot.readI32();
                this.updatedAttrs.add(_elem448);
              }
              iprot.readSetEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SQUAREMEMBER:
          if (field.type == TType.STRUCT) {
            this.squareMember = new SquareMember();
            this.squareMember.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case UPDATEDPREFERENCEATTRS:
          if (field.type == TType.SET) {
            {
              TSet _set449 = iprot.readSetBegin();
              this.updatedPreferenceAttrs = new Set<int>();
              for (int _i450 = 0; _i450 < _set449.length; ++_i450) {
                int _elem451;
                _elem451 = iprot.readI32();
                this.updatedPreferenceAttrs.add(_elem451);
              }
              iprot.readSetEnd();
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
    if (this.updatedAttrs != null) {
      oprot.writeFieldBegin(_UPDATED_ATTRS_FIELD_DESC);
      {
        oprot.writeSetBegin(new TSet(TType.I32, this.updatedAttrs.length));
        for (var elem452 in this.updatedAttrs) {
          oprot.writeI32(elem452);
        }
        oprot.writeSetEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.squareMember != null) {
      oprot.writeFieldBegin(_SQUARE_MEMBER_FIELD_DESC);
      this.squareMember.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.updatedPreferenceAttrs != null) {
      oprot.writeFieldBegin(_UPDATED_PREFERENCE_ATTRS_FIELD_DESC);
      {
        oprot.writeSetBegin(new TSet(TType.I32, this.updatedPreferenceAttrs.length));
        for (var elem453 in this.updatedPreferenceAttrs) {
          oprot.writeI32(elem453);
        }
        oprot.writeSetEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("UpdateSquareMemberResponse(");

    ret.write("updatedAttrs:");
    if (this.updatedAttrs == null) {
      ret.write("null");
    } else {
      ret.write(this.updatedAttrs);
    }

    ret.write(", ");
    ret.write("squareMember:");
    if (this.squareMember == null) {
      ret.write("null");
    } else {
      ret.write(this.squareMember);
    }

    ret.write(", ");
    ret.write("updatedPreferenceAttrs:");
    if (this.updatedPreferenceAttrs == null) {
      ret.write("null");
    } else {
      ret.write(this.updatedPreferenceAttrs);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

