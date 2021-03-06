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



public partial class NotificationTarget : TBase
{
  private string _applicationType;
  private string _applicationVersion;
  private string _region;

  public string ApplicationType
  {
    get
    {
      return _applicationType;
    }
    set
    {
      __isset.applicationType = true;
      this._applicationType = value;
    }
  }

  public string ApplicationVersion
  {
    get
    {
      return _applicationVersion;
    }
    set
    {
      __isset.applicationVersion = true;
      this._applicationVersion = value;
    }
  }

  public string Region
  {
    get
    {
      return _region;
    }
    set
    {
      __isset.region = true;
      this._region = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool applicationType;
    public bool applicationVersion;
    public bool region;
  }

  public NotificationTarget()
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
              ApplicationType = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.String)
            {
              ApplicationVersion = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.String)
            {
              Region = await iprot.ReadStringAsync(cancellationToken);
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
      var struc = new TStruct("NotificationTarget");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (ApplicationType != null && __isset.applicationType)
      {
        field.Name = "applicationType";
        field.Type = TType.String;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(ApplicationType, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (ApplicationVersion != null && __isset.applicationVersion)
      {
        field.Name = "applicationVersion";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(ApplicationVersion, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Region != null && __isset.region)
      {
        field.Name = "region";
        field.Type = TType.String;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Region, cancellationToken);
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
    var other = that as NotificationTarget;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.applicationType == other.__isset.applicationType) && ((!__isset.applicationType) || (System.Object.Equals(ApplicationType, other.ApplicationType))))
      && ((__isset.applicationVersion == other.__isset.applicationVersion) && ((!__isset.applicationVersion) || (System.Object.Equals(ApplicationVersion, other.ApplicationVersion))))
      && ((__isset.region == other.__isset.region) && ((!__isset.region) || (System.Object.Equals(Region, other.Region))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.applicationType)
        hashcode = (hashcode * 397) + ApplicationType.GetHashCode();
      if(__isset.applicationVersion)
        hashcode = (hashcode * 397) + ApplicationVersion.GetHashCode();
      if(__isset.region)
        hashcode = (hashcode * 397) + Region.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("NotificationTarget(");
    bool __first = true;
    if (ApplicationType != null && __isset.applicationType)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ApplicationType: ");
      ApplicationType.ToString(sb);
    }
    if (ApplicationVersion != null && __isset.applicationVersion)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ApplicationVersion: ");
      ApplicationVersion.ToString(sb);
    }
    if (Region != null && __isset.region)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Region: ");
      Region.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

