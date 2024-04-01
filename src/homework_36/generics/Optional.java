package homework_36.generics;
//7)  Создайте класс Optional для представления значения, которое может
//    отсутствовать. Реализуйте методы isPresent(), get() и orElse().
//    Используйте Generics для возможности хранения в Optional объектов
//    разных типов.

public class Optional<T> {
    private T value;

    public Optional(T value) {
        this.value = value;
    }

    public boolean isPresent() {
        return value != null;
    }

    public T get() {
        if (value == null) {
            throw new IllegalStateException("Value is not present");
        }
        return value;
    }

    public T orElse(T defaultValue) {
        return value != null ? value : defaultValue;
    }

    public static void main(String[] args) {
        Optional<String> optional1 = new Optional<>("Hello");
        System.out.println("Value present? " + optional1.isPresent());
        System.out.println("Value: " + optional1.get());
        System.out.println("Value or default: " + optional1.orElse("Default"));

        Optional<String> optional2 = new Optional<>(null);
        System.out.println("Value present? " + optional2.isPresent());
        // This will throw an IllegalStateException
        // System.out.println("Value: " + optional2.get());
        System.out.println("Value or default: " + optional2.orElse("Default"));
    }
}

