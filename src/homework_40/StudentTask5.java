package homework_40;

public class StudentTask5 {

        private String name;
        private int year;
        private double avgGrade;

    public StudentTask5(String name, int year, double avgGrade) {
        this.name = name;
        this.year = year;
        this.avgGrade = avgGrade;
    }

    public int getYear() {
            return year;
        }

    @Override
    public String toString() {
        return "StudentTask5{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", avgGrade=" + avgGrade +
                '}';
    }
}

