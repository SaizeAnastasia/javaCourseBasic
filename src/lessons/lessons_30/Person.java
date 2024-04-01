package lessons.lessons_30;
//Создайте класс Person с двумя параметрами (имя и фамилия)
//Создайте коллекцию уникальных элементов отсортированных
//по фамилии и имени

import java.util.Objects;

class Person implements Comparable<Person> {
     private String firstName;
     private  String lastName;


     public Person(String firstName, String lastName) {
         this.firstName = firstName;
         this.lastName = lastName;
     }

     public String getFirstName() {
         return firstName;
     }

     public String getLastName() {
         return lastName;
     }


     @Override
     public int compareTo(Person o) {
         int lastNameCompare = this.lastName.compareTo(o.lastName);
         if (lastNameCompare != 0) {
             return lastNameCompare;
         }
         return this.firstName.compareTo(o.firstName);
     }

     public boolean equals(Object object){
         if(this == object)
             return true;
         if (!(object instanceof Person))
             return false;
         Person other = (Person) object;
         return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName);
     }

     public int hashCode() {
         return Objects.hash(firstName, lastName);
     }
 }
