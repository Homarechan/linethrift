/**
 * Autogenerated by Thrift Compiler (0.13.0)
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



public partial class SquareEventNotifiedCreateSquareChatMember : TBase
{
  private string _squareChatMid;
  private string _squareMemberMid;
  private SquareChatMember _squareChatMember;

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

  public string SquareMemberMid
  {
    get
    {
      return _squareMemberMid;
    }
    set
    {
      __isset.squareMemberMid = true;
      this._squareMemberMid = value;
    }
  }

  public SquareChatMember SquareChatMember
  {
    get
    {
      return _squareChatMember;
    }
    set
    {
      __isset.squareChatMember = true;
      this._squareChatMember = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool squareChatMid;
    public bool squareMemberMid;
    public bool squareChatMember;
  }

  public SquareEventNotifiedCreateSquareChatMember()
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
              SquareMemberMid = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.Struct)
            {
              SquareChatMember = new SquareChatMember();
              await SquareChatMember.ReadAsync(iprot, cancellationToken);
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
      var struc = new TStruct("SquareEventNotifiedCreateSquareChatMember");
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
      if (SquareMemberMid != null && __isset.squareMemberMid)
      {
        field.Name = "squareMemberMid";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(SquareMemberMid, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (SquareChatMember != null && __isset.squareChatMember)
      {
        field.Name = "squareChatMember";
        field.Type = TType.Struct;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await SquareChatMember.WriteAsync(oprot, cancellationToken);
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
    var other = that as SquareEventNotifiedCreateSquareChatMember;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.squareChatMid == other.__isset.squareChatMid) && ((!__isset.squareChatMid) || (System.Object.Equals(SquareChatMid, other.SquareChatMid))))
      && ((__isset.squareMemberMid == other.__isset.squareMemberMid) && ((!__isset.squareMemberMid) || (System.Object.Equals(SquareMemberMid, other.SquareMemberMid))))
      && ((__isset.squareChatMember == other.__isset.squareChatMember) && ((!__isset.squareChatMember) || (System.Object.Equals(SquareChatMember, other.SquareChatMember))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.squareChatMid)
        hashcode = (hashcode * 397) + SquareChatMid.GetHashCode();
      if(__isset.squareMemberMid)
        hashcode = (hashcode * 397) + SquareMemberMid.GetHashCode();
      if(__isset.squareChatMember)
        hashcode = (hashcode * 397) + SquareChatMember.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("SquareEventNotifiedCreateSquareChatMember(");
    bool __first = true;
    if (SquareChatMid != null && __isset.squareChatMid)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareChatMid: ");
      sb.Append(SquareChatMid);
    }
    if (SquareMemberMid != null && __isset.squareMemberMid)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareMemberMid: ");
      sb.Append(SquareMemberMid);
    }
    if (SquareChatMember != null && __isset.squareChatMember)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareChatMember: ");
      sb.Append(SquareChatMember== null ? "<null>" : SquareChatMember.ToString());
    }
    sb.Append(")");
    return sb.ToString();
  }
}
