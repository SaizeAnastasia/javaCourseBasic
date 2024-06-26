package homework_33.task1;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> contacts;

    public ContactManager(){
        contacts = new ArrayList<>();

    }

    public void addContact(Contact contact) {
        for (Contact existingContact : contacts) {
            if (existingContact.getName().equals(contact.getName()) &&
            existingContact.getPhoneNumber().equals(contact.getPhoneNumber())) {
                System.out.println(" Контакт с таким именем и номером телефона уже существует ");
                return;
            }
        }
        contacts.add(contact);
    }


    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public Contact getContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(contact.getPhoneNumber())) {
                return contact;
            }
        }
        return  null;
    }

    public Contact getContactByPhoneNumber(String phoneNumber){
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        return null;

    }
}
