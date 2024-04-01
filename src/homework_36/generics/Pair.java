package homework_36.generics;
//3)  Создайте класс Pair с двумя полями - first и second, и реализуйте
//    методы getFirst() и getSecond() для доступа к этим полям.
//    Используйте Generics для возможности хранения в Pair объектов
//    разных типов.


public class Pair<F, S> {
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("First", 1);
        System.out.println("First element: " + pair1.getFirst());
        System.out.println("Second element: " + pair1.getSecond());

        Pair<Double, String> pair2 = new Pair<>(3.14, "Pi");
        System.out.println("First element: " + pair2.getFirst());
        System.out.println("Second element: " + pair2.getSecond());
    }
}
