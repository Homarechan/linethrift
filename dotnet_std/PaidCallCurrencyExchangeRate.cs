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



public partial class PaidCallCurrencyExchangeRate : TBase
{
  private string _currencyCode;
  private string _currencyName;
  private string _currencySign;
  private bool _preferred;
  private string _coinRate;
  private string _creditRate;

  public string CurrencyCode
  {
    get
    {
      return _currencyCode;
    }
    set
    {
      __isset.currencyCode = true;
      this._currencyCode = value;
    }
  }

  public string CurrencyName
  {
    get
    {
      return _currencyName;
    }
    set
    {
      __isset.currencyName = true;
      this._currencyName = value;
    }
  }

  public string CurrencySign
  {
    get
    {
      return _currencySign;
    }
    set
    {
      __isset.currencySign = true;
      this._currencySign = value;
    }
  }

  public bool Preferred
  {
    get
    {
      return _preferred;
    }
    set
    {
      __isset.preferred = true;
      this._preferred = value;
    }
  }

  public string CoinRate
  {
    get
    {
      return _coinRate;
    }
    set
    {
      __isset.coinRate = true;
      this._coinRate = value;
    }
  }

  public string CreditRate
  {
    get
    {
      return _creditRate;
    }
    set
    {
      __isset.creditRate = true;
      this._creditRate = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool currencyCode;
    public bool currencyName;
    public bool currencySign;
    public bool preferred;
    public bool coinRate;
    public bool creditRate;
  }

  public PaidCallCurrencyExchangeRate()
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
              CurrencyCode = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.String)
            {
              CurrencyName = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.String)
            {
              CurrencySign = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.Bool)
            {
              Preferred = await iprot.ReadBoolAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 5:
            if (field.Type == TType.String)
            {
              CoinRate = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 6:
            if (field.Type == TType.String)
            {
              CreditRate = await iprot.ReadStringAsync(cancellationToken);
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
      var struc = new TStruct("PaidCallCurrencyExchangeRate");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (CurrencyCode != null && __isset.currencyCode)
      {
        field.Name = "currencyCode";
        field.Type = TType.String;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(CurrencyCode, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (CurrencyName != null && __isset.currencyName)
      {
        field.Name = "currencyName";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(CurrencyName, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (CurrencySign != null && __isset.currencySign)
      {
        field.Name = "currencySign";
        field.Type = TType.String;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(CurrencySign, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.preferred)
      {
        field.Name = "preferred";
        field.Type = TType.Bool;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteBoolAsync(Preferred, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (CoinRate != null && __isset.coinRate)
      {
        field.Name = "coinRate";
        field.Type = TType.String;
        field.ID = 5;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(CoinRate, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (CreditRate != null && __isset.creditRate)
      {
        field.Name = "creditRate";
        field.Type = TType.String;
        field.ID = 6;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(CreditRate, cancellationToken);
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
    var other = that as PaidCallCurrencyExchangeRate;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.currencyCode == other.__isset.currencyCode) && ((!__isset.currencyCode) || (System.Object.Equals(CurrencyCode, other.CurrencyCode))))
      && ((__isset.currencyName == other.__isset.currencyName) && ((!__isset.currencyName) || (System.Object.Equals(CurrencyName, other.CurrencyName))))
      && ((__isset.currencySign == other.__isset.currencySign) && ((!__isset.currencySign) || (System.Object.Equals(CurrencySign, other.CurrencySign))))
      && ((__isset.preferred == other.__isset.preferred) && ((!__isset.preferred) || (System.Object.Equals(Preferred, other.Preferred))))
      && ((__isset.coinRate == other.__isset.coinRate) && ((!__isset.coinRate) || (System.Object.Equals(CoinRate, other.CoinRate))))
      && ((__isset.creditRate == other.__isset.creditRate) && ((!__isset.creditRate) || (System.Object.Equals(CreditRate, other.CreditRate))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.currencyCode)
        hashcode = (hashcode * 397) + CurrencyCode.GetHashCode();
      if(__isset.currencyName)
        hashcode = (hashcode * 397) + CurrencyName.GetHashCode();
      if(__isset.currencySign)
        hashcode = (hashcode * 397) + CurrencySign.GetHashCode();
      if(__isset.preferred)
        hashcode = (hashcode * 397) + Preferred.GetHashCode();
      if(__isset.coinRate)
        hashcode = (hashcode * 397) + CoinRate.GetHashCode();
      if(__isset.creditRate)
        hashcode = (hashcode * 397) + CreditRate.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("PaidCallCurrencyExchangeRate(");
    bool __first = true;
    if (CurrencyCode != null && __isset.currencyCode)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("CurrencyCode: ");
      sb.Append(CurrencyCode);
    }
    if (CurrencyName != null && __isset.currencyName)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("CurrencyName: ");
      sb.Append(CurrencyName);
    }
    if (CurrencySign != null && __isset.currencySign)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("CurrencySign: ");
      sb.Append(CurrencySign);
    }
    if (__isset.preferred)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Preferred: ");
      sb.Append(Preferred);
    }
    if (CoinRate != null && __isset.coinRate)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("CoinRate: ");
      sb.Append(CoinRate);
    }
    if (CreditRate != null && __isset.creditRate)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("CreditRate: ");
      sb.Append(CreditRate);
    }
    sb.Append(")");
    return sb.ToString();
  }
}
