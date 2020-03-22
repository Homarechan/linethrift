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



public partial class GetJoinableSquareChatsResponse : TBase
{
  private List<SquareChat> _squareChats;
  private string _continuationToken;
  private int _totalSquareChatCount;
  private Dictionary<string, SquareChatStatus> _squareChatStatuses;

  public List<SquareChat> SquareChats
  {
    get
    {
      return _squareChats;
    }
    set
    {
      __isset.squareChats = true;
      this._squareChats = value;
    }
  }

  public string ContinuationToken
  {
    get
    {
      return _continuationToken;
    }
    set
    {
      __isset.continuationToken = true;
      this._continuationToken = value;
    }
  }

  public int TotalSquareChatCount
  {
    get
    {
      return _totalSquareChatCount;
    }
    set
    {
      __isset.totalSquareChatCount = true;
      this._totalSquareChatCount = value;
    }
  }

  public Dictionary<string, SquareChatStatus> SquareChatStatuses
  {
    get
    {
      return _squareChatStatuses;
    }
    set
    {
      __isset.squareChatStatuses = true;
      this._squareChatStatuses = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool squareChats;
    public bool continuationToken;
    public bool totalSquareChatCount;
    public bool squareChatStatuses;
  }

  public GetJoinableSquareChatsResponse()
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
                TList _list320 = await iprot.ReadListBeginAsync(cancellationToken);
                SquareChats = new List<SquareChat>(_list320.Count);
                for(int _i321 = 0; _i321 < _list320.Count; ++_i321)
                {
                  SquareChat _elem322;
                  _elem322 = new SquareChat();
                  await _elem322.ReadAsync(iprot, cancellationToken);
                  SquareChats.Add(_elem322);
                }
                await iprot.ReadListEndAsync(cancellationToken);
              }
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.String)
            {
              ContinuationToken = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.I32)
            {
              TotalSquareChatCount = await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.Map)
            {
              {
                TMap _map323 = await iprot.ReadMapBeginAsync(cancellationToken);
                SquareChatStatuses = new Dictionary<string, SquareChatStatus>(_map323.Count);
                for(int _i324 = 0; _i324 < _map323.Count; ++_i324)
                {
                  string _key325;
                  SquareChatStatus _val326;
                  _key325 = await iprot.ReadStringAsync(cancellationToken);
                  _val326 = new SquareChatStatus();
                  await _val326.ReadAsync(iprot, cancellationToken);
                  SquareChatStatuses[_key325] = _val326;
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
      var struc = new TStruct("GetJoinableSquareChatsResponse");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (SquareChats != null && __isset.squareChats)
      {
        field.Name = "squareChats";
        field.Type = TType.List;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteListBeginAsync(new TList(TType.Struct, SquareChats.Count), cancellationToken);
          foreach (SquareChat _iter327 in SquareChats)
          {
            await _iter327.WriteAsync(oprot, cancellationToken);
          }
          await oprot.WriteListEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (ContinuationToken != null && __isset.continuationToken)
      {
        field.Name = "continuationToken";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(ContinuationToken, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.totalSquareChatCount)
      {
        field.Name = "totalSquareChatCount";
        field.Type = TType.I32;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(TotalSquareChatCount, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (SquareChatStatuses != null && __isset.squareChatStatuses)
      {
        field.Name = "squareChatStatuses";
        field.Type = TType.Map;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteMapBeginAsync(new TMap(TType.String, TType.Struct, SquareChatStatuses.Count), cancellationToken);
          foreach (string _iter328 in SquareChatStatuses.Keys)
          {
            await oprot.WriteStringAsync(_iter328, cancellationToken);
            await SquareChatStatuses[_iter328].WriteAsync(oprot, cancellationToken);
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
    var other = that as GetJoinableSquareChatsResponse;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.squareChats == other.__isset.squareChats) && ((!__isset.squareChats) || (TCollections.Equals(SquareChats, other.SquareChats))))
      && ((__isset.continuationToken == other.__isset.continuationToken) && ((!__isset.continuationToken) || (System.Object.Equals(ContinuationToken, other.ContinuationToken))))
      && ((__isset.totalSquareChatCount == other.__isset.totalSquareChatCount) && ((!__isset.totalSquareChatCount) || (System.Object.Equals(TotalSquareChatCount, other.TotalSquareChatCount))))
      && ((__isset.squareChatStatuses == other.__isset.squareChatStatuses) && ((!__isset.squareChatStatuses) || (TCollections.Equals(SquareChatStatuses, other.SquareChatStatuses))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.squareChats)
        hashcode = (hashcode * 397) + TCollections.GetHashCode(SquareChats);
      if(__isset.continuationToken)
        hashcode = (hashcode * 397) + ContinuationToken.GetHashCode();
      if(__isset.totalSquareChatCount)
        hashcode = (hashcode * 397) + TotalSquareChatCount.GetHashCode();
      if(__isset.squareChatStatuses)
        hashcode = (hashcode * 397) + TCollections.GetHashCode(SquareChatStatuses);
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("GetJoinableSquareChatsResponse(");
    bool __first = true;
    if (SquareChats != null && __isset.squareChats)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareChats: ");
      SquareChats.ToString(sb);
    }
    if (ContinuationToken != null && __isset.continuationToken)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ContinuationToken: ");
      ContinuationToken.ToString(sb);
    }
    if (__isset.totalSquareChatCount)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("TotalSquareChatCount: ");
      TotalSquareChatCount.ToString(sb);
    }
    if (SquareChatStatuses != null && __isset.squareChatStatuses)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareChatStatuses: ");
      SquareChatStatuses.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

