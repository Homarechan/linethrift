/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class RoomAttribute implements org.apache.thrift.TEnum {

  public static final RoomAttribute ALL = new RoomAttribute(255);
  public static final RoomAttribute NOTIFICATION_SETTING = new RoomAttribute(1);

  private final int value;

  private RoomAttribute(int value) {
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
  public static RoomAttribute findByValue(int value) { 
    switch (value) {
      case 255:
        return ALL;
      case 1:
        return NOTIFICATION_SETTING;
      default:
        return null;
    }
  }
}
