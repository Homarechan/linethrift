/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class PersonalInfo implements org.apache.thrift.TEnum {

  public static final PersonalInfo EMAIL = new PersonalInfo(0);
  public static final PersonalInfo PHONE = new PersonalInfo(1);
  public static final PersonalInfo BIRTHDAY = new PersonalInfo(2);
  public static final PersonalInfo RAW_BIRTHDAY = new PersonalInfo(3);

  private final int value;

  private PersonalInfo(int value) {
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
  public static PersonalInfo findByValue(int value) { 
    switch (value) {
      case 0:
        return EMAIL;
      case 1:
        return PHONE;
      case 2:
        return BIRTHDAY;
      case 3:
        return RAW_BIRTHDAY;
      default:
        return null;
    }
  }
}
