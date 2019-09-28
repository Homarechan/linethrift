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



public partial class SquareEventNotifiedInviteIntoSquareChat : TBase
{
  private string _squareChatMid;
  private List<SquareMember> _invitees;
  private SquareMember _invitor;
  private SquareMemberRelation _invitorRelation;

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

  public List<SquareMember> Invitees
  {
    get
    {
      return _invitees;
    }
    set
    {
      __isset.invitees = true;
      this._invitees = value;
    }
  }

  public SquareMember Invitor
  {
    get
    {
      return _invitor;
    }
    set
    {
      __isset.invitor = true;
      this._invitor = value;
    }
  }

  public SquareMemberRelation InvitorRelation
  {
    get
    {
      return _invitorRelation;
    }
    set
    {
      __isset.invitorRelation = true;
      this._invitorRelation = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool squareChatMid;
    public bool invitees;
    public bool invitor;
    public bool invitorRelation;
  }

  public SquareEventNotifiedInviteIntoSquareChat()
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
            if (field.Type == TType.List)
            {
              {
                TList _list337 = await iprot.ReadListBeginAsync(cancellationToken);
                Invitees = new List<SquareMember>(_list337.Count);
                for(int _i338 = 0; _i338 < _list337.Count; ++_i338)
                {
                  SquareMember _elem339;
                  _elem339 = new SquareMember();
                  await _elem339.ReadAsync(iprot, cancellationToken);
                  Invitees.Add(_elem339);
                }
                await iprot.ReadListEndAsync(cancellationToken);
              }
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.Struct)
            {
              Invitor = new SquareMember();
              await Invitor.ReadAsync(iprot, cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.Struct)
            {
              InvitorRelation = new SquareMemberRelation();
              await InvitorRelation.ReadAsync(iprot, cancellationToken);
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
      var struc = new TStruct("SquareEventNotifiedInviteIntoSquareChat");
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
      if (Invitees != null && __isset.invitees)
      {
        field.Name = "invitees";
        field.Type = TType.List;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteListBeginAsync(new TList(TType.Struct, Invitees.Count), cancellationToken);
          foreach (SquareMember _iter340 in Invitees)
          {
            await _iter340.WriteAsync(oprot, cancellationToken);
          }
          await oprot.WriteListEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Invitor != null && __isset.invitor)
      {
        field.Name = "invitor";
        field.Type = TType.Struct;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await Invitor.WriteAsync(oprot, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (InvitorRelation != null && __isset.invitorRelation)
      {
        field.Name = "invitorRelation";
        field.Type = TType.Struct;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await InvitorRelation.WriteAsync(oprot, cancellationToken);
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
    var other = that as SquareEventNotifiedInviteIntoSquareChat;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.squareChatMid == other.__isset.squareChatMid) && ((!__isset.squareChatMid) || (System.Object.Equals(SquareChatMid, other.SquareChatMid))))
      && ((__isset.invitees == other.__isset.invitees) && ((!__isset.invitees) || (TCollections.Equals(Invitees, other.Invitees))))
      && ((__isset.invitor == other.__isset.invitor) && ((!__isset.invitor) || (System.Object.Equals(Invitor, other.Invitor))))
      && ((__isset.invitorRelation == other.__isset.invitorRelation) && ((!__isset.invitorRelation) || (System.Object.Equals(InvitorRelation, other.InvitorRelation))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.squareChatMid)
        hashcode = (hashcode * 397) + SquareChatMid.GetHashCode();
      if(__isset.invitees)
        hashcode = (hashcode * 397) + TCollections.GetHashCode(Invitees);
      if(__isset.invitor)
        hashcode = (hashcode * 397) + Invitor.GetHashCode();
      if(__isset.invitorRelation)
        hashcode = (hashcode * 397) + InvitorRelation.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("SquareEventNotifiedInviteIntoSquareChat(");
    bool __first = true;
    if (SquareChatMid != null && __isset.squareChatMid)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareChatMid: ");
      sb.Append(SquareChatMid);
    }
    if (Invitees != null && __isset.invitees)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Invitees: ");
      sb.Append(Invitees);
    }
    if (Invitor != null && __isset.invitor)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Invitor: ");
      sb.Append(Invitor== null ? "<null>" : Invitor.ToString());
    }
    if (InvitorRelation != null && __isset.invitorRelation)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("InvitorRelation: ");
      sb.Append(InvitorRelation== null ? "<null>" : InvitorRelation.ToString());
    }
    sb.Append(")");
    return sb.ToString();
  }
}
