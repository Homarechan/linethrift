/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class SecurityCenterSettingsType implements org.apache.thrift.TEnum {

  public static final SecurityCenterSettingsType NOT_APPLICABLE = new SecurityCenterSettingsType(0);
  public static final SecurityCenterSettingsType NOT_SET = new SecurityCenterSettingsType(1);
  public static final SecurityCenterSettingsType SET = new SecurityCenterSettingsType(2);
  public static final SecurityCenterSettingsType NEED_ENFORCED_INPUT = new SecurityCenterSettingsType(3);

  private final int value;

  private SecurityCenterSettingsType(int value) {
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
  public static SecurityCenterSettingsType findByValue(int value) { 
    switch (value) {
      case 0:
        return NOT_APPLICABLE;
      case 1:
        return NOT_SET;
      case 2:
        return SET;
      case 3:
        return NEED_ENFORCED_INPUT;
      default:
        return null;
    }
  }
}
