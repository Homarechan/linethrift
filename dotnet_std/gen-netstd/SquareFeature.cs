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



public partial class SquareFeature : TBase
{
  private SquareFeatureControlState _controlState;
  private BooleanState _booleanValue;

  /// <summary>
  /// 
  /// <seealso cref="SquareFeatureControlState"/>
  /// </summary>
  public SquareFeatureControlState ControlState
  {
    get
    {
      return _controlState;
    }
    set
    {
      __isset.controlState = true;
      this._controlState = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="BooleanState"/>
  /// </summary>
  public BooleanState BooleanValue
  {
    get
    {
      return _booleanValue;
    }
    set
    {
      __isset.booleanValue = true;
      this._booleanValue = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool controlState;
    public bool booleanValue;
  }

  public SquareFeature()
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
              ControlState = (SquareFeatureControlState)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.I32)
            {
              BooleanValue = (BooleanState)await iprot.ReadI32Async(cancellationToken);
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
      var struc = new TStruct("SquareFeature");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (__isset.controlState)
      {
        field.Name = "controlState";
        field.Type = TType.I32;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)ControlState, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.booleanValue)
      {
        field.Name = "booleanValue";
        field.Type = TType.I32;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)BooleanValue, cancellationToken);
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
    var other = that as SquareFeature;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.controlState == other.__isset.controlState) && ((!__isset.controlState) || (System.Object.Equals(ControlState, other.ControlState))))
      && ((__isset.booleanValue == other.__isset.booleanValue) && ((!__isset.booleanValue) || (System.Object.Equals(BooleanValue, other.BooleanValue))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.controlState)
        hashcode = (hashcode * 397) + ControlState.GetHashCode();
      if(__isset.booleanValue)
        hashcode = (hashcode * 397) + BooleanValue.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("SquareFeature(");
    bool __first = true;
    if (__isset.controlState)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ControlState: ");
      ControlState.ToString(sb);
    }
    if (__isset.booleanValue)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("BooleanValue: ");
      BooleanValue.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

