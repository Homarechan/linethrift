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



public partial class UpdateSquareMemberRequest : TBase
{
  private THashSet<SquareMemberAttribute> _updatedAttrs;
  private THashSet<SquarePreferenceAttribute> _updatedPreferenceAttrs;
  private SquareMember _squareMember;

  public THashSet<SquareMemberAttribute> UpdatedAttrs
  {
    get
    {
      return _updatedAttrs;
    }
    set
    {
      __isset.updatedAttrs = true;
      this._updatedAttrs = value;
    }
  }

  public THashSet<SquarePreferenceAttribute> UpdatedPreferenceAttrs
  {
    get
    {
      return _updatedPreferenceAttrs;
    }
    set
    {
      __isset.updatedPreferenceAttrs = true;
      this._updatedPreferenceAttrs = value;
    }
  }

  public SquareMember SquareMember
  {
    get
    {
      return _squareMember;
    }
    set
    {
      __isset.squareMember = true;
      this._squareMember = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool updatedAttrs;
    public bool updatedPreferenceAttrs;
    public bool squareMember;
  }

  public UpdateSquareMemberRequest()
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
            if (field.Type == TType.Set)
            {
              {
                TSet _set417 = await iprot.ReadSetBeginAsync(cancellationToken);
                UpdatedAttrs = new THashSet<SquareMemberAttribute>(_set417.Count);
                for(int _i418 = 0; _i418 < _set417.Count; ++_i418)
                {
                  SquareMemberAttribute _elem419;
                  _elem419 = (SquareMemberAttribute)await iprot.ReadI32Async(cancellationToken);
                  UpdatedAttrs.Add(_elem419);
                }
                await iprot.ReadSetEndAsync(cancellationToken);
              }
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.Set)
            {
              {
                TSet _set420 = await iprot.ReadSetBeginAsync(cancellationToken);
                UpdatedPreferenceAttrs = new THashSet<SquarePreferenceAttribute>(_set420.Count);
                for(int _i421 = 0; _i421 < _set420.Count; ++_i421)
                {
                  SquarePreferenceAttribute _elem422;
                  _elem422 = (SquarePreferenceAttribute)await iprot.ReadI32Async(cancellationToken);
                  UpdatedPreferenceAttrs.Add(_elem422);
                }
                await iprot.ReadSetEndAsync(cancellationToken);
              }
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.Struct)
            {
              SquareMember = new SquareMember();
              await SquareMember.ReadAsync(iprot, cancellationToken);
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
      var struc = new TStruct("UpdateSquareMemberRequest");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (UpdatedAttrs != null && __isset.updatedAttrs)
      {
        field.Name = "updatedAttrs";
        field.Type = TType.Set;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteSetBeginAsync(new TSet(TType.I32, UpdatedAttrs.Count), cancellationToken);
          foreach (SquareMemberAttribute _iter423 in UpdatedAttrs)
          {
            await oprot.WriteI32Async((int)_iter423, cancellationToken);
          }
          await oprot.WriteSetEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (UpdatedPreferenceAttrs != null && __isset.updatedPreferenceAttrs)
      {
        field.Name = "updatedPreferenceAttrs";
        field.Type = TType.Set;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteSetBeginAsync(new TSet(TType.I32, UpdatedPreferenceAttrs.Count), cancellationToken);
          foreach (SquarePreferenceAttribute _iter424 in UpdatedPreferenceAttrs)
          {
            await oprot.WriteI32Async((int)_iter424, cancellationToken);
          }
          await oprot.WriteSetEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (SquareMember != null && __isset.squareMember)
      {
        field.Name = "squareMember";
        field.Type = TType.Struct;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await SquareMember.WriteAsync(oprot, cancellationToken);
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
    var other = that as UpdateSquareMemberRequest;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.updatedAttrs == other.__isset.updatedAttrs) && ((!__isset.updatedAttrs) || (TCollections.Equals(UpdatedAttrs, other.UpdatedAttrs))))
      && ((__isset.updatedPreferenceAttrs == other.__isset.updatedPreferenceAttrs) && ((!__isset.updatedPreferenceAttrs) || (TCollections.Equals(UpdatedPreferenceAttrs, other.UpdatedPreferenceAttrs))))
      && ((__isset.squareMember == other.__isset.squareMember) && ((!__isset.squareMember) || (System.Object.Equals(SquareMember, other.SquareMember))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.updatedAttrs)
        hashcode = (hashcode * 397) + TCollections.GetHashCode(UpdatedAttrs);
      if(__isset.updatedPreferenceAttrs)
        hashcode = (hashcode * 397) + TCollections.GetHashCode(UpdatedPreferenceAttrs);
      if(__isset.squareMember)
        hashcode = (hashcode * 397) + SquareMember.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("UpdateSquareMemberRequest(");
    bool __first = true;
    if (UpdatedAttrs != null && __isset.updatedAttrs)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("UpdatedAttrs: ");
      UpdatedAttrs.ToString(sb);
    }
    if (UpdatedPreferenceAttrs != null && __isset.updatedPreferenceAttrs)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("UpdatedPreferenceAttrs: ");
      UpdatedPreferenceAttrs.ToString(sb);
    }
    if (SquareMember != null && __isset.squareMember)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareMember: ");
      SquareMember.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

