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



public partial class Location : TBase
{
  private string _title;
  private string _address;
  private double _latitude;
  private double _longitude;
  private string _phone;

  public string Title
  {
    get
    {
      return _title;
    }
    set
    {
      __isset.title = true;
      this._title = value;
    }
  }

  public string Address
  {
    get
    {
      return _address;
    }
    set
    {
      __isset.address = true;
      this._address = value;
    }
  }

  public double Latitude
  {
    get
    {
      return _latitude;
    }
    set
    {
      __isset.latitude = true;
      this._latitude = value;
    }
  }

  public double Longitude
  {
    get
    {
      return _longitude;
    }
    set
    {
      __isset.longitude = true;
      this._longitude = value;
    }
  }

  public string Phone
  {
    get
    {
      return _phone;
    }
    set
    {
      __isset.phone = true;
      this._phone = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool title;
    public bool address;
    public bool latitude;
    public bool longitude;
    public bool phone;
  }

  public Location()
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
              Title = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.String)
            {
              Address = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.Double)
            {
              Latitude = await iprot.ReadDoubleAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.Double)
            {
              Longitude = await iprot.ReadDoubleAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 5:
            if (field.Type == TType.String)
            {
              Phone = await iprot.ReadStringAsync(cancellationToken);
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
      var struc = new TStruct("Location");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (Title != null && __isset.title)
      {
        field.Name = "title";
        field.Type = TType.String;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Title, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Address != null && __isset.address)
      {
        field.Name = "address";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Address, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.latitude)
      {
        field.Name = "latitude";
        field.Type = TType.Double;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteDoubleAsync(Latitude, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.longitude)
      {
        field.Name = "longitude";
        field.Type = TType.Double;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteDoubleAsync(Longitude, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Phone != null && __isset.phone)
      {
        field.Name = "phone";
        field.Type = TType.String;
        field.ID = 5;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Phone, cancellationToken);
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
    var other = that as Location;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.title == other.__isset.title) && ((!__isset.title) || (System.Object.Equals(Title, other.Title))))
      && ((__isset.address == other.__isset.address) && ((!__isset.address) || (System.Object.Equals(Address, other.Address))))
      && ((__isset.latitude == other.__isset.latitude) && ((!__isset.latitude) || (System.Object.Equals(Latitude, other.Latitude))))
      && ((__isset.longitude == other.__isset.longitude) && ((!__isset.longitude) || (System.Object.Equals(Longitude, other.Longitude))))
      && ((__isset.phone == other.__isset.phone) && ((!__isset.phone) || (System.Object.Equals(Phone, other.Phone))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.title)
        hashcode = (hashcode * 397) + Title.GetHashCode();
      if(__isset.address)
        hashcode = (hashcode * 397) + Address.GetHashCode();
      if(__isset.latitude)
        hashcode = (hashcode * 397) + Latitude.GetHashCode();
      if(__isset.longitude)
        hashcode = (hashcode * 397) + Longitude.GetHashCode();
      if(__isset.phone)
        hashcode = (hashcode * 397) + Phone.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("Location(");
    bool __first = true;
    if (Title != null && __isset.title)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Title: ");
      Title.ToString(sb);
    }
    if (Address != null && __isset.address)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Address: ");
      Address.ToString(sb);
    }
    if (__isset.latitude)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Latitude: ");
      Latitude.ToString(sb);
    }
    if (__isset.longitude)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Longitude: ");
      Longitude.ToString(sb);
    }
    if (Phone != null && __isset.phone)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Phone: ");
      Phone.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

