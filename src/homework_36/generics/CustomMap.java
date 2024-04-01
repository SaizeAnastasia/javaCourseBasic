package homework_36.generics;
//9)  Создайте класс Map для хранения пар ключ-значение. Реализуйте методы
//    put(), get() и remove(). Используйте Generics для обеспечения
//    типобезопасности и возможности хранения в Map объектов разных типов.

import java.util.HashMap;
import java.util.Map;

public class CustomMap<K, V> {
    private Map<K, V> map;

    public CustomMap() {
        map = new HashMap<>();
    }

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public void remove(K key) {
        map.remove(key);
    }

    public static void main(String[] args) {
        CustomMap<String, Integer> map = new CustomMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println("Value for key 'one': " + map.get("one"));
        System.out.println("Value for key 'two': " + map.get("two"));
        System.out.println("Value for key 'three': " + map.get("three"));

        map.remove("two");
        System.out.println("Value for key 'two' after removal: " + map.get("two"));
    }
}

