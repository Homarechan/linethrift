/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class SnsIdType implements org.apache.thrift.TEnum {

  public static final SnsIdType FACEBOOK = new SnsIdType(1);
  public static final SnsIdType SINA = new SnsIdType(2);
  public static final SnsIdType RENREN = new SnsIdType(3);
  public static final SnsIdType FEIXIN = new SnsIdType(4);
  public static final SnsIdType BBM = new SnsIdType(5);

  private final int value;

  private SnsIdType(int value) {
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
  public static SnsIdType findByValue(int value) { 
    switch (value) {
      case 1:
        return FACEBOOK;
      case 2:
        return SINA;
      case 3:
        return RENREN;
      case 4:
        return FEIXIN;
      case 5:
        return BBM;
      default:
        return null;
    }
  }
}
