/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class SquarePreferenceAttribute implements org.apache.thrift.TEnum {

  public static final SquarePreferenceAttribute FAVORITE = new SquarePreferenceAttribute(1);
  public static final SquarePreferenceAttribute NOTI_FOR_NEW_JOIN_REQUEST = new SquarePreferenceAttribute(2);

  private final int value;

  private SquarePreferenceAttribute(int value) {
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
  public static SquarePreferenceAttribute findByValue(int value) { 
    switch (value) {
      case 1:
        return FAVORITE;
      case 2:
        return NOTI_FOR_NEW_JOIN_REQUEST;
      default:
        return null;
    }
  }
}
