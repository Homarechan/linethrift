/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class PaidCallerIdStatus implements org.apache.thrift.TEnum {

  public static final PaidCallerIdStatus NOT_SPECIFIED = new PaidCallerIdStatus(0);
  public static final PaidCallerIdStatus VALID = new PaidCallerIdStatus(1);
  public static final PaidCallerIdStatus VERIFICATION_REQUIRED = new PaidCallerIdStatus(2);
  public static final PaidCallerIdStatus NOT_PERMITTED = new PaidCallerIdStatus(3);
  public static final PaidCallerIdStatus LIMIT_EXCEEDED = new PaidCallerIdStatus(4);
  public static final PaidCallerIdStatus LIMIT_EXCEEDED_AND_VERIFICATION_REQUIRED = new PaidCallerIdStatus(5);

  private final int value;

  private PaidCallerIdStatus(int value) {
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
  public static PaidCallerIdStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return NOT_SPECIFIED;
      case 1:
        return VALID;
      case 2:
        return VERIFICATION_REQUIRED;
      case 3:
        return NOT_PERMITTED;
      case 4:
        return LIMIT_EXCEEDED;
      case 5:
        return LIMIT_EXCEEDED_AND_VERIFICATION_REQUIRED;
      default:
        return null;
    }
  }
}
