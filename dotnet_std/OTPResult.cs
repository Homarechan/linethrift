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



public partial class OTPResult : TBase
{
  private string _otpId;
  private string _otp;

  public string OtpId
  {
    get
    {
      return _otpId;
    }
    set
    {
      __isset.otpId = true;
      this._otpId = value;
    }
  }

  public string Otp
  {
    get
    {
      return _otp;
    }
    set
    {
      __isset.otp = true;
      this._otp = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool otpId;
    public bool otp;
  }

  public OTPResult()
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
              OtpId = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.String)
            {
              Otp = await iprot.ReadStringAsync(cancellationToken);
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
      var struc = new TStruct("OTPResult");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (OtpId != null && __isset.otpId)
      {
        field.Name = "otpId";
        field.Type = TType.String;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(OtpId, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Otp != null && __isset.otp)
      {
        field.Name = "otp";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Otp, cancellationToken);
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
    var other = that as OTPResult;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.otpId == other.__isset.otpId) && ((!__isset.otpId) || (System.Object.Equals(OtpId, other.OtpId))))
      && ((__isset.otp == other.__isset.otp) && ((!__isset.otp) || (System.Object.Equals(Otp, other.Otp))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.otpId)
        hashcode = (hashcode * 397) + OtpId.GetHashCode();
      if(__isset.otp)
        hashcode = (hashcode * 397) + Otp.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("OTPResult(");
    bool __first = true;
    if (OtpId != null && __isset.otpId)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("OtpId: ");
      OtpId.ToString(sb);
    }
    if (Otp != null && __isset.otp)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Otp: ");
      Otp.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

