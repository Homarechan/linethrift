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



public partial class PointException : TException, TBase
{
  private PointErrorCode _code;
  private string _reason;
  private Dictionary<string, string> _extra;

  /// <summary>
  /// 
  /// <seealso cref="PointErrorCode"/>
  /// </summary>
  public PointErrorCode Code
  {
    get
    {
      return _code;
    }
    set
    {
      __isset.code = true;
      this._code = value;
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

  public Dictionary<string, string> Extra
  {
    get
    {
      return _extra;
    }
    set
    {
      __isset.extra = true;
      this._extra = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool code;
    public bool reason;
    public bool extra;
  }

  public PointException()
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
              Code = (PointErrorCode)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.String)
            {
              Reason = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.Map)
            {
              {
                TMap _map522 = await iprot.ReadMapBeginAsync(cancellationToken);
                Extra = new Dictionary<string, string>(_map522.Count);
                for(int _i523 = 0; _i523 < _map522.Count; ++_i523)
                {
                  string _key524;
                  string _val525;
                  _key524 = await iprot.ReadStringAsync(cancellationToken);
                  _val525 = await iprot.ReadStringAsync(cancellationToken);
                  Extra[_key524] = _val525;
                }
                await iprot.ReadMapEndAsync(cancellationToken);
              }
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
      var struc = new TStruct("PointException");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (__isset.code)
      {
        field.Name = "code";
        field.Type = TType.I32;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)Code, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Reason != null && __isset.reason)
      {
        field.Name = "reason";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Reason, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Extra != null && __isset.extra)
      {
        field.Name = "extra";
        field.Type = TType.Map;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteMapBeginAsync(new TMap(TType.String, TType.String, Extra.Count), cancellationToken);
          foreach (string _iter526 in Extra.Keys)
          {
            await oprot.WriteStringAsync(_iter526, cancellationToken);
            await oprot.WriteStringAsync(Extra[_iter526], cancellationToken);
          }
          await oprot.WriteMapEndAsync(cancellationToken);
        }
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
    var other = that as PointException;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.code == other.__isset.code) && ((!__isset.code) || (System.Object.Equals(Code, other.Code))))
      && ((__isset.reason == other.__isset.reason) && ((!__isset.reason) || (System.Object.Equals(Reason, other.Reason))))
      && ((__isset.extra == other.__isset.extra) && ((!__isset.extra) || (TCollections.Equals(Extra, other.Extra))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.code)
        hashcode = (hashcode * 397) + Code.GetHashCode();
      if(__isset.reason)
        hashcode = (hashcode * 397) + Reason.GetHashCode();
      if(__isset.extra)
        hashcode = (hashcode * 397) + TCollections.GetHashCode(Extra);
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("PointException(");
    bool __first = true;
    if (__isset.code)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Code: ");
      Code.ToString(sb);
    }
    if (Reason != null && __isset.reason)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Reason: ");
      Reason.ToString(sb);
    }
    if (Extra != null && __isset.extra)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Extra: ");
      Extra.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

