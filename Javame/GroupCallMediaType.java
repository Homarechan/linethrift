/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class GroupCallMediaType implements org.apache.thrift.TEnum {

  public static final GroupCallMediaType AUDIO = new GroupCallMediaType(1);
  public static final GroupCallMediaType VIDEO = new GroupCallMediaType(2);

  private final int value;

  private GroupCallMediaType(int value) {
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
  public static GroupCallMediaType findByValue(int value) { 
    switch (value) {
      case 1:
        return AUDIO;
      case 2:
        return VIDEO;
      default:
        return null;
    }
  }
}
