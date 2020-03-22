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



public partial class SquareException : TException, TBase
{
  private SQErrorCode _errorCode;
  private ErrorExtraInfo _errorExtraInfo;
  private string _reason;

  /// <summary>
  /// 
  /// <seealso cref="SQErrorCode"/>
  /// </summary>
  public SQErrorCode ErrorCode
  {
    get
    {
      return _errorCode;
    }
    set
    {
      __isset.errorCode = true;
      this._errorCode = value;
    }
  }

  public ErrorExtraInfo ErrorExtraInfo
  {
    get
    {
      return _errorExtraInfo;
    }
    set
    {
      __isset.errorExtraInfo = true;
      this._errorExtraInfo = value;
    }
  }

  public string Reason
  {
    get
    {
      return _reason;
    }
    set
    {
      __isset.reason = true;
      this._reason = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool errorCode;
    public bool errorExtraInfo;
    public bool reason;
  }

  public SquareException()
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
              ErrorCode = (SQErrorCode)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.Struct)
            {
              ErrorExtraInfo = new ErrorExtraInfo();
              await ErrorExtraInfo.ReadAsync(iprot, cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.String)
            {
              Reason = await iprot.ReadStringAsync(cancellationToken);
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
      var struc = new TStruct("SquareException");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (__isset.errorCode)
      {
        field.Name = "errorCode";
        field.Type = TType.I32;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)ErrorCode, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (ErrorExtraInfo != null && __isset.errorExtraInfo)
      {
        field.Name = "errorExtraInfo";
        field.Type = TType.Struct;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await ErrorExtraInfo.WriteAsync(oprot, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Reason != null && __isset.reason)
      {
        field.Name = "reason";
        field.Type = TType.String;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Reason, cancellationToken);
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
    var other = that as SquareException;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.errorCode == other.__isset.errorCode) && ((!__isset.errorCode) || (System.Object.Equals(ErrorCode, other.ErrorCode))))
      && ((__isset.errorExtraInfo == other.__isset.errorExtraInfo) && ((!__isset.errorExtraInfo) || (System.Object.Equals(ErrorExtraInfo, other.ErrorExtraInfo))))
      && ((__isset.reason == other.__isset.reason) && ((!__isset.reason) || (System.Object.Equals(Reason, other.Reason))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.errorCode)
        hashcode = (hashcode * 397) + ErrorCode.GetHashCode();
      if(__isset.errorExtraInfo)
        hashcode = (hashcode * 397) + ErrorExtraInfo.GetHashCode();
      if(__isset.reason)
        hashcode = (hashcode * 397) + Reason.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("SquareException(");
    bool __first = true;
    if (__isset.errorCode)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ErrorCode: ");
      ErrorCode.ToString(sb);
    }
    if (ErrorExtraInfo != null && __isset.errorExtraInfo)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ErrorExtraInfo: ");
      ErrorExtraInfo.ToString(sb);
    }
    if (Reason != null && __isset.reason)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Reason: ");
      Reason.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

