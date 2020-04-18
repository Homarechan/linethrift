/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

public enum AccountMigrationPincodeType implements org.apache.thrift.TEnum {
  NOT_APPLICABLE(0),
  NOT_SET(1),
  SET(2),
  NEED_ENFORCED_INPUT(3);

  private final int value;

  private AccountMigrationPincodeType(int value) {
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
  public static AccountMigrationPincodeType findByValue(int value) { 
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
