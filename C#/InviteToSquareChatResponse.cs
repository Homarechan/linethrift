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
public partial class InviteToSquareChatResponse : TBase
{
  private List<string> _inviteeMids;

  public List<string> InviteeMids
  {
    get
    {
      return _inviteeMids;
    }
    set
    {
      __isset.inviteeMids = true;
      this._inviteeMids = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool inviteeMids;
  }

  public InviteToSquareChatResponse() {
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
            if (field.Type == TType.List) {
              {
                InviteeMids = new List<string>();
                TList _list449 = iprot.ReadListBegin();
                for( int _i450 = 0; _i450 < _list449.Count; ++_i450)
                {
                  string _elem451;
                  _elem451 = iprot.ReadString();
                  InviteeMids.Add(_elem451);
                }
                iprot.ReadListEnd();
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
      TStruct struc = new TStruct("InviteToSquareChatResponse");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (InviteeMids != null && __isset.inviteeMids) {
        field.Name = "inviteeMids";
        field.Type = TType.List;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.String, InviteeMids.Count));
          foreach (string _iter452 in InviteeMids)
          {
            oprot.WriteString(_iter452);
          }
          oprot.WriteListEnd();
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
    StringBuilder __sb = new StringBuilder("InviteToSquareChatResponse(");
    bool __first = true;
    if (InviteeMids != null && __isset.inviteeMids) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("InviteeMids: ");
      __sb.Append(InviteeMids);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}
