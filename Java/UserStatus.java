/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public enum UserStatus implements org.apache.thrift.TEnum {
  NORMAL(0),
  UNBOUND(1),
  UNREGISTERED(2);

  private final int value;

  private UserStatus(int value) {
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
  public static UserStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return NORMAL;
      case 1:
        return UNBOUND;
      case 2:
        return UNREGISTERED;
      default:
        return null;
    }
  }
}
