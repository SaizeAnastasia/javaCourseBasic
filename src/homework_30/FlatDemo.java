package homework_30;

import java.util.TreeSet;

public class FlatDemo {
    public static void main(String[] args) {
        TreeSet<Flat> flats = new TreeSet<Flat>();

        flats.add(new Flat(2, 50.5));
        flats.add(new Flat(3, 75.7));
        flats.add(new Flat(4, 85.6));
        flats.add(new Flat(2, 50.5));

        System.out.println(" Коллекция TreeSet ");
        for (Flat flat : flats) {
            System.out.println(flat);
        }


    }
}
