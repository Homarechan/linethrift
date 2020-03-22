/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using System.Threading;
using System.Threading.Tasks;
using Thrift;
using Thrift.Collections;

using Thrift.Protocol;
using Thrift.Protocol.Entities;
using Thrift.Protocol.Utilities;
using Thrift.Transport;
using Thrift.Transport.Client;
using Thrift.Transport.Server;
using Thrift.Processor;



public partial class NotificationItem : TBase
{
  private string _id;
  private string __from;
  private string _to;
  private string _fromChannel;
  private string _toChannel;
  private long _revision;
  private long _createdTime;
  private Dictionary<string, string> _content;

  public string Id
  {
    get
    {
      return _id;
    }
    set
    {
      __isset.id = true;
      this._id = value;
    }
  }

  public string _from
  {
    get
    {
      return __from;
    }
    set
    {
      __isset._from = true;
      this.__from = value;
    }
  }

  public string To
  {
    get
    {
      return _to;
    }
    set
    {
      __isset.to = true;
      this._to = value;
    }
  }

  public string FromChannel
  {
    get
    {
      return _fromChannel;
    }
    set
    {
      __isset.fromChannel = true;
      this._fromChannel = value;
    }
  }

  public string ToChannel
  {
    get
    {
      return _toChannel;
    }
    set
    {
      __isset.toChannel = true;
      this._toChannel = value;
    }
  }

  public long Revision
  {
    get
    {
      return _revision;
    }
    set
    {
      __isset.revision = true;
      this._revision = value;
    }
  }

  public long CreatedTime
  {
    get
    {
      return _createdTime;
    }
    set
    {
      __isset.createdTime = true;
      this._createdTime = value;
    }
  }

