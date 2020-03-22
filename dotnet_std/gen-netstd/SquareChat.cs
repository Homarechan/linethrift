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



public partial class SquareChat : TBase
{
  private string _squareChatMid;
  private string _squareMid;
  private SquareChatType _type;
  private string _name;
  private string _chatImageObsHash;
  private long _squareChatRevision;
  private int _maxMemberCount;
  private SquareChatState _state;

  public string SquareChatMid
  {
    get
    {
      return _squareChatMid;
    }
    set
    {
      __isset.squareChatMid = true;
      this._squareChatMid = value;
    }
  }

  public string SquareMid
  {
    get
    {
      return _squareMid;
    }
    set
    {
      __isset.squareMid = true;
      this._squareMid = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="SquareChatType"/>
  /// </summary>
  public SquareChatType Type
  {
    get
    {
      return _type;
    }
    set
    {
      __isset.type = true;
      this._type = value;
    }
  }

  public string Name
  {
    get
    {
      return _name;
    }
    set
    {
      __isset.name = true;
      this._name = value;
    }
  }

  public string ChatImageObsHash
  {
    get
    {
      return _chatImageObsHash;
    }
    set
    {
      __isset.chatImageObsHash = true;
      this._chatImageObsHash = value;
    }
  }

  public long SquareChatRevision
  {
    get
    {
      return _squareChatRevision;
    }
    set
    {
      __isset.squareChatRevision = true;
      this._squareChatRevision = value;
    }
  }

  public int MaxMemberCount
  {
    get
    {
      return _maxMemberCount;
    }
    set
    {
      __isset.maxMemberCount = true;
      this._maxMemberCount = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="SquareChatState"/>
  /// </summary>
  public SquareChatState State
  {
    get
    {
      return _state;
    }
    set
    {
      __isset.state = true;
      this._state = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool squareChatMid;
    public bool squareMid;
    public bool type;
    public bool name;
    public bool chatImageObsHash;
    public bool squareChatRevision;
    public bool maxMemberCount;
    public bool state;
  }

  public SquareChat()
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
              SquareChatMid = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.String)
            {
              SquareMid = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.I32)
            {
              Type = (SquareChatType)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.String)
            {
              Name = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 5:
            if (field.Type == TType.String)
            {
              ChatImageObsHash = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 6:
            if (field.Type == TType.I64)
            {
              SquareChatRevision = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 7:
            if (field.Type == TType.I32)
            {
              MaxMemberCount = await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 8:
            if (field.Type == TType.I32)
            {
              State = (SquareChatState)await iprot.ReadI32Async(cancellationToken);
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
      var struc = new TStruct("SquareChat");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (SquareChatMid != null && __isset.squareChatMid)
      {
        field.Name = "squareChatMid";
        field.Type = TType.String;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(SquareChatMid, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (SquareMid != null && __isset.squareMid)
      {
        field.Name = "squareMid";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(SquareMid, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.type)
      {
        field.Name = "type";
        field.Type = TType.I32;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)Type, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Name != null && __isset.name)
      {
        field.Name = "name";
        field.Type = TType.String;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Name, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (ChatImageObsHash != null && __isset.chatImageObsHash)
      {
        field.Name = "chatImageObsHash";
        field.Type = TType.String;
        field.ID = 5;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(ChatImageObsHash, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.squareChatRevision)
      {
        field.Name = "squareChatRevision";
        field.Type = TType.I64;
        field.ID = 6;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(SquareChatRevision, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.maxMemberCount)
      {
        field.Name = "maxMemberCount";
        field.Type = TType.I32;
        field.ID = 7;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(MaxMemberCount, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.state)
      {
        field.Name = "state";
        field.Type = TType.I32;
        field.ID = 8;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)State, cancellationToken);
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
    var other = that as SquareChat;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.squareChatMid == other.__isset.squareChatMid) && ((!__isset.squareChatMid) || (System.Object.Equals(SquareChatMid, other.SquareChatMid))))
      && ((__isset.squareMid == other.__isset.squareMid) && ((!__isset.squareMid) || (System.Object.Equals(SquareMid, other.SquareMid))))
      && ((__isset.type == other.__isset.type) && ((!__isset.type) || (System.Object.Equals(Type, other.Type))))
      && ((__isset.name == other.__isset.name) && ((!__isset.name) || (System.Object.Equals(Name, other.Name))))
      && ((__isset.chatImageObsHash == other.__isset.chatImageObsHash) && ((!__isset.chatImageObsHash) || (System.Object.Equals(ChatImageObsHash, other.ChatImageObsHash))))
      && ((__isset.squareChatRevision == other.__isset.squareChatRevision) && ((!__isset.squareChatRevision) || (System.Object.Equals(SquareChatRevision, other.SquareChatRevision))))
      && ((__isset.maxMemberCount == other.__isset.maxMemberCount) && ((!__isset.maxMemberCount) || (System.Object.Equals(MaxMemberCount, other.MaxMemberCount))))
      && ((__isset.state == other.__isset.state) && ((!__isset.state) || (System.Object.Equals(State, other.State))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.squareChatMid)
        hashcode = (hashcode * 397) + SquareChatMid.GetHashCode();
      if(__isset.squareMid)
        hashcode = (hashcode * 397) + SquareMid.GetHashCode();
      if(__isset.type)
        hashcode = (hashcode * 397) + Type.GetHashCode();
      if(__isset.name)
        hashcode = (hashcode * 397) + Name.GetHashCode();
      if(__isset.chatImageObsHash)
        hashcode = (hashcode * 397) + ChatImageObsHash.GetHashCode();
      if(__isset.squareChatRevision)
        hashcode = (hashcode * 397) + SquareChatRevision.GetHashCode();
      if(__isset.maxMemberCount)
        hashcode = (hashcode * 397) + MaxMemberCount.GetHashCode();
      if(__isset.state)
        hashcode = (hashcode * 397) + State.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("SquareChat(");
    bool __first = true;
    if (SquareChatMid != null && __isset.squareChatMid)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareChatMid: ");
      SquareChatMid.ToString(sb);
    }
    if (SquareMid != null && __isset.squareMid)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareMid: ");
      SquareMid.ToString(sb);
    }
    if (__isset.type)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Type: ");
      Type.ToString(sb);
    }
    if (Name != null && __isset.name)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Name: ");
      Name.ToString(sb);
    }
    if (ChatImageObsHash != null && __isset.chatImageObsHash)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ChatImageObsHash: ");
      ChatImageObsHash.ToString(sb);
    }
    if (__isset.squareChatRevision)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareChatRevision: ");
      SquareChatRevision.ToString(sb);
    }
    if (__isset.maxMemberCount)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("MaxMemberCount: ");
      MaxMemberCount.ToString(sb);
    }
    if (__isset.state)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("State: ");
      State.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}
