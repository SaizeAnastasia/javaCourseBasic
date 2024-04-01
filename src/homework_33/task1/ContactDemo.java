package homework_33.task1;

import java.util.List;

public class ContactDemo {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        contactManager.addContact(new Contact("Anastasia","164537899203"));
        contactManager.addContact(new Contact("Sergej", "836453728293"));
        contactManager.addContact(new Contact("Alisa", "73545362727"));
        contactManager.addContact(new Contact("Philipp", "164537899203"));

        List<Contact> allContacts = contactManager.getContacts();
        System.out.println(" Все контакты ");
        for (Contact contact : allContacts) {
            System.out.println(contact.getName() + ": " + contact.getPhoneNumber());
        }

        Contact contactByName = contactManager.getContactByName(" Alisa ");
        System.out.println(" Контакт с именем " + contactByName.getName() + contactByName.getPhoneNumber());

        Contact contactByPhoneNumber = contactManager.getContactByPhoneNumber(" 836453728293 ");
        System.out.println(" Контакт с номером телефона " + contactByPhoneNumber.getName() + contactByPhoneNumber.getPhoneNumber());
    }
}
