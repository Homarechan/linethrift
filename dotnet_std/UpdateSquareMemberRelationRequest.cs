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

using Thrift.Protocol;
using Thrift.Protocol.Entities;
using Thrift.Protocol.Utilities;
using Thrift.Transport;
using Thrift.Transport.Client;
using Thrift.Transport.Server;
using Thrift.Processor;



public partial class UpdateSquareMemberRelationRequest : TBase
{
  private string _squareMid;
  private string _targetSquareMemberMid;
  private THashSet<SquareMemberRelationAttribute> _updatedAttrs;
  private SquareMemberRelation _relation;

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

  public string TargetSquareMemberMid
  {
    get
    {
      return _targetSquareMemberMid;
    }
    set
    {
      __isset.targetSquareMemberMid = true;
      this._targetSquareMemberMid = value;
    }
  }

  public THashSet<SquareMemberRelationAttribute> UpdatedAttrs
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

  public SquareMemberRelation Relation
  {
    get
    {
      return _relation;
    }
    set
    {
      __isset.relation = true;
      this._relation = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool squareMid;
    public bool targetSquareMemberMid;
    public bool updatedAttrs;
    public bool relation;
  }

  public UpdateSquareMemberRelationRequest()
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
            if (field.Type == TType.String)
            {
              TargetSquareMemberMid = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.Set)
            {
              {
                TSet _set491 = await iprot.ReadSetBeginAsync(cancellationToken);
                UpdatedAttrs = new THashSet<SquareMemberRelationAttribute>(_set491.Count);
                for(int _i492 = 0; _i492 < _set491.Count; ++_i492)
                {
                  SquareMemberRelationAttribute _elem493;
                  _elem493 = (SquareMemberRelationAttribute)await iprot.ReadI32Async(cancellationToken);
                  UpdatedAttrs.Add(_elem493);
                }
                await iprot.ReadSetEndAsync(cancellationToken);
              }
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 5:
            if (field.Type == TType.Struct)
            {
              Relation = new SquareMemberRelation();
              await Relation.ReadAsync(iprot, cancellationToken);
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
      var struc = new TStruct("UpdateSquareMemberRelationRequest");
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
      if (TargetSquareMemberMid != null && __isset.targetSquareMemberMid)
      {
        field.Name = "targetSquareMemberMid";
        field.Type = TType.String;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(TargetSquareMemberMid, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (UpdatedAttrs != null && __isset.updatedAttrs)
      {
        field.Name = "updatedAttrs";
        field.Type = TType.Set;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteSetBeginAsync(new TSet(TType.I32, UpdatedAttrs.Count), cancellationToken);
          foreach (SquareMemberRelationAttribute _iter494 in UpdatedAttrs)
          {
            await oprot.WriteI32Async((int)_iter494, cancellationToken);
          }
          await oprot.WriteSetEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Relation != null && __isset.relation)
      {
        field.Name = "relation";
        field.Type = TType.Struct;
        field.ID = 5;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await Relation.WriteAsync(oprot, cancellationToken);
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
    var other = that as UpdateSquareMemberRelationRequest;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.squareMid == other.__isset.squareMid) && ((!__isset.squareMid) || (System.Object.Equals(SquareMid, other.SquareMid))))
      && ((__isset.targetSquareMemberMid == other.__isset.targetSquareMemberMid) && ((!__isset.targetSquareMemberMid) || (System.Object.Equals(TargetSquareMemberMid, other.TargetSquareMemberMid))))
      && ((__isset.updatedAttrs == other.__isset.updatedAttrs) && ((!__isset.updatedAttrs) || (TCollections.Equals(UpdatedAttrs, other.UpdatedAttrs))))
      && ((__isset.relation == other.__isset.relation) && ((!__isset.relation) || (System.Object.Equals(Relation, other.Relation))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.squareMid)
        hashcode = (hashcode * 397) + SquareMid.GetHashCode();
      if(__isset.targetSquareMemberMid)
        hashcode = (hashcode * 397) + TargetSquareMemberMid.GetHashCode();
      if(__isset.updatedAttrs)
        hashcode = (hashcode * 397) + TCollections.GetHashCode(UpdatedAttrs);
      if(__isset.relation)
        hashcode = (hashcode * 397) + Relation.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("UpdateSquareMemberRelationRequest(");
    bool __first = true;
    if (SquareMid != null && __isset.squareMid)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareMid: ");
      sb.Append(SquareMid);
    }
    if (TargetSquareMemberMid != null && __isset.targetSquareMemberMid)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("TargetSquareMemberMid: ");
      sb.Append(TargetSquareMemberMid);
    }
    if (UpdatedAttrs != null && __isset.updatedAttrs)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("UpdatedAttrs: ");
      sb.Append(UpdatedAttrs);
    }
    if (Relation != null && __isset.relation)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Relation: ");
      sb.Append(Relation== null ? "<null>" : Relation.ToString());
    }
    sb.Append(")");
    return sb.ToString();
  }
}
