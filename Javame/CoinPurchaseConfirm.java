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

public class CoinPurchaseConfirm implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("CoinPurchaseConfirm");

  private static final TField ORDER_ID_FIELD_DESC = new TField("orderId", TType.STRING, (short)1);
  private static final TField APP_STORE_CODE_FIELD_DESC = new TField("appStoreCode", TType.I32, (short)2);
  private static final TField RECEIPT_FIELD_DESC = new TField("receipt", TType.STRING, (short)3);
  private static final TField SIGNATURE_FIELD_DESC = new TField("signature", TType.STRING, (short)4);
  private static final TField SELLER_FIELD_DESC = new TField("seller", TType.STRING, (short)5);
  private static final TField REQUEST_TYPE_FIELD_DESC = new TField("requestType", TType.STRING, (short)6);
  private static final TField IGNORE_RECEIPT_FIELD_DESC = new TField("ignoreReceipt", TType.BOOL, (short)7);

  private String orderId;
  private PaymentType appStoreCode;
  private String receipt;
  private String signature;
  private String seller;
  private String requestType;
  private boolean ignoreReceipt;

  // isset id assignments
  private static final int __IGNORERECEIPT_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public CoinPurchaseConfirm() {
  }

  public CoinPurchaseConfirm(
    String orderId,
    PaymentType appStoreCode,
    String receipt,
    String signature,
    String seller,
    String requestType,
    boolean ignoreReceipt)
  {
    this();
    this.orderId = orderId;
    this.appStoreCode = appStoreCode;
    this.receipt = receipt;
    this.signature = signature;
    this.seller = seller;
    this.requestType = requestType;
    this.ignoreReceipt = ignoreReceipt;
    setIgnoreReceiptIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CoinPurchaseConfirm(CoinPurchaseConfirm other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetOrderId()) {
      this.orderId = other.orderId;
    }
    if (other.isSetAppStoreCode()) {
      this.appStoreCode = other.appStoreCode;
    }
    if (other.isSetReceipt()) {
      this.receipt = other.receipt;
    }
    if (other.isSetSignature()) {
      this.signature = other.signature;
    }
    if (other.isSetSeller()) {
      this.seller = other.seller;
    }
    if (other.isSetRequestType()) {
      this.requestType = other.requestType;
    }
    this.ignoreReceipt = other.ignoreReceipt;
  }

  public CoinPurchaseConfirm deepCopy() {
    return new CoinPurchaseConfirm(this);
  }

  public void clear() {
    this.orderId = null;
    this.appStoreCode = null;
    this.receipt = null;
    this.signature = null;
    this.seller = null;
    this.requestType = null;
    setIgnoreReceiptIsSet(false);
    this.ignoreReceipt = false;
  }

  public String getOrderId() {
    return this.orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public void unsetOrderId() {
    this.orderId = null;
  }

  /** Returns true if field orderId is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderId() {
    return this.orderId != null;
  }

  public void setOrderIdIsSet(boolean value) {
    if (!value) {
      this.orderId = null;
    }
  }

  /**
   * 
   * @see PaymentType
   */
  public PaymentType getAppStoreCode() {
    return this.appStoreCode;
  }

  /**
   * 
   * @see PaymentType
   */
  public void setAppStoreCode(PaymentType appStoreCode) {
    this.appStoreCode = appStoreCode;
  }

  public void unsetAppStoreCode() {
    this.appStoreCode = null;
  }

  /** Returns true if field appStoreCode is set (has been assigned a value) and false otherwise */
  public boolean isSetAppStoreCode() {
    return this.appStoreCode != null;
  }

  public void setAppStoreCodeIsSet(boolean value) {
    if (!value) {
      this.appStoreCode = null;
    }
  }

  public String getReceipt() {
    return this.receipt;
  }

  public void setReceipt(String receipt) {
    this.receipt = receipt;
  }

  public void unsetReceipt() {
    this.receipt = null;
  }

  /** Returns true if field receipt is set (has been assigned a value) and false otherwise */
  public boolean isSetReceipt() {
    return this.receipt != null;
  }

  public void setReceiptIsSet(boolean value) {
    if (!value) {
      this.receipt = null;
    }
  }

  public String getSignature() {
    return this.signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public void unsetSignature() {
    this.signature = null;
  }

  /** Returns true if field signature is set (has been assigned a value) and false otherwise */
  public boolean isSetSignature() {
    return this.signature != null;
  }

  public void setSignatureIsSet(boolean value) {
    if (!value) {
      this.signature = null;
    }
  }

  public String getSeller() {
    return this.seller;
  }

  public void setSeller(String seller) {
    this.seller = seller;
  }

  public void unsetSeller() {
    this.seller = null;
  }

  /** Returns true if field seller is set (has been assigned a value) and false otherwise */
  public boolean isSetSeller() {
    return this.seller != null;
  }

  public void setSellerIsSet(boolean value) {
    if (!value) {
      this.seller = null;
    }
  }

  public String getRequestType() {
    return this.requestType;
  }

  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }

  public void unsetRequestType() {
    this.requestType = null;
  }

  /** Returns true if field requestType is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestType() {
    return this.requestType != null;
  }

  public void setRequestTypeIsSet(boolean value) {
    if (!value) {
      this.requestType = null;
    }
  }

  public boolean isIgnoreReceipt() {
    return this.ignoreReceipt;
  }

  public void setIgnoreReceipt(boolean ignoreReceipt) {
    this.ignoreReceipt = ignoreReceipt;
    setIgnoreReceiptIsSet(true);
  }

  public void unsetIgnoreReceipt() {
    __isset_vector[__IGNORERECEIPT_ISSET_ID] = false;
  }

  /** Returns true if field ignoreReceipt is set (has been assigned a value) and false otherwise */
  public boolean isSetIgnoreReceipt() {
    return __isset_vector[__IGNORERECEIPT_ISSET_ID];
  }

  public void setIgnoreReceiptIsSet(boolean value) {
    __isset_vector[__IGNORERECEIPT_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CoinPurchaseConfirm)
      return this.equals((CoinPurchaseConfirm)that);
    return false;
  }

  public boolean equals(CoinPurchaseConfirm that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_orderId = true && this.isSetOrderId();
    boolean that_present_orderId = true && that.isSetOrderId();
    if (this_present_orderId || that_present_orderId) {
      if (!(this_present_orderId && that_present_orderId))
        return false;
      if (!this.orderId.equals(that.orderId))
        return false;
    }

    boolean this_present_appStoreCode = true && this.isSetAppStoreCode();
    boolean that_present_appStoreCode = true && that.isSetAppStoreCode();
    if (this_present_appStoreCode || that_present_appStoreCode) {
      if (!(this_present_appStoreCode && that_present_appStoreCode))
        return false;
      if (!this.appStoreCode.equals(that.appStoreCode))
        return false;
    }

    boolean this_present_receipt = true && this.isSetReceipt();
    boolean that_present_receipt = true && that.isSetReceipt();
    if (this_present_receipt || that_present_receipt) {
      if (!(this_present_receipt && that_present_receipt))
        return false;
      if (!this.receipt.equals(that.receipt))
        return false;
    }

    boolean this_present_signature = true && this.isSetSignature();
    boolean that_present_signature = true && that.isSetSignature();
    if (this_present_signature || that_present_signature) {
      if (!(this_present_signature && that_present_signature))
        return false;
      if (!this.signature.equals(that.signature))
        return false;
    }

    boolean this_present_seller = true && this.isSetSeller();
    boolean that_present_seller = true && that.isSetSeller();
    if (this_present_seller || that_present_seller) {
      if (!(this_present_seller && that_present_seller))
        return false;
      if (!this.seller.equals(that.seller))
        return false;
    }

    boolean this_present_requestType = true && this.isSetRequestType();
    boolean that_present_requestType = true && that.isSetRequestType();
    if (this_present_requestType || that_present_requestType) {
      if (!(this_present_requestType && that_present_requestType))
        return false;
      if (!this.requestType.equals(that.requestType))
        return false;
    }

    boolean this_present_ignoreReceipt = true;
    boolean that_present_ignoreReceipt = true;
    if (this_present_ignoreReceipt || that_present_ignoreReceipt) {
      if (!(this_present_ignoreReceipt && that_present_ignoreReceipt))
        return false;
      if (this.ignoreReceipt != that.ignoreReceipt)
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

    CoinPurchaseConfirm other = (CoinPurchaseConfirm)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetOrderId(), other.isSetOrderId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderId()) {
      lastComparison = TBaseHelper.compareTo(this.orderId, other.orderId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetAppStoreCode(), other.isSetAppStoreCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppStoreCode()) {
      lastComparison = TBaseHelper.compareTo(this.appStoreCode, other.appStoreCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetReceipt(), other.isSetReceipt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReceipt()) {
      lastComparison = TBaseHelper.compareTo(this.receipt, other.receipt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSignature(), other.isSetSignature());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSignature()) {
      lastComparison = TBaseHelper.compareTo(this.signature, other.signature);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSeller(), other.isSetSeller());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSeller()) {
      lastComparison = TBaseHelper.compareTo(this.seller, other.seller);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetRequestType(), other.isSetRequestType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestType()) {
      lastComparison = TBaseHelper.compareTo(this.requestType, other.requestType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetIgnoreReceipt(), other.isSetIgnoreReceipt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIgnoreReceipt()) {
      lastComparison = TBaseHelper.compareTo(this.ignoreReceipt, other.ignoreReceipt);
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
        case 1: // ORDER_ID
          if (field.type == TType.STRING) {
            this.orderId = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // APP_STORE_CODE
          if (field.type == TType.I32) {
            this.appStoreCode = PaymentType.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // RECEIPT
          if (field.type == TType.STRING) {
            this.receipt = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // SIGNATURE
          if (field.type == TType.STRING) {
            this.signature = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // SELLER
          if (field.type == TType.STRING) {
            this.seller = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // REQUEST_TYPE
          if (field.type == TType.STRING) {
            this.requestType = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // IGNORE_RECEIPT
          if (field.type == TType.BOOL) {
            this.ignoreReceipt = iprot.readBool();
            setIgnoreReceiptIsSet(true);
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
    if (this.orderId != null) {
      oprot.writeFieldBegin(ORDER_ID_FIELD_DESC);
      oprot.writeString(this.orderId);
      oprot.writeFieldEnd();
    }
    if (this.appStoreCode != null) {
      oprot.writeFieldBegin(APP_STORE_CODE_FIELD_DESC);
      oprot.writeI32(this.appStoreCode.getValue());
      oprot.writeFieldEnd();
    }
    if (this.receipt != null) {
      oprot.writeFieldBegin(RECEIPT_FIELD_DESC);
      oprot.writeString(this.receipt);
      oprot.writeFieldEnd();
    }
    if (this.signature != null) {
      oprot.writeFieldBegin(SIGNATURE_FIELD_DESC);
      oprot.writeString(this.signature);
      oprot.writeFieldEnd();
    }
    if (this.seller != null) {
      oprot.writeFieldBegin(SELLER_FIELD_DESC);
      oprot.writeString(this.seller);
      oprot.writeFieldEnd();
    }
    if (this.requestType != null) {
      oprot.writeFieldBegin(REQUEST_TYPE_FIELD_DESC);
      oprot.writeString(this.requestType);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(IGNORE_RECEIPT_FIELD_DESC);
    oprot.writeBool(this.ignoreReceipt);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("CoinPurchaseConfirm(");
    boolean first = true;

    sb.append("orderId:");
    if (this.orderId == null) {
      sb.append("null");
    } else {
      sb.append(this.orderId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("appStoreCode:");
    if (this.appStoreCode == null) {
      sb.append("null");
    } else {
      sb.append(this.appStoreCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("receipt:");
    if (this.receipt == null) {
      sb.append("null");
    } else {
      sb.append(this.receipt);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("signature:");
    if (this.signature == null) {
      sb.append("null");
    } else {
      sb.append(this.signature);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("seller:");
    if (this.seller == null) {
      sb.append("null");
    } else {
      sb.append(this.seller);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("requestType:");
    if (this.requestType == null) {
      sb.append("null");
    } else {
      sb.append(this.requestType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ignoreReceipt:");
    sb.append(this.ignoreReceipt);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

