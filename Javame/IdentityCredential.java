/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import java.util.Hashtable;
import java.util.Vector;
import java.util.Enumeration;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class IdentityCredential implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("IdentityCredential");

  private static final TField PROVIDER_FIELD_DESC = new TField("provider", TType.I32, (short)1);
  private static final TField IDENTIFIER_FIELD_DESC = new TField("identifier", TType.STRING, (short)2);
  private static final TField PASSWORD_FIELD_DESC = new TField("password", TType.STRING, (short)3);

  private IdentityProvider provider;
  private String identifier;
  private String password;

  // isset id assignments

  public IdentityCredential() {
  }

  public IdentityCredential(
    IdentityProvider provider,
    String identifier,
    String password)
  {
    this();
    this.provider = provider;
    this.identifier = identifier;
    this.password = password;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public IdentityCredential(IdentityCredential other) {
    if (other.isSetProvider()) {
      this.provider = other.provider;
    }
    if (other.isSetIdentifier()) {
      this.identifier = other.identifier;
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
  }

  public IdentityCredential deepCopy() {
    return new IdentityCredential(this);
  }

  public void clear() {
    this.provider = null;
    this.identifier = null;
    this.password = null;
  }

  /**
   * 
   * @see IdentityProvider
   */
  public IdentityProvider getProvider() {
    return this.provider;
  }

  /**
   * 
   * @see IdentityProvider
   */
  public void setProvider(IdentityProvider provider) {
    this.provider = provider;
  }

  public void unsetProvider() {
    this.provider = null;
  }

  /** Returns true if field provider is set (has been assigned a value) and false otherwise */
  public boolean isSetProvider() {
    return this.provider != null;
  }

  public void setProviderIsSet(boolean value) {
    if (!value) {
      this.provider = null;
    }
  }

  public String getIdentifier() {
    return this.identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public void unsetIdentifier() {
    this.identifier = null;
  }

  /** Returns true if field identifier is set (has been assigned a value) and false otherwise */
  public boolean isSetIdentifier() {
    return this.identifier != null;
  }

  public void setIdentifierIsSet(boolean value) {
    if (!value) {
      this.identifier = null;
    }
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been assigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof IdentityCredential)
      return this.equals((IdentityCredential)that);
    return false;
  }

  public boolean equals(IdentityCredential that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_provider = true && this.isSetProvider();
    boolean that_present_provider = true && that.isSetProvider();
    if (this_present_provider || that_present_provider) {
      if (!(this_present_provider && that_present_provider))
        return false;
      if (!this.provider.equals(that.provider))
        return false;
    }

    boolean this_present_identifier = true && this.isSetIdentifier();
    boolean that_present_identifier = true && that.isSetIdentifier();
    if (this_present_identifier || that_present_identifier) {
      if (!(this_present_identifier && that_present_identifier))
        return false;
      if (!this.identifier.equals(that.identifier))
        return false;
    }

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
        return false;
    }

    return true;
  }

  public int hashCode() {
    return 0;
  }

  public int compareTo(Object otherObject) {
    if (!getClass().equals(otherObject.getClass())) {
      return getClass().getName().compareTo(otherObject.getClass().getName());
    }

    IdentityCredential other = (IdentityCredential)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetProvider(), other.isSetProvider());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProvider()) {
      lastComparison = TBaseHelper.compareTo(this.provider, other.provider);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetIdentifier(), other.isSetIdentifier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdentifier()) {
      lastComparison = TBaseHelper.compareTo(this.identifier, other.identifier);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetPassword(), other.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = TBaseHelper.compareTo(this.password, other.password);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // PROVIDER
          if (field.type == TType.I32) {
            this.provider = IdentityProvider.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // IDENTIFIER
          if (field.type == TType.STRING) {
            this.identifier = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // PASSWORD
          if (field.type == TType.STRING) {
            this.password = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.provider != null) {
      oprot.writeFieldBegin(PROVIDER_FIELD_DESC);
      oprot.writeI32(this.provider.getValue());
      oprot.writeFieldEnd();
    }
    if (this.identifier != null) {
      oprot.writeFieldBegin(IDENTIFIER_FIELD_DESC);
      oprot.writeString(this.identifier);
      oprot.writeFieldEnd();
    }
    if (this.password != null) {
      oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
      oprot.writeString(this.password);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("IdentityCredential(");
    boolean first = true;

    sb.append("provider:");
    if (this.provider == null) {
      sb.append("null");
    } else {
      sb.append(this.provider);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("identifier:");
    if (this.identifier == null) {
      sb.append("null");
    } else {
      sb.append(this.identifier);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("password:");
    if (this.password == null) {
      sb.append("null");
    } else {
      sb.append(this.password);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

