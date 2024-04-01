package homework_34;

public class MyCollectionDemo {
    public static void main(String[] args) {
        MyCollection collection = new MyCollection();

        collection.add(" element 1");
        collection.add("element 2");
        collection.add("element 3");


        collection.add(1, "Вставленный элемент ");

        collection.remove(2);

        System.out.println(" Размер коллекции " + collection.size());
    }
}
