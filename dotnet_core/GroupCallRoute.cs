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



public partial class GroupCallRoute : TBase
{
  private string _token;
  private CallHost _cscf;
  private CallHost _mix;

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

  public CallHost Cscf
  {
    get
    {
      return _cscf;
    }
    set
    {
      __isset.cscf = true;
      this._cscf = value;
    }
  }

  public CallHost Mix
  {
    get
    {
      return _mix;
    }
    set
    {
      __isset.mix = true;
      this._mix = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool token;
    public bool cscf;
    public bool mix;
  }

  public GroupCallRoute()
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
            if (field.Type == TType.Struct)
            {
              Cscf = new CallHost();
              await Cscf.ReadAsync(iprot, cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.Struct)
            {
              Mix = new CallHost();
              await Mix.ReadAsync(iprot, cancellationToken);
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
      var struc = new TStruct("GroupCallRoute");
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
      if (Cscf != null && __isset.cscf)
      {
        field.Name = "cscf";
        field.Type = TType.Struct;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await Cscf.WriteAsync(oprot, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Mix != null && __isset.mix)
      {
        field.Name = "mix";
        field.Type = TType.Struct;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await Mix.WriteAsync(oprot, cancellationToken);
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
    var sb = new StringBuilder("GroupCallRoute(");
    bool __first = true;
    if (Token != null && __isset.token)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Token: ");
      sb.Append(Token);
    }
    if (Cscf != null && __isset.cscf)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Cscf: ");
      sb.Append(Cscf== null ? "<null>" : Cscf.ToString());
    }
    if (Mix != null && __isset.mix)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Mix: ");
      sb.Append(Mix== null ? "<null>" : Mix.ToString());
    }
    sb.Append(")");
    return sb.ToString();
  }
}
