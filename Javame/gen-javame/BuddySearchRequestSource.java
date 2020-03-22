/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class BuddySearchRequestSource implements org.apache.thrift.TEnum {

  public static final BuddySearchRequestSource NA = new BuddySearchRequestSource(0);
  public static final BuddySearchRequestSource FRIEND_VIEW = new BuddySearchRequestSource(1);
  public static final BuddySearchRequestSource OFFICIAL_ACCOUNT_VIEW = new BuddySearchRequestSource(2);

  private final int value;

  private BuddySearchRequestSource(int value) {
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
  public static BuddySearchRequestSource findByValue(int value) { 
    switch (value) {
      case 0:
        return NA;
      case 1:
        return FRIEND_VIEW;
      case 2:
        return OFFICIAL_ACCOUNT_VIEW;
      default:
        return null;
    }
  }
}
