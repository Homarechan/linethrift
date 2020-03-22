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



public partial class CreateSquareChatAnnouncementResponse : TBase
{
  private SquareChatAnnouncement _announcement;

  public SquareChatAnnouncement Announcement
  {
    get
    {
      return _announcement;
    }
    set
    {
      __isset.announcement = true;
      this._announcement = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool announcement;
  }

  public CreateSquareChatAnnouncementResponse()
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
            if (field.Type == TType.Struct)
            {
              Announcement = new SquareChatAnnouncement();
              await Announcement.ReadAsync(iprot, cancellationToken);
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
      var struc = new TStruct("CreateSquareChatAnnouncementResponse");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (Announcement != null && __isset.announcement)
      {
        field.Name = "announcement";
        field.Type = TType.Struct;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await Announcement.WriteAsync(oprot, cancellationToken);
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
    var other = that as CreateSquareChatAnnouncementResponse;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.announcement == other.__isset.announcement) && ((!__isset.announcement) || (System.Object.Equals(Announcement, other.Announcement))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.announcement)
        hashcode = (hashcode * 397) + Announcement.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("CreateSquareChatAnnouncementResponse(");
    bool __first = true;
    if (Announcement != null && __isset.announcement)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Announcement: ");
      Announcement.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

