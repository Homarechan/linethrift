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



public partial class SnsFriendContactRegistration : TBase
{
  private Contact _contact;
  private SnsIdType _snsIdType;
  private string _snsUserId;

  public Contact Contact
  {
    get
    {
      return _contact;
    }
    set
    {
      __isset.contact = true;
      this._contact = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="SnsIdType"/>
  /// </summary>
  public SnsIdType SnsIdType
  {
    get
    {
      return _snsIdType;
    }
    set
    {
      __isset.snsIdType = true;
      this._snsIdType = value;
    }
  }

  public string SnsUserId
  {
    get
    {
      return _snsUserId;
    }
    set
    {
      __isset.snsUserId = true;
      this._snsUserId = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool contact;
    public bool snsIdType;
    public bool snsUserId;
  }

  public SnsFriendContactRegistration()
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
              Contact = new Contact();
              await Contact.ReadAsync(iprot, cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.I32)
            {
              SnsIdType = (SnsIdType)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.String)
            {
              SnsUserId = await iprot.ReadStringAsync(cancellationToken);
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
      var struc = new TStruct("SnsFriendContactRegistration");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (Contact != null && __isset.contact)
      {
        field.Name = "contact";
        field.Type = TType.Struct;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await Contact.WriteAsync(oprot, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.snsIdType)
      {
        field.Name = "snsIdType";
        field.Type = TType.I32;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)SnsIdType, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (SnsUserId != null && __isset.snsUserId)
      {
        field.Name = "snsUserId";
        field.Type = TType.String;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(SnsUserId, cancellationToken);
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
    var other = that as SnsFriendContactRegistration;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.contact == other.__isset.contact) && ((!__isset.contact) || (System.Object.Equals(Contact, other.Contact))))
      && ((__isset.snsIdType == other.__isset.snsIdType) && ((!__isset.snsIdType) || (System.Object.Equals(SnsIdType, other.SnsIdType))))
      && ((__isset.snsUserId == other.__isset.snsUserId) && ((!__isset.snsUserId) || (System.Object.Equals(SnsUserId, other.SnsUserId))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.contact)
        hashcode = (hashcode * 397) + Contact.GetHashCode();
      if(__isset.snsIdType)
        hashcode = (hashcode * 397) + SnsIdType.GetHashCode();
      if(__isset.snsUserId)
        hashcode = (hashcode * 397) + SnsUserId.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("SnsFriendContactRegistration(");
    bool __first = true;
    if (Contact != null && __isset.contact)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Contact: ");
      Contact.ToString(sb);
    }
    if (__isset.snsIdType)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SnsIdType: ");
      SnsIdType.ToString(sb);
    }
    if (SnsUserId != null && __isset.snsUserId)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SnsUserId: ");
      SnsUserId.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

