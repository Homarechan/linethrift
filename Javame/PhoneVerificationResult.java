/**
 * Autogenerated by Thrift Compiler (0.14.0)
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

public class PhoneVerificationResult implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("PhoneVerificationResult");

  private static final TField VERIFICATION_RESULT_FIELD_DESC = new TField("verificationResult", TType.I32, (short)1);
  private static final TField ACCOUNT_MIGRATION_CHECK_TYPE_FIELD_DESC = new TField("accountMigrationCheckType", TType.I32, (short)2);
  private static final TField RECOMMEND_ADD_FRIENDS_FIELD_DESC = new TField("recommendAddFriends", TType.BOOL, (short)3);

  private VerificationResult verificationResult;
  private AccountMigrationCheckType accountMigrationCheckType;
  private boolean recommendAddFriends;

  // isset id assignments
  private static final int __RECOMMENDADDFRIENDS_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public PhoneVerificationResult() {
  }

  public PhoneVerificationResult(
    VerificationResult verificationResult,
    AccountMigrationCheckType accountMigrationCheckType,
    boolean recommendAddFriends)
  {
    this();
    this.verificationResult = verificationResult;
    this.accountMigrationCheckType = accountMigrationCheckType;
    this.recommendAddFriends = recommendAddFriends;
    setRecommendAddFriendsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PhoneVerificationResult(PhoneVerificationResult other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetVerificationResult()) {
      this.verificationResult = other.verificationResult;
    }
    if (other.isSetAccountMigrationCheckType()) {
      this.accountMigrationCheckType = other.accountMigrationCheckType;
    }
    this.recommendAddFriends = other.recommendAddFriends;
  }

  public PhoneVerificationResult deepCopy() {
    return new PhoneVerificationResult(this);
  }

  public void clear() {
    this.verificationResult = null;
    this.accountMigrationCheckType = null;
    setRecommendAddFriendsIsSet(false);
    this.recommendAddFriends = false;
  }

  /**
   * 
   * @see VerificationResult
   */
  public VerificationResult getVerificationResult() {
    return this.verificationResult;
  }

  /**
   * 
   * @see VerificationResult
   */
  public void setVerificationResult(VerificationResult verificationResult) {
    this.verificationResult = verificationResult;
  }

  public void unsetVerificationResult() {
    this.verificationResult = null;
  }

  /** Returns true if field verificationResult is set (has been assigned a value) and false otherwise */
  public boolean isSetVerificationResult() {
    return this.verificationResult != null;
  }

  public void setVerificationResultIsSet(boolean value) {
    if (!value) {
      this.verificationResult = null;
    }
  }

  /**
   * 
   * @see AccountMigrationCheckType
   */
  public AccountMigrationCheckType getAccountMigrationCheckType() {
    return this.accountMigrationCheckType;
  }

  /**
   * 
   * @see AccountMigrationCheckType
   */
  public void setAccountMigrationCheckType(AccountMigrationCheckType accountMigrationCheckType) {
    this.accountMigrationCheckType = accountMigrationCheckType;
  }

  public void unsetAccountMigrationCheckType() {
    this.accountMigrationCheckType = null;
  }

  /** Returns true if field accountMigrationCheckType is set (has been assigned a value) and false otherwise */
  public boolean isSetAccountMigrationCheckType() {
    return this.accountMigrationCheckType != null;
  }

  public void setAccountMigrationCheckTypeIsSet(boolean value) {
    if (!value) {
      this.accountMigrationCheckType = null;
    }
  }

  public boolean isRecommendAddFriends() {
    return this.recommendAddFriends;
  }

  public void setRecommendAddFriends(boolean recommendAddFriends) {
    this.recommendAddFriends = recommendAddFriends;
    setRecommendAddFriendsIsSet(true);
  }

  public void unsetRecommendAddFriends() {
    __isset_vector[__RECOMMENDADDFRIENDS_ISSET_ID] = false;
  }

  /** Returns true if field recommendAddFriends is set (has been assigned a value) and false otherwise */
  public boolean isSetRecommendAddFriends() {
    return __isset_vector[__RECOMMENDADDFRIENDS_ISSET_ID];
  }

  public void setRecommendAddFriendsIsSet(boolean value) {
    __isset_vector[__RECOMMENDADDFRIENDS_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PhoneVerificationResult)
      return this.equals((PhoneVerificationResult)that);
    return false;
  }

  public boolean equals(PhoneVerificationResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_verificationResult = true && this.isSetVerificationResult();
    boolean that_present_verificationResult = true && that.isSetVerificationResult();
    if (this_present_verificationResult || that_present_verificationResult) {
      if (!(this_present_verificationResult && that_present_verificationResult))
        return false;
      if (!this.verificationResult.equals(that.verificationResult))
        return false;
    }

    boolean this_present_accountMigrationCheckType = true && this.isSetAccountMigrationCheckType();
    boolean that_present_accountMigrationCheckType = true && that.isSetAccountMigrationCheckType();
    if (this_present_accountMigrationCheckType || that_present_accountMigrationCheckType) {
      if (!(this_present_accountMigrationCheckType && that_present_accountMigrationCheckType))
        return false;
      if (!this.accountMigrationCheckType.equals(that.accountMigrationCheckType))
        return false;
    }

    boolean this_present_recommendAddFriends = true;
    boolean that_present_recommendAddFriends = true;
    if (this_present_recommendAddFriends || that_present_recommendAddFriends) {
      if (!(this_present_recommendAddFriends && that_present_recommendAddFriends))
        return false;
      if (this.recommendAddFriends != that.recommendAddFriends)
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

    PhoneVerificationResult other = (PhoneVerificationResult)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetVerificationResult(), other.isSetVerificationResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVerificationResult()) {
      lastComparison = TBaseHelper.compareTo(this.verificationResult, other.verificationResult);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetAccountMigrationCheckType(), other.isSetAccountMigrationCheckType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccountMigrationCheckType()) {
      lastComparison = TBaseHelper.compareTo(this.accountMigrationCheckType, other.accountMigrationCheckType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetRecommendAddFriends(), other.isSetRecommendAddFriends());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecommendAddFriends()) {
      lastComparison = TBaseHelper.compareTo(this.recommendAddFriends, other.recommendAddFriends);
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
        case 1: // VERIFICATION_RESULT
          if (field.type == TType.I32) {
            this.verificationResult = VerificationResult.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // ACCOUNT_MIGRATION_CHECK_TYPE
          if (field.type == TType.I32) {
            this.accountMigrationCheckType = AccountMigrationCheckType.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // RECOMMEND_ADD_FRIENDS
          if (field.type == TType.BOOL) {
            this.recommendAddFriends = iprot.readBool();
            setRecommendAddFriendsIsSet(true);
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
    if (this.verificationResult != null) {
      oprot.writeFieldBegin(VERIFICATION_RESULT_FIELD_DESC);
      oprot.writeI32(this.verificationResult.getValue());
      oprot.writeFieldEnd();
    }
    if (this.accountMigrationCheckType != null) {
      oprot.writeFieldBegin(ACCOUNT_MIGRATION_CHECK_TYPE_FIELD_DESC);
      oprot.writeI32(this.accountMigrationCheckType.getValue());
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(RECOMMEND_ADD_FRIENDS_FIELD_DESC);
    oprot.writeBool(this.recommendAddFriends);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("PhoneVerificationResult(");
    boolean first = true;

    sb.append("verificationResult:");
    if (this.verificationResult == null) {
      sb.append("null");
    } else {
      sb.append(this.verificationResult);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("accountMigrationCheckType:");
    if (this.accountMigrationCheckType == null) {
      sb.append("null");
    } else {
      sb.append(this.accountMigrationCheckType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("recommendAddFriends:");
    sb.append(this.recommendAddFriends);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

