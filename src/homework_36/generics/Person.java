package homework_36.generics;
//10) Напишите метод sortByProperty, который принимает список объектов и
//    имя поля, по которому нужно сортировать список. Используйте Generics
//    для обеспечения возможности передачи в метод списка объектов любого
//    типа и получения значения поля по имени.

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}