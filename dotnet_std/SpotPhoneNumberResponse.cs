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



public partial class SpotPhoneNumberResponse : TBase
{
  private List<SpotItem> _spotItems;

  public List<SpotItem> SpotItems
  {
    get
    {
      return _spotItems;
    }
    set
    {
      __isset.spotItems = true;
      this._spotItems = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool spotItems;
  }

  public SpotPhoneNumberResponse()
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
            if (field.Type == TType.List)
            {
              {
                TList _list12 = await iprot.ReadListBeginAsync(cancellationToken);
                SpotItems = new List<SpotItem>(_list12.Count);
                for(int _i13 = 0; _i13 < _list12.Count; ++_i13)
                {
                  SpotItem _elem14;
                  _elem14 = new SpotItem();
                  await _elem14.ReadAsync(iprot, cancellationToken);
                  SpotItems.Add(_elem14);
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
      var struc = new TStruct("SpotPhoneNumberResponse");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (SpotItems != null && __isset.spotItems)
      {
        field.Name = "spotItems";
        field.Type = TType.List;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteListBeginAsync(new TList(TType.Struct, SpotItems.Count), cancellationToken);
          foreach (SpotItem _iter15 in SpotItems)
          {
            await _iter15.WriteAsync(oprot, cancellationToken);
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
    var other = that as SpotPhoneNumberResponse;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.spotItems == other.__isset.spotItems) && ((!__isset.spotItems) || (TCollections.Equals(SpotItems, other.SpotItems))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.spotItems)
        hashcode = (hashcode * 397) + TCollections.GetHashCode(SpotItems);
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("SpotPhoneNumberResponse(");
    bool __first = true;
    if (SpotItems != null && __isset.spotItems)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SpotItems: ");
      SpotItems.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

