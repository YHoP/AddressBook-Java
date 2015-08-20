import java.util.ArrayList;

public class Phone {
  private static ArrayList<Phone> instances = new ArrayList<Phone>();

  private String mPhoneType, mAreaCode, mNumber;
  private int mId;

  public Phone(String phoneType, String areaCode, String number) {
      mPhoneType = phoneType;
      mAreaCode = areaCode;
      mNumber = number;
      instances.add(this);
      mId = instances.size();
  }

  public String getPhoneType() {
    return mPhoneType;
  }

  public String getAreaCode() {
    return mAreaCode;
  }

  public String getNumber() {
    return mNumber;
  }
  public String getEmailType() {
    return mNumber;
  }


  public int getId() {
    return mId;
  }

  public static ArrayList<Phone> all() {
    return instances;
  }

  public static Phone find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  public static void clear() {
    instances.clear();
  }
}
