/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class PaymentType implements org.apache.thrift.TEnum {

  public static final PaymentType PAYMENT_APPLE = new PaymentType(1);
  public static final PaymentType PAYMENT_GOOGLE = new PaymentType(2);

  private final int value;

  private PaymentType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static PaymentType findByValue(int value) { 
    switch (value) {
      case 1:
        return PAYMENT_APPLE;
      case 2:
        return PAYMENT_GOOGLE;
      default:
        return null;
    }
  }
}
