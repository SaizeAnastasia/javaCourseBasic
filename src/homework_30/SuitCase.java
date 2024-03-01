package homework_30;
//2) Чемодан - 3 параметра материал (пластик или ткань), размер - M, L, XL и цвет.
//   Создать две коллекции - TreeSet и LinkedList и отсортировать по трем параметрам - размеру и материалу и цвету

public class SuitCase {

    private String material;
    private String size;
    private String color;


    public SuitCase(String material, String size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
    }


    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "SuitCase{" +
                "material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
