package homework_40;
//4) В списке студентов - выбрать тех трех кто имеет самые высокие оценки и отсортировать по году поступления

public class StudentTask4 {

        private String name;
        private int year;
        private double avgGrade;

    public StudentTask4(String name, int year, double avgGrade) {
        this.name = name;
        this.year = year;
        this.avgGrade = avgGrade;
    }

    public String getName() {
            return name;
        }

        public int getYear() {
            return year;
        }

        public double getAvgGrade() {
            return avgGrade;
        }


    @Override
    public String toString() {
        return "StudentTask4{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", avgGrade=" + avgGrade +
                '}';
    }
}

