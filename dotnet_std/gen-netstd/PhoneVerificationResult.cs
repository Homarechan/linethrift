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



public partial class PhoneVerificationResult : TBase
{
  private VerificationResult _verificationResult;
  private AccountMigrationCheckType _accountMigrationCheckType;
  private bool _recommendAddFriends;

  /// <summary>
  /// 
  /// <seealso cref="VerificationResult"/>
  /// </summary>
  public VerificationResult VerificationResult
  {
    get
    {
      return _verificationResult;
    }
    set
    {
      __isset.verificationResult = true;
      this._verificationResult = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="AccountMigrationCheckType"/>
  /// </summary>
  public AccountMigrationCheckType AccountMigrationCheckType
  {
    get
    {
      return _accountMigrationCheckType;
    }
    set
    {
      __isset.accountMigrationCheckType = true;
      this._accountMigrationCheckType = value;
    }
  }

  public bool RecommendAddFriends
  {
    get
    {
      return _recommendAddFriends;
    }
    set
    {
      __isset.recommendAddFriends = true;
      this._recommendAddFriends = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool verificationResult;
    public bool accountMigrationCheckType;
    public bool recommendAddFriends;
  }

  public PhoneVerificationResult()
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
              VerificationResult = (VerificationResult)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.I32)
            {
              AccountMigrationCheckType = (AccountMigrationCheckType)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.Bool)
            {
              RecommendAddFriends = await iprot.ReadBoolAsync(cancellationToken);
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
      var struc = new TStruct("PhoneVerificationResult");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (__isset.verificationResult)
      {
        field.Name = "verificationResult";
        field.Type = TType.I32;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)VerificationResult, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.accountMigrationCheckType)
      {
        field.Name = "accountMigrationCheckType";
        field.Type = TType.I32;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)AccountMigrationCheckType, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.recommendAddFriends)
      {
        field.Name = "recommendAddFriends";
        field.Type = TType.Bool;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteBoolAsync(RecommendAddFriends, cancellationToken);
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
    var other = that as PhoneVerificationResult;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.verificationResult == other.__isset.verificationResult) && ((!__isset.verificationResult) || (System.Object.Equals(VerificationResult, other.VerificationResult))))
      && ((__isset.accountMigrationCheckType == other.__isset.accountMigrationCheckType) && ((!__isset.accountMigrationCheckType) || (System.Object.Equals(AccountMigrationCheckType, other.AccountMigrationCheckType))))
      && ((__isset.recommendAddFriends == other.__isset.recommendAddFriends) && ((!__isset.recommendAddFriends) || (System.Object.Equals(RecommendAddFriends, other.RecommendAddFriends))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.verificationResult)
        hashcode = (hashcode * 397) + VerificationResult.GetHashCode();
      if(__isset.accountMigrationCheckType)
        hashcode = (hashcode * 397) + AccountMigrationCheckType.GetHashCode();
      if(__isset.recommendAddFriends)
        hashcode = (hashcode * 397) + RecommendAddFriends.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("PhoneVerificationResult(");
    bool __first = true;
    if (__isset.verificationResult)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("VerificationResult: ");
      VerificationResult.ToString(sb);
    }
    if (__isset.accountMigrationCheckType)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("AccountMigrationCheckType: ");
      AccountMigrationCheckType.ToString(sb);
    }
    if (__isset.recommendAddFriends)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("RecommendAddFriends: ");
      RecommendAddFriends.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

