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



public partial class SquareEventNotifiedUpdateSquare : TBase
{
  private string _squareMid;
  private Square _square;

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


  public Isset __isset;
  public struct Isset
  {
    public bool squareMid;
    public bool square;
  }

  public SquareEventNotifiedUpdateSquare()
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
              SquareMid = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
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
      var struc = new TStruct("SquareEventNotifiedUpdateSquare");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (SquareMid != null && __isset.squareMid)
      {
        field.Name = "squareMid";
        field.Type = TType.String;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(SquareMid, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Square != null && __isset.square)
      {
        field.Name = "square";
        field.Type = TType.Struct;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await Square.WriteAsync(oprot, cancellationToken);
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
    var other = that as SquareEventNotifiedUpdateSquare;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.squareMid == other.__isset.squareMid) && ((!__isset.squareMid) || (System.Object.Equals(SquareMid, other.SquareMid))))
      && ((__isset.square == other.__isset.square) && ((!__isset.square) || (System.Object.Equals(Square, other.Square))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.squareMid)
        hashcode = (hashcode * 397) + SquareMid.GetHashCode();
      if(__isset.square)
        hashcode = (hashcode * 397) + Square.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("SquareEventNotifiedUpdateSquare(");
    bool __first = true;
    if (SquareMid != null && __isset.squareMid)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareMid: ");
      SquareMid.ToString(sb);
    }
    if (Square != null && __isset.square)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Square: ");
      Square.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

