/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-03-23")
public enum SquareMemberRole implements org.apache.thrift.TEnum {
  ADMIN(1),
  CO_ADMIN(2),
  MEMBER(10);

  private final int value;

  private SquareMemberRole(int value) {
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
  public static SquareMemberRole findByValue(int value) { 
    switch (value) {
      case 1:
        return ADMIN;
      case 2:
        return CO_ADMIN;
      case 10:
        return MEMBER;
      default:
        return null;
    }
  }
}
