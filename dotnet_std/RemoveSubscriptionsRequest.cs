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



public partial class RemoveSubscriptionsRequest : TBase
{
  private List<long> _unsubscriptions;

  public List<long> Unsubscriptions
  {
    get
    {
      return _unsubscriptions;
    }
    set
    {
      __isset.unsubscriptions = true;
      this._unsubscriptions = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool unsubscriptions;
  }

  public RemoveSubscriptionsRequest()
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
          case 2:
            if (field.Type == TType.List)
            {
              {
                TList _list458 = await iprot.ReadListBeginAsync(cancellationToken);
                Unsubscriptions = new List<long>(_list458.Count);
                for(int _i459 = 0; _i459 < _list458.Count; ++_i459)
                {
                  long _elem460;
                  _elem460 = await iprot.ReadI64Async(cancellationToken);
                  Unsubscriptions.Add(_elem460);
                }
                await iprot.ReadListEndAsync(cancellationToken);
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
      var struc = new TStruct("RemoveSubscriptionsRequest");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (Unsubscriptions != null && __isset.unsubscriptions)
      {
        field.Name = "unsubscriptions";
        field.Type = TType.List;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteListBeginAsync(new TList(TType.I64, Unsubscriptions.Count), cancellationToken);
          foreach (long _iter461 in Unsubscriptions)
          {
            await oprot.WriteI64Async(_iter461, cancellationToken);
          }
          await oprot.WriteListEndAsync(cancellationToken);
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
    var other = that as RemoveSubscriptionsRequest;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.unsubscriptions == other.__isset.unsubscriptions) && ((!__isset.unsubscriptions) || (TCollections.Equals(Unsubscriptions, other.Unsubscriptions))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.unsubscriptions)
        hashcode = (hashcode * 397) + TCollections.GetHashCode(Unsubscriptions);
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("RemoveSubscriptionsRequest(");
    bool __first = true;
    if (Unsubscriptions != null && __isset.unsubscriptions)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Unsubscriptions: ");
      Unsubscriptions.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

