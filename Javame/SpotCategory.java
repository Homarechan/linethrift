/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class SpotCategory implements org.apache.thrift.TEnum {

  public static final SpotCategory UNKNOWN = new SpotCategory(0);
  public static final SpotCategory GOURMET = new SpotCategory(1);
  public static final SpotCategory BEAUTY = new SpotCategory(2);
  public static final SpotCategory TRAVEL = new SpotCategory(3);
  public static final SpotCategory SHOPPING = new SpotCategory(4);
  public static final SpotCategory ENTERTAINMENT = new SpotCategory(5);
  public static final SpotCategory SPORTS = new SpotCategory(6);
  public static final SpotCategory TRANSPORT = new SpotCategory(7);
  public static final SpotCategory LIFE = new SpotCategory(8);
  public static final SpotCategory HOSPITAL = new SpotCategory(9);
  public static final SpotCategory FINANCE = new SpotCategory(10);
  public static final SpotCategory EDUCATION = new SpotCategory(11);
  public static final SpotCategory OTHER = new SpotCategory(12);
  public static final SpotCategory ALL = new SpotCategory(10000);

  private final int value;

  private SpotCategory(int value) {
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
  public static SpotCategory findByValue(int value) { 
    switch (value) {
      case 0:
        return UNKNOWN;
      case 1:
        return GOURMET;
      case 2:
        return BEAUTY;
      case 3:
        return TRAVEL;
      case 4:
        return SHOPPING;
      case 5:
        return ENTERTAINMENT;
      case 6:
        return SPORTS;
      case 7:
        return TRANSPORT;
      case 8:
        return LIFE;
      case 9:
        return HOSPITAL;
      case 10:
        return FINANCE;
      case 11:
        return EDUCATION;
      case 12:
        return OTHER;
      case 10000:
        return ALL;
      default:
        return null;
    }
  }
}
