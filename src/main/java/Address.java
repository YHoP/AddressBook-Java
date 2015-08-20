import java.util.ArrayList;

public class Address {
  private static ArrayList<Address> instances = new ArrayList<Address>();

  private String mAddressType, mStreet, mCity, mState, mZip;
  private int mId;

  public Address(String addressType, String street, String city, String state, String zip) {
      mAddressType = addressType;
      mAStreet = street;
      mCity = city;
      mZip = zip;
      instances.add(this);
      mId = instances.size();
  }

  public String getAddressType() {
    return mAddressType;
  }

  public String getStreet() {
    return mStreet;
  }

  public String getCity() {
    return mCity;
  }

  public String getState() {
    return mState;
  }

  public String getZip() {
    return mZip;
  }

  public int getId() {
    return mId;
  }

  public static ArrayList<Address> all() {
    return instances;
  }

  public static Address find(int id) {
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
