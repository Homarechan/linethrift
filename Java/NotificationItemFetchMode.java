/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

public enum NotificationItemFetchMode implements org.apache.thrift.TEnum {
  ALL(0),
  APPEND(1);

  private final int value;

  private NotificationItemFetchMode(int value) {
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
  public static NotificationItemFetchMode findByValue(int value) { 
    switch (value) {
      case 0:
        return ALL;
      case 1:
        return APPEND;
      default:
        return null;
    }
  }
}
