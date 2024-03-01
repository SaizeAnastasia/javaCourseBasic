package homework_30;
//1) Flat - у которого основными параметрами являются площадь и количество спален
//   создать класс который сразу бы определял правила сортировки - 1) по количеству комнат и 2) по площади
//   создать коллекцию TreeSet, добавить несколько элементов и проверить работу коллекции


    public class Flat implements Comparable<Flat> {
        private int bedrooms;
        private double area;

        public Flat(int bedroom, double area) {
            this.bedrooms = bedrooms;
            this.area = area;
        }

        public int getBedrooms() {
            return bedrooms;
        }

        public double getArea() {
            return area;
        }

        @Override
        public String toString() {
            return "Flat{" +
                    "bedrooms=" + bedrooms +
                    ", area=" + area +
                    '}';
        }

        @Override
        public int compareTo(Flat otherFlat) {
            if (this.bedrooms != otherFlat.getBedrooms()) {
                return Integer.compare(this.bedrooms, otherFlat.bedrooms);
            } else {
                return Double.compare(this.area, otherFlat.area);
            }
        }

    }

