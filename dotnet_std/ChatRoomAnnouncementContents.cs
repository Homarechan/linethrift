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



public partial class ChatRoomAnnouncementContents : TBase
{
  private int _displayFields;
  private string _text;
  private string _link;
  private string _thumbnail;

  public int DisplayFields
  {
    get
    {
      return _displayFields;
    }
    set
    {
      __isset.displayFields = true;
      this._displayFields = value;
    }
  }

  public string Text
  {
    get
    {
      return _text;
    }
    set
    {
      __isset.text = true;
      this._text = value;
    }
  }

  public string Link
  {
    get
    {
      return _link;
    }
    set
    {
      __isset.link = true;
      this._link = value;
    }
  }

  public string Thumbnail
  {
    get
    {
      return _thumbnail;
    }
    set
    {
      __isset.thumbnail = true;
      this._thumbnail = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool displayFields;
    public bool text;
    public bool link;
    public bool thumbnail;
  }

  public ChatRoomAnnouncementContents()
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
              DisplayFields = await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.String)
            {
              Text = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.String)
            {
              Link = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.String)
            {
              Thumbnail = await iprot.ReadStringAsync(cancellationToken);
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
      var struc = new TStruct("ChatRoomAnnouncementContents");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (__isset.displayFields)
      {
        field.Name = "displayFields";
        field.Type = TType.I32;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(DisplayFields, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Text != null && __isset.text)
      {
        field.Name = "text";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Text, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Link != null && __isset.link)
      {
        field.Name = "link";
        field.Type = TType.String;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Link, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Thumbnail != null && __isset.thumbnail)
      {
        field.Name = "thumbnail";
        field.Type = TType.String;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Thumbnail, cancellationToken);
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
    var other = that as ChatRoomAnnouncementContents;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.displayFields == other.__isset.displayFields) && ((!__isset.displayFields) || (System.Object.Equals(DisplayFields, other.DisplayFields))))
      && ((__isset.text == other.__isset.text) && ((!__isset.text) || (System.Object.Equals(Text, other.Text))))
      && ((__isset.link == other.__isset.link) && ((!__isset.link) || (System.Object.Equals(Link, other.Link))))
      && ((__isset.thumbnail == other.__isset.thumbnail) && ((!__isset.thumbnail) || (System.Object.Equals(Thumbnail, other.Thumbnail))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.displayFields)
        hashcode = (hashcode * 397) + DisplayFields.GetHashCode();
      if(__isset.text)
        hashcode = (hashcode * 397) + Text.GetHashCode();
      if(__isset.link)
        hashcode = (hashcode * 397) + Link.GetHashCode();
      if(__isset.thumbnail)
        hashcode = (hashcode * 397) + Thumbnail.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("ChatRoomAnnouncementContents(");
    bool __first = true;
    if (__isset.displayFields)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("DisplayFields: ");
      DisplayFields.ToString(sb);
    }
    if (Text != null && __isset.text)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Text: ");
      Text.ToString(sb);
    }
    if (Link != null && __isset.link)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Link: ");
      Link.ToString(sb);
    }
    if (Thumbnail != null && __isset.thumbnail)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Thumbnail: ");
      Thumbnail.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

