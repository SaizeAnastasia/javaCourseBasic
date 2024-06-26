package homework_33.task1;

//Задача: Управление списком контактов
//
//Описание: Вам необходимо реализовать систему управления списком контактов.
//Каждый контакт представлен в виде объекта Contact с полями name (имя) и phoneNumber (номер телефона).
//Вам нужно использовать коллекцию для хранения контактов, чтобы гарантировать
//уникальность каждого контакта на основе его имени и номера телефона.
//
//Требования:
//
//    Реализовать класс Contact с полями name (тип данных String) и phoneNumber (тип данных String).
//    Реализовать класс ContactManager, который будет управлять списком контактов.
//    Класс ContactManager должен содержать следующие методы:
//        addContact(Contact contact): добавляет контакт в список. Если контакт с таким именем и
//        номером телефона уже существует, необходимо выдать сообщение об ошибке.
//        removeContact(Contact contact): удаляет контакт из списка.
//        getContacts(): возвращает список всех контактов.
//        getContactByName(String name): возвращает контакт по имени.
//        getContactByPhoneNumber(String phoneNumber): возвращает контакт по номеру телефона.
//
//
//
//
public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
