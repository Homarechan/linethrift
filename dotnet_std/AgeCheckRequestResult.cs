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



public partial class AgeCheckRequestResult : TBase
{
  private string _authUrl;
  private string _sessionId;

  public string AuthUrl
  {
    get
    {
      return _authUrl;
    }
    set
    {
      __isset.authUrl = true;
      this._authUrl = value;
    }
  }

  public string SessionId
  {
    get
    {
      return _sessionId;
    }
    set
    {
      __isset.sessionId = true;
      this._sessionId = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool authUrl;
    public bool sessionId;
  }

  public AgeCheckRequestResult()
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
              AuthUrl = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.String)
            {
              SessionId = await iprot.ReadStringAsync(cancellationToken);
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
      var struc = new TStruct("AgeCheckRequestResult");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (AuthUrl != null && __isset.authUrl)
      {
        field.Name = "authUrl";
        field.Type = TType.String;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(AuthUrl, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (SessionId != null && __isset.sessionId)
      {
        field.Name = "sessionId";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(SessionId, cancellationToken);
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
    var other = that as AgeCheckRequestResult;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.authUrl == other.__isset.authUrl) && ((!__isset.authUrl) || (System.Object.Equals(AuthUrl, other.AuthUrl))))
      && ((__isset.sessionId == other.__isset.sessionId) && ((!__isset.sessionId) || (System.Object.Equals(SessionId, other.SessionId))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.authUrl)
        hashcode = (hashcode * 397) + AuthUrl.GetHashCode();
      if(__isset.sessionId)
        hashcode = (hashcode * 397) + SessionId.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("AgeCheckRequestResult(");
    bool __first = true;
    if (AuthUrl != null && __isset.authUrl)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("AuthUrl: ");
      AuthUrl.ToString(sb);
    }
    if (SessionId != null && __isset.sessionId)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SessionId: ");
      SessionId.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

