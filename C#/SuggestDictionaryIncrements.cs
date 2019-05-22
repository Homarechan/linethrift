/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;


#if !SILVERLIGHT
[Serializable]
#endif
public partial class SuggestDictionaryIncrements : TBase
{
  private SuggestItemDictionaryIncrement _itemIncrement;
  private List<SuggestTagDictionaryIncrement> _tagIncrements;

  public SuggestItemDictionaryIncrement ItemIncrement
  {
    get
    {
      return _itemIncrement;
    }
    set
    {
      __isset.itemIncrement = true;
      this._itemIncrement = value;
    }
  }

  public List<SuggestTagDictionaryIncrement> TagIncrements
  {
    get
    {
      return _tagIncrements;
    }
    set
    {
      __isset.tagIncrements = true;
      this._tagIncrements = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool itemIncrement;
    public bool tagIncrements;
  }

  public SuggestDictionaryIncrements() {
  }

  public void Read (TProtocol iprot)
  {
    iprot.IncrementRecursionDepth();
    try
    {
      TField field;
      iprot.ReadStructBegin();
      while (true)
      {
        field = iprot.ReadFieldBegin();
        if (field.Type == TType.Stop) { 
          break;
        }
        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.Struct) {
              ItemIncrement = new SuggestItemDictionaryIncrement();
              ItemIncrement.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.List) {
              {
                TagIncrements = new List<SuggestTagDictionaryIncrement>();
                TList _list313 = iprot.ReadListBegin();
                for( int _i314 = 0; _i314 < _list313.Count; ++_i314)
                {
                  SuggestTagDictionaryIncrement _elem315;
                  _elem315 = new SuggestTagDictionaryIncrement();
                  _elem315.Read(iprot);
                  TagIncrements.Add(_elem315);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          default: 
            TProtocolUtil.Skip(iprot, field.Type);
            break;
        }
        iprot.ReadFieldEnd();
      }
      iprot.ReadStructEnd();
    }
    finally
    {
      iprot.DecrementRecursionDepth();
    }
  }

  public void Write(TProtocol oprot) {
    oprot.IncrementRecursionDepth();
    try
    {
      TStruct struc = new TStruct("SuggestDictionaryIncrements");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (ItemIncrement != null && __isset.itemIncrement) {
        field.Name = "itemIncrement";
        field.Type = TType.Struct;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        ItemIncrement.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (TagIncrements != null && __isset.tagIncrements) {
        field.Name = "tagIncrements";
        field.Type = TType.List;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, TagIncrements.Count));
          foreach (SuggestTagDictionaryIncrement _iter316 in TagIncrements)
          {
            _iter316.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }
    finally
    {
      oprot.DecrementRecursionDepth();
    }
  }

  public override string ToString() {
    StringBuilder __sb = new StringBuilder("SuggestDictionaryIncrements(");
    bool __first = true;
    if (ItemIncrement != null && __isset.itemIncrement) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ItemIncrement: ");
      __sb.Append(ItemIncrement== null ? "<null>" : ItemIncrement.ToString());
    }
    if (TagIncrements != null && __isset.tagIncrements) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("TagIncrements: ");
      __sb.Append(TagIncrements);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}
