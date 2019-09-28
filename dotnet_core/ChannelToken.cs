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

using Thrift.Protocols;
using Thrift.Protocols.Entities;
using Thrift.Protocols.Utilities;
using Thrift.Transports;
using Thrift.Transports.Client;
using Thrift.Transports.Server;



public partial class ChannelToken : TBase
{
  private string _token;
  private string _obsToken;
  private long _expiration;
  private string _refreshToken;
  private string _channelAccessToken;

  public string Token
  {
    get
    {
      return _token;
    }
    set
    {
      __isset.token = true;
      this._token = value;
    }
  }

  public string ObsToken
  {
    get
    {
      return _obsToken;
    }
    set
    {
      __isset.obsToken = true;
      this._obsToken = value;
    }
  }

  public long Expiration
  {
    get
    {
      return _expiration;
    }
    set
    {
      __isset.expiration = true;
      this._expiration = value;
    }
  }

  public string RefreshToken
  {
    get
    {
      return _refreshToken;
    }
    set
    {
      __isset.refreshToken = true;
      this._refreshToken = value;
    }
  }

  public string ChannelAccessToken
  {
    get
    {
      return _channelAccessToken;
    }
    set
    {
      __isset.channelAccessToken = true;
      this._channelAccessToken = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool token;
    public bool obsToken;
    public bool expiration;
    public bool refreshToken;
    public bool channelAccessToken;
  }

  public ChannelToken()
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
              Token = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.String)
            {
              ObsToken = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.I64)
            {
              Expiration = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.String)
            {
              RefreshToken = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 5:
            if (field.Type == TType.String)
            {
              ChannelAccessToken = await iprot.ReadStringAsync(cancellationToken);
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
      var struc = new TStruct("ChannelToken");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (Token != null && __isset.token)
      {
        field.Name = "token";
        field.Type = TType.String;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Token, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (ObsToken != null && __isset.obsToken)
      {
        field.Name = "obsToken";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(ObsToken, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.expiration)
      {
        field.Name = "expiration";
        field.Type = TType.I64;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(Expiration, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (RefreshToken != null && __isset.refreshToken)
      {
        field.Name = "refreshToken";
        field.Type = TType.String;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(RefreshToken, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (ChannelAccessToken != null && __isset.channelAccessToken)
      {
        field.Name = "channelAccessToken";
        field.Type = TType.String;
        field.ID = 5;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(ChannelAccessToken, cancellationToken);
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

  public override string ToString()
  {
    var sb = new StringBuilder("ChannelToken(");
    bool __first = true;
    if (Token != null && __isset.token)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Token: ");
      sb.Append(Token);
    }
    if (ObsToken != null && __isset.obsToken)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ObsToken: ");
      sb.Append(ObsToken);
    }
    if (__isset.expiration)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Expiration: ");
      sb.Append(Expiration);
    }
    if (RefreshToken != null && __isset.refreshToken)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("RefreshToken: ");
      sb.Append(RefreshToken);
    }
    if (ChannelAccessToken != null && __isset.channelAccessToken)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ChannelAccessToken: ");
      sb.Append(ChannelAccessToken);
    }
    sb.Append(")");
    return sb.ToString();
  }
}
