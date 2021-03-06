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



public partial class SquareChatAnnouncement : TBase
{
  private long _announcementSeq;
  private SquareChatAnnouncementType _type;
  private SquareChatAnnouncementContents _contents;

  public long AnnouncementSeq
  {
    get
    {
      return _announcementSeq;
    }
    set
    {
      __isset.announcementSeq = true;
      this._announcementSeq = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="SquareChatAnnouncementType"/>
  /// </summary>
  public SquareChatAnnouncementType Type
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

  public SquareChatAnnouncementContents Contents
  {
    get
    {
      return _contents;
    }
    set
    {
      __isset.contents = true;
      this._contents = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool announcementSeq;
    public bool type;
    public bool contents;
  }

  public SquareChatAnnouncement()
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
            if (field.Type == TType.I64)
            {
              AnnouncementSeq = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.I32)
            {
              Type = (SquareChatAnnouncementType)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.Struct)
            {
              Contents = new SquareChatAnnouncementContents();
              await Contents.ReadAsync(iprot, cancellationToken);
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
      var struc = new TStruct("SquareChatAnnouncement");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (__isset.announcementSeq)
      {
        field.Name = "announcementSeq";
        field.Type = TType.I64;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(AnnouncementSeq, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.type)
      {
        field.Name = "type";
        field.Type = TType.I32;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)Type, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Contents != null && __isset.contents)
      {
        field.Name = "contents";
        field.Type = TType.Struct;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await Contents.WriteAsync(oprot, cancellationToken);
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
    var other = that as SquareChatAnnouncement;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.announcementSeq == other.__isset.announcementSeq) && ((!__isset.announcementSeq) || (System.Object.Equals(AnnouncementSeq, other.AnnouncementSeq))))
      && ((__isset.type == other.__isset.type) && ((!__isset.type) || (System.Object.Equals(Type, other.Type))))
      && ((__isset.contents == other.__isset.contents) && ((!__isset.contents) || (System.Object.Equals(Contents, other.Contents))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.announcementSeq)
        hashcode = (hashcode * 397) + AnnouncementSeq.GetHashCode();
      if(__isset.type)
        hashcode = (hashcode * 397) + Type.GetHashCode();
      if(__isset.contents)
        hashcode = (hashcode * 397) + Contents.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("SquareChatAnnouncement(");
    bool __first = true;
    if (__isset.announcementSeq)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("AnnouncementSeq: ");
      AnnouncementSeq.ToString(sb);
    }
    if (__isset.type)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Type: ");
      Type.ToString(sb);
    }
    if (Contents != null && __isset.contents)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Contents: ");
      Contents.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

