/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

public enum MediaType implements org.apache.thrift.TEnum {
  AUDIO(1),
  VIDEO(2);

  private final int value;

  private MediaType(int value) {
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
  public static MediaType findByValue(int value) { 
    switch (value) {
      case 1:
        return AUDIO;
      case 2:
        return VIDEO;
      default:
        return null;
    }
  }
}
