package lessons.lessons_30;

import java.util.TreeSet;

public class PersonsCollection {

    private TreeSet<Person> persons;

    public PersonsCollection() {
        this.persons = new TreeSet<>();

    }

    public void addPerson(String firstName, String lastName){
        Person person = new Person(firstName, lastName);
        persons.add(person);
    }

    public void displayPersons(){
        for (Person person : persons) {
            System.out.println(" Имя " + person.getFirstName() + " Фамилия " + person.getLastName());
        }
    }
}
