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



public partial class BotUseInfo : TBase
{
  private bool _botUseAgreementAccepted;
  private bool _botInFriends;
  private string _primaryApplication;
  private string _locale;

  public bool BotUseAgreementAccepted
  {
    get
    {
      return _botUseAgreementAccepted;
    }
    set
    {
      __isset.botUseAgreementAccepted = true;
      this._botUseAgreementAccepted = value;
    }
  }

  public bool BotInFriends
  {
    get
    {
      return _botInFriends;
    }
    set
    {
      __isset.botInFriends = true;
      this._botInFriends = value;
    }
  }

  public string PrimaryApplication
  {
    get
    {
      return _primaryApplication;
    }
    set
    {
      __isset.primaryApplication = true;
      this._primaryApplication = value;
    }
  }

  public string Locale
  {
    get
    {
      return _locale;
    }
    set
    {
      __isset.locale = true;
      this._locale = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool botUseAgreementAccepted;
    public bool botInFriends;
    public bool primaryApplication;
    public bool locale;
  }

  public BotUseInfo()
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
            if (field.Type == TType.Bool)
            {
              BotUseAgreementAccepted = await iprot.ReadBoolAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.Bool)
            {
              BotInFriends = await iprot.ReadBoolAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.String)
            {
              PrimaryApplication = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.String)
            {
              Locale = await iprot.ReadStringAsync(cancellationToken);
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
      var struc = new TStruct("BotUseInfo");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (__isset.botUseAgreementAccepted)
      {
        field.Name = "botUseAgreementAccepted";
        field.Type = TType.Bool;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteBoolAsync(BotUseAgreementAccepted, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.botInFriends)
      {
        field.Name = "botInFriends";
        field.Type = TType.Bool;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteBoolAsync(BotInFriends, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (PrimaryApplication != null && __isset.primaryApplication)
      {
        field.Name = "primaryApplication";
        field.Type = TType.String;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(PrimaryApplication, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Locale != null && __isset.locale)
      {
        field.Name = "locale";
        field.Type = TType.String;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Locale, cancellationToken);
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
    var other = that as BotUseInfo;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.botUseAgreementAccepted == other.__isset.botUseAgreementAccepted) && ((!__isset.botUseAgreementAccepted) || (System.Object.Equals(BotUseAgreementAccepted, other.BotUseAgreementAccepted))))
      && ((__isset.botInFriends == other.__isset.botInFriends) && ((!__isset.botInFriends) || (System.Object.Equals(BotInFriends, other.BotInFriends))))
      && ((__isset.primaryApplication == other.__isset.primaryApplication) && ((!__isset.primaryApplication) || (System.Object.Equals(PrimaryApplication, other.PrimaryApplication))))
      && ((__isset.locale == other.__isset.locale) && ((!__isset.locale) || (System.Object.Equals(Locale, other.Locale))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.botUseAgreementAccepted)
        hashcode = (hashcode * 397) + BotUseAgreementAccepted.GetHashCode();
      if(__isset.botInFriends)
        hashcode = (hashcode * 397) + BotInFriends.GetHashCode();
      if(__isset.primaryApplication)
        hashcode = (hashcode * 397) + PrimaryApplication.GetHashCode();
      if(__isset.locale)
        hashcode = (hashcode * 397) + Locale.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("BotUseInfo(");
    bool __first = true;
    if (__isset.botUseAgreementAccepted)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("BotUseAgreementAccepted: ");
      BotUseAgreementAccepted.ToString(sb);
    }
    if (__isset.botInFriends)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("BotInFriends: ");
      BotInFriends.ToString(sb);
    }
    if (PrimaryApplication != null && __isset.primaryApplication)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("PrimaryApplication: ");
      PrimaryApplication.ToString(sb);
    }
    if (Locale != null && __isset.locale)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Locale: ");
      Locale.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

