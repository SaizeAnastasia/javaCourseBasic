package homework_36.generics;

public class BoxDemo {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.put("Hello, world!");
        System.out.println(stringBox.get());

        Box<Integer> integerBox = new Box<>();
        integerBox.put(42);
        System.out.println(integerBox.get());
    }
}
