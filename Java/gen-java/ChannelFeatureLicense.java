/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public enum ChannelFeatureLicense implements org.apache.thrift.TEnum {
  BLE_LCS_API_USABLE(26),
  PROHIBIT_MINIMIZE_CHANNEL_BROWSER(27),
  ALLOW_IOS_WEBKIT(28);

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
  @org.apache.thrift.annotation.Nullable
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