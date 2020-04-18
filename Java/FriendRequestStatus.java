/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

public enum FriendRequestStatus implements org.apache.thrift.TEnum {
  NONE(0),
  AVAILABLE(1),
  ALREADY_REQUESTED(2),
  UNAVAILABLE(3);

  private final int value;

  private FriendRequestStatus(int value) {
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
  public static FriendRequestStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return NONE;
      case 1:
        return AVAILABLE;
      case 2:
        return ALREADY_REQUESTED;
      case 3:
        return UNAVAILABLE;
      default:
        return null;
    }
  }
}
