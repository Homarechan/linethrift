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



public partial class SquareMember : TBase
{
  private string _squareMemberMid;
  private string _squareMid;
  private string _displayName;
  private string _profileImageObsHash;
  private bool _ableToReceiveMessage;
  private SquareMembershipState _membershipState;
  private SquareMemberRole _role;
  private long _revision;
  private SquarePreference _preference;
  private string _joinMessage;

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

  public string SquareMid
  {
    get
    {
      return _squareMid;
    }
    set
    {
      __isset.squareMid = true;
      this._squareMid = value;
    }
  }

  public string DisplayName
  {
    get
    {
      return _displayName;
    }
    set
    {
      __isset.displayName = true;
      this._displayName = value;
    }
  }

  public string ProfileImageObsHash
  {
    get
    {
      return _profileImageObsHash;
    }
    set
    {
      __isset.profileImageObsHash = true;
      this._profileImageObsHash = value;
    }
  }

  public bool AbleToReceiveMessage
  {
    get
    {
      return _ableToReceiveMessage;
    }
    set
    {
      __isset.ableToReceiveMessage = true;
      this._ableToReceiveMessage = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="SquareMembershipState"/>
  /// </summary>
  public SquareMembershipState MembershipState
  {
    get
    {
      return _membershipState;
    }
    set
    {
      __isset.membershipState = true;
      this._membershipState = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="SquareMemberRole"/>
  /// </summary>
  public SquareMemberRole Role
  {
    get
    {
      return _role;
    }
    set
    {
      __isset.role = true;
      this._role = value;
    }
  }

  public long Revision
  {
    get
    {
      return _revision;
    }
    set
    {
      __isset.revision = true;
      this._revision = value;
    }
  }

  public SquarePreference Preference
  {
    get
    {
      return _preference;
    }
    set
    {
      __isset.preference = true;
      this._preference = value;
    }
  }

  public string JoinMessage
  {
    get
    {
      return _joinMessage;
    }
    set
    {
      __isset.joinMessage = true;
      this._joinMessage = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool squareMemberMid;
    public bool squareMid;
    public bool displayName;
    public bool profileImageObsHash;
    public bool ableToReceiveMessage;
    public bool membershipState;
    public bool role;
    public bool revision;
    public bool preference;
    public bool joinMessage;
  }

  public SquareMember()
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
              SquareMemberMid = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.String)
            {
              SquareMid = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.String)
            {
              DisplayName = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.String)
            {
              ProfileImageObsHash = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 5:
            if (field.Type == TType.Bool)
            {
              AbleToReceiveMessage = await iprot.ReadBoolAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 7:
            if (field.Type == TType.I32)
            {
              MembershipState = (SquareMembershipState)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 8:
            if (field.Type == TType.I32)
            {
              Role = (SquareMemberRole)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 9:
            if (field.Type == TType.I64)
            {
              Revision = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 10:
            if (field.Type == TType.Struct)
            {
              Preference = new SquarePreference();
              await Preference.ReadAsync(iprot, cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 11:
            if (field.Type == TType.String)
            {
              JoinMessage = await iprot.ReadStringAsync(cancellationToken);
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
      var struc = new TStruct("SquareMember");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (SquareMemberMid != null && __isset.squareMemberMid)
      {
        field.Name = "squareMemberMid";
        field.Type = TType.String;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(SquareMemberMid, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (SquareMid != null && __isset.squareMid)
      {
        field.Name = "squareMid";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(SquareMid, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (DisplayName != null && __isset.displayName)
      {
        field.Name = "displayName";
        field.Type = TType.String;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(DisplayName, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (ProfileImageObsHash != null && __isset.profileImageObsHash)
      {
        field.Name = "profileImageObsHash";
        field.Type = TType.String;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(ProfileImageObsHash, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.ableToReceiveMessage)
      {
        field.Name = "ableToReceiveMessage";
        field.Type = TType.Bool;
        field.ID = 5;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteBoolAsync(AbleToReceiveMessage, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.membershipState)
      {
        field.Name = "membershipState";
        field.Type = TType.I32;
        field.ID = 7;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)MembershipState, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.role)
      {
        field.Name = "role";
        field.Type = TType.I32;
        field.ID = 8;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)Role, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.revision)
      {
        field.Name = "revision";
        field.Type = TType.I64;
        field.ID = 9;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(Revision, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Preference != null && __isset.preference)
      {
        field.Name = "preference";
        field.Type = TType.Struct;
        field.ID = 10;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await Preference.WriteAsync(oprot, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (JoinMessage != null && __isset.joinMessage)
      {
        field.Name = "joinMessage";
        field.Type = TType.String;
        field.ID = 11;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(JoinMessage, cancellationToken);
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
    var other = that as SquareMember;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.squareMemberMid == other.__isset.squareMemberMid) && ((!__isset.squareMemberMid) || (System.Object.Equals(SquareMemberMid, other.SquareMemberMid))))
      && ((__isset.squareMid == other.__isset.squareMid) && ((!__isset.squareMid) || (System.Object.Equals(SquareMid, other.SquareMid))))
      && ((__isset.displayName == other.__isset.displayName) && ((!__isset.displayName) || (System.Object.Equals(DisplayName, other.DisplayName))))
      && ((__isset.profileImageObsHash == other.__isset.profileImageObsHash) && ((!__isset.profileImageObsHash) || (System.Object.Equals(ProfileImageObsHash, other.ProfileImageObsHash))))
      && ((__isset.ableToReceiveMessage == other.__isset.ableToReceiveMessage) && ((!__isset.ableToReceiveMessage) || (System.Object.Equals(AbleToReceiveMessage, other.AbleToReceiveMessage))))
      && ((__isset.membershipState == other.__isset.membershipState) && ((!__isset.membershipState) || (System.Object.Equals(MembershipState, other.MembershipState))))
      && ((__isset.role == other.__isset.role) && ((!__isset.role) || (System.Object.Equals(Role, other.Role))))
      && ((__isset.revision == other.__isset.revision) && ((!__isset.revision) || (System.Object.Equals(Revision, other.Revision))))
      && ((__isset.preference == other.__isset.preference) && ((!__isset.preference) || (System.Object.Equals(Preference, other.Preference))))
      && ((__isset.joinMessage == other.__isset.joinMessage) && ((!__isset.joinMessage) || (System.Object.Equals(JoinMessage, other.JoinMessage))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.squareMemberMid)
        hashcode = (hashcode * 397) + SquareMemberMid.GetHashCode();
      if(__isset.squareMid)
        hashcode = (hashcode * 397) + SquareMid.GetHashCode();
      if(__isset.displayName)
        hashcode = (hashcode * 397) + DisplayName.GetHashCode();
      if(__isset.profileImageObsHash)
        hashcode = (hashcode * 397) + ProfileImageObsHash.GetHashCode();
      if(__isset.ableToReceiveMessage)
        hashcode = (hashcode * 397) + AbleToReceiveMessage.GetHashCode();
      if(__isset.membershipState)
        hashcode = (hashcode * 397) + MembershipState.GetHashCode();
      if(__isset.role)
        hashcode = (hashcode * 397) + Role.GetHashCode();
      if(__isset.revision)
        hashcode = (hashcode * 397) + Revision.GetHashCode();
      if(__isset.preference)
        hashcode = (hashcode * 397) + Preference.GetHashCode();
      if(__isset.joinMessage)
        hashcode = (hashcode * 397) + JoinMessage.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("SquareMember(");
    bool __first = true;
    if (SquareMemberMid != null && __isset.squareMemberMid)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareMemberMid: ");
      SquareMemberMid.ToString(sb);
    }
    if (SquareMid != null && __isset.squareMid)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareMid: ");
      SquareMid.ToString(sb);
    }
    if (DisplayName != null && __isset.displayName)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("DisplayName: ");
      DisplayName.ToString(sb);
    }
    if (ProfileImageObsHash != null && __isset.profileImageObsHash)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ProfileImageObsHash: ");
      ProfileImageObsHash.ToString(sb);
    }
    if (__isset.ableToReceiveMessage)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("AbleToReceiveMessage: ");
      AbleToReceiveMessage.ToString(sb);
    }
    if (__isset.membershipState)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("MembershipState: ");
      MembershipState.ToString(sb);
    }
    if (__isset.role)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Role: ");
      Role.ToString(sb);
    }
    if (__isset.revision)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Revision: ");
      Revision.ToString(sb);
    }
    if (Preference != null && __isset.preference)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Preference: ");
      Preference.ToString(sb);
    }
    if (JoinMessage != null && __isset.joinMessage)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("JoinMessage: ");
      JoinMessage.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

