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
public partial class TextMessageAnnouncementContents : TBase
{
  private string _messageId;
  private string _text;
  private string _senderSquareMemberMid;
  private long _createdAt;

  public string MessageId
  {
    get
    {
      return _messageId;
    }
    set
    {
      __isset.messageId = true;
      this._messageId = value;
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

  public string SenderSquareMemberMid
  {
    get
    {
      return _senderSquareMemberMid;
    }
    set
    {
      __isset.senderSquareMemberMid = true;
      this._senderSquareMemberMid = value;
    }
  }

  public long CreatedAt
  {
    get
    {
      return _createdAt;
    }
    set
    {
      __isset.createdAt = true;
      this._createdAt = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool messageId;
    public bool text;
    public bool senderSquareMemberMid;
    public bool createdAt;
  }

  public TextMessageAnnouncementContents() {
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
              MessageId = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              Text = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              SenderSquareMemberMid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I64) {
              CreatedAt = iprot.ReadI64();
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
      TStruct struc = new TStruct("TextMessageAnnouncementContents");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (MessageId != null && __isset.messageId) {
        field.Name = "messageId";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(MessageId);
        oprot.WriteFieldEnd();
      }
      if (Text != null && __isset.text) {
        field.Name = "text";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Text);
        oprot.WriteFieldEnd();
      }
      if (SenderSquareMemberMid != null && __isset.senderSquareMemberMid) {
        field.Name = "senderSquareMemberMid";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SenderSquareMemberMid);
        oprot.WriteFieldEnd();
      }
      if (__isset.createdAt) {
        field.Name = "createdAt";
        field.Type = TType.I64;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(CreatedAt);
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
    StringBuilder __sb = new StringBuilder("TextMessageAnnouncementContents(");
    bool __first = true;
    if (MessageId != null && __isset.messageId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("MessageId: ");
      __sb.Append(MessageId);
    }
    if (Text != null && __isset.text) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Text: ");
      __sb.Append(Text);
    }
    if (SenderSquareMemberMid != null && __isset.senderSquareMemberMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SenderSquareMemberMid: ");
      __sb.Append(SenderSquareMemberMid);
    }
    if (__isset.createdAt) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CreatedAt: ");
      __sb.Append(CreatedAt);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}
