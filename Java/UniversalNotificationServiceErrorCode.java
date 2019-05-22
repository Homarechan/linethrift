/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

public enum UniversalNotificationServiceErrorCode implements org.apache.thrift.TEnum {
  INTERNAL_ERROR(0),
  INVALID_KEY(1),
  ILLEGAL_ARGUMENT(2),
  TOO_MANY_REQUEST(3),
  AUTHENTICATION_FAILED(4),
  NO_WRITE_PERMISSION(5);

  private final int value;

  private UniversalNotificationServiceErrorCode(int value) {
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
  public static UniversalNotificationServiceErrorCode findByValue(int value) { 
    switch (value) {
      case 0:
        return INTERNAL_ERROR;
      case 1:
        return INVALID_KEY;
      case 2:
        return ILLEGAL_ARGUMENT;
      case 3:
        return TOO_MANY_REQUEST;
      case 4:
        return AUTHENTICATION_FAILED;
      case 5:
        return NO_WRITE_PERMISSION;
      default:
        return null;
    }
  }
}