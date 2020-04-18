/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class CustomMode implements org.apache.thrift.TEnum {

  public static final CustomMode PROMOTION_FRIENDS_INVITE = new CustomMode(1);
  public static final CustomMode CAPABILITY_SERVER_SIDE_SMS = new CustomMode(2);
  public static final CustomMode LINE_CLIENT_ANALYTICS_CONFIGURATION = new CustomMode(3);

  private final int value;

  private CustomMode(int value) {
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
  public static CustomMode findByValue(int value) { 
    switch (value) {
      case 1:
        return PROMOTION_FRIENDS_INVITE;
      case 2:
        return CAPABILITY_SERVER_SIDE_SMS;
      case 3:
        return LINE_CLIENT_ANALYTICS_CONFIGURATION;
      default:
        return null;
    }
  }
}
