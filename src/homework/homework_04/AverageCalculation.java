package homework.homework_04;

    public class AverageCalculation {
        public static void main(String[] args) {
            int num1 = 0;
            int num2 = 1;
            int num3 = 2;
            int num4 = 3;
            int num5 = 4;
            int num6 = 5;
            int num7 = 6;
            int num8 = 7;
            int num9 = 8;
            int num10 = 9;

            int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
            int average = sum / 10;

            System.out.println("arithmetic mean: " + average);

            int remainder = sum % 10;
            System.out.println("program dropped in the middle part " + remainder);
        }
    }
