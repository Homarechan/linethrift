/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class ChannelFeatureLicense implements org.apache.thrift.TEnum {

  public static final ChannelFeatureLicense BLE_LCS_API_USABLE = new ChannelFeatureLicense(26);
  public static final ChannelFeatureLicense PROHIBIT_MINIMIZE_CHANNEL_BROWSER = new ChannelFeatureLicense(27);
  public static final ChannelFeatureLicense ALLOW_IOS_WEBKIT = new ChannelFeatureLicense(28);

  private final int value;

  private ChannelFeatureLicense(int value) {
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
  public static ChannelFeatureLicense findByValue(int value) { 
    switch (value) {
      case 26:
        return BLE_LCS_API_USABLE;
      case 27:
        return PROHIBIT_MINIMIZE_CHANNEL_BROWSER;
      case 28:
        return ALLOW_IOS_WEBKIT;
      default:
        return null;
    }
  }
}
