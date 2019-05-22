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
public partial class GetSquareMemberRequest : TBase
{
  private string _squareMemberMid;

  public string SquareMemberMid
  {
    get
    {
      return _squareMemberMid;
    }
    set
    {
      __isset.squareMemberMid = true;
      this._squareMemberMid = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool squareMemberMid;
  }

  public GetSquareMemberRequest() {
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
              SquareMemberMid = iprot.ReadString();
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
      TStruct struc = new TStruct("GetSquareMemberRequest");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (SquareMemberMid != null && __isset.squareMemberMid) {
        field.Name = "squareMemberMid";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SquareMemberMid);
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
    StringBuilder __sb = new StringBuilder("GetSquareMemberRequest(");
    bool __first = true;
    if (SquareMemberMid != null && __isset.squareMemberMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareMemberMid: ");
      __sb.Append(SquareMemberMid);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}
