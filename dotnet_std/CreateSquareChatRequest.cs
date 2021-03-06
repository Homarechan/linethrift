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



public partial class CreateSquareChatRequest : TBase
{
  private int _reqSeq;
  private SquareChat _squareChat;
  private List<string> _squareMemberMids;

  public int ReqSeq
  {
    get
    {
      return _reqSeq;
    }
    set
    {
      __isset.reqSeq = true;
      this._reqSeq = value;
    }
  }

  public SquareChat SquareChat
  {
    get
    {
      return _squareChat;
    }
    set
    {
      __isset.squareChat = true;
      this._squareChat = value;
    }
  }

  public List<string> SquareMemberMids
  {
    get
    {
      return _squareMemberMids;
    }
    set
    {
      __isset.squareMemberMids = true;
      this._squareMemberMids = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool reqSeq;
    public bool squareChat;
    public bool squareMemberMids;
  }

  public CreateSquareChatRequest()
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
            if (field.Type == TType.I32)
            {
              ReqSeq = await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.Struct)
            {
              SquareChat = new SquareChat();
              await SquareChat.ReadAsync(iprot, cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.List)
            {
              {
                TList _list292 = await iprot.ReadListBeginAsync(cancellationToken);
                SquareMemberMids = new List<string>(_list292.Count);
                for(int _i293 = 0; _i293 < _list292.Count; ++_i293)
                {
                  string _elem294;
                  _elem294 = await iprot.ReadStringAsync(cancellationToken);
                  SquareMemberMids.Add(_elem294);
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
      var struc = new TStruct("CreateSquareChatRequest");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (__isset.reqSeq)
      {
        field.Name = "reqSeq";
        field.Type = TType.I32;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(ReqSeq, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (SquareChat != null && __isset.squareChat)
      {
        field.Name = "squareChat";
        field.Type = TType.Struct;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await SquareChat.WriteAsync(oprot, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (SquareMemberMids != null && __isset.squareMemberMids)
      {
        field.Name = "squareMemberMids";
        field.Type = TType.List;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteListBeginAsync(new TList(TType.String, SquareMemberMids.Count), cancellationToken);
          foreach (string _iter295 in SquareMemberMids)
          {
            await oprot.WriteStringAsync(_iter295, cancellationToken);
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
    var other = that as CreateSquareChatRequest;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.reqSeq == other.__isset.reqSeq) && ((!__isset.reqSeq) || (System.Object.Equals(ReqSeq, other.ReqSeq))))
      && ((__isset.squareChat == other.__isset.squareChat) && ((!__isset.squareChat) || (System.Object.Equals(SquareChat, other.SquareChat))))
      && ((__isset.squareMemberMids == other.__isset.squareMemberMids) && ((!__isset.squareMemberMids) || (TCollections.Equals(SquareMemberMids, other.SquareMemberMids))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.reqSeq)
        hashcode = (hashcode * 397) + ReqSeq.GetHashCode();
      if(__isset.squareChat)
        hashcode = (hashcode * 397) + SquareChat.GetHashCode();
      if(__isset.squareMemberMids)
        hashcode = (hashcode * 397) + TCollections.GetHashCode(SquareMemberMids);
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("CreateSquareChatRequest(");
    bool __first = true;
    if (__isset.reqSeq)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ReqSeq: ");
      ReqSeq.ToString(sb);
    }
    if (SquareChat != null && __isset.squareChat)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareChat: ");
      SquareChat.ToString(sb);
    }
    if (SquareMemberMids != null && __isset.squareMemberMids)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareMemberMids: ");
      SquareMemberMids.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

