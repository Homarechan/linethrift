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



public partial class GetJoinedSquareChatsResponse : TBase
{
  private List<SquareChat> _chats;
  private Dictionary<string, SquareChatMember> _chatMembers;
  private Dictionary<string, SquareChatStatus> _statuses;
  private string _continuationToken;

  public List<SquareChat> Chats
  {
    get
    {
      return _chats;
    }
    set
    {
      __isset.chats = true;
      this._chats = value;
    }
  }

  public Dictionary<string, SquareChatMember> ChatMembers
  {
    get
    {
      return _chatMembers;
    }
    set
    {
      __isset.chatMembers = true;
      this._chatMembers = value;
    }
  }

  public Dictionary<string, SquareChatStatus> Statuses
  {
    get
    {
      return _statuses;
    }
    set
    {
      __isset.statuses = true;
      this._statuses = value;
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


  public Isset __isset;
  public struct Isset
  {
    public bool chats;
    public bool chatMembers;
    public bool statuses;
    public bool continuationToken;
  }

  public GetJoinedSquareChatsResponse()
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
                TList _list503 = await iprot.ReadListBeginAsync(cancellationToken);
                Chats = new List<SquareChat>(_list503.Count);
                for(int _i504 = 0; _i504 < _list503.Count; ++_i504)
                {
                  SquareChat _elem505;
                  _elem505 = new SquareChat();
                  await _elem505.ReadAsync(iprot, cancellationToken);
                  Chats.Add(_elem505);
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
            if (field.Type == TType.Map)
            {
              {
                TMap _map506 = await iprot.ReadMapBeginAsync(cancellationToken);
                ChatMembers = new Dictionary<string, SquareChatMember>(_map506.Count);
                for(int _i507 = 0; _i507 < _map506.Count; ++_i507)
                {
                  string _key508;
                  SquareChatMember _val509;
                  _key508 = await iprot.ReadStringAsync(cancellationToken);
                  _val509 = new SquareChatMember();
                  await _val509.ReadAsync(iprot, cancellationToken);
                  ChatMembers[_key508] = _val509;
                }
                await iprot.ReadMapEndAsync(cancellationToken);
              }
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.Map)
            {
              {
                TMap _map510 = await iprot.ReadMapBeginAsync(cancellationToken);
                Statuses = new Dictionary<string, SquareChatStatus>(_map510.Count);
                for(int _i511 = 0; _i511 < _map510.Count; ++_i511)
                {
                  string _key512;
                  SquareChatStatus _val513;
                  _key512 = await iprot.ReadStringAsync(cancellationToken);
                  _val513 = new SquareChatStatus();
                  await _val513.ReadAsync(iprot, cancellationToken);
                  Statuses[_key512] = _val513;
                }
                await iprot.ReadMapEndAsync(cancellationToken);
              }
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.String)
            {
              ContinuationToken = await iprot.ReadStringAsync(cancellationToken);
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
      var struc = new TStruct("GetJoinedSquareChatsResponse");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (Chats != null && __isset.chats)
      {
        field.Name = "chats";
        field.Type = TType.List;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteListBeginAsync(new TList(TType.Struct, Chats.Count), cancellationToken);
          foreach (SquareChat _iter514 in Chats)
          {
            await _iter514.WriteAsync(oprot, cancellationToken);
          }
          await oprot.WriteListEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (ChatMembers != null && __isset.chatMembers)
      {
        field.Name = "chatMembers";
        field.Type = TType.Map;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteMapBeginAsync(new TMap(TType.String, TType.Struct, ChatMembers.Count), cancellationToken);
          foreach (string _iter515 in ChatMembers.Keys)
          {
            await oprot.WriteStringAsync(_iter515, cancellationToken);
            await ChatMembers[_iter515].WriteAsync(oprot, cancellationToken);
          }
          await oprot.WriteMapEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Statuses != null && __isset.statuses)
      {
        field.Name = "statuses";
        field.Type = TType.Map;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteMapBeginAsync(new TMap(TType.String, TType.Struct, Statuses.Count), cancellationToken);
          foreach (string _iter516 in Statuses.Keys)
          {
            await oprot.WriteStringAsync(_iter516, cancellationToken);
            await Statuses[_iter516].WriteAsync(oprot, cancellationToken);
          }
          await oprot.WriteMapEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (ContinuationToken != null && __isset.continuationToken)
      {
        field.Name = "continuationToken";
        field.Type = TType.String;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(ContinuationToken, cancellationToken);
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
    var other = that as GetJoinedSquareChatsResponse;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.chats == other.__isset.chats) && ((!__isset.chats) || (TCollections.Equals(Chats, other.Chats))))
      && ((__isset.chatMembers == other.__isset.chatMembers) && ((!__isset.chatMembers) || (TCollections.Equals(ChatMembers, other.ChatMembers))))
      && ((__isset.statuses == other.__isset.statuses) && ((!__isset.statuses) || (TCollections.Equals(Statuses, other.Statuses))))
      && ((__isset.continuationToken == other.__isset.continuationToken) && ((!__isset.continuationToken) || (System.Object.Equals(ContinuationToken, other.ContinuationToken))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.chats)
        hashcode = (hashcode * 397) + TCollections.GetHashCode(Chats);
      if(__isset.chatMembers)
        hashcode = (hashcode * 397) + TCollections.GetHashCode(ChatMembers);
      if(__isset.statuses)
        hashcode = (hashcode * 397) + TCollections.GetHashCode(Statuses);
      if(__isset.continuationToken)
        hashcode = (hashcode * 397) + ContinuationToken.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("GetJoinedSquareChatsResponse(");
    bool __first = true;
    if (Chats != null && __isset.chats)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Chats: ");
      Chats.ToString(sb);
    }
    if (ChatMembers != null && __isset.chatMembers)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ChatMembers: ");
      ChatMembers.ToString(sb);
    }
    if (Statuses != null && __isset.statuses)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Statuses: ");
      Statuses.ToString(sb);
    }
    if (ContinuationToken != null && __isset.continuationToken)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ContinuationToken: ");
      ContinuationToken.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

