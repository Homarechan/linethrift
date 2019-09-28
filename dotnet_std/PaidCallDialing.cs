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



public partial class PaidCallDialing : TBase
{
  private PaidCallType _type;
  private string _dialedNumber;
  private string _serviceDomain;
  private PaidCallProductType _productType;
  private string _productName;
  private bool _multipleProduct;
  private PaidCallerIdStatus _callerIdStatus;
  private int _balance;
  private string _unit;
  private int _rate;
  private string _displayCode;
  private string _calledNumber;
  private string _calleeNationalNumber;
  private string _calleeCallingCode;
  private string _rateDivision;
  private int _adMaxMin;
  private int _adRemains;
  private string _adSessionId;

  /// <summary>
  /// 
  /// <seealso cref="PaidCallType"/>
  /// </summary>
  public PaidCallType Type
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

  public string DialedNumber
  {
    get
    {
      return _dialedNumber;
    }
    set
    {
      __isset.dialedNumber = true;
      this._dialedNumber = value;
    }
  }

  public string ServiceDomain
  {
    get
    {
      return _serviceDomain;
    }
    set
    {
      __isset.serviceDomain = true;
      this._serviceDomain = value;
    }
  }

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

  public bool MultipleProduct
  {
    get
    {
      return _multipleProduct;
    }
    set
    {
      __isset.multipleProduct = true;
      this._multipleProduct = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="PaidCallerIdStatus"/>
  /// </summary>
  public PaidCallerIdStatus CallerIdStatus
  {
    get
    {
      return _callerIdStatus;
    }
    set
    {
      __isset.callerIdStatus = true;
      this._callerIdStatus = value;
    }
  }

  public int Balance
  {
    get
    {
      return _balance;
    }
    set
    {
      __isset.balance = true;
      this._balance = value;
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

  public int Rate
  {
    get
    {
      return _rate;
    }
    set
    {
      __isset.rate = true;
      this._rate = value;
    }
  }

  public string DisplayCode
  {
    get
    {
      return _displayCode;
    }
    set
    {
      __isset.displayCode = true;
      this._displayCode = value;
    }
  }

  public string CalledNumber
  {
    get
    {
      return _calledNumber;
    }
    set
    {
      __isset.calledNumber = true;
      this._calledNumber = value;
    }
  }

  public string CalleeNationalNumber
  {
    get
    {
      return _calleeNationalNumber;
    }
    set
    {
      __isset.calleeNationalNumber = true;
      this._calleeNationalNumber = value;
    }
  }

  public string CalleeCallingCode
  {
    get
    {
      return _calleeCallingCode;
    }
    set
    {
      __isset.calleeCallingCode = true;
      this._calleeCallingCode = value;
    }
  }

  public string RateDivision
  {
    get
    {
      return _rateDivision;
    }
    set
    {
      __isset.rateDivision = true;
      this._rateDivision = value;
    }
  }

  public int AdMaxMin
  {
    get
    {
      return _adMaxMin;
    }
    set
    {
      __isset.adMaxMin = true;
      this._adMaxMin = value;
    }
  }

  public int AdRemains
  {
    get
    {
      return _adRemains;
    }
    set
    {
      __isset.adRemains = true;
      this._adRemains = value;
    }
  }

  public string AdSessionId
  {
    get
    {
      return _adSessionId;
    }
    set
    {
      __isset.adSessionId = true;
      this._adSessionId = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool type;
    public bool dialedNumber;
    public bool serviceDomain;
    public bool productType;
    public bool productName;
    public bool multipleProduct;
    public bool callerIdStatus;
    public bool balance;
    public bool unit;
    public bool rate;
    public bool displayCode;
    public bool calledNumber;
    public bool calleeNationalNumber;
    public bool calleeCallingCode;
    public bool rateDivision;
    public bool adMaxMin;
    public bool adRemains;
    public bool adSessionId;
  }

  public PaidCallDialing()
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
              Type = (PaidCallType)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.String)
            {
              DialedNumber = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.String)
            {
              ServiceDomain = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.I32)
            {
              ProductType = (PaidCallProductType)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 5:
            if (field.Type == TType.String)
            {
              ProductName = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 6:
            if (field.Type == TType.Bool)
            {
              MultipleProduct = await iprot.ReadBoolAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 7:
            if (field.Type == TType.I32)
            {
              CallerIdStatus = (PaidCallerIdStatus)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 10:
            if (field.Type == TType.I32)
            {
              Balance = await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 11:
            if (field.Type == TType.String)
            {
              Unit = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 12:
            if (field.Type == TType.I32)
            {
              Rate = await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 13:
            if (field.Type == TType.String)
            {
              DisplayCode = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 14:
            if (field.Type == TType.String)
            {
              CalledNumber = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 15:
            if (field.Type == TType.String)
            {
              CalleeNationalNumber = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 16:
            if (field.Type == TType.String)
            {
              CalleeCallingCode = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 17:
            if (field.Type == TType.String)
            {
              RateDivision = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 20:
            if (field.Type == TType.I32)
            {
              AdMaxMin = await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 21:
            if (field.Type == TType.I32)
            {
              AdRemains = await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 22:
            if (field.Type == TType.String)
            {
              AdSessionId = await iprot.ReadStringAsync(cancellationToken);
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
      var struc = new TStruct("PaidCallDialing");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (__isset.type)
      {
        field.Name = "type";
        field.Type = TType.I32;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)Type, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (DialedNumber != null && __isset.dialedNumber)
      {
        field.Name = "dialedNumber";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(DialedNumber, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (ServiceDomain != null && __isset.serviceDomain)
      {
        field.Name = "serviceDomain";
        field.Type = TType.String;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(ServiceDomain, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.productType)
      {
        field.Name = "productType";
        field.Type = TType.I32;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)ProductType, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (ProductName != null && __isset.productName)
      {
        field.Name = "productName";
        field.Type = TType.String;
        field.ID = 5;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(ProductName, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.multipleProduct)
      {
        field.Name = "multipleProduct";
        field.Type = TType.Bool;
        field.ID = 6;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteBoolAsync(MultipleProduct, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.callerIdStatus)
      {
        field.Name = "callerIdStatus";
        field.Type = TType.I32;
        field.ID = 7;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)CallerIdStatus, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.balance)
      {
        field.Name = "balance";
        field.Type = TType.I32;
        field.ID = 10;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(Balance, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Unit != null && __isset.unit)
      {
        field.Name = "unit";
        field.Type = TType.String;
        field.ID = 11;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Unit, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.rate)
      {
        field.Name = "rate";
        field.Type = TType.I32;
        field.ID = 12;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(Rate, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (DisplayCode != null && __isset.displayCode)
      {
        field.Name = "displayCode";
        field.Type = TType.String;
        field.ID = 13;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(DisplayCode, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (CalledNumber != null && __isset.calledNumber)
      {
        field.Name = "calledNumber";
        field.Type = TType.String;
        field.ID = 14;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(CalledNumber, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (CalleeNationalNumber != null && __isset.calleeNationalNumber)
      {
        field.Name = "calleeNationalNumber";
        field.Type = TType.String;
        field.ID = 15;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(CalleeNationalNumber, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (CalleeCallingCode != null && __isset.calleeCallingCode)
      {
        field.Name = "calleeCallingCode";
        field.Type = TType.String;
        field.ID = 16;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(CalleeCallingCode, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (RateDivision != null && __isset.rateDivision)
      {
        field.Name = "rateDivision";
        field.Type = TType.String;
        field.ID = 17;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(RateDivision, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.adMaxMin)
      {
        field.Name = "adMaxMin";
        field.Type = TType.I32;
        field.ID = 20;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(AdMaxMin, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.adRemains)
      {
        field.Name = "adRemains";
        field.Type = TType.I32;
        field.ID = 21;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(AdRemains, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (AdSessionId != null && __isset.adSessionId)
      {
        field.Name = "adSessionId";
        field.Type = TType.String;
        field.ID = 22;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(AdSessionId, cancellationToken);
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
    var other = that as PaidCallDialing;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.type == other.__isset.type) && ((!__isset.type) || (System.Object.Equals(Type, other.Type))))
      && ((__isset.dialedNumber == other.__isset.dialedNumber) && ((!__isset.dialedNumber) || (System.Object.Equals(DialedNumber, other.DialedNumber))))
      && ((__isset.serviceDomain == other.__isset.serviceDomain) && ((!__isset.serviceDomain) || (System.Object.Equals(ServiceDomain, other.ServiceDomain))))
      && ((__isset.productType == other.__isset.productType) && ((!__isset.productType) || (System.Object.Equals(ProductType, other.ProductType))))
      && ((__isset.productName == other.__isset.productName) && ((!__isset.productName) || (System.Object.Equals(ProductName, other.ProductName))))
      && ((__isset.multipleProduct == other.__isset.multipleProduct) && ((!__isset.multipleProduct) || (System.Object.Equals(MultipleProduct, other.MultipleProduct))))
      && ((__isset.callerIdStatus == other.__isset.callerIdStatus) && ((!__isset.callerIdStatus) || (System.Object.Equals(CallerIdStatus, other.CallerIdStatus))))
      && ((__isset.balance == other.__isset.balance) && ((!__isset.balance) || (System.Object.Equals(Balance, other.Balance))))
      && ((__isset.unit == other.__isset.unit) && ((!__isset.unit) || (System.Object.Equals(Unit, other.Unit))))
      && ((__isset.rate == other.__isset.rate) && ((!__isset.rate) || (System.Object.Equals(Rate, other.Rate))))
      && ((__isset.displayCode == other.__isset.displayCode) && ((!__isset.displayCode) || (System.Object.Equals(DisplayCode, other.DisplayCode))))
      && ((__isset.calledNumber == other.__isset.calledNumber) && ((!__isset.calledNumber) || (System.Object.Equals(CalledNumber, other.CalledNumber))))
      && ((__isset.calleeNationalNumber == other.__isset.calleeNationalNumber) && ((!__isset.calleeNationalNumber) || (System.Object.Equals(CalleeNationalNumber, other.CalleeNationalNumber))))
      && ((__isset.calleeCallingCode == other.__isset.calleeCallingCode) && ((!__isset.calleeCallingCode) || (System.Object.Equals(CalleeCallingCode, other.CalleeCallingCode))))
      && ((__isset.rateDivision == other.__isset.rateDivision) && ((!__isset.rateDivision) || (System.Object.Equals(RateDivision, other.RateDivision))))
      && ((__isset.adMaxMin == other.__isset.adMaxMin) && ((!__isset.adMaxMin) || (System.Object.Equals(AdMaxMin, other.AdMaxMin))))
      && ((__isset.adRemains == other.__isset.adRemains) && ((!__isset.adRemains) || (System.Object.Equals(AdRemains, other.AdRemains))))
      && ((__isset.adSessionId == other.__isset.adSessionId) && ((!__isset.adSessionId) || (System.Object.Equals(AdSessionId, other.AdSessionId))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.type)
        hashcode = (hashcode * 397) + Type.GetHashCode();
      if(__isset.dialedNumber)
        hashcode = (hashcode * 397) + DialedNumber.GetHashCode();
      if(__isset.serviceDomain)
        hashcode = (hashcode * 397) + ServiceDomain.GetHashCode();
      if(__isset.productType)
        hashcode = (hashcode * 397) + ProductType.GetHashCode();
      if(__isset.productName)
        hashcode = (hashcode * 397) + ProductName.GetHashCode();
      if(__isset.multipleProduct)
        hashcode = (hashcode * 397) + MultipleProduct.GetHashCode();
      if(__isset.callerIdStatus)
        hashcode = (hashcode * 397) + CallerIdStatus.GetHashCode();
      if(__isset.balance)
        hashcode = (hashcode * 397) + Balance.GetHashCode();
      if(__isset.unit)
        hashcode = (hashcode * 397) + Unit.GetHashCode();
      if(__isset.rate)
        hashcode = (hashcode * 397) + Rate.GetHashCode();
      if(__isset.displayCode)
        hashcode = (hashcode * 397) + DisplayCode.GetHashCode();
      if(__isset.calledNumber)
        hashcode = (hashcode * 397) + CalledNumber.GetHashCode();
      if(__isset.calleeNationalNumber)
        hashcode = (hashcode * 397) + CalleeNationalNumber.GetHashCode();
      if(__isset.calleeCallingCode)
        hashcode = (hashcode * 397) + CalleeCallingCode.GetHashCode();
      if(__isset.rateDivision)
        hashcode = (hashcode * 397) + RateDivision.GetHashCode();
      if(__isset.adMaxMin)
        hashcode = (hashcode * 397) + AdMaxMin.GetHashCode();
      if(__isset.adRemains)
        hashcode = (hashcode * 397) + AdRemains.GetHashCode();
      if(__isset.adSessionId)
        hashcode = (hashcode * 397) + AdSessionId.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("PaidCallDialing(");
    bool __first = true;
    if (__isset.type)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Type: ");
      sb.Append(Type);
    }
    if (DialedNumber != null && __isset.dialedNumber)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("DialedNumber: ");
      sb.Append(DialedNumber);
    }
    if (ServiceDomain != null && __isset.serviceDomain)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ServiceDomain: ");
      sb.Append(ServiceDomain);
    }
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
    if (__isset.multipleProduct)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("MultipleProduct: ");
      sb.Append(MultipleProduct);
    }
    if (__isset.callerIdStatus)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("CallerIdStatus: ");
      sb.Append(CallerIdStatus);
    }
    if (__isset.balance)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Balance: ");
      sb.Append(Balance);
    }
    if (Unit != null && __isset.unit)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Unit: ");
      sb.Append(Unit);
    }
    if (__isset.rate)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Rate: ");
      sb.Append(Rate);
    }
    if (DisplayCode != null && __isset.displayCode)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("DisplayCode: ");
      sb.Append(DisplayCode);
    }
    if (CalledNumber != null && __isset.calledNumber)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("CalledNumber: ");
      sb.Append(CalledNumber);
    }
    if (CalleeNationalNumber != null && __isset.calleeNationalNumber)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("CalleeNationalNumber: ");
      sb.Append(CalleeNationalNumber);
    }
    if (CalleeCallingCode != null && __isset.calleeCallingCode)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("CalleeCallingCode: ");
      sb.Append(CalleeCallingCode);
    }
    if (RateDivision != null && __isset.rateDivision)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("RateDivision: ");
      sb.Append(RateDivision);
    }
    if (__isset.adMaxMin)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("AdMaxMin: ");
      sb.Append(AdMaxMin);
    }
    if (__isset.adRemains)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("AdRemains: ");
      sb.Append(AdRemains);
    }
    if (AdSessionId != null && __isset.adSessionId)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("AdSessionId: ");
      sb.Append(AdSessionId);
    }
    sb.Append(")");
    return sb.ToString();
  }
}
