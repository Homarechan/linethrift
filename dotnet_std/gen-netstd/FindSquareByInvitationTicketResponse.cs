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



public partial class FindSquareByInvitationTicketResponse : TBase
{
  private Square _square;
  private SquareMember _myMembership;
  private SquareAuthority _squareAuthority;
  private SquareStatus _squareStatus;

  public Square Square
  {
    get
    {
      return _square;
    }
    set
    {
      __isset.square = true;
      this._square = value;
    }
  }

  public SquareMember MyMembership
  {
    get
    {
      return _myMembership;
    }
    set
    {
      __isset.myMembership = true;
      this._myMembership = value;
    }
  }

  public SquareAuthority SquareAuthority
  {
    get
    {
      return _squareAuthority;
    }
    set
    {
      __isset.squareAuthority = true;
      this._squareAuthority = value;
    }
  }

  public SquareStatus SquareStatus
  {
    get
    {
      return _squareStatus;
    }
    set
    {
      __isset.squareStatus = true;
      this._squareStatus = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool square;
    public bool myMembership;
    public bool squareAuthority;
    public bool squareStatus;
  }

  public FindSquareByInvitationTicketResponse()
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
            if (field.Type == TType.Struct)
            {
              Square = new Square();
              await Square.ReadAsync(iprot, cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.Struct)
            {
              MyMembership = new SquareMember();
              await MyMembership.ReadAsync(iprot, cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.Struct)
            {
              SquareAuthority = new SquareAuthority();
              await SquareAuthority.ReadAsync(iprot, cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.Struct)
            {
              SquareStatus = new SquareStatus();
              await SquareStatus.ReadAsync(iprot, cancellationToken);
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
      var struc = new TStruct("FindSquareByInvitationTicketResponse");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (Square != null && __isset.square)
      {
        field.Name = "square";
        field.Type = TType.Struct;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await Square.WriteAsync(oprot, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (MyMembership != null && __isset.myMembership)
      {
        field.Name = "myMembership";
        field.Type = TType.Struct;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await MyMembership.WriteAsync(oprot, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (SquareAuthority != null && __isset.squareAuthority)
      {
        field.Name = "squareAuthority";
        field.Type = TType.Struct;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await SquareAuthority.WriteAsync(oprot, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (SquareStatus != null && __isset.squareStatus)
      {
        field.Name = "squareStatus";
        field.Type = TType.Struct;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await SquareStatus.WriteAsync(oprot, cancellationToken);
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
    var other = that as FindSquareByInvitationTicketResponse;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.square == other.__isset.square) && ((!__isset.square) || (System.Object.Equals(Square, other.Square))))
      && ((__isset.myMembership == other.__isset.myMembership) && ((!__isset.myMembership) || (System.Object.Equals(MyMembership, other.MyMembership))))
      && ((__isset.squareAuthority == other.__isset.squareAuthority) && ((!__isset.squareAuthority) || (System.Object.Equals(SquareAuthority, other.SquareAuthority))))
      && ((__isset.squareStatus == other.__isset.squareStatus) && ((!__isset.squareStatus) || (System.Object.Equals(SquareStatus, other.SquareStatus))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.square)
        hashcode = (hashcode * 397) + Square.GetHashCode();
      if(__isset.myMembership)
        hashcode = (hashcode * 397) + MyMembership.GetHashCode();
      if(__isset.squareAuthority)
        hashcode = (hashcode * 397) + SquareAuthority.GetHashCode();
      if(__isset.squareStatus)
        hashcode = (hashcode * 397) + SquareStatus.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("FindSquareByInvitationTicketResponse(");
    bool __first = true;
    if (Square != null && __isset.square)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Square: ");
      Square.ToString(sb);
    }
    if (MyMembership != null && __isset.myMembership)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("MyMembership: ");
      MyMembership.ToString(sb);
    }
    if (SquareAuthority != null && __isset.squareAuthority)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareAuthority: ");
      SquareAuthority.ToString(sb);
    }
    if (SquareStatus != null && __isset.squareStatus)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareStatus: ");
      SquareStatus.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}
