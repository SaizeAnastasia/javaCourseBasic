package lessons.lessons_30;

public class PersonDemo {

    public static void main(String[] args) {
        PersonsCollection collection = new PersonsCollection();
        collection.addPerson("Иван", "Иванов");
        collection.addPerson("Петр", "Петров");
        collection.addPerson("Семен" , "Семенов");
        collection.addPerson("Алексей", "Алексеев");

        collection.displayPersons();
    }
}
