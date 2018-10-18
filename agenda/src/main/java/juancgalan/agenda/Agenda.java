package juancgalan.agenda;

import java.util.ArrayList;

public class Agenda {
  private ArrayList<Contact> contacts;

  public Agenda() {
    contacts = new ArrayList<>();
  }

  public void addContact(String firstName,
                         String lastName,
                         String address,
                         String phone) {
    addContact(new Contact(firstName, lastName, address, phone));
  }

  public void addContact(Contact newContact) {
    contacts.add(newContact);
  }

  public Contact searchContact(String name) {
    Contact ans = contacts.get(0);
    int i = 0;
    while (i < contacts.size() && !ans.getFirstName().equals(name)) {
      ans = contacts.get(i);
      i++;
    }
    if (ans.getFirstName().equals(name)) {
      return ans;
    } else {
      return null;
    }
  }

  public void deletContact(String name) {
    Contact found = searchContact(name);
    if (found != null) contacts.remove(found);
  }

  public void updateContact(String firstName,
                            String lastName,
                            String address,
                            String phone) {
    Contact found = searchContact(firstName);
    if (found != null) {
      found.setLastName(lastName);
      found.setAddress(address);
      found.setPhone(phone);
    }
  }

  public String toString() {
    String ans = "";
    for (int i = 0; i < contacts.size(); i++) {
      ans += "Contacto num: " + i + "\n";
      ans += "\t" + contacts.get(i);
    }
    return ans;
  }
}
