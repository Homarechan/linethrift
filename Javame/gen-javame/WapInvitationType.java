/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class WapInvitationType implements org.apache.thrift.TEnum {

  public static final WapInvitationType REGISTRATION = new WapInvitationType(1);
  public static final WapInvitationType CHAT = new WapInvitationType(2);

  private final int value;

  private WapInvitationType(int value) {
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
  public static WapInvitationType findByValue(int value) { 
    switch (value) {
      case 1:
        return REGISTRATION;
      case 2:
        return CHAT;
      default:
        return null;
    }
  }
}
