/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class OpStatus implements org.apache.thrift.TEnum {

  public static final OpStatus NORMAL = new OpStatus(0);
  public static final OpStatus ALERT_DISABLED = new OpStatus(1);
  public static final OpStatus ALWAYS = new OpStatus(2);

  private final int value;

  private OpStatus(int value) {
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
  public static OpStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return NORMAL;
      case 1:
        return ALERT_DISABLED;
      case 2:
        return ALWAYS;
      default:
        return null;
    }
  }
}