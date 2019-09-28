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

using Thrift.Protocols;
using Thrift.Protocols.Entities;
using Thrift.Protocols.Utilities;
using Thrift.Transports;
using Thrift.Transports.Client;
using Thrift.Transports.Server;



public partial class PaidCallBalance : TBase
{
  private PaidCallProductType _productType;
  private string _productName;
  private string _unit;
  private int _limitedPaidBalance;
  private int _limitedFreeBalance;
  private int _unlimitedPaidBalance;
  private int _unlimitedFreeBalance;
  private long _startTime;
  private long _endTime;
  private bool _autopayEnabled;

  /// <summary>
  /// 
  /// <seealso cref="PaidCallProductType"/>
  /// </summary>
  public PaidCallProductType ProductType
  {
    get
    {
      return _productType;
    }
    set
    {
      __isset.productType = true;
      this._productType = value;
    }
  }

  public string ProductName
  {
    get
    {
      return _productName;
    }
    set
    {
      __isset.productName = true;
      this._productName = value;
    }
  }

  public string Unit
  {
    get
    {
      return _unit;
    }
    set
    {
      __isset.unit = true;
      this._unit = value;
    }
  }

  public int LimitedPaidBalance
  {
    get
    {
      return _limitedPaidBalance;
    }
    set
    {
      __isset.limitedPaidBalance = true;
      this._limitedPaidBalance = value;
    }
  }

  public int LimitedFreeBalance
  {
    get
    {
      return _limitedFreeBalance;
    }
    set
    {
      __isset.limitedFreeBalance = true;
      this._limitedFreeBalance = value;
    }
  }

  public int UnlimitedPaidBalance
  {
    get
    {
      return _unlimitedPaidBalance;
    }
    set
    {
      __isset.unlimitedPaidBalance = true;
      this._unlimitedPaidBalance = value;
    }
  }

  public int UnlimitedFreeBalance
  {
    get
    {
      return _unlimitedFreeBalance;
    }
    set
    {
      __isset.unlimitedFreeBalance = true;
      this._unlimitedFreeBalance = value;
    }
  }

  public long StartTime
  {
    get
    {
      return _startTime;
    }
    set
    {
      __isset.startTime = true;
      this._startTime = value;
    }
  }

  public long EndTime
  {
    get
    {
      return _endTime;
    }
    set
    {
      __isset.endTime = true;
      this._endTime = value;
    }
  }

  public bool AutopayEnabled
  {
    get
    {
      return _autopayEnabled;
    }
    set
    {
      __isset.autopayEnabled = true;
      this._autopayEnabled = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool productType;
    public bool productName;
    public bool unit;
    public bool limitedPaidBalance;
    public bool limitedFreeBalance;
    public bool unlimitedPaidBalance;
    public bool unlimitedFreeBalance;
    public bool startTime;
    public bool endTime;
    public bool autopayEnabled;
  }

  public PaidCallBalance()
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
              ProductType = (PaidCallProductType)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.String)
            {
              ProductName = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.String)
            {
              Unit = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.I32)
            {
              LimitedPaidBalance = await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 5:
            if (field.Type == TType.I32)
            {
              LimitedFreeBalance = await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 6:
            if (field.Type == TType.I32)
            {
              UnlimitedPaidBalance = await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 7:
            if (field.Type == TType.I32)
            {
              UnlimitedFreeBalance = await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 8:
            if (field.Type == TType.I64)
            {
              StartTime = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 9:
            if (field.Type == TType.I64)
            {
              EndTime = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 10:
            if (field.Type == TType.Bool)
            {
              AutopayEnabled = await iprot.ReadBoolAsync(cancellationToken);
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
      var struc = new TStruct("PaidCallBalance");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (__isset.productType)
      {
        field.Name = "productType";
        field.Type = TType.I32;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)ProductType, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (ProductName != null && __isset.productName)
      {
        field.Name = "productName";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(ProductName, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Unit != null && __isset.unit)
      {
        field.Name = "unit";
        field.Type = TType.String;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Unit, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.limitedPaidBalance)
      {
        field.Name = "limitedPaidBalance";
        field.Type = TType.I32;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(LimitedPaidBalance, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.limitedFreeBalance)
      {
        field.Name = "limitedFreeBalance";
        field.Type = TType.I32;
        field.ID = 5;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(LimitedFreeBalance, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.unlimitedPaidBalance)
      {
        field.Name = "unlimitedPaidBalance";
        field.Type = TType.I32;
        field.ID = 6;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(UnlimitedPaidBalance, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.unlimitedFreeBalance)
      {
        field.Name = "unlimitedFreeBalance";
        field.Type = TType.I32;
        field.ID = 7;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(UnlimitedFreeBalance, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.startTime)
      {
        field.Name = "startTime";
        field.Type = TType.I64;
        field.ID = 8;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(StartTime, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.endTime)
      {
        field.Name = "endTime";
        field.Type = TType.I64;
        field.ID = 9;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(EndTime, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.autopayEnabled)
      {
        field.Name = "autopayEnabled";
        field.Type = TType.Bool;
        field.ID = 10;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteBoolAsync(AutopayEnabled, cancellationToken);
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

  public override string ToString()
  {
    var sb = new StringBuilder("PaidCallBalance(");
    bool __first = true;
    if (__isset.productType)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ProductType: ");
      sb.Append(ProductType);
    }
    if (ProductName != null && __isset.productName)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ProductName: ");
      sb.Append(ProductName);
    }
    if (Unit != null && __isset.unit)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Unit: ");
      sb.Append(Unit);
    }
    if (__isset.limitedPaidBalance)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("LimitedPaidBalance: ");
      sb.Append(LimitedPaidBalance);
    }
    if (__isset.limitedFreeBalance)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("LimitedFreeBalance: ");
      sb.Append(LimitedFreeBalance);
    }
    if (__isset.unlimitedPaidBalance)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("UnlimitedPaidBalance: ");
      sb.Append(UnlimitedPaidBalance);
    }
    if (__isset.unlimitedFreeBalance)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("UnlimitedFreeBalance: ");
      sb.Append(UnlimitedFreeBalance);
    }
    if (__isset.startTime)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("StartTime: ");
      sb.Append(StartTime);
    }
    if (__isset.endTime)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("EndTime: ");
      sb.Append(EndTime);
    }
    if (__isset.autopayEnabled)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("AutopayEnabled: ");
      sb.Append(AutopayEnabled);
    }
    sb.Append(")");
    return sb.ToString();
  }
}
