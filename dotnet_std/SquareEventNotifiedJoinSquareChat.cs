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



public partial class SquareEventNotifiedJoinSquareChat : TBase
{
  private string _squareChatMid;
  private SquareMember _joinedMember;

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

  public SquareMember JoinedMember
  {
    get
    {
      return _joinedMember;
    }
    set
    {
      __isset.joinedMember = true;
      this._joinedMember = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool squareChatMid;
    public bool joinedMember;
  }

  public SquareEventNotifiedJoinSquareChat()
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
            if (field.Type == TType.Struct)
            {
              JoinedMember = new SquareMember();
              await JoinedMember.ReadAsync(iprot, cancellationToken);
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
      var struc = new TStruct("SquareEventNotifiedJoinSquareChat");
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
      if (JoinedMember != null && __isset.joinedMember)
      {
        field.Name = "joinedMember";
        field.Type = TType.Struct;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await JoinedMember.WriteAsync(oprot, cancellationToken);
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
    var other = that as SquareEventNotifiedJoinSquareChat;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.squareChatMid == other.__isset.squareChatMid) && ((!__isset.squareChatMid) || (System.Object.Equals(SquareChatMid, other.SquareChatMid))))
      && ((__isset.joinedMember == other.__isset.joinedMember) && ((!__isset.joinedMember) || (System.Object.Equals(JoinedMember, other.JoinedMember))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.squareChatMid)
        hashcode = (hashcode * 397) + SquareChatMid.GetHashCode();
      if(__isset.joinedMember)
        hashcode = (hashcode * 397) + JoinedMember.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("SquareEventNotifiedJoinSquareChat(");
    bool __first = true;
    if (SquareChatMid != null && __isset.squareChatMid)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareChatMid: ");
      SquareChatMid.ToString(sb);
    }
    if (JoinedMember != null && __isset.joinedMember)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("JoinedMember: ");
      JoinedMember.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

