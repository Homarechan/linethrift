/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public enum StickerResourceType implements org.apache.thrift.TEnum {
  STATIC(1),
  ANIMATION(2),
  SOUND(3),
  ANIMATION_SOUND(4),
  POPUP(5),
  POPUP_SOUND(6);

  private final int value;

  private StickerResourceType(int value) {
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
  public static StickerResourceType findByValue(int value) { 
    switch (value) {
      case 1:
        return STATIC;
      case 2:
        return ANIMATION;
      case 3:
        return SOUND;
      case 4:
        return ANIMATION_SOUND;
      case 5:
        return POPUP;
      case 6:
        return POPUP_SOUND;
      default:
        return null;
    }
  }
}
