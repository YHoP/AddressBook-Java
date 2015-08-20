import java.util.ArrayList;

public class Email {
  private static ArrayList<Email> instances = new ArrayList<Email>();

  private String mEmailType, mEmail;
  private int mId;

  public Email(String emailType, String email) {
      mEmailType = emailType;
      mEmail = email;
      instances.add(this);
      mId = instances.size();
  }

  public String getEmailType() {
    return mEmailType;
  }

  public String getEmail() {
    return mEmail;
  }

  public int getId() {
    return mId;
  }

  public static ArrayList<Email> all() {
    return instances;
  }

  public static Email find(int id) {
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
