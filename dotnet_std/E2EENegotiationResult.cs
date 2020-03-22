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



public partial class E2EENegotiationResult : TBase
{
  private THashSet<ContentType> _allowedTypes;
  private E2EEPublicKey _publicKey;

  public THashSet<ContentType> AllowedTypes
  {
    get
    {
      return _allowedTypes;
    }
    set
    {
      __isset.allowedTypes = true;
      this._allowedTypes = value;
    }
  }

  public E2EEPublicKey PublicKey
  {
    get
    {
      return _publicKey;
    }
    set
    {
      __isset.publicKey = true;
      this._publicKey = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool allowedTypes;
    public bool publicKey;
  }

  public E2EENegotiationResult()
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
            if (field.Type == TType.Set)
            {
              {
                TSet _set4 = await iprot.ReadSetBeginAsync(cancellationToken);
                AllowedTypes = new THashSet<ContentType>(_set4.Count);
                for(int _i5 = 0; _i5 < _set4.Count; ++_i5)
                {
                  ContentType _elem6;
                  _elem6 = (ContentType)await iprot.ReadI32Async(cancellationToken);
                  AllowedTypes.Add(_elem6);
                }
                await iprot.ReadSetEndAsync(cancellationToken);
              }
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.Struct)
            {
              PublicKey = new E2EEPublicKey();
              await PublicKey.ReadAsync(iprot, cancellationToken);
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
      var struc = new TStruct("E2EENegotiationResult");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (AllowedTypes != null && __isset.allowedTypes)
      {
        field.Name = "allowedTypes";
        field.Type = TType.Set;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteSetBeginAsync(new TSet(TType.I32, AllowedTypes.Count), cancellationToken);
          foreach (ContentType _iter7 in AllowedTypes)
          {
            await oprot.WriteI32Async((int)_iter7, cancellationToken);
          }
          await oprot.WriteSetEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (PublicKey != null && __isset.publicKey)
      {
        field.Name = "publicKey";
        field.Type = TType.Struct;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await PublicKey.WriteAsync(oprot, cancellationToken);
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
    var other = that as E2EENegotiationResult;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.allowedTypes == other.__isset.allowedTypes) && ((!__isset.allowedTypes) || (TCollections.Equals(AllowedTypes, other.AllowedTypes))))
      && ((__isset.publicKey == other.__isset.publicKey) && ((!__isset.publicKey) || (System.Object.Equals(PublicKey, other.PublicKey))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.allowedTypes)
        hashcode = (hashcode * 397) + TCollections.GetHashCode(AllowedTypes);
      if(__isset.publicKey)
        hashcode = (hashcode * 397) + PublicKey.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("E2EENegotiationResult(");
    bool __first = true;
    if (AllowedTypes != null && __isset.allowedTypes)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("AllowedTypes: ");
      AllowedTypes.ToString(sb);
    }
    if (PublicKey != null && __isset.publicKey)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("PublicKey: ");
      PublicKey.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

