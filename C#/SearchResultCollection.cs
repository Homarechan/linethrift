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
public partial class SearchResultCollection : TBase
{
  private int _collection;
  private string _title;
  private int _rank;
  private int _hits;
  private List<SearchResultItem> _items;
  private bool _hasNext;
  private List<int> _cat;
  private string _error;
  private string _tabTitle;
  private int _start;
  private int _length;
  private int _squareCategoryId;

  public int Collection
  {
    get
    {
      return _collection;
    }
    set
    {
      __isset.collection = true;
      this._collection = value;
    }
  }

  public string Title
  {
    get
    {
      return _title;
    }
    set
    {
      __isset.title = true;
      this._title = value;
    }
  }

  public int Rank
  {
    get
    {
      return _rank;
    }
    set
    {
      __isset.rank = true;
      this._rank = value;
    }
  }

  public int Hits
  {
    get
    {
      return _hits;
    }
    set
    {
      __isset.hits = true;
      this._hits = value;
    }
  }

  public List<SearchResultItem> Items
  {
    get
    {
      return _items;
    }
    set
    {
      __isset.items = true;
      this._items = value;
    }
  }

  public bool HasNext
  {
    get
    {
      return _hasNext;
    }
    set
    {
      __isset.hasNext = true;
      this._hasNext = value;
    }
  }

  public List<int> Cat
  {
    get
    {
      return _cat;
    }
    set
    {
      __isset.cat = true;
      this._cat = value;
    }
  }

  public string Error
  {
    get
    {
      return _error;
    }
    set
    {
      __isset.error = true;
      this._error = value;
    }
  }

  public string TabTitle
  {
    get
    {
      return _tabTitle;
    }
    set
    {
      __isset.tabTitle = true;
      this._tabTitle = value;
    }
  }

  public int Start
  {
    get
    {
      return _start;
    }
    set
    {
      __isset.start = true;
      this._start = value;
    }
  }

  public int Length
  {
    get
    {
      return _length;
    }
    set
    {
      __isset.length = true;
      this._length = value;
    }
  }

  public int SquareCategoryId
  {
    get
    {
      return _squareCategoryId;
    }
    set
    {
      __isset.squareCategoryId = true;
      this._squareCategoryId = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool collection;
    public bool title;
    public bool rank;
    public bool hits;
    public bool items;
    public bool hasNext;
    public bool cat;
    public bool error;
    public bool tabTitle;
    public bool start;
    public bool length;
    public bool squareCategoryId;
  }

  public SearchResultCollection() {
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
            if (field.Type == TType.I32) {
              Collection = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              Title = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              Rank = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I32) {
              Hits = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.List) {
              {
                Items = new List<SearchResultItem>();
                TList _list63 = iprot.ReadListBegin();
                for( int _i64 = 0; _i64 < _list63.Count; ++_i64)
                {
                  SearchResultItem _elem65;
                  _elem65 = new SearchResultItem();
                  _elem65.Read(iprot);
                  Items.Add(_elem65);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.Bool) {
              HasNext = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.List) {
              {
                Cat = new List<int>();
                TList _list66 = iprot.ReadListBegin();
                for( int _i67 = 0; _i67 < _list66.Count; ++_i67)
                {
                  int _elem68;
                  _elem68 = iprot.ReadI32();
                  Cat.Add(_elem68);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.String) {
              Error = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 9:
            if (field.Type == TType.String) {
              TabTitle = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 10:
            if (field.Type == TType.I32) {
              Start = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 11:
            if (field.Type == TType.I32) {
              Length = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 12:
            if (field.Type == TType.I32) {
              SquareCategoryId = iprot.ReadI32();
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
      TStruct struc = new TStruct("SearchResultCollection");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.collection) {
        field.Name = "collection";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Collection);
        oprot.WriteFieldEnd();
      }
      if (Title != null && __isset.title) {
        field.Name = "title";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Title);
        oprot.WriteFieldEnd();
      }
      if (__isset.rank) {
        field.Name = "rank";
        field.Type = TType.I32;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Rank);
        oprot.WriteFieldEnd();
      }
      if (__isset.hits) {
        field.Name = "hits";
        field.Type = TType.I32;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Hits);
        oprot.WriteFieldEnd();
      }
      if (Items != null && __isset.items) {
        field.Name = "items";
        field.Type = TType.List;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, Items.Count));
          foreach (SearchResultItem _iter69 in Items)
          {
            _iter69.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (__isset.hasNext) {
        field.Name = "hasNext";
        field.Type = TType.Bool;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(HasNext);
        oprot.WriteFieldEnd();
      }
      if (Cat != null && __isset.cat) {
        field.Name = "cat";
        field.Type = TType.List;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.I32, Cat.Count));
          foreach (int _iter70 in Cat)
          {
            oprot.WriteI32(_iter70);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (Error != null && __isset.error) {
        field.Name = "error";
        field.Type = TType.String;
        field.ID = 8;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Error);
        oprot.WriteFieldEnd();
      }
      if (TabTitle != null && __isset.tabTitle) {
        field.Name = "tabTitle";
        field.Type = TType.String;
        field.ID = 9;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(TabTitle);
        oprot.WriteFieldEnd();
      }
      if (__isset.start) {
        field.Name = "start";
        field.Type = TType.I32;
        field.ID = 10;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Start);
        oprot.WriteFieldEnd();
      }
      if (__isset.length) {
        field.Name = "length";
        field.Type = TType.I32;
        field.ID = 11;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Length);
        oprot.WriteFieldEnd();
      }
      if (__isset.squareCategoryId) {
        field.Name = "squareCategoryId";
        field.Type = TType.I32;
        field.ID = 12;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(SquareCategoryId);
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
    StringBuilder __sb = new StringBuilder("SearchResultCollection(");
    bool __first = true;
    if (__isset.collection) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Collection: ");
      __sb.Append(Collection);
    }
    if (Title != null && __isset.title) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Title: ");
      __sb.Append(Title);
    }
    if (__isset.rank) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Rank: ");
      __sb.Append(Rank);
    }
    if (__isset.hits) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Hits: ");
      __sb.Append(Hits);
    }
    if (Items != null && __isset.items) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Items: ");
      __sb.Append(Items);
    }
    if (__isset.hasNext) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("HasNext: ");
      __sb.Append(HasNext);
    }
    if (Cat != null && __isset.cat) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Cat: ");
      __sb.Append(Cat);
    }
    if (Error != null && __isset.error) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Error: ");
      __sb.Append(Error);
    }
    if (TabTitle != null && __isset.tabTitle) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("TabTitle: ");
      __sb.Append(TabTitle);
    }
    if (__isset.start) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Start: ");
      __sb.Append(Start);
    }
    if (__isset.length) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Length: ");
      __sb.Append(Length);
    }
    if (__isset.squareCategoryId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareCategoryId: ");
      __sb.Append(SquareCategoryId);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}
