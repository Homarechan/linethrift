/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class ChatRoomAnnouncementType implements org.apache.thrift.TEnum {

  public static final ChatRoomAnnouncementType MESSAGE = new ChatRoomAnnouncementType(0);
  public static final ChatRoomAnnouncementType NOTE = new ChatRoomAnnouncementType(1);

  private final int value;

  private ChatRoomAnnouncementType(int value) {
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
  public static ChatRoomAnnouncementType findByValue(int value) { 
    switch (value) {
      case 0:
        return MESSAGE;
      case 1:
        return NOTE;
      default:
        return null;
    }
  }
}
