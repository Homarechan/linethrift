/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class ReportCategory implements org.apache.thrift.TEnum {

  public static final ReportCategory PUSH_NORMAL_PLAIN = new ReportCategory(0);
  public static final ReportCategory PUSH_NORMAL_E2EE = new ReportCategory(1);
  public static final ReportCategory PUSH_VOIP_PLAIN = new ReportCategory(2);
  public static final ReportCategory PUSH_VOIP_E2EE = new ReportCategory(3);

  private final int value;

  private ReportCategory(int value) {
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
  public static ReportCategory findByValue(int value) { 
    switch (value) {
      case 0:
        return PUSH_NORMAL_PLAIN;
      case 1:
        return PUSH_NORMAL_E2EE;
      case 2:
        return PUSH_VOIP_PLAIN;
      case 3:
        return PUSH_VOIP_E2EE;
      default:
        return null;
    }
  }
}
