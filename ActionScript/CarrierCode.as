/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package 
{
import org.apache.thrift.Set;
import flash.utils.Dictionary;
  public class CarrierCode   {
    public static const NOT_SPECIFIED:int = 0;
    public static const JP_DOCOMO:int = 1;
    public static const JP_AU:int = 2;
    public static const JP_SOFTBANK:int = 3;
    public static const JP_DOCOMO_LINE:int = 4;
    public static const KR_SKT:int = 17;
    public static const KR_KT:int = 18;
    public static const KR_LGT:int = 19;

    public static const VALID_VALUES:Set = new Set(NOT_SPECIFIED, JP_DOCOMO, JP_AU, JP_SOFTBANK, JP_DOCOMO_LINE, KR_SKT, KR_KT, KR_LGT);
    public static const VALUES_TO_NAMES:Dictionary = new Dictionary();
    {
      VALUES_TO_NAMES[NOT_SPECIFIED] = "NOT_SPECIFIED";
      VALUES_TO_NAMES[JP_DOCOMO] = "JP_DOCOMO";
      VALUES_TO_NAMES[JP_AU] = "JP_AU";
      VALUES_TO_NAMES[JP_SOFTBANK] = "JP_SOFTBANK";
      VALUES_TO_NAMES[JP_DOCOMO_LINE] = "JP_DOCOMO_LINE";
      VALUES_TO_NAMES[KR_SKT] = "KR_SKT";
      VALUES_TO_NAMES[KR_KT] = "KR_KT";
      VALUES_TO_NAMES[KR_LGT] = "KR_LGT";

    }
  }
}