  public Dictionary<string, string> Content
  {
    get
    {
      return _content;
    }
    set
    {
      __isset.content = true;
      this._content = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool id;
    public bool _from;
    public bool to;
    public bool fromChannel;
    public bool toChannel;
    public bool revision;
    public bool createdTime;
    public bool content;
  }

  public NotificationItem()
  {
  }

  public async Task ReadAsync(TProtocol iprot, CancellationToken cancellationToken)
  {
    iprot.IncrementRecursionDepth();
    try
    {
      TField field;
      await iprot.ReadStructBeginAsync(cancellationToken);
      while (true)
      {
        field = await iprot.ReadFieldBeginAsync(cancellationToken);
        if (field.Type == TType.Stop)
        {
          break;
        }

        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.String)
            {
              Id = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.String)
            {
              _from = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.String)
            {
              To = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.String)
            {
              FromChannel = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 5:
            if (field.Type == TType.String)
            {
              ToChannel = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 7:
            if (field.Type == TType.I64)
            {
              Revision = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 8:
            if (field.Type == TType.I64)
            {
              CreatedTime = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 9:
            if (field.Type == TType.Map)
            {
              {
                TMap _map179 = await iprot.ReadMapBeginAsync(cancellationToken);
                Content = new Dictionary<string, string>(_map179.Count);
                for(int _i180 = 0; _i180 < _map179.Count; ++_i180)
                {
                  string _key181;
                  string _val182;
                  _key181 = await iprot.ReadStringAsync(cancellationToken);
                  _val182 = await iprot.ReadStringAsync(cancellationToken);
                  Content[_key181] = _val182;
                }
                await iprot.ReadMapEndAsync(cancellationToken);
              }
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          default: 
            await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            break;
        }

        await iprot.ReadFieldEndAsync(cancellationToken);
      }

      await iprot.ReadStructEndAsync(cancellationToken);
    }
    finally
    {
      iprot.DecrementRecursionDepth();
    }
  }

  public async Task WriteAsync(TProtocol oprot, CancellationToken cancellationToken)
  {
    oprot.IncrementRecursionDepth();
    try
    {
      var struc = new TStruct("NotificationItem");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (Id != null && __isset.id)
      {
        field.Name = "id";
        field.Type = TType.String;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Id, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (_from != null && __isset._from)
      {
        field.Name = "_from";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(_from, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (To != null && __isset.to)
      {
        field.Name = "to";
        field.Type = TType.String;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(To, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (FromChannel != null && __isset.fromChannel)
      {
        field.Name = "fromChannel";
        field.Type = TType.String;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(FromChannel, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (ToChannel != null && __isset.toChannel)
      {
        field.Name = "toChannel";
        field.Type = TType.String;
        field.ID = 5;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(ToChannel, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.revision)
      {
        field.Name = "revision";
        field.Type = TType.I64;
        field.ID = 7;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(Revision, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.createdTime)
      {
        field.Name = "createdTime";
        field.Type = TType.I64;
        field.ID = 8;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(CreatedTime, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Content != null && __isset.content)
      {
        field.Name = "content";
        field.Type = TType.Map;
        field.ID = 9;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteMapBeginAsync(new TMap(TType.String, TType.String, Content.Count), cancellationToken);
          foreach (string _iter183 in Content.Keys)
          {
            await oprot.WriteStringAsync(_iter183, cancellationToken);
            await oprot.WriteStringAsync(Content[_iter183], cancellationToken);
          }
          await oprot.WriteMapEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      await oprot.WriteFieldStopAsync(cancellationToken);
      await oprot.WriteStructEndAsync(cancellationToken);
    }
    finally
    {
      oprot.DecrementRecursionDepth();
    }
  }

  public override bool Equals(object that)
  {
    var other = that as NotificationItem;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.id == other.__isset.id) && ((!__isset.id) || (System.Object.Equals(Id, other.Id))))
      && ((__isset._from == other.__isset._from) && ((!__isset._from) || (System.Object.Equals(_from, other._from))))
      && ((__isset.to == other.__isset.to) && ((!__isset.to) || (System.Object.Equals(To, other.To))))
      && ((__isset.fromChannel == other.__isset.fromChannel) && ((!__isset.fromChannel) || (System.Object.Equals(FromChannel, other.FromChannel))))
      && ((__isset.toChannel == other.__isset.toChannel) && ((!__isset.toChannel) || (System.Object.Equals(ToChannel, other.ToChannel))))
      && ((__isset.revision == other.__isset.revision) && ((!__isset.revision) || (System.Object.Equals(Revision, other.Revision))))
      && ((__isset.createdTime == other.__isset.createdTime) && ((!__isset.createdTime) || (System.Object.Equals(CreatedTime, other.CreatedTime))))
      && ((__isset.content == other.__isset.content) && ((!__isset.content) || (TCollections.Equals(Content, other.Content))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.id)
        hashcode = (hashcode * 397) + Id.GetHashCode();
      if(__isset._from)
        hashcode = (hashcode * 397) + _from.GetHashCode();
      if(__isset.to)
        hashcode = (hashcode * 397) + To.GetHashCode();
      if(__isset.fromChannel)
        hashcode = (hashcode * 397) + FromChannel.GetHashCode();
      if(__isset.toChannel)
        hashcode = (hashcode * 397) + ToChannel.GetHashCode();
      if(__isset.revision)
        hashcode = (hashcode * 397) + Revision.GetHashCode();
      if(__isset.createdTime)
        hashcode = (hashcode * 397) + CreatedTime.GetHashCode();
      if(__isset.content)
        hashcode = (hashcode * 397) + TCollections.GetHashCode(Content);
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("NotificationItem(");
    bool __first = true;
    if (Id != null && __isset.id)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Id: ");
      Id.ToString(sb);
    }
    if (_from != null && __isset._from)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("_from: ");
      _from.ToString(sb);
    }
    if (To != null && __isset.to)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("To: ");
      To.ToString(sb);
    }
    if (FromChannel != null && __isset.fromChannel)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("FromChannel: ");
      FromChannel.ToString(sb);
    }
    if (ToChannel != null && __isset.toChannel)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ToChannel: ");
      ToChannel.ToString(sb);
    }
    if (__isset.revision)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Revision: ");
      Revision.ToString(sb);
    }
    if (__isset.createdTime)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("CreatedTime: ");
      CreatedTime.ToString(sb);
    }
    if (Content != null && __isset.content)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Content: ");
      Content.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

