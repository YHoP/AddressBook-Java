import java.util.ArrayList;

public class Contact {
  private static ArrayList<Contact> instances = new ArrayList<Contact>();

  private String mFirstName, mLastName;
  //private String birthMonth;
  private int mId;
  private ArrayList<Phone> mPhone;
  private ArrayList<Email> mEmail;
  private ArrayList<Address> mAddress;

  public Contact(String firstName, String lastName) {
    mFirstName = firstname;
    mLastName = lastName;
    instances.add(this);
    mId = instances.size();
    mPhone = new ArrayList<Phone>();
    mEmail = new ArrayList<Email>();
    mAddress = new ArrayList<Address>();
  }

  public String getFirstName() {
    return mFirstName;
  }

  public String getLastName() {
    return mLastName;
  }

  public int getId() {
    return mId;
  }

  public ArrayList<Phone> getPhone() {
    return mPhone;
  }

  public void addPhone(Phone phone) {
    mPhone.add(phone);
  }

  public ArrayList<Email> getEmail() {
    return mEmail;
  }

  public void addEmail(Email email) {
    mEmail.add(email);
  }

  public ArrayList<Address> getAddress() {
    return mAddress;
  }

  public void addAddress(Address address) {
    mAddress.add(address);
  }

  public static ArrayList<Contact> all() {
    return instances;
  }

  public static Contact find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }

  public static void clear() {
    instances.clear();
  }

}
