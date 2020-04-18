/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class ProfileAttribute implements org.apache.thrift.TEnum {

  public static final ProfileAttribute ALL = new ProfileAttribute(511);
  public static final ProfileAttribute EMAIL = new ProfileAttribute(1);
  public static final ProfileAttribute DISPLAY_NAME = new ProfileAttribute(2);
  public static final ProfileAttribute PHONETIC_NAME = new ProfileAttribute(4);
  public static final ProfileAttribute PICTURE = new ProfileAttribute(8);
  public static final ProfileAttribute STATUS_MESSAGE = new ProfileAttribute(16);
  public static final ProfileAttribute ALLOW_SEARCH_BY_USERID = new ProfileAttribute(32);
  public static final ProfileAttribute ALLOW_SEARCH_BY_EMAIL = new ProfileAttribute(64);
  public static final ProfileAttribute BUDDY_STATUS = new ProfileAttribute(128);
  public static final ProfileAttribute MUSIC_PROFILE = new ProfileAttribute(256);

  private final int value;

  private ProfileAttribute(int value) {
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
  public static ProfileAttribute findByValue(int value) { 
    switch (value) {
      case 511:
        return ALL;
      case 1:
        return EMAIL;
      case 2:
        return DISPLAY_NAME;
      case 4:
        return PHONETIC_NAME;
      case 8:
        return PICTURE;
      case 16:
        return STATUS_MESSAGE;
      case 32:
        return ALLOW_SEARCH_BY_USERID;
      case 64:
        return ALLOW_SEARCH_BY_EMAIL;
      case 128:
        return BUDDY_STATUS;
      case 256:
        return MUSIC_PROFILE;
      default:
        return null;
    }
  }
}
