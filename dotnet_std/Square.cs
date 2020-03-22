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



public partial class Square : TBase
{
  private string _mid;
  private string _name;
  private string _welcomeMessage;
  private string _profileImageObsHash;
  private string _desc;
  private bool _searchable;
  private SquareType _type;
  private int _categoryID;
  private string _invitationURL;
  private long _revision;
  private bool _ableToUseInvitationTicket;
  private SquareState _state;

  public string Mid
  {
    get
    {
      return _mid;
    }
    set
    {
      __isset.mid = true;
      this._mid = value;
    }
  }

  public string Name
  {
    get
    {
      return _name;
    }
    set
    {
      __isset.name = true;
      this._name = value;
    }
  }

  public string WelcomeMessage
  {
    get
    {
      return _welcomeMessage;
    }
    set
    {
      __isset.welcomeMessage = true;
      this._welcomeMessage = value;
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

  public string Desc
  {
    get
    {
      return _desc;
    }
    set
    {
      __isset.desc = true;
      this._desc = value;
    }
  }

  public bool Searchable
  {
    get
    {
      return _searchable;
    }
    set
    {
      __isset.searchable = true;
      this._searchable = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="SquareType"/>
  /// </summary>
  public SquareType Type
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

  public int CategoryID
  {
    get
    {
      return _categoryID;
    }
    set
    {
      __isset.categoryID = true;
      this._categoryID = value;
    }
  }

  public string InvitationURL
  {
    get
    {
      return _invitationURL;
    }
    set
    {
      __isset.invitationURL = true;
      this._invitationURL = value;
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

  public bool AbleToUseInvitationTicket
  {
    get
    {
      return _ableToUseInvitationTicket;
    }
    set
    {
      __isset.ableToUseInvitationTicket = true;
      this._ableToUseInvitationTicket = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="SquareState"/>
  /// </summary>
  public SquareState State
  {
    get
    {
      return _state;
    }
    set
    {
      __isset.state = true;
      this._state = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool mid;
    public bool name;
    public bool welcomeMessage;
    public bool profileImageObsHash;
    public bool desc;
    public bool searchable;
    public bool type;
    public bool categoryID;
    public bool invitationURL;
    public bool revision;
    public bool ableToUseInvitationTicket;
    public bool state;
  }

  public Square()
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
              Mid = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.String)
            {
              Name = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.String)
            {
              WelcomeMessage = await iprot.ReadStringAsync(cancellationToken);
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
            if (field.Type == TType.String)
            {
              Desc = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 6:
            if (field.Type == TType.Bool)
            {
              Searchable = await iprot.ReadBoolAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 7:
            if (field.Type == TType.I32)
            {
              Type = (SquareType)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 8:
            if (field.Type == TType.I32)
            {
              CategoryID = await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 9:
            if (field.Type == TType.String)
            {
              InvitationURL = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 10:
            if (field.Type == TType.I64)
            {
              Revision = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 11:
            if (field.Type == TType.Bool)
            {
              AbleToUseInvitationTicket = await iprot.ReadBoolAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 12:
            if (field.Type == TType.I32)
            {
              State = (SquareState)await iprot.ReadI32Async(cancellationToken);
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
      var struc = new TStruct("Square");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (Mid != null && __isset.mid)
      {
        field.Name = "mid";
        field.Type = TType.String;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Mid, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Name != null && __isset.name)
      {
        field.Name = "name";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Name, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (WelcomeMessage != null && __isset.welcomeMessage)
      {
        field.Name = "welcomeMessage";
        field.Type = TType.String;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(WelcomeMessage, cancellationToken);
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
      if (Desc != null && __isset.desc)
      {
        field.Name = "desc";
        field.Type = TType.String;
        field.ID = 5;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Desc, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.searchable)
      {
        field.Name = "searchable";
        field.Type = TType.Bool;
        field.ID = 6;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteBoolAsync(Searchable, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.type)
      {
        field.Name = "type";
        field.Type = TType.I32;
        field.ID = 7;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)Type, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.categoryID)
      {
        field.Name = "categoryID";
        field.Type = TType.I32;
        field.ID = 8;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(CategoryID, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (InvitationURL != null && __isset.invitationURL)
      {
        field.Name = "invitationURL";
        field.Type = TType.String;
        field.ID = 9;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(InvitationURL, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.revision)
      {
        field.Name = "revision";
        field.Type = TType.I64;
        field.ID = 10;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(Revision, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.ableToUseInvitationTicket)
      {
        field.Name = "ableToUseInvitationTicket";
        field.Type = TType.Bool;
        field.ID = 11;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteBoolAsync(AbleToUseInvitationTicket, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.state)
      {
        field.Name = "state";
        field.Type = TType.I32;
        field.ID = 12;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)State, cancellationToken);
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
    var other = that as Square;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.mid == other.__isset.mid) && ((!__isset.mid) || (System.Object.Equals(Mid, other.Mid))))
      && ((__isset.name == other.__isset.name) && ((!__isset.name) || (System.Object.Equals(Name, other.Name))))
      && ((__isset.welcomeMessage == other.__isset.welcomeMessage) && ((!__isset.welcomeMessage) || (System.Object.Equals(WelcomeMessage, other.WelcomeMessage))))
      && ((__isset.profileImageObsHash == other.__isset.profileImageObsHash) && ((!__isset.profileImageObsHash) || (System.Object.Equals(ProfileImageObsHash, other.ProfileImageObsHash))))
      && ((__isset.desc == other.__isset.desc) && ((!__isset.desc) || (System.Object.Equals(Desc, other.Desc))))
      && ((__isset.searchable == other.__isset.searchable) && ((!__isset.searchable) || (System.Object.Equals(Searchable, other.Searchable))))
      && ((__isset.type == other.__isset.type) && ((!__isset.type) || (System.Object.Equals(Type, other.Type))))
      && ((__isset.categoryID == other.__isset.categoryID) && ((!__isset.categoryID) || (System.Object.Equals(CategoryID, other.CategoryID))))
      && ((__isset.invitationURL == other.__isset.invitationURL) && ((!__isset.invitationURL) || (System.Object.Equals(InvitationURL, other.InvitationURL))))
      && ((__isset.revision == other.__isset.revision) && ((!__isset.revision) || (System.Object.Equals(Revision, other.Revision))))
      && ((__isset.ableToUseInvitationTicket == other.__isset.ableToUseInvitationTicket) && ((!__isset.ableToUseInvitationTicket) || (System.Object.Equals(AbleToUseInvitationTicket, other.AbleToUseInvitationTicket))))
      && ((__isset.state == other.__isset.state) && ((!__isset.state) || (System.Object.Equals(State, other.State))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.mid)
        hashcode = (hashcode * 397) + Mid.GetHashCode();
      if(__isset.name)
        hashcode = (hashcode * 397) + Name.GetHashCode();
      if(__isset.welcomeMessage)
        hashcode = (hashcode * 397) + WelcomeMessage.GetHashCode();
      if(__isset.profileImageObsHash)
        hashcode = (hashcode * 397) + ProfileImageObsHash.GetHashCode();
      if(__isset.desc)
        hashcode = (hashcode * 397) + Desc.GetHashCode();
      if(__isset.searchable)
        hashcode = (hashcode * 397) + Searchable.GetHashCode();
      if(__isset.type)
        hashcode = (hashcode * 397) + Type.GetHashCode();
      if(__isset.categoryID)
        hashcode = (hashcode * 397) + CategoryID.GetHashCode();
      if(__isset.invitationURL)
        hashcode = (hashcode * 397) + InvitationURL.GetHashCode();
      if(__isset.revision)
        hashcode = (hashcode * 397) + Revision.GetHashCode();
      if(__isset.ableToUseInvitationTicket)
        hashcode = (hashcode * 397) + AbleToUseInvitationTicket.GetHashCode();
      if(__isset.state)
        hashcode = (hashcode * 397) + State.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("Square(");
    bool __first = true;
    if (Mid != null && __isset.mid)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Mid: ");
      Mid.ToString(sb);
    }
    if (Name != null && __isset.name)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Name: ");
      Name.ToString(sb);
    }
    if (WelcomeMessage != null && __isset.welcomeMessage)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("WelcomeMessage: ");
      WelcomeMessage.ToString(sb);
    }
    if (ProfileImageObsHash != null && __isset.profileImageObsHash)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ProfileImageObsHash: ");
      ProfileImageObsHash.ToString(sb);
    }
    if (Desc != null && __isset.desc)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Desc: ");
      Desc.ToString(sb);
    }
    if (__isset.searchable)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Searchable: ");
      Searchable.ToString(sb);
    }
    if (__isset.type)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Type: ");
      Type.ToString(sb);
    }
    if (__isset.categoryID)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("CategoryID: ");
      CategoryID.ToString(sb);
    }
    if (InvitationURL != null && __isset.invitationURL)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("InvitationURL: ");
      InvitationURL.ToString(sb);
    }
    if (__isset.revision)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Revision: ");
      Revision.ToString(sb);
    }
    if (__isset.ableToUseInvitationTicket)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("AbleToUseInvitationTicket: ");
      AbleToUseInvitationTicket.ToString(sb);
    }
    if (__isset.state)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("State: ");
      State.ToString(sb);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

