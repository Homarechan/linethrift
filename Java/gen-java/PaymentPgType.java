/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public enum PaymentPgType implements org.apache.thrift.TEnum {
  PAYMENT_PG_NONE(0),
  PAYMENT_PG_AU(1),
  PAYMENT_PG_AL(2);

  private final int value;

  private PaymentPgType(int value) {
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
  @org.apache.thrift.annotation.Nullable
  public static PaymentPgType findByValue(int value) { 
    switch (value) {
      case 0:
        return PAYMENT_PG_NONE;
      case 1:
        return PAYMENT_PG_AU;
      case 2:
        return PAYMENT_PG_AL;
      default:
        return null;
    }
  }
}
