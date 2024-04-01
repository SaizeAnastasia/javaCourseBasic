package homework_36.generics;
//1)  Создайте класс Box для хранения любых объектов и реализуйте методы
//    get() и put() для чтения и записи объектов в коробку.
//    Используйте Generics для обеспечения типобезопасности.

public class Box<T> {
    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }


}
