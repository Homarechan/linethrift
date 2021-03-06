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



public partial class SquareChatStatusWithoutMessage : TBase
{
  private int _memberCount;
  private int _unreadMessageCount;

  public int MemberCount
  {
    get
    {
      return _memberCount;
    }
    set
    {
      __isset.memberCount = true;
      this._memberCount = value;
    }
  }

  public int UnreadMessageCount
  {
    get
    {
      return _unreadMessageCount;
    }
    set
    {
      __isset.unreadMessageCount = true;
      this._unreadMessageCount = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool memberCount;
    public bool unreadMessageCount;
  }

  public SquareChatStatusWithoutMessage()
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
              MemberCount = await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.I32)
            {
              UnreadMessageCount = await iprot.ReadI32Async(cancellationToken);
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
      var struc = new TStruct("SquareChatStatusWithoutMessage");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (__isset.memberCount)
      {
        field.Name = "memberCount";
        field.Type = TType.I32;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(MemberCount, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.unreadMessageCount)
      {
        field.Name = "unreadMessageCount";
        field.Type = TType.I32;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(UnreadMessageCount, cancellationToken);
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
    var other = that as SquareChatStatusWithoutMessage;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.memberCount == other.__isset.memberCount) && ((!__isset.memberCount) || (System.Object.Equals(MemberCount, other.MemberCount))))
      && ((__isset.unreadMessageCount == other.__isset.unreadMessageCount) && ((!__isset.unreadMessageCount) || (System.Object.Equals(UnreadMessageCount, other.UnreadMessageCount))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.memberCount)
        hashcode = (hashcode * 397) + MemberCount.GetHashCode();
      if(__isset.unreadMessageCount)
        hashcode = (hashcode * 397) + UnreadMessageCount.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("SquareChatStatusWithoutMessage(");
    bool __first = true;
    if (__isset.memberCount)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("MemberCount: ");
      MemberCount.ToString(sb);
    }
    if (__isset.unreadMessageCount)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("UnreadMessageCount: ");
      UnreadMessageCount.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

