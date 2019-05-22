/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;


#if !SILVERLIGHT
[Serializable]
#endif
public partial class PaymentReservationResult : TBase
{
  private string _orderId;
  private string _confirmUrl;
  private Dictionary<string, string> _extras;

  public string OrderId
  {
    get
    {
      return _orderId;
    }
    set
    {
      __isset.orderId = true;
      this._orderId = value;
    }
  }

  public string ConfirmUrl
  {
    get
    {
      return _confirmUrl;
    }
    set
    {
      __isset.confirmUrl = true;
      this._confirmUrl = value;
    }
  }

  public Dictionary<string, string> Extras
  {
    get
    {
      return _extras;
    }
    set
    {
      __isset.extras = true;
      this._extras = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool orderId;
    public bool confirmUrl;
    public bool extras;
  }

  public PaymentReservationResult() {
  }

  public void Read (TProtocol iprot)
  {
    iprot.IncrementRecursionDepth();
    try
    {
      TField field;
      iprot.ReadStructBegin();
      while (true)
      {
        field = iprot.ReadFieldBegin();
        if (field.Type == TType.Stop) { 
          break;
        }
        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.String) {
              OrderId = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              ConfirmUrl = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Map) {
              {
                Extras = new Dictionary<string, string>();
                TMap _map276 = iprot.ReadMapBegin();
                for( int _i277 = 0; _i277 < _map276.Count; ++_i277)
                {
                  string _key278;
                  string _val279;
                  _key278 = iprot.ReadString();
                  _val279 = iprot.ReadString();
                  Extras[_key278] = _val279;
                }
                iprot.ReadMapEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          default: 
            TProtocolUtil.Skip(iprot, field.Type);
            break;
        }
        iprot.ReadFieldEnd();
      }
      iprot.ReadStructEnd();
    }
    finally
    {
      iprot.DecrementRecursionDepth();
    }
  }

  public void Write(TProtocol oprot) {
    oprot.IncrementRecursionDepth();
    try
    {
      TStruct struc = new TStruct("PaymentReservationResult");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (OrderId != null && __isset.orderId) {
        field.Name = "orderId";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(OrderId);
        oprot.WriteFieldEnd();
      }
      if (ConfirmUrl != null && __isset.confirmUrl) {
        field.Name = "confirmUrl";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ConfirmUrl);
        oprot.WriteFieldEnd();
      }
      if (Extras != null && __isset.extras) {
        field.Name = "extras";
        field.Type = TType.Map;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteMapBegin(new TMap(TType.String, TType.String, Extras.Count));
          foreach (string _iter280 in Extras.Keys)
          {
            oprot.WriteString(_iter280);
            oprot.WriteString(Extras[_iter280]);
          }
          oprot.WriteMapEnd();
        }
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }
    finally
    {
      oprot.DecrementRecursionDepth();
    }
  }

  public override string ToString() {
    StringBuilder __sb = new StringBuilder("PaymentReservationResult(");
    bool __first = true;
    if (OrderId != null && __isset.orderId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("OrderId: ");
      __sb.Append(OrderId);
    }
    if (ConfirmUrl != null && __isset.confirmUrl) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ConfirmUrl: ");
      __sb.Append(ConfirmUrl);
    }
    if (Extras != null && __isset.extras) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Extras: ");
      __sb.Append(Extras);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}
