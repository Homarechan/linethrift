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



public partial class SquareEvent : TBase
{
  private long _createdTime;
  private SquareEventType _type;
  private SquareEventPayload _payload;
  private string _syncToken;
  private SquareEventStatus _eventStatus;

  public long CreatedTime
  {
    get
    {
      return _createdTime;
    }
    set
    {
      __isset.createdTime = true;
      this._createdTime = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="SquareEventType"/>
  /// </summary>
  public SquareEventType Type
  {
    get
    {
      return _type;
    }
    set
    {
      __isset.type = true;
      this._type = value;
    }
  }

  public SquareEventPayload Payload
  {
    get
    {
      return _payload;
    }
    set
    {
      __isset.payload = true;
      this._payload = value;
    }
  }

  public string SyncToken
  {
    get
    {
      return _syncToken;
    }
    set
    {
      __isset.syncToken = true;
      this._syncToken = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="SquareEventStatus"/>
  /// </summary>
  public SquareEventStatus EventStatus
  {
    get
    {
      return _eventStatus;
    }
    set
    {
      __isset.eventStatus = true;
      this._eventStatus = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool createdTime;
    public bool type;
    public bool payload;
    public bool syncToken;
    public bool eventStatus;
  }

  public SquareEvent()
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
            if (field.Type == TType.I64)
            {
              CreatedTime = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.I32)
            {
              Type = (SquareEventType)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.Struct)
            {
              Payload = new SquareEventPayload();
              await Payload.ReadAsync(iprot, cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 5:
            if (field.Type == TType.String)
            {
              SyncToken = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 6:
            if (field.Type == TType.I32)
            {
              EventStatus = (SquareEventStatus)await iprot.ReadI32Async(cancellationToken);
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
      var struc = new TStruct("SquareEvent");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (__isset.createdTime)
      {
        field.Name = "createdTime";
        field.Type = TType.I64;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(CreatedTime, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.type)
      {
        field.Name = "type";
        field.Type = TType.I32;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)Type, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Payload != null && __isset.payload)
      {
        field.Name = "payload";
        field.Type = TType.Struct;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await Payload.WriteAsync(oprot, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (SyncToken != null && __isset.syncToken)
      {
        field.Name = "syncToken";
        field.Type = TType.String;
        field.ID = 5;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(SyncToken, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.eventStatus)
      {
        field.Name = "eventStatus";
        field.Type = TType.I32;
        field.ID = 6;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)EventStatus, cancellationToken);
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
    var other = that as SquareEvent;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.createdTime == other.__isset.createdTime) && ((!__isset.createdTime) || (System.Object.Equals(CreatedTime, other.CreatedTime))))
      && ((__isset.type == other.__isset.type) && ((!__isset.type) || (System.Object.Equals(Type, other.Type))))
      && ((__isset.payload == other.__isset.payload) && ((!__isset.payload) || (System.Object.Equals(Payload, other.Payload))))
      && ((__isset.syncToken == other.__isset.syncToken) && ((!__isset.syncToken) || (System.Object.Equals(SyncToken, other.SyncToken))))
      && ((__isset.eventStatus == other.__isset.eventStatus) && ((!__isset.eventStatus) || (System.Object.Equals(EventStatus, other.EventStatus))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.createdTime)
        hashcode = (hashcode * 397) + CreatedTime.GetHashCode();
      if(__isset.type)
        hashcode = (hashcode * 397) + Type.GetHashCode();
      if(__isset.payload)
        hashcode = (hashcode * 397) + Payload.GetHashCode();
      if(__isset.syncToken)
        hashcode = (hashcode * 397) + SyncToken.GetHashCode();
      if(__isset.eventStatus)
        hashcode = (hashcode * 397) + EventStatus.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("SquareEvent(");
    bool __first = true;
    if (__isset.createdTime)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("CreatedTime: ");
      CreatedTime.ToString(sb);
    }
    if (__isset.type)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Type: ");
      Type.ToString(sb);
    }
    if (Payload != null && __isset.payload)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Payload: ");
      Payload.ToString(sb);
    }
    if (SyncToken != null && __isset.syncToken)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SyncToken: ");
      SyncToken.ToString(sb);
    }
    if (__isset.eventStatus)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("EventStatus: ");
      EventStatus.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

