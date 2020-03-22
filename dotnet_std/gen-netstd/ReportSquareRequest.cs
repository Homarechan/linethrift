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



public partial class ReportSquareRequest : TBase
{
  private string _squareMid;
  private ReportType _reportType;
  private string _otherReason;

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
  /// <seealso cref="ReportType"/>
  /// </summary>
  public ReportType ReportType
  {
    get
    {
      return _reportType;
    }
    set
    {
      __isset.reportType = true;
      this._reportType = value;
    }
  }

  public string OtherReason
  {
    get
    {
      return _otherReason;
    }
    set
    {
      __isset.otherReason = true;
      this._otherReason = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool squareMid;
    public bool reportType;
    public bool otherReason;
  }

  public ReportSquareRequest()
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
              ReportType = (ReportType)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.String)
            {
              OtherReason = await iprot.ReadStringAsync(cancellationToken);
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
      var struc = new TStruct("ReportSquareRequest");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (SquareMid != null && __isset.squareMid)
      {
        field.Name = "squareMid";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(SquareMid, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.reportType)
      {
        field.Name = "reportType";
        field.Type = TType.I32;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)ReportType, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (OtherReason != null && __isset.otherReason)
      {
        field.Name = "otherReason";
        field.Type = TType.String;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(OtherReason, cancellationToken);
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
    var other = that as ReportSquareRequest;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.squareMid == other.__isset.squareMid) && ((!__isset.squareMid) || (System.Object.Equals(SquareMid, other.SquareMid))))
      && ((__isset.reportType == other.__isset.reportType) && ((!__isset.reportType) || (System.Object.Equals(ReportType, other.ReportType))))
      && ((__isset.otherReason == other.__isset.otherReason) && ((!__isset.otherReason) || (System.Object.Equals(OtherReason, other.OtherReason))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.squareMid)
        hashcode = (hashcode * 397) + SquareMid.GetHashCode();
      if(__isset.reportType)
        hashcode = (hashcode * 397) + ReportType.GetHashCode();
      if(__isset.otherReason)
        hashcode = (hashcode * 397) + OtherReason.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("ReportSquareRequest(");
    bool __first = true;
    if (SquareMid != null && __isset.squareMid)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareMid: ");
      SquareMid.ToString(sb);
    }
    if (__isset.reportType)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ReportType: ");
      ReportType.ToString(sb);
    }
    if (OtherReason != null && __isset.otherReason)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("OtherReason: ");
      OtherReason.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

