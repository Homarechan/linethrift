/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public enum ContactAttribute implements org.apache.thrift.TEnum {
  CONTACT_ATTRIBUTE_CAPABLE_VOICE_CALL(1),
  CONTACT_ATTRIBUTE_CAPABLE_VIDEO_CALL(2),
  CONTACT_ATTRIBUTE_CAPABLE_MY_HOME(16),
  CONTACT_ATTRIBUTE_CAPABLE_BUDDY(32);

  private final int value;

  private ContactAttribute(int value) {
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
  public static ContactAttribute findByValue(int value) { 
    switch (value) {
      case 1:
        return CONTACT_ATTRIBUTE_CAPABLE_VOICE_CALL;
      case 2:
        return CONTACT_ATTRIBUTE_CAPABLE_VIDEO_CALL;
      case 16:
        return CONTACT_ATTRIBUTE_CAPABLE_MY_HOME;
      case 32:
        return CONTACT_ATTRIBUTE_CAPABLE_BUDDY;
      default:
        return null;
    }
  }
}
