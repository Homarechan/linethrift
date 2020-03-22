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



public partial class ApprovedChannelInfos : TBase
{
  private List<ApprovedChannelInfo> _approvedChannelInfos;
  private long _revision;

  public List<ApprovedChannelInfo> ApprovedChannelInfos_
  {
    get
    {
      return _approvedChannelInfos;
    }
    set
    {
      __isset.approvedChannelInfos = true;
      this._approvedChannelInfos = value;
    }
  }

  public long Revision
  {
    get
    {
      return _revision;
    }
    set
    {
      __isset.revision = true;
      this._revision = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool approvedChannelInfos;
    public bool revision;
  }

  public ApprovedChannelInfos()
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
            if (field.Type == TType.List)
            {
              {
                TList _list52 = await iprot.ReadListBeginAsync(cancellationToken);
                ApprovedChannelInfos_ = new List<ApprovedChannelInfo>(_list52.Count);
                for(int _i53 = 0; _i53 < _list52.Count; ++_i53)
                {
                  ApprovedChannelInfo _elem54;
                  _elem54 = new ApprovedChannelInfo();
                  await _elem54.ReadAsync(iprot, cancellationToken);
                  ApprovedChannelInfos_.Add(_elem54);
                }
                await iprot.ReadListEndAsync(cancellationToken);
              }
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.I64)
            {
              Revision = await iprot.ReadI64Async(cancellationToken);
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
      var struc = new TStruct("ApprovedChannelInfos");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (ApprovedChannelInfos_ != null && __isset.approvedChannelInfos)
      {
        field.Name = "approvedChannelInfos";
        field.Type = TType.List;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteListBeginAsync(new TList(TType.Struct, ApprovedChannelInfos_.Count), cancellationToken);
          foreach (ApprovedChannelInfo _iter55 in ApprovedChannelInfos_)
          {
            await _iter55.WriteAsync(oprot, cancellationToken);
          }
          await oprot.WriteListEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.revision)
      {
        field.Name = "revision";
        field.Type = TType.I64;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(Revision, cancellationToken);
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
    var other = that as ApprovedChannelInfos;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.approvedChannelInfos == other.__isset.approvedChannelInfos) && ((!__isset.approvedChannelInfos) || (TCollections.Equals(ApprovedChannelInfos_, other.ApprovedChannelInfos_))))
      && ((__isset.revision == other.__isset.revision) && ((!__isset.revision) || (System.Object.Equals(Revision, other.Revision))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.approvedChannelInfos)
        hashcode = (hashcode * 397) + TCollections.GetHashCode(ApprovedChannelInfos_);
      if(__isset.revision)
        hashcode = (hashcode * 397) + Revision.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("ApprovedChannelInfos(");
    bool __first = true;
    if (ApprovedChannelInfos_ != null && __isset.approvedChannelInfos)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ApprovedChannelInfos_: ");
      ApprovedChannelInfos_.ToString(sb);
    }
    if (__isset.revision)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Revision: ");
      Revision.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

