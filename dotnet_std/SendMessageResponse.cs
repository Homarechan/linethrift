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



public partial class SendMessageResponse : TBase
{
  private SquareMessage _createdSquareMessage;

  public SquareMessage CreatedSquareMessage
  {
    get
    {
      return _createdSquareMessage;
    }
    set
    {
      __isset.createdSquareMessage = true;
      this._createdSquareMessage = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool createdSquareMessage;
  }

  public SendMessageResponse()
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
              CreatedSquareMessage = new SquareMessage();
              await CreatedSquareMessage.ReadAsync(iprot, cancellationToken);
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
      var struc = new TStruct("SendMessageResponse");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (CreatedSquareMessage != null && __isset.createdSquareMessage)
      {
        field.Name = "createdSquareMessage";
        field.Type = TType.Struct;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await CreatedSquareMessage.WriteAsync(oprot, cancellationToken);
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
    var other = that as SendMessageResponse;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.createdSquareMessage == other.__isset.createdSquareMessage) && ((!__isset.createdSquareMessage) || (System.Object.Equals(CreatedSquareMessage, other.CreatedSquareMessage))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.createdSquareMessage)
        hashcode = (hashcode * 397) + CreatedSquareMessage.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("SendMessageResponse(");
    bool __first = true;
    if (CreatedSquareMessage != null && __isset.createdSquareMessage)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("CreatedSquareMessage: ");
      CreatedSquareMessage.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

